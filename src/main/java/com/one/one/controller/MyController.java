package com.one.one.controller;




import java.io.IOException;

import com.one.one.classes.IdiomQ;
import com.one.one.classes.QuantQ;
import com.one.one.classes.SpotQuestion;
import com.one.one.classes.VocabQ;

//import java.util.List;

import com.one.one.entities.Course;
import com.one.one.entities.GeneralAware;
import com.one.one.entities.Idiom;
import com.one.one.entities.Quant;
import com.one.one.entities.Slot;
import com.one.one.entities.Spot;
import com.one.one.entities.Vocab;
import com.one.one.entities.Players;
import com.one.one.services.CourseService;
import com.one.one.services.GeneralAwareService;
import com.one.one.services.IdiomService;
import com.one.one.services.PlayService;
import com.one.one.services.QuantService;
import com.one.one.services.QuantServiceImpl;
import com.one.one.services.SlotMachineImp;
import com.one.one.services.SpotService;
import com.one.one.services.VocabService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    @Autowired
    private CourseService cs;
    @Autowired
    private SpotService ss;
    @Autowired
    private GeneralAwareService gas;
    @Autowired
    private VocabService vs;
    @Autowired
    private IdiomService is;
    @Autowired
    private QuantServiceImpl qs;
    @Autowired
    private QuantService qq;
    @Autowired
    private SlotMachineImp sm;
    @Autowired
    private PlayService ps;

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    @CrossOrigin
    @GetMapping("/getSlot")
    public Slot getSlot(){
        return this.sm.getSlot();
    }

    @GetMapping("/getcourses")
    public Course getCourses(){
        return this.cs.getCourses();
    }

    @CrossOrigin
    @PostMapping(path="/addGA", consumes="application/json")
    public String addGAQuestion(@RequestBody GeneralAware ga){
        //System.out.println(ga.getQue()+"########");
        return this.gas.addQuestion(ga);
    }

    @CrossOrigin
    @GetMapping("/getQuestion")
    public SpotQuestion getQuestion(){
        return this.ss.getQuestion();
    }

    @CrossOrigin
    @GetMapping("/getGAQuestion")
    public GeneralAware getGAQuestion(){
        return this.gas.getQuestion();
    }

    @Transactional
    @CrossOrigin
    @GetMapping("/getVQ")
    public VocabQ getVQ(){
        return this.vs.getQuestion();
    }

    @CrossOrigin
    @PostMapping(path="/courses", consumes="application/json")
    public Course addCourse(@RequestBody Course course){
        return this.cs.addCourse(course);
    }

    @CrossOrigin
    @PostMapping(path="/addSpot", consumes="application/json")
    public String addQuestion(@RequestBody Spot spot){
        return this.ss.addQuestion(spot);
    }

    @CrossOrigin
    @PostMapping(path="/addVocab", consumes="application/json")
    public String addQuestion(@RequestBody Vocab v){
        return this.vs.addQuestion(v);
    }

    @CrossOrigin
    @PostMapping(path="/players", consumes="application/json")
    public Slot playGame(@RequestBody Players[] p){
        return ps.playGame(p);
    }


    @CrossOrigin
    @PostMapping(path="/addIdiom", consumes="application/json")
    public String addQuestion(@RequestBody Idiom v){
        return this.is.addQuestion(v);
    }

    @Transactional
    @CrossOrigin
    @GetMapping("/getIQ")
    public IdiomQ getIQ(){
        return this.is.getQuestion();
    }

    @CrossOrigin
    @PostMapping(path="/addQuant", consumes="application/json")
    public String addQuantQue(@RequestBody QuantQ file) throws IOException{
        byte[] qu = qs.compressBytes(file.getQueByte().getBytes());
        byte[] an = qs.compressBytes(file.getAnsByte().getBytes());
        Quant q = new Quant(file.getAns(),file.getCh(),qu,an,file.getDisc());
        return qq.addQuantQue(q);
    }

    @CrossOrigin
    @PostMapping(path="/wrongVocab", consumes="application/json")
    public int wrongVocab(@RequestBody int id){
        return this.vs.wrongAns(id);
    }

    @CrossOrigin
    @PostMapping(path="/wrongSpot", consumes="application/json")
    public int wrongSpot(@RequestBody int id){
        return this.ss.wrongAns(id);
    }
}

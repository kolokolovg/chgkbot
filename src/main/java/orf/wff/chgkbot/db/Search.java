package orf.wff.chgkbot.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Search {
    @XmlElement(name="question")
    private List<Question> question = new ArrayList<>();

    public List<Question> getQuestion() {
        return question;
    }
}

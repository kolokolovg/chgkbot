package orf.wff.chgkbot.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Question {
    private String ParentId;

    private String Notices;

    private String tourPlayedAt;

    private String Type;

    private String Authors;

    private String tournamentPlayedAt2;

    private String tourType;

    private String PassCriteria;

    private String Question;

    private String Topic;

    private String QuestionId;

    private String tournamentId;

    private String tournamentType;

    private String Comments;

    private String Answer;

    private String tourFileName;

    private String Number;

    private String Sources;

    private String ProcessedBySearch;

    private String tournamentPlayedAt;

    private String tournamentFileName;

    private String Complexity;

    private String Rating;

    private String TypeNum;

    private String RatingNumber;

    private String tournamentTitle;

    private String TextId;

    private String tourTitle;

    private String tourId;

    private String tourPlayedAt2;

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    public String getNotices() {
        return Notices;
    }

    public void setNotices(String Notices) {
        this.Notices = Notices;
    }

    public String getTourPlayedAt() {
        return tourPlayedAt;
    }

    public void setTourPlayedAt(String tourPlayedAt) {
        this.tourPlayedAt = tourPlayedAt;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String Authors) {
        this.Authors = Authors;
    }

    public String getTournamentPlayedAt2() {
        return tournamentPlayedAt2;
    }

    public void setTournamentPlayedAt2(String tournamentPlayedAt2) {
        this.tournamentPlayedAt2 = tournamentPlayedAt2;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public String getPassCriteria() {
        return PassCriteria;
    }

    public void setPassCriteria(String PassCriteria) {
        this.PassCriteria = PassCriteria;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public String getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(String QuestionId) {
        this.QuestionId = QuestionId;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    public String getTourFileName() {
        return tourFileName;
    }

    public void setTourFileName(String tourFileName) {
        this.tourFileName = tourFileName;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getSources() {
        return Sources;
    }

    public void setSources(String Sources) {
        this.Sources = Sources;
    }

    public String getProcessedBySearch() {
        return ProcessedBySearch;
    }

    public void setProcessedBySearch(String ProcessedBySearch) {
        this.ProcessedBySearch = ProcessedBySearch;
    }

    public String getTournamentPlayedAt() {
        return tournamentPlayedAt;
    }

    public void setTournamentPlayedAt(String tournamentPlayedAt) {
        this.tournamentPlayedAt = tournamentPlayedAt;
    }

    public String getTournamentFileName() {
        return tournamentFileName;
    }

    public void setTournamentFileName(String tournamentFileName) {
        this.tournamentFileName = tournamentFileName;
    }

    public String getComplexity() {
        return Complexity;
    }

    public void setComplexity(String Complexity) {
        this.Complexity = Complexity;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getTypeNum() {
        return TypeNum;
    }

    public void setTypeNum(String TypeNum) {
        this.TypeNum = TypeNum;
    }

    public String getRatingNumber() {
        return RatingNumber;
    }

    public void setRatingNumber(String RatingNumber) {
        this.RatingNumber = RatingNumber;
    }

    public String getTournamentTitle() {
        return tournamentTitle;
    }

    public void setTournamentTitle(String tournamentTitle) {
        this.tournamentTitle = tournamentTitle;
    }

    public String getTextId() {
        return TextId;
    }

    public void setTextId(String TextId) {
        this.TextId = TextId;
    }

    public String getTourTitle() {
        return tourTitle;
    }

    public void setTourTitle(String tourTitle) {
        this.tourTitle = tourTitle;
    }

    public String getTourId() {
        return tourId;
    }

    public void setTourId(String tourId) {
        this.tourId = tourId;
    }

    public String getTourPlayedAt2() {
        return tourPlayedAt2;
    }

    public void setTourPlayedAt2(String tourPlayedAt2) {
        this.tourPlayedAt2 = tourPlayedAt2;
    }

    @Override
    public String toString() {
        return "ClassPojo [ParentId = " + ParentId + ", Notices = " + Notices + ", tourPlayedAt = " + tourPlayedAt + ", Type = " + Type + ", Authors = " + Authors + ", tournamentPlayedAt2 = " + tournamentPlayedAt2 + ", tourType = " + tourType + ", PassCriteria = " + PassCriteria + ", Question = " + Question + ", Topic = " + Topic + ", QuestionId = " + QuestionId + ", tournamentId = " + tournamentId + ", tournamentType = " + tournamentType + ", Comments = " + Comments + ", Answer = " + Answer + ", tourFileName = " + tourFileName + ", Number = " + Number + ", Sources = " + Sources + ", ProcessedBySearch = " + ProcessedBySearch + ", tournamentPlayedAt = " + tournamentPlayedAt + ", tournamentFileName = " + tournamentFileName + ", Complexity = " + Complexity + ", Rating = " + Rating + ", TypeNum = " + TypeNum + ", RatingNumber = " + RatingNumber + ", tournamentTitle = " + tournamentTitle + ", TextId = " + TextId + ", tourTitle = " + tourTitle + ", tourId = " + tourId + ", tourPlayedAt2 = " + tourPlayedAt2 + "]";
    }
}
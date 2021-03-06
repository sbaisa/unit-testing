package ro.victor.unittest.tdd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class TennisGameFeatureSteps {
    private TennisGame tennisGame;

    @Given("^A new tennis game$")
    public void a_new_tennis_game() throws Throwable {
        tennisGame = new TennisGame();
    }

    @Then("^Score is \"([^\"]*)\"$")
    public void score_is(String expected) throws Throwable {
        assertEquals(expected, tennisGame.score());
    }

    @When("^Player(\\d+) scores$")
    public void playerScores(int playerNo) {
        tennisGame.addPoint(playerNo);
    }

    @And("^Player(\\d+) scores (\\d+) points$")
    public void playerScoresPoints(int playerNo, int points) {
        for (int i = 0; i < points; i++) {
            tennisGame.addPoint(playerNo);
        }
    }
}

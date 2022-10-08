package steps

import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import java.time.LocalDate

class DummyStepDef {

    @When("I create {n} useless feature file(s?)")
    fun `When I create N useless feature file`(n: Int) {
        throw PendingException()
    }

    @Then("I will delete the file")
    fun `Then I will delete the file`() {
        throw PendingException()
    }

    @Then("I waste time")
    fun `Then I waste time`() {
        throw PendingException()
    }

}



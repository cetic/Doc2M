# Doc2M

## What is DOC2M 

The Model-Driven Design approach is centered on the use of a model repository and a modelling tool. A drawback of the approach is that the evolution of derived artefacts (such as documents, code, tests) requires to go back to the model. This process involves tracing the source element back in the model editor before triggering the update of the artefact. This can reveal quite inefficient and even cause user rejection.

Our talk presents a reusable mechanism that enables a back channel from textual artefact to any EMF-based model. It efficiently supports the update process as well as other user stories such as the synchronised in-place editing (e.g. to directly fix typos from the document) and even concept creation (e.g. to support elicitation phase from some source documents and keep traceability)

Our main different features (locate, in-place edit, create) are first demonstrated in the scope of HTML and Word documents before detailing the technical architecture and the adaptation process for targeting specific EMF-based editors and target document viewers or editors.

Our work is still being elaborated to support a wider range of EMF-based tools (e.g. Sirius, Capella) and text processors (especially Open/LibreOffice) but it is already released for early trial on Github and under EPL licence.

## pre-requisite: 

* Eclipse Mars
* Java 1.8
* EMF 2.11.2

## how to configure

* Check out the 4 projects into eclipse workspace
* Launch Doc2MServer project as Eclipse Application

## how to test

* Copy the sample project into runtime-workspace
* Launch the REST Server via the eclipse icon in the menu toolbar
* for Word: open word document XXX NAME XXX
* html:TODO - commit HTML file with locate function

## limitation: 

* only HTML and MS Word demo on raw EMF for now
* in the current version, it is needed to open the simplekaos model and keep it in active editor

## roadmap:

* egf activity with embedded locat
* capella plugin
* open/libre office support

## feedback: 

TODO contact address (eviter de mettre email, ex. si github a un systeme de message ?

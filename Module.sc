Module {
    var <namae, <id, <inPatches, <outPatches;

    *new { |namae, inChannels = 2, outChannels = 2|
        ^super.new.moduleInit(namae, inChannels, outChannels);
    }

    moduleInit { |namae, inChannels, outChannels|
        this.namae = namae;
        this.id    = 0;
        makeReceivers();
    }

    makeReceivers {
        var patchInRecv, patchOutSend;

        patchInRecv = OSCFunc.newMatching({ |msg, t, srcAddr, srcPort|
            m0id = msg.at(1).asInt;
            m0patchCardinality = msg.at(2).asInt;
            patchIn(m0patchCardinality, m0id);
        })

    }

    /* Virtual cables from m0 -> this */
    patchIn { |cardinality, m0|
    }

    /* Virtual cable from this -> mf */
    patchOut { |cardinality, mf|
    }

    serialize {

    }
}
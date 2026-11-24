package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class op1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f25617a;

    public op1(byte b) {
        switch (b) {
            case 1:
                sip sipVar = sip.c;
                iun iunVar = iun.f15405a;
                this.f25617a = q7m0.a(xp20.f(new Pair(sipVar, iunVar), new Pair(sip.b, iunVar)));
                break;
            default:
                this.f25617a = q7m0.a(iun.f15405a);
                break;
        }
    }

    public void a(ArrayList arrayList, sip sipVar) {
        sipVar.getClass();
        p7m0 p7m0Var = this.f25617a;
        LinkedHashMap linkedHashMapP = xp20.p((Map) p7m0Var.getValue());
        linkedHashMapP.replace(sipVar, arrayList);
        p7m0Var.o(null, linkedHashMapP);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(zje zjeVar) {
        np1 np1Var;
        if (zjeVar instanceof np1) {
            np1Var = (np1) zjeVar;
            int i = np1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                np1Var.k = i - Integer.MIN_VALUE;
            } else {
                np1Var = new np1(this, zjeVar);
            }
        } else {
            np1Var = new np1(this, zjeVar);
        }
        Object objM = np1Var.i;
        wne wneVar = wne.f39444a;
        int i2 = np1Var.k;
        if (i2 == 0) {
            z1x.P(objM);
            np1Var.k = 1;
            objM = ntb.M(this.f25617a, np1Var);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objM);
        }
        List list = (List) objM;
        return list == null ? iun.f15405a : list;
    }
}

package a;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class n1u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dgu f22769a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(String str, String str2, zje zjeVar) {
        pkt0 pkt0Var;
        if (zjeVar instanceof pkt0) {
            pkt0Var = (pkt0) zjeVar;
            int i = pkt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pkt0Var.k = i - Integer.MIN_VALUE;
            } else {
                pkt0Var = new pkt0(this, zjeVar);
            }
        } else {
            pkt0Var = new pkt0(this, zjeVar);
        }
        Object objD0 = pkt0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = pkt0Var.k;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objD0);
            pkt0Var.k = 1;
            dgu dguVar = this.f22769a;
            objD0 = qjj.d0(((mne) dguVar.f6058a).b, new fns((yje) null, dguVar, str, str2), pkt0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        qcv qcvVar = (qcv) objD0;
        ArrayList arrayList = qcvVar.b;
        ArrayList arrayList2 = qcvVar.c;
        for (Object obj2 : arrayList2) {
            if (((ajh0) obj2).c) {
                obj = obj2;
                break;
            }
        }
        ajh0 ajh0Var = (ajh0) obj;
        if (ajh0Var == null && (ajh0Var = (ajh0) CollectionsKt.firstOrNull(arrayList2)) == null) {
            return iun.f15405a;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (StringsKt.O(ajh0Var.b, ((jcv) obj3).g, false)) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }
}

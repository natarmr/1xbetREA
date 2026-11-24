package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he1 f30601a;
    public final mne b;
    public List c = iun.f15405a;

    public rjl0(he1 he1Var, mne mneVar) {
        this.f30601a = he1Var;
        this.b = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        ljl0 ljl0Var;
        if (zjeVar instanceof ljl0) {
            ljl0Var = (ljl0) zjeVar;
            int i = ljl0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ljl0Var.k = i - Integer.MIN_VALUE;
            } else {
                ljl0Var = new ljl0(this, zjeVar);
            }
        } else {
            ljl0Var = new ljl0(this, zjeVar);
        }
        Object obj = ljl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ljl0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            List list = this.c;
            if (!list.isEmpty()) {
                return list;
            }
            dvj dvjVar = this.b.b;
            lcl0 lcl0Var = new lcl0(this, yjeVar, (byte) 2);
            ljl0Var.k = 1;
            if (qjj.d0(dvjVar, lcl0Var, ljl0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return this.c;
    }
}

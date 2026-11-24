package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ggm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mne f11257a;
    public final fuj0 b;
    public final knf0 c;
    public final igm0 d;

    public ggm0(mne mneVar, fuj0 fuj0Var, knf0 knf0Var, igm0 igm0Var) {
        knf0Var.getClass();
        igm0Var.getClass();
        this.f11257a = mneVar;
        this.b = fuj0Var;
        this.c = knf0Var;
        this.d = igm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, zje zjeVar) {
        fgm0 fgm0Var;
        if (zjeVar instanceof fgm0) {
            fgm0Var = (fgm0) zjeVar;
            int i2 = fgm0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fgm0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                fgm0Var = new fgm0(this, zjeVar);
            }
        } else {
            fgm0Var = new fgm0(this, zjeVar);
        }
        Object objD0 = fgm0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = fgm0Var.k;
        if (i3 == 0) {
            z1x.P(objD0);
            dvj dvjVar = this.f11257a.b;
            ydu yduVar = new ydu(this, i, null);
            fgm0Var.k = 1;
            objD0 = qjj.d0(dvjVar, yduVar, fgm0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        return (List) objD0;
    }
}

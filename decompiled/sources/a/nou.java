package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class nou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrd f23883a;
    public final gst0 b;

    public nou(rrd rrdVar, gst0 gst0Var) {
        gst0Var.getClass();
        this.f23883a = rrdVar;
        this.b = gst0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(tl5 tl5Var, yje yjeVar) {
        mou mouVar;
        if (yjeVar instanceof mou) {
            mouVar = (mou) yjeVar;
            int i = mouVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mouVar.k = i - Integer.MIN_VALUE;
            } else {
                mouVar = new mou(this, yjeVar);
            }
        } else {
            mouVar = new mou(this, yjeVar);
        }
        Object objI = mouVar.i;
        wne wneVar = wne.f39444a;
        int i2 = mouVar.k;
        Object obj = null;
        gst0 gst0Var = this.b;
        if (i2 == 0) {
            z1x.P(objI);
            gst0Var.e();
            mouVar.k = 1;
            objI = this.f23883a.i(tl5Var, mouVar);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objI);
        }
        for (Object obj2 : (Iterable) objI) {
            if (((ql5) obj2).f28916a == gst0Var.e()) {
                obj = obj2;
                break;
            }
        }
        ql5 ql5Var = (ql5) obj;
        if (ql5Var != null) {
            return ql5Var;
        }
        throw new ss3();
    }
}

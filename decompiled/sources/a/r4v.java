package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r4v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gst0 f29856a;

    public r4v(gst0 gst0Var, byte b) {
        gst0Var.getClass();
        switch (b) {
            case 1:
                this.f29856a = gst0Var;
                break;
            case 2:
                this.f29856a = gst0Var;
                break;
            case 3:
                this.f29856a = gst0Var;
                break;
            default:
                this.f29856a = gst0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        q4v q4vVar;
        if (zjeVar instanceof q4v) {
            q4vVar = (q4v) zjeVar;
            int i = q4vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                q4vVar.k = i - Integer.MIN_VALUE;
            } else {
                q4vVar = new q4v(this, zjeVar);
            }
        } else {
            q4vVar = new q4v(this, zjeVar);
        }
        Object objJ = q4vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = q4vVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objJ);
            j0s j0sVar = new j0s(this, yjeVar, (byte) 16);
            q4vVar.k = 1;
            objJ = d5c.J(q4vVar, j0sVar);
            if (objJ != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objJ);
                return objJ;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objJ);
        q4vVar.k = 2;
        Object objAwait = ((jzj) objJ).await(q4vVar);
        return objAwait == wneVar ? wneVar : objAwait;
    }

    public void b(oa20 oa20Var) {
        oa20Var.getClass();
        if (StringsKt.t0(oa20Var.f24910a) != null) {
            this.f29856a.h(oa20Var.h, oa20Var.i);
        }
    }
}

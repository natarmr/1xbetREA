package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class eot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f8152a;
    public final gst0 b;

    public eot(pbt pbtVar, gst0 gst0Var, byte b) {
        pbtVar.getClass();
        gst0Var.getClass();
        switch (b) {
            case 1:
                this.f8152a = pbtVar;
                this.b = gst0Var;
                break;
            default:
                this.f8152a = pbtVar;
                this.b = gst0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        eou eouVar;
        Object next;
        int i;
        if (zjeVar instanceof eou) {
            eouVar = (eou) zjeVar;
            int i2 = eouVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eouVar.k = i2 - Integer.MIN_VALUE;
            } else {
                eouVar = new eou(this, zjeVar);
            }
        } else {
            eouVar = new eou(this, zjeVar);
        }
        Object objK = eouVar.i;
        wne wneVar = wne.f39444a;
        int i3 = eouVar.k;
        if (i3 == 0) {
            z1x.P(objK);
            boolean zA = this.b.a();
            eouVar.k = 1;
            objK = this.f8152a.k(zA, eouVar);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        Iterator it = ((Iterable) objK).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            evz evzVar = d270.b;
            i = ((rq60) next).f30917a;
            evzVar.getClass();
        } while (evz.c(i) != d270.LUCKY_WHEEL);
        rq60 rq60Var = (rq60) next;
        if (rq60Var != null) {
            return new cfb0(rq60Var.b, rq60Var.c, rq60Var.d);
        }
        return null;
    }
}

package a;

import android.javax.sip.message.Response;
import java.io.Serializable;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gob extends w46 {
    public final bm5 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final khf0 f;
    public final trm0 g;
    public final bsu h;
    public final ahu i;
    public final urt j;
    public final v88 k;
    public final ih5 l;
    public final zg m;
    public final eqx n;
    public final mne o;
    public final wxs0 p;
    public final i1w0 q;
    public final l7k r;
    public final cmt s;
    public final mdm t;
    public final p7m0 u = q7m0.a(bob.f2926a);
    public ql5 v;
    public bby w;
    public bby x;

    public gob(bm5 bm5Var, boolean z, boolean z2, boolean z3, khf0 khf0Var, trm0 trm0Var, bsu bsuVar, ahu ahuVar, urt urtVar, v88 v88Var, ih5 ih5Var, zg zgVar, eqx eqxVar, mne mneVar, g2v g2vVar, wxs0 wxs0Var, i1w0 i1w0Var, l7k l7kVar, cmt cmtVar) {
        this.b = bm5Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = khf0Var;
        this.g = trm0Var;
        this.h = bsuVar;
        this.i = ahuVar;
        this.j = urtVar;
        this.k = v88Var;
        this.l = ih5Var;
        this.m = zgVar;
        this.n = eqxVar;
        this.o = mneVar;
        this.p = wxs0Var;
        this.q = i1w0Var;
        this.r = l7kVar;
        this.s = cmtVar;
        this.t = g2v.b(g2vVar, pb10.r1, pdm.d, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.DOES_NOT_EXIST_ANYWHERE);
        y();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable w(zje zjeVar) {
        eob eobVar;
        if (zjeVar instanceof eob) {
            eobVar = (eob) zjeVar;
            int i = eobVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                eobVar.k = i - Integer.MIN_VALUE;
            } else {
                eobVar = new eob(this, zjeVar);
            }
        } else {
            eobVar = new eob(this, zjeVar);
        }
        Object objB = eobVar.i;
        wne wneVar = wne.f39444a;
        int i2 = eobVar.k;
        bm5 bm5Var = this.b;
        if (i2 == 0) {
            z1x.P(objB);
            eobVar.k = 1;
            objB = this.i.b(bm5Var, eobVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        ql5 ql5Var = (ql5) objB;
        this.g.l(bm5Var, ql5Var);
        return ql5Var;
    }

    public final void x(ql5 ql5Var, boolean z) {
        if (z || !ql5Var.i.b()) {
            this.v = ql5Var;
            if (this.c) {
                this.g.l(this.b, ql5Var);
            }
        }
    }

    public final void y() {
        bby bbyVar = this.x;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.x = sac.V(jiu0.a(this), new znb(this, (byte) 0), null, this.o.f22085a, new kv(this, null, (byte) 5), 10);
        }
    }
}

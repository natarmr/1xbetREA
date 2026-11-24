package a;

import android.javax.sip.message.Response;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class yas0 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final duj o;
    public final oeg0 p;
    public final ctf0 q;
    public final s91 r;
    public final mne s;
    public final qu t;
    public final zr1 u;
    public final gto0 v;
    public final wdu w;
    public final sti0 x;
    public c4m0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yas0(long j, String str, duj dujVar, oeg0 oeg0Var, ctf0 ctf0Var, s91 s91Var, mne mneVar, qu quVar, zr1 zr1Var, bzt bztVar, kc60 kc60Var, gto0 gto0Var, wdu wduVar, r2v r2vVar, q2v q2vVar, sti0 sti0Var) {
        super(new j6s0(j, str, bztVar), cvm0.p(mneVar.c, mneVar.f22085a), new h0j0(ctf0Var, (byte) 28), (yzn0) null);
        oeg0Var.getClass();
        ctf0Var.getClass();
        s91Var.getClass();
        q2vVar.getClass();
        sti0Var.getClass();
        this.o = dujVar;
        this.p = oeg0Var;
        this.q = ctf0Var;
        this.r = s91Var;
        this.s = mneVar;
        this.t = quVar;
        this.u = zr1Var;
        this.v = gto0Var;
        this.w = wduVar;
        this.x = sti0Var;
        fnq fnqVar = new fnq(new o7s0(vtb.N(q2vVar.f28020a.f26522a), ((sas0) D()).f31900a, (byte) 0), new uas0(this, null), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        sac.T(fnqVar, d5c.S(bvcVarA, dvjVar), foe.h);
        sac.T(new fnq(r2vVar.a(((sas0) D()).f31900a), new vas0(this, null, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), foe.h);
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new vas0(this, null, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), dvjVar), xas0.h);
    }

    public final void M(boolean z2, boolean z3) {
        c4m0 c4m0Var = this.y;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.y = sac.T(new fnq(new fnq(this.w.q(z2, ((sas0) D()).f31900a), new uas0(z3, this, null)), new vas0(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.s.b), new vas0(this, null, (byte) 1));
    }

    public final void N() {
        gu1 gu1Var;
        fas0 fas0Var = ((sas0) D()).c;
        yje yjeVar = null;
        cas0 cas0Var = fas0Var instanceof cas0 ? (cas0) fas0Var : null;
        if (cas0Var == null || (gu1Var = cas0Var.f4028a) == null) {
            return;
        }
        byte b = 16;
        sac.V(jiu0.a(this), null, new qir0(this, b), this.s.b, new meq0(this, gu1Var.b, yjeVar, b), 9);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        gu1 gu1Var;
        bas0 bas0Var = (bas0) obj;
        bas0Var.getClass();
        super.x(bas0Var);
        if (bas0Var instanceof w9s0) {
            E();
            return;
        }
        if (bas0Var instanceof x9s0) {
            M(true, true);
            return;
        }
        if (!(bas0Var instanceof y9s0)) {
            if (!(bas0Var instanceof z9s0)) {
                if (bas0Var instanceof aas0) {
                    M(false, true);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            fas0 fas0Var = ((sas0) D()).c;
            cas0 cas0Var = fas0Var instanceof cas0 ? (cas0) fas0Var : null;
            if (cas0Var == null || (gu1Var = cas0Var.f4028a) == null) {
                return;
            }
            gqt0 gqt0Var = gu1Var.n;
            int iOrdinal = gqt0Var.ordinal();
            if (iOrdinal == 0) {
                N();
                return;
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 5 || iOrdinal == 6) {
                    this.r.b(new AggregatorScreenModel(null, null, 0L, new sm1(0L), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE), new AggregatorScreenModel(null, null, 0L, new qm1(((sas0) D()).f31900a, s9s0.b, ((sas0) D()).b, gqt0Var == gqt0.g), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                    return;
                } else {
                    this.x.a(false, ((sas0) D()).f31900a);
                    return;
                }
            }
            ctf0 ctf0Var = this.q;
            lsm0 lsm0Var = ctf0Var.b;
            lsm0 lsm0Var2 = ctf0Var.b;
            String strA = lsm0Var.a(R.string.tournamenet_dialor_title, Arrays.copyOf(new Object[0], 0));
            String strA2 = lsm0Var2.a(R.string.tournamenet_blocked_error, Arrays.copyOf(new Object[0], 0));
            String strA3 = lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0));
            n12 n12Var = n12.f22727a;
            G(new qas0(strA, strA2, strA3));
            return;
        }
        G(new oas0(((y9s0) bas0Var).f42265a));
        i1w0 i1w0VarC = this.p.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }
}

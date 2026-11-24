package a;

import android.javax.sip.message.Response;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class l7s0 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final wdu o;
    public final ctf0 p;
    public final gto0 q;
    public final oeg0 r;
    public final mne s;
    public final s91 t;
    public final qu u;
    public final zr1 v;
    public final r2v w;
    public final ytt x;
    public c4m0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    public l7s0(wdu wduVar, ctf0 ctf0Var, gto0 gto0Var, oeg0 oeg0Var, mne mneVar, s91 s91Var, wiu wiuVar, qu quVar, zr1 zr1Var, r2v r2vVar, bzt bztVar, ytt yttVar, crm0 crm0Var) {
        ctf0Var.getClass();
        oeg0Var.getClass();
        s91Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.f22085a, mneVar.c);
        byte b = 27;
        super(new ck60(wiuVar, crm0Var, bztVar, b), g090VarP, new h0j0(ctf0Var, b), (yzn0) null);
        this.o = wduVar;
        this.p = ctf0Var;
        this.q = gto0Var;
        this.r = oeg0Var;
        this.s = mneVar;
        this.t = s91Var;
        this.u = quVar;
        this.v = zr1Var;
        this.w = r2vVar;
        this.x = yttVar;
        M(true);
        sac.V(jiu0.a(this), new g4s0((byte) 11), null, mneVar.b, new k6s0(this, null, (byte) 1), 10);
    }

    public final void M(boolean z2) {
        c4m0 c4m0Var;
        c4m0 c4m0Var2 = this.y;
        yje yjeVar = null;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.y) != null) {
            c4m0Var.cancel(null);
        }
        this.y = sac.T(new fnq(this.o.q(z2, ((e7s0) D()).b), new meq0((Object) this, yjeVar, (byte) 15), (byte) 4), d5c.S(jiu0.a(this), this.s.b), new rtq0(this, yjeVar, (byte) 9));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(long j, z1s0 z1s0Var, String str, zje zjeVar) {
        j7s0 j7s0Var;
        if (zjeVar instanceof j7s0) {
            j7s0Var = (j7s0) zjeVar;
            int i = j7s0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7s0Var.n = i - Integer.MIN_VALUE;
            } else {
                j7s0Var = new j7s0(this, zjeVar);
            }
        } else {
            j7s0Var = new j7s0(this, zjeVar);
        }
        Object obj = j7s0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = j7s0Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            aue0 aue0Var = aue0.d;
            j7s0Var.j = z1s0Var;
            j7s0Var.k = str;
            j7s0Var.i = j;
            j7s0Var.n = 1;
            if (this.x.a(aue0Var, j7s0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = j7s0Var.i;
            str = j7s0Var.k;
            z1s0Var = j7s0Var.j;
            z1x.P(obj);
        }
        this.r.c().d(new as0((i3t0) this, j, (Serializable) z1s0Var, str, (byte) 14));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (N(r12, r3, r4, r5) == r6) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(long r31, a.z1s0 r33, java.lang.String r34, a.zje r35) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l7s0.O(long, a.z1s0, java.lang.String, a.zje):java.lang.Object");
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        oyg0 oyg0Var;
        Object value2;
        u6s0 u6s0Var = (u6s0) obj;
        u6s0Var.getClass();
        if (u6s0Var.equals(p6s0.f26473a)) {
            E();
            return;
        }
        if (u6s0Var.equals(r6s0.f29950a)) {
            G(a7s0.f389a);
            return;
        }
        boolean zEquals = u6s0Var.equals(q6s0.f28217a);
        s91 s91Var = this.t;
        if (zEquals) {
            s91Var.a();
            return;
        }
        if (!(u6s0Var instanceof t6s0)) {
            if (u6s0Var.equals(s6s0.f31720a)) {
                M(false);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        t6s0 t6s0Var = (t6s0) u6s0Var;
        hqt0 hqt0Var = t6s0Var.f33435a;
        z1s0 z1s0Var = t6s0Var.b;
        ocj ocjVar = this.i;
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            oyg0Var = this.f;
            oyg0Var.getClass();
        } while (!p7m0Var.m(value, e7s0.a((e7s0) value, null, false, null, true, 255)));
        int iOrdinal = hqt0Var.ordinal();
        if (iOrdinal == 0) {
            sac.V(jiu0.a(this), new g4s0((byte) 12), null, this.s.b, new fl3(this, ((e7s0) D()).b, z1s0Var, ((e7s0) D()).c, null, (byte) 8), 10);
            return;
        }
        if (iOrdinal == 3) {
            ctf0 ctf0Var = this.p;
            lsm0 lsm0Var = ctf0Var.b;
            lsm0 lsm0Var2 = ctf0Var.b;
            String strA = lsm0Var.a(R.string.tournamenet_dialor_title, Arrays.copyOf(new Object[0], 0));
            String strA2 = lsm0Var2.a(R.string.tournamenet_blocked_error, Arrays.copyOf(new Object[0], 0));
            String strA3 = lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0));
            n12 n12Var = n12.f22727a;
            G(new c7s0(strA, strA2, strA3));
            return;
        }
        if (iOrdinal == 5 || iOrdinal == 6) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, e7s0.a((e7s0) value2, null, false, null, false, 255)));
            s91Var.b(new AggregatorScreenModel(null, null, 0L, new sm1(0L), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE), new AggregatorScreenModel(null, null, 0L, new qm1(((e7s0) D()).b, s9s0.b, ((e7s0) D()).c, hqt0Var == hqt0.g), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
        }
    }
}

package a;

import android.javax.sip.message.Response;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class n6s0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final wdu o;
    public final m0u p;
    public final mne q;
    public final s91 r;
    public final gto0 s;
    public final oeg0 t;
    public final ctf0 u;
    public final qu v;
    public final zr1 w;
    public final r2v x;
    public final ytt y;
    public c4m0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public n6s0(wdu wduVar, m0u m0uVar, mne mneVar, s91 s91Var, gto0 gto0Var, oeg0 oeg0Var, ctf0 ctf0Var, qu quVar, zr1 zr1Var, r2v r2vVar, ytt yttVar, bzt bztVar, long j, String str) {
        s91Var.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        str.getClass();
        g090 g090VarP = cvm0.p(mneVar.f22085a, mneVar.c);
        super(new j6s0(bztVar, j, str), g090VarP, new h0j0(ctf0Var, (byte) 26), (yzn0) null);
        this.o = wduVar;
        this.p = m0uVar;
        this.q = mneVar;
        this.r = s91Var;
        this.s = gto0Var;
        this.t = oeg0Var;
        this.u = ctf0Var;
        this.v = quVar;
        this.w = zr1Var;
        this.x = r2vVar;
        this.y = yttVar;
        M(true);
        sac.V(jiu0.a(this), new g4s0((byte) 6), null, mneVar.b, new k6s0(this, null, (byte) 0), 10);
    }

    public final void M(boolean z) {
        c4m0 c4m0Var;
        c4m0 c4m0Var2 = this.z;
        yje yjeVar = null;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.z) != null) {
            c4m0Var.cancel(null);
        }
        this.z = sac.T(new fnq(this.o.q(z, ((e6s0) D()).f7303a), new jc1((Object) this, yjeVar, (byte) 10), (byte) 4), d5c.S(jiu0.a(this), this.q.b), new rtq0(this, yjeVar, (byte) 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(long j, z1s0 z1s0Var, String str, zje zjeVar) {
        l6s0 l6s0Var;
        if (zjeVar instanceof l6s0) {
            l6s0Var = (l6s0) zjeVar;
            int i = l6s0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6s0Var.n = i - Integer.MIN_VALUE;
            } else {
                l6s0Var = new l6s0(this, zjeVar);
            }
        } else {
            l6s0Var = new l6s0(this, zjeVar);
        }
        Object obj = l6s0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = l6s0Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            aue0 aue0Var = aue0.d;
            l6s0Var.j = z1s0Var;
            l6s0Var.k = str;
            l6s0Var.i = j;
            l6s0Var.n = 1;
            if (this.y.a(aue0Var, l6s0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = l6s0Var.i;
            str = l6s0Var.k;
            z1s0Var = l6s0Var.j;
            z1x.P(obj);
        }
        this.t.c().d(new as0((i3t0) this, j, (Serializable) z1s0Var, str, (byte) 13));
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
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n6s0.O(long, a.z1s0, java.lang.String, a.zje):java.lang.Object");
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        y5s0 y5s0Var = (y5s0) obj;
        y5s0Var.getClass();
        if (y5s0Var.equals(s5s0.f31669a)) {
            E();
            return;
        }
        boolean zEquals = y5s0Var.equals(u5s0.f35111a);
        s91 s91Var = this.r;
        if (zEquals) {
            s91Var.a();
            return;
        }
        if (y5s0Var instanceof v5s0) {
            v5s0 v5s0Var = (v5s0) y5s0Var;
            long j = v5s0Var.f36840a;
            String str = v5s0Var.b;
            this.w.f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, ((e6s0) D()).f7303a), new i1p((byte) 0, j)}), 10571L);
            this.v.g(((e6s0) D()).f7303a, j);
            s91Var.c(new AggregatorScreenModel(null, null, 0L, new om1(((e6s0) D()).f7303a, j, str), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
            return;
        }
        boolean z = y5s0Var instanceof t5s0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, e6s0.a((e6s0) value3, ((t5s0) y5s0Var).f33384a, null, null, false, null, false, 509)));
            return;
        }
        if (!(y5s0Var instanceof x5s0)) {
            if (y5s0Var.equals(w5s0.f38599a)) {
                M(false);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        x5s0 x5s0Var = (x5s0) y5s0Var;
        hqt0 hqt0Var = x5s0Var.f40334a;
        z1s0 z1s0Var = x5s0Var.b;
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value = p7m0Var2.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value, e6s0.a((e6s0) value, 0L, null, null, false, null, true, 255)));
        int iOrdinal = hqt0Var.ordinal();
        if (iOrdinal == 0) {
            sac.V(jiu0.a(this), new g4s0((byte) 7), null, this.q.b, new fl3(this, ((e6s0) D()).f7303a, z1s0Var, ((e6s0) D()).c, null, (byte) 7), 10);
            return;
        }
        if (iOrdinal == 3) {
            ctf0 ctf0Var = this.u;
            lsm0 lsm0Var = ctf0Var.b;
            lsm0 lsm0Var2 = ctf0Var.b;
            String strA = lsm0Var.a(R.string.tournamenet_dialor_title, Arrays.copyOf(new Object[0], 0));
            String strA2 = lsm0Var2.a(R.string.tournamenet_blocked_error, Arrays.copyOf(new Object[0], 0));
            String strA3 = lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0));
            n12 n12Var = n12.f22727a;
            G(new c6s0(strA, strA2, strA3));
            return;
        }
        if (iOrdinal == 5 || iOrdinal == 6) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, e6s0.a((e6s0) value2, 0L, null, null, false, null, false, 255)));
            s91Var.b(new AggregatorScreenModel(null, null, 0L, new sm1(0L), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE), new AggregatorScreenModel(null, null, 0L, new qm1(((e6s0) D()).f7303a, s9s0.b, ((e6s0) D()).c, hqt0Var == hqt0.g), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
        }
    }
}

package a;

import androidx.fragment.app.Fragment;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes5.dex */
public final class wu50 extends i3t0 {
    public static final /* synthetic */ int M = 0;
    public final duj A;
    public final m1e B;
    public final mne C;
    public final i1w0 D;
    public final grj E;
    public final jlx F;
    public final uzc0 G;
    public final bzt H;
    public c4m0 I;
    public bby J;
    public bby K;
    public boolean L;
    public final int o;
    public final int p;
    public final int q;
    public final boolean r;
    public final zmt s;
    public final imu t;
    public final l2u u;
    public final pnu v;
    public final zrt w;
    public final x20 x;
    public final yo4 y;
    public final nv20 z;

    public wu50(int i, int i2, int i3, boolean z, zmt zmtVar, imu imuVar, l2u l2uVar, pnu pnuVar, zrt zrtVar, x20 x20Var, yo4 yo4Var, nv20 nv20Var, duj dujVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var, grj grjVar, jlx jlxVar, uzc0 uzc0Var, bzt bztVar) {
        m1eVar.getClass();
        i1w0Var.getClass();
        y02 y02Var = new y02(i2, (byte) 7);
        mb50 mb50Var = new mb50((byte) 11);
        rwj rwjVar = mneVar.f22085a;
        super(null, y02Var, mb50Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = z;
        this.s = zmtVar;
        this.t = imuVar;
        this.u = l2uVar;
        this.v = pnuVar;
        this.w = zrtVar;
        this.x = x20Var;
        this.y = yo4Var;
        this.z = nv20Var;
        this.A = dujVar;
        this.B = m1eVar;
        this.C = mneVar;
        this.D = i1w0Var;
        this.E = grjVar;
        this.F = jlxVar;
        this.G = uzc0Var;
        this.H = bztVar;
    }

    public final void M(mm40 mm40Var, kr5 kr5Var, Fragment fragment, fet fetVar, int i) {
        int i2;
        RuleData ruleData;
        fetVar.g0(-2131637029);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(kr5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(fragment) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(this) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            oo5 oo5Var = kr5Var.n;
            String str = kr5Var.f;
            oo5 oo5Var2 = oo5.ACTION_DYNAMIC;
            String str2 = kr5Var.d;
            if (oo5Var == oo5Var2) {
                ruleData = new RuleData(str2, str, azw.R(str), xp20.f(new Pair("TITLE_KEY", kr5Var.o), new Pair("DESCRIPTION_KEY", kr5Var.r)));
            } else {
                ruleData = new RuleData(str2, 10, (Map) null, str);
            }
            RuleData ruleData2 = ruleData;
            this.z.getClass();
            new gle0().a(fragment, mm40Var, ruleData2, Integer.valueOf(kr5Var.b), false, fetVar, ((i2 >> 6) & 14) | 199680 | ((i2 << 3) & 112));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho(this, mm40Var, kr5Var, fragment, i, (byte) 20);
        }
    }

    public final void N(Throwable th) {
        bby bbyVar = this.K;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        this.A.b(th, new jt50(this, th, (byte) 1));
    }

    public final void O() {
        v3c.N(this.K);
        if (this.L) {
            bby bbyVar = this.K;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.K = sac.V(jiu0.a(this), new r750(1, this, wu50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, this.C.b, new e3p(this, null, (byte) 21), 10);
            }
        }
    }

    public final void P(lb10 lb10Var) {
        H(new nb50(lb10Var, this.H.f3488a.a().r, (byte) 1));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        hu50 hu50Var = (hu50) obj;
        hu50Var.getClass();
        if (hu50Var.equals(fu50.c)) {
            O();
            return;
        }
        byte b = 0;
        if (!hu50Var.equals(fu50.b)) {
            boolean zEquals = hu50Var.equals(fu50.e);
            mne mneVar = this.C;
            yje yjeVar = null;
            if (zEquals) {
                c4m0 c4m0Var = this.I;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.I = slb.U(new fnq(this.B.b(), new w620((Object) this, yjeVar, (byte) 22), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a));
                    return;
                }
                return;
            }
            if (hu50Var.equals(fu50.d)) {
                c4m0 c4m0Var2 = this.I;
                if (c4m0Var2 != null) {
                    v3c.N(c4m0Var2);
                    return;
                }
                return;
            }
            if (hu50Var instanceof gu50) {
                int i = ((gu50) hu50Var).f11913a;
                sac.V(jiu0.a(this), new r750(1, this, wu50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.f22085a, new bh0(this, i, yjeVar, (byte) 18), 10);
                return;
            }
            if (!hu50Var.equals(fu50.f10145a)) {
                t9f.b();
                return;
            }
            bby bbyVar = this.J;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.J = sac.V(jiu0.a(this), new r750(1, this, wu50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, mneVar.f22085a, new vu50(this, yjeVar, b), 10);
                return;
            }
            return;
        }
        i1w0 i1w0Var = this.D;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}

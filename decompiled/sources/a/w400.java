package a;

import a.cge0;
import a.lli0;
import a.m1r;
import a.ufx;
import a.xrz;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.limits.rs.impl.navigation.internal.LimitsRsInternalScreens$SelfExclusionFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class w400 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final shu o;
    public final wgu p;
    public final i1w0 q;
    public final mne r;
    public final duj s;
    public final pru t;
    public final evz u;
    public final c4m0 v;
    public bby w;

    public w400(vzg0 vzg0Var, shu shuVar, wgu wguVar, i1w0 i1w0Var, m1e m1eVar, ctf0 ctf0Var, mne mneVar, duj dujVar, pru pruVar, evz evzVar, ocl oclVar) {
        shuVar.getClass();
        wguVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        zwz zwzVar = new zwz(pruVar, (byte) 1);
        cz czVar = new cz(ctf0Var, oclVar, (byte) 20);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, zwzVar, czVar, cvm0.p(vs10Var, rwjVar));
        this.o = shuVar;
        this.p = wguVar;
        this.q = i1w0Var;
        this.r = mneVar;
        this.s = dujVar;
        this.t = pruVar;
        this.u = evzVar;
        c4m0 c4m0Var = this.v;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.v = sac.T(new fnq(m1eVar.a(), new slx(this, null, (byte) 14), (byte) 4), d5c.S(jiu0.a(this), rwjVar), v400.h);
        }
        M();
    }

    public final void M() {
        bby bbyVar = this.w;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.w = I(this.r.b, new ebz(this, (byte) 22), new epp(this, null, (byte) 13));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        x300 x300Var = (x300) obj;
        x300Var.getClass();
        super.x(x300Var);
        boolean zEquals = x300Var.equals(s300.f31531a);
        byte b = 0;
        i1w0 i1w0Var = this.q;
        if (zEquals) {
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
        } else {
            if (x300Var.equals(v300.f36711a)) {
                M();
                return;
            }
            if (x300Var.equals(u300.f34972a)) {
                M();
                return;
            }
            if (x300Var.equals(r300.f29763a)) {
                E();
                return;
            }
            if (!(x300Var instanceof t300)) {
                if (!(x300Var instanceof w300)) {
                    t9f.b();
                    return;
                }
                int i = ((w300) x300Var).f38475a;
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0 oyg0Var = this.f;
                    oyg0Var.getClass();
                    q7x.F(oyg0Var, Integer.valueOf(i), "CURRENT_TAB_KEY");
                } while (!p7m0Var.m(value, l400.a((l400) value, null, null, i, false, false, 1019)));
                return;
            }
            final xrz xrzVar = ((t300) x300Var).f33243a;
            boolean z = xrzVar instanceof pki0;
            evz evzVar = this.u;
            if (z) {
                i1w0Var.getClass();
                k0w0 k0w0Var = new k0w0(i1w0Var);
                evzVar.getClass();
                k0w0Var.h(new FragmentScreen(xrzVar) { // from class: org.xplatform.limits.rs.impl.navigation.LimitsRsScreens$SessionTimeLimitsRsFragmentScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final xrz f46743a;

                    {
                        this.f46743a = xrzVar;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        cge0 cge0Var = lli0.P1;
                        int id = this.f46743a.getId();
                        cge0Var.getClass();
                        lli0 lli0Var = new lli0();
                        lli0Var.M1.I(lli0Var, lli0.Q1[0], id);
                        return lli0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if ((xrzVar instanceof lf7) || (xrzVar instanceof m810) || (xrzVar instanceof q8k)) {
                    i1w0Var.d(new u400(this, xrzVar, b));
                    return;
                }
                if (!(xrzVar instanceof h8i0)) {
                    return;
                }
                i1w0Var.getClass();
                k0w0 k0w0Var2 = new k0w0(i1w0Var);
                evzVar.getClass();
                k0w0Var2.h(new LimitsRsInternalScreens$SelfExclusionFragmentScreen());
                ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO2;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            }
        }
    }
}

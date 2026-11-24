package a;

import a.akq0;
import a.c8k;
import a.m1r;
import a.s9m0;
import a.ufx;
import a.xrz;
import a.ze7;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class cxz extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final mhu o;
    public final wgu p;
    public final i1w0 q;
    public final mne r;
    public final duj s;
    public final atz t;
    public final pru u;
    public final c4m0 v;
    public bby w;

    public cxz(vzg0 vzg0Var, mhu mhuVar, wgu wguVar, i1w0 i1w0Var, m1e m1eVar, ctf0 ctf0Var, mne mneVar, duj dujVar, atz atzVar, pru pruVar, ocl oclVar) {
        mhuVar.getClass();
        wguVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        zwz zwzVar = new zwz(pruVar, (byte) 0);
        cz czVar = new cz(ctf0Var, oclVar, (byte) 18);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, zwzVar, czVar, cvm0.p(vs10Var, rwjVar));
        this.o = mhuVar;
        this.p = wguVar;
        this.q = i1w0Var;
        this.r = mneVar;
        this.s = dujVar;
        this.t = atzVar;
        this.u = pruVar;
        c4m0 c4m0Var = this.v;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.v = sac.T(new fnq(m1eVar.b(), new slx(this, null, (byte) 12), (byte) 4), d5c.S(jiu0.a(this), rwjVar), bxz.h);
        }
    }

    public final void M() {
        bby bbyVar = this.w;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.w = I(this.r.b, new ebz(this, (byte) 19), new epp(this, null, (byte) 12));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        cwz cwzVar = (cwz) obj;
        cwzVar.getClass();
        super.x(cwzVar);
        boolean zEquals = cwzVar.equals(xvz.f41585a);
        final byte b = 0;
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
            if (cwzVar.equals(awz.f1597a)) {
                M();
                return;
            }
            if (cwzVar.equals(zvz.f45081a)) {
                M();
                return;
            }
            if (cwzVar.equals(wvz.f39862a)) {
                E();
                return;
            }
            if (!(cwzVar instanceof yvz)) {
                if (!(cwzVar instanceof bwz)) {
                    t9f.b();
                    return;
                }
                int i = ((bwz) cwzVar).f3351a;
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0 oyg0Var = this.f;
                    oyg0Var.getClass();
                    q7x.F(oyg0Var, Integer.valueOf(i), "CURRENT_TAB_KEY");
                } while (!p7m0Var.m(value, uwz.a((uwz) value, null, null, i, false, false, 4091)));
                return;
            }
            final xrz xrzVar = ((yvz) cwzVar).f43344a;
            if (!(xrzVar instanceof h8i0) && !(xrzVar instanceof qmq0) && !(xrzVar instanceof tbe0)) {
                if (xrzVar instanceof xh7) {
                    i1w0Var.d(new Function1(this) { // from class: a.axz
                        public final /* synthetic */ cxz b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b2 = b;
                            xrz xrzVar2 = xrzVar;
                            cxz cxzVar = this.b;
                            k0w0 k0w0Var = (k0w0) obj2;
                            switch (b2) {
                                case 0:
                                    k0w0Var.getClass();
                                    atz atzVar = cxzVar.t;
                                    final byte b3 = ((xh7) xrzVar2).f40874a;
                                    atzVar.getClass();
                                    k0w0Var.h(new FragmentScreen(b3) { // from class: org.xplatform.limits.ie.impl.navigation.internal.LimitsIeInternalScreens$BetLimitFragmentScreen

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final byte f46741a;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            this.f46741a = b3;
                                        }

                                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                        public final Fragment a(m1r m1rVar) {
                                            m1rVar.getClass();
                                            ze7.P1.getClass();
                                            ze7 ze7Var = new ze7();
                                            ze7Var.L1.I(ze7Var, ze7.Q1[0], this.f46741a);
                                            return ze7Var;
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
                                    break;
                                default:
                                    k0w0Var.getClass();
                                    atz atzVar2 = cxzVar.t;
                                    final byte b4 = ((q8k) xrzVar2).f28304a;
                                    atzVar2.getClass();
                                    k0w0Var.h(new FragmentScreen(b4) { // from class: org.xplatform.limits.ie.impl.navigation.internal.LimitsIeInternalScreens$DepositLimitFragmentScreen

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final byte f46742a;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            this.f46742a = b4;
                                        }

                                        @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                        public final Fragment a(m1r m1rVar) {
                                            m1rVar.getClass();
                                            c8k.Q1.getClass();
                                            c8k c8kVar = new c8k();
                                            c8kVar.L1.I(c8kVar, c8k.R1[0], this.f46742a);
                                            return c8kVar;
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
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    return;
                } else {
                    if (xrzVar instanceof q8k) {
                        final byte b2 = 1;
                        i1w0Var.d(new Function1(this) { // from class: a.axz
                            public final /* synthetic */ cxz b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b3 = b2;
                                xrz xrzVar2 = xrzVar;
                                cxz cxzVar = this.b;
                                k0w0 k0w0Var = (k0w0) obj2;
                                switch (b3) {
                                    case 0:
                                        k0w0Var.getClass();
                                        atz atzVar = cxzVar.t;
                                        final int b4 = ((xh7) xrzVar2).f40874a;
                                        atzVar.getClass();
                                        k0w0Var.h(new FragmentScreen(b4) { // from class: org.xplatform.limits.ie.impl.navigation.internal.LimitsIeInternalScreens$BetLimitFragmentScreen

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final byte f46741a;

                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                this.f46741a = b4;
                                            }

                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            public final Fragment a(m1r m1rVar) {
                                                m1rVar.getClass();
                                                ze7.P1.getClass();
                                                ze7 ze7Var = new ze7();
                                                ze7Var.L1.I(ze7Var, ze7.Q1[0], this.f46741a);
                                                return ze7Var;
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
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        atz atzVar2 = cxzVar.t;
                                        final int b5 = ((q8k) xrzVar2).f28304a;
                                        atzVar2.getClass();
                                        k0w0Var.h(new FragmentScreen(b5) { // from class: org.xplatform.limits.ie.impl.navigation.internal.LimitsIeInternalScreens$DepositLimitFragmentScreen

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final byte f46742a;

                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                this.f46742a = b5;
                                            }

                                            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                            public final Fragment a(m1r m1rVar) {
                                                m1rVar.getClass();
                                                c8k.Q1.getClass();
                                                c8k c8kVar = new c8k();
                                                c8kVar.L1.I(c8kVar, c8k.R1[0], this.f46742a);
                                                return c8kVar;
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
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            this.t.getClass();
            k0w0VarI.h(new FragmentScreen(xrzVar) { // from class: org.xplatform.limits.ie.impl.navigation.LimitsIeScreens$TimeLimitsIeFragmentScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final xrz f46740a;

                {
                    this.f46740a = xrzVar;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    s9m0 s9m0Var = akq0.P1;
                    int id = this.f46740a.getId();
                    s9m0Var.getClass();
                    akq0 akq0Var = new akq0();
                    akq0Var.M1.I(akq0Var, akq0.Q1[0], id);
                    return akq0Var;
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
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}

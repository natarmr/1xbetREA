package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.xplatform.core.navigation.authorization.model.AuthType;
import org.xplatform.core.navigation.authorization.screen.Authorization;
import org.xplatform.core.navigation.authorization.screen.Authorization$Registration$Screen;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$VerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class mf50 {
    public static final /* synthetic */ iiy[] c = {new j0d0(mf50.class, "stack", "getStack()Lorg/xplatform/core/navigation/router/navigation_stack/model/NavigationStack;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wu4 f21680a;
    public final p7m0 b;

    public mf50(wu4 wu4Var) {
        wu4Var.getClass();
        this.f21680a = wu4Var;
        iun iunVar = iun.f15405a;
        bjk bjkVar = cfx0.o;
        this.b = q7m0.a(new lf50(iunVar, null, new pe50(null, null, bjkVar, new pu4(bjkVar), iunVar, iunVar)));
    }

    public static String f(m7h0 m7h0Var) {
        String value;
        String strV = sre0.f32672a.b(m7h0Var.getClass()).v();
        if (strV == null) {
            strV = m7h0Var.getClass().getName();
        }
        bh30 bh30VarB = new Regex("[A-Z][a-zA-Z]+").b(strV);
        return (bh30VarB == null || (value = bh30VarB.getValue()) == null) ? m7h0Var.getF45455a() : value;
    }

    public final List a(g1w0 g1w0Var) {
        bjk bjkVarL;
        Object value;
        bjk bjkVarL2;
        Object value2;
        m7h0 m7h0VarA;
        Object value3;
        lf50 lf50Var;
        Pair pair;
        Object value4;
        Object value5;
        bjk bjkVarL3;
        Object value6;
        lf50 lf50VarT;
        Object value7;
        lf50 lf50Var2;
        Object value8;
        lf50 lf50VarB;
        Object value9;
        iun iunVar;
        Object value10;
        lf50 lf50VarA;
        Object value11;
        lf50 lf50Var3;
        Object value12;
        lf50 lf50Var4;
        Object value13;
        lf50 lf50Var5;
        Object value14;
        List listC;
        pe50 pe50Var;
        Object value15;
        lf50 lf50Var6;
        bjk bjkVar = cfx0.o;
        if (g1w0Var != null) {
            if (g1w0Var instanceof a1w0) {
                return kotlin.collections.a.c(new sd50(((a1w0) g1w0Var).f94a));
            }
            if (g1w0Var instanceof b1w0) {
                return kotlin.collections.a.c(new ne50(((b1w0) g1w0Var).f1828a));
            }
            boolean z = g1w0Var instanceof w0w0;
            p7m0 p7m0Var = this.b;
            if (z) {
                m7h0 m7h0Var = ((w0w0) g1w0Var).f38370a;
                do {
                    value15 = p7m0Var.getValue();
                    lf50Var6 = (lf50) value15;
                    lf50Var6.getClass();
                } while (!p7m0Var.m(value15, qxw.N(lf50Var6, m7h0Var)));
                return kotlin.collections.a.c(m7h0Var instanceof DialogScreen ? new le50((DialogScreen) m7h0Var, b().c.c) : new fe50(m7h0Var));
            }
            byte b = 1;
            if (g1w0Var instanceof d1w0) {
                m7h0 m7h0Var2 = ((d1w0) g1w0Var).f5332a;
                g(new rrj(m7h0Var2, b));
                return kotlin.collections.a.c(new ke50(m7h0Var2));
            }
            if (g1w0Var instanceof y0w0) {
                m7h0 m7h0Var3 = ((y0w0) g1w0Var).f41827a;
                do {
                    value14 = p7m0Var.getValue();
                    ((lf50) value14).getClass();
                    listC = kotlin.collections.a.c(new ue50(new vul0(m7h0Var3)));
                    pu4 pu4Var = new pu4(bjkVar);
                    iun iunVar2 = iun.f15405a;
                    pe50Var = new pe50(null, null, bjkVar, pu4Var, iunVar2, iunVar2);
                    listC.getClass();
                } while (!p7m0Var.m(value14, new lf50(listC, null, pe50Var)));
                return kotlin.collections.a.c(new he50(m7h0Var3));
            }
            if (g1w0Var instanceof p0w0) {
                byte b2 = b().b == null ? (byte) 0 : (byte) 1;
                List list = b().c.f;
                do {
                    value13 = p7m0Var.getValue();
                    lf50Var5 = (lf50) value13;
                    lf50Var5.getClass();
                } while (!p7m0Var.m(value13, qxw.t(lf50Var5)));
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(td50.f33750a);
                if (b2 != 0 && b().b == null) {
                    lc00VarB.add(new ce50(list));
                }
                return kotlin.collections.a.a(lc00VarB);
            }
            if (g1w0Var instanceof q0w0) {
                m7h0 m7h0Var4 = ((q0w0) g1w0Var).f27923a;
                do {
                    value12 = p7m0Var.getValue();
                    lf50Var4 = (lf50) value12;
                    lf50Var4.getClass();
                } while (!p7m0Var.m(value12, qxw.u(lf50Var4, m7h0Var4)));
                return kotlin.collections.a.c(new ud50(m7h0Var4));
            }
            if (g1w0Var instanceof f1w0) {
                FragmentScreen fragmentScreen = ((f1w0) g1w0Var).f8787a;
                do {
                    value11 = p7m0Var.getValue();
                    lf50Var3 = (lf50) value11;
                    lf50Var3.getClass();
                } while (!p7m0Var.m(value11, lf50.a(lf50Var3, CollectionsKt.r0(lf50Var3.f19938a, new se50(new vul0(fragmentScreen), iun.f15405a)), null, null, 6)));
                return kotlin.collections.a.c(new me50(fragmentScreen));
            }
            if (g1w0Var instanceof u0w0) {
                do {
                    value10 = p7m0Var.getValue();
                    lf50VarA = (lf50) value10;
                    lf50VarA.getClass();
                    List list2 = lf50VarA.f19938a;
                    ve50 ve50Var = (ve50) CollectionsKt.f0(list2);
                    if (ve50Var != null && (ve50Var instanceof se50)) {
                        lf50VarA = lf50.a(lf50VarA, CollectionsKt.P(1, list2), null, null, 6);
                    }
                } while (!p7m0Var.m(value10, lf50VarA));
                return kotlin.collections.a.c(de50.f5932a);
            }
            if (g1w0Var instanceof v0w0) {
                do {
                    value9 = p7m0Var.getValue();
                    ((lf50) value9).getClass();
                    iunVar = iun.f15405a;
                } while (!p7m0Var.m(value9, new lf50(iunVar, null, new pe50(null, null, bjkVar, new pu4(bjkVar), iunVar, iunVar))));
                return kotlin.collections.a.c(ee50.f7654a);
            }
            if (g1w0Var instanceof z0w0) {
                VerificationStatusScreens$VerificationStatusFragmentScreen verificationStatusScreens$VerificationStatusFragmentScreen = ((z0w0) g1w0Var).f43589a;
                g(new b530((Object) verificationStatusScreens$VerificationStatusFragmentScreen, (byte) 17));
                return kotlin.collections.a.c(new ie50(verificationStatusScreens$VerificationStatusFragmentScreen));
            }
            if (g1w0Var instanceof s0w0) {
                FragmentScreen fragmentScreen2 = ((s0w0) g1w0Var).f31429a;
                g(new srj(fragmentScreen2, (byte) 2));
                return kotlin.collections.a.c(new vd50(fragmentScreen2));
            }
            if (g1w0Var instanceof x0w0) {
                List list3 = ((x0w0) g1w0Var).f40092a;
                do {
                    value8 = p7m0Var.getValue();
                    ((lf50) value8).getClass();
                    lf50VarB = b();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        lf50VarB = qxw.N(lf50VarB, (m7h0) it.next());
                    }
                } while (!p7m0Var.m(value8, lf50VarB));
                return kotlin.collections.a.c(new ge50(list3));
            }
            if (g1w0Var instanceof e1w0) {
                DialogScreen dialogScreen = ((e1w0) g1w0Var).f7058a;
                do {
                    value7 = p7m0Var.getValue();
                    lf50Var2 = (lf50) value7;
                    lf50Var2.getClass();
                } while (!p7m0Var.m(value7, qxw.N(lf50Var2, dialogScreen)));
                return kotlin.collections.a.c(new le50(dialogScreen, b().c.c));
            }
            if (g1w0Var instanceof t0w0) {
                if (qxw.I(b())) {
                    re50 re50Var = b().b;
                    if (re50Var == null || (bjkVarL3 = s0x.L(re50Var.b)) == null) {
                        bjkVarL3 = b().c.d.f27596a;
                    }
                } else {
                    bjkVarL3 = b().c.c;
                }
                bjk bjkVar2 = bjkVarL3;
                do {
                    value6 = p7m0Var.getValue();
                    lf50VarT = (lf50) value6;
                    lf50VarT.getClass();
                    ve50 ve50Var2 = lf50VarT.b;
                    if (ve50Var2 == null) {
                        ve50Var2 = (ve50) CollectionsKt.f0(lf50VarT.f19938a);
                    }
                    if (ve50Var2 != null && !ve50Var2.b().isEmpty()) {
                        lf50VarT = qxw.t(lf50VarT);
                    }
                } while (!p7m0Var.m(value6, lf50VarT));
                return kotlin.collections.a.c(new yd50(bjkVar2));
            }
            if (g1w0Var instanceof c1w0) {
                c1w0 c1w0Var = (c1w0) g1w0Var;
                return kotlin.collections.a.c(new je50(c1w0Var.f3596a, c1w0Var.b));
            }
            boolean z2 = g1w0Var instanceof n0w0;
            wu4 wu4Var = this.f21680a;
            if (z2) {
                Pair pairA = wu4Var.a(b(), null);
                lf50 lf50Var7 = (lf50) pairA.f46059a;
                List list4 = (List) pairA.b;
                do {
                    value5 = p7m0Var.getValue();
                    ((lf50) value5).getClass();
                } while (!p7m0Var.m(value5, lf50Var7));
                return list4;
            }
            if (g1w0Var instanceof o0w0) {
                lf50 lf50VarB2 = b();
                wu4Var.getClass();
                lf50VarB2.getClass();
                Authorization authorization = (Authorization) wu4Var.b.invoke(AuthType.b);
                wul0 wul0VarA = qxw.A(lf50VarB2);
                boolean z3 = (wul0VarA != null ? wul0VarA.a() : null) instanceof Authorization.Login;
                if (authorization instanceof Authorization.Login.Screen) {
                    Authorization.Login.Screen screen = (Authorization.Login.Screen) authorization;
                    pe50 pe50Var2 = lf50VarB2.c;
                    wul0 wul0VarA2 = qxw.A(lf50VarB2);
                    lf50 lf50VarA2 = lf50.a(lf50VarB2, null, null, pe50.a(pe50Var2, wul0VarA2 != null ? wul0VarA2.a() : null, null, null, null, null, null, 60), 3);
                    pair = new Pair(qxw.P(lf50VarA2, nu4.b, screen, lf50VarA2.c.d.f27596a), kotlin.collections.a.c(new fe50(screen)));
                } else if (!(authorization instanceof Authorization$Registration$Screen)) {
                    pair = new Pair(lf50VarB2, iun.f15405a);
                } else if (z3) {
                    pair = new Pair(lf50VarB2, kotlin.collections.a.c(new ae50(new w0w0((Authorization$Registration$Screen) authorization))));
                } else {
                    Authorization$Registration$Screen authorization$Registration$Screen = (Authorization$Registration$Screen) authorization;
                    pe50 pe50Var3 = lf50VarB2.c;
                    wul0 wul0VarA3 = qxw.A(lf50VarB2);
                    lf50 lf50VarA3 = lf50.a(lf50VarB2, null, null, pe50.a(pe50Var3, wul0VarA3 != null ? wul0VarA3.a() : null, null, null, null, null, null, 60), 3);
                    pair = new Pair(qxw.P(lf50VarA3, nu4.b, authorization$Registration$Screen, lf50VarA3.c.d.f27596a), kotlin.collections.a.c(new fe50(authorization$Registration$Screen)));
                }
                lf50 lf50Var8 = (lf50) pair.f46059a;
                List list5 = (List) pair.b;
                do {
                    value4 = p7m0Var.getValue();
                    ((lf50) value4).getClass();
                } while (!p7m0Var.m(value4, lf50Var8));
                return list5;
            }
            if (g1w0Var instanceof r0w0) {
                re50 re50Var2 = b().b;
                if (re50Var2 == null || (m7h0VarA = re50Var2.b.a()) == null) {
                    m7h0VarA = (m7h0) wu4Var.b.invoke(AuthType.f46456a);
                }
                m7h0 m7h0Var5 = m7h0VarA;
                do {
                    value3 = p7m0Var.getValue();
                    lf50Var = (lf50) value3;
                    lf50Var.getClass();
                } while (!p7m0Var.m(value3, qxw.u(lf50Var, m7h0Var5)));
                return kotlin.collections.a.c(new ud50(m7h0Var5));
            }
            if (g1w0Var instanceof m0w0) {
                lf50 lf50VarB3 = b();
                wu4Var.getClass();
                lf50VarB3.getClass();
                pe50 pe50Var4 = lf50VarB3.c;
                g1w0 g1w0Var2 = pe50Var4.b;
                List list6 = pe50Var4.e;
                List list7 = pe50Var4.f;
                re50 re50Var3 = lf50VarB3.b;
                if (re50Var3 == null || (bjkVarL2 = s0x.L(re50Var3.b)) == null) {
                    bjkVarL2 = pe50Var4.d.f27596a;
                }
                m7h0 m7h0Var6 = pe50Var4.f26835a;
                boolean zI = qxw.I(lf50VarB3);
                lc00 lc00VarB2 = kotlin.collections.a.b();
                if (list6.isEmpty()) {
                    lc00VarB2.add(m7h0Var6 != null ? new ud50(m7h0Var6) : new ud50(null));
                    if (zI) {
                        lc00VarB2.add(new yd50(bjkVarL2));
                    }
                    if (g1w0Var2 != null) {
                        lc00VarB2.add(new ae50(g1w0Var2));
                    }
                    lc00VarB2.add(new ce50(list7));
                } else {
                    if (zI) {
                        lc00VarB2.add(new yd50(bjkVarL2));
                    }
                    lc00VarB2.add(new be50(list6));
                    lc00VarB2.add(new ce50(list7));
                }
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                lf50 lf50VarZ = qxw.z(lf50VarB3);
                do {
                    value2 = p7m0Var.getValue();
                    ((lf50) value2).getClass();
                } while (!p7m0Var.m(value2, lf50VarZ));
                return lc00VarA;
            }
            if (g1w0Var instanceof l0w0) {
                lf50 lf50VarB4 = b();
                wu4Var.getClass();
                lf50VarB4.getClass();
                re50 re50Var4 = lf50VarB4.b;
                pe50 pe50Var5 = lf50VarB4.c;
                if (re50Var4 == null || (bjkVarL = s0x.L(re50Var4.b)) == null) {
                    bjkVarL = pe50Var5.d.f27596a;
                }
                m7h0 m7h0Var7 = pe50Var5.f26835a;
                boolean zI2 = qxw.I(lf50VarB4);
                lc00 lc00VarB3 = kotlin.collections.a.b();
                lc00VarB3.add(m7h0Var7 != null ? new ud50(m7h0Var7) : new ud50(null));
                if (zI2) {
                    lc00VarB3.add(new yd50(bjkVarL));
                }
                lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                lf50 lf50VarZ2 = qxw.z(lf50VarB4);
                do {
                    value = p7m0Var.getValue();
                    ((lf50) value).getClass();
                } while (!p7m0Var.m(value, lf50VarZ2));
                return lc00VarA2;
            }
        }
        t9f.b();
        return null;
    }

    public final lf50 b() {
        iiy iiyVar = c[0];
        return (lf50) this.b.getValue();
    }

    public final void c(List list) {
        System.out.println((Object) ua80.i("XPlatformRouter [", CollectionsKt.b0(list, null, null, null, new b530((Object) this, (byte) 18), 31), "] -> ", CollectionsKt.b0(CollectionsKt.q0(b().f19938a, q3d.k(b().b)), null, "[", "]", new mb50(this, (byte) 3), 25)));
    }

    public final lc00 d(List list) {
        p7m0 p7m0Var;
        Object value;
        lf50 lf50Var;
        list.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            c8d c8dVar = (c8d) obj;
            Pair pairE = e(c8dVar.f3908a, c8dVar.b);
            List list2 = (List) pairE.f46059a;
            boolean zBooleanValue = ((Boolean) pairE.b).booleanValue();
            lc00VarB.addAll(list2);
            if (zBooleanValue) {
                do {
                    p7m0Var = this.b;
                    value = p7m0Var.getValue();
                    lf50Var = (lf50) value;
                    lf50Var.getClass();
                } while (!p7m0Var.m(value, lf50.a(lf50Var, null, null, pe50.a(lf50Var.c, null, null, null, null, null, list.subList(i2, list.size()), 31), 3)));
            } else {
                i = i2;
            }
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        c(list);
        return lc00VarA;
    }

    public final Pair e(w7d w7dVar, g1w0 g1w0Var) {
        p7m0 p7m0Var;
        Object value;
        g(new rw40(this, w7dVar, (byte) 9));
        wu4 wu4Var = this.f21680a;
        boolean z = false;
        if (!((Boolean) wu4Var.f39774a.invoke()).booleanValue() && ((!(g1w0Var instanceof q0w0) || ((q0w0) g1w0Var).f27923a != null) && (w7dVar instanceof v7d))) {
            z = ((v7d) w7dVar).f36918a;
        }
        if (!z) {
            if (!(g1w0Var instanceof n0w0) && !(g1w0Var instanceof o0w0)) {
                return new Pair(a(g1w0Var), Boolean.FALSE);
            }
            List listA = a(g1w0Var);
            return new Pair(listA, Boolean.valueOf(!listA.isEmpty()));
        }
        Pair pairA = wu4Var.a(b(), g1w0Var);
        lf50 lf50Var = (lf50) pairA.f46059a;
        List list = (List) pairA.b;
        do {
            p7m0Var = this.b;
            value = p7m0Var.getValue();
            ((lf50) value).getClass();
        } while (!p7m0Var.m(value, lf50Var));
        return new Pair(list, Boolean.valueOf(!list.isEmpty()));
    }

    public final void g(Function1 function1) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.b;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, function1.invoke(value)));
    }
}

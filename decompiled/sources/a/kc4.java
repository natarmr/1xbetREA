package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public final class kc4 extends i3t0 {
    public static final /* synthetic */ int Y = 0;
    public final nh70 A;
    public final bot B;
    public final ieu C;
    public final z4w0 D;
    public final wxs0 E;
    public final kys0 F;
    public final ali G;
    public final f7u H;
    public final cmt I;
    public final kd4 J;
    public final nou K;
    public final n4u L;
    public final rqt M;
    public final usd N;
    public final drm0 O;
    public final rou P;
    public final atu Q;
    public final sqx R;
    public final jru S;
    public final dmt T;
    public c4m0 U;
    public c4m0 V;
    public c4m0 W;
    public c4m0 X;
    public final vzg0 o;
    public final im4 p;
    public final rc4 q;
    public final gnu r;
    public final mne s;
    public final b8u t;
    public final gxu u;
    public final u8u v;
    public final rpt w;
    public final ctf0 x;
    public final i1w0 y;
    public final cyh z;

    /* JADX WARN: Illegal instructions before constructor call */
    public kc4(vzg0 vzg0Var, im4 im4Var, rc4 rc4Var, gnu gnuVar, mne mneVar, b8u b8uVar, gxu gxuVar, u8u u8uVar, rpt rptVar, ctf0 ctf0Var, i1w0 i1w0Var, cyh cyhVar, nh70 nh70Var, bot botVar, ieu ieuVar, z4w0 z4w0Var, wxs0 wxs0Var, kys0 kys0Var, ali aliVar, f7u f7uVar, cmt cmtVar, kd4 kd4Var, nou nouVar, n4u n4uVar, rqt rqtVar, usd usdVar, drm0 drm0Var, rou rouVar, atu atuVar, ljf0 ljf0Var, sqx sqxVar, m1e m1eVar, pek pekVar, rpt rptVar2, pru pruVar, bzt bztVar, jru jruVar, dmt dmtVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        vs10 vs10Var = mneVar.c;
        super(vzg0Var, new dc0(pruVar, bztVar, rptVar2, pekVar, b8uVar), cvm0.p(vs10Var, mneVar.f22085a), new uc(ctf0Var, (byte) 27));
        this.o = vzg0Var;
        this.p = im4Var;
        this.q = rc4Var;
        this.r = gnuVar;
        this.s = mneVar;
        this.t = b8uVar;
        this.u = gxuVar;
        this.v = u8uVar;
        this.w = rptVar;
        this.x = ctf0Var;
        this.y = i1w0Var;
        this.z = cyhVar;
        this.A = nh70Var;
        this.B = botVar;
        this.C = ieuVar;
        this.D = z4w0Var;
        this.E = wxs0Var;
        this.F = kys0Var;
        this.G = aliVar;
        this.H = f7uVar;
        this.I = cmtVar;
        this.J = kd4Var;
        this.K = nouVar;
        this.L = n4uVar;
        this.M = rqtVar;
        this.N = usdVar;
        this.O = drm0Var;
        this.P = rouVar;
        this.Q = atuVar;
        this.R = sqxVar;
        this.S = jruVar;
        this.T = dmtVar;
        Q();
        yje yjeVar = null;
        i3t0.K(this, null, null, new yb4(this, yjeVar, (byte) 0), 3);
        AuthDataErrorModel authDataErrorModel = ((mb4) D()).l;
        if (authDataErrorModel != null) {
            i3t0.A(this, rc4Var, new mc4(authDataErrorModel.f46752a, authDataErrorModel.b), null, null, 6);
        }
        i3t0.B(this, im4Var, new xl4[]{new ll4(((mb4) D()).m.f4045a), new kl4(((mb4) D()).m.e)});
        i3t0.L(this, new fnq(dtb.z(m1eVar.b(), 1), new qv3(this, yjeVar, (byte) 2), (byte) 4), vs10Var, null, 2);
    }

    public final void M() {
        H(new o33((byte) 14));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable N(zje zjeVar) {
        zb4 zb4Var;
        elt eltVar;
        List list;
        Iterator it;
        Object next;
        qkt qktVar;
        if (zjeVar instanceof zb4) {
            zb4Var = (zb4) zjeVar;
            int i = zb4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zb4Var.l = i - Integer.MIN_VALUE;
            } else {
                zb4Var = new zb4(this, zjeVar);
            }
        } else {
            zb4Var = new zb4(this, zjeVar);
        }
        Object objI = zb4Var.j;
        wne wneVar = wne.f39444a;
        int i2 = zb4Var.l;
        if (i2 == 0) {
            z1x.P(objI);
            zb4Var.l = 1;
            objI = this.C.i(zb4Var);
            if (objI != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objI);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eltVar = zb4Var.i;
            z1x.P(objI);
        }
        list = (List) objI;
        it = list.iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((qkt) next).f28902a != eltVar.e);
        qktVar = (qkt) next;
        if (qktVar == null) {
            return qktVar;
        }
        if (list.size() == 1) {
            return (qkt) CollectionsKt.U(list);
        }
        return null;
        elt eltVar2 = (elt) objI;
        zb4Var.i = eltVar2;
        zb4Var.l = 2;
        Object objV = this.v.v(zb4Var);
        if (objV != wneVar) {
            objI = objV;
            eltVar = eltVar2;
            list = (List) objI;
            it = list.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((qkt) next).f28902a != eltVar.e);
            qktVar = (qkt) next;
            if (qktVar == null) {
                return qktVar;
            }
            if (list.size() == 1) {
                return (qkt) CollectionsKt.U(list);
            }
            return null;
        }
        return wneVar;
    }

    public final void O(AuthDataErrorModel authDataErrorModel) {
        kc4 kc4Var = this;
        p7m0 p7m0Var = kc4Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            oyg0 oyg0Var = kc4Var.f;
            oyg0Var.getClass();
            q7x.F(oyg0Var, authDataErrorModel, "AUTHORIZATION_DATA_ERROR_KEY");
            if (p7m0Var.m(value, mb4.a((mb4) value, false, false, false, null, null, null, 0, false, null, authDataErrorModel, false, 14335))) {
                i3t0.A(kc4Var, kc4Var.q, new mc4(authDataErrorModel.f46752a, authDataErrorModel.b), null, null, 6);
                return;
            }
            kc4Var = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(zje zjeVar) {
        bc4 bc4Var;
        if (zjeVar instanceof bc4) {
            bc4Var = (bc4) zjeVar;
            int i = bc4Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bc4Var.k = i - Integer.MIN_VALUE;
            } else {
                bc4Var = new bc4(this, zjeVar);
            }
        } else {
            bc4Var = new bc4(this, zjeVar);
        }
        Object objA = bc4Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bc4Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            bc4Var.k = 1;
            objA = this.P.a(false, bc4Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        cau0 cau0Var = ((m2c0) objA).e0;
        return Boolean.valueOf(((cau0Var == cau0.c || cau0Var == cau0.j) && ((mb4) D()).m.i) || (cau0Var != cau0.h && ((mb4) D()).m.k));
    }

    public final void Q() {
        Object value;
        d1q0 d1q0Var = this.Q.f1450a.f10528a.c;
        if (d1q0Var == null) {
            d1q0Var = new d1q0("", "");
        }
        String str = d1q0Var.f5322a;
        String str2 = d1q0Var.b;
        str.getClass();
        str2.getClass();
        boolean zContainsKey = ((LinkedHashMap) this.o.b.f38604a).containsKey("KEY_LOGIN");
        yje yjeVar = null;
        mne mneVar = this.s;
        if (zContainsKey) {
            i3t0.K(this, mneVar.b, null, new yb4(this, yjeVar, (byte) 1), 2);
            return;
        }
        if (str.length() <= 0) {
            i3t0.K(this, mneVar.b, null, new hr(this, yjeVar, (byte) 3), 2);
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, mb4.a((mb4) value, false, false, false, new gd4(str), new hd4(str2), null, 0, false, null, null, false, 16335)));
    }

    public final void R() {
        ctf0 ctf0Var = this.x;
        G(new gb4(ctf0Var.b.a(R.string.authorization_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.lose_message, Arrays.copyOf(new Object[0], 0)), false));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        lc00 lc00VarH;
        String strConcat;
        Object value3;
        mb4 mb4Var;
        boolean z;
        AuthDataModel authDataModel;
        Object value4;
        Object value5;
        pa4 pa4Var = (pa4) obj;
        pa4Var.getClass();
        super.x(pa4Var);
        if (pa4Var instanceof ba4) {
            this.D.a(((ba4) pa4Var).f2240a);
            return;
        }
        boolean z2 = pa4Var instanceof t94;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        i1w0 i1w0Var = this.y;
        cmt cmtVar = this.I;
        byte b = 1;
        f7u f7uVar = this.H;
        if (z2) {
            int i = ((t94) pa4Var).f33543a;
            if (i == 48) {
                f7uVar.F(cmtVar.g());
                i1w0Var.d(new sb4(this, b));
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, mb4.a((mb4) value5, false, false, true, null, null, null, 0, false, null, null, false, 16375)));
            f7uVar.G(i, cmtVar.g());
            G(new kb4(i));
            return;
        }
        byte b2 = 0;
        yje yjeVar = null;
        if (pa4Var instanceof x94) {
            i3t0.K(this, null, null, new gc4(this, ((x94) pa4Var).f40492a, yjeVar, b2), 3);
            return;
        }
        if (pa4Var instanceof y94) {
            y94 y94Var = (y94) pa4Var;
            i3t0.K(this, null, null, new hc4(this, y94Var.f42226a, y94Var.b, yjeVar, (byte) 0), 3);
            return;
        }
        if (pa4Var instanceof z94) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, mb4.a((mb4) value4, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
            return;
        }
        byte b3 = 2;
        if (pa4Var instanceof la4) {
            H(new xb4(((la4) pa4Var).f19689a, this, b3));
            return;
        }
        if (pa4Var instanceof ka4) {
            H(new xb4(((ka4) pa4Var).f17946a, this, b2));
            return;
        }
        if (pa4Var instanceof ma4) {
            H(new xb4(((ma4) pa4Var).f21443a, this, b));
            return;
        }
        byte b4 = 4;
        if (pa4Var instanceof ia4) {
            String str = ((ia4) pa4Var).f14418a;
            str.getClass();
            i3t0.K(this, null, new ys3(this, str, b4), new jc4(str, this, null), 1);
            return;
        }
        if (pa4Var instanceof ja4) {
            ghk0 ghk0Var = ((ja4) pa4Var).f16171a;
            String str2 = ghk0Var.d;
            int i2 = ghk0Var.f11305a;
            su4 su4Var = new su4(i2, str2, ghk0Var.b, ghk0Var.c, i2 == 13 ? ((mb4) D()).m.m : ((mb4) D()).m.l);
            String str3 = ghk0Var.d;
            int i3 = ghk0Var.f11305a;
            i3t0.K(this, null, new ys3(this, new AuthDataModel.Social(i3, str3, ghk0Var.b, ghk0Var.c, i3 == 13 ? ((mb4) D()).m.m : ((mb4) D()).m.l), (byte) 5), new za(this, su4Var, yjeVar, (byte) 16), 1);
            return;
        }
        if (pa4Var instanceof oa4) {
            rvs0 rvs0Var = ((oa4) pa4Var).f24912a;
            AuthDataErrorModel authDataErrorModel = ((mb4) D()).l;
            if (authDataErrorModel == null || (authDataModel = authDataErrorModel.b) == null) {
                return;
            }
            i3t0.A(this, this.q, new lc4(rvs0Var, authDataModel), null, null, 6);
            return;
        }
        if (pa4Var instanceof da4) {
            i3t0.A(this, this.q, new nc4(((da4) pa4Var).f5729a), null, null, 6);
            return;
        }
        if (pa4Var.equals(ca4.f3989a)) {
            f7uVar.C(!((mb4) D()).f21489a);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                mb4Var = (mb4) value3;
                oyg0Var.getClass();
                z = !mb4Var.f21489a;
                q7x.F(oyg0Var, Boolean.valueOf(z), "KEY_LOGIN_BY_PHONE");
            } while (!p7m0Var3.m(value3, mb4.a(mb4Var, z, false, false, null, null, null, 0, false, null, null, false, 16382)));
            return;
        }
        if (pa4Var.equals(v94.f37015a)) {
            f7uVar.A();
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            FragmentScreen fragmentScreenB = this.N.b();
            if (fragmentScreenB instanceof DialogScreen) {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
            } else {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (pa4Var.equals(ga4.f10948a)) {
                if (((mb4) D()).f21489a) {
                    String str4 = ((mb4) D()).g.f14564a;
                    String str5 = ((mb4) D()).g.c;
                    String str6 = ((mb4) D()).f.f12852a;
                    this.F.getClass();
                    lc00VarH = kys0.f(str4, str5, str6);
                } else {
                    String str7 = ((mb4) D()).e.f11089a;
                    String str8 = ((mb4) D()).f.f12852a;
                    this.E.getClass();
                    lc00VarH = wxs0.h(str7, str8);
                }
                ListIterator listIterator = lc00VarH.listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator;
                    if (!pawVar2.hasNext()) {
                        break;
                    } else {
                        f7uVar.H((lh4) pawVar2.next());
                    }
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                while (true) {
                    Object value6 = p7m0Var4.getValue();
                    value6.getClass();
                    oyg0Var.getClass();
                    lc00 lc00Var = lc00VarH;
                    if (p7m0Var4.m(value6, mb4.a((mb4) value6, false, false, false, null, null, null, 0, false, lc00Var, null, false, 15871))) {
                        break;
                    } else {
                        lc00VarH = lc00Var;
                    }
                }
                long jA = this.L.a();
                boolean z3 = jA != 0;
                boolean z4 = ((mb4) D()).f21489a;
                if (Intrinsics.d(String.valueOf(jA), ((mb4) D()).e.f11089a) && z3 && !z4) {
                    ctf0 ctf0Var = this.x;
                    G(new gb4(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.login_or_password_error, Arrays.copyOf(new Object[0], 0)), false));
                    return;
                }
                if (((mb4) D()).j.isEmpty()) {
                    mb4 mb4Var2 = (mb4) D();
                    id4 id4Var = mb4Var2.g;
                    boolean z5 = mb4Var2.f21489a;
                    if (z5) {
                        strConcat = id4Var.c;
                        if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                            strConcat = "+".concat(strConcat);
                        }
                    } else {
                        strConcat = "";
                    }
                    String strP = z5 ? twn.p("[^0-9]", StringsKt.u0(id4Var.f14564a).toString(), "") : "";
                    tu4 tu4Var = new tu4(z5 ? kng0.k(strConcat, strP) : mb4Var2.e.f11089a, mb4Var2.f.f12852a, strConcat, strP);
                    AuthDataModel authDataModelA = sc4.a(tu4Var);
                    f7uVar.E(cmtVar.g(), ((mb4) D()).f21489a);
                    i3t0.K(this, null, new tb4(this, authDataModelA, (byte) 1), new za(this, tu4Var, yjeVar, (byte) 15), 1);
                    return;
                }
                return;
            }
            if (pa4Var.equals(aa4.f506a)) {
                c4m0 c4m0Var = this.U;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var5.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value2, mb4.a((mb4) value2, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                return;
            }
            if (pa4Var.equals(ea4.f7449a)) {
                i3t0.K(this, this.s.b, null, new ic4(this, null), 2);
                return;
            }
            if (pa4Var.equals(na4.f23173a)) {
                i3t0.K(this, null, null, new pn(this, yjeVar, (byte) 8), 3);
                return;
            }
            if (!pa4Var.equals(fa4.f9188a)) {
                if (pa4Var.equals(w94.f38759a)) {
                    f7uVar.z();
                    return;
                }
                if (pa4Var.equals(ha4.f12708a)) {
                    p7m0 p7m0Var6 = ocjVar.f25029a;
                    do {
                        value = p7m0Var6.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var6.m(value, mb4.a((mb4) value, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                    return;
                }
                if (pa4Var.equals(u94.f35264a)) {
                    G(fb4.f9239a);
                    return;
                }
                if (pa4Var.equals(q94.f28329a)) {
                    e3c.n(this.V);
                    e3c.n(this.W);
                    e3c.n(this.X);
                    return;
                }
                if (!pa4Var.equals(s94.f31835a)) {
                    if (pa4Var.equals(r94.f30059a)) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                c4m0 c4m0Var2 = this.V;
                im4 im4Var = this.p;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    this.V = i3t0.L(this, new fnq(new fc4(im4Var.b(), (byte) 0), new cc4(this, yjeVar, b), (byte) 4), null, null, 3);
                }
                c4m0 c4m0Var3 = this.W;
                if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                    this.W = i3t0.L(this, new fnq(im4Var.c(), new cm3(this, yjeVar, (byte) 7), (byte) 4), null, null, 3);
                }
                c4m0 c4m0Var4 = this.X;
                if (c4m0Var4 == null || !c4m0Var4.isActive()) {
                    this.X = i3t0.L(this, new fnq(this.q.b(), new cc4(this, yjeVar, b2), (byte) 4), null, null, 3);
                    return;
                }
                return;
            }
            f7uVar.D();
            kd4 kd4Var = this.J;
            i1w0 i1w0Var2 = kd4Var.f18087a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            FragmentScreen fragmentScreenG0 = kd4Var.c.G0(we50.c);
            if (fragmentScreenG0 instanceof DialogScreen) {
                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenG0)));
            } else {
                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenG0)));
            }
            ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayList2, 0);
            while (true) {
                paw pawVar3 = (paw) listIteratorO2;
                if (!pawVar3.hasNext()) {
                    return;
                } else {
                    i1w0Var2.a((oe50) pawVar3.next());
                }
            }
        }
    }
}

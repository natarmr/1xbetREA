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
public final class hk4 extends i3t0 {
    public static final /* synthetic */ int b0 = 0;
    public final bot A;
    public final ieu B;
    public final z4w0 C;
    public final wxs0 D;
    public final kys0 E;
    public final ali F;
    public final f7u G;
    public final cmt H;
    public final nou I;
    public final n4u J;
    public final rqt K;
    public final usd L;
    public final drm0 M;
    public final rou N;
    public final sqx O;
    public final nh70 P;
    public final dpc Q;
    public final zn00 R;
    public final kwd S;
    public final svs0 T;
    public final mi70 U;
    public final x860 V;
    public c4m0 W;
    public c4m0 X;
    public c4m0 Y;
    public c4m0 Z;
    public bby a0;
    public final vzg0 o;
    public final im4 p;
    public final gnu q;
    public final mne r;
    public final gxu s;
    public final u8u t;
    public final rpt u;
    public final ctf0 v;
    public final i1w0 w;
    public final rc4 x;
    public final cyh y;
    public final nh70 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public hk4(rc4 rc4Var, im4 im4Var, dpc dpcVar, epc epcVar, usd usdVar, kwd kwdVar, m1e m1eVar, mne mneVar, cyh cyhVar, ali aliVar, pek pekVar, cmt cmtVar, bot botVar, rpt rptVar, rpt rptVar2, rpt rptVar3, rqt rqtVar, bzt bztVar, n4u n4uVar, n4u n4uVar2, f7u f7uVar, b8u b8uVar, u8u u8uVar, ieu ieuVar, gnu gnuVar, nou nouVar, rou rouVar, pru pruVar, gxu gxuVar, sqx sqxVar, zn00 zn00Var, nh70 nh70Var, nh70 nh70Var2, mi70 mi70Var, ctf0 ctf0Var, vzg0 vzg0Var, s9m0 s9m0Var, drm0 drm0Var, svs0 svs0Var, wxs0 wxs0Var, kys0 kys0Var, i1w0 i1w0Var, z4w0 z4w0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        vs10 vs10Var = mneVar.c;
        super(vzg0Var, new tg4(pruVar, bztVar, n4uVar2, rptVar2, pekVar, b8uVar, epcVar, rptVar3), cvm0.p(vs10Var, mneVar.f22085a), new uc(ctf0Var, (byte) 29));
        this.o = vzg0Var;
        this.p = im4Var;
        this.q = gnuVar;
        this.r = mneVar;
        this.s = gxuVar;
        this.t = u8uVar;
        this.u = rptVar;
        this.v = ctf0Var;
        this.w = i1w0Var;
        this.x = rc4Var;
        this.y = cyhVar;
        this.z = nh70Var;
        this.A = botVar;
        this.B = ieuVar;
        this.C = z4w0Var;
        this.D = wxs0Var;
        this.E = kys0Var;
        this.F = aliVar;
        this.G = f7uVar;
        this.H = cmtVar;
        this.I = nouVar;
        this.J = n4uVar;
        this.K = rqtVar;
        this.L = usdVar;
        this.M = drm0Var;
        this.N = rouVar;
        this.O = sqxVar;
        this.P = nh70Var2;
        this.Q = dpcVar;
        this.R = zn00Var;
        this.S = kwdVar;
        this.T = svs0Var;
        this.U = mi70Var;
        this.V = new x860();
        Q();
        yje yjeVar = null;
        byte b = 0;
        i3t0.K(this, null, null, new bk4(this, yjeVar, b), 3);
        AuthDataErrorModel authDataErrorModel = ((tj4) D()).l;
        if (authDataErrorModel != null) {
            i3t0.A(this, rc4Var, new mc4(authDataErrorModel.f46752a, authDataErrorModel.b), null, null, 6);
        }
        i3t0.B(this, im4Var, new xl4[]{new ll4(((tj4) D()).m.f16604a), new kl4(((tj4) D()).m.e)});
        i3t0.L(this, new fnq(dtb.z(m1eVar.b(), 1), new ak4(this, yjeVar, b), (byte) 4), vs10Var, null, 2);
    }

    public final void M() {
        H(new o33((byte) 18));
    }

    public final void N() {
        i1w0 i1w0Var = this.w;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, m0w0.f20976a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable O(zje zjeVar) {
        ck4 ck4Var;
        elt eltVar;
        List list;
        Iterator it;
        Object next;
        qkt qktVar;
        if (zjeVar instanceof ck4) {
            ck4Var = (ck4) zjeVar;
            int i = ck4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ck4Var.l = i - Integer.MIN_VALUE;
            } else {
                ck4Var = new ck4(this, zjeVar);
            }
        } else {
            ck4Var = new ck4(this, zjeVar);
        }
        Object objI = ck4Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ck4Var.l;
        if (i2 == 0) {
            z1x.P(objI);
            ck4Var.l = 1;
            objI = this.B.i(ck4Var);
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
            eltVar = ck4Var.i;
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
        ck4Var.i = eltVar2;
        ck4Var.l = 2;
        Object objV = this.t.v(ck4Var);
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

    public final void P(AuthDataErrorModel authDataErrorModel) {
        hk4 hk4Var = this;
        p7m0 p7m0Var = hk4Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            oyg0 oyg0Var = hk4Var.f;
            oyg0Var.getClass();
            q7x.F(oyg0Var, authDataErrorModel, "AUTHORIZATION_DATA_ERROR_KEY");
            if (p7m0Var.m(value, tj4.a((tj4) value, false, false, false, null, null, null, 0, false, null, authDataErrorModel, false, 63487))) {
                i3t0.A(hk4Var, hk4Var.x, new mc4(authDataErrorModel.f46752a, authDataErrorModel.b), null, null, 6);
                return;
            }
            hk4Var = this;
        }
    }

    public final void Q() {
        boolean zContainsKey = ((LinkedHashMap) this.o.b.f38604a).containsKey("KEY_LOGIN");
        yje yjeVar = null;
        mne mneVar = this.r;
        if (zContainsKey) {
            i3t0.K(this, mneVar.b, null, new bk4(this, yjeVar, (byte) 1), 2);
        } else {
            i3t0.K(this, mneVar.b, null, new hr(this, yjeVar, (byte) 7), 2);
        }
    }

    public final void R() {
        ctf0 ctf0Var = this.v;
        G(new nj4(ctf0Var.b.a(R.string.authorization_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.lose_message, Arrays.copyOf(new Object[0], 0)), false));
    }

    @Override // a.diu0
    public final void v() {
        this.Q.a();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        lc00 lc00VarH;
        String strConcat;
        AuthDataModel authDataModel;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        ni4 ni4Var = (ni4) obj;
        ni4Var.getClass();
        super.x(ni4Var);
        if (ni4Var.equals(nh4.f23515a)) {
            E();
            return;
        }
        boolean zEquals = ni4Var.equals(ai4.f907a);
        byte b = 1;
        f7u f7uVar = this.G;
        if (zEquals) {
            f7uVar.C(!((tj4) D()).f34034a);
            H(new o33((byte) 17));
            return;
        }
        boolean z = ni4Var instanceof ph4;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        byte b2 = 0;
        cmt cmtVar = this.H;
        i1w0 i1w0Var = this.w;
        if (z) {
            int i = ((ph4) ni4Var).f26978a;
            if (i == 48) {
                f7uVar.F(cmtVar.g());
                i1w0Var.d(new wj4(this, b2));
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, tj4.a((tj4) value4, false, false, true, null, null, null, 0, false, null, null, false, 65527)));
            f7uVar.G(i, cmtVar.g());
            G(new rj4(i));
            return;
        }
        byte b3 = 2;
        yje yjeVar = null;
        if (ni4Var instanceof th4) {
            i3t0.K(this, null, null, new gc4(this, ((th4) ni4Var).f33944a, yjeVar, b3), 3);
            return;
        }
        if (ni4Var instanceof uh4) {
            uh4 uh4Var = (uh4) ni4Var;
            i3t0.K(this, null, null, new hc4(this, uh4Var.f35658a, uh4Var.b, yjeVar, (byte) 2), 3);
            return;
        }
        if (ni4Var.equals(rh4.f30471a)) {
            f7uVar.A();
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            FragmentScreen fragmentScreenB = this.L.b();
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
            if (ni4Var instanceof vh4) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, tj4.a((tj4) value3, false, false, false, null, null, null, 0, false, null, null, false, 65527)));
                return;
            }
            if (ni4Var instanceof ji4) {
                H(new zj4(((ji4) ni4Var).f16557a, this, b2));
                return;
            }
            if (ni4Var instanceof ii4) {
                H(new zj4(((ii4) ni4Var).f14811a, this, b3));
                return;
            }
            if (ni4Var instanceof ki4) {
                H(new zj4(((ki4) ni4Var).f18318a, this, b));
                return;
            }
            if (ni4Var instanceof gi4) {
                String str = ((gi4) ni4Var).f11326a;
                str.getClass();
                i3t0.K(this, null, new ys3(this, str, (byte) 12), new gk4(str, this, null), 1);
                return;
            }
            if (ni4Var instanceof hi4) {
                ghk0 ghk0Var = ((hi4) ni4Var).f13095a;
                String str2 = ghk0Var.d;
                int i2 = ghk0Var.f11305a;
                byte b4 = 13;
                su4 su4Var = new su4(i2, str2, ghk0Var.b, ghk0Var.c, i2 == 13 ? ((tj4) D()).m.n : ((tj4) D()).m.m);
                String str3 = ghk0Var.d;
                int i3 = ghk0Var.f11305a;
                i3t0.K(this, null, new ys3(this, new AuthDataModel.Social(i3, str3, ghk0Var.b, ghk0Var.c, i3 == 13 ? ((tj4) D()).m.n : ((tj4) D()).m.m), b4), new za(this, su4Var, yjeVar, (byte) 21), 1);
                return;
            }
            if (ni4Var.equals(fi4.f9570a)) {
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value2, tj4.a((tj4) value2, false, false, false, null, null, null, 0, false, null, null, false, 65527)));
                return;
            }
            if (ni4Var.equals(qh4.f28720a)) {
                G(mj4.f21876a);
                return;
            }
            if (ni4Var instanceof zh4) {
                this.C.a(((zh4) ni4Var).f44375a);
                return;
            }
            if (ni4Var.equals(yh4.f42619a)) {
                e3c.n(this.W);
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, tj4.a((tj4) value, false, false, false, null, null, null, 0, false, null, null, false, 65527)));
                return;
            }
            if (ni4Var.equals(ci4.f4393a)) {
                i3t0.K(this, this.r.b, null, new hr(this, yjeVar, (byte) 6), 2);
                return;
            }
            if (ni4Var.equals(li4.f20086a)) {
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, o0w0.f24450a)), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else if (ni4Var.equals(di4.f6122a)) {
                f7uVar.D();
                i1w0Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                FragmentScreen fragmentScreenG0 = this.R.G0(we50.c);
                if (fragmentScreenG0 instanceof DialogScreen) {
                    copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenG0)));
                } else {
                    copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenG0)));
                }
                ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO2;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            } else {
                if (ni4Var.equals(sh4.f32192a)) {
                    f7uVar.z();
                    return;
                }
                if (ni4Var instanceof mi4) {
                    rvs0 rvs0Var = ((mi4) ni4Var).f21825a;
                    AuthDataErrorModel authDataErrorModel = ((tj4) D()).l;
                    if (authDataErrorModel == null || (authDataModel = authDataErrorModel.b) == null) {
                        return;
                    }
                    i3t0.A(this, this.x, new lc4(rvs0Var, authDataModel), null, null, 6);
                    return;
                }
                if (ni4Var.equals(ei4.f7839a)) {
                    if (((tj4) D()).f34034a) {
                        String str4 = ((tj4) D()).g.f14564a;
                        String str5 = ((tj4) D()).g.c;
                        String str6 = ((tj4) D()).f.f12852a;
                        this.E.getClass();
                        lc00VarH = kys0.f(str4, str5, str6);
                    } else {
                        String str7 = ((tj4) D()).e.f11089a;
                        String str8 = ((tj4) D()).f.f12852a;
                        this.D.getClass();
                        lc00VarH = wxs0.h(str7, str8);
                    }
                    ListIterator listIterator = lc00VarH.listIterator(0);
                    while (true) {
                        paw pawVar4 = (paw) listIterator;
                        if (!pawVar4.hasNext()) {
                            break;
                        } else {
                            f7uVar.H((lh4) pawVar4.next());
                        }
                    }
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    while (true) {
                        Object value5 = p7m0Var5.getValue();
                        value5.getClass();
                        oyg0Var.getClass();
                        lc00 lc00Var = lc00VarH;
                        if (p7m0Var5.m(value5, tj4.a((tj4) value5, false, false, false, null, null, null, 0, false, lc00Var, null, false, 65023))) {
                            break;
                        } else {
                            lc00VarH = lc00Var;
                        }
                    }
                    long jA = this.J.a();
                    boolean z2 = jA != 0;
                    boolean z3 = ((tj4) D()).f34034a;
                    if (Intrinsics.d(String.valueOf(jA), ((tj4) D()).e.f11089a) && z2 && !z3) {
                        ctf0 ctf0Var = this.v;
                        G(new nj4(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.login_or_password_error, Arrays.copyOf(new Object[0], 0)), false));
                        return;
                    }
                    if (((tj4) D()).j.isEmpty()) {
                        tj4 tj4Var = (tj4) D();
                        id4 id4Var = tj4Var.g;
                        boolean z4 = tj4Var.f34034a;
                        if (z4) {
                            strConcat = id4Var.c;
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                        } else {
                            strConcat = "";
                        }
                        String strP = z4 ? twn.p("[^0-9]", StringsKt.u0(id4Var.f14564a).toString(), "") : "";
                        tu4 tu4Var = new tu4(z4 ? kng0.k(strConcat, strP) : tj4Var.e.f11089a, tj4Var.f.f12852a, strConcat, strP);
                        AuthDataModel authDataModelA = sc4.a(tu4Var);
                        f7uVar.E(cmtVar.g(), ((tj4) D()).f34034a);
                        i3t0.K(this, null, new yj4(this, authDataModelA, (byte) 0), new za(this, tu4Var, yjeVar, (byte) 20), 1);
                        return;
                    }
                    return;
                }
                if (ni4Var instanceof bi4) {
                    i3t0.A(this, this.x, new nc4(((bi4) ni4Var).f2640a), null, null, 6);
                    return;
                }
                if (!ni4Var.equals(wh4.f39148a)) {
                    if (ni4Var.equals(xh4.f40870a)) {
                        this.O.a();
                        return;
                    }
                    if (ni4Var.equals(mh4.f21773a)) {
                        e3c.n(this.X);
                        e3c.n(this.Y);
                        e3c.n(this.Z);
                        return;
                    }
                    if (!ni4Var.equals(oh4.f25248a)) {
                        t9f.b();
                        return;
                    }
                    c4m0 c4m0Var = this.X;
                    byte b5 = 23;
                    im4 im4Var = this.p;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        this.X = i3t0.L(this, new fnq(new fc4(im4Var.b(), (byte) 2), new y32(this, yjeVar, b5), (byte) 4), null, null, 3);
                    }
                    c4m0 c4m0Var2 = this.Y;
                    if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                        this.Y = i3t0.L(this, new fnq(im4Var.c(), new cm3(this, yjeVar, (byte) 10), (byte) 4), null, null, 3);
                    }
                    c4m0 c4m0Var3 = this.Z;
                    if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                        this.Z = i3t0.L(this, new fnq(this.x.b(), new oa(this, yjeVar, b5), (byte) 4), null, null, 3);
                        return;
                    }
                    return;
                }
                if (!((tj4) D()).m.p) {
                    bby bbyVar = this.a0;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        G(qj4.f28819a);
                        this.a0 = i3t0.K(this, null, null, new ch4(b, yjeVar, b), 3);
                        return;
                    } else {
                        e3c.n(this.a0);
                        G(kj4.f18368a);
                        return;
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorP2;
                    if (!pawVar5.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar5.next());
                    }
                }
            }
        }
    }
}

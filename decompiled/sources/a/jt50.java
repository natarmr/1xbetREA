package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jt50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17083a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jt50(Object obj, Object obj2, byte b) {
        this.f17083a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0361  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        long secondary;
        Object value2;
        kuw kuwVar;
        boolean z;
        Object obj3;
        bby bbyVar;
        byte b = this.f17083a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        byte b3 = 3;
        boolean z2 = true;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ct5 ct5Var = (ct5) obj;
                ct5Var.getClass();
                ((xdr) ((v70) obj5).v).F((uo5) obj4, ct5Var, (String) obj2);
                return Unit.f46060a;
            case 1:
                wu50 wu50Var = (wu50) obj5;
                Throwable th = (Throwable) obj4;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (!(th instanceof SocketTimeoutException) && !(th instanceof UnknownHostException) && !(th instanceof ConnectException) && !(th instanceof ProtocolException) && !(th instanceof SSLException)) {
                    wu50Var.P(lb10.b);
                    p7m0 p7m0Var = wu50Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        wu50Var.f.getClass();
                    } while (!p7m0Var.m(value, qu50.a((qu50) value, null, null, null, 0, false, 61)));
                }
                return Unit.f46060a;
            case 2:
                aw50 aw50Var = (aw50) obj5;
                Function1 function1 = (Function1) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i = 0;
                    for (Object obj6 : aw50Var.e) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        vrq0 vrq0Var = (vrq0) obj6;
                        zcl zclVar = qmk.f28987a;
                        jm40 jm40Var = jm40.b;
                        mm40 mm40VarL = s5x0.L(o7k0.e(jm40Var, 48.0f), 8.0f, 0.0f, 2);
                        boolean zG = fetVar.g(function1) | fetVar.e(i);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new re1(function1, i, (byte) 13);
                            fetVar.o0(objP);
                        }
                        mm40 mm40VarW = y860.W(mm40VarL, null, null, false, null, (Function0) objP, 28);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30VarC, gqw0.x);
                        jpm0.o(fetVar, bh90VarM, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, gqw0.v);
                        mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
                        String str = vrq0Var.f37914a;
                        ((g1t0) fetVar.k(j1t0.e)).getClass();
                        y9q0 y9q0VarM = g1t0.m();
                        if (i == aw50Var.g) {
                            fetVar.e0(-1847465567);
                            secondary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-1847363329);
                            secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                            fetVar.r(false);
                        }
                        v8q0.a(str, mm40VarB, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarM, fetVar, 0, 0, 130040);
                        fetVar.r(true);
                        i = i2;
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 3:
                Throwable th2 = (Throwable) obj5;
                kw50 kw50Var = (kw50) obj4;
                Throwable th3 = (Throwable) obj;
                String str2 = (String) obj2;
                th3.getClass();
                str2.getClass();
                if ((th2 instanceof zhi0) && ((kuwVar = ((zhi0) th2).c) == i2o.UnknownError || kuwVar == i2o.PersonalDataRequired || kuwVar == i2o.PersonalDataRequired2 || kuwVar == i2o.PersonalDataRequired3 || kuwVar == i2o.PersonalDataRequired4 || kuwVar == i2o.UnavailableInYourRegion)) {
                    String message = th3.getMessage();
                    if (message != null) {
                        str2 = message;
                    }
                    kw50Var.G(new yv50(str2));
                } else if (!(th2 instanceof SocketTimeoutException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof ConnectException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException)) {
                    kw50Var.T(mk80.b);
                    p7m0 p7m0Var2 = kw50Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        kw50Var.f.getClass();
                    } while (!p7m0Var2.m(value2, zv50.a((zv50) value2, null, null, null, false, null, 0, false, false, false, false, 65531)));
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                q5x.k((xw50) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                s460 s460Var = (s460) obj5;
                p460 p460Var = (p460) obj4;
                x5a x5aVar = (x5a) obj;
                dfv dfvVar = (dfv) obj2;
                e7z e7zVar = s460Var.u;
                if (e7zVar.J()) {
                    s460Var.q1 = x5aVar;
                    s460Var.p1 = dfvVar;
                    h7z.a(e7zVar).getSnapshotObserver().f7752a.d(s460Var, s460.x1, p460Var);
                    s460Var.t1 = false;
                } else {
                    s460Var.t1 = true;
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ucx.s((yf60) obj5, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                wdx.G((pz40) obj5, (xk80) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ufx.i((mm40) obj5, (ql60) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                uvw.f((mm40) obj5, (rl60) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                ohq0.I((id50) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                ohq0.R((ff8) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                w370 w370Var = (w370) obj2;
                ((oyg0) obj).getClass();
                w370Var.getClass();
                return w370.a(w370Var, false, false, null, null, null, tdt.a(w370Var.f, arrayList, null, null, 0, 0, 30), null, false, false, !arrayList2.isEmpty(), false, 15326);
            case 13:
                pat patVar = (pat) obj5;
                pat patVar2 = (pat) obj4;
                w370 w370Var2 = (w370) obj2;
                rc50 rc50Var = w370Var2.d;
                patVar.getClass();
                if (patVar instanceof oat) {
                    z = false;
                } else {
                    patVar2.getClass();
                    if ((patVar2 instanceof oat) || (patVar2 instanceof lat)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                return w370.a(w370Var2, false, false, null, rc50.a(rc50Var, z, false, false, null, 62), null, null, null, false, false, false, false, 16375);
            case 14:
                wwa wwaVar = (wwa) obj5;
                Function1 function2 = (Function1) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwa uwaVar = (uwa) wwaVar;
                    String str3 = uwaVar.f36383a;
                    pz40 pz40Var = s6t0.f31722a;
                    jiq0.j(str3, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), s6t0.b().f33626a.getSecondary(), uwaVar.b, uwaVar.c, fetVar2, 0, 0);
                    jiq0.i0(s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13), uwaVar, function2, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                jiq0.n((su60) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                jiq0.p((tu60) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                vx60 vx60Var = (vx60) obj5;
                Function1 function3 = (Function1) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    jar0.a(0, vx60Var.b(), vx60Var.c(), fetVar3, function3);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                bsr0.B((mm40) obj5, (w170) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                x2x.e((r970) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                b5x.h((rc70) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                kr70 kr70Var = (kr70) obj5;
                mm40 mm40Var = (mm40) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                jh70 jh70Var = kr70.S1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) kr70Var.G0()).y(fetVar4);
                    k3t0 k3t0VarG0 = kr70Var.G0();
                    boolean zI = fetVar4.i(kr70Var);
                    Object objP2 = fetVar4.P();
                    if (zI || objP2 == cl5Var) {
                        gk70 gk70Var = new gk70(1, kr70Var, kr70.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feature/online_call/impl/presentation/model/OnlineCallSideEffect;)V", 0, (byte) 18);
                        fetVar4.o0(gk70Var);
                        objP2 = gk70Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP2), fetVar4);
                    boolean zI2 = fetVar4.i(k3t0VarG0) | fetVar4.i(kr70Var) | fetVar4.e(3) | fetVar4.g(pz40VarF);
                    Object objP3 = fetVar4.P();
                    if (zI2 || objP3 == cl5Var) {
                        p000 p000Var = new p000(k3t0VarG0, kr70Var, pz40VarF, null, (byte) 28);
                        fetVar4.o0(p000Var);
                        objP3 = p000Var;
                    }
                    m0x0.t(fetVar4, kr70Var, (Function2) objP3);
                    boolean zI3 = fetVar4.i(kr70Var);
                    Object objP4 = fetVar4.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new ir70(kr70Var, b2);
                        fetVar4.o0(objP4);
                    }
                    Function0 function0 = (Function0) objP4;
                    boolean zI4 = fetVar4.i(kr70Var);
                    Object objP5 = fetVar4.P();
                    if (zI4 || objP5 == cl5Var) {
                        objP5 = new ir70(kr70Var, b3);
                        fetVar4.o0(objP5);
                    }
                    v3c.A(function0, (Function0) objP5, null, fetVar4, 0, 4);
                    mm40 mm40VarQ = i120.Q(mm40Var, qcc.S(R.attr.uikitBackgroundContent, fetVar4), jd8.n);
                    k3t0 k3t0VarG1 = kr70Var.G0();
                    boolean zI5 = fetVar4.i(k3t0VarG1);
                    Object objP6 = fetVar4.P();
                    if (zI5 || objP6 == cl5Var) {
                        gk70 gk70Var2 = new gk70(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                        fetVar4.o0(gk70Var2);
                        objP6 = gk70Var2;
                    }
                    n7x.e(0, fetVar4, mm40VarQ, pz40VarY, (Function1) ((jhy) objP6));
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 22:
                List list = (List) obj5;
                bv70 bv70Var = (bv70) obj4;
                hu70 hu70Var = (hu70) obj2;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((mr70) next).e) {
                            obj3 = next;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                mr70 mr70Var = (mr70) obj3;
                String str4 = mr70Var != null ? mr70Var.b : "English";
                boolean z3 = list.size() > 1;
                if (hu70Var.h || ((bbyVar = bv70Var.d0) != null && bbyVar.isActive())) {
                    z2 = hu70Var.e;
                }
                return hu70.a(hu70Var, 0, 0, false, false, z2, false, false, false, false, false, null, false, z3, false, str4, false, list, null, false, 1925103);
            case 23:
                ((Integer) obj2).getClass();
                bdx.p((mm40) obj5, (p580) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                idx.h((mm40) obj5, (b480) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                gfx.j((mm40) obj5, (j680) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                vvw.f((mm40) obj5, (k680) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                piz.n((mm40) obj5, (wd80) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                azw.k((mm40) obj5, (yd80) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                q0x.F((mm40) obj5, (cop0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ jt50(Object obj, Object obj2, int i, byte b) {
        this.f17083a = b;
        this.b = obj;
        this.c = obj2;
    }
}

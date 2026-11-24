package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fw6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10243a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ fw6(pk5 pk5Var, Function1 function1, jk5 jk5Var, Function1 function2, Function1 function3, Function0 function0, Function0 function4, xcz xczVar, int i) {
        this.f10243a = (byte) 11;
        this.b = pk5Var;
        this.h = function1;
        this.d = jk5Var;
        this.i = function2;
        this.e = function3;
        this.f = function0;
        this.g = function4;
        this.c = xczVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10243a;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.h;
        Object obj4 = this.i;
        Object obj5 = this.c;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                f1t0.d((mm40) obj10, (ox6) obj9, (qln0) obj8, (hx6) obj7, (i8k0) obj6, (String) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                ry7.c((mm40) obj10, (t33) obj9, (t33) obj8, (t33) obj7, (g960) obj6, (String) obj5, (nrq) obj3, (t33) obj4, (fet) obj, x8x.L(16781889));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                hkb.i((val) obj10, (sek) obj9, (bek) obj8, (z5s) obj7, (amw) obj6, (xex) obj5, (CyberBottomSheetParams) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                bkb.h((whm) obj10, (bzl) obj9, (Function1) obj3, (Function0) obj8, (Function1) obj4, (Function0) obj7, (Function1) obj6, (Function0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                mm40 mm40Var = (mm40) obj10;
                l7m0 l7m0Var = (l7m0) obj9;
                l7m0 l7m0Var2 = (l7m0) obj8;
                xcz xczVar = (xcz) obj7;
                xcz xczVar2 = (xcz) obj6;
                j2s j2sVar = (j2s) obj5;
                Function1 function1 = (Function1) obj3;
                Function0 function0 = (Function0) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                xak xakVar = j2s.b2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n930 n930Var = (n930) l7m0Var.getValue();
                    nek nekVar = j2sVar.P1;
                    if (nekVar == null) {
                        Intrinsics.h("gameVideoFactory");
                        throw null;
                    }
                    xak xakVar2 = j2sVar.Q1;
                    if (xakVar2 == null) {
                        Intrinsics.h("gameZoneFactory");
                        throw null;
                    }
                    boolean zG = fetVar.g(function0) | fetVar.i(j2sVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new f5p(function0, j2sVar, (byte) 29);
                        fetVar.o0(objP);
                    }
                    Function1 function2 = (Function1) objP;
                    boolean zI = fetVar.i(j2sVar);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new g2s(j2sVar, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    Function1 function3 = (Function1) objP2;
                    boolean zI2 = fetVar.i(j2sVar);
                    Object objP3 = fetVar.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new g2s(j2sVar, (byte) 2);
                        fetVar.o0(objP3);
                    }
                    Function1 function4 = (Function1) objP3;
                    boolean zI3 = fetVar.i(j2sVar);
                    Object objP4 = fetVar.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new f2s(j2sVar, (byte) 1);
                        fetVar.o0(objP4);
                    }
                    Function2 function5 = (Function2) objP4;
                    boolean zI4 = fetVar.i(j2sVar);
                    Object objP5 = fetVar.P();
                    if (zI4 || objP5 == cl5Var) {
                        objP5 = new f2s(j2sVar, (byte) 2);
                        fetVar.o0(objP5);
                    }
                    Function2 function6 = (Function2) objP5;
                    boolean zI5 = fetVar.i(j2sVar);
                    Object objP6 = fetVar.P();
                    if (zI5 || objP6 == cl5Var) {
                        objP6 = new g2s(j2sVar, (byte) 3);
                        fetVar.o0(objP6);
                    }
                    Function1 function7 = (Function1) objP6;
                    boolean zI6 = fetVar.i(j2sVar);
                    Object objP7 = fetVar.P();
                    if (zI6 || objP7 == cl5Var) {
                        objP7 = new g2s(j2sVar, (byte) 4);
                        fetVar.o0(objP7);
                    }
                    ohq0.C(mm40Var, n930Var, l7m0Var2, xczVar, xczVar2, nekVar, xakVar2, function1, function2, function3, function4, function5, function6, function7, (Function1) objP7, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                d9x.f((n610) obj10, (sek) obj9, (bek) obj8, (z5s) obj7, (qdz) obj6, (xex) obj5, (CyberBottomSheetParams) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                k9x.f((mm40) obj10, (nom0) obj9, (String) obj5, (l3w) obj8, (so30) obj7, (so30) obj6, (Function0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                ucx.p((gl40) obj10, (sek) obj9, (bek) obj8, (z5s) obj7, (xex) obj6, (CyberBottomSheetParams) obj5, (qdz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                j0x.j((x0e0) obj10, (sek) obj9, (bek) obj8, (z5s) obj7, (qdz) obj6, (xex) obj5, (CyberBottomSheetParams) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ((vrk0) obj9).a((mm40) obj10, (yx5) obj8, (SpecialEventTabScreenParams) obj7, (ebo0) obj6, (Function1) obj3, (Function0) obj5, (xdr) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 10:
                jh5 jh5Var = (jh5) obj10;
                dk5 dk5Var = (dk5) obj9;
                zyn zynVar = (zyn) obj8;
                gy40 gy40Var = (gy40) obj7;
                Function0 function8 = (Function0) obj6;
                pz40 pz40Var = (pz40) obj5;
                w6k w6kVar = (w6k) obj3;
                l7m0 l7m0Var3 = (l7m0) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40.b);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    String str = jh5Var != null ? jh5Var.b : null;
                    if (str == null) {
                        str = "";
                    }
                    Double dValueOf = jh5Var != null ? Double.valueOf(jh5Var.c) : null;
                    String str2 = jh5Var != null ? jh5Var.d : null;
                    String str3 = str2 != null ? str2 : "";
                    boolean zI7 = fetVar2.i(dk5Var);
                    Object objP8 = fetVar2.P();
                    if (zI7 || objP8 == cl5Var) {
                        cym0 cym0Var = new cym0(0, dk5Var, dk5.class, "onBackClick", "onBackClick()V", 0, (byte) 4);
                        fetVar2.o0(cym0Var);
                        objP8 = cym0Var;
                    }
                    ter0.a(null, str, dValueOf, zynVar.f45214a.c.l() == 0.0f, str3, gy40Var, (Function0) ((jhy) objP8), function8, fetVar2, 196608);
                    y0x0.l(u1c.M(1658846268, new vdl0(w6kVar, gy40Var, zynVar, dk5Var, pz40Var, l7m0Var3), fetVar2), ((ycl) pz40Var.getValue()).f42389a, zynVar, fetVar2, 6);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                y0x0.n((pk5) obj10, (Function1) obj3, (jk5) obj9, (Function1) obj4, (Function1) obj8, (Function0) obj7, (Function0) obj6, (xcz) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ycm0.i((z1u0) obj10, (sek) obj9, (bek) obj8, (z5s) obj7, (qdz) obj6, (xex) obj5, (CyberBottomSheetParams) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ fw6(whm whmVar, bzl bzlVar, Function1 function1, Function0 function0, Function1 function2, Function0 function3, Function1 function4, Function0 function5, int i) {
        this.f10243a = (byte) 3;
        this.b = whmVar;
        this.d = bzlVar;
        this.h = function1;
        this.e = function0;
        this.i = function2;
        this.f = function3;
        this.g = function4;
        this.c = function5;
    }

    public /* synthetic */ fw6(mm40 mm40Var, nom0 nom0Var, String str, l3w l3wVar, so30 so30Var, so30 so30Var2, Function0 function0, Function1 function1, int i) {
        this.f10243a = (byte) 6;
        this.b = mm40Var;
        this.d = nom0Var;
        this.c = str;
        this.e = l3wVar;
        this.f = so30Var;
        this.g = so30Var2;
        this.i = function0;
        this.h = function1;
    }

    public /* synthetic */ fw6(mm40 mm40Var, Object obj, Object obj2, Object obj3, Object obj4, String str, Object obj5, Object obj6, int i, byte b) {
        this.f10243a = b;
        this.b = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = str;
        this.h = obj5;
        this.i = obj6;
    }

    public /* synthetic */ fw6(vrk0 vrk0Var, mm40 mm40Var, yx5 yx5Var, SpecialEventTabScreenParams specialEventTabScreenParams, ebo0 ebo0Var, Function1 function1, Function0 function0, xdr xdrVar, int i) {
        this.f10243a = (byte) 9;
        this.d = vrk0Var;
        this.b = mm40Var;
        this.e = yx5Var;
        this.f = specialEventTabScreenParams;
        this.g = ebo0Var;
        this.h = function1;
        this.c = function0;
        this.i = xdrVar;
    }

    public /* synthetic */ fw6(Object obj, sek sekVar, bek bekVar, z5s z5sVar, Object obj2, Object obj3, Object obj4, Function1 function1, int i, byte b) {
        this.f10243a = b;
        this.b = obj;
        this.d = sekVar;
        this.e = bekVar;
        this.f = z5sVar;
        this.g = obj2;
        this.c = obj3;
        this.i = obj4;
        this.h = function1;
    }

    public /* synthetic */ fw6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.f10243a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.c = obj6;
        this.h = obj7;
        this.i = obj8;
    }
}

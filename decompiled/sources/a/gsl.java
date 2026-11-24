package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gsl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f11836a = {new ez40(gsl.class, "fontSize", "getFontSize(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new ez40(gsl.class, "lineCount", "getLineCount(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new ez40(gsl.class, "hasEllipsis", "getHasEllipsis(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)};
    public static final zai0 b = new zai0("FontSize");
    public static final zai0 c = new zai0("LineCount");
    public static final zai0 d = new zai0("Ellipsis");

    public static final void a(mm40 mm40Var, ry1 ry1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i, int i2) {
        Function0 function3;
        int i3;
        Function0 function4;
        int i4;
        Function0 function5;
        int i5;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        Function0 function10;
        Function0 function11;
        Function0 function12;
        ry1Var.getClass();
        fetVar.g0(-12860988);
        int i6 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ry1Var) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | 384;
            function3 = function0;
        } else {
            function3 = function0;
            i3 = i6 | (fetVar.i(function3) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | 3072;
            function4 = function1;
        } else {
            function4 = function1;
            i4 = i3 | (fetVar.i(function4) ? 2048 : 1024);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i5 = i4 | 24576;
            function5 = function2;
        } else {
            function5 = function2;
            i5 = i4 | (fetVar.i(function5) ? 16384 : 8192);
        }
        if (fetVar.U(i5 & 1, (i5 & 9363) != 9362)) {
            cl5 cl5Var = ukd.f35823a;
            if (i7 != 0) {
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new knl((byte) 12);
                    fetVar.o0(objP);
                }
                function9 = (Function0) objP;
            } else {
                function9 = function3;
            }
            if (i8 != 0) {
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new knl((byte) 13);
                    fetVar.o0(objP2);
                }
                function10 = (Function0) objP2;
            } else {
                function10 = function4;
            }
            if (i9 != 0) {
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = new knl((byte) 14);
                    fetVar.o0(objP3);
                }
                function11 = (Function0) objP3;
            } else {
                function11 = function5;
            }
            if (ry1Var instanceof qy1) {
                fetVar.e0(-889267595);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 320.0f), 360.0f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, false);
                function12 = function10;
            } else {
                if (!(ry1Var instanceof py1)) {
                    throw b1j.f(525502925, fetVar, false);
                }
                fetVar.e0(-888843670);
                py1 py1Var = (py1) ry1Var;
                ky1 ky1Var = py1Var.f27784a;
                if (Intrinsics.d(ky1Var, hy1.f13840a)) {
                    fetVar.e0(-888795651);
                    function12 = function10;
                    ieb.n(o2e.e0(mm40Var, "TOURNAMENTS_CARDS_NATIVE_PRIZE_STYLE"), py1Var, function9, function12, function11, fetVar, i5 & 65520);
                    fetVar.r(false);
                } else {
                    function12 = function10;
                    if (Intrinsics.d(ky1Var, iy1.f15567a)) {
                        fetVar.e0(-888307649);
                        jeb.p(o2e.e0(mm40Var, "TOURNAMENTS_CARDS_NATIVE_TAGS_STYLE"), py1Var, function9, function12, function11, fetVar, i5 & 65520);
                        fetVar.r(false);
                    } else if (Intrinsics.d(ky1Var, gy1.f12104a)) {
                        fetVar.e0(-887820515);
                        feb.l(o2e.e0(mm40Var, "TOURNAMENTS_CARDS_NATIVE_DATES_STYLE"), py1Var, function9, function12, function11, fetVar, i5 & 65520);
                        fetVar.r(false);
                    } else if (Intrinsics.d(ky1Var, jy1.f17337a)) {
                        fetVar.e0(-887331490);
                        bfb.n(o2e.e0(mm40Var, "TOURNAMENTS_CARDS_NATIVE_TIMER_STYLE"), py1Var, function9, function12, function11, fetVar, i5 & 65520);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-886917826);
                        fetVar.r(false);
                    }
                }
                fetVar.r(false);
            }
            function8 = function9;
            function6 = function12;
            function7 = function11;
        } else {
            fetVar.X();
            function6 = function4;
            function7 = function5;
            function8 = function3;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja((byte) 3, i, i2, function7, mm40Var, ry1Var, function8, function6);
        }
    }

    public static final void b(abi0 abi0Var, float f) {
        iiy iiyVar = f11836a[0];
        Float fValueOf = Float.valueOf(f);
        zai0 zai0Var = b;
        zai0Var.getClass();
        abi0Var.b(zai0Var, fValueOf);
    }

    public static final void c(abi0 abi0Var, int i) {
        iiy iiyVar = f11836a[1];
        Integer numValueOf = Integer.valueOf(i);
        zai0 zai0Var = c;
        zai0Var.getClass();
        abi0Var.b(zai0Var, numValueOf);
    }
}

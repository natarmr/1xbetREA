package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.hardware.camera2.params.OutputConfiguration;
import android.javax.sip.message.Response;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j2e {
    public static final kg40 A;
    public static final kg40 B;
    public static final kg40 C;
    public static final kg40 D;
    public static final kg40 E;
    public static final kg40 F;
    public static final kg40 G;
    public static final kg40 H;
    public static final kg40 I;
    public static final kg40 J;
    public static final kg40 K;
    public static final kg40 L;
    public static final kg40 M;
    public static final kg40 N;
    public static final kg40 O;
    public static final kg40 P;
    public static final kg40 Q;
    public static final lg40 R;
    public static final lg40 S;
    public static final lg40 T;
    public static final lg40 U;
    public static final lg40 V;
    public static final lg40 W;
    public static final lg40 X;
    public static final lg40 Y;
    public static final kg40 g;
    public static final kg40 h;
    public static final lg40 i;
    public static final lg40 j;
    public static final lg40 k;
    public static final lg40 l;
    public static final lg40 m;
    public static final lg40 n;
    public static final lg40 o;
    public static final kg40 p;
    public static final kg40 q;
    public static final kg40 r;
    public static final kg40 s;
    public static final kg40 t;
    public static final kg40 u;
    public static final kg40 v;
    public static final kg40 w;
    public static final kg40 x;
    public static final kg40 y;
    public static final kg40 z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f15775a = new ugd(1946091142, false, new wgd(27));
    public static final ugd b = new ugd(-2028386823, false, new ehd(3));
    public static final ugd c = new ugd(1616866766, false, new jhd(6));
    public static final ugd d = new ugd(519733527, false, new ihd(13));
    public static final ugd e = new ugd(-1722401024, false, new lhd(21));
    public static final ugd f = new ugd(1975365971, false, new lhd(22));
    public static final ugi0[] Z = new ugi0[0];
    public static final Object a0 = new Object();

    static {
        int i2 = 2;
        g = new kg40(1, i2, (byte) 10);
        int i3 = 3;
        h = new kg40(i2, i3, (byte) 21);
        int i4 = 4;
        i = new lg40(i3, i4, (byte) 2);
        int i5 = 5;
        j = new lg40(i4, i5, (byte) 9);
        int i6 = 6;
        k = new lg40(i5, i6, (byte) 10);
        int i7 = 7;
        l = new lg40(i6, i7, (byte) 11);
        int i8 = 8;
        m = new lg40(i7, i8, (byte) 12);
        int i9 = 9;
        n = new lg40(i8, i9, (byte) 13);
        int i10 = 10;
        o = new lg40(i9, i10, (byte) 14);
        int i11 = 11;
        p = new kg40(i10, i11, (byte) 0);
        int i12 = 12;
        q = new kg40(i11, i12, (byte) 1);
        int i13 = 13;
        r = new kg40(i12, i13, (byte) 2);
        int i14 = 14;
        s = new kg40(i13, i14, (byte) 3);
        int i15 = 15;
        t = new kg40(i14, i15, (byte) 4);
        int i16 = 16;
        u = new kg40(i15, i16, (byte) 5);
        int i17 = 17;
        v = new kg40(i16, i17, (byte) 6);
        int i18 = 18;
        w = new kg40(i17, i18, (byte) 7);
        int i19 = 19;
        x = new kg40(i18, i19, (byte) 8);
        int i20 = 20;
        y = new kg40(i19, i20, (byte) 9);
        int i21 = 21;
        z = new kg40(i20, i21, (byte) 11);
        int i22 = 22;
        A = new kg40(i21, i22, (byte) 12);
        int i23 = 23;
        B = new kg40(i22, i23, (byte) 13);
        int i24 = 24;
        C = new kg40(i23, i24, (byte) 14);
        int i25 = 25;
        D = new kg40(i24, i25, (byte) 15);
        int i26 = 26;
        E = new kg40(i25, i26, (byte) 16);
        int i27 = 27;
        F = new kg40(i26, i27, (byte) 17);
        int i28 = 28;
        G = new kg40(i27, i28, (byte) 18);
        int i29 = 29;
        H = new kg40(i28, i29, (byte) 19);
        int i30 = 30;
        I = new kg40(i29, i30, (byte) 20);
        int i31 = 31;
        J = new kg40(i30, i31, (byte) 22);
        int i32 = 32;
        K = new kg40(i31, i32, (byte) 23);
        int i33 = 33;
        L = new kg40(i32, i33, (byte) 24);
        int i34 = 34;
        M = new kg40(i33, i34, (byte) 25);
        int i35 = 35;
        N = new kg40(i34, i35, (byte) 26);
        int i36 = 36;
        O = new kg40(i35, i36, (byte) 27);
        int i37 = 37;
        P = new kg40(i36, i37, (byte) 28);
        int i38 = 38;
        Q = new kg40(i37, i38, (byte) 29);
        int i39 = 39;
        R = new lg40(i38, i39, (byte) 0);
        int i40 = 40;
        S = new lg40(i39, i40, (byte) 1);
        int i41 = 41;
        T = new lg40(i40, i41, (byte) 3);
        int i42 = 42;
        U = new lg40(i41, i42, (byte) 4);
        int i43 = 43;
        V = new lg40(i42, i43, (byte) 5);
        int i44 = 44;
        W = new lg40(i43, i44, (byte) 6);
        int i45 = 45;
        X = new lg40(i44, i45, (byte) 7);
        Y = new lg40(i45, 46, (byte) 8);
    }

    public static final void A(a4x a4xVar, fet fetVar, int i2) {
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        xx7 xx7Var;
        vtu0 vtu0Var;
        pcy pcyVar;
        jm40 jm40Var;
        long j2;
        boolean z2;
        fet fetVar2 = fetVar;
        shd shdVar4 = gqw0.v;
        shd shdVar5 = gqw0.y;
        shd shdVar6 = gqw0.w;
        shd shdVar7 = gqw0.x;
        xx7 xx7Var2 = gqw0.m;
        fetVar2.g0(1488588097);
        int i3 = i2 | (fetVar2.g(a4xVar) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            y9q0 y9q0VarI = g1t0.i();
            y9q0 y9q0VarN = g1t0.n();
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 12.0f, 16.0f, 12.0f, 24.0f);
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4(b2)), xx7Var2, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            long j3 = textPrimary;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar7);
            jpm0.o(fetVar2, bh90VarM, shdVar6);
            vqd.u(iHashCode, fetVar2, shdVar5, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, shdVar4, -115030468, a4xVar);
            while (itO.hasNext()) {
                vtu0 vtu0Var2 = (vtu0) itO.next();
                zcl zclVar2 = qmk.f28987a;
                x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4(b2)), xx7Var2, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var2);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar2);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, shdVar7);
                jpm0.o(fetVar2, bh90VarM2, shdVar6);
                vqd.u(iHashCode2, fetVar2, shdVar5, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                if (vtu0Var2.f38025a.length() > 0) {
                    fetVar2.e0(-472550099);
                    pcyVar = pcyVar2;
                    long j4 = j3;
                    shdVar2 = shdVar5;
                    shdVar = shdVar4;
                    xx7Var = xx7Var2;
                    jm40Var = jm40Var2;
                    z2 = false;
                    vtu0Var = vtu0Var2;
                    shdVar3 = shdVar7;
                    v8q0.a(vtu0Var2.f38025a, null, j4, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarI, fetVar, 0, 0, 131066);
                    j2 = j4;
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    shdVar = shdVar4;
                    shdVar2 = shdVar5;
                    shdVar3 = shdVar7;
                    xx7Var = xx7Var2;
                    vtu0Var = vtu0Var2;
                    pcyVar = pcyVar2;
                    jm40Var = jm40Var2;
                    j2 = j3;
                    z2 = false;
                    fetVar2.e0(-472377522);
                    fetVar2.r(false);
                }
                fetVar2.e0(677500283);
                Iterator<E> it = vtu0Var.b.iterator();
                while (it.hasNext()) {
                    fet fetVar3 = fetVar2;
                    v8q0.a((String) it.next(), o2e.e0(jm40Var, "RULES_TEXT"), secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarN, fetVar3, 48, 0, 131064);
                    fetVar2 = fetVar3;
                }
                fetVar2.r(z2);
                fetVar2.r(true);
                shdVar7 = shdVar3;
                b2 = b2;
                pcyVar2 = pcyVar;
                y9q0VarI = y9q0VarI;
                shdVar6 = shdVar6;
                shdVar5 = shdVar2;
                shdVar4 = shdVar;
                xx7Var2 = xx7Var;
                jm40Var2 = jm40Var;
                j3 = j2;
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i2, (byte) 29);
        }
    }

    public static final void B(stu0 stu0Var, rah0 rah0Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-131071394);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(stu0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(rah0Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarA0 = wha0.a0(s5x0.L(o7k0.c, xfn.a(fetVar).c, 0.0f, 2), rah0Var, false, 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarI = s5x0.I(mm40VarA0, knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            A(stu0Var.d, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) stu0Var, (Object) rah0Var, i2, (byte) 17);
        }
    }

    public static final void C(int i2, fet fetVar, a4x a4xVar, Function0 function0, Function1 function1) {
        fetVar.g0(-162059351);
        int i3 = (fetVar.g(a4xVar) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            long j2 = y3d.g;
            zcl zclVar = qmk.f28987a;
            xvw.b(s5x0.L(i120.Q(jm40.b, j2, vgg0.c(0.0f, 0.0f, 24.0f, 24.0f, 3)), qmk.a(fetVar).d, 0.0f, 2), a4xVar, function0, function1, fetVar, (i3 << 3) & 8176);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pbg(a4xVar, function0, function1, i2, (byte) 1);
        }
    }

    public static final void D(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        boolean z2;
        jm40 jm40Var;
        boolean z3;
        boolean z4;
        Object obj;
        Function1 function2 = function1;
        zx7 zx7Var = gqw0.e;
        zx7 zx7Var2 = gqw0.f11754a;
        l7m0Var.getClass();
        function2.getClass();
        fetVar.g0(-1180322422);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            v0q0 v0q0Var = (v0q0) l7m0Var.getValue();
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            int i4 = i3 & 896;
            y(null, v0q0Var, function2, fetVar, i4);
            if (v0q0Var != null) {
                boolean z6 = v0q0Var instanceof r0q0;
                jm40 jm40Var2 = jm40.b;
                if (z6) {
                    fetVar.e0(-739517531);
                    qsm0.j((r0q0) v0q0Var, fetVar, 6);
                    fetVar.r(false);
                    jm40Var = jm40Var2;
                    z3 = true;
                } else {
                    boolean z7 = v0q0Var instanceof s0q0;
                    jr8 jr8Var = jr8.f16991a;
                    if (z7) {
                        fetVar.e0(1361625161);
                        mm40 mm40VarD = o7k0.d(new x7z(1.0f, true), 1.0f);
                        tj30 tj30VarC = zq8.c(zx7Var2, false);
                        int iHashCode2 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM2 = fetVar.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30VarC, shdVar);
                        jpm0.o(fetVar, bh90VarM2, shdVar2);
                        vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                        jpm0.o(fetVar, mm40VarC1, shdVar4);
                        jm40Var = jm40Var2;
                        jcb.l(jr8Var.b(jm40Var2, zx7Var), ((s0q0) v0q0Var).f31421a, false, null, fetVar, 0, 12);
                        z3 = true;
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        jm40Var = jm40Var2;
                        z3 = true;
                        if (v0q0Var instanceof t0q0) {
                            fetVar.e0(1361638967);
                            mm40 mm40VarD2 = o7k0.d(new x7z(1.0f, true), 1.0f);
                            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                            int iHashCode3 = Long.hashCode(fetVar.T);
                            bh90 bh90VarM3 = fetVar.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD2);
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(pcyVar);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, tj30VarC2, shdVar);
                            jpm0.o(fetVar, bh90VarM3, shdVar2);
                            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                            jpm0.o(fetVar, mm40VarC2, shdVar4);
                            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
                            mdm mdmVar = ((t0q0) v0q0Var).f33132a;
                            boolean z8 = i4 == 256;
                            Object objP = fetVar.P();
                            if (z8 || objP == ukd.f35823a) {
                                function2 = function1;
                                z4 = false;
                                o0q0 o0q0Var = new o0q0(function2, false ? 1 : 0);
                                fetVar.o0(o0q0Var);
                                obj = o0q0Var;
                            } else {
                                function2 = function1;
                                z4 = false;
                                obj = objP;
                            }
                            jcb.l(mm40VarB, mdmVar, false, (Function0) obj, fetVar, 0, 4);
                            z3 = true;
                            fetVar.r(true);
                            fetVar.r(z4);
                        } else {
                            z2 = false;
                            if (v0q0Var instanceof u0q0) {
                                fetVar.e0(-738236797);
                                x2x.s(6, fetVar, o7k0.d(jm40Var, 1.0f));
                                fetVar.r(false);
                            }
                        }
                    }
                }
                fetVar.r(z3);
                mm40Var2 = jm40Var;
            } else {
                z2 = false;
            }
            throw b1j.f(1361617205, fetVar, z2);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var2, l7m0Var, function2, i2, (byte) 12);
        }
    }

    public static final void E(mm40 mm40Var, rkl rklVar, fet fetVar, int i2) {
        int i3;
        boolean z2;
        String str;
        float f2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1957625160);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(rklVar) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            qc0 qc0Var = rklVar.b;
            String str2 = rklVar.e;
            int iOrdinal = qc0Var.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0) {
                fetVar2.e0(1028882078);
                mm40 mm40VarA = o7k0.A(jm40Var, null, 3);
                zcl zclVar = qmk.f28987a;
                j6n.h(rklVar.e, dqo0.f6527a, s5x0.N(mm40VarA, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0, 0, fetVar2, 48, 24);
                long j2 = qmk.r;
                long j3 = qmk.u;
                v8q0.a(rklVar.d, null, jM123getWhite0d7_KjU, new n05(j2, j3, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j3, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 110578);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else if (iOrdinal == 1) {
                fetVar2.e0(1029728905);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                long j4 = qmk.p;
                long j5 = qmk.q;
                long j6 = qmk.n;
                v8q0.a(rklVar.e, mm40VarN, jM123getWhite0d7_KjU, new n05(j4, j5, j6), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110576);
                v8q0.a(rklVar.d, null, jM123getWhite0d7_KjU, new n05(qmk.r, qmk.u, j6), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 110578);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw b1j.f(-382450961, fetVar2, false);
                }
                fetVar2.e0(1030887995);
                if (rklVar.c.length() > 0) {
                    fetVar2.e0(1030940540);
                    if (str2.length() > 0) {
                        zcl zclVar3 = qmk.f28987a;
                        f2 = 8.0f;
                    } else {
                        zcl zclVar4 = qmk.f28987a;
                        f2 = 0.0f;
                    }
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f2, 7);
                    long j7 = qmk.r;
                    long j8 = qmk.u;
                    str = str2;
                    z2 = false;
                    v8q0.a(rklVar.c, mm40VarN2, jM123getWhite0d7_KjU, new n05(j7, j8, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j8, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 110576);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    z2 = false;
                    str = str2;
                    fetVar2.e0(1031623408);
                    fetVar2.r(false);
                }
                if (str.length() > 0) {
                    fetVar2.e0(1031714424);
                    long j9 = qmk.p;
                    long j10 = qmk.q;
                    v8q0.a(rklVar.e, null, jM123getWhite0d7_KjU, new n05(j9, j10, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j10, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110578);
                    fetVar2 = fetVar;
                    fetVar2.r(z2);
                } else {
                    fetVar2.e0(1032247376);
                    fetVar2.r(z2);
                }
                fetVar2.r(z2);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, rklVar, i2, (byte) 29);
        }
    }

    public static final void F(mm40 mm40Var, stu0 stu0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        stu0Var.getClass();
        function1.getClass();
        fetVar.g0(-1352188805);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(stu0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new o1u0((byte) 20);
                fetVar.o0(objP);
            }
            dmg0 dmg0Var = (dmg0) e9x.R(objArr, dmg0.e, (Function0) objP, fetVar, 384);
            rah0 rah0VarT = wha0.T(fetVar);
            boolean zG = fetVar.g(rah0VarT);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new pdb(rah0VarT, (byte) 5);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            dmg0Var.getClass();
            function0.getClass();
            dmg0Var.c = function0;
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarV = cjx.V(s5x0.N(mm40VarE, 0.0f, 8.0f, 0.0f, 0.0f, 13), dmg0Var.d, null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i4 = (i3 >> 3) & 14;
            m(stu0Var, rah0VarT, dmg0Var, fetVar, i4);
            fyl fylVar = stu0Var.c;
            boolean z2 = (i3 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new sbt0(function1, (byte) 28);
                fetVar.o0(objP3);
            }
            ebc.r(null, fylVar, null, (Function1) objP3, null, fetVar, 0, 45);
            B(stu0Var, rah0VarT, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, stu0Var, function1, i2, (byte) 24);
        }
    }

    public static final Bitmap G(vz2 vz2Var) {
        if (vz2Var instanceof vz2) {
            return vz2Var.f38278a;
        }
        v4i0.p("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final te80 H(tz9 tz9Var, lrm0 lrm0Var, Map map) {
        LinkedHashMap linkedHashMap;
        Object obj;
        c1x c1xVar;
        f3a f3aVarA;
        String str = tz9Var.f34794a;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        jo20 jo20Var = lrm0Var.e;
        LinkedHashMap linkedHashMap5 = lrm0Var.d;
        Iterator it = ((ko20) jo20Var.entrySet()).iterator();
        do {
            int i2 = 1;
            te80 te80Var = null;
            if (!it.hasNext()) {
                for (f3a f3aVar : lrm0Var.g) {
                    ArrayList<krm0> arrayList2 = f3aVar.b;
                    int i3 = f3aVar.f8851a;
                    if (arrayList2.size() == i2) {
                        Surface surface = (Surface) map.get(new mrm0(i3));
                        if (surface != null) {
                            linkedHashMap3.put(new xe80(((krm0) CollectionsKt.v0(arrayList2)).f18773a), surface);
                        }
                    } else {
                        for (krm0 krm0Var : arrayList2) {
                            Object obj2 = linkedHashMap5.get(krm0Var);
                            te80Var = te80Var;
                            if (obj2 == null) {
                                jf4.n("Required value was null.");
                                return te80Var;
                            }
                            OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap4.get((jrm0) obj2);
                            Surface surface2 = outputConfiguration != null ? outputConfiguration.getSurface() : (Surface) map.get(new mrm0(i3));
                            if (surface2 != null) {
                                linkedHashMap3.put(new xe80(krm0Var.f18773a), surface2);
                                i2 = 1;
                            }
                        }
                    }
                }
                te80 te80Var2 = te80Var;
                Iterator it2 = lrm0Var.c.iterator();
                Object obj3 = te80Var2;
                while (it2.hasNext()) {
                    jrm0 jrm0Var = (jrm0) it2.next();
                    ArrayList arrayList3 = jrm0Var.l;
                    ArrayList arrayList4 = jrm0Var.l;
                    List list = jrm0Var.k;
                    m2a m2aVar = jrm0Var.f;
                    Integer num = jrm0Var.e;
                    it2 = it2;
                    String str2 = jrm0Var.d;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        List list2 = list;
                        m2a m2aVar2 = m2aVar;
                        Surface surface3 = (Surface) map.get(new mrm0(((f3a) it3.next()).f8851a));
                        if (surface3 != null) {
                            arrayList5.add(surface3);
                        }
                        m2aVar = m2aVar2;
                        list = list2;
                    }
                    List list3 = list;
                    m2a m2aVar3 = m2aVar;
                    OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap4.get(jrm0Var);
                    linkedHashMap4 = linkedHashMap4;
                    if (outputConfiguration2 == null) {
                        if (m2aVar3 != null) {
                            linkedHashMap = linkedHashMap3;
                            obj = obj3;
                            if (arrayList5.size() != arrayList3.size()) {
                                o03 o03VarF = gfk0.f(null, null, m2aVar3, jrm0Var.g, jrm0Var.h, jrm0Var.i, list3, jrm0Var.b, arrayList4.size() > 1, num != null ? num.intValue() : -1, !Intrinsics.d(str2, str) ? str2 : te80Var2, 2);
                                if (o03VarF == null) {
                                    Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + jrm0Var);
                                } else {
                                    arrayList.add(o03VarF);
                                    Iterator it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        linkedHashMap2.put(new mrm0(((f3a) it4.next()).f8851a), o03VarF);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap3;
                            obj = obj3;
                        }
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj4 : arrayList3) {
                                if (!map.containsKey(new mrm0(((f3a) obj4).f8851a))) {
                                    arrayList6.add(obj4);
                                }
                            }
                            c99.o("Surfaces are not yet available for ", jrm0Var, "! Missing surfaces for ", arrayList6, 33);
                            return te80Var2;
                        }
                        o03 o03VarF2 = gfk0.f((Surface) CollectionsKt.U(arrayList5), null, null, jrm0Var.g, jrm0Var.h, jrm0Var.i, list3, jrm0Var.b, arrayList4.size() > 1, num != null ? num.intValue() : -1, !Intrinsics.d(str2, str) ? str2 : te80Var2, 6);
                        if (o03VarF2 == null) {
                            Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + jrm0Var);
                        } else {
                            Iterator it5 = CollectionsKt.O(arrayList5, 1).iterator();
                            while (it5.hasNext()) {
                                o03VarF2.a((Surface) it5.next());
                            }
                            e3a e3aVar = tz9Var.e;
                            if (e3aVar != null) {
                                f3a f3aVar2 = (f3a) lrm0Var.b.get(e3aVar);
                                if (f3aVar2 == null) {
                                    jf4.n("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                    return te80Var2;
                                }
                                if (obj == null && arrayList3.contains(f3aVar2)) {
                                    obj3 = o03VarF2;
                                    linkedHashMap3 = linkedHashMap;
                                } else {
                                    arrayList.add(o03VarF2);
                                }
                            } else {
                                arrayList.add(o03VarF2);
                            }
                            linkedHashMap3 = linkedHashMap;
                            obj3 = obj;
                        }
                    } else {
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj5 : arrayList3) {
                                if (!map.containsKey(new mrm0(((f3a) obj5).f8851a))) {
                                    arrayList7.add(obj5);
                                }
                            }
                            c99.o("Surfaces are not yet available for ", jrm0Var, "! Missing surfaces for ", arrayList7, 33);
                            return te80Var2;
                        }
                        arrayList.add(new o03(outputConfiguration2));
                        linkedHashMap = linkedHashMap3;
                        obj = obj3;
                    }
                    linkedHashMap3 = linkedHashMap;
                    obj3 = obj;
                }
                return new te80(arrayList, linkedHashMap2, obj3, linkedHashMap3);
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i4 = ((mrm0) entry.getKey()).f22281a;
            c1xVar = (c1x) entry.getValue();
            f3aVarA = lrm0Var.a(i4);
            if (f3aVarA == null) {
                jf4.n("Required value was null.");
                return null;
            }
        } while (f3aVarA.b.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            jf4.o("Cannot configure multiple outputs pre-S!");
            return null;
        }
        sre0.f32672a.b(n03.class);
        c1xVar.getClass();
        throw null;
    }

    public static final jo20 I(Map map, lrm0 lrm0Var) {
        jo20 jo20Var = new jo20();
        for (f3a f3aVar : lrm0Var.g) {
            Surface surface = (Surface) map.get(new mrm0(f3aVar.f8851a));
            if (surface != null) {
                Iterator it = f3aVar.b.iterator();
                while (it.hasNext()) {
                    jo20Var.put(new xe80(((krm0) it.next()).f18773a), surface);
                }
            }
        }
        return jo20Var.b();
    }

    public static final Set J(ugi0 ugi0Var) {
        ugi0Var.getClass();
        if (ugi0Var instanceof vj9) {
            return ((vj9) ugi0Var).a();
        }
        HashSet hashSet = new HashSet(ugi0Var.d());
        int iD = ugi0Var.d();
        for (int i2 = 0; i2 < iD; i2++) {
            hashSet.add(ugi0Var.e(i2));
        }
        return hashSet;
    }

    public static final mm40 K(mm40 mm40Var, zo0 zo0Var) {
        int iOrdinal = zo0Var.c.ordinal();
        mm40 mm40VarQ = jm40.b;
        if (iOrdinal == 0) {
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
            pz40 pz40Var = s6t0.f31722a;
            mm40VarQ = i120.Q(mm40VarQ, s6t0.b().f33626a.getBackgroundContent(), ugg0VarC);
        } else if (iOrdinal == 1) {
            zcl zclVar2 = qmk.f28987a;
            ugg0 ugg0VarC2 = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
            pz40 pz40Var2 = s6t0.f31722a;
            mm40VarQ = i120.Q(mm40VarQ, s6t0.b().f33626a.getBackgroundContent(), ugg0VarC2);
        } else if (iOrdinal == 2) {
            pz40 pz40Var3 = s6t0.f31722a;
            mm40VarQ = i120.Q(mm40VarQ, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
        } else if (iOrdinal == 3) {
            zcl zclVar3 = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(16.0f);
            pz40 pz40Var4 = s6t0.f31722a;
            mm40VarQ = i120.Q(mm40VarQ, s6t0.b().f33626a.getBackgroundContent(), ugg0VarA);
        } else if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        return s5x0.I(s5x0.I(mm40Var, zo0Var.b).e(mm40VarQ), zo0Var.f44696a);
    }

    public static final Object L(gnk0 gnk0Var, int i2) {
        Object obj;
        gnk0Var.getClass();
        int iX = jd8.X(gnk0Var.c, i2, gnk0Var.f11593a);
        if (iX < 0 || (obj = gnk0Var.b[iX]) == a0) {
            return null;
        }
        return obj;
    }

    public static final ugi0[] M(List list) {
        ugi0[] ugi0VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (ugi0VarArr = (ugi0[]) list.toArray(new ugi0[0])) == null) ? Z : ugi0VarArr;
    }

    public static final String N(y1w y1wVar, ctf0 ctf0Var) {
        y1wVar.getClass();
        ctf0Var.getClass();
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        long j2 = y1wVar.l;
        return rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
    }

    public static final String O(y1w y1wVar, boolean z2) {
        if (cy7.c() && z2) {
            return "";
        }
        String str = y1wVar.p;
        String str2 = y1wVar.j;
        String str3 = y1wVar.c;
        if (str.length() > 0) {
            return y1wVar.p;
        }
        if (str3.length() == 0) {
            return str2;
        }
        return str2.length() == 0 ? str3 : kng0.l(str3, Separators.RETURN, str2);
    }

    public static final sgy P(kiy kiyVar) {
        kiyVar.getClass();
        fhy fhyVarO = kiyVar.o();
        if (fhyVarO instanceof sgy) {
            return (sgy) fhyVarO;
        }
        if (!(fhyVarO instanceof miy)) {
            e9d0.i(fhyVarO, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + fhyVarO + " from generic non-reified function. Such functionality cannot be supported because " + fhyVarO + " is erased, either specify serializer explicitly or make calling function inline with reified " + fhyVarO + '.');
    }

    public static final String Q(sgy sgyVar) {
        sgyVar.getClass();
        String strJ = sgyVar.J();
        if (strJ == null) {
            strJ = "<local class name not available>";
        }
        return kng0.l("Serializer for class '", strJ, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final mm40 R(Function1 function1) {
        return new kky(function1, null);
    }

    public static final mm40 S(mm40 mm40Var, Function1 function1) {
        return mm40Var.e(new kky(null, function1));
    }

    public static final a65 U(uyc uycVar) {
        int iOrdinal = uycVar.ordinal();
        if (iOrdinal == 0) {
            return a65.f301a;
        }
        if (iOrdinal == 1) {
            return a65.b;
        }
        if (iOrdinal == 2) {
            return a65.c;
        }
        t9f.b();
        return null;
    }

    public static final ff6 V(an5 an5Var, ctf0 ctf0Var, double d2, fo7 fo7Var, boolean z2) {
        w30 h30Var;
        ctf0Var.getClass();
        ql5 ql5Var = an5Var.c;
        String str = ql5Var.f;
        boolean z3 = false;
        String strA = ctf0Var.b.a(R.string.advance, Arrays.copyOf(new Object[0], 0));
        g40 g40Var = an5Var.d;
        e40 e40Var = g40Var.b;
        double d3 = g40Var.f10638a;
        if (e40Var == e40.f7159a || !(fo7Var instanceof co7)) {
            h30Var = new h30();
        } else if (z2) {
            h30Var = new e30(strA);
        } else if (e40Var == e40.b) {
            h30Var = new k30(strA);
        } else if (e40Var == e40.c) {
            str.getClass();
            if (d3 == -1.0d) {
                h30Var = new b30(strA);
            } else {
                int i2 = cy7.f5159a;
                pn40 pn40Var = pn40.f27267a;
                h30Var = new t30(strA, cy7.e(pn40.c(d3, p3u0.c)), str);
            }
        } else if (e40Var == e40.d) {
            int i3 = cy7.f5159a;
            pn40 pn40Var2 = pn40.f27267a;
            h30Var = new q30(strA, cy7.e(pn40.c(d3, p3u0.c)), str);
        } else if (e40Var == e40.f) {
            int i4 = cy7.f5159a;
            pn40 pn40Var3 = pn40.f27267a;
            h30Var = new n30(strA, cy7.e(pn40.c(d3, p3u0.c)), str);
        } else {
            h30Var = e40Var == e40.e ? new e30(strA) : new h30();
        }
        pn40 pn40Var4 = pn40.f27267a;
        String strC = pn40.c(ql5Var.b, p3u0.c);
        double d4 = ql5Var.b;
        if ((d4 == 0.0d || d2 > d4) && ql5Var.f28916a != 0 && ctf0Var.i()) {
            z3 = true;
        }
        return new ff6(h30Var, new sw7(strC, str, z3, an5Var.e));
    }

    public static final ob7 W(m97 m97Var) {
        long j2 = m97Var.f21398a;
        String str = m97Var.o;
        long j3 = m97Var.i;
        long j4 = m97Var.h;
        boolean z2 = m97Var.e;
        double d2 = m97Var.k;
        long j5 = m97Var.f;
        String str2 = m97Var.p;
        return new ob7(j2, j3, j4, z2, d2, j5, (str2.length() <= 0 || str.length() <= 0) ? "" : kng0.l(str2, ": ", str), m97Var.d, m97Var.x, m97Var.l, m97Var.m, iun.f15405a);
    }

    public static final Bitmap.Config X(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26 || i2 != 3) {
            return (i3 < 26 || i2 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final void a(mm40 mm40Var, ph0 ph0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        ph0Var.getClass();
        fetVar.g0(-1115588804);
        int i3 = i2 | 6 | (fetVar.g(ph0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40VarD, 64.0f), "CATEGORY_ICON_LEFT_VIRTUAL");
            if (ph0Var instanceof nh0) {
                fetVar.e0(-48740664);
                b(mm40VarE0, (nh0) ph0Var, function1, fetVar, i3 & 1008);
                fetVar.r(false);
            } else {
                if (!ph0Var.equals(oh0.f25241a)) {
                    throw b1j.f(1660993674, fetVar, false);
                }
                fetVar.e0(-48506893);
                c(0, fetVar, null);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ih0(mm40Var2, ph0Var, function1, i2, (byte) 2);
        }
    }

    public static final void b(mm40 mm40Var, nh0 nh0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-713926342);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(nh0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.a(12.0f));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new jh0(function1, nh0Var, b2);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.m;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarN, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "CATEGORY_CARD_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            k1x k1xVar = new k1x((Context) fetVar2.k(dy2.b));
            k1xVar.c = nh0Var.c;
            t1x.f(k1xVar, R.drawable.ic_glyph_category_new);
            t1x.c(k1xVar, R.drawable.ic_glyph_category_new);
            k1xVar.c((int) pkd.b(24.0f, fetVar2));
            j0x.b(l7x.X(k1xVar.a(), null, null, fetVar2, 0, 30), null, o2e.e0(o7k0.n(jm40Var, 24.0f), "CATEGORY_CARD_IMAGE"), null, gqw0.A, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), 5), fetVar2, 24624, 40);
            fetVar2.r(true);
            mm40 mm40VarE1 = o2e.e0(s5x0.M(jm40Var, 8.0f, 8.0f, 12.0f, 8.0f), "CATEGORY_CARD_TITLE");
            String str = nh0Var.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            qrq qrqVar = j1t0.b;
            long j2 = qmk.q;
            v8q0.a(str, mm40VarE1, textPrimary, new n05(j2, qmk.r, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, true, 3, 0, null, new y9q0(0L, j2, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 28032, 101360);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lh0(mm40Var, nh0Var, function1, i2, (byte) 2);
        }
    }

    public static final void c(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1325220585);
        int i3 = i2 | 6;
        byte b2 = 2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        byte b2;
        int i3;
        boolean z2;
        fet fetVar2;
        cl5 cl5Var;
        float f2;
        boolean z3;
        int i4;
        cl5 cl5Var2;
        fet fetVar3 = fetVar;
        l7m0Var.getClass();
        fetVar3.g0(261247576);
        int i5 = i2 | (fetVar3.g(l7m0Var) ? 32 : 16) | (fetVar3.i(function1) ? 256 : 128);
        byte b3 = 1;
        if (fetVar3.U(i5 & 1, (i5 & 147) != 146)) {
            Activity activity = (Activity) fetVar3.k(cr00.f4820a);
            Object[] objArr = new Object[0];
            Object objP = fetVar3.P();
            cl5 cl5Var3 = ukd.f35823a;
            if (objP == cl5Var3) {
                objP = new mg0((byte) 7);
                fetVar3.o0(objP);
            }
            Object objQ = e9x.Q(objArr, (Function0) objP, fetVar3, 48);
            objQ.getClass();
            String str = (String) objQ;
            Object[] objArr2 = new Object[0];
            boolean zG = fetVar3.g(str);
            Object objP2 = fetVar3.P();
            if (zG || objP2 == cl5Var3) {
                objP2 = new l00(str, b3);
                fetVar3.o0(objP2);
            }
            String str2 = (String) e9x.Q(objArr2, (Function0) objP2, fetVar3, 0);
            Object[] objArr3 = new Object[0];
            Object objP3 = fetVar3.P();
            if (objP3 == cl5Var3) {
                objP3 = new mg0((byte) 8);
                fetVar3.o0(objP3);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr3, (Function0) objP3, fetVar3, 48);
            boolean zI = fetVar3.i(activity) | fetVar3.g(pz40Var);
            Object objP4 = fetVar3.P();
            byte b4 = 24;
            if (zI || objP4 == cl5Var3) {
                objP4 = new k1(activity, pz40Var, b4);
                fetVar3.o0(objP4);
            }
            m0x0.o(activity, (Function1) objP4, fetVar3);
            int i6 = i5 & 896;
            boolean zG2 = (i6 == 256) | fetVar3.g(str) | fetVar3.g(str2) | fetVar3.g(pz40Var);
            Object objP5 = fetVar3.P();
            if (zG2 || objP5 == cl5Var3) {
                mr0 mr0Var = new mr0(str, str2, function1, pz40Var, (byte) 0);
                fetVar3.o0(mr0Var);
                objP5 = mr0Var;
            }
            v3c.A((Function0) objP5, null, null, fetVar3, 0, 6);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            pz40 pz40Var2 = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarE, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarQ);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z4 = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            gq0 gq0Var = ((xr0) l7m0Var.getValue()).b;
            mm40 mm40VarE2 = mm40Var.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE2);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = ((xr0) l7m0Var.getValue()).f41345a;
            boolean z5 = i6 == 256;
            Object objP6 = fetVar3.P();
            if (z5 || objP6 == cl5Var3) {
                b2 = 0;
                objP6 = new nr0(function1, b2);
                fetVar3.o0(objP6);
            } else {
                b2 = 0;
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP6, null, null, null, null, null, null, null, null, fetVar3, 6, 0, 4084);
            boolean z6 = gq0Var instanceof dq0;
            if (z6) {
                fetVar3.e0(1118841333);
                i3 = i6;
                function2 = function1;
                u(((dq0) gq0Var).b, function2, fetVar3, 6 | i3);
                z2 = false;
                fetVar3.r(false);
                fetVar2 = fetVar3;
                cl5Var = cl5Var3;
                f2 = 1.0f;
                z3 = true;
                i4 = 256;
            } else {
                function2 = function1;
                i3 = i6;
                z2 = false;
                if (gq0Var instanceof eq0) {
                    fetVar3.e0(1119098044);
                    f2 = 1.0f;
                    z3 = true;
                    char c2 = 1;
                    mm40 mm40VarE3 = tfx.E(new x7z(1.0f, true));
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarE3);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC2, shdVar);
                    jpm0.o(fetVar3, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, shdVar4);
                    mdm mdmVar = ((eq0) gq0Var).f8210a;
                    i4 = 256;
                    Object[] objArr4 = i3 == 256;
                    Object objP7 = fetVar3.P();
                    if (objArr4 == true) {
                        cl5Var2 = cl5Var3;
                    } else {
                        cl5Var2 = cl5Var3;
                        if (objP7 == cl5Var2) {
                        }
                        cl5Var = cl5Var2;
                        jcb.l(null, mdmVar, false, (Function0) objP7, fetVar3, 0, 5);
                        fetVar2 = fetVar3;
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                    objP7 = new nr0(function2, c2 == true ? 1 : 0);
                    fetVar3.o0(objP7);
                    cl5Var = cl5Var2;
                    jcb.l(null, mdmVar, false, (Function0) objP7, fetVar3, 0, 5);
                    fetVar2 = fetVar3;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    fetVar2 = fetVar3;
                    cl5Var = cl5Var3;
                    f2 = 1.0f;
                    z3 = true;
                    i4 = 256;
                    if (!(gq0Var instanceof fq0)) {
                        throw b1j.f(1283015896, fetVar2, false);
                    }
                    fetVar2.e0(1119737109);
                    u(((fq0) gq0Var).f9952a, function2, fetVar2, 6 | i3);
                    fetVar2.r(false);
                }
            }
            fetVar2.r(z3);
            if (z6) {
                fetVar2.e0(208128132);
                mm40 mm40VarB = jr8.f16991a.b(o7k0.d(jm40Var, f2), gqw0.h);
                mtl mtlVar = ((dq0) gq0Var).f6490a;
                ma80 ma80Var = ma80.b;
                boolean z7 = i3 == i4 ? z3 : z2;
                Object objP8 = fetVar2.P();
                if (z7 || objP8 == cl5Var) {
                    objP8 = new y7(function2, (byte) 24);
                    fetVar2.o0(objP8);
                }
                bkb.f(mm40VarB, mtlVar, ma80Var, false, null, (Function1) objP8, fetVar, 384, 24);
                fetVar3 = fetVar;
                fetVar3.r(z2);
            } else {
                fetVar3 = fetVar2;
                fetVar3.e0(208835428);
                fetVar3.r(z2);
            }
            fetVar3.r(z3);
        } else {
            function2 = function1;
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function2, i2, (byte) 0);
        }
    }

    public static final void e(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        xczVar.getClass();
        d9zVar.getClass();
        xczVar2.getClass();
        xczVar3.getClass();
        function1.getClass();
        fetVar.g0(-1142134624);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(d9zVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(xczVar2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(xczVar3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            float fT = fbc.T(fetVar);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = phu0.H(i120.Q(jm40Var, background, ljcVar), null, 1);
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = m8m0.f21378a;
            y0x0.e(mm40VarH, 228.0f + fT, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 0.0f, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 24.0f, u1c.M(-1658666521, new qt1(fT, l7m0Var, function1, b2), fetVar), u1c.M(-486609397, new rt1((byte) 1, d9zVar, xczVar, xczVar2, xczVar3, l7m0Var, function1), fetVar), fetVar, 905994240, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new st1(mm40Var2, l7m0Var, xczVar, d9zVar, xczVar2, xczVar3, function1, i2, (byte) 1);
        }
    }

    public static final void f(final mm40 mm40Var, final String str, final int i2, final long j2, final qge qgeVar, final float f2, fet fetVar, final int i3) {
        int i4;
        fetVar.g0(-2105854810);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar.g(qgeVar) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= fetVar.d(f2) ? 131072 : 65536;
        }
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            Context context = (Context) fetVar.k(dy2.b);
            int iRound = Math.round(pkd.b(f2, fetVar));
            boolean zE = fetVar.e(iRound) | ((i4 & 112) == 32);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                k1x k1xVar = new k1x(context);
                k1xVar.c = str;
                k1xVar.c(iRound);
                objP = k1xVar.a();
                fetVar.o0(objP);
            }
            int i5 = (i4 >> 6) & 14;
            k7x.b((o1x) objP, null, mm40Var, a8k0.F(i2, i5, fetVar), a8k0.F(i2, i5, fetVar), null, null, null, null, null, qgeVar, new m78(j2, 5), fetVar, ((i4 << 6) & 896) | 36912, (i4 >> 12) & 14, 27616);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.o04
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j2e.f(mm40Var, str, i2, j2, qgeVar, f2, (fet) obj, x8x.L(i3 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void g(mm40 mm40Var, n0x n0xVar, int i2, qge qgeVar, float f2, float f3, fet fetVar, int i3) {
        mm40 mm40Var2;
        int i4;
        qge qgeVar2;
        float f4;
        float f5;
        qge qgeVar3;
        float f6;
        float f7;
        int i5;
        fetVar.g0(334431026);
        int i6 = i3 | 6 | (fetVar.g(n0xVar) ? 32 : 16) | (fetVar.g(null) ? 256 : 128) | 1664000;
        if (fetVar.U(i6 & 1, (599187 & i6) != 599186)) {
            fetVar.Z();
            if ((i3 & 1) == 0 || fetVar.B()) {
                pge pgeVar = gqw0.A;
                zcl zclVar = qmk.f28987a;
                mm40Var2 = jm40.b;
                qgeVar3 = pgeVar;
                f6 = 120.0f;
                f7 = 0.1f;
                i5 = R.drawable.ic_glyph_category_new;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                i5 = i2;
                qgeVar3 = qgeVar;
                f6 = f2;
                f7 = f3;
            }
            fetVar.s();
            v0v0 v0v0Var = fetVar.k(bmd.n) == k6z.b ? v0v0.b : v0v0.f36601a;
            fetVar.e0(-1287850772);
            mm40 mm40VarU = jpm0.u(epv0.N(o7k0.n(mm40Var2, f6), f7), v0v0Var);
            String str = n0xVar.f22722a;
            fetVar.e0(-734268389);
            long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
            fetVar.r(false);
            f(mm40VarU, str, i5, secondary, qgeVar3, f6, fetVar, 24576);
            fetVar.r(false);
            f5 = f7;
            i4 = i5;
            qgeVar2 = qgeVar3;
            f4 = f6;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            i4 = i2;
            qgeVar2 = qgeVar;
            f4 = f2;
            f5 = f3;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n04(mm40Var2, n0xVar, i4, qgeVar2, f4, f5, i3);
        }
    }

    public static final void h(int i2, fet fetVar, a4x a4xVar, Function0 function0, Function1 function1, boolean z2) {
        int i3;
        a4xVar.getClass();
        function1.getClass();
        function0.getClass();
        fetVar.g0(-729122471);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            int i4 = i3 & 14;
            int i5 = i3 >> 3;
            i((i5 & 896) | i4 | (i5 & 112), fetVar, a4xVar, function0, function1);
            if (z2) {
                fetVar.e0(239395692);
                jar0.A(0, fetVar, null);
            } else {
                fetVar.e0(-1168655645);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(a4xVar, z2, function1, function0, i2);
        }
    }

    public static final void i(int i2, fet fetVar, a4x a4xVar, Function0 function0, Function1 function1) {
        int i3;
        a4x a4xVar2;
        fetVar.g0(1730088119);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            WeakHashMap weakHashMap = djv0.w;
            bgx bgxVarO = i120.O(zcm0.i(fetVar).e, fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(jm40.b, qmk.a(fetVar).d, 0.0f, 2).e(o7k0.c), "AUTH_HISTORY_CONTENT_LIST");
            boolean z2 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && fetVar.i(a4xVar))) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new o74(a4xVar2, function1, function0);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.e(mm40VarE0, xczVarA, bgxVarO, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((byte) 27, i2, (Object) a4xVar2, (Object) function0, function1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(mm40 mm40Var, final ge8 ge8Var, final Function1 function1, fet fetVar, int i2) {
        final byte b2;
        boolean z2;
        fet fetVar2 = fetVar;
        ge8Var.getClass();
        function1.getClass();
        fetVar2.g0(464756979);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ge8Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            v8q0.a(ge8Var.b, s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 0, 131064);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            rqm rqmVar = ge8Var.c;
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean z3 = (i4 == 32) | (i5 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                b2 = 0;
                objP = new Function0() { // from class: a.fe8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        u8f0 u8f0Var = u8f0.f35229a;
                        Function1 function2 = function1;
                        ge8 ge8Var2 = ge8Var;
                        switch (b3) {
                            case 0:
                                if (ge8Var2.f11140a) {
                                    function2.invoke(u8f0Var);
                                }
                                break;
                            default:
                                if (ge8Var2.f11140a) {
                                    function2.invoke(u8f0Var);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            } else {
                b2 = 0;
            }
            Function0 function0 = (Function0) objP;
            byte b3 = i4 == 32 ? (byte) 1 : b2;
            if (i5 == 256) {
                b2 = 1;
            }
            boolean z4 = b3 | b2;
            Object objP2 = fetVar.P();
            if (z4 != 0 || objP2 == cl5Var) {
                z2 = true;
                final char c2 = 1 == true ? 1 : 0;
                objP2 = new Function0() { // from class: a.fe8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = c2;
                        u8f0 u8f0Var = u8f0.f35229a;
                        Function1 function2 = function1;
                        ge8 ge8Var2 = ge8Var;
                        switch (b4) {
                            case 0:
                                if (ge8Var2.f11140a) {
                                    function2.invoke(u8f0Var);
                                }
                                break;
                            default:
                                if (ge8Var2.f11140a) {
                                    function2.invoke(u8f0Var);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            } else {
                z2 = true;
            }
            fetVar2 = fetVar;
            obc.q(mm40VarN, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar2, 0, 172);
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, ge8Var, function1, i2, (byte) 5);
        }
    }

    public static final void k(mm40 mm40Var, i4 i4Var, fet fetVar, int i2) {
        i4 i4Var2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        i4Var.getClass();
        fetVar2.g0(1277050849);
        int i3 = i2 | 6 | (fetVar2.g(i4Var) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            boolean zE = fetVar2.e(i4Var.size());
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                objP = Boolean.valueOf(i4Var.size() == 1 && (CollectionsKt.firstOrNull(i4Var) instanceof rc9));
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            mm40Var2 = jm40.b;
            if (zBooleanValue) {
                fetVar2.e0(-198146200);
                Object objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    Object objFirstOrNull = CollectionsKt.firstOrNull(i4Var);
                    objP2 = objFirstOrNull instanceof rc9 ? (rc9) objFirstOrNull : null;
                    fetVar2.o0(objP2);
                }
                rc9 rc9Var = (rc9) objP2;
                String str = rc9Var != null ? rc9Var.b : null;
                if (str == null) {
                    str = "";
                }
                v8q0.a(str, mm40Var2, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar, 48, 24960, 110588);
                fetVar2 = fetVar;
                fetVar2.r(false);
                i4Var2 = i4Var;
            } else {
                fetVar2.e0(-197792955);
                i4Var2 = i4Var;
                o2e.k(i4Var2, fetVar2, i3 & 126);
                fetVar2.r(false);
            }
        } else {
            i4Var2 = i4Var;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var2, i4Var2, i2, (byte) 24);
        }
    }

    public static final void l(final mm40 mm40Var, final kz20 kz20Var, final float f2, final float f3, final Function1 function1, ugd ugdVar, ugd ugdVar2, fet fetVar, final int i2) {
        int i3;
        ugd ugdVar3;
        ugd ugdVar4;
        List list = kz20Var.f19134a;
        function1.getClass();
        fetVar.g0(-289476814);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = i3 | (fetVar.g(kz20Var) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128) | (fetVar.d(f3) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        byte b2 = 0;
        if (fetVar.U(i4 & 1, (599187 & i4) != 599186)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            if (list.size() > 1) {
                fetVar.e0(491079127);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
                n0q n0qVar = o7k0.c;
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (((rs20) it.next()).isSelected()) {
                        break;
                    } else {
                        i5++;
                    }
                }
                int i6 = i5;
                boolean z2 = ((((i4 & 896) ^ 384) > 256 && fetVar.d(f2)) || (i4 & 384) == 256) | ((((i4 & 7168) ^ 3072) > 2048 && fetVar.d(f3)) || (i4 & 3072) == 2048);
                Object objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    long j2 = y3d.f;
                    zcl zclVar = qmk.f28987a;
                    mbh0 mbh0Var = new mbh0(8.0f, f2, f3, j2);
                    fetVar.o0(mbh0Var);
                    objP = mbh0Var;
                }
                ugdVar3 = ugdVar;
                ugdVar4 = ugdVar2;
                xww.n(n0qVar, i6, (mbh0) objP, null, false, u1c.M(-820908236, new f4b(ugdVar3, b2), fetVar), u1c.M(1314758805, new g4b(kz20Var, ugdVar4, function1, b2), fetVar), fetVar, 1769478);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                ugdVar3 = ugdVar;
                ugdVar4 = ugdVar2;
                fetVar.e0(492763760);
                fetVar.r(false);
            }
        } else {
            ugdVar3 = ugdVar;
            ugdVar4 = ugdVar2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final ugd ugdVar5 = ugdVar3;
            final ugd ugdVar6 = ugdVar4;
            yfe0VarU.d = new Function2() { // from class: a.h4b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j2e.l(mm40Var, kz20Var, f2, f3, function1, ugdVar5, ugdVar6, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void m(stu0 stu0Var, rah0 rah0Var, dmg0 dmg0Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1387820825);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(stu0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(rah0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(dmg0Var) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            ma80 ma80Var = ma80.f21447a;
            k6z k6zVar = k6z.f17794a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = fbh0.a(jm40Var, rah0Var, ma80Var, true, null, 52);
            mm40VarA.getClass();
            mm40 mm40VarQ = knx.Q(i4w0.T(lgb.K(mm40VarA), new eme0(dmg0Var, (byte) 27)), new rqc0(dmg0Var, (byte) 3));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            nkb.h(null, stu0Var.f32791a, kjm.f18392a, null, null, null, fetVar2, 384, 57);
            String str = stu0Var.b;
            if (str == null || str.length() == 0) {
                fetVar2.e0(-853322235);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-854033375);
                float f2 = xfn.a(fetVar2).e;
                String str2 = stu0Var.b;
                zcl zclVar = qmk.f28987a;
                v8q0.a(str2, s5x0.N(jm40Var, f2, 0.0f, f2, 8.0f, 2), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), new n05(idm0.t(10), idm0.t(16), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 110576);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(stu0Var, rah0Var, dmg0Var, i2, (byte) 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:32:0x0119  */
    /* JADX WARN: Code duplicated, block: B:34:0x0127  */
    /* JADX WARN: Code duplicated, block: B:35:0x0138  */
    /* JADX WARN: Code duplicated, block: B:37:0x013c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0155  */
    /* JADX WARN: Code duplicated, block: B:43:0x015d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0165  */
    /* JADX WARN: Code duplicated, block: B:46:0x0176  */
    /* JADX WARN: Code duplicated, block: B:48:0x017a  */
    /* JADX WARN: Code duplicated, block: B:50:0x01cd  */
    public static final void n(l7m0 l7m0Var, Function0 function0, fet fetVar, int i2) {
        byte b2;
        yjj0 ugg0Var;
        zfn zfnVar;
        wxf wxfVar;
        ljc ljcVar = jd8.n;
        l7m0Var.getClass();
        function0.getClass();
        fetVar.g0(1649995735);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            dph0 dph0Var = (dph0) l7m0Var.getValue();
            boolean z2 = dph0Var instanceof aph0;
            if (z2 && (((aph0) dph0Var).f1253a instanceof vxf)) {
                fetVar.e0(802978341);
                fetVar.r(false);
            } else {
                if (dph0Var instanceof bph0) {
                    fetVar.e0(802980581);
                    fetVar.r(false);
                } else {
                    fetVar.e0(802981685);
                    zcl zclVar = qmk.f28987a;
                    float fB = pkd.b(24.0f, fetVar);
                    float fB2 = pkd.b(24.0f, fetVar);
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    ugg0Var = new ugg0(new qed0(0.0f), new qed0(0.0f), new qed0(fB), new qed0(fB2));
                    fetVar.r(false);
                }
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarJ = lgb.J(o7k0.g(o7k0.d(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 12.0f, 7), 1.0f), 56.0f, 0.0f, 2), ugg0Var);
                zfnVar = zaq0.b;
                mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), "ArrowBack");
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
                if (z2) {
                    fetVar.e0(-1894205876);
                    wxfVar = ((aph0) dph0Var).f1253a;
                    if (wxfVar instanceof uxf) {
                        fetVar.e0(1462920096);
                        o((uxf) wxfVar, function0, fetVar, i3 & 112);
                        fetVar.r(false);
                    } else {
                        if (wxfVar instanceof vxf) {
                            throw b1j.f(1462917238, fetVar, false);
                        }
                        fetVar.e0(1462926861);
                        p(((vxf) wxfVar).f38196a, function0, fetVar, i3 & 112);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    if (Intrinsics.d(dph0Var, cph0.f4747a)) {
                        fetVar.e0(1462934417);
                        q((i3 >> 3) & 14, fetVar, function0);
                        fetVar.r(false);
                    } else {
                        if (dph0Var instanceof bph0) {
                            throw b1j.f(1462915431, fetVar, false);
                        }
                        fetVar.e0(-1893570283);
                        b2 = 0;
                        hlm.c(null, new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), mlm.f21997a, fmm.f9790a, obc.O(R.color.static_transparent, fetVar), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i3 << 6) & 7168, 0, 4085);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                }
                b2 = 0;
                fetVar.r(true);
            }
            ugg0Var = ljcVar;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarJ2 = lgb.J(o7k0.g(o7k0.d(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 12.0f, 7), 1.0f), 56.0f, 0.0f, 2), ugg0Var);
            zfnVar = zaq0.b;
            mm40 mm40VarE1 = o2e.e0(i120.Q(mm40VarJ2, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), "ArrowBack");
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            if (z2) {
                fetVar.e0(-1894205876);
                wxfVar = ((aph0) dph0Var).f1253a;
                if (wxfVar instanceof uxf) {
                    fetVar.e0(1462920096);
                    o((uxf) wxfVar, function0, fetVar, i3 & 112);
                    fetVar.r(false);
                } else {
                    if (wxfVar instanceof vxf) {
                        throw b1j.f(1462917238, fetVar, false);
                    }
                    fetVar.e0(1462926861);
                    p(((vxf) wxfVar).f38196a, function0, fetVar, i3 & 112);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                if (Intrinsics.d(dph0Var, cph0.f4747a)) {
                    fetVar.e0(1462934417);
                    q((i3 >> 3) & 14, fetVar, function0);
                    fetVar.r(false);
                } else {
                    if (dph0Var instanceof bph0) {
                        throw b1j.f(1462915431, fetVar, false);
                    }
                    fetVar.e0(-1893570283);
                    b2 = 0;
                    hlm.c(null, new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), mlm.f21997a, fmm.f9790a, obc.O(R.color.static_transparent, fetVar), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i3 << 6) & 7168, 0, 4085);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            b2 = 0;
            fetVar.r(true);
        } else {
            b2 = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rxf(l7m0Var, function0, i2, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static final void o(uxf uxfVar, Function0 function0, fet fetVar, int i2) {
        pcy pcyVar;
        jm40 jm40Var;
        ?? r1;
        char c2;
        fet fetVar2;
        uxf uxfVar2;
        pcy pcyVar2;
        boolean z2;
        Object obj;
        fet fetVar3 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar3.g0(-655691370);
        int i3 = i2 | (fetVar3.g(uxfVar) ? 4 : 2) | (fetVar3.i(function0) ? 32 : 16);
        if (fetVar3.U(i3 & 1, (i3 & 19) != 18)) {
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var2);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z3 = fetVar3.S;
            pcy pcyVar3 = e7z.u1;
            if (z3) {
                fetVar3.l(pcyVar3);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar4);
            jpm0.o(fetVar3, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
            jpm0.o(fetVar3, mm40VarC0, shdVar);
            zfn zfnVar = zaq0.b;
            hlm.c(null, new imm(new ilm(((ThemeColors) fetVar3.k(zfnVar)).getSecondary()), new plm(uxfVar.f36439a, ha50.TWO_LINES, ibc.Y(uxfVar.h, fetVar3), fa50.f9191a), fmm.f9790a, obc.O(R.color.static_transparent, fetVar3), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar3, (i3 << 6) & 7168, 0, 4085);
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 48.0f, 0.0f, 48.0f, 0.0f, 10);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.n, fetVar3, 48);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarN);
            fetVar3.i0();
            if (fetVar3.S) {
                pcyVar = pcyVar3;
                fetVar3.l(pcyVar);
            } else {
                pcyVar = pcyVar3;
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA2, shdVar4);
            jpm0.o(fetVar3, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar);
            String str = uxfVar.b;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar3.k(zfnVar2)).getClass();
            pcy pcyVar4 = pcyVar;
            v8q0.a(str, null, ((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.u(), fetVar, 0, 0, 130042);
            if (uxfVar.d) {
                fetVar.e0(-41707540);
                String str2 = uxfVar.c;
                mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                ((g1t0) fetVar.k(zfnVar2)).getClass();
                c2 = 3;
                jm40Var = jm40Var2;
                v8q0.a(str2, mm40VarN2, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 130040);
                fet fetVar4 = fetVar;
                r1 = 0;
                fetVar4.r(false);
                fetVar2 = fetVar4;
            } else {
                fet fetVar5 = fetVar;
                jm40Var = jm40Var2;
                r1 = 0;
                c2 = 3;
                fetVar5.e0(-41397664);
                fetVar5.r(false);
                fetVar2 = fetVar5;
            }
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new ycl(0.0f));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40 mm40VarT = o7k0.t(o7k0.l(s5x0.N(o7k0.e(jm40Var, 50.0f), 0.0f, 6.0f, 0.0f, 16.0f, 5), 256.0f), 20.0f, 256.0f);
            ?? r9 = (i3 & 14) != 4 ? r1 : 1;
            Object objP2 = fetVar2.P();
            if (r9 != 0 || objP2 == cl5Var) {
                uxfVar2 = uxfVar;
                objP2 = new v4f(uxfVar2, pz40Var, (byte) 13);
                fetVar2.o0(objP2);
            } else {
                uxfVar2 = uxfVar;
            }
            mm40 mm40VarD0 = ro4.d0(mm40VarT, (Function1) objP2);
            tj30 tj30VarC = zq8.c(gqw0.d, r1);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD0);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar2 = pcyVar4;
                fetVar2.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar4;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar4);
            jpm0.o(fetVar2, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                Pair[] pairArr = new Pair[4];
                pairArr[r1] = new Pair(Float.valueOf(0.0f), d4d.STATIC_RED);
                z2 = true;
                pairArr[1] = new Pair(Float.valueOf(0.2f), d4d.STATIC_DARK_ORANGE);
                pairArr[2] = new Pair(Float.valueOf(0.6f), d4d.STATIC_YELLOW);
                pairArr[c2] = new Pair(Float.valueOf(1.0f), d4d.STATIC_GREEN);
                fetVar2.o0(pairArr);
                obj = pairArr;
            } else {
                z2 = true;
                obj = objP3;
            }
            Pair[] pairArr2 = (Pair[]) obj;
            fetVar2.e0(1748060477);
            ArrayList arrayList = new ArrayList(pairArr2.length);
            int length = pairArr2.length;
            int i4 = r1;
            for (?? r15 = r1; r15 < length; r15++) {
                Pair pair = pairArr2[r15];
                arrayList.add(new Pair(pair.f46059a, new y3d(ibc.Y((d4d) pair.b, fetVar2))));
                pz40Var = pz40Var;
                i4 = 0;
            }
            pz40 pz40Var2 = pz40Var;
            fetVar2.r(i4);
            Pair[] pairArr3 = (Pair[]) arrayList.toArray(new Pair[i4]);
            mm40 mm40VarV = yyw.V(jm40Var, fetVar2.k(bmd.n) == k6z.b ? z2 : false);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarD2 = o7k0.d(o7k0.e(mm40VarV, 12.0f), 1.0f);
            zcl zclVar3 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar2, o2e.e0(i120.P(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarD2), yk5.h((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length), 0.0f, 0.0f, 14), null, 6), "Spacer"));
            n0q n0qVar = o7k0.c;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, n0qVar);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM4, shdVar3);
            vqd.u(iHashCode4, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar);
            qxw.o(fetVar2, o7k0.n(jm40Var, ((ycl) pz40Var2.getValue()).f42389a));
            TypedValue typedValue = j5d.f15927a;
            fetVar2.e0(-1181620321);
            ArrayList arrayList2 = new ArrayList(pairArr2.length);
            int i5 = 0;
            for (int length2 = pairArr2.length; i5 < length2; length2 = length2) {
                Pair pair2 = pairArr2[i5];
                long jY = ibc.Y((d4d) pair2.b, fetVar2);
                TypedValue typedValue2 = j5d.f15927a;
                arrayList2.add(new Pair(Integer.valueOf(j5d.e(y3d.d(jY), y3d.h(jY), y3d.g(jY), y3d.e(jY))), pair2.f46059a));
                i5++;
            }
            fetVar2.r(false);
            int iB = j5d.b((Pair[]) arrayList2.toArray(new Pair[0]), uxfVar2.e);
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarN3 = o7k0.n(jm40Var, 28.0f);
            zfn zfnVar3 = zaq0.b;
            mm40 mm40VarQ = i120.Q(s5x0.J(i120.S(mm40VarN3, 2.0f, ((ThemeColors) fetVar2.k(zfnVar3)).getBackgroundContent(), vgg0.a(28.0f)), 1.0f), fbc.d(iB), vgg0.a(26.0f));
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar4);
            jpm0.o(fetVar2, bh90VarM5, shdVar3);
            vqd.u(iHashCode5, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC4, shdVar);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            String strValueOf = String.valueOf(uxfVar2.f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            boolean z4 = z2;
            v8q0.a(strValueOf, mm40VarB, ((ThemeColors) fetVar2.k(zfnVar3)).getBackgroundContent(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.i(), fetVar, 0, 0, 131064);
            fetVar3 = fetVar;
            fetVar3.r(z4);
            fetVar3.r(z4);
            fetVar3.r(z4);
            fetVar3.r(z4);
            fetVar3.r(z4);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(uxfVar, function0, i2, (byte) 15);
        }
    }

    public static final void p(String str, Function0 function0, fet fetVar, int i2) {
        Function0 function1;
        fetVar.g0(-367506805);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            function1 = function0;
            hlm.c(null, new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(str, ha50.TWO_LINES, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, obc.O(R.color.static_transparent, fetVar), false, null), null, function1, null, null, null, null, null, null, null, null, fetVar, (i3 << 6) & 7168, 0, 4085);
        } else {
            function1 = function0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new txf(str, function1, i2, (byte) 0);
        }
    }

    public static final void q(int i2, fet fetVar, Function0 function0) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1729218139);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.i(function0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            hlm.c(null, new imm(new ilm(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary()), mlm.f21997a, fmm.f9790a, obc.O(R.color.static_transparent, fetVar2), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i3 << 9) & 7168, 0, 4085);
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 48.0f, 0.0f, 48.0f, 0.0f, 10);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarT = o7k0.t(o7k0.l(o7k0.e(s5x0.N(jm40Var, 0.0f, 60.0f, 0.0f, 0.0f, 13), 20.0f), 160.0f), 20.0f, 160.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar2, pkd.l(mm40VarT, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), 0L, fetVar2, 2));
            qxw.o(fetVar2, pkd.l(o7k0.t(o7k0.l(o7k0.e(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 16.0f), 216.0f), 20.0f, 216.0f), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), 0L, fetVar2, 2));
            qxw.o(fetVar2, pkd.l(o7k0.t(o7k0.l(o7k0.e(s5x0.N(jm40Var, 0.0f, 14.0f, 0.0f, 24.0f, 5), 12.0f), 256.0f), 20.0f, 256.0f), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), 0L, fetVar2, 2));
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sxf((byte) 0, i2, function0);
        }
    }

    public static final void r(mm40 mm40Var, rkl rklVar, Function0 function0, fet fetVar, int i2) {
        fet fetVar2;
        h4d h4dVar;
        fet fetVar3;
        rkl rklVar2 = rklVar;
        fet fetVar4 = fetVar;
        fetVar4.g0(-1670985191);
        int i3 = i2 | (fetVar4.g(mm40Var) ? 4 : 2) | (fetVar4.g(rklVar2) ? 32 : 16) | (fetVar4.i(function0) ? 256 : 128);
        if (fetVar4.U(i3 & 1, (i3 & 147) != 146)) {
            long secondary = ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary();
            boolean z2 = ((k6z) fetVar4.k(bmd.n)) == k6z.b;
            qc0 qc0Var = rklVar2.b;
            n0x n0xVar = rklVar2.f30653a;
            boolean zE = fetVar4.e(qc0Var.ordinal()) | fetVar4.h(z2);
            Object objP = fetVar4.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                int iOrdinal = qc0Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    objP = yk5.g(z2 ? q3d.j(new y3d(hi0.s), new y3d(hi0.h)) : q3d.j(new y3d(hi0.h), new y3d(hi0.s)), 0.0f, 0.0f, 14);
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    }
                    objP = new skk0(secondary);
                }
                fetVar4.o0(objP);
            }
            t89 t89Var = (t89) objP;
            boolean zE2 = fetVar4.e(qc0Var.ordinal());
            Object objP2 = fetVar4.P();
            Object obj = objP2;
            if (zE2 || objP2 == cl5Var) {
                int iOrdinal2 = qc0Var.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    h4dVar = null;
                } else {
                    if (iOrdinal2 != 3) {
                        t9f.b();
                        return;
                    }
                    float[] fArrA = g4d.a();
                    g4d.b(fArrA);
                    h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArrA));
                    h4dVar2.b = fArrA;
                    h4dVar = h4dVar2;
                }
                fetVar4.o0(h4dVar);
                obj = h4dVar;
            }
            a4d a4dVar = (a4d) obj;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z3 = fetVar4.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            boolean z4 = z2;
            nkb.h(s5x0.L(jm40Var, 8.0f, 0.0f, 2), new hjm(rklVar2.f, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar, 384, 56);
            mm40 mm40VarW = y860.W(o7k0.e(o7k0.d(jm40Var, 1.0f), 72.0f), null, null, false, null, function0, 28);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.P(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarW), t89Var, null, 6), "AGGREGATOR_BONUSES_IMAGE_HEADER_STYLE");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (n0xVar.c()) {
                fet fetVar5 = fetVar;
                fetVar5.e0(-431435955);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                fetVar.e0(-431982237);
                j0x.b(l7x.X(n0xVar.a(), null, null, fetVar, 0, 30), null, yyw.V(jr8.f16991a.b(o7k0.s(o7k0.c(jm40Var, 1.0f), 176.0f), gqw0.f), z4), null, gqw0.A, 0.0f, a4dVar, fetVar, 24624, 40);
                fet fetVar6 = fetVar;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            }
            rklVar2 = rklVar;
            E(s5x0.N(jm40Var, 16.0f, 0.0f, 144.0f, 0.0f, 10).e(o7k0.c), rklVar2, fetVar3, i3 & 112);
            fetVar3.r(true);
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, rklVar2, function0, i2, (byte) 16);
        }
    }

    public static final void s(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-25766312);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            nkb.h(s5x0.L(jm40Var, 8.0f, 0.0f, 2), new ijm(), kjm.f18392a, null, null, null, fetVar, 384, 56);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 72.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i2, (byte) 25);
        }
    }

    public static final void t(mm40 mm40Var, lim limVar, boolean z2, e2d e2dVar, Function2 function2, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function2 function3;
        lim limVar2;
        Function1 function4;
        mm40 mm40VarK;
        boolean z3;
        Function1 function5;
        float f2;
        boolean z4;
        limVar.getClass();
        boolean z5 = limVar.f;
        String str = limVar.e;
        String str2 = limVar.d;
        String str3 = limVar.f20114a;
        a4x a4xVar = limVar.h;
        e2dVar.getClass();
        function1.getClass();
        fetVar.g0(-1305747544);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(limVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(e2dVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            boolean zBooleanValue = ((Boolean) ((l7m0) e2dVar.f.getValue()).getValue()).booleanValue();
            String str4 = limVar.i;
            boolean zIsEmpty = a4xVar.isEmpty();
            boolean z6 = str4 == null || str4.length() == 0;
            zcl zclVar = qmk.f28987a;
            float f3 = !zBooleanValue ? 24.0f : 0.0f;
            androidx.compose.runtime.d dVar = zaq0.b;
            int i4 = i3;
            long separator60 = ((ThemeColors) fetVar.k(dVar)).getSeparator60();
            jm40 jm40Var = jm40.b;
            Object obj = ukd.f35823a;
            if (z2 || zBooleanValue) {
                fetVar.e0(-5557503);
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 1.0f, 7);
                boolean zD = fetVar.d(f3) | fetVar.d(1.0f) | fetVar.f(separator60);
                Object objP = fetVar.P();
                if (zD || objP == obj) {
                    objP = new wwk(f3, separator60, (byte) 2);
                    fetVar.o0(objP);
                }
                mm40VarK = rq8.K(mm40VarN, (Function1) objP);
                z3 = false;
                fetVar.r(false);
            } else {
                fetVar.e0(-5064479);
                fetVar.r(false);
                mm40VarK = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 1.0f, 7);
                str2 = str2;
                z3 = false;
            }
            mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar.k(dVar)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z3);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z7 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z7) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarN2 = s5x0.N(i120.Q(mm40VarK, ((ThemeColors) fetVar.k(dVar)).getBackgroundContent(), vgg0.c(0.0f, 0.0f, f3, f3, 3)), 0.0f, 0.0f, 0.0f, 4.0f, 7);
            int i5 = i4 >> 6;
            mm40 mm40VarE = nip.c(mm40VarN2, e2dVar, fetVar, i5 & 112).e(mm40Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            long secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            long secondary2 = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            boolean zH = fetVar.h(zBooleanValue) | fetVar.g(str3) | fetVar.g(str4);
            Object objP2 = fetVar.P();
            if (zH || objP2 == obj) {
                if (str4 == null || str4.length() == 0) {
                    limVar2 = limVar;
                    ha50 ha50Var = ha50.TWO_LINES;
                    objP2 = new qlm(str3, secondary, zBooleanValue);
                } else {
                    limVar2 = limVar;
                    objP2 = new slm(secondary, secondary2, limVar2.f20114a, limVar2.i, zBooleanValue);
                }
                fetVar.o0(objP2);
            } else {
                limVar2 = limVar;
            }
            tlm tlmVar = (tlm) objP2;
            String str5 = str2;
            boolean zG = fetVar.g(str5) | fetVar.g(str) | fetVar.h(z5);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                objP3 = new nlm(new hmm(2, str, str5, z5));
                fetVar.o0(objP3);
            }
            tlm tlmVar2 = limVar2.c ? (nlm) objP3 : tlmVar;
            gmm gmmVar = limVar2.b;
            int i6 = i4 & 458752;
            boolean z8 = i6 == 131072;
            Object objP4 = fetVar.P();
            byte b2 = 14;
            if (z8 || objP4 == obj) {
                function5 = function1;
                objP4 = new qyo(function5, b2);
                fetVar.o0(objP4);
            } else {
                function5 = function1;
            }
            x(tlmVar2, gmmVar, (Function1) objP4, function5, fetVar, i5 & 7168);
            function4 = function5;
            if (z6) {
                f2 = !zIsEmpty ? 56.0f : 60.0f;
            } else {
                f2 = 76.0f;
            }
            nip.a(f2, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), e2dVar, u1c.M(197491404, new zv((Object) e2dVar, f2, (Object) limVar2, (byte) 8), fetVar), fetVar, ((i4 >> 3) & 896) | 3072);
            if (zIsEmpty) {
                z4 = false;
                fetVar.e0(1797453086);
                fetVar.r(false);
            } else {
                fetVar.e0(1796951444);
                pz40 pz40VarF = androidx.compose.runtime.e.f(limVar2, fetVar);
                boolean zG2 = fetVar.g(pz40VarF);
                Object objP5 = fetVar.P();
                if (zG2 || objP5 == obj) {
                    objP5 = new cml(pz40VarF, (byte) 27);
                    fetVar.o0(objP5);
                }
                Function0 function6 = (Function0) objP5;
                boolean zG3 = fetVar.g(pz40VarF) | (i6 == 131072);
                Object objP6 = fetVar.P();
                if (zG3 || objP6 == obj) {
                    objP6 = new jg2(function4, pz40VarF, b2);
                    fetVar.o0(objP6);
                }
                z4 = false;
                C(0, fetVar, a4xVar, function6, (Function1) objP6);
                fetVar.r(false);
            }
            if (function2 == null) {
                fetVar.e0(1797485077);
                fetVar.r(z4);
                function3 = function2;
            } else {
                fetVar.e0(-1604584596);
                function3 = function2;
                h97.q((i4 >> 12) & 14, fetVar, function3, z4);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            function3 = function2;
            limVar2 = limVar;
            function4 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, (Object) limVar2, z2, (Object) e2dVar, (Object) function3, (wdr) function4, i2, (byte) 15);
        }
    }

    public static final void u(a4x a4xVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-457759879);
        int i4 = i2 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i4 == 0) {
            i3 = (fetVar.g(y5dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarB = y5dVar.b(jm40.b, true);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = knm0.f(new lh80(qmk.a(fetVar).c, 12.0f, qmk.a(fetVar).c, 88.0f), fetVar);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarB, null, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lr0(b2, i2, a4xVar, function1);
        }
    }

    public static final void v(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1114080097);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarE, qmk.a(fetVar2).e, 0.0f, qmk.a(fetVar2).e, 0.0f, 10);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            psq psqVar = g1t0.s().f42262a.c;
            long j2 = qmk.y;
            long j3 = qmk.u;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarS = g1t0.s();
            zfn zfnVar2 = zaq0.b;
            kc5.N(str, null, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, null, 0L, j3, j2, psqVar, null, 0L, null, 2, false, 1, 0, false, null, y9q0VarS, 0.0f, fetVar2, (i3 >> 3) & 14, 1597440, 0, 3063098);
            fetVar2 = fetVar2;
            if (str2 != null) {
                fetVar2.e0(-1640660024);
                mm40 mm40VarN2 = s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                long j4 = qmk.r;
                v8q0.a(str2, mm40VarN2, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, j4, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, new y9q0(0L, j4, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, (i3 >> 6) & 14, 384, 126952);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1640339701);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i2, (byte) 3);
        }
    }

    public static final void w(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1164184435);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarS = o050.S(mm40Var.e(o7k0.c));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            byte b2 = 3;
            if (objP2 == cl5Var) {
                objP2 = new b4f0(b2);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarS, gy40Var, null, false, null, (Function0) objP2, 28);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(mm40VarW, ((StaticColors) fetVar.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(((StaticColors) fetVar.k(zfnVar)).m131getWhite800d7_KjU()), b2), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i2, (byte) 16);
        }
    }

    public static final void x(tlm tlmVar, gmm gmmVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        Function1 function3;
        fetVar.g0(-1686198755);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(tlmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(gmmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function3 = function1;
            i3 |= fetVar.i(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), tlmVar, gmmVar, y3d.f, false, null);
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new mfp(function2, (byte) 8);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 2048;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new qyo(function2, (byte) 12);
                fetVar.o0(objP2);
            }
            Function1 function4 = (Function1) objP2;
            boolean z4 = i4 == 2048;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new qyo(function2, (byte) 13);
                fetVar.o0(objP3);
            }
            Function1 function5 = (Function1) objP3;
            boolean z5 = i4 == 2048;
            Object objP4 = fetVar.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new mfp(function2, (byte) 7);
                fetVar.o0(objP4);
            }
            hlm.c(null, immVar, null, function0, null, function3, function4, function5, (Function0) objP4, null, null, null, fetVar, ((i3 << 9) & 458752) | 805306368, 54, 21);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pip(tlmVar, gmmVar, function1, function2, i2, (byte) 0);
        }
    }

    public static final void y(mm40 mm40Var, v0q0 v0q0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1067429429);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(v0q0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            zwp0.a(v0q0Var, u1c.M(216098466, new brw(((ThemeColors) fetVar.k(zfnVar)).getSecondary(), rsm0.w(R.string.tennis_win_loss_title, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), function1, (byte) 1), fetVar), fetVar, ((i3 >> 3) & 14) | 48);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var2, v0q0Var, function1, i2, (byte) 6);
        }
    }

    public static final void z(int i2, fet fetVar, mm40 mm40Var, final l7m0 l7m0Var, final Function1 function1) {
        Function1 function2;
        Object obj;
        boolean z2;
        boolean z3;
        ugd ugdVar;
        boolean z4;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1399710259);
        byte b2 = 4;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Activity activity = (Activity) fetVar.k(cr00.f4820a);
            androidx.compose.runtime.d dVar = bmd.h;
            Object obj2 = (w6k) fetVar.k(dVar);
            yje yjeVar = null;
            Object window = activity != null ? activity.getWindow() : null;
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (objP == obj3) {
                objP = androidx.compose.runtime.e.e(new ycl(0.0f));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(window) | fetVar.g(obj2);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj3) {
                Object obj4 = window;
                objP2 = new qkb0(obj4, pz40Var, obj2, yjeVar, (byte) 5);
                obj = obj4;
                fetVar.o0(objP2);
            } else {
                obj = window;
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            boolean zI2 = fetVar.i(obj);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj3) {
                objP3 = new eme0(obj, (byte) 8);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            if (((ycl) pz40Var.getValue()).f42389a == 0.0f) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new mpb0(mm40Var, l7m0Var, function1, i2, (byte) 4);
                    return;
                }
                return;
            }
            Object objP4 = fetVar.P();
            byte b4 = 20;
            if (objP4 == obj3) {
                objP4 = jgk0.b(new gvb0(l7m0Var, pz40Var, b4));
                fetVar.o0(objP4);
            }
            final l7m0 l7m0Var2 = (l7m0) objP4;
            zcl zclVar = qmk.f28987a;
            final float f2 = ((ycl) pz40Var.getValue()).f42389a + 56.0f;
            float f3 = ((ycl) l7m0Var2.getValue()).f42389a;
            w6k w6kVar = (w6k) fetVar.k(dVar);
            float fW0 = w6kVar.w0(f3) + w6kVar.w0(16.0f);
            Object objP5 = fetVar.P();
            if (objP5 == obj3) {
                pel pelVar = new pel();
                pelVar.a(ot2.f25810a, fW0);
                pelVar.a(ot2.b, 0.0f);
                float[] fArr = pelVar.b;
                ArrayList arrayList = pelVar.f26860a;
                int size = arrayList.size();
                nx3.a(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                Object vtjVar = new vtj(arrayList, fArrCopyOfRange);
                fetVar.o0(vtjVar);
                objP5 = vtjVar;
            }
            vtj vtjVar2 = (vtj) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj3) {
                objP6 = new rv2(vtjVar2, ot2.f25810a);
                fetVar.o0(objP6);
            }
            rv2 rv2Var = (rv2) objP6;
            float f4 = ((ycl) l7m0Var2.getValue()).f42389a;
            rv2Var.getClass();
            w6k w6kVar2 = (w6k) fetVar.k(dVar);
            float fW1 = w6kVar2.w0(16.0f) + w6kVar2.w0(f4);
            boolean zD = fetVar.d(fW1);
            Object objP7 = fetVar.P();
            if (zD || objP7 == obj3) {
                objP7 = jgk0.b(new p1d(rv2Var, fW1, b3));
                fetVar.o0(objP7);
            }
            l7m0 l7m0Var3 = (l7m0) objP7;
            Object objP8 = fetVar.P();
            byte b5 = 3;
            if (objP8 == obj3) {
                objP8 = jgk0.b(new f7f0(l7m0Var3, b5));
                fetVar.o0(objP8);
            }
            l7m0 l7m0Var4 = (l7m0) objP8;
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            WeakHashMap weakHashMap = djv0.w;
            boolean z5 = zcm0.i(fetVar).c.e().d > 0;
            Object objP9 = fetVar.P();
            if (objP9 == obj3) {
                objP9 = jgk0.b(new f7f0(l7m0Var, b2));
                fetVar.o0(objP9);
            }
            l7m0 l7m0Var5 = (l7m0) objP9;
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            Object objP10 = fetVar.P();
            if (objP10 == obj3) {
                objP10 = new cqq();
                fetVar.o0(objP10);
            }
            cqq cqqVar = (cqq) objP10;
            Boolean boolValueOf = Boolean.valueOf(z5);
            boolean zH = fetVar.h(z5) | fetVar.i(wpqVar) | fetVar.g(pz40VarF);
            Object objP11 = fetVar.P();
            if (zH || objP11 == obj3) {
                boolean z6 = z5;
                objP11 = new hxe0(z6, cqqVar, wpqVar, pz40VarF, null, (byte) 1);
                z2 = z6;
                fetVar.o0(objP11);
            } else {
                z2 = z5;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP11);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zH2 = fetVar.h(z2) | fetVar.g(rv2Var);
            Object objP12 = fetVar.P();
            if (zH2 || objP12 == obj3) {
                objP12 = new a220(z2, (Object) rv2Var, (yje) null, (byte) 20);
                fetVar.o0(objP12);
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) objP12);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            pz40 pz40Var2 = s6t0.f31722a;
            mm40 mm40VarJ = ju70.J(y860.b0(i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n), cqqVar), null, (3 & 1) != 0);
            float f5 = ((ycl) l7m0Var2.getValue()).f42389a;
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            if (((Boolean) l7m0Var5.getValue()).booleanValue()) {
                fetVar.e0(1581505869);
                ugd ugdVarM = u1c.M(1107399265, new t5e0(l7m0Var, function1, (byte) 14), fetVar);
                z3 = false;
                fetVar.r(false);
                ugdVar = ugdVarM;
            } else {
                z3 = false;
                fetVar.e0(1581802166);
                fetVar.r(false);
                ugdVar = null;
            }
            gq80.m(mm40VarJ, f5, rv2Var, l7m0Var3, backgroundContent, jM121getTransparent0d7_KjU, 0L, 0.0f, null, u1c.M(-912663989, new ydr() { // from class: a.naf0
                @Override // a.ydr
                public final Object j(Object obj5, Object obj6, Object obj7, Object obj8) {
                    int i4;
                    l7m0 l7m0Var6 = (l7m0) obj5;
                    ycl yclVar = (ycl) obj6;
                    fet fetVar2 = (fet) obj7;
                    int iIntValue = ((Integer) obj8).intValue();
                    l7m0Var6.getClass();
                    if ((iIntValue & 6) == 0) {
                        i4 = (fetVar2.g(l7m0Var6) ? 4 : 2) | iIntValue;
                    } else {
                        i4 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i4 |= fetVar2.d(yclVar.f42389a) ? 32 : 16;
                    }
                    if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
                        j47.J(null, ((nbf0) l7m0Var.getValue()).f23236a, l7m0Var6, ((ycl) l7m0Var2.getValue()).f42389a, f2, yclVar.f42389a, function1, fetVar2, ((i4 << 6) & 896) | ((i4 << 12) & 458752));
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1836874080, new x2g((Object) l7m0Var, (Object) rv2Var, (Object) cqqVar, (Object) function1, (byte) 6), fetVar), ugdVar, fetVar, 1572864);
            if (((nbf0) l7m0Var.getValue()).d) {
                fetVar.e0(1581859207);
                boolean zBooleanValue = ((Boolean) l7m0Var4.getValue()).booleanValue();
                mm40 mm40VarN = jm40.b;
                if (!zBooleanValue) {
                    mm40VarN = s5x0.N(mm40VarN, 0.0f, f2, 0.0f, 0.0f, 13);
                }
                z4 = false;
                w(0, fetVar, mm40VarN);
                fetVar.r(false);
            } else {
                z4 = false;
                fetVar.e0(1582001435);
                fetVar.r(false);
            }
            l7m0 l7m0Var6 = ((nbf0) l7m0Var.getValue()).f23236a;
            if ((i3 & 896) == 256) {
                z4 = true;
            }
            Object objP13 = fetVar.P();
            if (z4 || objP13 == obj3) {
                function2 = function1;
                objP13 = new pme0(function2, (byte) 6);
                fetVar.o0(objP13);
            } else {
                function2 = function1;
            }
            j47.h0(null, l7m0Var6, l7m0Var3, (Function0) objP13, fetVar, 0);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new mpb0(mm40Var, l7m0Var, function2, i2, (byte) 5);
        }
    }

    public aty T(aty atyVar) {
        atyVar.getClass();
        return atyVar;
    }
}

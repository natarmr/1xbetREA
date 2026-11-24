package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qim0 {
    public static final void a(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(384951940);
        if (fetVar.U(i & 1, i != 0)) {
            t53 t53VarK = ffb0.K(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Unit unit = Unit.f46060a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new nbd(pz40Var, null, (byte) 5);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            s4u0 s4u0VarX = oja0.X(t53VarK, ((Boolean) pz40Var.getValue()).booleanValue(), fetVar);
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.c(s4u0VarX, null, o7k0.n(s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), fetVar2, 56, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new efr0(i, (byte) 10);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        int i2;
        fetVar.g0(601723279);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
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
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new l00(str, (byte) 10);
                fetVar.o0(objP);
            }
            kkb.p(1, fetVar, null, (Function0) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            boolean z2 = (i3 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new l00(str2, (byte) 11);
                fetVar.o0(objP2);
            }
            kkb.p(0, fetVar, mm40VarN, (Function0) objP2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) str, (Object) str2, i, (byte) 19);
        }
    }

    public static final void c(mm40 mm40Var, lpm lpmVar, fet fetVar, int i) {
        fetVar.g0(1572148727);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(lpmVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n4c.l(mm40Var, lpmVar, false, fetVar, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bx40(mm40Var, lpmVar, i, b);
        }
    }

    public static final void d(mm40 mm40Var, a0z a0zVar, Function1 function1, fet fetVar, int i) {
        a0zVar.getClass();
        function1.getClass();
        fetVar.g0(-298027145);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a0zVar) ? 32 : 16) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mim0 mim0Var = a0zVar.k;
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u5l0((Object) function1, (Object) a0zVar, (byte) 20);
                fetVar.o0(objP);
            }
            lgb.n(mm40Var, mim0Var, true, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, a0zVar, function1, i, (byte) 1);
        }
    }

    public static final void e(mm40 mm40Var, pz40 pz40Var, fet fetVar, int i) {
        fetVar.g0(-1061596770);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(pz40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new zhl0(pz40Var, (byte) 23);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new zhl0(pz40Var, (byte) 24);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            Object[] objArr3 = new Object[0];
            boolean z3 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new zhl0(pz40Var, (byte) 25);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP3, fetVar);
            Object[] objArr4 = new Object[0];
            boolean z4 = i3 == 32;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new zhl0(pz40Var, (byte) 26);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP4, fetVar);
            Object[] objArr5 = new Object[0];
            boolean z5 = i3 == 32;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new zhl0(pz40Var, (byte) 27);
                fetVar.o0(objP5);
            }
            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP5, fetVar);
            Object[] objArr6 = new Object[0];
            boolean z6 = i3 == 32;
            Object objP6 = fetVar.P();
            if (z6 || objP6 == cl5Var) {
                objP6 = new zhl0(pz40Var, (byte) 28);
                fetVar.o0(objP6);
            }
            l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP6, fetVar);
            Object[] objArr7 = new Object[0];
            boolean z7 = i3 == 32;
            Object objP7 = fetVar.P();
            if (z7 || objP7 == cl5Var) {
                objP7 = new zhl0(pz40Var, (byte) 29);
                fetVar.o0(objP7);
            }
            l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP7, fetVar);
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                pz40 pz40Var2 = s6t0.f31722a;
                objP8 = new gpe(s6t0.b().f33626a.getBackgroundContent());
                fetVar.o0(objP8);
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 64.0f);
            pz40 pz40Var3 = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            z1x.m(s5x0.L(i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 0.0f, 2), null, gqw0.k, u1c.M(1282682825, new sqc0((Object) l7m0VarY5, (Object) l7m0VarY2, (Object) l7m0VarY4, (byte) 18), fetVar), u1c.M(245566248, new sqc0((Object) l7m0VarY, (Object) l7m0VarY3, objP8, (byte) 19), fetVar), u1c.M(-791550329, new c2s(l7m0VarY6, l7m0VarY7, (byte) 1), fetVar), fetVar, 224640, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esw(mm40Var, pz40Var, i, (byte) 10);
        }
    }

    public static final void f(ywr0 ywr0Var, fet fetVar, int i) {
        float f;
        jm40 jm40Var;
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(-110725505);
        int i2 = (fetVar3.g(ywr0Var) ? 4 : 2) | i;
        if (fetVar3.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(o7k0.e(mm40VarD, 22.0f), 6.0f, 2.0f, 8.0f, 0.0f, 8), "BRACKET_MATCH_HEADER");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE0);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (ywr0Var.f43386a.length() > 0) {
                fetVar3.e0(-1937748076);
                jm40Var = jm40Var2;
                f = 1.0f;
                j6n.h(ywr0Var.f43386a, lso0.f20590a, s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 0, 0, fetVar3, 48, 24);
                fetVar2 = fetVar3;
                fetVar2.r(false);
            } else {
                f = 1.0f;
                jm40Var = jm40Var2;
                fetVar2 = fetVar3;
                fetVar2.e0(-1937543073);
                fetVar2.r(false);
            }
            if (ywr0Var.c.length() > 0) {
                fetVar2.e0(-1937475307);
                j6n.h(ywr0Var.c, opo0.f25653a, s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 0, 0, fetVar, 48, 24);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1937271265);
                fetVar2.r(false);
            }
            if (ywr0Var.d.length() > 0) {
                fetVar2.e0(-1937198043);
                j6n.h(ywr0Var.d, rpo0.f30897a, s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 0, 0, fetVar, 48, 24);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1936978625);
                fetVar2.r(false);
            }
            if (ywr0Var.b.length() > 0) {
                fetVar2.e0(-1936922546);
                fetVar3 = fetVar;
                j6n.h(ywr0Var.b, kro0.f18776a, s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 0, 0, fetVar3, 48, 24);
                qxw.o(fetVar3, new x7z(f, true));
                a(0, fetVar3);
                fetVar3.r(false);
            } else {
                fetVar3 = fetVar2;
                fetVar3.e0(-1936629441);
                fetVar3.r(false);
            }
            fetVar3.r(true);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p6r0(ywr0Var, i, (byte) 15);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1009616536);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.K(jm40Var, 4.0f, 12.0f), 96.0f), 12.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), 78.0f)), fqj0VarD0));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), 78.0f)), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 78.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 27);
        }
    }

    public static final void h(mm40 mm40Var, final o580 o580Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        o580Var.getClass();
        fetVar.g0(-1950946057);
        final byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(o580Var) ? 32 : 16;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            vdx.n(o7k0.e(mm40Var, 52.0f), u1c.M(-1802233307, new Function2() { // from class: a.gxs0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b2;
                    jm40 jm40Var = jm40.b;
                    pcy pcyVar = e7z.u1;
                    o580 o580Var2 = o580Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                                int iHashCode = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM = fetVar3.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(pcyVar);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, thg0VarA, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar3);
                                hxm0.h(ohs0.i(fetVar3, mm40VarC0, gqw0.v, 1.0f, true), o580Var2.f24676a, gqw0.f, 0, fetVar3, 384, 8);
                                mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                                zcl zclVar2 = qmk.f28987a;
                                qim0.b(0, fetVar3, s5x0.N(mm40VarY, 8.0f, 0.0f, 0.0f, 0.0f, 14), o580Var2.c, o580Var2.d);
                                fetVar3.r(true);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zcl zclVar3 = qmk.f28987a;
                                qim0.c(s5x0.L(jm40Var, 8.0f, 0.0f, 2), o580Var2.g, fetVar4, 0);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                                int iHashCode2 = Long.hashCode(fetVar5.T);
                                bh90 bh90VarM2 = fetVar5.m();
                                jm40 jm40Var2 = jm40.b;
                                mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var2);
                                mkd.c0.getClass();
                                fetVar5.i0();
                                if (fetVar5.S) {
                                    fetVar5.l(pcyVar);
                                } else {
                                    fetVar5.r0();
                                }
                                jpm0.o(fetVar5, thg0VarA2, gqw0.x);
                                jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar5);
                                jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                                qim0.b(6, fetVar5, o7k0.y(jm40Var2, null, 3), o580Var2.e, o580Var2.f);
                                zcl zclVar4 = qmk.f28987a;
                                hxm0.h(dw9.h(1.0f, s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), o580Var2.b, gqw0.d, 0, fetVar5, 384, 8);
                                fetVar5.r(true);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1029191356, new Function2() { // from class: a.gxs0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    jm40 jm40Var = jm40.b;
                    pcy pcyVar = e7z.u1;
                    o580 o580Var2 = o580Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                                int iHashCode = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM = fetVar3.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(pcyVar);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, thg0VarA, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar3);
                                hxm0.h(ohs0.i(fetVar3, mm40VarC0, gqw0.v, 1.0f, true), o580Var2.f24676a, gqw0.f, 0, fetVar3, 384, 8);
                                mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                                zcl zclVar2 = qmk.f28987a;
                                qim0.b(0, fetVar3, s5x0.N(mm40VarY, 8.0f, 0.0f, 0.0f, 0.0f, 14), o580Var2.c, o580Var2.d);
                                fetVar3.r(true);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zcl zclVar3 = qmk.f28987a;
                                qim0.c(s5x0.L(jm40Var, 8.0f, 0.0f, 2), o580Var2.g, fetVar4, 0);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                                int iHashCode2 = Long.hashCode(fetVar5.T);
                                bh90 bh90VarM2 = fetVar5.m();
                                jm40 jm40Var2 = jm40.b;
                                mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var2);
                                mkd.c0.getClass();
                                fetVar5.i0();
                                if (fetVar5.S) {
                                    fetVar5.l(pcyVar);
                                } else {
                                    fetVar5.r0();
                                }
                                jpm0.o(fetVar5, thg0VarA2, gqw0.x);
                                jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar5);
                                jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                                qim0.b(6, fetVar5, o7k0.y(jm40Var2, null, 3), o580Var2.e, o580Var2.f);
                                zcl zclVar4 = qmk.f28987a;
                                hxm0.h(dw9.h(1.0f, s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), o580Var2.b, gqw0.d, 0, fetVar5, 384, 8);
                                fetVar5.r(true);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-256149405, new Function2() { // from class: a.gxs0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b;
                    jm40 jm40Var = jm40.b;
                    pcy pcyVar = e7z.u1;
                    o580 o580Var2 = o580Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                                int iHashCode = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM = fetVar3.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
                                mkd.c0.getClass();
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(pcyVar);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, thg0VarA, gqw0.x);
                                jpm0.o(fetVar3, bh90VarM, gqw0.w);
                                jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar3);
                                hxm0.h(ohs0.i(fetVar3, mm40VarC0, gqw0.v, 1.0f, true), o580Var2.f24676a, gqw0.f, 0, fetVar3, 384, 8);
                                mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
                                zcl zclVar2 = qmk.f28987a;
                                qim0.b(0, fetVar3, s5x0.N(mm40VarY, 8.0f, 0.0f, 0.0f, 0.0f, 14), o580Var2.c, o580Var2.d);
                                fetVar3.r(true);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zcl zclVar3 = qmk.f28987a;
                                qim0.c(s5x0.L(jm40Var, 8.0f, 0.0f, 2), o580Var2.g, fetVar4, 0);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                                int iHashCode2 = Long.hashCode(fetVar5.T);
                                bh90 bh90VarM2 = fetVar5.m();
                                jm40 jm40Var2 = jm40.b;
                                mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var2);
                                mkd.c0.getClass();
                                fetVar5.i0();
                                if (fetVar5.S) {
                                    fetVar5.l(pcyVar);
                                } else {
                                    fetVar5.r0();
                                }
                                jpm0.o(fetVar5, thg0VarA2, gqw0.x);
                                jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar5);
                                jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                                qim0.b(6, fetVar5, o7k0.y(jm40Var2, null, 3), o580Var2.e, o580Var2.f);
                                zcl zclVar4 = qmk.f28987a;
                                hxm0.h(dw9.h(1.0f, s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), o580Var2.b, gqw0.d, 0, fetVar5, 384, 8);
                                fetVar5.r(true);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar2, 3504);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) o580Var, i, (byte) 14);
        }
    }

    public static final void i(lc00 lc00Var, m9s m9sVar, yxg yxgVar, ctf0 ctf0Var) {
        int i;
        m9s m9sVar2 = m9sVar;
        m9sVar2.getClass();
        ctf0Var.getClass();
        qqs qqsVar = m9sVar2.h;
        List list = qqsVar.c;
        if (qqsVar.c.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("VOLLEYBALL_HEADER_KEY", R.string.set_statistics));
        String str = m9sVar2.i;
        String str2 = m9sVar2.j;
        int i2 = qqsVar.f;
        int i3 = 1;
        boolean z = i2 == 1;
        boolean z2 = i2 == 2;
        boolean z3 = yxgVar instanceof fvg;
        int i4 = R.drawable.cybergame_synthetic_marble_volleyball_header_bg;
        if (!z3 && (yxgVar instanceof ltg)) {
            i4 = R.drawable.cybergame_synthetic_cyber_volleyball_header_bg;
        }
        lc00Var.add(new fvu0(i4, str, str2, z, z2));
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            ve90 ve90Var = (ve90) obj;
            String strM = twn.m(i5, "VOLLEYBALL_KEY");
            int i7 = i3;
            String strA = ctf0Var.b.a(R.string.cybergame_synthetic_set_v2, Arrays.copyOf(new Object[]{ve90Var.f37273a}, i3));
            String str3 = ve90Var.b;
            String str4 = ve90Var.c;
            String str5 = m9sVar2.i;
            String str6 = m9sVar2.j;
            int i8 = qqsVar.f;
            if ((list.size() + (-1) == i5 ? i7 : 0) == 0) {
                if (i5 % 2 == 0) {
                    i = R.drawable.cybergame_synthetic_football_first_bg;
                } else {
                    i = R.drawable.cybergame_synthetic_marble_volleyball_second_bg;
                    if (!z3 && (yxgVar instanceof ltg)) {
                        i = R.drawable.cybergame_synthetic_cyber_volleyball_second_bg;
                    }
                }
            } else if (i5 % 2 == 0) {
                i = R.drawable.cybergame_synthetic_mortal_second_last_bg;
            } else {
                i = R.drawable.cybergame_synthetic_marble_volleyball_last_bg;
                if (!z3 && (yxgVar instanceof ltg)) {
                    i = R.drawable.cybergame_synthetic_cyber_volleyball_last_bg;
                }
            }
            lc00Var.add(new gvu0(strM, strA, str3, str4, str5, str6, i8, i));
            m9sVar2 = m9sVar;
            i5 = i6;
            i3 = i7;
        }
    }

    public static final void j(cp cpVar, ftn0 ftn0Var) {
        DsTimer dsTimer = ((jtn0) cpVar.u).n;
        dsTimer.setTimerType(ftn0Var.b);
        dsTimer.setVisibility(ftn0Var.d ? 0 : 8);
        dsTimer.setTime(ftn0Var.f10122a);
        dsTimer.setTimeDirection(ftn0Var.c);
        if (ftn0Var.e) {
            dsTimer.d();
        }
    }

    public static final gbp0 k(fbp0 fbp0Var, dxh0 dxh0Var, boolean z, e9p0 e9p0Var, obp0 obp0Var) {
        return new gbp0(fbp0Var, dyb.o0((e9p0Var == null && obp0Var == null && !z) ? iun.f15405a : q3d.j(dbp0.c, ebp0.c)), dxh0Var);
    }

    public static final boolean l(long j, List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (j == ((Number) it.next()).longValue()) {
                return true;
            }
        }
        return false;
    }

    public static final String m(b1u0 b1u0Var, List list) {
        b1u0Var.getClass();
        list.getClass();
        String str = b1u0Var.d;
        if (str.length() != 0) {
            return str;
        }
        String strK = zsm0.k(b1u0Var.c, list, q3d.j(String.valueOf(b1u0Var.b), String.valueOf(b1u0Var.f1825a)));
        if (kotlin.text.c.x(strK, ujn.h, false)) {
            return strK;
        }
        if (strK.length() == 0) {
            return "";
        }
        List list2 = u0d.f34849a;
        if (u0d.c(strK)) {
            return "";
        }
        return String.format(Locale.ENGLISH, StringsKt.O(strK, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, strK}, 2));
    }

    public static final wqd n(ard ardVar) {
        Double d = ardVar.f1340a;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String str = ardVar.b;
        if (str == null) {
            str = "";
        }
        Double d2 = ardVar.c;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = ardVar.d;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        Double d4 = ardVar.e;
        if (d4 != null) {
            return new wqd(dDoubleValue, str, dDoubleValue2, dDoubleValue3, d4.doubleValue());
        }
        jf4.k(null);
        return null;
    }

    public static final xqd o(ard ardVar) {
        Double d = ardVar.f1340a;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String str = ardVar.b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Double d2 = ardVar.c;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Integer num = ardVar.f;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = ardVar.g;
        if (num2 != null) {
            return new xqd(dDoubleValue, dDoubleValue2, iIntValue, num2.intValue(), str2);
        }
        jf4.k(null);
        return null;
    }

    public static final mzb0 p(szb0 szb0Var) {
        Long l;
        long jLongValue = (szb0Var == null || (l = szb0Var.f33065a) == null) ? 0L : l.longValue();
        String str = szb0Var != null ? szb0Var.b : null;
        if (str == null) {
            str = "";
        }
        return new mzb0(jLongValue, str);
    }

    public static final huo0 q(luo0 luo0Var, sba0 sba0Var) {
        ard ardVar;
        luo0Var.getClass();
        if (iuo0.f15406a[sba0Var.ordinal()] == 1 && (ardVar = luo0Var.b) != null) {
            szb0 szb0Var = ardVar.h;
            Integer num = luo0Var.f20683a;
            if (num != null && num.intValue() == 1) {
                return new wdt(n(ardVar), p(szb0Var));
            }
            if (num != null && num.intValue() == 2) {
                return new xdt(n(ardVar), p(szb0Var));
            }
            if (num != null && num.intValue() == 3) {
                return new ydt(o(ardVar), p(szb0Var));
            }
            if (num != null && num.intValue() == 4) {
                return new zdt(o(ardVar), p(szb0Var));
            }
        }
        return guo0.f11940a;
    }

    public static final ohm0 r(rpp0 rpp0Var, List list, List list2, List list3) {
        rpp0Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        if (rpp0Var instanceof qpp0) {
            qpp0 qpp0Var = (qpp0) rpp0Var;
            long j = qpp0Var.f;
            long j2 = qpp0Var.e;
            boolean zL = l(j2, list3);
            boolean zL2 = l(j, list3);
            String str = (String) CollectionsKt.firstOrNull(list);
            if (str == null) {
                str = "";
            }
            String strS = vsm0.s(j2, str);
            String str2 = (String) CollectionsKt.firstOrNull(list2);
            return new tpp0(qpp0Var.e, qpp0Var.f, zL, zL2, strS, vsm0.s(j, str2 != null ? str2 : ""), zL ? R.drawable.ic_favorite_star_checked : R.drawable.ic_favorite_star_unchecked, zL2 ? R.drawable.ic_favorite_star_checked : R.drawable.ic_favorite_star_unchecked, qpp0Var.g, qpp0Var.h);
        }
        if (!(rpp0Var instanceof ppp0)) {
            t9f.b();
            return null;
        }
        ppp0 ppp0Var = (ppp0) rpp0Var;
        Pair pair = ppp0Var.f;
        Pair pair2 = ppp0Var.e;
        boolean zL3 = l(((Number) pair2.f46059a).longValue(), list3);
        boolean zL4 = l(((Number) pair2.b).longValue(), list3);
        boolean zL5 = l(((Number) pair.f46059a).longValue(), list3);
        boolean zL6 = l(((Number) pair.b).longValue(), list3);
        long jLongValue = ((Number) pair2.f46059a).longValue();
        long jLongValue2 = ((Number) pair2.b).longValue();
        long jLongValue3 = ((Number) pair.f46059a).longValue();
        long jLongValue4 = ((Number) pair.b).longValue();
        String str3 = (String) CollectionsKt.firstOrNull(list);
        if (str3 == null) {
            str3 = "";
        }
        String strS2 = vsm0.s(((Number) pair2.f46059a).longValue(), str3);
        String str4 = (String) CollectionsKt.W(1, list);
        if (str4 == null) {
            str4 = "";
        }
        String strS3 = vsm0.s(((Number) pair2.b).longValue(), str4);
        String str5 = (String) CollectionsKt.firstOrNull(list2);
        if (str5 == null) {
            str5 = "";
        }
        String strS4 = vsm0.s(((Number) pair.f46059a).longValue(), str5);
        String str6 = (String) CollectionsKt.W(1, list2);
        return new spp0(jLongValue, jLongValue2, jLongValue3, jLongValue4, zL3, zL4, zL5, zL6, strS2, strS3, strS4, vsm0.s(((Number) pair.b).longValue(), str6 != null ? str6 : ""), zL3 ? R.drawable.ic_favorite_star_checked : R.drawable.ic_favorite_star_unchecked, zL4 ? R.drawable.ic_favorite_star_checked : R.drawable.ic_favorite_star_unchecked, zL5 ? R.drawable.ic_favorite_star_checked : R.drawable.ic_favorite_star_unchecked, zL6 ? R.drawable.ic_favorite_star_checked : R.drawable.ic_favorite_star_unchecked, ppp0Var.g, ppp0Var.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 a.xfq0, still in use, count: 3, list:
          (r1v0 a.xfq0) from 0x01d0: MOVE (r19v0 a.xfq0) = (r1v0 a.xfq0) (LINE:465)
          (r1v0 a.xfq0) from 0x012d: MOVE (r19v2 a.xfq0) = (r1v0 a.xfq0) (LINE:302)
          (r1v0 a.xfq0) from 0x00bc: PHI (r1v19 a.xfq0) = (r1v0 a.xfq0), (r1v22 a.xfq0) binds: [B:42:0x00ae, B:55:0x0116] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final a.xfq0 s(a.o9r r24) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qim0.s(a.o9r):a.xfq0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    public static final xfq0 t(mft mftVar) {
        xeq0 xeq0Var;
        pft pftVar;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        List<cm50> list;
        List<fkv0> list2;
        List<dft> list3;
        Double d;
        Double d2;
        Double d3;
        List list4;
        mftVar.getClass();
        Integer num = mftVar.f21710a;
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        List list5 = mftVar.b;
        if (list5 == null || (pftVar = (pft) CollectionsKt.firstOrNull(list5)) == null) {
            iun iunVar = iun.f15405a;
            xeq0Var = new xeq0(iunVar, iunVar, iunVar, iunVar, iunVar);
        } else {
            zom0 zom0Var = pftVar.f26922a;
            List listJ = (zom0Var == null || (list4 = zom0Var.d) == null) ? iun.f15405a : ihm0.j(list4);
            if (zom0Var == null || (list3 = zom0Var.b) == null) {
                arrayList = 0;
            } else {
                arrayList = new ArrayList(r3d.q(list3, 10));
                for (dft dftVar : list3) {
                    dftVar.getClass();
                    Integer num2 = dftVar.f6016a;
                    List list6 = dftVar.b;
                    arrayList.add(new aeq0(num2 != null ? gnm0.x(num2.intValue()) : lgq0.f20020a, (list6 == null || (d3 = (Double) CollectionsKt.W(0, list6)) == null) ? 0.0d : d3.doubleValue(), (list6 == null || (d2 = (Double) CollectionsKt.W(1, list6)) == null) ? 0 : (int) d2.doubleValue(), (list6 == null || (d = (Double) CollectionsKt.W(2, list6)) == null) ? 0 : (int) d.doubleValue()));
                }
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            ?? r10 = arrayList;
            if (zom0Var == null || (list2 = zom0Var.e) == null) {
                arrayList2 = 0;
            } else {
                arrayList2 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (fkv0 fkv0Var : list2) {
                    List<List> list7 = fkv0Var.b;
                    if (list7 != null) {
                        for (List list8 : list7) {
                            Integer num3 = fkv0Var.f9712a;
                            if (num3 == null) {
                                throw new ef5();
                            }
                            arrayList4.add(new xdq0(gnm0.x(num3.intValue()), ((Number) list8.get(i)).intValue(), ((Number) list8.get(1)).intValue()));
                            i = 0;
                        }
                    }
                    arrayList2.add(CollectionsKt.L0(arrayList4));
                    arrayList4.clear();
                    i = 0;
                }
            }
            if (arrayList2 == 0) {
                arrayList2 = iun.f15405a;
            }
            ?? r11 = arrayList2;
            if (zom0Var == null || (list = zom0Var.c) == null) {
                arrayList3 = 0;
            } else {
                arrayList3 = new ArrayList();
                for (cm50 cm50Var : list) {
                    List list9 = cm50Var.b;
                    if (list9 != null) {
                        Iterator it = list9.iterator();
                        while (it.hasNext()) {
                            lgq0 lgq0VarX = gnm0.x(((Number) it.next()).intValue());
                            Integer num4 = cm50Var.f4590a;
                            if (num4 == null) {
                                throw new ef5();
                            }
                            arrayList3.add(new xdq0(lgq0VarX, -1, num4.intValue()));
                        }
                    }
                }
            }
            if (arrayList3 == 0) {
                arrayList3 = iun.f15405a;
            }
            xeq0Var = new xeq0(listJ, r10, r11, arrayList3, iun.f15405a);
        }
        Integer num5 = mftVar.c;
        yeq0 yeq0VarA = num5 != null ? ohm0.A(num5.intValue()) : yeq0.e;
        rk10 rk10Var = mftVar.h;
        csr csrVarA0 = rk10Var != null ? d5c.a0(rk10Var) : csr.e;
        Long l = mftVar.f;
        if (l == null) {
            throw new ef5();
        }
        long jLongValue = l.longValue();
        Double d4 = mftVar.d;
        double dDoubleValue = d4 != null ? d4.doubleValue() : 0.0d;
        Double d5 = mftVar.e;
        double dDoubleValue2 = d5 != null ? d5.doubleValue() : 0.0d;
        Double d6 = mftVar.g;
        if (d6 != null) {
            return new xfq0(iIntValue, xeq0Var, yeq0VarA, csrVarA0, jLongValue, dDoubleValue, dDoubleValue2, d6.doubleValue());
        }
        throw new ef5();
    }

    public static final double u(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String v(int i) {
        return f140.i(i, Separators.PERCENT);
    }

    public static String w(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}

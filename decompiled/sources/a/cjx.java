package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cjx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f4481a;
    public static Boolean b;
    public static final ugd c = new ugd(1696848457, false, new vgd(5));
    public static final ugd d = new ugd(67283188, false, new zgd(11));
    public static final ugd e = new ugd(-494819050, false, new i5b(21));
    public static final ugd f = new ugd(-1624011348, false, new zgd(12));
    public static final ugd g = new ugd(-302232153, false, new zgd(13));
    public static final ugd h = new ugd(640141841, false, new qbd((byte) 22));
    public static final ugd i = new ugd(1463610627, false, new qbd((byte) 23));
    public static final ugd j = new ugd(644776125, false, new chd(18));
    public static final ugd k = new ugd(-791969028, false, new jhd(16));
    public static final ugd l = new ugd(-1199379391, false, new jhd(17));
    public static final ugd m = new ugd(403976656, false, new jhd(18));
    public static final ugd n = new ugd(-516644545, false, new qhd(0));
    public static final vlf o = new vlf(26);
    public static final khq p = new khq(0);
    public static final l13 q = new l13((byte) 18);

    public static final void A(n2g0 n2g0Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1015885291);
        int i3 = i2 | (fetVar2.g(n2g0Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 8.0f, 16.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            String str = n2g0Var.f22799a;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            y9q0 y9q0Var = new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarD2, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 48, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.e0(1375016700);
            Iterator<E> it = n2g0Var.b.iterator();
            while (it.hasNext()) {
                C((c5g0) it.next(), fetVar2, 0);
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(n2g0Var, i2, (byte) 23);
        }
    }

    public static final void B(mm40 mm40Var, b4g0 b4g0Var, e2d e2dVar, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        jm40 jm40Var;
        Function1 function2 = function1;
        b4g0Var.getClass();
        qdzVar.getClass();
        function2.getClass();
        fetVar.g0(-94164672);
        int i3 = i2 | 6;
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(b4g0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(e2dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = 57344 & i3;
            boolean z = i4 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new pme0(function2, (byte) 15);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new pme0(function2, b2);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE = i120.Q(jm40Var2, background, ljcVar).e(o7k0.c);
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
            if (b4g0Var instanceof z3g0) {
                fetVar.e0(1858701688);
                z3g0 z3g0Var = (z3g0) b4g0Var;
                x4g0 x4g0Var = z3g0Var.c;
                boolean z3 = z3g0Var.f43716a;
                boolean z4 = z3g0Var.b;
                int i5 = (i3 << 6) & 4186112;
                if (x4g0Var instanceof l4g0) {
                    fetVar.e0(1763973484);
                    mrv.B(jm40Var2, ((l4g0) x4g0Var).f19404a, function2, fetVar, (i5 >> 12) & 896);
                    fetVar.r(false);
                } else {
                    if (x4g0Var instanceof o4g0) {
                        fetVar.e0(1763978444);
                        dwi0.n(jm40Var2, ((o4g0) x4g0Var).f24634a, function2, fetVar, (i5 >> 12) & 896);
                        fetVar.r(false);
                    } else if (x4g0Var instanceof u4g0) {
                        fetVar.e0(-1151075217);
                        int i6 = i5 >> 9;
                        jm40Var = jm40Var2;
                        mrv.J(jm40Var, e2dVar, qdzVar, ((u4g0) x4g0Var).f35047a, true, z3, false, z4, function2, fetVar, (i6 & 896) | 1597440 | (i6 & 112) | ((i5 << 6) & 234881024));
                        fetVar.r(false);
                        function2 = function1;
                    } else {
                        jm40Var = jm40Var2;
                        if (!(x4g0Var instanceof r4g0)) {
                            throw b1j.f(1763973109, fetVar, false);
                        }
                        fetVar.e0(-1150627360);
                        r4g0 r4g0Var = (r4g0) x4g0Var;
                        a4x a4xVar = r4g0Var.f29833a;
                        boolean z5 = r4g0Var.b;
                        int i7 = i5 >> 9;
                        function2 = function1;
                        mrv.J(jm40Var, e2dVar, qdzVar, a4xVar, false, z3, z5, z4, function2, fetVar, (i7 & 896) | (i7 & 112) | 24576 | ((i5 << 6) & 234881024));
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                }
                jm40Var = jm40Var2;
                fetVar.r(false);
            } else {
                jm40Var = jm40Var2;
                if (!(b4g0Var instanceof a4g0)) {
                    throw b1j.f(1858699809, fetVar, false);
                }
                fetVar.e0(1858712850);
                wmf0 wmf0Var = ((a4g0) b4g0Var).c;
                int i8 = i3 >> 6;
                if (wmf0Var instanceof tmf0) {
                    fetVar.e0(-548796606);
                    dwi0.n(jm40Var, ((tmf0) wmf0Var).f34192a, function2, fetVar, i8 & 896);
                    fetVar.r(false);
                } else if (wmf0Var instanceof umf0) {
                    fetVar.e0(-548792824);
                    ntr.A(i8 & 896, fetVar, ((umf0) wmf0Var).f35918a, jm40Var, function2);
                    fetVar.r(false);
                } else if (wmf0Var.equals(vmf0.f37672a)) {
                    fetVar.e0(-548787910);
                    ntr.O(0, fetVar, jm40Var);
                    fetVar.r(false);
                } else {
                    if (!(wmf0Var instanceof smf0)) {
                        throw b1j.f(-548797962, fetVar, false);
                    }
                    fetVar.e0(-548785475);
                    ntr.x(null, ((smf0) wmf0Var).f32443a, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var2, (Object) b4g0Var, (Object) e2dVar, (Object) qdzVar, (Object) function2, i2, (byte) 20);
        }
    }

    public static final void C(c5g0 c5g0Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1226710905);
        int i3 = i2 | (fetVar2.g(c5g0Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = c5g0Var.f3771a;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            y9q0 y9q0VarK = g1t0.k();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, x7zVar, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarK, fetVar, 0, 0, 131064);
            if (0.25f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(c5g0Var.b, new x7z(0.25f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.25f, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 0, 0, null, g1t0.j(), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(c5g0Var, i2, (byte) 24);
        }
    }

    public static final void D(a4x a4xVar, fet fetVar, int i2) {
        fetVar.g0(773881763);
        int i3 = (fetVar.g(a4xVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            boolean z = false;
            xx7 xx7Var = gqw0.n;
            if ((i3 & 14) == 4) {
                z = true;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new oea(a4xVar, (byte) 23);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, null, null, null, xx7Var, null, false, null, (Function1) objP, fetVar, 196614, 478);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i2, (byte) 20);
        }
    }

    public static final void E(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-949111270);
        byte b2 = 16;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new ybt0(l7m0Var, b2));
                fetVar.o0(objP);
            }
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            x7v0 x7v0Var = ((y7v0) ((l7m0) objP).getValue()).f42172a;
            byte b3 = 6;
            if (Intrinsics.d(x7v0Var, v7v0.f36949a)) {
                fetVar.e0(-1203774625);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = jgk0.b(new ybt0(l7m0Var, (byte) 17));
                    fetVar.o0(objP2);
                }
                F(((i3 << 3) & 896) | 6, fetVar, xczVarA, (l7m0) objP2, function1);
                fetVar.r(false);
            } else {
                if (!(x7v0Var instanceof w7v0)) {
                    throw b1j.f(-1562854573, fetVar, false);
                }
                fetVar.e0(-1203457681);
                n0q n0qVar = o7k0.c;
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
                mdm mdmVar = ((w7v0) x7v0Var).f38692a;
                boolean z = (i3 & 112) == 32;
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new ntu0(function1, b3);
                    fetVar.o0(objP3);
                }
                jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar, 0, 4);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i2, b2);
        }
    }

    public static final void F(int i2, fet fetVar, xcz xczVar, l7m0 l7m0Var, Function1 function1) {
        int i3;
        fetVar.g0(-1302615166);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float f2 = xfn.a(fetVar).c;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, new qw3(8.0f, true, new jf4((byte) 14)), h97.f(f2, 8.0f, f2, 28.0f, fetVar), false, null, u1c.M(346377476, new nc40(function1, (byte) 25), fetVar), fetVar, (i3 & 112) | 100663302 | ((i3 << 6) & 896), Response.OK);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyy(l7m0Var, xczVar, function1, i2, (byte) 3);
        }
    }

    public static final void G(mm40 mm40Var, s8l0 s8l0Var, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        long primary;
        s8l0Var.getClass();
        function0.getClass();
        fetVar.g0(1245518581);
        int i3 = i2 | 6 | (fetVar.g(s8l0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 64.0f), 56.0f);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            byte b2 = 3;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new j1l0(s8l0Var, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.M(y860.W(rq8.K(mm40VarS, (Function1) objP), null, null, false, null, function0, 28), 2.0f, 8.0f, 2.0f, 4.0f), "SPORT_FILTER_ITEM");
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            r8l0 r8l0Var = s8l0Var.c;
            if (s8l0Var.d) {
                pz40 pz40Var = s6t0.f31722a;
                primary = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                primary = s6t0.b().f33626a.getPrimary();
            }
            H(r8l0Var, primary, fetVar, 0);
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
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
            String str = s8l0Var.b;
            boolean z3 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new u3k(s8l0Var, (byte) 3);
                fetVar.o0(objP2);
            }
            mm40Var2 = jm40Var;
            aad.e(str, o2e.e0(jm40Var, "SPORT_FILTER_ITEM_TEXT"), y9q0.e(g1t0.e(), 0L, 0L, null, null, null, 0L, 3, 0L, 16744447), null, 2, false, 2, 0, (n4d) objP2, new n05(qmk.o, g1t0.e().f42262a.b, qmk.n), fetVar, 1597488, 168);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, s8l0Var, function0, i2, (byte) 14);
        }
    }

    public static final void H(r8l0 r8l0Var, long j2, fet fetVar, int i2) {
        fetVar.g0(-1002654311);
        int i3 = (fetVar.g(r8l0Var) ? 4 : 2) | i2 | (fetVar.f(j2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 24.0f);
            if (r8l0Var instanceof p8l0) {
                fetVar.e0(1423157594);
                dww.c(a8k0.F(((p8l0) r8l0Var).f26561a, 0, fetVar), null, o2e.e0(mm40VarN, "SPORT_FILTER_ITEM_IMAGE"), j2, fetVar, 56 | ((i3 << 6) & 7168), 0);
                fetVar.r(false);
            } else {
                if (!(r8l0Var instanceof q8l0)) {
                    throw b1j.f(-1478113713, fetVar, false);
                }
                fetVar.e0(1423397503);
                I((i3 << 3) & 896, j2, fetVar, o2e.e0(mm40VarN, "SPORT_FILTER_ITEM_IMAGE"), ((q8l0) r8l0Var).f28307a);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ub4((byte) 8, i2, j2, r8l0Var);
        }
    }

    public static final void I(int i2, long j2, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        fetVar.g0(-172346649);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j2) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.sport_new, 6, fetVar), fetVar);
            k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
            k1xVar.c = str;
            zcl zclVar = qmk.f28987a;
            k1xVar.c(si30.b(pkd.b(24.0f, fetVar)));
            k7x.b(k1xVar.a(), null, mm40Var, s4u0VarR, s4u0VarR, null, null, null, null, null, gqw0.A, new m78(j2, 5), fetVar, ((i3 << 6) & 896) | 36912, 6, 27616);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e5m((byte) 2, i2, j2, mm40Var, str);
        }
    }

    public static final void J(hh80 hh80Var, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(100671635);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(hh80Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            rah0 rah0VarT = wha0.T(fetVar);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA0 = wha0.a0(s5x0.M(n0qVar, 16.0f, hh80Var.d(), 16.0f, hh80Var.a()), rah0VarT, false, 14);
            int i4 = ((i3 << 6) & 7168) | 48;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
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
            vqd.t(((i4 >> 6) & 112) | 6, ugdVar, y5d.f42040a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) hh80Var, (Object) ugdVar, i2, (byte) 20);
        }
    }

    public static final void K(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-742273663);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (((jkq0) l7m0Var.getValue()).c || ((jkq0) l7m0Var.getValue()).d) {
            fetVar.e0(1712176142);
            i(((jkq0) l7m0Var.getValue()).h, ((jkq0) l7m0Var.getValue()).i, function1, fetVar, (i3 << 3) & 896);
            fetVar.r(false);
        } else {
            fetVar.e0(1712103106);
            n(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 29);
        }
    }

    public static final void L(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(966777886);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            vsm0.h(((b8v0) l7m0Var.getValue()).f2178a, function1, fetVar, i3 & 112);
            E(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i2, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0263  */
    /* JADX WARN: Code duplicated, block: B:106:0x0272  */
    /* JADX WARN: Code duplicated, block: B:110:0x0290  */
    /* JADX WARN: Code duplicated, block: B:112:0x0296  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:136:0x032a  */
    /* JADX WARN: Code duplicated, block: B:138:0x033a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0340  */
    /* JADX WARN: Code duplicated, block: B:143:0x0362  */
    /* JADX WARN: Code duplicated, block: B:145:0x0367  */
    /* JADX WARN: Code duplicated, block: B:148:0x037c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0381  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:78:0x0169  */
    /* JADX WARN: Code duplicated, block: B:80:0x016c  */
    /* JADX WARN: Code duplicated, block: B:82:0x016f  */
    /* JADX WARN: Code duplicated, block: B:83:0x017f  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01af  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x0200  */
    /* JADX WARN: Code duplicated, block: B:95:0x0244  */
    /* JADX WARN: Code duplicated, block: B:98:0x0250  */
    public static final void M(lc00 lc00Var, bba bbaVar, m9s m9sVar, ctf0 ctf0Var, String str) {
        String str2;
        int i2;
        char c2;
        int i3;
        char c3;
        int i4;
        int iOrdinal;
        String strA;
        znq0 znq0Var;
        Long lValueOf;
        int i5;
        StringBuilder sb;
        String str3;
        char c4;
        StringBuilder sb2;
        char c5;
        StringBuilder sb3;
        int i6;
        int i7;
        ArrayList arrayList;
        int i8;
        ArrayList arrayListR;
        ArrayList arrayListR2;
        long jM113getRed0d7_KjU;
        long jM62getBlack0d7_KjU;
        char c6;
        int i9;
        char c7;
        m9sVar.getClass();
        ctf0Var.getClass();
        str.getClass();
        List list = bbaVar.e;
        List list2 = bbaVar.d;
        String str4 = m9sVar.i;
        qqs qqsVar = m9sVar.h;
        zaa zaaVar = bbaVar.f2298a;
        int iOrdinal2 = zaaVar.ordinal();
        String str5 = "";
        if (iOrdinal2 == 1) {
            str2 = "static/img/ImgDefault/Esports/Virtual/CardBasketball/Players/red_simple.png";
        } else if (iOrdinal2 == 2) {
            str2 = "static/img/ImgDefault/Esports/Virtual/CardBasketball/Players/red_lucky.png";
        } else if (iOrdinal2 != 3) {
            str2 = iOrdinal2 != 4 ? "" : "static/img/ImgDefault/Esports/Virtual/CardBasketball/Players/red_sad.png";
        } else {
            str2 = "static/img/ImgDefault/Esports/Virtual/CardBasketball/Players/red_draw.png";
        }
        StringBuilder sb4 = new StringBuilder(ujn.h);
        if (str2.length() == 0) {
            sb4.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb4.setLength(0);
            sb4.append(str2);
        } else {
            if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                i2 = 1;
                c2 = '/';
            } else {
                sb4.append('/');
                c2 = '/';
                i2 = 1;
            }
            char[] cArr = new char[i2];
            cArr[0] = c2;
            sb4.append(StringsKt.y0(str2, cArr));
        }
        String string = sb4.toString();
        String strS = qjj.S(list2);
        String str6 = m9sVar.j;
        int iOrdinal3 = zaaVar.ordinal();
        if (iOrdinal3 == 1) {
            str5 = "static/img/ImgDefault/Esports/Virtual/CardBasketball/Players/black_simple.png";
        } else if (iOrdinal3 == 2) {
            str5 = "static/img/ImgDefault/Esports/Virtual/CardBasketball/Players/black_sad.png";
        } else if (iOrdinal3 == 3) {
            str5 = "static/img/ImgDefault/Esports/Virtual/CardBasketball/Players/black_draw.png";
        } else if (iOrdinal3 == 4) {
            str5 = "static/img/ImgDefault/Esports/Virtual/CardBasketball/Players/black_lucky.png";
        }
        StringBuilder sb5 = new StringBuilder(ujn.h);
        if (str5.length() == 0) {
            sb5.setLength(0);
        } else {
            int i10 = 0;
            if (StringsKt.O(str5, ujn.h, false)) {
                sb5.setLength(i10);
                sb5.append(str5);
            } else if (kotlin.text.c.x(str5, "https://", false)) {
                i10 = 0;
                sb5.setLength(i10);
                sb5.append(str5);
            } else {
                if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                    i3 = 1;
                    c3 = '/';
                } else {
                    sb5.append('/');
                    c3 = '/';
                    i3 = 1;
                }
                char[] cArr2 = new char[i3];
                cArr2[0] = c3;
                sb5.append(StringsKt.y0(str5, cArr2));
            }
        }
        String string2 = sb5.toString();
        String strS2 = qjj.S(list);
        StringBuilder sb6 = new StringBuilder(ujn.h);
        if (!StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/timer.png", ujn.h, false)) {
            if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/timer.png", "https://", false)) {
                i4 = 0;
            } else {
                if (sb6.length() <= 0 || StringsKt.S(sb6, Separators.SLASH)) {
                    i9 = 1;
                    c7 = '/';
                } else {
                    sb6.append('/');
                    c7 = '/';
                    i9 = 1;
                }
                char[] cArr3 = new char[i9];
                i4 = 0;
                cArr3[0] = c7;
                sb6.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/timer.png", cArr3));
            }
            String string3 = sb6.toString();
            iOrdinal = zaaVar.ordinal();
            if (iOrdinal != 0) {
                strA = ctf0Var.b.a(R.string.before_start, Arrays.copyOf(new Object[i4], i4));
            } else if (iOrdinal != 1) {
                strA = ctf0Var.b.a(R.string.card_basketball_quarter_number_start_v2, Arrays.copyOf(new Object[]{Integer.valueOf(Q(bbaVar))}, 1));
            } else if (iOrdinal != 2) {
                strA = ctf0Var.b.a(R.string.win_first, Arrays.copyOf(new Object[i4], i4));
            } else if (iOrdinal != 3) {
                strA = ctf0Var.b.a(R.string.draw, Arrays.copyOf(new Object[i4], i4));
            } else if (iOrdinal != 4) {
                strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[i4], i4));
            } else {
                strA = ctf0Var.b.a(R.string.win_second, Arrays.copyOf(new Object[i4], i4));
            }
            String str7 = strA;
            long jMin = Math.min(znq0.f(qqsVar.h), 5999000L);
            boolean z = qqsVar.j;
            znq0Var = qqsVar.k;
            if (znq0Var != null) {
                lValueOf = Long.valueOf(znq0.f(znq0Var.f44687a));
            } else {
                lValueOf = null;
            }
            i5 = 0;
            yaa yaaVar = new yaa(str4, string, strS, str6, string2, strS2, new wnq0(true, jMin, z, 1, lValueOf), string3, str, str7, zaaVar);
            int iQ = Q(bbaVar);
            ArrayList arrayListR3 = R(iQ, list2);
            ArrayList arrayListR4 = R(iQ, list);
            sb = new StringBuilder(ujn.h);
            if (!StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/field.png", ujn.h, false)) {
                str3 = "https://";
                if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/field.png", str3, false)) {
                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                        c4 = '/';
                    } else {
                        c4 = '/';
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/field.png", c4));
                }
                String string4 = sb.toString();
                sb2 = new StringBuilder(ujn.h);
                if (!StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png", str3, false)) {
                    c5 = c4;
                    sb2.setLength(0);
                    sb2.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png");
                } else {
                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                        sb2.append(c4);
                    }
                    c5 = c4;
                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png", c5));
                }
                String string5 = sb2.toString();
                sb3 = new StringBuilder(ujn.h);
                if (!StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png", str3, false)) {
                    i6 = 1;
                    sb3.setLength(0);
                    sb3.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png");
                } else {
                    if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                        c6 = c5;
                    } else {
                        c6 = c5;
                        sb3.append(c6);
                    }
                    i6 = 1;
                    sb3.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png", c6));
                }
                i7 = i6;
                xaa xaaVar = new xaa(string4, string5, sb3.toString(), S(arrayListR3), S(arrayListR4), Math.max(list2.size(), list.size()));
                arrayList = new ArrayList(4);
                i8 = 0;
                while (i8 < 4) {
                    int i11 = i8 + 1;
                    arrayListR = R(i11, list2);
                    arrayListR2 = R(i11, list);
                    if (arrayListR.isEmpty() || !arrayListR2.isEmpty()) {
                        i5 = i8;
                    }
                    String strA2 = ctf0Var.b.a(R.string.card_basketball_quarter_number_end_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, i7));
                    a4x a4xVarS = S(arrayListR);
                    if (arrayListR.isEmpty()) {
                        jM113getRed0d7_KjU = y3d.f;
                    } else {
                        jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
                    }
                    long j2 = jM113getRed0d7_KjU;
                    String strF0 = ntr.f0(arrayListR);
                    a4x a4xVarS2 = S(arrayListR2);
                    if (arrayListR2.isEmpty()) {
                        jM62getBlack0d7_KjU = y3d.f;
                    } else {
                        jM62getBlack0d7_KjU = StaticColors.INSTANCE.m62getBlack0d7_KjU();
                    }
                    arrayList.add(new kba(strA2, a4xVarS, j2, strF0, a4xVarS2, jM62getBlack0d7_KjU, ntr.f0(arrayListR2)));
                    i8 = i11;
                }
                lc00Var.add(new oba(yaaVar, xaaVar, new jba(i5, dyb.o0(arrayList))));
            }
            str3 = "https://";
            c4 = '/';
            sb.setLength(0);
            sb.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/field.png");
            String string6 = sb.toString();
            sb2 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png", ujn.h, false)) {
                c5 = c4;
                sb2.setLength(0);
                sb2.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png");
            } else {
                c5 = c4;
                sb2.setLength(0);
                sb2.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png");
            }
            String string7 = sb2.toString();
            sb3 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png", ujn.h, false)) {
                i6 = 1;
                sb3.setLength(0);
                sb3.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png");
            } else {
                i6 = 1;
                sb3.setLength(0);
                sb3.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png");
            }
            i7 = i6;
            xaa xaaVar2 = new xaa(string6, string7, sb3.toString(), S(arrayListR3), S(arrayListR4), Math.max(list2.size(), list.size()));
            arrayList = new ArrayList(4);
            i8 = 0;
            while (i8 < 4) {
                int i12 = i8 + 1;
                arrayListR = R(i12, list2);
                arrayListR2 = R(i12, list);
                if (arrayListR.isEmpty()) {
                    i5 = i8;
                } else {
                    i5 = i8;
                }
                String strA3 = ctf0Var.b.a(R.string.card_basketball_quarter_number_end_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, i7));
                a4x a4xVarS3 = S(arrayListR);
                if (arrayListR.isEmpty()) {
                    jM113getRed0d7_KjU = y3d.f;
                } else {
                    jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
                }
                long j3 = jM113getRed0d7_KjU;
                String strF1 = ntr.f0(arrayListR);
                a4x a4xVarS4 = S(arrayListR2);
                if (arrayListR2.isEmpty()) {
                    jM62getBlack0d7_KjU = y3d.f;
                } else {
                    jM62getBlack0d7_KjU = StaticColors.INSTANCE.m62getBlack0d7_KjU();
                }
                arrayList.add(new kba(strA3, a4xVarS3, j3, strF1, a4xVarS4, jM62getBlack0d7_KjU, ntr.f0(arrayListR2)));
                i8 = i12;
            }
            lc00Var.add(new oba(yaaVar, xaaVar2, new jba(i5, dyb.o0(arrayList))));
        }
        i4 = 0;
        sb6.setLength(i4);
        sb6.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/timer.png");
        String string8 = sb6.toString();
        iOrdinal = zaaVar.ordinal();
        if (iOrdinal != 0) {
            strA = ctf0Var.b.a(R.string.before_start, Arrays.copyOf(new Object[i4], i4));
        } else if (iOrdinal != 1) {
            strA = ctf0Var.b.a(R.string.card_basketball_quarter_number_start_v2, Arrays.copyOf(new Object[]{Integer.valueOf(Q(bbaVar))}, 1));
        } else if (iOrdinal != 2) {
            strA = ctf0Var.b.a(R.string.win_first, Arrays.copyOf(new Object[i4], i4));
        } else if (iOrdinal != 3) {
            strA = ctf0Var.b.a(R.string.draw, Arrays.copyOf(new Object[i4], i4));
        } else if (iOrdinal != 4) {
            strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[i4], i4));
        } else {
            strA = ctf0Var.b.a(R.string.win_second, Arrays.copyOf(new Object[i4], i4));
        }
        String str8 = strA;
        long jMin2 = Math.min(znq0.f(qqsVar.h), 5999000L);
        boolean z2 = qqsVar.j;
        znq0Var = qqsVar.k;
        if (znq0Var != null) {
            lValueOf = Long.valueOf(znq0.f(znq0Var.f44687a));
        } else {
            lValueOf = null;
        }
        i5 = 0;
        yaa yaaVar2 = new yaa(str4, string, strS, str6, string2, strS2, new wnq0(true, jMin2, z2, 1, lValueOf), string8, str, str8, zaaVar);
        int iQ2 = Q(bbaVar);
        ArrayList arrayListR5 = R(iQ2, list2);
        ArrayList arrayListR6 = R(iQ2, list);
        sb = new StringBuilder(ujn.h);
        if (!StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/field.png", ujn.h, false)) {
            str3 = "https://";
            if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/field.png", str3, false)) {
                if (sb.length() > 0) {
                    c4 = '/';
                } else {
                    c4 = '/';
                }
                sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/field.png", c4));
            }
            String string9 = sb.toString();
            sb2 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png", ujn.h, false)) {
                c5 = c4;
                sb2.setLength(0);
                sb2.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png");
            } else {
                c5 = c4;
                sb2.setLength(0);
                sb2.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png");
            }
            String string10 = sb2.toString();
            sb3 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png", ujn.h, false)) {
                i6 = 1;
                sb3.setLength(0);
                sb3.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png");
            } else {
                i6 = 1;
                sb3.setLength(0);
                sb3.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png");
            }
            i7 = i6;
            xaa xaaVar3 = new xaa(string9, string10, sb3.toString(), S(arrayListR5), S(arrayListR6), Math.max(list2.size(), list.size()));
            arrayList = new ArrayList(4);
            i8 = 0;
            while (i8 < 4) {
                int i13 = i8 + 1;
                arrayListR = R(i13, list2);
                arrayListR2 = R(i13, list);
                if (arrayListR.isEmpty()) {
                    i5 = i8;
                } else {
                    i5 = i8;
                }
                String strA4 = ctf0Var.b.a(R.string.card_basketball_quarter_number_end_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, i7));
                a4x a4xVarS5 = S(arrayListR);
                if (arrayListR.isEmpty()) {
                    jM113getRed0d7_KjU = y3d.f;
                } else {
                    jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
                }
                long j4 = jM113getRed0d7_KjU;
                String strF2 = ntr.f0(arrayListR);
                a4x a4xVarS6 = S(arrayListR2);
                if (arrayListR2.isEmpty()) {
                    jM62getBlack0d7_KjU = y3d.f;
                } else {
                    jM62getBlack0d7_KjU = StaticColors.INSTANCE.m62getBlack0d7_KjU();
                }
                arrayList.add(new kba(strA4, a4xVarS5, j4, strF2, a4xVarS6, jM62getBlack0d7_KjU, ntr.f0(arrayListR2)));
                i8 = i13;
            }
            lc00Var.add(new oba(yaaVar2, xaaVar3, new jba(i5, dyb.o0(arrayList))));
        }
        str3 = "https://";
        c4 = '/';
        sb.setLength(0);
        sb.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/field.png");
        String string11 = sb.toString();
        sb2 = new StringBuilder(ujn.h);
        if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png", ujn.h, false)) {
            c5 = c4;
            sb2.setLength(0);
            sb2.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png");
        } else {
            c5 = c4;
            sb2.setLength(0);
            sb2.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/base_cards.png");
        }
        String string12 = sb2.toString();
        sb3 = new StringBuilder(ujn.h);
        if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png", ujn.h, false)) {
            i6 = 1;
            sb3.setLength(0);
            sb3.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png");
        } else {
            i6 = 1;
            sb3.setLength(0);
            sb3.append("static/img/ImgDefault/Esports/Virtual/CardBasketball/PlayingField/card_deck.png");
        }
        i7 = i6;
        xaa xaaVar4 = new xaa(string11, string12, sb3.toString(), S(arrayListR5), S(arrayListR6), Math.max(list2.size(), list.size()));
        arrayList = new ArrayList(4);
        i8 = 0;
        while (i8 < 4) {
            int i14 = i8 + 1;
            arrayListR = R(i14, list2);
            arrayListR2 = R(i14, list);
            if (arrayListR.isEmpty()) {
                i5 = i8;
            } else {
                i5 = i8;
            }
            String strA5 = ctf0Var.b.a(R.string.card_basketball_quarter_number_end_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, i7));
            a4x a4xVarS7 = S(arrayListR);
            if (arrayListR.isEmpty()) {
                jM113getRed0d7_KjU = y3d.f;
            } else {
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
            }
            long j5 = jM113getRed0d7_KjU;
            String strF3 = ntr.f0(arrayListR);
            a4x a4xVarS8 = S(arrayListR2);
            if (arrayListR2.isEmpty()) {
                jM62getBlack0d7_KjU = y3d.f;
            } else {
                jM62getBlack0d7_KjU = StaticColors.INSTANCE.m62getBlack0d7_KjU();
            }
            arrayList.add(new kba(strA5, a4xVarS7, j5, strF3, a4xVarS8, jM62getBlack0d7_KjU, ntr.f0(arrayListR2)));
            i8 = i14;
        }
        lc00Var.add(new oba(yaaVar2, xaaVar4, new jba(i5, dyb.o0(arrayList))));
    }

    public static final swq N(swq swqVar, String str) {
        return swqVar.a(g950.e(str));
    }

    public static final chl0 O(String str, String str2) {
        return new chl0(str, str2, k0d.f17460a, a65.f301a, false, false, false, false, new xgl0(1L, 2.0d, 2.0d, str2, 1, 1L, 1, 1L, false));
    }

    public static final u1i P(int i2, ctf0 ctf0Var) {
        m6m0 m6m0Var = bop0.b;
        if (i2 == 1) {
            return new s1i(ctf0Var.b.a(R.string.team_first, Arrays.copyOf(new Object[0], 0)));
        }
        return i2 == 2 ? new t1i(ctf0Var.b.a(R.string.team_sec, Arrays.copyOf(new Object[0], 0))) : new r1i(ctf0Var.b.a(R.string.add_to_command_text, Arrays.copyOf(new Object[0], 0)));
    }

    public static final int Q(bba bbaVar) {
        Integer numValueOf;
        Iterator it = bbaVar.d.iterator();
        Integer numValueOf2 = null;
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((fba) it.next()).f9248a);
            while (it.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(((fba) it.next()).f9248a);
                if (numValueOf.compareTo(numValueOf3) < 0) {
                    numValueOf = numValueOf3;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Iterator it2 = bbaVar.e.iterator();
        if (it2.hasNext()) {
            numValueOf2 = Integer.valueOf(((fba) it2.next()).f9248a);
            while (it2.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(((fba) it2.next()).f9248a);
                if (numValueOf2.compareTo(numValueOf4) < 0) {
                    numValueOf2 = numValueOf4;
                }
            }
        }
        return Math.max(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 0);
    }

    public static final ArrayList R(int i2, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (((fba) obj).f9248a == i2) {
                arrayListU.add(obj);
            }
        }
        return arrayListU;
    }

    public static final a4x S(ArrayList arrayList) {
        eba cbaVar;
        ArrayList arrayList2 = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            fba fbaVar = (fba) CollectionsKt.W(i2, arrayList);
            if (fbaVar != null) {
                cbaVar = new cba(fbaVar.d ? 1.0f : 0.5f, z1x.F(fbaVar.c));
            } else {
                cbaVar = dba.f5793a;
            }
            arrayList2.add(cbaVar);
        }
        return dyb.o0(arrayList2);
    }

    public static final f2h T(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((mhh) next).f21793a, str));
        mhh mhhVar = (mhh) next;
        if (mhhVar == null) {
            return null;
        }
        String str2 = mhhVar.f21793a;
        String str3 = str2 == null ? "" : str2;
        Long l2 = mhhVar.c;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        String str4 = mhhVar.b;
        String str5 = str4 == null ? "" : str4;
        String str6 = mhhVar.d;
        return new f2h(jLongValue, str3, str5, str6 == null ? "" : str6);
    }

    public static synchronized boolean U(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f4481a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        if (ufx.F()) {
            boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            b = boolValueOf;
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                boolValueOf = Boolean.TRUE;
                b = boolValueOf;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
                b = boolValueOf;
            }
        }
        f4481a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static final mm40 V(mm40 mm40Var, vj50 vj50Var, yj50 yj50Var) {
        return mm40Var.e(new zj50(vj50Var, yj50Var));
    }

    public static final void W(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final mp0 X(ai0 ai0Var) {
        int iOrdinal = ai0Var.ordinal();
        if (iOrdinal == 0) {
            return mp0.f22154a;
        }
        if (iOrdinal == 1) {
            return mp0.b;
        }
        if (iOrdinal == 2) {
            return mp0.c;
        }
        if (iOrdinal == 3) {
            return mp0.d;
        }
        t9f.b();
        return null;
    }

    public static final ra4 Y(u54 u54Var) {
        int i2;
        u54Var.getClass();
        int iA = u54Var.a();
        if (iA == 1) {
            i2 = R.drawable.ic_social_circle_vk;
        } else if (iA == 5) {
            i2 = R.drawable.ic_social_circle_ok;
        } else if (iA == 13) {
            i2 = R.drawable.ic_social_circle_x;
        } else if (iA == 31) {
            i2 = R.drawable.ic_social_circle_discord;
        } else if (iA == 7) {
            i2 = R.drawable.ic_social_circle_yandex;
        } else if (iA == 9) {
            i2 = R.drawable.ic_social_circle_mail;
        } else if (iA == 11) {
            i2 = R.drawable.ic_social_circle_google;
        } else if (iA == 17) {
            i2 = R.drawable.ic_social_circle_telegram;
        } else if (iA == 19) {
            i2 = R.drawable.ic_social_circle_apple;
        } else if (iA == 26) {
            i2 = R.drawable.ic_social_circle_itsme;
        } else {
            i2 = iA == 48 ? R.drawable.ic_qr_scanner_office : 0;
        }
        return new ra4(i2, u54Var.a());
    }

    public static final q1h Z(d8h d8hVar, String str) {
        String str2 = d8hVar.b;
        Integer num = d8hVar.e;
        Integer num2 = d8hVar.d;
        String str3 = d8hVar.c;
        boolean zD = Intrinsics.d(str2, str);
        String str4 = d8hVar.f5647a;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = zD ? str2 : str3;
        if (str5 == null) {
            str5 = "";
        }
        if (zD) {
            str2 = str3;
        }
        if (str2 == null) {
            str2 = "";
        }
        Integer num3 = zD ? num2 : num;
        int iIntValue = num3 != null ? num3.intValue() : 0;
        if (!zD) {
            num = num2;
        }
        int iIntValue2 = num != null ? num.intValue() : 0;
        Long l2 = d8hVar.f;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        String str6 = d8hVar.g;
        String str7 = str6 == null ? "" : str6;
        String str8 = d8hVar.h;
        return new q1h(str4, str5, str2, iIntValue, iIntValue2, jLongValue, str7, str8 == null ? "" : str8);
    }

    public static final void a(mm40 mm40Var, ugk0 ugk0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(-1712267026);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(ugk0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 56.0f);
            long backgroundGroup = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, backgroundGroup, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new e0(function1, (byte) 3);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            mm40 mm40VarN2 = o7k0.n(jm40.b, 40.0f);
            boolean z2 = ugk0Var.f35629a;
            yb ybVar = new yb();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new q8(b2);
                fetVar.o0(objP2);
            }
            acb.n(ybVar, z2, (Function0) objP2, mm40VarN2, fetVar, 384, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) ugk0Var, (Object) function1, i2, (byte) 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public static final ljg a0(e2h e2hVar) {
        String str;
        v1h v1hVar;
        ?? arrayList;
        y1h y1hVar;
        Long l2;
        y1h y1hVar2;
        y1h y1hVar3;
        Long l3;
        y1h y1hVar4;
        List<re90> list;
        zf90 zf90Var;
        y0h y0hVar;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        y1h y1hVar5;
        Integer num;
        y1h y1hVar6;
        Integer num2;
        e2hVar.getClass();
        List<mhh> list2 = e2hVar.f7085a;
        b2h b2hVar = e2hVar.b;
        if (list2 == null || list2.size() < 2) {
            jf4.k(null);
            return null;
        }
        f2h f2hVarT = T(b2hVar != null ? b2hVar.f1852a : null, list2);
        if (f2hVarT == null) {
            jf4.k(null);
            return null;
        }
        f2h f2hVarT2 = T(b2hVar != null ? b2hVar.b : null, list2);
        if (f2hVarT2 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList5 = new ArrayList(r3d.q(list2, 10));
        for (mhh mhhVar : list2) {
            String str2 = mhhVar.f21793a;
            String str3 = str2 == null ? "" : str2;
            Long l4 = mhhVar.c;
            long jLongValue = l4 != null ? l4.longValue() : 0L;
            String str4 = mhhVar.b;
            String str5 = str4 == null ? "" : str4;
            String str6 = mhhVar.d;
            arrayList5.add(new f2h(jLongValue, str3, str5, str6 == null ? "" : str6));
        }
        int iIntValue = (b2hVar == null || (y1hVar6 = b2hVar.d) == null || (num2 = y1hVar6.f41854a) == null) ? -1 : num2.intValue();
        int iIntValue2 = (b2hVar == null || (y1hVar5 = b2hVar.d) == null || (num = y1hVar5.b) == null) ? -1 : num.intValue();
        if (b2hVar == null || (y0hVar = b2hVar.c) == null) {
            str = null;
            iun iunVar = iun.f15405a;
            v1hVar = new v1h(0, 0, 0, iunVar, iunVar, iunVar, iunVar, iunVar);
        } else {
            String str7 = f2hVarT.f8812a;
            String str8 = f2hVarT2.f8812a;
            str = null;
            Integer num3 = y0hVar.f41804a;
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            Integer num4 = y0hVar.b;
            int iIntValue4 = num4 != null ? num4.intValue() : 0;
            Integer num5 = y0hVar.c;
            int iIntValue5 = num5 != null ? num5.intValue() : 0;
            List list3 = y0hVar.d;
            vlf vlfVar = o;
            if (list3 != null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj : list3) {
                    if (((Boolean) vlfVar.invoke(obj)).booleanValue()) {
                        arrayList6.add(obj);
                    }
                }
                arrayList2 = new ArrayList(r3d.q(arrayList6, 10));
                Iterator it = arrayList6.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Z((d8h) it.next(), str7));
                }
            } else {
                arrayList2 = iun.f15405a;
            }
            ?? r21 = arrayList2;
            List list4 = y0hVar.e;
            if (list4 != null) {
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : list4) {
                    if (((Boolean) vlfVar.invoke(obj2)).booleanValue()) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList3 = new ArrayList(r3d.q(arrayList7, 10));
                Iterator it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Z((d8h) it2.next(), str7));
                }
            } else {
                arrayList3 = iun.f15405a;
            }
            ?? r22 = arrayList3;
            List list5 = y0hVar.f;
            if (list5 != null) {
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : list5) {
                    if (((Boolean) vlfVar.invoke(obj3)).booleanValue()) {
                        arrayList8.add(obj3);
                    }
                }
                arrayList4 = new ArrayList(r3d.q(arrayList8, 10));
                Iterator it3 = arrayList8.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Z((d8h) it3.next(), str8));
                }
            } else {
                arrayList4 = iun.f15405a;
            }
            ?? r23 = arrayList4;
            List list6 = y0hVar.g;
            ArrayList arrayList9 = list6 != null ? new ArrayList(list6) : new ArrayList();
            byte b2 = 3;
            w3d.y(arrayList9, new uy2(arrayList5, b2));
            ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
            Iterator it4 = arrayList9.iterator();
            while (it4.hasNext()) {
                arrayList10.add(Z((d8h) it4.next(), str7));
            }
            List list7 = y0hVar.h;
            ArrayList arrayList11 = list7 != null ? new ArrayList(list7) : new ArrayList();
            w3d.y(arrayList11, new uy2(arrayList5, b2));
            ArrayList arrayList12 = new ArrayList(r3d.q(arrayList11, 10));
            Iterator it5 = arrayList11.iterator();
            while (it5.hasNext()) {
                arrayList12.add(Z((d8h) it5.next(), str8));
            }
            v1hVar = new v1h(iIntValue3, iIntValue4, iIntValue5, r21, r22, r23, arrayList10, arrayList12);
        }
        if (b2hVar == null || (y1hVar4 = b2hVar.d) == null || (list = y1hVar4.d) == null) {
            arrayList = str;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (re90 re90Var : list) {
                re90Var.getClass();
                String str9 = re90Var.f30325a;
                String str10 = str9 == null ? "" : str9;
                String str11 = re90Var.b;
                String str12 = str11 == null ? "" : str11;
                Integer num6 = re90Var.d;
                int iIntValue6 = num6 != null ? num6.intValue() : -1;
                Integer num7 = re90Var.c;
                int iIntValue7 = num7 != null ? num7.intValue() : -1;
                String str13 = re90Var.e;
                String str14 = str13 == null ? "" : str13;
                String str15 = re90Var.f;
                String str16 = str15 == null ? "" : str15;
                String str17 = re90Var.g;
                String str18 = str17 == null ? "" : str17;
                Integer num8 = re90Var.h;
                if (num8 != null) {
                    int iIntValue8 = num8.intValue();
                    if (iIntValue8 == 0) {
                        zf90Var = zf90.c;
                    } else if (iIntValue8 != 1) {
                        zf90Var = iIntValue8 != 2 ? zf90.d : zf90.b;
                    } else {
                        zf90Var = zf90.f44292a;
                    }
                } else {
                    zf90Var = zf90.d;
                }
                arrayList.add(new le90(str10, str12, iIntValue7, iIntValue6, str14, str16, str18, zf90Var));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r10 = arrayList;
        znq0 znq0Var = new znq0((b2hVar == null || (y1hVar3 = b2hVar.d) == null || (l3 = y1hVar3.c) == null) ? 0L : l3.longValue());
        String strN = (iIntValue == -1 || iIntValue2 == -1) ? "VS" : w6x.n(iIntValue, iIntValue2, " : ");
        String str19 = (b2hVar == null || (y1hVar2 = b2hVar.d) == null) ? str : y1hVar2.e;
        return new ljg(arrayList5, f2hVarT, f2hVarT2, v1hVar, r10, znq0Var, strN, str19 == null ? "" : str19, (b2hVar == null || (y1hVar = b2hVar.d) == null || (l2 = y1hVar.f) == null) ? 0L : l2.longValue());
    }

    public static final void b(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        boolean z;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1756087139);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            WeakHashMap weakHashMap = djv0.w;
            Object b050Var = zcm0.i(fetVar).e;
            boolean zH = fetVar.h(((v81) l7m0Var.getValue()).e);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                if (((v81) l7m0Var.getValue()).e) {
                    b050Var = new b050();
                }
                fetVar.o0(b050Var);
                objP = b050Var;
            }
            zfn zfnVar = m8m0.f21378a;
            long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m62getBlack0d7_KjU();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = j120.k0(i120.Q(jm40Var, jM62getBlack0d7_KjU, ljcVar), (vhv0) objP);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarK0.e(n0qVar);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
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
            s(432, u1c.M(-153735086, new o71(l7m0Var, function1, b2), fetVar), u1c.M(22593171, new o71(l7m0Var, function1, (byte) 5), fetVar), fetVar, null);
            if (((v81) l7m0Var.getValue()).c) {
                fetVar.e0(18400431);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new c51((byte) 1);
                    fetVar.o0(objP2);
                }
                mm40 mm40VarQ = i120.Q(y860.W(n0qVar, null, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(zfnVar)).m70getBlack200d7_KjU(), ljcVar);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                kpb.j(jr8.f16991a.b(jm40Var, gqw0.e), null, fetVar, 0, 2);
                z = true;
                fetVar.r(true);
                fetVar.r(false);
            } else {
                z = true;
                fetVar.e0(18857867);
                fetVar.r(false);
            }
            fetVar.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function1, i2, (byte) 2);
        }
    }

    public static final bca b0(mms mmsVar, String str, List list) {
        String str2 = (String) CollectionsKt.firstOrNull(xsm0.w(mmsVar.i.b, list));
        if (str2 == null) {
            str2 = "";
        }
        return new bca(new c280(str2, R.drawable.ic_glyph_placeholder_player), str);
    }

    public static final void c(mm40 mm40Var, xv1 xv1Var, fet fetVar, int i2) {
        int i3;
        xv1Var.getClass();
        fetVar.g0(-61597347);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xv1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(null) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(mm40Var, 52.0f), 1.0f), "CATEGORY_PRIZE_ICON_S");
            if (xv1Var instanceof vv1) {
                fetVar.e0(-1095109591);
                e(mm40VarE0, (vv1) xv1Var, fetVar, i3 & 1008);
                fetVar.r(false);
            } else {
                if (!xv1Var.equals(wv1.f39817a)) {
                    throw b1j.f(934502984, fetVar, false);
                }
                fetVar.e0(934513301);
                d(0, fetVar, mm40VarE0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) mm40Var, (Object) xv1Var, i2, (byte) 13);
        }
    }

    public static final void d(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(962157660);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 11);
        }
    }

    public static final void e(mm40 mm40Var, vv1 vv1Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1371393518);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(vv1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(null) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, vgg0.a(12.0f));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new c51(vv1Var, (byte) 19);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            xx7 xx7Var = gqw0.m;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(xx7Var, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            j0x.b(lv00.T(vv1Var.b, null, null, null, fetVar2, 48, 12), null, o2e.e0(o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 36.0f), "CATEGORY_PRIZE_ICON_S_ICON"), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.j, (byte) 11)), xx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            v8q0.a(vv1Var.c, o2e.e0(jm40Var, "CATEGORY_PRIZE_ICON_S_TITLE"), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, true, 1, 0, null, g1t0.m(), fetVar, 48, 28032, 101368);
            String strL = vv1Var.e;
            String str = vv1Var.d;
            boolean z3 = strL.length() > 0;
            boolean z4 = str.length() > 0;
            if (z3 && z4) {
                strL = kng0.l(str, " • ", strL);
            } else if (!z3 || z4) {
                strL = (z3 || !z4) ? "" : str;
            }
            v8q0.a(strL, o2e.e0(jm40Var, "CATEGORY_PRIZE_ICON_S_SUBTITLE"), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, y9q0.a(g1t0.g(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 48, 28032, 102392);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw1(mm40Var, vv1Var, i2, (byte) 0);
        }
    }

    public static final void f(hl60 hl60Var, fet fetVar, int i2) {
        hl60Var.getClass();
        fetVar.g0(1785068454);
        int i3 = i2 | (fetVar.i(hl60Var) ? 4 : 2);
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            pz40 pz40VarQ = gkb.Q(vtb.N(hl60Var.u), null, fetVar, 0, 7);
            m8x.y(o2e.e0(jm40.b, "AuthenticatorOnboardingScreen"), u1c.M(1880001122, new uq4(hl60Var), fetVar), u1c.M(1535085377, new sr1(hl60Var, pz40VarQ, (byte) 17), fetVar), null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(526792503, new v7i0(pz40VarQ, (byte) 9), fetVar), fetVar, 805306806, 440);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uq4(hl60Var, i2);
        }
    }

    public static final void g(ua5 ua5Var, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        ua5Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1942154670);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ua5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarO = feb.O(o7k0.d(jm40.b, 1.0f), function0);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarO);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            y(ua5Var.e, fetVar, 0);
            x(ua5Var, fetVar, i3 & 14);
            w(ua5Var.c, fetVar, 6);
            v(ua5Var.h, function1, function2, fetVar, (i3 >> 3) & 1008);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((Object) ua5Var, (Object) function0, function1, (wdr) function2, i2, (byte) 4);
        }
    }

    public static final void h(mm40 mm40Var, dn7 dn7Var, Function0 function0, fet fetVar, int i2) {
        Object obj;
        fet fetVar2 = fetVar;
        function0.getClass();
        fetVar2.g0(-53349572);
        int i3 = i2 | 6 | (fetVar2.g(dn7Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(y860.W(i120.Q(dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var), backgroundContent, jd8.n), null, null, false, null, function0, 28), 12.0f, 8.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            dww.b(jpm0.t(R.drawable.ic_glyph_statistics, 6, fetVar2), null, o7k0.n(jm40Var, 20.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 48, 0);
            jwb.p(s5x0.L(new x7z(1.0f, true), 8.0f, 0.0f, 2), null, null, yx7Var, 0, 2, u1c.M(1324285061, new un6(dn7Var, (byte) 28), fetVar2), fetVar, 1772544, 22);
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar2), null, o7k0.n(jm40Var, 20.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
            fetVar2.r(true);
            obj = jm40Var;
        } else {
            fetVar2.X();
            obj = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2(obj, (Object) dn7Var, function0, i2, (byte) 22);
        }
    }

    public static final void i(imm immVar, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        imm immVar2;
        int i3;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(1153683467);
        if ((i2 & 6) == 0) {
            immVar2 = immVar;
            i3 = (fetVar2.g(immVar2) ? 4 : 2) | i2;
        } else {
            immVar2 = immVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarW = o050.W(jm40.b);
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new o0q0(function2, (byte) 14);
                fetVar2.o0(objP);
            }
            int i5 = i3;
            hlm.c(mm40VarW, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, ((i3 << 3) & 112) | 805306368, 54, 500);
            fetVar2 = fetVar;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new o0q0(function2, (byte) 15);
                fetVar2.o0(objP2);
            } else {
                function2 = function1;
            }
            jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, i5 & 112, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf7(immVar, mdmVar, function2, i2, (byte) 8);
        }
    }

    public static final void j(mm40 mm40Var, ArrayList arrayList, ow3 ow3Var, fet fetVar, int i2) {
        fetVar.g0(1465837630);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(arrayList) ? 32 : 16) | 128;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                ow3Var = new qw3(12.0f, true, new jf4((byte) 14));
            } else {
                fetVar.X();
            }
            fetVar.s();
            thg0 thg0VarA = shg0.a(ow3Var, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-971348401);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eh8 eh8Var = (eh8) it.next();
                fetVar.b0(-501022838, Integer.valueOf(eh8Var.f7795a));
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarS = o7k0.s(jm40.b, 240.0f);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new nk7((byte) 15);
                    fetVar.o0(objP);
                }
                mrv.q(rq8.L(mm40VarS, (Function1) objP), eh8Var, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        ow3 ow3Var2 = ow3Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, arrayList, ow3Var2, i2, (byte) 6);
        }
    }

    public static final void k(boolean z, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-809652935);
        int i3 = (fetVar.h(z) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            WeakHashMap weakHashMap = djv0.w;
            wha0.h(j120.k0(mm40VarD, new ujo(zcm0.i(fetVar).c, zcm0.i(fetVar).e)), u1c.M(1743264116, new ldc(z, function1, b2), fetVar), fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rt9(z, function1, i2, b3);
        }
    }

    public static final void l(mm40 mm40Var, doa doaVar, Function1 function1, fet fetVar, int i2) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        yx7 yx7Var = gqw0.j;
        function1.getClass();
        fetVar.g0(602296368);
        int i3 = (i2 & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(doaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = doaVar instanceof boa;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.e0(-1362031129);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), "CARD_STACK_STATIC_ROW");
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC0, shdVar);
                fetVar.e0(-628798303);
                for (ona onaVar : CollectionsKt.D0(((boa) doaVar).f2924a, 4)) {
                    fetVar.b0(-220260181, Long.valueOf(onaVar.f25538a));
                    mrv.r(new x7z(1.0f, true), onaVar, function1, fetVar, i3 & 896);
                    fetVar.r(false);
                }
                ohs0.x(fetVar, false, true, false);
            } else {
                if (!doaVar.equals(coa.f4690a)) {
                    throw b1j.f(-1013769218, fetVar, false);
                }
                fetVar.e0(-1361286850);
                mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(mm40VarD2, 8.0f);
                thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                fetVar.e0(-975534628);
                for (int i4 = 0; i4 < 4; i4++) {
                    mrv.s(0, fetVar, new x7z(1.0f, true));
                }
                ohs0.x(fetVar, false, true, false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 20, i2, (Object) mm40Var, (Object) doaVar, function1);
        }
    }

    public static final void m(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1888038662);
        int i4 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            sdc sdcVar = (sdc) l7m0Var.getValue();
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o050.W(jm40Var);
            ilm ilmVar = new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary());
            String str = sdcVar.f32027a;
            String str2 = sdcVar.b;
            imm immVar = new imm(ilmVar, new plm(str, ha50.TWO_LINES, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            int i5 = i4 & 112;
            boolean z2 = i5 == 32;
            Object objP = fetVar.P();
            byte b2 = 7;
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new dib(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarW, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 805306368, 54, 500);
            mm40 mm40VarL = s5x0.L(new x7z(1.0f, true), xfn.a(fetVar).d, 0.0f, 2);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (str2.length() > 0) {
                fetVar.e0(-199224895);
                o(0, fetVar, null, str2);
            } else {
                fetVar.e0(-1880959280);
            }
            fetVar.r(false);
            if (sdcVar.d != null) {
                fetVar.e0(-1880873565);
                long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
                zcl zclVar = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 16.0f);
                x6q0 x6q0Var = sdcVar.d;
                i3 = i5;
                boolean z3 = i3 == 32;
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new trb(function1, (byte) 7);
                    fetVar.o0(objP2);
                }
                wwb.n(mm40VarJ, x6q0Var, null, (Function1) objP2, fetVar, 0, 4);
                fetVar.r(false);
            } else {
                i3 = i5;
                fetVar.e0(-1880153776);
                fetVar.r(false);
            }
            if (sdcVar.c.isEmpty()) {
                fetVar.e0(-1879992080);
                fetVar.r(false);
            } else {
                fetVar.e0(-1880097790);
                r(wpqVar, sdcVar, function1, fetVar, (i4 << 3) & 896);
                fetVar.r(false);
            }
            fetVar.r(true);
            k(sdcVar.e, function1, fetVar, i3);
            fetVar.r(true);
            if (sdcVar.f) {
                fetVar.e0(1929041710);
                t(0, fetVar);
            } else {
                fetVar.e0(-329241444);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i2, (byte) 21);
        }
    }

    public static final void n(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1967022255);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ugd ugdVarM = u1c.M(894564885, new ckq0(l7m0Var, function1, b2), fetVar);
            ugd ugdVarM2 = u1c.M(1076298134, new ckq0(l7m0Var, function1, b3), fetVar);
            pz40 pz40Var = s6t0.f31722a;
            m8x.y(null, ugdVarM, ugdVarM2, null, null, 0, s6t0.b().f33626a.getBackground(), 0L, null, u1c.M(343175520, new xs4(l7m0Var, function1, (byte) 13), fetVar), fetVar, 805306800, 441);
            if (((jkq0) l7m0Var.getValue()).b) {
                fetVar.e0(976667449);
                u(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(976690513);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i2, (byte) 2);
        }
    }

    public static final void o(int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(-1049645933);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarM = s5x0.M(jm40Var, 16.0f, 12.0f, 16.0f, 8.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarM, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, (i3 >> 3) & 14, 0, 131064);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str2, i2, (byte) 14);
        }
    }

    public static final void p(mm40 mm40Var, bpl bplVar, Function0 function0, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        bplVar.getClass();
        fetVar2.g0(226646661);
        int i3 = i2 | (fetVar2.g(bplVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ngk0();
                fetVar2.o0(objP);
            }
            ngk0 ngk0Var = (ngk0) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(new y3d(background));
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Context context = (Context) fetVar2.k(dy2.b);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(i120.S(lgb.J(i120.Q(o7k0.n(mm40Var, 56.0f), ((y3d) pz40Var.getValue()).f41946a, vgg0.a(16.0f)), vgg0.a(16.0f)), 1.0f, ((StaticColors) fetVar2.k(m8m0.f21378a)).m126getWhite200d7_KjU(), vgg0.a(16.0f)), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            n0q n0qVar = o7k0.c;
            boolean z = (i3 & 896) == 256;
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new unl(function0, (byte) 6);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarW = y860.W(n0qVar, null, null, false, null, (Function0) objP3, 28);
            String str = bplVar.c;
            pge pgeVar = gqw0.A;
            boolean zI = fetVar2.i(context) | ((i3 & 112) == 32);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var) {
                xol xolVar = new xol(ngk0Var, bplVar, context, pz40Var, (byte) 3);
                fetVar2.o0(xolVar);
                objP4 = xolVar;
            }
            k7x.b(str, null, mm40VarW, null, null, null, null, (Function1) objP4, null, null, pgeVar, null, fetVar, 48, 6, 31608);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yol(mm40Var, bplVar, function0, i2, (byte) 3);
        }
    }

    public static final void q(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-2144826558);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, null, fetVar2, (i3 << 3) & 112, 13);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, (byte) 10);
        }
    }

    public static final void r(wpq wpqVar, sdc sdcVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(590813110);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(wpqVar) : fetVar.i(wpqVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(sdcVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean z = ((i3 & 14) == 4 || ((i3 & 8) != 0 && fetVar.i(wpqVar))) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sw8((Object) sdcVar, (Object) wpqVar, (Object) function1, (byte) 6);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarN, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 510);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 26, i2, (Object) wpqVar, (Object) sdcVar, function1);
        }
    }

    public static final void s(int i2, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var) {
        ugd ugdVar3;
        mm40 mm40Var2;
        fetVar.g0(829544681);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.b;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar.invoke(fetVar, 6);
            ugdVar3 = ugdVar2;
            ugdVar3.invoke(fetVar, 6);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            ugdVar3 = ugdVar2;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p71(mm40Var2, ugdVar, ugdVar3, i2, (byte) 0);
        }
    }

    public static final void t(int i2, fet fetVar) {
        fetVar.g0(-459530837);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarE = k7n0.H(jm40.b, 2.0f).e(o7k0.c);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new zxb((byte) 8);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarE, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pua(i2, (byte) 27);
        }
    }

    public static final void u(int i2, fet fetVar) {
        fetVar.g0(685240631);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ozp0((byte) 28);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarW, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), jd8.n);
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
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new shq0(i2, (byte) 2);
        }
    }

    public static final void v(jd6 jd6Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(581548174);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(jd6Var) : fetVar.i(jd6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new wc2(function1, (byte) 23);
                fetVar.o0(objP);
            }
            Function1 function3 = (Function1) objP;
            boolean z2 = (i3 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new wc2(function2, (byte) 24);
                fetVar.o0(objP2);
            }
            y860.i(null, jd6Var, 48.0f, function3, (Function1) objP2, fetVar, (i3 << 3) & 112, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) jd6Var, (Object) function1, (Object) function2, i2, (byte) 0);
        }
    }

    public static final void w(String str, fet fetVar, int i2) {
        fetVar.g0(-1124752427);
        int i3 = i2 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, s5x0.L(x7zVar, 8.0f, 0.0f, 2), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i3 >> 3) & 14, 24960, 110584);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 8, i2, str);
        }
    }

    public static final void x(ua5 ua5Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1820992639);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ua5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 48.0f);
            zfn zfnVar = jjg.f16616a;
            ((ijg) fetVar.k(zfnVar)).getClass();
            long j2 = ijg.i;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, i120.Q(mm40VarN, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            mm40 mm40VarN2 = o7k0.n(jm40Var, 48.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN2);
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
            String str = ua5Var.d;
            mm40 mm40VarJ = s5x0.J(mm40VarE, 8.0f);
            pge pgeVar = gqw0.f1;
            lgb.v(mm40VarE, mm40VarJ, str, R.drawable.ic_glyph_placeholder_player, StaticColors.INSTANCE.m129getWhite400d7_KjU(), pgeVar, fetVar, 196608, 0);
            if (ua5Var.i.isEmpty()) {
                fetVar.e0(454574907);
                fetVar.r(false);
            } else {
                fetVar.e0(453848391);
                pm80 pm80VarF = a8k0.F(ua5Var.g, 0, fetVar);
                mm40 mm40VarB = jr8.f16991a.b(o7k0.n(jm40Var, 18.0f), gqw0.i);
                ((ijg) fetVar.k(zfnVar)).getClass();
                long j3 = ijg.j;
                zcl zclVar3 = qmk.d;
                mm40 mm40VarQ = i120.Q(mm40VarB, j3, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3));
                ((ijg) fetVar.k(zfnVar)).getClass();
                j0x.b(pm80VarF, null, i120.S(mm40VarQ, 1.0f, j2, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), null, pgeVar, 0.0f, null, fetVar, 24632, 104);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ra5(ua5Var, i2, (byte) 2);
        }
    }

    public static final void y(String str, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1202974085);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2);
        if (!fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            fetVar2.X();
        } else if (str.length() > 0) {
            fetVar2.e0(-593752867);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 48.0f);
            ((ijg) fetVar2.k(jjg.f16616a)).getClass();
            long j2 = ijg.i;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, o7k0.s(jm40Var, 40.0f), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, i3 & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-593035961);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 7, i2, str);
        }
    }

    public static final void z(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1189880834);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 15;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarW = o050.W(i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String strW = rsm0.w(R.string.players_statistic_cricket_results_title, 0, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strW, ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), false, null);
                fetVar.o0(objP);
            }
            imm immVar = (imm) objP;
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new i0a0(function1, b2);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 54, 0, 4084);
            ela0 ela0Var = (ela0) l7m0Var.getValue();
            if (ela0Var != null) {
                if (ela0Var instanceof cla0) {
                    fetVar.e0(-702999851);
                    D(((cla0) ela0Var).f4548a, fetVar, 0);
                    fetVar.r(false);
                } else if (ela0Var instanceof dla0) {
                    fetVar.e0(-702995311);
                    q(((dla0) ela0Var).f6269a, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(-703002803, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 15);
        }
    }
}

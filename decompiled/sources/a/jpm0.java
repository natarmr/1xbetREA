package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jpm0 {
    public static final void a(mm40 mm40Var, rhs0 rhs0Var, fet fetVar, int i) {
        int i2;
        String str;
        zfn zfnVar;
        String str2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        String str3 = rhs0Var.e;
        String str4 = rhs0Var.c;
        String str5 = rhs0Var.d;
        fetVar2.g0(-1035839810);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(rhs0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40Var, 16.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            o(fetVar2, numValueOf, shdVar3);
            n(fetVar2);
            shd shdVar4 = gqw0.v;
            o(fetVar2, mm40VarC0, shdVar4);
            tj30 tj30VarC = zq8.c(gqw0.i, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            o(fetVar2, tj30VarC, shdVar);
            o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var2, 84.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = lgb.J(mm40VarN, ugg0Var);
            mm40 mm40VarJ2 = lgb.J(o7k0.n(jm40Var2, 84.0f), ugg0Var);
            zfn zfnVar2 = zaq0.b;
            mm40 mm40VarJ3 = s5x0.J(i120.Q(mm40VarJ2, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary10(), jd8.n), 22.0f);
            n0x n0xVar = rhs0Var.f30505a;
            n0x n0xVar2 = rhs0Var.b;
            lgb.w(mm40VarJ, mm40VarJ3, n0xVar, new m0x(R.drawable.ic_glyph_user, null, 6), ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary60(), gqw0.b, null, gqw0.A, fetVar, 12779520, 64);
            fetVar2 = fetVar;
            if (n0xVar2.c()) {
                fetVar2.e0(591252072);
                fetVar2.r(false);
            } else {
                fetVar2.e0(591149245);
                b(n0xVar2, fetVar2, 0);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            if (str4.length() > 0) {
                fetVar2.e0(-1731741499);
                jm40Var = jm40Var2;
                str = str3;
                zfnVar = zfnVar2;
                v8q0.a(str4, s5x0.N(jm40Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar, 0, 24960, 109560);
                str2 = str4;
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                str = str3;
                zfnVar = zfnVar2;
                str2 = str4;
                jm40Var = jm40Var2;
                fetVar2.e0(-1731384658);
                fetVar2.r(false);
            }
            if (str5.length() > 0) {
                fetVar2.e0(-1731326130);
                v8q0.a(str5, s5x0.N(jm40Var, 0.0f, str2.length() > 0 ? 4.0f : 16.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1730864850);
                fetVar2.r(false);
            }
            if (str.length() > 0) {
                fetVar2.e0(-1730803005);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, (str2.length() == 0 && str5.length() == 0) ? 16.0f : 8.0f, 0.0f, 0.0f, 13);
                d4d d4dVar = d4d.PRIMARY;
                j6n.h(str, new yoo0(), mm40VarN2, 0, 0, fetVar2, 0, 24);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1730361906);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) rhs0Var, i, (byte) 8);
        }
    }

    public static final void b(n0x n0xVar, fet fetVar, int i) {
        fetVar.g0(-1807550857);
        int i2 = (fetVar.g(n0xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            pge pgeVar = gqw0.A;
            Object objA = n0xVar.a();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new dbo0(pz40Var, (byte) 8);
                fetVar.o0(objP2);
            }
            mz3 mz3VarX = l7x.X(objA, (Function1) objP2, pgeVar, fetVar, 3456, 18);
            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                fetVar.e0(1552860645);
                zcl zclVar = qmk.f28987a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarR = ffb0.R(jm40Var, 2.0f, 0.0f, 2);
                long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarR, background, ugg0Var), 4.0f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                o(fetVar, tj30VarC, gqw0.x);
                o(fetVar, bh90VarM, gqw0.w);
                o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                n(fetVar);
                o(fetVar, mm40VarC0, gqw0.v);
                j0x.b(mz3VarX, null, lgb.J(o7k0.n(jm40Var, 24.0f), ugg0Var), null, pgeVar, 0.0f, null, fetVar, 24624, 104);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(1553467625);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0g(n0xVar, i, (byte) 9);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-582454661);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.K(mm40Var, 16.0f, 12.0f), 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            o(fetVar, x5dVarA, gqw0.x);
            o(fetVar, bh90VarM, gqw0.w);
            o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            n(fetVar);
            o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            qxw.o(fetVar, xbc.c0(lgb.J(o7k0.n(jm40Var, 84.0f), vgg0.f37379a), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 216.0f), 22.0f);
            zcl zclVar2 = qmk.m;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 84.0f), 20.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 26);
        }
    }

    public static final void d(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i2;
        float f;
        float f2;
        a4xVar.getClass();
        fetVar.g0(-833118921);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            o(fetVar, thg0VarA, gqw0.x);
            o(fetVar, bh90VarM, gqw0.w);
            o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -2045080620, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                kpm0 kpm0Var = (kpm0) next;
                fetVar.b0(744335410, Integer.valueOf(i3));
                if (kpm0Var != null) {
                    boolean z = kpm0Var instanceof zn5;
                    jm40 jm40Var = jm40.b;
                    float f3 = 0.0f;
                    if (z) {
                        fetVar.e0(744336864);
                        if (i3 != a4xVar.size() - 1) {
                            zcl zclVar = qmk.f28987a;
                            f3 = 12.0f;
                        } else {
                            zcl zclVar2 = qmk.f28987a;
                        }
                        jar0.g(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, f3, 0.0f, 11), 16.0f), (zn5) kpm0Var, fetVar, 0);
                        fetVar.r(false);
                    } else if (kpm0Var instanceof c1l) {
                        fetVar.e0(744347422);
                        if (i3 != a4xVar.size() - 1) {
                            zcl zclVar3 = qmk.f28987a;
                            f2 = 16.0f;
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            f2 = 0.0f;
                        }
                        bfb.l(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, f2, 0.0f, 11), 8.0f), (c1l) kpm0Var, fetVar, 0);
                        fetVar.r(false);
                    } else if (kpm0Var instanceof bac) {
                        fetVar.e0(744358082);
                        if (i3 != a4xVar.size() - 1) {
                            zcl zclVar5 = qmk.f28987a;
                            f = 8.0f;
                        } else {
                            zcl zclVar6 = qmk.f28987a;
                            f = 0.0f;
                        }
                        aac.d(o7k0.p(s5x0.N(jm40Var, 0.0f, 0.0f, f, 0.0f, 11), 16.0f, 20.0f), (bac) kpm0Var, fetVar, 0);
                        fetVar.r(false);
                    } else if (kpm0Var instanceof mt30) {
                        fetVar.e0(744369918);
                        if (i3 != a4xVar.size() - 1) {
                            zcl zclVar7 = qmk.f28987a;
                            f3 = 6.0f;
                        } else {
                            zcl zclVar8 = qmk.f28987a;
                        }
                        efx.d(o7k0.p(s5x0.N(jm40Var, 0.0f, 0.0f, f3, 0.0f, 11), 32.0f, 40.0f), (nt30) kpm0Var, fetVar, 0);
                        fetVar.r(false);
                    } else if (kpm0Var instanceof lt30) {
                        fetVar.e0(744381630);
                        if (i3 != a4xVar.size() - 1) {
                            zcl zclVar9 = qmk.f28987a;
                            f3 = 4.0f;
                        } else {
                            zcl zclVar10 = qmk.f28987a;
                        }
                        efx.d(o7k0.p(s5x0.N(jm40Var, 0.0f, 0.0f, f3, 0.0f, 11), 24.0f, 30.0f), (nt30) kpm0Var, fetVar, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                    i3 = i4;
                }
                throw b1j.f(744336295, fetVar, false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 14);
        }
    }

    public static final void e(mm40 mm40Var, t3q t3qVar, Function1 function1, fet fetVar, int i) {
        n3l0 l3l0Var;
        t3qVar.getClass();
        function1.getClass();
        fetVar.g0(-455372842);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(t3qVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (t3qVar.f) {
                zcl zclVar = qmk.f28987a;
                l3l0Var = new m3l0();
            } else {
                zcl zclVar2 = qmk.f28987a;
                l3l0Var = new l3l0(16.0f);
            }
            n3l0 n3l0Var = l3l0Var;
            p1l0 p1l0Var = p1l0.SPORT_ICON;
            String str = t3qVar.e;
            zfn zfnVar = zaq0.b;
            zrm zrmVar = new zrm(new b2l0(t3qVar.b, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), new t1l0(p1l0Var, null, str, null, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), null, 234), new y2l0(new kpe(), new spe(t3qVar.h, t3qVar.g), new zb(null, null, 7), t3qVar.f, t3qVar.i), (d4d) null, n3l0Var, 8);
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new o0k0((Object) function1, (Object) t3qVar, (byte) 22);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new itn0(function1, t3qVar, (byte) 3);
                fetVar.o0(objP2);
            }
            agc.r(mm40Var, zrmVar, function0, null, null, (Function1) objP2, null, fetVar, i2 & 14, 88);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, t3qVar, function1, i, (byte) 4);
        }
    }

    public static final void f(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-973151710);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
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
            o(fetVar, x5dVarA, gqw0.x);
            o(fetVar, bh90VarM, gqw0.w);
            o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            n(fetVar);
            o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            imm immVar = (imm) l7m0Var.getValue();
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new o0q0(function1, (byte) 28);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new xar0(function1, b);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            b = i3 == 256 ? (byte) 1 : (byte) 0;
            Object objP3 = fetVar.P();
            if (b != 0 || objP3 == cl5Var) {
                objP3 = new xar0(function1, b2);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarD, immVar, null, function0, null, function2, (Function1) objP3, null, null, null, null, null, fetVar, 6, 0, 3988);
            vqd.t(54, ugdVar, y5d.f42040a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qhb0(mm40Var, l7m0Var, function1, ugdVar, i, (byte) 2);
        }
    }

    public static final void g(mm40 mm40Var, nsm0 nsm0Var, long j, pwr0 pwr0Var, Function2 function2, Function1 function1, Function1 function3, fet fetVar, int i) {
        nsm0Var.getClass();
        function2.getClass();
        function1.getClass();
        function3.getClass();
        fetVar.g0(66621460);
        int i2 = i | (fetVar.g(nsm0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.g(pwr0Var) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536) | (fetVar.i(function3) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            zfn zfnVar = bmd.n;
            obc.d(zfnVar.a(k6z.f17794a), u1c.M(-1544407852, new ixr0(j, mm40Var, nsm0Var, pwr0Var, (k6z) fetVar.k(zfnVar), function2, function1, function3), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n5m0(mm40Var, nsm0Var, j, pwr0Var, function2, function1, function3, i);
        }
    }

    public static final void h(mm40 mm40Var, ths0 ths0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1174101433);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ths0Var) ? 32 : 16;
        }
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (ths0Var instanceof rhs0) {
            fetVar.e0(-1264916348);
            a(mm40Var, (rhs0) ths0Var, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (!ths0Var.equals(shs0.f32229a)) {
                throw b1j.f(-1264918219, fetVar, false);
            }
            fetVar.e0(-1264913482);
            c(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) ths0Var, i, (byte) 7);
        }
    }

    public static final boolean i(List list, long j, long j2, long j3) {
        list.getClass();
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kd90 kd90Var = (kd90) it.next();
            if (kd90Var.f18094a == j) {
                tnp0 tnp0Var = kd90Var.d;
                if (tnp0Var != null) {
                    if (tnp0Var instanceof rnp0) {
                        rnp0 rnp0Var = (rnp0) tnp0Var;
                        if (rnp0Var.c == j3 || rnp0Var.b == j2) {
                            return true;
                        }
                    } else if (tnp0Var instanceof snp0) {
                        if (((snp0) tnp0Var).b == j2) {
                            return true;
                        }
                    }
                }
                t9f.b();
                break;
            }
        }
        return false;
    }

    public static cr30 j(String str, Collection collection) {
        cr30 pbbVar;
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(r3d.q(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((wsy) it.next()).y());
        }
        mbk0 mbk0VarN = k9x.N(arrayList);
        int i = mbk0VarN.f21514a;
        if (i != 0) {
            pbbVar = i != 1 ? new pbb(str, (cr30[]) mbk0VarN.toArray(new cr30[0])) : (cr30) mbk0VarN.get(0);
        } else {
            pbbVar = br30.b;
        }
        return mbk0VarN.f21514a <= 1 ? pbbVar : new mdz(pbbVar);
    }

    public static final xov0 k(ppv0 ppv0Var) {
        ppv0Var.getClass();
        return new xov0(ppv0Var.f27390a, ppv0Var.t);
    }

    public static final void l(fet fetVar, Integer num) {
        shd shdVar = gqw0.y;
        if (fetVar.S) {
            fetVar.b(num, shdVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x02fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:116:0x0301  */
    /* JADX WARN: Code duplicated, block: B:117:0x0304  */
    /* JADX WARN: Code duplicated, block: B:123:0x0363 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0365  */
    /* JADX WARN: Code duplicated, block: B:125:0x036d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0388 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x038a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0393  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:138:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x03b0  */
    public static final s2x m(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        long jD;
        int i2;
        ArrayList arrayList;
        List list;
        List list2;
        int i3;
        int i4;
        int iP;
        int i5;
        zz2 zz2VarO;
        int iP2;
        Shader shader;
        t89 skk0Var;
        Shader shader2;
        t89 skk0Var2;
        int i6;
        int i7;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
        x23 x23Var = new x23();
        x23Var.c = xmlResourceParser2;
        x23Var.f40148a = 0;
        x23Var.e = new kd30((byte) 6);
        XmlPullParser xmlPullParser = (XmlPullParser) x23Var.c;
        TypedArray typedArrayS = zsm0.s(resources, theme, attributeSetAsAttributeSet, wb.b);
        x23Var.k(typedArrayS.getChangingConfigurations());
        boolean z = !zsm0.r(xmlResourceParser2, "autoMirrored") ? false : typedArrayS.getBoolean(5, false);
        x23Var.k(typedArrayS.getChangingConfigurations());
        float fD = x23Var.d(typedArrayS, "viewportWidth", 7, 0.0f);
        float fD2 = x23Var.d(typedArrayS, "viewportHeight", 8, 0.0f);
        if (fD <= 0.0f) {
            throw new XmlPullParserException(ohs0.n(typedArrayS.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
        }
        if (fD2 <= 0.0f) {
            throw new XmlPullParserException(ohs0.n(typedArrayS.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
        }
        int i8 = 3;
        float dimension = typedArrayS.getDimension(3, 0.0f);
        x23Var.k(typedArrayS.getChangingConfigurations());
        float dimension2 = typedArrayS.getDimension(2, 0.0f);
        x23Var.k(typedArrayS.getChangingConfigurations());
        if (typedArrayS.hasValue(1)) {
            TypedValue typedValue = new TypedValue();
            typedArrayS.getValue(1, typedValue);
            if (typedValue.type == 2) {
                jD = y3d.g;
            } else {
                ColorStateList colorStateListN = zsm0.n(typedArrayS, xmlResourceParser2, theme);
                x23Var.k(typedArrayS.getChangingConfigurations());
                jD = colorStateListN != null ? fbc.d(colorStateListN.getDefaultColor()) : y3d.g;
            }
        } else {
            jD = y3d.g;
        }
        int i9 = typedArrayS.getInt(6, -1);
        x23Var.k(typedArrayS.getChangingConfigurations());
        if (i9 == -1) {
            i2 = 5;
        } else if (i9 == 3) {
            i2 = 3;
        } else if (i9 == 5) {
            i2 = 5;
        } else if (i9 != 9) {
            switch (i9) {
                case 14:
                    i2 = 13;
                    break;
                case 15:
                    i2 = 14;
                    break;
                case 16:
                    i2 = 12;
                    break;
                default:
                    i2 = 5;
                    break;
            }
        } else {
            i2 = 9;
        }
        float f = dimension / resources.getDisplayMetrics().density;
        float f2 = dimension2 / resources.getDisplayMetrics().density;
        typedArrayS.recycle();
        int i10 = 1;
        int i11 = 2;
        q2x q2xVar = new q2x(f, f2, fD, fD2, jD, i2, z, 1);
        int i12 = 0;
        while (true) {
            int eventType = xmlResourceParser2.getEventType();
            arrayList = q2xVar.i;
            if (eventType != i10 && (xmlResourceParser2.getDepth() >= i10 || xmlResourceParser2.getEventType() != i8)) {
                kd30 kd30Var = (kd30) x23Var.e;
                int eventType2 = xmlPullParser.getEventType();
                if (eventType2 == i11) {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayS2 = zsm0.s(resources, theme, attributeSetAsAttributeSet, wb.c);
                                    x23Var.k(typedArrayS2.getChangingConfigurations());
                                    float fD3 = x23Var.d(typedArrayS2, "rotation", 5, 0.0f);
                                    float f3 = typedArrayS2.getFloat(1, 0.0f);
                                    x23Var.k(typedArrayS2.getChangingConfigurations());
                                    float f4 = typedArrayS2.getFloat(2, 0.0f);
                                    x23Var.k(typedArrayS2.getChangingConfigurations());
                                    float fD4 = x23Var.d(typedArrayS2, "scaleX", 3, 1.0f);
                                    float fD5 = x23Var.d(typedArrayS2, "scaleY", 4, 1.0f);
                                    float fD6 = x23Var.d(typedArrayS2, "translateX", 6, 0.0f);
                                    float fD7 = x23Var.d(typedArrayS2, "translateY", 7, 0.0f);
                                    String string = typedArrayS2.getString(0);
                                    x23Var.k(typedArrayS2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayS2.recycle();
                                    iun iunVar = q4u0.f28120a;
                                    if (q2xVar.k) {
                                        xcx.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    arrayList.add(new p2x(str, fD3, f3, f4, fD4, fD5, fD6, fD7, iunVar, 512));
                                    int[] iArrCopyOf = (int[]) x23Var.d;
                                    if (iArrCopyOf == null) {
                                        iArrCopyOf = new int[4];
                                        x23Var.d = iArrCopyOf;
                                    } else if (x23Var.b >= iArrCopyOf.length) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                        x23Var.d = iArrCopyOf;
                                    }
                                    int i13 = x23Var.b;
                                    x23Var.b = i13 + 1;
                                    iArrCopyOf[i13] = i12;
                                    i12 = 0;
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayS3 = zsm0.s(resources, theme, attributeSetAsAttributeSet, wb.d);
                                x23Var.k(typedArrayS3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    jf4.o("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayS3.getString(0);
                                x23Var.k(typedArrayS3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayS3.getString(2);
                                x23Var.k(typedArrayS3.getChangingConfigurations());
                                if (string3 == null) {
                                    list2 = q4u0.f28120a;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    kd30Var.R(string3, arrayList2);
                                    list2 = arrayList2;
                                }
                                List list3 = list2;
                                zz2 zz2VarO2 = zsm0.o(typedArrayS3, xmlPullParser, theme, "fillColor", 1);
                                x23Var.k(typedArrayS3.getChangingConfigurations());
                                float fD8 = x23Var.d(typedArrayS3, "fillAlpha", 12, 1.0f);
                                int iP3 = zsm0.p(typedArrayS3, xmlPullParser, "strokeLineCap", 8, -1);
                                x23Var.k(typedArrayS3.getChangingConfigurations());
                                if (iP3 != 0) {
                                    if (iP3 != 1) {
                                        i3 = 2;
                                        if (iP3 == 2) {
                                            i4 = 2;
                                        }
                                    } else {
                                        i3 = 2;
                                        i4 = 1;
                                    }
                                    iP = zsm0.p(typedArrayS3, xmlPullParser, "strokeLineJoin", 9, -1);
                                    x23Var.k(typedArrayS3.getChangingConfigurations());
                                    if (iP == 0) {
                                        i5 = 0;
                                    } else if (iP != 1) {
                                        i5 = 1;
                                    } else if (iP != i3) {
                                        i5 = 0;
                                    } else {
                                        i5 = i3;
                                    }
                                    float fD9 = x23Var.d(typedArrayS3, "strokeMiterLimit", 10, 4.0f);
                                    zz2VarO = zsm0.o(typedArrayS3, xmlPullParser, theme, "strokeColor", 3);
                                    x23Var.k(typedArrayS3.getChangingConfigurations());
                                    float fD10 = x23Var.d(typedArrayS3, "strokeAlpha", 11, 1.0f);
                                    float fD11 = x23Var.d(typedArrayS3, "strokeWidth", 4, 1.0f);
                                    float fD12 = x23Var.d(typedArrayS3, "trimPathEnd", 6, 1.0f);
                                    float fD13 = x23Var.d(typedArrayS3, "trimPathOffset", 7, 0.0f);
                                    float fD14 = x23Var.d(typedArrayS3, "trimPathStart", 5, 0.0f);
                                    iP2 = zsm0.p(typedArrayS3, xmlPullParser, "fillType", 13, 0);
                                    x23Var.k(typedArrayS3.getChangingConfigurations());
                                    typedArrayS3.recycle();
                                    shader = (Shader) zz2VarO2.b;
                                    if (shader == null && zz2VarO2.f45232a == 0) {
                                        skk0Var = null;
                                    } else if (shader != null) {
                                        skk0Var = new u89(shader);
                                    } else {
                                        skk0Var = new skk0(fbc.d(zz2VarO2.f45232a));
                                    }
                                    shader2 = (Shader) zz2VarO.b;
                                    if (shader2 == null && zz2VarO.f45232a == 0) {
                                        skk0Var2 = null;
                                    } else if (shader2 != null) {
                                        skk0Var2 = new u89(shader2);
                                    } else {
                                        skk0Var2 = new skk0(fbc.d(zz2VarO.f45232a));
                                    }
                                    if (iP2 == 0) {
                                        i6 = 0;
                                    } else {
                                        i6 = 1;
                                    }
                                    if (q2xVar.k) {
                                        xcx.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((p2x) dw9.l(1, arrayList)).j.add(new u4u0(str2, list3, i6, skk0Var, fD8, skk0Var2, fD10, fD11, i4, i5, fD9, fD14, fD12, fD13));
                                } else {
                                    i3 = 2;
                                }
                                i4 = 0;
                                iP = zsm0.p(typedArrayS3, xmlPullParser, "strokeLineJoin", 9, -1);
                                x23Var.k(typedArrayS3.getChangingConfigurations());
                                if (iP == 0) {
                                    i5 = 0;
                                } else if (iP != 1) {
                                    i5 = 1;
                                } else if (iP != i3) {
                                    i5 = 0;
                                } else {
                                    i5 = i3;
                                }
                                float fD15 = x23Var.d(typedArrayS3, "strokeMiterLimit", 10, 4.0f);
                                zz2VarO = zsm0.o(typedArrayS3, xmlPullParser, theme, "strokeColor", 3);
                                x23Var.k(typedArrayS3.getChangingConfigurations());
                                float fD16 = x23Var.d(typedArrayS3, "strokeAlpha", 11, 1.0f);
                                float fD17 = x23Var.d(typedArrayS3, "strokeWidth", 4, 1.0f);
                                float fD18 = x23Var.d(typedArrayS3, "trimPathEnd", 6, 1.0f);
                                float fD19 = x23Var.d(typedArrayS3, "trimPathOffset", 7, 0.0f);
                                float fD110 = x23Var.d(typedArrayS3, "trimPathStart", 5, 0.0f);
                                iP2 = zsm0.p(typedArrayS3, xmlPullParser, "fillType", 13, 0);
                                x23Var.k(typedArrayS3.getChangingConfigurations());
                                typedArrayS3.recycle();
                                shader = (Shader) zz2VarO2.b;
                                if (shader == null) {
                                    skk0Var = null;
                                } else if (shader != null) {
                                    skk0Var = new u89(shader);
                                } else {
                                    skk0Var = new skk0(fbc.d(zz2VarO2.f45232a));
                                }
                                shader2 = (Shader) zz2VarO.b;
                                if (shader2 == null) {
                                    skk0Var2 = null;
                                } else if (shader2 != null) {
                                    skk0Var2 = new u89(shader2);
                                } else {
                                    skk0Var2 = new skk0(fbc.d(zz2VarO.f45232a));
                                }
                                if (iP2 == 0) {
                                    i6 = 0;
                                } else {
                                    i6 = 1;
                                }
                                if (q2xVar.k) {
                                    xcx.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((p2x) dw9.l(1, arrayList)).j.add(new u4u0(str2, list3, i6, skk0Var, fD8, skk0Var2, fD16, fD17, i4, i5, fD15, fD110, fD18, fD19));
                            }
                        } else if (name.equals("clip-path")) {
                            TypedArray typedArrayS4 = zsm0.s(resources, theme, attributeSetAsAttributeSet, wb.e);
                            x23Var.k(typedArrayS4.getChangingConfigurations());
                            String string4 = typedArrayS4.getString(0);
                            x23Var.k(typedArrayS4.getChangingConfigurations());
                            String str3 = string4 == null ? "" : string4;
                            String string5 = typedArrayS4.getString(1);
                            x23Var.k(typedArrayS4.getChangingConfigurations());
                            if (string5 == null) {
                                list = q4u0.f28120a;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                kd30Var.R(string5, arrayList3);
                                list = arrayList3;
                            }
                            typedArrayS4.recycle();
                            if (q2xVar.k) {
                                xcx.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            arrayList.add(new p2x(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list, 512));
                            i12++;
                        }
                    }
                } else if (eventType2 == i8 && "group".equals(xmlPullParser.getName())) {
                    int i14 = i12 + 1;
                    int i15 = 0;
                    while (i15 < i14) {
                        if (q2xVar.k) {
                            xcx.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                        }
                        p2x p2xVar = (p2x) hne.k(i10, arrayList);
                        ((p2x) dw9.l(i10, arrayList)).j.add(new p4u0(p2xVar.f26271a, p2xVar.b, p2xVar.c, p2xVar.d, p2xVar.e, p2xVar.f, p2xVar.g, p2xVar.h, p2xVar.i, p2xVar.j));
                        i15++;
                        i10 = 1;
                    }
                    int[] iArr = (int[]) x23Var.d;
                    if (iArr == null || (i7 = x23Var.b) == 0) {
                        i12 = 0;
                    } else {
                        int i16 = i7 - 1;
                        x23Var.b = i16;
                        i12 = iArr[i16];
                    }
                }
                xmlResourceParser.next();
                xmlResourceParser2 = xmlResourceParser;
                i10 = 1;
                i11 = 2;
                i8 = 3;
            }
        }
        int i17 = i | x23Var.f40148a;
        if (q2xVar.k) {
            xcx.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (arrayList.size() > 1) {
            if (q2xVar.k) {
                xcx.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            p2x p2xVar2 = (p2x) hne.k(1, arrayList);
            ((p2x) dw9.l(1, arrayList)).j.add(new p4u0(p2xVar2.f26271a, p2xVar2.b, p2xVar2.c, p2xVar2.d, p2xVar2.e, p2xVar2.f, p2xVar2.g, p2xVar2.h, p2xVar2.i, p2xVar2.j));
        }
        p2x p2xVar3 = q2xVar.j;
        r2x r2xVar = new r2x(q2xVar.f28023a, q2xVar.b, q2xVar.c, q2xVar.d, q2xVar.e, new p4u0(p2xVar3.f26271a, p2xVar3.b, p2xVar3.c, p2xVar3.d, p2xVar3.e, p2xVar3.f, p2xVar3.g, p2xVar3.h, p2xVar3.i, p2xVar3.j), q2xVar.f, q2xVar.g, q2xVar.h);
        q2xVar.k = true;
        return new s2x(r2xVar, i17);
    }

    public static final void n(fet fetVar) {
        fetVar.b(Unit.f46060a, new i9t0((byte) 7));
    }

    public static final void o(fet fetVar, Object obj, Function2 function2) {
        if (fetVar.S || !Intrinsics.d(fetVar.P(), obj)) {
            fetVar.o0(obj);
            fetVar.b(obj, function2);
        }
    }

    public static final String p(ygq0 ygq0Var) {
        ygq0Var.getClass();
        switch (ygq0Var.ordinal()) {
            case 0:
                return "";
            case 1:
                return "30";
            case 2:
                return "60";
            case 3:
                return "120";
            case 4:
                return "360";
            case 5:
                return "720";
            case 6:
                return "1440";
            case 7:
                return "2880";
            case 8:
                return "1440";
            case 9:
                return "7200";
            case 10:
                return "10080";
            case 11:
                return "14400";
            case 12:
                return "43200";
            case 13:
            default:
                return "";
            case 14:
                return "15";
        }
    }

    public static final String q(ctf0 ctf0Var, suo0 suo0Var) {
        ctf0Var.getClass();
        if (suo0Var instanceof ouo0) {
            pn40 pn40Var = pn40.f27267a;
            ouo0 ouo0Var = (ouo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_prize_bonus_title, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(ouo0Var.f25886a, 2)), ouo0Var.b}, 2));
        }
        if (!(suo0Var instanceof puo0)) {
            return ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        }
        pn40 pn40Var2 = pn40.f27267a;
        return ctf0Var.b.a(R.string.daily_task_prize_fs_title, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(((puo0) suo0Var).f27627a, 0))}, 1));
    }

    public static final String r(ctf0 ctf0Var, suo0 suo0Var) {
        ctf0Var.getClass();
        if (!(suo0Var instanceof ouo0)) {
            return null;
        }
        return ctf0Var.b.a(R.string.daily_task_prize_bonus_x_wager, Arrays.copyOf(new Object[]{Integer.valueOf(((ouo0) suo0Var).c)}, 1));
    }

    public static final q56 s(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        q56 l56Var;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        ctf0Var.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal != 0) {
            boolean z5 = true;
            if (iOrdinal != 1) {
                d2i d2iVar = null;
                if (iOrdinal != 2) {
                    c2m c2mVar = c2m.f3631a;
                    if (iOrdinal == 3) {
                        long j = d0tVar.f5282a;
                        n0x n0xVar = new n0x(dtb.F(str));
                        if (!qzb.B0(d0tVar) && !kpb.j0(d0tVar)) {
                            z5 = false;
                        }
                        l56Var = new n56(j, s7n0.p(d0tVar, str, kpb.G(d0tVar, ctf0Var), list, z2, z3, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new t66(new sws0(qzb.s0(d0tVar), kpb.D(d0tVar)), new sws0(qzb.t0(d0tVar), kpb.U(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
                    } else {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return null;
                        }
                        l56Var = new m56(d0tVar.f5282a, s7n0.o(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new l66(new z1m(c2mVar), dyb.a0(d0tVar), new tws0(qzb.s0(d0tVar), kpb.D(d0tVar)), new tws0(qzb.t0(d0tVar), kpb.U(d0tVar)), kpb.G(d0tVar, ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                    }
                } else {
                    long j2 = d0tVar.f5282a;
                    k4i k4iVarQ = s7n0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    rws0 rws0Var = new rws0(qzb.s0(d0tVar), kpb.D(d0tVar));
                    rws0 rws0Var2 = new rws0(qzb.t0(d0tVar), kpb.U(d0tVar));
                    p0n p0nVarA0 = dyb.a0(d0tVar);
                    String strG = kpb.G(d0tVar, ctf0Var);
                    if (d0tVar.S && z4) {
                        d2iVar = new d2i();
                    }
                    l56Var = new o56(j2, k4iVarQ, new b76(d2iVar, p0nVarA0, rws0Var, rws0Var2, strG), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
            } else {
                l56Var = new p56(d0tVar.f5282a, s7n0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new j76(new qws0(qzb.s0(d0tVar)), new qws0(qzb.t0(d0tVar)), dyb.a0(d0tVar), kpb.G(d0tVar, ctf0Var), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            l56Var = new l56(d0tVar.f5282a, s7n0.n(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new d66(new pws0(qzb.s0(d0tVar), kpb.D(d0tVar)), new pws0(qzb.t0(d0tVar), kpb.U(d0tVar)), new lpm(opm.f25648a, new hpm(0L, 3)), dyb.a0(d0tVar), kpb.G(d0tVar, ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return l56Var;
    }

    public static final r2x t(int i, int i2, fet fetVar) {
        Context context = (Context) fetVar.k(dy2.b);
        Resources resources = (Resources) fetVar.k(dy2.c);
        Resources.Theme theme = context.getTheme();
        boolean zG = ((((i2 & 112) ^ 48) > 32 && fetVar.e(i)) || (i2 & 48) == 32) | fetVar.g(resources) | fetVar.g(theme) | fetVar.g(resources.getConfiguration());
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            k5n0.y(xml);
            objP = m(theme, resources, xml, typedValue.changingConfigurations).f31526a;
            fetVar.o0(objP);
        }
        return (r2x) objP;
    }

    public static final mm40 u(mm40 mm40Var, v0v0 v0v0Var) {
        mm40Var.getClass();
        return mm40Var.e(new w0v0(v0v0Var));
    }

    public static String v(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}

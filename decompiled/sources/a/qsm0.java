package a;

import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qsm0 {
    public static final void A(StringBuilder sb, Iterator it, bzs0 bzs0Var) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(bzs0.g(entry.getKey()));
            sb.append(" : ");
            sb.append(bzs0.g(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(bzs0.g(entry2.getKey()));
                sb.append(" : ");
                sb.append(bzs0.g(entry2.getValue()));
            }
        }
    }

    public static final void a(mm40 mm40Var, gmk gmkVar, boolean z, fet fetVar, int i) {
        long jM98getGreen0d7_KjU;
        fetVar.g0(906708709);
        int i2 = (fetVar.g(gmkVar) ? 32 : 16) | i | (fetVar.h(z) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (z) {
            fetVar.e0(709983873);
            zcl zclVar = qmk.f28987a;
            dw9.x(o7k0.s(o7k0.e(lgb.J(mm40Var, vgg0.a(360.0f)), 14.0f), 72.0f), vbc.d0(null, fetVar, 0, 1), fetVar, 0, false);
        } else if (gmkVar != null) {
            fetVar.e0(710297004);
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                if (gmkVar instanceof emk) {
                    pz40 pz40Var = s6t0.f31722a;
                    jM98getGreen0d7_KjU = s6t0.b().f33626a.getTextPrimary();
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    jM98getGreen0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                }
                objP = dw9.e(jM98getGreen0d7_KjU, fetVar);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1357879849, new my2(mm40Var, gmkVar, ((y3d) objP).f41946a), fetVar), fetVar, 56);
            fetVar.r(false);
        } else {
            fetVar.e0(711358909);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) gmkVar, z, i, (byte) 24);
        }
    }

    public static final void b(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1722490825);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(1545147654);
            fetVar2.r(false);
        } else {
            fetVar2.e0(1545147655);
            k(str, fetVar2, (i2 >> 3) & 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 2.0f, 0.0f, 2);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(Separators.COLON, mm40VarL, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 6, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 12);
        }
    }

    public static final void c(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1646286969);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(-303471820);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-303471819);
            k(str, fetVar2, (i2 >> 3) & 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 2.0f, 0.0f, 2);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(Separators.COLON, mm40VarL, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 6, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 7);
        }
    }

    public static final void d(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fetVar.g0(1811498279);
        if ((i & 48) == 0) {
            i2 = (fetVar.g(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        byte b = 3;
        if (!fetVar.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar.X();
        } else if (str == null) {
            fetVar.e0(81217481);
            fetVar.r(false);
        } else {
            fetVar.e0(81217482);
            k(str, fetVar, (i2 >> 3) & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, b);
        }
    }

    public static final fp e(vby vbyVar, String str) {
        vbyVar.getClass();
        str.getClass();
        return new fp(str, vbyVar.f37162a);
    }

    public static final void f(gxo0 gxo0Var, boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        gxo0Var.getClass();
        boolean z2 = gxo0Var.d;
        gmk gmkVar = gxo0Var.c;
        function0.getClass();
        fetVar2.g0(1288066605);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(gxo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z3 = gmkVar != null || z2;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, 0.0f, 10.0f, 1), 1.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            mm40 mm40VarW = y860.W(mm40VarD, (gy40) objP, null, true, null, function0, 24);
            boolean zH = fetVar2.h(z3);
            Object objP2 = fetVar2.P();
            if (zH || objP2 == cl5Var) {
                objP2 = new kp2((byte) 10, z3);
                fetVar2.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarK0 = mrv.k0(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), "headerLabel");
            int i3 = i2;
            boolean z4 = z3;
            v8q0.a(gxo0Var.f12087a, mm40VarK0, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            if (z4) {
                fetVar2.e0(-1265827207);
                a(mrv.k0(jm40Var, "difference"), gmkVar, z2, fetVar2, 6);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1265576386);
                fetVar2.r(false);
            }
            acb.n(new ac(new y3d(((StaticColors) fetVar2.k(m8m0.f21378a)).m121getTransparent0d7_KjU()), null, 6), !z, function0, mrv.k0(o7k0.e(jm40Var, 18.0f), "accordion"), fetVar2, i3 & 896, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx((Object) gxo0Var, z, (Object) function0, i, (byte) 11);
        }
    }

    public static final void g(mm40 mm40Var, vdp0 vdp0Var, ugd ugdVar, fet fetVar) {
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
        ugdVar.j(jr8.f16991a, vdp0Var, fetVar, 390);
        fetVar.r(true);
    }

    public static final void h(mm40 mm40Var, ixp0 ixp0Var, fet fetVar, int i) {
        fetVar.g0(1473319452);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(ixp0Var) ? 32 : 16);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pzp0.a(u1c.M(1215146505, new yzp0(mm40Var, ixp0Var, b), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzp0(mm40Var, ixp0Var, i, b2);
        }
    }

    public static final void i(mm40 mm40Var, ixp0 ixp0Var, fet fetVar, int i) {
        fetVar.g0(-1743728201);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(ixp0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pzp0.b(u1c.M(869420080, new yzp0(mm40Var, ixp0Var, b), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzp0(mm40Var, ixp0Var, i, (byte) 3);
        }
    }

    public static final void j(r0q0 r0q0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        r0q0Var.getClass();
        fetVar.g0(-354462759);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(r0q0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nop0((Object) r0q0Var, (byte) 9);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            b8k0.e(jm40Var, null, null, null, null, null, false, null, (Function1) objP, fetVar2, i2 & 14, 510);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(r0q0Var, i);
        }
    }

    public static final void k(String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-652974965);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarB = o7k0.b(jm40.b, 20.0f, 0.0f, 2);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarB, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 2.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.a(), fetVar, i2 & 14, 24576, 113658);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v((byte) 13, i, str);
        }
    }

    public static final void l(y5d y5dVar, String str, fet fetVar, int i) {
        int i2;
        byte b;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(134479267);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(y5dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            b = 1;
            fetVar2.X();
        } else if (str.length() > 0) {
            fetVar2.e0(-932539034);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            b = 1;
            v8q0.a(str, mm40VarN, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            b = 1;
            fetVar2.e0(-931930721);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z460(y5dVar, str, i, b);
        }
    }

    public static final void m(int i, fet fetVar) {
        Object obj;
        Object bg0Var;
        fetVar.g0(-507548958);
        if (fetVar.U(i & 1, i != 0)) {
            Fragment fragment = (Fragment) fetVar.k(mr00.f22246a);
            Object obj2 = (rdo0) fetVar.k(sdo0.f32043a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = a4n0.f(fragment);
                fetVar.o0(objP);
            }
            i1w0 i1w0Var = (i1w0) objP;
            String name = xxi.class.getName();
            Context applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
            boolean z = false;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP2 = fetVar.P();
            byte b = 3;
            if (objP2 == cl5Var) {
                objP2 = new rlb0(application, i1w0Var, b);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zG = fetVar.g(riu0VarA) | fetVar.g(name);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 10);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP3 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar.o0(objP3);
            }
            Object obj3 = ((kgd) objP3).b;
            if (obj3 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.top.impl.di.screen.TopScreenComponent");
                return;
            }
            xxi xxiVar = (xxi) obj3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = (wxi) xxiVar.j0.get();
                fetVar.o0(objP4);
            }
            wxi wxiVar = (wxi) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = xxiVar.e0;
                fetVar.o0(objP5);
            }
            Object obj4 = (wdk0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = xxiVar.i.d();
                x1x.x(objP6);
                fetVar.o0(objP6);
            }
            Object obj5 = (ujd) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                v5i v5iVar = (v5i) xxiVar.k.b;
                objP7 = new v2t0((wdk0) v5iVar.u, (ii) v5iVar.v);
                fetVar.o0(objP7);
            }
            Object obj6 = (v2t0) objP7;
            sgy sgyVarB = sre0.f32672a.b(ofr0.class);
            q0h0 q0h0Var = new q0h0(wxiVar);
            int i2 = ofr0.U0;
            k3t0 k3t0VarX = n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            boolean zI = fetVar.i(obj5) | fetVar.i(fragment) | fetVar.i(k3t0VarX) | fetVar.i(obj6);
            Object objP8 = fetVar.P();
            if (zI || objP8 == cl5Var) {
                obj = obj6;
                Object zbg0Var = new zbg0(obj5, fragment, obj, k3t0VarX, (byte) 3);
                fetVar.o0(zbg0Var);
                objP8 = zbg0Var;
            } else {
                obj = obj6;
            }
            Function0 function1 = (Function0) objP8;
            boolean zI2 = fetVar.i(obj) | fetVar.i(fragment) | fetVar.i(obj5);
            Object objP9 = fetVar.P();
            if (zI2 || objP9 == cl5Var) {
                objP9 = new ck60(obj, fragment, obj5, (byte) 23);
                fetVar.o0(objP9);
            }
            v3c.A(function1, (Function0) objP9, null, fetVar, 0, 4);
            boolean zG2 = fetVar.g(obj2) | fetVar.i(fragment) | fetVar.i(obj4) | fetVar.i(k3t0VarX) | fetVar.i(obj) | fetVar.i(obj5);
            Object objP10 = fetVar.P();
            if (zG2 || objP10 == cl5Var) {
                bg0Var = new bg0(obj2, fragment, obj4, k3t0VarX, obj, obj5, (byte) 19);
                fetVar.o0(bg0Var);
            } else {
                bg0Var = objP10;
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) bg0Var, fetVar);
            boolean zI3 = fetVar.i(k3t0VarX) | fetVar.i(clzVar) | fetVar.e(r8) | fetVar.g(pz40VarF);
            Object objP11 = fetVar.P();
            if (zI3 || objP11 == cl5Var) {
                objP11 = new kc70(k3t0VarX, clzVar, pz40VarF, 0, (byte) 26);
                fetVar.o0(objP11);
            }
            m0x0.t(fetVar, clzVar, (Function2) objP11);
            Unit unit = Unit.f46060a;
            boolean zI4 = fetVar.i(k3t0VarX);
            Object objP12 = fetVar.P();
            if (zI4 || objP12 == cl5Var) {
                objP12 = new w480(k3t0VarX, z, r8);
                fetVar.o0(objP12);
            }
            m0x0.t(fetVar, unit, (Function2) objP12);
            boolean zI5 = fetVar.i(k3t0VarX);
            Object objP13 = fetVar.P();
            if (zI5 || objP13 == cl5Var) {
                objP13 = new s9r0(k3t0VarX, r8);
                fetVar.o0(objP13);
            }
            Function0 function2 = (Function0) objP13;
            boolean zI6 = fetVar.i(k3t0VarX);
            Object objP14 = fetVar.P();
            if (zI6 || objP14 == cl5Var) {
                objP14 = new s9r0(k3t0VarX, (byte) 4);
                fetVar.o0(objP14);
            }
            v3c.z(function2, (Function0) objP14, null, fetVar, 0, 4);
            i3t0 i3t0Var = (i3t0) k3t0VarX;
            r8x.s(zdx.H(fetVar), u1c.M(-1968368909, new znk(ddz.a(0, 0, fetVar, 0, 3), i3t0Var, i3t0Var.y(fetVar), (byte) 5), fetVar), fetVar, 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new shq0(i, (byte) 24);
        }
    }

    public static final void n(uxr0 uxr0Var, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-1987786744);
        int i2 = (fetVar.g(uxr0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(o7k0.e(mm40VarD, 26.0f), 8.0f, 4.0f, 8.0f, 2.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            fetVar2 = fetVar;
            j6n.h(uxr0Var.f36456a, uxr0Var.b, null, 0, 0, fetVar2, 0, 28);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p6r0(uxr0Var, i, (byte) 16);
        }
    }

    public static final void o(final s7u0 s7u0Var, final Function1 function1, fet fetVar, int i) {
        final byte b;
        fet fetVar2 = fetVar;
        s7u0Var.getClass();
        String str = s7u0Var.b;
        function1.getClass();
        fetVar2.g0(-575777464);
        final byte b2 = 2;
        int i2 = i | (fetVar2.g(s7u0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        final byte b3 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarW, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.r7u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        s7u0 s7u0Var2 = s7u0Var;
                        Function1 function2 = function1;
                        switch (b4) {
                            case 0:
                                function2.invoke(Integer.valueOf(s7u0Var2.f31769a));
                                break;
                            case 1:
                                function2.invoke(Integer.valueOf(s7u0Var2.f31769a));
                                break;
                            default:
                                function2.invoke(Integer.valueOf(s7u0Var2.f31769a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP);
            }
            mm40 mm40VarW2 = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW2);
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
            rqm rqmVar = s7u0Var.c;
            boolean z2 = str.length() > 0;
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                b = 1;
                objP2 = new Function0() { // from class: a.r7u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b;
                        s7u0 s7u0Var2 = s7u0Var;
                        Function1 function2 = function1;
                        switch (b4) {
                            case 0:
                                function2.invoke(Integer.valueOf(s7u0Var2.f31769a));
                                break;
                            case 1:
                                function2.invoke(Integer.valueOf(s7u0Var2.f31769a));
                                break;
                            default:
                                function2.invoke(Integer.valueOf(s7u0Var2.f31769a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP2);
            } else {
                b = 1;
            }
            Function0 function0 = (Function0) objP2;
            int i5 = (i4 == 4 ? b : (byte) 0) | (i3 == 32 ? b : (byte) 0);
            Object objP3 = fetVar2.P();
            if (i5 != 0 || objP3 == cl5Var) {
                objP3 = new Function0() { // from class: a.r7u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b2;
                        s7u0 s7u0Var2 = s7u0Var;
                        Function1 function2 = function1;
                        switch (b4) {
                            case 0:
                                function2.invoke(Integer.valueOf(s7u0Var2.f31769a));
                                break;
                            case 1:
                                function2.invoke(Integer.valueOf(s7u0Var2.f31769a));
                                break;
                            default:
                                function2.invoke(Integer.valueOf(s7u0Var2.f31769a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
            }
            obc.q(null, rqmVar, z2, null, function0, null, (Function0) objP3, null, fetVar2, 0, 169);
            if (str.length() > 0) {
                fetVar2.e0(-686820387);
                mm40 mm40VarJ = s5x0.J(jm40Var, 12.0f);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str, mm40VarJ, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131064);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-686588476);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(s7u0Var, function1, i, (byte) 27);
        }
    }

    public static final void p(mm40 mm40Var, d6v0 d6v0Var, fet fetVar, int i) {
        int i2;
        long secondary;
        fet fetVar2 = fetVar;
        d6v0Var.getClass();
        fetVar2.g0(-1648936246);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(d6v0Var) : fetVar2.i(d6v0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = d6v0Var.b.ordinal();
            if (iOrdinal == 0) {
                fetVar2.e0(215205907);
                secondary = afn0.m(fetVar2).getSecondary();
                fetVar2.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(215203502, fetVar2, false);
                }
                fetVar2.e0(215208053);
                secondary = afn0.m(fetVar2).getSecondary60();
                fetVar2.r(false);
            }
            zx7 zx7Var = gqw0.e;
            mm40 mm40VarT = o7k0.t(o7k0.e(mm40Var, c6v0.f3837a), c6v0.b, c6v0.c);
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
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
            String str = d6v0Var.f5569a;
            afn0.v(fetVar).getClass();
            long j = secondary;
            v8q0.a(str, s5x0.I(o7k0.d(jm40.b, 1.0f), c6v0.d), j, new n05(qmk.p, qmk.r, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.m(), fetVar, 48, 24576, 113648);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) d6v0Var, i, (byte) 18);
        }
    }

    public static final void q(mm40 mm40Var, tsv0 tsv0Var, l7m0 l7m0Var, fuj0 fuj0Var, w6k w6kVar, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        ugd ugdVar2;
        l7m0Var.getClass();
        fuj0Var.getClass();
        w6kVar.getClass();
        fetVar.g0(-2063801448);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.g(fuj0Var) ? 2048 : 1024) | (fetVar.g(w6kVar) ? 16384 : 8192);
        if (fetVar.U(i5 & 1, (74899 & i5) != 74898)) {
            mm40 mm40VarE0 = jm40.b;
            if (i4 != 0) {
                mm40Var = mm40VarE0;
            }
            tsv0 tsv0Var2 = tsv0.d;
            cl5 cl5Var = ukd.f35823a;
            if (tsv0Var == tsv0Var2) {
                fetVar.e0(-251760078);
            } else {
                fetVar.e0(-251708928);
                boolean z = ((i5 & 7168) == 2048) | ((57344 & i5) == 16384);
                Object objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new m8s0(fuj0Var, tsv0Var, w6kVar, (byte) 12);
                    fetVar.o0(objP);
                }
                mm40VarE0 = x4d0.e0(mm40VarE0, (Function1) objP);
            }
            fetVar.r(false);
            mm40 mm40VarE = mm40Var.e(mm40VarE0);
            boolean z2 = (i5 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new zfv0(l7m0Var, tsv0Var, (byte) 14);
                fetVar.o0(objP2);
            }
            mm40 mm40VarT = i4w0.T(mm40VarE, (Function1) objP2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
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
            ugdVar2 = ugdVar;
            twn.v(6, ugdVar2, fetVar, true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var2, (Object) tsv0Var, (Object) l7m0Var, (Object) fuj0Var, (Object) w6kVar, (wdr) ugdVar2, i, i2, (byte) 18);
        }
    }

    public static final void r(lc00 lc00Var, m9s m9sVar) {
        m9sVar.getClass();
        qqs qqsVar = m9sVar.h;
        List list = qqsVar.c;
        if (qqsVar.c.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("MARBLE_BASEBALL_HEADER_KEY", R.string.inning_statistics));
        lc00Var.add(new v0o0(m9sVar.i, m9sVar.j));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ve90 ve90Var = (ve90) obj;
            int size = list.size();
            String str = m9sVar.i;
            String str2 = m9sVar.j;
            String strM = twn.m(i, "MARBLE_BASEBALL_KEY");
            String strValueOf = String.valueOf(i2);
            String str3 = ve90Var.b;
            String str4 = ve90Var.c;
            boolean z = i % 2 == 0;
            lc00Var.add(new x0o0(size - 1 == i ? z ? R.drawable.cybergame_synthetic_mortal_second_last_bg : R.drawable.cybergame_synthetic_baseball_last_bg : z ? R.drawable.cybergame_synthetic_football_first_bg : R.drawable.cybergame_synthetic_baseball_item_bg, strM, strValueOf, str, str2, str3, str4));
            i = i2;
        }
    }

    public static final kzj0 s(wsy wsyVar) {
        wsyVar.getClass();
        tft0 tft0VarJ0 = wsyVar.j0();
        kzj0 kzj0Var = tft0VarJ0 instanceof kzj0 ? (kzj0) tft0VarJ0 : null;
        if (kzj0Var != null) {
            return kzj0Var;
        }
        udk.e(wsyVar, "This is should be simple type: ");
        return null;
    }

    public static final boolean t(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fot0 fot0Var = (fot0) it.next();
            if (fot0Var != null && v(fot0Var)) {
                return true;
            }
        }
        return false;
    }

    public static final rfu0 u(ArrayList arrayList, Function1 function1) {
        uxs0 uxs0Var = rfu0.f30405a;
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iQ = ((fpt0) function1.invoke((fot0) it.next())).q();
            if (iQ != 0) {
                if (i2 != iQ && i2 != 0) {
                    l8x.E0("UseCaseUtil", ohs0.m("Unexpected configurations: Overwriting current previewStabilizationMode(", i2, ") with useCasePreviewStabilization(", ")!", iQ));
                }
                i2 = iQ;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iN = ((fpt0) function1.invoke((fot0) it2.next())).n();
            if (iN != 0) {
                if (i != iN && i != 0) {
                    l8x.E0("UseCaseUtil", ohs0.m("Unexpected configurations: Overwriting current videoStabilizationMode(", i, ") with useCaseVideoStabilization(", ")!", iN));
                }
                i = iN;
            }
        }
        uxs0Var.getClass();
        if (i2 == 1 || i == 1) {
            return rfu0.c;
        }
        if (i2 == 2) {
            return rfu0.e;
        }
        return i == 2 ? rfu0.d : rfu0.b;
    }

    public static final boolean v(fot0 fot0Var) {
        fot0Var.getClass();
        if (fot0Var.i.f(fpt0.N0)) {
            return fot0Var.i.v() == hpt0.d;
        }
        l8x.X("UseCaseUtil", fot0Var + " UseCase does not have capture type.");
        return false;
    }

    public static final Paint w(Bitmap bitmap, int i, int i2) {
        Matrix matrix = new Matrix();
        float fA = (float) u1c.A(bitmap.getWidth(), bitmap.getHeight(), i, i2, j1h0.f15734a, f7k0.c);
        matrix.setTranslate((i - (bitmap.getWidth() * fA)) / 2.0f, (i2 - (bitmap.getHeight() * fA)) / 2.0f);
        matrix.preScale(fA, fA);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }

    public static final kzj0 x(kzj0 kzj0Var, List list, ays0 ays0Var) {
        kzj0Var.getClass();
        list.getClass();
        ays0Var.getClass();
        if (list.isEmpty() && ays0Var == kzj0Var.K()) {
            return kzj0Var;
        }
        if (list.isEmpty()) {
            return kzj0Var.m0(ays0Var);
        }
        if (!(kzj0Var instanceof a2o)) {
            return ucx.g0(ays0Var, kzj0Var.S(), list, kzj0Var.U());
        }
        a2o a2oVar = (a2o) kzj0Var;
        iys0 iys0Var = a2oVar.b;
        t1o t1oVar = a2oVar.c;
        c2o c2oVar = a2oVar.d;
        boolean z = a2oVar.f;
        String[] strArr = a2oVar.g;
        return new a2o(iys0Var, t1oVar, c2oVar, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static wsy y(wsy wsyVar, List list, g93 g93Var, int i) {
        if ((i & 2) != 0) {
            g93Var = wsyVar.getAnnotations();
        }
        wsyVar.getClass();
        if ((list.isEmpty() || list == wsyVar.J()) && g93Var == wsyVar.getAnnotations()) {
            return wsyVar;
        }
        ays0 ays0VarK = wsyVar.K();
        if ((g93Var instanceof a5q) && ((a5q) g93Var).isEmpty()) {
            g93Var = ujn.c;
        }
        ays0 ays0VarR = gnm0.r(ays0VarK, g93Var);
        tft0 tft0VarJ0 = wsyVar.j0();
        if (tft0VarJ0 instanceof kkq) {
            kkq kkqVar = (kkq) tft0VarJ0;
            return ucx.W(x(kkqVar.b, list, ays0VarR), x(kkqVar.c, list, ays0VarR));
        }
        if (tft0VarJ0 instanceof kzj0) {
            return x((kzj0) tft0VarJ0, list, ays0VarR);
        }
        t9f.b();
        return null;
    }

    public static /* synthetic */ kzj0 z(kzj0 kzj0Var, List list, ays0 ays0Var, int i) {
        if ((i & 1) != 0) {
            list = kzj0Var.J();
        }
        if ((i & 2) != 0) {
            ays0Var = kzj0Var.K();
        }
        return x(kzj0Var, list, ays0Var);
    }
}

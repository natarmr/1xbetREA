package a;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.markets.categories.api.navigation.CategoryMarketsParams;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public class kl5 implements ig9, urd {
    public static an6 d(int i) {
        if (i == 1) {
            return an6.b;
        }
        if (i == 2) {
            return an6.c;
        }
        if (i == 4) {
            return an6.d;
        }
        if (i != 5) {
            return i != 6 ? an6.g : an6.f;
        }
        return an6.e;
    }

    public static pnb f(DialogFields dialogFields, ql5 ql5Var) {
        ql5Var.getClass();
        pnb pnbVar = new pnb();
        pnbVar.R0(dialogFields);
        String str = dialogFields.f;
        if (str == null) {
            str = "";
        }
        iiy[] iiyVarArr = pnb.j2;
        pnbVar.f2.x(pnbVar, iiyVarArr[0], str);
        pnbVar.g2.x(pnbVar, iiyVarArr[1], "GET_BALANCE_REQUEST_KEY");
        pnbVar.h2.u(pnbVar, iiyVarArr[2], ql5Var);
        return pnbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r62v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public void a(mm40 mm40Var, Fragment fragment, CategoryMarketsParams categoryMarketsParams, Function1 function1, fet fetVar, int i) {
        Fragment fragment2;
        Fragment fragment3;
        Object obj;
        xcz xczVar;
        i3t0 i3t0Var;
        i3t0 i3t0Var2;
        Fragment fragment4 = fragment;
        function1.getClass();
        fetVar.g0(-716620563);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(fragment4) ? 32 : 16) | (fetVar.i(categoryMarketsParams) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment4);
                af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(e6b.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof e6b)) {
                        ze3Var = null;
                    }
                    e6b e6bVar = (e6b) ze3Var;
                    if (e6bVar != null) {
                        ?? r4 = fragment4;
                        while (true) {
                            if (r4 == 0) {
                                jf4.n("Can't find feature provider!");
                                return;
                            }
                            if (r4 instanceof ocl0) {
                                ocl0 ocl0Var = (ocl0) r4;
                                cb50 cb50VarV = efx.v(fragment4);
                                i1w0 i1w0VarF = a4n0.f(fragment4);
                                ?? r7 = fragment4;
                                while (true) {
                                    if (r7 == 0) {
                                        jf4.n("Can't find feature provider!");
                                        return;
                                    }
                                    if (r7 instanceof odf0) {
                                        ti6 ti6Var = new ti6(fragment4, b);
                                        cb50VarV.getClass();
                                        i1w0VarF.getClass();
                                        pcl0 pcl0VarU = ocl0Var.u(ti6Var);
                                        cad cadVar = e6bVar.f7273a;
                                        wdk0 wdk0Var = e6bVar.b;
                                        lgn0 lgn0Var = e6bVar.c;
                                        pdf0 pdf0VarB = ((odf0) r7).b();
                                        sue sueVar = e6bVar.d;
                                        m1e m1eVar = e6bVar.e;
                                        duj dujVar = e6bVar.f;
                                        ctf0 ctf0Var = e6bVar.g;
                                        g2v g2vVar = e6bVar.h;
                                        wsf0 wsf0Var = e6bVar.q;
                                        gst0 gst0Var = e6bVar.i;
                                        btt0 btt0Var = e6bVar.j;
                                        b3c0 b3c0Var = e6bVar.k;
                                        j1q0 j1q0Var = e6bVar.l;
                                        r9u r9uVar = e6bVar.m;
                                        reu reuVar = e6bVar.n;
                                        rmd0 rmd0Var = e6bVar.o;
                                        ii iiVar = e6bVar.p;
                                        knf0 knf0Var = e6bVar.r;
                                        iip iipVar = e6bVar.s;
                                        iw20 iw20Var = e6bVar.t;
                                        fvt0 fvt0Var = e6bVar.u;
                                        onv onvVar = e6bVar.v;
                                        d1p d1pVar = e6bVar.w;
                                        drm0 drm0Var = e6bVar.x;
                                        v88 v88Var = e6bVar.y;
                                        onv onvVar2 = e6bVar.z;
                                        kt2 kt2Var = e6bVar.A;
                                        peg0 peg0Var = e6bVar.B;
                                        vwb0 vwb0Var = e6bVar.C;
                                        ouu ouuVar = e6bVar.D;
                                        jw20 jw20Var = e6bVar.E;
                                        cs00 cs00Var = e6bVar.F;
                                        uzc uzcVar = e6bVar.G;
                                        edo edoVar = e6bVar.H;
                                        zfo zfoVar = e6bVar.I;
                                        u8u u8uVar = e6bVar.J;
                                        edu eduVar = e6bVar.K;
                                        bzu bzuVar = e6bVar.L;
                                        o2j0 o2j0Var = e6bVar.M;
                                        vqc vqcVar = e6bVar.N;
                                        ndf0 ndf0Var = e6bVar.O;
                                        qoi qoiVar = e6bVar.P;
                                        pcl0VarU.getClass();
                                        sueVar.getClass();
                                        rmd0Var.getClass();
                                        iipVar.getClass();
                                        d1pVar.getClass();
                                        cs00Var.getClass();
                                        qoiVar.getClass();
                                        wdk0Var.getClass();
                                        m1eVar.getClass();
                                        ctf0Var.getClass();
                                        gst0Var.getClass();
                                        btt0Var.getClass();
                                        b3c0Var.getClass();
                                        j1q0Var.getClass();
                                        r9uVar.getClass();
                                        iiVar.getClass();
                                        knf0Var.getClass();
                                        kt2Var.getClass();
                                        vwb0Var.getClass();
                                        uzcVar.getClass();
                                        edoVar.getClass();
                                        zfoVar.getClass();
                                        o2j0Var.getClass();
                                        objP = new cci(cadVar, pcl0VarU, sueVar, rmd0Var, iipVar, iw20Var, fvt0Var, onvVar, d1pVar, wsf0Var, onvVar2, jw20Var, drm0Var, pdf0VarB, bzuVar, o2j0Var, vqcVar, qoiVar, i1w0VarF, wdk0Var, lgn0Var, dujVar, ctf0Var, g2vVar, gst0Var, j1q0Var, r9uVar, reuVar, iiVar, knf0Var, v88Var, kt2Var, peg0Var, ouuVar, edoVar, zfoVar, u8uVar, eduVar, ndf0Var);
                                        fetVar.o0(objP);
                                        break;
                                    }
                                    fragment4 = fragment;
                                    b = 1;
                                    r7 = r7.y;
                                }
                            } else {
                                fragment4 = fragment;
                                b = 1;
                                r4 = r4.y;
                            }
                        }
                    }
                }
                jf4.n(b1j.i(e6b.class, "Cannot create dependency "));
                return;
            }
            cci cciVar = (cci) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = cciVar.I;
                fetVar.o0(objP2);
            }
            ii iiVar2 = (ii) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = cciVar.J;
                fetVar.o0(objP3);
            }
            wdk0 wdk0Var2 = (wdk0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = cciVar.K;
                fetVar.o0(objP4);
            }
            lgn0 lgn0Var2 = (lgn0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = ((ali) cciVar.L.f25567a).z();
                fetVar.o0(objP5);
            }
            e720 e720Var = (e720) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = cciVar.D.a();
                fetVar.o0(objP6);
            }
            qta0 qta0Var = (qta0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = cciVar.i.w();
                x1x.x(objP7);
                fetVar.o0(objP7);
            }
            vq vqVar = (vq) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = cciVar.M;
                fetVar.o0(objP8);
            }
            ndf0 ndf0Var2 = (ndf0) objP8;
            q0h0 q0h0Var = new q0h0((bci) cciVar.N.get());
            sgy sgyVarB = sre0.f32672a.b(y7b.class);
            int i3 = y7b.K;
            i3t0 i3t0Var3 = (i3t0) n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            pz40 pz40VarY = i3t0Var3.y(fetVar);
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                fragment3 = fragment;
                z430 z430Var = new z430(fragment3, vqVar, iiVar2, e720Var, lgn0Var2, wdk0Var2, qta0Var);
                z430Var.b(new zq2(), new vi6(i3t0Var3, (byte) 1));
                fetVar.o0(z430Var);
                obj = z430Var;
            } else {
                fragment3 = fragment;
                obj = objP9;
            }
            z430 z430Var2 = (z430) obj;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP10);
            }
            vne vneVar = (vne) objP10;
            boolean zI = fetVar.i(z430Var2) | fetVar.i(vneVar) | fetVar.g(xczVarA) | fetVar.i(i3t0Var3);
            Object objP11 = fetVar.P();
            if (zI || objP11 == cl5Var) {
                xczVar = xczVarA;
                objP11 = new dc0((Object) z430Var2, (Object) vneVar, (Object) i3t0Var3, (Object) xczVar, (byte) 18);
                i3t0Var = i3t0Var3;
                fetVar.o0(objP11);
            } else {
                xczVar = xczVarA;
                i3t0Var = i3t0Var3;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP11, fetVar);
            boolean zE = fetVar.e(3) | fetVar.i(i3t0Var) | fetVar.i(fragment3) | fetVar.g(pz40VarF);
            Object objP12 = fetVar.P();
            if (zE || objP12 == cl5Var) {
                Fragment fragment5 = fragment3;
                i3t0Var2 = i3t0Var;
                ta4 ta4Var = new ta4(i3t0Var2, fragment5, pz40VarF, null, (byte) 1);
                fragment2 = fragment5;
                fetVar.o0(ta4Var);
                objP12 = ta4Var;
            } else {
                fragment2 = fragment3;
                i3t0Var2 = i3t0Var;
            }
            m0x0.t(fetVar, fragment2, (Function2) objP12);
            boolean zI2 = fetVar.i(i3t0Var2);
            Object objP13 = fetVar.P();
            if (zI2 || objP13 == cl5Var) {
                objP13 = new vi6(i3t0Var2, (byte) 2);
                fetVar.o0(objP13);
            }
            x8f.p(mm40Var, pz40VarY, xczVar, function1, (Function1) objP13, u1c.M(-679829271, new ec30(ndf0Var2, fragment2, (byte) 17), fetVar), fetVar, (i2 & 14) | 196608 | (i2 & 7168));
        } else {
            fragment2 = fragment4;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) this, (Object) mm40Var, (Object) fragment2, (Object) categoryMarketsParams, (Object) function1, i, (byte) 21);
        }
    }

    public List b(Executor executor) {
        return Collections.singletonList(new ltj(executor));
    }

    public List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // a.ig9
    public byte[] e(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}

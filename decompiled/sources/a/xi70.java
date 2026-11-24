package a;

import android.content.ComponentCallbacks2;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.fragment.app.Fragment;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xi70 {
    public static pzs0 c(hzs0 hzs0Var, fay fayVar, hcp0 hcp0Var, wsy wsyVar) {
        hzs0Var.getClass();
        fayVar.getClass();
        wsyVar.getClass();
        if (!fayVar.c) {
            fayVar = fay.a(fayVar, gay.f10991a, false, null, null, 61);
        }
        int iOrdinal = fayVar.b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new q4m0(wsyVar, t3u0.c);
            }
            t9f.b();
            return null;
        }
        if (hzs0Var.t().b) {
            List parameters = wsyVar.S().getParameters();
            parameters.getClass();
            return !parameters.isEmpty() ? new q4m0(wsyVar, t3u0.e) : e0t0.l(hzs0Var, fayVar);
        }
        t3u0 t3u0Var = t3u0.c;
        int i = rek.f30339a;
        ym40 ym40VarC = oek.c(hzs0Var);
        ym40VarC.getClass();
        return new q4m0(ym40VarC.c().o(), t3u0Var);
    }

    public static gf80 d(int i, int i2, m2a m2aVar, hf80 hf80Var, if80 if80Var, jf80 jf80Var, kf80 kf80Var, Size size, String str) {
        m2a m2aVar2 = m2a.x;
        m2a m2aVar3 = (i2 & 8) != 0 ? m2aVar2 : m2aVar;
        hf80 hf80Var2 = (i2 & 64) != 0 ? null : hf80Var;
        jf80 jf80Var2 = (i2 & 128) != 0 ? null : jf80Var;
        kf80 kf80Var2 = (i2 & 256) != 0 ? null : kf80Var;
        iun iunVar = iun.f15405a;
        size.getClass();
        iunVar.getClass();
        if (m2aVar3 == m2a.z || m2aVar3 == m2a.y || ((m2aVar3 == m2a.B || m2aVar3 == m2a.Y) && Build.VERSION.SDK_INT >= 35)) {
            return new ef80(size, i, str, m2aVar3, if80Var, hf80Var2, jf80Var2, kf80Var2, iunVar);
        }
        if (m2aVar3 == m2aVar2) {
            return new ff80(size, i, str, if80Var, hf80Var2, jf80Var2, kf80Var2, iunVar);
        }
        jf4.n("Check failed.");
        return null;
    }

    public static src0 e(long j) {
        if (j == 0) {
            return src0.b;
        }
        if (j == 1) {
            return src0.c;
        }
        if (j == 2) {
            return src0.d;
        }
        if (j == 3) {
            return src0.e;
        }
        if (j == 4) {
            return src0.f;
        }
        throw new InvalidParameterException();
    }

    public static void f(androidx.fragment.app.e eVar, long j, long j2, int i, String str) {
        eVar.getClass();
        de90 de90Var = new de90();
        iiy[] iiyVarArr = de90.l2;
        de90Var.d2.x(de90Var, iiyVarArr[0], str);
        de90Var.i2.v(de90Var, iiyVarArr[5], j == 0);
        de90Var.g2.j(de90Var, iiyVarArr[3], j2);
        de90Var.f2.j(de90Var, iiyVarArr[2], j);
        de90Var.e2.I(de90Var, iiyVarArr[1], i);
        de90Var.H0(eVar, de90.class.getSimpleName());
    }

    public static void g(androidx.fragment.app.e eVar, String str, String str2, i7a i7aVar) {
        str.getClass();
        i7aVar.getClass();
        String strJ = sre0.f32672a.b(sdd0.class).J();
        if (eVar.J(strJ) == null) {
            sdd0 sdd0Var = new sdd0();
            iiy[] iiyVarArr = sdd0.j2;
            sdd0Var.e2.x(sdd0Var, iiyVarArr[1], str2);
            sdd0Var.f2.x(sdd0Var, iiyVarArr[2], str);
            sdd0Var.g2.u(sdd0Var, iiyVarArr[3], i7aVar);
            sdd0Var.H0(eVar, strJ);
        }
    }

    public static void h(androidx.fragment.app.e eVar) {
        eVar.getClass();
        if (eVar.J("QUICK_BET_DIALOG_TAG") == null) {
            ymd0.o2.getClass();
            ymd0 ymd0Var = new ymd0();
            ymd0Var.n2.x(ymd0Var, ymd0.p2[1], "");
            ymd0Var.H0(eVar, "QUICK_BET_DIALOG_TAG");
        }
    }

    public static void i(androidx.fragment.app.e eVar) {
        eVar.getClass();
        if (eVar.J("QUICK_BET_DIALOG_TAG") == null) {
            ymd0.o2.getClass();
            ymd0 ymd0Var = new ymd0();
            ymd0Var.n2.x(ymd0Var, ymd0.p2[1], "REQUEST_QUICKBET_KEY");
            sj3.E0(ymd0Var, eVar, "QUICK_BET_DIALOG_TAG");
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [a.yje, java.lang.String] */
    public void a(Fragment fragment, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        Object obj;
        i3t0 i3t0Var;
        Fragment fragment2 = fragment;
        fetVar.g0(-732565416);
        int i2 = i | (fetVar.i(fragment2) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment2);
                af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(r6a0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof r6a0)) {
                        ze3Var = null;
                    }
                    r6a0 r6a0Var = (r6a0) ze3Var;
                    if (r6a0Var != null) {
                        androidx.fragment.app.e eVarF = fragment2.F();
                        loop0: while (true) {
                            if (eVarF == null) {
                                jf4.n("Can't find feature provider!");
                                return;
                            }
                            for (int iP = eVarF.P() - 1; iP >= 0; iP--) {
                                i0h0 i0h0VarJ = eVarF.J(eVarF.O(iP).i);
                                if (i0h0VarJ instanceof ocl0) {
                                    pcl0 pcl0VarU = ((ocl0) i0h0VarJ).u(new ti6(fragment2, (byte) 6));
                                    i1w0 i1w0VarF = a4n0.f(fragment2);
                                    Fragment fragment3 = fragment2;
                                    while (true) {
                                        if (fragment3 == null) {
                                            jf4.n("Can't find feature provider!");
                                            return;
                                        }
                                        if (fragment3 instanceof au7) {
                                            cai caiVar = ((au7) fragment3).O1;
                                            if (caiVar == null) {
                                                Intrinsics.h("betsOnPlayersFeature");
                                                throw null;
                                            }
                                            i1w0VarF.getClass();
                                            pcl0VarU.getClass();
                                            cad cadVar = r6a0Var.f29926a;
                                            sue sueVar = r6a0Var.b;
                                            onv onvVar = r6a0Var.f;
                                            fvt0 fvt0Var = r6a0Var.i;
                                            onv onvVar2 = r6a0Var.j;
                                            d1p d1pVar = r6a0Var.m;
                                            rmd0 rmd0Var = r6a0Var.l;
                                            wsf0 wsf0Var = r6a0Var.n;
                                            bzu bzuVar = r6a0Var.o;
                                            obj = null;
                                            vqc vqcVar = r6a0Var.p;
                                            iip iipVar = r6a0Var.q;
                                            drm0 drm0Var = r6a0Var.r;
                                            iw20 iw20Var = r6a0Var.t;
                                            o2j0 o2j0Var = r6a0Var.u;
                                            wdk0 wdk0Var = r6a0Var.c;
                                            ii iiVar = r6a0Var.d;
                                            lgn0 lgn0Var = r6a0Var.e;
                                            j1q0 j1q0Var = r6a0Var.g;
                                            r9u r9uVar = r6a0Var.h;
                                            ctf0 ctf0Var = r6a0Var.k;
                                            duj dujVar = r6a0Var.s;
                                            v88 v88Var = r6a0Var.v;
                                            kt2 kt2Var = r6a0Var.w;
                                            knf0 knf0Var = r6a0Var.x;
                                            gst0 gst0Var = r6a0Var.y;
                                            ouu ouuVar = r6a0Var.z;
                                            peg0 peg0Var = r6a0Var.A;
                                            reu reuVar = r6a0Var.B;
                                            u8u u8uVar = r6a0Var.C;
                                            edu eduVar = r6a0Var.D;
                                            edo edoVar = r6a0Var.E;
                                            zfo zfoVar = r6a0Var.F;
                                            qoi qoiVar = r6a0Var.G;
                                            jw20 jw20Var = r6a0Var.H;
                                            bzt bztVar = r6a0Var.I;
                                            sueVar.getClass();
                                            d1pVar.getClass();
                                            rmd0Var.getClass();
                                            iipVar.getClass();
                                            o2j0Var.getClass();
                                            qoiVar.getClass();
                                            wdk0Var.getClass();
                                            iiVar.getClass();
                                            j1q0Var.getClass();
                                            r9uVar.getClass();
                                            ctf0Var.getClass();
                                            kt2Var.getClass();
                                            knf0Var.getClass();
                                            gst0Var.getClass();
                                            edoVar.getClass();
                                            zfoVar.getClass();
                                            eoi eoiVar = new eoi(cadVar, pcl0VarU, sueVar, onvVar, fvt0Var, onvVar2, d1pVar, rmd0Var, wsf0Var, bzuVar, vqcVar, iipVar, drm0Var, iw20Var, o2j0Var, caiVar, qoiVar, jw20Var, wdk0Var, iiVar, lgn0Var, j1q0Var, r9uVar, i1w0VarF, ctf0Var, dujVar, v88Var, kt2Var, knf0Var, gst0Var, ouuVar, peg0Var, reuVar, u8uVar, eduVar, edoVar, zfoVar, bztVar);
                                            fetVar.o0(eoiVar);
                                            objP = eoiVar;
                                            break loop0;
                                        }
                                        fragment3 = fragment3.y;
                                    }
                                }
                            }
                            Fragment fragment4 = fragment2.y;
                            eVarF = fragment4 != null ? fragment4.F() : null;
                        }
                    }
                }
                jf4.n(b1j.i(r6a0.class, "Cannot create dependency "));
                return;
            }
            obj = null;
            eoi eoiVar2 = (eoi) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = eoiVar2.I;
                fetVar.o0(objP2);
            }
            ii iiVar2 = (ii) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = eoiVar2.J;
                fetVar.o0(objP3);
            }
            wdk0 wdk0Var2 = (wdk0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = eoiVar2.K;
                fetVar.o0(objP4);
            }
            lgn0 lgn0Var2 = (lgn0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = ((ali) eoiVar2.L.f25567a).z();
                fetVar.o0(objP5);
            }
            e720 e720Var = (e720) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = eoiVar2.s.w();
                x1x.x(objP6);
                fetVar.o0(objP6);
            }
            vq vqVar = (vq) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = eoiVar2.y.a();
                fetVar.o0(objP7);
            }
            qta0 qta0Var = (qta0) objP7;
            ?? r13 = obj;
            i3t0 i3t0Var2 = (i3t0) n4c.Y(sre0.f32672a.b(g7a0.class), r13, new fiu0(Collections.singletonMap(g7a0.class, eoiVar2.M)), fetVar, 14);
            pz40 pz40VarY = i3t0Var2.y(fetVar);
            Object objP8 = fetVar.P();
            Object obj2 = objP8;
            if (objP8 == cl5Var) {
                z430 z430Var = new z430(fragment2, vqVar, iiVar2, e720Var, lgn0Var2, wdk0Var2, qta0Var);
                fragment2 = fragment2;
                z430Var.b(new eq2(), new vi6(i3t0Var2, (byte) 10));
                fetVar.o0(z430Var);
                obj2 = z430Var;
            }
            z430 z430Var2 = (z430) obj2;
            boolean zI = fetVar.i(z430Var2) | fetVar.i(i3t0Var2);
            Object objP9 = fetVar.P();
            if (zI || objP9 == cl5Var) {
                objP9 = new ka70(z430Var2, i3t0Var2, (byte) 25);
                fetVar.o0(objP9);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP9, fetVar);
            boolean zI2 = fetVar.i(i3t0Var2) | fetVar.i(fragment2) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP10 = fetVar.P();
            if (zI2 || objP10 == cl5Var) {
                ta4 ta4Var = new ta4(i3t0Var2, fragment2, pz40VarF, r13, (byte) 2);
                i3t0Var = i3t0Var2;
                fetVar.o0(ta4Var);
                objP10 = ta4Var;
            } else {
                i3t0Var = i3t0Var2;
            }
            m0x0.t(fetVar, fragment2, (Function2) objP10);
            boolean zI3 = fetVar.i(i3t0Var);
            Object objP11 = fetVar.P();
            if (zI3 || objP11 == cl5Var) {
                objP11 = new ui6(i3t0Var, (byte) 7);
                fetVar.o0(objP11);
            }
            Function0 function0 = (Function0) objP11;
            boolean zI4 = fetVar.i(i3t0Var);
            Object objP12 = fetVar.P();
            if (zI4 || objP12 == cl5Var) {
                objP12 = new ui6(i3t0Var, (byte) 8);
                fetVar.o0(objP12);
            }
            fet fetVar3 = fetVar;
            v3c.A(function0, (Function0) objP12, null, fetVar3, 0, 4);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, qmk.a(fetVar3).b, 0.0f, 2);
            boolean zI5 = fetVar3.i(i3t0Var);
            Object objP13 = fetVar3.P();
            if (zI5 || objP13 == cl5Var) {
                yi90 yi90Var = new yi90(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                fetVar3.o0(yi90Var);
                objP13 = yi90Var;
            }
            Function1 function2 = (Function1) ((jhy) objP13);
            pz40VarY.getClass();
            function2.getClass();
            c7a0 c7a0Var = (c7a0) pz40VarY.getValue();
            if (c7a0Var != null) {
                if (c7a0Var instanceof a7a0) {
                    fetVar3.e0(284322669);
                    obc.d(kr00.f18743a.a(Boolean.valueOf(((a7a0) c7a0Var).b)), u1c.M(898828891, new xd80(mm40VarL, c7a0Var, (byte) 29), fetVar3), fetVar3, 56);
                    fetVar3.r(false);
                    fetVar2 = fetVar3;
                } else if (c7a0Var instanceof b7a0) {
                    fetVar3.e0(284663948);
                    b7a0 b7a0Var = (b7a0) c7a0Var;
                    obc.d(kr00.f18743a.a(Boolean.valueOf(b7a0Var.b)), u1c.M(2066624466, new s6a0(mm40VarL, androidx.compose.runtime.e.f(b7a0Var.f2097a, fetVar3), function1, function2), fetVar3), fetVar3, 56);
                    fetVar3.r(false);
                    fetVar2 = fetVar3;
                } else if (c7a0Var instanceof z6a0) {
                    fetVar3.e0(-2069012688);
                    jcb.l(mm40VarL, ((z6a0) c7a0Var).f43857a, true, null, fetVar, 384, 8);
                    fet fetVar4 = fetVar;
                    fetVar4.r(false);
                    fetVar2 = fetVar4;
                }
            }
            throw b1j.f(-2069040055, fetVar3, false);
        }
        fragment2 = fragment2;
        fet fetVar5 = fetVar;
        fetVar5.X();
        fetVar2 = fetVar5;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(this, fragment2, function1, i, (byte) 13);
        }
    }

    public Object b(Object obj) throws ozw {
        fko fkoVar;
        s45 s45Var = (s45) obj;
        b1x b1xVar = s45Var.b;
        dzb0 dzb0Var = s45Var.f31589a;
        if (m2x.x(b1xVar.getFormat())) {
            try {
                y50 y50Var = fko.b;
                ByteBuffer byteBufferI = b1xVar.l0()[0].i();
                byteBufferI.rewind();
                byte[] bArr = new byte[byteBufferI.capacity()];
                byteBufferI.get(bArr);
                fkoVar = new fko(new sko(new ByteArrayInputStream(bArr)));
                b1xVar.l0()[0].i().rewind();
            } catch (IOException e) {
                throw new ozw(1, "Failed to extract EXIF data.", e);
            }
        } else {
            fkoVar = null;
        }
        byte b = 16;
        if (((ImageCaptureRotationOptionQuirk) khk.f18297a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
            u15 u15Var = t7a.f;
        } else if (m2x.x(b1xVar.getFormat())) {
            z1x.x(fkoVar, "JPEG image must have exif.");
            Size size = new Size(b1xVar.j(), b1xVar.f());
            int iA = dzb0Var.d - fkoVar.a();
            Size size2 = jls0.c(jls0.i(iA)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixA = jls0.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iA, false);
            RectF rectF = new RectF(dzb0Var.c);
            matrixA.mapRect(rectF);
            rectF.sort();
            Size size3 = size2;
            Rect rect = new Rect();
            rectF.round(rect);
            int iA2 = fkoVar.a();
            Matrix matrix = new Matrix(dzb0Var.f);
            matrix.postConcat(matrixA);
            cy9 cl5Var = b1xVar.K0() instanceof dy9 ? ((dy9) b1xVar.K0()).f6882a : new cl5(b);
            b1xVar.getFormat();
            return new n45(b1xVar, fkoVar, b1xVar.getFormat(), size3, rect, iA2, matrix, cl5Var);
        }
        Rect rect2 = dzb0Var.c;
        int i = dzb0Var.d;
        Matrix matrix2 = dzb0Var.f;
        cy9 cl5Var2 = b1xVar.K0() instanceof dy9 ? ((dy9) b1xVar.K0()).f6882a : new cl5(b);
        Size size4 = new Size(b1xVar.j(), b1xVar.f());
        if (m2x.x(b1xVar.getFormat())) {
            z1x.x(fkoVar, "JPEG image must have Exif.");
        }
        return new n45(b1xVar, fkoVar, b1xVar.getFormat(), size4, rect2, i, matrix2, cl5Var2);
    }
}

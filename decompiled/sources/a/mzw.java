package a;

import android.gov.nist.core.Separators;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class mzw extends fot0 {
    public static final jzw C = new jzw();
    public uii0 A;
    public final g2v B;
    public final int r;
    public final AtomicReference s;
    public final int t;
    public int u;
    public Rational v;
    public final r7h0 w;
    public tii0 x;
    public dgu y;
    public ito0 z;

    public mzw(nzw nzwVar) {
        super(nzwVar);
        this.s = new AtomicReference(null);
        this.u = -1;
        this.v = null;
        this.B = new g2v(this);
        nzw nzwVar2 = (nzw) this.i;
        u15 u15Var = nzw.b;
        if (nzwVar2.f(u15Var)) {
            this.r = ((Integer) nzwVar2.d(u15Var)).intValue();
        } else {
            this.r = 1;
        }
        this.t = ((Integer) nzwVar2.e(nzw.i, 0)).intValue();
        this.w = new r7h0((kzw) nzwVar2.e(nzw.k, null));
    }

    public static boolean J(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // a.fot0
    public final void A() {
        r7h0 r7h0Var = this.w;
        r7h0Var.c();
        r7h0Var.b();
        ito0 ito0Var = this.z;
        if (ito0Var != null) {
            ito0Var.b();
        }
        G(false);
        e().k(null);
    }

    public final void G(boolean z) {
        ito0 ito0Var;
        Log.d("ImageCapture", "clearPipeline");
        ofm0.m();
        uii0 uii0Var = this.A;
        if (uii0Var != null) {
            uii0Var.b();
            this.A = null;
        }
        dgu dguVar = this.y;
        if (dguVar != null) {
            dguVar.d();
            this.y = null;
        }
        if (!z && (ito0Var = this.z) != null) {
            ito0Var.b();
            this.z = null;
        }
        e().a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x005b  */
    public final tii0 H(String str, nzw nzwVar, h55 h55Var) {
        drd drdVarA;
        HashSet hashSet;
        o3x o3xVar;
        boolean zContains;
        byte b = 0;
        ofm0.m();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + h55Var + Separators.RPAREN);
        Size size = h55Var.f12463a;
        s0a s0aVarD = d();
        Objects.requireNonNull(s0aVarD);
        boolean zQ = s0aVarD.q() ^ true;
        CameraCharacteristics cameraCharacteristics = null;
        if (this.y != null) {
            z1x.y(null, zQ);
            this.y.d();
        }
        j0a j0aVarA = d().a();
        if ((j0aVarA instanceof zo) && (drdVarA = ((ipt0) ((zo) j0aVarA).c.e(hy9.H, ipt0.f15179a)).a(hpt0.f13459a, 1)) != null) {
            u15 u15Var = w0x.r0;
            b780 b780Var = (b780) drdVarA;
            if (b780Var.f2093a.containsKey(u15Var)) {
                hashSet = new HashSet();
                hashSet.add(0);
                Iterator it = ((List) b780Var.d(u15Var)).iterator();
                while (it.hasNext()) {
                    if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                        hashSet.add(1);
                        break;
                    }
                }
            } else {
                hashSet = null;
            }
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            hashSet = new HashSet();
            hashSet.add(0);
            if (j0aVarA != null ? ((n0a) j0aVarA).G().contains(4101) : false) {
                hashSet.add(1);
            }
            if (j0aVarA != null) {
                n0a n0aVar = (n0a) j0aVarA;
                if (n0aVar.s().contains(3)) {
                    zContains = n0aVar.G().contains(32);
                } else {
                    zContains = false;
                }
            } else {
                zContains = false;
            }
            if (zContains) {
                hashSet.add(2);
                hashSet.add(3);
            }
        }
        fpt0 fpt0Var = this.i;
        u15 u15Var2 = nzw.f;
        Integer num = (Integer) fpt0Var.e(u15Var2, 0);
        num.getClass();
        boolean zContains2 = hashSet.contains(num);
        StringBuilder sb = new StringBuilder("The specified output format (");
        Integer num2 = (Integer) this.i.e(u15Var2, 0);
        num2.getClass();
        sb.append(num2.intValue());
        sb.append(") is not supported by current configuration. Supported output formats: ");
        sb.append(hashSet);
        z1x.t(sb.toString(), zContains2);
        if (((Boolean) this.i.e(nzw.l, Boolean.FALSE)).booleanValue()) {
            nzwVar.k();
            d().e().o();
        }
        if (d() != null) {
            try {
                Object objJ = d().h().j();
                if (objJ instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objJ;
                }
            } catch (Exception e) {
                Log.e("ImageCapture", "getCameraCharacteristics failed", e);
            }
        }
        this.y = new dgu(nzwVar, size, cameraCharacteristics, zQ);
        ito0 ito0Var = this.z;
        if (ito0Var == null) {
            Objects.requireNonNull((dpt0) this.i.e(fpt0.R0, new dpt0()));
            ito0 ito0Var2 = new ito0(this.B);
            this.z = ito0Var2;
            ito0Var = ito0Var2;
        }
        dgu dguVar = this.y;
        ofm0.m();
        ito0Var.c = dguVar;
        dguVar.getClass();
        ofm0.m();
        esg0 esg0Var = (esg0) dguVar.c;
        ofm0.m();
        z1x.y("The ImageReader is not initialized.", ((ibe0) esg0Var.b) != null);
        ibe0 ibe0Var = (ibe0) esg0Var.b;
        synchronized (ibe0Var.c) {
            ibe0Var.f = ito0Var;
        }
        dgu dguVar2 = this.y;
        tii0 tii0VarD = tii0.d((nzw) dguVar2.f6058a, h55Var.f12463a);
        r15 r15Var = (r15) dguVar2.d;
        o3x o3xVar2 = r15Var.c;
        Objects.requireNonNull(o3xVar2);
        agn agnVar = agn.d;
        gr00 gr00VarA = a55.a(o3xVar2);
        gr00VarA.e = agnVar;
        tii0VarD.f32265a.add(gr00VarA.g());
        if (r15Var.h.size() > 1 && (o3xVar = r15Var.d) != null) {
            gr00 gr00VarA2 = a55.a(o3xVar);
            gr00VarA2.e = agnVar;
            tii0VarD.f32265a.add(gr00VarA2.g());
        }
        o3x o3xVar3 = r15Var.e;
        if (o3xVar3 != null) {
            tii0VarD.i = a55.a(o3xVar3).g();
        }
        tii0VarD.h = h55Var.d;
        if (this.r == 2 && !h55Var.g) {
            e().b(tii0VarD);
        }
        drd drdVar = h55Var.f;
        if (drdVar != null) {
            tii0VarD.b.g(drdVar);
        }
        uii0 uii0Var = this.A;
        if (uii0Var != null) {
            uii0Var.b();
        }
        uii0 uii0Var2 = new uii0(new izw(this, b));
        this.A = uii0Var2;
        tii0VarD.f = uii0Var2;
        return tii0VarD;
    }

    public final int I() {
        int iIntValue;
        synchronized (this.s) {
            iIntValue = this.u;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((nzw) this.i).e(nzw.c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void K(Executor executor, mz9 mz9Var) {
        int i;
        int iRound;
        int i2;
        int i3;
        int i4;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ((lmv) j120.T()).execute(new b1(this, executor, mz9Var, (byte) 18));
            return;
        }
        ofm0.m();
        if (I() == 3 && this.w.f29975a == null) {
            jf4.o("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            return;
        }
        Log.d("ImageCapture", "takePictureInternal");
        s0a s0aVarD = d();
        Rect rect = null;
        if (s0aVarD == null || !this.f9899a) {
            new ozw(4, "Not bound to a valid Camera [" + this + "]", null);
            if (mz9Var == null) {
                jf4.o("Must have either in-memory or on-disk callback.");
                return;
            }
            qz9 qz9Var = mz9Var.f22642a;
            kl5 kl5Var = qz9.t2;
            qz9Var.S0().C(t0k0.f33124a);
            return;
        }
        boolean z = ((Integer) this.i.e(h0x.i0, 0)).intValue() != 0;
        ito0 ito0Var = this.z;
        Objects.requireNonNull(ito0Var);
        Rect rect2 = this.l;
        Size sizeC = c();
        Objects.requireNonNull(sizeC);
        if (rect2 != null) {
            rect = rect2;
            i = 2;
        } else {
            Rational rational = this.v;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                i = 2;
                rect = new Rect(0, 0, sizeC.getWidth(), sizeC.getHeight());
            } else {
                s0a s0aVarD2 = d();
                Objects.requireNonNull(s0aVarD2);
                int i5 = i(s0aVarD2, false);
                Rational rational2 = new Rational(this.v.getDenominator(), this.v.getNumerator());
                if (!jls0.c(i5)) {
                    rational2 = this.v;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    i = 2;
                    l8x.E0("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = sizeC.getWidth();
                    int height = sizeC.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    i = 2;
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        int iRound2 = Math.round((f / numerator) * denominator);
                        i4 = (height - iRound2) / 2;
                        i3 = iRound2;
                        iRound = width;
                        i2 = 0;
                    } else {
                        iRound = Math.round((f2 / denominator) * numerator);
                        i2 = (width - iRound) / 2;
                        i3 = height;
                        i4 = 0;
                    }
                    rect = new Rect(i2, i4, iRound + i2, i3 + i4);
                }
                Objects.requireNonNull(rect);
            }
        }
        Matrix matrix = this.m;
        int i6 = i(s0aVarD, false);
        nzw nzwVar = (nzw) this.i;
        u15 u15Var = nzw.j;
        if (nzwVar.f(u15Var)) {
            iIntValue = ((Integer) nzwVar.d(u15Var)).intValue();
        } else {
            int i7 = this.r;
            if (i7 == 0) {
                iIntValue = 100;
            } else {
                if (i7 != 1 && i7 != i) {
                    jf4.n(ua80.e(i7, "CaptureMode ", " is invalid"));
                    return;
                }
                iIntValue = 95;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(this.x.e);
        z1x.t("One and only one on-disk or in-memory callback should be present.", true ^ (mz9Var == null));
        o55 o55Var = new o55(executor, mz9Var, rect, matrix, i6, iIntValue, this.r, z, listUnmodifiableList);
        if (z) {
            Boolean bool = Boolean.FALSE;
            HashMap map = o55Var.b;
            map.put(32, bool);
            map.put(256, bool);
        }
        ofm0.m();
        ito0Var.f15364a.offer(o55Var);
        ito0Var.c();
    }

    public final void L() {
        synchronized (this.s) {
            try {
                if (this.s.get() != null) {
                    return;
                }
                e().e(I());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.fot0
    public final fpt0 g(boolean z, ipt0 ipt0Var) {
        C.getClass();
        nzw nzwVar = jzw.f17434a;
        drd drdVarA = ipt0Var.a(nzwVar.v(), this.r);
        if (z) {
            drdVarA = drd.r(drdVarA, nzwVar);
        }
        if (drdVarA == null) {
            return null;
        }
        return new nzw(b780.j(((gyw) n(drdVarA)).b));
    }

    @Override // a.fot0
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // a.fot0
    public final ept0 n(drd drdVar) {
        return new gyw(wy40.p(drdVar), (byte) 1);
    }

    @Override // a.fot0
    public final boolean o() {
        return true;
    }

    @Override // a.fot0
    public final void t() {
        z1x.x(d(), "Attached camera cannot be null");
        if (I() == 3) {
            s0a s0aVarD = d();
            if ((s0aVarD != null ? s0aVarD.a().h() : -1) == 0) {
                return;
            }
            jf4.o("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(h());
    }

    @Override // a.fot0
    public final void u() {
        l8x.U("ImageCapture", "onCameraControlReady");
        L();
        e().k(this.w);
    }

    @Override // a.fot0
    public final fpt0 v(n0a n0aVar, ept0 ept0Var) {
        HashSet<giv> hashSet = this.h;
        boolean z = false;
        if (hashSet != null) {
            boolean z2 = false;
            for (giv givVar : hashSet) {
                if (givVar instanceof zzw) {
                    z2 = ((zzw) givVar).f45275a;
                }
            }
            ept0Var.b().y(nzw.f, Integer.valueOf(z2 ? 1 : 0));
        }
        if (n0aVar.o().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            wy40 wy40VarB = ept0Var.b();
            u15 u15Var = nzw.h;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(wy40VarB.e(u15Var, bool2))) {
                l8x.E0("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                l8x.e0("ImageCapture", "Requesting software JPEG due to device quirk.");
                ept0Var.b().y(u15Var, bool2);
            }
        }
        wy40 wy40VarB2 = ept0Var.b();
        Boolean bool3 = Boolean.TRUE;
        u15 u15Var2 = nzw.h;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(wy40VarB2.e(u15Var2, bool4))) {
            if (d() != null) {
                d().e().o();
            }
            Integer num = (Integer) wy40VarB2.e(nzw.e, null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                l8x.E0("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                l8x.E0("ImageCapture", "Unable to support software JPEG. Disabling.");
                wy40VarB2.y(u15Var2, bool4);
            }
        }
        Integer num2 = (Integer) ept0Var.b().e(nzw.e, null);
        if (num2 != null) {
            if (d() != null) {
                d().e().o();
            }
            ept0Var.b().y(h0x.h0, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            wy40 wy40VarB3 = ept0Var.b();
            u15 u15Var3 = nzw.f;
            if (Objects.equals(wy40VarB3.e(u15Var3, null), 2)) {
                ept0Var.b().y(h0x.h0, 32);
            } else if (Objects.equals(ept0Var.b().e(u15Var3, null), 3)) {
                ept0Var.b().y(h0x.h0, 32);
                ept0Var.b().y(h0x.i0, 256);
            } else if (Objects.equals(ept0Var.b().e(u15Var3, null), 1)) {
                ept0Var.b().y(h0x.h0, 4101);
                ept0Var.b().y(h0x.j0, agn.c);
            } else if (z) {
                ept0Var.b().y(h0x.h0, 35);
            } else {
                List list = (List) ept0Var.b().e(w0x.r0, null);
                if (list == null || J(256, list)) {
                    ept0Var.b().y(h0x.h0, 256);
                } else if (J(35, list)) {
                    ept0Var.b().y(h0x.h0, 35);
                }
            }
        }
        return ept0Var.e();
    }

    @Override // a.fot0
    public final void x() {
        r7h0 r7h0Var = this.w;
        r7h0Var.c();
        r7h0Var.b();
        ito0 ito0Var = this.z;
        if (ito0Var != null) {
            ito0Var.b();
        }
    }

    @Override // a.fot0
    public final h55 y(drd drdVar) {
        this.x.a(drdVar);
        Object[] objArr = {this.x.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        qgd qgdVarB = this.j.b();
        qgdVarB.g = drdVar;
        return qgdVarB.i();
    }

    @Override // a.fot0
    public final h55 z(h55 h55Var, h55 h55Var2) {
        l8x.U("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + h55Var + ", secondaryStreamSpec " + h55Var2);
        tii0 tii0VarH = H(f(), (nzw) this.i, h55Var);
        this.x = tii0VarH;
        Object[] objArr = {tii0VarH.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        this.e = 1;
        s();
        return h55Var;
    }
}

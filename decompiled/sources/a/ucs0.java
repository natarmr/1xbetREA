package a;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.hardware.camera2.CameraAccessException;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ucs0 implements mzs0, zmh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35446a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ucs0(String str, String str2) {
        this.f35446a = (byte) 3;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.b = iGlCreateProgram;
        n4c.H();
        i(iGlCreateProgram, 35633, str);
        i(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        n4c.I("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.c = new bst[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            bst bstVar = new bst();
            ((bst[]) this.c)[i] = bstVar;
            ((HashMap) this.e).put(str3, bstVar);
        }
        this.f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.b, 35718, iArr4, 0);
        this.d = new gst[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i8 = 0; i8 < i7; i8++) {
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            gst gstVar = new gst();
            ((gst[]) this.d)[i5] = gstVar;
            ((HashMap) this.f).put(str4, gstVar);
        }
        n4c.H();
    }

    public static void i(int i, int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        n4c.I(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        n4c.H();
    }

    public void A(int i) {
        ((Paint) this.c).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public Unit B() {
        Log.d("CXCP", "Closing " + this);
        if (!((x04) this.d).a()) {
            return Unit.f46060a;
        }
        ((uw9) this.c).c();
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }

    public void C() {
        uw9 uw9Var = (uw9) this.c;
        synchronized (uw9Var.i) {
            Log.d("CXCP", uw9Var + "#stopRepeating");
            uw9Var.f36382a.M0();
        }
    }

    public boolean D(boolean z, List list, Map map, Map map2, Map map3, List list2) throws Throwable {
        Throwable th;
        boolean z2;
        boolean zIsTerminated;
        list.getClass();
        map2.getClass();
        map3.getClass();
        list2.getClass();
        if (((x04) this.d).b()) {
            Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            tw9 tw9VarB = ((uw9) this.c).b(z, list, map, map2, map3, (svu) this.f, list2);
            Trace.endSection();
            boolean z3 = true;
            if (tw9VarB == null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((cmf0) it.next()).f != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                cmf0 cmf0Var = (cmf0) it2.next();
                                dfx dfxVar = cmf0Var.f;
                                if (dfxVar != null) {
                                    b3x b3xVar = dfxVar.f6020a;
                                    if (b3xVar instanceof AutoCloseable) {
                                        b3xVar.close();
                                    } else {
                                        if (!(b3xVar instanceof ExecutorService)) {
                                            e9d0.o();
                                            return false;
                                        }
                                        ExecutorService executorService = (ExecutorService) b3xVar;
                                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                            executorService.shutdown();
                                            boolean z4 = false;
                                            while (!zIsTerminated) {
                                                try {
                                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
                                                    if (!z4) {
                                                        executorService.shutdownNow();
                                                        z4 = true;
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                }
                                Iterator it3 = cmf0Var.d.iterator();
                                while (it3.hasNext()) {
                                    ((bmf0) it3.next()).q(cmf0Var);
                                }
                            }
                            return true;
                        }
                    }
                }
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                return false;
            }
            if (((x04) this.d).b()) {
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
                return false;
            }
            if (!tw9VarB.b) {
                synchronized (((ArrayList) this.e)) {
                    ((ArrayList) this.e).add(tw9VarB);
                }
            }
            try {
                Log.d("CXCP", this + " submitting " + tw9VarB);
                Trace.beginSection("InvokeInternalListeners");
                int size = tw9VarB.d.size();
                for (int i = 0; i < size; i++) {
                    gnf0 gnf0Var = (gnf0) tw9VarB.d.get(i);
                    int size2 = tw9VarB.e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((bmf0) tw9VarB.e.get(i2)).k(gnf0Var);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = tw9VarB.d.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    gnf0 gnf0Var2 = (gnf0) tw9VarB.d.get(i3);
                    int size4 = gnf0Var2.getRequest().d.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((bmf0) gnf0Var2.getRequest().d.get(i4)).k(gnf0Var2);
                    }
                }
                Trace.endSection();
                synchronized (tw9VarB) {
                    if (!((x04) this.d).b()) {
                        try {
                            Trace.beginSection("CXCP#submit(CaptureSequence)");
                            Integer numD = ((uw9) this.c).d(tw9VarB);
                            int iIntValue = numD != null ? numD.intValue() : -1;
                            tw9VarB.m = Integer.valueOf(iIntValue);
                            Trace.endSection();
                            if (iIntValue != -1) {
                                Trace.beginSection("InvokeInternalListeners");
                                int size5 = tw9VarB.d.size();
                                for (int i5 = 0; i5 < size5; i5++) {
                                    gnf0 gnf0Var3 = (gnf0) tw9VarB.d.get(i5);
                                    int size6 = tw9VarB.e.size();
                                    for (int i6 = 0; i6 < size6; i6++) {
                                        ((bmf0) tw9VarB.e.get(i6)).n(gnf0Var3);
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size7 = tw9VarB.d.size();
                                for (int i7 = 0; i7 < size7; i7++) {
                                    gnf0 gnf0Var4 = (gnf0) tw9VarB.d.get(i7);
                                    int size8 = gnf0Var4.getRequest().d.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        ((bmf0) gnf0Var4.getRequest().d.get(i8)).n(gnf0Var4);
                                    }
                                }
                                Trace.endSection();
                                try {
                                    Log.d("CXCP", this + " submitted " + tw9VarB);
                                    z2 = true;
                                } catch (CameraAccessException unused2) {
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (z3 || tw9VarB.b) {
                                        throw th;
                                    }
                                    synchronized (((ArrayList) this.e)) {
                                        ((ArrayList) this.e).remove(tw9VarB);
                                    }
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size9 = tw9VarB.d.size();
                                    for (int i9 = 0; i9 < size9; i9++) {
                                        gnf0 gnf0Var5 = (gnf0) tw9VarB.d.get(i9);
                                        int size10 = tw9VarB.e.size();
                                        for (int i10 = 0; i10 < size10; i10++) {
                                            ((bmf0) tw9VarB.e.get(i10)).q(gnf0Var5.getRequest());
                                        }
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size11 = tw9VarB.d.size();
                                    for (int i11 = 0; i11 < size11; i11++) {
                                        gnf0 gnf0Var6 = (gnf0) tw9VarB.d.get(i11);
                                        int size12 = gnf0Var6.getRequest().d.size();
                                        for (int i12 = 0; i12 < size12; i12++) {
                                            ((bmf0) gnf0Var6.getRequest().d.get(i12)).q(gnf0Var6.getRequest());
                                        }
                                    }
                                    Trace.endSection();
                                    throw th;
                                }
                            } else {
                                Log.w("CXCP", "Failed to submit " + tw9VarB + ": " + this + " received -1 from submit.");
                                z2 = false;
                                z3 = false;
                            }
                            if (z2 || tw9VarB.b) {
                                return z3;
                            }
                            synchronized (((ArrayList) this.e)) {
                                ((ArrayList) this.e).remove(tw9VarB);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size13 = tw9VarB.d.size();
                            for (int i13 = 0; i13 < size13; i13++) {
                                gnf0 gnf0Var7 = (gnf0) tw9VarB.d.get(i13);
                                int size14 = tw9VarB.e.size();
                                for (int i14 = 0; i14 < size14; i14++) {
                                    ((bmf0) tw9VarB.e.get(i14)).q(gnf0Var7.getRequest());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size15 = tw9VarB.d.size();
                            for (int i15 = 0; i15 < size15; i15++) {
                                gnf0 gnf0Var8 = (gnf0) tw9VarB.d.get(i15);
                                int size16 = gnf0Var8.getRequest().d.size();
                                for (int i16 = 0; i16 < size16; i16++) {
                                    ((bmf0) gnf0Var8.getRequest().d.get(i16)).q(gnf0Var8.getRequest());
                                }
                            }
                            Trace.endSection();
                            return z3;
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    Log.w("CXCP", "Failed to submit " + tw9VarB + ": " + this + " is closed.");
                    if (!tw9VarB.b) {
                        synchronized (((ArrayList) this.e)) {
                            ((ArrayList) this.e).remove(tw9VarB);
                        }
                        Trace.beginSection("InvokeInternalListeners");
                        int size17 = tw9VarB.d.size();
                        for (int i17 = 0; i17 < size17; i17++) {
                            gnf0 gnf0Var9 = (gnf0) tw9VarB.d.get(i17);
                            int size18 = tw9VarB.e.size();
                            for (int i18 = 0; i18 < size18; i18++) {
                                ((bmf0) tw9VarB.e.get(i18)).q(gnf0Var9.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size19 = tw9VarB.d.size();
                        for (int i19 = 0; i19 < size19; i19++) {
                            gnf0 gnf0Var10 = (gnf0) tw9VarB.d.get(i19);
                            int size20 = gnf0Var10.getRequest().d.size();
                            for (int i20 = 0; i20 < size20; i20++) {
                                ((bmf0) gnf0Var10.getRequest().d.get(i20)).q(gnf0Var10.getRequest());
                            }
                        }
                        Trace.endSection();
                        return false;
                    }
                    return false;
                }
            } catch (CameraAccessException unused3) {
                if (!tw9VarB.b) {
                    synchronized (((ArrayList) this.e)) {
                        ((ArrayList) this.e).remove(tw9VarB);
                        Trace.beginSection("InvokeInternalListeners");
                        int size21 = tw9VarB.d.size();
                        for (int i21 = 0; i21 < size21; i21++) {
                            gnf0 gnf0Var11 = (gnf0) tw9VarB.d.get(i21);
                            int size22 = tw9VarB.e.size();
                            for (int i22 = 0; i22 < size22; i22++) {
                                ((bmf0) tw9VarB.e.get(i22)).q(gnf0Var11.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size23 = tw9VarB.d.size();
                        for (int i23 = 0; i23 < size23; i23++) {
                            gnf0 gnf0Var12 = (gnf0) tw9VarB.d.get(i23);
                            int size24 = gnf0Var12.getRequest().d.size();
                            for (int i24 = 0; i24 < size24; i24++) {
                                ((bmf0) gnf0Var12.getRequest().d.get(i24)).q(gnf0Var12.getRequest());
                            }
                        }
                        Trace.endSection();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z3 = false;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    @Override // a.zmh0
    public void a(fq80 fq80Var) {
        coq0 coq0Var;
        coq0 coq0Var2;
        SparseArray sparseArray;
        int i;
        q8b q8bVar;
        char c;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        q8b q8bVar2 = (q8b) this.c;
        xrs0 xrs0Var = (xrs0) this.f;
        SparseArray sparseArray3 = xrs0Var.h;
        SparseBooleanArray sparseBooleanArray = xrs0Var.i;
        tyj tyjVar = xrs0Var.f;
        List list = xrs0Var.c;
        byte b = xrs0Var.f41385a;
        if (fq80Var.z() != 2) {
            return;
        }
        if (b == 1 || b == 2 || xrs0Var.n == 1) {
            coq0Var = (coq0) list.get(0);
        } else {
            coq0Var = new coq0(((coq0) list.get(0)).d());
            list.add(coq0Var);
        }
        if ((fq80Var.z() & 128) == 0) {
            return;
        }
        fq80Var.N(1);
        int iG = fq80Var.G();
        fq80Var.N(3);
        fq80Var.k(q8bVar2.b, 0, 2);
        q8bVar2.m(0);
        q8bVar2.o(3);
        xrs0Var.t = q8bVar2.g(13);
        fq80Var.k(q8bVar2.b, 0, 2);
        q8bVar2.m(0);
        q8bVar2.o(4);
        fq80Var.N(q8bVar2.g(12));
        if (b == 2 && xrs0Var.r == null) {
            ass0 ass0VarA = tyjVar.a(21, new sbx0(21, (String) null, 0, (ArrayList) null, vtt0.b));
            xrs0Var.r = ass0VarA;
            if (ass0VarA != null) {
                ass0VarA.b(coq0Var, xrs0Var.m, new zrs0(iG, 21, 8192));
            }
        }
        sparseArray2.clear();
        sparseIntArray.clear();
        int iA = fq80Var.a();
        while (iA > 0) {
            fq80Var.k(q8bVar2.b, 0, 5);
            q8bVar2.m(0);
            int iG2 = q8bVar2.g(8);
            q8bVar2.o(3);
            int iG3 = q8bVar2.g(13);
            q8bVar2.o(4);
            int iG4 = q8bVar2.g(12);
            int i2 = fq80Var.b;
            int i3 = i2 + iG4;
            int i4 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            int iZ = 0;
            int i5 = iA;
            while (true) {
                if (fq80Var.b >= i3) {
                    q8bVar = q8bVar2;
                    break;
                }
                int iZ2 = fq80Var.z();
                q8bVar = q8bVar2;
                int iZ3 = fq80Var.b + fq80Var.z();
                if (iZ3 > i3) {
                    break;
                }
                SparseArray sparseArray4 = sparseArray3;
                if (iZ2 == 5) {
                    long jB = fq80Var.B();
                    if (jB == 1094921523) {
                        i4 = 129;
                    } else if (jB == 1161904947) {
                        i4 = 135;
                    } else if (jB == 1094921524) {
                        i4 = 172;
                    } else if (jB == 1212503619) {
                        i4 = 36;
                    }
                } else if (iZ2 == 106) {
                    iZ3 = iZ3;
                    i4 = 129;
                } else if (iZ2 == 122) {
                    i4 = 135;
                    iZ3 = iZ3;
                } else if (iZ2 == 127) {
                    int iZ4 = fq80Var.z();
                    if (iZ4 == 21) {
                        i4 = 172;
                    } else if (iZ4 == 14) {
                        i4 = 136;
                    } else if (iZ4 == 33) {
                        i4 = 139;
                    }
                } else if (iZ2 == 123) {
                    i4 = 138;
                } else if (iZ2 == 10) {
                    strTrim = fq80Var.x(3, StandardCharsets.UTF_8).trim();
                    iZ = fq80Var.z();
                } else if (iZ2 == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (fq80Var.b < iZ3) {
                        String strTrim2 = fq80Var.x(3, StandardCharsets.UTF_8).trim();
                        fq80Var.z();
                        coq0 coq0Var3 = coq0Var;
                        byte[] bArr = new byte[4];
                        fq80Var.k(bArr, 0, 4);
                        arrayList2.add(new yrs0(strTrim2, bArr));
                        coq0Var = coq0Var3;
                        iZ3 = iZ3;
                        iG = iG;
                    }
                    iZ3 = iZ3;
                    iG = iG;
                    coq0Var = coq0Var;
                    arrayList = arrayList2;
                    i4 = 89;
                } else {
                    iZ3 = iZ3;
                    iG = iG;
                    coq0Var = coq0Var;
                    if (iZ2 == 111) {
                        i4 = 257;
                    }
                }
                fq80Var.N(iZ3 - fq80Var.b);
                coq0Var = coq0Var;
                q8bVar2 = q8bVar;
                sparseArray3 = sparseArray4;
                iG = iG;
            }
            SparseArray sparseArray5 = sparseArray3;
            int i6 = iG;
            coq0 coq0Var4 = coq0Var;
            fq80Var.M(i3);
            sbx0 sbx0Var = new sbx0(i4, strTrim, iZ, arrayList, Arrays.copyOfRange(fq80Var.f9961a, i2, i3));
            if (iG2 == 6 || iG2 == 5) {
                iG2 = i4;
            }
            int i7 = i5 - (iG4 + 5);
            int i8 = b == 2 ? iG2 : iG3;
            if (sparseBooleanArray.get(i8)) {
                c = 21;
            } else {
                c = 21;
                ass0 ass0VarA2 = (b == 2 && iG2 == 21) ? xrs0Var.r : tyjVar.a(iG2, sbx0Var);
                if (b != 2 || iG3 < sparseIntArray.get(i8, 8192)) {
                    sparseIntArray.put(i8, iG3);
                    sparseArray2.put(i8, ass0VarA2);
                }
            }
            iA = i7;
            coq0Var = coq0Var4;
            q8bVar2 = q8bVar;
            sparseArray3 = sparseArray5;
            iG = i6;
        }
        SparseArray sparseArray6 = sparseArray3;
        int i9 = iG;
        coq0 coq0Var5 = coq0Var;
        int size = sparseIntArray.size();
        int i10 = 0;
        while (i10 < size) {
            int iKeyAt = sparseIntArray.keyAt(i10);
            int iValueAt = sparseIntArray.valueAt(i10);
            sparseBooleanArray.put(iKeyAt, true);
            xrs0Var.j.put(iValueAt, true);
            ass0 ass0Var = (ass0) sparseArray2.valueAt(i10);
            if (ass0Var != null) {
                if (ass0Var != xrs0Var.r) {
                    i = i9;
                    coq0Var2 = coq0Var5;
                    ass0Var.b(coq0Var2, xrs0Var.m, new zrs0(i, iKeyAt, 8192));
                } else {
                    coq0Var2 = coq0Var5;
                    i = i9;
                }
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, ass0Var);
            } else {
                coq0Var2 = coq0Var5;
                sparseArray = sparseArray6;
                i = i9;
            }
            i10++;
            sparseArray6 = sparseArray;
            i9 = i;
            coq0Var5 = coq0Var2;
        }
        SparseArray sparseArray7 = sparseArray6;
        if (b == 2) {
            if (xrs0Var.o) {
                return;
            }
            xrs0Var.m.o();
            xrs0Var.n = 0;
            xrs0Var.o = true;
            return;
        }
        sparseArray7.remove(this.b);
        int i11 = b == 1 ? 0 : xrs0Var.n - 1;
        xrs0Var.n = i11;
        if (i11 == 0) {
            xrs0Var.m.o();
            xrs0Var.o = true;
        }
    }

    @Override // a.mzs0
    public hzs0 c(are0 are0Var) {
        are0Var.getClass();
        gaz gazVar = (gaz) ((xg) this.f).invoke(are0Var);
        return gazVar != null ? gazVar : ((mzs0) ((f7u) this.c).c).c(are0Var);
    }

    public void d() {
        List<tw9> listL0;
        synchronized (((ArrayList) this.e)) {
            listL0 = CollectionsKt.L0((ArrayList) this.e);
            ((ArrayList) this.e).clear();
        }
        for (tw9 tw9Var : listL0) {
            Trace.beginSection("InvokeInternalListeners");
            int size = tw9Var.d.size();
            for (int i = 0; i < size; i++) {
                gnf0 gnf0Var = (gnf0) tw9Var.d.get(i);
                int size2 = tw9Var.e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((bmf0) tw9Var.e.get(i2)).q(gnf0Var.getRequest());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = tw9Var.d.size();
            for (int i3 = 0; i3 < size3; i3++) {
                gnf0 gnf0Var2 = (gnf0) tw9Var.d.get(i3);
                int size4 = gnf0Var2.getRequest().d.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((bmf0) gnf0Var2.getRequest().d.get(i4)).q(gnf0Var2.getRequest());
                }
            }
            Trace.endSection();
        }
        uw9 uw9Var = (uw9) this.c;
        synchronized (uw9Var.i) {
            Log.d("CXCP", uw9Var + "#abortCaptures");
            uw9Var.f36382a.C();
        }
    }

    public void e(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f((vx9) it.next());
        }
    }

    public void f(vx9 vx9Var) {
        ArrayList arrayList = (ArrayList) this.e;
        if (arrayList.contains(vx9Var)) {
            return;
        }
        arrayList.add(vx9Var);
    }

    public void g(drd drdVar) {
        for (u15 u15Var : drdVar.c()) {
            ((wy40) this.d).e(u15Var, null);
            ((wy40) this.d).x(u15Var, drdVar.g(u15Var), drdVar.d(u15Var));
        }
    }

    public void h(double d, float f) {
        int length = ((float[]) this.c).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.d, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.d = Arrays.copyOf((double[]) this.d, length);
        this.c = Arrays.copyOf((float[]) this.c, length);
        this.e = new double[length];
        double[] dArr = (double[]) this.d;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.d)[iBinarySearch] = d;
        ((float[]) this.c)[iBinarySearch] = f;
    }

    public t7a j() {
        ArrayList arrayList = new ArrayList((HashSet) this.c);
        b780 b780VarJ = b780.j((wy40) this.d);
        int i = this.b;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.e);
        tz40 tz40Var = (tz40) this.f;
        eoo0 eoo0Var = eoo0.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = tz40Var.f8147a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new t7a(arrayList, b780VarJ, i, arrayList2, new eoo0(arrayMap));
    }

    public int k(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.b, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        n4c.H();
        return iGlGetAttribLocation;
    }

    public long l() {
        Paint paint = (Paint) this.c;
        return Build.VERSION.SDK_INT >= 29 ? drv0.f6584a.a(paint) : fbc.d(paint.getColor());
    }

    public int m() {
        Paint.Cap strokeCap = ((Paint) this.c).getStrokeCap();
        int i = strokeCap == null ? -1 : r03.f29608a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int n() {
        Paint.Join strokeJoin = ((Paint) this.c).getStrokeJoin();
        int i = strokeJoin == null ? -1 : r03.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public boolean o(ucs0 ucs0Var, int i) {
        return Objects.equals(((tjf0[]) this.c)[i], ((tjf0[]) ucs0Var.c)[i]) && Objects.equals(((fmo[]) this.d)[i], ((fmo[]) ucs0Var.d)[i]);
    }

    public boolean p(int i) {
        return ((tjf0[]) this.c)[i] != null;
    }

    public void q(float f) {
        ((Paint) this.c).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void r(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        Paint paint = (Paint) this.c;
        if (Build.VERSION.SDK_INT >= 29) {
            drv0.f6584a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(dj8.d0(i)));
        }
    }

    public void s(long j) {
        Paint paint = (Paint) this.c;
        if (Build.VERSION.SDK_INT >= 29) {
            drv0.f6584a.c(paint, j);
        } else {
            paint.setColor(fbc.U(j));
        }
    }

    public void t(a4d a4dVar) {
        this.e = a4dVar;
        ((Paint) this.c).setColorFilter(a4dVar != null ? a4dVar.f217a : null);
    }

    public String toString() {
        switch (this.f35446a) {
            case 4:
                return "GraphRequestProcessor-" + this.b;
            case 5:
            default:
                return super.toString();
            case 6:
                return "pos =" + Arrays.toString((double[]) this.d) + " period=" + Arrays.toString((float[]) this.c);
        }
    }

    public void u(int i) {
        ((Paint) this.c).setFilterBitmap(!(i == 0));
    }

    public void v(x03 x03Var) {
        ((Paint) this.c).setPathEffect(x03Var != null ? x03Var.f40050a : null);
        this.f = x03Var;
    }

    public void w(Shader shader) {
        this.d = shader;
        ((Paint) this.c).setShader(shader);
    }

    public void x(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.c;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void y(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.c;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void z(float f) {
        ((Paint) this.c).setStrokeWidth(f);
    }

    @Override // a.zmh0
    public void b(coq0 coq0Var, huo huoVar, zrs0 zrs0Var) {
    }

    public ucs0(uw9 uw9Var) {
        this.f35446a = (byte) 4;
        this.c = uw9Var;
        z04 z04Var = jev.f16395a;
        z04Var.getClass();
        this.b = z04.b.incrementAndGet(z04Var);
        this.d = o2e.X(false);
        this.e = new ArrayList();
        this.f = new svu(this);
    }

    public ucs0(Paint paint) {
        this.f35446a = (byte) 1;
        this.c = paint;
        this.b = 3;
    }

    public ucs0(tjf0[] tjf0VarArr, fmo[] fmoVarArr, rds0 rds0Var, Object obj) {
        this.f35446a = (byte) 0;
        x0x.A(tjf0VarArr.length == fmoVarArr.length);
        this.c = tjf0VarArr;
        this.d = (fmo[]) fmoVarArr.clone();
        this.e = rds0Var;
        this.f = obj;
        this.b = tjf0VarArr.length;
    }

    public ucs0(f7u f7uVar, vjj vjjVar, hay hayVar, int i) {
        this.f35446a = (byte) 5;
        f7uVar.getClass();
        hayVar.getClass();
        this.c = f7uVar;
        this.d = vjjVar;
        this.b = i;
        ArrayList typeParameters = hayVar.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.e = linkedHashMap;
        this.f = ((eu00) ((v7i) ((f7u) this.c).b).i).d(new caz(this, (byte) 1));
    }

    public ucs0(byte b) {
        this.f35446a = b;
        switch (b) {
            case 6:
                break;
            default:
                this.c = new HashSet();
                this.d = wy40.l();
                this.b = -1;
                this.e = new ArrayList();
                this.f = tz40.a();
                break;
        }
    }

    public ucs0(xrs0 xrs0Var, int i) {
        this.f35446a = (byte) 7;
        this.f = xrs0Var;
        this.c = new q8b(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }
}

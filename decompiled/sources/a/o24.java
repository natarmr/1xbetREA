package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.Spatializer;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o24 implements zf60, huo {
    public static HandlerThread e;
    public static Handler f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24513a;
    public Object b;
    public Object c;
    public Object d;

    public o24(byte b) {
        switch (b) {
            case 6:
                this.b = new float[16];
                this.c = new float[16];
                this.d = new tyc((byte) 7);
                break;
            case 10:
                this.b = new Object();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.f24513a = true;
                break;
            default:
                this.b = new SparseIntArray[9];
                this.c = new ArrayList();
                this.d = new c7r(this);
                this.f24513a = true;
                break;
        }
    }

    public static void b(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f2 = fArr2[10];
        float f3 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        float f4 = fArr2[10] / fSqrt;
        fArr[0] = f4;
        float f5 = fArr2[8];
        fArr[2] = f5 / fSqrt;
        fArr[8] = (-f5) / fSqrt;
        fArr[10] = f4;
    }

    public void a(boolean z) {
        hvk hvkVar = (hvk) this.d;
        synchronized (hvkVar.h) {
            try {
                if (this.f24513a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (Intrinsics.d(((evk) this.b).g, this)) {
                    hvkVar.a(this, z);
                }
                this.f24513a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int c(int i, int i2, int i3) {
        boolean z = this.f24513a;
        r68 r68Var = (r68) this.b;
        return z ? r68Var.b(i2, i) : r68Var.b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public y190 d(int i) {
        y190 y190Var;
        hvk hvkVar = (hvk) this.d;
        synchronized (hvkVar.h) {
            if (this.f24513a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.c)[i] = true;
            Object obj = ((evk) this.b).d.get(i);
            ebc.d0(hvkVar.q, (y190) obj);
            y190Var = (y190) obj;
        }
        return y190Var;
    }

    public boolean e(m2c0 m2c0Var) {
        boolean z = this.f24513a;
        jqt0 jqt0Var = m2c0Var.k;
        if (jqt0Var == jqt0.d) {
            return true;
        }
        return (jqt0Var == jqt0.c || z) && !z;
    }

    @Override // a.huo
    public void f(fvh0 fvh0Var) {
        ((huo) this.b).f(fvh0Var);
    }

    public synchronized void g() {
        try {
            if (this.f24513a) {
                return;
            }
            Boolean boolK = k();
            this.c = boolK;
            if (boolK == null) {
                udk udkVar = new udk((byte) 25);
                nao naoVar = (nao) ((v6n0) this.b);
                naoVar.getClass();
                naoVar.a(o6t0.f24755a, udkVar);
            }
            this.f24513a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean h() {
        Boolean bool;
        try {
            g();
            bool = (Boolean) this.c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).f45665a.j();
    }

    public boolean i(int[] iArr) {
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.c;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.f24513a = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean j(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.c;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this.f24513a = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Boolean k() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        nfq nfqVar = ((FirebaseMessaging) this.d).f45665a;
        nfqVar.a();
        Context context = nfqVar.f23449a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        iw5 iw5Var = (iw5) this.b;
        iw5Var.q0().onApplyWindowInsets(xiv0Var.g());
        ComposeView composeView = (ComposeView) iw5Var.Z1.b;
        if (composeView != null) {
            composeView.onApplyWindowInsets(xiv0Var.g());
        }
        if (!iw5Var.g2 || iw5Var.Q()) {
            iw5Var.g2 = true;
            Object parent = iw5Var.q0().getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                view2.setPadding(view2.getPaddingLeft(), xiv0Var.f40966a.i(1).b, view2.getPaddingRight(), view2.getPaddingBottom());
            }
        }
        View view3 = (View) this.c;
        view3.post(new hf5(view3, iw5Var, (BottomSheetBehavior) this.d, (byte) 2));
        return this.f24513a ? xiv0.b : xiv0Var;
    }

    public cwq m() {
        cwq cwqVar = (cwq) this.d;
        if (cwqVar != null) {
            return cwqVar;
        }
        int iC = 0;
        int iC2 = 0;
        for (int i = 0; i < 6; i++) {
            iC2 = c(i, 8, iC2);
        }
        int iC3 = c(8, 7, c(8, 8, c(7, 8, iC2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iC3 = c(8, i2, iC3);
        }
        int i3 = ((r68) this.b).b;
        int i4 = i3 - 7;
        for (int i5 = i3 - 1; i5 >= i4; i5--) {
            iC = c(8, i5, iC);
        }
        for (int i6 = i3 - 8; i6 < i3; i6++) {
            iC = c(i6, 8, iC);
        }
        cwq cwqVarA = cwq.a(iC3, iC);
        if (cwqVarA == null) {
            cwqVarA = cwq.a(iC3 ^ 21522, iC ^ 21522);
        }
        this.d = cwqVarA;
        if (cwqVarA != null) {
            return cwqVarA;
        }
        throw bwq.a();
    }

    public ubu0 n() {
        ubu0 ubu0Var = (ubu0) this.c;
        if (ubu0Var != null) {
            return ubu0Var;
        }
        int i = ((r68) this.b).b;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return ubu0.c(i2);
        }
        int i3 = i - 11;
        int iC = 0;
        int iC2 = 0;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = i - 9; i5 >= i3; i5--) {
                iC2 = c(i5, i4, iC2);
            }
        }
        ubu0 ubu0VarB = ubu0.b(iC2);
        if (ubu0VarB != null && (ubu0VarB.f35401a * 4) + 17 == i) {
            this.c = ubu0VarB;
            return ubu0VarB;
        }
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                iC = c(i6, i7, iC);
            }
        }
        ubu0 ubu0VarB2 = ubu0.b(iC);
        if (ubu0VarB2 == null || (ubu0VarB2.f35401a * 4) + 17 != i) {
            throw bwq.a();
        }
        this.c = ubu0VarB2;
        return ubu0VarB2;
    }

    @Override // a.huo
    public void o() {
        SparseArray sparseArray = (SparseArray) this.d;
        ((huo) this.b).o();
        if (this.f24513a) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((mfn0) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public void p() {
        if (((cwq) this.d) == null) {
            return;
        }
        int i = hne.H(8)[((cwq) this.d).b];
        r68 r68Var = (r68) this.b;
        int i2 = r68Var.b;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (b1j.a(i, i3, i4)) {
                    r68Var.a(i4, i3);
                }
            }
        }
    }

    @Override // a.huo
    public ncs0 q(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.d;
        huo huoVar = (huo) this.b;
        if (i2 != 3 && i2 != 5) {
            this.f24513a = true;
        }
        if (i2 != 3) {
            return huoVar.q(i, i2);
        }
        mfn0 mfn0Var = (mfn0) sparseArray.get(i);
        if (mfn0Var != null) {
            return mfn0Var;
        }
        mfn0 mfn0Var2 = new mfn0(huoVar.q(i, i2), (jfn0) this.c);
        sparseArray.put(i, mfn0Var2);
        return mfn0Var2;
    }

    public void r() {
        if (this.f24513a) {
            ((q9o0) this.d).e(new w1((Object) this, (byte) 11));
            this.f24513a = false;
        }
    }

    public boolean s(String str, String str2) {
        synchronized (this) {
            try {
                if (!((qmy) ((AtomicMarkableReference) this.b).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
                atomicMarkableReference.set((qmy) atomicMarkableReference.getReference(), true);
                apj0 apj0Var = new apj0((Object) this, (byte) 20);
                AtomicReference atomicReference = (AtomicReference) this.c;
                while (!atomicReference.compareAndSet(null, apj0Var)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((aaf) ((cu) ((ywq0) this.d).b).c).a(apj0Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String t() {
        if (!this.f24513a) {
            this.f24513a = true;
            wvw0 wvw0Var = (wvw0) this.d;
            this.c = wvw0Var.q1().getString((String) this.b, null);
        }
        return (String) this.c;
    }

    public void u(String str) {
        SharedPreferences.Editor editorEdit = ((wvw0) this.d).q1().edit();
        editorEdit.putString((String) this.b, str);
        editorEdit.apply();
        this.c = str;
    }

    public o24(pru pruVar, lbu lbuVar, byte b) {
        switch (b) {
            case 8:
                this.b = pruVar.a().k;
                this.c = pruVar.a().N;
                this.d = pruVar.a().l;
                this.f24513a = lbuVar.j();
                break;
            default:
                this.b = pruVar;
                this.c = pruVar.a().k;
                this.d = pruVar.a().N;
                this.f24513a = lbuVar.j();
                break;
        }
    }

    public o24(huo huoVar, jfn0 jfn0Var) {
        this.b = huoVar;
        this.c = jfn0Var;
        this.d = new SparseArray();
    }

    public o24(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerG0 = context == null ? null : b34.g0(context);
        if (audioManagerG0 != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = audioManagerG0.getSpatializer();
            this.b = spatializer;
            this.f24513a = spatializer.getImmersiveAudioLevel() != 0;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            Handler handler = new Handler(looperMyLooper);
            this.c = handler;
            lnk0 lnk0Var = new lnk0(runnable);
            this.d = lnk0Var;
            spatializer.addOnSpatializerStateChangedListener(new j44(handler, (byte) 0), lnk0Var);
            return;
        }
        this.b = null;
        this.f24513a = false;
        this.c = null;
        this.d = null;
    }

    public o24(ywq0 ywq0Var, boolean z) {
        this.d = ywq0Var;
        this.c = new AtomicReference(null);
        this.f24513a = z;
        this.b = new AtomicMarkableReference(new qmy(z ? 8192 : 1024), false);
    }

    public o24(wvw0 wvw0Var, String str) {
        this.d = wvw0Var;
        s0x.E(str);
        this.b = str;
    }

    public o24(hvk hvkVar, evk evkVar) {
        this.d = hvkVar;
        this.b = evkVar;
        this.c = new boolean[2];
    }
}

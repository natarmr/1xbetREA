package a;

import android.gov.nist.core.Separators;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzom;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x4w0 implements ngw0, g1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f40287a;
    public Object b;
    public Object c;

    public /* synthetic */ x4w0(Object obj, Serializable serializable, Object obj2) {
        this.f40287a = obj;
        this.b = serializable;
        this.c = obj2;
    }

    public static x4w0 d(String str, lpw0 lpw0Var, sjw0 sjw0Var) throws GeneralSecurityException {
        Charset charset = x7x0.f40437a;
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        icw0.a(bArr);
        return new x4w0(sjw0Var, str, lpw0Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r8
  0x0033: PHI (r8v9 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    @Override // a.g1x0
    public void a(int i, Throwable th, byte[] bArr) {
        p1x0 p1x0Var;
        b1x0 b1x0Var = (b1x0) this.f40287a;
        b1x0Var.m1();
        zzom zzomVar = (zzom) this.c;
        if (i == 200 || i == 204) {
            if (th == null) {
                uuw0 uuw0Var = ((kxw0) b1x0Var.b).f;
                kxw0.g(uuw0Var);
                uuw0Var.o.b(Long.valueOf(zzomVar.f45546a), "[sgtm] Upload succeeded for row_id");
                p1x0Var = p1x0.SUCCESS;
            } else {
                uuw0 uuw0Var2 = ((kxw0) b1x0Var.b).f;
                kxw0.g(uuw0Var2);
                uuw0Var2.j.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.f45546a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) btw0.u.a(null)).split(Separators.COMMA)).contains(String.valueOf(i))) {
                    p1x0Var = p1x0.BACKOFF;
                } else {
                    p1x0Var = p1x0.FAILURE;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                uuw0 uuw0Var3 = ((kxw0) b1x0Var.b).f;
                kxw0.g(uuw0Var3);
                uuw0Var3.o.b(Long.valueOf(zzomVar.f45546a), "[sgtm] Upload succeeded for row_id");
                p1x0Var = p1x0.SUCCESS;
            } else {
                uuw0 uuw0Var4 = ((kxw0) b1x0Var.b).f;
                kxw0.g(uuw0Var4);
                uuw0Var4.j.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.f45546a), Integer.valueOf(i), th);
                if (Arrays.asList(((String) btw0.u.a(null)).split(Separators.COMMA)).contains(String.valueOf(i))) {
                    p1x0Var = p1x0.BACKOFF;
                } else {
                    p1x0Var = p1x0.FAILURE;
                }
            }
        } else {
            uuw0 uuw0Var5 = ((kxw0) b1x0Var.b).f;
            kxw0.g(uuw0Var5);
            uuw0Var5.j.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.f45546a), Integer.valueOf(i), th);
            if (Arrays.asList(((String) btw0.u.a(null)).split(Separators.COMMA)).contains(String.valueOf(i))) {
                p1x0Var = p1x0.BACKOFF;
            } else {
                p1x0Var = p1x0.FAILURE;
            }
        }
        AtomicReference atomicReference = (AtomicReference) this.b;
        a4x0 a4x0VarI = ((kxw0) b1x0Var.b).i();
        long j = zzomVar.f45546a;
        zzaf zzafVar = new zzaf(p1x0Var.f26226a, j, zzomVar.f);
        a4x0VarI.m1();
        a4x0VarI.n1();
        a4x0VarI.z1(new hf5(a4x0VarI, a4x0VarI.B1(true), zzafVar, (byte) 21));
        uuw0 uuw0Var6 = ((kxw0) b1x0Var.b).f;
        kxw0.g(uuw0Var6);
        uuw0Var6.o.c(Long.valueOf(j), p1x0Var, "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
            atomicReference.set(p1x0Var);
            atomicReference.notifyAll();
        }
    }

    public void b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (Intrinsics.d(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new tiu0("eglGetDisplay failed", null, (byte) 2);
        }
        this.f40287a = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new tiu0("eglInitialize failed", null, (byte) 2);
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f40287a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] <= 0) {
            throw new tiu0("eglChooseConfig failed", null, (byte) 2);
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig == null) {
            throw new tiu0("eglChooseConfig returned null", null, (byte) 2);
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f40287a, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (Intrinsics.d(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            throw new tiu0("eglCreateContext failed", null, (byte) 2);
        }
        this.b = eGLContextEglCreateContext;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface((EGLDisplay) this.f40287a, eGLConfig, new int[]{12375, 256, 12374, 256, 12344}, 0);
        if (Intrinsics.d(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            throw new tiu0("eglCreatePbufferSurface failed", null, (byte) 2);
        }
        this.c = eGLSurfaceEglCreatePbufferSurface;
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f40287a, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, (EGLContext) this.b)) {
            throw new tiu0("eglMakeCurrent failed", null, (byte) 2);
        }
    }

    public void c() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f40287a;
        if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f40287a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = (EGLSurface) this.c;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f40287a, (EGLSurface) this.c);
            }
            EGLContext eGLContext = (EGLContext) this.b;
            if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f40287a, (EGLContext) this.b);
            }
            EGL14.eglTerminate((EGLDisplay) this.f40287a);
        }
        this.f40287a = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_SURFACE;
        this.b = EGL14.EGL_NO_CONTEXT;
    }

    public g8x0 e() throws GeneralSecurityException {
        Integer num = (Integer) this.f40287a;
        if (num == null) {
            hny.o("key size not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            hny.o("tag size not set");
            return null;
        }
        if (((hbb) this.c) != null) {
            return new g8x0(num.intValue(), ((Integer) this.b).intValue(), (hbb) this.c);
        }
        hny.o("variant not set");
        return null;
    }

    public void f(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
        }
        this.f40287a = Integer.valueOf(i);
    }

    public void g(int i) throws GeneralSecurityException {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(twn.m(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.b = Integer.valueOf(i);
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        lsj lsjVar = (lsj) this.f40287a;
        lsjVar.f = ((zzaia) xfw0Var).b;
        ywq0 ywq0Var = (ywq0) ((nmt0) this.c).f23789a;
        glt0 glt0Var = new glt0(this, (hcp0) this.b, this);
        rfw0 rfw0Var = (rfw0) ywq0Var.f43384a;
        hhm0.G(rfw0Var.M("/verifyPhoneNumber", (String) ywq0Var.f), lsjVar, glt0Var, new njw0(), (fht0) rfw0Var.b);
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.b).a(msm0.v(str));
    }
}

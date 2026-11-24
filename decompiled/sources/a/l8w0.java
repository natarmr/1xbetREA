package a;

import android.gov.nist.core.Separators;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import java.io.File;
import java.security.GeneralSecurityException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l8w0 implements ngw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f19624a;
    public Object b;
    public Object c;

    public void a() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (Intrinsics.d(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new tiu0("eglGetDisplay failed", null, (byte) 2);
        }
        this.f19624a = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new tiu0("eglInitialize failed", null, (byte) 2);
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f19624a, new int[]{12352, 64, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] <= 0) {
            throw new tiu0("eglChooseConfig failed (ES 3.1 unsupported?)", null, (byte) 2);
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig == null) {
            throw new tiu0("eglChooseConfig returned null", null, (byte) 2);
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f19624a, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12539, 1, 12344}, 0);
        if (Intrinsics.d(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            throw new tiu0("eglCreateContext failed", null, (byte) 2);
        }
        this.b = eGLContextEglCreateContext;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface((EGLDisplay) this.f19624a, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        if (Intrinsics.d(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            throw new tiu0("eglCreatePbufferSurface failed", null, (byte) 2);
        }
        this.c = eGLSurfaceEglCreatePbufferSurface;
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f19624a, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, (EGLContext) this.b)) {
            throw new tiu0("eglMakeCurrent failed", null, (byte) 2);
        }
    }

    public void b() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f19624a;
        if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = (EGLSurface) this.c;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface2);
            }
            EGLContext eGLContext = (EGLContext) this.b;
            if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            }
            EGL14.eglTerminate(eGLDisplay);
        }
        this.f19624a = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_SURFACE;
        this.b = EGL14.EGL_NO_CONTEXT;
    }

    public crw0 c() throws GeneralSecurityException {
        rkt0 rkt0Var;
        icw0 icw0VarB;
        jrw0 jrw0Var = (jrw0) this.f19624a;
        if (jrw0Var == null || (rkt0Var = (rkt0) this.b) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (jrw0Var.f17024a != ((icw0) rkt0Var.b).f14556a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        if (jrw0Var.a() && ((Integer) this.c) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((jrw0) this.f19624a).a() && ((Integer) this.c) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        drq drqVar = ((jrw0) this.f19624a).d;
        if (drqVar == drq.g) {
            icw0VarB = q6x0.f28222a;
        } else if (drqVar == drq.f) {
            icw0VarB = q6x0.a(((Integer) this.c).intValue());
        } else {
            if (drqVar != drq.e) {
                jf4.n("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(drqVar)));
                return null;
            }
            icw0VarB = q6x0.b(((Integer) this.c).intValue());
        }
        return new crw0((jrw0) this.f19624a, (rkt0) this.b, icw0VarB, (Integer) this.c);
    }

    public h8x0 d() throws GeneralSecurityException {
        rkt0 rkt0Var;
        icw0 icw0VarA;
        p8x0 p8x0Var = (p8x0) this.f19624a;
        if (p8x0Var == null || (rkt0Var = (rkt0) this.b) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (p8x0Var.f26582a != ((icw0) rkt0Var.b).f14556a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        if (p8x0Var.a() && ((Integer) this.c) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((p8x0) this.f19624a).a() && ((Integer) this.c) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        arw0 arw0Var = ((p8x0) this.f19624a).c;
        if (arw0Var == arw0.k) {
            icw0VarA = q6x0.f28222a;
        } else if (arw0Var == arw0.j || arw0Var == arw0.i) {
            icw0VarA = q6x0.a(((Integer) this.c).intValue());
        } else {
            if (arw0Var != arw0.h) {
                jf4.n("Unknown HmacParameters.Variant: ".concat(String.valueOf(arw0Var)));
                return null;
            }
            icw0VarA = q6x0.b(((Integer) this.c).intValue());
        }
        return new h8x0((p8x0) this.f19624a, (rkt0) this.b, icw0VarA, (Integer) this.c);
    }

    public File e() {
        String str = (String) ((lin0) this.b).get();
        String str2 = (String) ((lin0) this.c).get();
        return new File(ua80.m(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, Separators.SLASH, str2, ".pb"));
    }

    @Override // a.ngw0
    public /* synthetic */ void h(xfw0 xfw0Var) {
        nmt0.e((nmt0) ((cmt0) this.c).c, (ljw0) xfw0Var, (hcp0) this.f19624a, this);
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((cmt0) this.b).mo2zza(str);
    }
}

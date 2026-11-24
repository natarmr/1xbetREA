package a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kx9 implements gnf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy9 f19042a;
    public final CaptureRequest b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final ArrayMap f;
    public final boolean g;
    public final cmf0 h;
    public final long i;

    public kx9(fy9 fy9Var, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, cmf0 cmf0Var, long j) {
        fy9Var.getClass();
        captureRequest.getClass();
        map2.getClass();
        map3.getClass();
        this.f19042a = fy9Var;
        this.b = captureRequest;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = arrayMap;
        this.g = z;
        this.h = cmf0Var;
        this.i = j;
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        tre0 tre0Var = sre0.f32672a;
        if (sgyVar.equals(tre0Var.b(CaptureRequest.class))) {
            CaptureRequest captureRequest = this.b;
            captureRequest.getClass();
            return captureRequest;
        }
        boolean zEquals = sgyVar.equals(tre0Var.b(CameraCaptureSession.class));
        fy9 fy9Var = this.f19042a;
        if (zEquals) {
            Object objH = fy9Var.H(tre0Var.b(CameraCaptureSession.class));
            if (objH != null) {
                return objH;
            }
        } else if (sgyVar.equals(tre0Var.b(kn4.C()))) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object objH2 = fy9Var.H(tre0Var.b(kn4.C()));
                if (objH2 != null) {
                    return objH2;
                }
            } else {
                jf4.n("Check failed.");
            }
        }
        return null;
    }

    @Override // a.gnf0
    public final Map Q() {
        return this.f;
    }

    @Override // a.gnf0
    public final boolean R() {
        return this.g;
    }

    @Override // a.gd40
    public final Object a(dd40 dd40Var) {
        Map map = this.h.c;
        dd40Var.getClass();
        Map map2 = this.e;
        if (map2.containsKey(dd40Var)) {
            return map2.get(dd40Var);
        }
        if (map.containsKey(dd40Var)) {
            return map.get(dd40Var);
        }
        Map map3 = this.d;
        return map3.containsKey(dd40Var) ? map3.get(dd40Var) : this.c.get(dd40Var);
    }

    @Override // a.gd40
    public final Object b(dd40 dd40Var, eoo0 eoo0Var) {
        dd40Var.getClass();
        Object objA = a(dd40Var);
        return objA == null ? eoo0Var : objA;
    }

    @Override // a.gnf0
    public final cmf0 getRequest() {
        return this.h;
    }

    @Override // a.gnf0
    public final long x() {
        return this.i;
    }
}

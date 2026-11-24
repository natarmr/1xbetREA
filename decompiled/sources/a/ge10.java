package a;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ge10 implements jot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7m0 f11128a;
    public final tpt0 b;
    public pot0 c;
    public final boolean d;
    public boolean e;
    public final hy40 f;
    public final AtomicInteger g;
    public odd h;
    public jzj i;

    public ge10(c1a c1aVar, i7m0 i7m0Var, tpt0 tpt0Var, p7d p7dVar) {
        i7m0Var.getClass();
        tpt0Var.getClass();
        p7dVar.getClass();
        this.f11128a = i7m0Var;
        this.b = tpt0Var;
        boolean z = false;
        if (c1aVar != null) {
            c1a.a0.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
            key.getClass();
            int[] iArr = (int[]) ((ow9) c1aVar).c(key);
            if (iArr == null ? false : tx3.w(iArr, 6)) {
                z = true;
            }
        }
        this.d = z;
        this.f = new hy40(-1);
        this.g = new AtomicInteger(-1);
        if (z) {
            p7dVar.b(new fe10(this), tpt0Var.e);
        }
    }

    public final void a(List list) {
        list.getClass();
        if (this.d) {
            if (list.isEmpty()) {
                this.i = ozb.j(Boolean.FALSE);
            } else {
                this.i = qjj.M(this.b.f, null, new kaw(this, list, null, (byte) 29), 3);
            }
        }
    }

    @Override // a.jot0
    public final void b(pot0 pot0Var) {
        this.c = pot0Var;
        if (this.e) {
            if (pot0Var != null) {
                d(true, false);
            } else {
                c(this.f, 0);
            }
        }
    }

    public final void c(hy40 hy40Var, int i) {
        if (this.g.getAndSet(i) != i) {
            if (ofm0.v()) {
                hy40Var.l(Integer.valueOf(i));
            } else {
                hy40Var.i(Integer.valueOf(i));
            }
        }
    }

    public final odd d(boolean z, boolean z2) {
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z);
        }
        odd oddVar = new odd();
        if (this.d) {
            qjj.W(this.b.f, null, null, new mu3((yje) null, this, oddVar, z, z2), 3);
            return oddVar;
        }
        oddVar.b0(new IllegalStateException("Low Light Boost is not supported!"));
        return oddVar;
    }

    @Override // a.jot0
    public final void reset() {
        odd oddVar = this.h;
        if (oddVar != null) {
            dw9.z("There is a new enableLowLightBoost being set", oddVar);
        }
        this.h = null;
        d(false, true);
    }
}

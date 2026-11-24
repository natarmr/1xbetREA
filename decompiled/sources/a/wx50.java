package a;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class wx50 implements b4w0 {
    public static final List b = kotlin.collections.a.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1a f39916a;

    public wx50(l1a l1aVar) {
        this.f39916a = l1aVar;
    }

    @Override // a.b4w0
    public final jzj b(float f, pot0 pot0Var) {
        pot0Var.getClass();
        return ozb.j(Unit.f46060a);
    }

    @Override // a.b4w0
    public final float c() {
        return 1.0f;
    }

    @Override // a.b4w0
    public final jzj i(pot0 pot0Var) {
        pot0Var.getClass();
        return ozb.j(Unit.f46060a);
    }

    @Override // a.b4w0
    public final float k() {
        return 1.0f;
    }

    @Override // a.b4w0
    public final Rect r() {
        c1a c1aVar = this.f39916a.b;
        c1aVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        ow9 ow9Var = (ow9) c1aVar;
        Rect rect = (Rect) ow9Var.c(key);
        if (rect != null) {
            return rect;
        }
        if (l8x.j0()) {
            Log.w("CXCP", "Failed to read SENSOR_INFO_ACTIVE_ARRAY_SIZE for " + ((Object) g0a.b(ow9Var.f25959a)) + '!');
        }
        return new Rect(0, 0, 4000, 3000);
    }
}

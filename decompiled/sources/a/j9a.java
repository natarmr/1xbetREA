package a;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j9a implements cy9, kft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gnf0 f16128a;
    public final b7r b;

    public j9a(gnf0 gnf0Var, b7r b7rVar) {
        gnf0Var.getClass();
        this.f16128a = gnf0Var;
        this.b = b7rVar;
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        boolean zEquals = sgyVar.equals(sre0.f32672a.b(b7r.class));
        b7r b7rVar = this.b;
        return zEquals ? b7rVar : b7rVar.H(sgyVar);
    }

    @Override // a.cy9
    public final int c() {
        pz2 metadata = this.b.getMetadata();
        CaptureResult.Key key = CaptureResult.FLASH_STATE;
        key.getClass();
        metadata.getClass();
        CaptureResult captureResult = metadata.f27824a;
        Integer num = (Integer) captureResult.get(key);
        int i = 2;
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 2) {
                return 3;
            }
            i = 4;
            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
                if (num != null && l8x.f0("CXCP")) {
                    Log.d("CXCP", "Unknown flash state (" + num.intValue() + ") for " + ((Object) f7r.a(captureResult.getFrameNumber())) + '!');
                }
                return 1;
            }
        }
        return i;
    }

    @Override // a.cy9
    public final eoo0 f() {
        return (eoo0) this.f16128a.b(vso0.f37960a, eoo0.b);
    }

    @Override // a.cy9
    public final void g(jko jkoVar) {
        String strValueOf;
        super.g(jkoVar);
        ArrayList arrayList = jkoVar.f16680a;
        pz2 metadata = this.b.getMetadata();
        try {
            CaptureResult.Key key = CaptureResult.JPEG_ORIENTATION;
            key.getClass();
            metadata.getClass();
            Integer num = (Integer) metadata.f27824a.get(key);
            if (num != null) {
                jkoVar.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            if (l8x.j0()) {
                Log.w("CXCP", "Failed to get JPEG orientation.");
            }
        }
        CaptureResult.Key key2 = CaptureResult.SENSOR_EXPOSURE_TIME;
        key2.getClass();
        metadata.getClass();
        CaptureResult captureResult = metadata.f27824a;
        Long l = (Long) captureResult.get(key2);
        if (l != null) {
            jkoVar.c(arrayList, "ExposureTime", String.valueOf(l.longValue() / 1.0E9d));
        }
        CaptureResult.Key key3 = CaptureResult.LENS_APERTURE;
        key3.getClass();
        Float f = (Float) captureResult.get(key3);
        if (f != null) {
            jkoVar.c(arrayList, "FNumber", String.valueOf(f.floatValue()));
        }
        CaptureResult.Key key4 = CaptureResult.SENSOR_SENSITIVITY;
        key4.getClass();
        Integer num2 = (Integer) captureResult.get(key4);
        if (num2 != null) {
            int iIntValue = num2.intValue();
            jkoVar.c(arrayList, "SensitivityType", String.valueOf(3));
            jkoVar.c(arrayList, "PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)));
            CaptureResult.Key key5 = CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;
            key5.getClass();
            Integer num3 = (Integer) captureResult.get(key5);
            if (num3 != null) {
                int iIntValue2 = iIntValue * ((int) (num3.intValue() / 100.0f));
                jkoVar.c(arrayList, "SensitivityType", String.valueOf(3));
                jkoVar.c(arrayList, "PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue2)));
            }
        }
        CaptureResult.Key key6 = CaptureResult.LENS_FOCAL_LENGTH;
        key6.getClass();
        Float f2 = (Float) captureResult.get(key6);
        if (f2 != null) {
            jkoVar.c(arrayList, "FocalLength", dw9.o((long) (f2.floatValue() * 1000.0f), "/1000"));
        }
        CaptureResult.Key key7 = CaptureResult.CONTROL_AWB_MODE;
        key7.getClass();
        Integer num4 = (Integer) captureResult.get(key7);
        if (num4 != null) {
            int iE = hne.E(num4.intValue() == 0 ? 2 : 1);
            if (iE != 0) {
                strValueOf = iE != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            jkoVar.c(arrayList, "WhiteBalance", strValueOf);
        }
    }

    @Override // a.cy9
    public final long h() {
        pz2 metadata = this.b.getMetadata();
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        metadata.getClass();
        Object obj = metadata.f27824a.get(key);
        return ((Number) (obj != null ? obj : -1L)).longValue();
    }

    @Override // a.cy9
    public final zx9 m() {
        pz2 metadata = this.b.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
        key.getClass();
        metadata.getClass();
        CaptureResult captureResult = metadata.f27824a;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return zx9.b;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return zx9.c;
        }
        if (num != null && num.intValue() == 4) {
            return zx9.f;
        }
        if (num != null && num.intValue() == 5) {
            return zx9.g;
        }
        if (num != null && num.intValue() == 2) {
            return zx9.d;
        }
        if (num != null && num.intValue() == 6) {
            return zx9.e;
        }
        zx9 zx9Var = zx9.f45147a;
        if (num != null && l8x.f0("CXCP")) {
            Log.d("CXCP", "Unknown AF state (" + num.intValue() + ") for " + ((Object) f7r.a(captureResult.getFrameNumber())) + '!');
        }
        return zx9Var;
    }

    @Override // a.cy9
    public final ay9 o() {
        pz2 metadata = this.b.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AWB_STATE;
        key.getClass();
        metadata.getClass();
        CaptureResult captureResult = metadata.f27824a;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return ay9.b;
        }
        if (num != null && num.intValue() == 1) {
            return ay9.c;
        }
        if (num != null && num.intValue() == 2) {
            return ay9.d;
        }
        if (num != null && num.intValue() == 3) {
            return ay9.e;
        }
        ay9 ay9Var = ay9.f1660a;
        if (num != null && l8x.f0("CXCP")) {
            Log.d("CXCP", "Unknown AWB state (" + num.intValue() + ") for " + ((Object) f7r.a(captureResult.getFrameNumber())) + '!');
        }
        return ay9Var;
    }

    @Override // a.cy9
    public final yx9 p() {
        pz2 metadata = this.b.getMetadata();
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        metadata.getClass();
        CaptureResult captureResult = metadata.f27824a;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return yx9.b;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return yx9.c;
        }
        if (num != null && num.intValue() == 4) {
            return yx9.d;
        }
        if (num != null && num.intValue() == 2) {
            return yx9.e;
        }
        if (num != null && num.intValue() == 3) {
            return yx9.f;
        }
        yx9 yx9Var = yx9.f43409a;
        if (num != null && l8x.f0("CXCP")) {
            Log.d("CXCP", "Unknown AE state (" + num.intValue() + ") for " + ((Object) f7r.a(captureResult.getFrameNumber())) + '!');
        }
        return yx9Var;
    }
}

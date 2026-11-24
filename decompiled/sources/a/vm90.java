package a;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;

/* JADX INFO: loaded from: classes.dex */
public final class vm90 implements j0a, kft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1a f37667a;
    public final n0o0 b = maz.b(new pl70(this, (byte) 18));

    public vm90(l1a l1aVar) {
        this.f37667a = l1aVar;
    }

    @Override // a.j0a
    public final int B(int i) {
        c1a c1aVar = this.f37667a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object objC = ((ow9) c1aVar).c(key);
        objC.getClass();
        return hp4.H(hp4.K(i), ((Number) objC).intValue(), 1 == h());
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        tre0 tre0Var = sre0.f32672a;
        if (sgyVar.equals(tre0Var.b(mw9.class))) {
            mw9 mw9Var = (mw9) this.b.getValue();
            mw9Var.getClass();
            return mw9Var;
        }
        boolean zEquals = sgyVar.equals(tre0Var.b(l1a.class));
        l1a l1aVar = this.f37667a;
        if (zEquals) {
            return l1aVar;
        }
        boolean zEquals2 = sgyVar.equals(tre0Var.b(CameraMetadata.class));
        c1a c1aVar = l1aVar.b;
        if (!zEquals2) {
            return ((ow9) c1aVar).H(sgyVar);
        }
        c1aVar.getClass();
        return c1aVar;
    }

    @Override // a.j0a
    public final wh00 b() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // a.j0a
    public final n2a c() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // a.j0a
    public final int d() {
        return B(0);
    }

    @Override // a.j0a
    public final int h() {
        c1a c1aVar = this.f37667a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object objC = ((ow9) c1aVar).c(key);
        objC.getClass();
        int iIntValue = ((Number) objC).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        jf4.o(ua80.e(iIntValue, "The specified lens facing integer ", " can not be recognized."));
        return 0;
    }

    @Override // a.j0a
    public final boolean m() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }
}

package a;

import android.hardware.camera2.CameraExtensionCharacteristics;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lw9 implements gd40, kft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20754a;
    public final int b;
    public final CameraExtensionCharacteristics c;
    public final a8z d;

    public lw9(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics, lun lunVar) {
        str.getClass();
        this.f20754a = str;
        this.b = i;
        this.c = cameraExtensionCharacteristics;
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        wez wezVar = wez.f39042a;
        maz.a(wezVar, new kw9(this, (byte) 0));
        maz.a(wezVar, new kw9(this, (byte) 1));
        this.d = maz.a(wezVar, new kw9(this, (byte) 2));
        maz.a(wezVar, new kw9(this, (byte) 3));
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        if (sgyVar.equals(sre0.f32672a.b(kn4.o()))) {
            return this.c;
        }
        return null;
    }
}

package a;

import android.hardware.HardwareBuffer;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.AudioFocusRequest;
import android.util.Size;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class y6 {
    public static /* synthetic */ OutputConfiguration f(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest g(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue i(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return HardwareBuffer.class;
    }
}

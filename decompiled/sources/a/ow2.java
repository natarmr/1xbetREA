package a;

import android.hardware.camera2.CameraExtensionSession$StateCallback;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.media.AudioDescriptor;
import android.media.AudioProfile;
import android.view.translation.ViewTranslationResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ow2 {
    public static /* synthetic */ ExtensionSessionConfiguration f(int i, ArrayList arrayList, k03 k03Var, CameraExtensionSession$StateCallback cameraExtensionSession$StateCallback) {
        return new ExtensionSessionConfiguration(i, arrayList, k03Var, cameraExtensionSession$StateCallback);
    }

    public static /* synthetic */ InputConfiguration g(int i, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i);
    }

    public static /* synthetic */ MultiResolutionStreamInfo h(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor i(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile j(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse l(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void z() {
    }
}

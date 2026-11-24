package a;

import android.os.Build;
import android.util.Base64;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m44 implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21149a;

    public /* synthetic */ m44(byte b) {
        this.f21149a = b;
    }

    @Override // a.lin0
    public final Object get() {
        switch (this.f21149a) {
            case 0:
                return Boolean.valueOf(Build.VERSION.SDK_INT > 37 && Objects.equals(vtt0.C("persist.audio.compressed_offload_implicit_aac"), "false"));
            case 1:
                byte[] bArr = new byte[12];
                owj.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new xvj();
            case 3:
                String strC = vtt0.C("ro.vendor.api_level");
                if (strC == null) {
                    strC = "";
                }
                return n6x.v0(strC);
            default:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    itt0.o(e);
                    return null;
                }
        }
    }
}

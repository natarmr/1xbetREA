package a;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class soq implements nwp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32556a;
    public final boolean b;

    public soq(kpd0 kpd0Var) {
        boolean z;
        kpd0Var.getClass();
        Iterator it = kpd0Var.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                z = true;
                this.f32556a = z;
                this.b = kpd0Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
            }
        }
        z = false;
        this.f32556a = z;
        this.b = kpd0Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // a.nwp0
    public Map a(onf0 onf0Var) {
        if (onf0Var != null && onf0Var.f25544a == 3 && this.f32556a) {
            return wp20.b(new Pair(CaptureRequest.CONTROL_CAPTURE_INTENT, 1));
        }
        if (onf0Var != null && onf0Var.f25544a == 4 && this.b) {
            return wp20.b(new Pair(CaptureRequest.CONTROL_CAPTURE_INTENT, 2));
        }
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return lunVar;
    }

    public soq(boolean z, boolean z2) {
        this.f32556a = z;
        this.b = z2;
    }
}

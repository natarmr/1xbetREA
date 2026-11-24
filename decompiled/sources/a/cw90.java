package a;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class cw90 implements yv90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cw90 f5071a = new cw90();

    @Override // a.yv90
    public final xv90 a(View view, boolean z, long j, float f, float f2, boolean z2, w6k w6kVar, float f3) {
        if (z) {
            return new bw90(new Magnifier(view));
        }
        long jG0 = w6kVar.G0(j);
        float fW0 = w6kVar.w0(f);
        float fW1 = w6kVar.w0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jG0 != 9205357640488583168L) {
            builder.setSize(si30.b(Float.intBitsToFloat((int) (jG0 >> 32))), si30.b(Float.intBitsToFloat((int) (jG0 & 4294967295L))));
        }
        if (!Float.isNaN(fW0)) {
            builder.setCornerRadius(fW0);
        }
        if (!Float.isNaN(fW1)) {
            builder.setElevation(fW1);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new bw90(builder.build());
    }

    @Override // a.yv90
    public final boolean b() {
        return true;
    }
}

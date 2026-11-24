package a;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class mah0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lah0 f21457a;

    public mah0(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f21457a = new kah0(nestedScrollView);
        } else {
            this.f21457a = new lme0((byte) 13);
        }
    }
}

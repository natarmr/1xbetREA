package a;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class vvk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f38104a;

    public vvk(DisplayCutout displayCutout) {
        this.f38104a = displayCutout;
    }

    public final pfx a() {
        return Build.VERSION.SDK_INT >= 30 ? pfx.d(e7.i(this.f38104a)) : pfx.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vvk.class != obj.getClass()) {
            return false;
        }
        return this.f38104a.equals(((vvk) obj).f38104a);
    }

    public final int hashCode() {
        return this.f38104a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f38104a + "}";
    }
}

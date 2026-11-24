package a;

import android.os.Build;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38288a;
    public final x860 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    public vz9(boolean z, x860 x860Var, int i, boolean z2, int i2) {
        boolean z3;
        if ((i2 & 2) != 0) {
            z = Build.VERSION.SDK_INT >= 30;
        }
        x860Var = (i2 & 4) != 0 ? new x860(0, wz9.f40013a) : x860Var;
        i = (i2 & 16) != 0 ? 0 : i;
        if ((i2 & 32) != 0) {
            Map map = jx9.c;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 > 27) {
                String str = Build.HARDWARE;
                if (!Intrinsics.d(str, "samsungexynos7870") && (!kotlin.text.c.o(str, "qcom") || i3 > 31)) {
                    Map map2 = jx9.d;
                    String str2 = Build.BRAND;
                    str2.getClass();
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    Set set = (Set) map2.get(lowerCase);
                    if (set != null) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        String lowerCase2 = str3.toLowerCase(locale);
                        lowerCase2.getClass();
                        z3 = set.contains(lowerCase2) ? true : z3;
                    }
                    z3 = false;
                }
            }
        }
        z2 = (i2 & 64) != 0 ? false : z2;
        boolean z4 = (i2 & 128) == 0;
        this.f38288a = z;
        this.b = x860Var;
        this.c = i;
        this.d = z3;
        this.e = z2;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vz9) {
            vz9 vz9Var = (vz9) obj;
            if (this.f38288a == vz9Var.f38288a && this.b == vz9Var.b && this.c == vz9Var.c && this.d == vz9Var.d && this.e == vz9Var.e && this.f == vz9Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(twn.a(this.c, (this.b.hashCode() + brm0.e(Boolean.hashCode(false) * 31, 31, this.f38288a)) * 961, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=");
        sb.append(this.f38288a);
        sb.append(", awaitRepeatingRequestBeforeCapture=");
        sb.append(this.b);
        sb.append(", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=");
        sb.append((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.c + ')'));
        sb.append(", closeCaptureSessionOnDisconnect=");
        sb.append(this.d);
        sb.append(", closeCameraDeviceOnClose=");
        sb.append(this.e);
        sb.append(", enableRestartDelays=");
        return brm0.o(sb, this.f, ')');
    }
}

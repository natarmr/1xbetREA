package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ay70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1658a;
    public final boolean b;

    public ay70(String str, boolean z) {
        str.getClass();
        this.f1658a = str;
        this.b = z;
    }

    public static ay70 a(ay70 ay70Var, boolean z) {
        String str = ay70Var.f1658a;
        ay70Var.getClass();
        str.getClass();
        return new ay70(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay70)) {
            return false;
        }
        ay70 ay70Var = (ay70) obj;
        return Intrinsics.d(this.f1658a, ay70Var.f1658a) && this.b == ay70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f1658a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("OpenTelegramBotBottomSheetState(appName=", this.f1658a, ", isLoading=", this.b, Separators.RPAREN);
    }
}

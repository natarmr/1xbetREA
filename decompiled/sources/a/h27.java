package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12318a;
    public final boolean b;

    public h27(String str, boolean z) {
        str.getClass();
        this.f12318a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h27)) {
            return false;
        }
        h27 h27Var = (h27) obj;
        return Intrinsics.d(this.f12318a, h27Var.f12318a) && this.b == h27Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12318a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("OnNotificationClick(betId=", this.f12318a, ", isNotificationEnable=", this.b, Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12852a;

    public hd4(String str) {
        str.getClass();
        this.f12852a = str;
    }

    public static hd4 a(String str) {
        str.getClass();
        return new hd4(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd4) && Intrinsics.d(this.f12852a, ((hd4) obj).f12852a);
    }

    public final int hashCode() {
        return this.f12852a.hashCode();
    }

    public final String toString() {
        return kng0.l("Password(password=", this.f12852a, Separators.RPAREN);
    }
}

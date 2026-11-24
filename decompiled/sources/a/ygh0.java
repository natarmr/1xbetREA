package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ygh0 implements ahh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42584a;

    public ygh0(String str) {
        str.getClass();
        this.f42584a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygh0) && Intrinsics.d(this.f42584a, ((ygh0) obj).f42584a);
    }

    public final int hashCode() {
        return this.f42584a.hashCode();
    }

    public final String toString() {
        return kng0.l("QueryOnly(query=", this.f42584a, Separators.RPAREN);
    }
}

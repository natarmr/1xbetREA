package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m6e implements p6e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21265a;

    public m6e(String str) {
        str.getClass();
        this.f21265a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6e) && Intrinsics.d(this.f21265a, ((m6e) obj).f21265a);
    }

    public final int hashCode() {
        return rek0.b.hashCode() + (this.f21265a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackBar(message=" + this.f21265a + ", type=" + rek0.b + Separators.RPAREN;
    }
}

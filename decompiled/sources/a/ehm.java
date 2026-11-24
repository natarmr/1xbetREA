package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ehm implements ghm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7814a;

    public ehm(String str) {
        str.getClass();
        this.f7814a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehm) && Intrinsics.d(this.f7814a, ((ehm) obj).f7814a);
    }

    public final int hashCode() {
        return this.f7814a.hashCode();
    }

    public final String toString() {
        return kng0.l("Empty(text=", this.f7814a, Separators.RPAREN);
    }
}

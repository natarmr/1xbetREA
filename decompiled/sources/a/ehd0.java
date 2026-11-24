package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ehd0 implements khd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7802a;

    public ehd0(String str) {
        str.getClass();
        this.f7802a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehd0) && Intrinsics.d(this.f7802a, ((ehd0) obj).f7802a);
    }

    public final int hashCode() {
        return this.f7802a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCodeError(message=", this.f7802a, Separators.RPAREN);
    }
}

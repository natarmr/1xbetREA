package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class oxu0 implements sxu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26030a;

    public oxu0(String str) {
        str.getClass();
        this.f26030a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxu0) && Intrinsics.d(this.f26030a, ((oxu0) obj).f26030a);
    }

    public final int hashCode() {
        return this.f26030a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f26030a, Separators.RPAREN);
    }
}

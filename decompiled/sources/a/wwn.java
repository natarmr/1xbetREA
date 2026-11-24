package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wwn implements xwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39892a;

    public wwn(String str) {
        str.getClass();
        this.f39892a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wwn) && Intrinsics.d(this.f39892a, ((wwn) obj).f39892a);
    }

    public final int hashCode() {
        return this.f39892a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateDestination(value=", this.f39892a, Separators.RPAREN);
    }
}

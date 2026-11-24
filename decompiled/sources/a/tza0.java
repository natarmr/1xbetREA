package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tza0 implements wza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34796a;

    public tza0(String str) {
        str.getClass();
        this.f34796a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tza0) && Intrinsics.d(this.f34796a, ((tza0) obj).f34796a);
    }

    public final int hashCode() {
        return this.f34796a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f34796a, Separators.RPAREN);
    }
}

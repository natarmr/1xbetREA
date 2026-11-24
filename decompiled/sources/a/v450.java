package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v450 implements z450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36762a;

    public v450(String str) {
        str.getClass();
        this.f36762a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v450) && Intrinsics.d(this.f36762a, ((v450) obj).f36762a);
    }

    public final int hashCode() {
        return this.f36762a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(description=", this.f36762a, Separators.RPAREN);
    }
}

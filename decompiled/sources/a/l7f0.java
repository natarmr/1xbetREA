package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l7f0 implements n7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19555a;

    public l7f0(String str) {
        str.getClass();
        this.f19555a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7f0) && Intrinsics.d(this.f19555a, ((l7f0) obj).f19555a);
    }

    public final int hashCode() {
        return this.f19555a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f19555a, Separators.RPAREN);
    }
}

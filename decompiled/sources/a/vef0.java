package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vef0 implements xef0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37285a;

    public vef0(String str) {
        str.getClass();
        this.f37285a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vef0) && Intrinsics.d(this.f37285a, ((vef0) obj).f37285a);
    }

    public final int hashCode() {
        return this.f37285a.hashCode();
    }

    public final String toString() {
        return kng0.l("SimpleMessage(message=", this.f37285a, Separators.RPAREN);
    }
}

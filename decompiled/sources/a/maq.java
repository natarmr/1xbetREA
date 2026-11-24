package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class maq implements naq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21470a;

    public maq(String str) {
        str.getClass();
        this.f21470a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof maq) && Intrinsics.d(this.f21470a, ((maq) obj).f21470a);
    }

    public final int hashCode() {
        return this.f21470a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnack(message=", this.f21470a, Separators.RPAREN);
    }
}

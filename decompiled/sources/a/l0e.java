package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l0e implements q0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19196a;

    public l0e(String str) {
        str.getClass();
        this.f19196a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0e) && Intrinsics.d(this.f19196a, ((l0e) obj).f19196a);
    }

    public final int hashCode() {
        return this.f19196a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f19196a, Separators.RPAREN);
    }
}

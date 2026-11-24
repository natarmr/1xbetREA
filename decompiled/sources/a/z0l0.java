package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z0l0 implements a1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43573a;

    public z0l0(String str) {
        str.getClass();
        this.f43573a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0l0) && Intrinsics.d(this.f43573a, ((z0l0) obj).f43573a);
    }

    @Override // a.a1l0
    public final Object getId() {
        return "HISTORY_LIST_HEADER_KEY";
    }

    public final int hashCode() {
        return this.f43573a.hashCode() + 566200925;
    }

    public final String toString() {
        return kng0.l("HeaderItem(id=HISTORY_LIST_HEADER_KEY, title=", this.f43573a, Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cq1 implements dq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4773a;

    public cq1(String str) {
        str.getClass();
        this.f4773a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq1) && Intrinsics.d(this.f4773a, ((cq1) obj).f4773a);
    }

    public final int hashCode() {
        return this.f4773a.hashCode();
    }

    public final String toString() {
        return kng0.l("Href(href=", this.f4773a, Separators.RPAREN);
    }
}

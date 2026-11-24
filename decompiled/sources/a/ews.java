package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ews implements hws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f8542a;
    public final boolean b;

    public ews(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f8542a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ews)) {
            return false;
        }
        ews ewsVar = (ews) obj;
        return Intrinsics.d(this.f8542a, ewsVar.f8542a) && this.b == ewsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f8542a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(items=" + this.f8542a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}

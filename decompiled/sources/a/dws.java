package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dws implements hws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f6814a;
    public final boolean b;

    public dws(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f6814a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dws)) {
            return false;
        }
        dws dwsVar = (dws) obj;
        return Intrinsics.d(this.f6814a, dwsVar.f6814a) && this.b == dwsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f6814a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(items=" + this.f6814a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}

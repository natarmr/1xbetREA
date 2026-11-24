package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nsm implements psm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24057a;
    public final String b;
    public final a4x c;

    public nsm(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f24057a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsm)) {
            return false;
        }
        nsm nsmVar = (nsm) obj;
        return Intrinsics.d(this.f24057a, nsmVar.f24057a) && Intrinsics.d(this.b, nsmVar.b) && Intrinsics.d(this.c, nsmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f24057a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Default(btnFilterText=", this.f24057a, ", btnAllText=", this.b, ", items="), this.c, Separators.RPAREN);
    }
}

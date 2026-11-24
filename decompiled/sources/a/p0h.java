package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p0h implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26150a;
    public final String b;
    public final a4x c;

    public p0h(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f26150a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0h)) {
            return false;
        }
        p0h p0hVar = (p0h) obj;
        return Intrinsics.d(this.f26150a, p0hVar.f26150a) && Intrinsics.d(this.b, p0hVar.b) && Intrinsics.d(this.c, p0hVar.c);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return p0h.class;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f26150a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("CyberGroupsHeaderUiModel(firstLeftColumnTitle=", this.f26150a, ", secondLeftColumnTitle=", this.b, ", rightColumnsReversedTitles="), this.c, Separators.RPAREN);
    }
}

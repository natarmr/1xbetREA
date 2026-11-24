package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i8b implements y2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14330a;
    public final String b;
    public final boolean c;
    public final String d;

    public i8b(String str, long j, boolean z) {
        str.getClass();
        this.f14330a = j;
        this.b = str;
        this.c = z;
        this.d = h97.h(j, "subgame_header_");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8b)) {
            return false;
        }
        i8b i8bVar = (i8b) obj;
        return this.f14330a == i8bVar.f14330a && Intrinsics.d(this.b, i8bVar.b) && this.c == i8bVar.c;
    }

    @Override // a.y2b
    public final String getKey() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f14330a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f14330a, "CategorySubGameHeaderUiModel(subGameId=", ", title=", this.b), ", isExpanded=", this.c, Separators.RPAREN);
    }
}

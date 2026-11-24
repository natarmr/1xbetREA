package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d4b implements y2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5446a;
    public final String b;

    public d4b(long j) {
        this.f5446a = j;
        this.b = h97.h(j, "divider_");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4b) && this.f5446a == ((d4b) obj).f5446a;
    }

    @Override // a.y2b
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5446a);
    }

    public final String toString() {
        return axq.h(this.f5446a, "CategoryDividerUiModel(subGameId=", Separators.RPAREN);
    }
}

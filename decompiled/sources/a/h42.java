package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h42 implements o42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3q f12412a;
    public final long b;

    public h42(s3q s3qVar, long j) {
        this.f12412a = s3qVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h42)) {
            return false;
        }
        h42 h42Var = (h42) obj;
        return this.f12412a == h42Var.f12412a && this.b == h42Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f12412a.hashCode() * 31);
    }

    public final String toString() {
        return "OnChipClick(sectionType=" + this.f12412a + ", id=" + this.b + Separators.RPAREN;
    }
}

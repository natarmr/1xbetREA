package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27538a;
    public final String b;
    public final long c;

    public pt(String str, long j, boolean z) {
        this.f27538a = z;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt)) {
            return false;
        }
        pt ptVar = (pt) obj;
        return this.f27538a == ptVar.f27538a && this.b.equals(ptVar.b) && this.c == ptVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(Boolean.hashCode(this.f27538a) * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, axq.q("AddSocial(success=", ", message=", this.b, this.f27538a, ", messageId="));
    }
}

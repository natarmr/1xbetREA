package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33583a;
    public final m9s b;
    public final boolean c;

    public t9s(long j, m9s m9sVar, boolean z) {
        m9sVar.getClass();
        this.f33583a = j;
        this.b = m9sVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9s)) {
            return false;
        }
        t9s t9sVar = (t9s) obj;
        return this.f33583a == t9sVar.f33583a && Intrinsics.d(this.b, t9sVar.b) && this.c == t9sVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f33583a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameDetailsWithCategory(marketTypeId=");
        sb.append(this.f33583a);
        sb.append(", gameDetails=");
        sb.append(this.b);
        return f140.n(sb, ", marketsFromResponse=", this.c, Separators.RPAREN);
    }
}

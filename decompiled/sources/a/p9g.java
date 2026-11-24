package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9g f26604a;
    public final i9g b;
    public final m7g c;

    public p9g(q9g q9gVar, i9g i9gVar, m7g m7gVar) {
        q9gVar.getClass();
        i9gVar.getClass();
        this.f26604a = q9gVar;
        this.b = i9gVar;
        this.c = m7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p9g) {
            p9g p9gVar = (p9g) obj;
            return Intrinsics.d(this.f26604a, p9gVar.f26604a) && Intrinsics.d(this.b, p9gVar.b) && this.c == p9gVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f26604a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventCache(eventViewParams=" + this.f26604a + ", event=" + this.b + ", eventBinding=" + this.c + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p6g implements q6g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5g f26452a;
    public final t9g b;

    public p6g(x5g x5gVar, t9g t9gVar) {
        this.f26452a = x5gVar;
        this.b = t9gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6g)) {
            return false;
        }
        p6g p6gVar = (p6g) obj;
        return this.f26452a.equals(p6gVar.f26452a) && this.b.equals(p6gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26452a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultState(dayOfWeekViewParams=" + this.f26452a + ", periodViewParams=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yqv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43093a;
    public final esv b;
    public final a4x c;
    public final sip d;

    public yqv(String str, esv esvVar, a4x a4xVar, sip sipVar) {
        a4xVar.getClass();
        this.f43093a = str;
        this.b = esvVar;
        this.c = a4xVar;
        this.d = sipVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqv)) {
            return false;
        }
        yqv yqvVar = (yqv) obj;
        return this.f43093a.equals(yqvVar.f43093a) && this.b.equals(yqvVar.b) && Intrinsics.d(this.c, yqvVar.c) && this.d == yqvVar.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f43093a;
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, (this.b.hashCode() + (this.f43093a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "HeaderFocusAllEventsUiModel(key=" + this.f43093a + ", header=" + this.b + ", disciplineGames=" + this.c + ", feedKind=" + this.d + Separators.RPAREN;
    }
}

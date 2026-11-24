package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class csq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4904a;

    public csq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f4904a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csq0) || !Intrinsics.d(this.f4904a, ((csq0) obj).f4904a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f4904a;
    }

    public final int hashCode() {
        return uwx.c.hashCode() + (this.f4904a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugConsole(title=" + this.f4904a + ", itemPosition=" + uwx.c + Separators.RPAREN;
    }
}

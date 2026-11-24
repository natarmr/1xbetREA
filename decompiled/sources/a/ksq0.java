package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ksq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18828a;

    public ksq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f18828a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksq0) || !Intrinsics.d(this.f18828a, ((ksq0) obj).f18828a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f18828a;
    }

    public final int hashCode() {
        return uwx.c.hashCode() + (this.f18828a.hashCode() * 31);
    }

    public final String toString() {
        return "TestRemoteConfig(title=" + this.f18828a + ", itemPosition=" + uwx.c + Separators.RPAREN;
    }
}

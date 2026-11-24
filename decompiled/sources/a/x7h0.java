package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x7h0 implements z7h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40413a;

    public x7h0(String str) {
        this.f40413a = str;
    }

    @Override // a.z7h0
    public final String a() {
        return this.f40413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7h0) && Intrinsics.d(this.f40413a, ((x7h0) obj).f40413a);
    }

    public final int hashCode() {
        String str = this.f40413a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("ListSelects(playerId=", this.f40413a, Separators.RPAREN);
    }
}

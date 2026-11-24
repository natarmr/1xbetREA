package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bhd0 implements khd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2601a;

    public bhd0(String str) {
        str.getClass();
        this.f2601a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhd0) && Intrinsics.d(this.f2601a, ((bhd0) obj).f2601a);
    }

    public final int hashCode() {
        return this.f2601a.hashCode();
    }

    public final String toString() {
        return kng0.l("ReceivedSmsCode(code=", this.f2601a, Separators.RPAREN);
    }
}

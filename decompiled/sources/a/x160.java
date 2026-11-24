package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x160 implements b260 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40105a;

    public x160(String str) {
        str.getClass();
        this.f40105a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x160) && Intrinsics.d(this.f40105a, ((x160) obj).f40105a);
    }

    public final int hashCode() {
        return this.f40105a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(text=", this.f40105a, Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class pw1 implements qw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27688a;

    public pw1(String str) {
        str.getClass();
        this.f27688a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw1) && Intrinsics.d(this.f27688a, ((pw1) obj).f27688a);
    }

    public final int hashCode() {
        return this.f27688a.hashCode();
    }

    public final String toString() {
        return kng0.l("Text(title=", this.f27688a, Separators.RPAREN);
    }
}

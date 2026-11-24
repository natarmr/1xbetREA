package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38259a;

    public vyp(String str) {
        str.getClass();
        this.f38259a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyp) && Intrinsics.d(this.f38259a, ((vyp) obj).f38259a);
    }

    public final int hashCode() {
        return this.f38259a.hashCode();
    }

    public final String toString() {
        return kng0.l("Default(info=", this.f38259a, Separators.RPAREN);
    }
}

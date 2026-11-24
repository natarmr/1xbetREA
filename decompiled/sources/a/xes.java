package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40758a;

    public xes(String str) {
        str.getClass();
        this.f40758a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xes) && Intrinsics.d(this.f40758a, ((xes) obj).f40758a);
    }

    public final int hashCode() {
        return this.f40758a.hashCode();
    }

    public final String toString() {
        return kng0.l("ErrorMessageChanged(errorMessage=", this.f40758a, Separators.RPAREN);
    }
}

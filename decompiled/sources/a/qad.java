package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qad implements sad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28389a;

    public qad(String str) {
        str.getClass();
        this.f28389a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qad) && Intrinsics.d(this.f28389a, ((qad) obj).f28389a);
    }

    public final int hashCode() {
        return this.f28389a.hashCode();
    }

    public final String toString() {
        return kng0.l("Single(teamName=", this.f28389a, Separators.RPAREN);
    }
}

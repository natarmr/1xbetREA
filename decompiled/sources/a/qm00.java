package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qm00 implements tm00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28959a;

    public qm00(String str) {
        str.getClass();
        this.f28959a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qm00) && Intrinsics.d(this.f28959a, ((qm00) obj).f28959a);
    }

    public final int hashCode() {
        return this.f28959a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(errorMessage=", this.f28959a, Separators.RPAREN);
    }
}

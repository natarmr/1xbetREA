package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class aob implements dob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f1192a;

    public aob(mdm mdmVar) {
        mdmVar.getClass();
        this.f1192a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aob) && Intrinsics.d(this.f1192a, ((aob) obj).f1192a);
    }

    public final int hashCode() {
        return this.f1192a.hashCode();
    }

    public final String toString() {
        return b1j.j("BalanceError(lottieConfig=", this.f1192a, Separators.RPAREN);
    }
}

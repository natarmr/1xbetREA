package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fk00 implements ik00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f9668a;

    public fk00(mdm mdmVar) {
        mdmVar.getClass();
        this.f9668a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk00) && Intrinsics.d(this.f9668a, ((fk00) obj).f9668a);
    }

    public final int hashCode() {
        return this.f9668a.hashCode();
    }

    public final String toString() {
        return b1j.j("Lottie(config=", this.f9668a, Separators.RPAREN);
    }
}

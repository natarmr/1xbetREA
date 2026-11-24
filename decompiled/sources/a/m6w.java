package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m6w implements p6w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f21291a;

    public m6w(mdm mdmVar) {
        mdmVar.getClass();
        this.f21291a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6w) && Intrinsics.d(this.f21291a, ((m6w) obj).f21291a);
    }

    public final int hashCode() {
        return this.f21291a.hashCode();
    }

    public final String toString() {
        return b1j.j("Lottie(config=", this.f21291a, Separators.RPAREN);
    }
}

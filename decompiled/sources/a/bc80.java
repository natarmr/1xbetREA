package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bc80 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f2343a;
    public final String b;

    public bc80(mdm mdmVar) {
        mdmVar.getClass();
        this.f2343a = mdmVar;
        this.b = String.valueOf(sre0.f32672a.b(bc80.class).J());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc80) && Intrinsics.d(this.f2343a, ((bc80) obj).f2343a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f2343a.hashCode();
    }

    public final String toString() {
        return b1j.j("OtherEmptyHeaderUiItem(lottie=", this.f2343a, Separators.RPAREN);
    }
}

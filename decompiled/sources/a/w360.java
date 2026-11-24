package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w360 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f38487a;
    public final String b;

    public w360(mdm mdmVar) {
        mdmVar.getClass();
        this.f38487a = mdmVar;
        this.b = String.valueOf(sre0.f32672a.b(w360.class).J());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w360) && Intrinsics.d(this.f38487a, ((w360) obj).f38487a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f38487a.hashCode();
    }

    public final String toString() {
        return b1j.j("NoTabsEmptyHeaderUiItem(lottie=", this.f38487a, Separators.RPAREN);
    }
}

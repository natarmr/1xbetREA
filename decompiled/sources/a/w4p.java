package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w4p implements e5p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f38551a;
    public final String b;

    public w4p(mdm mdmVar) {
        mdmVar.getClass();
        this.f38551a = mdmVar;
        this.b = String.valueOf(sre0.f32672a.b(w4p.class).J());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4p) && Intrinsics.d(this.f38551a, ((w4p) obj).f38551a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f38551a.hashCode();
    }

    public final String toString() {
        return b1j.j("FavoriteCategoryLottieHeaderUiModel(lottie=", this.f38551a, Separators.RPAREN);
    }
}

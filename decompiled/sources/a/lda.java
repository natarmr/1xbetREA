package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lda implements rda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19840a;

    public lda(String str) {
        str.getClass();
        this.f19840a = str;
        dja djaVar = dja.PENALTY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lda) && Intrinsics.d(this.f19840a, ((lda) obj).f19840a);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.COMMON;
    }

    public final int hashCode() {
        return this.f19840a.hashCode();
    }

    public final String toString() {
        return kng0.l("CardErrorUiModel(description=", this.f19840a, Separators.RPAREN);
    }
}

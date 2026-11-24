package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eao f2580a;
    public final a4x b;

    public bh(eao eaoVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f2580a = eaoVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh)) {
            return false;
        }
        bh bhVar = (bh) obj;
        return this.f2580a.equals(bhVar.f2580a) && Intrinsics.d(this.b, bhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2580a.hashCode() * 31);
    }

    public final String toString() {
        return "AccuracyContentUiModel(eventBet=" + this.f2580a + ", betChoiceButtonList=" + this.b + Separators.RPAREN;
    }
}

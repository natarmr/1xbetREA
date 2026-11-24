package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xu8 implements av8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bml f41497a;

    public xu8(bml bmlVar) {
        bmlVar.getClass();
        this.f41497a = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xu8) && Intrinsics.d(this.f41497a, ((xu8) obj).f41497a);
    }

    public final int hashCode() {
        return this.f41497a.hashCode();
    }

    public final String toString() {
        return "Content(aggregatorGameCardCollectionUiModel=" + this.f41497a + Separators.RPAREN;
    }
}

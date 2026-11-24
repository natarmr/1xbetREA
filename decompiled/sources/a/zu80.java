package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zu80 implements cv80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bml f44998a;

    public zu80(bml bmlVar) {
        bmlVar.getClass();
        this.f44998a = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu80) && Intrinsics.d(this.f44998a, ((zu80) obj).f44998a);
    }

    public final int hashCode() {
        return this.f44998a.hashCode();
    }

    public final String toString() {
        return "Content(gameCardCollectionUiModel=" + this.f44998a + Separators.RPAREN;
    }
}

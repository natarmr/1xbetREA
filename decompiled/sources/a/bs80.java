package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bs80 implements es80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bml f3117a;

    public bs80(bml bmlVar) {
        bmlVar.getClass();
        this.f3117a = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs80) && Intrinsics.d(this.f3117a, ((bs80) obj).f3117a);
    }

    public final int hashCode() {
        return this.f3117a.hashCode();
    }

    public final String toString() {
        return "Content(gameCardCollectionUiModel=" + this.f3117a + Separators.RPAREN;
    }
}

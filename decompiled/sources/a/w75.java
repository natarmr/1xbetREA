package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w75 implements z75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bml f38654a;

    public w75(bml bmlVar) {
        bmlVar.getClass();
        this.f38654a = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w75) && Intrinsics.d(this.f38654a, ((w75) obj).f38654a);
    }

    public final int hashCode() {
        return this.f38654a.hashCode();
    }

    public final String toString() {
        return "Content(gameCardCollectionUiModel=" + this.f38654a + Separators.RPAREN;
    }
}

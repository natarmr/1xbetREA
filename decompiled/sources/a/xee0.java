package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xee0 implements yee0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bml f40743a;

    public xee0(bml bmlVar) {
        bmlVar.getClass();
        this.f40743a = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xee0) && Intrinsics.d(this.f40743a, ((xee0) obj).f40743a);
    }

    public final int hashCode() {
        return this.f40743a.hashCode();
    }

    public final String toString() {
        return "Loading(gameCardCollectionUiModel=" + this.f40743a + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class flw extends t9p {
    public final a4x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flw(a4x a4xVar) {
        super("EVENTS", a4xVar);
        a4xVar.getClass();
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flw) && Intrinsics.d(this.b, ((flw) obj).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "EVENTS " + this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() - 658518521;
    }

    public final String toString() {
        return h97.i(this.b, "HorizontalEventCardUiItem(id=EVENTS, uiItems=", Separators.RPAREN);
    }
}

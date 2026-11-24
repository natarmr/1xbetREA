package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y8d extends a9d {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8d(String str) {
        super(str, 40.0f);
        str.getClass();
        zcl zclVar = qmk.f28987a;
        this.b = str;
    }

    @Override // a.a9d
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8d) && Intrinsics.d(this.b, ((y8d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return kng0.l("ExtendedTextWithBackground(value=", this.b, Separators.RPAREN);
    }
}

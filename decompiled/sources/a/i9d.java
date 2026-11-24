package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i9d extends k9d {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9d(String str) {
        super(str, 84.0f);
        str.getClass();
        zcl zclVar = qmk.f28987a;
        this.b = str;
    }

    @Override // a.k9d
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9d) && Intrinsics.d(this.b, ((i9d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return kng0.l("ExtendedText(value=", this.b, Separators.RPAREN);
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17257a;
    public final int b;

    public jwm(String str, int i) {
        str.getClass();
        this.f17257a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwm)) {
            return false;
        }
        jwm jwmVar = (jwm) obj;
        return Intrinsics.d(this.f17257a, jwmVar.f17257a) && this.b == jwmVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f17257a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "DsSportEventCardInfoLabel(infoLabel=", this.f17257a, ", infoLabelMaxLines=", Separators.RPAREN);
    }

    public /* synthetic */ jwm(String str) {
        this(str, Integer.MAX_VALUE);
    }
}

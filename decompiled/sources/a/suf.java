package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class suf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32816a;
    public final String b;
    public final String c;

    public suf(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f32816a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suf)) {
            return false;
        }
        suf sufVar = (suf) obj;
        return this.f32816a == sufVar.f32816a && Intrinsics.d(this.b, sufVar.b) && Intrinsics.d(this.c, sufVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f32816a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f32816a, "CurrencyDataModel(currencyId=", ", currencySymbol=", this.b), ", countryId=", this.c, Separators.RPAREN);
    }
}

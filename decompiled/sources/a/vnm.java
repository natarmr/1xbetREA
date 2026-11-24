package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vnm implements ynm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37725a;
    public final String b;

    public vnm(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f37725a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnm)) {
            return false;
        }
        vnm vnmVar = (vnm) obj;
        return Intrinsics.d(this.f37725a, vnmVar.f37725a) && Intrinsics.d(this.b, vnmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37725a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Default(amountLabel=", this.f37725a, ", promotionLabel=", this.b, Separators.RPAREN);
    }
}

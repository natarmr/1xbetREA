package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u2y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6y f34969a;
    public final String b;

    public u2y(f6y f6yVar, String str) {
        f6yVar.getClass();
        str.getClass();
        this.f34969a = f6yVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2y)) {
            return false;
        }
        u2y u2yVar = (u2y) obj;
        return Intrinsics.d(this.f34969a, u2yVar.f34969a) && Intrinsics.d(this.b, u2yVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34969a.hashCode() * 31);
    }

    public final String toString() {
        return "JackpotInfoModel(jackpotModel=" + this.f34969a + ", currency=" + this.b + Separators.RPAREN;
    }
}

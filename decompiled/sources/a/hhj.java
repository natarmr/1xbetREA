package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hhj implements khj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13066a;
    public final String b;

    public hhj(String str, String str2) {
        str.getClass();
        this.f13066a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhj)) {
            return false;
        }
        hhj hhjVar = (hhj) obj;
        return Intrinsics.d(this.f13066a, hhjVar.f13066a) && this.b.equals(hhjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13066a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("GameNames(matchName=", this.f13066a, ", champName=", this.b, Separators.RPAREN);
    }
}

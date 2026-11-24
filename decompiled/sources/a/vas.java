package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37106a;
    public final String b;

    public vas(String str, String str2) {
        this.f37106a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vas)) {
            return false;
        }
        vas vasVar = (vas) obj;
        return Intrinsics.d(this.f37106a, vasVar.f37106a) && Intrinsics.d(this.b, vasVar.b);
    }

    public final int hashCode() {
        String str = this.f37106a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("GameEventSubScoreModel(subFirst=", this.f37106a, ", subSecond=", this.b, Separators.RPAREN);
    }
}

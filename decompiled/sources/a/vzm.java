package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38306a;
    public final String b;

    public vzm(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f38306a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzm)) {
            return false;
        }
        vzm vzmVar = (vzm) obj;
        return Intrinsics.d(this.f38306a, vzmVar.f38306a) && Intrinsics.d(this.b, vzmVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ua80.b(this.f38306a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b1j.k("V1(opponentLabel=", this.f38306a, ", score=", this.b, ", redCardCounter=0)");
    }
}

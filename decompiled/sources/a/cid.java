package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cid implements vid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4407a;
    public final ms2 b;

    public cid(String str, ms2 ms2Var) {
        str.getClass();
        ms2Var.getClass();
        this.f4407a = str;
        this.b = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cid)) {
            return false;
        }
        cid cidVar = (cid) obj;
        return Intrinsics.d(this.f4407a, cidVar.f4407a) && Intrinsics.d(this.b, cidVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4407a.hashCode() * 31);
    }

    public final String toString() {
        return "Initialize(screen=" + this.f4407a + ", entryPointType=" + this.b + Separators.RPAREN;
    }
}

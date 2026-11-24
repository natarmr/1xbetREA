package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1959a;
    public final h4i b;

    public /* synthetic */ b4i(String str, int i) {
        this((i & 1) != 0 ? "" : str, f4i.f8914a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4i)) {
            return false;
        }
        b4i b4iVar = (b4i) obj;
        return Intrinsics.d(this.f1959a, b4iVar.f1959a) && Intrinsics.d(this.b, b4iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1959a.hashCode() * 31);
    }

    public final String toString() {
        return "DSSportEventCardTopInfoLabelModel(label=" + this.f1959a + ", eventTimerModel=" + this.b + Separators.RPAREN;
    }

    public b4i(String str, h4i h4iVar) {
        str.getClass();
        this.f1959a = str;
        this.b = h4iVar;
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26597a;
    public final boolean b;

    public p9b(String str, boolean z) {
        str.getClass();
        this.f26597a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9b)) {
            return false;
        }
        p9b p9bVar = (p9b) obj;
        return Intrinsics.d(this.f26597a, p9bVar.f26597a) && this.b == p9bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f26597a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("CellIUiModel(text=", this.f26597a, ", bonus=", this.b, Separators.RPAREN);
    }
}

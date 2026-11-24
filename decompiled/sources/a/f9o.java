package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f9o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9163a;
    public final String b;
    public final int c;

    public f9o(int i, String str, String str2) {
        str.getClass();
        this.f9163a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9o)) {
            return false;
        }
        f9o f9oVar = (f9o) obj;
        return Intrinsics.d(this.f9163a, f9oVar.f9163a) && this.b.equals(f9oVar.b) && this.c == f9oVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f9163a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("EsportsWorldCupToolbarUiModel(title=", this.f9163a, ", backgroundImage=", this.b, ", backgroundPlaceholder="));
    }
}

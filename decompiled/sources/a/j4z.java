package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j4z implements l4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4z f15908a;
    public final are b;

    public j4z(h4z h4zVar, are areVar) {
        h4zVar.getClass();
        this.f15908a = h4zVar;
        this.b = areVar;
    }

    @Override // a.l4z
    public final h4z a() {
        return this.f15908a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4z)) {
            return false;
        }
        j4z j4zVar = (j4z) obj;
        return Intrinsics.d(this.f15908a, j4zVar.f15908a) && this.b.equals(j4zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15908a.hashCode() * 31);
    }

    public final String toString() {
        return "Live(commonInfo=" + this.f15908a + ", countryModel=" + this.b + Separators.RPAREN;
    }
}

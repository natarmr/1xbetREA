package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class k7r {
    public static final j7r Companion = new j7r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17838a;
    public final n7r b;

    public /* synthetic */ k7r(int i, String str, n7r n7rVar) {
        if ((i & 1) == 0) {
            this.f17838a = null;
        } else {
            this.f17838a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = n7rVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7r)) {
            return false;
        }
        k7r k7rVar = (k7r) obj;
        return Intrinsics.d(this.f17838a, k7rVar.f17838a) && Intrinsics.d(this.b, k7rVar.b);
    }

    public final int hashCode() {
        String str = this.f17838a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        n7r n7rVar = this.b;
        return iHashCode + (n7rVar != null ? n7rVar.hashCode() : 0);
    }

    public final String toString() {
        return "Detail(lng=" + this.f17838a + ", params=" + this.b + Separators.RPAREN;
    }

    public k7r(String str, n7r n7rVar) {
        this.f17838a = str;
        this.b = n7rVar;
    }
}

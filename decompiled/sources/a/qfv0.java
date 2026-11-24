package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qfv0 implements yfv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9n f28657a;
    public final String b;

    public qfv0(m9n m9nVar, String str) {
        this.f28657a = m9nVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfv0)) {
            return false;
        }
        qfv0 qfv0Var = (qfv0) obj;
        return this.f28657a.equals(qfv0Var.f28657a) && Intrinsics.d(this.b, qfv0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f28657a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OnItemClick(item=" + this.f28657a + ", loadedImageUrl=" + this.b + Separators.RPAREN;
    }
}

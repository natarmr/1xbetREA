package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o530 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24669a;
    public final List b;

    public o530(List list, boolean z) {
        list.getClass();
        this.f24669a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o530)) {
            return false;
        }
        o530 o530Var = (o530) obj;
        return this.f24669a == o530Var.f24669a && Intrinsics.d(this.b, o530Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f24669a) * 31);
    }

    public final String toString() {
        return "MarketsModel(defaultValue=" + this.f24669a + ", markets=" + this.b + Separators.RPAREN;
    }
}

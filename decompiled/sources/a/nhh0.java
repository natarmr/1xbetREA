package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nhh0 implements thh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23533a;
    public final String b;

    public nhh0(List list, String str) {
        list.getClass();
        str.getClass();
        this.f23533a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhh0)) {
            return false;
        }
        nhh0 nhh0Var = (nhh0) obj;
        return Intrinsics.d(this.f23533a, nhh0Var.f23533a) && Intrinsics.d(this.b, nhh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23533a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(items=" + this.f23533a + ", query=" + this.b + Separators.RPAREN;
    }
}

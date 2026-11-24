package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zl80 implements cm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44568a;
    public final boolean b;

    public zl80(List list, boolean z) {
        list.getClass();
        this.f44568a = list;
        this.b = z;
    }

    @Override // a.cm80
    public final List a() {
        return this.f44568a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl80)) {
            return false;
        }
        zl80 zl80Var = (zl80) obj;
        return Intrinsics.d(this.f44568a, zl80Var.f44568a) && this.b == zl80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f44568a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(pagingItems=" + this.f44568a + ", isInitial=" + this.b + Separators.RPAREN;
    }
}

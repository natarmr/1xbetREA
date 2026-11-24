package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zli0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44583a;
    public final boolean b;

    public zli0(List list, boolean z) {
        list.getClass();
        this.f44583a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zli0)) {
            return false;
        }
        zli0 zli0Var = (zli0) obj;
        return Intrinsics.d(this.f44583a, zli0Var.f44583a) && this.b == zli0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f44583a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentState(content=" + this.f44583a + ", saveBtnEnabled=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g9k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10917a;
    public final boolean b;

    public g9k(List list, boolean z) {
        list.getClass();
        this.f10917a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9k)) {
            return false;
        }
        g9k g9kVar = (g9k) obj;
        return Intrinsics.d(this.f10917a, g9kVar.f10917a) && this.b == g9kVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f10917a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentState(content=" + this.f10917a + ", saveBtnEnabled=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3q f3599a;
    public final List b;

    public c1z(n3q n3qVar, List list) {
        list.getClass();
        this.f3599a = n3qVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1z)) {
            return false;
        }
        c1z c1zVar = (c1z) obj;
        return this.f3599a == c1zVar.f3599a && Intrinsics.d(this.b, c1zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3599a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFilterBottomSheet(selectedFilterModel=" + this.f3599a + ", filterModelList=" + this.b + Separators.RPAREN;
    }
}

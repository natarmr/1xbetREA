package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l190 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19239a;
    public final boolean b;

    public l190(List list, boolean z) {
        list.getClass();
        this.f19239a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l190)) {
            return false;
        }
        l190 l190Var = (l190) obj;
        return Intrinsics.d(this.f19239a, l190Var.f19239a) && this.b == l190Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f19239a.hashCode() * 31);
    }

    public final String toString() {
        return "RestoreDataState(restoreTypeData=" + this.f19239a + ", enableSegments=" + this.b + Separators.RPAREN;
    }
}

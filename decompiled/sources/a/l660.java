package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l660 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlc f19491a;
    public final List b;

    public l660(qlc qlcVar, List list) {
        qlcVar.getClass();
        list.getClass();
        this.f19491a = qlcVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l660)) {
            return false;
        }
        l660 l660Var = (l660) obj;
        return Intrinsics.d(this.f19491a, l660Var.f19491a) && Intrinsics.d(this.b, l660Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19491a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f19491a + ", typeParametersCount=" + this.b + ')';
    }
}

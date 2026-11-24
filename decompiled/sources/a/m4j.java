package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m4j implements n4j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21173a;
    public final List b;
    public final List c;

    public m4j(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f21173a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4j)) {
            return false;
        }
        m4j m4jVar = (m4j) obj;
        return Intrinsics.d(this.f21173a, m4jVar.f21173a) && Intrinsics.d(this.b, m4jVar.b) && Intrinsics.d(this.c, m4jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f21173a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("Loaded(availableTasks=", ", activeTasks=", this.f21173a, ", historyTasks=", this.b), this.c, Separators.RPAREN);
    }
}

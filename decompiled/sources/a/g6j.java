package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g6j implements i6j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10768a;
    public final m4j b;

    public g6j(List list, m4j m4jVar) {
        this.f10768a = list;
        this.b = m4jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6j)) {
            return false;
        }
        g6j g6jVar = (g6j) obj;
        return Intrinsics.d(this.f10768a, g6jVar.f10768a) && Intrinsics.d(this.b, g6jVar.b);
    }

    public final int hashCode() {
        List list = this.f10768a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        m4j m4jVar = this.b;
        return iHashCode + (m4jVar != null ? m4jVar.hashCode() : 0);
    }

    public final String toString() {
        return "Loaded(history=" + this.f10768a + ", tasksState=" + this.b + Separators.RPAREN;
    }
}

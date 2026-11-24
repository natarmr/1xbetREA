package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17659a;
    public final List b;

    public k4b(String str, List list) {
        list.getClass();
        this.f17659a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4b)) {
            return false;
        }
        k4b k4bVar = (k4b) obj;
        return this.f17659a.equals(k4bVar.f17659a) && Intrinsics.d(this.b, k4bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17659a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CategoryGroupSectionUiModel(marketGroupName=", this.f17659a, ", rows=", this.b, Separators.RPAREN);
    }
}

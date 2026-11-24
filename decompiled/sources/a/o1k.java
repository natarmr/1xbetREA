package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class o1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryTypeModel f24483a;
    public final List b;

    public o1k(HistoryTypeModel historyTypeModel, List list) {
        list.getClass();
        this.f24483a = historyTypeModel;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1k)) {
            return false;
        }
        o1k o1kVar = (o1k) obj;
        return this.f24483a == o1kVar.f24483a && Intrinsics.d(this.b, o1kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24483a.hashCode() * 31);
    }

    public final String toString() {
        return "OnStatusFilterApply(historyTypeModel=" + this.f24483a + ", filterList=" + this.b + Separators.RPAREN;
    }
}

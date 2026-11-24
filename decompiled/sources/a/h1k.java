package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class h1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5w f12287a;
    public final HistoryTypeModel b;
    public final List c;

    public h1k(a5w a5wVar, HistoryTypeModel historyTypeModel, List list) {
        list.getClass();
        this.f12287a = a5wVar;
        this.b = historyTypeModel;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1k)) {
            return false;
        }
        h1k h1kVar = (h1k) obj;
        return this.f12287a.equals(h1kVar.f12287a) && this.b == h1kVar.b && Intrinsics.d(this.c, h1kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f12287a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnItemClicked(historyModel=");
        sb.append(this.f12287a);
        sb.append(", historyTypeModel=");
        sb.append(this.b);
        sb.append(", eventGroupModelList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}

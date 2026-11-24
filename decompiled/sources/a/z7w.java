package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class z7w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43940a;
    public final String b;
    public final f8w c;
    public final HistoryTypeModel d;
    public final boolean e;

    public z7w(List list, String str, f8w f8wVar, HistoryTypeModel historyTypeModel, boolean z) {
        list.getClass();
        this.f43940a = list;
        this.b = str;
        this.c = f8wVar;
        this.d = historyTypeModel;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7w)) {
            return false;
        }
        z7w z7wVar = (z7w) obj;
        return Intrinsics.d(this.f43940a, z7wVar.f43940a) && this.b.equals(z7wVar.b) && this.c == z7wVar.c && this.d == z7wVar.d && this.e == z7wVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f43940a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("HistoryTypeBottomSheetDialogStateModel(historyTypeModelList=", ", totoName=", this.b, this.f43940a, ", historyTypeScreen=");
        sbO.append(this.c);
        sbO.append(", historyTypeModel=");
        sbO.append(this.d);
        sbO.append(", hasHideHistory=");
        return rw2.p(sbO, this.e, Separators.RPAREN);
    }
}

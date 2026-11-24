package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes4.dex */
public final class e8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7393a;
    public final String b;
    public final boolean c;
    public final HistoryTypeModel d;

    public e8w(int i, String str, boolean z, HistoryTypeModel historyTypeModel) {
        str.getClass();
        this.f7393a = i;
        this.b = str;
        this.c = z;
        this.d = historyTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8w)) {
            return false;
        }
        e8w e8wVar = (e8w) obj;
        return this.f7393a == e8wVar.f7393a && Intrinsics.d(this.b, e8wVar.b) && this.c == e8wVar.c && this.d == e8wVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(Integer.hashCode(this.f7393a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f7393a, "HistoryTypeItem(iconRes=", ", title=", this.b, ", isActive=");
        sbR.append(this.c);
        sbR.append(", historyTypeModel=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}

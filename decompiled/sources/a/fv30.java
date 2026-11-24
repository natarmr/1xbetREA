package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class fv30 implements lv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5w f10196a;
    public final ql5 b;
    public final HistoryTypeModel c;

    public fv30(a5w a5wVar, ql5 ql5Var, HistoryTypeModel historyTypeModel) {
        a5wVar.getClass();
        ql5Var.getClass();
        historyTypeModel.getClass();
        this.f10196a = a5wVar;
        this.b = ql5Var;
        this.c = historyTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv30)) {
            return false;
        }
        fv30 fv30Var = (fv30) obj;
        return Intrinsics.d(this.f10196a, fv30Var.f10196a) && Intrinsics.d(this.b, fv30Var.b) && this.c == fv30Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f10196a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InitializeMenuAction(historyModel=" + this.f10196a + ", balanceModel=" + this.b + ", historyTypeModel=" + this.c + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class o67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f24719a;
    public final f8w b;
    public final HistoryTypeModel c;

    public o67(ql5 ql5Var, f8w f8wVar, HistoryTypeModel historyTypeModel) {
        ql5Var.getClass();
        this.f24719a = ql5Var;
        this.b = f8wVar;
        this.c = historyTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o67)) {
            return false;
        }
        o67 o67Var = (o67) obj;
        return Intrinsics.d(this.f24719a, o67Var.f24719a) && this.b == o67Var.b && this.c == o67Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f24719a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowChangeHistoryType(balanceModel=" + this.f24719a + ", historyTypeScreen=" + this.b + ", historyTypeModel=" + this.c + Separators.RPAREN;
    }
}

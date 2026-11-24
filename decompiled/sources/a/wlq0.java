package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.bet_history.TimeTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class wlq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39369a;
    public final TimeTypeModel b;

    public wlq0(int i, TimeTypeModel timeTypeModel) {
        this.f39369a = i;
        this.b = timeTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlq0)) {
            return false;
        }
        wlq0 wlq0Var = (wlq0) obj;
        return this.f39369a == wlq0Var.f39369a && this.b == wlq0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f39369a) * 31);
    }

    public final String toString() {
        return "TimeUiModel(title=" + this.f39369a + ", timeTypeModel=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xvi0 implements ew20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw20 f41561a;

    public xvi0(cw20 cw20Var) {
        this.f41561a = cw20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvi0) && this.f41561a == ((xvi0) obj).f41561a;
    }

    public final int hashCode() {
        return this.f41561a.hashCode();
    }

    public final String toString() {
        return "SettingGroupHeaderUiModel(marketSettingType=" + this.f41561a + Separators.RPAREN;
    }
}

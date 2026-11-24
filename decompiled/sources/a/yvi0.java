package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yvi0 implements fw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw20 f43321a;

    public yvi0(dw20 dw20Var) {
        this.f43321a = dw20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvi0) && this.f43321a == ((yvi0) obj).f43321a;
    }

    public final int hashCode() {
        return this.f43321a.hashCode();
    }

    public final String toString() {
        return "SettingGroupHeaderUiModel(marketSettingType=" + this.f43321a + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e84 implements f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rqm f7355a;

    public e84(rqm rqmVar) {
        this.f7355a = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e84) && this.f7355a.equals(((e84) obj).f7355a);
    }

    public final int hashCode() {
        return this.f7355a.hashCode();
    }

    public final String toString() {
        return "AuthHistoryQuitAllSessionsUiModel(settingCellStyle=" + this.f7355a + Separators.RPAREN;
    }
}

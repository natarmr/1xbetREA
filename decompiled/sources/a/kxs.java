package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kxs implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19072a = "game_video_stream";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxs) && this.f19072a.equals(((kxs) obj).f19072a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f19072a;
    }

    public final int hashCode() {
        return this.f19072a.hashCode();
    }

    public final String toString() {
        return kng0.l("GameVideoUiModel(key=", this.f19072a, Separators.RPAREN);
    }
}

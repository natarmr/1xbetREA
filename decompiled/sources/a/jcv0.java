package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jcv0 implements mcv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fyl f16298a;

    public jcv0(fyl fylVar) {
        this.f16298a = fylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcv0) && this.f16298a.equals(((jcv0) obj).f16298a);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return jcv0.class;
    }

    public final int hashCode() {
        return this.f16298a.hashCode();
    }

    public final String toString() {
        return "WhoWinChipsUiModel(chips=" + this.f16298a + Separators.RPAREN;
    }
}

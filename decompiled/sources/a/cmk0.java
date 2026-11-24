package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cmk0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wam f4609a;

    public cmk0(wam wamVar) {
        this.f4609a = wamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmk0) && this.f4609a.equals(((cmk0) obj).f4609a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "SOULCALIBUR_KEY";
    }

    public final int hashCode() {
        return this.f4609a.hashCode() + 859177039;
    }

    public final String toString() {
        return "SoulcaliburUiModel(key=SOULCALIBUR_KEY, resultTable=" + this.f4609a + Separators.RPAREN;
    }
}

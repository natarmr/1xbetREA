package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a9t0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fyl f494a;

    public a9t0(fyl fylVar) {
        this.f494a = fylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9t0) && this.f494a.equals(((a9t0) obj).f494a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CHIPS_GROUP_STAGE";
    }

    public final int hashCode() {
        return this.f494a.hashCode() + 1639798394;
    }

    public final String toString() {
        return "UniversalChampChipsUiModel(key=CHIPS_GROUP_STAGE, chip=" + this.f494a + Separators.RPAREN;
    }
}

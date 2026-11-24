package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qih implements sih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28792a;

    public qih(int i) {
        this.f28792a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qih) && this.f28792a == ((qih) obj).f28792a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28792a);
    }

    public final String toString() {
        return ua80.e(this.f28792a, "OnStageChipClick(stageId=", Separators.RPAREN);
    }
}

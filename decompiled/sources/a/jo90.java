package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jo90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq90 f16847a;

    public jo90(jq90 jq90Var) {
        this.f16847a = jq90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo90) && this.f16847a.equals(((jo90) obj).f16847a);
    }

    public final int hashCode() {
        return this.f16847a.hashCode();
    }

    public final String toString() {
        return "ChosenPickerModel(model=" + this.f16847a + Separators.RPAREN;
    }
}

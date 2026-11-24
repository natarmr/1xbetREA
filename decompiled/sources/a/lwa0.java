package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lwa0 implements owa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kvl f20757a;

    public lwa0(kvl kvlVar) {
        this.f20757a = kvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwa0) && this.f20757a.equals(((lwa0) obj).f20757a);
    }

    public final int hashCode() {
        return this.f20757a.hashCode();
    }

    public final String toString() {
        return "SettingCell(dsCellPresetModel=" + this.f20757a + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32103a;

    public sf60(String str) {
        this.f32103a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf60) && this.f32103a.equals(((sf60) obj).f32103a);
    }

    public final int hashCode() {
        return this.f32103a.hashCode();
    }

    public final String toString() {
        return kng0.l("OldAndroidTipModel(imagePath=", this.f32103a, Separators.RPAREN);
    }
}

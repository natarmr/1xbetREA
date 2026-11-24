package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wkv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rkv f39326a;
    public final boolean b;

    public wkv(rkv rkvVar, boolean z) {
        rkvVar.getClass();
        this.f39326a = rkvVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkv)) {
            return false;
        }
        wkv wkvVar = (wkv) obj;
        return this.f39326a == wkvVar.f39326a && this.b == wkvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f39326a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsHandShakeSettingsUiModel(selectedScreen=" + this.f39326a + ", handShakeEnabled=" + this.b + Separators.RPAREN;
    }
}

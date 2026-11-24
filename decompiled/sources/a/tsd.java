package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tsd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34456a;
    public final rqm b;

    public tsd(String str, rqm rqmVar) {
        this.f34456a = str;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsd)) {
            return false;
        }
        tsd tsdVar = (tsd) obj;
        return this.f34456a.equals(tsdVar.f34456a) && this.b.equals(tsdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34456a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigValueUiModel(keyName=" + this.f34456a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}

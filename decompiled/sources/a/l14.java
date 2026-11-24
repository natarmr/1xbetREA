package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class l14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f19230a;
    public final ArrayList b;

    public l14(Date date, ArrayList arrayList) {
        this.f19230a = date;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l14)) {
            return false;
        }
        l14 l14Var = (l14) obj;
        return this.f19230a.equals(l14Var.f19230a) && this.b.equals(l14Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19230a.hashCode() * 31);
    }

    public final String toString() {
        return "AttachedFileSettingsModel(expiresAt=" + this.f19230a + ", uploadMediaRestrictionModelList=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class drk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk f6563a;
    public final btk b;

    public drk(btk btkVar, btk btkVar2) {
        this.f6563a = btkVar;
        this.b = btkVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drk)) {
            return false;
        }
        drk drkVar = (drk) obj;
        return this.f6563a.equals(drkVar.f6563a) && this.b.equals(drkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6563a.hashCode() * 31);
    }

    public final String toString() {
        return "DisciplineDetailsHeaderFocusAllEventsMapModel(liveEvents=" + this.f6563a + ", lineEvents=" + this.b + Separators.RPAREN;
    }
}

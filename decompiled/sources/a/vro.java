package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tro f37909a;
    public final tro b;

    public vro(tro troVar, tro troVar2) {
        this.f37909a = troVar;
        this.b = troVar2;
    }

    public static vro a(vro vroVar, tro troVar, tro troVar2, int i) {
        if ((i & 1) != 0) {
            troVar = vroVar.f37909a;
        }
        if ((i & 2) != 0) {
            troVar2 = vroVar.b;
        }
        vroVar.getClass();
        return new vro(troVar, troVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vro)) {
            return false;
        }
        vro vroVar = (vro) obj;
        return this.f37909a.equals(vroVar.f37909a) && this.b.equals(vroVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37909a.hashCode() * 31);
    }

    public final String toString() {
        return "ExpressItemListState(live=" + this.f37909a + ", line=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class nsp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jup f24060a;
    public final ArrayList b;

    public nsp(jup jupVar, ArrayList arrayList) {
        this.f24060a = jupVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsp)) {
            return false;
        }
        nsp nspVar = (nsp) obj;
        return this.f24060a.equals(nspVar.f24060a) && this.b.equals(nspVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24060a.hashCode() * 31);
    }

    public final String toString() {
        return "FightCornerStatisticModel(wholeFight=" + this.f24060a + ", rounds=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class w3b implements y3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38493a;
    public final m0x b;

    public w3b(ArrayList arrayList, m0x m0xVar) {
        this.f38493a = arrayList;
        this.b = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3b)) {
            return false;
        }
        w3b w3bVar = (w3b) obj;
        return this.f38493a.equals(w3bVar.f38493a) && this.b.equals(w3bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38493a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultItems(items=" + this.f38493a + ", placeholder=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l0p implements Map.Entry, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final blz f19212a;
    public final flz b;
    public l0p c;
    public l0p d;
    public boolean e;

    public l0p(blz blzVar, flz flzVar) {
        this.f19212a = blzVar;
        this.b = flzVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0p) {
            l0p l0pVar = (l0p) obj;
            return this.f19212a.equals(l0pVar.f19212a) && this.b == l0pVar.b;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19212a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() + (this.f19212a.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.f19212a + ", value=" + this.b + Separators.RPAREN;
    }
}

package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4m f33327a;
    public final s4m b;
    public final s4m c;

    public t4m(w4m w4mVar, s4m s4mVar, s4m s4mVar2) {
        this.f33327a = w4mVar;
        this.b = s4mVar;
        this.c = s4mVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4m)) {
            return false;
        }
        t4m t4mVar = (t4m) obj;
        return this.f33327a.equals(t4mVar.f33327a) && this.b.equals(t4mVar.b) && this.c.equals(t4mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f33327a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DsCyberGameChartUiModel(value=" + this.f33327a + ", topTeam=" + this.b + ", bottomTeam=" + this.c + Separators.RPAREN;
    }
}

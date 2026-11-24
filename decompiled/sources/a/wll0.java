package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wll0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lla f39360a;
    public final vvs b;
    public final i9h0 c;
    public final v12 d;
    public final String e;

    public wll0(lla llaVar, vvs vvsVar, i9h0 i9h0Var, v12 v12Var) {
        this.f39360a = llaVar;
        this.b = vvsVar;
        this.c = i9h0Var;
        this.d = v12Var;
        this.e = kng0.k(llaVar.getKey(), vvsVar.name());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wll0)) {
            return false;
        }
        wll0 wll0Var = (wll0) obj;
        return this.f39360a.equals(wll0Var.f39360a) && this.b == wll0Var.b && this.c == wll0Var.c && this.d == wll0Var.d;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f39360a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SportResultHistoryEventCardUiModel(cardResultHistory=" + this.f39360a + ", gameType=" + this.b + ", screenStyle=" + this.c + ", alignmentInSection=" + this.d + Separators.RPAREN;
    }
}

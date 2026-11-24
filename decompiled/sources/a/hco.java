package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hco implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12832a;
    public final sip b;
    public final b8m c;
    public final htk d;
    public final vb90 e;
    public final m3g f;

    public hco(String str, sip sipVar, b8m b8mVar, htk htkVar, vb90 vb90Var, m3g m3gVar) {
        this.f12832a = str;
        this.b = sipVar;
        this.c = b8mVar;
        this.d = htkVar;
        this.e = vb90Var;
        this.f = m3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hco)) {
            return false;
        }
        hco hcoVar = (hco) obj;
        return this.f12832a.equals(hcoVar.f12832a) && this.b == hcoVar.b && this.c.equals(hcoVar.c) && this.d.equals(hcoVar.d) && this.e.equals(hcoVar.e) && this.f.equals(hcoVar.f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f12832a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f12832a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EventFocusTopEventsUiModel(key=" + this.f12832a + ", feedKind=" + this.b + ", header=" + this.c + ", disciplineFilter=" + this.d + ", gameCardUiModel=" + this.e + ", cyberButtonBlockState=" + this.f + Separators.RPAREN;
    }
}

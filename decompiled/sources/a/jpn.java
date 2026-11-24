package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jpn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f16910a;
    public final uon b;
    public final boolean c;

    public jpn(imm immVar, uon uonVar, boolean z) {
        this.f16910a = immVar;
        this.b = uonVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpn)) {
            return false;
        }
        jpn jpnVar = (jpn) obj;
        return this.f16910a.equals(jpnVar.f16910a) && this.b.equals(jpnVar.b) && this.c == jpnVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f16910a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditEventUiState(navigationBarUiModel=");
        sb.append(this.f16910a);
        sb.append(", editEventDataUiState=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}

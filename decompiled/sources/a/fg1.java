package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fg1 implements gg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ypl f9469a;
    public final bql b;

    public fg1(ypl yplVar, bql bqlVar) {
        this.f9469a = yplVar;
        this.b = bqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg1)) {
            return false;
        }
        fg1 fg1Var = (fg1) obj;
        return this.f9469a == fg1Var.f9469a && this.b.equals(fg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9469a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentContent(style=" + this.f9469a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}

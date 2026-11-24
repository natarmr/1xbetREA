package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q5s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28168a;
    public final l5i b;
    public final trl c;

    public q5s0(String str, l5i l5iVar, trl trlVar) {
        str.getClass();
        this.f28168a = str;
        this.b = l5iVar;
        this.c = trlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5s0)) {
            return false;
        }
        q5s0 q5s0Var = (q5s0) obj;
        return Intrinsics.d(this.f28168a, q5s0Var.f28168a) && this.b == q5s0Var.b && this.c.equals(q5s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f28168a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TournamentStageItemUiModel(key=" + this.f28168a + ", style=" + this.b + ", uiModel=" + this.c + Separators.RPAREN;
    }
}

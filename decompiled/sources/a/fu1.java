package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final du1 f10141a;
    public final String b;
    public final String c;
    public final a4x d;
    public final ru1 e;
    public final a4x f;

    public fu1(du1 du1Var, String str, String str2, a4x a4xVar, ru1 ru1Var, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f10141a = du1Var;
        this.b = str;
        this.c = str2;
        this.d = a4xVar;
        this.e = ru1Var;
        this.f = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu1)) {
            return false;
        }
        fu1 fu1Var = (fu1) obj;
        return this.f10141a == fu1Var.f10141a && this.b.equals(fu1Var.b) && this.c.equals(fu1Var.c) && Intrinsics.d(this.d, fu1Var.d) && this.e.equals(fu1Var.e) && Intrinsics.d(this.f, fu1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + cs0.b(this.d, ua80.b(ua80.b(this.f10141a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorTournamentFullInfoHeaderUiModel(style=");
        sb.append(this.f10141a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        cs0.B(sb, this.c, ", tags=", this.d, ", segmentControlUiState=");
        sb.append(this.e);
        sb.append(", tabs=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

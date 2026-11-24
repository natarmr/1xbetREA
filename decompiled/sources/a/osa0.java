package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class osa0 extends qsa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f25774a;
    public final ltr b;
    public final String c;
    public final a4x d;
    public final bms e;
    public final a4x f;

    public osa0(imm immVar, ltr ltrVar, String str, a4x a4xVar, bms bmsVar, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f25774a = immVar;
        this.b = ltrVar;
        this.c = str;
        this.d = a4xVar;
        this.e = bmsVar;
        this.f = a4xVar2;
    }

    @Override // a.qsa0
    public final ltr a() {
        return this.b;
    }

    @Override // a.qsa0
    public final String b() {
        return this.c;
    }

    @Override // a.qsa0
    public final imm c() {
        return this.f25774a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osa0)) {
            return false;
        }
        osa0 osa0Var = (osa0) obj;
        return this.f25774a.equals(osa0Var.f25774a) && this.b.equals(osa0Var.b) && this.c.equals(osa0Var.c) && Intrinsics.d(this.d, osa0Var.d) && Intrinsics.d(this.e, osa0Var.e) && Intrinsics.d(this.f, osa0Var.f);
    }

    public final int hashCode() {
        int iB = cs0.b(this.d, ua80.b((this.b.hashCode() + (this.f25774a.hashCode() * 31)) * 31, 31, this.c), 31);
        bms bmsVar = this.e;
        return this.f.hashCode() + ((iB + (bmsVar == null ? 0 : bmsVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(navigationBarUiModel=");
        sb.append(this.f25774a);
        sb.append(", gameCardEvent=");
        sb.append(this.b);
        sb.append(", headerBackgroundImageUrl=");
        cs0.B(sb, this.c, ", markets=", this.d, ", gameMarketInfo=");
        sb.append(this.e);
        sb.append(", lineGames=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

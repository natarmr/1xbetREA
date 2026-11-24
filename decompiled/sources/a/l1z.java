package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l1z implements m1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0z f19283a;
    public final f9m0 b;
    public final boolean c;
    public final n3q d;
    public final int e;
    public final a4x f;
    public final a4x g;
    public final a4x h;
    public final csv i;
    public final mdm j;

    public l1z(t0z t0zVar, f9m0 f9m0Var, boolean z, n3q n3qVar, int i, i4 i4Var, a4x a4xVar, a4x a4xVar2, csv csvVar, mdm mdmVar) {
        i4Var.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f19283a = t0zVar;
        this.b = f9m0Var;
        this.c = z;
        this.d = n3qVar;
        this.e = i;
        this.f = i4Var;
        this.g = a4xVar;
        this.h = a4xVar2;
        this.i = csvVar;
        this.j = mdmVar;
    }

    @Override // a.m1z
    public final boolean a() {
        return this.c;
    }

    @Override // a.m1z
    public final t0z b() {
        return this.f19283a;
    }

    @Override // a.m1z
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1z)) {
            return false;
        }
        l1z l1zVar = (l1z) obj;
        return this.f19283a.equals(l1zVar.f19283a) && this.b.equals(l1zVar.b) && this.c == l1zVar.c && this.d == l1zVar.d && this.e == l1zVar.e && Intrinsics.d(this.f, l1zVar.f) && Intrinsics.d(this.g, l1zVar.g) && Intrinsics.d(this.h, l1zVar.h) && this.i.equals(l1zVar.i) && this.j.equals(l1zVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + cs0.b(this.h, cs0.b(this.g, cs0.b(this.f, twn.a(this.e, (this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f19283a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(headerUiState=");
        sb.append(this.f19283a);
        sb.append(", appBarUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        sb.append(this.c);
        sb.append(", filterType=");
        sb.append(this.d);
        sb.append(", selectedTab=");
        sb.append(this.e);
        sb.append(", tabs=");
        sb.append(this.f);
        sb.append(", firstTeamEventList=");
        hne.y(sb, this.g, ", secondTeamEventList=", this.h, ", headerSummaryUiModel=");
        sb.append(this.i);
        sb.append(", emptyLottieConfig=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

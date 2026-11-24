package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class paq implements saq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f26666a;
    public final se b;
    public final h9q c;
    public final i9q d;
    public final a4x e;
    public final a4x f;
    public final boolean g;

    public paq(imm immVar, se seVar, h9q h9qVar, i9q i9qVar, a4x a4xVar, a4x a4xVar2, boolean z) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f26666a = immVar;
        this.b = seVar;
        this.c = h9qVar;
        this.d = i9qVar;
        this.e = a4xVar;
        this.f = a4xVar2;
        this.g = z;
    }

    @Override // a.saq
    public final imm a() {
        return this.f26666a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paq)) {
            return false;
        }
        paq paqVar = (paq) obj;
        return this.f26666a.equals(paqVar.f26666a) && Intrinsics.d(this.b, paqVar.b) && this.c.equals(paqVar.c) && this.d.equals(paqVar.d) && Intrinsics.d(this.e, paqVar.e) && Intrinsics.d(this.f, paqVar.f) && this.g == paqVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.f26666a.hashCode() * 31;
        se seVar = this.b;
        return Boolean.hashCode(this.g) + cs0.b(this.f, cs0.b(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (seVar == null ? 0 : seVar.hashCode())) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(dsNavigationBarUiModel=");
        sb.append(this.f26666a);
        sb.append(", accountInfoUiModel=");
        sb.append(this.b);
        sb.append(", finBetsBoardUIModel=");
        sb.append(this.c);
        sb.append(", finBetsChartUpdateUIModel=");
        sb.append(this.d);
        sb.append(", higherEvents=");
        hne.y(sb, this.e, ", lowerEvents=", this.f, ", waitBetLoader=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}

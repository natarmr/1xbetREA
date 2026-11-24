package a;

import android.gov.nist.core.Separators;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class kzz {
    public static final kzz i = new kzz(LimitTypeEnum.EMPTY, 0.0d, 0, false, 0, 0, 0, prz.INACTIVE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitTypeEnum f19172a;
    public final double b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final long g;
    public final prz h;

    public kzz(LimitTypeEnum limitTypeEnum, double d, int i2, boolean z, int i3, int i4, long j, prz przVar) {
        this.f19172a = limitTypeEnum;
        this.b = d;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = j;
        this.h = przVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzz)) {
            return false;
        }
        kzz kzzVar = (kzz) obj;
        return this.f19172a == kzzVar.f19172a && Double.compare(this.b, kzzVar.b) == 0 && this.c == kzzVar.c && this.d == kzzVar.d && this.e == kzzVar.e && this.f == kzzVar.f && this.g == kzzVar.g && this.h == kzzVar.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + rw2.b(twn.a(this.f, twn.a(this.e, brm0.e(twn.a(this.c, brm0.d(this.b, this.f19172a.hashCode() * 31, 31), 31), 31, this.d), 31), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsModel(limitType=");
        sb.append(this.f19172a);
        sb.append(", limitBalance=");
        sb.append(this.b);
        dw9.v(this.c, ", createdAt=", ", needApprove=", sb, this.d);
        rw2.s(this.e, this.f, ", startedAt=", ", endsAt=", sb);
        kng0.A(sb, ", limitValue=", this.g, ", limitState=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class x5b implements y2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40306a;
    public final long b;
    public final String c;
    public final y9q0 d;
    public final tv20 e;
    public final String f;

    public x5b(long j, long j2, String str, y9q0 y9q0Var, tv20 tv20Var) {
        this.f40306a = j;
        this.b = j2;
        this.c = str;
        this.d = y9q0Var;
        this.e = tv20Var;
        StringBuilder sbQ = kng0.q(j2, "groupHeader_", BundleUtil.UNDERLINE_TAG);
        sbQ.append(j);
        this.f = sbQ.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5b)) {
            return false;
        }
        x5b x5bVar = (x5b) obj;
        return this.f40306a == x5bVar.f40306a && this.b == x5bVar.b && this.c.equals(x5bVar.c) && this.d.equals(x5bVar.d) && this.e.equals(x5bVar.e);
    }

    @Override // a.y2b
    public final String getKey() {
        return this.f;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.g(this.d, ua80.b(rw2.b(Long.hashCode(this.f40306a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f40306a, "CategoryMarketGroupHeaderUiModel(marketGroupId=", ", subGameId=");
        kng0.z(sbQ, this.b, ", title=", this.c);
        sbQ.append(", textStyle=");
        sbQ.append(this.d);
        sbQ.append(", signIcon=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}

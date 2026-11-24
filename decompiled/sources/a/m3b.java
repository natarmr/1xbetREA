package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class m3b implements y2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4n f21106a;
    public final long b;
    public final String c;
    public final long d;
    public final int e;
    public final String f;

    public m3b(d4n d4nVar, long j, String str, long j2, int i) {
        this.f21106a = d4nVar;
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = i;
        StringBuilder sbQ = kng0.q(j, "row_", BundleUtil.UNDERLINE_TAG);
        sbQ.append(j2);
        sbQ.append(BundleUtil.UNDERLINE_TAG);
        sbQ.append(i);
        this.f = sbQ.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3b)) {
            return false;
        }
        m3b m3bVar = (m3b) obj;
        return this.f21106a.equals(m3bVar.f21106a) && this.b == m3bVar.b && this.c.equals(m3bVar.c) && this.d == m3bVar.d && this.e == m3bVar.e;
    }

    @Override // a.y2b
    public final String getKey() {
        return this.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + rw2.b(ua80.b(rw2.b(this.f21106a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryBetsRowUiModel(row=");
        sb.append(this.f21106a);
        sb.append(", subGameId=");
        sb.append(this.b);
        hne.B(sb, ", subGameName=", this.c, ", marketGroupId=");
        ua80.v(sb, this.d, ", rowIndex=", this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}

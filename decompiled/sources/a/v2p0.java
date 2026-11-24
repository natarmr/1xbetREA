package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v2p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36698a;
    public final mim0 b;
    public final boolean c;

    public v2p0(String str, mim0 mim0Var, boolean z) {
        str.getClass();
        this.f36698a = str;
        this.b = mim0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2p0)) {
            return false;
        }
        v2p0 v2p0Var = (v2p0) obj;
        return Intrinsics.d(this.f36698a, v2p0Var.f36698a) && this.b.equals(v2p0Var.b) && this.c == v2p0Var.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b.getKey();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f36698a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamBetStatisticsMatchUiItem(statGameId=");
        sb.append(this.f36698a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}

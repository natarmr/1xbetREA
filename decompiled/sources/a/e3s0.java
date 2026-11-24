package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e3s0 implements f3s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krl f7153a;
    public final String b;

    public e3s0(krl krlVar, String str) {
        hrl hrlVar = hrl.f13536a;
        this.f7153a = krlVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3s0)) {
            return false;
        }
        e3s0 e3s0Var = (e3s0) obj;
        hrl hrlVar = hrl.f13536a;
        return this.f7153a.equals(e3s0Var.f7153a) && this.b.equals(e3s0Var.b);
    }

    @Override // a.f3s0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f7153a.hashCode() + (hrl.f13536a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        hrl hrlVar = hrl.f13536a;
        StringBuilder sb = new StringBuilder("Rules(style=");
        sb.append(hrlVar);
        sb.append(", rules=");
        sb.append(this.f7153a);
        sb.append(", key=");
        return axq.n(sb, this.b, Separators.RPAREN);
    }
}

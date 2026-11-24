package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qla0 implements rla0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xka0 f28924a;
    public final f9m0 b;
    public final boolean c;

    public qla0(xka0 xka0Var, f9m0 f9m0Var, boolean z) {
        this.f28924a = xka0Var;
        this.b = f9m0Var;
        this.c = z;
    }

    @Override // a.rla0
    public final boolean a() {
        return this.c;
    }

    @Override // a.rla0
    public final xka0 b() {
        return this.f28924a;
    }

    @Override // a.rla0
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qla0)) {
            return false;
        }
        qla0 qla0Var = (qla0) obj;
        return this.f28924a.equals(qla0Var.f28924a) && this.b.equals(qla0Var.b) && this.c == qla0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f28924a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(headerUiState=");
        sb.append(this.f28924a);
        sb.append(", statisticAppBarUiModel=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}

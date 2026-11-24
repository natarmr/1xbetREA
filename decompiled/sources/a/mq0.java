package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mq0 implements rq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo0 f22202a;
    public final t5d0 b;

    public mq0(zo0 zo0Var, t5d0 t5d0Var) {
        this.f22202a = zo0Var;
        this.b = t5d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq0)) {
            return false;
        }
        mq0 mq0Var = (mq0) obj;
        return this.f22202a.equals(mq0Var.f22202a) && this.b.equals(mq0Var.b);
    }

    @Override // a.rq0
    public final String getId() {
        return "PROVIDERS_CELLS_ID";
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f22202a.hashCode() + 1004567738) * 31);
    }

    public final String toString() {
        return "ProvidersCells(id=PROVIDERS_CELLS_ID, position=" + this.f22202a + ", providersCellsUiModel=" + this.b + Separators.RPAREN;
    }
}

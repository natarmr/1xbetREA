package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lt1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gx1 f20608a;
    public final asl b;

    public lt1(gx1 gx1Var, asl aslVar) {
        this.f20608a = gx1Var;
        this.b = aslVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt1)) {
            return false;
        }
        lt1 lt1Var = (lt1) obj;
        return this.f20608a == lt1Var.f20608a && this.b.equals(lt1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20608a.hashCode() * 31);
    }

    public final String toString() {
        return "TimerUiModel(style=" + this.f20608a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}

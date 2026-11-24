package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qr9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr9 f29198a;
    public final ur9 b;
    public final wui0 c;

    public qr9(rr9 rr9Var, ur9 ur9Var, wui0 wui0Var) {
        this.f29198a = rr9Var;
        this.b = ur9Var;
        this.c = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr9)) {
            return false;
        }
        qr9 qr9Var = (qr9) obj;
        return this.f29198a.equals(qr9Var.f29198a) && this.b.equals(qr9Var.b) && this.c == qr9Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f29198a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CallbackHistorySettingsCellStyle(leftStyle=" + this.f29198a + ", rightStyle=" + this.b + ", position=" + this.c + Separators.RPAREN;
    }
}

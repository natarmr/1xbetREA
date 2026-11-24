package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class exb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8569a;
    public final boolean b;
    public final boolean c;

    public exb(boolean z, boolean z2, boolean z3) {
        this.f8569a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exb)) {
            return false;
        }
        exb exbVar = (exb) obj;
        return this.f8569a == exbVar.f8569a && this.b == exbVar.b && this.c == exbVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f8569a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("ChatBlockUiModel(enableTypingMessage=", ", enableSendMessage=", ", enableAttachFiles=", this.f8569a, this.b), this.c, Separators.RPAREN);
    }
}

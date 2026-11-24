package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sos0 extends yos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oos0 f32560a;
    public final Exception b;

    public sos0(oos0 oos0Var, Exception exc) {
        this.f32560a = oos0Var;
        this.b = exc;
    }

    @Override // a.yos0
    public final qos0 a() {
        return this.f32560a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sos0)) {
            return false;
        }
        sos0 sos0Var = (sos0) obj;
        return this.f32560a.equals(sos0Var.f32560a) && this.b.equals(sos0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32560a.f25608a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorDownload(fileKey=" + this.f32560a + ", error=" + this.b + Separators.RPAREN;
    }
}

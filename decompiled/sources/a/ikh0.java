package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ikh0 implements okh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amh0 f14926a;

    public ikh0(amh0 amh0Var) {
        this.f14926a = amh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ikh0) && this.f14926a.equals(((ikh0) obj).f14926a);
    }

    public final int hashCode() {
        return this.f14926a.hashCode();
    }

    public final String toString() {
        return "OnKeyboardNextClick(secretQuestionItem=" + this.f14926a + Separators.RPAREN;
    }
}

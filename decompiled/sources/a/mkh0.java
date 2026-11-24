package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mkh0 implements okh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amh0 f21944a;

    public mkh0(amh0 amh0Var) {
        this.f21944a = amh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkh0) && this.f21944a.equals(((mkh0) obj).f21944a);
    }

    public final int hashCode() {
        return this.f21944a.hashCode();
    }

    public final String toString() {
        return "OnTextFieldFocused(secretQuestionItem=" + this.f21944a + Separators.RPAREN;
    }
}

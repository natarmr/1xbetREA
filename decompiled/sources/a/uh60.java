package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uh60 implements vh60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av9 f35662a;

    public uh60(av9 av9Var) {
        this.f35662a = av9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh60) && this.f35662a.equals(((uh60) obj).f35662a);
    }

    public final int hashCode() {
        return this.f35662a.hashCode();
    }

    public final String toString() {
        return "OnCallbackAction(action=" + this.f35662a + Separators.RPAREN;
    }
}

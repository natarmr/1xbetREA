package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qrs implements trs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa30 f29225a;

    public qrs(xa30 xa30Var) {
        this.f29225a = xa30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrs) && this.f29225a.equals(((qrs) obj).f29225a);
    }

    public final int hashCode() {
        return this.f29225a.hashCode();
    }

    public final String toString() {
        return "SendGameMatchInfoSideEffect(value=" + this.f29225a + Separators.RPAREN;
    }
}

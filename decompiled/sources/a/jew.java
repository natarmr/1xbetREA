package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jew implements kew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f16396a;
    public final m97 b;
    public final mq2 c;

    static {
        k97 k97Var = m97.Companion;
    }

    public jew(m0k0 m0k0Var, m97 m97Var, mq2 mq2Var) {
        this.f16396a = m0k0Var;
        this.b = m97Var;
        this.c = mq2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jew) {
            jew jewVar = (jew) obj;
            return this.f16396a.equals(jewVar.f16396a) && this.b.equals(jewVar.b) && this.c == jewVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16396a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SendMakeBetSideEffect(betGame=" + this.f16396a + ", betInfo=" + this.b + ", entryPoint=" + this.c + Separators.RPAREN;
    }
}

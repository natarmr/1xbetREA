package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wer f40756a;
    public final int b;

    public xer(wer werVar, int i) {
        this.f40756a = werVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xer)) {
            return false;
        }
        xer xerVar = (xer) obj;
        return this.f40756a.equals(xerVar.f40756a) && this.b == xerVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f40756a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.f40756a);
        sb.append(", arity=");
        return brm0.n(sb, this.b, ')');
    }
}

package a;

/* JADX INFO: loaded from: classes2.dex */
public final class v04 implements a5d0 {
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public v04(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return a5d0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5d0)) {
            return false;
        }
        a5d0 a5d0Var = (a5d0) obj;
        return this.b == a5d0Var.tag() && y4d0.f41998a.equals(a5d0Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (y4d0.f41998a.hashCode() ^ 2041407134);
    }

    @Override // a.a5d0
    public final y4d0 intEncoding() {
        return y4d0.f41998a;
    }

    @Override // a.a5d0
    public final int tag() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.b) + "intEncoding=" + y4d0.f41998a + ')';
    }
}

package a;

/* JADX INFO: loaded from: classes.dex */
public class an30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1132a;

    static {
        new an30(new mtc());
        vtt0.H(0);
        vtt0.H(1);
        vtt0.H(2);
        vtt0.H(3);
        vtt0.H(4);
        vtt0.H(5);
        vtt0.H(6);
        vtt0.H(7);
    }

    public an30(mtc mtcVar) {
        mtcVar.getClass();
        String str = vtt0.f38024a;
        this.f1132a = mtcVar.f22363a;
    }

    public final mtc a() {
        mtc mtcVar = new mtc();
        mtcVar.f22363a = this.f1132a;
        return mtcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof an30) && this.f1132a == ((an30) obj).f1132a;
    }

    public final int hashCode() {
        long j = this.f1132a;
        return ((int) (j ^ (j >>> 32))) * 923521;
    }
}

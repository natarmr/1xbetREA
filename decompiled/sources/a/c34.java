package a;

/* JADX INFO: loaded from: classes.dex */
public final class c34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3655a;
    public boolean b;
    public boolean c;

    public /* synthetic */ c34(boolean z, boolean z2, boolean z3) {
        this.f3655a = z;
        this.b = z2;
        this.c = z3;
    }

    public d34 a() {
        if (this.f3655a || !(this.b || this.c)) {
            return new d34(this);
        }
        jf4.n("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}

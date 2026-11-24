package a;

/* JADX INFO: loaded from: classes.dex */
public final class mev extends rev {
    public final int b;
    public final boolean c;

    public mev(int i, boolean z) {
        super("GRAPH_ERROR");
        this.b = i;
        this.c = z;
    }

    @Override // a.rev
    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f30355a);
        sb.append("(cameraError=");
        sb.append((Object) az9.a(this.b));
        sb.append(", willAttemptRetry=");
        return brm0.o(sb, this.c, ')');
    }
}

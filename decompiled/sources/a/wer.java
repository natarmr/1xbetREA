package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swq f39032a;
    public final String b;
    public final int c;

    public wer(swq swqVar, String str, int i) {
        swqVar.getClass();
        this.f39032a = swqVar;
        this.b = str;
        this.c = i;
    }

    public final g950 a(int i) {
        return g950.e(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39032a);
        sb.append('.');
        return axq.m(sb, this.b, 'N');
    }
}

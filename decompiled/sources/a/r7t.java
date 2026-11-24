package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class r7t {
    public static final q7t Companion = new q7t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f29994a;
    public final Double b;
    public final Double c;
    public final h9t d;
    public final Double e;
    public final cat f;

    public /* synthetic */ r7t(int i, Long l, Double d, Double d2, h9t h9tVar, Double d3, cat catVar) {
        if ((i & 1) == 0) {
            this.f29994a = null;
        } else {
            this.f29994a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = h9tVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = catVar;
        }
    }
}

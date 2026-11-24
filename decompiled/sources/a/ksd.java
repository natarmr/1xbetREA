package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ksd {
    public static final jsd Companion = new jsd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kwi0 f18808a;
    public final o8d b;
    public final vv10 c;

    public /* synthetic */ ksd(int i, kwi0 kwi0Var, o8d o8dVar, vv10 vv10Var) {
        if ((i & 1) == 0) {
            this.f18808a = null;
        } else {
            this.f18808a = kwi0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = o8dVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vv10Var;
        }
    }
}

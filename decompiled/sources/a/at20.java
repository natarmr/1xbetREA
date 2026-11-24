package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class at20 {
    public static final zs20 Companion = new zs20();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1415a;
    public final Integer b;
    public final jfo c;

    public /* synthetic */ at20(int i, Integer num, Integer num2, jfo jfoVar) {
        if ((i & 1) == 0) {
            this.f1415a = null;
        } else {
            this.f1415a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jfoVar;
        }
    }
}

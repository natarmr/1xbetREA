package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class l010 {
    public static final h010 Companion = new h010();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19177a;
    public final Long b;
    public final String c;
    public final String d;
    public final k010 e;

    public /* synthetic */ l010(int i, Long l, Long l2, String str, String str2, k010 k010Var) {
        if ((i & 1) == 0) {
            this.f19177a = null;
        } else {
            this.f19177a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = k010Var;
        }
    }
}

package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rdo {
    public static final kdo Companion = new kdo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f30298a;
    public final Double b;
    public final Double c;
    public final Boolean d;
    public final String e;
    public final qdo f;
    public final ndo g;

    public /* synthetic */ rdo(int i, Long l, Double d, Double d2, Boolean bool, String str, qdo qdoVar, ndo ndoVar) {
        if ((i & 1) == 0) {
            this.f30298a = null;
        } else {
            this.f30298a = l;
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
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = qdoVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = ndoVar;
        }
    }
}

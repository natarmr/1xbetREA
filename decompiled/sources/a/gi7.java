package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gi7 {
    public static final ei7 Companion = new ei7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nwo f11331a;
    public final Double b;
    public final String c;
    public final String d;
    public final Long e;
    public final n1f f;
    public final Boolean g;
    public final Boolean h;

    static {
        k1f k1fVar = n1f.Companion;
        mwo mwoVar = nwo.Companion;
    }

    public /* synthetic */ gi7(int i, nwo nwoVar, Double d, String str, String str2, Long l, n1f n1fVar, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.f11331a = null;
        } else {
            this.f11331a = nwoVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
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
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = n1fVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
    }
}

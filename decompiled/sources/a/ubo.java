package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ubo {
    public static final qbo Companion = new qbo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f35391a;
    public final Long b;
    public final Double c;
    public final Double d;
    public final String e;
    public final thj f;
    public final Boolean g;
    public final tbo h;

    public /* synthetic */ ubo(int i, Long l, Long l2, Double d, Double d2, String str, thj thjVar, Boolean bool, tbo tboVar) {
        if ((i & 1) == 0) {
            this.f35391a = null;
        } else {
            this.f35391a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = thjVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = tboVar;
        }
    }
}

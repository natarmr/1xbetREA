package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class vsf {
    public static final rsf Companion = new rsf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f37947a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final usf f;

    public /* synthetic */ vsf(int i, Long l, Long l2, String str, String str2, String str3, usf usfVar) {
        if ((i & 1) == 0) {
            this.f37947a = null;
        } else {
            this.f37947a = l;
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
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = usfVar;
        }
    }
}

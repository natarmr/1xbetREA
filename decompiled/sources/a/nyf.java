package a;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class nyf {
    public static final myf Companion = new myf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24327a;
    public final String b;
    public final Long c;

    public /* synthetic */ nyf(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f24327a = null;
        } else {
            this.f24327a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
    }

    public nyf(String str, Long l) {
        this.f24327a = str;
        this.b = "android";
        this.c = l;
    }
}

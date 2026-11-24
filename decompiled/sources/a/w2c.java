package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class w2c {
    public static final v2c Companion = new v2c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38440a;
    public final String b;
    public final boolean c;

    public /* synthetic */ w2c(int i, String str, String str2, boolean z) {
        if ((i & 1) == 0) {
            this.f38440a = "";
        } else {
            this.f38440a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public w2c(String str, String str2, boolean z) {
        str2.getClass();
        this.f38440a = str;
        this.b = str2;
        this.c = z;
    }
}

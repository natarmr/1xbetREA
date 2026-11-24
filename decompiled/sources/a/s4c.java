package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class s4c {
    public static final r4c Companion = new r4c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31597a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ s4c(int i, Integer num, Integer num2, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f31597a = null;
        } else {
            this.f31597a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
    }
}

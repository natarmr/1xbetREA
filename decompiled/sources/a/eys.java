package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class eys {
    public static final dys Companion = new dys();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8642a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public /* synthetic */ eys(int i, Integer num, Integer num2, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f8642a = null;
        } else {
            this.f8642a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
    }
}

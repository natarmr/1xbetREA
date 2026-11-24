package a;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class yf {
    public static final xf Companion = new xf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42516a;
    public final String b;
    public final Integer c;

    public /* synthetic */ yf(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f42516a = null;
        } else {
            this.f42516a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }
}

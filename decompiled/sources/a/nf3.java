package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class nf3 {
    public static final mf3 Companion = new mf3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23415a;
    public final String b;
    public final String c;

    public /* synthetic */ nf3(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f23415a = null;
        } else {
            this.f23415a = str;
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
    }
}

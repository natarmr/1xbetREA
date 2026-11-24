package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class a8j {
    public static final z7j Companion = new z7j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f427a;
    public final String b;
    public final String c;

    public /* synthetic */ a8j(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f427a = null;
        } else {
            this.f427a = str;
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

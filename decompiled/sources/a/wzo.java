package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wzo {
    public static final vzo Companion = new vzo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40030a;
    public final String b;
    public final Integer c;
    public final String d;

    public /* synthetic */ wzo(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f40030a = null;
        } else {
            this.f40030a = str;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }
}

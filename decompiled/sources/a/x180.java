package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class x180 {
    public static final w180 Companion = new w180();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40109a;
    public final String b;
    public final String c;

    public /* synthetic */ x180(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f40109a = null;
        } else {
            this.f40109a = l;
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
    }
}

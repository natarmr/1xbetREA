package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class caa0 {
    public static final baa0 Companion = new baa0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4000a;
    public final String b;

    public /* synthetic */ caa0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f4000a = null;
        } else {
            this.f4000a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }
}

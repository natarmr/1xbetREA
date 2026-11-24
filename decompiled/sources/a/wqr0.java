package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class wqr0 {
    public static final vqr0 Companion = new vqr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39606a;
    public final Long b;
    public final String c;
    public final String d;
    public final Integer e;

    public /* synthetic */ wqr0(int i, Integer num, Long l, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f39606a = null;
        } else {
            this.f39606a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
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
            this.e = num;
        }
    }
}

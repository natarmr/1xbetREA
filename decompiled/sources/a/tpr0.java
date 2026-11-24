package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class tpr0 {
    public static final spr0 Companion = new spr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34348a;
    public final String b;
    public final Double c;

    public /* synthetic */ tpr0(int i, Double d, String str, String str2) {
        if ((i & 1) == 0) {
            this.f34348a = null;
        } else {
            this.f34348a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
    }
}

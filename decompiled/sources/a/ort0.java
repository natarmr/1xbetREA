package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ort0 {
    public static final nrt0 Companion = new nrt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f25752a;
    public final String b;
    public final String c;

    public /* synthetic */ ort0(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f25752a = null;
        } else {
            this.f25752a = l;
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

package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class d8j {
    public static final c8j Companion = new c8j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f5651a;
    public final String b;
    public final String c;
    public final Long d;

    public /* synthetic */ d8j(int i, Float f, String str, String str2, Long l) {
        if ((i & 1) == 0) {
            this.f5651a = null;
        } else {
            this.f5651a = f;
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
            this.d = l;
        }
    }
}

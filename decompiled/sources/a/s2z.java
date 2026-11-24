package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class s2z {
    public static final r2z Companion = new r2z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31529a;
    public final Long b;
    public final Double c;
    public final Integer d;

    public /* synthetic */ s2z(int i, Long l, Long l2, Double d, Integer num) {
        if ((i & 1) == 0) {
            this.f31529a = null;
        } else {
            this.f31529a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }
}

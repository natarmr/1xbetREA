package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qnq0 {
    public static final lnq0 Companion = new lnq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f29043a;
    public final Integer b;
    public final Boolean c;

    public /* synthetic */ qnq0(int i, Boolean bool, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f29043a = null;
        } else {
            this.f29043a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }
}

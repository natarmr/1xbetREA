package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class a5h0 {
    public static final z4h0 Companion = new z4h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f271a;
    public final Integer b;
    public final Boolean c;

    public /* synthetic */ a5h0(int i, Boolean bool, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f271a = null;
        } else {
            this.f271a = l;
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

package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class t16 {
    public static final s16 Companion = new s16();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f33154a;
    public final String b;
    public final Long c;
    public final Long d;

    public /* synthetic */ t16(int i, Boolean bool, String str, Long l, Long l2) {
        if ((i & 1) == 0) {
            this.f33154a = null;
        } else {
            this.f33154a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
    }
}

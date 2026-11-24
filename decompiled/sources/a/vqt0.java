package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class vqt0 {
    public static final uqt0 Companion = new uqt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f37869a;
    public final Integer b;
    public final Integer c;
    public final Boolean d;

    public /* synthetic */ vqt0(int i, Long l, Integer num, Integer num2, Boolean bool) {
        if ((i & 1) == 0) {
            this.f37869a = null;
        } else {
            this.f37869a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }
}

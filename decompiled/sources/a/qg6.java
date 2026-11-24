package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class qg6 {
    public static final pg6 Companion = new pg6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28668a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final String e;

    public /* synthetic */ qg6(int i, Long l, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f28668a = null;
        } else {
            this.f28668a = l;
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
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }
}

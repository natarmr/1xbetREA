package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class zgo {
    public static final kgo Companion = new kgo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44354a;
    public final Integer b;
    public final Integer c;
    public final Double d;
    public final vgo e;
    public final Double f;
    public final String g;
    public final Boolean h;
    public final Integer i;
    public final rgo j;

    public /* synthetic */ zgo(int i, Long l, Integer num, Integer num2, Double d, vgo vgoVar, Double d2, String str, Boolean bool, Integer num3, rgo rgoVar) {
        if ((i & 1) == 0) {
            this.f44354a = null;
        } else {
            this.f44354a = l;
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
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = vgoVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = rgoVar;
        }
    }
}

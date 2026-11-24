package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class jsc0 {
    public static final isc0 Companion = new isc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f17046a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Long e;
    public final String f;
    public final Integer g;
    public final Long h;

    public /* synthetic */ jsc0(int i, Long l, String str, Integer num, String str2, Long l2, String str3, Integer num2, Long l3) {
        if ((i & 1) == 0) {
            this.f17046a = null;
        } else {
            this.f17046a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l3;
        }
    }
}

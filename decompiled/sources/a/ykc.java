package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ykc {
    public static final xkc Companion = new xkc();
    public static final a8z[] f = {null, null, maz.a(wez.f39042a, new zxb(16)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42782a;
    public final long b;
    public final List c;
    public final int d;
    public final String e;

    public /* synthetic */ ykc(int i, int i2, int i3, long j, String str, List list) {
        if ((i & 1) == 0) {
            this.f42782a = 0;
        } else {
            this.f42782a = i2;
        }
        this.b = (i & 2) == 0 ? 0L : j;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }
}

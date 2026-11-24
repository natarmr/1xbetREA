package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ugv0 {
    public static final tgv0 Companion = new tgv0();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new y9v0((byte) 5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35645a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final List e;

    public /* synthetic */ ugv0(int i, Integer num, Integer num2, Integer num3, String str, List list) {
        if ((i & 1) == 0) {
            this.f35645a = null;
        } else {
            this.f35645a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }
}

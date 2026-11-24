package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class di10 {
    public static final ci10 Companion = new ci10();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new gf10(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6119a;
    public final String b;
    public final String c;
    public final wh10 d;
    public final List e;

    public /* synthetic */ di10(int i, Integer num, String str, String str2, wh10 wh10Var, List list) {
        if ((i & 1) == 0) {
            this.f6119a = null;
        } else {
            this.f6119a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = wh10Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }
}

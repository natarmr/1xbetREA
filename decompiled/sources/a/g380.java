package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class g380 {
    public static final v280 Companion = new v280();
    public static final a8z[] e = {null, maz.a(wez.f39042a, new i280(4)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10600a;
    public final List b;
    public final String c;
    public final zgo d;

    public /* synthetic */ g380(int i, Integer num, List list, String str, zgo zgoVar) {
        if ((i & 1) == 0) {
            this.f10600a = null;
        } else {
            this.f10600a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = zgoVar;
        }
    }
}

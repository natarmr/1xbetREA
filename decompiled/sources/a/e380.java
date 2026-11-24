package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e380 {
    public static final t280 Companion = new t280();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new i280(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7122a;
    public final Long b;
    public final List c;

    public /* synthetic */ e380(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f7122a = null;
        } else {
            this.f7122a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }
}

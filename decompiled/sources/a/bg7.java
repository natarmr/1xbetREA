package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bg7 {
    public static final ag7 Companion = new ag7();
    public static final a8z[] d = {maz.a(wez.f39042a, new t07(20)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2541a;
    public final Long b;
    public final Long c;

    public /* synthetic */ bg7(int i, Long l, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f2541a = null;
        } else {
            this.f2541a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
    }
}

package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ts7 {
    public static final ss7 Companion = new ss7();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new os7(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34448a;
    public final Integer b;
    public final List c;

    public /* synthetic */ ts7(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f34448a = null;
        } else {
            this.f34448a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }
}

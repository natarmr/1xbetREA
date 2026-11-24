package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class df30 {
    public static final cf30 Companion = new cf30();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new n230(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5981a;
    public final Integer b;
    public final List c;

    public /* synthetic */ df30(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f5981a = null;
        } else {
            this.f5981a = str;
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

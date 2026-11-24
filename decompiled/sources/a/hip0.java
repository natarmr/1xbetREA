package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class hip0 {
    public static final cip0 Companion = new cip0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new mhp0(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13126a;
    public final Integer b;
    public final List c;

    public /* synthetic */ hip0(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f13126a = null;
        } else {
            this.f13126a = str;
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

package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class d600 {
    public static final c600 Companion = new c600();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new jtz(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f5529a;
    public final Integer b;
    public final List c;

    public /* synthetic */ d600(int i, Integer num, Integer num2, List list) {
        if ((i & 1) == 0) {
            this.f5529a = null;
        } else {
            this.f5529a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }
}

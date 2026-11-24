package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ocp {
    public static final ncp Companion = new ncp();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new r4p(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f25037a;
    public final List b;

    public /* synthetic */ ocp(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f25037a = null;
        } else {
            this.f25037a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}

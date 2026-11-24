package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class rbq {
    public static final qbq Companion = new qbq();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecq f30201a;
    public final ncq b;
    public final List c;

    static {
        mcq mcqVar = ncq.Companion;
        dcq dcqVar = ecq.Companion;
        d = new a8z[]{null, null, maz.a(wez.f39042a, new v9q((byte) 3))};
    }

    public /* synthetic */ rbq(int i, ecq ecqVar, ncq ncqVar, List list) {
        if ((i & 1) == 0) {
            this.f30201a = null;
        } else {
            this.f30201a = ecqVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ncqVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }
}

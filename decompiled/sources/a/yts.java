package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class yts {
    public static final rts Companion = new rts();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new sqs(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f43234a;
    public final List b;

    public /* synthetic */ yts(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f43234a = null;
        } else {
            this.f43234a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}

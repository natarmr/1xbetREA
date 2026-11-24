package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xts {
    public static final wts Companion = new wts();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new sqs(6)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f41478a;
    public final List b;
    public final String c;

    public /* synthetic */ xts(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.f41478a = null;
        } else {
            this.f41478a = l;
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
    }
}

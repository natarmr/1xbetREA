package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class a6v0 {
    public static final z5v0 Companion = new z5v0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new o1u0(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f335a;
    public final Long b;
    public final List c;

    public /* synthetic */ a6v0(int i, Long l, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f335a = null;
        } else {
            this.f335a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }
}

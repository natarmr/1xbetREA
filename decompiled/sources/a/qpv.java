package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qpv {
    public static final qov Companion = new qov();
    public static final a8z[] c = {maz.a(wez.f39042a, new ldv(9)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29139a;
    public final cpv b;

    public /* synthetic */ qpv(int i, List list, cpv cpvVar) {
        if ((i & 1) == 0) {
            this.f29139a = null;
        } else {
            this.f29139a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = cpvVar;
        }
    }
}

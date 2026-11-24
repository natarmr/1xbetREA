package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class v3n0 {
    public static final p3n0 Companion = new p3n0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new x9m0(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36737a;
    public final String b;
    public final cfl0 c;
    public final List d;

    public /* synthetic */ v3n0(int i, Long l, String str, cfl0 cfl0Var, List list) {
        if ((i & 1) == 0) {
            this.f36737a = null;
        } else {
            this.f36737a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = cfl0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }
}

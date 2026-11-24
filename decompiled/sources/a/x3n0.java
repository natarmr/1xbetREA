package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class x3n0 {
    public static final r3n0 Companion = new r3n0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new x9m0(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40230a;
    public final String b;
    public final dfl0 c;
    public final List d;

    public /* synthetic */ x3n0(int i, Long l, String str, dfl0 dfl0Var, List list) {
        if ((i & 1) == 0) {
            this.f40230a = null;
        } else {
            this.f40230a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = dfl0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }
}

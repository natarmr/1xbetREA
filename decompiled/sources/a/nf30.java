package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class nf30 {
    public static final mf30 Companion = new mf30();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new n230(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23416a;
    public final List b;

    public /* synthetic */ nf30(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f23416a = null;
        } else {
            this.f23416a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}

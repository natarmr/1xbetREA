package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dv20 {
    public static final tu20 Companion = new tu20();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new sv10(26)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6724a;
    public final List b;
    public final Boolean c;

    public /* synthetic */ dv20(int i, Boolean bool, Long l, List list) {
        if ((i & 1) == 0) {
            this.f6724a = null;
        } else {
            this.f6724a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }
}

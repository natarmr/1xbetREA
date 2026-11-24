package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class pcn {
    public static final fcn Companion = new fcn();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new dcn(0)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f26768a;
    public final List b;
    public final Boolean c;

    public /* synthetic */ pcn(int i, Boolean bool, Long l, List list) {
        if ((i & 1) == 0) {
            this.f26768a = null;
        } else {
            this.f26768a = l;
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

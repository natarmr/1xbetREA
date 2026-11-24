package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class sdo {
    public static final hdo Companion = new hdo();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new urn(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32042a;
    public final List b;
    public final Boolean c;

    public /* synthetic */ sdo(int i, Boolean bool, Long l, List list) {
        if ((i & 1) == 0) {
            this.f32042a = null;
        } else {
            this.f32042a = l;
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

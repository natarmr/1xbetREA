package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class b2d0 {
    public static final a2d0 Companion = new a2d0();
    public static final a8z[] h = {null, null, maz.a(wez.f39042a, new cbc0(17)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f1847a;
    public final Boolean b;
    public final List c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;

    public /* synthetic */ b2d0(int i, Boolean bool, Boolean bool2, List list, Long l, Long l2, Long l3, Long l4) {
        if ((i & 1) == 0) {
            this.f1847a = null;
        } else {
            this.f1847a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l4;
        }
    }
}

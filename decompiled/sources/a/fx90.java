package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class fx90 {
    public static final ex90 Companion = new ex90();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new wm90(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f10300a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final List e;

    public /* synthetic */ fx90(int i, Long l, Integer num, Integer num2, Integer num3, List list) {
        if ((i & 1) == 0) {
            this.f10300a = null;
        } else {
            this.f10300a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }
}

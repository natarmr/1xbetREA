package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ecq {
    public static final dcq Companion = new dcq();
    public static final a8z[] h = {null, maz.a(wez.f39042a, new v9q(4)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jcq f7578a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Float g;

    public /* synthetic */ ecq(int i, jcq jcqVar, List list, Integer num, Integer num2, Integer num3, Integer num4, Float f) {
        if ((i & 1) == 0) {
            this.f7578a = null;
        } else {
            this.f7578a = jcqVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = f;
        }
    }
}

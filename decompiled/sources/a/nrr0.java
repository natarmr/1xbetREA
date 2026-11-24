package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class nrr0 {
    public static final mrr0 Companion = new mrr0();
    public static final a8z[] k = {null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new yqr0(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f24019a;
    public final Long b;
    public final Long c;
    public final String d;
    public final String e;
    public final Long f;
    public final Double g;
    public final Double h;
    public final Double i;
    public final List j;

    public /* synthetic */ nrr0(int i, Long l, Long l2, Long l3, String str, String str2, Long l4, Double d, Double d2, Double d3, List list) {
        if ((i & 1) == 0) {
            this.f24019a = null;
        } else {
            this.f24019a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
    }
}

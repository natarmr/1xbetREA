package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mhc0 {
    public static final lhc0 Companion = new lhc0();
    public static final a8z[] k = {null, maz.a(wez.f39042a, new cbc0(8)), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21785a;
    public final List b;
    public final Double c;
    public final String d;
    public final Long e;
    public final Long f;
    public final Integer g;
    public final String h;
    public final Integer i;
    public final Long j;

    public /* synthetic */ mhc0(int i, String str, List list, Double d, String str2, Long l, Long l2, Integer num, String str3, Integer num2, Long l3) {
        if ((i & 1) == 0) {
            this.f21785a = null;
        } else {
            this.f21785a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l3;
        }
    }
}

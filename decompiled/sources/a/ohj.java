package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ohj {
    public static final nhj Companion = new nhj();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new bmh(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f25267a;
    public final Long b;
    public final Double c;
    public final String d;
    public final List e;

    public /* synthetic */ ohj(int i, Long l, Long l2, Double d, String str, List list) {
        if ((i & 1) == 0) {
            this.f25267a = null;
        } else {
            this.f25267a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }
}

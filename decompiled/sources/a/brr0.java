package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class brr0 {
    public static final arr0 Companion = new arr0();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new yqr0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f3093a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final List f;

    public /* synthetic */ brr0(int i, Integer num, Long l, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f3093a = null;
        } else {
            this.f3093a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }
}

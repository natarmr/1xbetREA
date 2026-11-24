package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class oe30 {
    public static final ne30 Companion = new ne30();
    public static final a8z[] g = {null, null, maz.a(wez.f39042a, new n230(20)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25105a;
    public final Integer b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ oe30(int i, String str, Integer num, List list, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f25105a = null;
        } else {
            this.f25105a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }
}

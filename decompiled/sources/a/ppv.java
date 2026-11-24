package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ppv {
    public static final hpv Companion = new hpv();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new ldv(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27389a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ ppv(int i, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f27389a = null;
        } else {
            this.f27389a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }
}

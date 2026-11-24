package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class gh40 {
    public static final fh40 Companion = new fh40();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new ec40(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11282a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ gh40(int i, String str, String str2, String str3, String str4, List list) {
        if ((i & 1) == 0) {
            this.f11282a = null;
        } else {
            this.f11282a = str;
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
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }
}

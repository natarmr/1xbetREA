package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class opv {
    public static final gpv Companion = new gpv();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new ldv(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25660a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ opv(int i, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f25660a = null;
        } else {
            this.f25660a = str;
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

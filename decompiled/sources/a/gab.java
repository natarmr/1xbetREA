package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class gab {
    public static final eab Companion = new eab();
    public static final a8z[] d = {maz.a(wez.f39042a, new e0b(6)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10958a;
    public final String b;
    public final String c;

    public /* synthetic */ gab(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f10958a = null;
        } else {
            this.f10958a = list;
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
    }
}

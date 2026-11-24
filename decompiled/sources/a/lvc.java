package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lvc {
    public static final kvc Companion = new kvc();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new zxb(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20708a;
    public final String b;
    public final List c;

    public /* synthetic */ lvc(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f20708a = null;
        } else {
            this.f20708a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }
}

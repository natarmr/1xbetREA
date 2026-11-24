package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class grt0 {
    public static final crt0 Companion = new crt0();
    public static final a8z[] c = {maz.a(wez.f39042a, new tht0(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11798a;
    public final String b;

    public /* synthetic */ grt0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f11798a = null;
        } else {
            this.f11798a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }
}

package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class f010 {
    public static final e010 Companion = new e010();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new x800((byte) 29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8697a;
    public final List b;

    public /* synthetic */ f010(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f8697a = null;
        } else {
            this.f8697a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}

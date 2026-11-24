package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class hwm0 {
    public static final gwm0 Companion = new gwm0();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new x9m0(19)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13774a;
    public final List b;
    public final i4h0 c;

    public /* synthetic */ hwm0(int i, String str, List list, i4h0 i4h0Var) {
        if ((i & 1) == 0) {
            this.f13774a = null;
        } else {
            this.f13774a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = i4h0Var;
        }
    }
}

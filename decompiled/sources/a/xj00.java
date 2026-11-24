package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class xj00 {
    public static final wj00 Companion = new wj00();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new x800((byte) 5)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40973a;
    public final Integer b;
    public final List c;
    public final c5h0 d;

    public /* synthetic */ xj00(int i, Integer num, Integer num2, List list, c5h0 c5h0Var) {
        if ((i & 1) == 0) {
            this.f40973a = null;
        } else {
            this.f40973a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = c5h0Var;
        }
    }
}

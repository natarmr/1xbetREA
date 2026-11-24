package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ovf0 {
    public static final nvf0 Companion = new nvf0();
    public static final a8z[] e = {null, maz.a(wez.f39042a, new b4f0((byte) 24)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25923a;
    public final List b;
    public final String c;
    public final ivf0 d;

    public /* synthetic */ ovf0(int i, String str, List list, String str2, ivf0 ivf0Var) {
        if ((i & 1) == 0) {
            this.f25923a = null;
        } else {
            this.f25923a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = ivf0Var;
        }
    }
}

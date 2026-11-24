package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wqt {
    public static final vqt Companion = new vqt();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new tet(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39608a;
    public final Integer b;
    public final List c;
    public final String d;

    public /* synthetic */ wqt(int i, Integer num, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f39608a = null;
        } else {
            this.f39608a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }
}

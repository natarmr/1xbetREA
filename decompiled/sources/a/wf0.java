package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wf0 {
    public static final vf0 Companion = new vf0();
    public static final a8z[] d = {maz.a(wez.f39042a, new q8(29)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39044a;
    public final int b;
    public final String c;

    public /* synthetic */ wf0(int i, int i2, String str, List list) {
        if ((i & 1) == 0) {
            this.f39044a = null;
        } else {
            this.f39044a = list;
        }
        this.b = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }
}

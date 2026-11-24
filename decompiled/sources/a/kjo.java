package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kjo {
    public static final ijo Companion = new ijo();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new ago(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f18396a;
    public final String b;
    public final Integer c;
    public final List d;

    public /* synthetic */ kjo(int i, Boolean bool, String str, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f18396a = null;
        } else {
            this.f18396a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }
}

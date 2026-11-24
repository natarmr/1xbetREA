package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ncq {
    public static final mcq Companion = new mcq();
    public static final a8z[] e = {null, maz.a(wez.f39042a, new v9q(5)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f23306a;
    public final List b;
    public final jcq c;
    public final Boolean d;

    public /* synthetic */ ncq(int i, Float f, List list, jcq jcqVar, Boolean bool) {
        if ((i & 1) == 0) {
            this.f23306a = null;
        } else {
            this.f23306a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jcqVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }
}

package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class cat {
    public static final bat Companion = new bat();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new e6t(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f4029a;
    public final List b;
    public final Double c;

    public /* synthetic */ cat(int i, Double d2, List list, Double d3) {
        if ((i & 1) == 0) {
            this.f4029a = null;
        } else {
            this.f4029a = d2;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d3;
        }
    }
}

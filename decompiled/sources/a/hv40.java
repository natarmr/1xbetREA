package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hv40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbs0 f13710a;
    public final ocs0 b;
    public final ncs0 c;
    public final rrs0 d;
    public final boolean e;
    public final boolean f;
    public int g;
    public androidx.media3.common.b h;

    public hv40(lbs0 lbs0Var, ocs0 ocs0Var, ncs0 ncs0Var) {
        this.f13710a = lbs0Var;
        this.b = ocs0Var;
        this.c = ncs0Var;
        int i = lbs0Var.b;
        androidx.media3.common.b bVar = lbs0Var.g;
        this.e = i == 2;
        this.f = Objects.equals(bVar.p, "application/x-itut-t35");
        this.d = "audio/true-hd".equals(bVar.p) ? new rrs0() : null;
    }
}

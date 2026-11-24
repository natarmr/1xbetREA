package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class qkj implements e3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vv40 f28888a;
    public final ArrayList b = new ArrayList();

    public qkj(vv40 vv40Var) {
        this.f28888a = vv40Var;
    }

    @Override // a.e3g0
    public final void a(d3g0 d3g0Var) {
        this.b.add(d3g0Var);
    }

    public chf0 b(gv90 gv90Var) {
        return new chf0((Object) new nhf0(gv90Var), (byte) 12);
    }
}

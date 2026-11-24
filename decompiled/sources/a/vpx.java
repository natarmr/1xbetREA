package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class vpx implements eyb {
    public static final vpx b = new vpx(0);
    public static final vpx c = new vpx(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37830a;

    public /* synthetic */ vpx(byte b2) {
        this.f37830a = b2;
    }

    @Override // a.eyb
    public final /* bridge */ String a(u9y u9yVar) {
        switch (this.f37830a) {
            case 0:
                break;
        }
        return dyb.d0(this, u9yVar);
    }

    @Override // a.eyb
    public final boolean b(u9y u9yVar) {
        kzj0 kzj0VarF0;
        switch (this.f37830a) {
            case 0:
                k3u0 k3u0Var = (k3u0) u9yVar.z().get(1);
                gne0 gne0Var = xre0.c;
                k3u0Var.getClass();
                int i = rek.f30339a;
                ym40 ym40VarC = oek.c(k3u0Var);
                ym40VarC.getClass();
                gne0Var.getClass();
                wm40 wm40VarV = obb.V(ym40VarC, i4m0.R);
                if (wm40VarV == null) {
                    kzj0VarF0 = null;
                } else {
                    ays0.b.getClass();
                    ays0 ays0Var = ays0.c;
                    List parameters = wm40VarV.h().getParameters();
                    parameters.getClass();
                    Object objV0 = CollectionsKt.v0(parameters);
                    objV0.getClass();
                    kzj0VarF0 = ucx.f0(ays0Var, wm40VarV, kotlin.collections.a.c(new q4m0((hzs0) objV0)));
                }
                if (kzj0VarF0 == null) {
                    return false;
                }
                wsy type = k3u0Var.getType();
                type.getClass();
                return vsm0.v(kzj0VarF0, e0t0.h(type, false));
            default:
                List<k3u0> listZ = u9yVar.z();
                listZ.getClass();
                if (!listZ.isEmpty()) {
                    for (k3u0 k3u0Var2 : listZ) {
                        k3u0Var2.getClass();
                        if (rek.a(k3u0Var2) || k3u0Var2.k != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // a.eyb
    public final String getDescription() {
        switch (this.f37830a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}

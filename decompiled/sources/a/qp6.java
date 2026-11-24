package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qp6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29100a;
    public final /* synthetic */ vp6 b;
    public final /* synthetic */ jg7 c;

    public /* synthetic */ qp6(vp6 vp6Var, jg7 jg7Var, byte b) {
        this.f29100a = b;
        this.b = vp6Var;
        this.c = jg7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f29100a;
        jg7 jg7Var = this.c;
        vp6 vp6Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = vp6Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    vp6Var.f.getClass();
                } while (!p7m0Var.m(value, jp6.a((jp6) value, false, false, false, false, null, null, null, null, null, false, null, false, false, false, null, true, null, false, 2064383)));
                vp6Var.O.d(new qo5(vp6Var, jg7Var, (byte) 18));
                break;
            default:
                boolean z = false;
                if (vp6Var.C.g()) {
                    vp6Var.P(false, jg7Var.b);
                } else {
                    boolean z2 = vp6Var.T.c(j820.e) != ua20.MEDIUM_NO_GAME_INFO;
                    if (!vp6Var.G.j() && ((jp6) vp6Var.D()).u) {
                        z = true;
                    }
                    vp6Var.G(new bp6(z2, z));
                }
                p7m0 p7m0Var2 = vp6Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    vp6Var.f.getClass();
                } while (!p7m0Var2.m(value2, jp6.a((jp6) value2, false, false, false, false, null, null, null, null, null, false, null, false, false, false, null, false, null, false, 2064383)));
                break;
        }
        return Unit.f46060a;
    }
}

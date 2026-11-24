package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ho6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13379a;
    public final /* synthetic */ po6 b;
    public final /* synthetic */ jg7 c;

    public /* synthetic */ ho6(po6 po6Var, jg7 jg7Var, byte b) {
        this.f13379a = b;
        this.b = po6Var;
        this.c = jg7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13379a;
        jg7 jg7Var = this.c;
        po6 po6Var = this.b;
        switch (b) {
            case 0:
                po6Var.M = true;
                po6Var.E.d(new qo5(po6Var, jg7Var, (byte) 16));
                break;
            default:
                byte b2 = 0;
                if (po6Var.q.g()) {
                    po6Var.z(false, jg7Var.b);
                } else {
                    qjj.W(jiu0.a(po6Var), null, null, new ko6(po6Var, null, b2), 3);
                }
                po6Var.M = false;
                break;
        }
        return Unit.f46060a;
    }
}

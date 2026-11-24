package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lw6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20748a;
    public final /* synthetic */ a8q0 b;
    public final /* synthetic */ agk0 c;
    public final /* synthetic */ cgk0 d;

    public /* synthetic */ lw6(a8q0 a8q0Var, agk0 agk0Var, cgk0 cgk0Var, byte b) {
        this.f20748a = b;
        this.b = a8q0Var;
        this.c = agk0Var;
        this.d = cgk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        float fL;
        float fL2;
        float fL3;
        byte b = this.f20748a;
        cgk0 cgk0Var = this.d;
        agk0 agk0Var = this.c;
        a8q0 a8q0Var = this.b;
        switch (b) {
            case 0:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                z = a9q0Var.b.f3309a.e() >= ((float) ((int) (a9q0Var.c >> 32)));
                if (!z || agk0Var.l() <= 8.0f || a8q0Var.f440a.b.length() <= cgk0Var.l()) {
                    fL = (z || agk0Var.l() >= 16.0f || a8q0Var.f440a.b.length() >= cgk0Var.l()) ? agk0Var.l() : agk0Var.l() + 1.0f;
                } else {
                    fL = agk0Var.l() - 1.0f;
                }
                agk0Var.m(fL);
                cgk0Var.m(a8q0Var.f440a.b.length());
                break;
            case 1:
                a9q0 a9q0Var2 = (a9q0) obj;
                a9q0Var2.getClass();
                z = a9q0Var2.b.f3309a.e() >= ((float) ((int) (a9q0Var2.c >> 32)));
                if (!z || agk0Var.l() <= 8.0f || a8q0Var.f440a.b.length() <= cgk0Var.l()) {
                    fL2 = (z || agk0Var.l() >= 16.0f || a8q0Var.f440a.b.length() >= cgk0Var.l()) ? agk0Var.l() : agk0Var.l() + 1.0f;
                } else {
                    fL2 = agk0Var.l() - 1.0f;
                }
                agk0Var.m(fL2);
                cgk0Var.m(a8q0Var.f440a.b.length());
                break;
            default:
                j83 j83Var = a8q0Var.f440a;
                a9q0 a9q0Var3 = (a9q0) obj;
                a9q0Var3.getClass();
                z = a9q0Var3.b.f3309a.e() >= ((float) ((int) (a9q0Var3.c >> 32)));
                if (!z || agk0Var.l() <= 8.0f || j83Var.b.length() <= cgk0Var.l()) {
                    fL3 = (z || agk0Var.l() >= 16.0f || j83Var.b.length() >= cgk0Var.l()) ? agk0Var.l() : agk0Var.l() + 1.0f;
                } else {
                    fL3 = agk0Var.l() - 1.0f;
                }
                agk0Var.m(fL3);
                cgk0Var.m(j83Var.b.length());
                break;
        }
        return Unit.f46060a;
    }
}

package a;

import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zq9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44797a;
    public final /* synthetic */ br9 b;

    public /* synthetic */ zq9(br9 br9Var, byte b) {
        this.f44797a = b;
        this.b = br9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f44797a;
        br9 br9Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = br9Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                kl5 kl5Var = br9.S1;
                li8 li8Var = new li8(1, br9Var.H0(), mr9.class, "onDeleteClicked", "onDeleteClicked(J)V", 0, (byte) 20);
                cyv cyvVar = new cyv();
                gbn gbnVar = new gbn(new s3t((byte) 23), new pkv(3, (byte) 9), new umu((byte) 21), btv.e);
                dp dpVar = cyvVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new x2w((byte) 4), new pkv(3, (byte) 16), new umu((byte) 29), btv.l));
                dpVar.b(new gbn(new s3t((byte) 29), new pkv(3, (byte) 12), new t3t(li8Var, (byte) 23), btv.h));
                return cyvVar;
            case 2:
                kl5 kl5Var2 = br9.S1;
                mr9 mr9VarH0 = br9Var.H0();
                mr9VarH0.i.p(AuthorizationHeaderIms.YES);
                p7m0 p7m0Var = mr9VarH0.l;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, es9.a((es9) value, null, null, true, null, 11)));
                sac.V(jiu0.a(mr9VarH0), new cr9(mr9VarH0, (byte) 1), new dr9(mr9VarH0, (byte) 1), mr9VarH0.e.c, new fr9(mr9VarH0, null, (byte) 0), 8);
                return Unit.f46060a;
            default:
                kl5 kl5Var3 = br9.S1;
                mr9 mr9VarH1 = br9Var.H0();
                mr9VarH1.i.p(AuthorizationHeaderIms.NO);
                p7m0 p7m0Var2 = mr9VarH1.l;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, es9.a((es9) value2, null, null, false, null, 7)));
                return Unit.f46060a;
        }
    }
}

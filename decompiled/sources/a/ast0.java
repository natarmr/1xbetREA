package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.referral.impl.navigation.ReferralProgramScreenFactoryImpl$loadDataScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ast0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1406a;
    public final /* synthetic */ daf b;
    public final /* synthetic */ zuc0 c;

    public /* synthetic */ ast0(daf dafVar, zuc0 zuc0Var, byte b) {
        this.f1406a = b;
        this.b = dafVar;
        this.c = zuc0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1406a;
        zuc0 zuc0Var = this.c;
        daf dafVar = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new m8s0(dafVar, i1w0Var, zuc0Var, (byte) 3));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.i(jh70.i((jh70) dafVar.g, zuc0Var), new ReferralProgramScreenFactoryImpl$loadDataScreen$1());
                break;
        }
        return Unit.f46060a;
    }
}

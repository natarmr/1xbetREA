package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nr10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23982a;
    public final /* synthetic */ qr10 b;

    public /* synthetic */ nr10(qr10 qr10Var, byte b) {
        this.f23982a = b;
        this.b = qr10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23982a;
        qr10 qr10Var = this.b;
        switch (b) {
            case 0:
                evz evzVar = qr10.V1;
                ComponentCallbacks2 application = qr10Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(rp9.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof rp9)) {
                        ze3Var = null;
                    }
                    rp9 rp9Var = (rp9) ze3Var;
                    if (rp9Var != null) {
                        return rp9Var.a(a4n0.f(qr10Var));
                    }
                }
                jf4.n(b1j.i(rp9.class, "Cannot create dependency "));
                return null;
            case 1:
                evz evzVar2 = qr10.V1;
                qr10Var.G0().x(gq9.f11721a);
                return Unit.f46060a;
            case 2:
                evz evzVar3 = qr10.V1;
                qr10Var.G0().x(hq9.f13473a);
                return Unit.f46060a;
            case 3:
                evz evzVar4 = qr10.V1;
                qr10Var.G0().x(fq9.f9962a);
                return Unit.f46060a;
            case 4:
                evz evzVar5 = qr10.V1;
                qr10Var.G0().x(eq9.f8226a);
                return Unit.f46060a;
            case 5:
                evz evzVar6 = qr10.V1;
                ComponentCallbacks2 application2 = qr10Var.n0().getApplication();
                application2.getClass();
                af3 af3Var2 = application2 instanceof af3 ? (af3) application2 : null;
                if (af3Var2 != null) {
                    o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(oq9.class);
                    ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                    if (!(ze3Var2 instanceof oq9)) {
                        ze3Var2 = null;
                    }
                    oq9 oq9Var = (oq9) ze3Var2;
                    if (oq9Var != null) {
                        return oq9Var.a(qr10Var.S1.n(qr10Var, qr10.W1[2]).longValue());
                    }
                }
                jf4.n(b1j.i(oq9.class, "Cannot create dependency "));
                return null;
            case 6:
                evz evzVar7 = qr10.V1;
                ComponentCallbacks2 application3 = qr10Var.n0().getApplication();
                application3.getClass();
                af3 af3Var3 = application3 instanceof af3 ? (af3) application3 : null;
                if (af3Var3 != null) {
                    o5d0 o5d0Var3 = (o5d0) af3Var3.d().get(o880.class);
                    ze3 ze3Var3 = o5d0Var3 != null ? (ze3) o5d0Var3.get() : null;
                    if (!(ze3Var3 instanceof o880)) {
                        ze3Var3 = null;
                    }
                    o880 o880Var = (o880) ze3Var3;
                    if (o880Var != null) {
                        return o880Var.a();
                    }
                }
                jf4.n(b1j.i(o880.class, "Cannot create dependency "));
                return null;
            case 7:
                return new q0h0((yai) ((zai) qr10Var.K1.getValue()).i.get());
            case 8:
                evz evzVar8 = qr10.V1;
                return new q0h0((abi) qr10Var.H0().p.get());
            case 9:
                evz evzVar9 = qr10.V1;
                return new q0h0((bni) ((cni) qr10Var.M1.getValue()).y.get());
            default:
                evz evzVar10 = qr10.V1;
                qr10Var.I0().x(e780.f7320a);
                return Unit.f46060a;
        }
    }
}

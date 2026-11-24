package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wqp0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39602a;
    public final /* synthetic */ zqp0 b;

    public /* synthetic */ wqp0(zqp0 zqp0Var, byte b) {
        this.f39602a = b;
        this.b = zqp0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39602a;
        zqp0 zqp0Var = this.b;
        switch (b) {
            case 0:
                qwi qwiVar = zqp0Var.M1;
                if (qwiVar != null) {
                    return new q0h0(qwiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                y2m0 y2m0Var = zqp0.V1;
                zqp0Var.H0().A(j1i0.CANCEL, iun.f15405a);
                return Unit.f46060a;
            case 2:
                y2m0 y2m0Var2 = zqp0.V1;
                nfj0 nfj0Var = new nfj0(2, zqp0Var.H0(), urp0.class, "onSelectTeam", "onSelectTeam(IZ)V", 0, (byte) 29);
                vqp0 vqp0Var = new vqp0(ek5.h);
                vqp0Var.d.b(new gbn(new zgp0((byte) 8), new asj0(3, (byte) 27), new ttn0(nfj0Var, (byte) 29), pfo0.f));
                return vqp0Var;
            case 3:
                y2m0 y2m0Var3 = zqp0.V1;
                urp0 urp0VarH0 = zqp0Var.H0();
                urp0VarH0.B(j1i0.DEFAULT, iun.f15405a);
                urp0VarH0.D(irp0.f15271a);
                return Unit.f46060a;
            case 4:
                y2m0 y2m0Var4 = zqp0.V1;
                zqp0Var.H0().w(false);
                return Unit.f46060a;
            case 5:
                y2m0 y2m0Var5 = zqp0.V1;
                urp0 urp0VarH1 = zqp0Var.H0();
                urp0VarH1.B(j1i0.CLEAR, iun.f15405a);
                urp0VarH1.D(hrp0.f13543a);
                return Unit.f46060a;
            case 6:
                y2m0 y2m0Var6 = zqp0.V1;
                zqp0Var.H0().a();
                return Unit.f46060a;
            case 7:
                y2m0 y2m0Var7 = zqp0.V1;
                zqp0Var.H0().w(true);
                return Unit.f46060a;
            case 8:
                y2m0 y2m0Var8 = zqp0.V1;
                zqp0Var.H0().A(j1i0.CANCEL, iun.f15405a);
                i1w0 i1w0Var = zqp0Var.H0().m;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            default:
                y2m0 y2m0Var9 = zqp0.V1;
                zqp0Var.H0().A(j1i0.CANCEL, iun.f15405a);
                return Unit.f46060a;
        }
    }
}

package a;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ao90;", "La/iw5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ao90 extends iw5 {
    public final a8z k2 = maz.a(wez.b, new wn90(this, 0));
    public final a8z l2 = xbc.a0(this, sre0.f32672a.b(no90.class), null, new wn90(this, 1), 14);
    public final khf0 m2 = new khf0("KEY_PARAMS");
    public final khf0 n2 = new khf0(AnalyticsEntryPoint.b, "ANALYTICS_ENTRY_POINT_KEY");
    public static final /* synthetic */ iiy[] p2 = {new ez40(ao90.class, "pickerParams", "getPickerParams()Lorg/xplatform/picker/api/presentation/PickerParams;", 0), new ez40(ao90.class, "analyticsEntryPoint", "getAnalyticsEntryPoint()Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;", 0)};
    public static final xi70 o2 = new xi70();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1428570135);
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new wn90(this, (byte) 2);
            fetVar.o0(objP);
        }
        Function0 function0 = (Function0) objP;
        boolean zI2 = fetVar.i(this);
        Object objP2 = fetVar.P();
        byte b = 3;
        if (zI2 || objP2 == obj) {
            objP2 = new wn90(this, b);
            fetVar.o0(objP2);
        }
        v3c.A(function0, (Function0) objP2, null, fetVar, 0, 4);
        k3t0 k3t0VarP0 = P0();
        boolean zI3 = fetVar.i(this);
        Object objP3 = fetVar.P();
        if (zI3 || objP3 == obj) {
            Object yi90Var = new yi90(1, this, ao90.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/picker/impl/presentation/compose/PickerBottomSheetDialogSideEffect;)V", 0, (byte) 2);
            fetVar.o0(yi90Var);
            objP3 = yi90Var;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP3), fetVar);
        boolean zI4 = fetVar.i(k3t0VarP0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP4 = fetVar.P();
        if (zI4 || objP4 == obj) {
            objP4 = new khx(k3t0VarP0, this, pz40VarF, (yje) null);
            fetVar.o0(objP4);
        }
        m0x0.t(fetVar, this, (Function2) objP4);
        final pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        final byte b2 = 1;
        final byte b3 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-939949224, new xdr() { // from class: a.xn90
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b4 = b3;
                cl5 cl5Var = ukd.f35823a;
                ao90 ao90Var = this;
                l7m0 l7m0Var = pz40VarY;
                switch (b4) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        xi70 xi70Var = ao90.o2;
                        ((y5d) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            k3t0 k3t0VarP1 = ao90Var.P0();
                            boolean zI5 = fetVar2.i(k3t0VarP1);
                            Object objP5 = fetVar2.P();
                            if (zI5 || objP5 == cl5Var) {
                                yi90 yi90Var2 = new yi90(1, k3t0VarP1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                                fetVar2.o0(yi90Var2);
                                objP5 = yi90Var2;
                            }
                            m8x.r(l7m0Var, (Function1) ((jhy) objP5), fetVar2, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        xi70 xi70Var2 = ao90.o2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            k3t0 k3t0VarP2 = ao90Var.P0();
                            boolean zI6 = fetVar3.i(k3t0VarP2);
                            Object objP6 = fetVar3.P();
                            if (zI6 || objP6 == cl5Var) {
                                yi90 yi90Var3 = new yi90(1, k3t0VarP2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                                fetVar3.o0(yi90Var3);
                                objP6 = yi90Var3;
                            }
                            kc5.s0(l7m0Var, (Function1) ((jhy) objP6), fetVar3, 0);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), (ugd) null, u1c.M(817677914, new xdr() { // from class: a.xn90
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b4 = b2;
                cl5 cl5Var = ukd.f35823a;
                ao90 ao90Var = this;
                l7m0 l7m0Var = pz40VarY;
                switch (b4) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        xi70 xi70Var = ao90.o2;
                        ((y5d) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            k3t0 k3t0VarP1 = ao90Var.P0();
                            boolean zI5 = fetVar2.i(k3t0VarP1);
                            Object objP5 = fetVar2.P();
                            if (zI5 || objP5 == cl5Var) {
                                yi90 yi90Var2 = new yi90(1, k3t0VarP1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                                fetVar2.o0(yi90Var2);
                                objP5 = yi90Var2;
                            }
                            m8x.r(l7m0Var, (Function1) ((jhy) objP5), fetVar2, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        xi70 xi70Var2 = ao90.o2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            k3t0 k3t0VarP2 = ao90Var.P0();
                            boolean zI6 = fetVar3.i(k3t0VarP2);
                            Object objP6 = fetVar3.P();
                            if (zI6 || objP6 == cl5Var) {
                                yi90 yi90Var3 = new yi90(1, k3t0VarP2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                                fetVar3.o0(yi90Var3);
                                objP6 = yi90Var3;
                            }
                            kc5.s0(l7m0Var, (Function1) ((jhy) objP6), fetVar3, 0);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.l2.getValue();
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new w23(this, (byte) 11));
        } else {
            vcc.f0(i120.V(new Pair("PICKER_DIALOG_TAG", Boolean.TRUE)), this, "PICKER_DIALOG_TAG");
        }
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        vcc.f0(i120.U(), this, "PICKER_DISMISS_KEY");
    }
}

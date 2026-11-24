package a;

import android.widget.ProgressBar;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class vr50 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wr50 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr50(wr50 wr50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wr50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wr50 wr50Var = this.k;
        switch (b) {
            case 0:
                vr50 vr50Var = new vr50(wr50Var, yjeVar, (byte) 0);
                vr50Var.j = obj;
                return vr50Var;
            default:
                vr50 vr50Var2 = new vr50(wr50Var, yjeVar, (byte) 1);
                vr50Var2.j = obj;
                return vr50Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vr50) create((ot50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((vr50) create(null, (yje) obj2)).invokeSuspend(Unit.f46060a);
                throw null;
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wr50 wr50Var = this.k;
                n0o0 n0o0Var = wr50Var.R1;
                ot50 ot50Var = (ot50) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (ot50Var != null) {
                    int i = 0;
                    if (ot50Var instanceof nt50) {
                        wsz wszVar = wr50.S1;
                        wr50Var.G0().c.setVisibility(8);
                        wr50Var.G0().b.setVisibility(8);
                        ((ProgressBar) wr50Var.G0().e.b).setVisibility(0);
                    } else if (ot50Var instanceof lt50) {
                        ArrayList arrayList = ((lt50) ot50Var).f20614a;
                        wsz wszVar2 = wr50.S1;
                        if (!arrayList.isEmpty()) {
                            wr50Var.G0().c.setVisibility(8);
                        }
                        wr50Var.G0().c.setVisibility(8);
                        ((ProgressBar) wr50Var.G0().e.b).setVisibility(8);
                        wr50Var.G0().b.setVisibility(0);
                        if (wr50Var.G0().b.getAdapter() == null) {
                            wr50Var.G0().b.setAdapter((tn50) n0o0Var.getValue());
                        }
                        ((tn50) n0o0Var.getValue()).G(arrayList);
                    } else if (ot50Var instanceof mt50) {
                        mt50 mt50Var = (mt50) ot50Var;
                        ra10 ra10Var = mt50Var.f22355a;
                        boolean z = mt50Var.b;
                        wsz wszVar3 = wr50.S1;
                        wr50Var.G0().b.setVisibility(8);
                        ((ProgressBar) wr50Var.G0().e.b).setVisibility(8);
                        LottieView lottieView = wr50Var.G0().c;
                        lottieView.v(ra10Var);
                        if (z && ((tn50) n0o0Var.getValue()).d() != 0) {
                            i = 8;
                        }
                        lottieView.setVisibility(i);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                if (this.j != null) {
                    throw new ClassCastException();
                }
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                throw new m460();
        }
    }
}

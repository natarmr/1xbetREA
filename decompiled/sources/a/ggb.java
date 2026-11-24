package a;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes6.dex */
public final class ggb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hgb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggb(hgb hgbVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hgbVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hgb hgbVar = this.k;
        switch (b) {
            case 0:
                ggb ggbVar = new ggb(hgbVar, yjeVar, (byte) 0);
                ggbVar.j = obj;
                return ggbVar;
            case 1:
                ggb ggbVar2 = new ggb(hgbVar, yjeVar, (byte) 1);
                ggbVar2.j = obj;
                return ggbVar2;
            default:
                ggb ggbVar3 = new ggb(hgbVar, yjeVar, (byte) 2);
                ggbVar3.j = obj;
                return ggbVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ggb) create((v26) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ggb) create((p26) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ggb) create((q26) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hgb hgbVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                v26 v26Var = (v26) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (v26Var != null) {
                    if (v26Var instanceof s26) {
                        kl5 kl5Var = hgb.c2;
                        hgbVar.K0(true);
                    } else if (v26Var instanceof t26) {
                        if (hgbVar.R1 == null) {
                            hgbVar.K0(false);
                            t26 t26Var = (t26) v26Var;
                            hgbVar.I0(t26Var.f33201a, t26Var.b);
                        }
                    } else if (v26Var instanceof u26) {
                        zfb zfbVar = hgbVar.R1;
                        if (zfbVar != null) {
                            zfbVar.k = ((u26) v26Var).f34931a;
                        } else {
                            u26 u26Var = (u26) v26Var;
                            hgbVar.I0(u26Var.f34931a, u26Var.b);
                        }
                    } else if ((v26Var instanceof r26) && hgbVar.R1 == null) {
                        jkm jkmVar = ((r26) v26Var).f29715a;
                        xyq xyqVarG0 = hgbVar.G0();
                        xyqVarG0.f.setVisibility(8);
                        xyqVarG0.b.setVisibility(8);
                        hgbVar.J0(false);
                        DSLottieEmptyContainer dSLottieEmptyContainer = xyqVarG0.c;
                        dSLottieEmptyContainer.setVisibility(0);
                        dSLottieEmptyContainer.a(jkmVar);
                    }
                }
                break;
            case 1:
                p26 p26Var = (p26) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(p26Var, m26.b) || Intrinsics.d(p26Var, m26.c)) {
                    kl5 kl5Var2 = hgb.c2;
                    DsNavigationBar dsNavigationBar = hgbVar.G0().d;
                    dsNavigationBar.d.d(ypm.c);
                    hgbVar.G0().d.d.k.setText("");
                    dsNavigationBar.d();
                    dsNavigationBar.g("search");
                } else if (p26Var instanceof n26) {
                    boolean z = ((n26) p26Var).f22784a;
                    kl5 kl5Var3 = hgb.c2;
                    hgbVar.L0(z);
                } else if (p26Var instanceof o26) {
                    boolean z2 = ((o26) p26Var).f24517a;
                    kl5 kl5Var4 = hgb.c2;
                    hgbVar.L0(z2);
                }
                break;
            default:
                q26 q26Var = (q26) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                jk3 jk3Var = hgbVar.X1;
                if (jk3Var != null) {
                    ((TextView) jk3Var.f).setText(q26Var.f27986a);
                    boolean z3 = q26Var.d;
                    int i = R.attr.uikitSecondary40;
                    int i2 = z3 ? R.attr.uikitPrimary : R.attr.uikitSecondary40;
                    if (q26Var.e) {
                        i = R.attr.uikitPrimary;
                    }
                    ((ImageView) jk3Var.d).setImageTintList(ColorStateList.valueOf(m5d.b(i2, hgbVar.o0())));
                    ((ImageView) jk3Var.c).setImageTintList(ColorStateList.valueOf(m5d.b(i, hgbVar.o0())));
                }
                zfb zfbVar2 = hgbVar.R1;
                if (zfbVar2 != null) {
                    zfbVar2.A(q26Var.b, q26Var.c);
                }
                break;
        }
        return Unit.f46060a;
    }
}

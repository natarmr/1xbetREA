package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.makebet_promocodes.api.presentation.models.PromoCodeInfoUiModel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x820 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40443a;
    public final /* synthetic */ b920 b;

    public /* synthetic */ x820(b920 b920Var, byte b) {
        this.f40443a = b;
        this.b = b920Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40443a;
        b920 b920Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                htz htzVar = b920.U1;
                if (iIntValue > 0) {
                    Fragment fragment = b920Var.y;
                    axe axeVar = fragment instanceof axe ? (axe) fragment : null;
                    if (axeVar != null) {
                        axeVar.Q0(iIntValue);
                    }
                }
                break;
            default:
                PromoCodeInfoUiModel promoCodeInfoUiModel = (PromoCodeInfoUiModel) obj;
                htz htzVar2 = b920.U1;
                promoCodeInfoUiModel.getClass();
                b920Var.J0().x(new k420(new jdc0(promoCodeInfoUiModel.b, promoCodeInfoUiModel.e, promoCodeInfoUiModel.f46775a, promoCodeInfoUiModel.c, promoCodeInfoUiModel.d)));
                break;
        }
        return Unit.f46060a;
    }
}

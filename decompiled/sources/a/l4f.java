package a;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.coupon.impl.coupon.presentation.models.CouponTypeUiModel;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l4f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19401a = 0;
    public final /* synthetic */ ejd b;
    public final /* synthetic */ cp c;

    public /* synthetic */ l4f(cp cpVar, ejd ejdVar) {
        this.c = cpVar;
        this.b = ejdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19401a;
        cp cpVar = this.c;
        ejd ejdVar = this.b;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                utx utxVar = (utx) cpVar.u;
                utxVar.b.setTitle(((CouponTypeUiModel) cpVar.u()).f46469a);
                DsSettingsCell dsSettingsCell = utxVar.c;
                dsSettingsCell.setSelected(((CouponTypeUiModel) cpVar.u()).b);
                dsSettingsCell.setEnabled(((CouponTypeUiModel) cpVar.u()).c);
                utxVar.d.setVisibility(!((CouponTypeUiModel) cpVar.u()).d ? 0 : 8);
                dyb.c0(dsSettingsCell, new l4f(ejdVar, cpVar));
                break;
            default:
                ((View) obj).getClass();
                ejdVar.invoke(Integer.valueOf(cpVar.d()));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ l4f(ejd ejdVar, cp cpVar) {
        this.b = ejdVar;
        this.c = cpVar;
    }
}

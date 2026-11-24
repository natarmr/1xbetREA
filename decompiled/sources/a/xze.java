package a;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class xze extends zx5 {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xze(androidx.fragment.app.e eVar, glz glzVar, List list, byte b) {
        super(eVar, glzVar, list);
        this.o = b;
    }

    @Override // a.f5r
    public final Fragment B(int i) {
        byte b = this.o;
        Object obj = this.n;
        switch (b) {
            case 0:
                ko7 ko7Var = (ko7) ((ArrayList) obj).get(i);
                if (Intrinsics.d(ko7Var, jo7.b)) {
                    gze.S1.getClass();
                    return new gze();
                }
                if (Intrinsics.d(ko7Var, io7.b)) {
                    xye.U1.getClass();
                    return new xye();
                }
                if (ko7Var instanceof ho7) {
                    rye.S1.getClass();
                    return new rye();
                }
                t9f.b();
                return null;
            default:
                y6q y6qVar = (y6q) ((ArrayList) obj).get(i);
                if (y6qVar != null) {
                    if (y6qVar instanceof x6q) {
                        eke0 eke0Var = kvj0.S1;
                        FinBetInfoModel finBetInfoModel = ((x6q) y6qVar).f40375a;
                        eke0Var.getClass();
                        finBetInfoModel.getClass();
                        kvj0 kvj0Var = new kvj0();
                        kvj0Var.R1.J(kvj0Var, kvj0.U1[1], finBetInfoModel);
                        return kvj0Var;
                    }
                    if (y6qVar instanceof w6q) {
                        jh70 jh70Var = idc0.S1;
                        FinBetInfoModel finBetInfoModel2 = ((w6q) y6qVar).f38636a;
                        jh70Var.getClass();
                        finBetInfoModel2.getClass();
                        idc0 idc0Var = new idc0();
                        idc0Var.Q1.J(idc0Var, idc0.U1[1], finBetInfoModel2);
                        return idc0Var;
                    }
                }
                t9f.b();
                return null;
        }
    }
}

package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.dota.impl.presentation.common.DotaAdditionalTeamInformationView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y1l implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41860a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y1l(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.f41860a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f41860a;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                s1g s1gVar = (s1g) obj7;
                j8l j8lVar = (j8l) obj6;
                DotaAdditionalTeamInformationView dotaAdditionalTeamInformationView = (DotaAdditionalTeamInformationView) obj5;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                int i = DotaAdditionalTeamInformationView.k;
                if (s1gVar != null) {
                    s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                }
                int measuredHeight = (this.b - j8lVar.getMeasuredHeight()) / 2;
                float f = iIntValue + dotaAdditionalTeamInformationView.f;
                j8lVar.layout((int) f, measuredHeight, (int) (j8lVar.getMeasuredWidth() + f), j8lVar.getMeasuredHeight() + measuredHeight);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj7;
                xdr xdrVar = (xdr) obj6;
                Function1 function1 = (Function1) obj5;
                int iIntValue5 = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= fetVar.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar.U(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    xo5 xo5Var = (xo5) CollectionsKt.W(iIntValue5, arrayList);
                    if (xo5Var == null) {
                        fetVar.e0(867311503);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(867311504);
                        y860.t(null, xo5Var, this.b, xdrVar, function1, fetVar, 64);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}

package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class inr implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15086a = 0;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ inr(int i, ArrayList arrayList, l7m0 l7m0Var) {
        this.d = i;
        this.b = arrayList;
        this.c = l7m0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        byte b = this.f15086a;
        int iIntValue = this.d;
        l7m0 l7m0Var = this.c;
        ArrayList<pu90> arrayList = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                for (pu90 pu90Var : arrayList) {
                    Object objN = pu90Var.n();
                    s40 s40Var = objN instanceof s40 ? (s40) objN : null;
                    String str = s40Var != null ? s40Var.b : null;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1115846164:
                                if (str.equals("COMPRESSED_CARD_ID")) {
                                    ou90Var.m(pu90Var, 0, iIntValue, 0.0f);
                                    i = pu90Var.b;
                                }
                                break;
                            case -806678009:
                                if (str.equals("SIMULATION")) {
                                    ou90Var.m(pu90Var, 0, iIntValue, 0.0f);
                                    i = pu90Var.b;
                                }
                                break;
                            case -473046405:
                                if (str.equals("BETTING_ID")) {
                                    ou90Var.m(pu90Var, 0, iIntValue, 0.0f);
                                } else {
                                    continue;
                                }
                                break;
                            case -325638805:
                                if (str.equals("INDICATOR_ID")) {
                                    ou90Var.m(pu90Var, 0, hne.d(((Number) l7m0Var.getValue()).intValue(), pu90Var.b, 2, iIntValue), 0.0f);
                                    iIntValue = ((Number) l7m0Var.getValue()).intValue() + iIntValue;
                                } else {
                                    continue;
                                }
                                break;
                            case 543708287:
                                if (str.equals("TOOLBAR_ID")) {
                                    ou90Var.m(pu90Var, 0, iIntValue, 0.0f);
                                    i = pu90Var.b;
                                }
                                break;
                            case 775328663:
                                if (str.equals("CARDS_ID")) {
                                    ou90Var.m(pu90Var, 0, iIntValue, 0.0f);
                                    i = pu90Var.b;
                                }
                                break;
                            case 1222669772:
                                if (str.equals("BACKGROUND_ID")) {
                                    ou90Var.m(pu90Var, 0, 0, 0.0f);
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                continue;
                        }
                        iIntValue += i;
                    }
                }
                break;
            default:
                ou90Var.getClass();
                int i3 = 0;
                for (pu90 pu90Var2 : arrayList) {
                    Object objN2 = pu90Var2.n();
                    coc cocVar = objN2 instanceof coc ? (coc) objN2 : null;
                    String str2 = cocVar != null ? cocVar.b : null;
                    if (str2 != null) {
                        switch (str2.hashCode()) {
                            case -1828029915:
                                if (str2.equals("TAB_ID")) {
                                    ou90Var.m(pu90Var2, 0, i3, 0.0f);
                                    i2 = pu90Var2.b;
                                }
                                break;
                            case -1115846164:
                                if (str2.equals("COMPRESSED_CARD_ID")) {
                                    ou90Var.m(pu90Var2, 0, i3, 0.0f);
                                    i2 = pu90Var2.b;
                                }
                                break;
                            case -806678009:
                                if (str2.equals("SIMULATION")) {
                                    ou90Var.m(pu90Var2, 0, i3, 0.0f);
                                    i2 = pu90Var2.b;
                                }
                                break;
                            case -325638805:
                                if (str2.equals("INDICATOR_ID")) {
                                    int iIntValue2 = ((Number) l7m0Var.getValue()).intValue() + i3;
                                    ou90Var.m(pu90Var2, 0, iIntValue2, 0.0f);
                                    i3 = pu90Var2.b + iIntValue + iIntValue2;
                                } else {
                                    continue;
                                }
                                break;
                            case 645865181:
                                if (str2.equals("CARD_BACKGROUND_ID")) {
                                    ou90Var.m(pu90Var2, 0, 0, 0.0f);
                                } else {
                                    continue;
                                }
                                break;
                            case 775328663:
                                if (str2.equals("CARDS_ID")) {
                                    ou90Var.m(pu90Var2, 0, i3, 0.0f);
                                    i2 = pu90Var2.b;
                                }
                                break;
                            default:
                                continue;
                        }
                        i3 += i2;
                    }
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ inr(ArrayList arrayList, l7m0 l7m0Var, int i) {
        this.b = arrayList;
        this.c = l7m0Var;
        this.d = i;
    }
}

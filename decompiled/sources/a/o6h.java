package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o6h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24735a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ o6h(int i, ArrayList arrayList) {
        this.b = i;
        this.c = arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        byte b = this.f24735a;
        ArrayList<pu90> arrayList = this.c;
        int i2 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                int i3 = 0;
                int i4 = 0;
                for (Object obj2 : arrayList) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pu90 pu90Var = (pu90) obj2;
                    ou90Var.g(pu90Var, 0, i4, 0.0f);
                    i4 += pu90Var.b;
                    if (i3 < arrayList.size() - 1) {
                        i4 += i2;
                    }
                    i3 = i5;
                }
                return Unit.f46060a;
            default:
                ou90Var.getClass();
                for (pu90 pu90Var2 : arrayList) {
                    Object objN = pu90Var2.n();
                    coc cocVar = objN instanceof coc ? (coc) objN : null;
                    String str = cocVar != null ? cocVar.b : null;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case 543708287:
                                if (str.equals("TOOLBAR_ID")) {
                                    ou90Var.m(pu90Var2, 0, i2, 0.0f);
                                    i = pu90Var2.b;
                                }
                                break;
                            case 1222669772:
                                if (str.equals("BACKGROUND_ID")) {
                                    ou90Var.m(pu90Var2, 0, 0, 0.0f);
                                } else {
                                    continue;
                                }
                                break;
                            case 1603285699:
                                if (str.equals("MARKETS_ID")) {
                                    ou90Var.m(pu90Var2, 0, i2, 0.0f);
                                } else {
                                    continue;
                                }
                                break;
                            case 1712279303:
                                if (str.equals("INFORMATION_BOARD_ID")) {
                                    ou90Var.m(pu90Var2, 0, i2, 0.0f);
                                    i = pu90Var2.b;
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 += i;
                    }
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ o6h(ArrayList arrayList, int i) {
        this.c = arrayList;
        this.b = i;
    }
}

package a;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d87 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5631a;
    public final /* synthetic */ HistoryTypeModel b;

    public /* synthetic */ d87(HistoryTypeModel historyTypeModel, byte b) {
        this.f5631a = b;
        this.b = historyTypeModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5631a) {
            case 0:
                i77 i77Var = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var.getClass();
                return i77.a(i77Var, true, false, false, null, null, null, this.b, false, null, null, false, false, false, null, new ArrayList(), null, null, false, null, true, false, false, null, null, new HashMap(), null, null, -17301762, 2045);
            default:
                i77 i77Var2 = (i77) obj2;
                ((oyg0) obj).getClass();
                i77Var2.getClass();
                return i77.a(i77Var2, true, false, false, null, null, null, this.b, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -258, 2047);
        }
    }
}

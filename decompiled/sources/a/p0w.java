package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class p0w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26172a;
    public final /* synthetic */ q0w b;

    public /* synthetic */ p0w(q0w q0wVar, byte b) {
        this.f26172a = b;
        this.b = q0wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26172a;
        q0w q0wVar = this.b;
        switch (b) {
            case 0:
                HistoryDateFilterTypeModel historyDateFilterTypeModel = HistoryDateFilterTypeModel.f46397a;
                tqt tqtVar = q0w.m2;
                q0wVar.P0(historyDateFilterTypeModel);
                break;
            case 1:
                HistoryDateFilterTypeModel historyDateFilterTypeModel2 = HistoryDateFilterTypeModel.f46397a;
                tqt tqtVar2 = q0w.m2;
                q0wVar.P0(historyDateFilterTypeModel2);
                break;
            case 2:
                HistoryDateFilterTypeModel historyDateFilterTypeModel3 = HistoryDateFilterTypeModel.b;
                tqt tqtVar3 = q0w.m2;
                q0wVar.P0(historyDateFilterTypeModel3);
                break;
            case 3:
                HistoryDateFilterTypeModel historyDateFilterTypeModel4 = HistoryDateFilterTypeModel.b;
                tqt tqtVar4 = q0w.m2;
                q0wVar.P0(historyDateFilterTypeModel4);
                break;
            case 4:
                HistoryDateFilterTypeModel historyDateFilterTypeModel5 = HistoryDateFilterTypeModel.c;
                tqt tqtVar5 = q0w.m2;
                q0wVar.P0(historyDateFilterTypeModel5);
                break;
            case 5:
                HistoryDateFilterTypeModel historyDateFilterTypeModel6 = HistoryDateFilterTypeModel.c;
                tqt tqtVar6 = q0w.m2;
                q0wVar.P0(historyDateFilterTypeModel6);
                break;
            default:
                HistoryDateFilterTypeModel historyDateFilterTypeModel7 = HistoryDateFilterTypeModel.d;
                tqt tqtVar7 = q0w.m2;
                q0wVar.P0(historyDateFilterTypeModel7);
                break;
        }
        return Unit.f46060a;
    }
}

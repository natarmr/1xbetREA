package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e630 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7262a;
    public final /* synthetic */ i630 b;

    public /* synthetic */ e630(i630 i630Var, byte b) {
        this.f7262a = b;
        this.b = i630Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7262a;
        i630 i630Var = this.b;
        switch (b) {
            case 0:
                evz evzVar = i630.k2;
                i630Var.T0().w();
                return Unit.f46060a;
            case 1:
                evz evzVar2 = i630.k2;
                fiu0 fiu0Var = i630Var.c2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                evz evzVar3 = i630.k2;
                return new xx6((u530) i630Var.j2.getValue());
            case 3:
                evz evzVar4 = i630.k2;
                return new u530(new f630(i630Var, (byte) 0), new du20(1, i630Var.T0(), f730.class, "onActionClicked", "onActionClicked(Lorg/xplatform/cyber/game/core/betting/presentation/markets/model/SettingActionType;)V", 0, (byte) 8), new du20(1, i630Var.T0(), f730.class, "onMarketClicked", "onMarketClicked(Lorg/xplatform/cyber/game/core/betting/presentation/markets/model/MarketSettingUiModel;)V", 0, (byte) 9), new e000(2, i630Var.T0(), f730.class, "onItemMoved", "onItemMoved(II)V", 0, (byte) 21), new o0t(0, i630Var.T0(), f730.class, "onMarketsPositionChanged", "onMarketsPositionChanged()V", 0, (byte) 22));
            default:
                evz evzVar5 = i630.k2;
                f730 f730VarT0 = i630Var.T0();
                sac.V(jiu0.a(f730VarT0), new du20(1, f730VarT0.j, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, null, new b730(f730VarT0, null, (byte) 2), 14);
                return Unit.f46060a;
        }
    }
}

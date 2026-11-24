package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.statistic.winter_games.impl.winter_game_result.presentation.WinterGamesResultsTableFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class amv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1125a;
    public final /* synthetic */ emv0 b;

    public /* synthetic */ amv0(emv0 emv0Var, byte b) {
        this.f1125a = b;
        this.b = emv0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1125a;
        emv0 emv0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                emv0Var.t.b(th, new ggt0(emv0Var, (byte) 22));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new WinterGamesResultsTableFragmentScreen(((vlv0) emv0Var.D()).j, emv0Var.r));
                break;
        }
        return Unit.f46060a;
    }
}

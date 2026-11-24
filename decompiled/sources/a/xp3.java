package a;

import android.view.View;
import kotlin.jvm.functions.Function1;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneGameView;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldGameView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsGameView;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardBottomView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xp3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41249a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ xp3(Function1 function1, byte b) {
        this.f41249a = b;
        this.b = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f41249a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                int i = AppleFortuneGameView.t;
                function1.invoke(view);
                break;
            case 1:
                int i2 = DragonsGoldGameView.u;
                function1.invoke(view);
                break;
            case 2:
                int i3 = EasternNightsGameView.u;
                function1.invoke(view);
                break;
            case 3:
                int i4 = ExpressCardBottomView.r;
                function1.invoke(view);
                break;
            case 4:
                function1.invoke(view);
                break;
            default:
                function1.invoke(view);
                break;
        }
    }
}

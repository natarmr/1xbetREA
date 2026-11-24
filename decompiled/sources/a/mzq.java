package a;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentContainerView;
import org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view.RussianLottoVerticalTextView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.footer.DsFooter;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final class mzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22666a;
    public final View b;

    public /* synthetic */ mzq(View view, byte b) {
        this.f22666a = b;
        this.b = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f22666a;
        View view = this.b;
        switch (b) {
            case 0:
                return (FragmentContainerView) view;
            case 1:
                return (DsLottieEmpty) view;
            case 2:
                return (ViewStub) view;
            case 3:
                return (DsShimmerView) view;
            case 4:
                return view;
            case 5:
                return (DsFooter) view;
            case 6:
                return (RussianLottoVerticalTextView) view;
            default:
                return (DsButton) view;
        }
    }
}

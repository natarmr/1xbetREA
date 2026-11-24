package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class xr3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41349a;
    public final /* synthetic */ ApplicationActivity b;

    public /* synthetic */ xr3(ApplicationActivity applicationActivity, byte b) {
        this.f41349a = b;
        this.b = applicationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41349a;
        ApplicationActivity applicationActivity = this.b;
        switch (b) {
            case 0:
                LayoutInflater layoutInflater = applicationActivity.getLayoutInflater();
                layoutInflater.getClass();
                View viewInflate = layoutInflater.inflate(R.layout.activity_intellij, (ViewGroup) null, false);
                int i = R.id.activityFragmentContainer;
                FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate, R.id.activityFragmentContainer);
                if (frameLayout != null) {
                    FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                    i = R.id.displayStateView;
                    ComposeView composeView = (ComposeView) yum0.f(viewInflate, R.id.displayStateView);
                    if (composeView != null) {
                        i = R.id.onboardingView;
                        ComposeView composeView2 = (ComposeView) yum0.f(viewInflate, R.id.onboardingView);
                        if (composeView2 != null) {
                            return new sn(frameLayout2, frameLayout, frameLayout2, composeView, composeView2);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            case 1:
                return applicationActivity.g();
            default:
                return applicationActivity.o();
        }
    }
}

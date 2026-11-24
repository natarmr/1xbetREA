package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final class ewe implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8520a;
    public final ConstraintLayout b;

    public /* synthetic */ ewe(ConstraintLayout constraintLayout, byte b) {
        this.f8520a = b;
        this.b = constraintLayout;
    }

    public static ewe a(View view) {
        int i = R.id.separator1;
        if (((DsSeparator) yum0.f(view, R.id.separator1)) != null) {
            i = R.id.separator2;
            if (((DsSeparator) yum0.f(view, R.id.separator2)) != null) {
                i = R.id.separator3;
                if (((DsSeparator) yum0.f(view, R.id.separator3)) != null) {
                    i = R.id.view1Left;
                    if (((DsShimmerView) yum0.f(view, R.id.view1Left)) != null) {
                        i = R.id.view1Right;
                        if (((DsShimmerView) yum0.f(view, R.id.view1Right)) != null) {
                            i = R.id.view2Left;
                            if (((DsShimmerView) yum0.f(view, R.id.view2Left)) != null) {
                                i = R.id.view2Right;
                                if (((DsShimmerView) yum0.f(view, R.id.view2Right)) != null) {
                                    i = R.id.view3Left;
                                    if (((DsShimmerView) yum0.f(view, R.id.view3Left)) != null) {
                                        i = R.id.view3Right;
                                        if (((DsShimmerView) yum0.f(view, R.id.view3Right)) != null) {
                                            i = R.id.view4Left;
                                            if (((DsShimmerView) yum0.f(view, R.id.view4Left)) != null) {
                                                i = R.id.view4Right;
                                                if (((DsShimmerView) yum0.f(view, R.id.view4Right)) != null) {
                                                    return new ewe((ConstraintLayout) view, (byte) 5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f8520a;
        return this.b;
    }
}

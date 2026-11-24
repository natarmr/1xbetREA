package a;

import android.content.Context;
import android.javax.sip.message.Response;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class axc extends v46 {
    public final String u;
    public final String v;
    public final boolean w;
    public final Function1 x;
    public final uk5 y;
    public siq z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axc(String str, String str2, boolean z, lya lyaVar, View view) {
        super(view);
        str.getClass();
        str2.getClass();
        lyaVar.getClass();
        view.getClass();
        this.u = str;
        this.v = str2;
        this.w = z;
        this.x = lyaVar;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) yum0.f(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i = R.id.bannerContent;
            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.bannerContent);
            if (frameLayout != null) {
                i = R.id.bannerImage;
                LoadableShapeableImageView loadableShapeableImageView = (LoadableShapeableImageView) yum0.f(view, R.id.bannerImage);
                if (loadableShapeableImageView != null) {
                    i = R.id.cmsBannerProgress;
                    View viewF = yum0.f(view, R.id.cmsBannerProgress);
                    if (viewF != null) {
                        ProgressBar progressBar = (ProgressBar) viewF;
                        nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                        i = R.id.collapsingToolbarLayout;
                        if (((CollapsingToolbarLayout) yum0.f(view, R.id.collapsingToolbarLayout)) != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                            i = R.id.nestedScroll;
                            NestedScrollView nestedScrollView = (NestedScrollView) yum0.f(view, R.id.nestedScroll);
                            if (nestedScrollView != null) {
                                this.y = new uk5(coordinatorLayout, appBarLayout, frameLayout, loadableShapeableImageView, nq8Var, nestedScrollView);
                                return;
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // a.v46
    public final void t(Object obj) {
        uvc uvcVar = (uvc) obj;
        uvcVar.getClass();
        uk5 uk5Var = this.y;
        ((ProgressBar) ((nq8) uk5Var.f).c).setVisibility(0);
        NestedScrollView nestedScrollView = (NestedScrollView) uk5Var.g;
        nestedScrollView.setVisibility(4);
        LoadableShapeableImageView loadableShapeableImageView = (LoadableShapeableImageView) uk5Var.e;
        loadableShapeableImageView.setVisibility(4);
        if (this.z == null) {
            Context context = this.f40887a.getContext();
            context.getClass();
            siq siqVar = new siq(context);
            siqVar.setVerticalScrollBarEnabled(false);
            siqVar.setHorizontalScrollBarEnabled(false);
            this.z = siqVar;
            ((FrameLayout) uk5Var.d).addView(siqVar);
        }
        siq siqVar2 = this.z;
        if (siqVar2 != null) {
            siqVar2.getSettings().setTextZoom(100);
            siqVar2.getSettings().setSupportZoom(false);
            siqVar2.setInitialScale(100);
            siqVar2.setLayerType(2, null);
            nestedScrollView.setScrollY(0);
            ((AppBarLayout) uk5Var.c).g(true, false, true);
            siqVar2.setFixedWebViewClient(new zwc(uk5Var, this));
            siqVar2.loadDataWithBaseURL(this.u, b1j.k("<html><head>", this.v, "</head>", uvcVar.k, "</html>"), "text/html", "utf-8", null);
        }
        int i = this.w ? R.drawable.news_placeholder_dark : R.drawable.news_placeholder_light;
        List list = u0d.f34849a;
        u0d.j(loadableShapeableImageView, uvcVar.b, i, i, null, null, null, Response.SERVER_TIMEOUT);
    }
}

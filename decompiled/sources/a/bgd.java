package a;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.tooling.PreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class bgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f2549a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(PreviewActivity previewActivity, ugd ugdVar) {
        View childAt = ((ViewGroup) previewActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(ugdVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(previewActivity, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(ugdVar);
        View decorView = previewActivity.getWindow().getDecorView();
        if (s7n0.l(decorView) == null) {
            decorView.setTag(org.xbet.client1.R.id.view_tree_lifecycle_owner, previewActivity);
        }
        if (n8n0.h(decorView) == null) {
            decorView.setTag(org.xbet.client1.R.id.view_tree_view_model_store_owner, previewActivity);
        }
        if (w7n0.p(decorView) == null) {
            decorView.setTag(org.xbet.client1.R.id.view_tree_saved_state_registry_owner, previewActivity);
        }
        previewActivity.setContentView(composeView2, f2549a);
    }
}

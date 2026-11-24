package a;

import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class sgu0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32180a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ sgu0(x1 x1Var, byte b) {
        this.f32180a = b;
        this.b = x1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.f32180a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.f32180a;
        x1 x1Var = this.b;
        switch (b) {
            case 0:
                x1Var.e();
                break;
            default:
                for (Object obj : lgi0.e(ohu0.f25282a, x1Var.getParent())) {
                    if (obj instanceof View) {
                        View view2 = (View) obj;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                x1Var.e();
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}

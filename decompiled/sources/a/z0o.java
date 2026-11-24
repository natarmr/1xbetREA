package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z0o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0o f43578a = new z0o(3, db10.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/authenticator/impl/databinding/LottieEmptyConfigBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.lottie_empty_config, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) viewInflate;
            return new db10(dSLottieEmptyContainer, dSLottieEmptyContainer);
        }
        hny.u("rootView");
        return null;
    }
}

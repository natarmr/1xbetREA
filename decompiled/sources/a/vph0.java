package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vph0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vph0 f37806a = new vph0(3, mzq.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/security/impl/databinding/FragmentContainerLayoutBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_container_layout, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            return new mzq((FragmentContainerView) viewInflate, (byte) 0);
        }
        hny.u("rootView");
        return null;
    }
}

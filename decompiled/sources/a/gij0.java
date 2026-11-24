package a;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gij0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gij0 f11350a = new gij0(3, ixx.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/settings/impl/databinding/ItemSettingsCellAccordionArrowBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        return ixx.a(layoutInflater, (ViewGroup) obj2, zBooleanValue);
    }
}

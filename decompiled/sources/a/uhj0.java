package a;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uhj0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uhj0 f35682a = new uhj0(3, kxx.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/settings/impl/databinding/ItemSettingsCellBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        return kxx.a(layoutInflater, (ViewGroup) obj2, zBooleanValue);
    }
}

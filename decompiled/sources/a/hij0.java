package a;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hij0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hij0 f13115a = new hij0(3, lxx.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/settings/impl/databinding/ItemSettingsRoundedCellBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        return lxx.a(layoutInflater, (ViewGroup) obj2, zBooleanValue);
    }
}

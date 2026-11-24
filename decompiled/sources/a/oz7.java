package a;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oz7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26092a;
    public final /* synthetic */ View b;

    public /* synthetic */ oz7(View view, byte b) {
        this.f26092a = b;
        this.b = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26092a;
        boolean z = false;
        View view = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ((lwk) obj).getClass();
                view.setKeepScreenOn(true);
                return new pz7(view, z ? (byte) 1 : (byte) 0);
            case 1:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(weakReference.get() == view);
            case 2:
                WeakReference weakReference2 = (WeakReference) obj;
                weakReference2.getClass();
                return Boolean.valueOf(weakReference2.get() == view);
            case 3:
                ((lwk) obj).getClass();
                ujk.a(view, true);
                return new pz7(view, b2);
            default:
                ((lwk) obj).getClass();
                wly wlyVar = new wly(view, (byte) 1);
                view.getViewTreeObserver().addOnWindowFocusChangeListener(wlyVar);
                return new pr0(view, wlyVar, (byte) 29);
        }
    }
}

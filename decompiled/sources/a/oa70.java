package a;

import android.app.Activity;
import android.view.Window;

/* JADX INFO: loaded from: classes5.dex */
public final class oa70 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24916a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oa70(Object obj, int i, byte b) {
        this.f24916a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // a.kwk
    public final void a() {
        Window window;
        byte b = this.f24916a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                cjv0 cjv0Var = (cjv0) obj;
                if (cjv0Var != null) {
                    cjv0Var.c(i);
                    cjv0Var.d(519);
                }
                break;
            case 1:
                Activity activity = (Activity) obj;
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.setSoftInputMode(i);
                    break;
                }
                break;
            default:
                ((ngk0) obj).remove(Integer.valueOf(i));
                break;
        }
    }
}

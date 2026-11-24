package a;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q7y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28273a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q7y(Object obj, Object obj2, boolean z, boolean z2, byte b) {
        this.f28273a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f28273a;
        boolean z = false;
        boolean z2 = this.c;
        boolean z3 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Window window = (Window) obj2;
                View view = (View) obj;
                if (window != null) {
                    Context context = view.getContext();
                    context.getClass();
                    int i = z3 ? R.attr.uikitStaticBlack : R.attr.uikitBackgroundContent;
                    boolean z4 = !z3;
                    if (!z3 && !z2) {
                        z = true;
                    }
                    ofm0.y(window, context, R.attr.uikitStaticTransparent, i, z4, z);
                }
                break;
            default:
                ((AtomicBoolean) obj).set(false);
                ((hcp0) ((m9c) obj2).c).v(z3, z2);
                break;
        }
    }
}

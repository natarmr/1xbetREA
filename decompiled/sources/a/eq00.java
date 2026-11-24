package a;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eq00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8211a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ LoadableImageView c;

    public /* synthetic */ eq00(Function1 function1, LoadableImageView loadableImageView, byte b) {
        this.f8211a = b;
        this.b = function1;
        this.c = loadableImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8211a;
        boolean z = true;
        z = true;
        boolean z2 = true;
        z = true;
        boolean z3 = true;
        z = true;
        boolean z4 = true;
        z = true;
        boolean z5 = true;
        z = true;
        final byte b2 = 0;
        LoadableImageView loadableImageView = this.c;
        final Function1 function1 = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                int i = LoadableImageView.i;
                if (!((Boolean) function1.invoke(th)).booleanValue() && !((Boolean) loadableImageView.h.invoke(th)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Drawable drawable = (Drawable) obj;
                int i2 = LoadableImageView.i;
                drawable.getClass();
                if (!((Boolean) function1.invoke(drawable)).booleanValue() && !((Boolean) loadableImageView.g.invoke(drawable)).booleanValue()) {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 2:
                int i3 = LoadableImageView.i;
                loadableImageView.post(new b1(function1, (Throwable) obj, loadableImageView));
                break;
            case 3:
                final Drawable drawable2 = (Drawable) obj;
                int i4 = LoadableImageView.i;
                drawable2.getClass();
                loadableImageView.post(new Runnable() { // from class: a.fq00
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        Drawable drawable3 = drawable2;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                int i5 = LoadableImageView.i;
                                function2.invoke(drawable3);
                                break;
                            default:
                                int i6 = LoadableImageView.i;
                                function2.invoke(drawable3);
                                break;
                        }
                    }
                });
                break;
            case 4:
                final Drawable drawable3 = (Drawable) obj;
                int i5 = LoadableImageView.i;
                drawable3.getClass();
                final byte b3 = z ? (byte) 1 : (byte) 0;
                loadableImageView.post(new Runnable() { // from class: a.fq00
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        Drawable drawable4 = drawable3;
                        Function1 function2 = function1;
                        switch (b4) {
                            case 0:
                                int i6 = LoadableImageView.i;
                                function2.invoke(drawable4);
                                break;
                            default:
                                int i7 = LoadableImageView.i;
                                function2.invoke(drawable4);
                                break;
                        }
                    }
                });
                break;
            case 5:
                int i6 = LoadableImageView.i;
                loadableImageView.post(new llo(function1, (Throwable) obj, (byte) 16));
                break;
            case 6:
                Drawable drawable4 = (Drawable) obj;
                int i7 = LoadableImageView.i;
                drawable4.getClass();
                if (!((Boolean) function1.invoke(drawable4)).booleanValue() && !((Boolean) loadableImageView.g.invoke(drawable4)).booleanValue()) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 7:
                Throwable th2 = (Throwable) obj;
                int i8 = LoadableImageView.i;
                if (!((Boolean) function1.invoke(th2)).booleanValue() && !((Boolean) loadableImageView.h.invoke(th2)).booleanValue()) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                Drawable drawable5 = (Drawable) obj;
                int i9 = LoadableImageView.i;
                drawable5.getClass();
                if (!((Boolean) function1.invoke(drawable5)).booleanValue() && !((Boolean) loadableImageView.g.invoke(drawable5)).booleanValue()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
        return Boolean.FALSE;
    }

    public /* synthetic */ eq00(LoadableImageView loadableImageView, Function1 function1, byte b) {
        this.f8211a = b;
        this.c = loadableImageView;
        this.b = function1;
    }
}

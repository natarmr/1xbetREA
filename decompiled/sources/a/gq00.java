package a;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gq00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11708a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ LoadableShapeableImageView c;

    public /* synthetic */ gq00(Function1 function1, LoadableShapeableImageView loadableShapeableImageView, byte b) {
        this.f11708a = b;
        this.b = function1;
        this.c = loadableShapeableImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11708a;
        boolean z = true;
        LoadableShapeableImageView loadableShapeableImageView = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                Drawable drawable = (Drawable) obj;
                int i = LoadableShapeableImageView.B;
                drawable.getClass();
                if (!((Boolean) function1.invoke(drawable)).booleanValue() && !((Boolean) loadableShapeableImageView.y.invoke(drawable)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Throwable th = (Throwable) obj;
                int i2 = LoadableShapeableImageView.B;
                if (!((Boolean) function1.invoke(th)).booleanValue() && !((Boolean) loadableShapeableImageView.z.invoke(th)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                Drawable drawable2 = (Drawable) obj;
                int i3 = LoadableShapeableImageView.B;
                drawable2.getClass();
                if (!((Boolean) function1.invoke(drawable2)).booleanValue() && !((Boolean) loadableShapeableImageView.y.invoke(drawable2)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                Throwable th2 = (Throwable) obj;
                int i4 = LoadableShapeableImageView.B;
                if (!((Boolean) function1.invoke(th2)).booleanValue() && !((Boolean) loadableShapeableImageView.z.invoke(th2)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                Drawable drawable3 = (Drawable) obj;
                int i5 = LoadableShapeableImageView.B;
                drawable3.getClass();
                if (!((Boolean) function1.invoke(drawable3)).booleanValue() && !((Boolean) loadableShapeableImageView.y.invoke(drawable3)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Throwable th3 = (Throwable) obj;
                int i6 = LoadableShapeableImageView.B;
                if (!((Boolean) function1.invoke(th3)).booleanValue() && !((Boolean) loadableShapeableImageView.z.invoke(th3)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}

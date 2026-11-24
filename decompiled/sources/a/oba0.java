package a;

import android.view.TextureView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oba0 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oba0 f24970a = new oba0(2, my90.class, "clearVideoTextureView", "clearVideoTextureView(Landroid/view/TextureView;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        my90 my90Var = (my90) obj;
        TextureView textureView = (TextureView) obj2;
        my90Var.getClass();
        ulo uloVar = (ulo) my90Var;
        uloVar.c0();
        if (textureView != null && textureView == uloVar.X) {
            uloVar.d();
        }
        return Unit.f46060a;
    }
}

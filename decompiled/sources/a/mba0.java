package a;

import android.content.Context;
import android.view.TextureView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mba0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mba0 f21498a = new mba0(1, TextureView.class, "<init>", "<init>(Landroid/content/Context;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        return new TextureView(context);
    }
}

package a;

import android.content.Context;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.common.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ibk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14492a;
    public final /* synthetic */ org.xplatform.ui_core.viewcomponents.smart_background.e b;

    public /* synthetic */ ibk0(org.xplatform.ui_core.viewcomponents.smart_background.e eVar, byte b) {
        this.f14492a = b;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14492a;
        org.xplatform.ui_core.viewcomponents.smart_background.e eVar = this.b;
        switch (b) {
            case 0:
                ulo uloVar = eVar.b;
                if (uloVar != null) {
                    uloVar.N(MediaItem.a(eVar.c));
                }
                ulo uloVar2 = eVar.b;
                if (uloVar2 != null) {
                    uloVar2.E();
                }
                break;
            default:
                AppCompatImageView appCompatImageView = (AppCompatImageView) eVar.f47205a.c;
                TypedValue typedValue = j5d.f15927a;
                Context context = eVar.getContext();
                context.getClass();
                appCompatImageView.setImageResource(j5d.a(context, R.attr.uikitSplashBackground, true));
                break;
        }
        return Unit.f46060a;
    }
}

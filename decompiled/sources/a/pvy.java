package a;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesSingleItem;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pvy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27684a;
    public final /* synthetic */ LargeBannerGamesSingleItem b;
    public final /* synthetic */ n0x c;

    public /* synthetic */ pvy(LargeBannerGamesSingleItem largeBannerGamesSingleItem, n0x n0xVar, byte b) {
        this.f27684a = b;
        this.b = largeBannerGamesSingleItem;
        this.c = n0xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27684a;
        n0x n0xVar = this.c;
        LargeBannerGamesSingleItem largeBannerGamesSingleItem = this.b;
        Drawable drawable = (Drawable) obj;
        switch (b) {
            case 0:
                int i = LargeBannerGamesSingleItem.l;
                drawable.getClass();
                largeBannerGamesSingleItem.k = n0xVar.f22722a;
                break;
            default:
                int i2 = LargeBannerGamesSingleItem.l;
                drawable.getClass();
                largeBannerGamesSingleItem.k = n0xVar.f22722a;
                break;
        }
        return Boolean.FALSE;
    }
}

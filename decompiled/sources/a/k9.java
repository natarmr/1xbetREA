package a;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17893a;
    public final /* synthetic */ DsCellRightBanner b;

    public /* synthetic */ k9(DsCellRightBanner dsCellRightBanner, byte b) {
        this.f17893a = b;
        this.b = dsCellRightBanner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17893a;
        DsCellRightBanner dsCellRightBanner = this.b;
        switch (b) {
            case 0:
                dsCellRightBanner.setImageDrawable((Drawable) obj);
                dsCellRightBanner.onRtlPropertiesChanged(dsCellRightBanner.getLayoutDirection());
                break;
            case 1:
                dsCellRightBanner.setImageDrawable(null);
                break;
            case 2:
                dsCellRightBanner.setImageDrawable((Drawable) obj);
                dsCellRightBanner.onRtlPropertiesChanged(dsCellRightBanner.getLayoutDirection());
                break;
            case 3:
                dsCellRightBanner.setImageDrawable(null);
                break;
            case 4:
                dsCellRightBanner.setImageDrawable((Drawable) obj);
                dsCellRightBanner.onRtlPropertiesChanged(dsCellRightBanner.getLayoutDirection());
                break;
            case 5:
                dsCellRightBanner.setImageDrawable(null);
                break;
            case 6:
                dsCellRightBanner.setImageDrawable((Drawable) obj);
                dsCellRightBanner.onRtlPropertiesChanged(dsCellRightBanner.getLayoutDirection());
                break;
            case 7:
                dsCellRightBanner.setImageDrawable(null);
                break;
            case 8:
                dsCellRightBanner.setImageDrawable((Drawable) obj);
                dsCellRightBanner.onRtlPropertiesChanged(dsCellRightBanner.getLayoutDirection());
                break;
            case 9:
                dsCellRightBanner.setImageDrawable(null);
                break;
            case 10:
                dsCellRightBanner.setImageDrawable((Drawable) obj);
                dsCellRightBanner.onRtlPropertiesChanged(dsCellRightBanner.getLayoutDirection());
                break;
            case 11:
                dsCellRightBanner.setImageDrawable(null);
                break;
            case 12:
                dsCellRightBanner.setImageDrawable((Drawable) obj);
                dsCellRightBanner.onRtlPropertiesChanged(dsCellRightBanner.getLayoutDirection());
                break;
            case 13:
                dsCellRightBanner.setImageDrawable(null);
                break;
            case 14:
                dsCellRightBanner.setImageDrawable((Drawable) obj);
                dsCellRightBanner.onRtlPropertiesChanged(dsCellRightBanner.getLayoutDirection());
                break;
            case 15:
                dsCellRightBanner.setImageDrawable(null);
                break;
            case 16:
                dsCellRightBanner.setImageDrawable((Drawable) obj);
                dsCellRightBanner.onRtlPropertiesChanged(dsCellRightBanner.getLayoutDirection());
                break;
            default:
                dsCellRightBanner.setImageDrawable(null);
                break;
        }
        return Unit.f46060a;
    }
}

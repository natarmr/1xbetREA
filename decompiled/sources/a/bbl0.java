package a;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeVideoEvent;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeZoneEvent;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.GameScreenToolbarView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bbl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2313a;
    public final /* synthetic */ gbl0 b;

    public /* synthetic */ bbl0(gbl0 gbl0Var, byte b) {
        this.f2313a = b;
        this.b = gbl0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        pfx pfxVarI;
        Object value;
        byte b = this.f2313a;
        gbl0 gbl0Var = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                lme0 lme0Var = gbl0.c2;
                ncl0 ncl0VarJ0 = gbl0Var.J0();
                zqs zqsVar = (zqs) CollectionsKt.firstOrNull(((p7m0) ncl0VarJ0.w()).d());
                ncl0VarJ0.y.N(zBooleanValue, zqsVar != null ? zqsVar.c : 0L);
                ncl0VarJ0.i.d(new sl1((Object) ncl0VarJ0, jLongValue, zBooleanValue, (byte) 16));
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                List list = (List) obj2;
                lme0 lme0Var2 = gbl0.c2;
                list.getClass();
                ncl0 ncl0VarJ1 = gbl0Var.J0();
                qjj.W(jiu0.a(ncl0VarJ1), null, null, new mc0((Object) ncl0VarJ1, iIntValue, (Object) list, (yje) null, (byte) 8), 3);
                break;
            case 2:
                View view = (View) obj;
                View view2 = (View) obj2;
                lme0 lme0Var3 = gbl0.c2;
                view.getClass();
                view2.getClass();
                ncl0 ncl0VarJ2 = gbl0Var.J0();
                int height = gbl0Var.I0().c.getBackgroundView().getHeight();
                int width = gbl0Var.I0().c.getBackgroundView().getWidth();
                vzg0 vzg0Var = ncl0VarJ2.c;
                p7m0 p7m0Var = ncl0VarJ2.S;
                if (((tcs) p7m0Var.getValue()).f == null && ((tcs) p7m0Var.getValue()).g == null) {
                    vzg0Var.e("KEY_BACKGROUND_HEIGHT", Integer.valueOf(height));
                    vzg0Var.e("KEY_BACKGROUND_WIDTH", Integer.valueOf(width));
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, tcs.a((tcs) value, false, 0L, null, null, null, Integer.valueOf(height), Integer.valueOf(width), 31)));
                }
                MatchInfoContainerView matchInfoContainerView = gbl0Var.I0().c;
                int dimensionPixelSize = gbl0Var.G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height);
                CoordinatorLayout coordinatorLayout = gbl0Var.I0().f43784a;
                WeakHashMap weakHashMap = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(coordinatorLayout);
                int i = (xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(2)) == null) ? 0 : pfxVarI.d;
                int dimensionPixelSize2 = gbl0Var.G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height) / 2;
                z4r z4rVarI0 = gbl0Var.I0();
                CoordinatorLayout coordinatorLayout2 = z4rVarI0.f43784a;
                GameScreenToolbarView gameScreenToolbarView = z4rVarI0.e;
                int height2 = coordinatorLayout2.getHeight() - gameScreenToolbarView.getHeight();
                ViewGroup.LayoutParams layoutParams = gameScreenToolbarView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                matchInfoContainerView.I(view, view2, (((height2 - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0)) - dimensionPixelSize) - i) - dimensionPixelSize2, gbl0Var.G().getDimensionPixelSize(R.dimen.corner_radius_16) + gbl0Var.I0().f43784a.getHeight());
                break;
            case 3:
                Bundle bundle = (Bundle) obj2;
                lme0 lme0Var4 = gbl0.c2;
                ((String) obj).getClass();
                bundle.getClass();
                BroadcastingLandscapeZoneEvent broadcastingLandscapeZoneEvent = (BroadcastingLandscapeZoneEvent) (Build.VERSION.SDK_INT <= 33 ? bundle.getParcelable("KEY_LANDSCAPE_ZONE_REQUEST") : (Parcelable) bundle.getParcelable("KEY_LANDSCAPE_ZONE_REQUEST", BroadcastingLandscapeZoneEvent.class));
                if (broadcastingLandscapeZoneEvent != null) {
                    if (broadcastingLandscapeZoneEvent instanceof BroadcastingLandscapeZoneEvent.Fullscreen) {
                        gbl0Var.J0().C(xqs.b);
                    } else if (broadcastingLandscapeZoneEvent instanceof BroadcastingLandscapeZoneEvent.Stop) {
                        gbl0Var.J0().C(xqs.f41338a);
                    }
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj2;
                lme0 lme0Var5 = gbl0.c2;
                ((String) obj).getClass();
                bundle2.getClass();
                BroadcastingLandscapeVideoEvent broadcastingLandscapeVideoEvent = (BroadcastingLandscapeVideoEvent) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("KEY_LANDSCAPE_VIDEO_REQUEST") : (Parcelable) bundle2.getParcelable("KEY_LANDSCAPE_VIDEO_REQUEST", BroadcastingLandscapeVideoEvent.class));
                if (broadcastingLandscapeVideoEvent != null) {
                    if (broadcastingLandscapeVideoEvent instanceof BroadcastingLandscapeVideoEvent.Fullscreen) {
                        gbl0Var.J0().C(xqs.b);
                    } else if (broadcastingLandscapeVideoEvent instanceof BroadcastingLandscapeVideoEvent.Stop) {
                        gbl0Var.J0().C(xqs.f41338a);
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}

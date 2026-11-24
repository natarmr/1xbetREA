package a;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SizeF;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public class vo3 extends a56 {
    public final int j;
    public final n0o0 k;
    public vkr0 l;
    public h0q0 m;
    public ikt0 n;
    public mj50 o;
    public mj50 p;
    public rkt0 q;
    public ot10 r;
    public yo4 s;
    public c1d0 t;
    public au0 u;
    public pru v;
    public ctf0 w;
    public final n0o0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo3(Context context, Intent intent) {
        super(context, intent);
        context.getClass();
        intent.getClass();
        final byte b = 0;
        this.j = intent.getIntExtra("key_count_item_for_notification", 0);
        this.k = maz.b(new Function0(this) { // from class: a.uo3
            public final /* synthetic */ vo3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                vo3 vo3Var = this.b;
                switch (b2) {
                    case 0:
                        Context applicationContext = vo3Var.f254a.getApplicationContext();
                        applicationContext.getClass();
                        ComponentCallbacks2 componentCallbacks2 = (Application) applicationContext;
                        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ldv0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ldv0)) {
                                ze3Var = null;
                            }
                            ldv0 ldv0Var = (ldv0) ze3Var;
                            if (ldv0Var != null) {
                                return ldv0Var.a();
                            }
                        }
                        jf4.n(b1j.i(ldv0.class, "Cannot create dependency "));
                        return null;
                    default:
                        vkr0 vkr0Var = vo3Var.l;
                        if (vkr0Var == null) {
                            Intrinsics.h("widgetFavoritesGamesScenario");
                            throw null;
                        }
                        h0q0 h0q0Var = vo3Var.m;
                        if (h0q0Var == null) {
                            Intrinsics.h("widgetTopGameEventsStreamScenario");
                            throw null;
                        }
                        ikt0 ikt0Var = vo3Var.n;
                        if (ikt0Var == null) {
                            Intrinsics.h("widgetEmptyFavoriteLogSendedUseCase");
                            throw null;
                        }
                        mj50 mj50Var = vo3Var.o;
                        if (mj50Var == null) {
                            Intrinsics.h("updateWidgetEmptyFavoriteLogSendedUseCase");
                            throw null;
                        }
                        mj50 mj50Var2 = vo3Var.p;
                        if (mj50Var2 == null) {
                            Intrinsics.h("widgetHasFavoriteSendedUseCase");
                            throw null;
                        }
                        rkt0 rkt0Var = vo3Var.q;
                        if (rkt0Var == null) {
                            Intrinsics.h("updateWidgetHasFavoriteSendedUseCase");
                            throw null;
                        }
                        ot10 ot10Var = vo3Var.r;
                        if (ot10Var == null) {
                            Intrinsics.h("mainDomainResolver");
                            throw null;
                        }
                        yo4 yo4Var = vo3Var.s;
                        if (yo4Var == null) {
                            Intrinsics.h("widgetAnalytics");
                            throw null;
                        }
                        au0 au0Var = vo3Var.u;
                        if (au0Var == null) {
                            Intrinsics.h("widgetFatmanLogger");
                            throw null;
                        }
                        c1d0 c1d0Var = vo3Var.t;
                        if (c1d0Var == null) {
                            Intrinsics.h("prophylaxisFeature");
                            throw null;
                        }
                        pru pruVar = vo3Var.v;
                        if (pruVar != null) {
                            return new to3(vkr0Var, h0q0Var, ikt0Var, mj50Var, mj50Var2, rkt0Var, ot10Var, yo4Var, au0Var, c1d0Var, pruVar);
                        }
                        Intrinsics.h("getRemoteConfigUseCase");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        this.x = maz.b(new Function0(this) { // from class: a.uo3
            public final /* synthetic */ vo3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                vo3 vo3Var = this.b;
                switch (b3) {
                    case 0:
                        Context applicationContext = vo3Var.f254a.getApplicationContext();
                        applicationContext.getClass();
                        ComponentCallbacks2 componentCallbacks2 = (Application) applicationContext;
                        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ldv0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ldv0)) {
                                ze3Var = null;
                            }
                            ldv0 ldv0Var = (ldv0) ze3Var;
                            if (ldv0Var != null) {
                                return ldv0Var.a();
                            }
                        }
                        jf4.n(b1j.i(ldv0.class, "Cannot create dependency "));
                        return null;
                    default:
                        vkr0 vkr0Var = vo3Var.l;
                        if (vkr0Var == null) {
                            Intrinsics.h("widgetFavoritesGamesScenario");
                            throw null;
                        }
                        h0q0 h0q0Var = vo3Var.m;
                        if (h0q0Var == null) {
                            Intrinsics.h("widgetTopGameEventsStreamScenario");
                            throw null;
                        }
                        ikt0 ikt0Var = vo3Var.n;
                        if (ikt0Var == null) {
                            Intrinsics.h("widgetEmptyFavoriteLogSendedUseCase");
                            throw null;
                        }
                        mj50 mj50Var = vo3Var.o;
                        if (mj50Var == null) {
                            Intrinsics.h("updateWidgetEmptyFavoriteLogSendedUseCase");
                            throw null;
                        }
                        mj50 mj50Var2 = vo3Var.p;
                        if (mj50Var2 == null) {
                            Intrinsics.h("widgetHasFavoriteSendedUseCase");
                            throw null;
                        }
                        rkt0 rkt0Var = vo3Var.q;
                        if (rkt0Var == null) {
                            Intrinsics.h("updateWidgetHasFavoriteSendedUseCase");
                            throw null;
                        }
                        ot10 ot10Var = vo3Var.r;
                        if (ot10Var == null) {
                            Intrinsics.h("mainDomainResolver");
                            throw null;
                        }
                        yo4 yo4Var = vo3Var.s;
                        if (yo4Var == null) {
                            Intrinsics.h("widgetAnalytics");
                            throw null;
                        }
                        au0 au0Var = vo3Var.u;
                        if (au0Var == null) {
                            Intrinsics.h("widgetFatmanLogger");
                            throw null;
                        }
                        c1d0 c1d0Var = vo3Var.t;
                        if (c1d0Var == null) {
                            Intrinsics.h("prophylaxisFeature");
                            throw null;
                        }
                        pru pruVar = vo3Var.v;
                        if (pruVar != null) {
                            return new to3(vkr0Var, h0q0Var, ikt0Var, mj50Var, mj50Var2, rkt0Var, ot10Var, yo4Var, au0Var, c1d0Var, pruVar);
                        }
                        Intrinsics.h("getRemoteConfigUseCase");
                        throw null;
                }
            }
        });
    }

    public static int p(vo3 vo3Var, TextPaint textPaint, xdv0 xdv0Var, int i) {
        return vo3Var.q(textPaint, xdv0Var, i, 0.43d).getHeight();
    }

    @Override // a.a56, android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        f56 f56Var = (f56) CollectionsKt.firstOrNull(e().b().f31713a.d());
        if ((f56Var instanceof d56) || (f56Var instanceof e56)) {
            return 0;
        }
        if (!this.d.isEmpty() || (f56Var instanceof b56)) {
            return (this.d.size() >= this.j || !(l(this.c) >= 0)) ? this.d.size() : this.d.size() + 1;
        }
        return 1;
    }

    @Override // a.a56, android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        boolean zIsEmpty = this.d.isEmpty();
        int i2 = this.c;
        if (zIsEmpty) {
            return ((f56) CollectionsKt.firstOrNull(((to3) this.x.getValue()).b().f31713a.d())) instanceof b56 ? o(i2) : getLoadingView();
        }
        pev0 pev0Var = (pev0) CollectionsKt.W(i, this.d);
        if (pev0Var == null) {
            return o(i2);
        }
        boolean z = pev0Var instanceof cun;
        Context context = this.f254a;
        if (z) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_item_favorites_empty);
            remoteViews.setTextViewText(R.id.textViewNotification, b8k0.H(context).getString(R.string.empty_favorites_games_title));
            return remoteViews;
        }
        if (!(pev0Var instanceof yde0)) {
            return pev0Var instanceof xdv0 ? a((xdv0) pev0Var) : o(i2);
        }
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_item_recomend_title);
        remoteViews2.setTextViewText(R.id.textViewNotification, b8k0.H(context).getString(R.string.recommended_event));
        return remoteViews2;
    }

    @Override // a.a56, android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 7;
    }

    @Override // a.a56
    public final g56 h() {
        return (to3) this.x.getValue();
    }

    @Override // a.a56
    public final void j(RemoteViews remoteViews, xdv0 xdv0Var) {
        if (this.f254a.getResources().getConfiguration().fontScale <= 1.29f || xdv0Var.m != null) {
            super.j(remoteViews, xdv0Var);
        } else {
            remoteViews.setTextViewText(R.id.textViewDate, Separators.SP);
        }
    }

    @Override // a.a56
    public final void k(RemoteViews remoteViews, boolean z) {
        remoteViews.setViewVisibility(R.id.imageViewLive, z ? 0 : 8);
        remoteViews.setViewVisibility(R.id.textViewDate, z ? 8 : 0);
    }

    public final int l(int i) {
        int i2;
        int i3;
        int iM;
        SizeF sizeF;
        Context context = this.f254a;
        context.getClass();
        Bundle appWidgetOptions = AppWidgetManager.getInstance(context).getAppWidgetOptions(i);
        n0o0 n0o0VarB = maz.b(new qev0(appWidgetOptions, (byte) 1));
        if (Build.VERSION.SDK_INT >= 31) {
            ArrayList parcelableArrayList = appWidgetOptions.getParcelableArrayList("appWidgetSizes");
            i2 = a4n0.i((parcelableArrayList == null || (sizeF = (SizeF) CollectionsKt.f0(parcelableArrayList)) == null) ? ((Number) n0o0VarB.getValue()).intValue() : (int) sizeF.getHeight(), context);
        } else {
            i2 = a4n0.i(((Number) n0o0VarB.getValue()).intValue(), context);
        }
        int i4 = i2;
        Iterator it = this.d.iterator();
        int iCeil = 0;
        int i5 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            i3 = this.c;
            if (!zHasNext) {
                break;
            }
            pev0 pev0Var = (pev0) it.next();
            if (pev0Var instanceof xdv0) {
                xdv0 xdv0Var = (xdv0) pev0Var;
                if (xdv0Var.j.b.length() == 0) {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_16);
                    int iU = v2n0.u(i3, context);
                    float dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.text_12);
                    int iMax = Math.max(iU - (dimensionPixelSize * 2), 0);
                    int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.space_10);
                    int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.space_8);
                    int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.space_6);
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTextSize(dimensionPixelSize2);
                    int iR = r(textPaint, xdv0Var, iMax);
                    StaticLayout staticLayoutQ = q(textPaint, xdv0Var, iMax, 1.0d);
                    iM = dimensionPixelSize3 + dimensionPixelSize4 + iR + staticLayoutQ.getHeight() + staticLayoutQ.getLineCount() + dimensionPixelSize5;
                } else {
                    iM = m(xdv0Var);
                }
            } else {
                iM = 0;
            }
            i5 += iM;
        }
        String string = context.getString(R.string.favorites_add_more_games);
        string.getClass();
        float dimensionPixelSize6 = context.getResources().getDimensionPixelSize(R.dimen.text_12);
        int dimensionPixelSize7 = context.getResources().getDimensionPixelSize(R.dimen.space_16);
        Typeface typefaceCreate = Typeface.create(itf0.a(R.font.roboto_medium, context), 1);
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTypeface(typefaceCreate);
        textPaint2.setTextSize(dimensionPixelSize6);
        textPaint2.setTextAlign(Paint.Align.CENTER);
        int iU2 = v2n0.u(i3, context) - (dimensionPixelSize7 * 2);
        if (iU2 > 0) {
            StaticLayout staticLayout = new StaticLayout(string, textPaint2, iU2, Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, true);
            iCeil = (int) Math.ceil(staticLayout.getLineCount() * staticLayout.getHeight());
        }
        int dimensionPixelSize8 = context.getResources().getDimensionPixelSize(R.dimen.icon_size_16);
        int dimensionPixelSize9 = context.getResources().getDimensionPixelSize(R.dimen.space_16);
        int dimensionPixelSize10 = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize11 = context.getResources().getDimensionPixelSize(R.dimen.text_12);
        Typeface typefaceCreate2 = Typeface.create(itf0.a(R.font.roboto_medium, context), 1);
        TextPaint textPaint3 = new TextPaint();
        textPaint3.setTextSize(dimensionPixelSize11);
        textPaint3.setTypeface(typefaceCreate2);
        int height = new StaticLayout("A", textPaint3, 100, Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, true).getHeight();
        if (dimensionPixelSize8 <= height) {
            dimensionPixelSize8 = height;
        }
        return (((i4 - hne.D(dimensionPixelSize8, dimensionPixelSize9, dimensionPixelSize10, iCeil)) - i5) - a4n0.i(8, context)) / 2;
    }

    public int m(xdv0 xdv0Var) {
        Context context = this.f254a;
        if (context.getResources().getConfiguration().fontScale > 1.29f) {
            return n(xdv0Var);
        }
        int iMax = Math.max(v2n0.u(this.c, context) - (context.getResources().getDimensionPixelSize(R.dimen.space_16) * 2), 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_10);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        float dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.text_12);
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(dimensionPixelSize3);
        int iR = r(textPaint, xdv0Var, iMax);
        int iP = p(this, textPaint, xdv0Var, iMax) * 2;
        Typeface typefaceCreate = Typeface.create(itf0.a(R.font.roboto_medium, context), 1);
        textPaint.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.text_18));
        textPaint.setTypeface(typefaceCreate);
        int height = new StaticLayout(xdv0Var.k, textPaint, (int) (((double) iMax) * 0.1d), Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, true).getHeight() * 2;
        int iD = hne.D(dimensionPixelSize, dimensionPixelSize2, iR, dimensionPixelSize4);
        if (iP < height) {
            iP = height;
        }
        return iD + iP;
    }

    public final int n(xdv0 xdv0Var) {
        Context context = this.f254a;
        int iMax = Math.max(v2n0.u(this.c, context) - (context.getResources().getDimensionPixelSize(R.dimen.space_16) * 2), 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_10);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        float dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.text_12);
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(dimensionPixelSize3);
        return dimensionPixelSize + r(textPaint, xdv0Var, iMax) + dimensionPixelSize2 + dimensionPixelSize4 + dimensionPixelSize5 + (p(this, textPaint, xdv0Var, iMax) * 4);
    }

    public final RemoteViews o(int i) {
        Context context = this.f254a;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_item_notification);
        remoteViews.setTextViewText(R.id.textViewNotification, b8k0.H(context).getString(R.string.favorites_add_more_games));
        int iL = l(i);
        remoteViews.setViewPadding(R.id.widgetItemContainer, 0, iL, 0, iL);
        return remoteViews;
    }

    @Override // a.a56, android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        s();
        super.onCreate();
        rdj rdjVar = rdj.f30294a;
        ctf0 ctf0Var = this.w;
        if (ctf0Var != null) {
            rdj.l(ctf0Var.h());
        } else {
            Intrinsics.h("resourceManager");
            throw null;
        }
    }

    public final StaticLayout q(TextPaint textPaint, xdv0 xdv0Var, int i, double d) {
        textPaint.setTypeface(Typeface.create(itf0.a(R.font.roboto_medium, this.f254a), 1));
        return new StaticLayout(xdv0Var.i.b, textPaint, (int) (((double) i) * d), Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, true);
    }

    public final int r(TextPaint textPaint, xdv0 xdv0Var, int i) {
        Context context = this.f254a;
        textPaint.setTypeface(itf0.a(R.font.roboto_regular, context));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.icon_size_16);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        int height = new StaticLayout(xdv0Var.g, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, true).getHeight();
        if (dimensionPixelSize > height) {
            return dimensionPixelSize;
        }
        return context.getResources().getConfiguration().fontScale > 1.29f ? (height * 2) + dimensionPixelSize2 : height;
    }

    public void s() {
        ((kdv0) this.k.getValue()).e(this);
    }
}

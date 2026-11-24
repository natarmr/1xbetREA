package org.xplatform.widget.impl.presentation.quickavailable.widget;

import a.af3;
import a.au0;
import a.b1j;
import a.b8k0;
import a.bby;
import a.ctf0;
import a.d5c;
import a.dvj;
import a.hxm0;
import a.i120;
import a.ih5;
import a.j120;
import a.jld0;
import a.k9h0;
import a.kev0;
import a.kin0;
import a.kys0;
import a.nev0;
import a.o5d0;
import a.pru;
import a.q3d;
import a.qem0;
import a.r3d;
import a.r850;
import a.rdj;
import a.rwj;
import a.s850;
import a.sac;
import a.sje;
import a.t9f;
import a.tvk;
import a.us00;
import a.vc3;
import a.wp20;
import a.yfu;
import a.ze3;
import android.app.Application;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class MySectionsWidget extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sje f47321a;
    public boolean b;
    public ih5 c;
    public pru d;
    public au0 e;
    public yfu f;
    public ctf0 g;
    public bby h;

    public MySectionsWidget() {
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.f47321a = d5c.a(e.c(dvjVar, kin0VarE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Application application) {
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                ze3 ze3Var = null;
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(jld0.class);
                    ze3 ze3Var2 = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (ze3Var2 instanceof jld0) {
                        ze3Var = ze3Var2;
                    }
                    jld0 jld0Var = (jld0) ze3Var;
                    if (jld0Var != null) {
                        jld0Var.a().R(this);
                        this.b = true;
                        return;
                    }
                }
                throw new IllegalStateException(("Cannot create dependency " + jld0.class).toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        d5c.G(this.f47321a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle bundleExtra;
        k9h0 k9h0Var;
        String lowerCase;
        Intent intentPutExtra;
        bby bbyVar;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        ?? PutExtra = 0;
        PutExtra = 0;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            return;
        }
        a(application);
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            byte b = 2;
            if (iHashCode != -1324472402) {
                if (iHashCode != -19011148) {
                    if (iHashCode == 1997004734 && action.equals("widget_settings")) {
                        Intent intentQ = j120.Q(context);
                        context.startActivity(intentQ != null ? intentQ.putExtra("REQUEST_WIDGET_SETTINGS", true) : null);
                    }
                } else if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                    bby bbyVar2 = this.h;
                    if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.h) != null) {
                        bbyVar.cancel(null);
                    }
                    this.h = sac.V(this.f47321a, s850.f31787a, null, null, new vc3(context, PutExtra, b), 14);
                }
            } else if (action.equals("section_click") && (bundleExtra = intent.getBundleExtra("key_saved_bundle")) != null) {
                int i = bundleExtra.getInt("key_select_section");
                nev0.b.getClass();
                nev0 nev0VarC = kys0.c(i);
                switch (nev0VarC == null ? -1 : r850.f30010a[nev0VarC.ordinal()]) {
                    case -1:
                        return;
                    case 0:
                    default:
                        t9f.b();
                        return;
                    case 1:
                        k9h0Var = k9h0.q;
                        break;
                    case 2:
                        k9h0Var = k9h0.o1;
                        break;
                    case 3:
                        k9h0Var = k9h0.m1;
                        break;
                    case 4:
                        k9h0Var = k9h0.n1;
                        break;
                    case 5:
                        k9h0Var = k9h0.p1;
                        break;
                    case 6:
                        k9h0Var = k9h0.Y;
                        break;
                }
                au0 au0Var = this.e;
                if (au0Var == null) {
                    Intrinsics.h("widgetFatmanLogger");
                    throw null;
                }
                String str = "games";
                if (Intrinsics.d(nev0VarC.name(), "XGAMES")) {
                    lowerCase = "games";
                } else {
                    lowerCase = nev0VarC.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                b1j.v(lowerCase, au0Var.f1455a, 3018L);
                ih5 ih5Var = this.c;
                if (ih5Var == null) {
                    Intrinsics.h("widgetQuickAvailableAnalytics");
                    throw null;
                }
                int iOrdinal = nev0VarC.ordinal();
                if (iOrdinal == 0) {
                    str = "live";
                } else if (iOrdinal == 1) {
                    str = "results";
                } else if (iOrdinal == 2) {
                    str = "cyber";
                } else if (iOrdinal == 3) {
                    str = "search";
                } else if (iOrdinal == 4) {
                    str = "aggregator";
                } else if (iOrdinal != 5) {
                    t9f.b();
                    return;
                }
                ih5Var.f14765a.a("widget_fastaccess_open", wp20.b(new Pair("point", str)));
                Intent intentQ2 = j120.Q(context);
                if (intentQ2 != null && (intentPutExtra = intentQ2.putExtra("REQUEST_SECTION_FROM_WIDGET", true)) != null) {
                    PutExtra = intentPutExtra.putExtra("OPEN_SCREEN", k9h0Var.name());
                }
                context.startActivity(PutExtra);
            }
        }
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        MySectionsWidget mySectionsWidget = this;
        int[] iArr2 = iArr;
        context.getClass();
        appWidgetManager.getClass();
        iArr2.getClass();
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            return;
        }
        mySectionsWidget.a(application);
        rdj rdjVar = rdj.f30294a;
        ctf0 ctf0Var = mySectionsWidget.g;
        if (ctf0Var == null) {
            Intrinsics.h("resourceManager");
            throw null;
        }
        rdj.l(ctf0Var.h());
        int length = iArr2.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr2[i];
            us00 us00VarH = b8k0.H(context);
            yfu yfuVar = mySectionsWidget.f;
            if (yfuVar == null) {
                Intrinsics.h("getSavedQuickAvailableSectionsUseCase");
                throw null;
            }
            pru pruVar = mySectionsWidget.d;
            if (pruVar == null) {
                Intrinsics.h("getRemoteConfigUseCase");
                throw null;
            }
            List<nev0> listI = yfuVar.i(pruVar.a());
            ArrayList arrayList = new ArrayList(r3d.q(listI, 10));
            for (nev0 nev0Var : listI) {
                pru pruVar2 = mySectionsWidget.d;
                if (pruVar2 == null) {
                    Intrinsics.h("getRemoteConfigUseCase");
                    throw null;
                }
                String str = pruVar2.a().d.f27973a.b;
                ctf0 ctf0Var2 = mySectionsWidget.g;
                if (ctf0Var2 == null) {
                    Intrinsics.h("resourceManager");
                    throw null;
                }
                nev0Var.getClass();
                nev0.b.getClass();
                arrayList.add(new kev0(nev0Var.f23406a, hxm0.s(nev0Var), hxm0.t(nev0Var, ctf0Var2, str)));
            }
            us00 us00VarH2 = b8k0.H(us00VarH);
            RemoteViews remoteViews = new RemoteViews(us00VarH.getPackageName(), R.layout.app_widget_quick_available);
            remoteViews.setTextViewText(R.id.textViewTitle, us00VarH2.getString(R.string.widget_my_sections));
            List listJ = q3d.j(Integer.valueOf(R.id.tabOne), Integer.valueOf(R.id.tabTwo), Integer.valueOf(arrayList.size() == 3 ? R.id.tabThreeDouble : R.id.tabThree), Integer.valueOf(R.id.tabFour));
            List listJ2 = q3d.j(Integer.valueOf(R.id.textViewOne), Integer.valueOf(R.id.textViewTwo), Integer.valueOf(arrayList.size() == 3 ? R.id.textViewThreeDouble : R.id.textViewThree), Integer.valueOf(R.id.textViewFour));
            List listJ3 = q3d.j(Integer.valueOf(R.id.imageViewOne), Integer.valueOf(R.id.imageViewTwo), Integer.valueOf(arrayList.size() == 3 ? R.id.imageViewThreeDouble : R.id.imageViewThree), Integer.valueOf(R.id.imageViewFour));
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                remoteViews.setViewVisibility(((Number) it.next()).intValue(), 8);
            }
            if (arrayList.size() == 3) {
                remoteViews.setViewVisibility(R.id.tabThree, 8);
            } else {
                remoteViews.setViewVisibility(R.id.tabThreeDouble, 8);
            }
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                kev0 kev0Var = (kev0) obj;
                Integer num = (Integer) CollectionsKt.W(i3, listJ);
                Integer num2 = (Integer) CollectionsKt.W(i3, listJ2);
                Integer num3 = (Integer) CollectionsKt.W(i3, listJ3);
                if (num != null && num2 != null && num3 != null) {
                    remoteViews.setViewVisibility(num.intValue(), 0);
                    int iIntValue = num2.intValue();
                    String str2 = kev0Var.b;
                    byte b = kev0Var.f18169a;
                    remoteViews.setTextViewText(iIntValue, str2);
                    remoteViews.setImageViewResource(num3.intValue(), kev0Var.c);
                    int iIntValue2 = num.intValue();
                    String strValueOf = String.valueOf((int) b);
                    Bundle bundleV = i120.V(new Pair("key_select_section", Integer.valueOf(b)));
                    strValueOf.getClass();
                    Intent intent = new Intent(us00VarH, (Class<?>) MySectionsWidget.class);
                    intent.putExtra("key_saved_bundle", bundleV);
                    intent.setAction("section_click");
                    intent.putExtra(strValueOf, i2);
                    intent.setData(Uri.parse(intent.toUri(1)));
                    PendingIntent broadcast = PendingIntent.getBroadcast(us00VarH, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
                    broadcast.getClass();
                    remoteViews.setOnClickPendingIntent(iIntValue2, broadcast);
                }
                i3 = i4;
            }
            Intent intent2 = new Intent(us00VarH, (Class<?>) MySectionsWidget.class);
            intent2.setAction("widget_settings");
            intent2.putExtra("appWidgetId", i2);
            intent2.setData(Uri.parse(intent2.toUri(1)));
            PendingIntent broadcast2 = PendingIntent.getBroadcast(us00VarH, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            broadcast2.getClass();
            remoteViews.setOnClickPendingIntent(R.id.settings, broadcast2);
            AppWidgetManager.getInstance(us00VarH).updateAppWidget(i2, remoteViews);
            i++;
            mySectionsWidget = this;
            iArr2 = iArr;
        }
    }
}

package a;

import android.animation.AnimatorSet;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.autofill.AutofillId;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.daily_tasks.impl.workers.DailyTaskNotificationWorker;
import org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker;
import org.xplatform.betting.core.tax.TaxStatusWorker;
import org.xplatform.services.mobile_services.impl.workers.AuthenticatorPushWorker;
import org.xplatform.widget.impl.workers.BestGamesRequestWorker;
import org.xplatform.widget.impl.workers.FavoritesGamesRequestWorker;

/* JADX INFO: loaded from: classes.dex */
public abstract class ga3 {
    public static void A(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void B(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void C(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void D(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void E(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void F(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void G(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static final void H(Notification.Builder builder, Context context, NotificationManager notificationManager, String str) {
        context.getClass();
        notificationManager.getClass();
        String string = b8k0.H(context).getString(R.string.app_is_updated);
        string.getClass();
        String string2 = b8k0.H(context).getString(R.string.updating);
        string2.getClass();
        builder.setContentTitle(string).setContentText(string2).setSmallIcon(R.drawable.ic_notification_white).setCategory("progress").setProgress(100, 0, false);
        if (Build.VERSION.SDK_INT < 26) {
            builder.setPriority(-1);
        } else if (notificationManager.getNotificationChannel(str) == null) {
            i7w0.b();
            notificationManager.createNotificationChannel(new NotificationChannel(str, "UPDATE_CHANNEL_prod", 2));
        }
    }

    public static void I(cpv0 cpv0Var, us00 us00Var) {
        sl50 sl50Var = sl50.f32381a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4e o4eVar = new o4e(new hl50(null), sl50.f32381a, false, false, false, false, -1L, -1L, CollectionsKt.P0(linkedHashSet));
        ag90 ag90Var = new ag90(DailyTaskNotificationWorker.class);
        ((ppv0) ag90Var.c).j = o4eVar;
        bg90 bg90Var = (bg90) ag90Var.k();
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 32) {
            i7w0.b();
            ((NotificationManager) us00Var.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("daily_task", "daily_task", 3));
        }
        yko[] ykoVarArr = yko.f42800a;
        cpv0Var.b("DailyTasksNotificationWorker", bg90Var);
    }

    public static void J(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static void K(cpv0 cpv0Var, Context context, int i) {
        sl50 sl50Var = sl50.f32381a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4e o4eVar = new o4e(new hl50(null), sl50.b, false, false, false, false, -1L, -1L, CollectionsKt.P0(linkedHashSet));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("COUNTRY_ID_PARAM", Integer.valueOf(i));
        maj majVar = new maj(linkedHashMap);
        nkb.I(majVar);
        int i2 = Build.VERSION.SDK_INT;
        if (26 <= i2 && i2 < 32) {
            i7w0.b();
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("tax_status", "tax_status", 3));
        }
        zko zkoVar = zko.b;
        xl60 xl60Var = new xl60(TaxStatusWorker.class);
        ((ppv0) xl60Var.c).e = majVar;
        ((ppv0) xl60Var.c).j = o4eVar;
        cpv0Var.c("TaxStatusWorker", zkoVar, (yl60) ((xl60) xl60Var.g("TaxStatusWorker")).k());
    }

    public static final long L(Duration duration) {
        return duration.toMillis();
    }

    public static void a(cpv0 cpv0Var, Context context, String str, boolean z) {
        context.getClass();
        o4e o4eVar = new o4e(new hl50(null), sl50.f32381a, false, false, false, false, -1L, -1L, CollectionsKt.P0(new LinkedHashSet()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BUNDLE_REQUEST_ID", str);
        linkedHashMap.put("BUNDLE_LIVE_TYPE", Boolean.valueOf(z));
        maj majVar = new maj(linkedHashMap);
        nkb.I(majVar);
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 32) {
            i7w0.b();
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("widget_best_update", "widget_best_update_name", 3));
        }
        zko zkoVar = zko.f44542a;
        xl60 xl60Var = new xl60(BestGamesRequestWorker.class);
        od80 od80Var = od80.f25065a;
        xl60 xl60Var2 = (xl60) ((xl60) xl60Var.w()).g(str);
        ((ppv0) xl60Var2.c).j = o4eVar;
        ((ppv0) xl60Var2.c).e = majVar;
        cpv0Var.c(str, zkoVar, (yl60) xl60Var2.k());
    }

    public static void b(cpv0 cpv0Var, Context context, String str) {
        context.getClass();
        o4e o4eVar = new o4e(new hl50(null), sl50.f32381a, false, false, false, false, -1L, -1L, CollectionsKt.P0(new LinkedHashSet()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BUNDLE_REQUEST_ID", str);
        maj majVar = new maj(linkedHashMap);
        nkb.I(majVar);
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 32) {
            i7w0.b();
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("widget_favorite_update", "widget_favorite_update_name", 3));
        }
        zko zkoVar = zko.f44542a;
        xl60 xl60Var = new xl60(FavoritesGamesRequestWorker.class);
        od80 od80Var = od80.f25065a;
        xl60 xl60Var2 = (xl60) ((xl60) xl60Var.w()).g(str);
        ((ppv0) xl60Var2.c).j = o4eVar;
        ((ppv0) xl60Var2.c).e = majVar;
        cpv0Var.c(str, zkoVar, (yl60) xl60Var2.k());
    }

    public static final ColorSpace c(y4d y4dVar) {
        ColorSpace colorSpace;
        if (Intrinsics.d(y4dVar, a5d.e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.d(y4dVar, a5d.q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.d(y4dVar, a5d.r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.d(y4dVar, a5d.o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.d(y4dVar, a5d.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.d(y4dVar, a5d.i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.d(y4dVar, a5d.t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.d(y4dVar, a5d.s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.d(y4dVar, a5d.k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.d(y4dVar, a5d.l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.d(y4dVar, a5d.g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.d(y4dVar, a5d.h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.d(y4dVar, a5d.f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.d(y4dVar, a5d.m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.d(y4dVar, a5d.p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.d(y4dVar, a5d.n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (Intrinsics.d(y4dVar, a5d.v)) {
                colorSpace = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
            } else {
                colorSpace = Intrinsics.d(y4dVar, a5d.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (i >= 36) {
            ColorSpace colorSpace2 = Intrinsics.d(y4dVar, a5d.x) ? ColorSpace.get(ColorSpace.Named.OK_LAB) : null;
            if (colorSpace2 != null) {
                return colorSpace2;
            }
        }
        if (!(y4dVar instanceof ubg0)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = y4dVar.f41997a;
        ubg0 ubg0Var = (ubg0) y4dVar;
        float[] fArrA = ubg0Var.d.a();
        phs0 phs0Var = ubg0Var.g;
        ColorSpace.Rgb.TransferParameters transferParameters = phs0Var != null ? new ColorSpace.Rgb.TransferParameters(phs0Var.b, phs0Var.c, phs0Var.d, phs0Var.e, phs0Var.f, phs0Var.g, phs0Var.f27012a) : null;
        float[] fArr = ubg0Var.i;
        final byte b = 0;
        if (transferParameters != null) {
            y24.y();
            ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, ubg0Var.h, fArrA, transferParameters);
            if (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) {
                return rgb;
            }
            y24.y();
            return new ColorSpace.Rgb(str, fArr, transferParameters);
        }
        y24.y();
        float[] fArr2 = ubg0Var.h;
        final tbg0 tbg0Var = ubg0Var.l;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: a.z4d
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                byte b2 = b;
                Function1 function1 = tbg0Var;
                switch (b2) {
                    case 0:
                        break;
                }
                return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
            }
        };
        final tbg0 tbg0Var2 = ubg0Var.o;
        final byte b2 = 1;
        return new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: a.z4d
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                byte b3 = b2;
                Function1 function1 = tbg0Var2;
                switch (b3) {
                    case 0:
                        break;
                }
                return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
            }
        }, ubg0Var.e, ubg0Var.f);
    }

    public static void d(cpv0 cpv0Var, Context context, LinkedHashMap linkedHashMap) {
        o4e o4eVar = new o4e(new hl50(null), sl50.f32381a, false, false, false, false, -1L, -1L, CollectionsKt.P0(new LinkedHashSet()));
        laj lajVar = new laj((byte) 0);
        lajVar.c(linkedHashMap);
        maj majVarA = lajVar.a();
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 32) {
            i7w0.b();
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("confirm_auth", "confirm_auth", 3));
        }
        xl60 xl60Var = new xl60(ConfirmationAuthenticatorWorker.class);
        od80 od80Var = od80.f25065a;
        xl60 xl60Var2 = (xl60) xl60Var.w();
        ((ppv0) xl60Var2.c).j = o4eVar;
        ((ppv0) xl60Var2.c).e = majVarA;
        cpv0Var.a(xl60Var2.k());
    }

    public static Notification.Builder e(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon f(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId g(View view) {
        return view.getAutofillId();
    }

    public static float h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float i(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static TextClassifier k(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public static float l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void m(cpv0 cpv0Var, us00 us00Var, Map map) {
        map.getClass();
        o4e o4eVar = new o4e(new hl50(null), sl50.f32381a, false, false, false, false, -1L, -1L, CollectionsKt.P0(new LinkedHashSet()));
        laj lajVar = new laj((byte) 0);
        lajVar.c(map);
        maj majVarA = lajVar.a();
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 32) {
            i7w0.b();
            ((NotificationManager) us00Var.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("auth_push", "auth_push", 3));
        }
        xl60 xl60Var = new xl60(AuthenticatorPushWorker.class);
        od80 od80Var = od80.f25065a;
        xl60 xl60Var2 = (xl60) xl60Var.w();
        ((ppv0) xl60Var2.c).j = o4eVar;
        ((ppv0) xl60Var2.c).e = majVarA;
        cpv0Var.a(xl60Var2.k());
    }

    public static boolean n(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void o(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }

    public static Intent p(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static Intent q(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }

    public static void r(AnimatorSet animatorSet) {
        animatorSet.getClass();
        animatorSet.reverse();
    }

    public static void s(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void t(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static void u(int i, TextView textView) {
        textView.setAutoSizeTextTypeWithDefaults(i);
    }

    public static void v(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void w(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void x(AnimatorSet animatorSet, long j) {
        animatorSet.getClass();
        animatorSet.setCurrentPlayTime(j);
    }

    public static void y(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void z(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }
}

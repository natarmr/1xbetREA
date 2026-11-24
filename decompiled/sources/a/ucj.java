package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextPaint;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.download.DownloadView;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ucj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35432a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ucj(Object obj, byte b) {
        this.f35432a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f35432a;
        boolean z = false;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                kud kudVar = vcj.m2;
                return Boolean.valueOf(((hdj) obj).a() != null);
            case 1:
                jej jejVar = (jej) obj;
                kwd kwdVar = dej.l2;
                if (jejVar.a().f47284a != null && jejVar.a().b != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                return androidx.compose.runtime.e.e((DateRangeModel) obj);
            case 3:
                nwd nwdVar = xej.l2;
                return Boolean.valueOf(((c2) obj).E());
            case 4:
                return (pfj) ((gii0) ((xr) obj).f41344a).b(sre0.f32672a.b(pfj.class));
            case 5:
                q7d0 q7d0Var = ((fjj) obj).f9643a;
                ljj ljjVarValueOf = ljj.f20154a;
                try {
                    String string = q7d0Var.a().getString("DEBUG_CONSOLE_KEY", "");
                    if (string == null) {
                        string = "CLOSED";
                    }
                    ljjVarValueOf = ljj.valueOf(string);
                    break;
                } catch (Throwable th) {
                    th.printStackTrace();
                    q7d0Var.h("DEBUG_CONSOLE_KEY");
                }
                return q7m0.a(ljjVarValueOf);
            case 6:
                tjj tjjVar = (tjj) obj;
                return Pattern.compile("(([1-9]{1}[0-9]{0," + (tjjVar.f34050a - 1) + "})?||[0]{1})((\\.[0-9]{0," + ((int) tjjVar.b) + "})?)||(\\.)?");
            case 7:
                return ((prj) obj).b.a();
            case 8:
                ((g5q0) obj).close();
                return Unit.f46060a;
            case 9:
                m8k m8kVar = (m8k) obj;
                p7m0 p7m0Var = m8kVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    m8kVar.f.getClass();
                } while (!p7m0Var.m(value, k8k.a((k8k) value, null, null, false, null, 27)));
                return Unit.f46060a;
            case 10:
                p7m0 p7m0Var2 = ((pak) obj).f;
                do {
                    value2 = p7m0Var2.getValue();
                    ((Boolean) value2).getClass();
                } while (!p7m0Var2.m(value2, Boolean.FALSE));
                return Unit.f46060a;
            case 11:
                xak xakVar = cbk.O1;
                fiu0 fiu0Var = ((cbk) obj).K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 12:
                p7m0 p7m0Var3 = ((jbk) obj).f;
                do {
                    value3 = p7m0Var3.getValue();
                    ((Boolean) value3).getClass();
                } while (!p7m0Var3.m(value3, Boolean.FALSE));
                return Unit.f46060a;
            case 13:
                return (tuk) ((azj0) ((zri) obj).b).d(sre0.f32672a.b(tuk.class));
            case 14:
                return (lyk) ((gii0) ((hsj) obj).f13586a).b(sre0.f32672a.b(lyk.class));
            case 15:
                iiy[] iiyVarArr = szk.Q1;
                fiu0 fiu0Var2 = ((szk) obj).L1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("dominoViewModelFactory");
                throw null;
            case 16:
                return (kzk) ((o0l) obj).f24431a.b(sre0.f32672a.b(kzk.class));
            case 17:
                sfi sfiVar = ((l3l) obj).L1;
                if (sfiVar != null) {
                    return new q0h0(sfiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 18:
                return new z6p0((m5l) obj, R.color.static_black_40);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new z6p0((j7l) obj, R.color.static_black_40);
            case 20:
                p7l p7lVar = (p7l) obj;
                TextPaint textPaint = new TextPaint();
                textPaint.setAntiAlias(true);
                Context context = p7lVar.f26511a;
                r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_M);
                textPaint.setColor(context.getColor(R.color.static_white));
                textPaint.setTextSize(p7lVar.t * p7lVar.e);
                return textPaint;
            case 21:
                return d9l.b((d9l) obj);
            case 22:
                z19 z19Var = (z19) obj;
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.addAll((Collection) ((fee) z19Var.i.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) z19Var.k.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) z19Var.m.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) z19Var.j.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) z19Var.l.getValue()).b(), lc00VarB);
            case 23:
                return new ecl((org.xplatform.app_update.impl.presentation.update_screen.views.content.download.bar.b) obj);
            case 24:
                org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b bVar = (org.xplatform.app_update.impl.presentation.update_screen.views.content.download.label.b) obj;
                ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(bVar, "textColor", bVar.i, bVar.j);
                objectAnimatorOfArgb.setDuration(600L);
                objectAnimatorOfArgb.setRepeatMode(2);
                objectAnimatorOfArgb.setRepeatCount(-1);
                objectAnimatorOfArgb.setStartDelay(300L);
                return objectAnimatorOfArgb;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i = DownloadView.v;
                return new ucl((DownloadView) obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                iiy[] iiyVarArr2 = qfl.O1;
                fiu0 fiu0Var3 = ((qfl) obj).L1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("dragonsGoldViewModelFactory");
                throw null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (dfl) ((gii0) ((zri) obj).b).b(sre0.f32672a.b(dfl.class));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new i63((lhl) obj, b2);
            default:
                return Integer.valueOf(((rll) obj).b.size());
        }
    }
}

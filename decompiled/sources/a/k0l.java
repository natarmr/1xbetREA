package a;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k0l extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17473a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0l(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f17473a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17473a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((l0l) this.receiver).x(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((l0l) this.receiver).x(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((l0l) this.receiver).x(th3);
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((l0l) this.receiver).x(th4);
                return Unit.f46060a;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((l0l) this.receiver).x(th5);
                return Unit.f46060a;
            case 5:
                x1l x1lVar = (x1l) obj;
                x1lVar.getClass();
                ((k3t0) this.receiver).x(x1lVar);
                return Unit.f46060a;
            case 6:
                ((i8l) this.receiver).addView((View) obj);
                return Unit.f46060a;
            case 7:
                ((i8l) this.receiver).removeView((View) obj);
                return Unit.f46060a;
            case 8:
                ((i8l) this.receiver).addView((View) obj);
                return Unit.f46060a;
            case 9:
                ((d9l) this.receiver).addView((View) obj);
                return Unit.f46060a;
            case 10:
                ((d9l) this.receiver).removeView((View) obj);
                return Unit.f46060a;
            case 11:
                ((d9l) this.receiver).addView((View) obj);
                return Unit.f46060a;
            case 12:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((cgl) this.receiver).B(th6);
                return Unit.f46060a;
            case 13:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((cgl) this.receiver).B(th7);
                return Unit.f46060a;
            case 14:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((cgl) this.receiver).B(th8);
                return Unit.f46060a;
            case 15:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((cgl) this.receiver).B(th9);
                return Unit.f46060a;
            case 16:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((cgl) this.receiver).B(th10);
                return Unit.f46060a;
            case 17:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((cgl) this.receiver).C(th11);
                return Unit.f46060a;
            case 18:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((cgl) this.receiver).C(th12);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((cgl) this.receiver).C(th13);
                return Unit.f46060a;
            case 20:
                Drawable drawable = (Drawable) obj;
                drawable.getClass();
                DsMenuCell dsMenuCell = (DsMenuCell) this.receiver;
                int i = DsMenuCell.g1;
                dsMenuCell.v(drawable);
                return Boolean.FALSE;
            case 21:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                DsNavigationBar dsNavigationBar = (DsNavigationBar) this.receiver;
                int i2 = DsNavigationBar.l;
                dsNavigationBar.f(zBooleanValue);
                return Unit.f46060a;
            case 22:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                DsNavigationBar dsNavigationBar2 = (DsNavigationBar) this.receiver;
                int i3 = DsNavigationBar.l;
                dsNavigationBar2.f(zBooleanValue2);
                return Unit.f46060a;
            case 23:
                ((TextWatcher) this.receiver).afterTextChanged((Editable) obj);
                return Unit.f46060a;
            case 24:
                xbn xbnVar = (xbn) obj;
                xbnVar.getClass();
                vbn vbnVar = (vbn) this.receiver;
                nek nekVar = vbn.n2;
                vbnVar.getClass();
                if (Intrinsics.d(xbnVar, xbn.f40608a)) {
                    vbnVar.y0();
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((kin) this.receiver).A(th14);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((kin) this.receiver).A(th15);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((kin) this.receiver).z(th16);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((kin) this.receiver).z(th17);
                return Unit.f46060a;
            default:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((kin) this.receiver).z(th18);
                return Unit.f46060a;
        }
    }
}

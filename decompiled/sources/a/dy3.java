package a;

import android.view.ViewGroup;
import androidx.media3.ui.AspectRatioFrameLayout;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.xplatform.cyber.calendar.impl.presentation.container.monthpicker.numberpicker.CyberCalendarMonthPicker;

/* JADX INFO: loaded from: classes6.dex */
public final class dy3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6874a;
    public boolean b;
    public final /* synthetic */ Object c;

    public dy3(b1x0 b1x0Var, boolean z) {
        this.f6874a = (byte) 3;
        this.b = z;
        Objects.requireNonNull(b1x0Var);
        this.c = b1x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // java.lang.Runnable
    public final void run() {
        Object value;
        boolean z = false;
        switch (this.f6874a) {
            case 0:
                this.b = false;
                int i = AspectRatioFrameLayout.d;
                break;
            case 1:
                CyberCalendarMonthPicker cyberCalendarMonthPicker = (CyberCalendarMonthPicker) this.c;
                cyberCalendarMonthPicker.a(this.b);
                cyberCalendarMonthPicker.postDelayed(this, cyberCalendarMonthPicker.q);
                break;
            case 2:
                xbq0 xbq0Var = (xbq0) this.c;
                m6m0 m6m0Var = xbq0.O1;
                zbq0 zbq0VarK0 = xbq0Var.K0();
                boolean z2 = this.b;
                if (zbq0VarK0.h.f36139a.f() != z2) {
                    wyu wyuVar = zbq0VarK0.d;
                    uaq0 uaq0VarA = wyuVar.a();
                    zbq0VarK0.i.f6956a.f36880a.d("NIGHT_MODE_TIME_TABLE", z2);
                    ((HashMap) zbq0VarK0.c.d).put("calendar", z2 ? "calendar_on" : "calendar_off");
                    ((LinkedHashMap) zbq0VarK0.m.d).put("THEME_TIMETABLE_ON_KEY", z2 ? "calendar_on" : "calendar_off");
                    p7m0 p7m0Var = zbq0VarK0.n;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, obq0.a((obq0) value, null, z2, false, null, null, 59)));
                    if (wyuVar.a() != uaq0VarA) {
                        zbq0VarK0.l.c(uaq0VarA);
                    }
                }
                break;
            default:
                b1x0 b1x0Var = (b1x0) this.c;
                kxw0 kxw0Var = (kxw0) b1x0Var.b;
                boolean zA = kxw0Var.a();
                boolean z3 = kxw0Var.y != null && kxw0Var.y.booleanValue();
                boolean z4 = this.b;
                kxw0Var.y = Boolean.valueOf(z4);
                if (z3 == z4) {
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.o.b(Boolean.valueOf(z4), "Default data collection state already set to");
                }
                if (kxw0Var.a() != zA) {
                    boolean zA2 = kxw0Var.a();
                    if (kxw0Var.y != null && kxw0Var.y.booleanValue()) {
                        z = true;
                    }
                    if (zA2 != z) {
                        uuw0 uuw0Var2 = kxw0Var.f;
                        kxw0.g(uuw0Var2);
                        uuw0Var2.l.c(Boolean.valueOf(z4), Boolean.valueOf(zA), "Default data collection is different than actual status");
                    }
                } else {
                    uuw0 uuw0Var3 = kxw0Var.f;
                    kxw0.g(uuw0Var3);
                    uuw0Var3.l.c(Boolean.valueOf(z4), Boolean.valueOf(zA), "Default data collection is different than actual status");
                }
                b1x0Var.D1();
                break;
        }
    }

    public /* synthetic */ dy3(ViewGroup viewGroup, byte b) {
        this.f6874a = b;
        this.c = viewGroup;
    }

    public dy3(xbq0 xbq0Var, boolean z) {
        this.f6874a = (byte) 2;
        this.c = xbq0Var;
        this.b = z;
    }
}

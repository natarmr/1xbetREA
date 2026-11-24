package a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.prophylaxis.impl.prophylaxis.presentation.ProphylaxisAlarmReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class cu3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zu3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu3(zu3 zu3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zu3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zu3 zu3Var = this.k;
        switch (b) {
            case 0:
                cu3 cu3Var = new cu3(zu3Var, yjeVar, (byte) 0);
                cu3Var.j = obj;
                return cu3Var;
            case 1:
                cu3 cu3Var2 = new cu3(zu3Var, yjeVar, (byte) 1);
                cu3Var2.j = obj;
                return cu3Var2;
            case 2:
                cu3 cu3Var3 = new cu3(zu3Var, yjeVar, (byte) 2);
                cu3Var3.j = obj;
                return cu3Var3;
            case 3:
                cu3 cu3Var4 = new cu3(zu3Var, yjeVar, (byte) 3);
                cu3Var4.j = obj;
                return cu3Var4;
            case 4:
                cu3 cu3Var5 = new cu3(zu3Var, yjeVar, (byte) 4);
                cu3Var5.j = obj;
                return cu3Var5;
            default:
                cu3 cu3Var6 = new cu3(zu3Var, yjeVar, (byte) 5);
                cu3Var6.j = obj;
                return cu3Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cu3) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((cu3) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((cu3) create((xkb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((cu3) create((o1d0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((cu3) create((t1d0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cu3) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        byte b = this.i;
        zu3 zu3Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                zu3Var.h0.f(new ot3((String) obj2));
                return Unit.f46060a;
            case 1:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var.f32897a && !sw00Var.b) {
                    int i = zu3.s0;
                    bby bbyVar = zu3Var.p0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    bby bbyVar2 = zu3Var.o0;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    bby bbyVar3 = zu3Var.n0;
                    if (bbyVar3 != null) {
                        bbyVar3.cancel(null);
                    }
                    zu3.r0 = 0L;
                    zu3Var.A(10L);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                zu3Var.g0.n((xkb0) obj2);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (!(((o1d0) obj2) instanceof n1d0)) {
                    a1d0 a1d0VarB = ((c1d0) zu3Var.f.get()).b();
                    a1d0VarB.getClass();
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        int i2 = ProphylaxisAlarmReceiver.h;
                        us00 us00Var = a1d0VarB.f67a;
                        Object systemService = us00Var.getSystemService("alarm");
                        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
                        if (alarmManager != null) {
                            PendingIntent broadcast = PendingIntent.getBroadcast(us00Var, 0, new Intent(us00Var, (Class<?>) ProphylaxisAlarmReceiver.class), rsr0.e0(134217728));
                            broadcast.getClass();
                            alarmManager.cancel(broadcast);
                        }
                        g0g0Var = Unit.f46060a;
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    Throwable thA = j0g0.a(g0g0Var);
                    if (thA != null) {
                        thA.printStackTrace();
                    }
                    break;
                } else if (!((pru) zu3Var.J.get()).a().G1) {
                    zu3Var.c.d(new vs3(zu3Var, (byte) 1));
                    us00 us00Var2 = ((kdv0) zu3Var.h.get()).b().f20325a;
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(us00Var2);
                    List<AppWidgetProviderInfo> installedProviders = appWidgetManager.getInstalledProviders();
                    installedProviders.getClass();
                    Iterator<T> it = installedProviders.iterator();
                    while (it.hasNext()) {
                        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(us00Var2, ((AppWidgetProviderInfo) it.next()).provider.getClassName()));
                        appWidgetIds.getClass();
                        for (int i3 : appWidgetIds) {
                            appWidgetManager.updateAppWidgetOptions(i3, i120.V(new Pair("show_prophylaxis", Boolean.TRUE)));
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                t1d0 t1d0Var = (t1d0) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ol60 ol60Var = zu3Var.h0;
                if (((pru) zu3Var.J.get()).a().G1) {
                    return Unit.f46060a;
                }
                if (t1d0Var != null) {
                    if (!(t1d0Var instanceof r1d0)) {
                        if (t1d0Var instanceof q1d0) {
                            ol60Var.f(kt3.f18843a);
                        } else if (t1d0Var instanceof p1d0) {
                            ol60Var.f(dt3.f6643a);
                        } else if (t1d0Var instanceof s1d0) {
                            s1d0 s1d0Var = (s1d0) t1d0Var;
                            ol60Var.f(new nt3(s1d0Var.f31451a, s1d0Var.b));
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                ((duj) zu3Var.F.get()).b((Throwable) obj2, new o33((byte) 7));
                return Unit.f46060a;
        }
    }
}

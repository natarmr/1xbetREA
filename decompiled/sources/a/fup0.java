package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.toto_bet.outcomes.presentation.screen.TotoOutcomesSelectionNavigationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fup0 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10176a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fup0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f10176a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z = false;
        switch (this.f10176a) {
            case 0:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 1:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 2:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 3:
                Calendar calendar = (Calendar) obj;
                Calendar calendar2 = (Calendar) obj2;
                calendar.getClass();
                calendar2.getClass();
                ((rhq0) this.receiver).getClass();
                return calendar.get(1) != calendar2.get(1) ? efj.UNIVERSAL : efj.UNIQUE_1;
            case 4:
                Calendar calendar3 = (Calendar) obj;
                Calendar calendar4 = (Calendar) obj2;
                calendar3.getClass();
                calendar4.getClass();
                ((rhq0) this.receiver).getClass();
                return calendar3.get(1) != calendar4.get(1) ? efj.UNIVERSAL : efj.UNIQUE_1;
            case 5:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 6:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 7:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 8:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 9:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 10:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 11:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 12:
                int iIntValue = ((Number) obj).intValue();
                md80 md80Var = (md80) obj2;
                md80Var.getClass();
                njr0 njr0Var = (njr0) this.receiver;
                njr0Var.getClass();
                sac.V(jiu0.a(njr0Var), new mjr0(1, njr0Var, njr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, njr0Var.b.b, new d21((Object) njr0Var, iIntValue, (Object) md80Var, (yje) null, (byte) 18), 10);
                return Unit.f46060a;
            case 13:
                int iIntValue2 = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                i1w0 i1w0Var = ((njr0) this.receiver).c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen totoOutcomesSelectionNavigationScreen = new TotoOutcomesSelectionNavigationScreen(iIntValue2, jLongValue);
                if (totoOutcomesSelectionNavigationScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) totoOutcomesSelectionNavigationScreen)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(totoOutcomesSelectionNavigationScreen)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 14:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 15:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 16:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 17:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 18:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 20:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 21:
                wgs0 wgs0Var = (wgs0) obj;
                List list = (List) obj2;
                wgs0Var.getClass();
                list.getClass();
                ((vgs0) this.receiver).getClass();
                return Boolean.valueOf(list.size() < wgs0Var.f39133a);
            case 22:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 23:
                wsy wsyVar = (wsy) obj;
                wsy wsyVar2 = (wsy) obj2;
                wsyVar.getClass();
                wsyVar2.getClass();
                ((yys0) this.receiver).getClass();
                km50.b.getClass();
                lm50 lm50Var = jm50.b;
                if (lm50Var.b(wsyVar, wsyVar2) && !lm50Var.b(wsyVar2, wsyVar)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                wsy wsyVar3 = (wsy) obj;
                wsy wsyVar4 = (wsy) obj2;
                wsyVar3.getClass();
                wsyVar4.getClass();
                return Boolean.valueOf(((lm50) this.receiver).a(wsyVar3, wsyVar4));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            default:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
        }
    }
}

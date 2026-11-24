package a;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.calendar.model.BorderDateTimeModel;
import org.xplatform.ui_core.calendar.model.DateRangeWithTimeCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes3.dex */
public final class q87 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ f97 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q87(f97 f97Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f97Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f97 f97Var = this.k;
        switch (b) {
            case 0:
                return new q87(f97Var, yjeVar, (byte) 0);
            case 1:
                q87 q87Var = new q87(f97Var, yjeVar, (byte) 1);
                q87Var.j = ((Boolean) obj).booleanValue();
                return q87Var;
            case 2:
                return new q87(f97Var, yjeVar, (byte) 2);
            case 3:
                return new q87(f97Var, yjeVar, (byte) 3);
            case 4:
                return new q87(f97Var, yjeVar, (byte) 4);
            case 5:
                return new q87(f97Var, yjeVar, (byte) 5);
            default:
                return new q87(f97Var, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((q87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((q87) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((q87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((q87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((q87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((q87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((q87) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object objJ;
        Object value4;
        Object objA;
        ql5 ql5Var;
        Object objT;
        byte b = this.i;
        f97 f97Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    int i = f97.R0;
                    if (f97Var.N(true, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ocj ocjVar = f97Var.i;
                if ((!((i77) f97Var.D()).C || !z2) && ((i77) f97Var.D()).t.isEmpty()) {
                    if (((i77) f97Var.D()).C && !z2) {
                        p7m0 p7m0Var = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var.getValue();
                            value2.getClass();
                        } while (!p7m0Var.m(value2, i77.a((i77) value2, false, false, true, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -6, 2047)));
                    } else if (!((i77) f97Var.D()).C && z2) {
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value = p7m0Var2.getValue();
                            value.getClass();
                        } while (!p7m0Var2.m(value, i77.a((i77) value, true, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -2, 2047)));
                        f97Var.h0();
                        f97Var.a0();
                    }
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                while (true) {
                    Object value5 = p7m0Var3.getValue();
                    value5.getClass();
                    boolean z3 = z2;
                    if (p7m0Var3.m(value5, i77.a((i77) value5, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, z3, null, null, null, null, null, -268435457, 2047))) {
                        return Unit.f46060a;
                    }
                    z2 = z3;
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(1000L, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = f97.R0;
                p7m0 p7m0Var4 = f97Var.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                } while (!p7m0Var4.m(value3, i77.a((i77) value3, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -4194305, 2047)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    ocl oclVar = f97Var.O;
                    this.j = true;
                    objJ = oclVar.j();
                    if (objJ == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objJ = obj;
                }
                List list = (List) objJ;
                int i3 = f97.R0;
                p7m0 p7m0Var5 = f97Var.i.f25029a;
                do {
                    value4 = p7m0Var5.getValue();
                    value4.getClass();
                } while (!p7m0Var5.m(value4, i77.a((i77) value4, false, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, list, false, false, false, null, null, null, null, null, -8388609, 2047)));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    this.j = true;
                    int i4 = f97.R0;
                    if (f97Var.N(false, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    rou rouVar = f97Var.z;
                    this.j = true;
                    objA = rouVar.a(false, this);
                    if (objA == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                boolean zContains = q3d.j(jqt0.c, jqt0.d).contains(((m2c0) objA).k);
                if (zContains && ((i77) f97Var.D()).Q) {
                    Calendar calendar = Calendar.getInstance();
                    SimpleDate simpleDateG0 = bsr0.g0(calendar.getTimeInMillis(), calendar);
                    BorderDateTimeModel borderDateTimeModel = new BorderDateTimeModel(simpleDateG0, null);
                    calendar.add(5, -89);
                    BorderDateTimeModel borderDateTimeModel2 = new BorderDateTimeModel(bsr0.g0(calendar.getTimeInMillis(), calendar), null);
                    String strA = f97Var.r.b.a(R.string.calendar_date_module_set_period, Arrays.copyOf(new Object[0], 0));
                    ulq0 ulq0Var = ulq0.f35886a;
                    Long l = new Long(calendar.getTimeInMillis());
                    wdx.J(simpleDateG0, calendar);
                    f97Var.G(new a67(new DateRangeWithTimeCalendarBottomSheetParams(strA, borderDateTimeModel2, borderDateTimeModel, l, new Long(calendar.getTimeInMillis()), 16)));
                } else if (zContains) {
                    y57 y57Var = new y57(0L);
                    int i5 = f97.R0;
                    f97Var.G(y57Var);
                } else {
                    int i6 = f97.R0;
                    f97Var.G(b67.f2038a);
                }
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    ql5Var = ((i77) f97Var.D()).e;
                    if (ql5Var == null) {
                        this.j = true;
                        objT = f97Var.T(this);
                        if (objT == wneVar7) {
                            return wneVar7;
                        }
                    }
                    f97Var.G(new o67(ql5Var, i8w.a(f97Var.p), ((i77) f97Var.D()).i));
                    return Unit.f46060a;
                }
                if (!z8) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objT = obj;
                ql5Var = (ql5) objT;
                f97Var.G(new o67(ql5Var, i8w.a(f97Var.p), ((i77) f97Var.D()).i));
                return Unit.f46060a;
        }
    }
}

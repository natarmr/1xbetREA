package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;

/* JADX INFO: loaded from: classes4.dex */
public final class sco0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31997a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sco0(Object obj, Object obj2, byte b) {
        this.f31997a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x028b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e8  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        rco0 rco0Var;
        Object value;
        v1q0 v1q0Var;
        fmr0 fmr0Var;
        ucv0 ucv0Var;
        i3m0 i3m0Var;
        Object value2;
        byte b = this.f31997a;
        boolean z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof rco0) {
                    rco0Var = (rco0) yjeVar;
                    int i = rco0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        rco0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        rco0Var = new rco0(this, yjeVar);
                    }
                } else {
                    rco0Var = new rco0(this, yjeVar);
                }
                Object obj4 = rco0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = rco0Var.j;
                if (i2 == 0) {
                    z1x.P(obj4);
                    kmq kmqVar = (kmq) obj3;
                    tk60 tk60Var = (tk60) obj;
                    if (!Intrinsics.d(tk60Var, qk60.f28870a)) {
                        if (!(tk60Var instanceof rk60)) {
                            t9f.b();
                            return null;
                        }
                        if (((rk60) tk60Var).f30634a == ((sh60) obj2)) {
                            z = true;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    rco0Var.j = 1;
                    if (kmqVar.a(boolValueOf, rco0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 1:
                TennisSummaryFilterModel tennisSummaryFilterModel = (TennisSummaryFilterModel) obj;
                pyp0 pyp0Var = (pyp0) obj3;
                TennisSummaryFilterModel tennisSummaryFilterModel2 = (TennisSummaryFilterModel) obj2;
                int i3 = pyp0.w;
                p7m0 p7m0Var = pyp0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    pyp0Var.f.getClass();
                    tennisSummaryFilterModel.getClass();
                    tennisSummaryFilterModel2.getClass();
                } while (!p7m0Var.m(value, new nyp0(tennisSummaryFilterModel, tennisSummaryFilterModel, tennisSummaryFilterModel2)));
                vzg0 vzg0Var = pyp0Var.o;
                vzg0Var.e("START_FILTER_MODEL_KEY", tennisSummaryFilterModel);
                vzg0Var.e("CURRENT_FILTER_MODEL_KEY", tennisSummaryFilterModel);
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof v1q0) {
                    v1q0Var = (v1q0) yjeVar;
                    int i4 = v1q0Var.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        v1q0Var.j = i4 - Integer.MIN_VALUE;
                    } else {
                        v1q0Var = new v1q0(this, yjeVar);
                    }
                } else {
                    v1q0Var = new v1q0(this, yjeVar);
                }
                Object obj5 = v1q0Var.i;
                wne wneVar2 = wne.f39444a;
                int i5 = v1q0Var.j;
                if (i5 == 0) {
                    z1x.P(obj5);
                    kmq kmqVar2 = (kmq) obj3;
                    a2q0 a2q0Var = (a2q0) obj;
                    ctf0 ctf0Var = ((x1q0) obj2).k;
                    a2q0Var.getClass();
                    ctf0Var.getClass();
                    if (!(a2q0Var instanceof a2q0)) {
                        t9f.b();
                        return null;
                    }
                    b2q0 b2q0Var = new b2q0(ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0)), a2q0Var);
                    v1q0Var.j = 1;
                    if (kmqVar2.a(b2q0Var, v1q0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i5 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 3:
                nlx nlxVar = (nlx) obj;
                kie0 kie0Var = (kie0) obj3;
                if (nlxVar instanceof jub0) {
                    kie0Var.f18333a++;
                } else if ((nlxVar instanceof kub0) || (nlxVar instanceof iub0)) {
                    kie0Var.f18333a--;
                }
                z = kie0Var.f18333a > 0;
                jdq0 jdq0Var = (jdq0) obj2;
                if (jdq0Var.r != z) {
                    jdq0Var.r = z;
                    n7x.I(jdq0Var);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof fmr0) {
                    fmr0Var = (fmr0) yjeVar;
                    int i6 = fmr0Var.j;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        fmr0Var.j = i6 - Integer.MIN_VALUE;
                    } else {
                        fmr0Var = new fmr0(this, yjeVar);
                    }
                } else {
                    fmr0Var = new fmr0(this, yjeVar);
                }
                Object obj6 = fmr0Var.i;
                wne wneVar3 = wne.f39444a;
                int i7 = fmr0Var.j;
                if (i7 == 0) {
                    z1x.P(obj6);
                    kmq kmqVar3 = (kmq) obj3;
                    List<lmr0> list = (List) obj;
                    gmr0 gmr0Var = (gmr0) obj2;
                    String strA = gmr0Var.d.b.a(R.string.change_toto_dialog_title_without_name_v2, Arrays.copyOf(new Object[]{gmr0Var.b.a().f32117a.f}, 1));
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    for (lmr0 lmr0Var : list) {
                        lmr0Var.getClass();
                        int i8 = lmr0Var.f20312a;
                        String str = lmr0Var.b;
                        ulr0 ulr0Var = lmr0Var.c;
                        arrayList.add(new pmr0(i8, str, ulr0Var, lmr0Var.d, afn0.n(ulr0Var)));
                    }
                    jq8 jq8Var = new jq8(strA, arrayList);
                    fmr0Var.j = 1;
                    if (kmqVar3.a(jq8Var, fmr0Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i7 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 5:
                vcv0 vcv0Var = (vcv0) obj2;
                if (yjeVar instanceof ucv0) {
                    ucv0Var = (ucv0) yjeVar;
                    int i9 = ucv0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ucv0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        ucv0Var = new ucv0(this, yjeVar);
                    }
                } else {
                    ucv0Var = new ucv0(this, yjeVar);
                }
                Object obj7 = ucv0Var.i;
                wne wneVar4 = wne.f39444a;
                int i10 = ucv0Var.j;
                if (i10 == 0) {
                    z1x.P(obj7);
                    kmq kmqVar4 = (kmq) obj3;
                    dqk0 dqk0Var = (dqk0) obj;
                    if (dqk0Var != null) {
                        if (dqk0Var instanceof bqk0) {
                            int i11 = vcv0.B;
                            p7m0 p7m0Var2 = vcv0Var.i.f25029a;
                            do {
                                value2 = p7m0Var2.getValue();
                                value2.getClass();
                                vcv0Var.f.getClass();
                            } while (!p7m0Var2.m(value2, ncv0.a((ncv0) value2, iun.f15405a, null, true, false, false, 120)));
                        } else if (dqk0Var instanceof cqk0) {
                            Iterable<ifb> iterable = (Iterable) ((cqk0) dqk0Var).f4798a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                            for (ifb ifbVar : iterable) {
                                ifbVar.getClass();
                                if (ifbVar instanceof efb) {
                                    i3m0Var = e3m0.f7145a;
                                } else if (ifbVar instanceof ffb) {
                                    i3m0Var = f3m0.f8871a;
                                } else {
                                    if (!(ifbVar instanceof gfb)) {
                                        t9f.b();
                                        return null;
                                    }
                                    i3m0Var = g3m0.f10617a;
                                }
                                arrayList2.add(i3m0Var);
                            }
                            a8 a8Var = new a8(arrayList2, vcv0Var, (byte) 27);
                            int i12 = vcv0.B;
                            vcv0Var.H(a8Var);
                        }
                        Unit unit = Unit.f46060a;
                        ucv0Var.j = 1;
                        if (kmqVar4.a(unit, ucv0Var) == wneVar4) {
                            return wneVar4;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i10 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj7);
                return Unit.f46060a;
            case 6:
                pz40 pz40Var = (pz40) obj2;
                if ((((nlx) obj) instanceof nel) && !((Boolean) pz40Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                    ((Function0) obj3).invoke();
                }
                return Unit.f46060a;
            default:
                ((ah60) obj3).a((ppv0) obj2, (w4e) obj);
                return Unit.f46060a;
        }
    }
}

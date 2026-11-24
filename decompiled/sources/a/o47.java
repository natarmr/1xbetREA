package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o47 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o47(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f24618a = b;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Iterable iterable;
        switch (this.f24618a) {
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
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 4:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
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
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 13:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
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
                mk50 mk50Var = (mk50) obj;
                String str = (String) obj2;
                mk50Var.getClass();
                str.getClass();
                jgb jgbVar = (jgb) this.receiver;
                jgbVar.getClass();
                eyg0 eyg0Var = jgbVar.t;
                boolean zH = jgbVar.w.h();
                v5l0 v5l0VarE = jgbVar.y.e();
                long j = jgbVar.v;
                ctf0 ctf0Var = jgbVar.w;
                r9u r9uVar = jgbVar.x;
                ygp ygpVar = ygp.B;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                ArrayList arrayListD0 = b8k0.d0(mk50Var, zH, v5l0VarE, j, ctf0Var, j1q0Var.f15748a.d(ygpVar));
                eyg0Var.getClass();
                a0m0 a0m0Var = (a0m0) ((lef0) eyg0Var.b).f19899a;
                a0m0Var.getClass();
                a0m0Var.f32a = arrayListD0;
                i1w0 i1w0Var = jgbVar.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new c1w0(new d0m0(str, jgbVar.i), null)), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 22:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                jgb jgbVar2 = (jgb) this.receiver;
                p7m0 p7m0Var = jgbVar2.j;
                v26 v26Var = (v26) p7m0Var.getValue();
                if (v26Var == null) {
                    iterable = iun.f15405a;
                } else if (v26Var instanceof t26) {
                    iterable = ((t26) v26Var).f33201a;
                } else if (v26Var instanceof u26) {
                    iterable = ((u26) v26Var).f34931a;
                } else {
                    iterable = iun.f15405a;
                }
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                int i = 0;
                for (Object obj3 : iterable) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    j1m0 h1m0Var = (j1m0) obj3;
                    if ((h1m0Var instanceof h1m0) && iIntValue2 - 1 == i) {
                        ArrayList arrayList2 = ((h1m0) h1m0Var).f12291a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        int i3 = 0;
                        for (Object obj4 : arrayList2) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList3.add(ifo0.c((ifo0) obj4, i3 == iIntValue));
                            i3 = i4;
                        }
                        h1m0Var = new h1m0(arrayList3);
                    }
                    arrayList.add(h1m0Var);
                    i = i2;
                }
                r9u r9uVar2 = jgbVar2.h;
                ygp ygpVar2 = ygp.t;
                r9uVar2.getClass();
                j1q0 j1q0Var2 = r9uVar2.f30104a;
                j1q0Var2.getClass();
                p7m0Var.o(null, new u26(arrayList, j1q0Var2.f15748a.d(ygpVar2)));
                return Unit.f46060a;
            case 23:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 24:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
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

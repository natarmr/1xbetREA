package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.registration.api.domain.models.BonusInfoModel;

/* JADX INFO: loaded from: classes5.dex */
public final class n6f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6f(eiz eizVar, long j, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.m = eizVar;
        this.k = j;
        this.l = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new n6f((r7f) obj2, this.l, this.k, yjeVar, (byte) 0);
            case 1:
                return new n6f((eiz) obj2, this.k, this.l, yjeVar);
            default:
                return new n6f((oue0) obj2, this.l, this.k, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((n6f) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Object o3fVar;
        Object obj2;
        Object objA;
        byte b = this.i;
        long j = this.k;
        int i = this.l;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                r7f r7fVar = (r7f) obj3;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    lhf0 lhf0Var = r7fVar.I;
                    this.j = true;
                    objV = lhf0Var.v(i, this);
                    if (objV == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objV = obj;
                }
                ol60 ol60Var = r7fVar.d2;
                int iOrdinal = ((u4k) objV).ordinal();
                if (iOrdinal == 0) {
                    o3fVar = new o3f(this.l, R.string.remove_push, R.string.coupon_edit_confirm_delete_message, this.k, false);
                } else if (iOrdinal == 1) {
                    o3fVar = new u3f(i, j, true);
                } else if (iOrdinal == 2) {
                    o3fVar = new o3f(this.l, R.string.attention, R.string.coupon_reset_to_express_delete_event_message, this.k, false);
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    o3fVar = new o3f(this.l, R.string.attention, R.string.coupon_condition_bet_move_event_error, this.k, true);
                }
                ol60Var.f(o3fVar);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    cmt cmtVar = ((eiz) obj3).t;
                    this.j = true;
                    Object objH = cmtVar.h(i, j, this);
                    if (objH == wneVar2) {
                        return wneVar2;
                    }
                    obj2 = objH;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj2 = ((j0g0) obj).f15681a;
                }
                return new j0g0(obj2);
            default:
                oue0 oue0Var = (oue0) obj3;
                knf0 knf0Var = oue0Var.c;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    wsf0 wsf0Var = oue0Var.f25873a;
                    knf0Var.getClass();
                    String strC = knf0Var.c();
                    this.j = true;
                    objA = ((di8) ((zm) wsf0Var.b).invoke()).a(1, this.l, this.k, strC, this);
                    if (objA == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                Iterable<eg8> iterable = (Iterable) ((q16) objA).a();
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                for (eg8 eg8Var : iterable) {
                    eg8Var.getClass();
                    Integer num = eg8Var.f7751a;
                    if (num == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue = num.intValue();
                    String str = eg8Var.b;
                    if (str == null) {
                        jf4.k(null);
                        return null;
                    }
                    String str2 = eg8Var.c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Boolean bool = eg8Var.d;
                    arrayList.add(new BonusInfoModel(iIntValue, str, str2, bool != null ? bool.booleanValue() : false));
                }
                zj8 zj8Var = oue0Var.b;
                zj8Var.getClass();
                zj8Var.f44472a = new be8(i, j, arrayList);
                return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6f(Object obj, int i, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.l = i;
        this.k = j;
    }
}

package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class loo implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20403a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ String c;

    public /* synthetic */ loo(kmq kmqVar, String str, byte b) {
        this.f20403a = b;
        this.b = kmqVar;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        koo kooVar;
        ixt ixtVar;
        l3v l3vVar;
        dl00 dl00Var;
        byte b = this.f20403a;
        String str = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof koo) {
                    kooVar = (koo) yjeVar;
                    int i = kooVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kooVar.j = i - Integer.MIN_VALUE;
                    } else {
                        kooVar = new koo(this, yjeVar);
                    }
                } else {
                    kooVar = new koo(this, yjeVar);
                }
                Object obj2 = kooVar.i;
                wne wneVar = wne.f39444a;
                int i2 = kooVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    Object obj3 = (Map) ((Map) obj).get(str);
                    if (obj3 == null) {
                        obj3 = lun.f20680a;
                        obj3.getClass();
                    }
                    kooVar.j = 1;
                    if (kmqVar.a(obj3, kooVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof ixt) {
                    ixtVar = (ixt) yjeVar;
                    int i3 = ixtVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ixtVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        ixtVar = new ixt(this, yjeVar);
                    }
                } else {
                    ixtVar = new ixt(this, yjeVar);
                }
                Object obj4 = ixtVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = ixtVar.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    e0g0 e0g0Var = j0g0.b;
                    j0g0 j0g0Var = new j0g0(new ubb((List) obj, str));
                    ixtVar.j = 1;
                    if (kmqVar.a(j0g0Var, ixtVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof l3v) {
                    l3vVar = (l3v) yjeVar;
                    int i5 = l3vVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        l3vVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        l3vVar = new l3v(this, yjeVar);
                    }
                } else {
                    l3vVar = new l3v(this, yjeVar);
                }
                Object obj5 = l3vVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = l3vVar.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    e0g0 e0g0Var2 = j0g0.b;
                    j0g0 j0g0Var2 = new j0g0(new fcg((List) obj, str));
                    l3vVar.j = 1;
                    if (kmqVar.a(j0g0Var2, l3vVar) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof dl00) {
                    dl00Var = (dl00) yjeVar;
                    int i7 = dl00Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        dl00Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        dl00Var = new dl00(this, yjeVar);
                    }
                } else {
                    dl00Var = new dl00(this, yjeVar);
                }
                Object obj6 = dl00Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = dl00Var.j;
                if (i8 == 0) {
                    z1x.P(obj6);
                    e0g0 e0g0Var3 = j0g0.b;
                    j0g0 j0g0Var3 = new j0g0(new fcg((List) obj, str));
                    dl00Var.j = 1;
                    if (kmqVar.a(j0g0Var3, dl00Var) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
        }
    }
}

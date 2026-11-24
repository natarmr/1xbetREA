package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class uuu implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36320a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ int c;

    public /* synthetic */ uuu(kmq kmqVar, int i, byte b) {
        this.f36320a = b;
        this.b = kmqVar;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        tuu tuuVar;
        fi80 fi80Var;
        ypp0 ypp0Var;
        byte b = this.f36320a;
        int i = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof tuu) {
                    tuuVar = (tuu) yjeVar;
                    int i2 = tuuVar.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        tuuVar.j = i2 - Integer.MIN_VALUE;
                    } else {
                        tuuVar = new tuu(this, yjeVar);
                    }
                } else {
                    tuuVar = new tuu(this, yjeVar);
                }
                Object obj2 = tuuVar.i;
                wne wneVar = wne.f39444a;
                int i3 = tuuVar.j;
                if (i3 == 0) {
                    z1x.P(obj2);
                    List listD0 = CollectionsKt.D0((List) obj, i);
                    tuuVar.j = 1;
                    if (kmqVar.a(listD0, tuuVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i3 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof fi80) {
                    fi80Var = (fi80) yjeVar;
                    int i4 = fi80Var.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        fi80Var.j = i4 - Integer.MIN_VALUE;
                    } else {
                        fi80Var = new fi80(this, yjeVar);
                    }
                } else {
                    fi80Var = new fi80(this, yjeVar);
                }
                Object obj3 = fi80Var.i;
                wne wneVar2 = wne.f39444a;
                int i5 = fi80Var.j;
                if (i5 == 0) {
                    z1x.P(obj3);
                    rjt rjtVar = new rjt(i, (vmu0) obj);
                    fi80Var.j = 1;
                    if (kmqVar.a(rjtVar, fi80Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i5 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof ypp0) {
                    ypp0Var = (ypp0) yjeVar;
                    int i6 = ypp0Var.j;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ypp0Var.j = i6 - Integer.MIN_VALUE;
                    } else {
                        ypp0Var = new ypp0(this, yjeVar);
                    }
                } else {
                    ypp0Var = new ypp0(this, yjeVar);
                }
                Object obj4 = ypp0Var.i;
                wne wneVar3 = wne.f39444a;
                int i7 = ypp0Var.j;
                if (i7 == 0) {
                    z1x.P(obj4);
                    Object obj5 = (List) ((Map) obj).get(new Integer(i));
                    if (obj5 == null) {
                        obj5 = iun.f15405a;
                    }
                    ypp0Var.j = 1;
                    if (kmqVar.a(obj5, ypp0Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i7 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
        }
    }
}

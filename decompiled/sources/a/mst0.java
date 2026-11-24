package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mst0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ nst0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mst0(nst0 nst0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.k = nst0Var;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nst0 nst0Var = this.k;
        switch (b) {
            case 0:
                return new mst0(nst0Var, yjeVar, (byte) 0);
            case 1:
                return new mst0(nst0Var, yjeVar, (byte) 1);
            case 2:
                return new mst0(nst0Var, this.j, yjeVar);
            case 3:
                return new mst0(nst0Var, yjeVar, (byte) 3);
            default:
                return new mst0(nst0Var, yjeVar, (byte) 4);
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
            case 2:
                break;
            case 3:
                break;
        }
        return ((mst0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        nst0 nst0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                lst0 lst0Var = nst0Var.f24065a;
                this.j = true;
                Long l = new Long(lst0Var.f20598a.a().getLong("LAST_USER_INACTIVITY_START_TIME_MS_PREF_KEY", 0L));
                return l == wneVar ? wneVar : l;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                lst0 lst0Var2 = nst0Var.f24065a;
                this.j = true;
                Long l2 = new Long(lst0Var2.f20598a.a().getLong("USER_SESSION_START_TIME_MS_PREF_KEY", 0L));
                return l2 == wneVar2 ? wneVar2 : l2;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                wf3 wf3Var = nst0Var.b;
                boolean z3 = this.j;
                q7d0 q7d0Var = wf3Var.f39048a;
                q7d0Var.h("CURRENT_APP_SESSION_STATUS");
                q7d0Var.d("CURRENT_APP_SESSION_STATUS", z3);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    lst0 lst0Var3 = nst0Var.f24065a;
                    this.j = true;
                    q7d0 q7d0Var2 = lst0Var3.f20598a;
                    long j = q7d0Var2.a().getLong("LAST_USER_INACTIVITY_START_TIME_MS_PREF_KEY", 0L);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (j != jCurrentTimeMillis) {
                        q7d0Var2.h("LAST_USER_INACTIVITY_START_TIME_MS_PREF_KEY");
                        q7d0Var2.f("LAST_USER_INACTIVITY_START_TIME_MS_PREF_KEY", jCurrentTimeMillis);
                    }
                    if (Unit.f46060a == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    lst0 lst0Var4 = nst0Var.f24065a;
                    this.j = true;
                    q7d0 q7d0Var3 = lst0Var4.f20598a;
                    q7d0Var3.h("USER_SESSION_START_TIME_MS_PREF_KEY");
                    q7d0Var3.f("USER_SESSION_START_TIME_MS_PREF_KEY", System.currentTimeMillis());
                    if (Unit.f46060a == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mst0(nst0 nst0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nst0Var;
    }
}

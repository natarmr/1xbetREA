package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class epj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gpj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ epj0(gpj0 gpj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gpj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gpj0 gpj0Var = this.k;
        switch (b) {
            case 0:
                epj0 epj0Var = new epj0(gpj0Var, yjeVar, (byte) 0);
                epj0Var.j = obj;
                return epj0Var;
            default:
                epj0 epj0Var2 = new epj0(gpj0Var, yjeVar, (byte) 1);
                epj0Var2.j = obj;
                return epj0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gji0 gji0Var = (gji0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((epj0) create(gji0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        byte b = this.i;
        gpj0 gpj0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gji0 gji0Var = (gji0) this.j;
                gpj0Var.d.getClass();
                return gji0.a(gji0Var, null, olq0.a(), null, 5);
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                gji0 gji0Var2 = (gji0) this.j;
                qyb0 qyb0Var = gpj0Var.f;
                boolean zD = gpj0Var.d(gji0Var2);
                Map mapB = gji0Var2.c;
                if (mapB != null) {
                    qyb0Var.getClass();
                    z = false;
                    if (!qyb0Var.f) {
                        ArrayList<ryb0> arrayListF = m7x.F(qyb0Var.f29524a);
                        ArrayList arrayList = new ArrayList();
                        for (ryb0 ryb0Var : arrayListF) {
                            oyb0 oyb0Var = (oyb0) mapB.get(ryb0Var.f31306a);
                            Pair pair = oyb0Var != null ? new Pair(ryb0Var, oyb0Var) : null;
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Pair pair2 = (Pair) it.next();
                                    ryb0 ryb0Var2 = (ryb0) pair2.f46059a;
                                    oyb0 oyb0Var2 = (oyb0) pair2.b;
                                    boolean zD2 = Intrinsics.d(qyb0Var.a(), ryb0Var2.f31306a);
                                    int i = ryb0Var2.b;
                                    if (zD2) {
                                        if (i != oyb0Var2.f26054a || !Intrinsics.d((String) qyb0Var.d.getValue(), oyb0Var2.b)) {
                                        }
                                    } else if (i != oyb0Var2.f26054a) {
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z = true;
                }
                boolean zC = gpj0Var.c(gji0Var2);
                if (z) {
                    qyb0Var.getClass();
                    lun lunVar = lun.f20680a;
                    lunVar.getClass();
                    mapB = qyb0Var.b(lunVar);
                } else if (zC) {
                    mapB = qyb0Var.b(mapB);
                }
                pji0 pji0Var = z ? null : gji0Var2.f11398a;
                if (!zD && !z) {
                    return zC ? gji0.a(gji0Var2, null, null, qyb0Var.b(mapB), 3) : gji0Var2;
                }
                pji0 pji0VarA = gpj0Var.b.a(pji0Var);
                uji0 uji0Var = gpj0Var.c;
                qjj.W(d5c.a(uji0Var.e), null, null, new sji0(uji0Var, pji0VarA, (yje) null), 3);
                qyb0Var.f = true;
                return new gji0(pji0VarA, null, mapB);
        }
    }
}

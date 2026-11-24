package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingVideoLandscapeParams;
import org.xplatform.game_broadcasting.impl.navigation.BroadcastingVideoFullScreenFactory$getScreen$1;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class mzs extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wzs k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzs(wzs wzsVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wzsVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wzs wzsVar = this.k;
        switch (b) {
            case 0:
                mzs mzsVar = new mzs(wzsVar, yjeVar, (byte) 0);
                mzsVar.j = ((Boolean) obj).booleanValue();
                return mzsVar;
            case 1:
                return new mzs(wzsVar, yjeVar, (byte) 1);
            case 2:
                return new mzs(wzsVar, yjeVar, (byte) 2);
            case 3:
                return new mzs(wzsVar, yjeVar, (byte) 3);
            default:
                return new mzs(wzsVar, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mzs) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mzs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mzs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((mzs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mzs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        azs azsVar = azs.f1735a;
        wzs wzsVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    p7m0 p7m0Var = wzsVar.u;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, czs.a((czs) value, 0L, 0L, null, 0L, null, true, false, false, false, false, false, false, null, 57311)));
                } else {
                    wzsVar.z();
                    wzsVar.y();
                }
                return Unit.f46060a;
            case 1:
                p7m0 p7m0Var2 = wzsVar.u;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    mpx mpxVar = wzsVar.d;
                    vsr vsrVar = vsr.f37965a;
                    this.j = true;
                    if (mpxVar.a(vsrVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ali aliVar = wzsVar.b;
                BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams = new BroadcastingVideoLandscapeParams(((czs) p7m0Var2.getValue()).f5238a, ((czs) p7m0Var2.getValue()).b, ((czs) p7m0Var2.getValue()).d, ((czs) p7m0Var2.getValue()).c, ((czs) p7m0Var2.getValue()).e, true);
                i1w0 i1w0VarC = ((oeg0) aliVar.f1068a).c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                FragmentScreen broadcastingVideoFullScreenFactory$getScreen$1 = new BroadcastingVideoFullScreenFactory$getScreen$1(broadcastingVideoLandscapeParams);
                if (broadcastingVideoFullScreenFactory$getScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) broadcastingVideoFullScreenFactory$getScreen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(broadcastingVideoFullScreenFactory$getScreen$1)));
                }
                ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        p7m0 p7m0Var3 = wzsVar.v;
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, azsVar);
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    mpx mpxVar2 = wzsVar.d;
                    wsr wsrVar = wsr.f39705a;
                    this.j = true;
                    if (mpxVar2.a(wsrVar, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var4 = wzsVar.v;
                p7m0Var4.getClass();
                p7m0Var4.o(null, azsVar);
                return Unit.f46060a;
            case 3:
                p7m0 p7m0Var5 = wzsVar.u;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    do {
                        value2 = p7m0Var5.getValue();
                    } while (!p7m0Var5.m(value2, czs.a((czs) value2, 0L, 0L, null, 0L, null, false, false, true, false, false, false, false, null, 65407)));
                    int i = GameBroadcastingControlPanelView.A;
                    long jF = znq0.f(2L);
                    this.j = true;
                    if (qcc.O(jF, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                do {
                    value3 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value3, czs.a((czs) value3, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 65407)));
                return Unit.f46060a;
            default:
                p7m0 p7m0Var6 = wzsVar.u;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    mpx mpxVar3 = wzsVar.d;
                    ssr ssrVar = new ssr(((czs) p7m0Var6.getValue()).f5238a, ((czs) p7m0Var6.getValue()).b, ((czs) p7m0Var6.getValue()).d, ((czs) p7m0Var6.getValue()).c);
                    this.j = true;
                    if (mpxVar3.a(ssrVar, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var7 = wzsVar.v;
                p7m0Var7.getClass();
                p7m0Var7.o(null, azsVar);
                return Unit.f46060a;
        }
    }
}

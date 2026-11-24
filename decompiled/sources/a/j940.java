package a;

import android.javax.sip.message.Response;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final class j940 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j940(t33 t33Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        this.l = t33Var;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new j940((m940) this.k, (List) obj2, yjeVar, (byte) 0);
            case 1:
                return new j940((j440) obj2, (m940) this.k, yjeVar);
            case 2:
                return new j940((m940) this.k, (o440) obj2, yjeVar, (byte) 2);
            case 3:
                return new j940((m940) this.k, (ArrayList) obj2, yjeVar, (byte) 3);
            case 4:
                return new j940((Function1) this.k, (z940) obj2, yjeVar, (byte) 4);
            case 5:
                return new j940((n7m0) this.k, (ls40) obj2, yjeVar, (byte) 5);
            case 6:
                return new j940((d650) this.k, (myr0) obj2, yjeVar, (byte) 6);
            case 7:
                return new j940((p850) this.k, (q250) obj2, yjeVar, (byte) 7);
            case 8:
                return new j940(obj2, yjeVar, (byte) 8);
            case 9:
                return new j940((ha8) this.k, (p850) obj2, yjeVar, (byte) 9);
            case 10:
                j940 j940Var = new j940(obj2, yjeVar, (byte) 10);
                j940Var.k = obj;
                return j940Var;
            case 11:
                return new j940((pf80) this.k, (SnapshotStateList) obj2, yjeVar, (byte) 11);
            case 12:
                j940 j940Var2 = new j940(obj2, yjeVar, (byte) 12);
                j940Var2.k = obj;
                return j940Var2;
            case 13:
                return new j940((il50) this.k, (hzb0) obj2, yjeVar, (byte) 13);
            case 14:
                return new j940((kwj) this.k, (ru50) obj2, yjeVar, (byte) 14);
            case 15:
                return new j940((kwj) this.k, (aw50) obj2, yjeVar, (byte) 15);
            case 16:
                return new j940((xk80) this.k, (xw50) obj2, yjeVar, (byte) 16);
            case 17:
                j940 j940Var3 = new j940(obj2, yjeVar, (byte) 17);
                j940Var3.k = obj;
                return j940Var3;
            case 18:
                j940 j940Var4 = new j940(obj2, yjeVar, (byte) 18);
                j940Var4.k = obj;
                return j940Var4;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new j940((v360) this.k, (m5p) obj2, yjeVar, (byte) 19);
            case 20:
                return new j940((v360) this.k, (tnp0) obj2, yjeVar, (byte) 20);
            case 21:
                return new j940((v360) this.k, (d0t) obj2, yjeVar, (byte) 21);
            case 22:
                return new j940((d660) this.k, (Function2) obj2, yjeVar, (byte) 22);
            case 23:
                j940 j940Var5 = new j940(obj2, yjeVar, (byte) 23);
                j940Var5.k = obj;
                return j940Var5;
            case 24:
                j940 j940Var6 = new j940(obj2, yjeVar, (byte) 24);
                j940Var6.k = obj;
                return j940Var6;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new j940((pz40) this.k, (List) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                j940 j940Var7 = new j940((t33) obj2, this.j, yjeVar);
                j940Var7.k = obj;
                return j940Var7;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new j940(obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new j940((pm60) this.k, (Throwable) obj2, yjeVar, (byte) 28);
            default:
                return new j940((bs60) this.k, (String) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws g2 {
        switch (this.i) {
            case 0:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 6:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((j940) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((j940) create((ol50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((j940) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((j940) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((j940) create((ti60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((j940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v56, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r12v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r1v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v123, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r1v127, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r1v157 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws g2 {
        Object value;
        Object objB;
        Object objB2;
        Object value2;
        Object objY;
        LinkedHashMap linkedHashMap;
        Object value3;
        Object objZ;
        ha8 y98Var;
        Object objH;
        Object value4;
        Object objB3;
        Object objG;
        Object objB4;
        hl60 hl60Var;
        byte b = this.i;
        byte b2 = 22;
        byte b3 = 3;
        byte b4 = 0;
        Object obj2 = this.l;
        ?? r12 = 0;
        ?? r13 = 0;
        switch (b) {
            case 0:
                List list = (List) obj2;
                m940 m940Var = (m940) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    g5k g5kVar = m940Var.E;
                    this.j = true;
                    pzu pzuVar = g5kVar.f10723a;
                    if (qjj.d0(((mne) pzuVar.f).b, new mq10((Object) pzuVar, (Object) list, (yje) r12, (byte) 29), this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                d940 d940Var = ((n940) m940Var.D()).f23121a;
                a940 a940Var = d940Var instanceof a940 ? (a940) d940Var : null;
                r12 = a940Var != null ? a940Var.f459a : 0;
                if (r12 == 0) {
                    r12 = iun.f15405a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : r12) {
                    if (!list.contains(((z540) obj3).b)) {
                        arrayList.add(obj3);
                    }
                }
                p7m0 p7m0Var = m940Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, n940.a((n940) value, new a940(arrayList), false, null, iun.f15405a, 6)));
                return Unit.f46060a;
            case 1:
                m940 m940Var2 = (m940) this.k;
                j440 j440Var = (j440) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (j440Var.c < 0) {
                        return Unit.f46060a;
                    }
                    h3c h3cVar = m940Var2.P;
                    long j = j440Var.b;
                    this.j = true;
                    objB = h3cVar.b(j, this);
                    if (objB == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                GameScreenGeneralParams gameScreenGeneralParams = new GameScreenGeneralParams(j440Var.f15867a, 0L, j440Var.b, j440Var.c, ((Boolean) objB).booleanValue(), j440Var.d, j440Var.e, GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN);
                i1w0 i1w0Var = m940Var2.o;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI.h(m940Var2.v.h(gameScreenGeneralParams));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 2:
                o440 o440Var = (o440) obj2;
                m940 m940Var3 = (m940) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    h3c h3cVar2 = m940Var3.P;
                    long j2 = o440Var.b;
                    this.j = true;
                    objB2 = h3cVar2.b(j2, this);
                    if (objB2 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB2 = obj;
                }
                m940Var3.o.d(new r91((Object) m940Var3, (Object) o440Var, ((Boolean) objB2).booleanValue(), (byte) 20));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                boolean z5 = true;
                if (!z4) {
                    z1x.P(obj);
                    o470 o470Var = ((m940) this.k).p;
                    ArrayList arrayList2 = (ArrayList) obj2;
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((z540) it.next()).b);
                    }
                    this.j = true;
                    pzu pzuVar2 = (pzu) o470Var.f24619a;
                    if (qjj.d0(((mne) pzuVar2.f).b, new ys8((Object) pzuVar2, (Object) arrayList3, z5, (yje) null, (byte) 22), this) == wneVar4) {
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
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                try {
                    if (!z6) {
                        z1x.P(obj);
                        Function1 function1 = (Function1) this.k;
                        this.j = true;
                        if (function1.invoke(this) == wneVar5) {
                            return wneVar5;
                        }
                    } else {
                        if (!z6) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    break;
                } catch (Exception e) {
                    z940 z940Var = (z940) obj2;
                    z940Var.f44000a.j.remove(Integer.valueOf(z940Var.b));
                    n5a n5aVar = z940Var.d;
                    e0g0 e0g0Var = j0g0.b;
                    n5aVar.resumeWith(new g0g0(e));
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    n7m0 n7m0Var = (n7m0) this.k;
                    kb40 kb40Var = new kb40((ls40) obj2, (byte) 4);
                    this.j = true;
                    if (n7m0Var.c(kb40Var, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                csj.b();
                return null;
            case 6:
                d650 d650Var = (d650) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    ytt yttVar = d650Var.s0;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                d650Var.I.c().d(new rw40(d650Var, (myr0) obj2, b3));
                return Unit.f46060a;
            case 7:
                q250 q250Var = (q250) obj2;
                p850 p850Var = (p850) this.k;
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    int i = p850.p0;
                    p7m0 p7m0Var2 = p850Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, p650.a((p650) value2, null, null, null, false, 131071)));
                    if (q250Var != null) {
                        long j3 = q250Var.f27985a;
                        if (j3 == 0) {
                            return Unit.f46060a;
                        }
                        s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
                        if (j3 == -1) {
                            if (((p650) p850Var.D()).f26438a == mi0.MY_AGGREGATOR) {
                                p850Var.W.c(new AggregatorScreenModel(null, null, 0L, new lm1(q250Var.b), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                            }
                        } else if (j3 == -10) {
                            p850Var.Y(true);
                        } else {
                            pw70 pw70Var = p850Var.g0;
                            mlr mlrVarA = mlr.a(new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iun.f15405a, false, 131200), q250Var.f27985a, 0L, 0L, null, false, false, false, 262142);
                            String strK = p850Var.Q.k(new lu0(0L, null, null, hne.r(0L, "deeplink")));
                            this.j = true;
                            if (pw70.b(pw70Var, mlrVarA, strK, 0, false, false, this, 114) == wneVar8) {
                                return wneVar8;
                            }
                        }
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                p850 p850Var2 = (p850) obj2;
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    List<jge> list2 = ((p650) p850Var2.D()).h;
                    ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                    for (jge jgeVarQ : list2) {
                        if (jgeVarQ.a() instanceof x98) {
                            jgeVarQ = thb.Q(jgeVarQ);
                        }
                        arrayList4.add(jgeVarQ);
                    }
                    int iA = wp20.a(r3d.q(arrayList4, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
                    for (Object obj4 : arrayList4) {
                        linkedHashMap2.put(((jge) obj4).getKey(), obj4);
                    }
                    oif0 oif0Var = p850Var2.t;
                    mi0 mi0Var = ((p650) p850Var2.D()).f26438a;
                    this.k = linkedHashMap2;
                    this.j = true;
                    objY = oif0Var.y(mi0Var, this);
                    if (objY == wneVar9) {
                        return wneVar9;
                    }
                    linkedHashMap = linkedHashMap2;
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = (LinkedHashMap) this.k;
                    z1x.P(obj);
                    objY = obj;
                }
                ArrayList<jge> arrayListX = thb.x((List) objY);
                ArrayList arrayList5 = new ArrayList(r3d.q(arrayListX, 10));
                for (jge jgeVar : arrayListX) {
                    jge jgeVar2 = (jge) linkedHashMap.get(jgeVar.getKey());
                    if (jgeVar2 != null) {
                        jgeVar = jgeVar2;
                    }
                    arrayList5.add(jgeVar);
                }
                int i2 = p850.p0;
                p7m0 p7m0Var3 = p850Var2.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, p650.a((p650) value3, null, arrayList5, null, false, 262015)));
                return Unit.f46060a;
            case 9:
                p850 p850Var3 = (p850) obj2;
                ha8 ha8Var = (ha8) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    if (((cj0) ha8Var.a()).d < 9) {
                        y98Var = new y98(ha8Var.a());
                    } else {
                        z220 z220Var = p850Var3.l0;
                        long j4 = ((cj0) ha8Var.a()).c;
                        int i3 = ((cj0) ha8Var.a()).d;
                        this.j = true;
                        objZ = z220Var.z(i3, j4, this, "");
                        if (objZ == wneVar10) {
                            return wneVar10;
                        }
                    }
                    l750 l750Var = new l750(ha8Var.getKey(), y98Var, (byte) 8);
                    int i4 = p850.p0;
                    p850Var3.H(l750Var);
                    return Unit.f46060a;
                }
                if (!z11) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objZ = obj;
                List listD0 = CollectionsKt.D0((Iterable) objZ, ((cj0) ha8Var.a()).d);
                y98Var = !listD0.isEmpty() ? new da8(ha8Var.a(), listD0, true) : new y98(ha8Var.a());
                l750 l750Var2 = new l750(ha8Var.getKey(), y98Var, (byte) 8);
                int i5 = p850.p0;
                p850Var3.H(l750Var2);
                return Unit.f46060a;
            case 10:
                p850 p850Var4 = (p850) obj2;
                kmq kmqVar = (kmq) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    if (((p650) p850Var4.D()).o && ((p650) p850Var4.D()).p) {
                        i3t0.A(p850Var4, p850Var4.J, q2j.f28000a, p850Var4.p.b, null, 4);
                    } else {
                        l0j l0jVar = new l0j(null, null, null);
                        this.k = null;
                        this.j = true;
                        if (kmqVar.a(l0jVar, this) == wneVar11) {
                            return wneVar11;
                        }
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                pf80 pf80Var = (pf80) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    this.j = true;
                    if (pf80Var.c() == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((SnapshotStateList) obj2).remove(pf80Var);
                return Unit.f46060a;
            case 12:
                zk50 zk50Var = (zk50) obj2;
                ol50 ol50Var = (ol50) this.k;
                wne wneVar13 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    lmk0 lmk0Var = ol50Var.e;
                    if (lmk0Var == null) {
                        jf4.n("body == null");
                        return null;
                    }
                    this.k = ol50Var;
                    this.j = true;
                    objH = zk50Var.h(lmk0Var, this);
                    if (objH == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH = obj;
                }
                return new hmk0((y1x) objH, zk50.d(zk50Var.f44513a, ol50Var.d.a()), ibj.d);
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(1000L, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((hzb0) obj2).f(new v4e(7));
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    kwj kwjVar = (kwj) this.k;
                    int i6 = ((ru50) obj2).c;
                    this.j = true;
                    if (kwjVar.v(i6, 0.0f, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    kwj kwjVar2 = (kwj) this.k;
                    int i7 = ((aw50) obj2).g;
                    this.j = true;
                    if (xk80.g(kwjVar2, i7, null, this, 6) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    xk80 xk80Var = (xk80) this.k;
                    int i8 = ((xw50) obj2).c;
                    this.j = true;
                    if (xk80.g(xk80Var, i8, null, this, 6) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                v360 v360Var = (v360) obj2;
                List list3 = (List) this.k;
                wne wneVar18 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    hjd hjdVar = v360Var.o0;
                    did didVar = new did(list3);
                    this.k = null;
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(didVar, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i9 = v360.x0;
                p7m0 p7m0Var4 = v360Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, c260.a((c260) value4, null, false, false, false, null, false, null, null, null, null, 245759)));
                return Unit.f46060a;
            case 18:
                kmq kmqVar2 = (kmq) this.k;
                wne wneVar19 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    rz50 rz50VarA = rz50.a((rz50) obj2, null, mz50.f22637a, 127);
                    this.k = null;
                    this.j = true;
                    if (kmqVar2.a(rz50VarA, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    khf0 khf0Var = ((v360) this.k).P;
                    sgb sgbVar = ((m5p) obj2).e;
                    this.j = true;
                    if (khf0Var.D(sgbVar, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                v360 v360Var2 = (v360) this.k;
                wne wneVar21 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    v360Var2.V.f31532a.c("favor_team_delete");
                    v360Var2.i0.f11237a.a(xun.f41520a, 12081L);
                    this.j = true;
                    if (v360Var2.O.t((tnp0) obj2, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                d0t d0tVar = (d0t) obj2;
                v360 v360Var3 = (v360) this.k;
                i1w0 i1w0Var2 = v360Var3.S;
                wne wneVar22 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    v360Var3.s.d(d0tVar.v, d0tVar.u, d0tVar.n, "viewed", d0tVar.C);
                    v360Var3.t.f(d0tVar.v, d0tVar.u, d0tVar.n, "viewed", d0tVar.C);
                    if (d0tVar.h) {
                        i1w0Var2.d(new rw40(v360Var3, d0tVar, (byte) 17));
                    } else {
                        h3c h3cVar3 = v360Var3.x;
                        long j5 = d0tVar.v;
                        this.j = true;
                        objB3 = h3cVar3.b(j5, this);
                        if (objB3 == wneVar22) {
                            return wneVar22;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z23) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objB3 = obj;
                i1w0Var2.d(new r91((Object) v360Var3, (Object) d0tVar, ((Boolean) objB3).booleanValue(), (byte) 22));
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    this.j = true;
                    if (((d660) this.k).f5538a.g(c050.b, (Function2) obj2, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                ?? r1 = this.j;
                try {
                    if (r1 == 0) {
                        z1x.P(obj);
                        c4m0 c4m0VarW = qjj.W((vne) this.k, null, null, new fot(2, r12, (byte) 5), 3);
                        this.k = c4m0VarW;
                        this.j = true;
                        objG = ((q99) obj2).g(this);
                        r1 = c4m0VarW;
                        if (objG == wneVar24) {
                            return wneVar24;
                        }
                    } else {
                        if (r1 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bby bbyVar = (bby) this.k;
                        z1x.P(obj);
                        objG = obj;
                        r1 = bbyVar;
                    }
                    r1.cancel(null);
                    r13 = objG;
                    return r13;
                } catch (Throwable th) {
                    r1.cancel(r13);
                    throw th;
                }
            case 24:
                ki60 ki60Var = (ki60) obj2;
                ti60 ti60Var = (ti60) this.k;
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    if (!Intrinsics.d(ti60Var, ti60.f33994a)) {
                        t9f.b();
                        return null;
                    }
                    this.k = null;
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ki60Var.y0();
                ki60Var.P0().x(wh60.f39151a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                List list4 = (List) obj2;
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    ((pz40) this.k).setValue(list4);
                    xj60 xj60Var = new xj60(list4, r12, b4);
                    this.j = true;
                    if (d5c.J(this, xj60Var) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                vne vneVar = (vne) this.k;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                return qjj.W(vneVar, null, null, new pw7((t33) obj2, this.j, null), 3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hl60 hl60Var2 = (hl60) obj2;
                wne wneVar28 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    if (hl60Var2.g.f25751a.a()) {
                        this.k = hl60Var2;
                        this.j = true;
                        objB4 = hl60Var2.B(this);
                        if (objB4 == wneVar28) {
                            return wneVar28;
                        }
                        hl60Var = hl60Var2;
                    } else {
                        i1w0 i1w0Var3 = hl60Var2.n;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var3);
                        c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                        copyOnWriteArrayListQ.add(c8dVar);
                        new okt0(c8dVar);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new b1w0(new hr(hl60Var2, r12, b2))), i1w0Var3, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorP;
                            if (pawVar2.hasNext()) {
                                i1w0Var3.a((oe50) pawVar2.next());
                            }
                        }
                    }
                    hl60Var2.z(true);
                    return Unit.f46060a;
                }
                if (!z27) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hl60Var = (hl60) this.k;
                z1x.P(obj);
                objB4 = obj;
                hl60Var.w(((m2c0) objB4).k);
                hl60Var2.z(true);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    this.j = true;
                    if (((pm60) this.k).i.a((Throwable) obj2, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                String str = (String) obj2;
                bs60 bs60Var = (bs60) this.k;
                wne wneVar30 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    int i10 = bs60.h0;
                    bs60Var.q.h(wgh0.ONE_X_ALL, str, null);
                    cyu cyuVar = bs60Var.t;
                    xgh0 xgh0Var = xgh0.UNKNOWN;
                    cyuVar.D(null, "games_all", str);
                    this.j = true;
                    if (bs60Var.S(str, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j940(j440 j440Var, m940 m940Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.l = j440Var;
        this.k = m940Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j940(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j940(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }
}

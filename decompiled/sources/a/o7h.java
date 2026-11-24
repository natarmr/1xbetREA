package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class o7h extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a8h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7h(byte b, yje yjeVar, a8h a8hVar) {
        super(2, yjeVar);
        this.i = b;
        this.k = a8hVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a8h a8hVar = this.k;
        switch (b) {
            case 0:
                o7h o7hVar = new o7h((byte) 0, yjeVar, a8hVar);
                o7hVar.j = obj;
                return o7hVar;
            case 1:
                o7h o7hVar2 = new o7h((byte) 1, yjeVar, a8hVar);
                o7hVar2.j = obj;
                return o7hVar2;
            case 2:
                o7h o7hVar3 = new o7h((byte) 2, yjeVar, a8hVar);
                o7hVar3.j = obj;
                return o7hVar3;
            case 3:
                o7h o7hVar4 = new o7h((byte) 3, yjeVar, a8hVar);
                o7hVar4.j = obj;
                return o7hVar4;
            default:
                o7h o7hVar5 = new o7h((byte) 4, yjeVar, a8hVar);
                o7hVar5.j = obj;
                return o7hVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((o7h) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((o7h) create((fs20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((o7h) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((o7h) create((jlr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((o7h) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x016f  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Long l;
        switch (this.i) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                Long l2 = this.k.N;
                if (l2 == null || list.isEmpty()) {
                    l2 = null;
                }
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                l = null;
                            } else if (((fs20) it.next()).a() == jLongValue) {
                                l = l2;
                            }
                        }
                    } else {
                        l = null;
                    }
                } else {
                    l = null;
                }
                if (l2 != null && l == null) {
                    this.k.N = null;
                    this.k.o.e("KEY_CATEGORY_ID", new Long(-26L));
                }
                a8h a8hVar = this.k;
                u230 u230Var = a8hVar.y;
                if (l != null) {
                    i3t0.B(a8hVar, u230Var, new m230[]{new a230(list), new b230(l.longValue())});
                } else {
                    i3t0.A(a8hVar, u230Var, new a230(list), null, null, 6);
                }
                break;
            case 1:
                fs20 fs20Var = (fs20) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!(fs20Var instanceof ds20) || this.k.N == null) {
                    this.k.N = null;
                    this.k.o.e("KEY_CATEGORY_ID", new Long(fs20Var.a()));
                }
                a8h a8hVar2 = this.k;
                i3t0.A(a8hVar2, a8hVar2.y, new b230(fs20Var.a()), null, null, 6);
                break;
            case 2:
                Pair pair = (Pair) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                long jLongValue2 = ((Number) pair.f46059a).longValue();
                Map map = (Map) pair.b;
                a8h a8hVar3 = this.k;
                i3t0.A(a8hVar3, a8hVar3.y, new d230(jLongValue2, map), null, null, 6);
                break;
            case 3:
                jlr jlrVar = (jlr) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (jlrVar != null) {
                    a8h a8hVar4 = this.k;
                    int i = a8h.O;
                    if (jlrVar instanceof xkr) {
                        xkr xkrVar = (xkr) jlrVar;
                        m9s m9sVar = xkrVar.d;
                        i3t0.A(a8hVar4, a8hVar4.y, new l230(m9sVar, a8hVar4.p.g, xkrVar.e), null, null, 6);
                        List<xum0> list2 = m9sVar.H;
                        LinkedHashMap linkedHashMap = a8hVar4.L;
                        for (xum0 xum0Var : list2) {
                            bby bbyVar = (bby) linkedHashMap.get(Long.valueOf(xum0Var.b));
                            if (bbyVar == null || !bbyVar.isActive()) {
                                linkedHashMap.put(Long.valueOf(xum0Var.b), sac.T(new fnq(i120.W(aoq.c(i120.W(new i89(a8hVar4.v.a(), (byte) 16)), new fe0((yje) null, a8hVar4, xum0Var, (byte) 4))), new g6g(a8hVar4, xum0Var, (yje) null, (byte) 4), (byte) 4), d5c.S(jiu0.a(a8hVar4), a8hVar4.B.f22085a), foe.h));
                            }
                        }
                    }
                }
                break;
            default:
                Pair pair2 = (Pair) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                long jLongValue3 = ((Number) pair2.f46059a).longValue();
                Set set = (Set) pair2.b;
                a8h a8hVar5 = this.k;
                i3t0.A(a8hVar5, a8hVar5.y, new f230(set, jLongValue3), null, null, 6);
                break;
        }
        return Unit.f46060a;
    }
}

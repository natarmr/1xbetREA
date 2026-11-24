package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class q0v0 extends bnn0 implements Function1 {
    public boolean i;
    public ArrayList j;
    public LinkedHashMap k;
    public byte l;
    public final /* synthetic */ u0v0 m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0v0(u0v0 u0v0Var, boolean z, yje yjeVar) {
        super(1, yjeVar);
        this.m = u0v0Var;
        this.n = z;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new q0v0(this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q0v0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean zC;
        Object objE;
        jjm jjmVar;
        Object next;
        Object objD;
        boolean z;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ql5 ql5Var;
        boolean z2;
        long jLongValue;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList2;
        wui0 wui0Var;
        int i;
        p7m0 p7m0Var;
        Object value;
        String str;
        p0v0 p0v0Var;
        int iOrdinal;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        jjm jjmVar2 = null;
        int i2 = 2;
        int i3 = 1;
        u0v0 u0v0Var = this.m;
        if (b == 0) {
            z1x.P(obj);
            zC = u0v0Var.I.f8256a.c();
            dq00 dq00Var = u0v0Var.w;
            this.i = zC;
            this.l = (byte) 1;
            objE = dq00Var.e(this);
            if (objE != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            zC = this.i;
            z1x.P(obj);
            objE = obj;
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.i;
            linkedHashMap = this.k;
            arrayList = this.j;
            z1x.P(obj);
            jjmVar = null;
            objD = obj;
        }
        z2 = z;
        linkedHashMap2 = linkedHashMap;
        arrayList2 = arrayList;
        jLongValue = ((Number) objD).longValue();
        int i4 = u0v0.P;
        p7m0Var = u0v0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, j0v0.a((j0v0) value, false, false, z2, this.n, arrayList2, linkedHashMap2, null, null, null, jLongValue, false, 448)));
        kys0 kys0Var = p0v0.f26171a;
        str = u0v0Var.J;
        kys0Var.getClass();
        str.getClass();
        if (str.equals("addbalance")) {
            p0v0Var = p0v0.c;
        } else {
            p0v0Var = p0v0.b;
        }
        iOrdinal = p0v0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                t9f.b();
                return jjmVar;
            }
            if (((j0v0) u0v0Var.D()).c) {
                u0v0Var.P();
            }
        }
        u0v0Var.J = "";
        return Unit.f46060a;
        List<xe> list = (List) objE;
        ArrayList arrayListU = twn.u(list);
        for (xe xeVar : list) {
            ql5 ql5Var2 = xeVar.b;
            pg pgVar = xeVar.f40720a;
            boolean z3 = xeVar.d;
            if (ql5Var2 == null) {
                int iOrdinal2 = pgVar.ordinal();
                if (iOrdinal2 == 0) {
                    i = R.string.title_active_account_short;
                } else if (iOrdinal2 != i3) {
                    i = iOrdinal2 != i2 ? 0 : R.string.title_bonus_accounts_short;
                } else {
                    i = R.string.title_not_active_accounts_short;
                }
                if (i != 0) {
                    arrayListU.add(new zzu0(i, pgVar, jjmVar2));
                }
            } else {
                boolean z4 = xeVar.e;
                if (z4 && z3) {
                    wui0Var = wui0.f39793a;
                } else if (z4) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = z3 ? wui0.d : wui0.c;
                }
                wui0 wui0Var2 = wui0Var;
                long j = ql5Var2.f28916a;
                String str2 = ql5Var2.m;
                pn40 pn40Var = pn40.f27267a;
                String strD = pn40.d(ql5Var2.b, ql5Var2.f, p3u0.c);
                boolean z5 = xeVar.c;
                ql5 ql5Var3 = xeVar.b;
                arrayListU.add(new yzu0(j, str2, strD, z5, ql5Var3.e, pgVar, ql5Var3.f, wui0Var2, !z3, null));
            }
            jjmVar2 = jjmVar2;
            i2 = 2;
            i3 = 1;
        }
        jjmVar = jjmVar2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ql5 ql5Var4 = ((xe) it.next()).b;
            if (ql5Var4 != null) {
                arrayList3.add(ql5Var4);
            }
        }
        int iA = wp20.a(r3d.q(arrayList3, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
        for (Object obj2 : arrayList3) {
            linkedHashMap3.put(new Long(((ql5) obj2).f28916a), obj2);
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = jjmVar;
                break;
            }
            next = it2.next();
        } while (!((xe) next).d);
        xe xeVar2 = (xe) next;
        if (xeVar2 == null || (ql5Var = xeVar2.b) == null) {
            cmt cmtVar = u0v0Var.x;
            this.j = arrayListU;
            this.k = linkedHashMap3;
            this.i = zC;
            this.l = (byte) 2;
            objD = cmtVar.d(this);
            if (objD != wneVar) {
                z = zC;
                linkedHashMap = linkedHashMap3;
                arrayList = arrayListU;
                z2 = z;
                linkedHashMap2 = linkedHashMap;
                arrayList2 = arrayList;
                jLongValue = ((Number) objD).longValue();
            }
            return wneVar;
        }
        z2 = zC;
        jLongValue = ql5Var.e;
        linkedHashMap2 = linkedHashMap3;
        arrayList2 = arrayListU;
        int i5 = u0v0.P;
        p7m0Var = u0v0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, j0v0.a((j0v0) value, false, false, z2, this.n, arrayList2, linkedHashMap2, null, null, null, jLongValue, false, 448)));
        kys0 kys0Var2 = p0v0.f26171a;
        str = u0v0Var.J;
        kys0Var2.getClass();
        str.getClass();
        if (str.equals("addbalance")) {
            p0v0Var = p0v0.c;
        } else {
            p0v0Var = p0v0.b;
        }
        iOrdinal = p0v0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                t9f.b();
                return jjmVar;
            }
            if (((j0v0) u0v0Var.D()).c) {
                u0v0Var.P();
            }
        }
        u0v0Var.J = "";
        return Unit.f46060a;
    }
}

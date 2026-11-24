package a;

import android.content.Context;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;
import org.xplatform.statistic.rating.impl.rating_statistic.domain.model.SelectorOptionModel;

/* JADX INFO: loaded from: classes5.dex */
public final class wmq extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmq(gmq gmqVar, glz glzVar, q1w q1wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.m = glzVar;
        this.n = q1wVar;
    }

    private final Object l(Object obj) {
        Iterable iterable;
        Object value;
        nhh0 nhh0Var;
        dhh0 dhh0Var;
        Object value2;
        String str = (String) this.n;
        xpl0 xpl0Var = (xpl0) this.m;
        oyg0 oyg0Var = xpl0Var.f;
        ocj ocjVar = xpl0Var.i;
        List list = (List) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            ((qpl0) this.l).invoke();
            thh0 thh0Var = ((hpl0) xpl0Var.D()).i;
            nhh0 nhh0Var2 = thh0Var instanceof nhh0 ? (nhh0) thh0Var : null;
            if (nhh0Var2 == null || (iterable = nhh0Var2.f23533a) == null) {
                iterable = iun.f15405a;
            }
            hjd hjdVar = xpl0Var.E;
            did didVar = new did(CollectionsKt.q0(list, iterable));
            this.k = list;
            this.j = true;
            hjdVar.getClass();
            if (hjdVar.a(didVar, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        thh0 thh0Var2 = ((hpl0) xpl0Var.D()).h;
        nhh0 nhh0Var3 = thh0Var2 instanceof nhh0 ? (nhh0) thh0Var2 : null;
        if (Intrinsics.d(nhh0Var3 != null ? nhh0Var3.b : null, str)) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
            } while (!p7m0Var.m(value2, hpl0.a((hpl0) value2, false, false, null, null, false, null, null, new nhh0(list, str), null, null, null, null, null, null, null, false, 262015)));
        } else {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                nhh0Var = new nhh0(list, str);
                dhh0Var = dhh0.d;
                q7x.F(oyg0Var, dhh0Var, "SAVED_STATE_SHOW_TYPE");
            } while (!p7m0Var2.m(value, hpl0.a((hpl0) value, false, false, null, null, false, null, dhh0Var, nhh0Var, null, null, null, null, null, null, null, false, 261951)));
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        hpa0 hpa0Var = (hpa0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            oto0 oto0Var = new oto0((vne) this.k, new hub0(hpa0Var), (xdr) this.m, (Function1) this.n, null);
            this.j = true;
            if (ebc.Y(hpa0Var, oto0Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                wmq wmqVar = new wmq(this.m, obj2, yjeVar, (byte) 0);
                wmqVar.k = ((ztb) obj).f44949a;
                return wmqVar;
            case 1:
                wmq wmqVar2 = new wmq(this.m, obj2, yjeVar, (byte) 1);
                wmqVar2.k = obj;
                return wmqVar2;
            case 2:
                wmq wmqVar3 = new wmq(this.l, this.m, this.n, yjeVar, (byte) 2);
                wmqVar3.k = obj;
                return wmqVar3;
            case 3:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 3);
            case 4:
                wmq wmqVar4 = new wmq((h6i) obj2, yjeVar);
                wmqVar4.k = obj;
                return wmqVar4;
            case 5:
                wmq wmqVar5 = new wmq(this.l, this.m, obj2, yjeVar, (byte) 5);
                wmqVar5.k = obj;
                return wmqVar5;
            case 6:
                wmq wmqVar6 = new wmq((gmq) this.l, yjeVar, (Function1) this.m, (kie0) obj2, (byte) 6);
                wmqVar6.k = obj;
                return wmqVar6;
            case 7:
                wmq wmqVar7 = new wmq((gmq) this.l, yjeVar, (Function1) this.m, (kie0) obj2, (byte) 7);
                wmqVar7.k = obj;
                return wmqVar7;
            case 8:
                gmq gmqVar = (gmq) this.l;
                glz glzVar = (glz) this.m;
                lkz lkzVar = lkz.f20223a;
                wmq wmqVar8 = new wmq(gmqVar, glzVar, (q1w) obj2, yjeVar);
                wmqVar8.k = obj;
                return wmqVar8;
            case 9:
                return new wmq(this.m, this.k, false, obj2, yjeVar, (byte) 9);
            case 10:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 10);
            case 11:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 11);
            case 12:
                return new wmq(this.m, this.k, false, obj2, yjeVar, (byte) 12);
            case 13:
                wmq wmqVar9 = new wmq(this.l, this.m, obj2, yjeVar, (byte) 13);
                wmqVar9.k = obj;
                return wmqVar9;
            case 14:
                wmq wmqVar10 = new wmq(this.l, this.m, obj2, yjeVar, (byte) 14);
                wmqVar10.k = obj;
                return wmqVar10;
            case 15:
                return new wmq(this.m, this.k, false, obj2, yjeVar, (byte) 15);
            case 16:
                return new wmq(this.m, this.k, false, obj2, yjeVar, (byte) 16);
            case 17:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 17);
            case 18:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 19);
            case 20:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 20);
            case 21:
                return new wmq(this.m, this.k, false, obj2, yjeVar, (byte) 21);
            case 22:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 22);
            case 23:
                wmq wmqVar11 = new wmq(this.l, this.m, obj2, yjeVar, (byte) 23);
                wmqVar11.k = obj;
                return wmqVar11;
            case 24:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new wmq(this.l, this.m, this.k, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wmq wmqVar12 = new wmq(this.l, this.m, obj2, yjeVar, (byte) 26);
                wmqVar12.k = obj;
                return wmqVar12;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wmq wmqVar13 = new wmq(this.l, this.m, obj2, yjeVar, (byte) 27);
                wmqVar13.k = obj;
                return wmqVar13;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wmq wmqVar14 = new wmq(this.l, this.m, obj2, yjeVar, (byte) 28);
                wmqVar14.k = obj;
                return wmqVar14;
            default:
                wmq wmqVar15 = new wmq(this.l, this.m, obj2, yjeVar, (byte) 29);
                wmqVar15.k = obj;
                return wmqVar15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Object obj3 = ((ztb) obj).f44949a;
                wmq wmqVar = new wmq(this.m, this.n, (yje) obj2, (byte) 0);
                wmqVar.k = obj3;
                return wmqVar.invokeSuspend(Unit.f46060a);
            case 1:
                return ((wmq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wmq) create((jpj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wmq) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wmq) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wmq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wmq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((wmq) create((c7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((wmq) create((c7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((wmq) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((wmq) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wmq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:421:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:424:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:430:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:431:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:488:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:491:0x0bc8  */
    /* JADX WARN: Code duplicated, block: B:558:0x0abf A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        mie0 mie0Var;
        mie0 mie0Var2;
        o4m o4mVar;
        List<nxy> list;
        List<pxy> list2;
        List list3;
        ArrayList arrayList;
        Iterator it;
        Object next;
        pxy pxyVar;
        long jCurrentTimeMillis;
        String str;
        Object objE;
        Object objD;
        c5v0 c5v0Var;
        String strR;
        Object objX;
        Object objX2;
        Object value;
        j6i0 j6i0Var;
        j6i0 j6i0Var2;
        Object objQ;
        Pair pair;
        Object value2;
        Object value3;
        Object next2;
        Collection collection;
        Object value4;
        nhh0 nhh0Var;
        dhh0 dhh0Var;
        Object value5;
        Object objD0;
        yje yjeVar;
        byte b = this.i;
        byte b2 = 27;
        int i = 10;
        byte b3 = 16;
        byte b4 = 12;
        byte b5 = 0;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                Object obj3 = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    mie0Var = (mie0) this.m;
                    boolean z2 = obj3 instanceof ytb;
                    if (!z2) {
                        mie0Var.f21842a = obj3;
                    }
                    kmq kmqVar = (kmq) obj2;
                    if (z2) {
                        Throwable thA = ztb.a(obj3);
                        if (thA != null) {
                            throw thA;
                        }
                        Object obj4 = mie0Var.f21842a;
                        if (obj4 != null) {
                            if (obj4 == k860.f17859a) {
                                obj4 = null;
                            }
                            this.k = null;
                            this.l = mie0Var;
                            this.j = true;
                            if (kmqVar.a(obj4, this) == wneVar) {
                                return wneVar;
                            }
                            mie0Var2 = mie0Var;
                        }
                        mie0Var.f21842a = k860.c;
                    }
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mie0Var2 = (mie0) this.l;
                z1x.P(obj);
                mie0Var = mie0Var2;
                mie0Var.f21842a = k860.c;
                return Unit.f46060a;
            case 1:
                kmq kmqVar2 = (kmq) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o4mVar = (o4m) this.l;
                    try {
                        z1x.P(obj);
                    } catch (t e) {
                        e = e;
                        if (e.f33092a == o4mVar) {
                            throw e;
                        }
                        zvw.O(getContext());
                    }
                    break;
                } else {
                    z1x.P(obj);
                    vsg0 vsg0Var = (vsg0) this.m;
                    o4m o4mVar2 = new o4m((yau) obj2, kmqVar2, b4);
                    try {
                        this.k = null;
                        this.l = o4mVar2;
                        this.j = true;
                        if (vsg0Var.c(o4mVar2, this) == wneVar2) {
                            return wneVar2;
                        }
                    } catch (t e2) {
                        e = e2;
                        o4mVar = o4mVar2;
                        if (e.f33092a == o4mVar) {
                            throw e;
                        }
                        zvw.O(getContext());
                    }
                }
                return Unit.f46060a;
            case 2:
                mz40 mz40Var = (mz40) this.m;
                jpj0 jpj0Var = (jpj0) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (z4) {
                    if (z4) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                int iOrdinal = jpj0Var.ordinal();
                if (iOrdinal == 0) {
                    gmq gmqVar = (gmq) this.l;
                    this.k = null;
                    this.j = true;
                    if (gmqVar.c(mz40Var, this) == wneVar3) {
                        return wneVar3;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    if (obj2 == roj0.f30841a) {
                        mz40Var.i();
                    } else {
                        mz40Var.g(obj2);
                    }
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, new z6s((l7m0) this.l, b5)));
                    yj2 yj2Var = new yj2(this.m, this.k, obj2, (byte) 17);
                    this.j = true;
                    Object objC = gmqVarW.c(new uap(yj2Var, b4), this);
                    if (objC != wneVar4) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                Pair pair2 = (Pair) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    list = (List) pair2.f46059a;
                    list2 = (List) pair2.b;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        axq.t(((nxy) it2.next()).f24305a, arrayList3);
                    }
                    for (pxy pxyVar2 : list2) {
                        if (!arrayList3.contains(new Long(pxyVar2.f27779a))) {
                            axq.t(pxyVar2.f27779a, arrayList2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        h5k h5kVar = (h5k) ((h6i) obj2).i;
                        this.k = null;
                        this.l = list;
                        this.m = list2;
                        this.j = true;
                        Object objC2 = h5kVar.f12484a.c(arrayList2, this);
                        if (objC2 != wne.f39444a) {
                            objC2 = Unit.f46060a;
                        }
                        if (objC2 == wneVar5) {
                            return wneVar5;
                        }
                        list3 = list;
                    }
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (nxy nxyVar : list) {
                        it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            pxyVar = (pxy) next;
                            if (pxyVar != null) {
                                jCurrentTimeMillis = pxyVar.c;
                            } else {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            arrayList.add(new lxy(jCurrentTimeMillis, nxyVar));
                        } while (((pxy) next).f27779a != nxyVar.f24305a);
                        pxyVar = (pxy) next;
                        if (pxyVar != null) {
                            jCurrentTimeMillis = pxyVar.c;
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        arrayList.add(new lxy(jCurrentTimeMillis, nxyVar));
                    }
                    return CollectionsKt.A0(arrayList, new e3l((byte) 22));
                }
                if (!z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = (List) this.m;
                list3 = (List) this.l;
                z1x.P(obj);
                list = list3;
                arrayList = new ArrayList(r3d.q(list, 10));
                while (r2.hasNext()) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        pxyVar = (pxy) next;
                        if (pxyVar != null) {
                            jCurrentTimeMillis = pxyVar.c;
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        arrayList.add(new lxy(jCurrentTimeMillis, nxyVar));
                    } while (((pxy) next).f27779a != nxyVar.f24305a);
                    pxyVar = (pxy) next;
                    if (pxyVar != null) {
                        jCurrentTimeMillis = pxyVar.c;
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    arrayList.add(new lxy(jCurrentTimeMillis, nxyVar));
                }
                return CollectionsKt.A0(arrayList, new e3l((byte) 22));
            case 5:
                List list4 = (List) this.k;
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (z7) {
                    if (z7) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                nbu nbuVar = (nbu) ((a6u) this.l).c;
                String str2 = (String) this.m;
                boolean z8 = ((sff0) obj2).b.N;
                this.k = null;
                this.j = true;
                Object objA = nbuVar.a(list4, str2, z8, this);
                return objA == wneVar6 ? wneVar6 : objA;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    kmq kmqVar3 = (kmq) this.k;
                    utb utbVar = (utb) this.l;
                    yj2 yj2Var2 = new yj2((Object) kmqVar3, this.m, obj2, (byte) 24);
                    this.k = null;
                    this.j = true;
                    if (utbVar.c(yj2Var2, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    kmq kmqVar4 = (kmq) this.k;
                    gmq gmqVar2 = (gmq) this.l;
                    yj2 yj2Var3 = new yj2((Object) kmqVar4, this.m, obj2, (byte) 25);
                    this.k = null;
                    this.j = true;
                    if (gmqVar2.c(yj2Var3, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                vne vneVar = (vne) this.k;
                wne wneVar9 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.l, (glz) this.m, lkz.d);
                    hgv hgvVar = new hgv(vneVar, (q1w) obj2, null);
                    this.k = null;
                    this.j = true;
                    if (slb.O(bq9VarB, hgvVar, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                tax taxVar = (tax) this.m;
                ol60 ol60Var = taxVar.x;
                wne wneVar10 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    if (taxVar.B) {
                        ol60Var.f(new oax(true));
                    }
                    taxVar.k.a();
                    str = "org.xbet.client1";
                    this.l = "org.xbet.client1";
                    this.j = true;
                    objE = taxVar.f.e((File) this.k, (dxk) obj2, this);
                    if (objE == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) this.l;
                    z1x.P(obj);
                    str = str3;
                    objE = obj;
                }
                ol60Var.f(new max((File) objE, str));
                return Unit.f46060a;
            case 10:
                ha8 ha8Var = (ha8) this.k;
                p850 p850Var = (p850) this.l;
                wne wneVar11 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    xfu xfuVar = p850Var.G;
                    long jLongValue = ((Long) this.m).longValue();
                    this.j = true;
                    objD = xfuVar.d(jLongValue, this);
                    if (objD == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD = obj;
                }
                String str4 = (String) objD;
                l750 l750Var = new l750(ha8Var.getKey(), !StringsKt.W(str4) ? new da8(ha8Var.a(), new g8y(str4, (lr5) obj2), false) : new y98(ha8Var.a()), (byte) 3);
                int i2 = p850.p0;
                p850Var.H(l750Var);
                return Unit.f46060a;
            case 11:
                mlr mlrVar = (mlr) this.m;
                v360 v360Var = (v360) this.l;
                wne wneVar12 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    if (!v360Var.W.c()) {
                        return Unit.f46060a;
                    }
                    xr xrVar = v360Var.q;
                    String strP = v360Var.P(mlrVar);
                    this.j = true;
                    if (xrVar.m(mlrVar, false, 8201, strP, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                dr50 dr50Var = new dr50(this.k, obj2, (Object) mlrVar, (byte) 5);
                int i3 = v360.x0;
                v360Var.H(dr50Var);
                return Unit.f46060a;
            case 12:
                ca70 ca70Var = (ca70) obj2;
                wne wneVar13 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    boolean z16 = ((ra70) this.m).f30120a;
                    mne mneVar = (mne) this.k;
                    z7z z7zVar = ca70Var.P1;
                    if (z7zVar == null) {
                        Intrinsics.h("json");
                        throw null;
                    }
                    Object obj5 = z7zVar.get();
                    obj5.getClass();
                    c5v0 c5v0Var2 = new c5v0(z16, mneVar, (vby) obj5);
                    c5v0Var2.e = new cy60(1, ca70Var.H0(), k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                    Context contextO0 = ca70Var.o0();
                    this.l = c5v0Var2;
                    this.j = true;
                    if (qjj.d0(mneVar.c, new otp0(c5v0Var2, contextO0, (yje) null, b4), this) == wneVar13) {
                        return wneVar13;
                    }
                    c5v0Var = c5v0Var2;
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c5v0Var = (c5v0) this.l;
                    z1x.P(obj);
                }
                htz htzVar = ca70.U1;
                ca70Var.H0().x(new w670(c5v0Var));
                return Unit.f46060a;
            case 13:
                c7a c7aVar = (c7a) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    int i4 = n880.L;
                    if (((n880) this.l).O((String) this.m, c7aVar.f3852a, (Integer) obj2, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                c7a c7aVar2 = (c7a) this.k;
                wne wneVar15 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (((aa80) this.l).y((String) this.m, c7aVar2.f3852a, (Integer) obj2, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                s690 s690Var = (s690) this.m;
                wne wneVar16 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    strR = s690Var.e.f25751a.a() ? kotlin.text.c.r(((btt0) ((okt0) s690Var.d.f13549a).b).a(), "Bearer ", "", false) : "";
                    pmi pmiVar = s690Var.f;
                    this.l = strR;
                    this.j = true;
                    objX = pmiVar.x(this);
                    if (objX == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = (String) this.l;
                    z1x.P(obj);
                    strR = str5;
                    objX = obj;
                }
                String strValueOf = String.valueOf(((Number) objX).intValue());
                p7m0 p7m0Var = s690Var.v;
                String str6 = (String) this.k;
                s690Var.p.e();
                i690 i690Var = new i690(str6, strR, strValueOf, (String) obj2);
                p7m0Var.getClass();
                p7m0Var.o(null, i690Var);
                return Unit.f46060a;
            case 16:
                j790 j790Var = (j790) this.m;
                wne wneVar17 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    strR = j790Var.r.f25751a.a() ? kotlin.text.c.r(((btt0) ((okt0) j790Var.q.f13549a).b).a(), "Bearer ", "", false) : "";
                    pmi pmiVar2 = j790Var.s;
                    this.l = strR;
                    this.j = true;
                    objX2 = pmiVar2.x(this);
                    if (objX2 == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str7 = (String) this.l;
                    z1x.P(obj);
                    strR = str7;
                    objX2 = obj;
                }
                String strValueOf2 = String.valueOf(((Number) objX2).intValue());
                j790Var.z.e();
                j790Var.G(new u690((String) this.k, strR, strValueOf2, (String) obj2));
                return Unit.f46060a;
            case 17:
                xk80 xk80Var = (xk80) this.l;
                wne wneVar18 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    yje yjeVar2 = null;
                    utb utbVarC = aoq.c(ydx.V(null, new s39(xk80Var, (byte) 29)), new fe0(yjeVar2, (pz40) this.m, xk80Var, b3));
                    khx khxVar = new khx((a4x) this.k, (gna0) obj2, yjeVar2, b2);
                    this.j = true;
                    if (slb.O(utbVarC, khxVar, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                Function2 function2 = (Function2) obj2;
                View view = (View) this.m;
                my90 my90Var = (my90) this.l;
                wne wneVar19 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    if (my90Var != null) {
                        Object tag = view.getTag();
                        my90 my90Var2 = tag instanceof my90 ? (my90) tag : null;
                        if (my90Var2 != null && !my90Var2.equals(my90Var) && ((ulo) my90Var2).w(27)) {
                            function2.invoke(my90Var2, view);
                        }
                        if (((ulo) my90Var).w(27)) {
                            ((Function2) this.k).invoke(my90Var, view);
                            view.setTag(my90Var);
                        }
                    } else {
                        rwj rwjVar = tvk.f34603a;
                        vs10 vs10Var = ys10.f43147a;
                        s980 s980Var = new s980(view, function2, null, (byte) 19);
                        this.j = true;
                        if (qjj.d0(vs10Var, s980Var, this) == wneVar19) {
                            return wneVar19;
                        }
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xk80 xk80Var2 = (xk80) this.l;
                l7m0 l7m0Var = (l7m0) obj2;
                wne wneVar20 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    mi70 mi70Var = ccb0.X1;
                    if (((Number) l7m0Var.getValue()).intValue() == -1 || xk80Var2.k() == ((Number) l7m0Var.getValue()).intValue()) {
                        return Unit.f46060a;
                    }
                    ((pv40) this.m).e(((emb0) ((l7m0) this.k).getValue()).c);
                    int iIntValue = ((Number) l7m0Var.getValue()).intValue();
                    this.j = true;
                    if (xk80Var2.v(iIntValue, 0.0f, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    if (!((Boolean) ((pz40) this.k).getValue()).booleanValue()) {
                        int iL = ((cgk0) obj2).l();
                        int i5 = ((jba) this.l).b;
                        if (iL < i5) {
                            xcz xczVar = (xcz) this.m;
                            this.j = true;
                            v0h0 v0h0Var = xcz.y;
                            if (xczVar.l(i5, 0, this) == wneVar21) {
                                return wneVar21;
                            }
                        }
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                SelectorOptionModel selectorOptionModel = (SelectorOptionModel) this.k;
                t4e0 t4e0Var = (t4e0) obj2;
                ocj ocjVar = t4e0Var.i;
                wne wneVar22 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    g6i0 g6i0VarV = j0x.V((i6i0) this.m);
                    j6i0 j6i0Var3 = new j6i0(wp20.b(new Pair(g6i0VarV, kotlin.collections.a.c(SelectorOptionModel.a(selectorOptionModel, false, true, 7)))), true);
                    int i6 = t4e0.x;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                    } while (!p7m0Var2.m(value, n4e0.a((n4e0) value, null, true, false, 13)));
                    if (((n4e0) t4e0Var.D()).f22894a != null) {
                        j6i0 j6i0Var4 = ((n4e0) t4e0Var.D()).f22894a;
                        if (j6i0Var4 != null) {
                            j6i0Var3 = j6i0Var4;
                        }
                        Map map = j6i0Var3.b;
                        ArrayList arrayList4 = new ArrayList(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            g6i0 g6i0Var = (g6i0) entry.getKey();
                            List<SelectorOptionModel> list5 = (List) entry.getValue();
                            if (g6i0Var == g6i0VarV) {
                                ArrayList arrayList5 = new ArrayList(r3d.q(list5, i));
                                for (SelectorOptionModel selectorOptionModel2 : list5) {
                                    arrayList5.add(SelectorOptionModel.a(selectorOptionModel2, false, Intrinsics.d(selectorOptionModel2, selectorOptionModel), 7));
                                }
                                pair = new Pair(g6i0Var, arrayList5);
                            } else {
                                pair = new Pair(g6i0Var, list5);
                            }
                            arrayList4.add(pair);
                            i = 10;
                        }
                        Map mapM = xp20.m(arrayList4);
                        mapM.getClass();
                        j6i0Var = new j6i0(mapM, true);
                    } else {
                        j6i0Var = null;
                    }
                    xsu xsuVar = t4e0Var.u;
                    RatingStatisticScreenParams ratingStatisticScreenParams = t4e0Var.o;
                    this.l = j6i0Var;
                    this.j = true;
                    j6i0Var2 = j6i0Var;
                    objQ = ((z220) xsuVar.f41434a).q(ratingStatisticScreenParams, 0, 30, 0, j6i0Var2, this);
                    if (objQ == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j6i0 j6i0Var5 = (j6i0) this.l;
                    z1x.P(obj);
                    j6i0Var2 = j6i0Var5;
                    objQ = obj;
                }
                j6i0 j6i0Var6 = ((h8e0) objQ).e;
                if (j6i0Var6 == null || j6i0Var2 == null) {
                    int i7 = t4e0.x;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                    } while (!p7m0Var3.m(value2, n4e0.a((n4e0) value2, null, false, true, 8)));
                } else {
                    t4e0Var.v.getClass();
                    Map map2 = j6i0Var6.b;
                    ArrayList arrayList6 = new ArrayList(map2.size());
                    for (Map.Entry entry2 : map2.entrySet()) {
                        g6i0 g6i0Var2 = (g6i0) entry2.getKey();
                        List<SelectorOptionModel> list6 = (List) entry2.getValue();
                        List list7 = (List) j6i0Var2.b.get(g6i0Var2);
                        ArrayList arrayList7 = new ArrayList(r3d.q(list6, 10));
                        for (SelectorOptionModel selectorOptionModelA : list6) {
                            if (list7 != null) {
                                Iterator it3 = list7.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next2 = it3.next();
                                        SelectorOptionModel selectorOptionModel3 = (SelectorOptionModel) next2;
                                        if (!Intrinsics.d(selectorOptionModel3.b, selectorOptionModelA.b) || !selectorOptionModel3.d) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                SelectorOptionModel selectorOptionModel4 = (SelectorOptionModel) next2;
                                if (selectorOptionModel4 != null) {
                                    selectorOptionModelA = SelectorOptionModel.a(selectorOptionModel4, selectorOptionModelA.c, false, 11);
                                }
                            }
                            arrayList7.add(selectorOptionModelA);
                        }
                        arrayList6.add(new Pair(g6i0Var2, arrayList7));
                    }
                    Map mapM2 = xp20.m(arrayList6);
                    boolean z26 = j6i0Var6.f15989a;
                    mapM2.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry3 : mapM2.entrySet()) {
                        List list8 = (List) entry3.getValue();
                        if (!list8.isEmpty() && list8.size() > 1) {
                            linkedHashMap.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    j6i0 j6i0Var7 = new j6i0(linkedHashMap, z26);
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                    } while (!p7m0Var4.m(value3, n4e0.a((n4e0) value3, j6i0Var7, false, false, 8)));
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    a4x a4xVar = ((qwe0) this.l).c;
                    u0f0 u0f0Var = (u0f0) this.k;
                    Iterator it4 = a4xVar.iterator();
                    int i8 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i8 = -1;
                        } else if (((y0f0) it4.next()).q() != u0f0Var) {
                            i8++;
                        }
                    }
                    if (i8 != -1) {
                        xcz xczVar2 = (xcz) this.m;
                        this.j = true;
                        v0h0 v0h0Var2 = xcz.y;
                        if (xczVar2.f(i8, 0, this) == wneVar23) {
                            return wneVar23;
                        }
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((Function1) ((pz40) obj2).getValue()).invoke(zue0.f45007a);
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    vne vneVar2 = (vne) this.k;
                    rwj rwjVar2 = tvk.f34603a;
                    vs10 vs10VarX = ys10.f43147a.x();
                    c43 c43Var = new c43(this.l, this.m, (Object) vneVar2, obj2, (yje) null, (byte) 9);
                    this.j = true;
                    if (qjj.d0(vs10VarX, c43Var, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new ubh0((pz40) this.l, (pz40) this.m, (byte) 0));
                    r980 r980Var = new r980((yrx) this.k, (w6k) obj2, (byte) 15);
                    this.j = true;
                    if (vsg0VarV.c(r980Var, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    vsg0 vsg0VarV2 = ydx.V(null, new ubh0((pz40) this.l, (pz40) this.m, (byte) 1));
                    r980 r980Var2 = new r980((zrx) this.k, (w6k) obj2, b3);
                    this.j = true;
                    if (vsg0VarV2.c(r980Var2, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str8 = (String) obj2;
                xpl0 xpl0Var = (xpl0) this.m;
                oyg0 oyg0Var = xpl0Var.f;
                ocj ocjVar2 = xpl0Var.i;
                List list9 = (List) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    ((qpl0) this.l).invoke();
                    thh0 thh0Var = ((hpl0) xpl0Var.D()).h;
                    nhh0 nhh0Var2 = thh0Var instanceof nhh0 ? (nhh0) thh0Var : null;
                    if (nhh0Var2 == null || (collection = nhh0Var2.f23533a) == null) {
                        collection = iun.f15405a;
                    }
                    hjd hjdVar = xpl0Var.E;
                    did didVar = new did(CollectionsKt.q0(collection, list9));
                    this.k = list9;
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(didVar, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                thh0 thh0Var2 = ((hpl0) xpl0Var.D()).i;
                nhh0 nhh0Var3 = thh0Var2 instanceof nhh0 ? (nhh0) thh0Var2 : null;
                if (Intrinsics.d(nhh0Var3 != null ? nhh0Var3.b : null, str8)) {
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var5.getValue();
                        value5.getClass();
                    } while (!p7m0Var5.m(value5, hpl0.a((hpl0) value5, false, false, null, null, false, null, null, null, new nhh0(list9, str8), null, null, null, null, null, null, false, 261887)));
                } else {
                    p7m0 p7m0Var6 = ocjVar2.f25029a;
                    do {
                        value4 = p7m0Var6.getValue();
                        value4.getClass();
                        nhh0Var = new nhh0(list9, str8);
                        dhh0Var = dhh0.d;
                        q7x.F(oyg0Var, dhh0Var, "SAVED_STATE_SHOW_TYPE");
                    } while (!p7m0Var6.m(value4, hpl0.a((hpl0) value4, false, false, null, null, false, null, dhh0Var, null, nhh0Var, null, null, null, null, null, null, false, 261823)));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return l(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return m(obj);
            default:
                wne wneVar28 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    CoroutineContext.Element element = ((vne) this.k).getCoroutineContext().get(kotlin.coroutines.d.d1);
                    element.getClass();
                    kotlin.coroutines.d dVar = (kotlin.coroutines.d) element;
                    zdg0 zdg0Var = (zdg0) this.l;
                    CoroutineContext coroutineContextC = kotlin.coroutines.e.c((kotlin.coroutines.a) dVar, new ces0(dVar));
                    CoroutineContext coroutineContextPlus = coroutineContextC.plus(new fcq0(coroutineContextC, zdg0Var.f));
                    n5a n5aVar = (n5a) this.m;
                    e0g0 e0g0Var = j0g0.b;
                    this.k = n5aVar;
                    this.j = true;
                    objD0 = qjj.d0(coroutineContextPlus, (lcl0) obj2, this);
                    if (objD0 == wneVar28) {
                        return wneVar28;
                    }
                    yjeVar = n5aVar;
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yjeVar = (yje) this.k;
                    z1x.P(obj);
                    objD0 = obj;
                }
                e0g0 e0g0Var2 = j0g0.b;
                yjeVar.resumeWith(objD0);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmq(gmq gmqVar, yje yjeVar, Function1 function1, kie0 kie0Var, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = gmqVar;
        this.m = function1;
        this.n = kie0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmq(h6i h6iVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.n = h6iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmq(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmq(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmq(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = obj3;
        this.n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmq(Object obj, Object obj2, boolean z, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = obj2;
        this.n = obj3;
    }
}

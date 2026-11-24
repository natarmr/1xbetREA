package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes5.dex */
public final class cbq extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbq(nr nrVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 29;
        this.l = nrVar;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                cbq cbqVar = new cbq(obj2, yjeVar, (byte) 0);
                cbqVar.k = obj;
                return cbqVar;
            case 1:
                return new cbq((vlq) this.k, (slq) obj2, yjeVar, (byte) 1);
            case 2:
                return new cbq((vlq) this.k, (nlx) obj2, yjeVar, (byte) 2);
            case 3:
                cbq cbqVar2 = new cbq(obj2, yjeVar, (byte) 3);
                cbqVar2.k = obj;
                return cbqVar2;
            case 4:
                return new cbq((gmq) this.k, (hzb0) obj2, yjeVar, (byte) 4);
            case 5:
                return new cbq((khf0) this.k, (String) obj2, yjeVar, (byte) 5);
            case 6:
                return new cbq((xk80) this.k, (wwh0) obj2, yjeVar, (byte) 6);
            case 7:
                return new cbq((cyh) this.k, (i7a) obj2, yjeVar, (byte) 7);
            case 8:
                return new cbq(obj2, yjeVar, (byte) 8);
            case 9:
                return new cbq((spr) this.k, (f0k0) obj2, yjeVar, (byte) 9);
            case 10:
                return new cbq((l0s) this.k, (mie0) obj2, yjeVar, (byte) 10);
            case 11:
                cbq cbqVar3 = new cbq(obj2, yjeVar, (byte) 11);
                cbqVar3.k = obj;
                return cbqVar3;
            case 12:
                return new cbq((k4s) this.k, (d0k0) obj2, yjeVar, (byte) 12);
            case 13:
                return new cbq((rv2) this.k, (Function1) obj2, yjeVar, (byte) 13);
            case 14:
                return new cbq((g9s) this.k, (faj) obj2, yjeVar, (byte) 14);
            case 15:
                return new cbq((yks) this.k, (e0k0) obj2, yjeVar, (byte) 15);
            case 16:
                return new cbq((yxs) this.k, (String) obj2, yjeVar, (byte) 16);
            case 17:
                return new cbq((q3t) this.k, (lle) obj2, yjeVar, (byte) 17);
            case 18:
                return new cbq((q3t) this.k, (w05) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new cbq(obj2, yjeVar, (byte) 19);
            case 20:
                return new cbq((q3t) this.k, (Throwable) obj2, yjeVar, (byte) 20);
            case 21:
                return new cbq((q3t) this.k, (l3t) obj2, yjeVar, (byte) 21);
            case 22:
                return new cbq((g5t) this.k, (vne) obj2, yjeVar, (byte) 22);
            case 23:
                return new cbq((a9t) this.k, (zy5) obj2, yjeVar, (byte) 23);
            case 24:
                return new cbq((a9t) this.k, (Throwable) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new cbq((jat) this.k, (vne) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cbq cbqVar4 = new cbq(this.j, (wti) obj2, yjeVar);
                cbqVar4.k = obj;
                return cbqVar4;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cbq cbqVar5 = new cbq(obj2, yjeVar, (byte) 27);
                cbqVar5.k = obj;
                return cbqVar5;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cbq cbqVar6 = new cbq(obj2, yjeVar, (byte) 28);
                cbqVar6.k = obj;
                return cbqVar6;
            default:
                cbq cbqVar7 = new cbq((nr) obj2, this.j, yjeVar);
                cbqVar7.k = obj;
                return cbqVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cbq) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((cbq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((cbq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((cbq) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((cbq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((cbq) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cbq) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r14v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v67 */
    /* JADX WARN: Type inference failed for: r2v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        List list;
        ?? arrayList;
        Object objF;
        vkr vkrVar;
        Object objB;
        Object objA2;
        Object objB2;
        Object objB3;
        Object objB4;
        Object objA3;
        q3t q3tVar;
        Object objE;
        Object objE2;
        Object objM;
        byte b = this.i;
        byte b2 = 6;
        byte b3 = 8;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        Object obj2 = this.l;
        ?? r14 = 0;
        r14 = 0;
        switch (b) {
            case 0:
                ebq ebqVar = (ebq) obj2;
                mne mneVar = ebqVar.x;
                sw00 sw00Var = (sw00) this.k;
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (sw00Var.f32897a) {
                        this.k = null;
                        this.j = true;
                        int i = ebq.f0;
                        if (ebqVar.N(this) == wneVar) {
                            return wneVar;
                        }
                    } else {
                        int i2 = ebq.f0;
                        p7m0 p7m0Var = ebqVar.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, oaq.a((oaq) value, null, false, null, null, null, null, null, false, false, 0, null, false, 4087)));
                    }
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                int i3 = ebq.f0;
                f6k f6kVar = ebqVar.M;
                bm5 bm5Var = bm5.m;
                f6kVar.a(bm5Var);
                byte b4 = 4;
                int i4 = 0;
                Class<ebq> cls = ebq.class;
                ebqVar.J(new fnq(ebqVar.T.a(bm5Var), new yaq(ebqVar, r14, z ? (byte) 1 : (byte) 0), b4), mneVar.b, new pop(1, ebqVar, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", i4, (byte) 15));
                ebqVar.J(new fnq(ebqVar.J.a(), new waq(ebqVar, r14, z ? (byte) 1 : (byte) 0), b4), mneVar.b, new pop(1, ebqVar, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", i4, (byte) 14));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    vlq vlqVar = (vlq) this.k;
                    slq slqVar = (slq) obj2;
                    float f = slqVar.f32412a;
                    float f2 = slqVar.b;
                    float f3 = slqVar.d;
                    float f4 = slqVar.c;
                    this.j = true;
                    vlqVar.f37639a = f;
                    vlqVar.b = f2;
                    vlqVar.c = f3;
                    vlqVar.d = f4;
                    Object objB5 = vlqVar.b(this);
                    if (objB5 != wneVar2) {
                        objB5 = Unit.f46060a;
                    }
                    if (objB5 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    this.j = true;
                    if (((vlq) this.k).a((nlx) obj2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                kmq kmqVar = (kmq) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (z6 && !z6) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                while (zvw.X(getContext())) {
                    this.k = kmqVar;
                    this.j = true;
                    if (((n1) obj2).invoke(kmqVar, this) == wneVar4) {
                        return wneVar4;
                    }
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    gmq gmqVar = (gmq) this.k;
                    u6d u6dVar = new u6d((hzb0) obj2, (byte) 1);
                    this.j = true;
                    if (gmqVar.c(u6dVar, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                khf0 khf0Var = (khf0) this.k;
                knf0 knf0Var = (knf0) khf0Var.d;
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    nmo nmoVar = (nmo) khf0Var.c;
                    int iB = knf0Var.b();
                    knf0Var.getClass();
                    LinkedHashMap linkedHashMapO = ofm0.o(iB, (String) obj2, knf0Var.c());
                    this.j = true;
                    objA = ((ear) ((wgn) nmoVar.f23782a).invoke()).a(linkedHashMapO, "application/vnd.xenvelop+json", this);
                    if (objA == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                iar iarVar = ((qar) ((dx5) objA).a()).f28410a;
                if (iarVar != null && (list = iarVar.f14452a) != null) {
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List list2 = ((bxk) it.next()).f3379a;
                        if (list2 != null) {
                            arrayList = new ArrayList(r3d.q(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                String str = ((xn80) it2.next()).f41162a;
                                if (str == null) {
                                    str = "";
                                }
                                arrayList.add(str);
                            }
                        } else {
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = iun.f15405a;
                        }
                        arrayList2.add(arrayList);
                    }
                    r14 = arrayList2;
                }
                if (r14 == 0) {
                    r14 = iun.f15405a;
                }
                return new nar(r3d.r(r14));
            case 6:
                xk80 xk80Var = (xk80) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    int iK = xk80Var.k();
                    int i5 = ((wwh0) obj2).d;
                    if (iK != i5) {
                        this.j = true;
                        if (xk80Var.v(i5, 0.0f, this) == wneVar7) {
                            return wneVar7;
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
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    this.j = true;
                    Long lT0 = StringsKt.t0(((i7a) obj2).b);
                    if (qcc.O(lT0 != null ? lT0.longValue() : 0L, this) == wneVar8) {
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
                wne wneVar9 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    vkr vkrVar2 = (vkr) obj2;
                    i8u i8uVar = vkrVar2.e;
                    Iterable iterable = (Iterable) vkrVar2.h.getValue();
                    ArrayList<nkr> arrayList3 = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (obj3 instanceof nkr) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                    for (nkr nkrVar : arrayList3) {
                        arrayList4.add(new pio(nkrVar.f23694a, nkrVar.d == ejr.c));
                    }
                    this.k = vkrVar2;
                    this.j = true;
                    objF = i8uVar.f14358a.F(arrayList4, this);
                    if (objF == wneVar9) {
                        return wneVar9;
                    }
                    vkrVar = vkrVar2;
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vkrVar = (vkr) this.k;
                    z1x.P(obj);
                    objF = obj;
                }
                vkrVar.w(new skr(((yio) objF).b));
                return Unit.f46060a;
            case 9:
                f0k0 f0k0Var = (f0k0) obj2;
                spr sprVar = (spr) this.k;
                vmr vmrVar = sprVar.X;
                wne wneVar10 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    h3c h3cVar = sprVar.W;
                    long jC = f0k0Var.c();
                    this.j = true;
                    objB = h3cVar.b(jC, this);
                    if (objB == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                FragmentScreen fragmentScreenH = sprVar.V.h(new GameScreenGeneralParams(f0k0Var.a(), 0L, f0k0Var.c(), 0L, ((Boolean) objB).booleanValue(), 0L, f0k0Var.e(), GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN));
                Long l = f0k0Var.c() == 40 ? new Long(f0k0Var.d()) : null;
                if (f0k0Var instanceof c0k0) {
                    c0k0 c0k0Var = (c0k0) f0k0Var;
                    long j = c0k0Var.f3529a;
                    long j2 = c0k0Var.c;
                    vmrVar.f37684a.m(j, j2, l, true);
                    vmrVar.b.p(j, j2, l, true);
                } else {
                    if (!(f0k0Var instanceof zzj0)) {
                        t9f.b();
                        return null;
                    }
                    zzj0 zzj0Var = (zzj0) f0k0Var;
                    long j3 = zzj0Var.f45257a;
                    long j4 = zzj0Var.c;
                    vmrVar.f37684a.m(j3, j4, l, false);
                    vmrVar.b.p(j3, j4, l, false);
                }
                i1w0 i1w0VarC = sprVar.r.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new s0w0(fragmentScreenH)), i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            case 10:
                mie0 mie0Var = (mie0) obj2;
                l0s l0sVar = (l0s) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    njt0 njt0Var = l0sVar.m;
                    lia liaVar = (lia) mie0Var.f21842a;
                    long j5 = liaVar.f;
                    long j6 = liaVar.d;
                    boolean z14 = liaVar.g;
                    boolean z15 = liaVar.b;
                    boolean z16 = liaVar.h;
                    this.j = true;
                    objA2 = njt0Var.a(j5, j6, this, z14, z15, z16);
                    if (objA2 == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                sjt0 sjt0Var = (sjt0) objA2;
                if ((sjt0Var instanceof ojt0) && ((ojt0) sjt0Var).f25377a) {
                    l0sVar.B.g(c1k0.f3576a);
                }
                if (!(sjt0Var instanceof qjt0)) {
                    mii0 mii0Var = l0sVar.j;
                    lia liaVar2 = (lia) mie0Var.f21842a;
                    mii0Var.I(liaVar2.f20093a, liaVar2.c, kpb.T(l0sVar.z), l0s.x(sjt0Var), ((lia) mie0Var.f21842a).g);
                    ol60 ol60Var = l0sVar.A;
                    lia liaVar3 = (lia) mie0Var.f21842a;
                    ol60Var.f(new sm7(liaVar3.f20093a, liaVar3.c, ((lia) mie0Var.f21842a).g, l0s.x(sjt0Var)));
                }
                return Unit.f46060a;
            case 11:
                o2s o2sVar = (o2s) obj2;
                vne vneVar = (vne) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new k2s(o2sVar, b2));
                    o4m o4mVar = new o4m((Object) o2sVar, (Object) vneVar, (byte) 15);
                    this.k = null;
                    this.j = true;
                    if (vsg0VarV.c(o4mVar, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                d0k0 d0k0Var = (d0k0) obj2;
                k4s k4sVar = (k4s) this.k;
                lhf0 lhf0Var = k4sVar.I;
                wne wneVar13 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    h3c h3cVar2 = k4sVar.H;
                    long jC2 = d0k0Var.c();
                    this.j = true;
                    objB2 = h3cVar2.b(jC2, this);
                    if (objB2 == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB2 = obj;
                }
                FragmentScreen fragmentScreenH2 = k4sVar.G.h(new GameScreenGeneralParams(d0k0Var.a(), 0L, d0k0Var.c(), 0L, ((Boolean) objB2).booleanValue(), 0L, d0k0Var.e(), GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN));
                Long l2 = d0k0Var.c() == 40 ? new Long(d0k0Var.d()) : null;
                if (d0k0Var instanceof a0k0) {
                    a0k0 a0k0Var = (a0k0) d0k0Var;
                    long j7 = a0k0Var.f29a;
                    long j8 = a0k0Var.c;
                    ((bn6) lhf0Var.b).m(j7, j8, l2, true);
                    ((je) lhf0Var.d).p(j7, j8, l2, true);
                } else {
                    if (!(d0k0Var instanceof xzj0)) {
                        t9f.b();
                        return null;
                    }
                    xzj0 xzj0Var = (xzj0) d0k0Var;
                    long j9 = xzj0Var.f41757a;
                    long j10 = xzj0Var.c;
                    ((bn6) lhf0Var.b).m(j9, j10, l2, false);
                    ((je) lhf0Var.d).p(j9, j10, l2, false);
                }
                i1w0 i1w0VarC2 = k4sVar.q.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new s0w0(fragmentScreenH2)), i1w0VarC2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
                break;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    vsg0 vsg0VarV2 = ydx.V(null, new st2((rv2) this.k, (byte) 7));
                    x6h x6hVar = new x6h((Function1) obj2, (byte) 8);
                    this.j = true;
                    if (vsg0VarV2.c(x6hVar, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                g9s g9sVar = (g9s) this.k;
                faj fajVar = (faj) obj2;
                wne wneVar15 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    h3c h3cVar3 = g9sVar.Z;
                    long jC3 = fajVar.c();
                    this.j = true;
                    objB3 = h3cVar3.b(jC3, this);
                    if (objB3 == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB3 = obj;
                }
                FragmentScreen fragmentScreenH3 = g9sVar.Y.h(new GameScreenGeneralParams(fajVar.a(), 0L, fajVar.c(), 0L, ((Boolean) objB3).booleanValue(), 0L, fajVar.e(), GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN));
                Long l3 = fajVar.c() == 40 ? new Long(fajVar.d()) : null;
                if (fajVar instanceof eaj) {
                    eaj eajVar = (eaj) fajVar;
                    long j11 = eajVar.f7467a;
                    long j12 = eajVar.c;
                    g9sVar.b0.m(j11, j12, l3, true);
                    g9sVar.a0.p(j11, j12, l3, true);
                } else {
                    if (!(fajVar instanceof daj)) {
                        t9f.b();
                        return null;
                    }
                    daj dajVar = (daj) fajVar;
                    long j13 = dajVar.f5750a;
                    long j14 = dajVar.c;
                    g9sVar.b0.m(j13, j14, l3, false);
                    g9sVar.a0.p(j13, j14, l3, false);
                }
                i1w0 i1w0Var = g9sVar.r;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, new s0w0(fragmentScreenH3)), i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar3.next());
                }
                break;
            case 15:
                yks yksVar = (yks) this.k;
                e0k0 e0k0Var = (e0k0) obj2;
                wne wneVar16 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    h3c h3cVar4 = yksVar.Y;
                    long jC4 = e0k0Var.c();
                    this.j = true;
                    objB4 = h3cVar4.b(jC4, this);
                    if (objB4 == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB4 = obj;
                }
                FragmentScreen fragmentScreenH4 = yksVar.X.h(new GameScreenGeneralParams(e0k0Var.a(), 0L, e0k0Var.c(), 0L, ((Boolean) objB4).booleanValue(), 0L, e0k0Var.e(), GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN));
                Long l4 = e0k0Var.c() == 40 ? new Long(e0k0Var.d()) : null;
                if (e0k0Var instanceof b0k0) {
                    b0k0 b0k0Var = (b0k0) e0k0Var;
                    long j15 = b0k0Var.f1769a;
                    long j16 = b0k0Var.c;
                    yksVar.a0.m(j15, j16, l4, true);
                    yksVar.Z.p(j15, j16, l4, true);
                } else {
                    if (!(e0k0Var instanceof yzj0)) {
                        t9f.b();
                        return null;
                    }
                    yzj0 yzj0Var = (yzj0) e0k0Var;
                    long j17 = yzj0Var.f43516a;
                    long j18 = yzj0Var.c;
                    yksVar.a0.m(j17, j18, l4, false);
                    yksVar.Z.p(j17, j18, l4, false);
                }
                i1w0 i1w0Var2 = yksVar.r;
                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var2);
                ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, new s0w0(fragmentScreenH4)), i1w0Var2, copyOnWriteArrayListQ4, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorP4;
                    if (!pawVar4.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar4.next());
                }
                break;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z22 = this.j;
                if (z22) {
                    if (z22) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ivn ivnVar = ((yxs) this.k).c;
                this.j = true;
                Object objA4 = ((tws) ((jcs) ivnVar.f15453a).invoke()).a((String) obj2, this);
                return objA4 == wneVar17 ? wneVar17 : objA4;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    this.j = true;
                    if (((q3t) this.k).j.f((lle) obj2, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    this.j = true;
                    if (((q3t) this.k).d.a((w05) obj2, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    q3t q3tVar2 = (q3t) obj2;
                    zju zjuVar = q3tVar2.b;
                    this.k = q3tVar2;
                    this.j = true;
                    objA3 = zjuVar.a(this);
                    if (objA3 == wneVar20) {
                        return wneVar20;
                    }
                    q3tVar = q3tVar2;
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q3tVar = (q3t) this.k;
                    z1x.P(obj);
                    objA3 = obj;
                }
                q3tVar.C(new f3t(((Number) objA3).intValue()));
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    this.j = true;
                    if (((q3t) this.k).m.a((Throwable) obj2, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    this.j = true;
                    if (((q3t) this.k).n.m(this, (l3t) obj2) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                g5t g5tVar = (g5t) this.k;
                pru pruVar = g5tVar.e;
                wne wneVar23 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    boolean z29 = pruVar.a().d.b;
                    boolean z30 = pruVar.a().l.f34278a;
                    if (!z29 && !z30) {
                        return Unit.f46060a;
                    }
                    uen uenVar = wen.b;
                    long jV0 = ibc.v0(3, bfn.SECONDS);
                    List listJ = q3d.j(oqt0.class, vub0.class);
                    gkr gkrVar = new gkr(g5tVar, r14, b2);
                    this.j = true;
                    objE = j0x.E(4, jV0, this, "updateGamesActionsUseCase", listJ, gkrVar);
                    if (objE == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = ((j0g0) obj).f15681a;
                }
                e0g0 e0g0Var = j0g0.b;
                if (!(objE instanceof g0g0)) {
                }
                vne vneVar2 = (vne) obj2;
                Throwable thA = j0g0.a(objE);
                if (thA != null) {
                    thA.getLocalizedMessage();
                    g5tVar.f(thA, vneVar2);
                }
                z1x.P(objE);
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    this.j = true;
                    if (((a9t) this.k).b.f((zy5) obj2, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    this.j = true;
                    if (((a9t) this.k).d.a((Throwable) obj2, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                jat jatVar = (jat) this.k;
                pru pruVar2 = jatVar.i;
                wne wneVar26 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    boolean z34 = pruVar2.a().d.b;
                    boolean z35 = pruVar2.a().l.f34278a;
                    if (!z34 && !z35) {
                        return Unit.f46060a;
                    }
                    uen uenVar2 = wen.b;
                    long jV1 = ibc.v0(3, bfn.SECONDS);
                    List listJ2 = q3d.j(oqt0.class, vub0.class, sq60.class);
                    gkr gkrVar2 = new gkr(jatVar, r14, b3);
                    this.j = true;
                    objE2 = j0x.E(4, jV1, this, "updateGamesPreviewScenario", listJ2, gkrVar2);
                    if (objE2 == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE2 = ((j0g0) obj).f15681a;
                }
                e0g0 e0g0Var2 = j0g0.b;
                if (!(objE2 instanceof g0g0)) {
                }
                vne vneVar3 = (vne) obj2;
                Throwable thA2 = j0g0.a(objE2);
                if (thA2 != null) {
                    thA2.getLocalizedMessage();
                    jatVar.f(thA2, vneVar3);
                }
                z1x.P(objE2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th = (Throwable) this.k;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.IncorrectDataError) {
                    wti wtiVar = (wti) obj2;
                    if (this.j) {
                        ((gst0) wtiVar.c).j();
                    } else {
                        ((gst0) wtiVar.c).i();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                kmq kmqVar2 = (kmq) this.k;
                wne wneVar28 = wne.f39444a;
                ?? r2 = this.j;
                if (r2 != 0) {
                    if (r2 == 1) {
                        z1x.P(obj);
                        objM = obj;
                    } else {
                        if (r2 != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    return Unit.f46060a;
                }
                z1x.P(obj);
                qoj0 qoj0Var = ((fvt) obj2).f10230a.b.f33718a;
                this.k = kmqVar2;
                this.j = true;
                objM = ntb.M(qoj0Var, this);
                if (objM == wneVar28) {
                    return wneVar28;
                }
                if (objM != null) {
                    hny.b();
                    return null;
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z36 = this.j;
                if (!z36) {
                    z1x.P(obj);
                    tnt tntVar = new tnt((kmq) this.k, (byte) 19);
                    this.k = null;
                    this.j = true;
                    if (((vsg0) obj2).c(tntVar, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z36) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                Throwable th2 = (Throwable) this.k;
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                boolean z37 = this.j;
                gst0 gst0Var = (gst0) ((nr) obj2).d;
                if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.IncorrectDataError) {
                    z2 = true;
                }
                if (z2 && z37) {
                    gst0Var.j();
                } else if (z2) {
                    gst0Var.i();
                }
                return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cbq(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cbq(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbq(boolean z, wti wtiVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        this.j = z;
        this.l = wtiVar;
    }
}

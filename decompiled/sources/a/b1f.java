package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.services.mobile_services.impl.workers.CustomerIOPushWorker;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;

/* JADX INFO: loaded from: classes4.dex */
public final class b1f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1f(wtj wtjVar, ic1 ic1Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        c050 c050Var = c050.f3507a;
        this.k = wtjVar;
        this.l = ic1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new b1f(this.k, obj2, yjeVar, (byte) 0);
            case 1:
                return new b1f(this.k, obj2, yjeVar, (byte) 1);
            case 2:
                return new b1f(this.k, obj2, yjeVar, (byte) 2);
            case 3:
                return new b1f(this.k, obj2, yjeVar, (byte) 3);
            case 4:
                return new b1f(this.k, obj2, yjeVar, (byte) 4);
            case 5:
                b1f b1fVar = new b1f(obj2, yjeVar, (byte) 5);
                b1fVar.k = obj;
                return b1fVar;
            case 6:
                return new b1f(this.k, obj2, yjeVar, (byte) 6);
            case 7:
                return new b1f(this.k, obj2, yjeVar, (byte) 7);
            case 8:
                lkz lkzVar = lkz.f20223a;
                return new b1f((dnq) this.k, (clz) obj2, yjeVar);
            case 9:
                return new b1f(this.k, obj2, yjeVar, (byte) 9);
            case 10:
                b1f b1fVar2 = new b1f(obj2, yjeVar, (byte) 10);
                b1fVar2.k = obj;
                return b1fVar2;
            case 11:
                return new b1f(this.k, obj2, yjeVar, (byte) 11);
            case 12:
                b1f b1fVar3 = new b1f(obj2, yjeVar, (byte) 12);
                b1fVar3.k = obj;
                return b1fVar3;
            case 13:
                b1f b1fVar4 = new b1f(obj2, yjeVar, (byte) 13);
                b1fVar4.k = obj;
                return b1fVar4;
            case 14:
                return new b1f(this.k, obj2, yjeVar, (byte) 14);
            case 15:
                return new b1f(this.k, obj2, yjeVar, (byte) 15);
            case 16:
                return new b1f(this.k, obj2, yjeVar, (byte) 16);
            case 17:
                return new b1f(this.k, obj2, yjeVar, (byte) 17);
            case 18:
                b1f b1fVar5 = new b1f(obj2, yjeVar, (byte) 18);
                b1fVar5.k = obj;
                return b1fVar5;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new b1f(this.k, obj2, yjeVar, (byte) 19);
            case 20:
                b1f b1fVar6 = new b1f(obj2, yjeVar, (byte) 20);
                b1fVar6.k = obj;
                return b1fVar6;
            case 21:
                return new b1f(this.j, (jej) this.k, (Function1) obj2, yjeVar);
            case 22:
                return new b1f(this.k, obj2, yjeVar, (byte) 22);
            case 23:
                return new b1f(this.k, obj2, yjeVar, (byte) 23);
            case 24:
                wtj wtjVar = (wtj) this.k;
                c050 c050Var = c050.f3507a;
                return new b1f(wtjVar, (ic1) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                oot0 oot0Var = oot0.f25610a;
                return new b1f((rzj) this.k, yjeVar, (List) obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new b1f(this.k, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new b1f(obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new b1f(this.k, obj2, yjeVar, (byte) 28);
            default:
                return new b1f(this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((b1f) create((q0g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((b1f) create((j4g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((b1f) create((xqj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((b1f) create((x1j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((b1f) create((acj) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((b1f) create((u340) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((b1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objD;
        Object next;
        Object objQ;
        xtk xtkVar;
        Object value;
        byte b = this.i;
        byte b2 = 5;
        Object obj2 = this.l;
        byte b3 = 1;
        switch (b) {
            case 0:
                g45 g45Var = (g45) this.k;
                knf0 knf0Var = (knf0) g45Var.h;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ehf0 ehf0Var = (ehf0) g45Var.d;
                    String strC = knf0Var.c();
                    String strB0 = CollectionsKt.b0(CollectionsKt.z0(CollectionsKt.P0((List) obj2)), Separators.COMMA, null, null, new vzd((byte) 18), 30);
                    knf0Var.getClass();
                    this.j = true;
                    objB = ((vre) ((jwd) ehf0Var.c).invoke()).b(strB0, strC, 22, this);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                Iterable iterable = (Iterable) ((dx5) objB).a();
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(fbc.b0((s5t) it.next()));
                }
                return arrayList;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (((wff) this.k).k.a((Throwable) obj2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    if (((wff) this.k).n.m(this, (uff) obj2) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    ruf rufVar = (ruf) ((xr) this.k).b;
                    ArrayList arrayList2 = (ArrayList) obj2;
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        xuf xufVar = (xuf) it2.next();
                        xufVar.getClass();
                        arrayList3.add(new tuf(xufVar.f41508a, xufVar.b, xufVar.c, xufVar.d, xufVar.e, xufVar.f, xufVar.g, xufVar.h, xufVar.i, xufVar.j, xufVar.k, xufVar.l, xufVar.m, xufVar.n));
                        it2 = it2;
                        b3 = 1;
                    }
                    boolean z5 = b3;
                    this.j = z5;
                    Object objW0 = sj3.w0(this, rufVar.f31125a, new fze((Object) rufVar, (Object) arrayList3, (yje) null, (byte) 14), false, z5);
                    Object obj3 = objW0;
                    if (objW0 != wne.f39444a) {
                        obj3 = Unit.f46060a;
                    }
                    if (obj3 == wneVar4) {
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
                if (z6) {
                    if (z6) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                CustomerIOPushWorker customerIOPushWorker = (CustomerIOPushWorker) this.k;
                this.j = true;
                n5a n5aVar = new n5a(1, pnx.b(this));
                n5aVar.r();
                List list = u0d.f34849a;
                u0d.h(customerIOPushWorker.g, (String) obj2, new azf(n5aVar, (byte) 0));
                Object objP = n5aVar.p();
                return objP == wneVar5 ? wneVar5 : objP;
            case 5:
                q0g q0gVar = (q0g) this.k;
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    qoj0 qoj0Var = ((g1g) obj2).A;
                    this.k = null;
                    this.j = true;
                    if (qoj0Var.a(q0gVar, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    h1g h1gVar = (h1g) ((p1g) this.k).b.invoke();
                    qs2 qs2Var = new qs2((xs2) obj2);
                    this.j = true;
                    if (h1gVar.a("Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyLCJleHAiOjE5Nzc0ODU4NzR9.m8iEAP-mBP65mJzS-9BcD6hD50qYrgmcaADkwcPJvYo", "application/vnd.api+json", "application/vnd.api+json", qs2Var, new lwf((byte) 0), this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                Calendar calendar = (Calendar) obj2;
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    z1u z1uVar = ((h6g) this.k).h;
                    c5g c5gVar = new c5g(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(5), yag.f42295a, false);
                    this.j = true;
                    if (z1uVar.a(c5gVar, this) == wneVar8) {
                        return wneVar8;
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
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((dnq) this.k, ((clz) obj2).x(), lkz.e);
                    this.j = true;
                    if (slb.N(bq9VarB, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                g9g g9gVar = (g9g) obj2;
                yag yagVar = g9gVar.b;
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                    calendar2.setTimeInMillis(((CyberCalendarPeriodUiModel) this.k).f46479a);
                    yag yagVar2 = yag.d;
                    if (yagVar == yagVar2) {
                        calendar2.set(5, 1);
                        int i = calendar2.get(7);
                        if (i != 2) {
                            calendar2.add(5, i < 2 ? 2 - i : 9 - i);
                        }
                    }
                    this.j = true;
                    Object objA = g9gVar.e.a(new c5g(calendar2.get(1), calendar2.get(2), yagVar == yagVar2 ? calendar2.getActualMinimum(5) : calendar2.get(5), calendar2.get(5), g9gVar.b, false), this);
                    if (objA != wneVar10) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                hbg hbgVar = (hbg) obj2;
                j4g j4gVar = (j4g) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    if (j4gVar != null) {
                        if (j4gVar instanceof h4g) {
                            z1u z1uVar2 = hbgVar.j;
                            long j = j4gVar.f15883a;
                            yag yagVar3 = yag.f42295a;
                            Calendar calendar3 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                            calendar3.setTimeInMillis(j);
                            c5g c5gVar2 = new c5g(calendar3.get(1), calendar3.get(2), calendar3.get(5), calendar3.get(5), yagVar3, false);
                            this.k = null;
                            this.j = true;
                            if (z1uVar2.a(c5gVar2, this) == wneVar11) {
                                return wneVar11;
                            }
                        } else if (j4gVar instanceof i4g) {
                            hbgVar.C(2);
                        }
                        return Unit.f46060a;
                    }
                    t9f.b();
                    return null;
                }
                if (!z12) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                hbgVar.C(0);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new w48((kwj) this.k, b3));
                    yy0 yy0Var = new yy0((pz40) obj2, b2);
                    this.j = true;
                    if (vsg0VarV.c(yy0Var, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                xqj0 xqj0Var = (xqj0) this.k;
                wne wneVar13 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    int i2 = dvh.z;
                    if (((dvh) obj2).N(xqj0Var, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                x1j x1jVar = (x1j) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    v1j v1jVar = x1jVar instanceof v1j ? (v1j) x1jVar : null;
                    if (v1jVar != null) {
                        j2j j2jVar = (j2j) obj2;
                        if (v1jVar.f36633a) {
                            qoj0 qoj0Var2 = j2jVar.y;
                            this.k = null;
                            this.j = true;
                            if (qoj0Var2.a(f2j.f8813a, this) == wneVar14) {
                                return wneVar14;
                            }
                        }
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    p7m0 p7m0Var = ((o6j) this.k).k;
                    this.j = true;
                    p7m0Var.getClass();
                    p7m0Var.o(null, (l6j) obj2);
                    if (Unit.f46060a == wneVar15) {
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
                    p7m0 p7m0Var2 = ((v6j) this.k).e;
                    this.j = true;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, (t6j) obj2);
                    if (Unit.f46060a == wneVar16) {
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
                    p7m0 p7m0Var3 = ((f7j) this.k).h;
                    this.j = true;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, (d7j) obj2);
                    if (Unit.f46060a == wneVar17) {
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
                wne wneVar18 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    p7m0 p7m0Var4 = ((o7j) this.k).g;
                    this.j = true;
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, (m7j) obj2);
                    if (Unit.f46060a == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    acj acjVar = (acj) this.k;
                    this.j = true;
                    if (yaj.f42301a.f((List) obj2, acjVar, this) == wneVar19) {
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
                if (z21) {
                    if (z21) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                Function2 function2 = (Function2) this.k;
                Object obj4 = ((naj) obj2).b;
                this.j = true;
                Object objInvoke = function2.invoke(obj4, this);
                return objInvoke == wneVar20 ? wneVar20 : objInvoke;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    u340 u340Var = (u340) this.k;
                    this.j = true;
                    if (((ncj) obj2).d(u340Var, this) == wneVar21) {
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
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                if (!this.j) {
                    DateRangeModel dateRangeModel = new DateRangeModel(null, null);
                    jej jejVar = (jej) this.k;
                    jejVar.getClass();
                    jejVar.f.setValue(dateRangeModel);
                    ((Function1) obj2).invoke(dateRangeModel);
                }
                return Unit.f46060a;
            case 22:
                iij iijVar = (iij) this.k;
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    znt zntVar = (znt) iijVar.c;
                    this.j = true;
                    objD = zntVar.f44690a.D(this);
                    if (objD == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD = obj;
                }
                qjj.W(jiu0.a(iijVar.s()), ((mne) iijVar.e).b, null, new ys8(((Number) objD).longValue() == 0, (Object) iijVar, obj2, (yje) null, (byte) 2), 2);
                return Unit.f46060a;
            case 23:
                c3j0 c3j0Var = (c3j0) obj2;
                long j2 = c3j0Var.f3678a;
                etj etjVar = (etj) this.k;
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    ArrayList arrayListN0 = CollectionsKt.N0(etjVar.f8378a.f());
                    Iterator it3 = arrayListN0.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            Long l = ((usj) next).f36214a;
                            if (l != null && l.longValue() == j2) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    usj usjVar = (usj) next;
                    if (usjVar != null) {
                        arrayListN0.remove(usjVar);
                    }
                    arrayListN0.add(new usj(Long.valueOf(j2), Double.valueOf(c3j0Var.b)));
                    ali aliVar = etjVar.f8378a;
                    this.j = true;
                    vwb0 vwb0Var = (vwb0) aliVar.f1068a;
                    vby vbyVar = (vby) aliVar.b;
                    vbyVar.getClass();
                    vwb0Var.h("USER_DEFAULT_BET_SUM_PREF_KEY", vbyVar.d(new zw3(usj.Companion.serializer(), (byte) 0), arrayListN0));
                    p7m0 p7m0Var5 = (p7m0) aliVar.c;
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, arrayListN0);
                    Unit unit = Unit.f46060a;
                    wne wneVar25 = wne.f39444a;
                    if (unit == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar26 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    wtj wtjVar = (wtj) this.k;
                    g050 g050Var = wtjVar.c;
                    ov2 ov2Var = wtjVar.b;
                    this.j = true;
                    g050Var.getClass();
                    if (d5c.J(this, new rcf(c050.b, g050Var, (ic1) obj2, ov2Var, null, (byte) 2)) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar27 = wne.f39444a;
                boolean z26 = this.j;
                if (z26) {
                    if (z26) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                oot0 oot0Var = oot0.f25610a;
                jzj jzjVarJ = ((rzj) this.k).n().j((List) obj2);
                this.j = true;
                Object objQ2 = ((odd) jzjVarJ).q(this);
                return objQ2 == wneVar27 ? wneVar27 : objQ2;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jbk jbkVar = (jbk) this.k;
                wne wneVar28 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    mpi0 mpi0Var = jbkVar.d;
                    this.j = true;
                    pzu pzuVar = mpi0Var.f22182a;
                    Object objE = ((kuz) ((rcz) ((abu) pzuVar.f27863a).c).invoke()).e(((btt0) pzuVar.e).a(), ((knf0) pzuVar.f).c(), new xmz(((pmz) obj2).f27261a ? 1 : 0), this);
                    if (objE != wneVar28) {
                        objE = Unit.f46060a;
                    }
                    if (objE != wneVar28) {
                        objE = Unit.f46060a;
                    }
                    if (objE != wneVar28) {
                        objE = Unit.f46060a;
                    }
                    if (objE == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var = jbkVar.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                xtk xtkVar2 = (xtk) obj2;
                wne wneVar29 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    es esVar = xtkVar2.e;
                    CyberGamesPage cyberGamesPage = xtkVar2.b.f46555a;
                    this.k = xtkVar2;
                    this.j = true;
                    objQ = esVar.q(cyberGamesPage, this);
                    if (objQ == wneVar29) {
                        return wneVar29;
                    }
                    xtkVar = xtkVar2;
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xtkVar = (xtk) this.k;
                    z1x.P(obj);
                    objQ = obj;
                }
                xtkVar.n = (List) objQ;
                xtkVar2.z();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                guk gukVar = (guk) this.k;
                p7m0 p7m0Var6 = gukVar.h;
                wne wneVar30 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(500L, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                String str = (String) obj2;
                do {
                    value = p7m0Var6.getValue();
                } while (!p7m0Var6.m(value, nuk.a((nuk) value, null, str, 5)));
                if (((nuk) p7m0Var6.getValue()).b.length() > 0) {
                    dq00 dq00Var = gukVar.f;
                    wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                    String str2 = ((nuk) p7m0Var6.getValue()).b;
                    ((yo4) dq00Var.b).n("medal_table_bottom", str2);
                    ((zr1) dq00Var.c).r("medal_table_bottom", str2);
                }
                return Unit.f46060a;
            default:
                wne wneVar31 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    this.j = true;
                    if (((l0l) this.k).e.f((zy5) obj2, this) == wneVar31) {
                        return wneVar31;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1f(rzj rzjVar, yje yjeVar, List list) {
        super(2, yjeVar);
        this.i = (byte) 25;
        oot0 oot0Var = oot0.f25610a;
        this.k = rzjVar;
        this.l = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1f(dnq dnqVar, clz clzVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1f(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1f(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1f(boolean z, jej jejVar, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        this.j = z;
        this.k = jejVar;
        this.l = function1;
    }
}

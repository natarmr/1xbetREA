package a;

import android.view.View;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class n7t0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7t0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                n7t0 n7t0Var = new n7t0((kmq) obj2, yjeVar, (byte) 0);
                n7t0Var.k = obj;
                return n7t0Var;
            case 1:
                return new n7t0((wbt0) this.k, (Date) obj2, yjeVar, (byte) 1);
            case 2:
                return new n7t0((jdt0) this.k, (Date) obj2, yjeVar, (byte) 2);
            case 3:
                return new n7t0((Function1) this.k, (odd) obj2, yjeVar, (byte) 3);
            case 4:
                return new n7t0((sot0) this.k, (ArrayList) obj2, yjeVar, (byte) 4);
            case 5:
                return new n7t0((i9u0) this.k, (String) obj2, yjeVar, (byte) 5);
            case 6:
                return new n7t0((abu0) obj2, yjeVar, (byte) 6);
            case 7:
                return new n7t0((p7m0) this.k, (jnu0) obj2, yjeVar, (byte) 7);
            case 8:
                n7t0 n7t0Var2 = new n7t0((nru0) obj2, yjeVar, (byte) 8);
                n7t0Var2.k = obj;
                return n7t0Var2;
            case 9:
                n7t0 n7t0Var3 = new n7t0((dyu0) obj2, yjeVar, (byte) 9);
                n7t0Var3.k = obj;
                return n7t0Var3;
            case 10:
                return new n7t0((h2v0) this.k, (String) obj2, yjeVar, (byte) 10);
            case 11:
                n7t0 n7t0Var4 = new n7t0((i2v0) obj2, yjeVar, (byte) 11);
                n7t0Var4.k = obj;
                return n7t0Var4;
            case 12:
                return new n7t0((i2v0) this.k, (String) obj2, yjeVar, (byte) 12);
            case 13:
                return new n7t0((c4v0) obj2, yjeVar, (byte) 13);
            case 14:
                return new n7t0((d7v0) this.k, (a7v0) obj2, yjeVar, (byte) 14);
            case 15:
                return new n7t0((d7v0) this.k, (b7v0) obj2, yjeVar, (byte) 15);
            case 16:
                return new n7t0((d7v0) this.k, (u6v0) obj2, yjeVar, (byte) 16);
            case 17:
                return new n7t0((fge0) this.k, (View) obj2, yjeVar, (byte) 17);
            case 18:
                n7t0 n7t0Var5 = new n7t0((emv0) obj2, yjeVar, (byte) 18);
                n7t0Var5.k = obj;
                return n7t0Var5;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new n7t0((l7m0) this.k, (ywv0) obj2, yjeVar, (byte) 19);
            case 20:
                return new n7t0((vkr0) this.k, (kuv0) obj2, yjeVar, (byte) 20);
            case 21:
                n7t0 n7t0Var6 = new n7t0((vkr0) obj2, yjeVar, (byte) 21);
                n7t0Var6.k = obj;
                return n7t0Var6;
            case 22:
                return new n7t0((oxv0) this.k, (rxv0) obj2, yjeVar, (byte) 22);
            case 23:
                n7t0 n7t0Var7 = new n7t0((oxv0) obj2, yjeVar, (byte) 23);
                n7t0Var7.k = obj;
                return n7t0Var7;
            case 24:
                return new n7t0((rzv0) this.k, (String) obj2, yjeVar, (byte) 24);
            default:
                return new n7t0((a4w0) this.k, (a4w0) obj2, yjeVar, (byte) 25);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((n7t0) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((n7t0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((n7t0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((n7t0) create((l2v0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((n7t0) create((xqj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((n7t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v60, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v63, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        abu0 abu0Var;
        bby bbyVar;
        p7m0 p7m0Var;
        Object objF;
        Object value;
        ?? arrayList;
        byte b = this.i;
        byte b2 = 22;
        int i = 0;
        Object obj2 = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                Object obj3 = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (((kmq) obj2).a(obj3, this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    pmi0 pmi0Var = ((wbt0) this.k).y;
                    this.j = true;
                    ((eat0) ((epi0) pmi0Var.f27236a).b).f7486a.o(null, (Date) obj2);
                    if (Unit.f46060a == wneVar2) {
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
                    pmi0 pmi0Var2 = ((jdt0) this.k).C;
                    this.j = true;
                    ((eat0) ((epi0) pmi0Var2.f27236a).b).f7486a.o(null, (Date) obj2);
                    if (Unit.f46060a == wneVar3) {
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
                    Function1 function1 = (Function1) this.k;
                    this.j = true;
                    obj = function1.invoke(this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                vzb.g0((jzj) obj, (odd) obj2);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    sot0 sot0Var = (sot0) this.k;
                    this.j = true;
                    obj = sot0Var.invoke(this);
                    if (obj == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ArrayList arrayList2 = (ArrayList) obj2;
                for (Object obj4 : (Iterable) obj) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    vzb.g0((jzj) obj4, (ndd) arrayList2.get(i));
                    i = i2;
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    qoj0 qoj0Var = ((i9u0) this.k).h;
                    d9u0 d9u0Var = new d9u0((String) obj2);
                    this.j = true;
                    if (qoj0Var.a(d9u0Var, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    abu0 abu0Var2 = (abu0) obj2;
                    this.k = abu0Var2;
                    this.j = true;
                    List list = abu0.E;
                    Object objW = abu0Var2.w(true, this);
                    if (objW == wneVar7) {
                        return wneVar7;
                    }
                    obj = objW;
                    abu0Var = abu0Var2;
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    abu0Var = (abu0) this.k;
                    z1x.P(obj);
                }
                cau0 cau0Var = ((m2c0) obj).e0;
                List list2 = abu0.E;
                p7m0 p7m0Var2 = abu0Var.t;
                p7m0Var2.getClass();
                p7m0Var2.o(null, cau0Var);
                if (!abu0.E.contains(p7m0Var2.getValue()) && (bbyVar = abu0Var.v) != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (z8) {
                    if (z8) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                p7m0 p7m0Var3 = (p7m0) this.k;
                x6s0 x6s0Var = new x6s0((jnu0) obj2, (byte) 26);
                this.j = true;
                p7m0Var3.c(x6s0Var, this);
                return wneVar8;
            case 8:
                kmq kmqVar = (kmq) this.k;
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    List list3 = (List) ((nru0) obj2).b.b.b();
                    if (list3 != null) {
                        this.k = null;
                        this.j = true;
                        if (kmqVar.a(list3, this) == wneVar9) {
                            return wneVar9;
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
            case 9:
                e7a e7aVar = (e7a) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    if (e7aVar instanceof d7a) {
                        rwj rwjVar = tvk.f34603a;
                        vs10 vs10Var = ys10.f43147a;
                        rtq0 rtq0Var = new rtq0((dyu0) obj2, e7aVar, yjeVar, b2);
                        this.k = null;
                        this.j = true;
                        if (qjj.d0(vs10Var, rtq0Var, this) == wneVar10) {
                            return wneVar10;
                        }
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                Object obj5 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    h2v0 h2v0Var = (h2v0) this.k;
                    pyu pyuVar = h2v0Var.c;
                    this.j = true;
                    pyuVar.getClass();
                    rwj rwjVar2 = tvk.f34603a;
                    Object objD0 = qjj.d0(ys10.f43147a, new yd60((Object) pyuVar, (Object) h2v0Var.b.c, obj2, (yje) null, (byte) 2), this);
                    if (objD0 != obj5) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 == obj5) {
                        return obj5;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                l2v0 l2v0Var = (l2v0) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    qoj0 qoj0Var2 = ((i2v0) obj2).d;
                    this.k = null;
                    this.j = true;
                    if (qoj0Var2.a(l2v0Var, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                Object obj6 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    i2v0 i2v0Var = (i2v0) this.k;
                    pyu pyuVar2 = i2v0Var.c;
                    this.j = true;
                    pyuVar2.getClass();
                    rwj rwjVar3 = tvk.f34603a;
                    Object objD1 = qjj.d0(ys10.f43147a, new yd60((Object) pyuVar2, (Object) i2v0Var.b, obj2, (yje) null, (byte) 2), this);
                    if (objD1 != obj6) {
                        objD1 = Unit.f46060a;
                    }
                    if (objD1 == obj6) {
                        return obj6;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar12 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    c4v0 c4v0Var = (c4v0) obj2;
                    p7m0 p7m0Var4 = c4v0Var.g;
                    reu reuVar = c4v0Var.c;
                    String str = c4v0Var.i;
                    this.k = p7m0Var4;
                    this.j = true;
                    Object objG = reuVar.g(str, this);
                    if (objG == wneVar12) {
                        return wneVar12;
                    }
                    obj = objG;
                    p7m0Var = p7m0Var4;
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7m0Var = (p7m0) this.k;
                    z1x.P(obj);
                }
                z3v0 z3v0Var = new z3v0((String) obj);
                p7m0Var.getClass();
                p7m0Var.o(null, z3v0Var);
                return Unit.f46060a;
            case 14:
                wne wneVar13 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    p7m0 p7m0Var5 = ((d7v0) this.k).r;
                    this.j = true;
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, (a7v0) obj2);
                    if (Unit.f46060a == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar14 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    this.j = true;
                    if (((d7v0) this.k).q.a((b7v0) obj2, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar15 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    p7m0 p7m0Var6 = ((d7v0) this.k).s;
                    this.j = true;
                    p7m0Var6.getClass();
                    p7m0Var6.o(null, (u6v0) obj2);
                    if (Unit.f46060a == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                fge0 fge0Var = (fge0) this.k;
                View view = (View) obj2;
                Object obj7 = wne.f39444a;
                boolean z18 = this.j;
                try {
                    if (!z18) {
                        z1x.P(obj);
                        this.j = true;
                        Object objL = ntb.L(fge0Var.u, new st20(2, yjeVar, b2), this);
                        if (objL != obj7) {
                            objL = Unit.f46060a;
                        }
                        if (objL == obj7) {
                            return obj7;
                        }
                    } else {
                        if (!z18) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    if (sjv0.a(view) == fge0Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    return Unit.f46060a;
                } catch (Throwable th) {
                    if (sjv0.a(view) != fge0Var) {
                        throw th;
                    }
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    throw th;
                }
            case 18:
                xqj0 xqj0Var = (xqj0) this.k;
                wne wneVar16 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    int i3 = emv0.A;
                    if (((emv0) obj2).N(xqj0Var, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar17 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    if (!((Boolean) ((l7m0) this.k).getValue()).booleanValue()) {
                        vkr0 vkr0Var = ((ywv0) obj2).m;
                        this.j = true;
                        t33 t33Var = (t33) vkr0Var.f;
                        float fFloatValue = ((Number) t33Var.d()).floatValue();
                        ((trm0) vkr0Var.d).getClass();
                        if (fFloatValue == 0.0f || (objF = t33Var.f(this, new Float(0.0f))) != wneVar17) {
                            objF = Unit.f46060a;
                        }
                        if (objF == wneVar17) {
                            return wneVar17;
                        }
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar18 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    vkr0 vkr0Var2 = (vkr0) this.k;
                    float f = ((juv0) ((kuv0) obj2)).f17179a;
                    this.j = true;
                    if (vkr0Var2.B(f, this) == wneVar18) {
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
            case 21:
                vne vneVar = (vne) this.k;
                wne wneVar19 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    mie0 mie0VarJ = ohs0.j(obj);
                    vkr0 vkr0Var3 = (vkr0) obj2;
                    hcp0 hcp0Var = (hcp0) vkr0Var3.e;
                    kh1 kh1Var = new kh1(mie0VarJ, vkr0Var3, yjeVar, (byte) 18);
                    this.k = null;
                    this.j = true;
                    if (hcp0Var.t(vneVar, kh1Var, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar20 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    oxv0 oxv0Var = (oxv0) this.k;
                    float f2 = ((qxv0) ((rxv0) obj2)).f29508a;
                    this.j = true;
                    if (oxv0Var.c(f2, this) == wneVar20) {
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
            case 23:
                vne vneVar2 = (vne) this.k;
                wne wneVar21 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    mie0 mie0VarJ2 = ohs0.j(obj);
                    oxv0 oxv0Var2 = (oxv0) obj2;
                    hcp0 hcp0Var2 = oxv0Var2.j;
                    kh1 kh1Var2 = new kh1(mie0VarJ2, oxv0Var2, yjeVar, (byte) 19);
                    this.k = null;
                    this.j = true;
                    if (hcp0Var2.t(vneVar2, kh1Var2, this) == wneVar21) {
                        return wneVar21;
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
                String str2 = (String) obj2;
                rzv0 rzv0Var = (rzv0) this.k;
                wne wneVar22 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    yuu yuuVar = rzv0Var.x;
                    u270 u270Var = new u270(str2, null, null, null);
                    this.j = true;
                    obj = yuuVar.o(u270Var, this);
                    if (obj == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list4 = (List) obj;
                if (((bzv0) rzv0Var.D()).f3492a.equals(str2)) {
                    p7m0 p7m0Var7 = rzv0Var.i.f25029a;
                    do {
                        value = p7m0Var7.getValue();
                        value.getClass();
                    } while (!p7m0Var7.m(value, bzv0.a((bzv0) value, null, null, null, false, list4, false, 15)));
                }
                return Unit.f46060a;
            default:
                wne wneVar23 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    w4p0 w4p0Var = ((a4w0) this.k).f243a;
                    this.j = true;
                    obj = ((m3w0) ((lkr0) w4p0Var.b).invoke()).a(this);
                    if (obj == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                u3w0 u3w0Var = (u3w0) obj;
                u3w0Var.getClass();
                List list5 = u3w0Var.f35017a;
                if (list5 != null) {
                    ArrayList<t3w0> arrayList3 = new ArrayList();
                    for (Object obj8 : list5) {
                        t3w0 t3w0Var = (t3w0) obj8;
                        Integer num = t3w0Var.d;
                        if (num == null || num.intValue() != 1) {
                            List list6 = t3w0Var.c;
                            if (list6 != null) {
                                ArrayList arrayList4 = new ArrayList(r3d.q(list6, 10));
                                Iterator it = list6.iterator();
                                while (it.hasNext()) {
                                    String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    arrayList4.add(lowerCase);
                                }
                                if (arrayList4.contains("android")) {
                                    arrayList3.add(obj8);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList(r3d.q(arrayList3, 10));
                    for (t3w0 t3w0Var2 : arrayList3) {
                        t3w0Var2.getClass();
                        Integer num2 = t3w0Var2.f33288a;
                        long jIntValue = num2 != null ? num2.intValue() : 0L;
                        Integer num3 = t3w0Var2.b;
                        int iIntValue = num3 != null ? num3.intValue() : 0;
                        Integer num4 = t3w0Var2.d;
                        int iIntValue2 = num4 != null ? num4.intValue() : 0;
                        List list7 = t3w0Var2.c;
                        if (list7 == null) {
                            list7 = iun.f15405a;
                        }
                        arrayList.add(new n3w0(iIntValue, iIntValue2, jIntValue, list7));
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                o3w0 o3w0Var = new o3w0(arrayList);
                ((a4w0) obj2).c = o3w0Var;
                return o3w0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7t0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}

package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class wn2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.o = obj5;
    }

    private final Object l(Object obj) {
        sd60 sd60Var;
        k050 k050Var;
        lk80 lk80Var;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            sd60 sd60Var2 = (sd60) this.n;
            k050 k050Var2 = (k050) sd60Var2.g;
            lk80 lk80Var2 = (lk80) this.o;
            this.k = k050Var2;
            this.l = lk80Var2;
            this.m = sd60Var2;
            this.j = true;
            if (k050Var2.d(this) == wneVar) {
                return wneVar;
            }
            sd60Var = sd60Var2;
            k050Var = k050Var2;
            lk80Var = lk80Var2;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sd60Var = (sd60) this.m;
            lk80Var = (lk80) this.l;
            k050Var = (k050) this.k;
            z1x.P(obj);
        }
        try {
            boolean z2 = lk80Var == lk80.c;
            if (z2) {
                bby bbyVar = (bby) sd60Var.i;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                sd60Var.i = null;
            }
            bby bbyVar2 = (bby) sd60Var.i;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                if (!z2) {
                    bm80 bm80Var = (bm80) ((p7m0) sd60Var.h).getValue();
                    if (bm80Var instanceof vl80) {
                        if (!((vl80) bm80Var).b) {
                        }
                    }
                }
                sd60Var.i = sac.V((bvc) sd60Var.c, null, null, (lne) sd60Var.b, new er60(sd60Var, lk80Var, yjeVar, (byte) 12), 11);
                return Unit.f46060a;
            }
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014d A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:69:0x0149, B:71:0x014d, B:74:0x0152, B:76:0x0158), top: B:111:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0158 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:69:0x0149, B:71:0x014d, B:74:0x0152, B:76:0x0158), top: B:111:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x017f A[Catch: all -> 0x0182, TryCatch #2 {all -> 0x0182, blocks: (B:87:0x017b, B:89:0x017f, B:92:0x0184, B:94:0x018a), top: B:113:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:94:0x018a A[Catch: all -> 0x0182, TRY_LEAVE, TryCatch #2 {all -> 0x0182, blocks: (B:87:0x017b, B:89:0x017f, B:92:0x0184, B:94:0x018a), top: B:113:0x017b }] */
    private final Object m(Object obj) throws Throwable {
        bby bbyVarR;
        p7m0 p7m0Var;
        ci90 ci90Var;
        ci90 ci90Var2;
        jk8 jk8Var;
        Throwable th;
        List listH;
        zfe0 zfe0Var;
        fge0 fge0Var;
        fge0 fge0Var2;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        if (z) {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jk8Var = (jk8) this.k;
            bbyVarR = (bby) this.l;
            try {
                z1x.P(obj);
                jk8Var.a();
                fge0Var2 = (fge0) this.m;
                synchronized (fge0Var2.c) {
                    try {
                        if (fge0Var2.d == bbyVarR) {
                            fge0Var2.d = null;
                        }
                        if (fge0Var2.C() != null) {
                            ykd.a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                p7m0 p7m0Var2 = fge0.z;
                c9x.I(((fge0) this.m).y);
                return Unit.f46060a;
            } catch (Throwable th3) {
                th = th3;
                jk8Var.a();
                fge0Var = (fge0) this.m;
                synchronized (fge0Var.c) {
                    try {
                        if (fge0Var.d == bbyVarR) {
                            fge0Var.d = null;
                        }
                        if (fge0Var.C() != null) {
                            ykd.a("called outside of runRecomposeAndApplyChanges");
                        }
                        p7m0 p7m0Var3 = fge0.z;
                        c9x.I(((fge0) this.m).y);
                        throw th;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
        z1x.P(obj);
        bbyVarR = zvw.R(((vne) this.l).getCoroutineContext());
        fge0 fge0Var3 = (fge0) this.m;
        p7m0 p7m0Var4 = fge0.z;
        synchronized (fge0Var3.c) {
            Throwable th5 = fge0Var3.e;
            if (th5 != null) {
                throw th5;
            }
            if (((dge0) fge0Var3.u.getValue()).compareTo(dge0.b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (fge0Var3.d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            fge0Var3.d = bbyVarR;
            if (fge0Var3.C() != null) {
                ykd.a("called outside of runRecomposeAndApplyChanges");
            }
        }
        nrc0 nrc0Var = new nrc0((fge0) this.m, (byte) 26);
        xfk0.b(xfk0.f40794a);
        synchronized (xfk0.c) {
            xfk0.h = CollectionsKt.r0(xfk0.h, nrc0Var);
        }
        jk8 jk8Var2 = new jk8(nrc0Var, (byte) 3);
        cge0 cge0Var = ((fge0) this.m).y;
        do {
            p7m0Var = fge0.z;
            ci90Var = (ci90) p7m0Var.getValue();
            jtv jtvVar = jtv.h;
            eh90 eh90Var = ci90Var.d;
            if (eh90Var.containsKey(cge0Var)) {
                ci90Var2 = ci90Var;
            } else if (ci90Var.isEmpty()) {
                ci90Var2 = new ci90(cge0Var, cge0Var, eh90Var.h(cge0Var, new zb00(jtvVar, jtvVar)));
            } else {
                Object obj2 = ci90Var.c;
                Object obj3 = eh90Var.get(obj2);
                obj3.getClass();
                ci90Var2 = new ci90(ci90Var.b, cge0Var, eh90Var.h(obj2, new zb00(((zb00) obj3).f44091a, cge0Var)).h(cge0Var, new zb00(obj2, jtvVar)));
            }
            if (ci90Var == ci90Var2) {
                break;
            }
        } while (!p7m0Var.m(ci90Var, ci90Var2));
        try {
            fge0 fge0Var4 = (fge0) this.m;
            synchronized (fge0Var4.c) {
                listH = fge0Var4.H();
            }
            int size = listH.size();
            for (int i = 0; i < size; i++) {
                for (Object obj4 : ((tld) listH.get(i)).f.c) {
                    yfe0 yfe0Var = obj4 instanceof yfe0 ? (yfe0) obj4 : null;
                    if (yfe0Var != null && (zfe0Var = yfe0Var.f42538a) != null) {
                        zfe0Var.e(yfe0Var, null);
                    }
                }
            }
            g4e0 g4e0Var = new g4e0(this.n, this.o, yjeVar, (byte) 13);
            this.l = bbyVarR;
            this.k = jk8Var2;
            this.j = true;
            if (d5c.J(this, g4e0Var) == wneVar) {
                return wneVar;
            }
            jk8Var = jk8Var2;
            jk8Var.a();
            fge0Var2 = (fge0) this.m;
            synchronized (fge0Var2.c) {
                if (fge0Var2.d == bbyVarR) {
                    fge0Var2.d = null;
                }
                if (fge0Var2.C() != null) {
                    ykd.a("called outside of runRecomposeAndApplyChanges");
                }
                p7m0 p7m0Var5 = fge0.z;
                c9x.I(((fge0) this.m).y);
                return Unit.f46060a;
            }
        } catch (Throwable th6) {
            jk8Var = jk8Var2;
            th = th6;
            jk8Var.a();
            fge0Var = (fge0) this.m;
            synchronized (fge0Var.c) {
                if (fge0Var.d == bbyVarR) {
                    fge0Var.d = null;
                }
                if (fge0Var.C() != null) {
                    ykd.a("called outside of runRecomposeAndApplyChanges");
                }
            }
            p7m0 p7m0Var6 = fge0.z;
            c9x.I(((fge0) this.m).y);
            throw th;
        }
    }

    private final Object o(Object obj) {
        lie0 lie0Var = (lie0) this.m;
        eze0 eze0Var = (eze0) this.l;
        xte0 xte0Var = eze0Var.j0;
        e7a e7aVar = (e7a) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            if (e7aVar != null) {
                if (e7aVar instanceof c7a) {
                    q7f0 q7f0Var = ((aye0) eze0Var.D()).h.M;
                    if (q7f0Var == null) {
                        q7f0Var = q7f0.FULL;
                    }
                    xte0Var.o(q7f0Var, lie0Var.f20100a);
                    fs fsVar = (fs) this.n;
                    this.k = null;
                    this.j = true;
                    if (fsVar.invoke(e7aVar, this) == wneVar) {
                        return wneVar;
                    }
                } else if (e7aVar instanceof d7a) {
                    q7f0 q7f0Var2 = ((aye0) eze0Var.D()).h.M;
                    if (q7f0Var2 == null) {
                        q7f0Var2 = q7f0.FULL;
                    }
                    xte0Var.f(q7f0Var2);
                    lie0Var.f20100a = System.currentTimeMillis();
                    ((eye0) this.o).invoke(e7aVar);
                }
            }
            t9f.b();
            return null;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        lie0 lie0Var = (lie0) this.m;
        x5f0 x5f0Var = (x5f0) this.l;
        xte0 xte0Var = x5f0Var.i0;
        e7a e7aVar = (e7a) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            if (e7aVar != null) {
                if (e7aVar instanceof c7a) {
                    q7f0 q7f0Var = ((u4f0) x5f0Var.D()).g.M;
                    if (q7f0Var == null) {
                        q7f0Var = q7f0.FULL;
                    }
                    xte0Var.o(q7f0Var, lie0Var.f20100a);
                    fs fsVar = (fs) this.n;
                    this.k = null;
                    this.j = true;
                    if (fsVar.invoke(e7aVar, this) == wneVar) {
                        return wneVar;
                    }
                } else if (e7aVar instanceof d7a) {
                    q7f0 q7f0Var2 = ((u4f0) x5f0Var.D()).g.M;
                    if (q7f0Var2 == null) {
                        q7f0Var2 = q7f0.FULL;
                    }
                    xte0Var.f(q7f0Var2);
                    lie0Var.f20100a = System.currentTimeMillis();
                    ((y4f0) this.o).invoke(e7aVar);
                }
            }
            t9f.b();
            return null;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        return Unit.f46060a;
    }

    private final Object s(Object obj) {
        lie0 lie0Var = (lie0) this.m;
        ocf0 ocf0Var = (ocf0) this.l;
        xte0 xte0Var = ocf0Var.i0;
        e7a e7aVar = (e7a) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            if (e7aVar != null) {
                if (e7aVar instanceof c7a) {
                    q7f0 q7f0Var = ((mbf0) ocf0Var.D()).g.M;
                    if (q7f0Var == null) {
                        q7f0Var = q7f0.FULL;
                    }
                    xte0Var.o(q7f0Var, lie0Var.f20100a);
                    fs fsVar = (fs) this.n;
                    this.k = null;
                    this.j = true;
                    if (fsVar.invoke(e7aVar, this) == wneVar) {
                        return wneVar;
                    }
                } else if (e7aVar instanceof d7a) {
                    q7f0 q7f0Var2 = ((mbf0) ocf0Var.D()).g.M;
                    if (q7f0Var2 == null) {
                        q7f0Var2 = q7f0.FULL;
                    }
                    xte0Var.f(q7f0Var2);
                    lie0Var.f20100a = System.currentTimeMillis();
                    ((pbf0) this.o).invoke(e7aVar);
                }
            }
            t9f.b();
            return null;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        return Unit.f46060a;
    }

    private final Object t(Object obj) {
        String str = (String) this.l;
        nyf0 nyf0Var = (nyf0) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            vqb vqbVar = nyf0Var.w;
            this.j = true;
            if (vqbVar.f37848a.b0(str, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        String str2 = (String) this.m;
        String str3 = (String) this.n;
        we50 we50Var = (we50) this.o;
        i8i.D("option", "phone", nyf0Var.n.f31532a, "login_lost_pass");
        drm0 drm0Var = nyf0Var.f;
        int i = nyf0Var.C;
        drm0Var.getClass();
        d190 d190Var = (d190) ((g090) drm0Var.f6568a).f10448a;
        d190Var.getClass();
        d190Var.d = i;
        d190Var.c = str3;
        nyf0Var.D = sac.V(jiu0.a(nyf0Var), new cyf0(nyf0Var, (byte) 5), new tie0(nyf0Var, (byte) 27), nyf0Var.q.b, new uu3(nyf0Var, str, str2, str3, we50Var, (yje) null), 8);
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new wn2(this.n, obj2, yjeVar, (byte) 0);
            case 1:
                wn2 wn2Var = new wn2(this.l, this.m, this.n, obj2, yjeVar, (byte) 1);
                wn2Var.k = obj;
                return wn2Var;
            case 2:
                return new wn2((ij3) obj2, yjeVar, (byte) 2);
            case 3:
                return new wn2((w6k) this.k, (vhv0) this.l, (vhv0) this.m, (vhv0) this.n, (ApplicationActivity) obj2, yjeVar, (byte) 3);
            case 4:
                return new wn2((rv3) this.k, (String) this.l, (String) this.m, (String) this.n, (ov3) obj2, yjeVar, (byte) 4);
            case 5:
                wn2 wn2Var2 = new wn2((ft4) this.m, (Request) this.n, (String) this.l, (ckk0) obj2, yjeVar);
                wn2Var2.k = obj;
                return wn2Var2;
            case 6:
                return new wn2((i3t0) obj2, (String) this.m, yjeVar, (byte) 6);
            case 7:
                return new wn2((i3t0) obj2, (String) this.m, yjeVar, (byte) 7);
            case 8:
                wn2 wn2Var3 = new wn2((p5a) this.m, yjeVar, (w46) this.n, (String) this.l, (lie0) obj2, (byte) 8);
                wn2Var3.k = obj;
                return wn2Var3;
            case 9:
                return new wn2((byte) 9, yjeVar, (Serializable) this.n, this.m, obj2);
            case 10:
                return new wn2((xcz) this.k, (vne) this.l, (Function1) this.m, (xk80) this.n, (cgk0) obj2, yjeVar, (byte) 10);
            case 11:
                return new wn2((djz) this.k, (pz40) this.l, (o8q0) this.m, (k7q0) this.n, (k3x) obj2, yjeVar, (byte) 11);
            case 12:
                return new wn2((d39) this.k, (a8q0) this.l, (djz) this.m, (b9q0) this.n, (qe60) obj2, yjeVar, (byte) 12);
            case 13:
                return new wn2((wze) obj2, yjeVar, (byte) 13);
            case 14:
                wn2 wn2Var4 = new wn2(this.l, this.m, this.n, obj2, yjeVar, (byte) 14);
                wn2Var4.k = obj;
                return wn2Var4;
            case 15:
                return new wn2((f3j) obj2, yjeVar, (byte) 15);
            case 16:
                wn2 wn2Var5 = new wn2(this.n, obj2, yjeVar, (byte) 16);
                wn2Var5.m = obj;
                return wn2Var5;
            case 17:
                return new wn2((h620) obj2, yjeVar, (byte) 17);
            case 18:
                return new wn2(this.n, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new wn2((qg20) obj2, yjeVar, (byte) 19);
            case 20:
                return new wn2((bv70) obj2, yjeVar, (byte) 20);
            case 21:
                return new wn2(this.n, obj2, yjeVar, (byte) 21);
            case 22:
                return new wn2((o1x) this.k, (gbe0) this.l, (f7k0) this.m, (gqw0) this.n, (dyw) obj2, yjeVar, (byte) 22);
            case 23:
                wn2 wn2Var6 = new wn2((byte) 23, yjeVar, (ege0) this.n, (fge0) this.m, (qq40) obj2);
                wn2Var6.l = obj;
                return wn2Var6;
            case 24:
                wn2 wn2Var7 = new wn2(this.l, this.m, this.n, obj2, yjeVar, (byte) 24);
                wn2Var7.k = obj;
                return wn2Var7;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wn2 wn2Var8 = new wn2(this.l, this.m, this.n, obj2, yjeVar, (byte) 25);
                wn2Var8.k = obj;
                return wn2Var8;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wn2 wn2Var9 = new wn2(this.l, this.m, this.n, obj2, yjeVar, (byte) 26);
                wn2Var9.k = obj;
                return wn2Var9;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new wn2((nyf0) this.k, (String) this.l, (String) this.m, (String) this.n, (we50) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wn2 wn2Var10 = new wn2((p5a) this.m, yjeVar, (w46) this.n, (String) this.l, (lie0) obj2, (byte) 28);
                wn2Var10.k = obj;
                return wn2Var10;
            default:
                wn2 wn2Var11 = new wn2(this.l, this.m, this.n, obj2, yjeVar, (byte) 29);
                wn2Var11.k = obj;
                return wn2Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws zhi0, z080 {
        switch (this.i) {
            case 0:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 2:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wn2) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wn2) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wn2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((wn2) create((gzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((wn2) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((wn2) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((wn2) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((wn2) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((wn2) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:371:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:373:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:376:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:423:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:429:0x0b15  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x034b -> B:115:0x034f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x04d8 -> B:159:0x04aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x058f -> B:183:0x0569). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:372:0x09f2 -> B:374:0x09f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:376:0x0a01 -> B:375:0x09ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0257 -> B:81:0x025b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:371:0x09e2
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws a.zhi0, a.z080 {
        /*
            Method dump skipped, instruction units count: 2968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wn2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn2(ft4 ft4Var, Request request, String str, ckk0 ckk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.m = ft4Var;
        this.n = request;
        this.l = str;
        this.o = ckk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(p5a p5aVar, yje yjeVar, w46 w46Var, String str, lie0 lie0Var, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = p5aVar;
        this.n = w46Var;
        this.l = str;
        this.o = lie0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(i3t0 i3t0Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = i3t0Var;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(byte b, yje yjeVar, Serializable serializable, Object obj, Object obj2) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = serializable;
        this.o = obj2;
    }
}

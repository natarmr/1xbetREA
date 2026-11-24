package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_constructor.impl.makebet.domain.model.StepInputConfigModel;

/* JADX INFO: loaded from: classes3.dex */
public final class xo1 extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xo1(Object obj, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.m = obj;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0375  */
    /* JADX WARN: Code duplicated, block: B:111:0x0379  */
    /* JADX WARN: Code duplicated, block: B:113:0x037d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0395  */
    /* JADX WARN: Code duplicated, block: B:118:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c5  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object m9eVar;
        Long l;
        Set setP0;
        byte b = this.i;
        final byte b2 = 0;
        Long lValueOf = null;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                boolean z = this.j;
                sw00 sw00Var = (sw00) this.k;
                String str = (String) this.l;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                dp1 dp1Var = (dp1) obj2;
                int i = dp1.G;
                ocj ocjVar = dp1Var.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                while (true) {
                    Object value3 = p7m0Var.getValue();
                    value3.getClass();
                    ocj ocjVar2 = ocjVar;
                    p7m0 p7m0Var2 = p7m0Var;
                    sw00 sw00Var2 = sw00Var;
                    dp1 dp1Var2 = dp1Var;
                    if (p7m0Var2.m(value3, bo1.a((bo1) value3, str, null, null, null, false, null, sw00Var.f32897a, z, null, null, false, 0L, 1042430))) {
                        if (z) {
                            if (str.length() >= 3) {
                                dp1Var2.Q(true, sw00Var2.f32897a);
                            } else {
                                p7m0 p7m0Var3 = ocjVar2.f25029a;
                                do {
                                    value = p7m0Var3.getValue();
                                    value.getClass();
                                } while (!p7m0Var3.m(value, bo1.a((bo1) value, null, null, "", null, false, null, false, false, null, null, false, 0L, 1048571)));
                                dp1Var2.P(sw00Var2.f32897a, true);
                            }
                        } else if (str.length() < 3) {
                            p7m0 p7m0Var4 = ocjVar2.f25029a;
                            do {
                                value2 = p7m0Var4.getValue();
                                value2.getClass();
                            } while (!p7m0Var4.m(value2, bo1.a((bo1) value2, null, null, "", null, false, null, false, false, null, null, false, 0L, 1048571)));
                            dp1Var2.P(sw00Var2.f32897a, true);
                        } else if (((bo1) dp1Var2.D()).b instanceof r8h0) {
                            dp1Var2.P(sw00Var2.f32897a, true);
                        }
                        return str;
                    }
                    p7m0Var = p7m0Var2;
                    ocjVar = ocjVar2;
                    sw00Var = sw00Var2;
                    dp1Var = dp1Var2;
                }
                break;
            case 1:
                qom0 qom0Var = (qom0) this.k;
                boolean z2 = this.j;
                p9e p9eVar = (p9e) this.l;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                fae faeVar = (fae) obj2;
                n0o0 n0o0Var = faeVar.z;
                a8z a8zVar = faeVar.w;
                ctf0 ctf0Var = faeVar.m;
                p7m0 p7m0Var5 = faeVar.J;
                if (qom0Var instanceof pom0) {
                    Throwable th = ((pom0) qom0Var).f27336a;
                    if (th instanceof dxb) {
                        m9eVar = new l9e(ctf0Var.b.a(R.string.chat_is_unavailable, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.please_try_again_later, Arrays.copyOf(new Object[0], 0)));
                    } else {
                        boolean z3 = th instanceof wae;
                        if (z3) {
                            if (tx3.u(new Integer(((wae) th).f38821a), (Integer[]) a8zVar.getValue())) {
                                m9eVar = new l9e(ctf0Var.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.client_error_descr_in_chat, Arrays.copyOf(new Object[0], 0)));
                            } else if (th instanceof j7t0) {
                                m9eVar = new l9e(ctf0Var.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.client_error_descr_in_chat, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (th instanceof zhi0) {
                                    if (tx3.u(new Integer(((zhi0) th).f44396a), (Integer[]) a8zVar.getValue())) {
                                        m9eVar = new l9e(ctf0Var.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.client_error_descr_in_chat, Arrays.copyOf(new Object[0], 0)));
                                    }
                                }
                                if (z3) {
                                    m9eVar = new l9e(ctf0Var.b.a(R.string.server_error_title_in_chat, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.server_error_descr_in_chat, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    m9eVar = new m9e((ra10) n0o0Var.getValue());
                                }
                            }
                        } else if (th instanceof j7t0) {
                            m9eVar = new l9e(ctf0Var.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.client_error_descr_in_chat, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            if (th instanceof zhi0) {
                                if (tx3.u(new Integer(((zhi0) th).f44396a), (Integer[]) a8zVar.getValue())) {
                                    m9eVar = new l9e(ctf0Var.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.client_error_descr_in_chat, Arrays.copyOf(new Object[0], 0)));
                                }
                            }
                            if (z3) {
                                m9eVar = new l9e(ctf0Var.b.a(R.string.server_error_title_in_chat, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.server_error_descr_in_chat, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                m9eVar = new m9e((ra10) n0o0Var.getValue());
                            }
                        }
                    }
                } else if (!z2 && !(p9eVar instanceof n9e)) {
                    m9eVar = new m9e((ra10) n0o0Var.getValue());
                } else {
                    if (p9eVar instanceof n9e) {
                        return Unit.f46060a;
                    }
                    m9eVar = o9e.f24876a;
                }
                p7m0Var5.getClass();
                p7m0Var5.o(null, m9eVar);
                return Unit.f46060a;
            case 2:
                final xvm0 xvm0Var = (xvm0) this.k;
                js20 js20Var = (js20) this.l;
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                final spr sprVar = (spr) obj2;
                qnr qnrVar = (qnr) sprVar.D();
                long j = qnrVar.f29044a;
                long j2 = qnrVar.e;
                t3z t3zVar = qnrVar.i;
                u3z u3zVar = new u3z(j, t3zVar, j2);
                if (js20Var != null) {
                    boolean z5 = js20Var instanceof gs20;
                    if (z5 || (js20Var instanceof hs20)) {
                        l = null;
                    } else if (js20Var instanceof is20) {
                        l = new Long(((is20) js20Var).f15285a);
                    }
                    if (((qnr) sprVar.D()).N == null || ((qnr) sprVar.D()).O == null) {
                        sprVar.H(new ann(xvm0Var, js20Var, sprVar, (byte) 29));
                    } else if (!Intrinsics.d(l, ((qnr) sprVar.D()).g)) {
                        sprVar.H(new gup((Object) js20Var, (Object) sprVar, (byte) 17));
                        qnr qnrVar2 = (qnr) sprVar.D();
                        u3z u3zVar2 = new u3z(qnrVar2.f29044a, qnrVar2.i, qnrVar2.e);
                        if (!z5 && !(js20Var instanceof hs20)) {
                            if (!(js20Var instanceof is20)) {
                                t9f.b();
                                return null;
                            }
                            lValueOf = Long.valueOf(((is20) js20Var).f15285a);
                        }
                        sprVar.P(u3zVar2, lValueOf);
                    } else if (xvm0Var.getId() != ((qnr) sprVar.D()).f) {
                        if (z4 || l != null) {
                            final byte b3 = 1;
                            sprVar.H(new Function2() { // from class: a.cor
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    byte b4 = b3;
                                    spr sprVar2 = sprVar;
                                    switch (b4) {
                                        case 0:
                                            qnr qnrVar3 = (qnr) obj4;
                                            ((oyg0) obj3).getClass();
                                            qnrVar3.getClass();
                                            xvm0 xvm0Var2 = xvm0Var;
                                            qnr qnrVarA = qnr.a(qnrVar3, 0L, null, null, false, 0L, xvm0Var2.getId(), null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, xvm0Var2, null, null, null, null, null, null, null, false, null, false, -33, 524159);
                                            sprVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(qnrVarA.f));
                                            return qnrVarA;
                                        default:
                                            xvm0 xvm0Var3 = xvm0Var;
                                            qnr qnrVarA2 = qnr.a((qnr) obj4, 0L, null, null, false, 0L, xvm0Var3.getId(), null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, xvm0Var3, null, null, null, null, null, null, null, false, null, false, -33, 524159);
                                            sprVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(qnrVarA2.f));
                                            return qnrVarA2;
                                    }
                                }
                            });
                        } else {
                            sprVar.H(new Function2() { // from class: a.cor
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    byte b4 = b2;
                                    spr sprVar2 = sprVar;
                                    switch (b4) {
                                        case 0:
                                            qnr qnrVar3 = (qnr) obj4;
                                            ((oyg0) obj3).getClass();
                                            qnrVar3.getClass();
                                            xvm0 xvm0Var2 = xvm0Var;
                                            qnr qnrVarA = qnr.a(qnrVar3, 0L, null, null, false, 0L, xvm0Var2.getId(), null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, xvm0Var2, null, null, null, null, null, null, null, false, null, false, -33, 524159);
                                            sprVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(qnrVarA.f));
                                            return qnrVarA;
                                        default:
                                            xvm0 xvm0Var3 = xvm0Var;
                                            qnr qnrVarA2 = qnr.a((qnr) obj4, 0L, null, null, false, 0L, xvm0Var3.getId(), null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, xvm0Var3, null, null, null, null, null, null, null, false, null, false, -33, 524159);
                                            sprVar2.o.e("KEY_SUB_GAME_ID", Long.valueOf(qnrVarA2.f));
                                            return qnrVarA2;
                                    }
                                }
                            });
                            if (xvm0Var instanceof tvm0) {
                                c4m0 c4m0Var = sprVar.e0;
                                if (c4m0Var != null) {
                                    c4m0Var.cancel(null);
                                }
                                sprVar.P(u3z.a(u3zVar, ((tvm0) xvm0Var).f34607a), null);
                            } else if (xvm0Var instanceof svm0) {
                                sprVar.Q(j2, ((svm0) xvm0Var).b);
                                sprVar.P(u3zVar, null);
                            } else {
                                c4m0 c4m0Var2 = sprVar.e0;
                                if (c4m0Var2 != null) {
                                    c4m0Var2.cancel(null);
                                }
                                sprVar.R(xvm0Var.getId(), xvm0Var.a(), j2, t3zVar == t3z.c, sprVar.M().D0);
                            }
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                j0g0 j0g0Var = (j0g0) this.k;
                j0g0 j0g0Var2 = (j0g0) this.l;
                boolean z6 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                return new j0g0(new bfg((List) obj2, j0g0Var, j0g0Var2, z6));
            case 4:
                List list = (List) this.k;
                boolean z7 = this.j;
                String str2 = (String) this.l;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (!z7) {
                    return CollectionsKt.A0(list, new wpv((byte) 23));
                }
                iz30 iz30Var = iz30.y;
                ux30 ux30Var = new ux30(10, 0L, ((ef00) obj2).O.b.a(R.string.online_call, Arrays.copyOf(new Object[0], 0)), str2);
                zcl zclVar = qmk.f28987a;
                return CollectionsKt.A0(CollectionsKt.A0(CollectionsKt.q0(kotlin.collections.a.c(new i140(false, iz30Var, r040.OTHER, new gy30(ux30Var, new qx30(new m0x(R.drawable.ic_glyph_call_circle, null, 6), 0L, liz.f20129a, R.drawable.ic_glyph_call_circle, 48.0f, 18), new ay30(new m0x(R.drawable.ic_glyph_call_end, null, 6)), 0L, null, null, 248))), list), new wpv((byte) 21)), new wpv((byte) 22));
            case 5:
                StepInputConfigModel stepInputConfigModel = (StepInputConfigModel) this.k;
                jg7 jg7Var = (jg7) this.l;
                boolean z8 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                rg20 rg20Var = (rg20) obj2;
                p7m0 p7m0Var6 = rg20Var.J;
                p7m0 p7m0Var7 = rg20Var.Q;
                nwo0 nwo0Var = rg20Var.F;
                rg20Var.b.e("saved_state_key", StepInputConfigModel.a(stepInputConfigModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0L, null, false, false, false, 3967));
                rg20Var.T.cancel(new CancellationException("New config"));
                yje yjeVar = null;
                if (rg20.w(stepInputConfigModel) && ((nwo0Var.f24244a || (nwo0Var.b && ((Boolean) p7m0Var7.getValue()).booleanValue())) && z8)) {
                    rg20Var.T = sac.f0(jiu0.a(rg20Var), 500L, TimeUnit.MILLISECONDS, rg20Var.o.b, new hd20(rg20Var, (byte) 1), new o3s(rg20Var, stepInputConfigModel, jg7Var, yjeVar, (byte) 16), 32);
                    twn.A(((ovo0) rg20Var.C.f27815a).f25934a, p7m0Var7, null);
                } else if (rg20.w(stepInputConfigModel)) {
                    be20 be20VarX = rg20Var.x(hxu.h, stepInputConfigModel, jg7Var);
                    p7m0Var6.getClass();
                    p7m0Var6.o(null, be20VarX);
                } else {
                    p7m0 p7m0Var8 = rg20Var.I;
                    Object obj3 = nwo0Var.f24244a ? de20.f5926a : ee20.f7648a;
                    p7m0Var8.getClass();
                    p7m0Var8.o(null, obj3);
                    p7m0Var6.getClass();
                    p7m0Var6.o(null, ae20.f706a);
                }
                return Unit.f46060a;
            default:
                List list2 = (List) this.k;
                Set set = (Set) this.l;
                boolean z9 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (set.isEmpty()) {
                    if (z9) {
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            axq.t(((cok0) it.next()).f4705a, arrayList);
                        }
                        setP0 = CollectionsKt.P0(arrayList);
                    } else {
                        setP0 = xun.f41520a;
                    }
                    ((ndl0) obj2).h.c(setP0);
                }
                return new Pair(list2, set);
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        Object obj5 = this.m;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                xo1 xo1Var = new xo1((dp1) obj5, (yje) obj4, (byte) 0);
                xo1Var.j = zBooleanValue;
                xo1Var.k = (sw00) obj2;
                xo1Var.l = (String) obj3;
                return xo1Var.invokeSuspend(Unit.f46060a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                xo1 xo1Var2 = new xo1((fae) obj5, (yje) obj4, (byte) 1);
                xo1Var2.k = (qom0) obj;
                xo1Var2.j = zBooleanValue2;
                xo1Var2.l = (p9e) obj3;
                return xo1Var2.invokeSuspend(Unit.f46060a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                xo1 xo1Var3 = new xo1((spr) obj5, (yje) obj4, (byte) 2);
                xo1Var3.k = (xvm0) obj;
                xo1Var3.l = (js20) obj2;
                xo1Var3.j = zBooleanValue3;
                return xo1Var3.invokeSuspend(Unit.f46060a);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                xo1 xo1Var4 = new xo1((List) obj5, (yje) obj4, (byte) 3);
                xo1Var4.k = (j0g0) obj;
                xo1Var4.l = (j0g0) obj2;
                xo1Var4.j = zBooleanValue4;
                return xo1Var4.invokeSuspend(Unit.f46060a);
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                xo1 xo1Var5 = new xo1((ef00) obj5, (yje) obj4, (byte) 4);
                xo1Var5.k = (List) obj;
                xo1Var5.j = zBooleanValue5;
                xo1Var5.l = (String) obj3;
                return xo1Var5.invokeSuspend(Unit.f46060a);
            case 5:
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                xo1 xo1Var6 = new xo1((rg20) obj5, (yje) obj4, (byte) 5);
                xo1Var6.k = (StepInputConfigModel) obj;
                xo1Var6.l = (jg7) obj2;
                xo1Var6.j = zBooleanValue6;
                return xo1Var6.invokeSuspend(Unit.f46060a);
            default:
                boolean zBooleanValue7 = ((Boolean) obj3).booleanValue();
                xo1 xo1Var7 = new xo1((ndl0) obj5, (yje) obj4, (byte) 6);
                xo1Var7.k = (List) obj;
                xo1Var7.l = (Set) obj2;
                xo1Var7.j = zBooleanValue7;
                return xo1Var7.invokeSuspend(Unit.f46060a);
        }
    }
}

package a;

import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final class gbv extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbv(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = obj;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.j;
        switch (b) {
            case 0:
                return new gbv((ywu) obj4, (yje) obj3, (byte) 0).invokeSuspend(Unit.f46060a);
            case 1:
                return new gbv((nvu) obj4, (yje) obj3, (byte) 1).invokeSuspend(Unit.f46060a);
            case 2:
                return new gbv((cyh) obj4, (yje) obj3, (byte) 2).invokeSuspend(Unit.f46060a);
            case 3:
                return new gbv((tax) obj4, (yje) obj3, (byte) 3).invokeSuspend(Unit.f46060a);
            case 4:
                return new gbv((lox) obj4, (yje) obj3, (byte) 4).invokeSuspend(Unit.f46060a);
            case 5:
                return new gbv((LottieView) obj4, (yje) obj3, (byte) 5).invokeSuspend(Unit.f46060a);
            case 6:
                return new gbv((cx10) obj4, (yje) obj3, (byte) 6).invokeSuspend(Unit.f46060a);
            case 7:
                return new gbv((qg20) obj4, (yje) obj3, (byte) 7).invokeSuspend(Unit.f46060a);
            case 8:
                return new gbv((dy20) obj4, (yje) obj3, (byte) 8).invokeSuspend(Unit.f46060a);
            case 9:
                return new gbv((jx40) obj4, (yje) obj3, (byte) 9).invokeSuspend(Unit.f46060a);
            case 10:
                return new gbv((bs60) obj4, (yje) obj3, (byte) 10).invokeSuspend(Unit.f46060a);
            case 11:
                return new gbv((eh70) obj4, (yje) obj3, (byte) 11).invokeSuspend(Unit.f46060a);
            case 12:
                return new gbv((ji70) obj4, (yje) obj3, (byte) 12).invokeSuspend(Unit.f46060a);
            case 13:
                return new gbv((gz70) obj4, (yje) obj3, (byte) 13).invokeSuspend(Unit.f46060a);
            case 14:
                return new gbv((n880) obj4, (yje) obj3, (byte) 14).invokeSuspend(Unit.f46060a);
            case 15:
                return new gbv((aa80) obj4, (yje) obj3, (byte) 15).invokeSuspend(Unit.f46060a);
            case 16:
                return new gbv((jt80) obj4, (yje) obj3, (byte) 16).invokeSuspend(Unit.f46060a);
            case 17:
                return new gbv((org.xplatform.security.impl.presentation.password.change.input_password.f) obj4, (yje) obj3, (byte) 17).invokeSuspend(Unit.f46060a);
            case 18:
                return new gbv((s690) obj4, (yje) obj3, (byte) 18).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new gbv((p990) obj4, (yje) obj3, (byte) 19).invokeSuspend(Unit.f46060a);
            case 20:
                return new gbv((r4b0) obj4, (yje) obj3, (byte) 20).invokeSuspend(Unit.f46060a);
            case 21:
                return new gbv((j5b0) obj4, (yje) obj3, (byte) 21).invokeSuspend(Unit.f46060a);
            case 22:
                return new gbv((l7b0) obj4, (yje) obj3, (byte) 22).invokeSuspend(Unit.f46060a);
            case 23:
                return new gbv((g9b0) obj4, (yje) obj3, (byte) 23).invokeSuspend(Unit.f46060a);
            case 24:
                return new gbv((sbb0) obj4, (yje) obj3, (byte) 24).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new gbv((kgb0) obj4, (yje) obj3, (byte) 25).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new gbv((fgd0) obj4, (yje) obj3, (byte) 26).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new gbv((shd0) obj4, (yje) obj3, (byte) 27).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new gbv((jid0) obj4, (yje) obj3, (byte) 28).invokeSuspend(Unit.f46060a);
            default:
                return new gbv((fkd0) obj4, (yje) obj3, (byte) 29).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01e1  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.i;
        byte b2 = 0;
        yje yjeVar = null;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((ywu) obj2).D();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((nvu) obj2).X();
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ((cyh) obj2).e.f41925a.f16010a.clear();
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((tax) obj2).y);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ((lox) obj2).c.decrementAndGet();
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                LottieView lottieView = (LottieView) obj2;
                lottieView.t.setEnabled(true);
                TextView textView = lottieView.s;
                textView.animate().alpha(0.0f);
                textView.setVisibility(8);
                e3c.n(lottieView.n1);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                cx10 cx10Var = (cx10) obj2;
                c4m0 c4m0Var = cx10Var.K;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                bby bbyVar = cx10Var.L;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                c4m0 c4m0Var2 = cx10Var.M;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                c4m0 c4m0Var3 = cx10Var.N;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                }
                c4m0 c4m0Var4 = cx10Var.O;
                if (c4m0Var4 != null) {
                    c4m0Var4.cancel(null);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                ol60 ol60Var = ((qg20) obj2).c1;
                Unit unit = Unit.f46060a;
                ol60Var.f(unit);
                return unit;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                dy20 dy20Var = (dy20) obj2;
                v3c.N(dy20Var.w);
                v3c.N(dy20Var.x);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                bs60 bs60Var = (bs60) obj2;
                int i = bs60.h0;
                bs60Var.Y();
                p7m0 p7m0Var = bs60Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    bs60Var.f.getClass();
                } while (!p7m0Var.m(value, w370.a((w370) value, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ((eh70) obj2).w = false;
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                ((ji70) obj2).u = false;
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                if (gz70.F instanceof gy70) {
                    gz70 gz70Var = (gz70) obj2;
                    c4m0 c4m0Var5 = gz70.E;
                    if (c4m0Var5 != null) {
                        gz70Var.getClass();
                        if (!c4m0Var5.isActive()) {
                            gz70.E = qjj.W(d5c.a(gz70Var.C.b), null, null, new iy70(b2, yjeVar, gz70Var), 3);
                        }
                    } else {
                        gz70.E = qjj.W(d5c.a(gz70Var.C.b), null, null, new iy70(b2, yjeVar, gz70Var), 3);
                    }
                    gz70.F = fy70.f10348a;
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                n880 n880Var = (n880) obj2;
                int i2 = n880.L;
                p7m0 p7m0Var2 = n880Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    n880Var.f.getClass();
                } while (!p7m0Var2.m(value2, y780.a((y780) value2, null, 0, null, null, null, null, null, null, null, null, false, null, false, false, false, false, 229375)));
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                ((aa80) obj2).B(false);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                jt80 jt80Var = (jt80) obj2;
                long j = jt80Var.o;
                iun iunVar = iun.f15405a;
                AggregatorScreenModel aggregatorScreenModel = ((rs80) jt80Var.D()).q;
                jt80Var.n0 = new r3q(j, iunVar, iunVar, aggregatorScreenModel != null ? aggregatorScreenModel.g : 0L);
                ((jr0) jt80Var.F.b).b.e = false;
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = ((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2).m;
                Boolean bool = Boolean.FALSE;
                p7m0Var3.getClass();
                p7m0Var3.o(null, bool);
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = ((s690) obj2).w;
                do {
                    value3 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value3, a690.f307a));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var5 = ((p990) obj2).z;
                do {
                    value4 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value4, d990.b));
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                r4b0 r4b0Var = (r4b0) obj2;
                bby bbyVar2 = r4b0Var.w;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                c4m0 c4m0Var6 = r4b0Var.v;
                if (c4m0Var6 != null) {
                    c4m0Var6.cancel(null);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                j5b0 j5b0Var = (j5b0) obj2;
                bby bbyVar3 = j5b0Var.o;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                bby bbyVar4 = j5b0Var.n;
                if (bbyVar4 != null) {
                    bbyVar4.cancel(null);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                l7b0 l7b0Var = (l7b0) obj2;
                bby bbyVar5 = l7b0Var.u;
                if (bbyVar5 != null) {
                    bbyVar5.cancel(null);
                }
                bby bbyVar6 = l7b0Var.t;
                if (bbyVar6 != null) {
                    bbyVar6.cancel(null);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                g9b0 g9b0Var = (g9b0) obj2;
                bby bbyVar7 = g9b0Var.L;
                if (bbyVar7 != null) {
                    bbyVar7.cancel(null);
                }
                c4m0 c4m0Var7 = g9b0Var.K;
                if (c4m0Var7 != null) {
                    c4m0Var7.cancel(null);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                e3c.n(((sbb0) obj2).r0);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                int i3 = kgb0.k0;
                p7m0 p7m0Var6 = ((kgb0) obj2).i.f25029a;
                do {
                    value5 = p7m0Var6.getValue();
                    value5.getClass();
                } while (!p7m0Var6.m(value5, ufb0.a((ufb0) value5, null, false, false, null, false, null, null, null, null, zee.f44245a, null, 3071)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                fgd0 fgd0Var = (fgd0) obj2;
                v3c.N(fgd0Var.v);
                c4m0 c4m0Var8 = fgd0Var.u;
                if (c4m0Var8 != null) {
                    c4m0Var8.cancel(null);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                shd0 shd0Var = (shd0) obj2;
                v3c.N(shd0Var.x);
                v3c.N(shd0Var.w);
                v3c.N(shd0Var.y);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((jid0) obj2).m);
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((fkd0) obj2).m);
                return Unit.f46060a;
        }
    }
}

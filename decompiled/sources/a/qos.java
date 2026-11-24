package a;

import android.util.Log;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final class qos extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qos(LottieView lottieView, Function0 function0, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 11;
        this.j = lottieView;
        this.k = function0;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) throws Throwable {
        byte b = 3;
        switch (this.i) {
            case 0:
                qos qosVar = new qos(this.k, (yje) obj3, (byte) 0);
                qosVar.j = (Throwable) obj2;
                qosVar.invokeSuspend(Unit.f46060a);
                throw null;
            case 1:
                qos qosVar2 = new qos((int) b, (yje) obj3, (byte) 1);
                qosVar2.j = (uhc0) obj;
                qosVar2.k = (List) obj2;
                return qosVar2.invokeSuspend(Unit.f46060a);
            case 2:
                qos qosVar3 = new qos((int) b, (yje) obj3, (byte) 2);
                qosVar3.j = (l0j) obj;
                qosVar3.k = (l0j) obj2;
                return qosVar3.invokeSuspend(Unit.f46060a);
            case 3:
                qos qosVar4 = new qos(b, (yje) obj3, b);
                qosVar4.j = (ljj) obj;
                qosVar4.k = (List) obj2;
                return qosVar4.invokeSuspend(Unit.f46060a);
            case 4:
                qos qosVar5 = new qos((int) b, (yje) obj3, (byte) 4);
                qosVar5.j = (Cnew) obj;
                qosVar5.k = (List) obj2;
                return qosVar5.invokeSuspend(Unit.f46060a);
            case 5:
                qos qosVar6 = new qos((int) b, (yje) obj3, (byte) 5);
                qosVar6.j = (a8h0) obj;
                qosVar6.k = (qqp0) obj2;
                return qosVar6.invokeSuspend(Unit.f46060a);
            case 6:
                qos qosVar7 = new qos((int) b, (yje) obj3, (byte) 6);
                qosVar7.j = (Set) obj;
                qosVar7.k = (Set) obj2;
                return qosVar7.invokeSuspend(Unit.f46060a);
            case 7:
                qos qosVar8 = new qos((int) b, (yje) obj3, (byte) 7);
                qosVar8.j = (ygq0) obj;
                qosVar8.k = (wgq0) obj2;
                return qosVar8.invokeSuspend(Unit.f46060a);
            case 8:
                qos qosVar9 = new qos((int) b, (yje) obj3, (byte) 8);
                qosVar9.j = (p6j) obj;
                qosVar9.k = (y6j) obj2;
                return qosVar9.invokeSuspend(Unit.f46060a);
            case 9:
                qos qosVar10 = new qos(this.k, (yje) obj3, (byte) 9);
                qosVar10.j = (Throwable) obj2;
                return qosVar10.invokeSuspend(Unit.f46060a);
            case 10:
                qos qosVar11 = new qos(this.k, (yje) obj3, (byte) 10);
                qosVar11.j = (Throwable) obj2;
                return qosVar11.invokeSuspend(Unit.f46060a);
            case 11:
                return new qos((LottieView) this.j, (Function0) this.k, (yje) obj3).invokeSuspend(Unit.f46060a);
            case 12:
                qos qosVar12 = new qos(this.k, (yje) obj3, (byte) 12);
                qosVar12.j = (Throwable) obj2;
                return qosVar12.invokeSuspend(Unit.f46060a);
            case 13:
                qos qosVar13 = new qos(this.k, (yje) obj3, (byte) 13);
                qosVar13.j = (Throwable) obj2;
                return qosVar13.invokeSuspend(Unit.f46060a);
            case 14:
                qos qosVar14 = new qos((int) b, (yje) obj3, (byte) 14);
                qosVar14.j = (CoefStepInputUiModel) obj;
                qosVar14.k = (StepInputUiModel) obj2;
                return qosVar14.invokeSuspend(Unit.f46060a);
            case 15:
                qos qosVar15 = new qos(this.k, (yje) obj3, (byte) 15);
                qosVar15.j = (Throwable) obj2;
                return qosVar15.invokeSuspend(Unit.f46060a);
            case 16:
                qos qosVar16 = new qos(this.k, (yje) obj3, (byte) 16);
                qosVar16.j = (Throwable) obj2;
                return qosVar16.invokeSuspend(Unit.f46060a);
            case 17:
                qos qosVar17 = new qos(this.k, (yje) obj3, (byte) 17);
                qosVar17.j = (Throwable) obj2;
                return qosVar17.invokeSuspend(Unit.f46060a);
            case 18:
                qos qosVar18 = new qos(this.k, (yje) obj3, (byte) 18);
                qosVar18.j = (Throwable) obj2;
                return qosVar18.invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                qos qosVar19 = new qos(this.k, (yje) obj3, (byte) 19);
                qosVar19.j = (Throwable) obj2;
                return qosVar19.invokeSuspend(Unit.f46060a);
            case 20:
                qos qosVar20 = new qos(this.k, (yje) obj3, (byte) 20);
                qosVar20.j = (Throwable) obj2;
                return qosVar20.invokeSuspend(Unit.f46060a);
            case 21:
                qos qosVar21 = new qos(this.k, (yje) obj3, (byte) 21);
                qosVar21.j = (Throwable) obj2;
                return qosVar21.invokeSuspend(Unit.f46060a);
            case 22:
                qos qosVar22 = new qos((int) b, (yje) obj3, (byte) 22);
                qosVar22.j = (tk60) obj;
                qosVar22.k = (xkb0) obj2;
                return qosVar22.invokeSuspend(Unit.f46060a);
            case 23:
                qos qosVar23 = new qos(this.k, (yje) obj3, (byte) 23);
                qosVar23.j = (Throwable) obj2;
                return qosVar23.invokeSuspend(Unit.f46060a);
            case 24:
                qos qosVar24 = new qos(this.k, (yje) obj3, (byte) 24);
                qosVar24.j = (Throwable) obj2;
                return qosVar24.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                qos qosVar25 = new qos(this.k, (yje) obj3, (byte) 25);
                qosVar25.j = (Throwable) obj2;
                return qosVar25.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                qos qosVar26 = new qos(this.k, (yje) obj3, (byte) 26);
                qosVar26.j = (Throwable) obj2;
                return qosVar26.invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                qos qosVar27 = new qos(this.k, (yje) obj3, (byte) 27);
                qosVar27.j = (Throwable) obj2;
                return qosVar27.invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                qos qosVar28 = new qos(this.k, (yje) obj3, (byte) 28);
                qosVar28.j = (Throwable) obj2;
                return qosVar28.invokeSuspend(Unit.f46060a);
            default:
                qos qosVar29 = new qos(this.k, (yje) obj3, (byte) 29);
                qosVar29.j = (Throwable) obj2;
                return qosVar29.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        z7h0 z7h0Var;
        h730 h730Var;
        Object value;
        Object value2;
        byte b = 0;
        switch (this.i) {
            case 0:
                Throwable th = (Throwable) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (th instanceof gmq0) {
                    throw new zj00(((cps) this.k).f4763a);
                }
                throw th;
            case 1:
                uhc0 uhc0Var = (uhc0) this.j;
                List list = (List) this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return new cic0(uhc0Var, list);
            case 2:
                l0j l0jVar = (l0j) this.j;
                l0j l0jVar2 = (l0j) this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return l0jVar2 == null ? l0jVar : l0jVar2;
            case 3:
                ljj ljjVar = (ljj) this.j;
                List list2 = (List) this.k;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int iOrdinal = ljjVar.ordinal();
                if (iOrdinal == 0) {
                    return new mjj(ljjVar, iun.f15405a);
                }
                if (iOrdinal == 1) {
                    return new mjj(ljjVar, list2);
                }
                t9f.b();
                return null;
            case 4:
                Cnew cnew = (Cnew) this.j;
                List list3 = (List) this.k;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                return new tew(new j0g0(cnew), new j0g0(list3));
            case 5:
                a8h0 a8h0Var = (a8h0) this.j;
                qqp0 qqp0Var = (qqp0) this.k;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (!(qqp0Var instanceof oqp0) || a8h0Var == null || (z7h0Var = a8h0Var.b) == null) {
                    return j730.f16021a;
                }
                String strA = z7h0Var.a();
                if (strA != null) {
                    return new k730(strA);
                }
                if (z7h0Var instanceof y7h0) {
                    h730Var = h730.f12558a;
                } else {
                    if (!(z7h0Var instanceof x7h0)) {
                        t9f.b();
                        return null;
                    }
                    h730Var = h730.b;
                }
                return new i730(h730Var);
            case 6:
                Set set = (Set) this.j;
                Set set2 = (Set) this.k;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(set2.size() < 6 && set2.equals(set));
            case 7:
                ygq0 ygq0Var = (ygq0) this.j;
                wgq0 wgq0Var = (wgq0) this.k;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                return new ghq0(ygq0Var, wgq0Var);
            case 8:
                p6j p6jVar = (p6j) this.j;
                y6j y6jVar = (y6j) this.k;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                wxb0 wxb0Var = (wxb0) CollectionsKt.W(p6jVar.b, p6jVar.f26457a);
                if (wxb0Var == null) {
                    wxb0Var = new wxb0("", "");
                }
                return new Pair(y6jVar, wxb0Var);
            case 9:
                Throwable th2 = (Throwable) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                ((ibx) this.k).i.b(th2, new v1x((byte) 13));
                return Unit.f46060a;
            case 10:
                Throwable th3 = (Throwable) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                if (((hie0) this.k).f13108a) {
                    return Unit.f46060a;
                }
                throw th3;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                LottieView lottieView = (LottieView) this.j;
                lottieView.t.setEnabled(true);
                TextView textView = lottieView.s;
                textView.animate().alpha(0.0f);
                textView.setVisibility(8);
                e3c.n(lottieView.n1);
                ((Function0) this.k).invoke();
                return Unit.f46060a;
            case 12:
                Throwable th4 = (Throwable) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                vq10 vq10Var = (vq10) this.k;
                vq10Var.n.b(th4, new g2z((Object) vq10Var, (byte) 26));
                vq10Var.x(false);
                return Unit.f46060a;
            case 13:
                Throwable th5 = (Throwable) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ((f120) this.k).t.b(th5, new gm10((byte) 19));
                return Unit.f46060a;
            case 14:
                CoefStepInputUiModel coefStepInputUiModel = (CoefStepInputUiModel) this.j;
                StepInputUiModel stepInputUiModel = (StepInputUiModel) this.k;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                return new Pair(coefStepInputUiModel, stepInputUiModel);
            case 15:
                Throwable th6 = (Throwable) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                ip50 ip50Var = (ip50) this.k;
                int i = ip50.G;
                ip50Var.z.b(th6, new dp50(ip50Var, b));
                return Unit.f46060a;
            case 16:
                Throwable th7 = (Throwable) this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                xp50 xp50Var = (xp50) this.k;
                int i2 = xp50.G;
                xp50Var.z.b(th7, new sp50(xp50Var, b));
                return Unit.f46060a;
            case 17:
                Throwable th8 = (Throwable) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                sq50 sq50Var = (sq50) this.k;
                int i3 = sq50.B;
                sq50Var.v.b(th8, new nq50(sq50Var, b));
                return Unit.f46060a;
            case 18:
                Throwable th9 = (Throwable) this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                qr50 qr50Var = (qr50) this.k;
                int i4 = qr50.F;
                qr50Var.y.b(th9, new lr50(qr50Var, b));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th10 = (Throwable) this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                gt50 gt50Var = (gt50) this.k;
                int i5 = gt50.G;
                gt50Var.z.b(th10, new bt50(gt50Var, b));
                return Unit.f46060a;
            case 20:
                Throwable th11 = (Throwable) this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                ((ut50) this.k).m.b(th11, new yr0(th11, (byte) 16));
                return Unit.f46060a;
            case 21:
                Throwable th12 = (Throwable) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                v360 v360Var = (v360) this.k;
                int i6 = v360.x0;
                p7m0 p7m0Var = v360Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, c260.a((c260) value, null, false, false, false, null, false, null, new pz50(th12), null, null, 260095)));
                v360Var.b0(th12);
                return Unit.f46060a;
            case 22:
                tk60 tk60Var = (tk60) this.j;
                xkb0 xkb0Var = (xkb0) this.k;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                rk60 rk60Var = tk60Var instanceof rk60 ? (rk60) tk60Var : null;
                if ((rk60Var != null ? rk60Var.f30634a : null) == (xkb0Var != null ? xkb0Var.a() : null)) {
                    return xkb0Var;
                }
                return null;
            case 23:
                Throwable th13 = (Throwable) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                bs60 bs60Var = (bs60) this.k;
                int i7 = bs60.h0;
                bs60Var.P(th13);
                return Unit.f46060a;
            case 24:
                Throwable th14 = (Throwable) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                n270 n270Var = (n270) this.k;
                int i8 = n270.Z;
                n270Var.M.b(th14, new cr60((byte) 14));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th15 = (Throwable) this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                ((qf70) this.k).A(th15);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th16 = (Throwable) this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                th16.printStackTrace();
                gz70 gz70Var = (gz70) this.k;
                pom0 pom0Var = new pom0(th16);
                c4m0 c4m0Var = gz70.D;
                gz70Var.getClass();
                gz70.d(pom0Var);
                g45 g45Var = gz70Var.w.f37798a;
                ((gcl) g45Var.d).a();
                ((i7e) g45Var.c).b();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th17 = (Throwable) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                jt80 jt80Var = (jt80) this.k;
                zc70 zc70Var = new zc70((byte) 27);
                int i9 = jt80.s0;
                jt80Var.H(zc70Var);
                jt80Var.q0 = !((rs80) jt80Var.D()).f && th17 == null;
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th18 = (Throwable) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                if (th18 == null) {
                    j790 j790Var = (j790) this.k;
                    List list4 = j790.F;
                    p7m0 p7m0Var2 = j790Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, y690.a((y690) value2, null, 0L, true, 3)));
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                Throwable th19 = (Throwable) this.j;
                Log.e("PipePresenceSrc", "Error in camera ID flow collection.", th19);
                jrs0 jrs0Var = (jrs0) this.k;
                if (((AtomicBoolean) jrs0Var.i).get()) {
                    jrs0Var.m(th19, null);
                } else {
                    m0x0.H(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qos(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qos(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }
}

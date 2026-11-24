package a;

import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;

/* JADX INFO: loaded from: classes3.dex */
public final class e00 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e00(Object obj, yje yjeVar, byte b) {
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
                return new e00((g00) obj4, (yje) obj3, (byte) 0).invokeSuspend(Unit.f46060a);
            case 1:
                return new e00((f20) obj4, (yje) obj3, (byte) 1).invokeSuspend(Unit.f46060a);
            case 2:
                return new e00((kc4) obj4, (yje) obj3, (byte) 2).invokeSuspend(Unit.f46060a);
            case 3:
                return new e00((fh4) obj4, (yje) obj3, (byte) 3).invokeSuspend(Unit.f46060a);
            case 4:
                return new e00((hk4) obj4, (yje) obj3, (byte) 4).invokeSuspend(Unit.f46060a);
            case 5:
                return new e00((ku4) obj4, (yje) obj3, (byte) 5).invokeSuspend(Unit.f46060a);
            case 6:
                return new e00((z28) obj4, (yje) obj3, (byte) 6).invokeSuspend(Unit.f46060a);
            case 7:
                return new e00((d48) obj4, (yje) obj3, (byte) 7).invokeSuspend(Unit.f46060a);
            case 8:
                return new e00((eqb) obj4, (yje) obj3, (byte) 8).invokeSuspend(Unit.f46060a);
            case 9:
                return new e00((hrb) obj4, (yje) obj3, (byte) 9).invokeSuspend(Unit.f46060a);
            case 10:
                return new e00((v7c) obj4, (yje) obj3, (byte) 10).invokeSuspend(Unit.f46060a);
            case 11:
                return new e00((hie0) obj4, (yje) obj3, (byte) 11).invokeSuspend(Unit.f46060a);
            case 12:
                return new e00((kzd) obj4, (yje) obj3, (byte) 12).invokeSuspend(Unit.f46060a);
            case 13:
                return new e00((rai0) obj4, (yje) obj3, (byte) 13).invokeSuspend(Unit.f46060a);
            case 14:
                return new e00((lbf) obj4, (yje) obj3, (byte) 14).invokeSuspend(Unit.f46060a);
            case 15:
                return new e00((Cs2GameLogBombTimerView) obj4, (yje) obj3, (byte) 15).invokeSuspend(Unit.f46060a);
            case 16:
                return new e00((h6g) obj4, (yje) obj3, (byte) 16).invokeSuspend(Unit.f46060a);
            case 17:
                return new e00((w6g) obj4, (yje) obj3, (byte) 17).invokeSuspend(Unit.f46060a);
            case 18:
                return new e00((j7g) obj4, (yje) obj3, (byte) 18).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new e00((k8g) obj4, (yje) obj3, (byte) 19).invokeSuspend(Unit.f46060a);
            case 20:
                return new e00((u8g) obj4, (yje) obj3, (byte) 20).invokeSuspend(Unit.f46060a);
            case 21:
                return new e00((g9g) obj4, (yje) obj3, (byte) 21).invokeSuspend(Unit.f46060a);
            case 22:
                return new e00((tag) obj4, (yje) obj3, (byte) 22).invokeSuspend(Unit.f46060a);
            case 23:
                return new e00((hbg) obj4, (yje) obj3, (byte) 23).invokeSuspend(Unit.f46060a);
            case 24:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((Boolean) obj2).getClass();
                new e00((ecg) obj4, (yje) obj3, (byte) 24).invokeSuspend(Unit.f46060a);
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new e00((sdn) obj4, (yje) obj3, (byte) 25).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Boolean) obj).getClass();
                return new e00((wnn) obj4, (yje) obj3, (byte) 26).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new e00((TextView) obj4, (yje) obj3, (byte) 27).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new e00((k6p) obj4, (yje) obj3, (byte) 28).invokeSuspend(Unit.f46060a);
            default:
                return new e00((org.xplatform.favorites.impl.presentation.category.f) obj4, (yje) obj3, (byte) 29).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        bby bbyVar;
        bby bbyVar2;
        bby bbyVar3;
        bby bbyVar4;
        c4m0 c4m0Var;
        bby bbyVar5;
        bby bbyVar6;
        bby bbyVar7;
        bby bbyVar8;
        c4m0 c4m0Var2;
        c4m0 c4m0Var3;
        c4m0 c4m0Var4;
        Object value4;
        byte b = this.i;
        yje yjeVar = null;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                v3c.N(((g00) obj2).C);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                f20 f20Var = (f20) obj2;
                f20Var.y(f20Var.D);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i = kc4.Y;
                p7m0 p7m0Var = ((kc4) obj2).i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, mb4.a((mb4) value, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i2 = fh4.c0;
                p7m0 p7m0Var2 = ((fh4) obj2).i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, zf4.a((zf4) value2, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                int i3 = hk4.b0;
                p7m0 p7m0Var3 = ((hk4) obj2).i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, tj4.a((tj4) value3, false, false, false, null, null, null, 0, false, null, null, false, 65527)));
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                qq4 qq4Var = ku4.J;
                ((ku4) obj2).A(true);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((z28) obj2).j);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((d48) obj2).H);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                eqb eqbVar = (eqb) obj2;
                p7m0 p7m0Var4 = eqbVar.u;
                Boolean bool = Boolean.FALSE;
                p7m0Var4.getClass();
                p7m0Var4.o(null, bool);
                p7m0 p7m0Var5 = eqbVar.s;
                Boolean bool2 = Boolean.TRUE;
                p7m0Var5.getClass();
                p7m0Var5.o(null, bool2);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((hrb) obj2).D);
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                v7c v7cVar = (v7c) obj2;
                v3c.N(v7cVar.T);
                v3c.N(v7cVar.R);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ((hie0) obj2).f13108a = true;
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((kzd) obj2).u);
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ((rai0) obj2).invoke(Boolean.FALSE);
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                lbf lbfVar = (lbf) obj2;
                v3c.N(lbfVar.u);
                v3c.N(lbfVar.t);
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                ((Cs2GameLogBombTimerView) obj2).getBinding().f36210a.setVisibility(8);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                h6g h6gVar = (h6g) obj2;
                bby bbyVar9 = h6gVar.r;
                if (bbyVar9 != null && bbyVar9.isActive() && (bbyVar2 = h6gVar.r) != null) {
                    bbyVar2.cancel(null);
                }
                bby bbyVar10 = h6gVar.s;
                if (bbyVar10 != null && bbyVar10.isActive() && (bbyVar = h6gVar.s) != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                w6g w6gVar = (w6g) obj2;
                c4m0 c4m0Var5 = w6gVar.r;
                if (c4m0Var5 != null && c4m0Var5.isActive() && (c4m0Var = w6gVar.r) != null) {
                    c4m0Var.cancel(null);
                }
                bby bbyVar11 = w6gVar.t;
                if (bbyVar11 != null && bbyVar11.isActive() && (bbyVar4 = w6gVar.t) != null) {
                    bbyVar4.cancel(null);
                }
                bby bbyVar12 = w6gVar.s;
                if (bbyVar12 != null && bbyVar12.isActive() && (bbyVar3 = w6gVar.s) != null) {
                    bbyVar3.cancel(null);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                j7g j7gVar = (j7g) obj2;
                j7gVar.b.e("selected_ids_key", j7gVar.l.getValue());
                bby bbyVar13 = j7gVar.o;
                if (bbyVar13 != null && bbyVar13.isActive() && (bbyVar5 = j7gVar.o) != null) {
                    bbyVar5.cancel(null);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                k8g k8gVar = (k8g) obj2;
                bby bbyVar14 = k8gVar.j;
                if (bbyVar14 != null && bbyVar14.isActive() && (bbyVar6 = k8gVar.j) != null) {
                    bbyVar6.cancel(null);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                u8g u8gVar = (u8g) obj2;
                c4m0 c4m0Var6 = u8gVar.p;
                if (c4m0Var6 != null && c4m0Var6.isActive() && (c4m0Var2 = u8gVar.p) != null) {
                    c4m0Var2.cancel(null);
                }
                bby bbyVar15 = u8gVar.r;
                if (bbyVar15 != null && bbyVar15.isActive() && (bbyVar8 = u8gVar.r) != null) {
                    bbyVar8.cancel(null);
                }
                bby bbyVar16 = u8gVar.q;
                if (bbyVar16 != null && bbyVar16.isActive() && (bbyVar7 = u8gVar.q) != null) {
                    bbyVar7.cancel(null);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                bby bbyVar17 = ((g9g) obj2).l;
                if (bbyVar17 != null) {
                    bbyVar17.cancel(null);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                tag tagVar = (tag) obj2;
                c4m0 c4m0Var7 = tagVar.k;
                if (c4m0Var7 != null && c4m0Var7.isActive() && (c4m0Var4 = tagVar.k) != null) {
                    c4m0Var4.cancel(null);
                }
                c4m0 c4m0Var8 = tagVar.l;
                if (c4m0Var8 != null && c4m0Var8.isActive() && (c4m0Var3 = tagVar.l) != null) {
                    c4m0Var3.cancel(null);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                hbg hbgVar = (hbg) obj2;
                v3c.N(hbgVar.x);
                v3c.N(hbgVar.y);
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                sdn sdnVar = (sdn) obj2;
                sdnVar.w.g(idf0.f14583a);
                p7m0 p7m0Var6 = sdnVar.i.f25029a;
                do {
                    value4 = p7m0Var6.getValue();
                    value4.getClass();
                } while (!p7m0Var6.m(value4, cdn.a((cdn) value4, null, iun.f15405a, null, false, null, null, 237)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                wnn wnnVar = (wnn) obj2;
                wnnVar.R.a();
                if (wnnVar.D.c().f24244a) {
                    bby bbyVar18 = wnnVar.f0;
                    if (bbyVar18 != null) {
                        bbyVar18.cancel(null);
                    }
                    wnnVar.f0 = i3t0.K(wnnVar, null, new yhn((Object) wnnVar, (byte) 3), new rnn(wnnVar, yjeVar, (byte) 6), 1);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                o5o.b(0L, (TextView) obj2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                k6p k6pVar = (k6p) obj2;
                v3c.N(k6pVar.p);
                v3c.N(k6pVar.r);
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                org.xplatform.favorites.impl.presentation.category.f fVar = (org.xplatform.favorites.impl.presentation.category.f) obj2;
                c4m0 c4m0Var9 = fVar.z;
                if (c4m0Var9 != null) {
                    if (c4m0Var9.isCancelled()) {
                        c4m0Var9 = null;
                    }
                    if (c4m0Var9 != null) {
                        c4m0Var9.cancel(null);
                    }
                }
                c4m0 c4m0Var10 = fVar.A;
                if (c4m0Var10 != null) {
                    if (c4m0Var10.isCancelled()) {
                        c4m0Var10 = null;
                    }
                    if (c4m0Var10 != null) {
                        c4m0Var10.cancel(null);
                    }
                }
                c4m0 c4m0Var11 = fVar.B;
                if (c4m0Var11 != null) {
                    if (c4m0Var11.isCancelled()) {
                        c4m0Var11 = null;
                    }
                    if (c4m0Var11 != null) {
                        c4m0Var11.cancel(null);
                    }
                }
                return Unit.f46060a;
        }
    }
}

package a;

import android.content.Context;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ssa0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32716a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ssa0(Object obj, byte b) {
        this.f32716a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        vee veeVar;
        Object value2;
        Object value3;
        vee veeVar2;
        Object value4;
        Object value5;
        Object value6;
        bec0 bec0Var;
        Object value7;
        byte b = this.f32716a;
        byte b2 = 9;
        byte b3 = 0;
        yje yjeVar = null;
        byte b4 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ata0) obj).G(ksa0.f18804a);
                return Unit.f46060a;
            case 1:
                List list = (List) ((xv20) ((nr00) ((xfu) obj).f40810a).f23980a).f41537a.getValue();
                if (list == null) {
                    list = iun.f15405a;
                }
                return new hua0(list, iun.f15405a, true, false);
            case 2:
                uua0 uua0Var = (uua0) obj;
                wgi0 wgi0VarG = x2x.G("kotlinx.serialization.Polymorphic", tua0.b, new ugi0[0], new yr80(uua0Var, (byte) 19));
                sgy sgyVar = uua0Var.f36290a;
                sgyVar.getClass();
                return new nje(wgi0VarG, sgyVar);
            case 3:
                rl70 rl70Var = d2b0.S1;
                fiu0 fiu0Var = ((d2b0) obj).K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                kgb0 kgb0Var = (kgb0) obj;
                oyg0 oyg0Var = kgb0Var.f;
                int i = kgb0.k0;
                ocj ocjVar = kgb0Var.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ufb0.a((ufb0) value, null, false, false, seb0.f32071a, false, null, null, null, null, null, null, 4087)));
                mne mneVar = kgb0Var.p;
                bby bbyVar = kgb0Var.b0;
                if ((bbyVar == null || !bbyVar.isActive()) && ((ufb0) kgb0Var.D()).g.isEmpty()) {
                    kgb0Var.b0 = sac.V(jiu0.a(kgb0Var), new e9b0(1, kgb0Var, kgb0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, mneVar.b, new cgb0(kgb0Var, yjeVar, b4), 10);
                }
                kgb0Var.R();
                bby bbyVar2 = kgb0Var.e0;
                vee veeVar3 = vee.f37282a;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    if (((ufb0) kgb0Var.D()).l.a()) {
                        veeVar = veeVar3;
                    } else {
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        while (true) {
                            Object value8 = p7m0Var2.getValue();
                            value8.getClass();
                            oyg0Var.getClass();
                            veeVar = veeVar3;
                            if (!p7m0Var2.m(value8, ufb0.a((ufb0) value8, null, false, false, null, false, null, null, null, null, null, veeVar, 2047))) {
                                veeVar3 = veeVar;
                            }
                        }
                    }
                    kgb0Var.e0 = sac.V(jiu0.a(kgb0Var), new e9b0(1, kgb0Var, kgb0.class, "setErrorLuckyWheel", "setErrorLuckyWheel(Ljava/lang/Throwable;)V", 0, (byte) 10), null, mneVar.b, new dgb0(kgb0Var, yjeVar, b4), 10);
                } else {
                    veeVar = veeVar3;
                }
                c4m0 c4m0Var = kgb0Var.f0;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    if (!((ufb0) kgb0Var.D()).k.a()) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var3.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                            veeVar2 = veeVar;
                            veeVar = veeVar2;
                        } while (!p7m0Var3.m(value3, ufb0.a((ufb0) value3, null, false, false, null, false, null, null, null, null, veeVar2, null, 3071)));
                    }
                    if (((ufb0) kgb0Var.D()).c) {
                        uii uiiVar = kgb0Var.E;
                        uiiVar.getClass();
                        kgb0Var.f0 = sac.T(new dnq(new fnq(new k2c(bkb.i0(new fnq(bkb.h0(180000L, TimeUnit.MILLISECONDS, new gc1(uiiVar, yjeVar, b2)), new dou(Math.max(0L, 180000 - (System.currentTimeMillis() - ((qfb0) ((f4u) uiiVar.e).b).f28624a.f770a)), null)), "PopularOneXGamesViewModel.getJackpot", 3, 3L, null, CollectionsKt.L0(pnm0.c), null, 40), (byte) 3), new ggb0(kgb0Var, yjeVar, b3), (byte) 4), new gbv(kgb0Var, yjeVar, (byte) 25), (byte) 1), d5c.S(jiu0.a(kgb0Var), mneVar.b), foe.h);
                    } else {
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var4.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var4.m(value2, ufb0.a((ufb0) value2, null, false, false, null, false, null, null, null, null, zee.f44245a, null, 3071)));
                    }
                }
                return Unit.f46060a;
            case 5:
                ((sgb0) obj).h.o(null, i8d.c);
                return Unit.f46060a;
            case 6:
                uql0 uql0Var = (uql0) obj;
                int i2 = uql0Var == null ? -1 : mlb0.f21981a[uql0Var.ordinal()];
                if (i2 == 1) {
                    return fsm.f10071a;
                }
                if (i2 == 2) {
                    return lsm.f20587a;
                }
                if (i2 != 3) {
                    return i2 != 4 ? osm.f25788a : rsm.f31038a;
                }
                return ism.f15311a;
            case 7:
                return Boolean.valueOf(rmb0.m((rmb0) obj));
            case 8:
                return kotlin.collections.a.c(new j2x(((tpb0) ((w5z) obj).f38604a).getResources().getDimensionPixelSize(R.dimen.corner_radius_8)));
            case 9:
                spb0 spb0Var = (spb0) obj;
                TextPaint textPaint = new TextPaint();
                tpb0 tpb0Var = spb0Var.f32584a;
                Context context = tpb0Var.getContext();
                context.getClass();
                r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_L);
                textPaint.setAntiAlias(true);
                TypedValue typedValue = j5d.f15927a;
                Context context2 = tpb0Var.getContext();
                context2.getClass();
                textPaint.setColor(context2.getColor(R.color.static_white));
                textPaint.setTextSize(spb0Var.b);
                return textPaint;
            case 10:
                ((zrb0) obj).i();
                return Unit.f46060a;
            case 11:
                File file = (File) ((qw80) obj).invoke();
                if (!k0q.e(file).equals("preferences_pb")) {
                    c99.t(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    return null;
                }
                File absoluteFile = file.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 12:
                uwb0 uwb0Var = (uwb0) obj;
                return n2x.w(uwb0Var.f36384a, uwb0Var.b);
            case 13:
                wwb0 wwb0Var = (wwb0) obj;
                return n2x.w(wwb0Var.f39879a, wwb0Var.b);
            case 14:
                xwb0 xwb0Var = (xwb0) obj;
                return n2x.w(xwb0Var.f41603a, xwb0Var.b);
            case 15:
                ((out0) obj).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                String string = uuidRandomUUID.toString();
                string.getClass();
                return string;
            case 16:
                pz40 pz40Var = s6t0.f31722a;
                return new iol(s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary(), ((a8c0) obj).d, jol.b);
            case 17:
                npi npiVar = ((n9c0) obj).Q1;
                if (npiVar != null) {
                    return new q0h0(npiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 18:
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) obj;
                p7m0 p7m0Var5 = bVar.i.f25029a;
                do {
                    value4 = p7m0Var5.getValue();
                    value4.getClass();
                    bVar.f.getClass();
                } while (!p7m0Var5.m(value4, iac0.a((iac0) value4, null, false, null, null, null, null, false, false, false, 8187)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                pac0 pac0Var = (pac0) obj;
                p7m0 p7m0Var6 = pac0Var.i.f25029a;
                do {
                    value5 = p7m0Var6.getValue();
                    value5.getClass();
                    pac0Var.f.getClass();
                } while (!p7m0Var6.m(value5, jac0.a((jac0) value5, false, false, false, null, null, 30)));
                return Unit.f46060a;
            case 20:
                sec0 sec0Var = (sec0) obj;
                p7m0 p7m0Var7 = sec0Var.i.f25029a;
                do {
                    value6 = p7m0Var7.getValue();
                    value6.getClass();
                    bec0Var = (bec0) value6;
                    sec0Var.f.getClass();
                } while (!p7m0Var7.m(value6, bec0.a(bec0Var, null, null, null, false, false, false, false, false, null, false, kdc0.a(bec0Var.p, 0, false, 119), 32767)));
                return Unit.f46060a;
            case 21:
                return Integer.valueOf(((vgc0) obj).ordinal());
            case 22:
                bby bbyVar3 = ((jhc0) obj).m;
                if (bbyVar3 != null) {
                    v3c.N(bbyVar3);
                }
                return Unit.f46060a;
            case 23:
                iiy[] iiyVarArr = vic0.S1;
                return new ko60((vic0) obj, (byte) 8);
            case 24:
                kjc0 kjc0Var = (kjc0) obj;
                iiy[] iiyVarArr2 = kjc0.P1;
                kjc0Var.K0().y();
                if (kjc0Var.K0().p.getValue() instanceof tjc0) {
                    kjc0Var.L0(true);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gkc0 gkc0Var = (gkc0) obj;
                if (d5c.R(jiu0.a(gkc0Var))) {
                    gkc0Var.w();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                iiy[] iiyVarArr3 = ikc0.O1;
                return new ko60((ikc0) obj, b2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                dtc0 dtc0Var = (dtc0) obj;
                p7m0 p7m0Var8 = dtc0Var.i.f25029a;
                do {
                    value7 = p7m0Var8.getValue();
                    value7.getClass();
                    dtc0Var.f.getClass();
                } while (!p7m0Var8.m(value7, rrc0.a((rrc0) value7, null, 0, false, false, null, false, false, false, 65531)));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                KeyEvent.Callback callback = (View) obj;
                callback.getClass();
                return (kuc0) callback;
            default:
                fiu0 fiu0Var2 = ((g1d0) obj).K1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}

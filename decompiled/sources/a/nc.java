package a;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.wallet.impl.presentation.dialogs.accountactions.params.AccountActionsScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23266a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nc(c1a c1aVar, AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        this.f23266a = (byte) 8;
        this.b = c1aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.util.Range] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f23266a;
        int i = 0;
        Object obj = 0;
        obj = 0;
        obj = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hfk0 hfk0Var = qc.n2;
                fiu0 fiu0Var = ((qc) obj2).k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                AccountActionsScreenParams accountActionsScreenParams = (AccountActionsScreenParams) obj2;
                long j = accountActionsScreenParams.b;
                String str = accountActionsScreenParams.c;
                return new sc(accountActionsScreenParams.f, j, accountActionsScreenParams.d, str, accountActionsScreenParams.e, accountActionsScreenParams.g);
            case 2:
                uf ufVar = (uf) obj2;
                sac.V(jiu0.a(ufVar), new t1(ufVar, (byte) 7), null, null, new l1(ufVar, obj, (byte) 4), 14);
                return Unit.f46060a;
            case 3:
                wj wjVar = (wj) obj2;
                byte b2 = 1;
                sac.V(jiu0.a(wjVar), new dj(wjVar, b2), null, null, new ya(wjVar, obj, b2), 14);
                return Unit.f46060a;
            case 4:
                return ((um) obj2).f35897a;
            case 5:
                p7m0 p7m0Var = ((pv) obj2).o;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, jv.a((jv) value, false, null, null, false, false, null, 62)));
                return Unit.f46060a;
            case 6:
                iiy[] iiyVarArr = ew.Q1;
                fiu0 fiu0Var2 = ((ew) obj2).M1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 7:
                hfk0 hfk0Var2 = vx.P1;
                fiu0 fiu0Var3 = ((vx) obj2).M1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 8:
                CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                key.getClass();
                Range[] rangeArr = (Range[]) ((ow9) ((c1a) obj2)).c(key);
                if (rangeArr != null && rangeArr.length != 0) {
                    int length = rangeArr.length;
                    while (i < length) {
                        Range range = rangeArr[i];
                        Integer numValueOf = (Integer) range.getUpper();
                        Integer numValueOf2 = (Integer) range.getLower();
                        if (((Number) range.getUpper()).intValue() >= 1000) {
                            numValueOf = Integer.valueOf(((Number) range.getUpper()).intValue() / 1000);
                        }
                        if (((Number) range.getLower()).intValue() >= 1000) {
                            numValueOf2 = Integer.valueOf(((Number) range.getLower()).intValue() / 1000);
                        }
                        Range range2 = new Range(numValueOf2, numValueOf);
                        Integer num = (Integer) range2.getUpper();
                        if (num != null && num.intValue() == 30 && (obj == 0 || ((Number) range2.getLower()).intValue() < ((Number) obj.getLower()).intValue())) {
                            obj = range2;
                        }
                        i++;
                        obj = obj;
                    }
                }
                return obj;
            case 9:
                return (s70) ((r80) obj2).f30002a.b(sre0.f32672a.b(s70.class));
            case 10:
                return (cq0) ((gii0) ((khf0) obj2).b).b(sre0.f32672a.b(cq0.class));
            case 11:
                return Integer.valueOf(((vn0) ((xn0) obj2)).c ? 1 : 0);
            case 12:
                l7i l7iVar = ((jq0) obj2).N1;
                if (l7iVar != null) {
                    return new q0h0(l7iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 13:
                nul nulVar = nul.e;
                oe9 oe9Var = oe9.f25112a;
                ctf0 ctf0Var = ((wr0) obj2).b;
                return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var.b.a(R.string.reset, Arrays.copyOf(new Object[0], 0))), true, false, true), ql1.f28912a), new itl(new wul(lul.e, oe9Var, new ue9(ctf0Var.b.a(R.string.show, Arrays.copyOf(new Object[0], 0))), true, false, true), va0.f37060a)));
            case 14:
                gfk0 gfk0Var = uu0.o2;
                fiu0 fiu0Var4 = ((uu0) obj2).m2;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 15:
                rek0 rek0Var = q21.O1;
                t1 t1Var = new t1((q21) obj2, (byte) 29);
                o21 o21Var = new o21(ek5.h);
                o21Var.d.b(zjb.B(t1Var));
                return o21Var;
            case 16:
                return (u41) ((gii0) ((xr) obj2).f41344a).b(sre0.f32672a.b(u41.class));
            case 17:
                return new ga1(((iqt) obj2).f15225a.a());
            case 18:
                hfk0 hfk0Var3 = je1.S1;
                fiu0 fiu0Var5 = ((je1) obj2).L1;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (bx0) ((gii0) ((xex) obj2).f40764a).b(sre0.f32672a.b(bx0.class));
            case 20:
                bby bbyVar = ((mh1) obj2).g0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            case 21:
                fiu0 fiu0Var6 = ((qj1) obj2).K1;
                if (fiu0Var6 != null) {
                    return fiu0Var6;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 22:
                rek0 rek0Var2 = lk1.U1;
                fiu0 fiu0Var7 = ((lk1) obj2).M1;
                if (fiu0Var7 != null) {
                    return fiu0Var7;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 23:
                return (sa0) ((gii0) ((chf0) obj2).b).b(sre0.f32672a.b(sa0.class));
            case 24:
                return (ar1) ((gii0) ((yzn0) obj2).f43523a).b(sre0.f32672a.b(ar1.class));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(((ru1) obj2).b);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((uv1) obj2).Q();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rek0 rek0Var3 = ty1.R1;
                fiu0 fiu0Var8 = ((ty1) obj2).L1;
                if (fiu0Var8 != null) {
                    return fiu0Var8;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((le2) obj2).y.a();
            default:
                return Float.valueOf(((w6k) obj2).w0(125.0f));
        }
    }

    public /* synthetic */ nc(Object obj, byte b) {
        this.f23266a = b;
        this.b = obj;
    }
}

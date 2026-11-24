package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wil implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39219a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ wil(pz40 pz40Var, byte b) {
        this.f39219a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39219a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                zai0 zai0Var = cbi0.m;
                Boolean bool = (Boolean) pz40Var.getValue();
                bool.getClass();
                abi0Var.b(zai0Var, bool);
                break;
            case 1:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var.f()));
                break;
            case 2:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.d(abi0Var2, ((Boolean) pz40Var.getValue()).booleanValue());
                break;
            case 3:
                pz40Var.setValue(Boolean.FALSE);
                break;
            case 4:
                a9q0 a9q0Var2 = (a9q0) obj;
                a9q0Var2.getClass();
                pz40Var.setValue(new ycl((int) (a9q0Var2.c >> 32)));
                break;
            case 5:
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                pz40Var.setValue(lz3Var);
                break;
            case 6:
                ((kz3) obj).getClass();
                pz40Var.setValue(Boolean.TRUE);
                break;
            case 7:
                ((iz3) obj).getClass();
                pz40Var.setValue(Boolean.FALSE);
                break;
            case 8:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                daq0 daq0Var = (daq0) pz40Var.getValue();
                long j = daq0Var.f5764a;
                zai0 zai0Var2 = cbi0.o;
                iiy iiyVar = cbi0.f4063a[12];
                zai0Var2.getClass();
                abi0Var3.b(zai0Var2, daq0Var);
                break;
            case 9:
                abi0 abi0Var4 = (abi0) obj;
                abi0Var4.getClass();
                zai0 zai0Var3 = cbi0.m;
                Boolean bool2 = (Boolean) pz40Var.getValue();
                bool2.getClass();
                abi0Var4.b(zai0Var3, bool2);
                break;
            case 10:
                a9q0 a9q0Var3 = (a9q0) obj;
                a9q0Var3.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var3.f()));
                break;
            case 11:
                ((Float) obj).getClass();
                pz40Var.setValue(Boolean.FALSE);
                break;
            case 12:
                pz40Var.setValue((String) obj);
                break;
            case 13:
                ((kz3) obj).getClass();
                pz40Var.setValue(Boolean.TRUE);
                break;
            case 14:
                ((iz3) obj).getClass();
                pz40Var.setValue(Boolean.FALSE);
                break;
            case 15:
                abi0 abi0Var5 = (abi0) obj;
                abi0Var5.getClass();
                zai0 zai0Var4 = cbi0.m;
                Boolean bool3 = (Boolean) pz40Var.getValue();
                bool3.getClass();
                abi0Var5.b(zai0Var4, bool3);
                break;
            case 16:
                a9q0 a9q0Var4 = (a9q0) obj;
                a9q0Var4.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var4.f()));
                break;
            case 17:
                abi0 abi0Var6 = (abi0) obj;
                abi0Var6.getClass();
                zai0 zai0Var5 = cbi0.m;
                Boolean bool4 = (Boolean) pz40Var.getValue();
                bool4.getClass();
                abi0Var6.b(zai0Var5, bool4);
                break;
            case 18:
                a9q0 a9q0Var5 = (a9q0) obj;
                a9q0Var5.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var5.f()));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                o0x o0xVar = (o0x) obj;
                o0xVar.getClass();
                n0x n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                pz40Var.setValue(n0xVar != null ? n0xVar.f22722a : null);
                break;
            case 20:
                o0x o0xVar2 = (o0x) obj;
                o0xVar2.getClass();
                n0x n0xVar2 = o0xVar2 instanceof n0x ? (n0x) o0xVar2 : null;
                pz40Var.setValue(n0xVar2 != null ? n0xVar2.f22722a : null);
                break;
            case 21:
                pz40Var.setValue((qkx) obj);
                break;
            case 22:
                pz40Var.setValue((String) obj);
                break;
            case 23:
                kz3 kz3Var = (kz3) obj;
                kz3Var.getClass();
                pz40Var.setValue(kz3Var.f19135a);
                break;
            case 24:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                pz40Var.setValue(bool5);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                kz3 kz3Var2 = (kz3) obj;
                kz3Var2.getClass();
                pz40Var.setValue(kz3Var2.f19135a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kz3 kz3Var3 = (kz3) obj;
                kz3Var3.getClass();
                pz40Var.setValue(kz3Var3.f19135a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                pz40Var.setValue(bool6);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                t33 t33Var = (t33) obj;
                t33Var.getClass();
                pz40Var.setValue(t33Var.d());
                break;
            default:
                a4x a4xVar = (a4x) obj;
                a4xVar.getClass();
                if (!a4xVar.isEmpty()) {
                    pz40Var.setValue(dyb.r0(a4xVar));
                }
                break;
        }
        return Unit.f46060a;
    }
}

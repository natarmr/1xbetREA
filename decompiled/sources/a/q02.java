package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q02 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27873a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q02(boolean z, s4i s4iVar, qao0 qao0Var, int i) {
        this.f27873a = (byte) 26;
        this.c = z;
        this.d = s4iVar;
        this.e = qao0Var;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27873a;
        boolean z = this.c;
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                ffb0.b((a4x) obj4, z, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                ro4.o((mm40) obj4, this.b, (uh90) obj3, this.c, (fet) obj, iL);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ro4.n((mm40) obj4, (gea) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                zgc.i((bya) obj4, z, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                j120.l((i9q) obj4, z, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                acb.f((mm40) obj4, (nxe) obj3, (fet) obj, x8x.L(i | 1), z ? 1 : 0);
                break;
            case 6:
                ((Integer) obj2).intValue();
                vdb.R((String) obj4, z, (r0n) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                thb.f((mm40) obj4, (uf5) obj3, (fet) obj, x8x.L(i | 1), z ? 1 : 0);
                break;
            case 8:
                ((Integer) obj2).getClass();
                obb.F((mm40) obj4, (y1m) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                lgb.r(obj4, z, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                xkb.A((j8n) obj4, z, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                k9m.a((mm40) obj4, (l9m) obj3, (fet) obj, x8x.L(i | 1), z ? 1 : 0);
                break;
            case 12:
                ((Integer) obj2).intValue();
                qcc.C((prm) obj4, z, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ohq0.K((mm40) obj4, (gvm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                dub.f((mm40) obj4, (mpm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                dub.O((mm40) obj4, (ivm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                wvb.D((mm40) obj4, (jvm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                jwb.u((mm40) obj4, (kvm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                vfc.p((mm40) obj4, z, (nxm) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                hic.n((mm40) obj4, (oxm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                vic.h((mm40) obj4, (pxm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                plc.l((mm40) obj4, (qxm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                lmc.p((mm40) obj4, (rxm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                wwb.t((mm40) obj4, (wzm) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                aac.A((mm40) obj4, (j1n) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                bsr0.F((mm40) obj4, (c1n) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                z5n.b(z, (s4i) obj4, (qao0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                wvb.y((mm40) obj4, (j83) obj3, (fet) obj, x8x.L(i | 1), z ? 1 : 0);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                hmw0.B((mm40) obj4, (uvv) obj3, z, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                h8x.f((mm40) obj4, (l3w) obj3, (fet) obj, x8x.L(i | 1), z ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ q02(mm40 mm40Var, int i, uh90 uh90Var, boolean z, int i2) {
        this.f27873a = (byte) 1;
        this.d = mm40Var;
        this.b = i;
        this.e = uh90Var;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q02(mm40 mm40Var, Object obj, int i, int i2, byte b) {
        this.f27873a = b;
        this.d = mm40Var;
        this.e = obj;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ q02(Object obj, boolean z, Object obj2, int i, byte b) {
        this.f27873a = b;
        this.d = obj;
        this.c = z;
        this.e = obj2;
        this.b = i;
    }

    public /* synthetic */ q02(byte b, int i, mm40 mm40Var, Object obj, boolean z) {
        this.f27873a = b;
        this.d = mm40Var;
        this.e = obj;
        this.c = z;
        this.b = i;
    }
}

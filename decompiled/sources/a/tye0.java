package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;

/* JADX INFO: loaded from: classes5.dex */
public final class tye0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tye0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                tye0 tye0Var = new tye0((qye0) obj2, yjeVar, (byte) 0);
                tye0Var.j = obj;
                return tye0Var;
            case 1:
                tye0 tye0Var2 = new tye0((qye0) obj2, yjeVar, (byte) 1);
                tye0Var2.j = obj;
                return tye0Var2;
            case 2:
                tye0 tye0Var3 = new tye0((d7f0) obj2, yjeVar, (byte) 2);
                tye0Var3.j = obj;
                return tye0Var3;
            case 3:
                tye0 tye0Var4 = new tye0((qye0) obj2, yjeVar, (byte) 3);
                tye0Var4.j = obj;
                return tye0Var4;
            case 4:
                tye0 tye0Var5 = new tye0((hef0) obj2, yjeVar, (byte) 4);
                tye0Var5.j = obj;
                return tye0Var5;
            case 5:
                tye0 tye0Var6 = new tye0((sef0) obj2, yjeVar, (byte) 5);
                tye0Var6.j = obj;
                return tye0Var6;
            case 6:
                return new tye0((wjd) this.j, (lkz) obj2, yjeVar, (byte) 6);
            case 7:
                tye0 tye0Var7 = new tye0((vff0) obj2, yjeVar, (byte) 7);
                tye0Var7.j = obj;
                return tye0Var7;
            case 8:
                return new tye0((vff0) this.j, (rhi0) obj2, yjeVar, (byte) 8);
            case 9:
                tye0 tye0Var8 = new tye0((dwf0) obj2, yjeVar, (byte) 9);
                tye0Var8.j = obj;
                return tye0Var8;
            case 10:
                tye0 tye0Var9 = new tye0((sxf0) obj2, yjeVar, (byte) 10);
                tye0Var9.j = obj;
                return tye0Var9;
            case 11:
                tye0 tye0Var10 = new tye0((nyf0) obj2, yjeVar, (byte) 11);
                tye0Var10.j = obj;
                return tye0Var10;
            case 12:
                tye0 tye0Var11 = new tye0((m8g0) obj2, yjeVar, (byte) 12);
                tye0Var11.j = obj;
                return tye0Var11;
            case 13:
                tye0 tye0Var12 = new tye0((o9g0) obj2, yjeVar, (byte) 13);
                tye0Var12.j = obj;
                return tye0Var12;
            case 14:
                return new tye0((pbg0) this.j, (nbg0) obj2, yjeVar, (byte) 14);
            case 15:
                return new tye0((Function1) this.j, (hgg0) obj2, yjeVar, (byte) 15);
            case 16:
                return new tye0((Function1) this.j, (ogg0) obj2, yjeVar, (byte) 16);
            case 17:
                return new tye0((ukg0) this.j, (byte[]) obj2, yjeVar, (byte) 17);
            case 18:
                tye0 tye0Var13 = new tye0((Function2) obj2, yjeVar, (byte) 18);
                tye0Var13.j = obj;
                return tye0Var13;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new tye0((cxg0) this.j, (String) obj2, yjeVar, (byte) 19);
            case 20:
                return new tye0((cxg0) this.j, (SaleDataModel) obj2, yjeVar, (byte) 20);
            case 21:
                tye0 tye0Var14 = new tye0((l6h0) obj2, yjeVar, (byte) 21);
                tye0Var14.j = obj;
                return tye0Var14;
            case 22:
                tye0 tye0Var15 = new tye0((hlh0) obj2, yjeVar, (byte) 22);
                tye0Var15.j = obj;
                return tye0Var15;
            case 23:
                tye0 tye0Var16 = new tye0((joh0) obj2, yjeVar, (byte) 23);
                tye0Var16.j = obj;
                return tye0Var16;
            case 24:
                tye0 tye0Var17 = new tye0((cqh0) obj2, yjeVar, (byte) 24);
                tye0Var17.j = obj;
                return tye0Var17;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                tye0 tye0Var18 = new tye0((zzh0) obj2, yjeVar, (byte) 25);
                tye0Var18.j = obj;
                return tye0Var18;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new tye0((ezh0) this.j, (zzh0) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                tye0 tye0Var19 = new tye0((g1i0) obj2, yjeVar, (byte) 27);
                tye0Var19.j = obj;
                return tye0Var19;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                tye0 tye0Var20 = new tye0((s7i0) obj2, yjeVar, (byte) 28);
                tye0Var20.j = obj;
                return tye0Var20;
            default:
                tye0 tye0Var21 = new tye0((t8i0) obj2, yjeVar, (byte) 29);
                tye0Var21.j = obj;
                return tye0Var21;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tye0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tye0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((tye0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((tye0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((tye0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((tye0) create((ldf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((tye0) create((hwf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((tye0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((tye0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((tye0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((tye0) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((tye0) create((r6h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((tye0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((tye0) create((zoh0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((tye0) create((yqh0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((tye0) create((edw) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((tye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((tye0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((tye0) create((a8i0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tye0) create((y8i0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028b  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:155:0x03da  */
    /* JADX WARN: Code duplicated, block: B:158:0x03df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x026e  */
    /* JADX WARN: Code duplicated, block: B:91:0x027c  */
    /* JADX WARN: Code duplicated, block: B:92:0x027e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0286  */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x098c, code lost:
    
        if ((r0 instanceof a.m6h0) != false) goto L277;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 3344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tye0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tye0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}

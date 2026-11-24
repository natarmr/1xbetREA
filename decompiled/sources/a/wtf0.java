package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wtf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39738a;

    public /* synthetic */ wtf0(aeg0 aeg0Var) {
        this.f39738a = (byte) 12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 16;
        switch (this.f39738a) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ui80(cpVar, b));
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 2:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 3:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 4:
                ((y3g0) obj).getClass();
                return new kun((byte) 5);
            case 5:
                j2g0 j2g0Var = (j2g0) obj;
                j2g0Var.getClass();
                return new w3g0(j2g0Var);
            case 6:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                String str = (String) CollectionsKt.W(1, matchResult.a());
                if (str == null) {
                    str = "";
                }
                return b6g0.b.replace(str, "");
            case 7:
                nla nlaVar = (nla) obj;
                nlaVar.getClass();
                return nlaVar.getKey();
            case 8:
                nll0 nll0Var = (nll0) obj;
                nll0Var.getClass();
                return new d9g0(nll0Var);
            case 9:
                ((Unit) obj).getClass();
                return Boolean.TRUE;
            case 10:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 11:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.c(abi0Var, R.drawable.ic_glyph_circle_warning);
                return Unit.f46060a;
            case 12:
                ((rcj) obj).getClass();
                throw new q660(null, 1, null);
            case 13:
                obj.getClass();
                return "Unexpected DAO return type converter " + obj + ". Annotate DaoReturnTypeConverter class with @ProvidedDaoReturnTypeConverter annotation or remove this converter from the builder.";
            case 14:
                obj.getClass();
                return "Unexpected column type converter " + obj + ". Annotate ColumnTypeConverter class with @ProvidedColumnTypeConverter annotation or remove this converter from the builder.";
            case 15:
                return Unit.f46060a;
            case 16:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new ctv(cpVar2, cpVar2, (byte) 20));
                return Unit.f46060a;
            case 17:
                ((Integer) obj).getClass();
                return sre0.f32672a.b(Integer.TYPE);
            case 18:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                qgg0 qgg0Var = new qgg0();
                ((cth) cpVar3.u).b.setAdapter(qgg0Var);
                cpVar3.t(new dff0(qgg0Var, cpVar3, b));
                return Unit.f46060a;
            case 20:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new ctv(cpVar4, cpVar4, (byte) 21));
                return Unit.f46060a;
            case 21:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(300, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(300, 0, null, 6), 2));
            case 22:
                return new dmg0(((Float) obj).floatValue());
            case 23:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 24:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 4, null, null, y0x0.e, 6);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ykg0 ykg0Var = (ykg0) obj;
                ykg0Var.getClass();
                return Boolean.valueOf(ykg0Var.f42786a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                o8w o8wVar = (o8w) obj;
                o8wVar.getClass();
                return o8wVar.getKey();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                Boolean bool = (Boolean) feeVar.c();
                bool.booleanValue();
                return bool;
            default:
                fee feeVar2 = (fee) obj;
                feeVar2.getClass();
                pn40 pn40Var = pn40.f27267a;
                return pn40.c(((Number) feeVar2.c()).doubleValue(), p3u0.c);
        }
    }

    public /* synthetic */ wtf0(byte b) {
        this.f39738a = b;
    }
}

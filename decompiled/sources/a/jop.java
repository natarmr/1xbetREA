package a;

import android.os.Bundle;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jop implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16869a;
    public final /* synthetic */ rop b;

    public /* synthetic */ jop(rop ropVar, byte b) {
        this.f16869a = b;
        this.b = ropVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16869a;
        rop ropVar = this.b;
        switch (b) {
            case 0:
                chq0 chq0Var = (chq0) obj;
                nek nekVar = rop.a2;
                chq0Var.getClass();
                ropVar.N0().x(new gjp(chq0Var));
                break;
            case 1:
                ygq0 ygq0Var = (ygq0) obj;
                nek nekVar2 = rop.a2;
                ygq0Var.getClass();
                ropVar.N0().x(new tjp(ygq0Var));
                break;
            case 2:
                Date date = (Date) obj;
                nek nekVar3 = rop.a2;
                date.getClass();
                ropVar.N0().x(new sjp(date));
                break;
            case 3:
                Date date2 = (Date) obj;
                nek nekVar4 = rop.a2;
                date2.getClass();
                ropVar.N0().x(new rjp(date2));
                break;
            case 4:
                i2i0 i2i0Var = (i2i0) obj;
                nek nekVar5 = rop.a2;
                i2i0Var.getClass();
                ropVar.N0().x(new sjp(i2i0Var.f14049a));
                ropVar.N0().x(new rjp(i2i0Var.b));
                break;
            default:
                nek nekVar6 = rop.a2;
                ((Bundle) obj).getClass();
                ropVar.N0().x(qjp.f28850a);
                break;
        }
        return Unit.f46060a;
    }
}

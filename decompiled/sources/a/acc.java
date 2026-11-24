package a;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit_sport.sport_coupon_card.common.DsSportCouponCard;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class acc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f620a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ wdr g;
    public final /* synthetic */ Object h;

    public /* synthetic */ acc(a4x a4xVar, vxl vxlVar, syl sylVar, jyl jylVar, boolean z, Function1 function1, Function1 function2) {
        this.c = a4xVar;
        this.d = vxlVar;
        this.e = sylVar;
        this.f = jylVar;
        this.b = z;
        this.g = function1;
        this.h = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f620a;
        boolean z = this.b;
        Object obj2 = this.h;
        wdr wdrVar = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                a4x a4xVar = (a4x) obj6;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), null, new dx8(a4xVar, (byte) 9), new ugd(802480018, true, new hcc(a4xVar, (vxl) obj5, (syl) obj4, (jyl) obj3, this.b, (Function1) wdrVar, (Function1) obj2)));
                return Unit.f46060a;
            case 1:
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj4;
                Function0 function2 = (Function0) obj3;
                Function0 function3 = (Function0) wdrVar;
                Function0 function4 = (Function0) obj2;
                Context context = (Context) obj;
                context.getClass();
                DsSportCouponCard dsSportCouponCard = new DsSportCouponCard(context, null, 6);
                dsSportCouponCard.a((String) obj6);
                dsSportCouponCard.setRtlSupportEnabled(z);
                if (function0 != null) {
                    dsSportCouponCard.setCancelButtonClickListener(new cjl(function0, (byte) 18));
                }
                if (function1 != null) {
                    dsSportCouponCard.setMoveButtonClickListener(new cjl(function1, (byte) 19));
                }
                if (function2 != null) {
                    dsSportCouponCard.setAutoSubClickListener(new cjl(function2, (byte) 20));
                }
                if (function3 != null) {
                    dsSportCouponCard.setOptionBetClickListener(new cjl(function3, (byte) 21));
                }
                if (function4 != null) {
                    dsSportCouponCard.setEachWayClickListener(new cjl(function4, (byte) 22));
                }
                return dsSportCouponCard;
            default:
                xpj0 xpj0Var = (xpj0) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                Function0 function5 = (Function0) wdrVar;
                vne vneVar = (vne) obj2;
                abi0 abi0Var = (abi0) obj;
                if (z) {
                    a2z a2zVar = new a2z(function5, (byte) 14);
                    iiy[] iiyVarArr = yai0.f42300a;
                    abi0Var.b(mai0.v, new m6(str, a2zVar));
                    ypj0 ypj0VarC = xpj0Var.c();
                    ypj0 ypj0Var = ypj0.c;
                    if (ypj0VarC == ypj0Var) {
                        abi0Var.b(mai0.t, new m6(str2, new g8l(xpj0Var, vneVar, xpj0Var, (byte) 25)));
                    } else if (xpj0Var.e.j().f23849a.containsKey(ypj0Var)) {
                        abi0Var.b(mai0.u, new m6(str3, new vp8(xpj0Var, vneVar, (byte) 4)));
                    }
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ acc(String str, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4) {
        this.c = str;
        this.b = z;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = function3;
        this.h = function4;
    }

    public /* synthetic */ acc(boolean z, xpj0 xpj0Var, String str, String str2, String str3, Function0 function0, vne vneVar) {
        this.b = z;
        this.c = xpj0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = function0;
        this.h = vneVar;
    }
}

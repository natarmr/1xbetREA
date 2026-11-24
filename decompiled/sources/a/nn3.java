package a;

import android.os.Build;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.app_update.api.presentation.AppUpdateScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class nn3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ on3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn3(on3 on3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = on3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        on3 on3Var = this.k;
        switch (b) {
            case 0:
                return new nn3(on3Var, yjeVar, (byte) 0);
            case 1:
                nn3 nn3Var = new nn3(on3Var, yjeVar, (byte) 1);
                nn3Var.j = ((Boolean) obj).booleanValue();
                return nn3Var;
            default:
                return new nn3(on3Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nn3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((nn3) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nn3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objG;
        an3 an3Var;
        p7m0 p7m0Var;
        Object value;
        Object value2;
        Object value3;
        Object objH;
        Object value4;
        byte b = this.i;
        on3 on3Var = this.k;
        an3 an3VarM = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (Build.VERSION.SDK_INT >= 29) {
                        nmo nmoVar = on3Var.g;
                        this.j = true;
                        objG = nmoVar.g(this);
                        if (objG == wneVar) {
                            return wneVar;
                        }
                    }
                    an3Var = an3VarM;
                    p7m0Var = on3Var.r;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, um3.a((um3) value, null, an3Var, null, null, false, false, false, false, false, 98299)));
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objG = obj;
                an3VarM = wb.M((ne5) objG, on3Var.q);
                an3Var = an3VarM;
                p7m0Var = on3Var.r;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, um3.a((um3) value, null, an3Var, null, null, false, false, false, false, false, 98299)));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = on3Var.r;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, um3.a((um3) value2, null, null, null, null, false, false, false, false, z2, 126975)));
                return Unit.f46060a;
            default:
                p7m0 p7m0Var3 = on3Var.s;
                p7m0 p7m0Var4 = on3Var.r;
                AppUpdateScreenParams appUpdateScreenParams = on3Var.c;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    g2v g2vVar = on3Var.j;
                    String str = appUpdateScreenParams.c;
                    g2vVar.getClass();
                    str.getClass();
                    hk3 hk3Var = (hk3) ((mii0) g2vVar.f10580a).e;
                    hk3Var.getClass();
                    File file = new File(hk3Var.f13190a.getFilesDir(), ".CWAC-Update");
                    file.mkdirs();
                    String[] list = file.list();
                    if (list == null || !tx3.u(hk3.b(str), list)) {
                        do {
                            value3 = p7m0Var4.getValue();
                        } while (!p7m0Var4.m(value3, um3.a((um3) value3, null, null, null, null, false, true, false, false, false, 130559)));
                        ocl oclVar = on3Var.i;
                        String str2 = appUpdateScreenParams.f46323a;
                        this.j = true;
                        objH = oclVar.h(str2, this);
                        if (objH == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        tl3 tl3Var = new tl3(on3Var.m.d(appUpdateScreenParams.c), ((um3) p7m0Var4.getValue()).f);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, tl3Var);
                    }
                    do {
                        value4 = p7m0Var4.getValue();
                    } while (!p7m0Var4.m(value4, um3.a((um3) value4, null, null, null, null, false, false, false, false, false, 114687)));
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objH = obj;
                sl3 sl3Var = new sl3(appUpdateScreenParams.c, (String) objH);
                p7m0Var3.getClass();
                p7m0Var3.o(null, sl3Var);
                do {
                    value4 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value4, um3.a((um3) value4, null, null, null, null, false, false, false, false, false, 114687)));
                return Unit.f46060a;
        }
    }
}

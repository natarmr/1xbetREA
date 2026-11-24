package a;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rzc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ uzc l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzc(uzc uzcVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = uzcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        uzc uzcVar = this.l;
        switch (b) {
            case 0:
                rzc rzcVar = new rzc(uzcVar, yjeVar, (byte) 0);
                rzcVar.k = obj;
                return rzcVar;
            default:
                rzc rzcVar2 = new rzc(uzcVar, yjeVar, (byte) 1);
                rzcVar2.k = obj;
                return rzcVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((rzc) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rzc) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        uzc uzcVar = this.l;
        switch (b) {
            case 0:
                final hzb0 hzb0Var = (hzb0) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: a.qzc
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                            if (str != null && str.hashCode() == -585772018 && str.equals("COEF_TYPE_ID")) {
                                hzb0Var.f(Unit.f46060a);
                            }
                        }
                    };
                    uzcVar.f36530a.a().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    yw9 yw9Var = new yw9(uzcVar, onSharedPreferenceChangeListener, (byte) 15);
                    this.k = null;
                    this.j = true;
                    if (q7x.t(hzb0Var, yw9Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                kmq kmqVar = (kmq) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jvn jvnVarB = uzcVar.b();
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(jvnVarB, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}

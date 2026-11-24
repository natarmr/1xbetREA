package a;

import android.view.View;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h4c0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12428a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q4 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h4c0(q4 q4Var, Object obj, int i, byte b) {
        this.f12428a = b;
        this.c = q4Var;
        this.d = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f12428a;
        int i = this.b;
        Object obj = this.d;
        q4 q4Var = this.c;
        switch (b) {
            case 0:
                hvw hvwVar = (hvw) obj;
                Function2 function2 = ((j4c0) q4Var).g;
                if (function2 != null) {
                    function2.invoke(hvwVar, Integer.valueOf(i));
                }
                break;
            default:
                euc0 euc0Var = (euc0) obj;
                Function2 function3 = ((xtc0) q4Var).i;
                if (function3 != null) {
                    function3.invoke(euc0Var, Integer.valueOf(i));
                }
                break;
        }
    }
}

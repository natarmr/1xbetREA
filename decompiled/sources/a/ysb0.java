package a;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ysb0 implements nae0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43160a;
    public final ugf0 b;
    public final Function1 c;
    public final vne d;
    public final Object e = new Object();
    public volatile xsb0 f;

    public ysb0(String str, ugf0 ugf0Var, Function1 function1, vne vneVar) {
        this.f43160a = str;
        this.b = ugf0Var;
        this.c = function1;
        this.d = vneVar;
    }

    @Override // a.nae0
    public final Object n(iiy iiyVar, Object obj) {
        xsb0 xsb0Var;
        Context context = (Context) obj;
        context.getClass();
        iiyVar.getClass();
        xsb0 xsb0Var2 = this.f;
        if (xsb0Var2 != null) {
            return xsb0Var2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    ugf0 ugf0Var = this.b;
                    Function1 function1 = this.c;
                    applicationContext.getClass();
                    List list = (List) function1.invoke(applicationContext);
                    vne vneVar = this.d;
                    qw80 qw80Var = new qw80((Object) applicationContext, (Object) this, (byte) 29);
                    list.getClass();
                    this.f = new xsb0(new xsb0(new ncj(new szp(gqw0.z1, new rnp((byte) 3), new ssa0(qw80Var, (byte) 11)), kotlin.collections.a.c(new b1f((Object) list, (yje) null, (byte) 18)), ugf0Var, vneVar)));
                }
                xsb0Var = this.f;
                xsb0Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return xsb0Var;
    }
}

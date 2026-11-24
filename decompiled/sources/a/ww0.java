package a;

import android.webkit.DownloadListener;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ww0 implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39863a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ww0(Object obj, byte b) {
        this.f39863a = b;
        this.b = obj;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        byte b = this.f39863a;
        Object obj = this.b;
        switch (b) {
            case 0:
                xdr xdrVar = ((zw0) obj).g;
                if (xdrVar != null) {
                    str.getClass();
                    xdrVar.F(str, str2, str3);
                }
                break;
            case 1:
                o890 o890Var = (o890) obj;
                qog0 qog0Var = (qog0) o890Var.X1.getValue();
                if (qog0Var != null) {
                    qog0Var.f29072a.add(new q790(qog0Var, str, o890Var, str4, (byte) 1));
                    qog0Var.a();
                }
                break;
            default:
                Function1 function1 = (Function1) obj;
                if (str == null) {
                    str = "";
                }
                if (str4 == null) {
                    str4 = "";
                }
                function1.invoke(new c490(str, str4));
                break;
        }
    }
}

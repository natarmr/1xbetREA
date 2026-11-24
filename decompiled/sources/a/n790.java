package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n790 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23031a;
    public final /* synthetic */ r790 b;

    public /* synthetic */ n790(r790 r790Var, byte b) {
        this.f23031a = b;
        this.b = r790Var;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01d6  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        Uri[] uriArr;
        Uri[] uriArr2;
        byte b = this.f23031a;
        r790 r790Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                File file = (File) obj2;
                xi70 xi70Var = r790.Z1;
                file.getClass();
                if (iIntValue == -1) {
                    Uri uriC = FileProvider.c(r790Var.o0(), file, r790Var.n0().getPackageName() + ".provider");
                    uriC.getClass();
                    uriArr = new Uri[]{uriC};
                } else {
                    uriArr = null;
                }
                ValueCallback valueCallback = r790Var.S1;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(uriArr);
                }
                r790Var.S1 = null;
                break;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                Intent intent = (Intent) obj2;
                xi70 xi70Var2 = r790.Z1;
                intent.getClass();
                if (iIntValue2 == -1) {
                    qm90 qm90VarH0 = r790Var.H0();
                    Context contextO0 = r790Var.o0();
                    qm90VarH0.getClass();
                    boolean zB = qm90.b(contextO0, intent);
                    ValueCallback valueCallback2 = r790Var.S1;
                    if (!zB) {
                        if (valueCallback2 != null) {
                            valueCallback2.onReceiveValue(new Uri[0]);
                        }
                        r790Var.S1 = null;
                        break;
                    } else if (valueCallback2 != null) {
                        String dataString = intent.getDataString();
                        if (dataString == null) {
                            dataString = "";
                        }
                        uriArr2 = new Uri[]{Uri.parse(dataString)};
                    } else {
                        uriArr2 = null;
                    }
                } else {
                    uriArr2 = null;
                }
                ValueCallback valueCallback3 = r790Var.S1;
                if (valueCallback3 != null) {
                    valueCallback3.onReceiveValue(uriArr2);
                }
                r790Var.S1 = null;
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                xi70 xi70Var3 = r790.Z1;
                if (fetVar.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r790 r790Var2 = this.b;
                    k3t0 k3t0VarI0 = r790Var2.I0();
                    boolean zI = fetVar.i(r790Var2);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        objP = new xj80(1, r790Var2, r790.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feature/office/payment/impl/presentation/model/PaymentSideEffect;)V", 0, (byte) 14);
                        fetVar.o0(objP);
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(r790Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new nu80(k3t0VarI0, r790Var2, pz40VarF, null, (byte) 2);
                        fetVar.o0(objP2);
                    }
                    m0x0.t(fetVar, r790Var2, (Function2) objP2);
                    ta90 ta90Var = (ta90) ((i3t0) r790Var2.I0()).y(fetVar).getValue();
                    ctf0 ctf0Var = r790Var2.G0().o;
                    k3t0 k3t0VarI1 = r790Var2.I0();
                    boolean zI3 = fetVar.i(k3t0VarI1);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        xj80 xj80Var = new xj80(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar.o0(xj80Var);
                        objP3 = xj80Var;
                    }
                    Function1 function1 = (Function1) ((jhy) objP3);
                    boolean zI4 = fetVar.i(r790Var2);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        xj80 xj80Var2 = new xj80(1, r790Var2, r790.class, "onShowFileChooser", "onShowFileChooser(Landroid/webkit/ValueCallback;)V", 0, (byte) 16);
                        fetVar.o0(xj80Var2);
                        objP4 = xj80Var2;
                    }
                    Function1 function2 = (Function1) ((jhy) objP4);
                    boolean zI5 = fetVar.i(r790Var2);
                    Object objP5 = fetVar.P();
                    if (zI5 || objP5 == cl5Var) {
                        xj80 xj80Var3 = new xj80(1, r790Var2, r790.class, "onPermissionRequest", "onPermissionRequest(Landroid/webkit/PermissionRequest;)V", 0, (byte) 17);
                        fetVar.o0(xj80Var3);
                        objP5 = xj80Var3;
                    }
                    Function1 function3 = (Function1) ((jhy) objP5);
                    boolean zI6 = fetVar.i(r790Var2);
                    Object objP6 = fetVar.P();
                    if (zI6 || objP6 == cl5Var) {
                        xj80 xj80Var4 = new xj80(1, r790Var2, r790.class, "startIntentAction", "startIntentAction(Landroid/content/Intent;)V", 0, (byte) 18);
                        fetVar.o0(xj80Var4);
                        objP6 = xj80Var4;
                    }
                    Function1 function4 = (Function1) ((jhy) objP6);
                    boolean zI7 = fetVar.i(r790Var2);
                    Object objP7 = fetVar.P();
                    if (zI7 || objP7 == cl5Var) {
                        xj80 xj80Var5 = new xj80(1, r790Var2, r790.class, "startIntentActionAndFinish", "startIntentActionAndFinish(Landroid/content/Intent;)V", 0, (byte) 19);
                        fetVar.o0(xj80Var5);
                        objP7 = xj80Var5;
                    }
                    Function1 function5 = (Function1) ((jhy) objP7);
                    boolean zI8 = fetVar.i(r790Var2);
                    Object objP8 = fetVar.P();
                    if (zI8 || objP8 == cl5Var) {
                        xj80 xj80Var6 = new xj80(1, r790Var2, r790.class, "initWebView", "initWebView(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)V", 0, (byte) 20);
                        fetVar.o0(xj80Var6);
                        objP8 = xj80Var6;
                    }
                    hp4.p(null, ta90Var, ctf0Var, function1, function2, function3, function4, function5, (Function1) ((jhy) objP8), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}

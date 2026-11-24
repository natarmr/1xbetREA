package a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.davemorrissey.labs.subscaleview.ImageSource;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bnj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cnj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bnj0(cnj0 cnj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cnj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cnj0 cnj0Var = this.k;
        switch (b) {
            case 0:
                bnj0 bnj0Var = new bnj0(cnj0Var, yjeVar, (byte) 0);
                bnj0Var.j = obj;
                return bnj0Var;
            case 1:
                bnj0 bnj0Var2 = new bnj0(cnj0Var, yjeVar, (byte) 1);
                bnj0Var2.j = obj;
                return bnj0Var2;
            default:
                bnj0 bnj0Var3 = new bnj0(cnj0Var, yjeVar, (byte) 2);
                bnj0Var3.j = obj;
                return bnj0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bnj0) create((jm00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((bnj0) create((uxg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bnj0) create((ynj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        cnj0 cnj0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                jm00 jm00Var = (jm00) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (jm00Var != null) {
                    if (jm00Var instanceof im00) {
                        gne0 gne0Var = cnj0.R1;
                        cnj0Var.G0().j.setVisibility(0);
                        cnj0Var.G0().c.setEnabled(false);
                        cnj0Var.G0().d.setEnabled(false);
                    } else if (jm00Var instanceof gm00) {
                        gne0 gne0Var2 = cnj0.R1;
                        cnj0Var.G0().j.setVisibility(8);
                        cnj0Var.G0().c.setEnabled(true);
                        cnj0Var.G0().d.setEnabled(true);
                        cnj0Var.G0().h.setImage(ImageSource.uri(Uri.fromFile(((gm00) jm00Var).f11519a)));
                        cnj0Var.G0().e.setVisibility(8);
                        cnj0Var.G0().f.setVisibility(0);
                    } else if (jm00Var instanceof hm00) {
                        gne0 gne0Var3 = cnj0.R1;
                        cnj0Var.G0().j.setVisibility(8);
                        cnj0Var.G0().i.v(((hm00) jm00Var).f13284a);
                        cnj0Var.G0().e.setVisibility(0);
                        cnj0Var.G0().f.setVisibility(4);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                uxg0 uxg0Var = (uxg0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z = uxg0Var instanceof sxg0;
                txg0 txg0Var = txg0.f34698a;
                if (z) {
                    try {
                        File file = ((sxg0) uxg0Var).f32976a.f9883a;
                        String str = ((sxg0) uxg0Var).f32976a.b;
                        String str2 = ((sxg0) uxg0Var).f32976a.c;
                        Context contextO0 = cnj0Var.o0();
                        String str3 = cnj0.U1;
                        str3.getClass();
                        Uri uriZ0 = sj3.z0(file, contextO0, str3, str);
                        if (uriZ0 != null) {
                            cnj0Var.J0(uriZ0, str, str2);
                        }
                        p7m0 p7m0Var = cnj0Var.H0().o;
                        p7m0Var.getClass();
                        p7m0Var.o(null, txg0Var);
                    } catch (Exception e) {
                        System.out.println((Object) ("ShareCouponFragmentOld catch error: " + e));
                    }
                    break;
                } else if (!Intrinsics.d(uxg0Var, txg0Var)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            default:
                ynj0 ynj0Var = (ynj0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z2 = ynj0Var instanceof wnj0;
                xnj0 xnj0Var = xnj0.f41172a;
                if (z2) {
                    File file2 = ((wnj0) ynj0Var).f39452a;
                    Context contextO1 = cnj0Var.o0();
                    Uri uriC = FileProvider.c(contextO1, file2, "org.xbet.client1.provider");
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.STREAM", uriC);
                    intent.setType("image/*");
                    intent.addFlags(1);
                    try {
                        contextO1.startActivity(intent);
                        break;
                    } catch (ActivityNotFoundException unused) {
                    }
                    p7m0 p7m0Var2 = cnj0Var.H0().p;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, xnj0Var);
                } else if (!Intrinsics.d(ynj0Var, xnj0Var)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
        }
    }
}

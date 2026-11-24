package a;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class wr3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ApplicationActivity k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr3(ApplicationActivity applicationActivity, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = applicationActivity;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ApplicationActivity applicationActivity = this.k;
        switch (b) {
            case 0:
                wr3 wr3Var = new wr3(applicationActivity, yjeVar, (byte) 0);
                wr3Var.j = obj;
                return wr3Var;
            default:
                wr3 wr3Var2 = new wr3(applicationActivity, yjeVar, (byte) 1);
                wr3Var2.j = obj;
                return wr3Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wr3) create((db50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wr3) create((Locale) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ApplicationActivity applicationActivity = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                db50 db50Var = (db50) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                Float f = db50Var.b;
                boolean z = db50Var.f5786a;
                int i = ApplicationActivity.F1;
                for (ndk0 ndk0Var : (ArrayList) tx3.z(new ndk0[]{applicationActivity.A1, applicationActivity.B1, applicationActivity.C1, applicationActivity.D1})) {
                    wdk0 wdk0Var = (wdk0) applicationActivity.E().get();
                    wdk0Var.getClass();
                    ndk0Var.getClass();
                    rrm rrmVarC = ndk0Var.c();
                    Resources resources = rrmVarC.i.getResources();
                    if (ndk0Var instanceof ldk0) {
                        wdk0Var.p(rrmVarC);
                    } else {
                        if (!(ndk0Var instanceof mdk0)) {
                            t9f.b();
                            return null;
                        }
                        if (!z) {
                            resources.getClass();
                            wdk0.o(rrmVarC, resources, 0, null);
                        } else if (f != null) {
                            wdk0Var.m(rrmVarC, f.floatValue());
                        } else {
                            resources.getClass();
                            wdk0.n(rrmVarC, resources, 0);
                        }
                    }
                    if (rrmVarC.b()) {
                        rrmVarC.e();
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                u7x.u(applicationActivity, (Locale) obj2);
                return Unit.f46060a;
        }
    }
}

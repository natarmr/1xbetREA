package a;

import android.javax.sip.message.Response;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class be0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2425a;
    public final n0o0 b;

    public be0(int i, wd0 wd0Var) {
        this.f2425a = i;
        this.b = bkb.H(wd0Var.f38948a);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        wd0 wd0Var = (wd0) obj;
        wd0Var.getClass();
        n0o0 n0o0Var = this.b;
        ((fee) n0o0Var.getValue()).d(wd0Var.f38948a);
        sh1 sh1Var = sh1.f32187a;
        th1 th1Var = wd0Var.c;
        b0i b0iVar = new b0i(sh1Var, cy2.I(th1Var));
        ud0 ud0Var = (ud0) ((fee) n0o0Var.getValue()).c();
        boolean z = ud0Var instanceof rd0;
        int i = this.f2425a;
        if (z) {
            String str = wd0Var.d;
            if (str == null || str.length() == 0) {
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                return new yd0(new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990));
            }
            xuz xuzVar2 = pb10.c;
            pb10 pb10Var2 = pb10.e;
            xuzVar2.getClass();
            return new yd0(new mdm(xuz.a(pb10Var2, i), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
        }
        if (ud0Var instanceof sd0) {
            int i2 = ((sd0) ud0Var).f32010a ? R.string.country_blocking : R.string.data_retrieval_error;
            xuz xuzVar3 = pb10.c;
            pb10 pb10Var3 = pb10.g;
            xuzVar3.getClass();
            return new yd0(new mdm(xuz.a(pb10Var3, i), null, null, 0, 0, i2, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (Intrinsics.d(ud0Var, td0.f33741a)) {
            return new zd0(new col(b0iVar));
        }
        if (ud0Var instanceof qd0) {
            return new xd0(new bol(dyb.o0(((qd0) ud0Var).f28509a), new b0i(sh1Var, cy2.I(th1Var))));
        }
        t9f.b();
        return null;
    }
}

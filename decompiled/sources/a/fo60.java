package a;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fo60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9866a;
    public final /* synthetic */ lo60 b;

    public /* synthetic */ fo60(lo60 lo60Var, byte b) {
        this.f9866a = b;
        this.b = lo60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9866a;
        lo60 lo60Var = this.b;
        switch (b) {
            case 0:
                htz htzVar = lo60.U1;
                return new ko60(lo60Var, (byte) 0);
            default:
                htz htzVar2 = lo60.U1;
                sp70 sp70VarH0 = lo60Var.H0();
                fqx fqxVar = sp70VarH0.l;
                vcu vcuVar = sp70VarH0.r;
                if (!sp70VarH0.L.F()) {
                    sp70VarH0.w(new sle(sp70VarH0.g.a()));
                }
                if ((!sp70VarH0.F.f13587a.f26724a.A || !vcuVar.a().a()) && (fqxVar.a() || !vcuVar.a().a())) {
                    if (fqxVar.a() && ((SharedPreferences) sp70VarH0.x.f13144a.b.f20589a).getBoolean("SHOW_GAME_IS_NOT_FINISHED_DIALOG", true) && (vcuVar.a().a() || sp70VarH0.w.a())) {
                        sp70VarH0.F(new gp70());
                    } else {
                        sp70VarH0.w(new iy5(csr.e));
                        sp70VarH0.B();
                    }
                }
                return Boolean.TRUE;
        }
    }
}

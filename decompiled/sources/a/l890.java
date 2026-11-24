package a;

import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l890 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19594a;
    public final /* synthetic */ o890 b;

    public /* synthetic */ l890(o890 o890Var, byte b) {
        this.f19594a = b;
        this.b = o890Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f19594a;
        yje yjeVar = null;
        o890 o890Var = this.b;
        switch (b) {
            case 0:
                jh70 jh70Var = o890.f2;
                kxq kxqVarN0 = o890Var.n0();
                Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                kxqVarN0.startActivityForResult(intentJ, 555);
                return Unit.f46060a;
            case 1:
                jh70 jh70Var2 = o890.f2;
                p990 p990VarM0 = o890Var.M0();
                p990VarM0.y.f(new z890((ra10) p990VarM0.E.getValue()));
                return Unit.f46060a;
            case 2:
                jh70 jh70Var3 = o890.f2;
                p990 p990VarM1 = o890Var.M0();
                p990VarM1.y.f(new y890((ra10) p990VarM1.D.getValue()));
                return Unit.f46060a;
            case 3:
                jh70 jh70Var4 = o890.f2;
                o890Var.M0().A();
                return Unit.f46060a;
            case 4:
                jh70 jh70Var5 = o890.f2;
                p990 p990VarM2 = o890Var.M0();
                sac.V(jiu0.a(p990VarM2), e990.f7410a, null, p990VarM2.p.b, new o690((w46) p990VarM2, yjeVar, (byte) 1), 10);
                return Unit.f46060a;
            case 5:
                jh70 jh70Var6 = o890.f2;
                o890Var.M0().A();
                return Unit.f46060a;
            case 6:
                jh70 jh70Var7 = o890.f2;
                p990 p990VarM3 = o890Var.M0();
                ((grj) p990VarM3.s.get()).a(((ctf0) p990VarM3.q.get()).b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0)).concat("://open/editprofile"));
                return Unit.f46060a;
            case 7:
                jh70 jh70Var8 = o890.f2;
                o890Var.M0().A();
                return Unit.f46060a;
            case 8:
                jh70 jh70Var9 = o890.f2;
                p990 p990VarM4 = o890Var.M0();
                p7m0 p7m0Var = p990VarM4.z;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, d990.f5690a));
                p990VarM4.C();
                p990VarM4.k.f37210a.c("dep_refresh_method");
                ((wlt0) p990VarM4.l.get()).f39375a.a(xun.f41520a, 3135L);
                p990VarM4.B();
                return Unit.f46060a;
            case 9:
                jh70 jh70Var10 = o890.f2;
                o890Var.M0().A();
                return Unit.f46060a;
            case 10:
                jh70 jh70Var11 = o890.f2;
                i1w0 i1w0VarF = a4n0.f(o890Var);
                nni nniVar = o890Var.L1;
                if (nniVar != null) {
                    return new ry3(i1w0VarF, nniVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 11:
                oni oniVar = o890Var.M1;
                if (oniVar != null) {
                    return new qm90(o890Var.n0().i, (zri) ((o9i) oniVar.f25548a.c).j);
                }
                Intrinsics.h("photoResultFactory");
                throw null;
            case 12:
                jh70 jh70Var12 = o890.f2;
                khf0 khf0VarQ = m7x.Q(o890Var, "android.permission.CAMERA", j120.V());
                if (khf0VarQ != null) {
                    return khf0VarQ.d();
                }
                return null;
            case 13:
                jh70 jh70Var13 = o890.f2;
                khf0 khf0VarQ2 = m7x.Q(o890Var, j120.V(), new String[0]);
                if (khf0VarQ2 != null) {
                    return khf0VarQ2.d();
                }
                return null;
            default:
                jh70 jh70Var14 = o890.f2;
                khf0 khf0VarQ3 = m7x.Q(o890Var, "android.permission.CAMERA", new String[0]);
                if (khf0VarQ3 != null) {
                    return khf0VarQ3.d();
                }
                return null;
        }
    }
}

package a;

import android.app.Activity;
import android.content.Intent;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.view.Window;
import android.webkit.PermissionRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lf2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19932a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lf2(Object obj, Object obj2, boolean z, byte b) {
        this.f19932a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0126 A[PHI: r0
  0x0126: PHI (r0v57 long) = (r0v55 long), (r0v58 long) binds: [B:50:0x012c, B:47:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Date date;
        ycm0 ziv0Var;
        long j;
        byte b = 2;
        byte b2 = 0;
        switch (this.f19932a) {
            case 0:
                jf2 jf2Var = (jf2) this.c;
                boolean z = this.b;
                ctf0 ctf0Var = (ctf0) this.d;
                int iOrdinal = jf2Var.f16404a.ordinal();
                if (iOrdinal == 0) {
                    Calendar calendar = jf2Var.h;
                    if (calendar == null || (date = calendar.getTime()) == null) {
                        date = new Date();
                    }
                    return z ? ctf0Var.b.a(R.string.for_24_hours, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.result_peroid_v2, Arrays.copyOf(new Object[]{rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, null, 60)}, 1));
                }
                if (iOrdinal == 1) {
                    return ctf0Var.b.a(R.string.result_peroid_v2, Arrays.copyOf(new Object[]{rdj.c(rdj.f30294a, sdj.UNIVERSAL, new Date(), null, 60)}, 1));
                }
                if (iOrdinal == 2) {
                    return ctf0Var.b.a(R.string.search_all_result, Arrays.copyOf(new Object[0], 0));
                }
                t9f.b();
                return null;
            case 1:
                Window window = (Window) this.c;
                boolean z2 = this.b;
                l7m0 l7m0Var = (l7m0) this.d;
                if (window != null) {
                    boolean z3 = !z2 && ((Number) l7m0Var.getValue()).floatValue() > 0.5f;
                    ani0 ani0Var = new ani0(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 35) {
                        ziv0Var = new bjv0(window, ani0Var);
                    } else if (i >= 30) {
                        ziv0Var = new ajv0(window, ani0Var);
                    } else {
                        ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                    }
                    ziv0Var.w(z3);
                }
                return Unit.f46060a;
            case 2:
                z1e z1eVar = (z1e) this.c;
                boolean z4 = this.b;
                CoroutineContext coroutineContext = (CoroutineContext) this.d;
                String str = z4 ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\n");
                sb.append("Request coroutine: " + coroutineContext);
                sb.append("\n\nWriter pool:\n");
                z1eVar.b.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                z1eVar.f43613a.d(sb);
                try {
                    m2x.J(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return Unit.f46060a;
                }
            case 3:
                qss qssVar = (qss) this.c;
                boolean z5 = this.b;
                l7m0 l7m0Var2 = (l7m0) this.d;
                a4x a4xVar = (a4x) ((pss) qssVar).f27528a.getValue();
                if (mrv.y(l7m0Var2) || p7x.D(a4xVar, z5)) {
                    return a4xVar;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : a4xVar) {
                    if (!(((p6t0) obj) instanceof kxs)) {
                        arrayList.add(obj);
                    }
                }
                return dyb.o0(arrayList);
            case 4:
                ((Function1) this.c).invoke(new wdm(this.b, ((grh) this.d).a()));
                return Unit.f46060a;
            case 5:
                return (!this.b || ((ulq0) this.c) == ulq0.b) ? ifj.f14690a : (ifj) ((pz40) this.d).getValue();
            case 6:
                boolean z6 = this.b;
                kd30 kd30Var = (kd30) this.c;
                String str2 = (String) this.d;
                if (z6) {
                    h0h0 h0h0Var = (h0h0) kd30Var.f18086a;
                    synchronized (h0h0Var.c) {
                    }
                }
                return Unit.f46060a;
            case 7:
                egk0 egk0Var = (egk0) this.c;
                boolean z7 = this.b;
                l7m0 l7m0Var3 = (l7m0) this.d;
                long jL = egk0Var.l() / 60000;
                if (z7) {
                    jL %= 60;
                }
                if (((Boolean) l7m0Var3.getValue()).booleanValue()) {
                    j = 999;
                    if (jL > 999) {
                        jL = j;
                    }
                } else {
                    j = 99;
                    if (jL > 99) {
                        jL = j;
                    }
                }
                return Long.valueOf(jL);
            case 8:
                cc70 cc70Var = (cc70) this.c;
                Activity activity = (Activity) this.d;
                c9o0 c9o0Var = new c9o0(fbc.U(cc70Var.f4096a), fbc.U(cc70Var.f4096a), new jno(b, this.b));
                agd agdVar = activity instanceof agd ? (agd) activity : null;
                if (agdVar != null) {
                    mjn.a(agdVar, c9o0Var, c9o0Var);
                }
                return Unit.f46060a;
            case 9:
                ((Function1) this.c).invoke(this.b ? mq70.f22209a : !((iu70) ((l7m0) this.d).getValue()).g ? eq70.f8223a : oq70.f25675a);
                return Unit.f46060a;
            case 10:
                boolean z8 = this.b;
                r790 r790Var = (r790) this.c;
                PermissionRequest permissionRequest = (PermissionRequest) this.d;
                xi70 xi70Var = r790.Z1;
                if (z8) {
                    kxq kxqVarN0 = r790Var.n0();
                    Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                    kxqVarN0.startActivityForResult(intentJ, 531);
                } else {
                    qog0 qog0Var = (qog0) r790Var.R1.getValue();
                    if (qog0Var != null) {
                        qog0Var.f29072a.add(new p790(qog0Var, permissionRequest, r790Var, b2));
                        qog0Var.a();
                    }
                }
                return Unit.f46060a;
            case 11:
                boolean z9 = this.b;
                o890 o890Var = (o890) this.c;
                PermissionRequest permissionRequest2 = (PermissionRequest) this.d;
                jh70 jh70Var = o890.f2;
                if (z9) {
                    kxq kxqVarN1 = o890Var.n0();
                    Intent intentJ2 = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intentJ2.setData(Uri.fromParts("package", kxqVarN1.getPackageName(), null));
                    kxqVarN1.startActivityForResult(intentJ2, 531);
                } else {
                    o890Var.H0(permissionRequest2);
                }
                return Unit.f46060a;
            default:
                boolean z10 = this.b;
                return new fts0(z10 ? bm5.e : bm5.f2822a, hts0.f13649a, 0L, false, z10, "", (String) this.d, ((bzt) this.c).f3488a.a().r);
        }
    }

    public /* synthetic */ lf2(Object obj, boolean z, Object obj2, byte b) {
        this.f19932a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ lf2(boolean z, Object obj, Object obj2, byte b) {
        this.f19932a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}

package a;

import java.util.Arrays;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class kys implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19121a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ yys c;

    public /* synthetic */ kys(kmq kmqVar, yys yysVar, byte b) {
        this.f19121a = b;
        this.b = kmqVar;
        this.c = yysVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        jys jysVar;
        rys rysVar;
        byte b = this.f19121a;
        yys yysVar = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof jys) {
                    jysVar = (jys) yjeVar;
                    int i = jysVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jysVar.j = i - Integer.MIN_VALUE;
                    } else {
                        jysVar = new jys(this, yjeVar);
                    }
                } else {
                    jysVar = new jys(this, yjeVar);
                }
                Object obj2 = jysVar.i;
                wne wneVar = wne.f39444a;
                int i2 = jysVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    ixs ixsVar = (ixs) obj;
                    ctf0 ctf0Var = yysVar.q;
                    ixsVar.getClass();
                    ctf0Var.getClass();
                    boolean z = ixsVar.l;
                    boolean z2 = ixsVar.h;
                    boolean z3 = ixsVar.f;
                    hl90 hl90Var = ixsVar.j;
                    Object mxsVar = oxs.f26028a;
                    if (!z || hl90Var != null) {
                        Throwable th = ixsVar.m;
                        if ((th instanceof lws) || (th instanceof fpd0)) {
                            mxsVar = new mxs(ctf0Var.b.a(R.string.video_auth_alert, Arrays.copyOf(new Object[0], 0)));
                        } else if (th instanceof kws) {
                            mxsVar = new lxs(ctf0Var.b.a(R.string.error_broadcast_access_forbidden, Arrays.copyOf(new Object[0], 0)));
                        } else if (th != null) {
                            mxsVar = new nxs(th instanceof hxs ? ((hxs) th).f13826a : ctf0Var.b.a(R.string.unknown_service_error, Arrays.copyOf(new Object[0], 0)));
                        } else if (ixsVar.n && ixsVar.k) {
                            int i3 = hl90Var == null ? -1 : uxs.f36457a[hl90Var.ordinal()];
                            if (i3 == 1) {
                                mxsVar = qxs.f29502a;
                            } else if (i3 == 2) {
                                mxsVar = pxs.f27768a;
                            }
                        } else {
                            mxsVar = (ixsVar.g || !z3) ? new rxs(z3, z2, ixsVar.i) : new sxs(ixsVar.e, z2);
                        }
                    }
                    jysVar.j = 1;
                    if (kmqVar.a(mxsVar, jysVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof rys) {
                    rysVar = (rys) yjeVar;
                    int i4 = rysVar.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        rysVar.j = i4 - Integer.MIN_VALUE;
                    } else {
                        rysVar = new rys(this, yjeVar);
                    }
                } else {
                    rysVar = new rys(this, yjeVar);
                }
                Object obj3 = rysVar.i;
                wne wneVar2 = wne.f39444a;
                int i5 = rysVar.j;
                if (i5 == 0) {
                    z1x.P(obj3);
                    if (((Boolean) obj).booleanValue() && ((ixs) yysVar.B.getValue()).m == null) {
                        rysVar.j = 1;
                        if (kmqVar.a(obj, rysVar) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}

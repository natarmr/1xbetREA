package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k4p extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4p(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f17680a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        byte b = 14;
        byte b2 = 3;
        byte b3 = 1;
        yje yjeVar = null;
        byte b4 = 2;
        switch (this.f17680a) {
            case 0:
                x3p x3pVar = (x3p) obj;
                x3pVar.getClass();
                ((k3t0) this.receiver).x(x3pVar);
                return Unit.f46060a;
            case 1:
                z5p z5pVar = (z5p) obj;
                z5pVar.getClass();
                k6p k6pVar = (k6p) this.receiver;
                k6pVar.getClass();
                if (z5pVar.d instanceof qgb) {
                    Iterator it = k6pVar.o.f20692a.a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            lok0 lok0Var = (lok0) next;
                            if (lok0Var.f20396a != ((int) z5pVar.m) || !lok0Var.t.contains(1)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    lok0 lok0Var2 = (lok0) next;
                    if (lok0Var2 != null) {
                        ((uzg) k6pVar.c).o(lok0Var2.f20396a, lok0Var2.b);
                    } else {
                        sac.V(jiu0.a(k6pVar), new e4p((byte) 8), null, k6pVar.g.f22085a, new i6p(z5pVar, k6pVar, null), 10);
                    }
                } else {
                    k6pVar.b.d(new f5p(k6pVar, z5pVar, b2));
                }
                return Unit.f46060a;
            case 2:
                z5p z5pVar2 = (z5p) obj;
                z5pVar2.getClass();
                k6p k6pVar2 = (k6p) this.receiver;
                k6pVar2.getClass();
                sac.V(jiu0.a(k6pVar2), new k4p(1, k6pVar2, k6p.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, k6pVar2.g.b, new j0l((Object) k6pVar2, (Object) z5pVar2, yjeVar, (byte) 16), 10);
                return Unit.f46060a;
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                k6p k6pVar3 = (k6p) this.receiver;
                k6pVar3.i.b(th, new f5o(k6pVar3, b));
                return Unit.f46060a;
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                k6p k6pVar4 = (k6p) this.receiver;
                k6pVar4.m.f(th2, new yhn((Object) k6pVar4, (byte) 29));
                return Unit.f46060a;
            case 5:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                k6p k6pVar5 = (k6p) this.receiver;
                k6pVar5.i.b(th3, new f5o(k6pVar5, b));
                return Unit.f46060a;
            case 6:
                z6p z6pVar = (z6p) obj;
                z6pVar.getClass();
                s6p s6pVar = (s6p) this.receiver;
                pek pekVar = s6p.o2;
                s6pVar.getClass();
                phf0 phf0Var = s6pVar.k2;
                if (z6pVar.equals(x6p.f40374a)) {
                    if (!s6pVar.R()) {
                        s6pVar.y0();
                    }
                } else {
                    if (!(z6pVar instanceof y6p)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr = s6p.p2;
                    vcc.f0(i120.V(new Pair(phf0Var.n(s6pVar, iiyVarArr[0]), new ArrayList(((y6p) z6pVar).f42109a))), s6pVar, phf0Var.n(s6pVar, iiyVarArr[0]));
                    if (!s6pVar.R()) {
                        s6pVar.y0();
                    }
                }
                ((h7p) s6pVar.n2.getValue()).x(l6p.f19518a);
                return Unit.f46060a;
            case 7:
                o6p o6pVar = (o6p) obj;
                o6pVar.getClass();
                ((h7p) this.receiver).x(o6pVar);
                return Unit.f46060a;
            case 8:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((ccp) this.receiver).R(th4);
                return Unit.f46060a;
            case 9:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((ccp) this.receiver).R(th5);
                return Unit.f46060a;
            case 10:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((ccp) this.receiver).R(th6);
                return Unit.f46060a;
            case 11:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((ccp) this.receiver).R(th7);
                return Unit.f46060a;
            case 12:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((ccp) this.receiver).R(th8);
                return Unit.f46060a;
            case 13:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((ccp) this.receiver).T(th9);
                return Unit.f46060a;
            case 14:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((ccp) this.receiver).P.b(th10, new jbp(b2));
                return Unit.f46060a;
            case 15:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((ccp) this.receiver).R(th11);
                return Unit.f46060a;
            case 16:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((ccp) this.receiver).R(th12);
                return Unit.f46060a;
            case 17:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((ccp) this.receiver).R(th13);
                return Unit.f46060a;
            case 18:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ccp ccpVar = (ccp) this.receiver;
                ccpVar.Q.f(th14, new hbp(ccpVar, b3));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                bep bepVar = (bep) this.receiver;
                bepVar.u.f(th15, new xdp(bepVar, b4));
                return Unit.f46060a;
            case 20:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                bep bepVar2 = (bep) this.receiver;
                bepVar2.u.f(th16, new xdp(bepVar2, b4));
                return Unit.f46060a;
            case 21:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((bep) this.receiver).C.b(th17, new jbp((byte) 5));
                return Unit.f46060a;
            case 22:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                bep bepVar3 = (bep) this.receiver;
                bepVar3.u.f(th18, new xdp(bepVar3, b4));
                return Unit.f46060a;
            case 23:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                ((gfp) this.receiver).O(th19);
                return Unit.f46060a;
            case 24:
                Throwable th20 = (Throwable) obj;
                th20.getClass();
                ((gfp) this.receiver).O(th20);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ngp ngpVar = (ngp) obj;
                ngpVar.getClass();
                ((k3t0) this.receiver).x(ngpVar);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dhp dhpVar = (dhp) obj;
                dhpVar.getClass();
                ((k3t0) this.receiver).x(dhpVar);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th21 = (Throwable) obj;
                th21.getClass();
                ((nnp) this.receiver).T(th21);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                smp smpVar = (smp) obj;
                smpVar.getClass();
                ((k3t0) this.receiver).x(smpVar);
                return Unit.f46060a;
            default:
                ohs ohsVar = (ohs) obj;
                ohsVar.getClass();
                ((k3t0) this.receiver).x(ohsVar);
                return Unit.f46060a;
        }
    }
}

package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedGameItemsScreenParams;
import org.xplatform.games_mania.presentation.views.GamesManiaDice;
import org.xplatform.services.mobile_services.impl.presentation.services.GoogleMessagingService;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jcs implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16293a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jcs(Object obj, byte b) {
        this.f16293a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f16293a;
        byte b2 = 14;
        byte b3 = 5;
        yje yjeVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                rhi rhiVar = ((mcs) obj).L1;
                if (rhiVar != null) {
                    return new q0h0(rhiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                return new cis("", iun.f15405a, ais.f939a, null, false, ((FeedGameItemsScreenParams) obj).b, false);
            case 2:
                return ((uhs) obj).u.a();
            case 3:
                ((yks) obj).G(kjs.f18401a);
                return Unit.f46060a;
            case 4:
                zns znsVar = (zns) obj;
                p7m0 p7m0Var = znsVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    znsVar.f.getClass();
                } while (!p7m0Var.m(value, qns.a((qns) value, false, false, false, null, null, null, 508)));
                return Unit.f46060a;
            case 5:
                nqs nqsVar = (nqs) obj;
                vzg0 vzg0Var = nqsVar.b;
                if (vzg0Var != null) {
                    xrs xrsVar = (xrs) nqsVar.f;
                    return new mqs(vzg0Var, xrsVar.f41384a, xrsVar.c, xrsVar.b);
                }
                Intrinsics.h("savedStateHandle");
                throw null;
            case 6:
                f3j f3jVar = (f3j) obj;
                sac.V(jiu0.a(f3jVar.s()), uvs.f36363a, null, f3jVar.d.f22085a, new lvs(f3jVar, yjeVar, b3), 10);
                return Unit.f46060a;
            case 7:
                return (tws) ((azj0) obj).d(sre0.f32672a.b(tws.class));
            case 8:
                fiu0 fiu0Var = ((wws) obj).L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 9:
                yys yysVar = (yys) obj;
                yysVar.f.b();
                yysVar.g.v();
                a5v a5vVar = yysVar.d;
                p7m0 p7m0Var2 = yysVar.B;
                a5vVar.a(new khv0(((ixs) p7m0Var2.getValue()).f15558a, ((ixs) p7m0Var2.getValue()).b, ((ixs) p7m0Var2.getValue()).d, ((ixs) p7m0Var2.getValue()).c, ((ixs) p7m0Var2.getValue()).e));
                yysVar.c.B();
                return Unit.f46060a;
            case 10:
                fiu0 fiu0Var2 = ((p0t) obj).K1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 11:
                e1t e1tVar = (e1t) obj;
                e1tVar.e.v();
                e1tVar.f.b();
                a5v a5vVar2 = e1tVar.d;
                p7m0 p7m0Var3 = e1tVar.n;
                a5vVar2.a(new lhv0(((s0t) p7m0Var3.getValue()).f31426a, ((s0t) p7m0Var3.getValue()).b, ((s0t) p7m0Var3.getValue()).c, ((s0t) p7m0Var3.getValue()).d, ((s0t) p7m0Var3.getValue()).e));
                e1tVar.c.B();
                return Unit.f46060a;
            case 12:
                ((g5t) obj).i.o(null, i8d.c);
                return Unit.f46060a;
            case 13:
                ((GamesManiaDice) obj).d.invoke();
                return Unit.f46060a;
            case 14:
                p7m0 p7m0Var4 = ((a9t) obj).o;
                do {
                    value2 = p7m0Var4.getValue();
                    ((Boolean) value2).getClass();
                } while (!p7m0Var4.m(value2, Boolean.TRUE));
                return Unit.f46060a;
            case 15:
                return (d7t) ((t9t) obj).f33585a.b(sre0.f32672a.b(d7t.class));
            case 16:
                ((jat) obj).m.o(null, i8d.c);
                return Unit.f46060a;
            case 17:
                return new agt(((yft) obj).f42556a);
            case 18:
                gii giiVar = ((kit) obj).M1;
                if (giiVar != null) {
                    return new q0h0(giiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                mci mciVar = (mci) obj;
                return new pxt(new gmq[]{((z8u) mciVar.f21553a).f43985a.d(), ((h9c) mciVar.c).a(), ((pj9) mciVar.b).f27077a.b(), ((edo) ((e1u) mciVar.f).b).c(), ((zfo) ((cmt) mciVar.h).b).c(), new qaf0(i120.W(vtb.N(((g8n0) ((dj9) mciVar.e).f6172a.b).f10874a)), b2)}, (byte) 0);
            case 20:
                return ((pru) ((uii) obj).e).a();
            case 21:
                v7i v7iVar = (v7i) obj;
                return new pxt(new gmq[]{((m0o0) v7iVar.e).d(), ((h9c) v7iVar.i).a(), ((qj9) v7iVar.g).b(), ((edo) v7iVar.j).c(), ((zfo) v7iVar.l).c(), new qaf0(i120.W(vtb.N(((g8n0) ((nvu) v7iVar.h).b).f10874a)), b2)}, (byte) 2);
            case 22:
                ((gst0) ((khf0) obj).c).h(false, false);
                return Unit.f46060a;
            case 23:
                ((gst0) ((lbu) obj).c).h(false, false);
                return Unit.f46060a;
            case 24:
                ((gst0) ((edu) obj).b).h(false, false);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gst0 gst0Var = (gst0) ((a6u) obj).c;
                if (gst0Var.a() ? gst0Var.d(false) : false) {
                    gst0Var.i();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((fsd) obj).a();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                daf dafVar = ((g8v) obj).O1;
                if (dafVar != null) {
                    return new q0h0((hii) ((n5d0) dafVar.m).get());
                }
                Intrinsics.h("component");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return GoogleMessagingService.googleMessagingServiceComponent_delegate$lambda$0((GoogleMessagingService) obj);
            default:
                return (kcv) ((gii0) ((abu) obj).b).b(sre0.f32672a.b(kcv.class));
        }
    }
}

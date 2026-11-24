package a;

import com.huawei.hms.framework.common.BundleUtil;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bethistory.transaction_history.presentation.TransactionHistoryScreenOld;
import org.xplatform.feature.office.payment.impl.di.navigation.PaymentScreenFactoryImpl$getPaymentScreen$1;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$CashbackChoosingFragmentScreen;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$CashbackChoosingFragmentScreenOld;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qi4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28771a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qi4(long j, Serializable serializable, byte b) {
        this.f28771a = b;
        this.b = j;
        this.c = serializable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        ArrayList arrayList;
        byte b = this.f28771a;
        byte b2 = 0;
        long j = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                for (pu90 pu90Var : (ArrayList) obj2) {
                    Object objN = pu90Var.n();
                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                    if (Intrinsics.d(objG0, "AUTH_LOGIN_VISUAL_CONTENT")) {
                        ou90Var.m(pu90Var, 0, p4e.h(j) - pu90Var.b, 1.0f);
                    } else if (Intrinsics.d(objG0, "AUTH_LOGIN_VISUAL_BACKGROUND")) {
                        ou90Var.m(pu90Var, 0, 0, 0.0f);
                    }
                }
                break;
            case 1:
                dk6 dk6Var = (dk6) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                dk6Var.w.g(idf0.f14583a);
                dk6Var.x.b(lx7.f20801a);
                p7m0 p7m0Var = dk6Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    dk6Var.f.getClass();
                } while (!p7m0Var.m(value, hj6.a((hj6) value, false, new ii6(j), null, null, null, null, false, null, 8189)));
                break;
            case 2:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                r9u r9uVar = ((h2b) obj2).o.f35560a.b;
                ygp ygpVar = ygp.y1;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                k0w0Var.h(j1q0Var.f15748a.d(ygpVar) ? new GamesSectionScreens$CashbackChoosingFragmentScreen(j) : new GamesSectionScreens$CashbackChoosingFragmentScreenOld(j));
                break;
            case 3:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fFloatValue = 1.0f - ((Number) ((Function0) obj2).invoke()).floatValue();
                if (fFloatValue > 0.6666667f) {
                    fhl.E(fhlVar, this.b, (h7k0.d(fhlVar.d()) / 2.0f) * fFloatValue, 0L, l1e0.c((fFloatValue - 0.6666667f) / 0.3333333f, 0.0f, 1.0f), null, 116);
                }
                break;
            case 4:
                final fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                mcz mczVarJ = ((xcz) obj2).j();
                zcl zclVar = qmk.f28987a;
                final float fW0 = fhlVar2.w0(16.0f);
                final float fW1 = fhlVar2.w0(8.0f);
                int i = -mczVarJ.m;
                final mie0 mie0Var = new mie0();
                final jie0 jie0Var = new jie0();
                final jie0 jie0Var2 = new jie0();
                final hie0 hie0Var = new hie0();
                final long j2 = this.b;
                Function0 function0 = new Function0() { // from class: a.qbg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (mie0Var.f21842a != null) {
                            boolean z = hie0Var.f13108a;
                            fhl fhlVar3 = fhlVar2;
                            float f = fW0;
                            float fIntBitsToFloat = z ? jie0Var2.f16571a : Float.intBitsToFloat((int) (fhlVar3.d() & 4294967295L)) + f;
                            jie0 jie0Var3 = jie0Var;
                            float f2 = jie0Var3.f16571a;
                            float f3 = fW1;
                            fhl.o0(fhlVar3, j2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar3.d() >> 32)) - (f3 * 2.0f))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - jie0Var3.f16571a)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), null, 240);
                        }
                        return Unit.f46060a;
                    }
                };
                for (ncz nczVar : mczVarJ.l) {
                    Object obj3 = nczVar.l;
                    Object obj4 = nczVar.m;
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    if (str != null && !Intrinsics.d(obj4, "sub_game_gap")) {
                        String strR0 = StringsKt.r0(str, BundleUtil.UNDERLINE_TAG);
                        float f = nczVar.p + i;
                        if (!strR0.equals(mie0Var.f21842a)) {
                            function0.invoke();
                            mie0Var.f21842a = strR0;
                            jie0Var.f16571a = Intrinsics.d(obj4, "sub_game_header") ? f : -fW0;
                        }
                        jie0Var2.f16571a = f + nczVar.q;
                        hie0Var.f13108a = Intrinsics.d(obj4, "sub_game_footer");
                    }
                }
                function0.invoke();
                break;
            case 5:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.c = j;
                n1gVar.d = j1g.REAL;
                n1gVar.e = new sq2();
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = (k1g) obj2;
                break;
            case 6:
                cr crVar = (cr) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                peg0 peg0Var = (peg0) crVar.h;
                String string = ((us00) crVar.c).getString(R.string.array_slots);
                string.getClass();
                k0w0Var2.h(peg0Var.q(new fr1(new fs80(string, nw80.b.getId(), null, kotlin.collections.a.c(Long.valueOf(j)), 0L, false, 116), null, 2)));
                break;
            case 7:
                n3w n3wVar = (n3w) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(new TransactionHistoryScreenOld(n3wVar.o, n3wVar.m, n3wVar.n, n3wVar.c.f31736a, this.b, n3wVar.j, n3wVar.f22868a, n3wVar.b, n3wVar.m1, n3wVar.f, n3wVar.g));
                break;
            case 8:
                zaz zazVar = (zaz) obj2;
                zazVar.e(ikx.c(((ikx) ((t33) obj).d()).f14950a, j));
                zazVar.c.invoke();
                break;
            case 9:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(((j340) obj2).W.q(new fr1(new fs80("", this.b, null, null, 0L, false, 124), null, 2)));
                break;
            case 10:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = ((d650) obj2).g1;
                do {
                    value2 = p7m0Var2.getValue();
                    Iterable<Object> iterable = (Iterable) p7m0Var2.getValue();
                    arrayList = new ArrayList(r3d.q(iterable, 10));
                    for (Object qe40Var : iterable) {
                        if (qe40Var instanceof qe40) {
                            x4t x4tVar = ((qe40) qe40Var).f28565a;
                            if ((x4tVar instanceof r4t) && ((r4t) x4tVar).f29854a == j) {
                                qe40Var = new qe40(x4tVar, obj.f24982a);
                            }
                        }
                        arrayList.add(qe40Var);
                    }
                } while (!p7m0Var2.m(value2, arrayList));
                break;
            case 11:
                gl60 gl60Var = (gl60) obj2;
                r990 r990Var = gl60Var.s;
                gl60Var.t.getClass();
                r990Var.getClass();
                ((k0w0) obj).h(new PaymentScreenFactoryImpl$getPaymentScreen$1(r990Var, true, j));
                break;
            case 12:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((v3b0) obj2).H(new e3b0(b2, j));
                th2.printStackTrace();
                break;
            case 13:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(((tjb0) obj2).l.b(j700.b, new d8h0(3, null), cui0.b(Long.valueOf(j)), -1L, ""));
                break;
            case 14:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                k0w0Var6.h(((vjp) ((iij) obj2).e).b(j700.b, new d8h0(3, null), cui0.b(Long.valueOf(j)), -1L, ""));
                break;
            case 15:
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                c8d c8dVar = (c8d) k0w0Var7.b(new b1w0(new uw((g2g0) obj2, this.b, null, (byte) 4))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 16:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                if (((caj) obj2).b == null) {
                    zcl zclVar2 = qmk.f28987a;
                    z1x.E(fhlVar3, vgg0.a(16.0f).a(fhlVar3.d(), fhlVar3.getLayoutDirection(), fhlVar3), j);
                } else {
                    zcl zclVar3 = qmk.f28987a;
                    z1x.E(fhlVar3, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12).a(fhlVar3.d(), fhlVar3.getLayoutDirection(), fhlVar3), j);
                }
                break;
            default:
                k0w0 k0w0Var8 = (k0w0) obj;
                k0w0Var8.getClass();
                c8d c8dVar2 = (c8d) k0w0Var8.b(new b1w0(new fd60((zco0) obj2, this.b, null, (byte) 2))).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qi4(Object obj, long j, byte b) {
        this.f28771a = b;
        this.c = obj;
        this.b = j;
    }
}

package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView;
import org.xplatform.domino.presentation.views.DominoHandView;
import org.xplatform.domino.presentation.views.DominoTableView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vbk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37145a;

    public /* synthetic */ vbk(byte b) {
        this.f37145a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        int i = 0;
        byte b = 1;
        switch (this.f37145a) {
            case 0:
                return Unit.f46060a;
            case 1:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new kgh(cpVar, (byte) 7));
                return Unit.f46060a;
            case 2:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new kgh(cpVar2, (byte) 8));
                return Unit.f46060a;
            case 3:
                ((cp) obj).getClass();
                return Unit.f46060a;
            case 4:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(weakReference.get() == null);
            case 5:
                int i2 = DicePokerView.t;
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 6:
                int i3 = DicePokerView.t;
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 7:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case 8:
                Byte b3 = (Byte) obj;
                b3.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b3}, 1));
            case 9:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 10:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 11:
                p6t0 p6t0Var3 = (p6t0) obj;
                p6t0Var3.getClass();
                return p6t0Var3.getKey();
            case 12:
                p6t0 p6t0Var4 = (p6t0) obj;
                p6t0Var4.getClass();
                return sre0.f32672a.b(p6t0Var4.getClass());
            case 13:
                List list = (List) obj;
                list.getClass();
                if (list.size() < 5) {
                    return iun.f15405a;
                }
                List listD0 = CollectionsKt.D0(list, 10);
                ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                Iterator it = listD0.iterator();
                while (true) {
                    int i4 = i;
                    if (!it.hasNext()) {
                        return kotlin.collections.a.c(new dqk("ACTIVE_TEAMS", new g9m(dyb.o0(arrayList)), k3g.f17616a));
                    }
                    Object next = it.next();
                    i = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    bm bmVar = (bm) next;
                    arrayList.add(new y8m(i4, String.valueOf(bmVar.f2815a), new n0x(bmVar.c), bmVar.b, false));
                }
                break;
            case 14:
                p6t0 p6t0Var5 = (p6t0) obj;
                p6t0Var5.getClass();
                return p6t0Var5.getKey();
            case 15:
                p6t0 p6t0Var6 = (p6t0) obj;
                p6t0Var6.getClass();
                return sre0.f32672a.b(p6t0Var6.getClass());
            case 16:
                p6t0 p6t0Var7 = (p6t0) obj;
                p6t0Var7.getClass();
                return p6t0Var7.getKey();
            case 17:
                p6t0 p6t0Var8 = (p6t0) obj;
                p6t0Var8.getClass();
                return sre0.f32672a.b(p6t0Var8.getClass());
            case 18:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new hsk(sjdVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 3, null, null, i4w0.b, 6);
                return Unit.f46060a;
            case 20:
                return Boolean.valueOf(j47.t0(obj));
            case 21:
                InetAddress inetAddress = (InetAddress) obj;
                inetAddress.getClass();
                String hostAddress = inetAddress.getHostAddress();
                hostAddress.getClass();
                return hostAddress;
            case 22:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 23:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 24:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Boolean) obj).getClass();
                int i5 = DominoHandView.v;
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i6 = DominoTableView.r;
                ((Pair) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new ok(cpVar3, cpVar3, (byte) 29));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new xg(new mie0(), cpVar4, (Function1) new kgh(cpVar4, (byte) 12), (byte) 3));
                return Unit.f46060a;
            default:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                cpVar5.t(new k2l(cpVar5, cpVar5, z ? (byte) 1 : (byte) 0));
                cpVar5.z(new bb(cpVar5, b));
                return Unit.f46060a;
        }
    }
}

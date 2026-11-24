package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.indianpoker.SyntheticIndianPokerView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class b6o0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ long j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6o0(long j, ctf0 ctf0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.j = j;
        this.k = ctf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                b6o0 b6o0Var = new b6o0(obj2, yjeVar, (byte) 0);
                b6o0Var.j = ((Number) obj).longValue();
                return b6o0Var;
            case 1:
                b6o0 b6o0Var2 = new b6o0(obj2, yjeVar, (byte) 1);
                b6o0Var2.j = ((Number) obj).longValue();
                return b6o0Var2;
            case 2:
                b6o0 b6o0Var3 = new b6o0(obj2, yjeVar, (byte) 2);
                b6o0Var3.j = ((Number) obj).longValue();
                return b6o0Var3;
            case 3:
                return new b6o0(this.j, (ctf0) obj2, yjeVar);
            default:
                b6o0 b6o0Var4 = new b6o0(obj2, yjeVar, (byte) 4);
                b6o0Var4.j = ((Number) obj).longValue();
                return b6o0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        switch (this.i) {
            case 0:
                return ((b6o0) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((b6o0) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((b6o0) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((b6o0) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((b6o0) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                long j = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                SyntheticIndianPokerView syntheticIndianPokerView = (SyntheticIndianPokerView) obj2;
                syntheticIndianPokerView.v = new Long(j);
                syntheticIndianPokerView.getBinding().j.setTime(j);
                return Unit.f46060a;
            case 1:
                long j2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                SyntheticTimerView syntheticTimerView = (SyntheticTimerView) obj2;
                syntheticTimerView.c = new Long(j2);
                syntheticTimerView.getBinding().b.setTime(j2);
                return Unit.f46060a;
            case 2:
                long j3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i = fir0.X;
                p7m0 p7m0Var = ((fir0) obj2).i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, yhr0.a((yhr0) value, null, null, null, false, false, 0L, j3, null, 383)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                long time = (this.j * 1000) - new Date().getTime();
                ctf0 ctf0Var = (ctf0) obj2;
                ctf0Var.getClass();
                if (time < 0) {
                    return ctf0Var.b.a(R.string.bet_accept_is_over, Arrays.copyOf(new Object[0], 0));
                }
                long j4 = time / 1000;
                long j5 = j4 % 60;
                long j6 = j4 / 60;
                long j7 = j6 % 60;
                long j8 = j6 / 60;
                long j9 = j8 % 24;
                String strB0 = StringsKt.b0(2, String.valueOf(j8 / 24));
                String strB1 = StringsKt.b0(2, String.valueOf(j9));
                String strB2 = StringsKt.b0(2, String.valueOf(j7));
                String strB3 = StringsKt.b0(2, String.valueOf(j5));
                StringBuilder sb = new StringBuilder();
                sb.append(strB0);
                sb.append(Separators.COLON);
                sb.append(strB1);
                sb.append(Separators.COLON);
                sb.append(strB2);
                return axq.n(sb, Separators.COLON, strB3);
            default:
                long j10 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                gfv0 gfv0Var = new gfv0(j10);
                int i2 = kfv0.t;
                ((kfv0) obj2).G(gfv0Var);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6o0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}

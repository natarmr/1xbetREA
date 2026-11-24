package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodView;

/* JADX INFO: loaded from: classes3.dex */
public final class j21 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j21(byte b, long j, long j2, yje yjeVar, Object obj, Object obj2) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = j;
        this.l = j2;
        this.j = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.j;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                return new j21((byte) 0, this.k, this.l, yjeVar, obj3, obj2);
            case 1:
                return new j21(obj3, (String) obj2, this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new j21((byte) 2, this.k, this.l, yjeVar, obj3, obj2);
            default:
                return new j21(obj3, (String) obj2, this.k, this.l, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((j21) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Integer numValueOf;
        String strA;
        byte b = this.i;
        Object obj2 = this.j;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                n21 n21Var = (n21) obj3;
                ctf0 ctf0Var = n21Var.x;
                r7v r7vVar = n21Var.F;
                s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
                long j = this.k;
                long j2 = this.l;
                long j3 = j == -1 ? j : j2;
                if (q3d.j(37L, 1L).contains(Long.valueOf(j))) {
                    j2 = j;
                }
                if (j2 == 37) {
                    numValueOf = Integer.valueOf(R.string.live_casino_title);
                } else {
                    numValueOf = j2 == 1 ? Integer.valueOf(R.string.array_slots) : null;
                }
                if (numValueOf != null) {
                    strA = ctf0Var.b.a(numValueOf.intValue(), Arrays.copyOf(new Object[0], 0));
                } else {
                    strA = (String) obj2;
                }
                String str = strA;
                String strA2 = ctf0Var.b.a(R.string.casino_category_folder_and_section_description, Arrays.copyOf(new Object[0], 0));
                if (j == 37) {
                    j = 17;
                } else if (j == -2) {
                    j = Long.MAX_VALUE;
                }
                List listU = cs0.u(j);
                s91 s91Var = (s91) r7vVar.f29996a;
                str.getClass();
                listU.getClass();
                if (j3 == -1) {
                    s91Var.c(new AggregatorScreenModel(null, null, 0L, new lm1(), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                } else {
                    long j4 = this.l;
                    if (j3 == 2 || j3 == 0 || j3 == 3) {
                        ((s91) r7vVar.f29996a).c(new AggregatorScreenModel(str, null, j4, new im1(false, true), null, 0L, 0L, "", false, WarningHeader.INSUFFICIENT_BANDWIDTH));
                    } else {
                        s91Var.c(new AggregatorScreenModel(str, strA2, j4, new hm1(2, listU, null), null, this.k, j3, null, false, Response.BAD_REQUEST));
                    }
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                vqc vqcVar = ((kd7) obj3).W;
                final String str2 = (String) obj2;
                final byte b2 = 0;
                final long j5 = this.k;
                final long j6 = this.l;
                vqcVar.k(pzb.C(new Function1() { // from class: a.id7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        byte b3 = b2;
                        long j7 = j6;
                        long j8 = j5;
                        String str3 = str2;
                        n1g n1gVar = (n1g) obj4;
                        switch (b3) {
                            case 0:
                                n1gVar.b(str3);
                                n1gVar.c = j8;
                                n1gVar.b = j7;
                                n1gVar.d = j1g.REAL;
                                n1gVar.e = new dq2();
                                n1gVar.f = l1g.OPEN_SCREEN;
                                n1gVar.g = k1g.OPEN_REGULAR;
                                break;
                            default:
                                n1gVar.b(str3);
                                n1gVar.c = j8;
                                n1gVar.b = j7;
                                n1gVar.d = j1g.REAL;
                                n1gVar.e = new dq2();
                                n1gVar.f = l1g.OPEN_SCREEN;
                                n1gVar.g = k1g.OPEN_REGULAR;
                                break;
                        }
                        return Unit.f46060a;
                    }
                }));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i = CyberCalendarPeriodView.p;
                return ((CyberCalendarPeriodView) obj3).c(this.k, this.l, (List) obj2);
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                vqc vqcVar2 = ((q5w) obj3).l;
                final String str3 = (String) obj2;
                final byte b3 = 1;
                final long j7 = this.k;
                final long j8 = this.l;
                vqcVar2.k(pzb.C(new Function1() { // from class: a.id7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        byte b4 = b3;
                        long j9 = j8;
                        long j10 = j7;
                        String str4 = str3;
                        n1g n1gVar = (n1g) obj4;
                        switch (b4) {
                            case 0:
                                n1gVar.b(str4);
                                n1gVar.c = j10;
                                n1gVar.b = j9;
                                n1gVar.d = j1g.REAL;
                                n1gVar.e = new dq2();
                                n1gVar.f = l1g.OPEN_SCREEN;
                                n1gVar.g = k1g.OPEN_REGULAR;
                                break;
                            default:
                                n1gVar.b(str4);
                                n1gVar.c = j10;
                                n1gVar.b = j9;
                                n1gVar.d = j1g.REAL;
                                n1gVar.e = new dq2();
                                n1gVar.f = l1g.OPEN_SCREEN;
                                n1gVar.g = k1g.OPEN_REGULAR;
                                break;
                        }
                        return Unit.f46060a;
                    }
                }));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j21(Object obj, String str, long j, long j2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.j = str;
        this.k = j;
        this.l = j2;
    }
}

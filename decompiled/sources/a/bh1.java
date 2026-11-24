package a;

import android.view.LayoutInflater;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import org.xplatform.cyber.calendar.impl.presentation.content.month.CyberCalendarMonthView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bh1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2582a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bh1(int i, String str, zzn zznVar) {
        this.f2582a = (byte) 3;
        this.b = i;
        this.c = str;
        this.d = zznVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        bby bbyVar;
        Object value;
        byte b = this.f2582a;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                mh1 mh1Var = (mh1) obj2;
                String str = mh1.E0;
                mh1Var.T.a(mh1Var.R.a((kr5) obj, i, true));
                return Unit.f46060a;
            case 1:
                yxb yxbVar = (yxb) obj2;
                Function0 function0 = (Function0) obj;
                if (!yxbVar.C && ((bbyVar = yxbVar.y) == null || !bbyVar.isActive())) {
                    e3c.n(yxbVar.v);
                    e3c.n(yxbVar.w);
                    e3c.n(yxbVar.z);
                    p7m0 p7m0Var = yxbVar.o;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, CollectionsKt.q0((List) value, kotlin.collections.a.c(ixb.f15534a))));
                    yxbVar.y = sac.V(yxbVar.n, wxb.f39924a, null, null, new gc1((Object) yxbVar, this.b, (Object) function0, (yje) null, (byte) 2), 14);
                }
                return Unit.f46060a;
            case 2:
                CyberCalendarMonthView cyberCalendarMonthView = (CyberCalendarMonthView) obj2;
                x5g x5gVar = (x5g) obj;
                ArrayList arrayList = cyberCalendarMonthView.f46489a;
                ibg ibgVarA = (ibg) CollectionsKt.W(i, arrayList);
                if (ibgVarA == null) {
                    ibgVarA = ibg.a(LayoutInflater.from(cyberCalendarMonthView.getContext()), cyberCalendarMonthView);
                    cyberCalendarMonthView.addView(ibgVarA.f14485a);
                    arrayList.add(ibgVarA);
                }
                ibgVarA.c.a(x5gVar);
                return Unit.f46060a;
            case 3:
                String str2 = (String) obj2;
                zzn zznVar = (zzn) obj;
                ugi0[] ugi0VarArr = new ugi0[i];
                for (int i2 = 0; i2 < i; i2++) {
                    ugi0VarArr[i2] = x2x.H(str2 + '.' + zznVar.e[i2], aum0.e, new ugi0[0]);
                }
                return ugi0VarArr;
            case 4:
                Http2Connection http2Connection = (Http2Connection) obj2;
                ErrorCode errorCode = (ErrorCode) obj;
                Settings settings = Http2Connection.A;
                try {
                    http2Connection.x.n(i, errorCode);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode2, errorCode2, e);
                }
                return Unit.f46060a;
            case 5:
                r9u r9uVar = (r9u) obj;
                iun iunVar = iun.f15405a;
                l800 l800Var = new l800(0, iunVar, iunVar, iunVar);
                uaq0 uaq0VarA = ((wyu) obj2).a();
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                return new ma00(true, false, this.b, 0, 0, l800Var, uaq0VarA, r9uVar.f30104a.a(ygpVar));
            case 6:
                f1b0 f1b0Var = (f1b0) obj2;
                f1b0Var.r.a(f1b0Var.C.a((kr5) obj, i, false));
                return Unit.f46060a;
            case 7:
                ((Function1) obj2).invoke(new qya0(i, (String) obj));
                return Unit.f46060a;
            case 8:
                ckb.a0((omv) obj2, 0);
                ((Function1) obj).invoke(Integer.valueOf(i));
                return Unit.f46060a;
            case 9:
                return htg0.b((htg0) obj2, i, (cym0) obj);
            default:
                g2g0 g2g0Var = (g2g0) obj2;
                ((jlx) g2g0Var.o).a(((uzc0) g2g0Var.k).a((kr5) obj, i, false));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ bh1(Object obj, int i, Object obj2, byte b) {
        this.f2582a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ bh1(Object obj, Object obj2, int i, byte b) {
        this.f2582a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

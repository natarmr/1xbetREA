package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferFilterTimeCustomDateValue;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lmn0 implements uu9, k4r, wzn0, zy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20305a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lmn0(Object obj, Object obj2, byte b) {
        this.f20305a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.zy3
    public ig00 apply(Object obj) {
        yo yoVar = (yo) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        b0l0 b0l0Var = (b0l0) yoVar.d;
        Integer num = (Integer) ((t7a) arrayList.get(0)).b.e(t7a.g, 100);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        Integer num2 = (Integer) ((t7a) arrayList.get(0)).b.e(t7a.f, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        cyu cyuVar = ((qrm0) b0l0Var.b).v;
        if (cyuVar == null) {
            return new m3x(new Exception("Failed to take picture: pipeline is not ready."), (byte) 1);
        }
        txj txjVar = (txj) cyuVar.f5196a;
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = hne.class;
        try {
            txjVar.d(new a4e(txjVar, new j35(iIntValue, iIntValue2, tu9Var), (byte) 19), new ccf((Object) tu9Var, (byte) 6));
            tu9Var.f34540a = "DefaultSurfaceProcessor#snapshot";
        } catch (Exception e) {
            wu9Var.b(e);
        }
        return ro4.c0(wu9Var);
    }

    @Override // a.uu9
    public Object f(tu9 tu9Var) {
        byte b = this.f20305a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((AtomicReference) obj).set(tu9Var);
                return "SurfaceRequest-surface-recreation(" + ((pmn0) obj2).hashCode() + Separators.RPAREN;
            case 1:
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                tu9Var.a(new jg00(atomicBoolean, (byte) 1), zmk.f44629a);
                ((Executor) obj2).execute(new cps0(atomicBoolean, tu9Var, (Function0) obj, (byte) 3));
                return Unit.f46060a;
            case 2:
                raq0 raq0Var = (raq0) obj2;
                Surface surface = (Surface) obj;
                l8x.U("TextureViewImpl", "Surface set on Preview.");
                raq0Var.h.a(surface, bnk.a(), new ad3(tu9Var, (byte) 5));
                return "provideSurface[request=" + raq0Var.h + " surface=" + surface + "]";
        }
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        uks0 uks0Var = (uks0) this.b;
        yhs0 yhs0Var = (yhs0) this.c;
        s9m0 s9m0Var = uks0.l2;
        str.getClass();
        long j = bundle.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE", -1L);
        long j2 = bundle.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE", -1L);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        SimpleDate simpleDate = new SimpleDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        SimpleDate simpleDate2 = new SimpleDate(calendar2.get(1), calendar2.get(2) + 1, calendar2.get(5));
        if (j != -1 && j2 != -1) {
            vcc.f0(i120.V(new Pair("REQUEST_TIME_RESULT_KEY", new TransferTimeFilterUiModel.CustomTime(new TransferFilterTimeCustomDateValue.Selected(simpleDate), new TransferFilterTimeCustomDateValue.Selected(simpleDate2)))), uks0Var, "REQUEST_TIME_RESULT_KEY");
            uks0Var.x0();
            return;
        }
        if (j == -1) {
            simpleDate = null;
        }
        TransferFilterTimeCustomDateValue selected = TransferFilterTimeCustomDateValue.Unselected.f46617a;
        TransferFilterTimeCustomDateValue selected2 = simpleDate != null ? new TransferFilterTimeCustomDateValue.Selected(simpleDate) : selected;
        if (j2 == -1) {
            simpleDate2 = null;
        }
        if (simpleDate2 != null) {
            selected = new TransferFilterTimeCustomDateValue.Selected(simpleDate2);
        }
        TransferTimeFilterUiModel.CustomTime customTime = new TransferTimeFilterUiModel.CustomTime(selected2, selected);
        yhs0Var.getClass();
        yhs0Var.c.setValue(customTime);
    }

    @Override // a.wzn0
    public Object k() {
        byte b = this.f20305a;
        Object obj = this.c;
        wdu wduVar = (wdu) this.b;
        switch (b) {
            case 4:
                Iterable iterable = (Iterable) obj;
                wpg0 wpg0Var = (wpg0) wduVar.d;
                wpg0Var.getClass();
                if (iterable.iterator().hasNext()) {
                    wpg0Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(wpg0.n(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((wpg0) wduVar.j).k(((Integer) entry.getValue()).intValue(), jv00.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }
}

package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.bet_history.TimeTypeModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/axv;", "La/iw5;", "<init>", "()V", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class axv extends iw5 {
    public final zz2 k2 = new zz2("MAX_PERIOD_KEY");
    public final phf0 l2 = new phf0("REQUEST_KEY");
    public ii m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(axv.class, "maxPeriod", "getMaxPeriod()I", 0), new ez40(axv.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final art n2 = new art();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        List<TimeTypeModel> listL0;
        wlq0 wlq0Var;
        fetVar.e0(-1273897904);
        c0o c0oVar = TimeTypeModel.c;
        int iIntValue = this.k2.n(this, o2[0]).intValue();
        c0oVar.getClass();
        if (iIntValue > 7) {
            listL0 = CollectionsKt.L0(c0oVar);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = c0oVar.iterator();
            while (true) {
                y2 y2Var = (y2) it;
                if (!y2Var.hasNext()) {
                    break;
                }
                Object next = y2Var.next();
                if (((TimeTypeModel) next) != TimeTypeModel.f46394a) {
                    arrayList.add(next);
                }
            }
            listL0 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(listL0, 10));
        for (TimeTypeModel timeTypeModel : listL0) {
            timeTypeModel.getClass();
            switch (timeTypeModel.ordinal()) {
                case 0:
                    wlq0Var = new wlq0(R.string.filter_1h, timeTypeModel);
                    break;
                case 1:
                    wlq0Var = new wlq0(R.string.filter_2h, timeTypeModel);
                    break;
                case 2:
                    wlq0Var = new wlq0(R.string.filter_6h, timeTypeModel);
                    break;
                case 3:
                    wlq0Var = new wlq0(R.string.filter_12h, timeTypeModel);
                    break;
                case 4:
                    wlq0Var = new wlq0(R.string.filter_1d, timeTypeModel);
                    break;
                case 5:
                    wlq0Var = new wlq0(R.string.hide_for_week, timeTypeModel);
                    break;
                case 6:
                    wlq0Var = new wlq0(R.string.collapse_all_title_history, timeTypeModel);
                    break;
                default:
                    t9f.b();
                    return null;
            }
            arrayList2.add(wlq0Var);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), nia0.b, (ugd) null, u1c.M(-1171863807, new rgh(arrayList2, this, (byte) 23), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(exv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            exv exvVar = (exv) (ze3Var instanceof exv ? ze3Var : null);
            if (exvVar != null) {
                ii iiVar = exvVar.f8597a;
                iiVar.getClass();
                this.m2 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(exv.class, "Cannot create dependency "));
    }
}

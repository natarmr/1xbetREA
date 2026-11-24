package a;

import android.widget.SeekBar;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;
import java.util.List;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class xug0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zug0 f41510a;
    public final /* synthetic */ dvh0 b;

    public xug0(zug0 zug0Var, dvh0 dvh0Var) {
        this.f41510a = zug0Var;
        this.b = dvh0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        gne0 gne0Var = zug0.V1;
        p7m0 p7m0Var = this.f41510a.I0().z;
        qwg0 qwg0Var = new qwg0(this.b);
        p7m0Var.getClass();
        p7m0Var.o(null, qwg0Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0182  */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Object value;
        int i;
        SaleDataModel saleDataModelA;
        Object value2;
        p7m0 p7m0Var;
        zug0 zug0Var = this.f41510a;
        if (seekBar != null) {
            gne0 gne0Var = zug0.V1;
            cxg0 cxg0VarI0 = zug0Var.I0();
            int progress = seekBar.getProgress();
            boolean z = cxg0VarI0.p;
            p7m0 p7m0Var2 = cxg0VarI0.y;
            int iOrdinal = this.b.ordinal();
            if (iOrdinal == 0) {
                int i2 = progress;
                SaleDataModel saleDataModel = cxg0VarI0.r;
                double d = saleDataModel.g;
                double d2 = saleDataModel.f;
                double d3 = (((d - d2) / 100.0d) * ((double) i2)) + d2;
                double d4 = (saleDataModel.i * d3) / saleDataModel.f46415a;
                double d5 = (((d3 - d4) / 100.0d) * ((double) cxg0VarI0.s)) + d4;
                List listJ = q3d.j(Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5));
                if (listJ == null || !listJ.isEmpty()) {
                    Iterator it = listJ.iterator();
                    while (it.hasNext()) {
                        double dDoubleValue = ((Number) it.next()).doubleValue();
                        if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                            do {
                                value = p7m0Var2.getValue();
                                i = i2;
                                i2 = i;
                            } while (!p7m0Var2.m(value, m9h0.a((m9h0) value, null, 0, 0, cxg0VarI0.u, false, false, false, false, false, null, null, i, 4079)));
                        }
                    }
                    cxg0VarI0.u = i2;
                    SaleDataModel saleDataModel2 = cxg0VarI0.r;
                    pn40 pn40Var = pn40.f27267a;
                    double dQ = pn40.q(d3);
                    double dQ2 = pn40.q(d5);
                    saleDataModelA = SaleDataModel.a(saleDataModel2, pn40.q(d3 - cxg0VarI0.r.d), pn40.q(d3), pn40.q(d4), dQ2, dQ, 0.0d, 3937);
                    cxg0VarI0.r = saleDataModelA;
                    if (z) {
                        saleDataModelA = cxg0.D(saleDataModelA);
                    }
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, m9h0.a((m9h0) value2, cxg0VarI0.z(saleDataModelA), 0, 0, cxg0VarI0.u, false, false, false, false, false, null, null, 0, 8174)));
                } else {
                    cxg0VarI0.u = i2;
                    SaleDataModel saleDataModel3 = cxg0VarI0.r;
                    pn40 pn40Var2 = pn40.f27267a;
                    double dQ3 = pn40.q(d3);
                    double dQ4 = pn40.q(d5);
                    saleDataModelA = SaleDataModel.a(saleDataModel3, pn40.q(d3 - cxg0VarI0.r.d), pn40.q(d3), pn40.q(d4), dQ4, dQ3, 0.0d, 3937);
                    cxg0VarI0.r = saleDataModelA;
                    if (z) {
                        saleDataModelA = cxg0.D(saleDataModelA);
                    }
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, m9h0.a((m9h0) value2, cxg0VarI0.z(saleDataModelA), 0, 0, cxg0VarI0.u, false, false, false, false, false, null, null, 0, 8174)));
                }
            } else if (iOrdinal == 1) {
                cxg0VarI0.w(progress);
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
                pn40 pn40Var3 = pn40.f27267a;
                double dQ5 = pn40.q((cxg0VarI0.r.k / 100.0d) * ((double) (100 - progress)));
                SaleDataModel saleDataModel4 = cxg0VarI0.r;
                int i3 = dQ5 < saleDataModel4.i ? 100 : progress;
                cxg0VarI0.s = progress;
                double d6 = saleDataModel4.c;
                double d7 = saleDataModel4.d;
                double dQ6 = pn40.q((((d6 - d7) / 100.0d) * ((double) i3)) + d7);
                int i4 = 100 - i3;
                cxg0VarI0.t = i4;
                SaleDataModel saleDataModelA2 = SaleDataModel.a(saleDataModel4, 0.0d, 0.0d, 0.0d, pn40.q(dQ6), 0.0d, pn40.q(((saleDataModel4.k - saleDataModel4.j) / 100.0d) * ((double) i4)), CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                cxg0VarI0.r = saleDataModelA2;
                if (z) {
                    saleDataModelA2 = cxg0.D(saleDataModelA2);
                }
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    int i5 = progress;
                    p7m0Var = p7m0Var2;
                    SaleDataModel saleDataModel5 = saleDataModelA2;
                    if (p7m0Var.m(value3, m9h0.a((m9h0) value3, cxg0VarI0.z(saleDataModelA2), 0, cxg0VarI0.s, 0, false, false, false, false, false, null, null, i5, 4086))) {
                        break;
                    }
                    progress = i5;
                    saleDataModelA2 = saleDataModel5;
                    p7m0Var2 = p7m0Var;
                }
                cxg0VarI0.A(((m9h0) p7m0Var.getValue()).c, cxg0VarI0.t, dvh0.c);
            }
        }
        gne0 gne0Var2 = zug0.V1;
        cxg0 cxg0VarI1 = zug0Var.I0();
        sac.V(jiu0.a(cxg0VarI1), new awg0((byte) 5), null, null, new swg0(cxg0VarI1, null, (byte) 2), 14);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }
}

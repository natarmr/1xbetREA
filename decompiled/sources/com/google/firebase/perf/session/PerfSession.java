package com.google.firebase.perf.session;

import a.d860;
import a.hsd;
import a.ltd;
import a.otd;
import a.qd90;
import a.rd90;
import a.v680;
import a.yk5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new d860(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45670a;
    public final Timer b;
    public boolean c;

    public PerfSession(Parcel parcel) {
        this.c = false;
        this.f45670a = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }

    public static rd90[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        rd90[] rd90VarArr = new rd90[list.size()];
        rd90 rd90VarA = ((PerfSession) list.get(0)).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            rd90 rd90VarA2 = ((PerfSession) list.get(i)).a();
            if (z || !((PerfSession) list.get(i)).c) {
                rd90VarArr[i] = rd90VarA2;
            } else {
                rd90VarArr[0] = rd90VarA2;
                rd90VarArr[i] = rd90VarA;
                z = true;
            }
        }
        if (!z) {
            rd90VarArr[0] = rd90VarA;
        }
        return rd90VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    public static PerfSession d(String str) {
        boolean z;
        otd otdVar;
        v680 v680Var;
        v680 v680VarB;
        double dDoubleValue;
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new yk5());
        hsd hsdVarE = hsd.e();
        if (hsdVarE.n()) {
            double dRandom = Math.random();
            synchronized (otd.class) {
                otdVar = otd.f25823a;
                if (otdVar == null) {
                    otdVar = new otd();
                    otd.f25823a = otdVar;
                }
            }
            v680 v680VarH = hsdVarE.h(otdVar);
            if (v680VarH.b()) {
                dDoubleValue = ((Double) v680VarH.a()).doubleValue() / 100.0d;
                if (!hsd.o(dDoubleValue)) {
                    v680Var = hsdVarE.f13576a.getDouble("fpr_vc_session_sampling_rate");
                    if (v680Var.b() || !hsd.o(((Double) v680Var.a()).doubleValue())) {
                        v680VarB = hsdVarE.b(otdVar);
                        if (!v680VarB.b() && hsd.o(((Double) v680VarB.a()).doubleValue())) {
                            dDoubleValue = ((Double) v680VarB.a()).doubleValue();
                        } else if (hsdVarE.f13576a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else {
                        hsdVarE.c.e("com.google.firebase.perf.SessionSamplingRate", ((Double) v680Var.a()).doubleValue());
                        dDoubleValue = ((Double) v680Var.a()).doubleValue();
                    }
                }
            } else {
                v680Var = hsdVarE.f13576a.getDouble("fpr_vc_session_sampling_rate");
                if (v680Var.b()) {
                    v680VarB = hsdVarE.b(otdVar);
                    if (!v680VarB.b()) {
                        if (hsdVarE.f13576a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (hsdVarE.f13576a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                } else {
                    v680VarB = hsdVarE.b(otdVar);
                    if (!v680VarB.b()) {
                        if (hsdVarE.f13576a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (hsdVarE.f13576a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                }
            }
            if (dRandom < dDoubleValue) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        perfSession.c = z;
        return perfSession;
    }

    public final rd90 a() {
        qd90 qd90VarU = rd90.u();
        qd90VarU.i();
        ((rd90) qd90VarU.b).v(this.f45670a);
        if (this.c) {
            qd90VarU.i();
            ((rd90) qd90VarU.b).r();
        }
        return (rd90) qd90VarU.h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean g() {
        ltd ltdVar;
        long jLongValue;
        long jA = this.b.a() / 60000000;
        hsd hsdVarE = hsd.e();
        hsdVarE.getClass();
        synchronized (ltd.class) {
            ltdVar = ltd.f20625a;
            if (ltdVar == null) {
                ltdVar = new ltd();
                ltd.f20625a = ltdVar;
            }
        }
        v680 v680VarI = hsdVarE.i(ltdVar);
        if (!v680VarI.b() || ((Long) v680VarI.a()).longValue() <= 0) {
            v680 v680Var = hsdVarE.f13576a.getLong("fpr_session_max_duration_min");
            if (!v680Var.b() || ((Long) v680Var.a()).longValue() <= 0) {
                v680 v680VarC = hsdVarE.c(ltdVar);
                jLongValue = (!v680VarC.b() || ((Long) v680VarC.a()).longValue() <= 0) ? 240L : ((Long) v680VarC.a()).longValue();
            } else {
                hsdVarE.c.d(((Long) v680Var.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = ((Long) v680Var.a()).longValue();
            }
        } else {
            jLongValue = ((Long) v680VarI.a()).longValue();
        }
        return jA > jLongValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45670a);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.b, 0);
    }

    public PerfSession(String str, yk5 yk5Var) {
        this.c = false;
        this.f45670a = str;
        this.b = new Timer();
    }
}

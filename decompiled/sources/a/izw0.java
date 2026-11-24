package a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class izw0 extends umw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15653a = 2;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izw0(tzw0 tzw0Var, fbv fbvVar) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.b = fbvVar;
    }

    @Override // a.umw0
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        switch (this.f15653a) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) wmw0.a(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                wmw0.d(parcel);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
                if (status.m()) {
                    try {
                        bew0 bew0Var = bew0.b;
                        int i2 = ldw0.f19874a;
                        dqm0.y(status, f4x0.t(bArrCreateByteArray, bew0.c), taskCompletionSource);
                    } catch (zew0 e) {
                        taskCompletionSource.setException(e);
                    }
                } else {
                    dqm0.y(status, null, taskCompletionSource);
                }
                return true;
            case 1:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.b;
                switch (i) {
                    case 1:
                        Status status2 = (Status) wmw0.a(parcel, Status.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status2, null, taskCompletionSource2);
                        break;
                    case 2:
                        Status status3 = (Status) wmw0.a(parcel, Status.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status3, null, taskCompletionSource2);
                        break;
                    case 3:
                        Status status4 = (Status) wmw0.a(parcel, Status.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status4, null, taskCompletionSource2);
                        break;
                    case 4:
                        Status status5 = (Status) wmw0.a(parcel, Status.CREATOR);
                        zzjh zzjhVar = (zzjh) wmw0.a(parcel, zzjh.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status5, zzjhVar, taskCompletionSource2);
                        break;
                    case 5:
                        Status status6 = (Status) wmw0.a(parcel, Status.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status6, null, taskCompletionSource2);
                        break;
                    case 6:
                        Status status7 = (Status) wmw0.a(parcel, Status.CREATOR);
                        zzjl zzjlVar = (zzjl) wmw0.a(parcel, zzjl.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status7, zzjlVar, taskCompletionSource2);
                        break;
                    case 7:
                        Status status8 = (Status) wmw0.a(parcel, Status.CREATOR);
                        zzjj zzjjVar = (zzjj) wmw0.a(parcel, zzjj.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status8, zzjjVar, taskCompletionSource2);
                        break;
                    case 8:
                        Status status9 = (Status) wmw0.a(parcel, Status.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status9, null, taskCompletionSource2);
                        break;
                    case 9:
                        Status status10 = (Status) wmw0.a(parcel, Status.CREATOR);
                        zzjo zzjoVar = (zzjo) wmw0.a(parcel, zzjo.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status10, zzjoVar, taskCompletionSource2);
                        break;
                    case 10:
                        Status status11 = (Status) wmw0.a(parcel, Status.CREATOR);
                        zzjh zzjhVar2 = (zzjh) wmw0.a(parcel, zzjh.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status11, zzjhVar2, taskCompletionSource2);
                        break;
                    case 11:
                        Status status12 = (Status) wmw0.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        wmw0.d(parcel);
                        dqm0.y(status12, null, taskCompletionSource2);
                        break;
                    case 12:
                        Status status13 = (Status) wmw0.a(parcel, Status.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status13, null, taskCompletionSource2);
                        break;
                    case 13:
                        Status status14 = (Status) wmw0.a(parcel, Status.CREATOR);
                        zzjs zzjsVar = (zzjs) wmw0.a(parcel, zzjs.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status14, zzjsVar, taskCompletionSource2);
                        break;
                    case 14:
                        Status status15 = (Status) wmw0.a(parcel, Status.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status15, null, taskCompletionSource2);
                        break;
                    case 15:
                        Status status16 = (Status) wmw0.a(parcel, Status.CREATOR);
                        wmw0.d(parcel);
                        dqm0.y(status16, null, taskCompletionSource2);
                        break;
                    case 16:
                        Status status17 = (Status) wmw0.a(parcel, Status.CREATOR);
                        long j = parcel.readLong();
                        wmw0.d(parcel);
                        dqm0.y(status17, Long.valueOf(j), taskCompletionSource2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                wmw0.d(parcel);
                nmt0 nmt0Var = new nmt0();
                nmt0Var.f23789a = bArrCreateByteArray2;
                fbv fbvVar = (fbv) this.b;
                ((vox) fbvVar.f9280a).execute(new mfr((Object) fbvVar, (Object) nmt0Var, (byte) 19));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izw0(tzw0 tzw0Var, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.b = taskCompletionSource;
    }

    public izw0(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.b = taskCompletionSource;
    }
}

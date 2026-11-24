package a;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class k9w0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sav f17936a;
    public final char b;
    public final ua3 c;
    public final long d;
    public final long e;

    /* JADX WARN: Multi-variable type inference failed */
    public k9w0(sav savVar, int i, ua3 ua3Var, long j, long j2) {
        this.f17936a = savVar;
        this.b = i;
        this.c = ua3Var;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static ConnectionTelemetryConfiguration a(h9w0 h9w0Var, hz5 hz5Var, int i) {
        com.google.android.gms.common.internal.zzj zzjVar = hz5Var.w;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar == null ? null : zzjVar.d;
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.b) {
            int[] iArr = connectionTelemetryConfiguration.d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = connectionTelemetryConfiguration.f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (h9w0Var.q < connectionTelemetryConfiguration.e) {
                        return connectionTelemetryConfiguration;
                    }
                } else if (h9w0Var.q < connectionTelemetryConfiguration.e) {
                    return connectionTelemetryConfiguration;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (h9w0Var.q < connectionTelemetryConfiguration.e) {
                        return connectionTelemetryConfiguration;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        sav savVar = this.f17936a;
        if (savVar.f()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) peg0.m().b;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) {
                h9w0 h9w0Var = (h9w0) savVar.j.get(this.c);
                if (h9w0Var != null) {
                    b9v b9vVar = h9w0Var.b;
                    if (b9vVar instanceof hz5) {
                        b9v b9vVar2 = b9vVar;
                        long j3 = this.d;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        short s = b9vVar2.q;
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.c;
                            i = rootTelemetryConfiguration.d;
                            i3 = rootTelemetryConfiguration.e;
                            i2 = rootTelemetryConfiguration.f45491a;
                            if (b9vVar2.w != null && !b9vVar2.q()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(h9w0Var, b9vVar2, this.b);
                                if (connectionTelemetryConfigurationA == null) {
                                    return;
                                }
                                boolean z2 = connectionTelemetryConfigurationA.c && j3 > 0;
                                i3 = connectionTelemetryConfigurationA.e;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i7 = i;
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof qa3) {
                                Status status = ((qa3) exception).getStatus();
                                i4 = status.f45486a;
                                ConnectionResult connectionResult = status.d;
                                if (connectionResult != null) {
                                    i5 = i4;
                                    i6 = connectionResult.b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j = j3;
                            j2 = jCurrentTimeMillis;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        l9w0 l9w0Var = new l9w0(new MethodInvocation(this.b, i5, i6, s, iElapsedRealtime, j, j2, null, null), i2, i7, i3);
                        jaw0 jaw0Var = savVar.m;
                        jaw0Var.sendMessage(jaw0Var.obtainMessage(18, l9w0Var));
                    }
                }
            }
        }
    }
}

package a;

import android.gov.nist.core.Separators;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class u7f {
    public static final f03 g = f03.d();
    public static final int h = 1000000;
    public ScheduledFuture e = null;
    public long f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f35181a = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j, Timer timer) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new t7f(this, timer, (byte) 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            g.f("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public final y7f b(Timer timer) {
        long j = this.d;
        f03 f03Var = g;
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
            try {
                long jA = timer.a() + timer.f45671a;
                String[] strArrSplit = bufferedReader.readLine().split(Separators.SP);
                long j2 = Long.parseLong(strArrSplit[13]);
                long j3 = Long.parseLong(strArrSplit[15]);
                long j4 = Long.parseLong(strArrSplit[14]);
                long j5 = Long.parseLong(strArrSplit[16]);
                x7f x7fVarR = y7f.r();
                x7fVarR.i();
                ((y7f) x7fVarR.b).s(jA);
                double d = (j4 + j5) / j;
                int i = h;
                long jRound = Math.round(d * ((double) i));
                x7fVarR.i();
                ((y7f) x7fVarR.b).t(jRound);
                long jRound2 = Math.round(((j2 + j3) / j) * ((double) i));
                x7fVarR.i();
                ((y7f) x7fVarR.b).u(jRound2);
                y7f y7fVar = (y7f) x7fVarR.h();
                bufferedReader.close();
                return y7fVar;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            f03Var.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            f03Var.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            f03Var.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            f03Var.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}

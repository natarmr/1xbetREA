package a;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f03 f16138a = f03.d();

    public static void a(Trace trace, d7r d7rVar) {
        int i = d7rVar.f5607a;
        int i2 = d7rVar.c;
        int i3 = d7rVar.b;
        if (i > 0) {
            trace.putMetric("_fr_tot", i);
        }
        if (i3 > 0) {
            trace.putMetric("_fr_slo", i3);
        }
        if (i2 > 0) {
            trace.putMetric("_fr_fzn", i2);
        }
        StringBuilder sb = new StringBuilder("Screen trace: ");
        sb.append(trace.d);
        sb.append(" _fr_tot:");
        axq.r(d7rVar.f5607a, i3, " _fr_slo:", " _fr_fzn:", sb);
        sb.append(i2);
        f16138a.a(sb.toString());
    }
}

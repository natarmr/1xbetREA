package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.SipStackImpl;
import android.javax.sip.SipStack;
import android.javax.sip.message.Message;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class CallAnalysisInterceptor implements SIPEventInterceptor {
    private static final CallAnalyzer.MetricReference interceptorCheckpoint = new CallAnalyzer.MetricReference("ick");
    private CallAnalyzer callAnalyzer;

    @Override // android.gov.nist.javax.sip.stack.SIPEventInterceptor
    public void afterMessage(Message message) {
        this.callAnalyzer.leave(interceptorCheckpoint);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPEventInterceptor
    public void beforeMessage(Message message) {
        this.callAnalyzer.enter(interceptorCheckpoint);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPEventInterceptor
    public void destroy() {
        this.callAnalyzer.stop();
        this.callAnalyzer = null;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPEventInterceptor
    public void init(SipStack sipStack) {
        SipStackImpl sipStackImpl = (SipStackImpl) sipStack;
        this.callAnalyzer = new CallAnalyzer(sipStackImpl);
        Properties configurationProperties = sipStackImpl.getConfigurationProperties();
        this.callAnalyzer.configure(interceptorCheckpoint, new CallAnalyzer.MetricAnalysisConfiguration(Long.valueOf(Long.parseLong(configurationProperties.getProperty(CallAnalysisInterceptor.class.getName().concat(".checkingInterval"), "1000"))), Long.valueOf(Long.parseLong(configurationProperties.getProperty(CallAnalysisInterceptor.class.getName().concat(".minTimeBetweenDumps"), "2000"))), Long.valueOf(Long.parseLong(configurationProperties.getProperty(CallAnalysisInterceptor.class.getName().concat(".minStuckTIme"), "4000")))));
    }
}

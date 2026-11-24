package android.gov.nist.core;

import android.gov.nist.javax.sip.message.SIPMessage;
import android.javax.sip.SipStack;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public interface ServerLogger extends LogLevels {
    void closeLogFile();

    void logException(Exception exc);

    void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z);

    void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z, long j);

    void logMessage(SIPMessage sIPMessage, String str, String str2, boolean z, long j);

    void setSipStack(SipStack sipStack);

    void setStackProperties(Properties properties);
}

package android.gov.nist.core;

import a.xu00;
import a.yv00;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class CommonLogger implements StackLogger {
    public static StackLogger legacyLogger = null;
    public static boolean useLegacyLogger = true;
    private String name;
    private StackLogger otherLogger;

    public CommonLogger(String str) {
        this.name = str;
    }

    public static StackLogger getLogger(Class cls) {
        return getLogger(cls.getName());
    }

    public static void init(Properties properties) {
    }

    private StackLogger logger() {
        if (useLegacyLogger) {
            StackLogger stackLogger = legacyLogger;
            if (stackLogger != null) {
                return stackLogger;
            }
            String str = this.name;
            int i = yv00.d;
            return new CommonLoggerLog4j(xu00.a(str));
        }
        StackLogger stackLogger2 = this.otherLogger;
        if (stackLogger2 != null) {
            return stackLogger2;
        }
        String str2 = this.name;
        int i2 = yv00.d;
        CommonLoggerLog4j commonLoggerLog4j = new CommonLoggerLog4j(xu00.a(str2));
        this.otherLogger = commonLoggerLog4j;
        return commonLoggerLog4j;
    }

    @Override // android.gov.nist.core.StackLogger
    public void disableLogging() {
        logger().disableLogging();
    }

    @Override // android.gov.nist.core.StackLogger
    public void enableLogging() {
        logger().enableLogging();
    }

    @Override // android.gov.nist.core.StackLogger
    public int getLineCount() {
        return logger().getLineCount();
    }

    @Override // android.gov.nist.core.StackLogger
    public String getLoggerName() {
        return logger().getLoggerName();
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled() {
        return logger().isLoggingEnabled();
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str) {
        logger().logDebug(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str) {
        logger().logError(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logException(Throwable th) {
        logger().logException(th);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logFatalError(String str) {
        logger().logFatalError(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logInfo(String str) {
        logger().logInfo(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace() {
        logger().logStackTrace();
    }

    @Override // android.gov.nist.core.StackLogger
    public void logTrace(String str) {
        logger().logTrace(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logWarning(String str) {
        logger().logWarning(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void setBuildTimeStamp(String str) {
        logger().setBuildTimeStamp(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void setStackProperties(Properties properties) {
        legacyLogger.setStackProperties(properties);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str, Exception exc) {
        logger().logDebug(str, exc);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str, Exception exc) {
        logger().logError(str, exc);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace(int i) {
        logger().logStackTrace(i);
    }

    public static StackLogger getLogger(String str) {
        return new CommonLogger(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled(int i) {
        return logger().isLoggingEnabled(i);
    }
}

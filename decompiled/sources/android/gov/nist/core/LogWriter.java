package android.gov.nist.core;

import a.bek;
import a.dkz;
import a.dp3;
import a.e9d0;
import a.lwb0;
import a.w6x;
import a.xu00;
import a.yv00;
import android.javax.sip.message.Request;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class LogWriter implements StackLogger {
    private String buildTimeStamp;
    private Properties configurationProperties;
    private int lineCount;
    private yv00 logger;
    private String stackName;
    private String logFileName = null;
    private volatile boolean needsLogging = false;
    protected int traceLevel = 0;

    private void countLines(String str) {
        for (char c : str.toCharArray()) {
            if (c == '\n') {
                this.lineCount++;
            }
        }
    }

    private String enhanceMessage(String str) {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder();
        sb.append(className);
        sb.append(Separators.DOT);
        sb.append(methodName);
        sb.append(Separators.LPAREN);
        sb.append(fileName);
        w6x.w(lineNumber, Separators.COLON, ") [", str, sb);
        sb.append("]");
        return sb.toString();
    }

    private void setTraceLevel(int i) {
        this.traceLevel = i;
    }

    public void addAppender(dp3 dp3Var) {
        this.logger.getClass();
    }

    @Override // android.gov.nist.core.StackLogger
    public void disableLogging() {
        this.needsLogging = false;
    }

    @Override // android.gov.nist.core.StackLogger
    public void enableLogging() {
        this.needsLogging = true;
    }

    public dkz getLevel(int i) {
        if (i == 16) {
            return dkz.k;
        }
        if (i == 4) {
            return dkz.i;
        }
        if (i == 32) {
            return dkz.l;
        }
        return i == 64 ? dkz.n : dkz.g;
    }

    @Override // android.gov.nist.core.StackLogger
    public int getLineCount() {
        return this.lineCount;
    }

    public lwb0 getLogPriority() {
        int i = this.traceLevel;
        if (i == 16) {
            return lwb0.e;
        }
        if (i == 4) {
            return lwb0.d;
        }
        return (i == 32 || i == 64) ? lwb0.f : lwb0.c;
    }

    public yv00 getLogger() {
        return this.logger;
    }

    @Override // android.gov.nist.core.StackLogger
    public String getLoggerName() {
        yv00 yv00Var = this.logger;
        if (yv00Var != null) {
            return yv00Var.f43296a;
        }
        return null;
    }

    public int getTraceLevel() {
        return this.traceLevel;
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled(int i) {
        return this.needsLogging && i <= this.traceLevel;
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str, Exception exc) {
        if (this.needsLogging) {
            String strEnhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                getLogger().a("BUILD TIMESTAMP = " + this.buildTimeStamp);
                getLogger().a("Config Propeties = " + this.configurationProperties);
            }
            countLines(strEnhanceMessage);
            getLogger().b(null, 10, strEnhanceMessage);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str) {
        yv00 logger = getLogger();
        String strEnhanceMessage = enhanceMessage(str);
        countLines(strEnhanceMessage);
        logger.b(null, 40, strEnhanceMessage);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logException(Throwable th) {
        if (this.needsLogging) {
            getLogger().b(null, 40, th.getMessage());
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logFatalError(String str) {
        yv00 logger = getLogger();
        String strEnhanceMessage = enhanceMessage(str);
        countLines(strEnhanceMessage);
        logger.b(yv00.c, 40, strEnhanceMessage);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logInfo(String str) {
        getLogger().b(null, 20, str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace(int i) {
        int i2;
        if (this.needsLogging) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            for (int i3 = 1; i3 < stackTrace.length; i3++) {
                printWriter.print("[" + stackTrace[i3].getFileName() + Separators.COLON + stackTrace[i3].getLineNumber() + "]");
            }
            printWriter.close();
            String string = stringWriter.getBuffer().toString();
            dkz level = getLevel(i);
            if (level.f20758a >= getLogPriority().f20758a) {
                yv00 yv00Var = this.logger;
                yv00Var.getClass();
                int i4 = level.f20758a;
                if (i4 == 5000 || i4 == 9900) {
                    i2 = 0;
                } else if (i4 == 10000) {
                    i2 = 10;
                } else if (i4 == 20000) {
                    i2 = 20;
                } else if (i4 != 30000) {
                    i2 = 40;
                    if (i4 != 40000 && i4 != 50000) {
                        e9d0.v(level, "Unknown Priority ");
                        return;
                    }
                } else {
                    i2 = 30;
                }
                yv00Var.b(null, i2, string);
            }
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logTrace(String str) {
        if (this.needsLogging) {
            String strEnhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                getLogger().a("BUILD TIMESTAMP = " + this.buildTimeStamp);
                getLogger().a("Config Propeties = " + this.configurationProperties);
            }
            countLines(strEnhanceMessage);
            getLogger().b(null, 0, strEnhanceMessage);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logWarning(String str) {
        getLogger().b(null, 30, str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void setBuildTimeStamp(String str) {
        this.buildTimeStamp = str;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a8 A[Catch: NumberFormatException -> 0x0049, TryCatch #2 {NumberFormatException -> 0x0049, blocks: (B:8:0x0034, B:10:0x0042, B:32:0x0087, B:34:0x0090, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:47:0x00c5, B:57:0x00ee, B:50:0x00cd, B:51:0x00d1, B:52:0x00e2, B:55:0x00e9, B:36:0x0098, B:38:0x00a0, B:40:0x00a8, B:14:0x004c, B:17:0x0055, B:20:0x005f, B:23:0x0069, B:25:0x0071, B:28:0x007a, B:30:0x0080), top: B:65:0x0034, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee A[Catch: NumberFormatException -> 0x0049, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0049, blocks: (B:8:0x0034, B:10:0x0042, B:32:0x0087, B:34:0x0090, B:41:0x00af, B:43:0x00b3, B:45:0x00b7, B:47:0x00c5, B:57:0x00ee, B:50:0x00cd, B:51:0x00d1, B:52:0x00e2, B:55:0x00e9, B:36:0x0098, B:38:0x00a0, B:40:0x00a8, B:14:0x004c, B:17:0x0055, B:20:0x005f, B:23:0x0069, B:25:0x0071, B:28:0x007a, B:30:0x0080), top: B:65:0x0034, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // android.gov.nist.core.StackLogger
    public void setStackProperties(Properties properties) {
        int i;
        int i2;
        bek bekVar;
        this.configurationProperties = properties;
        String property = properties.getProperty("android.gov.nist.javax.sip.TRACE_LEVEL");
        this.logFileName = properties.getProperty("android.gov.nist.javax.sip.DEBUG_LOG");
        String property2 = properties.getProperty("android.javax.sip.STACK_NAME");
        this.stackName = property2;
        String property3 = properties.getProperty("android.gov.nist.javax.sip.LOG4J_LOGGER_NAME", property2);
        int i3 = yv00.d;
        this.logger = xu00.a(property3);
        if (property == null) {
            this.needsLogging = false;
            return;
        }
        if (property.equals("LOG4J")) {
            CommonLogger.useLegacyLogger = false;
            return;
        }
        try {
            if (!property.equals("TRACE")) {
                if (!property.equals("DEBUG")) {
                    if (property.equals(Request.INFO)) {
                        i = 16;
                    } else if (property.equals("ERROR")) {
                        i = 4;
                    } else if (property.equals("NONE") || property.equals("OFF")) {
                        i = 0;
                    } else {
                        i = Integer.parseInt(property);
                        if (i > 32) {
                            Debug.debug = true;
                            Debug.setStackLogger(this);
                        }
                    }
                }
                setTraceLevel(i);
                this.needsLogging = true;
                i2 = this.traceLevel;
                if (i2 != 32 || i2 == 16 || i2 == 4) {
                    this.logger.getClass();
                } else if (i2 == 0) {
                    this.logger.getClass();
                    this.needsLogging = false;
                }
                if (this.needsLogging || this.logFileName == null) {
                }
                Boolean.valueOf(properties.getProperty("android.gov.nist.javax.sip.DEBUG_LOG_OVERWRITE")).booleanValue();
                bek bekVar2 = null;
                try {
                    bekVar = new bek();
                } catch (FileNotFoundException unused) {
                    File file = new File(this.logFileName);
                    file.getParentFile().mkdirs();
                    file.delete();
                    try {
                        bekVar = new bek();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (bekVar2 != null) {
                        this.logger.getClass();
                        return;
                    }
                    return;
                }
                bekVar2 = bekVar;
                if (bekVar2 != null) {
                    this.logger.getClass();
                    return;
                }
                return;
            }
            Debug.debug = true;
            Debug.setStackLogger(this);
            i = 32;
            setTraceLevel(i);
            this.needsLogging = true;
            i2 = this.traceLevel;
            if (i2 != 32) {
                this.logger.getClass();
            } else if (i2 == 0) {
                this.logger.getClass();
                this.needsLogging = false;
            }
            if (this.needsLogging) {
            }
        } catch (NumberFormatException e3) {
            e3.printStackTrace();
            System.err.println("LogWriter: Bad integer ".concat(property));
            System.err.println("logging dislabled ");
            this.needsLogging = false;
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled() {
        return this.needsLogging;
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str, Exception exc) {
        getLogger().b(null, 40, str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str) {
        if (this.needsLogging) {
            String strEnhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                getLogger().a("BUILD TIMESTAMP = " + this.buildTimeStamp);
                getLogger().a("Config Propeties = " + this.configurationProperties);
            }
            countLines(strEnhanceMessage);
            getLogger().a(strEnhanceMessage);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace() {
        logStackTrace(32);
    }
}

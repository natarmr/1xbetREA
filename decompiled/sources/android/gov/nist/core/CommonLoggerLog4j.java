package android.gov.nist.core;

import a.dkz;
import a.dp3;
import a.yv00;
import a.zv00;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class CommonLoggerLog4j implements StackLogger {
    private yv00 logger;

    public CommonLoggerLog4j(yv00 yv00Var) {
        this.logger = yv00Var;
    }

    public static dkz intToLevel(int i) {
        if (i == 2) {
            return dkz.h;
        }
        if (i == 4) {
            return dkz.i;
        }
        if (i == 8) {
            return dkz.j;
        }
        if (i == 16) {
            return dkz.k;
        }
        if (i != 32) {
            return i != 64 ? dkz.g : dkz.m;
        }
        return dkz.l;
    }

    public static int levelToInt(dkz dkzVar) {
        if (dkzVar.equals(dkz.k)) {
            return 16;
        }
        if (dkzVar.equals(dkz.i)) {
            return 4;
        }
        if (dkzVar.equals(dkz.l)) {
            return 32;
        }
        if (dkzVar.equals(dkz.j)) {
            return 8;
        }
        if (dkzVar.equals(dkz.m)) {
            return 64;
        }
        return dkzVar.equals(dkz.h) ? 2 : 0;
    }

    private void setTraceLevel(int i) {
    }

    public void addAppender(dp3 dp3Var) {
        this.logger.getClass();
    }

    @Override // android.gov.nist.core.StackLogger
    public void disableLogging() {
    }

    @Override // android.gov.nist.core.StackLogger
    public void enableLogging() {
    }

    @Override // android.gov.nist.core.StackLogger
    public int getLineCount() {
        return 0;
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
        this.logger.getClass();
        return levelToInt(null);
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled(int i) {
        yv00 yv00Var = this.logger;
        dkz dkzVarIntToLevel = intToLevel(i);
        zv00 zv00Var = yv00Var.b;
        int i2 = dkzVarIntToLevel.f20758a;
        if (i2 == 5000) {
            return zv00Var.f();
        }
        if (i2 == 10000) {
            return zv00Var.b();
        }
        if (i2 == 20000) {
            return zv00Var.e();
        }
        if (i2 == 30000) {
            return zv00Var.a();
        }
        if (i2 == 40000) {
            return zv00Var.i();
        }
        if (i2 != 50000) {
            return false;
        }
        return zv00Var.i();
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str, Exception exc) {
        this.logger.b(null, 10, str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str, Exception exc) {
        getLogger().b(null, 40, str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logException(Throwable th) {
        this.logger.b(null, 40, "Error");
    }

    @Override // android.gov.nist.core.StackLogger
    public void logFatalError(String str) {
        this.logger.b(yv00.c, 40, str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logInfo(String str) {
        getLogger().b(null, 20, str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace(int i) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        for (int i2 = 1; i2 < stackTrace.length; i2++) {
            printWriter.print("[" + stackTrace[i2].getFileName() + Separators.COLON + stackTrace[i2].getLineNumber() + "]");
        }
        printWriter.close();
        this.logger.a(stringWriter.getBuffer().toString());
    }

    @Override // android.gov.nist.core.StackLogger
    public void logTrace(String str) {
        this.logger.a(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logWarning(String str) {
        getLogger().b(null, 30, str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void setBuildTimeStamp(String str) {
        this.logger.b(null, 20, "Build timestamp: " + str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void setStackProperties(Properties properties) {
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str) {
        this.logger.a(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str) {
        this.logger.b(null, 40, str);
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled() {
        return this.logger.b.e();
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace() {
        logStackTrace(32);
    }
}

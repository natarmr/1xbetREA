package android.gov.nist.javax.sip.stack;

import a.jf4;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.ServerLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.LogRecord;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.javax.sip.SipStack;
import android.javax.sip.header.TimeStampHeader;
import android.javax.sip.message.Request;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class ServerLog implements ServerLogger {
    private String auxInfo;
    private Properties configurationProperties;
    private String description;
    private boolean logContent;
    private String logFileName;
    private PrintWriter printWriter;
    private SIPTransactionStack sipStack;
    private String stackIpAddress;
    protected StackLogger stackLogger;
    protected int traceLevel = 16;

    private void setProperties(Properties properties) {
        int i;
        this.configurationProperties = properties;
        this.description = properties.getProperty("android.javax.sip.STACK_NAME");
        this.stackIpAddress = properties.getProperty("android.javax.sip.IP_ADDRESS");
        this.logFileName = properties.getProperty("android.gov.nist.javax.sip.SERVER_LOG");
        String property = properties.getProperty("android.gov.nist.javax.sip.TRACE_LEVEL");
        String property2 = properties.getProperty("android.gov.nist.javax.sip.LOG_MESSAGE_CONTENT");
        this.logContent = property2 != null && property2.equals("true");
        if (property != null) {
            if (property.equals("LOG4J")) {
                CommonLogger.useLegacyLogger = false;
            } else {
                try {
                    if (property.equals("DEBUG")) {
                        i = 32;
                    } else if (property.equals(Request.INFO)) {
                        i = 16;
                    } else if (property.equals("ERROR")) {
                        i = 4;
                    } else {
                        i = (property.equals("NONE") || property.equals("OFF")) ? 0 : Integer.parseInt(property);
                    }
                    setTraceLevel(i);
                } catch (NumberFormatException unused) {
                    System.out.println("ServerLog: WARNING Bad integer ".concat(property));
                    System.out.println("logging dislabled ");
                    setTraceLevel(0);
                }
            }
        }
        checkLogFile();
    }

    public void checkLogFile() {
        if (this.logFileName == null || this.traceLevel < 16) {
            return;
        }
        try {
            File file = new File(this.logFileName);
            if (!file.exists()) {
                file.createNewFile();
                this.printWriter = null;
            }
            if (this.printWriter == null) {
                PrintWriter printWriter = new PrintWriter((Writer) new FileWriter(this.logFileName, !Boolean.valueOf(this.configurationProperties.getProperty("android.gov.nist.javax.sip.SERVER_LOG_OVERWRITE")).booleanValue()), true);
                this.printWriter = printWriter;
                printWriter.println("<!-- Use the  Trace Viewer in src/tools/tracesviewer to view this  trace  \nHere are the stack configuration properties \nandroid.javax.sip.IP_ADDRESS= " + this.configurationProperties.getProperty("android.javax.sip.IP_ADDRESS") + "\nandroid.javax.sip.STACK_NAME= " + this.configurationProperties.getProperty("android.javax.sip.STACK_NAME") + "\nandroid.javax.sip.ROUTER_PATH= " + this.configurationProperties.getProperty("android.javax.sip.ROUTER_PATH") + "\nandroid.javax.sip.OUTBOUND_PROXY= " + this.configurationProperties.getProperty("android.javax.sip.OUTBOUND_PROXY") + "\n-->");
                PrintWriter printWriter2 = this.printWriter;
                StringBuilder sb = new StringBuilder("<description\n logDescription=\"");
                sb.append(this.description);
                sb.append("\"\n name=\"");
                sb.append(this.configurationProperties.getProperty("android.javax.sip.STACK_NAME"));
                sb.append("\"\n auxInfo=\"");
                sb.append(this.auxInfo);
                sb.append("\"/>\n ");
                printWriter2.println(sb.toString());
                String str = this.auxInfo;
                SIPTransactionStack sIPTransactionStack = this.sipStack;
                if (str == null) {
                    if (sIPTransactionStack.isLoggingEnabled(32)) {
                        this.stackLogger.logDebug("Here are the stack configuration properties \n" + this.configurationProperties + Separators.RETURN);
                        this.stackLogger.logDebug(" ]]>");
                        this.stackLogger.logDebug("</debug>");
                        this.stackLogger.logDebug("<description\n logDescription=\"" + this.description + "\"\n name=\"" + this.stackIpAddress + "\" />\n");
                        this.stackLogger.logDebug("<debug>");
                        this.stackLogger.logDebug("<![CDATA[ ");
                        return;
                    }
                    return;
                }
                if (sIPTransactionStack.isLoggingEnabled(32)) {
                    this.stackLogger.logDebug("Here are the stack configuration properties \nandroid.javax.sip.IP_ADDRESS= " + this.configurationProperties.getProperty("android.javax.sip.IP_ADDRESS") + "\nandroid.javax.sip.ROUTER_PATH= " + this.configurationProperties.getProperty("android.javax.sip.ROUTER_PATH") + "\nandroid.javax.sip.OUTBOUND_PROXY= " + this.configurationProperties.getProperty("android.javax.sip.OUTBOUND_PROXY") + "\nandroid.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS= " + this.configurationProperties.getProperty("android.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS") + "\nandroid.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS= " + this.configurationProperties.getProperty("android.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS") + "\nandroid.gov.nist.javax.sip.REENTRANT_LISTENER= " + this.configurationProperties.getProperty("android.gov.nist.javax.sip.REENTRANT_LISTENER") + "android.gov.nist.javax.sip.THREAD_POOL_SIZE= " + this.configurationProperties.getProperty("android.gov.nist.javax.sip.THREAD_POOL_SIZE") + Separators.RETURN);
                    this.stackLogger.logDebug(" ]]> ");
                    this.stackLogger.logDebug("</debug>");
                    StackLogger stackLogger = this.stackLogger;
                    StringBuilder sb2 = new StringBuilder("<description\n logDescription=\"");
                    sb2.append(this.description);
                    sb2.append("\"\n name=\"");
                    sb2.append(this.stackIpAddress);
                    sb2.append("\"\n auxInfo=\"");
                    sb2.append(this.auxInfo);
                    sb2.append("\"/>\n ");
                    stackLogger.logDebug(sb2.toString());
                    this.stackLogger.logDebug("<debug>");
                    this.stackLogger.logDebug("<![CDATA[ ");
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // android.gov.nist.core.ServerLogger
    public synchronized void closeLogFile() {
        PrintWriter printWriter = this.printWriter;
        if (printWriter != null) {
            printWriter.close();
            this.printWriter = null;
        }
    }

    public String getLogFileName() {
        return this.logFileName;
    }

    public int getTraceLevel() {
        return this.traceLevel;
    }

    @Override // android.gov.nist.core.ServerLogger
    public void logException(Exception exc) {
        if (this.traceLevel >= 4) {
            checkLogFile();
            exc.printStackTrace();
            PrintWriter printWriter = this.printWriter;
            if (printWriter != null) {
                exc.printStackTrace(printWriter);
            }
        }
    }

    @Override // android.gov.nist.core.ServerLogger
    public void logMessage(SIPMessage sIPMessage, String str, String str2, boolean z, long j) {
        checkLogFile();
        if (sIPMessage.getFirstLine() == null) {
            return;
        }
        CallID callID = (CallID) sIPMessage.getCallId();
        String callId = callID != null ? callID.getCallId() : null;
        String strTrim = sIPMessage.getFirstLine().trim();
        String strEncode = this.logContent ? sIPMessage.encode() : sIPMessage.encodeMessage(new StringBuilder()).toString();
        String transactionId = sIPMessage.getTransactionId();
        TimeStampHeader timeStampHeader = (TimeStampHeader) sIPMessage.getHeader("Timestamp");
        logMessage(strEncode, str, str2, z, callId, strTrim, null, transactionId, j, timeStampHeader == null ? 0L : timeStampHeader.getTime());
    }

    public boolean needsLogging() {
        return this.logFileName != null;
    }

    public void setAuxInfo(String str) {
        this.auxInfo = str;
    }

    public void setLevel(int i) {
    }

    public void setLogFileName(String str) {
        this.logFileName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.gov.nist.core.ServerLogger
    public void setSipStack(SipStack sipStack) {
        if (!(sipStack instanceof SIPTransactionStack)) {
            jf4.o("sipStack must be a SIPTransactionStack");
            return;
        }
        SIPTransactionStack sIPTransactionStack = (SIPTransactionStack) sipStack;
        this.sipStack = sIPTransactionStack;
        this.stackLogger = sIPTransactionStack.getStackLogger();
    }

    public void setStackIpAddress(String str) {
        this.stackIpAddress = str;
    }

    @Override // android.gov.nist.core.ServerLogger
    public void setStackProperties(Properties properties) {
        setProperties(properties);
    }

    public void setTraceLevel(int i) {
        this.traceLevel = i;
    }

    private void logMessage(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, long j, long j2) {
        LogRecord logRecordCreateLogRecord = this.sipStack.logRecordFactory.createLogRecord(str, str2, str3, j, z, str5, str7, str4, j2);
        if (logRecordCreateLogRecord != null) {
            logMessage(logRecordCreateLogRecord.toString());
        }
    }

    private void logMessage(String str) {
        checkLogFile();
        PrintWriter printWriter = this.printWriter;
        if (printWriter != null) {
            printWriter.println(str);
        }
        if (this.sipStack.isLoggingEnabled()) {
            this.stackLogger.logInfo(str);
        }
    }

    @Override // android.gov.nist.core.ServerLogger
    public void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z, long j) {
        checkLogFile();
        CallID callID = (CallID) sIPMessage.getCallId();
        String callId = callID != null ? callID.getCallId() : null;
        String strTrim = sIPMessage.getFirstLine().trim();
        String strEncode = this.logContent ? sIPMessage.encode() : sIPMessage.encodeMessage(new StringBuilder()).toString();
        String transactionId = sIPMessage.getTransactionId();
        TimeStampHeader timeStampHeader = (TimeStampHeader) sIPMessage.getHeader("Timestamp");
        logMessage(strEncode, str, str2, z, callId, strTrim, str3, transactionId, j, timeStampHeader == null ? 0L : timeStampHeader.getTime());
    }

    @Override // android.gov.nist.core.ServerLogger
    public void logMessage(SIPMessage sIPMessage, String str, String str2, String str3, boolean z) {
        logMessage(sIPMessage, str, str2, str3, z, System.currentTimeMillis());
    }
}

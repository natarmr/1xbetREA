package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPDialog;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.javax.sip.DialogState;
import android.javax.sip.DialogTerminatedEvent;
import android.javax.sip.IOExceptionEvent;
import android.javax.sip.RequestEvent;
import android.javax.sip.ResponseEvent;
import android.javax.sip.SipListener;
import android.javax.sip.TimeoutEvent;
import android.javax.sip.TransactionTerminatedEvent;
import java.util.EventObject;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class EventScanner implements Runnable {
    private static StackLogger logger = CommonLogger.getLogger(EventScanner.class);
    private boolean isStopped;
    private SipStackImpl sipStack;
    private AtomicInteger refCount = new AtomicInteger(0);
    private BlockingQueue<EventWrapper> pendingEvents = new LinkedBlockingQueue();

    public EventScanner(SipStackImpl sipStackImpl) {
        Thread thread = new Thread(this);
        thread.setDaemon(false);
        this.sipStack = sipStackImpl;
        thread.setName("EventScannerThread");
        thread.start();
    }

    private void deliverDialogTerminatedEvent(DialogTerminatedEvent dialogTerminatedEvent, EventWrapper eventWrapper, SipListener sipListener) {
        if (sipListener != null) {
            try {
                sipListener.processDialogTerminated(dialogTerminatedEvent);
            } catch (AbstractMethodError unused) {
                if (logger.isLoggingEnabled()) {
                    logger.logWarning("Unable to call sipListener.processDialogTerminated");
                }
            } catch (Exception e) {
                logger.logException(e);
            }
        }
    }

    private void deliverDialogTimeoutEvent(DialogTimeoutEvent dialogTimeoutEvent, EventWrapper eventWrapper, SipListener sipListener) {
        if (sipListener != null) {
            try {
                if (sipListener instanceof SipListenerExt) {
                    ((SipListenerExt) sipListener).processDialogTimeout(dialogTimeoutEvent);
                    return;
                }
            } catch (Exception e) {
                logger.logException(e);
                return;
            }
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("DialogTimeoutEvent not delivered");
        }
    }

    private void deliverIOExceptionEvent(IOExceptionEvent iOExceptionEvent, EventWrapper eventWrapper, SipListener sipListener) {
        if (sipListener != null) {
            try {
                sipListener.processIOException(iOExceptionEvent);
            } catch (Exception e) {
                logger.logException(e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0180 A[Catch: all -> 0x0047, Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:64:0x0178, B:66:0x0180, B:70:0x01ad, B:71:0x01b0, B:73:0x01b8, B:74:0x01cd, B:76:0x01d1, B:78:0x01d9), top: B:111:0x0178, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ad A[Catch: all -> 0x0047, Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:64:0x0178, B:66:0x0180, B:70:0x01ad, B:71:0x01b0, B:73:0x01b8, B:74:0x01cd, B:76:0x01d1, B:78:0x01d9), top: B:111:0x0178, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8 A[Catch: all -> 0x0047, Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:64:0x0178, B:66:0x0180, B:70:0x01ad, B:71:0x01b0, B:73:0x01b8, B:74:0x01cd, B:76:0x01d1, B:78:0x01d9), top: B:111:0x0178, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x021c  */
    /* JADX WARN: Code duplicated, block: B:94:0x022f  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0180, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x01b8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x01ea, please report this as an issue */
    private void deliverRequestEvent(RequestEvent requestEvent, EventWrapper eventWrapper, SipListener sipListener) {
        SIPTransaction sIPTransaction;
        SIPTransaction sIPTransaction2;
        SIPTransaction sIPTransaction3;
        SIPDialog sIPDialog;
        try {
            SIPRequest sIPRequest = (SIPRequest) requestEvent.getRequest();
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("deliverEvent : " + sIPRequest.getFirstLine() + " transaction " + eventWrapper.transaction + " sipEvent.serverTx = " + requestEvent.getServerTransaction());
            }
            SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) sIPRequest, true);
            if (sIPServerTransaction == null || sIPServerTransaction.passToListener()) {
                if (this.sipStack.findPendingTransaction(sIPRequest.getTransactionId()) != null) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("transaction already exists!!");
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Done processing Message " + ((SIPRequest) requestEvent.getRequest()).getFirstLine());
                    }
                    SIPTransaction sIPTransaction4 = eventWrapper.transaction;
                    if (sIPTransaction4 != null && ((SIPServerTransaction) sIPTransaction4).passToListener()) {
                        ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
                    }
                    SIPTransaction sIPTransaction5 = eventWrapper.transaction;
                    if (sIPTransaction5 != null) {
                        this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction5);
                    }
                    if (!eventWrapper.transaction.getMethod().equals("ACK")) {
                        return;
                    }
                    eventWrapper.transaction.setState(5);
                    return;
                }
                this.sipStack.putPendingTransaction((SIPServerTransaction) eventWrapper.transaction);
                sIPRequest.setTransaction(eventWrapper.transaction);
                try {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Calling listener " + sIPRequest.getFirstLine());
                        logger.logDebug("Calling listener " + eventWrapper.transaction);
                    }
                    if (sipListener != null) {
                        sipListener.processRequest(requestEvent);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Done processing Message " + sIPRequest.getFirstLine());
                    }
                    sIPTransaction3 = eventWrapper.transaction;
                    if (sIPTransaction3 != null && (sIPDialog = (SIPDialog) sIPTransaction3.getDialog()) != null) {
                        sIPDialog.requestConsumed();
                    }
                } catch (Exception e) {
                    logger.logException(e);
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Done processing Message " + ((SIPRequest) requestEvent.getRequest()).getFirstLine());
                }
                sIPTransaction = eventWrapper.transaction;
                if (sIPTransaction != null && ((SIPServerTransaction) sIPTransaction).passToListener()) {
                    ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
                }
                sIPTransaction2 = eventWrapper.transaction;
                if (sIPTransaction2 != null) {
                    this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction2);
                }
                if (eventWrapper.transaction.getMethod().equals("ACK")) {
                    eventWrapper.transaction.setState(5);
                }
            }
            if (!sIPRequest.getMethod().equals("ACK") || !sIPServerTransaction.isInviteTransaction() || (sIPServerTransaction.getLastResponseStatusCode() / 100 != 2 && !this.sipStack.isNon2XXAckPassedToListener())) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("transaction already exists! " + sIPServerTransaction);
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Done processing Message " + ((SIPRequest) requestEvent.getRequest()).getFirstLine());
                }
                SIPTransaction sIPTransaction6 = eventWrapper.transaction;
                if (sIPTransaction6 != null && ((SIPServerTransaction) sIPTransaction6).passToListener()) {
                    ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
                }
                SIPTransaction sIPTransaction7 = eventWrapper.transaction;
                if (sIPTransaction7 != null) {
                    this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction7);
                }
                if (!eventWrapper.transaction.getMethod().equals("ACK")) {
                    return;
                }
                eventWrapper.transaction.setState(5);
                return;
            }
            if (!this.sipStack.isNon2XXAckPassedToListener() && logger.isLoggingEnabled(32)) {
                logger.logDebug("Detected broken client sending ACK with same branch! Passing...");
            }
            sIPRequest.setTransaction(eventWrapper.transaction);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Calling listener " + sIPRequest.getFirstLine());
                logger.logDebug("Calling listener " + eventWrapper.transaction);
            }
            if (sipListener != null) {
                sipListener.processRequest(requestEvent);
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Done processing Message " + sIPRequest.getFirstLine());
            }
            sIPTransaction3 = eventWrapper.transaction;
            if (sIPTransaction3 != null) {
                sIPDialog.requestConsumed();
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Done processing Message " + ((SIPRequest) requestEvent.getRequest()).getFirstLine());
            }
            sIPTransaction = eventWrapper.transaction;
            if (sIPTransaction != null) {
                ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
            }
            sIPTransaction2 = eventWrapper.transaction;
            if (sIPTransaction2 != null) {
                this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction2);
            }
            if (eventWrapper.transaction.getMethod().equals("ACK")) {
                eventWrapper.transaction.setState(5);
            }
        } catch (Throwable th) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Done processing Message " + ((SIPRequest) requestEvent.getRequest()).getFirstLine());
            }
            SIPTransaction sIPTransaction8 = eventWrapper.transaction;
            if (sIPTransaction8 != null && ((SIPServerTransaction) sIPTransaction8).passToListener()) {
                ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
            }
            SIPTransaction sIPTransaction9 = eventWrapper.transaction;
            if (sIPTransaction9 != null) {
                this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction9);
            }
            if (eventWrapper.transaction.getMethod().equals("ACK")) {
                eventWrapper.transaction.setState(5);
            }
            throw th;
        }
    }

    private void deliverResponseEvent(ResponseEvent responseEvent, EventWrapper eventWrapper, SipListener sipListener) {
        try {
            SIPResponse sIPResponse = (SIPResponse) responseEvent.getResponse();
            SIPDialog sIPDialog = (SIPDialog) responseEvent.getDialog();
            try {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Calling listener " + sipListener + " for " + sIPResponse.getFirstLine());
                }
                if (sipListener != null) {
                    SIPTransaction sIPTransaction = eventWrapper.transaction;
                    if (sIPTransaction != null) {
                        sIPTransaction.setPassToListener();
                    }
                    sipListener.processResponse(responseEvent);
                }
                if (sIPDialog != null && ((sIPDialog.getState() == null || !sIPDialog.getState().equals(DialogState.TERMINATED)) && (sIPResponse.getStatusCode() == 481 || sIPResponse.getStatusCode() == 408))) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Removing dialog on 408 or 481 response");
                    }
                    sIPDialog.doDeferredDelete();
                }
                if (sIPResponse.getCSeq().getMethod().equals("INVITE") && sIPDialog != null && sIPResponse.getStatusCode() == 200) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Warning! unacknowledged dialog. " + sIPDialog.getState());
                    }
                    sIPDialog.doDeferredDeleteIfNoAckSent(sIPResponse.getCSeq().getSeqNumber());
                }
            } catch (Exception e) {
                logger.logException(e);
            }
            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) eventWrapper.transaction;
            if (sIPClientTransaction != null && 3 == sIPClientTransaction.getInternalState() && !sIPClientTransaction.getMethod().equals("INVITE")) {
                sIPClientTransaction.clearState();
            }
            SIPTransaction sIPTransaction2 = eventWrapper.transaction;
            if (sIPTransaction2 == null || !sIPTransaction2.passToListener()) {
                return;
            }
            eventWrapper.transaction.releaseSem();
        } catch (Throwable th) {
            SIPTransaction sIPTransaction3 = eventWrapper.transaction;
            if (sIPTransaction3 != null && sIPTransaction3.passToListener()) {
                eventWrapper.transaction.releaseSem();
            }
            throw th;
        }
    }

    private void deliverTimeoutEvent(TimeoutEvent timeoutEvent, EventWrapper eventWrapper, SipListener sipListener) {
        if (sipListener != null) {
            try {
                sipListener.processTimeout(timeoutEvent);
            } catch (Exception e) {
                logger.logException(e);
            }
        }
    }

    private void deliverTransactionTerminatedEvent(TransactionTerminatedEvent transactionTerminatedEvent, EventWrapper eventWrapper, SipListener sipListener) {
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("About to deliver transactionTerminatedEvent");
                logger.logDebug("tx = " + transactionTerminatedEvent.getClientTransaction());
                logger.logDebug("tx = " + transactionTerminatedEvent.getServerTransaction());
            }
            if (sipListener != null) {
                sipListener.processTransactionTerminated(transactionTerminatedEvent);
            }
        } catch (AbstractMethodError unused) {
            if (logger.isLoggingEnabled()) {
                logger.logWarning("Unable to call sipListener.processTransactionTerminated");
            }
        } catch (Exception e) {
            logger.logException(e);
        }
    }

    public void addEvent(EventWrapper eventWrapper) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("addEvent " + eventWrapper);
        }
        if (this.pendingEvents.offer(eventWrapper)) {
            return;
        }
        logger.logWarning("reached queue capacity limit couldn't addEvent " + eventWrapper);
    }

    public void deliverEvent(EventWrapper eventWrapper) {
        EventObject eventObject = eventWrapper.sipEvent;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sipEvent = " + eventObject + "source = " + eventObject.getSource());
        }
        boolean z = eventObject instanceof IOExceptionEvent;
        SipListener sipListener = !z ? ((SipProviderImpl) eventObject.getSource()).getSipListener() : this.sipStack.getSipListener();
        if (eventObject instanceof RequestEvent) {
            deliverRequestEvent((RequestEvent) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof ResponseEvent) {
            deliverResponseEvent((ResponseEvent) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof TimeoutEvent) {
            deliverTimeoutEvent((TimeoutEvent) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof DialogTimeoutEvent) {
            deliverDialogTimeoutEvent((DialogTimeoutEvent) eventObject, eventWrapper, sipListener);
            return;
        }
        if (z) {
            deliverIOExceptionEvent((IOExceptionEvent) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof TransactionTerminatedEvent) {
            deliverTransactionTerminatedEvent((TransactionTerminatedEvent) eventObject, eventWrapper, sipListener);
            return;
        }
        if (eventObject instanceof DialogTerminatedEvent) {
            deliverDialogTerminatedEvent((DialogTerminatedEvent) eventObject, eventWrapper, sipListener);
            return;
        }
        logger.logFatalError("bad event" + eventObject);
    }

    public void forceStop() {
        this.isStopped = true;
        this.refCount.set(0);
    }

    public void incrementRefcount() {
        this.refCount.incrementAndGet();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ThreadAuditor.ThreadHandle threadHandleAddCurrentThread = this.sipStack.getThreadAuditor() != null ? this.sipStack.getThreadAuditor().addCurrentThread() : null;
            while (!this.isStopped) {
                if (threadHandleAddCurrentThread != null) {
                    threadHandleAddCurrentThread.ping();
                }
                try {
                    deliverEvent(this.pendingEvents.take());
                } catch (InterruptedException e) {
                    if (logger.isLoggingEnabled(4)) {
                        logger.logError("Interrupted!", e);
                    }
                    if (!logger.isLoggingEnabled(32) || this.isStopped) {
                        return;
                    }
                } catch (Exception e2) {
                    if (logger.isLoggingEnabled()) {
                        logger.logError("Unexpected exception caught while delivering event -- carrying on bravely", e2);
                    }
                }
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Stopped event scanner!!");
            }
            if (!logger.isLoggingEnabled(32) || this.isStopped) {
                return;
            }
            logger.logFatalError("Event scanner exited abnormally");
        } catch (Throwable th) {
            if (logger.isLoggingEnabled(32) && !this.isStopped) {
                logger.logFatalError("Event scanner exited abnormally");
            }
            throw th;
        }
    }

    public void stop() {
        if (this.refCount.get() == 0) {
            this.isStopped = true;
        }
    }
}

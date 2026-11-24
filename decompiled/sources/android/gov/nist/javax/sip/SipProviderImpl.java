package android.gov.nist.javax.sip;

import a.hny;
import a.kng0;
import a.v4i0;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.address.RouterExt;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.stack.HopImpl;
import android.gov.nist.javax.sip.stack.MessageChannel;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPDialog;
import android.gov.nist.javax.sip.stack.SIPDialogErrorEvent;
import android.gov.nist.javax.sip.stack.SIPDialogEventListener;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionErrorEvent;
import android.gov.nist.javax.sip.stack.SIPTransactionEventListener;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.javax.sip.ClientTransaction;
import android.javax.sip.Dialog;
import android.javax.sip.DialogState;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.ListeningPoint;
import android.javax.sip.ObjectInUseException;
import android.javax.sip.RequestEvent;
import android.javax.sip.ResponseEvent;
import android.javax.sip.ServerTransaction;
import android.javax.sip.SipException;
import android.javax.sip.SipListener;
import android.javax.sip.SipProvider;
import android.javax.sip.SipStack;
import android.javax.sip.Timeout;
import android.javax.sip.TimeoutEvent;
import android.javax.sip.Transaction;
import android.javax.sip.TransactionAlreadyExistsException;
import android.javax.sip.TransactionUnavailableException;
import android.javax.sip.address.Hop;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import java.io.IOException;
import java.text.ParseException;
import java.util.EventObject;
import java.util.Iterator;
import java.util.TooManyListenersException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SipProviderImpl implements SipProvider, SipProviderExt, SIPTransactionEventListener, SIPDialogEventListener {
    private static StackLogger logger = CommonLogger.getLogger(SipProviderImpl.class);
    private boolean automaticDialogSupportEnabled;
    private boolean dialogErrorsAutomaticallyHandled;
    protected EventScanner eventScanner;
    private ConcurrentHashMap<String, ListeningPoint> listeningPoints;
    private SipListener sipListener;
    protected SipStackImpl sipStack;

    public SipProviderImpl(SipStackImpl sipStackImpl) {
        this.dialogErrorsAutomaticallyHandled = true;
        EventScanner eventScanner = sipStackImpl.getEventScanner();
        this.eventScanner = eventScanner;
        this.sipStack = sipStackImpl;
        eventScanner.incrementRefcount();
        this.listeningPoints = new ConcurrentHashMap<>();
        this.automaticDialogSupportEnabled = this.sipStack.isAutomaticDialogSupportEnabled();
        this.dialogErrorsAutomaticallyHandled = this.sipStack.isAutomaticDialogErrorHandlingEnabled();
    }

    @Override // android.javax.sip.SipProvider
    public synchronized void addListeningPoint(ListeningPoint listeningPoint) {
        try {
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) listeningPoint;
            SipProviderImpl sipProviderImpl = listeningPointImpl.sipProvider;
            if (sipProviderImpl != null && sipProviderImpl != this) {
                throw new ObjectInUseException("Listening point assigned to another provider");
            }
            String upperCase = listeningPointImpl.getTransport().toUpperCase();
            if (this.listeningPoints.containsKey(upperCase) && this.listeningPoints.get(upperCase) != listeningPoint) {
                throw new ObjectInUseException("Listening point already assigned for transport!");
            }
            listeningPointImpl.sipProvider = this;
            this.listeningPoints.put(upperCase, listeningPointImpl);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.javax.sip.SipProvider
    public void addSipListener(SipListener sipListener) throws TooManyListenersException {
        SipStackImpl sipStackImpl = this.sipStack;
        SipListener sipListener2 = sipStackImpl.sipListener;
        if (sipListener2 == null) {
            sipStackImpl.sipListener = sipListener;
        } else if (sipListener2 != sipListener) {
            throw new TooManyListenersException("Stack already has a listener. Only one listener per stack allowed");
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("add SipListener " + sipListener);
        }
        this.sipListener = sipListener;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public SIPClientTransaction createClientTransaction(Request request, Hop hop) throws TransactionUnavailableException {
        SIPClientTransaction sIPClientTransaction;
        if (request == null) {
            hny.u("null request");
            return null;
        }
        if (hop == null) {
            hny.u("null hop");
            return null;
        }
        if (!this.sipStack.isAlive()) {
            throw new TransactionUnavailableException("Stack is stopped");
        }
        SIPRequest sIPRequest = (SIPRequest) request;
        if (sIPRequest.getTransaction() != null) {
            throw new TransactionUnavailableException("Transaction already assigned to request");
        }
        if (sIPRequest.getMethod().equals("ACK")) {
            throw new TransactionUnavailableException("Cannot create client transaction for  ACK");
        }
        if (sIPRequest.getTopmostVia() == null) {
            String transport = hop.getTransport();
            if (transport == null) {
                transport = ParameterNames.UDP;
            }
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) getListeningPoint(transport);
            if (listeningPointImpl == null) {
                listeningPointImpl = (ListeningPointImpl) getListeningPoints()[0];
            }
            sIPRequest.setHeader(listeningPointImpl.getViaHeader());
        }
        try {
            sIPRequest.checkHeaders();
            if (sIPRequest.getTopmostVia().getBranch() != null && sIPRequest.getTopmostVia().getBranch().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE) && this.sipStack.findTransaction((SIPMessage) sIPRequest, false) != null) {
                throw new TransactionUnavailableException("Transaction already exists!");
            }
            if (sIPRequest.getMethod().equalsIgnoreCase(Request.CANCEL) && (sIPClientTransaction = (SIPClientTransaction) this.sipStack.findCancelTransaction(sIPRequest, false)) != null) {
                SIPClientTransaction sIPClientTransactionCreateClientTransaction = this.sipStack.createClientTransaction(sIPRequest, sIPClientTransaction.getMessageChannel());
                sIPClientTransactionCreateClientTransaction.addEventListener(this);
                this.sipStack.addTransaction(sIPClientTransactionCreateClientTransaction);
                if (sIPClientTransaction.getDialog() != null) {
                    sIPClientTransactionCreateClientTransaction.setDialog((SIPDialog) sIPClientTransaction.getDialog(), sIPRequest.getDialogId(false));
                }
                return sIPClientTransactionCreateClientTransaction;
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("could not find existing transaction for " + sIPRequest + " creating a new one ");
            }
            String transport2 = hop.getTransport();
            ListeningPointImpl listeningPointImpl2 = (ListeningPointImpl) getListeningPoint(transport2);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Got following Listenin point " + listeningPointImpl2 + " for transport " + transport2);
            }
            if (listeningPointImpl2 == null) {
                listeningPointImpl2 = (ListeningPointImpl) getListeningPoint(sIPRequest.getTopmostVia().getTransport());
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Listenig point was null using new one from Via header " + listeningPointImpl2 + " for transport " + sIPRequest.getTopmostVia().getTransport());
                }
            }
            SIPDialog dialog = this.sipStack.getDialog(sIPRequest.getDialogId(false));
            if (dialog != null && dialog.getState() == DialogState.TERMINATED) {
                this.sipStack.removeDialog(dialog);
            }
            try {
                if (sIPRequest.getTopmostVia().getBranch() == null || !sIPRequest.getTopmostVia().getBranch().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE) || this.sipStack.checkBranchId()) {
                    sIPRequest.getTopmostVia().setBranch(Utils.getInstance().generateBranchId());
                }
                Via topmostVia = sIPRequest.getTopmostVia();
                if (topmostVia.getTransport() == null) {
                    topmostVia.setTransport(transport2);
                }
                if (topmostVia.getPort() == -1) {
                    topmostVia.setPort(listeningPointImpl2.getPort());
                }
                String branch = sIPRequest.getTopmostVia().getBranch();
                SIPClientTransaction sIPClientTransactionCreateClientTransaction2 = this.sipStack.createClientTransaction(sIPRequest, this.sipStack.createMessageChannel(sIPRequest, listeningPointImpl2.getMessageProcessor(), hop));
                if (sIPClientTransactionCreateClientTransaction2 == null) {
                    throw new TransactionUnavailableException("Cound not create tx");
                }
                sIPClientTransactionCreateClientTransaction2.setNextHop(hop);
                sIPClientTransactionCreateClientTransaction2.setOriginalRequest(sIPRequest);
                sIPClientTransactionCreateClientTransaction2.setBranch(branch);
                if (SIPTransactionStack.isDialogCreated(sIPRequest.getMethod())) {
                    if (dialog != null) {
                        sIPClientTransactionCreateClientTransaction2.setDialog(dialog, sIPRequest.getDialogId(false));
                    } else if (isAutomaticDialogSupportEnabled()) {
                        sIPClientTransactionCreateClientTransaction2.setDialog(this.sipStack.createDialog(sIPClientTransactionCreateClientTransaction2), sIPRequest.getDialogId(false));
                    }
                } else if (dialog != null) {
                    sIPClientTransactionCreateClientTransaction2.setDialog(dialog, sIPRequest.getDialogId(false));
                }
                sIPClientTransactionCreateClientTransaction2.addEventListener(this);
                return sIPClientTransactionCreateClientTransaction2;
            } catch (InvalidArgumentException e) {
                InternalErrorHandler.handleException(e);
                throw new TransactionUnavailableException("Unexpected Exception FIXME! ", e);
            } catch (IOException e2) {
                throw new TransactionUnavailableException("Could not resolve next hop or listening point unavailable! ", e2);
            } catch (ParseException e3) {
                InternalErrorHandler.handleException(e3);
                throw new TransactionUnavailableException("Unexpected Exception FIXME! ", e3);
            }
        } catch (ParseException e4) {
            throw new TransactionUnavailableException(e4.getMessage(), e4);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPDialogEventListener
    public void dialogErrorEvent(SIPDialogErrorEvent sIPDialogErrorEvent) {
        SIPDialog sIPDialog = (SIPDialog) sIPDialogErrorEvent.getSource();
        DialogTimeoutEvent.Reason reason = DialogTimeoutEvent.Reason.AckNotReceived;
        if (sIPDialogErrorEvent.getErrorID() == 2) {
            reason = DialogTimeoutEvent.Reason.AckNotSent;
        } else if (sIPDialogErrorEvent.getErrorID() == 3) {
            reason = DialogTimeoutEvent.Reason.ReInviteTimeout;
        } else if (sIPDialogErrorEvent.getErrorID() == 4) {
            reason = DialogTimeoutEvent.Reason.EarlyStateTimeout;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Dialog TimeoutError occured on " + sIPDialog);
        }
        DialogTimeoutEvent dialogTimeoutEvent = new DialogTimeoutEvent(this, sIPDialog, reason);
        dialogTimeoutEvent.setClientTransaction(sIPDialogErrorEvent.getClientTransaction());
        handleEvent(dialogTimeoutEvent, null);
    }

    @Override // android.javax.sip.SipProvider
    public ListeningPoint getListeningPoint() {
        if (this.listeningPoints.size() > 0) {
            return this.listeningPoints.values().iterator().next();
        }
        return null;
    }

    @Override // android.javax.sip.SipProvider
    public synchronized ListeningPoint[] getListeningPoints() {
        ListeningPointImpl[] listeningPointImplArr;
        listeningPointImplArr = new ListeningPointImpl[this.listeningPoints.size()];
        this.listeningPoints.values().toArray(listeningPointImplArr);
        return listeningPointImplArr;
    }

    @Override // android.javax.sip.SipProvider
    public CallIdHeader getNewCallId() {
        String strGenerateCallIdentifier = Utils.getInstance().generateCallIdentifier(getListeningPoint().getIPAddress());
        CallID callID = new CallID();
        try {
            callID.setCallId(strGenerateCallIdentifier);
        } catch (ParseException unused) {
        }
        return callID;
    }

    @Override // android.javax.sip.SipProvider
    public ClientTransaction getNewClientTransaction(Request request) {
        try {
            Hop nextHop = this.sipStack.getNextHop((SIPRequest) request);
            if (nextHop == null) {
                throw new TransactionUnavailableException("Cannot resolve next hop -- transaction unavailable");
            }
            SIPClientTransaction sIPClientTransactionCreateClientTransaction = createClientTransaction(request, nextHop);
            this.sipStack.addTransaction(sIPClientTransactionCreateClientTransaction);
            return sIPClientTransactionCreateClientTransaction;
        } catch (SipException e) {
            throw new TransactionUnavailableException("Cannot resolve next hop -- transaction unavailable", e);
        }
    }

    @Override // android.javax.sip.SipProvider
    public Dialog getNewDialog(Transaction transaction) throws SipException {
        SIPDialog sIPDialogCreateDialog;
        if (transaction == null) {
            hny.u("Null transaction!");
            return null;
        }
        if (!this.sipStack.isAlive()) {
            v4i0.k("Stack is stopped.");
            return null;
        }
        if (isAutomaticDialogSupportEnabled()) {
            v4i0.k(" Error - AUTOMATIC_DIALOG_SUPPORT is on");
            return null;
        }
        if (!SIPTransactionStack.isDialogCreated(transaction.getRequest().getMethod())) {
            throw new SipException("Dialog cannot be created for this method " + transaction.getRequest().getMethod());
        }
        SIPTransaction sIPTransaction = (SIPTransaction) transaction;
        if (transaction instanceof ServerTransaction) {
            SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) transaction;
            SIPResponse lastResponse = sIPServerTransaction.getLastResponse();
            if (lastResponse != null && lastResponse.getStatusCode() != 100) {
                v4i0.k("Cannot set dialog after response has been sent");
                return null;
            }
            SIPRequest sIPRequest = (SIPRequest) transaction.getRequest();
            sIPDialogCreateDialog = this.sipStack.getDialog(sIPRequest.getDialogId(true));
            if (sIPDialogCreateDialog == null) {
                sIPDialogCreateDialog = this.sipStack.createDialog(sIPTransaction);
                sIPDialogCreateDialog.addTransaction(sIPTransaction);
                sIPDialogCreateDialog.addRoute(sIPRequest);
                sIPTransaction.setDialog(sIPDialogCreateDialog, null);
            } else {
                sIPTransaction.setDialog(sIPDialogCreateDialog, sIPRequest.getDialogId(true));
            }
            if (sIPRequest.getMethod().equals("INVITE") && isDialogErrorsAutomaticallyHandled()) {
                this.sipStack.putInMergeTable(sIPServerTransaction, sIPRequest);
            }
        } else {
            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) transaction;
            if (sIPClientTransaction.getLastResponse() != null) {
                v4i0.k("Cannot call this method after response is received!");
                return null;
            }
            if (this.sipStack.getDialog(((SIPRequest) sIPClientTransaction.getRequest()).getDialogId(false)) != null) {
                v4i0.k("Dialog already exists!");
                return null;
            }
            sIPDialogCreateDialog = this.sipStack.createDialog(sIPTransaction);
            sIPClientTransaction.setDialog(sIPDialogCreateDialog, null);
        }
        sIPDialogCreateDialog.addEventListener(this);
        return sIPDialogCreateDialog;
    }

    @Override // android.javax.sip.SipProvider
    public ServerTransaction getNewServerTransaction(Request request) throws TransactionUnavailableException {
        SIPServerTransaction sIPServerTransactionCreateServerTransaction;
        if (!this.sipStack.isAlive()) {
            throw new TransactionUnavailableException("Stack is stopped");
        }
        SIPRequest sIPRequest = (SIPRequest) request;
        try {
            sIPRequest.checkHeaders();
            if (request.getMethod().equals("ACK")) {
                if (logger.isLoggingEnabled()) {
                    logger.logError("Creating server transaction for ACK -- makes no sense!");
                }
                throw new TransactionUnavailableException("Cannot create Server transaction for ACK ");
            }
            if (sIPRequest.getMethod().equals("NOTIFY") && sIPRequest.getFromTag() != null && sIPRequest.getToTag() == null && this.sipStack.findSubscribeTransaction(sIPRequest, (ListeningPointImpl) getListeningPoint()) == null && !this.sipStack.isDeliverUnsolicitedNotify()) {
                throw new TransactionUnavailableException("Cannot find matching Subscription (and android.gov.nist.javax.sip.DELIVER_UNSOLICITED_NOTIFY not set)");
            }
            if (!this.sipStack.acquireSem()) {
                throw new TransactionUnavailableException("Transaction not available -- could not acquire stack lock");
            }
            try {
                if (!SIPTransactionStack.isDialogCreated(sIPRequest.getMethod())) {
                    boolean zIsAutomaticDialogSupportEnabled = isAutomaticDialogSupportEnabled();
                    SipStackImpl sipStackImpl = this.sipStack;
                    if (zIsAutomaticDialogSupportEnabled) {
                        if (((SIPServerTransaction) sipStackImpl.findTransaction((SIPMessage) request, true)) != null) {
                            throw new TransactionAlreadyExistsException("Transaction exists! ");
                        }
                        sIPServerTransactionCreateServerTransaction = (SIPServerTransaction) ((SIPRequest) request).getTransaction();
                        if (sIPServerTransactionCreateServerTransaction == null) {
                            throw new TransactionUnavailableException("Transaction not available!");
                        }
                        if (sIPServerTransactionCreateServerTransaction.getOriginalRequest() == null) {
                            sIPServerTransactionCreateServerTransaction.setOriginalRequest(sIPRequest);
                        }
                        try {
                            this.sipStack.addTransaction(sIPServerTransactionCreateServerTransaction);
                            SIPDialog dialog = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                            if (dialog != null) {
                                dialog.addTransaction(sIPServerTransactionCreateServerTransaction);
                                dialog.addRoute(sIPRequest);
                                sIPServerTransactionCreateServerTransaction.setDialog(dialog, sIPRequest.getDialogId(true));
                            }
                        } catch (IOException unused) {
                            throw new TransactionUnavailableException("Could not send back provisional response!");
                        }
                    } else {
                        if (((SIPServerTransaction) sipStackImpl.findTransaction((SIPMessage) request, true)) != null) {
                            throw new TransactionAlreadyExistsException("Transaction exists! ");
                        }
                        sIPServerTransactionCreateServerTransaction = (SIPServerTransaction) ((SIPRequest) request).getTransaction();
                        if (sIPServerTransactionCreateServerTransaction != null) {
                            if (sIPServerTransactionCreateServerTransaction.getOriginalRequest() == null) {
                                sIPServerTransactionCreateServerTransaction.setOriginalRequest(sIPRequest);
                            }
                            this.sipStack.mapTransaction(sIPServerTransactionCreateServerTransaction);
                            SIPDialog dialog2 = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                            if (dialog2 != null) {
                                dialog2.addTransaction(sIPServerTransactionCreateServerTransaction);
                                dialog2.addRoute(sIPRequest);
                                sIPServerTransactionCreateServerTransaction.setDialog(dialog2, sIPRequest.getDialogId(true));
                            }
                        } else {
                            sIPServerTransactionCreateServerTransaction = this.sipStack.createServerTransaction((MessageChannel) sIPRequest.getMessageChannel());
                            if (sIPServerTransactionCreateServerTransaction == null) {
                                throw new TransactionUnavailableException("Transaction unavailable -- too many servrer transactions");
                            }
                            sIPServerTransactionCreateServerTransaction.setOriginalRequest(sIPRequest);
                            this.sipStack.mapTransaction(sIPServerTransactionCreateServerTransaction);
                            SIPDialog dialog3 = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                            if (dialog3 != null) {
                                dialog3.addTransaction(sIPServerTransactionCreateServerTransaction);
                                dialog3.addRoute(sIPRequest);
                                sIPServerTransactionCreateServerTransaction.setDialog(dialog3, sIPRequest.getDialogId(true));
                            }
                        }
                    }
                } else {
                    if (this.sipStack.findTransaction((SIPMessage) request, true) != null) {
                        throw new TransactionAlreadyExistsException("server transaction already exists!");
                    }
                    sIPServerTransactionCreateServerTransaction = (SIPServerTransaction) ((SIPRequest) request).getTransaction();
                    if (sIPServerTransactionCreateServerTransaction == null) {
                        throw new TransactionUnavailableException("Transaction not available");
                    }
                    if (sIPServerTransactionCreateServerTransaction.getOriginalRequest() == null) {
                        sIPServerTransactionCreateServerTransaction.setOriginalRequest(sIPRequest);
                    }
                    try {
                        this.sipStack.addTransaction(sIPServerTransactionCreateServerTransaction);
                        sIPServerTransactionCreateServerTransaction.addEventListener(this);
                        if (isAutomaticDialogSupportEnabled()) {
                            SIPDialog dialog4 = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                            if (dialog4 == null) {
                                dialog4 = this.sipStack.createDialog(sIPServerTransactionCreateServerTransaction);
                            }
                            sIPServerTransactionCreateServerTransaction.setDialog(dialog4, sIPRequest.getDialogId(true));
                            if (sIPRequest.getMethod().equals("INVITE") && isDialogErrorsAutomaticallyHandled()) {
                                this.sipStack.putInMergeTable(sIPServerTransactionCreateServerTransaction, sIPRequest);
                            }
                            dialog4.addRoute(sIPRequest);
                            if (dialog4.getRemoteTag() != null && dialog4.getLocalTag() != null) {
                                this.sipStack.putDialog(dialog4);
                            }
                        }
                    } catch (IOException unused2) {
                        throw new TransactionUnavailableException("Error sending provisional response");
                    }
                }
                this.sipStack.releaseSem();
                return sIPServerTransactionCreateServerTransaction;
            } catch (Throwable th) {
                this.sipStack.releaseSem();
                throw th;
            }
        } catch (ParseException e) {
            throw new TransactionUnavailableException(e.getMessage(), e);
        }
    }

    public SipListener getSipListener() {
        return this.sipListener;
    }

    @Override // android.javax.sip.SipProvider
    public SipStack getSipStack() {
        return this.sipStack;
    }

    public void handleEvent(EventObject eventObject, SIPTransaction sIPTransaction) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("handleEvent " + eventObject + "currentTransaction = " + sIPTransaction + "this.sipListener = " + getSipListener() + "sipEvent.source = " + eventObject.getSource());
            if (eventObject instanceof RequestEvent) {
                Dialog dialog = ((RequestEvent) eventObject).getDialog();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Dialog = " + dialog);
                }
            } else if (eventObject instanceof ResponseEvent) {
                Dialog dialog2 = ((ResponseEvent) eventObject).getDialog();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Dialog = " + dialog2);
                }
            }
            logger.logStackTrace();
        }
        EventWrapper eventWrapper = new EventWrapper(eventObject, sIPTransaction);
        boolean zIsReEntrantListener = this.sipStack.isReEntrantListener();
        EventScanner eventScanner = this.eventScanner;
        if (zIsReEntrantListener) {
            eventScanner.deliverEvent(eventWrapper);
        } else {
            eventScanner.addEvent(eventWrapper);
        }
    }

    public boolean isAutomaticDialogSupportEnabled() {
        return this.automaticDialogSupportEnabled;
    }

    public boolean isDialogErrorsAutomaticallyHandled() {
        return this.dialogErrorsAutomaticallyHandled;
    }

    @Override // android.javax.sip.SipProvider
    public synchronized void removeListeningPoint(ListeningPoint listeningPoint) {
        ListeningPointImpl listeningPointImpl = (ListeningPointImpl) listeningPoint;
        if (listeningPointImpl.messageProcessor.inUse()) {
            throw new ObjectInUseException("Object is in use");
        }
        this.listeningPoints.remove(listeningPointImpl.getTransport().toUpperCase());
    }

    public synchronized void removeListeningPoints() {
        Iterator<ListeningPoint> it = this.listeningPoints.values().iterator();
        while (it.hasNext()) {
            ((ListeningPointImpl) it.next()).messageProcessor.stop();
            it.remove();
        }
    }

    @Override // android.javax.sip.SipProvider
    public void removeSipListener(SipListener sipListener) {
        if (sipListener == getSipListener()) {
            this.sipListener = null;
        }
        Iterator<SipProviderImpl> sipProviders = this.sipStack.getSipProviders();
        boolean z = false;
        while (sipProviders.hasNext()) {
            if (sipProviders.next().getSipListener() != null) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.sipStack.sipListener = null;
    }

    @Override // android.javax.sip.SipProvider
    public void sendRequest(Request request) throws SipException {
        Via topmostVia;
        String branch;
        SIPDialog dialog;
        if (!this.sipStack.isAlive()) {
            v4i0.k("Stack is stopped.");
            return;
        }
        SIPRequest sIPRequest = (SIPRequest) request;
        if (sIPRequest.getRequestLine() != null && request.getMethod().equals("ACK") && (dialog = this.sipStack.getDialog(((SIPRequest) request).getDialogId(false))) != null && dialog.getState() != null && logger.isLoggingEnabled()) {
            logger.logWarning("Dialog exists -- you may want to use Dialog.sendAck() " + dialog.getState());
        }
        Hop nextHop = this.sipStack.getRouter(sIPRequest).getNextHop(request);
        if (nextHop == null) {
            v4i0.k("could not determine next hop!");
            return;
        }
        if (!sIPRequest.isNullRequest() && sIPRequest.getTopmostVia() == null) {
            v4i0.k("Invalid SipRequest -- no via header!");
            return;
        }
        try {
            try {
                try {
                    if (!sIPRequest.isNullRequest() && ((branch = (topmostVia = sIPRequest.getTopmostVia()).getBranch()) == null || branch.length() == 0)) {
                        topmostVia.setBranch(sIPRequest.getTransactionId());
                    }
                    MessageChannel messageChannelCreateRawMessageChannel = this.listeningPoints.containsKey(nextHop.getTransport().toUpperCase()) ? this.sipStack.createRawMessageChannel(getListeningPoint(nextHop.getTransport()).getIPAddress(), getListeningPoint(nextHop.getTransport()).getPort(), nextHop) : null;
                    if (messageChannelCreateRawMessageChannel != null) {
                        messageChannelCreateRawMessageChannel.sendMessage(sIPRequest, nextHop);
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("done sending " + request.getMethod() + " to hop " + nextHop);
                            return;
                        }
                        return;
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Could not create a message channel for " + nextHop.toString() + " listeningPoints = " + this.listeningPoints);
                    }
                    throw new SipException("Could not create a message channel for " + nextHop.toString());
                } catch (IOException e) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Could not create a message channel for " + nextHop.toString() + " listeningPoints = " + this.listeningPoints + " because of an IO issue " + e.getMessage());
                    }
                    throw new SipException("IO Exception occured while Sending Request", e);
                }
            } catch (ParseException e2) {
                InternalErrorHandler.handleException(e2);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("done sending " + request.getMethod() + " to hop " + nextHop);
                }
            }
        } catch (Throwable th) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("done sending " + request.getMethod() + " to hop " + nextHop);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.javax.sip.SipProvider
    public void sendResponse(Response response) throws SipException {
        if (!this.sipStack.isAlive()) {
            v4i0.k("Stack is stopped");
            return;
        }
        SIPResponse sIPResponse = (SIPResponse) response;
        Via topmostVia = sIPResponse.getTopmostVia();
        if (topmostVia == null) {
            v4i0.k("No via header in response!");
            return;
        }
        SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) response, true);
        if (sIPServerTransaction != null && sIPServerTransaction.getInternalState() != 5 && isAutomaticDialogSupportEnabled()) {
            v4i0.k("Transaction exists -- cannot send response statelessly");
            return;
        }
        String transport = topmostVia.getTransport();
        String received = topmostVia.getReceived();
        if (received == null) {
            received = topmostVia.getHost();
        }
        int rPort = topmostVia.getRPort();
        if (rPort == -1 && (rPort = topmostVia.getPort()) == -1) {
            rPort = (transport.equalsIgnoreCase(ListeningPoint.TLS) || transport.equalsIgnoreCase("SCTP-TLS")) ? 5061 : 5060;
        }
        if (received.indexOf(Separators.COLON) > 0 && received.indexOf("[") < 0) {
            received = kng0.l("[", received, "]");
        }
        Hop hopResolveAddress = this.sipStack.getAddressResolver().resolveAddress(new HopImpl(received, rPort, transport));
        try {
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) getListeningPoint(transport);
            if (listeningPointImpl == null) {
                throw new SipException("whoopsa daisy! no listening point found for transport " + transport);
            }
            MessageChannel messageChannelCreateRawMessageChannel = this.sipStack.createRawMessageChannel(getListeningPoint(hopResolveAddress.getTransport()).getIPAddress(), listeningPointImpl.port, hopResolveAddress);
            if (messageChannelCreateRawMessageChannel != null) {
                messageChannelCreateRawMessageChannel.sendMessage(sIPResponse);
                return;
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Could not create a message channel for " + hopResolveAddress.toString() + " listeningPoints = " + this.listeningPoints);
            }
            throw new SipException("Could not create a message channel for " + hopResolveAddress.toString());
        } catch (IOException e) {
            throw new SipException(e.getMessage());
        }
    }

    @Override // android.javax.sip.SipProvider
    public void setAutomaticDialogSupportEnabled(boolean z) {
        this.automaticDialogSupportEnabled = z;
        if (z) {
            this.dialogErrorsAutomaticallyHandled = true;
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void setDialogErrorsAutomaticallyHandled() {
        this.dialogErrorsAutomaticallyHandled = true;
    }

    @Override // android.javax.sip.SipProvider
    public synchronized void setListeningPoint(ListeningPoint listeningPoint) {
        try {
            if (listeningPoint == null) {
                throw new NullPointerException("Null listening point");
            }
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) listeningPoint;
            listeningPointImpl.sipProvider = this;
            String upperCase = listeningPointImpl.getTransport().toUpperCase();
            this.listeningPoints.clear();
            this.listeningPoints.put(upperCase, listeningPoint);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void stop() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Exiting provider");
        }
        Iterator<ListeningPoint> it = this.listeningPoints.values().iterator();
        while (it.hasNext()) {
            ((ListeningPointImpl) it.next()).removeSipProvider();
        }
        this.eventScanner.stop();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionEventListener
    public void transactionErrorEvent(SIPTransactionErrorEvent sIPTransactionErrorEvent) {
        TimeoutEvent timeoutEvent;
        TimeoutEvent timeoutEvent2;
        SIPTransaction sIPTransaction = (SIPTransaction) sIPTransactionErrorEvent.getSource();
        if (sIPTransactionErrorEvent.getErrorID() == 2) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("TransportError occured on " + sIPTransaction);
            }
            Object source = sIPTransactionErrorEvent.getSource();
            Timeout timeout = Timeout.TRANSACTION;
            if (source instanceof SIPServerTransaction) {
                timeoutEvent2 = new TimeoutEvent(this, (ServerTransaction) source, timeout);
            } else {
                Hop nextHop = ((SIPClientTransaction) source).getNextHop();
                if (this.sipStack.getRouter() instanceof RouterExt) {
                    ((RouterExt) this.sipStack.getRouter()).transactionTimeout(nextHop);
                }
                timeoutEvent2 = new TimeoutEvent(this, (ClientTransaction) source, timeout);
            }
            handleEvent(timeoutEvent2, (SIPTransaction) source);
            return;
        }
        if (sIPTransactionErrorEvent.getErrorID() != 1) {
            if (sIPTransactionErrorEvent.getErrorID() == 3) {
                Object source2 = sIPTransactionErrorEvent.getSource();
                if (((Transaction) source2).getDialog() != null) {
                    InternalErrorHandler.handleException("Unexpected event !", logger);
                }
                Timeout timeout2 = Timeout.RETRANSMIT;
                handleEvent(source2 instanceof SIPServerTransaction ? new TimeoutEvent(this, (ServerTransaction) source2, timeout2) : new TimeoutEvent(this, (ClientTransaction) source2, timeout2), (SIPTransaction) source2);
                return;
            }
            return;
        }
        Object source3 = sIPTransactionErrorEvent.getSource();
        Timeout timeout3 = Timeout.TRANSACTION;
        if (source3 instanceof SIPServerTransaction) {
            timeoutEvent = new TimeoutEvent(this, (ServerTransaction) source3, timeout3);
        } else {
            Hop nextHop2 = ((SIPClientTransaction) source3).getNextHop();
            if (this.sipStack.getRouter() instanceof RouterExt) {
                ((RouterExt) this.sipStack.getRouter()).transactionTimeout(nextHop2);
            }
            timeoutEvent = new TimeoutEvent(this, (ClientTransaction) source3, timeout3);
        }
        handleEvent(timeoutEvent, (SIPTransaction) source3);
    }

    @Override // android.javax.sip.SipProvider
    public ListeningPoint getListeningPoint(String str) {
        if (str != null) {
            return this.listeningPoints.get(str.toUpperCase());
        }
        hny.u("Null transport param");
        return null;
    }

    private SipProviderImpl() {
        this.dialogErrorsAutomaticallyHandled = true;
    }
}

.class public Landroid/gov/nist/javax/sip/stack/SIPDialog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/Dialog;
.implements Landroid/gov/nist/javax/sip/DialogExt;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;,
        Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;,
        Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;,
        Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;,
        Landroid/gov/nist/javax/sip/stack/SIPDialog$LingerTimer;,
        Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;,
        Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;,
        Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;
    }
.end annotation


# static fields
.field public static final CONFIRMED_STATE:I = 0x1

.field public static final EARLY_STATE:I = 0x0

.field public static final NULL_STATE:I = -0x1

.field public static final TERMINATED_STATE:I = 0x3

.field private static logger:Landroid/gov/nist/core/StackLogger; = null

.field private static final serialVersionUID:J = -0x13d7a673d1d40265L


# instance fields
.field private transient ackLine:I

.field protected transient ackProcessed:Z

.field private transient ackSem:Ljava/util/concurrent/Semaphore;

.field private transient ackSendingStrategy:Landroid/gov/nist/javax/sip/stack/AckSendingStrategy;

.field private transient applicationData:Ljava/lang/Object;

.field public transient auditTag:J

.field protected transient byeSent:Z

.field protected callIdHeader:Landroid/javax/sip/header/CallIdHeader;

.field protected callIdHeaderString:Ljava/lang/String;

.field protected contactHeader:Landroid/gov/nist/javax/sip/header/Contact;

.field protected contactHeaderStringified:Ljava/lang/String;

.field private transient dialogDeleteIfNoAckSentTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;

.field private transient dialogDeleteTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

.field protected dialogId:Ljava/lang/String;

.field private dialogState:I

.field private transient dialogTerminatedEventDelivered:Z

.field protected transient earlyDialogId:Ljava/lang/String;

.field private earlyDialogTimeout:I

.field private transient earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

.field protected eventHeader:Landroid/javax/sip/header/EventHeader;

.field private transient eventListeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;",
            ">;"
        }
    .end annotation
.end field

.field protected firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

.field protected firstTransactionId:Ljava/lang/String;

.field protected firstTransactionIsServerTransaction:Z

.field protected firstTransactionMergeId:Ljava/lang/String;

.field protected firstTransactionMethod:Ljava/lang/String;

.field protected firstTransactionPort:I

.field protected firstTransactionSecure:Z

.field protected firstTransactionSeen:Z

.field private transient highestSequenceNumberAcknowledged:J

.field protected hisTag:Ljava/lang/String;

.field protected transient isAcknowledged:Z

.field protected transient isAssigned:Z

.field protected isBackToBackUserAgent:Z

.field protected lastAckReceivedCSeqNumber:Ljava/lang/Long;

.field private transient lastAckSent:Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;

.field protected transient lastInviteOkReceived:J

.field protected lastInviteResponseCSeqNumber:J

.field protected lastInviteResponseCode:I

.field protected lastResponseCSeqNumber:J

.field protected lastResponseDialogId:Ljava/lang/String;

.field protected lastResponseFromTag:Ljava/lang/String;

.field protected lastResponseMethod:Ljava/lang/String;

.field protected lastResponseStatusCode:Ljava/lang/Integer;

.field protected lastResponseToTag:Ljava/lang/String;

.field private lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

.field protected lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

.field protected localParty:Landroid/javax/sip/address/Address;

.field protected localPartyStringified:Ljava/lang/String;

.field protected localSequenceNumber:J

.field protected method:Ljava/lang/String;

.field protected myTag:Ljava/lang/String;

.field protected transient nextSeqno:J

.field private originalDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

.field protected originalLocalSequenceNumber:J

.field private transient originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

.field protected transient originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

.field protected transient originalRequestRecordRouteHeadersString:Ljava/lang/String;

.field private pendingRouteUpdateOn202Response:Z

.field private transient prevRetransmissionTicks:I

.field protected proxyAuthorizationHeader:Landroid/javax/sip/header/ProxyAuthorizationHeader;

.field protected reInviteFlag:Z

.field protected transient reInviteWaitTime:I

.field private releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

.field protected remoteParty:Landroid/javax/sip/address/Address;

.field protected remotePartyStringified:Ljava/lang/String;

.field protected remoteSequenceNumber:J

.field protected remoteTarget:Landroid/javax/sip/address/Address;

.field protected remoteTargetStringified:Ljava/lang/String;

.field private responsesReceivedInForkingCase:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private transient retransmissionTicksLeft:I

.field protected routeList:Landroid/gov/nist/javax/sip/header/RouteList;

.field protected sequenceNumberValidation:Z

.field protected serverTransactionFlag:Z

.field private transient sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

.field private transient sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

.field private transient stackTrace:Ljava/lang/String;

.field protected terminateOnBye:Z

.field protected transient timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

.field private transient timerTaskLock:Ljava/util/concurrent/Semaphore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Landroid/gov/nist/javax/sip/SipProviderImpl;)V
    .locals 7

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 161
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->auditTag:J

    .line 162
    new-instance v2, Ljava/util/concurrent/Semaphore;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    const/16 v2, 0x64

    .line 163
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->reInviteWaitTime:I

    const-wide/16 v4, -0x1

    .line 164
    iput-wide v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->highestSequenceNumberAcknowledged:J

    .line 165
    iput-boolean v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sequenceNumberValidation:Z

    .line 166
    new-instance v2, Ljava/util/concurrent/Semaphore;

    invoke-direct {v2, v3}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTaskLock:Ljava/util/concurrent/Semaphore;

    const/16 v2, 0x13c4

    .line 167
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionPort:I

    const/16 v2, 0xb4

    .line 168
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogTimeout:I

    .line 169
    new-instance v2, Ljava/util/HashSet;

    const/4 v6, 0x0

    invoke-direct {v2, v6}, Ljava/util/HashSet;-><init>(I)V

    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->responsesReceivedInForkingCase:Ljava/util/Set;

    .line 170
    new-instance v2, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;

    invoke-direct {v2, p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSendingStrategy:Landroid/gov/nist/javax/sip/stack/AckSendingStrategy;

    .line 171
    iput-boolean v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->terminateOnBye:Z

    .line 172
    new-instance v2, Landroid/gov/nist/javax/sip/header/RouteList;

    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/RouteList;-><init>()V

    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    const/4 v2, -0x1

    .line 173
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogState:I

    .line 174
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 175
    iput-wide v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteSequenceNumber:J

    .line 176
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 177
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventListeners:Ljava/util/Set;

    .line 178
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipStack()Landroid/javax/sip/SipStack;

    move-result-object p1

    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getEarlyDialogTimeout()I

    move-result p1

    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogTimeout:I

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/SipProviderImpl;Landroid/gov/nist/javax/sip/message/SIPResponse;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/SipProviderImpl;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipStack()Landroid/javax/sip/SipStack;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 9
    .line 10
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 25
    .line 26
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalLocalSequenceNumber:J

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localParty:Landroid/javax/sip/address/Address;

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->method:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->serverTransactionFlag:Z

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p1}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalTag(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-interface {p1}, Landroid/javax/sip/header/ToHeader;->getTag()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTag(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 90
    .line 91
    const/16 p2, 0x20

    .line 92
    .line 93
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_0

    .line 98
    .line 99
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 100
    .line 101
    new-instance p2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v0, "Creating a dialog : "

    .line 104
    .line 105
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 119
    .line 120
    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 121
    .line 122
    .line 123
    :cond_0
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 124
    .line 125
    iget-boolean p2, p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isBackToBackUserAgent:Z

    .line 126
    .line 127
    iput-boolean p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addEventListener(Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 139
    .line 140
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V
    .locals 0

    .line 156
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    if-eqz p2, :cond_0

    .line 157
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 158
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    iget-boolean p1, p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isBackToBackUserAgent:Z

    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    return-void

    .line 159
    :cond_0
    const-string p0, "Null SipResponse"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V
    .locals 2

    .line 179
    invoke-direct {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    const/4 v0, 0x0

    .line 180
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->serverTransactionFlag:Z

    .line 181
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 182
    invoke-virtual {p0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->storeFirstTransactionInfo(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 183
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->terminateOnBye:Z

    .line 184
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getCSeq()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 185
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    move-result-object p2

    check-cast p2, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 186
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v0

    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteSequenceNumber:J

    const/4 v0, 0x1

    .line 187
    invoke-virtual {p2, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setDialogId(Ljava/lang/String;)V

    .line 188
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalTag(Ljava/lang/String;)V

    .line 189
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTag(Ljava/lang/String;)V

    .line 190
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getLastResponse()Landroid/gov/nist/javax/sip/message/SIPResponse;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 191
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    move-result-object p1

    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    move-result-object p1

    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localParty:Landroid/javax/sip/address/Address;

    .line 192
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    move-result-object p1

    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    move-result-object p1

    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 193
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 194
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V
    .locals 2

    .line 141
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;-><init>(Landroid/gov/nist/javax/sip/SipProviderImpl;)V

    .line 142
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    move-result-object v0

    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 143
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    move-result-object v1

    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;

    const/4 v1, 0x0

    .line 144
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogId:Ljava/lang/String;

    .line 145
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    move-result-object v0

    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 146
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    move-result-object v0

    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    if-eqz v0, :cond_1

    .line 147
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    iget-boolean v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isBackToBackUserAgent:Z

    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 148
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 149
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v0, 0x20

    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 150
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Creating a dialog : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 151
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "provider port = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint()Landroid/javax/sip/ListeningPoint;

    move-result-object v1

    invoke-interface {v1}, Landroid/javax/sip/ListeningPoint;->getPort()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 152
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 153
    :cond_0
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addEventListener(Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;)V

    .line 154
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    move-result-object p1

    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    return-void

    .line 155
    :cond_1
    const-string p0, "Null Provider!"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic access$000(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/SipProviderImpl;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Landroid/gov/nist/javax/sip/stack/SIPDialog;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->raiseErrorEvent(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$400(Landroid/gov/nist/javax/sip/stack/SIPDialog;ILandroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->raiseErrorEvent(ILandroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$500(Landroid/gov/nist/javax/sip/stack/SIPDialog;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->toRetransmitFinalResponse(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$600(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->raiseIOException(Ljava/lang/String;ILjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$700(Landroid/gov/nist/javax/sip/stack/SIPDialog;)I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogState:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$800(Landroid/gov/nist/javax/sip/stack/SIPDialog;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->highestSequenceNumberAcknowledged:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic access$902(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;)Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteIfNoAckSentTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;

    .line 2
    .line 3
    return-object p1
.end method

.method private addRoute(Landroid/gov/nist/javax/sip/header/RecordRouteList;)V
    .locals 7

    .line 1
    const-string v0, "route = "

    .line 2
    .line 3
    const-string v1, "NON LR route in Route set detected for dialog : "

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isServer()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    new-instance v3, Landroid/gov/nist/javax/sip/header/RouteList;

    .line 14
    .line 15
    invoke-direct {v3}, Landroid/gov/nist/javax/sip/header/RouteList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->listIterator(I)Ljava/util/ListIterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Landroid/gov/nist/javax/sip/header/RecordRoute;

    .line 39
    .line 40
    new-instance v4, Landroid/gov/nist/javax/sip/header/Route;

    .line 41
    .line 42
    invoke-direct {v4}, Landroid/gov/nist/javax/sip/header/Route;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 50
    .line 51
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/address/AddressImpl;->clone()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameters()Landroid/gov/nist/core/NameValueList;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Landroid/gov/nist/core/NameValueList;->clone()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Landroid/gov/nist/core/NameValueList;

    .line 69
    .line 70
    invoke-virtual {v4, v3}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameters(Landroid/gov/nist/core/NameValueList;)V

    .line 71
    .line 72
    .line 73
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 74
    .line 75
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :cond_0
    new-instance v3, Landroid/gov/nist/javax/sip/header/RouteList;

    .line 83
    .line 84
    invoke-direct {v3}, Landroid/gov/nist/javax/sip/header/RouteList;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->listIterator()Ljava/util/ListIterator;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_1
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_1

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Landroid/gov/nist/javax/sip/header/RecordRoute;

    .line 104
    .line 105
    new-instance v4, Landroid/gov/nist/javax/sip/header/Route;

    .line 106
    .line 107
    invoke-direct {v4}, Landroid/gov/nist/javax/sip/header/Route;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 115
    .line 116
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/address/AddressImpl;->clone()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 121
    .line 122
    invoke-virtual {v4, v5}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameters()Landroid/gov/nist/core/NameValueList;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v3}, Landroid/gov/nist/core/NameValueList;->clone()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, Landroid/gov/nist/core/NameValueList;

    .line 134
    .line 135
    invoke-virtual {v4, v3}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameters(Landroid/gov/nist/core/NameValueList;)V

    .line 136
    .line 137
    .line 138
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 139
    .line 140
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 145
    .line 146
    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_4

    .line 151
    .line 152
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 153
    .line 154
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_4

    .line 163
    .line 164
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, Landroid/gov/nist/javax/sip/header/Route;

    .line 169
    .line 170
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-interface {v3}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, Landroid/javax/sip/address/SipURI;

    .line 179
    .line 180
    invoke-interface {v3}, Landroid/javax/sip/address/SipURI;->hasLrParam()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-nez v4, :cond_3

    .line 185
    .line 186
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 187
    .line 188
    invoke-interface {v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_2

    .line 193
    .line 194
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 195
    .line 196
    new-instance v4, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 212
    .line 213
    invoke-interface {v3}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_3
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 218
    .line 219
    invoke-interface {v4, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_2

    .line 224
    .line 225
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 226
    .line 227
    new-instance v5, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-interface {v4, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_4
    return-void

    .line 244
    :goto_3
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 245
    .line 246
    invoke-interface {v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-eqz v3, :cond_7

    .line 251
    .line 252
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 253
    .line 254
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    :cond_5
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-eqz v4, :cond_7

    .line 263
    .line 264
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    check-cast v4, Landroid/gov/nist/javax/sip/header/Route;

    .line 269
    .line 270
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-interface {v4}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    check-cast v4, Landroid/javax/sip/address/SipURI;

    .line 279
    .line 280
    invoke-interface {v4}, Landroid/javax/sip/address/SipURI;->hasLrParam()Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    if-nez v5, :cond_6

    .line 285
    .line 286
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 287
    .line 288
    invoke-interface {v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-eqz v4, :cond_5

    .line 293
    .line 294
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 295
    .line 296
    new-instance v5, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 312
    .line 313
    invoke-interface {v4}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 314
    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_6
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 318
    .line 319
    invoke-interface {v5, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    if-eqz v5, :cond_5

    .line 324
    .line 325
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 326
    .line 327
    new-instance v6, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-interface {v5, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    goto :goto_4

    .line 343
    :cond_7
    throw p1
.end method

.method private declared-synchronized addRoute(Landroid/gov/nist/javax/sip/message/SIPResponse;)V
    .locals 4

    const-string v0, "setContact: dialogState: "

    monitor-enter p0

    const/16 v1, 0x20

    .line 344
    :try_start_0
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 345
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "state = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    .line 346
    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x64

    if-ne v0, v2, :cond_2

    .line 347
    :try_start_1
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 348
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto/16 :goto_4

    :cond_1
    :goto_1
    monitor-exit p0

    return-void

    .line 349
    :cond_2
    :try_start_2
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogState:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    .line 350
    :try_start_3
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 351
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_3
    monitor-exit p0

    return-void

    :cond_4
    const/4 v3, 0x1

    if-ne v0, v3, :cond_7

    .line 352
    :try_start_4
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    move-result v0

    div-int/2addr v0, v2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_5

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isServer()Z

    move-result v0

    if-nez v0, :cond_5

    .line 353
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 354
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v2

    invoke-interface {v2}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->isTargetRefresh(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 355
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    move-result-object v0

    check-cast v0, Landroid/javax/sip/header/ContactHeader;

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTarget(Landroid/javax/sip/header/ContactHeader;)V

    .line 356
    :cond_5
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->pendingRouteUpdateOn202Response:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v0, :cond_7

    .line 357
    :try_start_5
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 358
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_6
    monitor-exit p0

    return-void

    .line 359
    :cond_7
    :try_start_6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isServer()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->pendingRouteUpdateOn202Response:Z

    if-eqz v0, :cond_d

    .line 360
    :cond_8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    move-result-object v0

    sget-object v2, Landroid/javax/sip/DialogState;->CONFIRMED:Landroid/javax/sip/DialogState;

    if-eq v0, v2, :cond_9

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    move-result-object v0

    sget-object v2, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    if-ne v0, v2, :cond_a

    :cond_9
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->pendingRouteUpdateOn202Response:Z

    if-eqz v0, :cond_c

    .line 361
    :cond_a
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 362
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/header/RecordRouteList;)V

    goto :goto_2

    .line 363
    :cond_b
    new-instance v0, Landroid/gov/nist/javax/sip/header/RouteList;

    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/RouteList;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 364
    :cond_c
    :goto_2
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;

    move-result-object p1

    if-eqz p1, :cond_d

    .line 365
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    move-result-object p1

    check-cast p1, Landroid/javax/sip/header/ContactHeader;

    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTarget(Landroid/javax/sip/header/ContactHeader;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 366
    :cond_d
    :try_start_7
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 367
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 368
    :cond_e
    monitor-exit p0

    return-void

    .line 369
    :goto_3
    :try_start_8
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 370
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    :cond_f
    throw p1

    :goto_4
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw p1
.end method

.method private createRequest(Ljava/lang/String;Ljava/lang/String;)Landroid/gov/nist/javax/sip/message/SIPRequest;
    .locals 10

    .line 1
    const-string v1, "SIPDialog::createRequest:setting Request Seq Number to "

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_e

    .line 5
    .line 6
    if-eqz p2, :cond_e

    .line 7
    .line 8
    const-string v2, "CANCEL"

    .line 9
    .line 10
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_d

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/javax/sip/DialogState;->getValue()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x3

    .line 31
    const-string v3, "BYE"

    .line 32
    .line 33
    if-ne v0, v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v2, p0

    .line 43
    goto/16 :goto_8

    .line 44
    .line 45
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isServer()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/javax/sip/DialogState;->getValue()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTarget()Landroid/javax/sip/address/Address;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTarget()Landroid/javax/sip/address/Address;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {v0}, Landroid/javax/sip/address/URI;->clone()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 86
    .line 87
    :goto_1
    move-object v3, v0

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteParty()Landroid/javax/sip/address/Address;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v0}, Landroid/javax/sip/address/URI;->clone()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/SipUri;->clearUriParms()V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :goto_2
    new-instance v5, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 108
    .line 109
    invoke-direct {v5}, Landroid/gov/nist/javax/sip/header/CSeq;-><init>()V

    .line 110
    .line 111
    .line 112
    :try_start_0
    invoke-virtual {v5, p1}, Landroid/gov/nist/javax/sip/header/CSeq;->setMethod(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalSeqNumber()J

    .line 116
    .line 117
    .line 118
    move-result-wide v6

    .line 119
    invoke-virtual {v5, v6, v7}, Landroid/gov/nist/javax/sip/header/CSeq;->setSeqNumber(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :catch_0
    move-exception v0

    .line 124
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 125
    .line 126
    invoke-interface {v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_4

    .line 131
    .line 132
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 133
    .line 134
    const-string v4, "Unexpected error"

    .line 135
    .line 136
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_4
    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 140
    .line 141
    .line 142
    :goto_3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 143
    .line 144
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 149
    .line 150
    if-nez v0, :cond_6

    .line 151
    .line 152
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 153
    .line 154
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    const-string p1, "Cannot find listening point for transport "

    .line 159
    .line 160
    if-eqz p0, :cond_5

    .line 161
    .line 162
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 163
    .line 164
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    new-instance p0, Landroid/javax/sip/SipException;

    .line 172
    .line 173
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p0

    .line 181
    :cond_6
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getViaHeader()Landroid/gov/nist/javax/sip/header/Via;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    new-instance v6, Landroid/gov/nist/javax/sip/header/From;

    .line 186
    .line 187
    invoke-direct {v6}, Landroid/gov/nist/javax/sip/header/From;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalParty()Landroid/javax/sip/address/Address;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-virtual {v6, p2}, Landroid/gov/nist/javax/sip/header/From;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 195
    .line 196
    .line 197
    new-instance v7, Landroid/gov/nist/javax/sip/header/To;

    .line 198
    .line 199
    invoke-direct {v7}, Landroid/gov/nist/javax/sip/header/To;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteParty()Landroid/javax/sip/address/Address;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-virtual {v7, p2}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 207
    .line 208
    .line 209
    move-object v2, p0

    .line 210
    invoke-virtual/range {v2 .. v7}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->createRequest(Landroid/gov/nist/javax/sip/address/SipUri;Landroid/gov/nist/javax/sip/header/Via;Landroid/gov/nist/javax/sip/header/CSeq;Landroid/gov/nist/javax/sip/header/From;Landroid/gov/nist/javax/sip/header/To;)Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->isTargetRefresh(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_7

    .line 219
    .line 220
    iget-object p2, v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 221
    .line 222
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getTransport()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {p2, v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    check-cast p2, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 231
    .line 232
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->createContactHeader()Landroid/javax/sip/header/ContactHeader;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    invoke-interface {p2}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Landroid/javax/sip/address/SipURI;

    .line 245
    .line 246
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isSecure()Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    invoke-interface {v0, v3}, Landroid/javax/sip/address/SipURI;->setSecure(Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 254
    .line 255
    .line 256
    :cond_7
    :try_start_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    check-cast p2, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 261
    .line 262
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalSeqNumber()J

    .line 263
    .line 264
    .line 265
    move-result-wide v3

    .line 266
    const-wide/16 v8, 0x1

    .line 267
    .line 268
    add-long/2addr v3, v8

    .line 269
    invoke-virtual {p2, v3, v4}, Landroid/gov/nist/javax/sip/header/CSeq;->setSeqNumber(J)V

    .line 270
    .line 271
    .line 272
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 273
    .line 274
    const/16 v3, 0x20

    .line 275
    .line 276
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_8

    .line 281
    .line 282
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 283
    .line 284
    new-instance v3, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/header/CSeq;->getSeqNumber()J

    .line 290
    .line 291
    .line 292
    move-result-wide v4

    .line 293
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    invoke-interface {v0, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :catch_1
    move-exception v0

    .line 305
    move-object p2, v0

    .line 306
    invoke-static {p2}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 307
    .line 308
    .line 309
    :cond_8
    :goto_4
    const-string p2, "SUBSCRIBE"

    .line 310
    .line 311
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result p2

    .line 315
    if-eqz p2, :cond_9

    .line 316
    .line 317
    iget-object p2, v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventHeader:Landroid/javax/sip/header/EventHeader;

    .line 318
    .line 319
    if-eqz p2, :cond_9

    .line 320
    .line 321
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 322
    .line 323
    .line 324
    :cond_9
    const-string p2, "NOTIFY"

    .line 325
    .line 326
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    if-eqz p1, :cond_a

    .line 331
    .line 332
    iget-object p1, v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventHeader:Landroid/javax/sip/header/EventHeader;

    .line 333
    .line 334
    if-eqz p1, :cond_a

    .line 335
    .line 336
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 337
    .line 338
    .line 339
    :cond_a
    :try_start_2
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    if-eqz p1, :cond_b

    .line 344
    .line 345
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-virtual {v6, p1}, Landroid/gov/nist/javax/sip/header/From;->setTag(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    goto :goto_5

    .line 353
    :catch_2
    move-exception v0

    .line 354
    move-object p1, v0

    .line 355
    goto :goto_6

    .line 356
    :cond_b
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/header/From;->removeTag()V

    .line 357
    .line 358
    .line 359
    :goto_5
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    if-eqz p1, :cond_c

    .line 364
    .line 365
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-virtual {v7, p1}, Landroid/gov/nist/javax/sip/header/To;->setTag(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    goto :goto_7

    .line 373
    :cond_c
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/header/To;->removeTag()V
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_2

    .line 374
    .line 375
    .line 376
    goto :goto_7

    .line 377
    :goto_6
    invoke-static {p1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 378
    .line 379
    .line 380
    :goto_7
    invoke-direct {v2, p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->updateRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 381
    .line 382
    .line 383
    return-object p0

    .line 384
    :goto_8
    new-instance p0, Landroid/javax/sip/SipException;

    .line 385
    .line 386
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    new-instance v0, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    const-string v1, "Dialog  "

    .line 397
    .line 398
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    const-string p1, " not yet established or terminated "

    .line 405
    .line 406
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw p0

    .line 420
    :cond_d
    const-string p0, "Dialog.createRequest(): Invalid request"

    .line 421
    .line 422
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    return-object v0

    .line 426
    :cond_e
    const-string p0, "null argument"

    .line 427
    .line 428
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    return-object v0
.end method

.method private doTargetRefresh(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/gov/nist/javax/sip/header/Contact;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTarget(Landroid/javax/sip/header/ContactHeader;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private declared-synchronized getRouteList()Landroid/gov/nist/javax/sip/header/RouteList;
    .locals 4

    .line 1
    const-string v0, "getRouteList "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 5
    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 15
    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_0
    :goto_0
    new-instance v0, Landroid/gov/nist/javax/sip/header/RouteList;

    .line 36
    .line 37
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/RouteList;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroid/gov/nist/javax/sip/header/RouteList;

    .line 41
    .line 42
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/RouteList;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->listIterator()Ljava/util/ListIterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_1
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Landroid/gov/nist/javax/sip/header/Route;

    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->clone()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Landroid/gov/nist/javax/sip/header/Route;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 76
    .line 77
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 84
    .line 85
    const-string v2, "----- "

    .line 86
    .line 87
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 91
    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v3, "getRouteList for "

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 113
    .line 114
    new-instance v2, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v3, "RouteList = "

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/RouteList;->encode()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 139
    .line 140
    if-eqz v1, :cond_2

    .line 141
    .line 142
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 143
    .line 144
    new-instance v2, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string v3, "myRouteList = "

    .line 150
    .line 151
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 155
    .line 156
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/RouteList;->encode()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :cond_2
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 171
    .line 172
    const-string v2, "----- "

    .line 173
    .line 174
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    :cond_3
    monitor-exit p0

    .line 178
    return-object v0

    .line 179
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 180
    throw v0
.end method

.method private static final optionPresent(Ljava/util/ListIterator;Ljava/lang/String;)Z
    .locals 1

    .line 1
    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/javax/sip/header/OptionTag;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Landroid/javax/sip/header/OptionTag;->getOptionTag()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method private printRouteList()V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "this : "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "printRouteList : "

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RouteList;->encode()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method private raiseErrorEvent(I)V
    .locals 1

    const/4 v0, 0x0

    .line 63
    invoke-direct {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->raiseErrorEvent(ILandroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V

    return-void
.end method

.method private raiseErrorEvent(ILandroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->setClientTransaction(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventListeners:Ljava/util/Set;

    .line 10
    .line 11
    monitor-enter p2

    .line 12
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventListeners:Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;

    .line 29
    .line 30
    invoke-interface {v2, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;->dialogErrorEvent(Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventListeners:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {p2}, Ljava/util/Set;->clear()V

    .line 40
    .line 41
    .line 42
    const/4 p2, 0x2

    .line 43
    if-eq p1, p2, :cond_1

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    if-eq p1, p2, :cond_1

    .line 47
    .line 48
    const/4 p2, 0x4

    .line 49
    if-eq p1, p2, :cond_1

    .line 50
    .line 51
    const/4 p2, 0x3

    .line 52
    if-eq p1, p2, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->delete()V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->stopTimer()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :goto_1
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw p0
.end method

.method private raiseIOException(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/javax/sip/IOExceptionEvent;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Landroid/javax/sip/IOExceptionEvent;-><init>(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, v0, p2}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x3

    .line 13
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private recordStackTrace()V
    .locals 5

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/PrintWriter;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/lang/Exception;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/util/Random;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 37
    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "TraceRecord = "

    .line 41
    .line 42
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ":"

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->stackTrace:Ljava/lang/String;

    .line 84
    .line 85
    return-void
.end method

.method private sendAck(Landroid/javax/sip/message/Request;Z)V
    .locals 8

    .line 1
    const-string v0, "Not releasing ack sem for "

    .line 2
    .line 3
    const-string v1, "ack = "

    .line 4
    .line 5
    const-string v2, "setting To tag for outgoing ACK = "

    .line 6
    .line 7
    const-string v3, "setting from tag For outgoing ACK= "

    .line 8
    .line 9
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 10
    .line 11
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const/16 v5, 0x20

    .line 14
    .line 15
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 22
    .line 23
    new-instance v6, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v7, "sendAck"

    .line 26
    .line 27
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-interface {v4, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v6, "ACK"

    .line 45
    .line 46
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_10

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-eqz v4, :cond_e

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Landroid/javax/sip/DialogState;->getValue()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_1

    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-interface {v4}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-interface {v6}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_3

    .line 91
    .line 92
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 93
    .line 94
    invoke-interface {p2, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_2

    .line 99
    .line 100
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 101
    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v1, "CallID "

    .line 105
    .line 106
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 124
    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v1, "RequestCallID = "

    .line 128
    .line 129
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {p1}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-interface {p2, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 151
    .line 152
    new-instance p2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v0, "dialog =  "

    .line 155
    .line 156
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_2
    const-string p0, "Bad call ID in request"

    .line 170
    .line 171
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_3
    :try_start_0
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 176
    .line 177
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v4, :cond_4

    .line 182
    .line 183
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 184
    .line 185
    new-instance v6, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-interface {v4, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 205
    .line 206
    new-instance v4, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-interface {v3, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 226
    .line 227
    new-instance v3, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :cond_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    if-eqz v1, :cond_5

    .line 247
    .line 248
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-interface {v1, v2}, Landroid/javax/sip/header/FromHeader;->setTag(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    if-eqz v1, :cond_6

    .line 264
    .line 265
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-interface {v1, v2}, Landroid/javax/sip/header/ToHeader;->setTag(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_3

    .line 274
    .line 275
    .line 276
    :cond_6
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 281
    .line 282
    .line 283
    move-result-wide v1

    .line 284
    invoke-virtual {p0, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSent(J)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    xor-int/lit8 v2, v1, 0x1

    .line 289
    .line 290
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastAckSent(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 291
    .line 292
    .line 293
    :try_start_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSendingStrategy:Landroid/gov/nist/javax/sip/stack/AckSendingStrategy;

    .line 294
    .line 295
    invoke-interface {v3, p1}, Landroid/gov/nist/javax/sip/stack/AckSendingStrategy;->send(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 296
    .line 297
    .line 298
    const/4 v3, 0x1

    .line 299
    iput-boolean v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAcknowledged:Z

    .line 300
    .line 301
    iget-wide v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->highestSequenceNumberAcknowledged:J

    .line 302
    .line 303
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-interface {v6}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 312
    .line 313
    .line 314
    move-result-wide v3

    .line 315
    iput-wide v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->highestSequenceNumberAcknowledged:J

    .line 316
    .line 317
    if-nez v1, :cond_7

    .line 318
    .line 319
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 320
    .line 321
    if-eqz v1, :cond_7

    .line 322
    .line 323
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseAckSem()V

    .line 324
    .line 325
    .line 326
    goto :goto_1

    .line 327
    :catch_0
    move-exception v0

    .line 328
    goto :goto_0

    .line 329
    :cond_7
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 330
    .line 331
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-eqz v1, :cond_b

    .line 336
    .line 337
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 338
    .line 339
    new-instance v3, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    const-string v0, " isAckSent "

    .line 348
    .line 349
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/javax/sip/SipException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 360
    .line 361
    .line 362
    goto :goto_1

    .line 363
    :catch_1
    move-exception p0

    .line 364
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 365
    .line 366
    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    if-eqz p1, :cond_8

    .line 371
    .line 372
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 373
    .line 374
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 375
    .line 376
    .line 377
    :cond_8
    new-instance p1, Landroid/javax/sip/SipException;

    .line 378
    .line 379
    const-string p2, "Could not create message channel"

    .line 380
    .line 381
    invoke-direct {p1, p2, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 382
    .line 383
    .line 384
    throw p1

    .line 385
    :catch_2
    move-exception p0

    .line 386
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 387
    .line 388
    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 389
    .line 390
    .line 391
    move-result p1

    .line 392
    if-eqz p1, :cond_9

    .line 393
    .line 394
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 395
    .line 396
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 397
    .line 398
    .line 399
    :cond_9
    throw p0

    .line 400
    :goto_0
    if-nez p2, :cond_d

    .line 401
    .line 402
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSendingStrategy:Landroid/gov/nist/javax/sip/stack/AckSendingStrategy;

    .line 403
    .line 404
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/AckSendingStrategy;->getLastHop()Landroid/javax/sip/address/Hop;

    .line 405
    .line 406
    .line 407
    move-result-object p2

    .line 408
    if-nez p2, :cond_a

    .line 409
    .line 410
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 411
    .line 412
    invoke-virtual {p2, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getNextHop(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/javax/sip/address/Hop;

    .line 413
    .line 414
    .line 415
    move-result-object p2

    .line 416
    :cond_a
    invoke-interface {p2}, Landroid/javax/sip/address/Hop;->getHost()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    invoke-interface {p2}, Landroid/javax/sip/address/Hop;->getPort()I

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    invoke-interface {p2}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object p2

    .line 428
    invoke-direct {p0, p1, v0, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->raiseIOException(Ljava/lang/String;ILjava/lang/String;)V

    .line 429
    .line 430
    .line 431
    :cond_b
    :goto_1
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

    .line 432
    .line 433
    if-eqz p1, :cond_c

    .line 434
    .line 435
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

    .line 444
    .line 445
    invoke-interface {p1, p2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 446
    .line 447
    .line 448
    const/4 p1, 0x0

    .line 449
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

    .line 450
    .line 451
    :cond_c
    return-void

    .line 452
    :cond_d
    new-instance p0, Landroid/javax/sip/SipException;

    .line 453
    .line 454
    const-string p1, "Could not send ack"

    .line 455
    .line 456
    invoke-direct {p0, p1, v0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 457
    .line 458
    .line 459
    throw p0

    .line 460
    :catch_3
    move-exception p0

    .line 461
    new-instance p1, Landroid/javax/sip/SipException;

    .line 462
    .line 463
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    invoke-direct {p1, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw p1

    .line 471
    :cond_e
    :goto_2
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 472
    .line 473
    const/4 p2, 0x4

    .line 474
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 475
    .line 476
    .line 477
    move-result p1

    .line 478
    if-eqz p1, :cond_f

    .line 479
    .line 480
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 481
    .line 482
    new-instance p2, Ljava/lang/StringBuilder;

    .line 483
    .line 484
    const-string v0, "Bad Dialog State for "

    .line 485
    .line 486
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    const-string v0, " dialogID = "

    .line 493
    .line 494
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p2

    .line 508
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    :cond_f
    new-instance p1, Landroid/javax/sip/SipException;

    .line 512
    .line 513
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    new-instance p2, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    const-string v0, "Bad dialog state "

    .line 520
    .line 521
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    invoke-direct {p1, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw p1

    .line 535
    :cond_10
    const-string p0, "Bad request method -- should be ACK"

    .line 536
    .line 537
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    return-void
.end method

.method private final setBranch(Landroid/gov/nist/javax/sip/header/Via;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "ACK"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastResponseStatusCode()Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/16 v0, 0x12c

    .line 18
    .line 19
    if-lt p2, v0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {}, Landroid/gov/nist/javax/sip/Utils;->getInstance()Landroid/gov/nist/javax/sip/Utils;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/Utils;->generateBranchId()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v0, "CANCEL"

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    :try_start_0
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/header/Via;->setBranch(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    move-exception p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method private setCallId(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;

    .line 6
    .line 7
    return-void
.end method

.method private setLastAckSent(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckSent:Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;

    .line 7
    .line 8
    return-void
.end method

.method private setLocalSequenceNumber(J)V
    .locals 4

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "setLocalSequenceNumber: original  "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-wide v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " new  = "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 41
    .line 42
    cmp-long v0, p1, v0

    .line 43
    .line 44
    if-lez v0, :cond_1

    .line 45
    .line 46
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const-string p0, "Sequence number should not decrease !"

    .line 50
    .line 51
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private toRetransmitFinalResponse(I)Z
    .locals 3

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->retransmissionTicksLeft:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sub-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->retransmissionTicksLeft:I

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->prevRetransmissionTicks:I

    .line 10
    .line 11
    mul-int/lit8 v2, v0, 0x2

    .line 12
    .line 13
    if-gt v2, p1, :cond_0

    .line 14
    .line 15
    mul-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->retransmissionTicksLeft:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->retransmissionTicksLeft:I

    .line 21
    .line 22
    :goto_0
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->prevRetransmissionTicks:I

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method private updateRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRouteList()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "Route"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->proxyAuthorizationHeader:Landroid/javax/sip/header/ProxyAuthorizationHeader;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const-string v0, "Proxy-Authorization"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->proxyAuthorizationHeader:Landroid/javax/sip/header/ProxyAuthorizationHeader;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method


# virtual methods
.method public ackReceived(J)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSeen()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_6

    .line 16
    .line 17
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 18
    .line 19
    const-string p1, "Ack already seen for response -- dropping"

    .line 20
    .line 21
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getInviteTransaction()Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_5

    .line 30
    .line 31
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getCSeq()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    cmp-long v2, v2, p1

    .line 36
    .line 37
    if-nez v2, :cond_6

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->acquireTimerTaskSem()V

    .line 40
    .line 41
    .line 42
    :try_start_0
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 56
    .line 57
    invoke-interface {v2, v4}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 58
    .line 59
    .line 60
    iput-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

    .line 81
    .line 82
    invoke-interface {v2, v4}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 83
    .line 84
    .line 85
    iput-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

    .line 86
    .line 87
    :cond_2
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckReceivedCSeqNumber:Ljava/lang/Long;

    .line 92
    .line 93
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 94
    .line 95
    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 102
    .line 103
    new-instance p2, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v1, "ackReceived for "

    .line 106
    .line 107
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 125
    .line 126
    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->getLineCount()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackLine:I

    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->printDebugInfo()V

    .line 133
    .line 134
    .line 135
    :cond_3
    iget-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 136
    .line 137
    if-eqz p1, :cond_4

    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseAckSem()V

    .line 140
    .line 141
    .line 142
    :cond_4
    const/4 p1, 0x1

    .line 143
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :goto_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_5
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 152
    .line 153
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_6

    .line 158
    .line 159
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 160
    .line 161
    const-string p1, "tr is null -- not updating the ack state"

    .line 162
    .line 163
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    return-void
.end method

.method public acquireTimerTaskSem()V
    .locals 3

    .line 1
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTaskLock:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    const-wide/16 v1, 0xa

    .line 6
    .line 7
    invoke-virtual {p0, v1, v2, v0}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    .line 8
    .line 9
    .line 10
    move-result p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    goto :goto_0

    .line 12
    :catch_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-eqz p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "Impossible to acquire the dialog timer task lock"

    .line 17
    .line 18
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public addEventListener(Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventListeners:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public declared-synchronized addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 3

    const-string v0, "setContact: dialogState: "

    monitor-enter p0

    .line 371
    :try_start_0
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v2, 0x20

    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 372
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "state = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 373
    :cond_0
    :goto_0
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogState:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->isTargetRefresh(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 374
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->doTargetRefresh(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 375
    :cond_1
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogState:I

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    goto :goto_2

    .line 376
    :cond_2
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 377
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    move-result-object v0

    check-cast v0, Landroid/javax/sip/header/ContactHeader;

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTarget(Landroid/javax/sip/header/ContactHeader;)V

    .line 378
    :cond_3
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_4

    .line 379
    monitor-exit p0

    return-void

    .line 380
    :cond_4
    :try_start_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 381
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/header/RecordRouteList;)V

    goto :goto_1

    .line 382
    :cond_5
    new-instance p1, Landroid/gov/nist/javax/sip/header/RouteList;

    invoke-direct {p1}, Landroid/gov/nist/javax/sip/header/RouteList;-><init>()V

    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 383
    :goto_1
    monitor-exit p0

    return-void

    .line 384
    :cond_6
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z
    .locals 7

    .line 1
    const-string v0, "SIPDialog::setLastTransaction:lastReferCSeq = "

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionSeen:Z

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionId:Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getBranchId()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionMethod:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setReInviteFlag(Z)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackProcessed:Z

    .line 41
    .line 42
    :cond_0
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 43
    .line 44
    const/16 v4, 0x20

    .line 45
    .line 46
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 53
    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v6, "SipDialog.addTransaction() "

    .line 57
    .line 58
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v6, " transaction = "

    .line 65
    .line 66
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v2, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    iget-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionSeen:Z

    .line 80
    .line 81
    if-nez v2, :cond_7

    .line 82
    .line 83
    invoke-virtual {p0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->storeFirstTransactionInfo(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v5, "SUBSCRIBE"

    .line 91
    .line 92
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    const-string v2, "Event"

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Landroid/javax/sip/header/EventHeader;

    .line 105
    .line 106
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventHeader:Landroid/javax/sip/header/EventHeader;

    .line 107
    .line 108
    :cond_2
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalParty(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteParty(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setCallId(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 115
    .line 116
    .line 117
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 118
    .line 119
    if-nez v2, :cond_3

    .line 120
    .line 121
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_3

    .line 126
    .line 127
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 131
    .line 132
    if-eqz v2, :cond_4

    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 139
    .line 140
    :cond_4
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->method:Ljava/lang/String;

    .line 141
    .line 142
    if-nez v2, :cond_5

    .line 143
    .line 144
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->method:Ljava/lang/String;

    .line 149
    .line 150
    :cond_5
    instance-of v2, p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 151
    .line 152
    if-eqz v2, :cond_6

    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-interface {v2}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->hisTag:Ljava/lang/String;

    .line 163
    .line 164
    goto/16 :goto_2

    .line 165
    .line 166
    :cond_6
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-interface {v2}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 171
    .line 172
    .line 173
    move-result-wide v5

    .line 174
    invoke-direct {p0, v5, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalSequenceNumber(J)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalSeqNumber()J

    .line 178
    .line 179
    .line 180
    move-result-wide v5

    .line 181
    iput-wide v5, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalLocalSequenceNumber:J

    .line 182
    .line 183
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-interface {v2}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalTag(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->myTag:Ljava/lang/String;

    .line 195
    .line 196
    if-nez v2, :cond_a

    .line 197
    .line 198
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 199
    .line 200
    invoke-interface {v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 207
    .line 208
    const-string v5, "The request\'s From header is missing the required Tag parameter."

    .line 209
    .line 210
    invoke-interface {v2, v5}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_7
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionMethod:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_9

    .line 225
    .line 226
    iget-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionIsServerTransaction:Z

    .line 227
    .line 228
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isServerTransaction()Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-eq v2, v5, :cond_9

    .line 233
    .line 234
    invoke-virtual {p0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->storeFirstTransactionInfo(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalParty(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteParty(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 241
    .line 242
    .line 243
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setCallId(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 244
    .line 245
    .line 246
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_8

    .line 251
    .line 252
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_8
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 260
    .line 261
    :goto_1
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->method:Ljava/lang/String;

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_9
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 269
    .line 270
    if-nez v2, :cond_a

    .line 271
    .line 272
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-eqz v2, :cond_a

    .line 277
    .line 278
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 279
    .line 280
    :cond_a
    :goto_2
    instance-of v2, p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 281
    .line 282
    if-eqz v2, :cond_b

    .line 283
    .line 284
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 289
    .line 290
    .line 291
    move-result-wide v1

    .line 292
    invoke-virtual {p0, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteSequenceNumber(J)V

    .line 293
    .line 294
    .line 295
    :cond_b
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 296
    .line 297
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    if-eqz v1, :cond_c

    .line 302
    .line 303
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 304
    .line 305
    new-instance v2, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v5, "isBackToBackUserAgent = "

    .line 308
    .line 309
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    iget-boolean v5, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 313
    .line 314
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_c
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_e

    .line 329
    .line 330
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 331
    .line 332
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    if-eqz v1, :cond_d

    .line 337
    .line 338
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 339
    .line 340
    new-instance v2, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    const-string v5, "SIPDialog::setLastTransaction:dialog= "

    .line 343
    .line 344
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v5, " lastTransaction = "

    .line 351
    .line 352
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :cond_d
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 366
    .line 367
    :cond_e
    :try_start_0
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-interface {v1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    const-string v2, "REFER"

    .line 376
    .line 377
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    if-eqz v1, :cond_10

    .line 382
    .line 383
    instance-of v1, p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 384
    .line 385
    if-eqz v1, :cond_10

    .line 386
    .line 387
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 392
    .line 393
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 398
    .line 399
    .line 400
    move-result-wide v1

    .line 401
    new-instance v5, Landroid/gov/nist/javax/sip/header/Event;

    .line 402
    .line 403
    invoke-direct {v5}, Landroid/gov/nist/javax/sip/header/Event;-><init>()V

    .line 404
    .line 405
    .line 406
    iput-object v5, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventHeader:Landroid/javax/sip/header/EventHeader;

    .line 407
    .line 408
    const-string v6, "refer"

    .line 409
    .line 410
    invoke-interface {v5, v6}, Landroid/javax/sip/header/EventHeader;->setEventType(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 414
    .line 415
    invoke-interface {v5, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 416
    .line 417
    .line 418
    move-result v5

    .line 419
    if-eqz v5, :cond_f

    .line 420
    .line 421
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 422
    .line 423
    new-instance v6, Ljava/lang/StringBuilder;

    .line 424
    .line 425
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-interface {v5, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    :cond_f
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventHeader:Landroid/javax/sip/header/EventHeader;

    .line 439
    .line 440
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-interface {v0, v1}, Landroid/javax/sip/header/EventHeader;->setEventId(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 445
    .line 446
    .line 447
    goto :goto_3

    .line 448
    :catch_0
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 449
    .line 450
    const-string v1, "Unexpected exception in REFER processing"

    .line 451
    .line 452
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logFatalError(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    :cond_10
    :goto_3
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 456
    .line 457
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-eqz v0, :cond_11

    .line 462
    .line 463
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 464
    .line 465
    new-instance v1, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    const-string v2, "Transaction Added "

    .line 468
    .line 469
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->myTag:Ljava/lang/String;

    .line 476
    .line 477
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    const-string v2, "/"

    .line 481
    .line 482
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->hisTag:Ljava/lang/String;

    .line 486
    .line 487
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 498
    .line 499
    new-instance v0, Ljava/lang/StringBuilder;

    .line 500
    .line 501
    const-string v1, "TID = "

    .line 502
    .line 503
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isServerTransaction()Z

    .line 517
    .line 518
    .line 519
    move-result p1

    .line 520
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 531
    .line 532
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 533
    .line 534
    .line 535
    :cond_11
    return v3
.end method

.method public checkRetransmissionForForking(Landroid/gov/nist/javax/sip/message/SIPResponse;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeqHeader()Landroid/javax/sip/header/CSeqHeader;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-string v4, "RSeq"

    .line 22
    .line 23
    invoke-virtual {p1, v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroid/gov/nist/javax/sip/header/RSeq;

    .line 28
    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, "/"

    .line 38
    .line 39
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    invoke-static {v1, v0}, La/brm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/RSeq;->getSeqNumber()J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->responsesReceivedInForkingCase:Ljava/util/Set;

    .line 73
    .line 74
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    xor-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setRetransmission(Z)V

    .line 81
    .line 82
    .line 83
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 84
    .line 85
    const/16 v1, 0x20

    .line 86
    .line 87
    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 94
    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v2, "marking response as retransmission "

    .line 98
    .line 99
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v0, " for dialog "

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_1
    return-void
.end method

.method public cleanUp()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->None:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 6
    .line 7
    if-eq v0, v1, :cond_4

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->cleanUpOnAck()V

    .line 10
    .line 11
    .line 12
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 13
    .line 14
    const/16 v1, 0x20

    .line 15
    .line 16
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "dialog cleanup : "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventListeners:Ljava/util/Set;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 v0, 0x0

    .line 53
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTaskLock:Ljava/util/concurrent/Semaphore;

    .line 54
    .line 55
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 56
    .line 57
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeader:Landroid/gov/nist/javax/sip/header/Contact;

    .line 58
    .line 59
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventHeader:Landroid/javax/sip/header/EventHeader;

    .line 60
    .line 61
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionId:Ljava/lang/String;

    .line 62
    .line 63
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionMethod:Ljava/lang/String;

    .line 64
    .line 65
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseDialogId:Ljava/lang/String;

    .line 66
    .line 67
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseMethod:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 70
    .line 71
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->clear()V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 79
    .line 80
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeadersString:Ljava/lang/String;

    .line 81
    .line 82
    :cond_2
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->clear()V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 90
    .line 91
    :cond_3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->responsesReceivedInForkingCase:Ljava/util/Set;

    .line 92
    .line 93
    invoke-interface {p0}, Ljava/util/Set;->clear()V

    .line 94
    .line 95
    .line 96
    :cond_4
    return-void
.end method

.method public cleanUpOnAck()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->None:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 6
    .line 7
    if-eq v0, v1, :cond_b

    .line 8
    .line 9
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "cleanupOnAck : "

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeadersString:Ljava/lang/String;

    .line 56
    .line 57
    :cond_1
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 58
    .line 59
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 60
    .line 61
    :cond_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 72
    .line 73
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->cleanUp()V

    .line 78
    .line 79
    .line 80
    :cond_3
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 81
    .line 82
    :cond_4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 93
    .line 94
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->cleanUp()V

    .line 99
    .line 100
    .line 101
    :cond_5
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 102
    .line 103
    :cond_6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;

    .line 104
    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeaderString:Ljava/lang/String;

    .line 112
    .line 113
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;

    .line 114
    .line 115
    :cond_7
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeader:Landroid/gov/nist/javax/sip/header/Contact;

    .line 116
    .line 117
    if-eqz v0, :cond_8

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeaderStringified:Ljava/lang/String;

    .line 124
    .line 125
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeader:Landroid/gov/nist/javax/sip/header/Contact;

    .line 126
    .line 127
    :cond_8
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTarget:Landroid/javax/sip/address/Address;

    .line 128
    .line 129
    if-eqz v0, :cond_9

    .line 130
    .line 131
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTargetStringified:Ljava/lang/String;

    .line 136
    .line 137
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTarget:Landroid/javax/sip/address/Address;

    .line 138
    .line 139
    :cond_9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 140
    .line 141
    if-eqz v0, :cond_a

    .line 142
    .line 143
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remotePartyStringified:Ljava/lang/String;

    .line 148
    .line 149
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 150
    .line 151
    :cond_a
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localParty:Landroid/javax/sip/address/Address;

    .line 152
    .line 153
    if-eqz v0, :cond_b

    .line 154
    .line 155
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localPartyStringified:Ljava/lang/String;

    .line 160
    .line 161
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localParty:Landroid/javax/sip/address/Address;

    .line 162
    .line 163
    :cond_b
    return-void
.end method

.method public createAck(J)Landroid/javax/sip/message/Request;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    const-string v3, "ACK"

    .line 6
    .line 7
    const-string v4, "Adding via to the ACK we are creating : "

    .line 8
    .line 9
    const-string v5, "lastResponseTopMostVia "

    .line 10
    .line 11
    const-string v6, "Cannot create ACK - no ListeningPoint for transport towards next hop found:"

    .line 12
    .line 13
    const-string v7, "No LP found for transport="

    .line 14
    .line 15
    const-string v8, "uri4transport = "

    .line 16
    .line 17
    const-string v9, "remoteTargetURI "

    .line 18
    .line 19
    const-string v10, "No Listening point for "

    .line 20
    .line 21
    const-string v11, "uri4transport =  "

    .line 22
    .line 23
    const-string v12, "Cannot create ACK - impossible to use sips uri with transport UDP:"

    .line 24
    .line 25
    iget-object v13, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->method:Ljava/lang/String;

    .line 26
    .line 27
    const-string v14, "INVITE"

    .line 28
    .line 29
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v13

    .line 33
    if-eqz v13, :cond_18

    .line 34
    .line 35
    const-wide/16 v13, 0x0

    .line 36
    .line 37
    cmp-long v13, v1, v13

    .line 38
    .line 39
    if-lez v13, :cond_17

    .line 40
    .line 41
    const-wide v15, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmp-long v13, v1, v15

    .line 47
    .line 48
    if-gtz v13, :cond_16

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTarget()Landroid/javax/sip/address/Address;

    .line 51
    .line 52
    .line 53
    move-result-object v13

    .line 54
    if-eqz v13, :cond_15

    .line 55
    .line 56
    sget-object v13, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 57
    .line 58
    const/16 v15, 0x20

    .line 59
    .line 60
    invoke-interface {v13, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    if-eqz v13, :cond_0

    .line 65
    .line 66
    sget-object v13, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 67
    .line 68
    new-instance v14, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v15, "createAck "

    .line 71
    .line 72
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v15, " cseqno "

    .line 79
    .line 80
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v14, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    invoke-interface {v13, v14}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_0
    iget-wide v13, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteOkReceived:J

    .line 94
    .line 95
    cmp-long v13, v13, v1

    .line 96
    .line 97
    if-gez v13, :cond_2

    .line 98
    .line 99
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 100
    .line 101
    const/16 v4, 0x20

    .line 102
    .line 103
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_1

    .line 108
    .line 109
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 110
    .line 111
    new-instance v4, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v5, "WARNING : Attempt to crete ACK without OK "

    .line 114
    .line 115
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 129
    .line 130
    new-instance v4, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v5, "LAST RESPONSE = "

    .line 133
    .line 134
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastResponseStatusCode()Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_1
    new-instance v3, Landroid/javax/sip/SipException;

    .line 152
    .line 153
    iget-wide v4, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteOkReceived:J

    .line 154
    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v6, "Dialog not yet established -- no OK response! lastInviteOkReceived="

    .line 158
    .line 159
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v4, " cseqno="

    .line 166
    .line 167
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {v3, v0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v3

    .line 181
    :cond_2
    :try_start_0
    iget-object v13, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 182
    .line 183
    if-eqz v13, :cond_3

    .line 184
    .line 185
    invoke-virtual {v13}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    if-nez v13, :cond_3

    .line 190
    .line 191
    iget-object v13, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 192
    .line 193
    invoke-virtual {v13}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 194
    .line 195
    .line 196
    move-result-object v13

    .line 197
    check-cast v13, Landroid/gov/nist/javax/sip/header/Route;

    .line 198
    .line 199
    invoke-virtual {v13}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    invoke-interface {v13}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    check-cast v13, Landroid/javax/sip/address/SipURI;

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTarget()Landroid/javax/sip/address/Address;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    invoke-interface {v13}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    check-cast v13, Landroid/javax/sip/address/SipURI;

    .line 219
    .line 220
    :goto_0
    invoke-interface {v13}, Landroid/javax/sip/address/SipURI;->getTransportParam()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    invoke-interface {v13}, Landroid/javax/sip/address/SipURI;->isSecure()Z

    .line 225
    .line 226
    .line 227
    move-result v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 228
    move/from16 v17, v15

    .line 229
    .line 230
    const-string v15, "TLS"

    .line 231
    .line 232
    move-object/from16 v18, v4

    .line 233
    .line 234
    const-string v4, "UDP"

    .line 235
    .line 236
    if-eqz v17, :cond_6

    .line 237
    .line 238
    if-eqz v14, :cond_5

    .line 239
    .line 240
    :try_start_1
    invoke-virtual {v14, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    if-nez v14, :cond_4

    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_4
    new-instance v0, Landroid/javax/sip/SipException;

    .line 248
    .line 249
    new-instance v1, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-direct {v0, v1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v0

    .line 265
    :cond_5
    :goto_1
    move-object v14, v15

    .line 266
    :cond_6
    if-eqz v14, :cond_7

    .line 267
    .line 268
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 269
    .line 270
    invoke-virtual {v4, v14}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    check-cast v4, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_7
    invoke-interface {v13}, Landroid/javax/sip/address/SipURI;->isSecure()Z

    .line 278
    .line 279
    .line 280
    move-result v12
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 281
    move/from16 v17, v12

    .line 282
    .line 283
    iget-object v12, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 284
    .line 285
    if-eqz v17, :cond_8

    .line 286
    .line 287
    :try_start_2
    invoke-virtual {v12, v15}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    check-cast v4, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 292
    .line 293
    goto :goto_2

    .line 294
    :cond_8
    invoke-virtual {v12, v4}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    check-cast v4, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 299
    .line 300
    if-nez v4, :cond_9

    .line 301
    .line 302
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 303
    .line 304
    const-string v12, "TCP"

    .line 305
    .line 306
    invoke-virtual {v4, v12}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    check-cast v4, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 311
    .line 312
    :cond_9
    :goto_2
    sget-object v12, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 313
    .line 314
    const/16 v15, 0x20

    .line 315
    .line 316
    invoke-interface {v12, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 317
    .line 318
    .line 319
    move-result v12

    .line 320
    if-eqz v12, :cond_a

    .line 321
    .line 322
    sget-object v12, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 323
    .line 324
    new-instance v15, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v15, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    invoke-interface {v12, v11}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    :cond_a
    if-nez v4, :cond_e

    .line 340
    .line 341
    invoke-interface {v13}, Landroid/javax/sip/address/SipURI;->isSecure()Z

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    if-nez v11, :cond_c

    .line 346
    .line 347
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 348
    .line 349
    const/16 v15, 0x20

    .line 350
    .line 351
    invoke-interface {v4, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    if-eqz v4, :cond_b

    .line 356
    .line 357
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 358
    .line 359
    new-instance v11, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    const-string v10, " Using last response topmost"

    .line 368
    .line 369
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v10

    .line 376
    invoke-interface {v4, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :cond_b
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 380
    .line 381
    iget-object v10, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 382
    .line 383
    invoke-virtual {v10}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    invoke-virtual {v4, v10}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    check-cast v4, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 392
    .line 393
    :cond_c
    if-nez v4, :cond_e

    .line 394
    .line 395
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 396
    .line 397
    const/4 v2, 0x4

    .line 398
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_d

    .line 403
    .line 404
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 405
    .line 406
    new-instance v2, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTarget()Landroid/javax/sip/address/Address;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 430
    .line 431
    new-instance v1, Ljava/lang/StringBuilder;

    .line 432
    .line 433
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 447
    .line 448
    new-instance v1, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    :cond_d
    new-instance v0, Landroid/javax/sip/SipException;

    .line 464
    .line 465
    new-instance v1, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-direct {v0, v1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    throw v0

    .line 481
    :cond_e
    new-instance v4, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 482
    .line 483
    invoke-direct {v4}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v4, v3}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMethod(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTarget()Landroid/javax/sip/address/Address;

    .line 490
    .line 491
    .line 492
    move-result-object v6

    .line 493
    invoke-interface {v6}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    invoke-interface {v6}, Landroid/javax/sip/address/URI;->clone()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    check-cast v6, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 502
    .line 503
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 511
    .line 512
    .line 513
    new-instance v6, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 514
    .line 515
    invoke-direct {v6, v1, v2, v3}, Landroid/gov/nist/javax/sip/header/CSeq;-><init>(JLjava/lang/String;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 519
    .line 520
    .line 521
    new-instance v1, Ljava/util/ArrayList;

    .line 522
    .line 523
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 524
    .line 525
    .line 526
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 527
    .line 528
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 529
    .line 530
    const/16 v15, 0x20

    .line 531
    .line 532
    invoke-interface {v3, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    if-eqz v3, :cond_f

    .line 537
    .line 538
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 539
    .line 540
    new-instance v6, Ljava/lang/StringBuilder;

    .line 541
    .line 542
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    iget-object v5, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 546
    .line 547
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    invoke-interface {v3, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    :cond_f
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->removeParameters()V

    .line 558
    .line 559
    .line 560
    iget-object v3, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 561
    .line 562
    if-eqz v3, :cond_10

    .line 563
    .line 564
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    if-eqz v3, :cond_10

    .line 569
    .line 570
    iget-object v3, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 571
    .line 572
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameters()Landroid/gov/nist/core/NameValueList;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    if-eqz v3, :cond_10

    .line 581
    .line 582
    invoke-virtual {v3}, Landroid/gov/nist/core/NameValueList;->size()I

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    if-lez v5, :cond_10

    .line 587
    .line 588
    invoke-virtual {v3}, Landroid/gov/nist/core/NameValueList;->clone()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    check-cast v3, Landroid/gov/nist/core/NameValueList;

    .line 593
    .line 594
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameters(Landroid/gov/nist/core/NameValueList;)V

    .line 595
    .line 596
    .line 597
    :cond_10
    invoke-static {}, Landroid/gov/nist/javax/sip/Utils;->getInstance()Landroid/gov/nist/javax/sip/Utils;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/Utils;->generateBranchId()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/header/Via;->setBranch(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 612
    .line 613
    const/16 v15, 0x20

    .line 614
    .line 615
    invoke-interface {v3, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    if-eqz v3, :cond_11

    .line 620
    .line 621
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 622
    .line 623
    new-instance v5, Ljava/lang/StringBuilder;

    .line 624
    .line 625
    move-object/from16 v6, v18

    .line 626
    .line 627
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    const-string v2, " lastResponseTopMostVia "

    .line 634
    .line 635
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 639
    .line 640
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-interface {v3, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    :cond_11
    invoke-virtual {v4, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 651
    .line 652
    .line 653
    new-instance v1, Landroid/gov/nist/javax/sip/header/From;

    .line 654
    .line 655
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/From;-><init>()V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalParty()Landroid/javax/sip/address/Address;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/header/From;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 663
    .line 664
    .line 665
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->myTag:Ljava/lang/String;

    .line 666
    .line 667
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/header/From;->setTag(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v4, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 671
    .line 672
    .line 673
    new-instance v1, Landroid/gov/nist/javax/sip/header/To;

    .line 674
    .line 675
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/To;-><init>()V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteParty()Landroid/javax/sip/address/Address;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 683
    .line 684
    .line 685
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->hisTag:Ljava/lang/String;

    .line 686
    .line 687
    if-eqz v2, :cond_12

    .line 688
    .line 689
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/header/To;->setTag(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    :cond_12
    invoke-virtual {v4, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 693
    .line 694
    .line 695
    new-instance v1, Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 696
    .line 697
    const/16 v2, 0x46

    .line 698
    .line 699
    invoke-direct {v1, v2}, Landroid/gov/nist/javax/sip/header/MaxForwards;-><init>(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v4, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMaxForwards(Landroid/javax/sip/header/MaxForwardsHeader;)V

    .line 703
    .line 704
    .line 705
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 706
    .line 707
    if-eqz v1, :cond_14

    .line 708
    .line 709
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getAuthorization()Landroid/gov/nist/javax/sip/header/Authorization;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    if-eqz v1, :cond_13

    .line 714
    .line 715
    invoke-virtual {v4, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 716
    .line 717
    .line 718
    :cond_13
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 719
    .line 720
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    iput-object v1, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 725
    .line 726
    const/4 v1, 0x0

    .line 727
    iput-object v1, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 728
    .line 729
    :cond_14
    invoke-direct {v0, v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->updateRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 730
    .line 731
    .line 732
    return-object v4

    .line 733
    :catch_0
    move-exception v0

    .line 734
    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 735
    .line 736
    .line 737
    new-instance v1, Landroid/javax/sip/SipException;

    .line 738
    .line 739
    const-string v2, "unexpected exception "

    .line 740
    .line 741
    invoke-direct {v1, v2, v0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 742
    .line 743
    .line 744
    throw v1

    .line 745
    :cond_15
    const-string v0, "Cannot create ACK - no remote Target!"

    .line 746
    .line 747
    invoke-static {v0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    const/16 v16, 0x0

    .line 751
    .line 752
    return-object v16

    .line 753
    :cond_16
    const/16 v16, 0x0

    .line 754
    .line 755
    const-string v0, "bad cseq > 4294967295"

    .line 756
    .line 757
    invoke-static {v0}, La/itt0;->r(Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    return-object v16

    .line 761
    :cond_17
    const/16 v16, 0x0

    .line 762
    .line 763
    const-string v0, "bad cseq <= 0 "

    .line 764
    .line 765
    invoke-static {v0}, La/itt0;->r(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    return-object v16

    .line 769
    :cond_18
    new-instance v1, Landroid/javax/sip/SipException;

    .line 770
    .line 771
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->method:Ljava/lang/String;

    .line 772
    .line 773
    new-instance v2, Ljava/lang/StringBuilder;

    .line 774
    .line 775
    const-string v3, "Dialog was not created with an INVITE"

    .line 776
    .line 777
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-direct {v1, v0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    throw v1
.end method

.method public createPrack(Landroid/javax/sip/message/Response;)Landroid/javax/sip/message/Request;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/javax/sip/DialogState;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    const-string v0, "RSeq"

    .line 20
    .line 21
    invoke-interface {p1, v0}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/gov/nist/javax/sip/header/RSeq;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    :try_start_0
    move-object v1, p1

    .line 31
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 32
    .line 33
    const-string v3, "PRACK"

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-direct {p0, v3, v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->createRequest(Ljava/lang/String;Ljava/lang/String;)Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v4}, Landroid/javax/sip/header/ToHeader;->getTag()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setToTag(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v4, Landroid/gov/nist/javax/sip/header/RAck;

    .line 59
    .line 60
    invoke-direct {v4}, Landroid/gov/nist/javax/sip/header/RAck;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Landroid/gov/nist/javax/sip/header/RSeq;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v4, v0}, Landroid/gov/nist/javax/sip/header/RAck;->setMethod(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    long-to-int v0, v0

    .line 89
    int-to-long v0, v0

    .line 90
    invoke-virtual {v4, v0, v1}, Landroid/gov/nist/javax/sip/header/RAck;->setCSequenceNumber(J)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/RSeq;->getSeqNumber()J

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    invoke-virtual {v4, v0, v1}, Landroid/gov/nist/javax/sip/header/RAck;->setRSequenceNumber(J)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 101
    .line 102
    .line 103
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->proxyAuthorizationHeader:Landroid/javax/sip/header/ProxyAuthorizationHeader;

    .line 104
    .line 105
    if-eqz p0, :cond_0

    .line 106
    .line 107
    invoke-virtual {v3, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addHeader(Landroid/javax/sip/header/Header;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    return-object v3

    .line 111
    :catch_0
    move-exception p0

    .line 112
    goto :goto_0

    .line 113
    :cond_0
    return-object v3

    .line 114
    :goto_0
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :cond_1
    const-string p0, "Missing RSeq Header"

    .line 119
    .line 120
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-object v2

    .line 124
    :cond_2
    new-instance p0, Landroid/javax/sip/DialogDoesNotExistException;

    .line 125
    .line 126
    const-string p1, "Dialog not initialized or terminated"

    .line 127
    .line 128
    invoke-direct {p0, p1}, Landroid/javax/sip/DialogDoesNotExistException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p0
.end method

.method public createReliableProvisionalResponse(I)Landroid/javax/sip/message/Response;
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionIsServerTransaction:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    const/16 v0, 0x64

    .line 7
    .line 8
    if-le p1, v0, :cond_5

    .line 9
    .line 10
    const/16 v0, 0xc7

    .line 11
    .line 12
    if-gt p1, v0, :cond_5

    .line 13
    .line 14
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v2, "INVITE"

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    const-string v0, "Supported"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaders(Ljava/lang/String;)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v2, "100rel"

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-static {v0, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->optionPresent(Ljava/util/ListIterator;Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    :cond_0
    const-string v0, "Require"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaders(Ljava/lang/String;)Ljava/util/ListIterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-static {v0, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->optionPresent(Ljava/util/ListIterator;Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    :cond_1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v0, Landroid/gov/nist/javax/sip/header/Require;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/Require;-><init>()V

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/header/Require;->setOptionTag(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catch_0
    move-exception v1

    .line 72
    invoke-static {v1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Landroid/gov/nist/javax/sip/header/RSeq;

    .line 79
    .line 80
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/RSeq;-><init>()V

    .line 81
    .line 82
    .line 83
    const-wide/16 v1, 0x1

    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Landroid/gov/nist/javax/sip/header/RSeq;->setSeqNumber(J)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-eqz p0, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RecordRouteList;->clone()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 99
    .line 100
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    return-object p1

    .line 104
    :cond_3
    const-string p0, "No Supported/Require 100rel header in the request"

    .line 105
    .line 106
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_4
    const-string p0, "Bad method"

    .line 111
    .line 112
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object v1

    .line 116
    :cond_5
    const-string p0, "Bad status code "

    .line 117
    .line 118
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v1

    .line 122
    :cond_6
    const-string p0, "Not a Server Dialog!"

    .line 123
    .line 124
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object v1
.end method

.method public createRequest(Landroid/gov/nist/javax/sip/address/SipUri;Landroid/gov/nist/javax/sip/header/Via;Landroid/gov/nist/javax/sip/header/CSeq;Landroid/gov/nist/javax/sip/header/From;Landroid/gov/nist/javax/sip/header/To;)Landroid/gov/nist/javax/sip/message/SIPRequest;
    .locals 2

    .line 437
    new-instance v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    invoke-direct {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 438
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/header/CSeq;->getMethod()Ljava/lang/String;

    move-result-object v1

    .line 439
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMethod(Ljava/lang/String;)V

    .line 440
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 441
    invoke-direct {p0, p2, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setBranch(Landroid/gov/nist/javax/sip/header/Via;Ljava/lang/String;)V

    .line 442
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 443
    invoke-virtual {v0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 444
    invoke-virtual {v0, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 445
    invoke-virtual {v0, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 446
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 447
    :try_start_0
    new-instance p0, Landroid/gov/nist/javax/sip/header/MaxForwards;

    const/16 p1, 0x46

    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/header/MaxForwards;-><init>(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 448
    :catch_0
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 449
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object v0
.end method

.method public createRequest(Ljava/lang/String;)Landroid/javax/sip/message/Request;
    .locals 1

    .line 432
    const-string v0, "ACK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PRACK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 433
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    if-eqz v0, :cond_0

    .line 434
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->createRequest(Ljava/lang/String;Ljava/lang/String;)Landroid/gov/nist/javax/sip/message/SIPRequest;

    move-result-object p0

    return-object p0

    .line 435
    :cond_0
    const-string p0, "Dialog not yet established -- no response!"

    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    .line 436
    :cond_1
    new-instance p0, Landroid/javax/sip/SipException;

    const-string v0, "Invalid method specified for createRequest:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public delete()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public disableSequenceNumberValidation()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sequenceNumberValidation:Z

    .line 3
    .line 4
    return-void
.end method

.method public doDeferredDelete()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

    .line 20
    .line 21
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getBaseTimerInterval()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/16 v0, 0x1f4

    .line 51
    .line 52
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;

    .line 59
    .line 60
    mul-int/lit8 v0, v0, 0x40

    .line 61
    .line 62
    int-to-long v2, v0

    .line 63
    invoke-interface {v1, p0, v2, v3}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->delete()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public declared-synchronized doDeferredDeleteIfNoAckSent(J)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 3
    .line 4
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_2

    .line 17
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteIfNoAckSentTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;J)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteIfNoAckSentTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;

    .line 27
    .line 28
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getBaseTimerInterval()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/16 p1, 0x1f4

    .line 58
    .line 59
    :goto_0
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 60
    .line 61
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogDeleteIfNoAckSentTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteIfNoAckSentTask;

    .line 66
    .line 67
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getAckTimeoutFactor()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    mul-int/2addr v1, p1

    .line 74
    int-to-long v1, v1

    .line 75
    invoke-interface {p2, v0, v1, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :cond_2
    :goto_1
    monitor-exit p0

    .line 79
    return-void

    .line 80
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    throw p1
.end method

.method public getApplicationData()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->applicationData:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCallId()Landroid/javax/sip/header/CallIdHeader;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeaderString:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/CallIDParser;

    .line 10
    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeaderString:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/parser/CallIDParser;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/CallIDParser;->parse()Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/javax/sip/header/CallIdHeader;

    .line 21
    .line 22
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 27
    .line 28
    const-string v2, "error reparsing the call id header"

    .line 29
    .line 30
    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;

    .line 34
    .line 35
    return-object p0
.end method

.method public getDialogId()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseDialogId:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    return-object v0
.end method

.method public getEarlyDialogId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEventHeader()Landroid/javax/sip/header/EventHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventHeader:Landroid/javax/sip/header/EventHeader;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFirstTransaction()Landroid/javax/sip/Transaction;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This method has been deprecated and is no longer supported"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public getFirstTransactionInt()Landroid/javax/sip/Transaction;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 7
    .line 8
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionId:Ljava/lang/String;

    .line 9
    .line 10
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionIsServerTransaction:Z

    .line 11
    .line 12
    invoke-virtual {v0, v1, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Ljava/lang/String;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getInviteTransaction()Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->transaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public getLastAckSentCSeq()Landroid/javax/sip/header/CSeqHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckSent:Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getLastAckSentDialogId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckSent:Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->getDialogId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getLastAckSentFromTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckSent:Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->getFromTag()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getLastResponseCSeqNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseCSeqNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLastResponseMethod()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseMethod:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLastResponseStatusCode()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseStatusCode:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLastResponseTopMostVia()Landroid/gov/nist/javax/sip/header/Via;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLastTransaction()Landroid/gov/nist/javax/sip/stack/SIPTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLocalParty()Landroid/javax/sip/address/Address;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localParty:Landroid/javax/sip/address/Address;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localPartyStringified:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/AddressParser;

    .line 10
    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localPartyStringified:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/parser/AddressParser;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/parser/AddressParser;->address(Z)Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localParty:Landroid/javax/sip/address/Address;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 26
    .line 27
    const-string v2, "error reparsing the localParty"

    .line 28
    .line 29
    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localParty:Landroid/javax/sip/address/Address;

    .line 33
    .line 34
    return-object p0
.end method

.method public getLocalSeqNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLocalSequenceNumber()I
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    return p0
.end method

.method public getLocalTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->myTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMergeId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionMergeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->method:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMyContactHeader()Landroid/gov/nist/javax/sip/header/Contact;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeader:Landroid/gov/nist/javax/sip/header/Contact;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeaderStringified:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/ContactParser;

    .line 10
    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeaderStringified:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/parser/ContactParser;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/ContactParser;->parse()Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/gov/nist/javax/sip/header/Contact;

    .line 21
    .line 22
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeader:Landroid/gov/nist/javax/sip/header/Contact;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 27
    .line 28
    const-string v2, "error reparsing the contact header"

    .line 29
    .line 30
    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeader:Landroid/gov/nist/javax/sip/header/Contact;

    .line 34
    .line 35
    return-object p0
.end method

.method public getOriginalDialog()Landroid/javax/sip/Dialog;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOriginalLocalSequenceNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalLocalSequenceNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getOriginalRequestRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeadersString:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/RecordRouteParser;

    .line 10
    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeadersString:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/parser/RecordRouteParser;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/RecordRouteParser;->parse()Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 21
    .line 22
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 27
    .line 28
    const-string v2, "error reparsing the originalRequest RecordRoute Headers"

    .line 29
    .line 30
    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeadersString:Ljava/lang/String;

    .line 35
    .line 36
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalRequestRecordRouteHeaders:Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 37
    .line 38
    return-object p0
.end method

.method public getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRemoteParty()Landroid/javax/sip/address/Address;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remotePartyStringified:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/AddressParser;

    .line 10
    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remotePartyStringified:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/parser/AddressParser;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/parser/AddressParser;->address(Z)Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 26
    .line 27
    const-string v2, "error reparsing the remoteParty"

    .line 28
    .line 29
    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v2, "gettingRemoteParty "

    .line 47
    .line 48
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 64
    .line 65
    return-object p0
.end method

.method public getRemoteSeqNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteSequenceNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getRemoteSequenceNumber()I
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteSequenceNumber:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    return p0
.end method

.method public getRemoteTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->hisTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRemoteTarget()Landroid/javax/sip/address/Address;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTarget:Landroid/javax/sip/address/Address;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTargetStringified:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/AddressParser;

    .line 10
    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTargetStringified:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/parser/AddressParser;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/parser/AddressParser;->address(Z)Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTarget:Landroid/javax/sip/address/Address;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 26
    .line 27
    const-string v2, "error reparsing the remoteTarget"

    .line 28
    .line 29
    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTarget:Landroid/javax/sip/address/Address;

    .line 33
    .line 34
    return-object p0
.end method

.method public getRouteSet()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Ljava/util/LinkedList;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/util/LinkedList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRouteList()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->listIterator()Ljava/util/ListIterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;
    .locals 0

    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    return-object p0
.end method

.method public bridge synthetic getSipProvider()Landroid/javax/sip/SipProvider;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    return-object p0
.end method

.method public getState()Landroid/javax/sip/DialogState;
    .locals 1

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogState:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p0}, Landroid/javax/sip/DialogState;->getObject(I)Landroid/javax/sip/DialogState;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public handleAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSeen()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteSeqNumber()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getCSeq()J

    .line 15
    .line 16
    .line 17
    move-result-wide v5

    .line 18
    cmp-long v0, v3, v5

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 23
    .line 24
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 31
    .line 32
    const-string v0, "SIPDialog::handleAck: ACK already seen by dialog -- dropping Ack retransmission"

    .line 33
    .line 34
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->acquireTimerTaskSem()V

    .line 38
    .line 39
    .line 40
    :try_start_0
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 53
    .line 54
    invoke-interface {p1, v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 64
    .line 65
    .line 66
    return v1

    .line 67
    :goto_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sget-object v3, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 76
    .line 77
    if-ne v0, v3, :cond_4

    .line 78
    .line 79
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 80
    .line 81
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-eqz p0, :cond_3

    .line 86
    .line 87
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 88
    .line 89
    const-string p1, "SIPDialog::handleAck: Dialog is terminated -- dropping ACK"

    .line 90
    .line 91
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    return v1

    .line 95
    :cond_4
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 96
    .line 97
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 104
    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v4, "SIPDialog::handleAck: lastResponseCSeqNumber = "

    .line 108
    .line 109
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-wide v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteOkReceived:J

    .line 113
    .line 114
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v4, " ackTxCSeq "

    .line 118
    .line 119
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getCSeq()J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseStatusCode:Ljava/lang/Integer;

    .line 137
    .line 138
    if-eqz v0, :cond_7

    .line 139
    .line 140
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteResponseCode:I

    .line 141
    .line 142
    div-int/lit8 v0, v0, 0x64

    .line 143
    .line 144
    const/4 v3, 0x2

    .line 145
    if-ne v0, v3, :cond_7

    .line 146
    .line 147
    iget-wide v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteResponseCSeqNumber:J

    .line 148
    .line 149
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getCSeq()J

    .line 150
    .line 151
    .line 152
    move-result-wide v5

    .line 153
    cmp-long v0, v3, v5

    .line 154
    .line 155
    if-nez v0, :cond_7

    .line 156
    .line 157
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseDialogId:Ljava/lang/String;

    .line 158
    .line 159
    invoke-interface {p1, p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getCSeq()J

    .line 163
    .line 164
    .line 165
    move-result-wide v0

    .line 166
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackReceived(J)V

    .line 167
    .line 168
    .line 169
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 170
    .line 171
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-eqz p0, :cond_6

    .line 176
    .line 177
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 178
    .line 179
    const-string p1, "SIPDialog::handleACK: ACK for 2XX response --- sending to TU "

    .line 180
    .line 181
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_6
    const/4 p0, 0x1

    .line 185
    return p0

    .line 186
    :cond_7
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 187
    .line 188
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_8

    .line 193
    .line 194
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 195
    .line 196
    const-string v0, " INVITE transaction not found"

    .line 197
    .line 198
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent()Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_9

    .line 206
    .line 207
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseAckSem()V

    .line 208
    .line 209
    .line 210
    :cond_9
    return v1
.end method

.method public handlePrack(Landroid/gov/nist/javax/sip/message/SIPRequest;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isServer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 11
    .line 12
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 19
    .line 20
    const-string p1, "Dropping Prack -- not a server Dialog"

    .line 21
    .line 22
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return v1

    .line 26
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getFirstTransactionInt()Landroid/javax/sip/Transaction;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 31
    .line 32
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getReliableProvisionalResponse()[B

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 47
    .line 48
    const-string p1, "Dropping Prack -- ReliableResponse not found"

    .line 49
    .line 50
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return v1

    .line 54
    :cond_3
    const-string v0, "RAck"

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Landroid/gov/nist/javax/sip/header/RAck;

    .line 61
    .line 62
    if-nez p1, :cond_5

    .line 63
    .line 64
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 65
    .line 66
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 73
    .line 74
    const-string p1, "Dropping Prack -- rack header not found"

    .line 75
    .line 76
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    return v1

    .line 80
    :cond_5
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/RAck;->getMethod()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getPendingReliableResponseMethod()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const-string v3, "Dropping Prack -- CSeq Header does not match PRACK"

    .line 93
    .line 94
    if-nez v0, :cond_7

    .line 95
    .line 96
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 97
    .line 98
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_6

    .line 103
    .line 104
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 105
    .line 106
    invoke-interface {p0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    return v1

    .line 110
    :cond_7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/RAck;->getCSeqNumberLong()J

    .line 111
    .line 112
    .line 113
    move-result-wide v4

    .line 114
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getPendingReliableCSeqNumber()J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    cmp-long v0, v4, v6

    .line 119
    .line 120
    if-eqz v0, :cond_9

    .line 121
    .line 122
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 123
    .line 124
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_8

    .line 129
    .line 130
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 131
    .line 132
    invoke-interface {p0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_8
    return v1

    .line 136
    :cond_9
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/RAck;->getRSequenceNumber()J

    .line 137
    .line 138
    .line 139
    move-result-wide v3

    .line 140
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getPendingReliableRSeqNumber()J

    .line 141
    .line 142
    .line 143
    move-result-wide v5

    .line 144
    cmp-long p1, v3, v5

    .line 145
    .line 146
    if-eqz p1, :cond_b

    .line 147
    .line 148
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 149
    .line 150
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_a

    .line 155
    .line 156
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 157
    .line 158
    const-string p1, "Dropping Prack -- RSeq Header does not match PRACK"

    .line 159
    .line 160
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :cond_a
    return v1

    .line 164
    :cond_b
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->prackRecieved()Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    return p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeaderString:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public incrementLocalSequenceNumber()V
    .locals 4

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localSequenceNumber:J

    .line 7
    .line 8
    return-void
.end method

.method public isAckSeen()Z
    .locals 7

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckReceivedCSeqNumber:Ljava/lang/Long;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "SIPDialog::isAckSeen:"

    .line 5
    .line 6
    const/16 v3, 0x20

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseStatusCode:Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v4, 0xc8

    .line 17
    .line 18
    if-ne v0, v4, :cond_1

    .line 19
    .line 20
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 21
    .line 22
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p0, "lastAckReceived is null -- returning false"

    .line 39
    .line 40
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return v1

    .line 51
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseMethod:Ljava/lang/String;

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 56
    .line 57
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 64
    .line 65
    new-instance v3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p0, "lastResponse is null -- returning false"

    .line 74
    .line 75
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    return v1

    .line 86
    :cond_3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckReceivedCSeqNumber:Ljava/lang/Long;

    .line 87
    .line 88
    const/4 v4, 0x1

    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseStatusCode:Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    div-int/lit8 v0, v0, 0x64

    .line 98
    .line 99
    const/4 v5, 0x2

    .line 100
    if-le v0, v5, :cond_5

    .line 101
    .line 102
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 103
    .line 104
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 111
    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v2, "lastResponse statusCode "

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseStatusCode:Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    return v4

    .line 138
    :cond_5
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 139
    .line 140
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_6

    .line 145
    .line 146
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 147
    .line 148
    new-instance v2, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v3, "SIPDialog::isAckSeen:lastAckReceivedCSeqNumber = "

    .line 151
    .line 152
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckReceivedCSeqNumber:Ljava/lang/Long;

    .line 156
    .line 157
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v3, " remoteCSeqNumber = "

    .line 161
    .line 162
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteSeqNumber()J

    .line 166
    .line 167
    .line 168
    move-result-wide v5

    .line 169
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckReceivedCSeqNumber:Ljava/lang/Long;

    .line 180
    .line 181
    if-eqz v0, :cond_7

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteSeqNumber()J

    .line 188
    .line 189
    .line 190
    move-result-wide v5

    .line 191
    cmp-long p0, v2, v5

    .line 192
    .line 193
    if-ltz p0, :cond_7

    .line 194
    .line 195
    return v4

    .line 196
    :cond_7
    return v1
.end method

.method public isAckSent()Z
    .locals 2

    const-wide/16 v0, -0x1

    .line 38
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSent(J)Z

    move-result p0

    return p0
.end method

.method public isAckSent(J)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastTransaction()Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastTransaction()Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Landroid/javax/sip/ClientTransaction;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckSent:Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastAckSentCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    cmp-long p0, p1, v3

    .line 32
    .line 33
    if-gtz p0, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    return v2

    .line 37
    :cond_3
    return v1
.end method

.method public isAssigned()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAssigned:Z

    .line 2
    .line 3
    return p0
.end method

.method public isAtleastOneAckSent()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAcknowledged:Z

    .line 2
    .line 3
    return p0
.end method

.method public isBackToBackUserAgent()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 2
    .line 3
    return p0
.end method

.method public isBlockedForReInvite()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public isForked()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public isLastAckPresent()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckSent:Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public isReInvite()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->reInviteFlag:Z

    .line 2
    .line 3
    return p0
.end method

.method public declared-synchronized isRequestConsumable(Landroid/gov/nist/javax/sip/message/SIPRequest;)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-string v1, "ACK"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isSequenceNumberValidation()Z

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return v1

    .line 23
    :cond_0
    :try_start_1
    iget-wide v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteSequenceNumber:J

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    cmp-long p1, v2, v4

    .line 34
    .line 35
    if-gez p1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    :goto_0
    monitor-exit p0

    .line 40
    return v1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :try_start_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 44
    .line 45
    const-string v0, "Illegal method"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    throw p1
.end method

.method public isSecure()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionSecure:Z

    .line 2
    .line 3
    return p0
.end method

.method public isSequenceNumberValidation()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sequenceNumberValidation:Z

    .line 2
    .line 3
    return p0
.end method

.method public isServer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionSeen:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->serverTransactionFlag:Z

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionIsServerTransaction:Z

    .line 9
    .line 10
    return p0
.end method

.method public isTerminatedOnBye()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->terminateOnBye:Z

    .line 2
    .line 3
    return p0
.end method

.method public printDebugInfo()V
    .locals 4

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "isServer = "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isServer()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v2, "localTag = "

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v2, "remoteTag = "

    .line 62
    .line 63
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 81
    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v2, "localSequenceNumer = "

    .line 85
    .line 86
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalSeqNumber()J

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 104
    .line 105
    new-instance v1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v2, "remoteSequenceNumer = "

    .line 108
    .line 109
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteSeqNumber()J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 127
    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v2, "ackLine:"

    .line 131
    .line 132
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v2, " "

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackLine:I

    .line 148
    .line 149
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_0
    return-void
.end method

.method public releaseAckSem()V
    .locals 6

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v2, " sem="

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "releaseAckSem-enter]]"

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v4, " b2bua="

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 51
    .line 52
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 60
    .line 61
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const-string v3, "releaseAckSem]]"

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 70
    .line 71
    new-instance v4, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 83
    .line 84
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 95
    .line 96
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 97
    .line 98
    .line 99
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_2

    .line 106
    .line 107
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 110
    .line 111
    .line 112
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 113
    .line 114
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_2

    .line 119
    .line 120
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 121
    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 134
    .line 135
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_2
    return-void
.end method

.method public releaseTimerTaskSem()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTaskLock:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeEventListener(Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventListeners:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public declared-synchronized requestConsumed()V
    .locals 5

    .line 1
    const-string v0, "Request Consumed -- next consumable Request Seqno = "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteSeqNumber()J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    const-wide/16 v3, 0x1

    .line 9
    .line 10
    add-long/2addr v1, v3

    .line 11
    iput-wide v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->nextSeqno:J

    .line 12
    .line 13
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    const/16 v2, 0x20

    .line 16
    .line 17
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-wide v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->nextSeqno:J

    .line 31
    .line 32
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    monitor-exit p0

    .line 46
    return-void

    .line 47
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v0
.end method

.method public resendAck()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastAckSent:Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->reparseRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Timestamp"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 18
    .line 19
    iget-boolean v1, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->generateTimeStampHeader:Z

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Landroid/gov/nist/javax/sip/header/TimeStamp;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/TimeStamp;-><init>()V

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    long-to-float v2, v2

    .line 33
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/header/TimeStamp;->setTimeStamp(F)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V
    :try_end_0
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    :catch_0
    :cond_0
    const/4 v1, 0x0

    .line 40
    invoke-direct {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sendAck(Landroid/javax/sip/message/Request;Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 45
    .line 46
    const/16 v0, 0x20

    .line 47
    .line 48
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 55
    .line 56
    const-string v0, "SIPDialog::resendAck:lastAck sent is NULL hence not resending ACK"

    .line 57
    .line 58
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public sendAck(Landroid/javax/sip/message/Request;)V
    .locals 1

    const/4 v0, 0x1

    .line 541
    invoke-direct {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sendAck(Landroid/javax/sip/message/Request;Z)V

    return-void
.end method

.method public sendReliableProvisionalResponse(Landroid/javax/sip/message/Response;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isServer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 9
    .line 10
    invoke-interface {p1}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x64

    .line 15
    .line 16
    if-eq v1, v2, :cond_5

    .line 17
    .line 18
    invoke-interface {p1}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    div-int/2addr v1, v2

    .line 23
    const/4 v2, 0x2

    .line 24
    if-gt v1, v2, :cond_4

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    const-string v1, "Require"

    .line 33
    .line 34
    invoke-interface {p1, v1}, Landroid/javax/sip/message/Message;->getHeaders(Ljava/lang/String;)Ljava/util/ListIterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x1

    .line 39
    const-string v3, "100rel"

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    if-nez v4, :cond_1

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Landroid/javax/sip/header/RequireHeader;

    .line 57
    .line 58
    invoke-interface {v5}, Landroid/javax/sip/header/OptionTag;->getOptionTag()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    move v4, v2

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    if-nez v4, :cond_2

    .line 71
    .line 72
    new-instance v1, Landroid/gov/nist/javax/sip/header/Require;

    .line 73
    .line 74
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sip/header/Require;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, v1}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 78
    .line 79
    .line 80
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 81
    .line 82
    const/16 v3, 0x20

    .line 83
    .line 84
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 91
    .line 92
    const-string v3, "Require header with optionTag 100rel is needed -- adding one"

    .line 93
    .line 94
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getFirstTransactionInt()Landroid/javax/sip/Transaction;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 102
    .line 103
    invoke-virtual {p0, v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setDialogId(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->sendReliableProvisionalResponse(Landroid/javax/sip/message/Response;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->startRetransmitTimer(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;Landroid/javax/sip/message/Response;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_3
    const-string p0, "Badly formatted response -- To tag mandatory for Reliable Provisional Response"

    .line 121
    .line 122
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_4
    const-string p0, "Response code is not a 1xx response - should be in the range 101 to 199 "

    .line 127
    .line 128
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_5
    const-string p0, "Cannot send 100 as a reliable provisional response"

    .line 133
    .line 134
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_6
    const-string p0, "Not a Server Dialog"

    .line 139
    .line 140
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public sendRequest(Landroid/javax/sip/ClientTransaction;)V
    .locals 1

    .line 974
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sendRequest(Landroid/javax/sip/ClientTransaction;Z)V

    return-void
.end method

.method public sendRequest(Landroid/javax/sip/ClientTransaction;Z)V
    .locals 13

    .line 1
    const-string v0, "SIPDialog::sendRequest:setting Seq Number to "

    .line 2
    .line 3
    const-string v1, "SIPDialog::sendRequest:using message channel "

    .line 4
    .line 5
    const-string v2, "No route found! hop="

    .line 6
    .line 7
    const-string v3, "SIPDialog::sendRequest:oldChannel: useCount "

    .line 8
    .line 9
    if-eqz p1, :cond_1d

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Landroid/javax/sip/Transaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-interface {p2}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string v5, "INVITE"

    .line 24
    .line 25
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 32
    .line 33
    invoke-interface {p2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, "SIPDialog::sendRequest "

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, " clientTransaction = "

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 67
    .line 68
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getReinviteExecutor()Ljava/util/concurrent/ExecutorService;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;

    .line 73
    .line 74
    invoke-direct {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog$ReInviteSender;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/javax/sip/ClientTransaction;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    move-object p2, p1

    .line 82
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 83
    .line 84
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    const-string v6, "Proxy-Authorization"

    .line 89
    .line 90
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    check-cast v6, Landroid/javax/sip/header/ProxyAuthorizationHeader;

    .line 95
    .line 96
    iput-object v6, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->proxyAuthorizationHeader:Landroid/javax/sip/header/ProxyAuthorizationHeader;

    .line 97
    .line 98
    sget-object v6, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 99
    .line 100
    invoke-interface {v6, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_2

    .line 105
    .line 106
    sget-object v6, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 107
    .line 108
    new-instance v7, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v8, "SIPDialog::sendRequest:dialog.sendRequest  dialog = "

    .line 111
    .line 112
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v8, "\ndialogRequest = \n"

    .line 119
    .line 120
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    const-string v7, "ACK"

    .line 138
    .line 139
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_1c

    .line 144
    .line 145
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    const-string v7, "CANCEL"

    .line 150
    .line 151
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-nez v6, :cond_1c

    .line 156
    .line 157
    iget-boolean v6, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->byeSent:Z

    .line 158
    .line 159
    const-string v7, "BYE"

    .line 160
    .line 161
    if-eqz v6, :cond_4

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isTerminatedOnBye()Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_4

    .line 168
    .line 169
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-nez v6, :cond_4

    .line 178
    .line 179
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 180
    .line 181
    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-eqz p1, :cond_3

    .line 186
    .line 187
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 188
    .line 189
    new-instance p2, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v0, "BYE already sent for "

    .line 192
    .line 193
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_3
    const-string p0, "Cannot send request; BYE already sent"

    .line 207
    .line 208
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_4
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    if-nez v6, :cond_5

    .line 217
    .line 218
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getOutgoingViaHeader()Landroid/gov/nist/javax/sip/header/Via;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 223
    .line 224
    .line 225
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-interface {v6}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    invoke-interface {v8}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-virtual {v6, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-nez v6, :cond_7

    .line 246
    .line 247
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 248
    .line 249
    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-eqz p1, :cond_6

    .line 254
    .line 255
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 256
    .line 257
    new-instance p2, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v0, "CallID "

    .line 260
    .line 261
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 279
    .line 280
    new-instance p2, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v0, "SIPDialog::sendRequest:RequestCallID = "

    .line 283
    .line 284
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-interface {v0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 306
    .line 307
    new-instance p2, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string v0, "dialog =  "

    .line 310
    .line 311
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_6
    const-string p0, "Bad call ID in request"

    .line 325
    .line 326
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_7
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 331
    .line 332
    invoke-interface {p2, p0, v6}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    move-object v6, p1

    .line 336
    check-cast v6, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 337
    .line 338
    invoke-virtual {p0, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 339
    .line 340
    .line 341
    const/4 v6, 0x1

    .line 342
    invoke-interface {p2, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setTransactionMapped(Z)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    check-cast v8, Landroid/gov/nist/javax/sip/header/From;

    .line 350
    .line 351
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    check-cast v9, Landroid/gov/nist/javax/sip/header/To;

    .line 356
    .line 357
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    if-eqz v10, :cond_9

    .line 362
    .line 363
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    if-eqz v10, :cond_9

    .line 368
    .line 369
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v10

    .line 373
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v10

    .line 381
    if-eqz v10, :cond_8

    .line 382
    .line 383
    goto :goto_0

    .line 384
    :cond_8
    new-instance p1, Landroid/javax/sip/SipException;

    .line 385
    .line 386
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    new-instance p2, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    const-string v0, "From tag mismatch expecting  "

    .line 393
    .line 394
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    invoke-direct {p1, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw p1

    .line 408
    :cond_9
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v10

    .line 412
    if-eqz v10, :cond_a

    .line 413
    .line 414
    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/header/To;->getTag()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    if-eqz v10, :cond_a

    .line 419
    .line 420
    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/header/To;->getTag()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v10

    .line 424
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v11

    .line 428
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    if-nez v10, :cond_a

    .line 433
    .line 434
    sget-object v10, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 435
    .line 436
    invoke-interface {v10}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 437
    .line 438
    .line 439
    move-result v10

    .line 440
    if-eqz v10, :cond_a

    .line 441
    .line 442
    sget-object v10, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 443
    .line 444
    new-instance v11, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    const-string v12, "SIPDialog::sendRequest:To header tag mismatch expecting "

    .line 447
    .line 448
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v11

    .line 462
    invoke-interface {v10, v11}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    :cond_a
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    if-nez v10, :cond_c

    .line 470
    .line 471
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v10

    .line 475
    const-string v11, "NOTIFY"

    .line 476
    .line 477
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v10

    .line 481
    if-eqz v10, :cond_c

    .line 482
    .line 483
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v10

    .line 487
    const-string v11, "SUBSCRIBE"

    .line 488
    .line 489
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v10

    .line 493
    if-eqz v10, :cond_b

    .line 494
    .line 495
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v10

    .line 499
    invoke-virtual {p0, v10}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalTag(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    goto :goto_1

    .line 503
    :cond_b
    const-string p0, "Trying to send NOTIFY without SUBSCRIBE Dialog!"

    .line 504
    .line 505
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :cond_c
    :goto_1
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v10

    .line 513
    if-eqz v10, :cond_d

    .line 514
    .line 515
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v10

    .line 519
    invoke-virtual {v8, v10}, Landroid/gov/nist/javax/sip/header/From;->setTag(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    goto :goto_2

    .line 523
    :catch_0
    move-exception v8

    .line 524
    goto :goto_3

    .line 525
    :cond_d
    :goto_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v8

    .line 529
    if-eqz v8, :cond_e

    .line 530
    .line 531
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    invoke-virtual {v9, v8}, Landroid/gov/nist/javax/sip/header/To;->setTag(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 536
    .line 537
    .line 538
    goto :goto_4

    .line 539
    :goto_3
    invoke-static {v8}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 540
    .line 541
    .line 542
    :cond_e
    :goto_4
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getNextHop()Landroid/javax/sip/address/Hop;

    .line 543
    .line 544
    .line 545
    move-result-object p2

    .line 546
    sget-object v8, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 547
    .line 548
    invoke-interface {v8, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 549
    .line 550
    .line 551
    move-result v8

    .line 552
    if-eqz v8, :cond_f

    .line 553
    .line 554
    sget-object v8, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 555
    .line 556
    new-instance v9, Ljava/lang/StringBuilder;

    .line 557
    .line 558
    const-string v10, "SIPDialog::sendRequest:Using hop = "

    .line 559
    .line 560
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    invoke-interface {p2}, Landroid/javax/sip/address/Hop;->getHost()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v10

    .line 567
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    const-string v10, " : "

    .line 571
    .line 572
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-interface {p2}, Landroid/javax/sip/address/Hop;->getPort()I

    .line 576
    .line 577
    .line 578
    move-result v10

    .line 579
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v9

    .line 586
    invoke-interface {v8, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    :cond_f
    :try_start_1
    iget-object v8, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 590
    .line 591
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 592
    .line 593
    .line 594
    move-result-object v9

    .line 595
    invoke-interface {p2}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v10

    .line 599
    invoke-virtual {v9, v10}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 600
    .line 601
    .line 602
    move-result-object v9

    .line 603
    invoke-interface {v9}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v9

    .line 607
    iget v10, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionPort:I

    .line 608
    .line 609
    invoke-virtual {v8, v9, v10, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createRawMessageChannel(Ljava/lang/String;ILandroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 610
    .line 611
    .line 612
    move-result-object v8

    .line 613
    move-object v9, p1

    .line 614
    check-cast v9, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 615
    .line 616
    invoke-interface {v9}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 617
    .line 618
    .line 619
    move-result-object v9

    .line 620
    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->uncache()V

    .line 621
    .line 622
    .line 623
    iget-object v10, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 624
    .line 625
    iget-boolean v10, v10, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheClientConnections:Z

    .line 626
    .line 627
    if-nez v10, :cond_10

    .line 628
    .line 629
    iget v10, v9, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 630
    .line 631
    sub-int/2addr v10, v6

    .line 632
    iput v10, v9, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 633
    .line 634
    sget-object v10, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 635
    .line 636
    invoke-interface {v10, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 637
    .line 638
    .line 639
    move-result v10

    .line 640
    if-eqz v10, :cond_10

    .line 641
    .line 642
    sget-object v10, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 643
    .line 644
    new-instance v11, Ljava/lang/StringBuilder;

    .line 645
    .line 646
    invoke-direct {v11, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    iget v3, v9, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 650
    .line 651
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    invoke-interface {v10, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    :cond_10
    if-nez v8, :cond_13

    .line 662
    .line 663
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 664
    .line 665
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    if-eqz v1, :cond_11

    .line 670
    .line 671
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 672
    .line 673
    const-string v3, "Null message channel using outbound proxy !"

    .line 674
    .line 675
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    :cond_11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 679
    .line 680
    invoke-virtual {v1, v5}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getRouter(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/javax/sip/address/Router;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    invoke-interface {v1}, Landroid/javax/sip/address/Router;->getOutboundProxy()Landroid/javax/sip/address/Hop;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    if-eqz v1, :cond_12

    .line 689
    .line 690
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 691
    .line 692
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    invoke-interface {v1}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v3

    .line 700
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    invoke-interface {v2}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    iget v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionPort:I

    .line 709
    .line 710
    invoke-virtual {p2, v2, v3, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createRawMessageChannel(Ljava/lang/String;ILandroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 711
    .line 712
    .line 713
    move-result-object v8

    .line 714
    if-eqz v8, :cond_14

    .line 715
    .line 716
    move-object p2, p1

    .line 717
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 718
    .line 719
    invoke-interface {p2, v8}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setEncapsulatedChannel(Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 720
    .line 721
    .line 722
    goto :goto_5

    .line 723
    :cond_12
    new-instance p0, Landroid/javax/sip/SipException;

    .line 724
    .line 725
    new-instance p1, Ljava/lang/StringBuilder;

    .line 726
    .line 727
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object p1

    .line 737
    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    throw p0

    .line 741
    :cond_13
    move-object p2, p1

    .line 742
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 743
    .line 744
    invoke-interface {p2, v8}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setEncapsulatedChannel(Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 745
    .line 746
    .line 747
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 748
    .line 749
    invoke-interface {p2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 750
    .line 751
    .line 752
    move-result p2

    .line 753
    if-eqz p2, :cond_14

    .line 754
    .line 755
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 756
    .line 757
    new-instance v2, Ljava/lang/StringBuilder;

    .line 758
    .line 759
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    invoke-interface {p2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    :cond_14
    :goto_5
    if-eqz v8, :cond_15

    .line 773
    .line 774
    iget p2, v8, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 775
    .line 776
    add-int/2addr p2, v6

    .line 777
    iput p2, v8, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 778
    .line 779
    :cond_15
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 780
    .line 781
    iget-boolean p2, p2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheClientConnections:Z

    .line 782
    .line 783
    if-nez p2, :cond_16

    .line 784
    .line 785
    iget p2, v9, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 786
    .line 787
    if-gtz p2, :cond_16

    .line 788
    .line 789
    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 790
    .line 791
    .line 792
    :cond_16
    :try_start_2
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 793
    .line 794
    .line 795
    move-result-object p2

    .line 796
    if-nez p2, :cond_17

    .line 797
    .line 798
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalSeqNumber()J

    .line 799
    .line 800
    .line 801
    move-result-wide v1

    .line 802
    goto :goto_6

    .line 803
    :catch_1
    move-exception p2

    .line 804
    goto :goto_8

    .line 805
    :cond_17
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 806
    .line 807
    .line 808
    move-result-object p2

    .line 809
    invoke-interface {p2}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 810
    .line 811
    .line 812
    move-result-wide v1

    .line 813
    :goto_6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalSeqNumber()J

    .line 814
    .line 815
    .line 816
    move-result-wide v8

    .line 817
    cmp-long p2, v1, v8

    .line 818
    .line 819
    if-lez p2, :cond_18

    .line 820
    .line 821
    invoke-direct {p0, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalSequenceNumber(J)V

    .line 822
    .line 823
    .line 824
    goto :goto_7

    .line 825
    :cond_18
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalSeqNumber()J

    .line 826
    .line 827
    .line 828
    move-result-wide v1

    .line 829
    const-wide/16 v8, 0x1

    .line 830
    .line 831
    add-long/2addr v1, v8

    .line 832
    invoke-direct {p0, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalSequenceNumber(J)V

    .line 833
    .line 834
    .line 835
    :goto_7
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 836
    .line 837
    invoke-interface {p2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 838
    .line 839
    .line 840
    move-result p2

    .line 841
    if-eqz p2, :cond_19

    .line 842
    .line 843
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 844
    .line 845
    new-instance v1, Ljava/lang/StringBuilder;

    .line 846
    .line 847
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalSeqNumber()J

    .line 851
    .line 852
    .line 853
    move-result-wide v2

    .line 854
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    :cond_19
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 865
    .line 866
    .line 867
    move-result-object p2

    .line 868
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalSeqNumber()J

    .line 869
    .line 870
    .line 871
    move-result-wide v0

    .line 872
    invoke-interface {p2, v0, v1}, Landroid/javax/sip/header/CSeqHeader;->setSeqNumber(J)V
    :try_end_2
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 873
    .line 874
    .line 875
    goto :goto_9

    .line 876
    :goto_8
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 877
    .line 878
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object p2

    .line 882
    invoke-interface {v0, p2}, Landroid/gov/nist/core/StackLogger;->logFatalError(Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    :goto_9
    :try_start_3
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 886
    .line 887
    invoke-interface {p1, v5}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object p1

    .line 894
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result p1

    .line 898
    if-eqz p1, :cond_1a

    .line 899
    .line 900
    iput-boolean v6, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->byeSent:Z

    .line 901
    .line 902
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isTerminatedOnBye()Z

    .line 903
    .line 904
    .line 905
    move-result p1

    .line 906
    if-eqz p1, :cond_1a

    .line 907
    .line 908
    const/4 p1, 0x3

    .line 909
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 910
    .line 911
    .line 912
    :cond_1a
    return-void

    .line 913
    :catch_2
    move-exception p0

    .line 914
    new-instance p1, Landroid/javax/sip/SipException;

    .line 915
    .line 916
    const-string p2, "error sending message"

    .line 917
    .line 918
    invoke-direct {p1, p2, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 919
    .line 920
    .line 921
    throw p1

    .line 922
    :catch_3
    move-exception p0

    .line 923
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 924
    .line 925
    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 926
    .line 927
    .line 928
    move-result p1

    .line 929
    if-eqz p1, :cond_1b

    .line 930
    .line 931
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 932
    .line 933
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 934
    .line 935
    .line 936
    :cond_1b
    new-instance p1, Landroid/javax/sip/SipException;

    .line 937
    .line 938
    const-string p2, "Could not create message channel"

    .line 939
    .line 940
    invoke-direct {p1, p2, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 941
    .line 942
    .line 943
    throw p1

    .line 944
    :cond_1c
    new-instance p0, Landroid/javax/sip/SipException;

    .line 945
    .line 946
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object p1

    .line 950
    new-instance p2, Ljava/lang/StringBuilder;

    .line 951
    .line 952
    const-string v0, "Bad Request Method. "

    .line 953
    .line 954
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 958
    .line 959
    .line 960
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object p1

    .line 964
    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 965
    .line 966
    .line 967
    throw p0

    .line 968
    :cond_1d
    const-string p0, "null parameter"

    .line 969
    .line 970
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    return-void
.end method

.method public setAckSendingStrategy(Landroid/gov/nist/javax/sip/stack/AckSendingStrategy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSendingStrategy:Landroid/gov/nist/javax/sip/stack/AckSendingStrategy;

    .line 2
    .line 3
    return-void
.end method

.method public setApplicationData(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->applicationData:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public setAssigned()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAssigned:Z

    .line 3
    .line 4
    return-void
.end method

.method public setBackToBackUserAgent()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent:Z

    .line 3
    .line 4
    return-void
.end method

.method public setDialogId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public setEarlyDialogTimeoutSeconds(I)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogTimeout:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Invalid value "

    .line 7
    .line 8
    invoke-static {p1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setEventHeader(Landroid/javax/sip/header/EventHeader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->eventHeader:Landroid/javax/sip/header/EventHeader;

    .line 2
    .line 3
    return-void
.end method

.method public setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    const-string v4, "INVITE"

    .line 8
    .line 9
    const-string v0, "pendingRouteUpdateOn202Response : "

    .line 10
    .line 11
    const-string v5, "transaction = "

    .line 12
    .line 13
    const-string v6, "statusCode = "

    .line 14
    .line 15
    const-string v7, "method = "

    .line 16
    .line 17
    const-string v8, "dialogState = "

    .line 18
    .line 19
    const-string v9, "cseqMethod = "

    .line 20
    .line 21
    const-string v10, "EarlyStateTimerTask craeted "

    .line 22
    .line 23
    const-string v11, "sipDialog: setLastResponse:"

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 26
    .line 27
    .line 28
    move-result-object v12

    .line 29
    iput-object v12, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->callIdHeader:Landroid/javax/sip/header/CallIdHeader;

    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    const/16 v13, 0x64

    .line 36
    .line 37
    const/16 v14, 0x20

    .line 38
    .line 39
    if-ne v12, v13, :cond_0

    .line 40
    .line 41
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 42
    .line 43
    invoke-interface {v0, v14}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2d

    .line 48
    .line 49
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 50
    .line 51
    const-string v1, "Invalid status code - 100 in setLastResponse - ignoring"

    .line 52
    .line 53
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    sget-object v13, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 58
    .line 59
    invoke-interface {v13, v14}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    if-eqz v13, :cond_1

    .line 64
    .line 65
    sget-object v13, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 66
    .line 67
    invoke-interface {v13}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 68
    .line 69
    .line 70
    :cond_1
    :try_start_0
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    iput-object v15, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseStatusCode:Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 77
    .line 78
    .line 79
    move-result-object v15

    .line 80
    invoke-virtual {v15}, Landroid/gov/nist/javax/sip/header/Via;->clone()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v15

    .line 84
    check-cast v15, Landroid/gov/nist/javax/sip/header/Via;

    .line 85
    .line 86
    iput-object v15, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeqHeader()Landroid/javax/sip/header/CSeqHeader;

    .line 89
    .line 90
    .line 91
    move-result-object v15

    .line 92
    invoke-interface {v15}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v15

    .line 96
    iput-object v15, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseMethod:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 99
    .line 100
    .line 101
    move-result-object v16

    .line 102
    invoke-interface/range {v16 .. v16}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 103
    .line 104
    .line 105
    move-result-wide v13

    .line 106
    move-object/from16 v16, v0

    .line 107
    .line 108
    div-int/lit8 v0, v12, 0x64

    .line 109
    .line 110
    move-object/from16 v17, v5

    .line 111
    .line 112
    const/4 v5, 0x1

    .line 113
    if-ne v0, v5, :cond_2

    .line 114
    .line 115
    move v0, v5

    .line 116
    goto :goto_0

    .line 117
    :cond_2
    const/4 v0, 0x0

    .line 118
    :goto_0
    div-int/lit8 v5, v12, 0x64

    .line 119
    .line 120
    move/from16 v18, v0

    .line 121
    .line 122
    const/4 v0, 0x2

    .line 123
    if-ne v5, v0, :cond_3

    .line 124
    .line 125
    const/4 v0, 0x1

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    const/4 v0, 0x0

    .line 128
    :goto_1
    iput-wide v13, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseCSeqNumber:J

    .line 129
    .line 130
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_4

    .line 135
    .line 136
    iput-wide v13, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteResponseCSeqNumber:J

    .line 137
    .line 138
    iput v12, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteResponseCode:I

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :catchall_0
    move-exception v0

    .line 142
    goto/16 :goto_10

    .line 143
    .line 144
    :cond_4
    :goto_2
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    if-eqz v5, :cond_5

    .line 149
    .line 150
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    iput-object v5, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseToTag:Ljava/lang/String;

    .line 155
    .line 156
    :cond_5
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    if-eqz v5, :cond_6

    .line 161
    .line 162
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    iput-object v5, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseFromTag:Ljava/lang/String;

    .line 167
    .line 168
    :cond_6
    if-eqz v2, :cond_7

    .line 169
    .line 170
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isServerTransaction()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-virtual {v3, v5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    iput-object v5, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseDialogId:Ljava/lang/String;

    .line 179
    .line 180
    :cond_7
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setAssigned()V

    .line 181
    .line 182
    .line 183
    sget-object v5, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 184
    .line 185
    move/from16 v19, v0

    .line 186
    .line 187
    const/16 v0, 0x20

    .line 188
    .line 189
    invoke-interface {v5, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_8

    .line 194
    .line 195
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 196
    .line 197
    new-instance v5, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v5, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v11, " lastResponse = "

    .line 206
    .line 207
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    iget-object v11, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseStatusCode:Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v11, " response "

    .line 216
    .line 217
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPResponse;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v11, " topMostViaHeader "

    .line 228
    .line 229
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    iget-object v11, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseTopMostVia:Landroid/gov/nist/javax/sip/header/Via;

    .line 233
    .line 234
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_8
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    sget-object v5, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 249
    .line 250
    if-ne v0, v5, :cond_e

    .line 251
    .line 252
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 253
    .line 254
    const/16 v6, 0x20

    .line 255
    .line 256
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_9

    .line 261
    .line 262
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 263
    .line 264
    const-string v6, "sipDialog: setLastResponse -- dialog is terminated - ignoring "

    .line 265
    .line 266
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    :cond_9
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_a

    .line 274
    .line 275
    const/16 v0, 0xc8

    .line 276
    .line 277
    if-ne v12, v0, :cond_a

    .line 278
    .line 279
    iget-wide v6, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteOkReceived:J

    .line 280
    .line 281
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 282
    .line 283
    .line 284
    move-result-wide v6

    .line 285
    iput-wide v6, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteOkReceived:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    .line 287
    :cond_a
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_2d

    .line 300
    .line 301
    if-eqz v2, :cond_2d

    .line 302
    .line 303
    instance-of v0, v2, Landroid/javax/sip/ClientTransaction;

    .line 304
    .line 305
    if-eqz v0, :cond_2d

    .line 306
    .line 307
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    if-eq v0, v5, :cond_2d

    .line 312
    .line 313
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->acquireTimerTaskSem()V

    .line 314
    .line 315
    .line 316
    :try_start_1
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    sget-object v2, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 321
    .line 322
    iget-object v3, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 323
    .line 324
    if-ne v0, v2, :cond_c

    .line 325
    .line 326
    if-eqz v3, :cond_b

    .line 327
    .line 328
    :try_start_2
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 329
    .line 330
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 335
    .line 336
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 337
    .line 338
    .line 339
    goto :goto_3

    .line 340
    :catchall_1
    move-exception v0

    .line 341
    goto :goto_5

    .line 342
    :cond_b
    :goto_3
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 343
    .line 344
    new-instance v2, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget v3, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogTimeout:I

    .line 350
    .line 351
    mul-int/lit16 v3, v3, 0x3e8

    .line 352
    .line 353
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 364
    .line 365
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 366
    .line 367
    .line 368
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 369
    .line 370
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 371
    .line 372
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    if-eqz v0, :cond_d

    .line 377
    .line 378
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 379
    .line 380
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-eqz v0, :cond_d

    .line 389
    .line 390
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 391
    .line 392
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 397
    .line 398
    iget v3, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogTimeout:I

    .line 399
    .line 400
    mul-int/lit16 v3, v3, 0x3e8

    .line 401
    .line 402
    int-to-long v3, v3

    .line 403
    invoke-interface {v0, v2, v3, v4}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 404
    .line 405
    .line 406
    goto :goto_4

    .line 407
    :cond_c
    if-eqz v3, :cond_d

    .line 408
    .line 409
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 410
    .line 411
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 416
    .line 417
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 418
    .line 419
    .line 420
    const/4 v2, 0x0

    .line 421
    iput-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 422
    .line 423
    :cond_d
    :goto_4
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 424
    .line 425
    .line 426
    return-void

    .line 427
    :goto_5
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 428
    .line 429
    .line 430
    throw v0

    .line 431
    :cond_e
    :try_start_3
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 432
    .line 433
    const/16 v11, 0x20

    .line 434
    .line 435
    invoke-interface {v0, v11}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-eqz v0, :cond_f

    .line 440
    .line 441
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 442
    .line 443
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 444
    .line 445
    .line 446
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 447
    .line 448
    new-instance v11, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    invoke-interface {v0, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 464
    .line 465
    new-instance v9, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    invoke-interface {v0, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 485
    .line 486
    new-instance v8, Ljava/lang/StringBuilder;

    .line 487
    .line 488
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v7

    .line 495
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    invoke-interface {v0, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 506
    .line 507
    new-instance v7, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 523
    .line 524
    new-instance v6, Ljava/lang/StringBuilder;

    .line 525
    .line 526
    move-object/from16 v7, v17

    .line 527
    .line 528
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 539
    .line 540
    .line 541
    :cond_f
    const-string v0, "REFER"

    .line 542
    .line 543
    const-string v6, "NOTIFY"

    .line 544
    .line 545
    const-string v7, "BYE"

    .line 546
    .line 547
    const/4 v8, 0x3

    .line 548
    const-string v9, "SUBSCRIBE"

    .line 549
    .line 550
    if-eqz v2, :cond_19

    .line 551
    .line 552
    :try_start_4
    instance-of v11, v2, Landroid/javax/sip/ClientTransaction;

    .line 553
    .line 554
    if-eqz v11, :cond_10

    .line 555
    .line 556
    goto/16 :goto_9

    .line 557
    .line 558
    :cond_10
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v5

    .line 562
    if-eqz v5, :cond_11

    .line 563
    .line 564
    if-eqz v19, :cond_11

    .line 565
    .line 566
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isTerminatedOnBye()Z

    .line 567
    .line 568
    .line 569
    move-result v5

    .line 570
    if-eqz v5, :cond_11

    .line 571
    .line 572
    invoke-virtual {v1, v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_c

    .line 576
    .line 577
    :cond_11
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v5

    .line 581
    if-nez v5, :cond_12

    .line 582
    .line 583
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    invoke-interface {v5}, Landroid/javax/sip/header/ToHeader;->getTag()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    if-eqz v5, :cond_12

    .line 592
    .line 593
    invoke-static {v15}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    if-eqz v5, :cond_12

    .line 598
    .line 599
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v5

    .line 607
    if-eqz v5, :cond_12

    .line 608
    .line 609
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 610
    .line 611
    .line 612
    move-result-object v5

    .line 613
    invoke-interface {v5}, Landroid/javax/sip/header/ToHeader;->getTag()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v5

    .line 617
    invoke-virtual {v1, v5}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLocalTag(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    const/4 v5, 0x1

    .line 621
    goto :goto_6

    .line 622
    :cond_12
    const/4 v5, 0x0

    .line 623
    :goto_6
    if-nez v19, :cond_16

    .line 624
    .line 625
    if-eqz v18, :cond_13

    .line 626
    .line 627
    if-eqz v5, :cond_29

    .line 628
    .line 629
    const/4 v0, 0x0

    .line 630
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 631
    .line 632
    .line 633
    const/4 v0, 0x1

    .line 634
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setDialogId(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 642
    .line 643
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 644
    .line 645
    .line 646
    goto/16 :goto_c

    .line 647
    .line 648
    :cond_13
    const/16 v0, 0x1e9

    .line 649
    .line 650
    if-ne v12, v0, :cond_15

    .line 651
    .line 652
    invoke-virtual {v15, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-nez v0, :cond_14

    .line 657
    .line 658
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-eqz v0, :cond_15

    .line 663
    .line 664
    :cond_14
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 665
    .line 666
    const/16 v6, 0x20

    .line 667
    .line 668
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    if-eqz v0, :cond_29

    .line 673
    .line 674
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 675
    .line 676
    const-string v5, "RFC 3265 : Not setting dialog to TERMINATED for 489"

    .line 677
    .line 678
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    goto/16 :goto_c

    .line 682
    .line 683
    :cond_15
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isReInvite()Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    if-nez v0, :cond_29

    .line 688
    .line 689
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    sget-object v5, Landroid/javax/sip/DialogState;->CONFIRMED:Landroid/javax/sip/DialogState;

    .line 694
    .line 695
    if-eq v0, v5, :cond_29

    .line 696
    .line 697
    invoke-virtual {v1, v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 698
    .line 699
    .line 700
    goto/16 :goto_c

    .line 701
    .line 702
    :cond_16
    iget v6, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogState:I

    .line 703
    .line 704
    if-gtz v6, :cond_18

    .line 705
    .line 706
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    move-result v6

    .line 710
    if-nez v6, :cond_17

    .line 711
    .line 712
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v6

    .line 716
    if-nez v6, :cond_17

    .line 717
    .line 718
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v0

    .line 722
    if-eqz v0, :cond_18

    .line 723
    .line 724
    :cond_17
    const/4 v0, 0x1

    .line 725
    goto :goto_7

    .line 726
    :cond_18
    const/4 v0, 0x1

    .line 727
    goto :goto_8

    .line 728
    :goto_7
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 729
    .line 730
    .line 731
    :goto_8
    if-eqz v5, :cond_29

    .line 732
    .line 733
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setDialogId(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 741
    .line 742
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 743
    .line 744
    .line 745
    goto/16 :goto_c

    .line 746
    .line 747
    :cond_19
    :goto_9
    invoke-static {v15}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 748
    .line 749
    .line 750
    move-result v11

    .line 751
    if-eqz v11, :cond_26

    .line 752
    .line 753
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    if-nez v0, :cond_1b

    .line 758
    .line 759
    if-eqz v18, :cond_1b

    .line 760
    .line 761
    const/4 v0, 0x0

    .line 762
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    if-nez v0, :cond_1a

    .line 770
    .line 771
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 772
    .line 773
    iget-boolean v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->rfc2543Supported:Z

    .line 774
    .line 775
    if-eqz v0, :cond_25

    .line 776
    .line 777
    :cond_1a
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    if-nez v0, :cond_25

    .line 782
    .line 783
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTag(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    const/4 v0, 0x0

    .line 791
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setDialogId(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 799
    .line 800
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 801
    .line 802
    .line 803
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 804
    .line 805
    .line 806
    goto/16 :goto_a

    .line 807
    .line 808
    :cond_1b
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    if-eqz v0, :cond_1d

    .line 813
    .line 814
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    sget-object v6, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;

    .line 819
    .line 820
    invoke-virtual {v0, v6}, Landroid/javax/sip/DialogState;->equals(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v0

    .line 824
    if-eqz v0, :cond_1d

    .line 825
    .line 826
    if-eqz v18, :cond_1d

    .line 827
    .line 828
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    move-result v0

    .line 836
    if-eqz v0, :cond_25

    .line 837
    .line 838
    if-eqz v2, :cond_25

    .line 839
    .line 840
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    if-nez v0, :cond_1c

    .line 845
    .line 846
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 847
    .line 848
    iget-boolean v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->rfc2543Supported:Z

    .line 849
    .line 850
    if-eqz v0, :cond_25

    .line 851
    .line 852
    :cond_1c
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTag(Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    const/4 v0, 0x0

    .line 860
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setDialogId(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 868
    .line 869
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 870
    .line 871
    .line 872
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 873
    .line 874
    .line 875
    goto/16 :goto_a

    .line 876
    .line 877
    :cond_1d
    if-eqz v19, :cond_23

    .line 878
    .line 879
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 880
    .line 881
    const/16 v6, 0x20

    .line 882
    .line 883
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 884
    .line 885
    .line 886
    move-result v0

    .line 887
    if-eqz v0, :cond_1e

    .line 888
    .line 889
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 890
    .line 891
    new-instance v6, Ljava/lang/StringBuilder;

    .line 892
    .line 893
    move-object/from16 v7, v16

    .line 894
    .line 895
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    iget-boolean v7, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->pendingRouteUpdateOn202Response:Z

    .line 899
    .line 900
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v6

    .line 907
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    :cond_1e
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    move-result v0

    .line 918
    if-eqz v0, :cond_22

    .line 919
    .line 920
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    if-nez v0, :cond_1f

    .line 925
    .line 926
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 927
    .line 928
    iget-boolean v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->rfc2543Supported:Z

    .line 929
    .line 930
    if-eqz v0, :cond_22

    .line 931
    .line 932
    :cond_1f
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    sget-object v6, Landroid/javax/sip/DialogState;->CONFIRMED:Landroid/javax/sip/DialogState;

    .line 937
    .line 938
    if-ne v0, v6, :cond_20

    .line 939
    .line 940
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    if-ne v0, v6, :cond_22

    .line 945
    .line 946
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 947
    .line 948
    .line 949
    move-result v0

    .line 950
    if-eqz v0, :cond_22

    .line 951
    .line 952
    iget-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->pendingRouteUpdateOn202Response:Z

    .line 953
    .line 954
    if-eqz v0, :cond_22

    .line 955
    .line 956
    if-eqz v19, :cond_22

    .line 957
    .line 958
    :cond_20
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    if-eq v0, v6, :cond_21

    .line 963
    .line 964
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTag(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    const/4 v0, 0x0

    .line 972
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v6

    .line 976
    invoke-virtual {v1, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setDialogId(Ljava/lang/String;)V

    .line 977
    .line 978
    .line 979
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 980
    .line 981
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 982
    .line 983
    .line 984
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 985
    .line 986
    .line 987
    const/4 v0, 0x1

    .line 988
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 989
    .line 990
    .line 991
    :cond_21
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    move-result v0

    .line 995
    if-eqz v0, :cond_22

    .line 996
    .line 997
    if-eqz v19, :cond_22

    .line 998
    .line 999
    iget-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->pendingRouteUpdateOn202Response:Z

    .line 1000
    .line 1001
    if-eqz v0, :cond_22

    .line 1002
    .line 1003
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTag(Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 1011
    .line 1012
    .line 1013
    const/4 v0, 0x0

    .line 1014
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->pendingRouteUpdateOn202Response:Z

    .line 1015
    .line 1016
    :cond_22
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1017
    .line 1018
    .line 1019
    move-result v0

    .line 1020
    if-eqz v0, :cond_25

    .line 1021
    .line 1022
    iget-wide v6, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteOkReceived:J

    .line 1023
    .line 1024
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 1025
    .line 1026
    .line 1027
    move-result-wide v6

    .line 1028
    iput-wide v6, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastInviteOkReceived:J

    .line 1029
    .line 1030
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    if-eqz v0, :cond_25

    .line 1035
    .line 1036
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-virtual {v0}, Landroid/javax/sip/DialogState;->getValue()I

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    const/4 v6, 0x1

    .line 1045
    if-ne v0, v6, :cond_25

    .line 1046
    .line 1047
    if-eqz v2, :cond_25

    .line 1048
    .line 1049
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->doTargetRefresh(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 1050
    .line 1051
    .line 1052
    goto :goto_a

    .line 1053
    :cond_23
    const/16 v0, 0x12c

    .line 1054
    .line 1055
    if-lt v12, v0, :cond_25

    .line 1056
    .line 1057
    const/16 v0, 0x2bb

    .line 1058
    .line 1059
    if-gt v12, v0, :cond_25

    .line 1060
    .line 1061
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    if-eqz v0, :cond_24

    .line 1066
    .line 1067
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v0

    .line 1075
    if-eqz v0, :cond_25

    .line 1076
    .line 1077
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    invoke-virtual {v0}, Landroid/javax/sip/DialogState;->getValue()I

    .line 1082
    .line 1083
    .line 1084
    move-result v0

    .line 1085
    if-nez v0, :cond_25

    .line 1086
    .line 1087
    :cond_24
    invoke-virtual {v1, v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 1088
    .line 1089
    .line 1090
    :cond_25
    :goto_a
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v0

    .line 1094
    sget-object v6, Landroid/javax/sip/DialogState;->CONFIRMED:Landroid/javax/sip/DialogState;

    .line 1095
    .line 1096
    if-eq v0, v6, :cond_29

    .line 1097
    .line 1098
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    if-eq v0, v5, :cond_29

    .line 1103
    .line 1104
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getOriginalRequestRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    if-eqz v0, :cond_29

    .line 1109
    .line 1110
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getOriginalRequestRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getOriginalRequestRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v5

    .line 1118
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->size()I

    .line 1119
    .line 1120
    .line 1121
    move-result v5

    .line 1122
    invoke-virtual {v0, v5}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->listIterator(I)Ljava/util/ListIterator;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    :goto_b
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v5

    .line 1130
    if-eqz v5, :cond_29

    .line 1131
    .line 1132
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v5

    .line 1136
    check-cast v5, Landroid/gov/nist/javax/sip/header/RecordRoute;

    .line 1137
    .line 1138
    iget-object v6, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 1139
    .line 1140
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v6

    .line 1144
    check-cast v6, Landroid/gov/nist/javax/sip/header/Route;

    .line 1145
    .line 1146
    if-eqz v6, :cond_29

    .line 1147
    .line 1148
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v5

    .line 1152
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v6

    .line 1156
    invoke-interface {v5, v6}, Landroid/javax/sip/address/Address;->equals(Ljava/lang/Object;)Z

    .line 1157
    .line 1158
    .line 1159
    move-result v5

    .line 1160
    if-eqz v5, :cond_29

    .line 1161
    .line 1162
    iget-object v5, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 1163
    .line 1164
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->removeFirst()V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_b

    .line 1168
    :cond_26
    invoke-virtual {v15, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1169
    .line 1170
    .line 1171
    move-result v5

    .line 1172
    if-eqz v5, :cond_28

    .line 1173
    .line 1174
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v5

    .line 1178
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v5

    .line 1182
    if-nez v5, :cond_27

    .line 1183
    .line 1184
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v5

    .line 1188
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1189
    .line 1190
    .line 1191
    move-result v0

    .line 1192
    if-eqz v0, :cond_28

    .line 1193
    .line 1194
    :cond_27
    if-eqz v19, :cond_28

    .line 1195
    .line 1196
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    if-nez v0, :cond_28

    .line 1201
    .line 1202
    const/4 v0, 0x1

    .line 1203
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v5

    .line 1207
    invoke-virtual {v1, v5}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setDialogId(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    iget-object v5, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1211
    .line 1212
    invoke-virtual {v5, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 1216
    .line 1217
    .line 1218
    goto :goto_c

    .line 1219
    :cond_28
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v0

    .line 1223
    if-eqz v0, :cond_29

    .line 1224
    .line 1225
    if-eqz v19, :cond_29

    .line 1226
    .line 1227
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isTerminatedOnBye()Z

    .line 1228
    .line 1229
    .line 1230
    move-result v0

    .line 1231
    if-eqz v0, :cond_29

    .line 1232
    .line 1233
    invoke-virtual {v1, v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1234
    .line 1235
    .line 1236
    :cond_29
    :goto_c
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1245
    .line 1246
    .line 1247
    move-result v0

    .line 1248
    if-eqz v0, :cond_2d

    .line 1249
    .line 1250
    if-eqz v2, :cond_2d

    .line 1251
    .line 1252
    instance-of v0, v2, Landroid/javax/sip/ClientTransaction;

    .line 1253
    .line 1254
    if-eqz v0, :cond_2d

    .line 1255
    .line 1256
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    sget-object v2, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 1261
    .line 1262
    if-eq v0, v2, :cond_2d

    .line 1263
    .line 1264
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->acquireTimerTaskSem()V

    .line 1265
    .line 1266
    .line 1267
    :try_start_5
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v0

    .line 1271
    sget-object v2, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1272
    .line 1273
    iget-object v3, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1274
    .line 1275
    if-ne v0, v2, :cond_2b

    .line 1276
    .line 1277
    if-eqz v3, :cond_2a

    .line 1278
    .line 1279
    :try_start_6
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1280
    .line 1281
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1286
    .line 1287
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 1288
    .line 1289
    .line 1290
    goto :goto_d

    .line 1291
    :catchall_2
    move-exception v0

    .line 1292
    goto :goto_f

    .line 1293
    :cond_2a
    :goto_d
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1294
    .line 1295
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1296
    .line 1297
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1301
    .line 1302
    .line 1303
    iget v3, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogTimeout:I

    .line 1304
    .line 1305
    mul-int/lit16 v3, v3, 0x3e8

    .line 1306
    .line 1307
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v2

    .line 1314
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 1315
    .line 1316
    .line 1317
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1318
    .line 1319
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 1320
    .line 1321
    .line 1322
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1323
    .line 1324
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1325
    .line 1326
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v0

    .line 1330
    if-eqz v0, :cond_2c

    .line 1331
    .line 1332
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1333
    .line 1334
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 1339
    .line 1340
    .line 1341
    move-result v0

    .line 1342
    if-eqz v0, :cond_2c

    .line 1343
    .line 1344
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1345
    .line 1346
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v0

    .line 1350
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1351
    .line 1352
    iget v3, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogTimeout:I

    .line 1353
    .line 1354
    mul-int/lit16 v3, v3, 0x3e8

    .line 1355
    .line 1356
    int-to-long v3, v3

    .line 1357
    invoke-interface {v0, v2, v3, v4}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 1358
    .line 1359
    .line 1360
    goto :goto_e

    .line 1361
    :cond_2b
    if-eqz v3, :cond_2c

    .line 1362
    .line 1363
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1364
    .line 1365
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v0

    .line 1369
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1370
    .line 1371
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 1372
    .line 1373
    .line 1374
    const/4 v2, 0x0

    .line 1375
    iput-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1376
    .line 1377
    :cond_2c
    :goto_e
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 1378
    .line 1379
    .line 1380
    return-void

    .line 1381
    :goto_f
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 1382
    .line 1383
    .line 1384
    throw v0

    .line 1385
    :cond_2d
    return-void

    .line 1386
    :goto_10
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v3

    .line 1390
    invoke-interface {v3}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v3

    .line 1394
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1395
    .line 1396
    .line 1397
    move-result v3

    .line 1398
    if-eqz v3, :cond_31

    .line 1399
    .line 1400
    if-eqz v2, :cond_31

    .line 1401
    .line 1402
    instance-of v2, v2, Landroid/javax/sip/ClientTransaction;

    .line 1403
    .line 1404
    if-eqz v2, :cond_31

    .line 1405
    .line 1406
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v2

    .line 1410
    sget-object v3, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 1411
    .line 1412
    if-eq v2, v3, :cond_31

    .line 1413
    .line 1414
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->acquireTimerTaskSem()V

    .line 1415
    .line 1416
    .line 1417
    :try_start_7
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v2

    .line 1421
    sget-object v3, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1422
    .line 1423
    iget-object v4, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1424
    .line 1425
    if-ne v2, v3, :cond_2f

    .line 1426
    .line 1427
    if-eqz v4, :cond_2e

    .line 1428
    .line 1429
    :try_start_8
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1430
    .line 1431
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v2

    .line 1435
    iget-object v3, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1436
    .line 1437
    invoke-interface {v2, v3}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 1438
    .line 1439
    .line 1440
    goto :goto_11

    .line 1441
    :catchall_3
    move-exception v0

    .line 1442
    goto :goto_13

    .line 1443
    :cond_2e
    :goto_11
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1444
    .line 1445
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1446
    .line 1447
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1451
    .line 1452
    .line 1453
    iget v4, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogTimeout:I

    .line 1454
    .line 1455
    mul-int/lit16 v4, v4, 0x3e8

    .line 1456
    .line 1457
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v3

    .line 1464
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 1465
    .line 1466
    .line 1467
    new-instance v2, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1468
    .line 1469
    invoke-direct {v2, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 1470
    .line 1471
    .line 1472
    iput-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1473
    .line 1474
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1475
    .line 1476
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v2

    .line 1480
    if-eqz v2, :cond_30

    .line 1481
    .line 1482
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1483
    .line 1484
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v2

    .line 1488
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 1489
    .line 1490
    .line 1491
    move-result v2

    .line 1492
    if-eqz v2, :cond_30

    .line 1493
    .line 1494
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1495
    .line 1496
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v2

    .line 1500
    iget-object v3, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1501
    .line 1502
    iget v4, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyDialogTimeout:I

    .line 1503
    .line 1504
    mul-int/lit16 v4, v4, 0x3e8

    .line 1505
    .line 1506
    int-to-long v4, v4

    .line 1507
    invoke-interface {v2, v3, v4, v5}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 1508
    .line 1509
    .line 1510
    goto :goto_12

    .line 1511
    :cond_2f
    if-eqz v4, :cond_30

    .line 1512
    .line 1513
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 1514
    .line 1515
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v2

    .line 1519
    iget-object v3, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 1520
    .line 1521
    invoke-interface {v2, v3}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 1522
    .line 1523
    .line 1524
    const/4 v2, 0x0

    .line 1525
    iput-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 1526
    .line 1527
    :cond_30
    :goto_12
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 1528
    .line 1529
    .line 1530
    goto :goto_14

    .line 1531
    :goto_13
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 1532
    .line 1533
    .line 1534
    throw v0

    .line 1535
    :cond_31
    :goto_14
    throw v0
.end method

.method public setLocalParty(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isServer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localParty:Landroid/javax/sip/address/Address;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->localParty:Landroid/javax/sip/address/Address;

    .line 27
    .line 28
    return-void
.end method

.method public setLocalTag(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "set Local tag "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, " dialog = "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 41
    .line 42
    .line 43
    :cond_0
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->myTag:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public setOriginalDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->originalDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    return-void
.end method

.method public setPendingRouteUpdateOn202Response(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->pendingRouteUpdateOn202Response:Z

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromHeader()Landroid/javax/sip/header/FromHeader;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRemoteTag(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setReInviteFlag(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->reInviteFlag:Z

    .line 2
    .line 3
    return-void
.end method

.method public setReleaseReferencesStrategy(Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseReferencesStrategy:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2
    .line 3
    return-void
.end method

.method public setRemoteParty(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isServer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 27
    .line 28
    :goto_0
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 29
    .line 30
    const/16 v0, 0x20

    .line 31
    .line 32
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "settingRemoteParty "

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteParty:Landroid/javax/sip/address/Address;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public setRemoteSequenceNumber(J)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "setRemoteSeqno "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "/"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteSequenceNumber:J

    .line 39
    .line 40
    return-void
.end method

.method public setRemoteTag(Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "setRemoteTag(): "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v3, " remoteTag = "

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->hisTag:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, " new tag = "

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->hisTag:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v2, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;

    .line 65
    .line 66
    if-eq v0, v2, :cond_1

    .line 67
    .line 68
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 69
    .line 70
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_7

    .line 75
    .line 76
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 77
    .line 78
    const-string p1, "Dialog is already established -- ignoring remote tag re-assignment"

    .line 79
    .line 80
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isRemoteTagReassignmentAllowed()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 93
    .line 94
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 101
    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v3, "UNSAFE OPERATION !  tag re-assignment "

    .line 105
    .line 106
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->hisTag:Ljava/lang/String;

    .line 110
    .line 111
    const-string v4, " trying to set to "

    .line 112
    .line 113
    const-string v5, " can cause unexpected effects "

    .line 114
    .line 115
    invoke-static {v2, v3, v4, p1, v5}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 123
    .line 124
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-ne v0, p0, :cond_3

    .line 131
    .line 132
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 133
    .line 134
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeDialog(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const/4 v0, 0x1

    .line 140
    goto :goto_0

    .line 141
    :cond_3
    const/4 v0, 0x0

    .line 142
    :goto_0
    const/4 v2, 0x0

    .line 143
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogId:Ljava/lang/String;

    .line 144
    .line 145
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->hisTag:Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v0, :cond_7

    .line 148
    .line 149
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 150
    .line 151
    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_4

    .line 156
    .line 157
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 158
    .line 159
    const-string v0, "ReInserting Dialog"

    .line 160
    .line 161
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_4
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 165
    .line 166
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_5
    if-eqz p1, :cond_6

    .line 171
    .line 172
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->hisTag:Ljava/lang/String;

    .line 173
    .line 174
    return-void

    .line 175
    :cond_6
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 176
    .line 177
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-eqz p0, :cond_7

    .line 182
    .line 183
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 184
    .line 185
    const-string p1, "setRemoteTag : called with null argument "

    .line 186
    .line 187
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_7
    return-void
.end method

.method public setRemoteTarget(Landroid/javax/sip/header/ContactHeader;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTarget:Landroid/javax/sip/address/Address;

    .line 6
    .line 7
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "Dialog.setRemoteTarget: "

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->remoteTarget:Landroid/javax/sip/address/Address;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public setResponseTags(Landroid/gov/nist/javax/sip/message/SIPResponse;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setToTag(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setToTag(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 57
    .line 58
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 65
    .line 66
    const-string p1, "No from tag in response! Not RFC 3261 compatible."

    .line 67
    .line 68
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_0
    return-void
.end method

.method public setRetransmissionTicks()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->retransmissionTicksLeft:I

    .line 3
    .line 4
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->prevRetransmissionTicks:I

    .line 5
    .line 6
    return-void
.end method

.method public setRouteList(Landroid/gov/nist/javax/sip/header/RouteList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->routeList:Landroid/gov/nist/javax/sip/header/RouteList;

    .line 2
    .line 3
    return-void
.end method

.method public setServerTransactionFlag(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->serverTransactionFlag:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSipProvider(Landroid/gov/nist/javax/sip/SipProviderImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 2
    .line 3
    return-void
.end method

.method public setStack(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    return-void
.end method

.method public setState(I)V
    .locals 4

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "SIPDialog::setState:Setting dialog state for "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "newState = "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 41
    .line 42
    .line 43
    const/4 v0, -0x1

    .line 44
    if-eq p1, v0, :cond_0

    .line 45
    .line 46
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogState:I

    .line 47
    .line 48
    if-eq p1, v0, :cond_0

    .line 49
    .line 50
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 51
    .line 52
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "SIPDialog::setState:"

    .line 63
    .line 64
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v3, "  old dialog state is "

    .line 71
    .line 72
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 90
    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v2, "  New dialog state is "

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Landroid/javax/sip/DialogState;->getObject(I)Landroid/javax/sip/DialogState;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_0
    if-nez p1, :cond_1

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addEventListener(Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;)V

    .line 125
    .line 126
    .line 127
    :cond_1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogState:I

    .line 128
    .line 129
    const/4 v0, 0x3

    .line 130
    if-ne p1, v0, :cond_4

    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->removeEventListener(Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-eqz p1, :cond_3

    .line 146
    .line 147
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_3

    .line 158
    .line 159
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 160
    .line 161
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getConnectionLingerTimer()I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-lez p1, :cond_2

    .line 166
    .line 167
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$LingerTimer;

    .line 174
    .line 175
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog$LingerTimer;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 176
    .line 177
    .line 178
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 179
    .line 180
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getConnectionLingerTimer()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    mul-int/lit16 v1, v1, 0x3e8

    .line 185
    .line 186
    int-to-long v1, v1

    .line 187
    invoke-interface {p1, v0, v1, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_2
    new-instance p1, Landroid/gov/nist/javax/sip/stack/SIPDialog$LingerTimer;

    .line 192
    .line 193
    invoke-direct {p1, p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog$LingerTimer;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog$LingerTimer;->runTask()V

    .line 197
    .line 198
    .line 199
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->stopTimer()V

    .line 200
    .line 201
    .line 202
    :cond_4
    return-void
.end method

.method public startRetransmitTimer(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;Landroid/javax/sip/message/Response;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "startRetransmitTimer() "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " method "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-interface {p2}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    div-int/lit8 p2, p2, 0x64

    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    if-ne p2, v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->startTimer(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
.end method

.method public startTimer(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->transaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 8
    .line 9
    if-ne v0, p1, :cond_1

    .line 10
    .line 11
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v1, "Timer already running for "

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :cond_1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 44
    .line 45
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v2, "Starting dialog timer for "

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->acquireTimerTaskSem()V

    .line 75
    .line 76
    .line 77
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    iput-object p1, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->transaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object p1, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 88
    .line 89
    invoke-direct {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 93
    .line 94
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 121
    .line 122
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getBaseTimerInterval()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    int-to-long v3, v0

    .line 127
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getBaseTimerInterval()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    int-to-long v5, p1

    .line 132
    invoke-interface/range {v1 .. v6}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->scheduleWithFixedDelay(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;JJ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    .line 134
    .line 135
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRetransmissionTicks()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :goto_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 143
    .line 144
    .line 145
    throw p1
.end method

.method public stopTimer()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->acquireTimerTaskSem()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    :try_start_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 18
    .line 19
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->timerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;

    .line 40
    .line 41
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->earlyStateTimerTask:Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :goto_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseTimerTaskSem()V

    .line 51
    .line 52
    .line 53
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 54
    :catch_0
    return-void
.end method

.method public storeFirstTransactionInfo(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionSeen:Z

    .line 3
    .line 4
    iput-object p2, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 5
    .line 6
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isServerTransaction()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput-boolean v0, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionIsServerTransaction:Z

    .line 11
    .line 12
    const-string v1, "sips"

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Landroid/javax/sip/message/Request;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Landroid/javax/sip/address/URI;->getScheme()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput-boolean v0, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionSecure:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, p2

    .line 36
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 37
    .line 38
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getOriginalRequestScheme()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput-boolean v0, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionSecure:Z

    .line 47
    .line 48
    :goto_0
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getPort()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionPort:I

    .line 53
    .line 54
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getBranchId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionId:Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionMethod:Ljava/lang/String;

    .line 65
    .line 66
    instance-of v1, p2, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    const-string v1, "INVITE"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 79
    .line 80
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionMergeId:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeMergeDialog(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMergeId()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionMergeId:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 92
    .line 93
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putMergeDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isServerTransaction()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 103
    .line 104
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getLastResponse()Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    if-eqz p2, :cond_2

    .line 109
    .line 110
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeader()Landroid/gov/nist/javax/sip/header/Contact;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    goto :goto_1

    .line 115
    :cond_2
    const/4 p2, 0x0

    .line 116
    :goto_1
    iput-object p2, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeader:Landroid/gov/nist/javax/sip/header/Contact;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 120
    .line 121
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getOriginalRequestContact()Landroid/gov/nist/javax/sip/header/Contact;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    iput-object p2, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->contactHeader:Landroid/gov/nist/javax/sip/header/Contact;

    .line 126
    .line 127
    :goto_2
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 128
    .line 129
    const/16 v0, 0x20

    .line 130
    .line 131
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-eqz p2, :cond_4

    .line 136
    .line 137
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 138
    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v1, "firstTransaction = "

    .line 142
    .line 143
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 147
    .line 148
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-interface {p2, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 159
    .line 160
    new-instance p2, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v0, "firstTransactionIsServerTransaction = "

    .line 163
    .line 164
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionIsServerTransaction:Z

    .line 168
    .line 169
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 180
    .line 181
    new-instance p2, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string v0, "firstTransactionSecure = "

    .line 184
    .line 185
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionSecure:Z

    .line 189
    .line 190
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 201
    .line 202
    new-instance p2, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    const-string v0, "firstTransactionPort = "

    .line 205
    .line 206
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionPort:I

    .line 210
    .line 211
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 222
    .line 223
    new-instance p2, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v0, "firstTransactionId = "

    .line 226
    .line 227
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionId:Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 243
    .line 244
    new-instance p2, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v0, "firstTransactionMethod = "

    .line 247
    .line 248
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionMethod:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 264
    .line 265
    new-instance p2, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    const-string v0, "firstTransactionMergeId = "

    .line 268
    .line 269
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->firstTransactionMergeId:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :cond_4
    return-void
.end method

.method public takeAckSem()Z
    .locals 8

    .line 1
    const-string v0, "Semaphore previously acquired at "

    .line 2
    .line 3
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v3, " sem="

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    new-instance v4, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v5, "[takeAckSem "

    .line 20
    .line 21
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 43
    :try_start_0
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 44
    .line 45
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 46
    .line 47
    const-wide/16 v6, 0x2

    .line 48
    .line 49
    invoke-virtual {v4, v6, v7, v5}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 56
    .line 57
    invoke-interface {v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 64
    .line 65
    const-string v5, "Cannot aquire ACK semaphore "

    .line 66
    .line 67
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 71
    .line 72
    invoke-interface {v4, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 79
    .line 80
    new-instance v4, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->stackTrace:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackSem:Ljava/util/concurrent/Semaphore;

    .line 94
    .line 95
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-interface {v2, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 106
    .line 107
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 108
    .line 109
    .line 110
    :cond_2
    return v1

    .line 111
    :cond_3
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 112
    .line 113
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->recordStackTrace()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    .line 122
    :cond_4
    const/4 p0, 0x1

    .line 123
    return p0

    .line 124
    :catch_0
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->logger:Landroid/gov/nist/core/StackLogger;

    .line 125
    .line 126
    const-string v0, "Cannot aquire ACK semaphore"

    .line 127
    .line 128
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return v1
.end method

.method public terminateOnBye(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->terminateOnBye:Z

    .line 2
    .line 3
    return-void
.end method

.method public declared-synchronized testAndSetIsDialogTerminatedEventDelivered()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogTerminatedEventDelivered:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->dialogTerminatedEventDelivered:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
.end method

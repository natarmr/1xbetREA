.class public Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;
.super Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;,
        Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$TransactionTimer;
    }
.end annotation


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private callingStateTimeoutCount:I

.field private defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

.field private defaultDialogId:Ljava/lang/String;

.field private lastRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

.field private nextHop:Landroid/javax/sip/address/Hop;

.field private notifyOnRetransmit:Z

.field private originalRequestCallId:Ljava/lang/String;

.field private originalRequestContact:Landroid/gov/nist/javax/sip/header/Contact;

.field private originalRequestEventHeader:Landroid/gov/nist/javax/sip/header/Event;

.field private originalRequestFromTag:Ljava/lang/String;

.field private originalRequestScheme:Ljava/lang/String;

.field private transient respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

.field private responsesReceived:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private sipDialogs:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private terminateDialogOnCleanUp:Z

.field private timeoutIfStillInCallingState:Z

.field private timerKStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private transient transactionTimer:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

.field private transactionTimerCancelled:Z

.field private transient transactionTimerLock:Ljava/lang/Object;

.field private viaHost:Ljava/lang/String;

.field private viaPort:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimerLock:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->timerKStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimerCancelled:Z

    .line 20
    .line 21
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->responsesReceived:Ljava/util/Set;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->terminateDialogOnCleanUp:Z

    .line 30
    .line 31
    invoke-static {}, Landroid/gov/nist/javax/sip/Utils;->getInstance()Landroid/gov/nist/javax/sip/Utils;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/Utils;->generateBranchId()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->setBranch(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->setEncapsulatedChannel(Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 43
    .line 44
    .line 45
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->notifyOnRetransmit:Z

    .line 46
    .line 47
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->timeoutIfStillInCallingState:Z

    .line 48
    .line 49
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 50
    .line 51
    const/16 p2, 0x20

    .line 52
    .line 53
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 60
    .line 61
    new-instance p2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v0, "Creating clientTransaction "

    .line 64
    .line 65
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 79
    .line 80
    invoke-interface {p1}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 81
    .line 82
    .line 83
    :cond_0
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->sipDialogs:Ljava/util/Set;

    .line 89
    .line 90
    return-void
.end method

.method public static synthetic access$000()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method

.method private final createErrorAck()Landroid/javax/sip/message/Request;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v3, 0xc8

    .line 23
    .line 24
    if-ge v1, v3, :cond_1

    .line 25
    .line 26
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "lastResponse = "

    .line 41
    .line 42
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 46
    .line 47
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    const-string p0, "Cannot ACK a provisional response!"

    .line 58
    .line 59
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Landroid/gov/nist/javax/sip/header/To;

    .line 70
    .line 71
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createErrorAck(Landroid/gov/nist/javax/sip/header/To;)Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_2
    const-string p0, "bad Transaction state"

    .line 77
    .line 78
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_3
    const-string p0, "Can only ACK an INVITE!"

    .line 83
    .line 84
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    :cond_4
    new-instance v0, Landroid/javax/sip/SipException;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v2, "bad state "

    .line 97
    .line 98
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-direct {v0, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0
.end method

.method private inviteClientTransaction(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/16 v2, 0x12c

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    if-ne v3, v0, :cond_c

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v3}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    invoke-virtual {p3, v3, v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSent(J)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastAckSentCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v3}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-interface {v5}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    cmp-long v3, v3, v5

    .line 49
    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastAckSentFromTag()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v1, v0

    .line 68
    :goto_0
    const/16 v3, 0x20

    .line 69
    .line 70
    if-eqz p3, :cond_2

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    :try_start_0
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 93
    .line 94
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 101
    .line 102
    const-string v4, "resending ACK"

    .line 103
    .line 104
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_1
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->resendAck()V
    :try_end_0
    .catch Landroid/javax/sip/SipException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    :catch_0
    :cond_2
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 111
    .line 112
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    if-eqz p3, :cond_3

    .line 119
    .line 120
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 121
    .line 122
    new-instance v4, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v5, "Dialog "

    .line 125
    .line 126
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v5, " current state "

    .line 133
    .line 134
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

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
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_3
    const-string v1, "passing 2xx response up to the application"

    .line 152
    .line 153
    const-string v4, " branch id "

    .line 154
    .line 155
    const-string v5, "Client Transaction "

    .line 156
    .line 157
    const/16 v6, 0xc8

    .line 158
    .line 159
    if-nez p3, :cond_7

    .line 160
    .line 161
    if-lt p2, v6, :cond_7

    .line 162
    .line 163
    if-ge p2, v2, :cond_7

    .line 164
    .line 165
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 166
    .line 167
    invoke-interface {p2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    if-eqz p2, :cond_4

    .line 172
    .line 173
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 174
    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v2, " doesn\'t have any dialog and is in TERMINATED state"

    .line 194
    .line 195
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :cond_4
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 206
    .line 207
    if-eqz p2, :cond_6

    .line 208
    .line 209
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 210
    .line 211
    invoke-interface {p2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-eqz p2, :cond_5

    .line 216
    .line 217
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 218
    .line 219
    invoke-interface {p2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    :cond_5
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 223
    .line 224
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 225
    .line 226
    invoke-interface {p2, p1, p0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_7

    .line 230
    .line 231
    :cond_6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_7
    if-eqz p3, :cond_b

    .line 236
    .line 237
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    sget-object v8, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;

    .line 242
    .line 243
    if-ne v7, v8, :cond_b

    .line 244
    .line 245
    if-lt p2, v6, :cond_b

    .line 246
    .line 247
    if-ge p2, v2, :cond_b

    .line 248
    .line 249
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 250
    .line 251
    invoke-interface {p2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    if-eqz p2, :cond_8

    .line 256
    .line 257
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 258
    .line 259
    new-instance v2, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string v4, " has a early dialog and is in TERMINATED state"

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-interface {p2, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :cond_8
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setRetransmission(Z)V

    .line 290
    .line 291
    .line 292
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 293
    .line 294
    if-eqz p2, :cond_a

    .line 295
    .line 296
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 297
    .line 298
    invoke-interface {p2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 299
    .line 300
    .line 301
    move-result p2

    .line 302
    if-eqz p2, :cond_9

    .line 303
    .line 304
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 305
    .line 306
    invoke-interface {p2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    :cond_9
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 310
    .line 311
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 312
    .line 313
    invoke-interface {p2, p1, p0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_7

    .line 317
    .line 318
    :cond_a
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_b
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :cond_c
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    const/4 v4, 0x3

    .line 331
    const/16 v5, 0x2bb

    .line 332
    .line 333
    const/4 v6, 0x2

    .line 334
    if-nez v0, :cond_14

    .line 335
    .line 336
    div-int/lit8 v0, p2, 0x64

    .line 337
    .line 338
    if-ne v0, v6, :cond_e

    .line 339
    .line 340
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableRetransmissionTimer()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableTimeoutTimer()V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 347
    .line 348
    .line 349
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 350
    .line 351
    if-eqz p2, :cond_d

    .line 352
    .line 353
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 354
    .line 355
    invoke-interface {p2, p1, p0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :cond_d
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :cond_e
    if-ne v0, v1, :cond_10

    .line 364
    .line 365
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableRetransmissionTimer()V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableTimeoutTimer()V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p0, v6}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 372
    .line 373
    .line 374
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 375
    .line 376
    if-eqz p2, :cond_f

    .line 377
    .line 378
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 379
    .line 380
    invoke-interface {p2, p1, p0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 381
    .line 382
    .line 383
    return-void

    .line 384
    :cond_f
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :cond_10
    if-gt v2, p2, :cond_1d

    .line 389
    .line 390
    if-gt p2, v5, :cond_1d

    .line 391
    .line 392
    :try_start_1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->createErrorAck()Landroid/javax/sip/message/Request;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    check-cast p2, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 397
    .line 398
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 399
    .line 400
    .line 401
    goto :goto_1

    .line 402
    :catch_1
    move-exception p2

    .line 403
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 404
    .line 405
    const-string v1, "Unexpected Exception sending ACK -- sending error AcK "

    .line 406
    .line 407
    invoke-interface {v0, v1, p2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 408
    .line 409
    .line 410
    :goto_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 411
    .line 412
    .line 413
    move-result-object p2

    .line 414
    if-eqz p2, :cond_11

    .line 415
    .line 416
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 417
    .line 418
    .line 419
    move-result-object p2

    .line 420
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 421
    .line 422
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent()Z

    .line 423
    .line 424
    .line 425
    move-result p2

    .line 426
    if-eqz p2, :cond_11

    .line 427
    .line 428
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 429
    .line 430
    .line 431
    move-result-object p2

    .line 432
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 433
    .line 434
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseAckSem()V

    .line 435
    .line 436
    .line 437
    :cond_11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 438
    .line 439
    .line 440
    move-result p2

    .line 441
    if-nez p2, :cond_12

    .line 442
    .line 443
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 444
    .line 445
    .line 446
    iget p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->timerD:I

    .line 447
    .line 448
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableTimeoutTimer(I)V

    .line 449
    .line 450
    .line 451
    goto :goto_2

    .line 452
    :cond_12
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 453
    .line 454
    .line 455
    :goto_2
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 456
    .line 457
    if-eqz p2, :cond_13

    .line 458
    .line 459
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 460
    .line 461
    invoke-interface {p2, p1, v0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 462
    .line 463
    .line 464
    goto :goto_3

    .line 465
    :cond_13
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 466
    .line 467
    .line 468
    :goto_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUpOnTimer()V

    .line 469
    .line 470
    .line 471
    goto/16 :goto_7

    .line 472
    .line 473
    :cond_14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-ne v6, v0, :cond_1c

    .line 478
    .line 479
    div-int/lit8 v0, p2, 0x64

    .line 480
    .line 481
    if-ne v0, v1, :cond_16

    .line 482
    .line 483
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 484
    .line 485
    if-eqz p2, :cond_15

    .line 486
    .line 487
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 488
    .line 489
    invoke-interface {p2, p1, p0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_15
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :cond_16
    if-ne v0, v6, :cond_18

    .line 498
    .line 499
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 500
    .line 501
    .line 502
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 503
    .line 504
    if-eqz p2, :cond_17

    .line 505
    .line 506
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 507
    .line 508
    invoke-interface {p2, p1, p0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 509
    .line 510
    .line 511
    return-void

    .line 512
    :cond_17
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :cond_18
    if-gt v2, p2, :cond_1d

    .line 517
    .line 518
    if-gt p2, v5, :cond_1d

    .line 519
    .line 520
    :try_start_2
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->createErrorAck()Landroid/javax/sip/message/Request;

    .line 521
    .line 522
    .line 523
    move-result-object p2

    .line 524
    check-cast p2, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 525
    .line 526
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 527
    .line 528
    .line 529
    goto :goto_4

    .line 530
    :catch_2
    move-exception p2

    .line 531
    invoke-static {p2}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 532
    .line 533
    .line 534
    :goto_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 535
    .line 536
    .line 537
    move-result-object p2

    .line 538
    if-eqz p2, :cond_19

    .line 539
    .line 540
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 541
    .line 542
    .line 543
    move-result-object p2

    .line 544
    check-cast p2, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 545
    .line 546
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseAckSem()V

    .line 547
    .line 548
    .line 549
    :cond_19
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 550
    .line 551
    .line 552
    move-result p2

    .line 553
    if-nez p2, :cond_1a

    .line 554
    .line 555
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 556
    .line 557
    .line 558
    iget p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->timerD:I

    .line 559
    .line 560
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableTimeoutTimer(I)V

    .line 561
    .line 562
    .line 563
    goto :goto_5

    .line 564
    :cond_1a
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 565
    .line 566
    .line 567
    :goto_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUpOnTimer()V

    .line 568
    .line 569
    .line 570
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 571
    .line 572
    if-eqz p2, :cond_1b

    .line 573
    .line 574
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 575
    .line 576
    invoke-interface {p2, p1, p0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 577
    .line 578
    .line 579
    goto :goto_7

    .line 580
    :cond_1b
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 581
    .line 582
    .line 583
    goto :goto_7

    .line 584
    :cond_1c
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 585
    .line 586
    .line 587
    move-result p1

    .line 588
    if-ne v4, p1, :cond_1d

    .line 589
    .line 590
    if-gt v2, p2, :cond_1d

    .line 591
    .line 592
    if-gt p2, v5, :cond_1d

    .line 593
    .line 594
    :try_start_3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->createErrorAck()Landroid/javax/sip/message/Request;

    .line 595
    .line 596
    .line 597
    move-result-object p1

    .line 598
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 599
    .line 600
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 601
    .line 602
    .line 603
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :catchall_0
    move-exception p1

    .line 608
    goto :goto_6

    .line 609
    :catch_3
    move-exception p1

    .line 610
    :try_start_4
    invoke-static {p1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 611
    .line 612
    .line 613
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 614
    .line 615
    .line 616
    goto :goto_7

    .line 617
    :goto_6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 618
    .line 619
    .line 620
    throw p1

    .line 621
    :cond_1d
    :goto_7
    return-void
.end method

.method private nonInviteClientTransaction(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    const/16 v2, 0x2bb

    .line 11
    .line 12
    const/16 v3, 0xc8

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    const/4 v5, 0x5

    .line 16
    const/4 v6, 0x1

    .line 17
    if-ne v6, v0, :cond_5

    .line 18
    .line 19
    div-int/lit8 v0, p2, 0x64

    .line 20
    .line 21
    if-ne v0, v6, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTimerT2()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableRetransmissionTimer(I)V

    .line 31
    .line 32
    .line 33
    const/16 p2, 0x40

    .line 34
    .line 35
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableTimeoutTimer(I)V

    .line 36
    .line 37
    .line 38
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 39
    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 43
    .line 44
    invoke-interface {p2, p1, p0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    if-gt v3, p2, :cond_b

    .line 53
    .line 54
    if-gt p2, v2, :cond_b

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-nez p2, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 63
    .line 64
    .line 65
    iget p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->timerK:I

    .line 66
    .line 67
    int-to-long v0, p2

    .line 68
    invoke-direct {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->scheduleTimerK(J)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-virtual {p0, v5}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 73
    .line 74
    .line 75
    :goto_0
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 76
    .line 77
    if-eqz p2, :cond_3

    .line 78
    .line 79
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 80
    .line 81
    invoke-interface {p2, p1, v0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-ne v5, p1, :cond_4

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUpOnTerminated()V

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUpOnTimer()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-ne v4, v0, :cond_c

    .line 112
    .line 113
    div-int/lit8 v0, p2, 0x64

    .line 114
    .line 115
    if-ne v0, v6, :cond_7

    .line 116
    .line 117
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 118
    .line 119
    if-eqz p2, :cond_6

    .line 120
    .line 121
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 122
    .line 123
    invoke-interface {p2, p1, p0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_7
    if-gt v3, p2, :cond_b

    .line 132
    .line 133
    if-gt p2, v2, :cond_b

    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableRetransmissionTimer()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableTimeoutTimer()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    if-nez p2, :cond_8

    .line 146
    .line 147
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 148
    .line 149
    .line 150
    iget p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->timerK:I

    .line 151
    .line 152
    int-to-long v0, p2

    .line 153
    invoke-direct {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->scheduleTimerK(J)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_8
    invoke-virtual {p0, v5}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 158
    .line 159
    .line 160
    :goto_2
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 161
    .line 162
    if-eqz p2, :cond_9

    .line 163
    .line 164
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 165
    .line 166
    invoke-interface {p2, p1, v0, p3}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 171
    .line 172
    .line 173
    :goto_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_a

    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-ne v5, p1, :cond_a

    .line 184
    .line 185
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUpOnTerminated()V

    .line 186
    .line 187
    .line 188
    :cond_a
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUpOnTimer()V

    .line 189
    .line 190
    .line 191
    :cond_b
    return-void

    .line 192
    :cond_c
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 193
    .line 194
    const/16 p2, 0x20

    .line 195
    .line 196
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_d

    .line 201
    .line 202
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 203
    .line 204
    new-instance p2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string p3, " Not sending response to TU! "

    .line 207
    .line 208
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    .line 212
    .line 213
    .line 214
    move-result-object p3

    .line 215
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :cond_d
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 226
    .line 227
    .line 228
    return-void
.end method

.method private scheduleTimerK(J)V
    .locals 6

    .line 1
    const-string v0, "starting TransactionTimerK() : "

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimer:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->timerKStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimerLock:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v1

    .line 20
    :try_start_0
    iget-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimerCancelled:Z

    .line 21
    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimer:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 31
    .line 32
    invoke-interface {v2, v4}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimer:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 37
    .line 38
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    const/16 v4, 0x20

    .line 41
    .line 42
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 49
    .line 50
    new-instance v4, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransactionId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, " time "

    .line 63
    .line 64
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    goto :goto_2

    .line 80
    :cond_0
    :goto_0
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$1;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$1;-><init>(Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;)V

    .line 83
    .line 84
    .line 85
    const-wide/16 v4, 0x0

    .line 86
    .line 87
    cmp-long v2, p1, v4

    .line 88
    .line 89
    if-lez v2, :cond_1

    .line 90
    .line 91
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 92
    .line 93
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget v4, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->baseTimerInterval:I

    .line 98
    .line 99
    int-to-long v4, v4

    .line 100
    mul-long/2addr p1, v4

    .line 101
    invoke-interface {v2, v0, p1, p2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$1;->runTask()V

    .line 106
    .line 107
    .line 108
    :goto_1
    iput-boolean v3, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimerCancelled:Z

    .line 109
    .line 110
    :cond_2
    monitor-exit v1

    .line 111
    return-void

    .line 112
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    throw p0

    .line 114
    :cond_3
    return-void
.end method


# virtual methods
.method public alertIfStillInCallingStateBy(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->timeoutIfStillInCallingState:Z

    .line 3
    .line 4
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->callingStateTimeoutCount:I

    .line 5
    .line 6
    return-void
.end method

.method public checkFromTag(Landroid/gov/nist/javax/sip/message/SIPResponse;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getOriginalRequestFromTag()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz p0, :cond_5

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, p0

    .line 16
    :goto_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    move v3, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v3, p0

    .line 29
    :goto_1
    xor-int/2addr v2, v3

    .line 30
    const-string v3, "From tag mismatch -- dropping response"

    .line 31
    .line 32
    const/16 v4, 0x20

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 37
    .line 38
    invoke-interface {p1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 45
    .line 46
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return p0

    .line 50
    :cond_3
    if-eqz v0, :cond_5

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_5

    .line 65
    .line 66
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 67
    .line 68
    invoke-interface {p1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 75
    .line 76
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    return p0

    .line 80
    :cond_5
    return v1
.end method

.method public cleanUp()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->None:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 6
    .line 7
    if-eq v0, v1, :cond_5

    .line 8
    .line 9
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "cleanup : "

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransactionId()Ljava/lang/String;

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
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialogId:Ljava/lang/String;

    .line 52
    .line 53
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v2, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->Normal:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 68
    .line 69
    if-ne v0, v2, :cond_2

    .line 70
    .line 71
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransport()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->encodeAsBytes(Ljava/lang/String;)[B

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 82
    .line 83
    :cond_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMergeId()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->mergeId:Ljava/lang/String;

    .line 90
    .line 91
    :cond_3
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUpOnTimer()V

    .line 94
    .line 95
    .line 96
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestCallId:Ljava/lang/String;

    .line 97
    .line 98
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestEventHeader:Landroid/gov/nist/javax/sip/header/Event;

    .line 99
    .line 100
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestFromTag:Ljava/lang/String;

    .line 101
    .line 102
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestContact:Landroid/gov/nist/javax/sip/header/Contact;

    .line 103
    .line 104
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestScheme:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->sipDialogs:Ljava/util/Set;

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 111
    .line 112
    .line 113
    :cond_4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->responsesReceived:Ljava/util/Set;

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 116
    .line 117
    .line 118
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 119
    .line 120
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimer:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 121
    .line 122
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 123
    .line 124
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimerLock:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->timerKStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 127
    .line 128
    :cond_5
    return-void
.end method

.method public cleanUpOnTerminated()V
    .locals 6

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "removing  = "

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
    const-string v3, " isReliable "

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v2, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->Normal:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    if-ne v0, v2, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageParserFactory()Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 66
    .line 67
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/parser/MessageParserFactory;->createMessageParser(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-interface {v0, v2, v3, v4, v5}, Landroid/gov/nist/javax/sip/parser/MessageParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 80
    .line 81
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move-exception v0

    .line 85
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 86
    .line 87
    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 94
    .line 95
    new-instance v4, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v5, "message "

    .line 98
    .line 99
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 103
    .line 104
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v5, " could not be reparsed !"

    .line 108
    .line 109
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-interface {v2, v4, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 120
    .line 121
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 125
    .line 126
    iget-boolean v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheClientConnections:Z

    .line 127
    .line 128
    if-nez v0, :cond_3

    .line 129
    .line 130
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget v1, v0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 141
    .line 142
    sub-int/2addr v1, v3

    .line 143
    iput v1, v0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 144
    .line 145
    if-gtz v1, :cond_5

    .line 146
    .line 147
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$LingerTimer;

    .line 148
    .line 149
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$LingerTimer;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;)V

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getConnectionLingerTimer()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_2

    .line 159
    .line 160
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 161
    .line 162
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 167
    .line 168
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getConnectionLingerTimer()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    mul-int/lit16 v2, v2, 0x3e8

    .line 173
    .line 174
    int-to-long v2, v2

    .line 175
    invoke-interface {v1, v0, v2, v3}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_2
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$LingerTimer;->runTask()V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_3
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 184
    .line 185
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_4

    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_4

    .line 196
    .line 197
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iget v0, v0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 202
    .line 203
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 204
    .line 205
    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_4

    .line 210
    .line 211
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 212
    .line 213
    new-instance v2, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v3, "Client Use Count = "

    .line 216
    .line 217
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    :cond_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 235
    .line 236
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipStackImpl;->isReEntrantListener()Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_5

    .line 241
    .line 242
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    sget-object v1, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->None:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 247
    .line 248
    if-eq v0, v1, :cond_5

    .line 249
    .line 250
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUp()V

    .line 251
    .line 252
    .line 253
    :cond_5
    :goto_1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->terminateDialogOnCleanUp:Z

    .line 254
    .line 255
    if-eqz v0, :cond_6

    .line 256
    .line 257
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 258
    .line 259
    if-eqz v0, :cond_6

    .line 260
    .line 261
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-nez v0, :cond_6

    .line 266
    .line 267
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 268
    .line 269
    const/4 v0, 0x3

    .line 270
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 271
    .line 272
    .line 273
    :cond_6
    return-void
.end method

.method public cleanUpOnTimer()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->None:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 6
    .line 7
    if-eq v0, v1, :cond_5

    .line 8
    .line 9
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "cleanupOnTimer: "

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransactionId()Ljava/lang/String;

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
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialogId:Ljava/lang/String;

    .line 62
    .line 63
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 64
    .line 65
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMergeId()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->mergeId:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setTransaction(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setInviteTransaction(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->cleanUp()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 91
    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v2, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->Normal:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 99
    .line 100
    if-ne v0, v2, :cond_2

    .line 101
    .line 102
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransport()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->encodeAsBytes(Ljava/lang/String;)[B

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 113
    .line 114
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-string v2, "INVITE"

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_3

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v2, "CANCEL"

    .line 131
    .line 132
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_3

    .line 137
    .line 138
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestFromTag:Ljava/lang/String;

    .line 145
    .line 146
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {v0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestCallId:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 159
    .line 160
    const-string v2, "Event"

    .line 161
    .line 162
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Landroid/gov/nist/javax/sip/header/Event;

    .line 167
    .line 168
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestEventHeader:Landroid/gov/nist/javax/sip/header/Event;

    .line 169
    .line 170
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 171
    .line 172
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeader()Landroid/gov/nist/javax/sip/header/Contact;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestContact:Landroid/gov/nist/javax/sip/header/Contact;

    .line 177
    .line 178
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 179
    .line 180
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-interface {v0}, Landroid/javax/sip/address/URI;->getScheme()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestScheme:Ljava/lang/String;

    .line 189
    .line 190
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 191
    .line 192
    :cond_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    const-string v2, "SUBSCRIBE"

    .line 197
    .line 198
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-nez v0, :cond_4

    .line 203
    .line 204
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 205
    .line 206
    :cond_4
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->lastRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 207
    .line 208
    :cond_5
    return-void
.end method

.method public clearState()V
    .locals 0

    return-void
.end method

.method public createAck()Landroid/javax/sip/message/Request;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "ACK"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_b

    .line 19
    .line 20
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 21
    .line 22
    if-eqz v1, :cond_a

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v3, 0xc8

    .line 29
    .line 30
    if-ge v1, v3, :cond_1

    .line 31
    .line 32
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    if-eqz v0, :cond_0

    .line 41
    .line 42
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "lastResponse = "

    .line 47
    .line 48
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    const-string p0, "Cannot ACK a provisional response!"

    .line 64
    .line 65
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v2

    .line 69
    :cond_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Landroid/gov/nist/javax/sip/header/To;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createAckRequest(Landroid/gov/nist/javax/sip/header/To;)Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v1, :cond_3

    .line 88
    .line 89
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    div-int/lit8 v1, v1, 0x64

    .line 104
    .line 105
    const/4 v2, 0x3

    .line 106
    if-eq v1, v2, :cond_2

    .line 107
    .line 108
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Landroid/gov/nist/javax/sip/header/Contact;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Contact;->getAddress()Landroid/javax/sip/address/Address;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-interface {p0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-interface {p0}, Landroid/javax/sip/address/URI;->clone()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, Landroid/javax/sip/address/URI;

    .line 133
    .line 134
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 135
    .line 136
    .line 137
    :cond_2
    return-object v0

    .line 138
    :cond_3
    const-string v3, "Route"

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    new-instance v3, Landroid/gov/nist/javax/sip/header/RouteList;

    .line 144
    .line 145
    invoke-direct {v3}, Landroid/gov/nist/javax/sip/header/RouteList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-virtual {v1, v4}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->listIterator(I)Ljava/util/ListIterator;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_4

    .line 161
    .line 162
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    check-cast v4, Landroid/gov/nist/javax/sip/header/RecordRoute;

    .line 167
    .line 168
    new-instance v5, Landroid/gov/nist/javax/sip/header/Route;

    .line 169
    .line 170
    invoke-direct {v5}, Landroid/gov/nist/javax/sip/header/Route;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    check-cast v6, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 178
    .line 179
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/address/AddressImpl;->clone()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    check-cast v6, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 184
    .line 185
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameters()Landroid/gov/nist/core/NameValueList;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v4}, Landroid/gov/nist/core/NameValueList;->clone()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    check-cast v4, Landroid/gov/nist/core/NameValueList;

    .line 197
    .line 198
    invoke-virtual {v5, v4}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameters(Landroid/gov/nist/core/NameValueList;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v5}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_4
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 206
    .line 207
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    if-eqz v1, :cond_5

    .line 212
    .line 213
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 214
    .line 215
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    check-cast p0, Landroid/gov/nist/javax/sip/header/Contact;

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_5
    move-object p0, v2

    .line 227
    :goto_1
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    check-cast v1, Landroid/gov/nist/javax/sip/header/Route;

    .line 232
    .line 233
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-interface {v1}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, Landroid/javax/sip/address/SipURI;

    .line 242
    .line 243
    invoke-interface {v1}, Landroid/javax/sip/address/SipURI;->hasLrParam()Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-nez v1, :cond_8

    .line 248
    .line 249
    if-eqz p0, :cond_6

    .line 250
    .line 251
    new-instance v2, Landroid/gov/nist/javax/sip/header/Route;

    .line 252
    .line 253
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/Route;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Contact;->getAddress()Landroid/javax/sip/address/Address;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    check-cast p0, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 261
    .line 262
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/AddressImpl;->clone()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    check-cast p0, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 267
    .line 268
    invoke-virtual {v2, p0}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 269
    .line 270
    .line 271
    :cond_6
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    check-cast p0, Landroid/gov/nist/javax/sip/header/Route;

    .line 276
    .line 277
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->removeFirst()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-interface {p0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 289
    .line 290
    .line 291
    if-eqz v2, :cond_7

    .line 292
    .line 293
    invoke-virtual {v3, v2}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 294
    .line 295
    .line 296
    :cond_7
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 297
    .line 298
    .line 299
    return-object v0

    .line 300
    :cond_8
    if-eqz p0, :cond_9

    .line 301
    .line 302
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Contact;->getAddress()Landroid/javax/sip/address/Address;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-interface {p0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-interface {p0}, Landroid/javax/sip/address/URI;->clone()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    check-cast p0, Landroid/javax/sip/address/URI;

    .line 315
    .line 316
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 320
    .line 321
    .line 322
    :cond_9
    return-object v0

    .line 323
    :cond_a
    const-string p0, "bad Transaction state"

    .line 324
    .line 325
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return-object v2

    .line 329
    :cond_b
    const-string p0, "Cannot ACK an ACK!"

    .line 330
    .line 331
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    return-object v2

    .line 335
    :cond_c
    new-instance v0, Landroid/javax/sip/SipException;

    .line 336
    .line 337
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    new-instance v1, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    const-string v2, "bad state "

    .line 344
    .line 345
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    invoke-direct {v0, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v0
.end method

.method public createCancel()Landroid/javax/sip/message/Request;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "INVITE"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v3, "ACK"

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createCancelRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setInviteTransaction(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_0
    const-string p0, "Cannot Cancel ACK!"

    .line 41
    .line 42
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_1
    const-string p0, "Only INIVTE may be cancelled"

    .line 47
    .line 48
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    new-instance v0, Landroid/javax/sip/SipException;

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, "Bad state "

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {v0, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method

.method public fireRetransmissionTimer()V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ltz v1, :cond_5

    .line 7
    .line 8
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isMapped:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    :cond_1
    if-nez v1, :cond_5

    .line 28
    .line 29
    if-eq v3, v2, :cond_2

    .line 30
    .line 31
    if-ne v0, v2, :cond_5

    .line 32
    .line 33
    :cond_2
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->lastRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 38
    .line 39
    iget-boolean v2, v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->generateTimeStampHeader:Z

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    const-string v2, "Timestamp"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    new-instance v4, Landroid/gov/nist/javax/sip/header/TimeStamp;

    .line 56
    .line 57
    invoke-direct {v4}, Landroid/gov/nist/javax/sip/header/TimeStamp;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 58
    .line 59
    .line 60
    long-to-float v1, v1

    .line 61
    :try_start_1
    invoke-virtual {v4, v1}, Landroid/gov/nist/javax/sip/header/TimeStamp;->setTimeStamp(F)V
    :try_end_1
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception v1

    .line 66
    :try_start_2
    invoke-static {v1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->lastRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 70
    .line 71
    invoke-virtual {v1, v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->lastRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 75
    .line 76
    invoke-super {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 77
    .line 78
    .line 79
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->notifyOnRetransmit:Z

    .line 80
    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    new-instance v1, Landroid/javax/sip/TimeoutEvent;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    sget-object v4, Landroid/javax/sip/Timeout;->RETRANSMIT:Landroid/javax/sip/Timeout;

    .line 90
    .line 91
    invoke-direct {v1, v2, p0, v4}, Landroid/javax/sip/TimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/Timeout;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2, v1, p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->timeoutIfStillInCallingState:Z

    .line 102
    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_5

    .line 110
    .line 111
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->callingStateTimeoutCount:I

    .line 112
    .line 113
    sub-int/2addr v1, v3

    .line 114
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->callingStateTimeoutCount:I

    .line 115
    .line 116
    if-nez v1, :cond_5

    .line 117
    .line 118
    new-instance v1, Landroid/javax/sip/TimeoutEvent;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    sget-object v3, Landroid/javax/sip/Timeout;->RETRANSMIT:Landroid/javax/sip/Timeout;

    .line 125
    .line 126
    invoke-direct {v1, v2, p0, v3}, Landroid/javax/sip/TimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/Timeout;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2, v1, p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 134
    .line 135
    .line 136
    const/4 v1, 0x0

    .line 137
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->timeoutIfStillInCallingState:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :catch_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseIOExceptionEvent()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseErrorEvent(I)V

    .line 144
    .line 145
    .line 146
    :cond_5
    :goto_1
    return-void
.end method

.method public fireTimeoutTimer()V
    .locals 5

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "fireTimeoutTimer "

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
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x2

    .line 41
    const/4 v3, 0x1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eq v3, v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-ne v2, v1, :cond_4

    .line 55
    .line 56
    :cond_1
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sget-object v4, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;

    .line 69
    .line 70
    if-ne v1, v4, :cond_3

    .line 71
    .line 72
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->delete()V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    const-string v4, "BYE"

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isTerminatedOnBye()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->delete()V

    .line 107
    .line 108
    .line 109
    :cond_4
    :goto_0
    const/4 v0, 0x3

    .line 110
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    const/4 v4, 0x5

    .line 115
    if-eq v0, v1, :cond_7

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eq v4, v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseErrorEvent(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-string v1, "CANCEL"

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getInviteTransaction()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 147
    .line 148
    if-eqz p0, :cond_6

    .line 149
    .line 150
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_5

    .line 155
    .line 156
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-ne v0, v2, :cond_6

    .line 161
    .line 162
    :cond_5
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_6

    .line 167
    .line 168
    invoke-interface {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setState(I)V

    .line 169
    .line 170
    .line 171
    :cond_6
    return-void

    .line 172
    :cond_7
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialogId:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    return-object v0
.end method

.method public bridge synthetic getDefaultDialog()Landroid/javax/sip/Dialog;
    .locals 0

    .line 17
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object p0

    return-object p0
.end method

.method public getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;
    .locals 1

    .line 94
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->sipDialogs:Ljava/util/Set;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v0

    if-nez v0, :cond_0

    .line 96
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getEarlyDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public getDialog()Landroid/javax/sip/Dialog;
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x64

    .line 22
    .line 23
    if-eq v1, v2, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    :goto_0
    if-nez v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 43
    .line 44
    const/16 v2, 0x20

    .line 45
    .line 46
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 53
    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v3, " sipDialogs =  "

    .line 57
    .line 58
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->sipDialogs:Ljava/util/Set;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v3, " default dialog "

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p0, " retval "

    .line 79
    .line 80
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-interface {v1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-object v0
.end method

.method public getNextHop()Landroid/javax/sip/address/Hop;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->nextHop:Landroid/javax/sip/address/Hop;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOriginalRequestCallId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestCallId:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getOriginalRequestContact()Landroid/gov/nist/javax/sip/header/Contact;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestContact:Landroid/gov/nist/javax/sip/header/Contact;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeader()Landroid/gov/nist/javax/sip/header/Contact;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public getOriginalRequestEvent()Landroid/gov/nist/javax/sip/header/Event;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestEventHeader:Landroid/gov/nist/javax/sip/header/Event;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "Event"

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Landroid/gov/nist/javax/sip/header/Event;

    .line 15
    .line 16
    return-object p0
.end method

.method public getOriginalRequestFromTag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestFromTag:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public getOriginalRequestScheme()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->originalRequestScheme:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Landroid/javax/sip/address/URI;->getScheme()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getOutgoingViaHeader()Landroid/gov/nist/javax/sip/header/Via;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getViaHeader()Landroid/gov/nist/javax/sip/header/Via;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getRequestChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 2
    .line 3
    return-object p0
.end method

.method public getViaHost()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->viaHost:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getViaPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->viaPort:I

    .line 2
    .line 3
    return p0
.end method

.method public isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v5, "z9hg4bk"

    .line 28
    .line 29
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    move v1, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v1, v4

    .line 48
    :goto_0
    const/4 v2, 0x3

    .line 49
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-ne v2, v5, :cond_3

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    return v3

    .line 90
    :cond_1
    return v4

    .line 91
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0

    .line 104
    :cond_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isTerminated()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_6

    .line 109
    .line 110
    if-eqz v1, :cond_4

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-interface {p1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    return p0

    .line 143
    :cond_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    return p0

    .line 162
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getRequest()Landroid/javax/sip/message/Request;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    return p0

    .line 181
    :cond_6
    return v4
.end method

.method public isNotifyOnRetransmit()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->notifyOnRetransmit:Z

    .line 2
    .line 3
    return p0
.end method

.method public processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->responsesReceived:Ljava/util/Set;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    xor-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/16 v4, 0x64

    .line 19
    .line 20
    if-le v0, v4, :cond_0

    .line 21
    .line 22
    const/16 v5, 0xc8

    .line 23
    .line 24
    if-ge v0, v5, :cond_0

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    move v2, v3

    .line 39
    :cond_0
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 40
    .line 41
    const/16 v5, 0x20

    .line 42
    .line 43
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 50
    .line 51
    new-instance v5, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v6, "marking response as retransmission "

    .line 54
    .line 55
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v6, " for ctx "

    .line 62
    .line 63
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {p1, v2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setRetransmission(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const-string v3, "CANCEL"

    .line 92
    .line 93
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->lastRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 100
    .line 101
    if-eqz v3, :cond_3

    .line 102
    .line 103
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getInviteTransaction()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    check-cast v3, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 108
    .line 109
    if-eqz v3, :cond_2

    .line 110
    .line 111
    invoke-interface {v3}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    goto :goto_0

    .line 116
    :cond_2
    const/4 v3, 0x0

    .line 117
    goto :goto_0

    .line 118
    :cond_3
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    :goto_0
    if-nez v3, :cond_d

    .line 123
    .line 124
    if-le v0, v4, :cond_c

    .line 125
    .line 126
    const/16 v4, 0x12c

    .line 127
    .line 128
    if-ge v0, v4, :cond_c

    .line 129
    .line 130
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-nez v0, :cond_4

    .line 135
    .line 136
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isRfc2543Supported()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_c

    .line 143
    .line 144
    :cond_4
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_c

    .line 149
    .line 150
    monitor-enter p0

    .line 151
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 152
    .line 153
    if-eqz v0, :cond_a

    .line 154
    .line 155
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_9

    .line 160
    .line 161
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 168
    .line 169
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastResponseMethod()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-eqz v3, :cond_7

    .line 174
    .line 175
    const-string v3, "SUBSCRIBE"

    .line 176
    .line 177
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_5

    .line 182
    .line 183
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 184
    .line 185
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastResponseMethod()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const-string v3, "NOTIFY"

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_5

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_5

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :catchall_0
    move-exception p1

    .line 205
    goto :goto_5

    .line 206
    :cond_5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 207
    .line 208
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-nez v0, :cond_6

    .line 213
    .line 214
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 215
    .line 216
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAssigned()Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_6

    .line 221
    .line 222
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 223
    .line 224
    invoke-virtual {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createDialog(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 229
    .line 230
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setOriginalDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 231
    .line 232
    .line 233
    :cond_6
    :goto_1
    move-object v3, v0

    .line 234
    goto :goto_3

    .line 235
    :cond_7
    :goto_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 236
    .line 237
    invoke-virtual {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 238
    .line 239
    .line 240
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 241
    .line 242
    goto :goto_1

    .line 243
    :goto_3
    if-eqz v3, :cond_8

    .line 244
    .line 245
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {p0, v3, v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_8
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 254
    .line 255
    const-string v1, "dialog is unexpectedly null"

    .line 256
    .line 257
    new-instance v2, Ljava/lang/NullPointerException;

    .line 258
    .line 259
    invoke-direct {v2}, Ljava/lang/NullPointerException;-><init>()V

    .line 260
    .line 261
    .line 262
    invoke-interface {v0, v1, v2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    .line 267
    .line 268
    const-string p2, "Response without from-tag"

    .line 269
    .line 270
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw p1

    .line 274
    :cond_a
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 275
    .line 276
    iget-boolean v1, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAutomaticDialogSupportEnabled:Z

    .line 277
    .line 278
    if-eqz v1, :cond_b

    .line 279
    .line 280
    invoke-virtual {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createDialog(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {p0, v3, v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    :cond_b
    :goto_4
    monitor-exit p0

    .line 292
    goto :goto_6

    .line 293
    :goto_5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    throw p1

    .line 295
    :cond_c
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_d
    const/4 v0, 0x5

    .line 299
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eq v0, v1, :cond_e

    .line 304
    .line 305
    invoke-virtual {v3, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 306
    .line 307
    .line 308
    :cond_e
    :goto_6
    invoke-virtual {p0, p1, p2, v3}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 309
    .line 310
    .line 311
    return-void
.end method

.method public declared-synchronized processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 5

    const-string v0, "dialog = "

    const-string v1, "processing "

    monitor-enter p0

    .line 312
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v2, :cond_0

    .line 313
    monitor-exit p0

    return-void

    .line 314
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x3

    if-eq v4, v2, :cond_1

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    move-result v2

    if-ne v3, v2, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    move-result v2

    div-int/lit8 v2, v2, 0x64
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_2

    .line 315
    monitor-exit p0

    return-void

    .line 316
    :cond_2
    :try_start_2
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v4, 0x20

    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 317
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getFirstLine()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "current state = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 318
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 319
    :cond_3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 320
    :try_start_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 321
    invoke-direct {p0, p1, p2, p3}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->inviteClientTransaction(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    .line 322
    :cond_4
    invoke-direct {p0, p1, p2, p3}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->nonInviteClientTransaction(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    .line 323
    :goto_1
    :try_start_4
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 324
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p2, p1}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 325
    :cond_5
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    const/4 p1, 0x2

    .line 326
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseErrorEvent(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 327
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 6

    .line 1
    const-string v0, "TransactionState "

    .line 2
    .line 3
    const-string v1, "Sending Message "

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    :try_start_0
    move-object v3, p1

    .line 7
    check-cast v3, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 8
    .line 9
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 10
    .line 11
    .line 12
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :try_start_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v4, v5}, Landroid/gov/nist/javax/sip/header/Via;->setBranch(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :catch_0
    :goto_0
    :try_start_2
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 25
    .line 26
    const/16 v5, 0x20

    .line 27
    .line 28
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 35
    .line 36
    new-instance v5, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {v4, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 73
    .line 74
    .line 75
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    const-string v0, "ACK"

    .line 77
    .line 78
    const/4 v1, 0x5

    .line 79
    const/4 v4, 0x2

    .line 80
    if-eq v4, p1, :cond_1

    .line 81
    .line 82
    :try_start_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_3

    .line 87
    .line 88
    :cond_1
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_2

    .line 103
    .line 104
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    const/4 p1, 0x3

    .line 109
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUpOnTimer()V

    .line 113
    .line 114
    .line 115
    invoke-super {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 116
    .line 117
    .line 118
    :goto_2
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isMapped:Z

    .line 119
    .line 120
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->startTransactionTimer()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_3
    :try_start_4
    iput-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->lastRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-gez p1, :cond_8

    .line 131
    .line 132
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const-string v4, "INVITE"

    .line 140
    .line 141
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_4

    .line 146
    .line 147
    const/4 p1, 0x0

    .line 148
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :catch_1
    move-exception p1

    .line 153
    goto :goto_5

    .line 154
    :cond_4
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_5

    .line 163
    .line 164
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->cleanUpOnTimer()V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_5
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 172
    .line 173
    .line 174
    :goto_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_6

    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableRetransmissionTimer()V

    .line 181
    .line 182
    .line 183
    :cond_6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    const/16 v0, 0x40

    .line 188
    .line 189
    if-eqz p1, :cond_7

    .line 190
    .line 191
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableTimeoutTimer(I)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_7
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableTimeoutTimer(I)V

    .line 196
    .line 197
    .line 198
    :cond_8
    :goto_4
    invoke-super {p0, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :goto_5
    :try_start_5
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 203
    .line 204
    .line 205
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 206
    :goto_6
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isMapped:Z

    .line 207
    .line 208
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->startTransactionTimer()V

    .line 209
    .line 210
    .line 211
    throw p1
.end method

.method public sendRequest()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-gez v1, :cond_10

    .line 10
    .line 11
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v3, "sendRequest() "

    .line 26
    .line 27
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->checkHeaders()V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "SUBSCRIBE"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const-string v2, "Expires"

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 64
    .line 65
    invoke-interface {v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 72
    .line 73
    const-string v3, "Expires header missing in outgoing subscribe -- Notifier will assume implied value on event package"

    .line 74
    .line 75
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-string v3, "CANCEL"

    .line 83
    .line 84
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/4 v3, 0x0

    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isCancelClientTransactionChecked()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v1, v4, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findCancelTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 110
    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-ltz v3, :cond_3

    .line 118
    .line 119
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_2

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    new-instance v0, Landroid/javax/sip/SipException;

    .line 127
    .line 128
    const-string v1, "Cannot cancel non-invite requests RFC 3261 9.1"

    .line 129
    .line 130
    invoke-direct {v0, v1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :catch_0
    move-exception v0

    .line 135
    goto/16 :goto_3

    .line 136
    .line 137
    :cond_3
    new-instance v0, Landroid/javax/sip/SipException;

    .line 138
    .line 139
    const-string v1, "State is null no provisional response yet -- cannot cancel RFC 3261 9.1"

    .line 140
    .line 141
    invoke-direct {v0, v1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_4
    new-instance v0, Landroid/javax/sip/SipException;

    .line 146
    .line 147
    const-string v1, "Could not find original tx to cancel. RFC 3261 9.1"

    .line 148
    .line 149
    invoke-direct {v0, v1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v4, "BYE"

    .line 158
    .line 159
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_6

    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    const-string v4, "NOTIFY"

    .line 170
    .line 171
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_8

    .line 176
    .line 177
    :cond_6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v4, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v1, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_8

    .line 200
    .line 201
    if-nez v1, :cond_7

    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_7
    new-instance v0, Landroid/javax/sip/SipException;

    .line 205
    .line 206
    const-string v1, "Dialog is present and AutomaticDialogSupport is enabled for  the provider -- Send the Request using the Dialog.sendRequest(transaction)"

    .line 207
    .line 208
    invoke-direct {v0, v1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v0

    .line 212
    :cond_8
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_a

    .line 217
    .line 218
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-eqz v1, :cond_a

    .line 223
    .line 224
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isBackToBackUserAgent()Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_a

    .line 229
    .line 230
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->takeAckSem()Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_9

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_9
    new-instance v0, Landroid/javax/sip/SipException;

    .line 238
    .line 239
    const-string v1, "Failed to take ACK semaphore"

    .line 240
    .line 241
    invoke-direct {v0, v1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v0

    .line 245
    :cond_a
    :goto_1
    const/4 v1, 0x1

    .line 246
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isMapped:Z

    .line 247
    .line 248
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    const/4 v3, -0x1

    .line 253
    if-eqz v1, :cond_b

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, Landroid/gov/nist/javax/sip/header/Expires;

    .line 260
    .line 261
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Expires;->getExpires()I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    goto :goto_2

    .line 266
    :cond_b
    move v1, v3

    .line 267
    :goto_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    if-eqz v2, :cond_c

    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-eqz v2, :cond_c

    .line 278
    .line 279
    if-eq v1, v3, :cond_c

    .line 280
    .line 281
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->expiresTimerTask:Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;

    .line 282
    .line 283
    if-nez v2, :cond_c

    .line 284
    .line 285
    new-instance v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;

    .line 286
    .line 287
    invoke-direct {v2, p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;)V

    .line 288
    .line 289
    .line 290
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->expiresTimerTask:Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;

    .line 291
    .line 292
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 293
    .line 294
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->expiresTimerTask:Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;

    .line 299
    .line 300
    int-to-long v4, v1

    .line 301
    const-wide/16 v6, 0x3e8

    .line 302
    .line 303
    mul-long/2addr v4, v6

    .line 304
    invoke-interface {v2, v3, v4, v5}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 305
    .line 306
    .line 307
    :cond_c
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :goto_3
    const/4 v1, 0x5

    .line 312
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 313
    .line 314
    .line 315
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->expiresTimerTask:Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;

    .line 316
    .line 317
    if-eqz v1, :cond_d

    .line 318
    .line 319
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 320
    .line 321
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->expiresTimerTask:Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;

    .line 326
    .line 327
    invoke-interface {v1, p0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 328
    .line 329
    .line 330
    :cond_d
    new-instance p0, Landroid/javax/sip/SipException;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    if-nez v1, :cond_e

    .line 337
    .line 338
    const-string v1, "IO Error sending request"

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    :goto_4
    invoke-direct {p0, v1, v0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 346
    .line 347
    .line 348
    throw p0

    .line 349
    :catch_1
    move-exception p0

    .line 350
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 351
    .line 352
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_f

    .line 357
    .line 358
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 359
    .line 360
    const-string v1, "missing required header"

    .line 361
    .line 362
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :cond_f
    new-instance v0, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;

    .line 366
    .line 367
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    sget-object v1, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;->MissingRequiredHeader:Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;

    .line 372
    .line 373
    invoke-direct {v0, p0, v1}, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;-><init>(Ljava/lang/String;Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;)V

    .line 374
    .line 375
    .line 376
    throw v0

    .line 377
    :cond_10
    new-instance p0, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;

    .line 378
    .line 379
    const-string v0, "Request already sent"

    .line 380
    .line 381
    sget-object v1, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;->RequestAlreadySent:Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;

    .line 382
    .line 383
    invoke-direct {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;-><init>(Ljava/lang/String;Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;)V

    .line 384
    .line 385
    .line 386
    throw p0
.end method

.method public setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "setDialog: "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, " sipDialog = "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    if-nez p1, :cond_2

    .line 39
    .line 40
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 41
    .line 42
    const/4 p1, 0x4

    .line 43
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 50
    .line 51
    const-string p1, "NULL DIALOG!!"

    .line 52
    .line 53
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    const-string p0, "bad dialog null"

    .line 57
    .line 58
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 63
    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialogId:Ljava/lang/String;

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->defaultDialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxForkTime()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addForkedClientTransaction(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    if-eqz p2, :cond_4

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->sipDialogs:Ljava/util/Set;

    .line 104
    .line 105
    if-eqz p0, :cond_4

    .line 106
    .line 107
    invoke-interface {p0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :cond_4
    return-void
.end method

.method public setNextHop(Landroid/javax/sip/address/Hop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->nextHop:Landroid/javax/sip/address/Hop;

    .line 2
    .line 3
    return-void
.end method

.method public setNotifyOnRetransmit(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->notifyOnRetransmit:Z

    .line 2
    .line 3
    return-void
.end method

.method public setResponseInterface(Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Setting response interface for "

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
    const-string v2, " to "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    if-nez p1, :cond_0

    .line 39
    .line 40
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 41
    .line 42
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 43
    .line 44
    .line 45
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 46
    .line 47
    const-string v1, "WARNING -- setting to null!"

    .line 48
    .line 49
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->respondTo:Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 53
    .line 54
    return-void
.end method

.method public setState(I)V
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-boolean v1, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheClientConnections:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const/16 v1, 0x40

    .line 19
    .line 20
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->collectionTime:I

    .line 21
    .line 22
    :cond_0
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x3

    .line 27
    if-eq v1, v2, :cond_2

    .line 28
    .line 29
    if-eq p1, v2, :cond_1

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->decrementActiveClientTransactionCount()V

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->setState(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public setTerminateDialogOnCleanUp(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->terminateDialogOnCleanUp:Z

    .line 2
    .line 3
    return-void
.end method

.method public setViaHost(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->viaHost:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setViaPort(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->viaPort:I

    .line 2
    .line 3
    return-void
.end method

.method public startTransactionTimer()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->transactionTimerStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimerLock:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimerCancelled:Z

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$TransactionTimer;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$TransactionTimer;-><init>(Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimer:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 34
    .line 35
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->transactionTimer:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 42
    .line 43
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->baseTimerInterval:I

    .line 44
    .line 45
    int-to-long v4, p0

    .line 46
    int-to-long v6, p0

    .line 47
    invoke-interface/range {v2 .. v7}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->scheduleWithFixedDelay(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;JJ)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    :goto_0
    monitor-exit v1

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    throw p0

    .line 58
    :cond_1
    return-void
.end method

.method public stopExpiresTimer()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->expiresTimerTask:Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->expiresTimerTask:Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->expiresTimerTask:Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl$ExpiresTimerTask;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public terminate()V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->setState(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->transactionTimerStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->testAndSetTransactionTerminatedEvent()Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->releaseAckSem()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

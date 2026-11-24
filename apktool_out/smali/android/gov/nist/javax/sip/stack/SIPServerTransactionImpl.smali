.class public Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;
.super Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$TransactionTimer;,
        Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$SendTrying;,
        Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;,
        Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;
    }
.end annotation


# static fields
.field private static interlockProvisionalResponses:Z

.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private dialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

.field protected dialogId:Ljava/lang/String;

.field private inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

.field protected isAckSeen:Z

.field private lastResponseAsBytes:[B

.field private lastResponseHost:Ljava/lang/String;

.field private lastResponsePort:I

.field private lastResponseStatusCode:I

.field private lastResponseTransport:Ljava/lang/String;

.field private originalRequestFromTag:Ljava/lang/String;

.field private originalRequestSentBy:Landroid/gov/nist/core/HostPort;

.field private pendingReliableCSeqNumber:J

.field private pendingReliableRSeqNumber:J

.field private pendingReliableResponseAsBytes:[B

.field private pendingReliableResponseMethod:Ljava/lang/String;

.field private pendingSubscribeTransaction:Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

.field private provisionalResponseSem:Ljava/util/concurrent/Semaphore;

.field private provisionalResponseTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;

.field private transient requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

.field private retransmissionAlertEnabled:Z

.field private retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

.field private rseqNumber:I

.field private terminationSemaphore:Ljava/util/concurrent/Semaphore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    sput-boolean v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->interlockProvisionalResponses:Z

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->rseqNumber:I

    .line 6
    .line 7
    new-instance p1, Ljava/util/concurrent/Semaphore;

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    invoke-direct {p1, p2}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseSem:Ljava/util/concurrent/Semaphore;

    .line 14
    .line 15
    new-instance p1, Ljava/util/concurrent/Semaphore;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-direct {p1, p2}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->terminationSemaphore:Ljava/util/concurrent/Semaphore;

    .line 22
    .line 23
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 24
    .line 25
    const/16 p2, 0x20

    .line 26
    .line 27
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 34
    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, "Creating Server Transaction"

    .line 38
    .line 39
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranchId()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 57
    .line 58
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public static synthetic access$000(Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->fireReliableResponseRetransmissionTimer()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$100()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method

.method private checkStateTimers(I)Z
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const-wide/16 v3, 0x40

    .line 8
    .line 9
    const/16 v5, 0xc8

    .line 10
    .line 11
    const/16 v6, 0x2bb

    .line 12
    .line 13
    const/16 v7, 0x40

    .line 14
    .line 15
    const/4 v8, 0x5

    .line 16
    const/4 v9, 0x2

    .line 17
    const/4 v10, 0x3

    .line 18
    const/4 v11, 0x1

    .line 19
    if-ne v0, v11, :cond_5

    .line 20
    .line 21
    div-int/lit8 v0, p1, 0x64

    .line 22
    .line 23
    if-ne v0, v11, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v9}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    :cond_0
    if-gt v5, p1, :cond_b

    .line 31
    .line 32
    if-gt p1, v6, :cond_b

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eq p1, v10, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0, v10}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v3, v4}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimerJ(J)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->cleanUpOnTimer()V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->cleanUpOnTimer()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v8}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimerJ(J)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :cond_2
    if-ne v0, v9, :cond_3

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableRetransmissionTimer()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableTimeoutTimer()V

    .line 80
    .line 81
    .line 82
    iput v7, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->collectionTime:I

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->cleanUpOnTimer()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v8}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_b

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRetransmissionTicks()V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_1

    .line 106
    .line 107
    :cond_3
    invoke-virtual {p0, v10}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_4

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableRetransmissionTimer()V

    .line 117
    .line 118
    .line 119
    :cond_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->cleanUpOnTimer()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v7}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableTimeoutTimer(I)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_1

    .line 126
    .line 127
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-ne v0, v9, :cond_a

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    div-int/lit8 v0, p1, 0x64

    .line 140
    .line 141
    if-ne v0, v9, :cond_6

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableRetransmissionTimer()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableTimeoutTimer()V

    .line 147
    .line 148
    .line 149
    iput v7, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->collectionTime:I

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->cleanUpOnTimer()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v8}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-eqz p1, :cond_b

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setRetransmissionTicks()V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_6
    const/16 v0, 0x12c

    .line 174
    .line 175
    if-gt v0, p1, :cond_b

    .line 176
    .line 177
    if-gt p1, v6, :cond_b

    .line 178
    .line 179
    invoke-virtual {p0, v10}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-nez p1, :cond_7

    .line 187
    .line 188
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableRetransmissionTimer()V

    .line 189
    .line 190
    .line 191
    :cond_7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->cleanUpOnTimer()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v7}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableTimeoutTimer(I)V

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_8
    if-gt v5, p1, :cond_b

    .line 199
    .line 200
    if-gt p1, v6, :cond_b

    .line 201
    .line 202
    invoke-virtual {p0, v10}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-nez p1, :cond_9

    .line 210
    .line 211
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableRetransmissionTimer()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v3, v4}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimerJ(J)V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_9
    invoke-virtual {p0, v8}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimerJ(J)V

    .line 222
    .line 223
    .line 224
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->cleanUpOnTimer()V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_a
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    if-ne v10, p0, :cond_b

    .line 233
    .line 234
    const/4 p0, 0x0

    .line 235
    return p0

    .line 236
    :cond_b
    :goto_1
    return v11
.end method

.method private fireReliableResponseRetransmissionTimer()V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->resendLastResponseAsBytes()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 7
    .line 8
    invoke-interface {v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x5

    .line 20
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseErrorEvent(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public ackSeen()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->isAckSeen:Z

    .line 2
    .line 3
    return p0
.end method

.method public cleanUp()V
    .locals 7

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "removing"

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
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v2, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->None:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eq v0, v2, :cond_7

    .line 38
    .line 39
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 40
    .line 41
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v4, "cleanup : "

    .line 52
    .line 53
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransactionId()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v4, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->Normal:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 84
    .line 85
    if-ne v0, v4, :cond_2

    .line 86
    .line 87
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageParserFactory()Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 94
    .line 95
    invoke-interface {v0, v4}, Landroid/gov/nist/javax/sip/parser/MessageParserFactory;->createMessageParser(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    invoke-interface {v0, v4, v3, v5, v2}, Landroid/gov/nist/javax/sip/parser/MessageParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 107
    .line 108
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :catch_0
    move-exception v0

    .line 112
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 113
    .line 114
    invoke-interface {v4, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_3

    .line 119
    .line 120
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 121
    .line 122
    new-instance v5, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v6, "message "

    .line 125
    .line 126
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 130
    .line 131
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v6, "could not be reparsed !"

    .line 135
    .line 136
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-interface {v4, v5, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 148
    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 152
    .line 153
    if-nez v0, :cond_3

    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sget-object v4, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->Normal:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 160
    .line 161
    if-ne v0, v4, :cond_3

    .line 162
    .line 163
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransport()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v0, v4}, Landroid/gov/nist/javax/sip/message/SIPRequest;->encodeAsBytes(Ljava/lang/String;)[B

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 174
    .line 175
    :cond_3
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 176
    .line 177
    if-eqz v0, :cond_4

    .line 178
    .line 179
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 180
    .line 181
    if-nez v4, :cond_4

    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMergeId()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->mergeId:Ljava/lang/String;

    .line 188
    .line 189
    :cond_4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 190
    .line 191
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->cleanUpOnTimer()V

    .line 195
    .line 196
    .line 197
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->originalRequestFromTag:Ljava/lang/String;

    .line 198
    .line 199
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->originalRequestSentBy:Landroid/gov/nist/core/HostPort;

    .line 200
    .line 201
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 202
    .line 203
    if-eqz v0, :cond_5

    .line 204
    .line 205
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 206
    .line 207
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-nez v0, :cond_6

    .line 212
    .line 213
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 214
    .line 215
    if-eqz v0, :cond_6

    .line 216
    .line 217
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 218
    .line 219
    :cond_6
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_7
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 223
    .line 224
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 225
    .line 226
    .line 227
    :goto_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 228
    .line 229
    iget-boolean v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheServerConnections:Z

    .line 230
    .line 231
    if-nez v0, :cond_8

    .line 232
    .line 233
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_8

    .line 238
    .line 239
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget v2, v0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 244
    .line 245
    sub-int/2addr v2, v3

    .line 246
    iput v2, v0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 247
    .line 248
    if-gtz v2, :cond_8

    .line 249
    .line 250
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->close()V

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_8
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 255
    .line 256
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_9

    .line 261
    .line 262
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 263
    .line 264
    iget-boolean v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheServerConnections:Z

    .line 265
    .line 266
    if-nez v0, :cond_9

    .line 267
    .line 268
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_9

    .line 273
    .line 274
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->useCount:I

    .line 279
    .line 280
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 281
    .line 282
    new-instance v1, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    const-string v2, "Use Count = "

    .line 285
    .line 286
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    :cond_9
    :goto_2
    return-void
.end method

.method public cleanUpOnTimer()V
    .locals 5

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
    if-eq v0, v1, :cond_9

    .line 8
    .line 9
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "cleanup on timer : "

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
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->dialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 43
    .line 44
    const-string v1, "CANCEL"

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->dialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->dialogId:Ljava/lang/String;

    .line 65
    .line 66
    :cond_1
    const/4 v0, 0x0

    .line 67
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->dialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 68
    .line 69
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 70
    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_2

    .line 82
    .line 83
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 84
    .line 85
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 89
    .line 90
    :cond_2
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 91
    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMergeId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->mergeId:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 101
    .line 102
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setTransaction(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setInviteTransaction(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const-string v3, "INVITE"

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-nez v2, :cond_4

    .line 121
    .line 122
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->originalRequestSentBy:Landroid/gov/nist/core/HostPort;

    .line 123
    .line 124
    if-nez v2, :cond_3

    .line 125
    .line 126
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 127
    .line 128
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getSentBy()Landroid/gov/nist/core/HostPort;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->originalRequestSentBy:Landroid/gov/nist/core/HostPort;

    .line 137
    .line 138
    :cond_3
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->originalRequestFromTag:Ljava/lang/String;

    .line 139
    .line 140
    if-nez v2, :cond_4

    .line 141
    .line 142
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 143
    .line 144
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->originalRequestFromTag:Ljava/lang/String;

    .line 149
    .line 150
    :cond_4
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 151
    .line 152
    if-nez v2, :cond_5

    .line 153
    .line 154
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    sget-object v4, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->Normal:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 159
    .line 160
    if-ne v2, v4, :cond_5

    .line 161
    .line 162
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransport()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v2, v4}, Landroid/gov/nist/javax/sip/message/SIPRequest;->encodeAsBytes(Ljava/lang/String;)[B

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBytes:[B

    .line 173
    .line 174
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-nez v2, :cond_6

    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-nez v1, :cond_6

    .line 193
    .line 194
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequest:Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 195
    .line 196
    :cond_6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 197
    .line 198
    if-eqz v1, :cond_8

    .line 199
    .line 200
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    sget-object v2, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->Normal:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 205
    .line 206
    if-ne v1, v2, :cond_7

    .line 207
    .line 208
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 209
    .line 210
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransport()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->encodeAsBytes(Ljava/lang/String;)[B

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 219
    .line 220
    :cond_7
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 221
    .line 222
    :cond_8
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseAsBytes:[B

    .line 223
    .line 224
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseMethod:Ljava/lang/String;

    .line 225
    .line 226
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingSubscribeTransaction:Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 227
    .line 228
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseSem:Ljava/util/concurrent/Semaphore;

    .line 229
    .line 230
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 231
    .line 232
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 233
    .line 234
    :cond_9
    return-void
.end method

.method public disableRetransmissionAlerts()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertEnabled:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertEnabled:Z

    .line 22
    .line 23
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 24
    .line 25
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;->dialogId:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 30
    .line 31
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->retransmissionAlertTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public enableRetransmissionAlerts()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertEnabled:Z

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "Request Method must be INVITE"

    .line 18
    .line 19
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const-string p0, "Dialog associated with tx"

    .line 24
    .line 25
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getBranch()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public fireRetransmissionTimer()V
    .locals 4

    .line 1
    const-string v0, "fireRetransmissionTimer() -- "

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    :try_start_0
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 5
    .line 6
    const/16 v3, 0x20

    .line 7
    .line 8
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    const-string v0, " state "

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    .line 45
    goto :goto_2

    .line 46
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    :cond_1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertEnabled:Z

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v2, Landroid/javax/sip/TimeoutEvent;

    .line 78
    .line 79
    sget-object v3, Landroid/javax/sip/Timeout;->RETRANSMIT:Landroid/javax/sip/Timeout;

    .line 80
    .line 81
    invoke-direct {v2, v0, p0, v3}, Landroid/javax/sip/TimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Timeout;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2, p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    :goto_1
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseStatusCode:I

    .line 89
    .line 90
    div-int/lit8 v0, v0, 0x64

    .line 91
    .line 92
    if-lt v0, v1, :cond_4

    .line 93
    .line 94
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->isAckSeen:Z

    .line 95
    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->resendLastResponseAsBytes()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    .line 100
    .line 101
    :cond_4
    return-void

    .line 102
    :goto_2
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 103
    .line 104
    invoke-interface {v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 111
    .line 112
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseErrorEvent(I)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public fireTimeoutTimer()V
    .locals 6

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "SIPServerTransaction.fireTimeoutTimer this = "

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
    const-string v3, " current state = "

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v3, " method = "

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 69
    .line 70
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 77
    .line 78
    const-string v1, "Found tx pending ACK - timer H has kicked"

    .line 79
    .line 80
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    const/4 v2, 0x1

    .line 98
    const/4 v3, 0x3

    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-ne v2, v1, :cond_3

    .line 112
    .line 113
    :cond_2
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v4, "BYE"

    .line 122
    .line 123
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_4

    .line 128
    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isTerminatedOnBye()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_4

    .line 136
    .line 137
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 138
    .line 139
    .line 140
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    const/4 v4, 0x5

    .line 145
    if-ne v3, v1, :cond_5

    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseErrorEvent(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 160
    .line 161
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-ne v3, v1, :cond_7

    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_7

    .line 176
    .line 177
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const-string v1, "CANCEL"

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-nez v0, :cond_6

    .line 191
    .line 192
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->cleanUp()V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 197
    .line 198
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    const/4 v5, 0x4

    .line 207
    if-ne v5, v1, :cond_8

    .line 208
    .line 209
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_8

    .line 214
    .line 215
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 216
    .line 217
    .line 218
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 219
    .line 220
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_a

    .line 229
    .line 230
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eq v3, v1, :cond_9

    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-ne v5, v1, :cond_a

    .line 241
    .line 242
    :cond_9
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_a
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_b

    .line 251
    .line 252
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-ne v4, v1, :cond_b

    .line 257
    .line 258
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseErrorEvent(I)V

    .line 259
    .line 260
    .line 261
    if-eqz v0, :cond_b

    .line 262
    .line 263
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 264
    .line 265
    .line 266
    :cond_b
    return-void
.end method

.method public getCanceledInviteTransaction()Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;
    .locals 0

    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    return-object p0
.end method

.method public bridge synthetic getCanceledInviteTransaction()Landroid/javax/sip/ServerTransaction;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getCanceledInviteTransaction()Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDialog()Landroid/javax/sip/Dialog;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->dialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->dialogId:Ljava/lang/String;

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

.method public getLastResponseStatusCode()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseStatusCode:I

    .line 2
    .line 3
    return p0
.end method

.method public getPendingReliableCSeqNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableCSeqNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getPendingReliableRSeqNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableRSeqNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getPendingReliableResponseMethod()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseMethod:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRealState()I
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public getReliableProvisionalResponse()[B
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseAsBytes:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public getResponseChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 2
    .line 3
    return-object p0
.end method

.method public getState()Landroid/javax/sip/TransactionState;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    sget-object p0, Landroid/javax/sip/TransactionState;->PROCEEDING:Landroid/javax/sip/TransactionState;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public getViaHost()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getViaHost()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getViaPort()I
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getViaPort()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z
    .locals 13

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isTerminated()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_11

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_11

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-string v6, "z9hg4bk"

    .line 43
    .line 44
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    :cond_1
    const-string v5, "CANCEL"

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    if-eqz v4, :cond_7

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    if-eqz v7, :cond_7

    .line 61
    .line 62
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getSentBy()Landroid/gov/nist/core/HostPort;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/Via;->getSentBy()Landroid/gov/nist/core/HostPort;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/HostPort;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_2

    .line 105
    .line 106
    return v6

    .line 107
    :cond_2
    return v3

    .line 108
    :cond_3
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_4

    .line 119
    .line 120
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getSentBy()Landroid/gov/nist/core/HostPort;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/Via;->getSentBy()Landroid/gov/nist/core/HostPort;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/HostPort;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_4

    .line 137
    .line 138
    return v6

    .line 139
    :cond_4
    return v3

    .line 140
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_6

    .line 149
    .line 150
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getSentBy()Landroid/gov/nist/core/HostPort;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->originalRequestSentBy:Landroid/gov/nist/core/HostPort;

    .line 155
    .line 156
    invoke-virtual {p1, p0}, Landroid/gov/nist/core/HostPort;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-eqz p0, :cond_6

    .line 161
    .line 162
    return v6

    .line 163
    :cond_6
    return v3

    .line 164
    :cond_7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getRequest()Landroid/javax/sip/message/Request;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-interface {v4}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    if-eqz v1, :cond_9

    .line 183
    .line 184
    if-nez v4, :cond_8

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_8
    move v7, v3

    .line 188
    goto :goto_1

    .line 189
    :cond_9
    :goto_0
    move v7, v6

    .line 190
    :goto_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-interface {v9}, Landroid/javax/sip/header/ToHeader;->getTag()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    if-eqz v8, :cond_b

    .line 203
    .line 204
    if-nez v9, :cond_a

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_a
    move v10, v3

    .line 208
    goto :goto_3

    .line 209
    :cond_b
    :goto_2
    move v10, v6

    .line 210
    :goto_3
    instance-of v11, p1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 211
    .line 212
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    invoke-interface {v12}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    invoke-virtual {v12, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    if-eqz v12, :cond_c

    .line 225
    .line 226
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    invoke-interface {v12}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    invoke-virtual {v12, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result v12

    .line 238
    if-nez v12, :cond_c

    .line 239
    .line 240
    return v3

    .line 241
    :cond_c
    if-nez v11, :cond_d

    .line 242
    .line 243
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    move-object v12, p1

    .line 248
    check-cast v12, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 249
    .line 250
    invoke-virtual {v12}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    if-eqz v11, :cond_11

    .line 259
    .line 260
    :cond_d
    if-nez v7, :cond_e

    .line 261
    .line 262
    if-eqz v1, :cond_11

    .line 263
    .line 264
    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_11

    .line 269
    .line 270
    :cond_e
    if-nez v10, :cond_f

    .line 271
    .line 272
    if-eqz v8, :cond_11

    .line 273
    .line 274
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_11

    .line 279
    .line 280
    :cond_f
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-interface {v1}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-interface {v4}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_11

    .line 301
    .line 302
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 307
    .line 308
    .line 309
    move-result-wide v7

    .line 310
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 315
    .line 316
    .line 317
    move-result-wide v9

    .line 318
    cmp-long v1, v7, v9

    .line 319
    .line 320
    if-nez v1, :cond_11

    .line 321
    .line 322
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-eqz v1, :cond_10

    .line 335
    .line 336
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-interface {p1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result p0

    .line 352
    if-eqz p0, :cond_11

    .line 353
    .line 354
    :cond_10
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-virtual {v2, p0}, Landroid/gov/nist/javax/sip/header/Via;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result p0

    .line 362
    if-eqz p0, :cond_11

    .line 363
    .line 364
    return v6

    .line 365
    :cond_11
    return v3
.end method

.method public isRetransmissionAlertEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public map()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isMapped:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isMapped:Z

    .line 29
    .line 30
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$SendTrying;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$SendTrying;-><init>(Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v2, 0xc8

    .line 42
    .line 43
    invoke-interface {v0, v1, v2, v3}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isMapped:Z

    .line 48
    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removePendingTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public prackRecieved()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseAsBytes:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;

    .line 19
    .line 20
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;

    .line 24
    .line 25
    :cond_1
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseAsBytes:[B

    .line 26
    .line 27
    sget-boolean v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->interlockProvisionalResponses:Z

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseSem:Ljava/util/concurrent/Semaphore;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 40
    .line 41
    .line 42
    :cond_2
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V
    .locals 8

    .line 1
    const-string p2, "Dropping request "

    .line 2
    .line 3
    const-string v0, "completed processing retransmitted request : "

    .line 4
    .line 5
    const-string v1, "ACK received for server Tx "

    .line 6
    .line 7
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 18
    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v5, "processRequest: "

    .line 22
    .line 23
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 41
    .line 42
    new-instance v4, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v5, "tx state = "

    .line 45
    .line 46
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 64
    .line 65
    .line 66
    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    const/4 v4, 0x5

    .line 68
    const-string v5, "ACK"

    .line 69
    .line 70
    const/4 v6, 0x3

    .line 71
    const/4 v7, 0x1

    .line 72
    if-gez v2, :cond_2

    .line 73
    .line 74
    :try_start_1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v7}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->setPassToListener()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isMapped:Z

    .line 90
    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    const-string v0, "Trying"

    .line 94
    .line 95
    const/16 v1, 0x64

    .line 96
    .line 97
    invoke-virtual {p1, v1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(ILjava/lang/String;)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catch_0
    move-exception p1

    .line 106
    goto/16 :goto_7

    .line 107
    .line 108
    :cond_1
    :goto_0
    move v0, v7

    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-ne v6, v2, :cond_6

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_6

    .line 132
    .line 133
    const/4 p2, 0x4

    .line 134
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->disableRetransmissionTimer()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-nez p2, :cond_3

    .line 145
    .line 146
    iget p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->timerI:I

    .line 147
    .line 148
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->enableTimeoutTimer(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 153
    .line 154
    .line 155
    :goto_1
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 156
    .line 157
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isNon2XXAckPassedToListener()Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_4

    .line 162
    .line 163
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 164
    .line 165
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 166
    .line 167
    invoke-interface {p2, p1, v0}, Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;->processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_4
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 172
    .line 173
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_5

    .line 178
    .line 179
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 180
    .line 181
    new-instance p2, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransactionId()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v0, " not delivering to application!"

    .line 194
    .line 195
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :cond_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_6
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_b

    .line 222
    .line 223
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    const/4 v1, 0x2

    .line 228
    if-eq v1, p2, :cond_a

    .line 229
    .line 230
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    if-ne v6, p2, :cond_7

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    if-eqz p2, :cond_9

    .line 246
    .line 247
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 248
    .line 249
    if-eqz p2, :cond_8

    .line 250
    .line 251
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 252
    .line 253
    invoke-interface {p2, p1, v1}, Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;->processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 262
    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_a
    :goto_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->resendLastResponseAsBytes()V

    .line 269
    .line 270
    .line 271
    :goto_3
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 272
    .line 273
    invoke-interface {p2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_17

    .line 278
    .line 279
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 280
    .line 281
    new-instance v1, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string p1, " txState = "

    .line 297
    .line 298
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const-string p1, " lastResponse = "

    .line 309
    .line 310
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 314
    .line 315
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-interface {p2, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :cond_b
    const/4 v0, 0x0

    .line 327
    :goto_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-eq v6, v1, :cond_f

    .line 332
    .line 333
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-eq v4, v1, :cond_f

    .line 338
    .line 339
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 340
    .line 341
    if-eqz v1, :cond_f

    .line 342
    .line 343
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result p2

    .line 355
    if-eqz p2, :cond_d

    .line 356
    .line 357
    if-eqz v0, :cond_c

    .line 358
    .line 359
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 360
    .line 361
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 362
    .line 363
    invoke-interface {p2, p1, v0}, Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;->processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 364
    .line 365
    .line 366
    goto/16 :goto_8

    .line 367
    .line 368
    :cond_c
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_8

    .line 372
    .line 373
    :cond_d
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 374
    .line 375
    if-eqz p2, :cond_e

    .line 376
    .line 377
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 378
    .line 379
    invoke-interface {p2, p1, v0}, Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;->processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_8

    .line 383
    .line 384
    :cond_e
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_8

    .line 388
    .line 389
    :cond_f
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-eqz v0, :cond_13

    .line 398
    .line 399
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-ne v0, v4, :cond_13

    .line 404
    .line 405
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_13

    .line 414
    .line 415
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 416
    .line 417
    if-eqz v0, :cond_13

    .line 418
    .line 419
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 424
    .line 425
    if-eqz v0, :cond_11

    .line 426
    .line 427
    iget-boolean v1, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackProcessed:Z

    .line 428
    .line 429
    if-nez v1, :cond_10

    .line 430
    .line 431
    goto :goto_5

    .line 432
    :cond_10
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 433
    .line 434
    .line 435
    goto :goto_6

    .line 436
    :cond_11
    :goto_5
    if-eqz v0, :cond_12

    .line 437
    .line 438
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 443
    .line 444
    .line 445
    move-result-wide v1

    .line 446
    invoke-virtual {v0, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackReceived(J)V

    .line 447
    .line 448
    .line 449
    iput-boolean v7, v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;->ackProcessed:Z

    .line 450
    .line 451
    :cond_12
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 452
    .line 453
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->encapsulatedChannel:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 454
    .line 455
    invoke-interface {v0, p1, v1}, Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;->processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V

    .line 456
    .line 457
    .line 458
    goto :goto_6

    .line 459
    :cond_13
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    const-string v1, "CANCEL"

    .line 464
    .line 465
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_15

    .line 470
    .line 471
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 472
    .line 473
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_14

    .line 478
    .line 479
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 480
    .line 481
    const-string v1, "Too late to cancel Transaction"

    .line 482
    .line 483
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    :cond_14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 487
    .line 488
    .line 489
    const/16 v0, 0xc8

    .line 490
    .line 491
    :try_start_2
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 496
    .line 497
    .line 498
    goto :goto_6

    .line 499
    :cond_15
    :try_start_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 500
    .line 501
    .line 502
    :catch_1
    :goto_6
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 503
    .line 504
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 505
    .line 506
    .line 507
    move-result p1

    .line 508
    if-eqz p1, :cond_17

    .line 509
    .line 510
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 511
    .line 512
    new-instance v0, Ljava/lang/StringBuilder;

    .line 513
    .line 514
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getRealState()I

    .line 518
    .line 519
    .line 520
    move-result p2

    .line 521
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object p2

    .line 528
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 529
    .line 530
    .line 531
    goto :goto_8

    .line 532
    :goto_7
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 533
    .line 534
    invoke-interface {p2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 535
    .line 536
    .line 537
    move-result p2

    .line 538
    if-eqz p2, :cond_16

    .line 539
    .line 540
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 541
    .line 542
    const-string v0, "IOException "

    .line 543
    .line 544
    invoke-interface {p2, v0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 545
    .line 546
    .line 547
    :cond_16
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->semRelease()V

    .line 548
    .line 549
    .line 550
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseIOExceptionEvent()V

    .line 551
    .line 552
    .line 553
    :cond_17
    :goto_8
    return-void
.end method

.method public releaseSem()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingSubscribeTransaction:Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDeliverUnsolicitedNotify()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingSubscribeTransaction:Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 14
    .line 15
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->releaseSem()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "CANCEL"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 36
    .line 37
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->releaseSem()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public resendLastResponseAsBytes()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 4
    .line 5
    const-string v2, "resend last response "

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 27
    .line 28
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 45
    .line 46
    if-eqz v0, :cond_7

    .line 47
    .line 48
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 49
    .line 50
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 57
    .line 58
    new-instance v4, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v5, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 61
    .line 62
    invoke-direct {v4, v5}, Ljava/lang/String;-><init>([B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const-string v2, "couldn\'t reparse last response "

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    const/4 v5, 0x1

    .line 80
    const/16 v6, 0x10

    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 86
    .line 87
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    :try_start_0
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageParserFactory()Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v6, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 100
    .line 101
    invoke-interface {v0, v6}, Landroid/gov/nist/javax/sip/parser/MessageParserFactory;->createMessageParser(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v6, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 106
    .line 107
    invoke-interface {v0, v6, v5, v7, v4}, Landroid/gov/nist/javax/sip/parser/MessageParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    move-object v9, v0

    .line 112
    check-cast v9, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 113
    .line 114
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPeerInetAddress()Ljava/net/InetAddress;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v9, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setRemoteAddress(Ljava/net/InetAddress;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPeerPort()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-virtual {v9, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setRemotePort(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPort()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    invoke-virtual {v9, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setLocalPort(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v9, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setLocalAddress(Ljava/net/InetAddress;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPeerInetAddress()Ljava/net/InetAddress;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPeerPort()I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 167
    .line 168
    .line 169
    move-result-wide v12

    .line 170
    invoke-virtual/range {v8 .. v13}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->logMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/net/InetAddress;IJ)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :catch_0
    move-exception v0

    .line 175
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 176
    .line 177
    invoke-interface {v4, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-eqz v3, :cond_3

    .line 182
    .line 183
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 184
    .line 185
    new-instance v4, Ljava/lang/String;

    .line 186
    .line 187
    iget-object v5, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 188
    .line 189
    invoke-direct {v4, v5}, Ljava/lang/String;-><init>([B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-interface {v3, v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 197
    .line 198
    .line 199
    :cond_3
    :goto_0
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 204
    .line 205
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPeerInetAddress()Ljava/net/InetAddress;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPeerPort()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    invoke-virtual {v0, v2, v3, v1, v7}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage([BLjava/net/InetAddress;IZ)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_2

    .line 217
    .line 218
    :cond_4
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 219
    .line 220
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addressResolver:Landroid/gov/nist/core/net/AddressResolver;

    .line 221
    .line 222
    new-instance v8, Landroid/gov/nist/javax/sip/stack/HopImpl;

    .line 223
    .line 224
    iget-object v9, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseHost:Ljava/lang/String;

    .line 225
    .line 226
    iget v10, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponsePort:I

    .line 227
    .line 228
    iget-object v11, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseTransport:Ljava/lang/String;

    .line 229
    .line 230
    invoke-direct {v8, v9, v10, v11}, Landroid/gov/nist/javax/sip/stack/HopImpl;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v0, v8}, Landroid/gov/nist/core/net/AddressResolver;->resolveAddress(Landroid/javax/sip/address/Hop;)Landroid/javax/sip/address/Hop;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    invoke-interface {v8}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    invoke-virtual {v9, v10}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-interface {v9}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPort()I

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    invoke-virtual {v0, v9, v10, v8}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createRawMessageChannel(Ljava/lang/String;ILandroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    if-eqz v11, :cond_6

    .line 266
    .line 267
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 268
    .line 269
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_5

    .line 274
    .line 275
    :try_start_1
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 276
    .line 277
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageParserFactory()Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    iget-object v6, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 282
    .line 283
    invoke-interface {v0, v6}, Landroid/gov/nist/javax/sip/parser/MessageParserFactory;->createMessageParser(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    iget-object v6, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 288
    .line 289
    invoke-interface {v0, v6, v5, v7, v4}, Landroid/gov/nist/javax/sip/parser/MessageParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    move-object v12, v0

    .line 294
    check-cast v12, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 295
    .line 296
    invoke-virtual {v11}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPeerInetAddress()Ljava/net/InetAddress;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v12, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setRemoteAddress(Ljava/net/InetAddress;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v11}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPeerPort()I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-virtual {v12, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setRemotePort(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v11}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPort()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    invoke-virtual {v12, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setLocalPort(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v11}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v12, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setLocalAddress(Ljava/net/InetAddress;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v11}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPeerInetAddress()Ljava/net/InetAddress;

    .line 329
    .line 330
    .line 331
    move-result-object v13

    .line 332
    invoke-virtual {v11}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPeerPort()I

    .line 333
    .line 334
    .line 335
    move-result v14

    .line 336
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 337
    .line 338
    .line 339
    move-result-wide v15

    .line 340
    invoke-virtual/range {v11 .. v16}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->logMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/net/InetAddress;IJ)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    .line 341
    .line 342
    .line 343
    goto :goto_1

    .line 344
    :catch_1
    move-exception v0

    .line 345
    sget-object v4, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 346
    .line 347
    invoke-interface {v4, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-eqz v3, :cond_5

    .line 352
    .line 353
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 354
    .line 355
    new-instance v4, Ljava/lang/String;

    .line 356
    .line 357
    iget-object v5, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 358
    .line 359
    invoke-direct {v4, v5}, Ljava/lang/String;-><init>([B)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-interface {v3, v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 367
    .line 368
    .line 369
    :cond_5
    :goto_1
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    .line 370
    .line 371
    invoke-interface {v8}, Landroid/javax/sip/address/Hop;->getHost()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-interface {v8}, Landroid/javax/sip/address/Hop;->getPort()I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    invoke-virtual {v11, v0, v1, v2, v7}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage([BLjava/net/InetAddress;IZ)V

    .line 384
    .line 385
    .line 386
    goto :goto_2

    .line 387
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 388
    .line 389
    new-instance v2, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    const-string v3, "Could not create a message channel for "

    .line 392
    .line 393
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-interface {v8}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-interface {v3}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPort()I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    const-string v4, " with source IP:Port "

    .line 420
    .line 421
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    const-string v3, ":"

    .line 428
    .line 429
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v0

    .line 443
    :cond_7
    :goto_2
    return-void
.end method

.method public scheduleAckRemoval()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "ACK"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimer()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v2, "Method is null["

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/4 v2, 0x0

    .line 42
    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, "] or method is not ACK["

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, "]"

    .line 58
    .line 59
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0
.end method

.method public sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 5

    .line 1
    const-string v0, "sendMessage : tx = "

    .line 2
    .line 3
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "sipServerTransaction::sendMessage "

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFirstLine()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    :try_start_0
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestBranch:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getBranch()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sip/header/Via;->setBranch(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-string v4, "branch"

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->removeParameter(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-boolean v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->originalRequestHasPort:Z

    .line 74
    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/Via;->removePort()V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    :cond_2
    :try_start_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {v3}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_3

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->sendResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimer()V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    :try_start_2
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->checkStateTimers(I)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_5

    .line 114
    .line 115
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 116
    .line 117
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_4

    .line 122
    .line 123
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 124
    .line 125
    const-string v0, "checkStateTimers returned false -- not sending message"

    .line 126
    .line 127
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    .line 129
    .line 130
    :cond_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimer()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_5
    :try_start_3
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 135
    .line 136
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 143
    .line 144
    new-instance v2, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v0, " getState = "

    .line 153
    .line 154
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getState()Landroid/javax/sip/TransactionState;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :catch_1
    move-exception p1

    .line 173
    goto :goto_2

    .line 174
    :cond_6
    :goto_1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 175
    .line 176
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseStatusCode:I

    .line 181
    .line 182
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->sendResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimer()V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :goto_2
    const/4 v0, 0x5

    .line 190
    :try_start_4
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 191
    .line 192
    .line 193
    const/4 v0, 0x0

    .line 194
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->collectionTime:I

    .line 195
    .line 196
    throw p1

    .line 197
    :goto_3
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 198
    .line 199
    const-string v1, "UnexpectedException"

    .line 200
    .line 201
    invoke-interface {v0, v1, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 202
    .line 203
    .line 204
    new-instance p1, Ljava/io/IOException;

    .line 205
    .line 206
    const-string v0, "Unexpected exception"

    .line 207
    .line 208
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 212
    :goto_4
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimer()V

    .line 213
    .line 214
    .line 215
    throw p1
.end method

.method public sendReliableProvisionalResponse(Landroid/javax/sip/message/Response;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseAsBytes:[B

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransport()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->encodeAsBytes(Ljava/lang/String;)[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseAsBytes:[B

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseMethod:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableCSeqNumber:J

    .line 37
    .line 38
    const-string v0, "RSeq"

    .line 39
    .line 40
    invoke-interface {p1, v0}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Landroid/gov/nist/javax/sip/header/RSeq;

    .line 45
    .line 46
    invoke-interface {p1, v0}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_0

    .line 51
    .line 52
    new-instance v1, Landroid/gov/nist/javax/sip/header/RSeq;

    .line 53
    .line 54
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/RSeq;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v1}, Landroid/javax/sip/message/Message;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    :try_start_0
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->rseqNumber:I

    .line 61
    .line 62
    if-gez v0, :cond_1

    .line 63
    .line 64
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    mul-double/2addr v2, v4

    .line 74
    double-to-int v0, v2

    .line 75
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->rseqNumber:I

    .line 76
    .line 77
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->rseqNumber:I

    .line 80
    .line 81
    int-to-long v2, v0

    .line 82
    invoke-virtual {v1, v2, v3}, Landroid/gov/nist/javax/sip/header/RSeq;->setSeqNumber(J)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/RSeq;->getSeqNumber()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableRSeqNumber:J

    .line 90
    .line 91
    move-object v0, p1

    .line 92
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 93
    .line 94
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    sget-boolean v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->interlockProvisionalResponses:Z

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseSem:Ljava/util/concurrent/Semaphore;

    .line 107
    .line 108
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 109
    .line 110
    const-wide/16 v2, 0x1

    .line 111
    .line 112
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    new-instance p0, Landroid/javax/sip/SipException;

    .line 120
    .line 121
    const-string p1, "Unacknowledged reliable response"

    .line 122
    .line 123
    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :cond_3
    :goto_0
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;

    .line 128
    .line 129
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;

    .line 133
    .line 134
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;

    .line 141
    .line 142
    const-wide/16 v3, 0x0

    .line 143
    .line 144
    const-wide/16 v5, 0x1f4

    .line 145
    .line 146
    invoke-interface/range {v1 .. v6}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->scheduleWithFixedDelay(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;JJ)Z

    .line 147
    .line 148
    .line 149
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :catch_0
    move-exception v0

    .line 156
    move-object p0, v0

    .line 157
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_4
    const-string p0, "Unacknowledged response"

    .line 162
    .line 163
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public sendResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;)V
    .locals 8

    .line 764
    const-string v0, "Could not create a message channel for "

    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v2, 0x20

    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 765
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "sipServerTransaction::sendResponse "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getFirstLine()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 766
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isReliable()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isPatchReceivedRport()Z

    move-result v1

    if-nez v1, :cond_1

    .line 767
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    .line 768
    :cond_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    move-result-object v1

    .line 769
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 770
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->getRPort()I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    .line 771
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    move-result v3

    :cond_2
    if-ne v3, v4, :cond_4

    .line 772
    const-string v3, "TLS"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x13c5

    goto :goto_0

    :cond_3
    const/16 v3, 0x13c4

    .line 773
    :cond_4
    :goto_0
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->getMAddr()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 774
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->getMAddr()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 775
    :cond_5
    const-string v4, "received"

    invoke-virtual {v1, v4}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    .line 776
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->getHost()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_6
    move-object v1, v4

    .line 777
    :goto_1
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    iget-object v4, v4, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addressResolver:Landroid/gov/nist/core/net/AddressResolver;

    new-instance v5, Landroid/gov/nist/javax/sip/stack/HopImpl;

    invoke-direct {v5, v1, v3, v2}, Landroid/gov/nist/javax/sip/stack/HopImpl;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v4, v5}, Landroid/gov/nist/core/net/AddressResolver;->resolveAddress(Landroid/javax/sip/address/Hop;)Landroid/javax/sip/address/Hop;

    move-result-object v4

    .line 778
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    move-result-object v5

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    move-result-object v6

    invoke-interface {v4}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    move-result-object v6

    invoke-interface {v6}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPort()I

    move-result v7

    invoke-virtual {v5, v6, v7, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createRawMessageChannel(Ljava/lang/String;ILandroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    move-result-object v5

    if-eqz v5, :cond_7

    .line 779
    invoke-virtual {v5, p1}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 780
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseHost:Ljava/lang/String;

    .line 781
    iput v3, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponsePort:I

    .line 782
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseTransport:Ljava/lang/String;

    .line 783
    :goto_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransport()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->encodeAsBytes(Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->lastResponseAsBytes:[B

    const/4 p1, 0x0

    .line 784
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->lastResponse:Landroid/gov/nist/javax/sip/message/SIPResponse;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 785
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimer()V

    return-void

    .line 786
    :cond_7
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with source IP:Port "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    move-result-object v0

    invoke-interface {v4}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    move-result-object v0

    invoke-interface {v0}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPort()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 787
    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "missing transport!"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 788
    :goto_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->startTransactionTimer()V

    throw p1
.end method

.method public sendResponse(Landroid/javax/sip/message/Response;)V
    .locals 14

    .line 1
    const-string v0, "Tag mismatch dialogTag is "

    .line 2
    .line 3
    const-string v1, "assigning toTag : serverTransaction = "

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    check-cast v2, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    check-cast v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 13
    .line 14
    if-eqz p1, :cond_1c

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->checkHeaders()V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_3

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {v4}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_1b

    .line 36
    .line 37
    invoke-interface {p1}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-string v7, "SUBSCRIBE"

    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    const/4 v7, 0x2

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    div-int/lit8 v6, v5, 0x64

    .line 55
    .line 56
    if-ne v6, v7, :cond_2

    .line 57
    .line 58
    const-string v6, "Expires"

    .line 59
    .line 60
    invoke-interface {p1, v6}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getExpires()Landroid/javax/sip/header/ExpiresHeader;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    check-cast v6, Landroid/gov/nist/javax/sip/header/Expires;

    .line 75
    .line 76
    invoke-interface {p1}, Landroid/javax/sip/message/Message;->getExpires()Landroid/javax/sip/header/ExpiresHeader;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    check-cast v8, Landroid/gov/nist/javax/sip/header/Expires;

    .line 81
    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/header/Expires;->getExpires()I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/header/Expires;->getExpires()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-gt v8, v6, :cond_0

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const-string p0, "Response Expires time exceeds request Expires time : See RFC 3265 3.1.1"

    .line 96
    .line 97
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_1
    new-instance p0, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;

    .line 102
    .line 103
    const-string p1, "Expires header is mandatory in 2xx response of SUBSCRIBE"

    .line 104
    .line 105
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;->ExpiresHeaderMandatory:Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;

    .line 106
    .line 107
    invoke-direct {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;-><init>(Ljava/lang/String;Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;)V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_2
    :goto_0
    const/16 v6, 0xc8

    .line 112
    .line 113
    if-ne v5, v6, :cond_4

    .line 114
    .line 115
    const-string v6, "INVITE"

    .line 116
    .line 117
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_4

    .line 122
    .line 123
    const-string v6, "Contact"

    .line 124
    .line 125
    invoke-virtual {v2, v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    new-instance p0, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;

    .line 133
    .line 134
    const-string p1, "Contact Header is mandatory for the OK to the INVITE"

    .line 135
    .line 136
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;->ContactHeaderMandatory:Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;

    .line 137
    .line 138
    invoke-direct {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;-><init>(Ljava/lang/String;Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;)V

    .line 139
    .line 140
    .line 141
    throw p0

    .line 142
    :cond_4
    :goto_1
    move-object v6, p1

    .line 143
    check-cast v6, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 144
    .line 145
    invoke-virtual {p0, v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->isMessagePartOfTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-eqz v6, :cond_1a

    .line 150
    .line 151
    const/4 v6, 0x5

    .line 152
    :try_start_1
    move-object v8, p1

    .line 153
    check-cast v8, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 154
    .line 155
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentTypeHeader()Landroid/gov/nist/javax/sip/header/ContentType;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    iget-object v9, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseAsBytes:[B

    .line 160
    .line 161
    if-eqz v9, :cond_7

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->getDialog()Landroid/javax/sip/Dialog;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    if-eqz v9, :cond_7

    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getInternalState()I

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-eq v9, v6, :cond_7

    .line 174
    .line 175
    div-int/lit8 v9, v5, 0x64

    .line 176
    .line 177
    if-ne v9, v7, :cond_7

    .line 178
    .line 179
    if-eqz v8, :cond_7

    .line 180
    .line 181
    invoke-interface {v8}, Landroid/javax/sip/header/MediaType;->getContentType()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    const-string v10, "application"

    .line 186
    .line 187
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-eqz v9, :cond_7

    .line 192
    .line 193
    invoke-interface {v8}, Landroid/javax/sip/header/MediaType;->getContentSubType()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    const-string v9, "sdp"

    .line 198
    .line 199
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-eqz v8, :cond_7

    .line 204
    .line 205
    sget-boolean v8, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->interlockProvisionalResponses:Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 206
    .line 207
    const-string v9, "cannot send response -- unacked provisional"

    .line 208
    .line 209
    if-eqz v8, :cond_6

    .line 210
    .line 211
    :try_start_2
    iget-object v8, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseSem:Ljava/util/concurrent/Semaphore;

    .line 212
    .line 213
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 214
    .line 215
    const-wide/16 v11, 0x1

    .line 216
    .line 217
    invoke-virtual {v8, v11, v12, v10}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-eqz v8, :cond_5

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_5
    new-instance p1, Landroid/javax/sip/SipException;

    .line 225
    .line 226
    invoke-direct {p1, v9}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0

    .line 230
    :catch_0
    move-exception v0

    .line 231
    move-object p1, v0

    .line 232
    goto/16 :goto_8

    .line 233
    .line 234
    :catch_1
    move-exception v0

    .line 235
    move-object p1, v0

    .line 236
    goto/16 :goto_9

    .line 237
    .line 238
    :catch_2
    :try_start_3
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 239
    .line 240
    const-string v0, "Interrupted acuqiring PRACK sem"

    .line 241
    .line 242
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    new-instance p1, Landroid/javax/sip/SipException;

    .line 246
    .line 247
    const-string v0, "Cannot aquire PRACK sem"

    .line 248
    .line 249
    invoke-direct {p1, v0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw p1

    .line 253
    :cond_6
    new-instance p1, Landroid/javax/sip/SipException;

    .line 254
    .line 255
    invoke-direct {p1, v9}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw p1

    .line 259
    :cond_7
    iget-object v8, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingReliableResponseAsBytes:[B

    .line 260
    .line 261
    if-eqz v8, :cond_8

    .line 262
    .line 263
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->isFinalResponse()Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-eqz v8, :cond_8

    .line 268
    .line 269
    iget-object v8, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 270
    .line 271
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    iget-object v9, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;

    .line 276
    .line 277
    invoke-interface {v8, v9}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 278
    .line 279
    .line 280
    const/4 v8, 0x0

    .line 281
    iput-object v8, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->provisionalResponseTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;

    .line 282
    .line 283
    :cond_8
    :goto_2
    const/16 v8, 0x20

    .line 284
    .line 285
    if-eqz v3, :cond_f

    .line 286
    .line 287
    div-int/lit8 v9, v5, 0x64

    .line 288
    .line 289
    if-ne v9, v7, :cond_d

    .line 290
    .line 291
    invoke-static {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    if-eqz v4, :cond_d

    .line 296
    .line 297
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    if-nez v4, :cond_9

    .line 302
    .line 303
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    if-nez v4, :cond_9

    .line 308
    .line 309
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-static {}, Landroid/gov/nist/javax/sip/Utils;->getInstance()Landroid/gov/nist/javax/sip/Utils;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/Utils;->generateTag()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-interface {v0, v1}, Landroid/javax/sip/header/ToHeader;->setTag(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_3

    .line 325
    .line 326
    :cond_9
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    if-eqz v4, :cond_b

    .line 331
    .line 332
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    if-nez v4, :cond_b

    .line 337
    .line 338
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 339
    .line 340
    invoke-interface {v0, v8}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-eqz v0, :cond_a

    .line 345
    .line 346
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 347
    .line 348
    new-instance v4, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const-string v1, " dialog "

    .line 357
    .line 358
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    const-string v1, " tag = "

    .line 365
    .line 366
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    :cond_a
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setToTag(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    goto :goto_3

    .line 391
    :cond_b
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    if-eqz v1, :cond_d

    .line 396
    .line 397
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    if-eqz v1, :cond_d

    .line 402
    .line 403
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v1

    .line 415
    if-eqz v1, :cond_c

    .line 416
    .line 417
    goto :goto_3

    .line 418
    :cond_c
    new-instance p1, Landroid/javax/sip/SipException;

    .line 419
    .line 420
    new-instance v1, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    const-string v0, " responseTag is "

    .line 433
    .line 434
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-direct {p1, v0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw p1

    .line 452
    :cond_d
    :goto_3
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-interface {v0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-interface {v1}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-eqz v0, :cond_e

    .line 473
    .line 474
    goto :goto_4

    .line 475
    :cond_e
    new-instance p1, Landroid/javax/sip/SipException;

    .line 476
    .line 477
    const-string v0, "Dialog mismatch!"

    .line 478
    .line 479
    invoke-direct {p1, v0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw p1

    .line 483
    :cond_f
    :goto_4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->originalRequestFromTag:Ljava/lang/String;

    .line 484
    .line 485
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getRequest()Landroid/javax/sip/message/Request;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    if-eqz v1, :cond_10

    .line 490
    .line 491
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getRequest()Landroid/javax/sip/message/Request;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 496
    .line 497
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    :cond_10
    if-eqz v0, :cond_12

    .line 502
    .line 503
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    if-eqz v1, :cond_12

    .line 508
    .line 509
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    if-eqz v1, :cond_11

    .line 518
    .line 519
    goto :goto_5

    .line 520
    :cond_11
    new-instance p1, Landroid/javax/sip/SipException;

    .line 521
    .line 522
    const-string v0, "From tag of request does not match response from tag"

    .line 523
    .line 524
    invoke-direct {p1, v0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    throw p1

    .line 528
    :cond_12
    :goto_5
    if-eqz v0, :cond_13

    .line 529
    .line 530
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-interface {v1, v0}, Landroid/javax/sip/header/FromHeader;->setTag(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    goto :goto_6

    .line 538
    :cond_13
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 539
    .line 540
    invoke-interface {v0, v8}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    if-eqz v0, :cond_14

    .line 545
    .line 546
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 547
    .line 548
    const-string v1, "WARNING -- Null From tag in request!!"

    .line 549
    .line 550
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    :cond_14
    :goto_6
    const/16 v0, 0x64

    .line 554
    .line 555
    if-eqz v3, :cond_15

    .line 556
    .line 557
    if-eq v5, v0, :cond_15

    .line 558
    .line 559
    invoke-virtual {v3, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setResponseTags(Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    move-object v1, p1

    .line 567
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 568
    .line 569
    invoke-virtual {v3, p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 570
    .line 571
    .line 572
    if-nez v0, :cond_16

    .line 573
    .line 574
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    sget-object v1, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 579
    .line 580
    if-ne v0, v1, :cond_16

    .line 581
    .line 582
    new-instance v0, Landroid/javax/sip/DialogTerminatedEvent;

    .line 583
    .line 584
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-direct {v0, v1, v3}, Landroid/javax/sip/DialogTerminatedEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/Dialog;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    invoke-virtual {v1, v0, p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 596
    .line 597
    .line 598
    goto :goto_7

    .line 599
    :cond_15
    if-nez v3, :cond_16

    .line 600
    .line 601
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isInviteTransaction()Z

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    if-eqz v1, :cond_16

    .line 606
    .line 607
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertEnabled:Z

    .line 608
    .line 609
    if-eqz v1, :cond_16

    .line 610
    .line 611
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 612
    .line 613
    if-nez v1, :cond_16

    .line 614
    .line 615
    invoke-interface {p1}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    div-int/2addr v1, v0

    .line 620
    if-ne v1, v7, :cond_16

    .line 621
    .line 622
    move-object v0, p1

    .line 623
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 624
    .line 625
    const/4 v1, 0x1

    .line 626
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    new-instance v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 631
    .line 632
    invoke-direct {v1, p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;-><init>(Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 636
    .line 637
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 638
    .line 639
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->retransmissionAlertTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 640
    .line 641
    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 645
    .line 646
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 647
    .line 648
    .line 649
    move-result-object v8

    .line 650
    iget-object v9, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 651
    .line 652
    const-wide/16 v10, 0x0

    .line 653
    .line 654
    const-wide/16 v12, 0x1f4

    .line 655
    .line 656
    invoke-interface/range {v8 .. v13}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->scheduleWithFixedDelay(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;JJ)Z

    .line 657
    .line 658
    .line 659
    :cond_16
    :goto_7
    move-object v0, p1

    .line 660
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 661
    .line 662
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 663
    .line 664
    .line 665
    if-eqz v3, :cond_17

    .line 666
    .line 667
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 668
    .line 669
    invoke-virtual {v3, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->startRetransmitTimer(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;Landroid/javax/sip/message/Response;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_0

    .line 670
    .line 671
    .line 672
    :cond_17
    return-void

    .line 673
    :goto_8
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 674
    .line 675
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    if-eqz v0, :cond_18

    .line 680
    .line 681
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 682
    .line 683
    invoke-interface {v0, p1}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 684
    .line 685
    .line 686
    :cond_18
    invoke-virtual {p0, v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 687
    .line 688
    .line 689
    new-instance p0, Landroid/javax/sip/SipException;

    .line 690
    .line 691
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-direct {p0, v0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 696
    .line 697
    .line 698
    throw p0

    .line 699
    :goto_9
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 700
    .line 701
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    if-eqz v0, :cond_19

    .line 706
    .line 707
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 708
    .line 709
    invoke-interface {v0, p1}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 710
    .line 711
    .line 712
    :cond_19
    invoke-virtual {p0, v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {p0, v7}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseErrorEvent(I)V

    .line 716
    .line 717
    .line 718
    new-instance p0, Landroid/javax/sip/SipException;

    .line 719
    .line 720
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    invoke-direct {p0, v0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 725
    .line 726
    .line 727
    throw p0

    .line 728
    :cond_1a
    const-string p0, "Response does not belong to this transaction."

    .line 729
    .line 730
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    return-void

    .line 734
    :cond_1b
    new-instance p0, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;

    .line 735
    .line 736
    const-string p1, "CSeq method does not match Request method of request that created the tx."

    .line 737
    .line 738
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;->UnmatchingCSeq:Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;

    .line 739
    .line 740
    invoke-direct {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;-><init>(Ljava/lang/String;Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;)V

    .line 741
    .line 742
    .line 743
    throw p0

    .line 744
    :catch_3
    move-exception v0

    .line 745
    move-object p0, v0

    .line 746
    new-instance p1, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;

    .line 747
    .line 748
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object p0

    .line 752
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;->MissingRequiredHeader:Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;

    .line 753
    .line 754
    invoke-direct {p1, p0, v0}, Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException;-><init>(Ljava/lang/String;Landroid/gov/nist/javax/sip/stack/IllegalTransactionStateException$Reason;)V

    .line 755
    .line 756
    .line 757
    throw p1

    .line 758
    :cond_1c
    const-string p0, "null response"

    .line 759
    .line 760
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    return-void
.end method

.method public setAckSeen()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->isAckSeen:Z

    .line 3
    .line 4
    return-void
.end method

.method public setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "setDialog "

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
    const-string v2, " dialog = "

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
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->dialog:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 39
    .line 40
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->dialogId:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setAssigned()V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertEnabled:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 62
    .line 63
    invoke-interface {p1, p2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 67
    .line 68
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;->dialogId:Ljava/lang/String;

    .line 69
    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 73
    .line 74
    iget-object p2, p2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->retransmissionAlertTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :cond_2
    const/4 p1, 0x0

    .line 80
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 81
    .line 82
    :cond_3
    const/4 p1, 0x0

    .line 83
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertEnabled:Z

    .line 84
    .line 85
    return-void
.end method

.method public setInviteTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->inviteTransaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 2
    .line 3
    return-void
.end method

.method public setMapped(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isMapped:Z

    .line 3
    .line 4
    return-void
.end method

.method public setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setPendingSubscribe(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->pendingSubscribeTransaction:Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 2
    .line 3
    return-void
.end method

.method public setRequestInterface(Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->requestOf:Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 2
    .line 3
    return-void
.end method

.method public setState(I)V
    .locals 1

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
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-boolean v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheServerConnections:Z

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/16 v0, 0x40

    .line 19
    .line 20
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->collectionTime:I

    .line 21
    .line 22
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->terminationSemaphore:Ljava/util/concurrent/Semaphore;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->setState(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public startTransactionTimer()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "INVITE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "CANCEL"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getMethod()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "ACK"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->transactionTimerStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    new-instance v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$TransactionTimer;

    .line 68
    .line 69
    invoke-direct {v2, p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$TransactionTimer;-><init>(Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->baseTimerInterval:I

    .line 99
    .line 100
    int-to-long v3, p0

    .line 101
    int-to-long v5, p0

    .line 102
    invoke-interface/range {v1 .. v6}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->scheduleWithFixedDelay(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;JJ)Z

    .line 103
    .line 104
    .line 105
    :cond_1
    return-void
.end method

.method public startTransactionTimerJ(J)V
    .locals 4

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
    if-eqz v0, :cond_2

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
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v2, "starting TransactionTimerJ() : "

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getTransactionId()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v2, " time "

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$1;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$1;-><init>(Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;)V

    .line 75
    .line 76
    .line 77
    const-wide/16 v1, 0x0

    .line 78
    .line 79
    cmp-long v1, p1, v1

    .line 80
    .line 81
    if-lez v1, :cond_1

    .line 82
    .line 83
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->baseTimerInterval:I

    .line 90
    .line 91
    int-to-long v2, p0

    .line 92
    mul-long/2addr p1, v2

    .line 93
    invoke-interface {v1, v0, p1, p2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$1;->runTask()V

    .line 98
    .line 99
    .line 100
    :cond_2
    return-void
.end method

.method public terminate()V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 21
    .line 22
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;->dialogId:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 27
    .line 28
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->retransmissionAlertTransactions:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->retransmissionAlertTimerTask:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$RetransmissionAlertTimerTask;

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->transactionTimerStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->testAndSetTransactionTerminatedEvent()Z

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method

.method public waitForTermination()V
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->terminationSemaphore:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    return-void
.end method

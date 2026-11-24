.class public Landroid/gov/nist/javax/sip/EventScanner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private isStopped:Z

.field private pendingEvents:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Landroid/gov/nist/javax/sip/EventWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private refCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/EventScanner;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/SipStackImpl;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/EventScanner;->refCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroid/gov/nist/javax/sip/EventScanner;->pendingEvents:Ljava/util/concurrent/BlockingQueue;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/Thread;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 28
    .line 29
    const-string p0, "EventScannerThread"

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private deliverDialogTerminatedEvent(Landroid/javax/sip/DialogTerminatedEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p3, p1}, Landroid/javax/sip/SipListener;->processDialogTerminated(Landroid/javax/sip/DialogTerminatedEvent;)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    sget-object p1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_1
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 15
    .line 16
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 23
    .line 24
    const-string p1, "Unable to call sipListener.processDialogTerminated"

    .line 25
    .line 26
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    return-void
.end method

.method private deliverDialogTimeoutEvent(Landroid/gov/nist/javax/sip/DialogTimeoutEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    :try_start_0
    instance-of p0, p3, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    check-cast p3, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 8
    .line 9
    invoke-interface {p3, p1}, Landroid/gov/nist/javax/sip/SipListenerExt;->processDialogTimeout(Landroid/gov/nist/javax/sip/DialogTimeoutEvent;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    const/16 p1, 0x20

    .line 16
    .line 17
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 24
    .line 25
    const-string p1, "DialogTimeoutEvent not delivered"

    .line 26
    .line 27
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :catch_0
    move-exception p0

    .line 32
    sget-object p1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 33
    .line 34
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private deliverIOExceptionEvent(Landroid/javax/sip/IOExceptionEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p3, p1}, Landroid/javax/sip/SipListener;->processIOException(Landroid/javax/sip/IOExceptionEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    sget-object p1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private deliverRequestEvent(Landroid/javax/sip/RequestEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V
    .locals 10

    .line 1
    const-string v0, "ACK"

    .line 2
    .line 3
    const-string v1, "Done processing Message "

    .line 4
    .line 5
    const-string v2, "Calling listener "

    .line 6
    .line 7
    const-string v3, "transaction already exists! "

    .line 8
    .line 9
    const-string v4, "deliverEvent : "

    .line 10
    .line 11
    const/4 v5, 0x5

    .line 12
    const/16 v6, 0x20

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    check-cast v7, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 19
    .line 20
    sget-object v8, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 21
    .line 22
    invoke-interface {v8, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    sget-object v8, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 29
    .line 30
    new-instance v9, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v4, " transaction "

    .line 43
    .line 44
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v4, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 48
    .line 49
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v4, " sipEvent.serverTx = "

    .line 53
    .line 54
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getServerTransaction()Landroid/javax/sip/ServerTransaction;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v8, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p3

    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_0
    :goto_0
    iget-object v4, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 76
    .line 77
    const/4 v8, 0x1

    .line 78
    invoke-virtual {v4, v7, v8}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 83
    .line 84
    if-eqz v4, :cond_7

    .line 85
    .line 86
    invoke-interface {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-nez v8, :cond_7

    .line 91
    .line 92
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_2

    .line 101
    .line 102
    invoke-interface {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_2

    .line 107
    .line 108
    invoke-interface {v4}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getLastResponseStatusCode()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    div-int/lit8 v8, v8, 0x64

    .line 113
    .line 114
    const/4 v9, 0x2

    .line 115
    if-eq v8, v9, :cond_1

    .line 116
    .line 117
    iget-object v8, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 118
    .line 119
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isNon2XXAckPassedToListener()Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_2

    .line 124
    .line 125
    :cond_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 126
    .line 127
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isNon2XXAckPassedToListener()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-nez v3, :cond_d

    .line 132
    .line 133
    sget-object v3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 134
    .line 135
    invoke-interface {v3, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_d

    .line 140
    .line 141
    sget-object v3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 142
    .line 143
    const-string v4, "Detected broken client sending ACK with same branch! Passing..."

    .line 144
    .line 145
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_2

    .line 149
    .line 150
    :cond_2
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 151
    .line 152
    invoke-interface {p3, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 153
    .line 154
    .line 155
    move-result p3

    .line 156
    if-eqz p3, :cond_3

    .line 157
    .line 158
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 159
    .line 160
    new-instance v2, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-interface {p3, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    .line 174
    .line 175
    :cond_3
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 176
    .line 177
    invoke-interface {p3, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 178
    .line 179
    .line 180
    move-result p3

    .line 181
    if-eqz p3, :cond_4

    .line 182
    .line 183
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 184
    .line 185
    new-instance v2, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 195
    .line 196
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-interface {p3, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    :cond_4
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 211
    .line 212
    if-eqz p1, :cond_5

    .line 213
    .line 214
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 215
    .line 216
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_5

    .line 221
    .line 222
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 223
    .line 224
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 225
    .line 226
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 227
    .line 228
    .line 229
    :cond_5
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 230
    .line 231
    if-eqz p1, :cond_6

    .line 232
    .line 233
    iget-object p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 234
    .line 235
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 236
    .line 237
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removePendingTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 238
    .line 239
    .line 240
    :cond_6
    iget-object p0, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 241
    .line 242
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    if-eqz p0, :cond_15

    .line 251
    .line 252
    :goto_1
    iget-object p0, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 253
    .line 254
    invoke-interface {p0, v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setState(I)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :cond_7
    :try_start_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 259
    .line 260
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findPendingTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    if-eqz v3, :cond_c

    .line 269
    .line 270
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 271
    .line 272
    invoke-interface {p3, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 273
    .line 274
    .line 275
    move-result p3

    .line 276
    if-eqz p3, :cond_8

    .line 277
    .line 278
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 279
    .line 280
    const-string v2, "transaction already exists!!"

    .line 281
    .line 282
    invoke-interface {p3, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 283
    .line 284
    .line 285
    :cond_8
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 286
    .line 287
    invoke-interface {p3, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 288
    .line 289
    .line 290
    move-result p3

    .line 291
    if-eqz p3, :cond_9

    .line 292
    .line 293
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 294
    .line 295
    new-instance v2, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 305
    .line 306
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-interface {p3, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    :cond_9
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 321
    .line 322
    if-eqz p1, :cond_a

    .line 323
    .line 324
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 325
    .line 326
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    if-eqz p1, :cond_a

    .line 331
    .line 332
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 333
    .line 334
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 335
    .line 336
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 337
    .line 338
    .line 339
    :cond_a
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 340
    .line 341
    if-eqz p1, :cond_b

    .line 342
    .line 343
    iget-object p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 344
    .line 345
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 346
    .line 347
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removePendingTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 348
    .line 349
    .line 350
    :cond_b
    iget-object p0, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 351
    .line 352
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    if-eqz p0, :cond_15

    .line 361
    .line 362
    goto :goto_1

    .line 363
    :cond_c
    :try_start_2
    iget-object v3, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 364
    .line 365
    check-cast v3, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 366
    .line 367
    iget-object v4, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 368
    .line 369
    invoke-virtual {v4, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putPendingTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 370
    .line 371
    .line 372
    :cond_d
    :goto_2
    iget-object v3, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 373
    .line 374
    invoke-virtual {v7, v3}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setTransaction(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 375
    .line 376
    .line 377
    :try_start_3
    sget-object v3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 378
    .line 379
    invoke-interface {v3, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eqz v3, :cond_e

    .line 384
    .line 385
    sget-object v3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 386
    .line 387
    new-instance v4, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v8

    .line 396
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    sget-object v3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 407
    .line 408
    new-instance v4, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    iget-object v2, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 414
    .line 415
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-interface {v3, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    goto :goto_3

    .line 426
    :catch_0
    move-exception p3

    .line 427
    goto :goto_4

    .line 428
    :cond_e
    :goto_3
    if-eqz p3, :cond_f

    .line 429
    .line 430
    invoke-interface {p3, p1}, Landroid/javax/sip/SipListener;->processRequest(Landroid/javax/sip/RequestEvent;)V

    .line 431
    .line 432
    .line 433
    :cond_f
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 434
    .line 435
    invoke-interface {p3, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 436
    .line 437
    .line 438
    move-result p3

    .line 439
    if-eqz p3, :cond_10

    .line 440
    .line 441
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 442
    .line 443
    new-instance v2, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-interface {p3, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    :cond_10
    iget-object p3, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 463
    .line 464
    if-eqz p3, :cond_11

    .line 465
    .line 466
    invoke-interface {p3}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 467
    .line 468
    .line 469
    move-result-object p3

    .line 470
    check-cast p3, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 471
    .line 472
    if-eqz p3, :cond_11

    .line 473
    .line 474
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->requestConsumed()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 475
    .line 476
    .line 477
    goto :goto_5

    .line 478
    :goto_4
    :try_start_4
    sget-object v2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 479
    .line 480
    invoke-interface {v2, p3}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 481
    .line 482
    .line 483
    :cond_11
    :goto_5
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 484
    .line 485
    invoke-interface {p3, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 486
    .line 487
    .line 488
    move-result p3

    .line 489
    if-eqz p3, :cond_12

    .line 490
    .line 491
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 492
    .line 493
    new-instance v2, Ljava/lang/StringBuilder;

    .line 494
    .line 495
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 503
    .line 504
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    invoke-interface {p3, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    :cond_12
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 519
    .line 520
    if-eqz p1, :cond_13

    .line 521
    .line 522
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 523
    .line 524
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 525
    .line 526
    .line 527
    move-result p1

    .line 528
    if-eqz p1, :cond_13

    .line 529
    .line 530
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 531
    .line 532
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 533
    .line 534
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 535
    .line 536
    .line 537
    :cond_13
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 538
    .line 539
    if-eqz p1, :cond_14

    .line 540
    .line 541
    iget-object p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 542
    .line 543
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 544
    .line 545
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removePendingTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 546
    .line 547
    .line 548
    :cond_14
    iget-object p0, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 549
    .line 550
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result p0

    .line 558
    if-eqz p0, :cond_15

    .line 559
    .line 560
    iget-object p0, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 561
    .line 562
    invoke-interface {p0, v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setState(I)V

    .line 563
    .line 564
    .line 565
    :cond_15
    return-void

    .line 566
    :goto_6
    sget-object v2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 567
    .line 568
    invoke-interface {v2, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    if-eqz v2, :cond_16

    .line 573
    .line 574
    sget-object v2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 575
    .line 576
    new-instance v3, Ljava/lang/StringBuilder;

    .line 577
    .line 578
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 586
    .line 587
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object p1

    .line 591
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object p1

    .line 598
    invoke-interface {v2, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    :cond_16
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 602
    .line 603
    if-eqz p1, :cond_17

    .line 604
    .line 605
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 606
    .line 607
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 608
    .line 609
    .line 610
    move-result p1

    .line 611
    if-eqz p1, :cond_17

    .line 612
    .line 613
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 614
    .line 615
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 616
    .line 617
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 618
    .line 619
    .line 620
    :cond_17
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 621
    .line 622
    if-eqz p1, :cond_18

    .line 623
    .line 624
    iget-object p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 625
    .line 626
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 627
    .line 628
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removePendingTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 629
    .line 630
    .line 631
    :cond_18
    iget-object p0, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 632
    .line 633
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result p0

    .line 641
    if-eqz p0, :cond_19

    .line 642
    .line 643
    iget-object p0, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 644
    .line 645
    invoke-interface {p0, v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setState(I)V

    .line 646
    .line 647
    .line 648
    :cond_19
    throw p3
.end method

.method private deliverResponseEvent(Landroid/javax/sip/ResponseEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V
    .locals 7

    .line 1
    const-string p0, "INVITE"

    .line 2
    .line 3
    const-string v0, "Warning! unacknowledged dialog. "

    .line 4
    .line 5
    const-string v1, "Calling listener "

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Landroid/javax/sip/ResponseEvent;->getResponse()Landroid/javax/sip/message/Response;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/javax/sip/ResponseEvent;->getDialog()Landroid/javax/sip/Dialog;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Landroid/gov/nist/javax/sip/stack/SIPDialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    :try_start_1
    sget-object v4, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    const/16 v5, 0x20

    .line 22
    .line 23
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    sget-object v4, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 30
    .line 31
    new-instance v6, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, " for "

    .line 40
    .line 41
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getFirstLine()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v4, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :catch_0
    move-exception p1

    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_0
    :goto_0
    if-eqz p3, :cond_2

    .line 66
    .line 67
    iget-object v1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setPassToListener()V

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-interface {p3, p1}, Landroid/javax/sip/SipListener;->processResponse(Landroid/javax/sip/ResponseEvent;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    if-eqz v3, :cond_6

    .line 78
    .line 79
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    sget-object p3, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 90
    .line 91
    invoke-virtual {p1, p3}, Landroid/javax/sip/DialogState;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_6

    .line 96
    .line 97
    :cond_3
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    const/16 p3, 0x1e1

    .line 102
    .line 103
    if-eq p1, p3, :cond_4

    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    const/16 p3, 0x198

    .line 110
    .line 111
    if-ne p1, p3, :cond_6

    .line 112
    .line 113
    :cond_4
    sget-object p1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 114
    .line 115
    invoke-interface {p1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    sget-object p1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 122
    .line 123
    const-string p3, "Removing dialog on 408 or 481 response"

    .line 124
    .line 125
    invoke-interface {p1, p3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->doDeferredDelete()V

    .line 129
    .line 130
    .line 131
    :cond_6
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-interface {p1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_8

    .line 144
    .line 145
    if-eqz v3, :cond_8

    .line 146
    .line 147
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    const/16 p3, 0xc8

    .line 152
    .line 153
    if-ne p1, p3, :cond_8

    .line 154
    .line 155
    sget-object p1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 156
    .line 157
    invoke-interface {p1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_7

    .line 162
    .line 163
    sget-object p1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 164
    .line 165
    new-instance p3, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p3

    .line 181
    invoke-interface {p1, p3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_7
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-interface {p1}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 189
    .line 190
    .line 191
    move-result-wide v0

    .line 192
    invoke-virtual {v3, v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->doDeferredDeleteIfNoAckSent(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :goto_1
    :try_start_2
    sget-object p3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 197
    .line 198
    invoke-interface {p3, p1}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    :cond_8
    :goto_2
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 202
    .line 203
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 204
    .line 205
    if-eqz p1, :cond_9

    .line 206
    .line 207
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    const/4 v0, 0x3

    .line 212
    if-ne v0, p3, :cond_9

    .line 213
    .line 214
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p3

    .line 218
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    if-nez p0, :cond_9

    .line 223
    .line 224
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->clearState()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 225
    .line 226
    .line 227
    :cond_9
    iget-object p0, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 228
    .line 229
    if-eqz p0, :cond_a

    .line 230
    .line 231
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    if-eqz p0, :cond_a

    .line 236
    .line 237
    iget-object p0, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 238
    .line 239
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->releaseSem()V

    .line 240
    .line 241
    .line 242
    :cond_a
    return-void

    .line 243
    :goto_3
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 244
    .line 245
    if-eqz p1, :cond_b

    .line 246
    .line 247
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-eqz p1, :cond_b

    .line 252
    .line 253
    iget-object p1, p2, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 254
    .line 255
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->releaseSem()V

    .line 256
    .line 257
    .line 258
    :cond_b
    throw p0
.end method

.method private deliverTimeoutEvent(Landroid/javax/sip/TimeoutEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p3, p1}, Landroid/javax/sip/SipListener;->processTimeout(Landroid/javax/sip/TimeoutEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    sget-object p1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private deliverTransactionTerminatedEvent(Landroid/javax/sip/TransactionTerminatedEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V
    .locals 2

    .line 1
    const-string p0, "tx = "

    .line 2
    .line 3
    :try_start_0
    sget-object p2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    sget-object p2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    const-string v0, "About to deliver transactionTerminatedEvent"

    .line 16
    .line 17
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object p2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/javax/sip/TransactionTerminatedEvent;->getClientTransaction()Landroid/javax/sip/ClientTransaction;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sget-object p2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/javax/sip/TransactionTerminatedEvent;->getServerTransaction()Landroid/javax/sip/ServerTransaction;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p2, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    if-eqz p3, :cond_1

    .line 63
    .line 64
    invoke-interface {p3, p1}, Landroid/javax/sip/SipListener;->processTransactionTerminated(Landroid/javax/sip/TransactionTerminatedEvent;)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catch_0
    move-exception p0

    .line 69
    sget-object p1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 70
    .line 71
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catch_1
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 76
    .line 77
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_1

    .line 82
    .line 83
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 84
    .line 85
    const-string p1, "Unable to call sipListener.processTransactionTerminated"

    .line 86
    .line 87
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public addEvent(Landroid/gov/nist/javax/sip/EventWrapper;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "addEvent "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    iget-object p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->pendingEvents:Ljava/util/concurrent/BlockingQueue;

    .line 31
    .line 32
    invoke-interface {p0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "reached queue capacity limit couldn\'t addEvent "

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void
.end method

.method public deliverEvent(Landroid/gov/nist/javax/sip/EventWrapper;)V
    .locals 4

    .line 1
    iget-object v0, p1, Landroid/gov/nist/javax/sip/EventWrapper;->sipEvent:Ljava/util/EventObject;

    .line 2
    .line 3
    sget-object v1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v1, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "sipEvent = "

    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v3, "source = "

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    instance-of v1, v0, Landroid/javax/sip/IOExceptionEvent;

    .line 45
    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object v2, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/SipStackImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :goto_0
    instance-of v3, v0, Landroid/javax/sip/RequestEvent;

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    check-cast v0, Landroid/javax/sip/RequestEvent;

    .line 70
    .line 71
    invoke-direct {p0, v0, p1, v2}, Landroid/gov/nist/javax/sip/EventScanner;->deliverRequestEvent(Landroid/javax/sip/RequestEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    instance-of v3, v0, Landroid/javax/sip/ResponseEvent;

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    check-cast v0, Landroid/javax/sip/ResponseEvent;

    .line 80
    .line 81
    invoke-direct {p0, v0, p1, v2}, Landroid/gov/nist/javax/sip/EventScanner;->deliverResponseEvent(Landroid/javax/sip/ResponseEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    instance-of v3, v0, Landroid/javax/sip/TimeoutEvent;

    .line 86
    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    check-cast v0, Landroid/javax/sip/TimeoutEvent;

    .line 90
    .line 91
    invoke-direct {p0, v0, p1, v2}, Landroid/gov/nist/javax/sip/EventScanner;->deliverTimeoutEvent(Landroid/javax/sip/TimeoutEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    instance-of v3, v0, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;

    .line 96
    .line 97
    if-eqz v3, :cond_5

    .line 98
    .line 99
    check-cast v0, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;

    .line 100
    .line 101
    invoke-direct {p0, v0, p1, v2}, Landroid/gov/nist/javax/sip/EventScanner;->deliverDialogTimeoutEvent(Landroid/gov/nist/javax/sip/DialogTimeoutEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_5
    if-eqz v1, :cond_6

    .line 106
    .line 107
    check-cast v0, Landroid/javax/sip/IOExceptionEvent;

    .line 108
    .line 109
    invoke-direct {p0, v0, p1, v2}, Landroid/gov/nist/javax/sip/EventScanner;->deliverIOExceptionEvent(Landroid/javax/sip/IOExceptionEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_6
    instance-of v1, v0, Landroid/javax/sip/TransactionTerminatedEvent;

    .line 114
    .line 115
    if-eqz v1, :cond_7

    .line 116
    .line 117
    check-cast v0, Landroid/javax/sip/TransactionTerminatedEvent;

    .line 118
    .line 119
    invoke-direct {p0, v0, p1, v2}, Landroid/gov/nist/javax/sip/EventScanner;->deliverTransactionTerminatedEvent(Landroid/javax/sip/TransactionTerminatedEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_7
    instance-of v1, v0, Landroid/javax/sip/DialogTerminatedEvent;

    .line 124
    .line 125
    if-eqz v1, :cond_8

    .line 126
    .line 127
    check-cast v0, Landroid/javax/sip/DialogTerminatedEvent;

    .line 128
    .line 129
    invoke-direct {p0, v0, p1, v2}, Landroid/gov/nist/javax/sip/EventScanner;->deliverDialogTerminatedEvent(Landroid/javax/sip/DialogTerminatedEvent;Landroid/gov/nist/javax/sip/EventWrapper;Landroid/javax/sip/SipListener;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_8
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 134
    .line 135
    new-instance p1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v1, "bad event"

    .line 138
    .line 139
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logFatalError(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public forceStop()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/EventScanner;->isStopped:Z

    .line 3
    .line 4
    iget-object p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->refCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public incrementRefcount()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->refCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public run()V
    .locals 6

    .line 1
    const-string v0, "Event scanner exited abnormally"

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Landroid/gov/nist/javax/sip/EventScanner;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/gov/nist/core/ThreadAuditor;->addCurrentThread()Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v2

    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    const/4 v2, 0x0

    .line 28
    :cond_1
    :goto_0
    iget-boolean v3, p0, Landroid/gov/nist/javax/sip/EventScanner;->isStopped:Z

    .line 29
    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    sget-object v2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 33
    .line 34
    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    sget-object v2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 41
    .line 42
    const-string v3, "Stopped event scanner!!"

    .line 43
    .line 44
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    :cond_2
    sget-object v2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 48
    .line 49
    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_6

    .line 54
    .line 55
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->isStopped:Z

    .line 56
    .line 57
    if-nez p0, :cond_6

    .line 58
    .line 59
    :goto_1
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 60
    .line 61
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logFatalError(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_3
    if-eqz v2, :cond_4

    .line 66
    .line 67
    :try_start_1
    invoke-virtual {v2}, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->ping()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    :cond_4
    :try_start_2
    iget-object v3, p0, Landroid/gov/nist/javax/sip/EventScanner;->pendingEvents:Ljava/util/concurrent/BlockingQueue;

    .line 71
    .line 72
    invoke-interface {v3}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Landroid/gov/nist/javax/sip/EventWrapper;

    .line 77
    .line 78
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/EventScanner;->deliverEvent(Landroid/gov/nist/javax/sip/EventWrapper;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catch_0
    move-exception v3

    .line 83
    goto :goto_2

    .line 84
    :catch_1
    move-exception v2

    .line 85
    goto :goto_3

    .line 86
    :goto_2
    :try_start_3
    sget-object v4, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 87
    .line 88
    invoke-interface {v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_1

    .line 93
    .line 94
    sget-object v4, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 95
    .line 96
    const-string v5, "Unexpected exception caught while delivering event -- carrying on bravely"

    .line 97
    .line 98
    invoke-interface {v4, v5, v3}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :goto_3
    sget-object v3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 103
    .line 104
    const/4 v4, 0x4

    .line 105
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_5

    .line 110
    .line 111
    sget-object v3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 112
    .line 113
    const-string v4, "Interrupted!"

    .line 114
    .line 115
    invoke-interface {v3, v4, v2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 116
    .line 117
    .line 118
    :cond_5
    sget-object v2, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 119
    .line 120
    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->isStopped:Z

    .line 127
    .line 128
    if-nez p0, :cond_6

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    :goto_4
    return-void

    .line 132
    :goto_5
    sget-object v3, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 133
    .line 134
    invoke-interface {v3, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_7

    .line 139
    .line 140
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/EventScanner;->isStopped:Z

    .line 141
    .line 142
    if-nez p0, :cond_7

    .line 143
    .line 144
    sget-object p0, Landroid/gov/nist/javax/sip/EventScanner;->logger:Landroid/gov/nist/core/StackLogger;

    .line 145
    .line 146
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logFatalError(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    throw v2
.end method

.method public stop()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/EventScanner;->refCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/EventScanner;->isStopped:Z

    .line 11
    .line 12
    :cond_0
    return-void
.end method

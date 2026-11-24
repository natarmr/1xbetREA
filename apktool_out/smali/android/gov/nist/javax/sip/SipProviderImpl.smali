.class public Landroid/gov/nist/javax/sip/SipProviderImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/SipProvider;
.implements Landroid/gov/nist/javax/sip/SipProviderExt;
.implements Landroid/gov/nist/javax/sip/stack/SIPTransactionEventListener;
.implements Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private automaticDialogSupportEnabled:Z

.field private dialogErrorsAutomaticallyHandled:Z

.field protected eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

.field private listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/javax/sip/ListeningPoint;",
            ">;"
        }
    .end annotation
.end field

.field private sipListener:Landroid/javax/sip/SipListener;

.field protected sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->dialogErrorsAutomaticallyHandled:Z

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/SipStackImpl;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->dialogErrorsAutomaticallyHandled:Z

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->getEventScanner()Landroid/gov/nist/javax/sip/EventScanner;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 12
    .line 13
    iput-object p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/EventScanner;->incrementRefcount()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    iget-object p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->isAutomaticDialogSupportEnabled()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->automaticDialogSupportEnabled:Z

    .line 32
    .line 33
    iget-object p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->isAutomaticDialogErrorHandlingEnabled()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->dialogErrorsAutomaticallyHandled:Z

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public declared-synchronized addListeningPoint(Landroid/javax/sip/ListeningPoint;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    move-object v0, p1

    .line 3
    check-cast v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 4
    .line 5
    iget-object v1, v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Landroid/javax/sip/ObjectInUseException;

    .line 13
    .line 14
    const-string v0, "Listening point assigned to another provider"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Landroid/javax/sip/ObjectInUseException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_2

    .line 22
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getTransport()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-ne v2, p1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    new-instance p1, Landroid/javax/sip/ObjectInUseException;

    .line 48
    .line 49
    const-string v0, "Listening point already assigned for transport!"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Landroid/javax/sip/ObjectInUseException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    :goto_1
    iput-object p0, v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 56
    .line 57
    iget-object p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 58
    .line 59
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    monitor-exit p0

    .line 63
    return-void

    .line 64
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw p1
.end method

.method public addSipListener(Landroid/javax/sip/SipListener;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 2
    .line 3
    iget-object v1, v0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipListener:Landroid/javax/sip/SipListener;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipListener:Landroid/javax/sip/SipListener;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-ne v1, p1, :cond_2

    .line 11
    .line 12
    :goto_0
    sget-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "add SipListener "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipListener:Landroid/javax/sip/SipListener;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    new-instance p0, Ljava/util/TooManyListenersException;

    .line 45
    .line 46
    const-string p1, "Stack already has a listener. Only one listener per stack allowed"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/util/TooManyListenersException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method public clone()Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/CloneNotSupportedException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/CloneNotSupportedException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public createClientTransaction(Landroid/javax/sip/message/Request;Landroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;
    .locals 10

    .line 1
    const-string v0, "Unexpected Exception FIXME! "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_17

    .line 5
    .line 6
    if-eqz p2, :cond_16

    .line 7
    .line 8
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAlive()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_15

    .line 15
    .line 16
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getTransaction()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-nez v1, :cond_14

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "ACK"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_13

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v2, 0x0

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    invoke-interface {p2}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    const-string v1, "udp"

    .line 50
    .line 51
    :cond_0
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoints()[Landroid/javax/sip/ListeningPoint;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    aget-object v1, v1, v2

    .line 64
    .line 65
    check-cast v1, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 66
    .line 67
    :cond_1
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getViaHeader()Landroid/gov/nist/javax/sip/header/Via;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->checkHeaders()V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_3

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v3, "z9hG4bK"

    .line 86
    .line 87
    if-eqz v1, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 104
    .line 105
    invoke-virtual {v1, p1, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    if-nez v1, :cond_3

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 113
    .line 114
    const-string p1, "Transaction already exists!"

    .line 115
    .line 116
    invoke-direct {p0, p1}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p0

    .line 120
    :cond_4
    :goto_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const-string v4, "CANCEL"

    .line 125
    .line 126
    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 133
    .line 134
    invoke-virtual {v1, p1, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findCancelTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 139
    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    iget-object p2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 143
    .line 144
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMessageChannel()Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p2, p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createClientTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-interface {p2, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->addEventListener(Landroid/gov/nist/javax/sip/stack/SIPTransactionEventListener;)V

    .line 153
    .line 154
    .line 155
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 156
    .line 157
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-eqz p0, :cond_5

    .line 165
    .line 166
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 171
    .line 172
    invoke-virtual {p1, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-interface {p2, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_5
    return-object p2

    .line 180
    :cond_6
    sget-object v1, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 181
    .line 182
    const/16 v4, 0x20

    .line 183
    .line 184
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_7

    .line 189
    .line 190
    sget-object v1, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 191
    .line 192
    new-instance v5, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v6, "could not find existing transaction for "

    .line 195
    .line 196
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v6, " creating a new one "

    .line 203
    .line 204
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :cond_7
    invoke-interface {p2}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    check-cast v5, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 223
    .line 224
    sget-object v6, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 225
    .line 226
    invoke-interface {v6, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    const-string v7, " for transport "

    .line 231
    .line 232
    if-eqz v6, :cond_8

    .line 233
    .line 234
    sget-object v6, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 235
    .line 236
    new-instance v8, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    const-string v9, "Got following Listenin point "

    .line 239
    .line 240
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    invoke-interface {v6, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :cond_8
    if-nez v5, :cond_9

    .line 260
    .line 261
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {p0, v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    check-cast v5, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 274
    .line 275
    sget-object v6, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 276
    .line 277
    invoke-interface {v6, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_9

    .line 282
    .line 283
    sget-object v4, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 284
    .line 285
    new-instance v6, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string v8, "Listenig point was null using new one from Via header "

    .line 288
    .line 289
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    invoke-interface {v4, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    :cond_9
    invoke-virtual {p1, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    iget-object v6, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 321
    .line 322
    invoke-virtual {v6, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    if-eqz v4, :cond_a

    .line 327
    .line 328
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    sget-object v7, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 333
    .line 334
    if-ne v6, v7, :cond_a

    .line 335
    .line 336
    iget-object v6, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 337
    .line 338
    invoke-virtual {v6, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V

    .line 339
    .line 340
    .line 341
    :cond_a
    :try_start_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    if-eqz v6, :cond_b

    .line 350
    .line 351
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-eqz v3, :cond_b

    .line 364
    .line 365
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 366
    .line 367
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->checkBranchId()Z

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    if-eqz v3, :cond_c

    .line 372
    .line 373
    goto :goto_1

    .line 374
    :catch_0
    move-exception p0

    .line 375
    goto/16 :goto_3

    .line 376
    .line 377
    :catch_1
    move-exception p0

    .line 378
    goto/16 :goto_4

    .line 379
    .line 380
    :cond_b
    :goto_1
    invoke-static {}, Landroid/gov/nist/javax/sip/Utils;->getInstance()Landroid/gov/nist/javax/sip/Utils;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/Utils;->generateBranchId()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    invoke-virtual {v6, v3}, Landroid/gov/nist/javax/sip/header/Via;->setBranch(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    :cond_c
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    if-nez v6, :cond_d

    .line 404
    .line 405
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/header/Via;->setTransport(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    :cond_d
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    const/4 v6, -0x1

    .line 413
    if-ne v1, v6, :cond_e

    .line 414
    .line 415
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getPort()I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/header/Via;->setPort(I)V

    .line 420
    .line 421
    .line 422
    :cond_e
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 431
    .line 432
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    invoke-virtual {v3, p1, v5, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createMessageChannel(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageProcessor;Landroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    iget-object v5, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 441
    .line 442
    invoke-virtual {v5, p1, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createClientTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    if-eqz v3, :cond_12

    .line 447
    .line 448
    invoke-interface {v3, p2}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setNextHop(Landroid/javax/sip/address/Hop;)V

    .line 449
    .line 450
    .line 451
    invoke-interface {v3, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 452
    .line 453
    .line 454
    invoke-interface {v3, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setBranch(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object p2

    .line 461
    invoke-static {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 462
    .line 463
    .line 464
    move-result p2

    .line 465
    if-eqz p2, :cond_10

    .line 466
    .line 467
    if-eqz v4, :cond_f

    .line 468
    .line 469
    invoke-virtual {p1, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    invoke-interface {v3, v4, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    goto :goto_2

    .line 477
    :cond_f
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    .line 478
    .line 479
    .line 480
    move-result p2

    .line 481
    if-eqz p2, :cond_11

    .line 482
    .line 483
    iget-object p2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 484
    .line 485
    invoke-virtual {p2, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createDialog(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 486
    .line 487
    .line 488
    move-result-object p2

    .line 489
    invoke-virtual {p1, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    invoke-interface {v3, p2, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    goto :goto_2

    .line 497
    :cond_10
    if-eqz v4, :cond_11

    .line 498
    .line 499
    invoke-virtual {p1, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object p1

    .line 503
    invoke-interface {v3, v4, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    :cond_11
    :goto_2
    invoke-interface {v3, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->addEventListener(Landroid/gov/nist/javax/sip/stack/SIPTransactionEventListener;)V

    .line 507
    .line 508
    .line 509
    return-object v3

    .line 510
    :cond_12
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 511
    .line 512
    const-string p1, "Cound not create tx"

    .line 513
    .line 514
    invoke-direct {p0, p1}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    throw p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 518
    :goto_3
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 519
    .line 520
    .line 521
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 522
    .line 523
    invoke-direct {p1, v0, p0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 524
    .line 525
    .line 526
    throw p1

    .line 527
    :goto_4
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 528
    .line 529
    .line 530
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 531
    .line 532
    invoke-direct {p1, v0, p0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 533
    .line 534
    .line 535
    throw p1

    .line 536
    :catch_2
    move-exception p0

    .line 537
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 538
    .line 539
    const-string p2, "Could not resolve next hop or listening point unavailable! "

    .line 540
    .line 541
    invoke-direct {p1, p2, p0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 542
    .line 543
    .line 544
    throw p1

    .line 545
    :catch_3
    move-exception p0

    .line 546
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 547
    .line 548
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object p2

    .line 552
    invoke-direct {p1, p2, p0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 553
    .line 554
    .line 555
    throw p1

    .line 556
    :cond_13
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 557
    .line 558
    const-string p1, "Cannot create client transaction for  ACK"

    .line 559
    .line 560
    invoke-direct {p0, p1}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    throw p0

    .line 564
    :cond_14
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 565
    .line 566
    const-string p1, "Transaction already assigned to request"

    .line 567
    .line 568
    invoke-direct {p0, p1}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    throw p0

    .line 572
    :cond_15
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 573
    .line 574
    const-string p1, "Stack is stopped"

    .line 575
    .line 576
    invoke-direct {p0, p1}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    throw p0

    .line 580
    :cond_16
    const-string p0, "null hop"

    .line 581
    .line 582
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    return-object v1

    .line 586
    :cond_17
    const-string p0, "null request"

    .line 587
    .line 588
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    return-object v1
.end method

.method public dialogErrorEvent(Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 6
    .line 7
    sget-object v1, Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;->AckNotReceived:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->getErrorID()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x2

    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    sget-object v1, Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;->AckNotSent:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->getErrorID()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x3

    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    sget-object v1, Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;->ReInviteTimeout:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->getErrorID()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x4

    .line 34
    if-ne v2, v3, :cond_2

    .line 35
    .line 36
    sget-object v1, Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;->EarlyStateTimeout:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 37
    .line 38
    :cond_2
    :goto_0
    sget-object v2, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    const/16 v3, 0x20

    .line 41
    .line 42
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    sget-object v2, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 49
    .line 50
    new-instance v3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v4, "Dialog TimeoutError occured on "

    .line 53
    .line 54
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    new-instance v2, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;

    .line 68
    .line 69
    invoke-direct {v2, p0, v0, v1}, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/Dialog;Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->getClientTransaction()Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v2, p1}, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;->setClientTransaction(Landroid/javax/sip/ClientTransaction;)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    invoke-virtual {p0, v2, p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public getListeningPoint()Landroid/javax/sip/ListeningPoint;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Landroid/javax/sip/ListeningPoint;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;
    .locals 0

    if-eqz p1, :cond_0

    .line 28
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/javax/sip/ListeningPoint;

    return-object p0

    .line 29
    :cond_0
    const-string p0, "Null transport param"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public declared-synchronized getListeningPoints()[Landroid/javax/sip/ListeningPoint;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    new-array v0, v0, [Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 9
    .line 10
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0
.end method

.method public getNewCallId()Landroid/javax/sip/header/CallIdHeader;
    .locals 1

    .line 1
    invoke-static {}, Landroid/gov/nist/javax/sip/Utils;->getInstance()Landroid/gov/nist/javax/sip/Utils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint()Landroid/javax/sip/ListeningPoint;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/Utils;->generateCallIdentifier(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v0, Landroid/gov/nist/javax/sip/header/CallID;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/CallID;-><init>()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/header/CallID;->setCallId(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    :catch_0
    return-object v0
.end method

.method public getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;
    .locals 3

    .line 1
    const-string v0, "Cannot resolve next hop -- transaction unavailable"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    check-cast v2, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getNextHop(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/javax/sip/address/Hop;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catch Landroid/javax/sip/SipException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->createClientTransaction(Landroid/javax/sip/message/Request;Landroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    :try_start_1
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 25
    .line 26
    invoke-direct {p0, v0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
    :try_end_1
    .catch Landroid/javax/sip/SipException; {:try_start_1 .. :try_end_1} :catch_0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 32
    .line 33
    invoke-direct {p1, v0, p0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

.method public getNewDialog(Landroid/javax/sip/Transaction;)Landroid/javax/sip/Dialog;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_a

    .line 3
    .line 4
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAlive()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_9

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_8

    .line 17
    .line 18
    invoke-interface {p1}, Landroid/javax/sip/Transaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_7

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 34
    .line 35
    instance-of v2, p1, Landroid/javax/sip/ServerTransaction;

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    move-object v2, p1

    .line 40
    check-cast v2, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 41
    .line 42
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getLastResponse()Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-interface {v3}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v4, 0x64

    .line 53
    .line 54
    if-ne v3, v4, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const-string p0, "Cannot set dialog after response has been sent"

    .line 58
    .line 59
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_1
    :goto_0
    invoke-interface {p1}, Landroid/javax/sip/Transaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iget-object v5, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 75
    .line 76
    invoke-virtual {v5, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    if-nez v4, :cond_2

    .line 81
    .line 82
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 83
    .line 84
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createDialog(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v4, v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, v4, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-interface {v1, v4, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :goto_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v1, "INVITE"

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 124
    .line 125
    invoke-virtual {v0, v2, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putInMergeTable(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 130
    .line 131
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getLastResponse()Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-nez v2, :cond_6

    .line 136
    .line 137
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 149
    .line 150
    invoke-virtual {v3, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-nez v2, :cond_5

    .line 155
    .line 156
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 157
    .line 158
    invoke-virtual {v2, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createDialog(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-interface {p1, v4, v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    :goto_2
    invoke-virtual {v4, p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addEventListener(Landroid/gov/nist/javax/sip/stack/SIPDialogEventListener;)V

    .line 166
    .line 167
    .line 168
    return-object v4

    .line 169
    :cond_5
    const-string p0, "Dialog already exists!"

    .line 170
    .line 171
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :cond_6
    const-string p0, "Cannot call this method after response is received!"

    .line 176
    .line 177
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-object v0

    .line 181
    :cond_7
    new-instance p0, Landroid/javax/sip/SipException;

    .line 182
    .line 183
    invoke-interface {p1}, Landroid/javax/sip/Transaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-interface {p1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    const-string v1, "Dialog cannot be created for this method "

    .line 194
    .line 195
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p0

    .line 209
    :cond_8
    const-string p0, " Error - AUTOMATIC_DIALOG_SUPPORT is on"

    .line 210
    .line 211
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-object v0

    .line 215
    :cond_9
    const-string p0, "Stack is stopped."

    .line 216
    .line 217
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-object v0

    .line 221
    :cond_a
    const-string p0, "Null transaction!"

    .line 222
    .line 223
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-object v0
.end method

.method public getNewServerTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ServerTransaction;
    .locals 5

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAlive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->checkHeaders()V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_2

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "ACK"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    sget-object p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 28
    .line 29
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    sget-object p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 36
    .line 37
    const-string p1, "Creating server transaction for ACK -- makes no sense!"

    .line 38
    .line 39
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 43
    .line 44
    const-string p1, "Cannot create Server transaction for ACK "

    .line 45
    .line 46
    invoke-direct {p0, p1}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "NOTIFY"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-nez v1, :cond_3

    .line 73
    .line 74
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint()Landroid/javax/sip/ListeningPoint;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 81
    .line 82
    invoke-virtual {v1, v0, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findSubscribeTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/ListeningPointImpl;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-nez v1, :cond_3

    .line 87
    .line 88
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDeliverUnsolicitedNotify()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 98
    .line 99
    const-string p1, "Cannot find matching Subscription (and android.gov.nist.javax.sip.DELIVER_UNSOLICITED_NOTIFY not set)"

    .line 100
    .line 101
    invoke-direct {p0, p1}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_3
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 106
    .line 107
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/SipStackImpl;->acquireSem()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_13

    .line 112
    .line 113
    :try_start_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    const/4 v2, 0x1

    .line 122
    if-eqz v1, :cond_9

    .line 123
    .line 124
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 125
    .line 126
    move-object v3, p1

    .line 127
    check-cast v3, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 128
    .line 129
    invoke-virtual {v1, v3, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-nez v1, :cond_8

    .line 134
    .line 135
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 136
    .line 137
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getTransaction()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 142
    .line 143
    if-eqz p1, :cond_7

    .line 144
    .line 145
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    if-nez v1, :cond_4

    .line 150
    .line 151
    invoke-interface {p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catchall_0
    move-exception p1

    .line 156
    goto/16 :goto_3

    .line 157
    .line 158
    :cond_4
    :goto_1
    :try_start_2
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 159
    .line 160
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 161
    .line 162
    .line 163
    :try_start_3
    invoke-interface {p1, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->addEventListener(Landroid/gov/nist/javax/sip/stack/SIPTransactionEventListener;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_b

    .line 171
    .line 172
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 177
    .line 178
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-nez v1, :cond_5

    .line 183
    .line 184
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 185
    .line 186
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createDialog(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    :cond_5
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-interface {p1, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    const-string v3, "INVITE"

    .line 202
    .line 203
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_6

    .line 208
    .line 209
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_6

    .line 214
    .line 215
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 216
    .line 217
    invoke-virtual {v2, p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putInMergeTable(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 218
    .line 219
    .line 220
    :cond_6
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteTag()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-eqz v0, :cond_b

    .line 228
    .line 229
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLocalTag()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-eqz v0, :cond_b

    .line 234
    .line 235
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :catch_0
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 242
    .line 243
    const-string v0, "Error sending provisional response"

    .line 244
    .line 245
    invoke-direct {p1, v0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw p1

    .line 249
    :cond_7
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 250
    .line 251
    const-string v0, "Transaction not available"

    .line 252
    .line 253
    invoke-direct {p1, v0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw p1

    .line 257
    :cond_8
    new-instance p1, Landroid/javax/sip/TransactionAlreadyExistsException;

    .line 258
    .line 259
    const-string v0, "server transaction already exists!"

    .line 260
    .line 261
    invoke-direct {p1, v0}, Landroid/javax/sip/TransactionAlreadyExistsException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw p1

    .line 265
    :cond_9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    .line 266
    .line 267
    .line 268
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 269
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 270
    .line 271
    const-string v4, "Transaction exists! "

    .line 272
    .line 273
    if-eqz v1, :cond_e

    .line 274
    .line 275
    :try_start_4
    move-object v1, p1

    .line 276
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 277
    .line 278
    invoke-virtual {v3, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 283
    .line 284
    if-nez v1, :cond_d

    .line 285
    .line 286
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 287
    .line 288
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getTransaction()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 293
    .line 294
    if-eqz p1, :cond_c

    .line 295
    .line 296
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    if-nez v1, :cond_a

    .line 301
    .line 302
    invoke-interface {p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 303
    .line 304
    .line 305
    :cond_a
    :try_start_5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 306
    .line 307
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 308
    .line 309
    .line 310
    :try_start_6
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 315
    .line 316
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    if-eqz v1, :cond_b

    .line 321
    .line 322
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-interface {p1, v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 333
    .line 334
    .line 335
    :cond_b
    :goto_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 336
    .line 337
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipStackImpl;->releaseSem()V

    .line 338
    .line 339
    .line 340
    return-object p1

    .line 341
    :catch_1
    :try_start_7
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 342
    .line 343
    const-string v0, "Could not send back provisional response!"

    .line 344
    .line 345
    invoke-direct {p1, v0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw p1

    .line 349
    :cond_c
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 350
    .line 351
    const-string v0, "Transaction not available!"

    .line 352
    .line 353
    invoke-direct {p1, v0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw p1

    .line 357
    :cond_d
    new-instance p1, Landroid/javax/sip/TransactionAlreadyExistsException;

    .line 358
    .line 359
    invoke-direct {p1, v4}, Landroid/javax/sip/TransactionAlreadyExistsException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw p1

    .line 363
    :cond_e
    move-object v1, p1

    .line 364
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 365
    .line 366
    invoke-virtual {v3, v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 371
    .line 372
    if-nez v1, :cond_12

    .line 373
    .line 374
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 375
    .line 376
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getTransaction()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 381
    .line 382
    if-eqz p1, :cond_10

    .line 383
    .line 384
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getOriginalRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    if-nez v1, :cond_f

    .line 389
    .line 390
    invoke-interface {p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 391
    .line 392
    .line 393
    :cond_f
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 394
    .line 395
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mapTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 403
    .line 404
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    if-eqz v1, :cond_b

    .line 409
    .line 410
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 411
    .line 412
    .line 413
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-interface {p1, v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    goto :goto_2

    .line 424
    :cond_10
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMessageChannel()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    check-cast p1, Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 429
    .line 430
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 431
    .line 432
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createServerTransaction(Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    if-eqz p1, :cond_11

    .line 437
    .line 438
    invoke-interface {p1, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setOriginalRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 439
    .line 440
    .line 441
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 442
    .line 443
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mapTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 451
    .line 452
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    if-eqz v1, :cond_b

    .line 457
    .line 458
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-interface {p1, v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    goto/16 :goto_2

    .line 472
    .line 473
    :cond_11
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 474
    .line 475
    const-string v0, "Transaction unavailable -- too many servrer transactions"

    .line 476
    .line 477
    invoke-direct {p1, v0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    throw p1

    .line 481
    :cond_12
    new-instance p1, Landroid/javax/sip/TransactionAlreadyExistsException;

    .line 482
    .line 483
    invoke-direct {p1, v4}, Landroid/javax/sip/TransactionAlreadyExistsException;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 487
    :goto_3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 488
    .line 489
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipStackImpl;->releaseSem()V

    .line 490
    .line 491
    .line 492
    throw p1

    .line 493
    :cond_13
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 494
    .line 495
    const-string p1, "Transaction not available -- could not acquire stack lock"

    .line 496
    .line 497
    invoke-direct {p0, p1}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    throw p0

    .line 501
    :catch_2
    move-exception p0

    .line 502
    new-instance p1, Landroid/javax/sip/TransactionUnavailableException;

    .line 503
    .line 504
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-direct {p1, v0, p0}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 509
    .line 510
    .line 511
    throw p1

    .line 512
    :cond_14
    new-instance p0, Landroid/javax/sip/TransactionUnavailableException;

    .line 513
    .line 514
    const-string p1, "Stack is stopped"

    .line 515
    .line 516
    invoke-direct {p0, p1}, Landroid/javax/sip/TransactionUnavailableException;-><init>(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    throw p0
.end method

.method public getSipListener()Landroid/javax/sip/SipListener;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipListener:Landroid/javax/sip/SipListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSipStack()Landroid/javax/sip/SipStack;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V
    .locals 4

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    if-eqz v0, :cond_2

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "handleEvent "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v3, "currentTransaction = "

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v3, "this.sipListener = "

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v3, "sipEvent.source = "

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    instance-of v0, p1, Landroid/javax/sip/RequestEvent;

    .line 63
    .line 64
    const-string v2, "Dialog = "

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    move-object v0, p1

    .line 69
    check-cast v0, Landroid/javax/sip/RequestEvent;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/javax/sip/RequestEvent;->getDialog()Landroid/javax/sip/Dialog;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sget-object v3, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 76
    .line 77
    invoke-interface {v3, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    sget-object v1, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 84
    .line 85
    new-instance v3, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    instance-of v0, p1, Landroid/javax/sip/ResponseEvent;

    .line 102
    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    move-object v0, p1

    .line 106
    check-cast v0, Landroid/javax/sip/ResponseEvent;

    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/javax/sip/ResponseEvent;->getDialog()Landroid/javax/sip/Dialog;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sget-object v3, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 113
    .line 114
    invoke-interface {v3, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_1

    .line 119
    .line 120
    sget-object v1, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 121
    .line 122
    new-instance v3, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_1
    :goto_0
    sget-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 138
    .line 139
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 140
    .line 141
    .line 142
    :cond_2
    new-instance v0, Landroid/gov/nist/javax/sip/EventWrapper;

    .line 143
    .line 144
    invoke-direct {v0, p1, p2}, Landroid/gov/nist/javax/sip/EventWrapper;-><init>(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->isReEntrantListener()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 154
    .line 155
    if-nez p1, :cond_3

    .line 156
    .line 157
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/EventScanner;->addEvent(Landroid/gov/nist/javax/sip/EventWrapper;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/EventScanner;->deliverEvent(Landroid/gov/nist/javax/sip/EventWrapper;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public isAutomaticDialogSupportEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->automaticDialogSupportEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public isDialogErrorsAutomaticallyHandled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->dialogErrorsAutomaticallyHandled:Z

    .line 2
    .line 3
    return p0
.end method

.method public declared-synchronized removeListeningPoint(Landroid/javax/sip/ListeningPoint;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    check-cast p1, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 3
    .line 4
    iget-object v0, p1, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->inUse()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getTransport()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_1
    new-instance p1, Landroid/javax/sip/ObjectInUseException;

    .line 30
    .line 31
    const-string v0, "Object is in use"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Landroid/javax/sip/ObjectInUseException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw p1
.end method

.method public declared-synchronized removeListeningPoints()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 23
    .line 24
    iget-object v1, v1, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->stop()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw v0
.end method

.method public removeSipListener(Landroid/javax/sip/SipListener;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    iput-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipListener:Landroid/javax/sip/SipListener;

    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->getSipProviders()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    if-nez v0, :cond_3

    .line 38
    .line 39
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 40
    .line 41
    iput-object v1, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipListener:Landroid/javax/sip/SipListener;

    .line 42
    .line 43
    :cond_3
    return-void
.end method

.method public sendRequest(Landroid/javax/sip/message/Request;)V
    .locals 10

    .line 1
    const-string v0, " listeningPoints = "

    .line 2
    .line 3
    const-string v1, " to hop "

    .line 4
    .line 5
    const-string v2, "done sending "

    .line 6
    .line 7
    const-string v3, "Could not create a message channel for "

    .line 8
    .line 9
    iget-object v4, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 10
    .line 11
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAlive()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_c

    .line 16
    .line 17
    move-object v4, p1

    .line 18
    check-cast v4, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestLine()Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const-string v6, "ACK"

    .line 31
    .line 32
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    iget-object v5, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 39
    .line 40
    move-object v6, p1

    .line 41
    check-cast v6, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    invoke-virtual {v6, v7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-interface {v5}, Landroid/javax/sip/Dialog;->getState()Landroid/javax/sip/DialogState;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    sget-object v6, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 61
    .line 62
    invoke-interface {v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_0

    .line 67
    .line 68
    sget-object v6, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 69
    .line 70
    new-instance v7, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v8, "Dialog exists -- you may want to use Dialog.sendAck() "

    .line 73
    .line 74
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v5}, Landroid/javax/sip/Dialog;->getState()Landroid/javax/sip/DialogState;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_0
    iget-object v5, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 92
    .line 93
    invoke-virtual {v5, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getRouter(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/javax/sip/address/Router;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-interface {v5, p1}, Landroid/javax/sip/address/Router;->getNextHop(Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    if-eqz v5, :cond_b

    .line 102
    .line 103
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->isNullRequest()Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_2

    .line 108
    .line 109
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    if-eqz v6, :cond_1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    const-string p0, "Invalid SipRequest -- no via header!"

    .line 117
    .line 118
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    :goto_0
    const/16 v6, 0x20

    .line 123
    .line 124
    :try_start_0
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->isNullRequest()Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-nez v7, :cond_4

    .line 129
    .line 130
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    if-eqz v8, :cond_3

    .line 139
    .line 140
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-nez v8, :cond_4

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :catchall_0
    move-exception p0

    .line 148
    goto/16 :goto_5

    .line 149
    .line 150
    :catch_0
    move-exception p0

    .line 151
    goto/16 :goto_3

    .line 152
    .line 153
    :catch_1
    move-exception v4

    .line 154
    goto/16 :goto_4

    .line 155
    .line 156
    :cond_3
    :goto_1
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    invoke-virtual {v7, v8}, Landroid/gov/nist/javax/sip/header/Via;->setBranch(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    iget-object v7, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 164
    .line 165
    invoke-interface {v5}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    invoke-virtual {v8}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-virtual {v7, v8}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-eqz v7, :cond_5

    .line 178
    .line 179
    iget-object v7, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 180
    .line 181
    invoke-interface {v5}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-virtual {p0, v8}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-interface {v8}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-interface {v5}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-virtual {p0, v9}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-interface {v9}, Landroid/javax/sip/ListeningPoint;->getPort()I

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    invoke-virtual {v7, v8, v9, v5}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createRawMessageChannel(Ljava/lang/String;ILandroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    goto :goto_2

    .line 210
    :cond_5
    const/4 v7, 0x0

    .line 211
    :goto_2
    if-eqz v7, :cond_6

    .line 212
    .line 213
    invoke-virtual {v7, v4, v5}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Landroid/javax/sip/address/Hop;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    .line 215
    .line 216
    sget-object p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 217
    .line 218
    invoke-interface {p0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    if-eqz p0, :cond_8

    .line 223
    .line 224
    sget-object p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 225
    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {p1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :cond_6
    :try_start_1
    sget-object v4, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 253
    .line 254
    invoke-interface {v4, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-eqz v4, :cond_7

    .line 259
    .line 260
    sget-object v4, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 261
    .line 262
    new-instance v7, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v5}, Landroid/javax/sip/address/Hop;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    iget-object v8, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 278
    .line 279
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    invoke-interface {v4, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :cond_7
    new-instance v4, Landroid/javax/sip/SipException;

    .line 290
    .line 291
    new-instance v7, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v5}, Landroid/javax/sip/address/Hop;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-direct {v4, v7}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 311
    :goto_3
    :try_start_2
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 312
    .line 313
    .line 314
    sget-object p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 315
    .line 316
    invoke-interface {p0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    if-eqz p0, :cond_8

    .line 321
    .line 322
    sget-object p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 323
    .line 324
    new-instance v0, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-interface {p1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    :cond_8
    return-void

    .line 350
    :goto_4
    :try_start_3
    sget-object v7, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 351
    .line 352
    invoke-interface {v7, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    if-eqz v7, :cond_9

    .line 357
    .line 358
    sget-object v7, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 359
    .line 360
    new-instance v8, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-interface {v5}, Landroid/javax/sip/address/Hop;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 376
    .line 377
    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string p0, " because of an IO issue "

    .line 381
    .line 382
    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    invoke-interface {v7, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    :cond_9
    new-instance p0, Landroid/javax/sip/SipException;

    .line 400
    .line 401
    const-string v0, "IO Exception occured while Sending Request"

    .line 402
    .line 403
    invoke-direct {p0, v0, v4}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 404
    .line 405
    .line 406
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 407
    :goto_5
    sget-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 408
    .line 409
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_a

    .line 414
    .line 415
    sget-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 416
    .line 417
    new-instance v3, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    invoke-interface {p1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    invoke-interface {v0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    :cond_a
    throw p0

    .line 443
    :cond_b
    const-string p0, "could not determine next hop!"

    .line 444
    .line 445
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :cond_c
    const-string p0, "Stack is stopped."

    .line 450
    .line 451
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-void
.end method

.method public sendResponse(Landroid/javax/sip/message/Response;)V
    .locals 6

    .line 1
    const-string v0, "whoopsa daisy! no listening point found for transport "

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAlive()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_b

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_a

    .line 19
    .line 20
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 21
    .line 22
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-virtual {v3, p1, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 v3, 0x5

    .line 38
    if-eq p1, v3, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string p0, "Transaction exists -- cannot send response statelessly"

    .line 48
    .line 49
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getReceived()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getHost()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :cond_2
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getRPort()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const/4 v5, -0x1

    .line 72
    if-ne v4, v5, :cond_5

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-ne v4, v5, :cond_5

    .line 79
    .line 80
    const-string v2, "TLS"

    .line 81
    .line 82
    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    const-string v2, "SCTP-TLS"

    .line 89
    .line 90
    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    const/16 v4, 0x13c4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    :goto_1
    const/16 v4, 0x13c5

    .line 101
    .line 102
    :cond_5
    :goto_2
    const-string v2, ":"

    .line 103
    .line 104
    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-lez v2, :cond_6

    .line 109
    .line 110
    const-string v2, "["

    .line 111
    .line 112
    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-gez v5, :cond_6

    .line 117
    .line 118
    const-string v5, "]"

    .line 119
    .line 120
    invoke-static {v2, v3, v5}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    :cond_6
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 125
    .line 126
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getAddressResolver()Landroid/gov/nist/core/net/AddressResolver;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    new-instance v5, Landroid/gov/nist/javax/sip/stack/HopImpl;

    .line 131
    .line 132
    invoke-direct {v5, v3, v4, p1}, Landroid/gov/nist/javax/sip/stack/HopImpl;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v2, v5}, Landroid/gov/nist/core/net/AddressResolver;->resolveAddress(Landroid/javax/sip/address/Hop;)Landroid/javax/sip/address/Hop;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v3, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 144
    .line 145
    if-eqz v3, :cond_9

    .line 146
    .line 147
    iget-object p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 148
    .line 149
    invoke-interface {v2}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-interface {v0}, Landroid/javax/sip/ListeningPoint;->getIPAddress()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget v3, v3, Landroid/gov/nist/javax/sip/ListeningPointImpl;->port:I

    .line 162
    .line 163
    invoke-virtual {p1, v0, v3, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createRawMessageChannel(Ljava/lang/String;ILandroid/javax/sip/address/Hop;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_7

    .line 168
    .line 169
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_7
    sget-object p1, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 174
    .line 175
    const/16 v0, 0x20

    .line 176
    .line 177
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 178
    .line 179
    .line 180
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    const-string v0, "Could not create a message channel for "

    .line 182
    .line 183
    if-eqz p1, :cond_8

    .line 184
    .line 185
    :try_start_1
    sget-object p1, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 186
    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v2}, Landroid/javax/sip/address/Hop;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v3, " listeningPoints = "

    .line 200
    .line 201
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 205
    .line 206
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_8
    new-instance p0, Landroid/javax/sip/SipException;

    .line 217
    .line 218
    new-instance p1, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-interface {v2}, Landroid/javax/sip/address/Hop;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p0

    .line 238
    :cond_9
    new-instance p0, Landroid/javax/sip/SipException;

    .line 239
    .line 240
    new-instance v1, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 256
    :catch_0
    move-exception p0

    .line 257
    new-instance p1, Landroid/javax/sip/SipException;

    .line 258
    .line 259
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-direct {p1, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw p1

    .line 267
    :cond_a
    const-string p0, "No via header in response!"

    .line 268
    .line 269
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :cond_b
    const-string p0, "Stack is stopped"

    .line 274
    .line 275
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-void
.end method

.method public setAutomaticDialogSupportEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->automaticDialogSupportEnabled:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->dialogErrorsAutomaticallyHandled:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setDialogErrorsAutomaticallyHandled()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->dialogErrorsAutomaticallyHandled:Z

    .line 3
    .line 4
    return-void
.end method

.method public declared-synchronized setListeningPoint(Landroid/javax/sip/ListeningPoint;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    move-object v0, p1

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 6
    .line 7
    iput-object p0, v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getTransport()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 32
    .line 33
    const-string v0, "Null listening point"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p1
.end method

.method public stop()V
    .locals 2

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const-string v1, "Exiting provider"

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->listeningPoints:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->removeSipProvider()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/EventScanner;->stop()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public transactionErrorEvent(Landroid/gov/nist/javax/sip/stack/SIPTransactionErrorEvent;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionErrorEvent;->getErrorID()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x2

    .line 12
    if-ne v1, v2, :cond_3

    .line 13
    .line 14
    sget-object v1, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 15
    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    sget-object v1, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v3, "TransportError occured on "

    .line 29
    .line 30
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object v0, Landroid/javax/sip/Timeout;->TRANSACTION:Landroid/javax/sip/Timeout;

    .line 48
    .line 49
    instance-of v1, p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    new-instance v1, Landroid/javax/sip/TimeoutEvent;

    .line 54
    .line 55
    move-object v2, p1

    .line 56
    check-cast v2, Landroid/javax/sip/ServerTransaction;

    .line 57
    .line 58
    invoke-direct {v1, p0, v2, v0}, Landroid/javax/sip/TimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Timeout;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v1, p1

    .line 63
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 64
    .line 65
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getNextHop()Landroid/javax/sip/address/Hop;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getRouter()Landroid/javax/sip/address/Router;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    instance-of v2, v2, Landroid/gov/nist/javax/sip/address/RouterExt;

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 80
    .line 81
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getRouter()Landroid/javax/sip/address/Router;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Landroid/gov/nist/javax/sip/address/RouterExt;

    .line 86
    .line 87
    invoke-interface {v2, v1}, Landroid/gov/nist/javax/sip/address/RouterExt;->transactionTimeout(Landroid/javax/sip/address/Hop;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    new-instance v1, Landroid/javax/sip/TimeoutEvent;

    .line 91
    .line 92
    move-object v2, p1

    .line 93
    check-cast v2, Landroid/javax/sip/ClientTransaction;

    .line 94
    .line 95
    invoke-direct {v1, p0, v2, v0}, Landroid/javax/sip/TimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/Timeout;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 99
    .line 100
    invoke-virtual {p0, v1, p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionErrorEvent;->getErrorID()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/4 v1, 0x1

    .line 109
    if-ne v0, v1, :cond_6

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    sget-object v0, Landroid/javax/sip/Timeout;->TRANSACTION:Landroid/javax/sip/Timeout;

    .line 116
    .line 117
    instance-of v1, p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 118
    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    new-instance v1, Landroid/javax/sip/TimeoutEvent;

    .line 122
    .line 123
    move-object v2, p1

    .line 124
    check-cast v2, Landroid/javax/sip/ServerTransaction;

    .line 125
    .line 126
    invoke-direct {v1, p0, v2, v0}, Landroid/javax/sip/TimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Timeout;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    move-object v1, p1

    .line 131
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 132
    .line 133
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getNextHop()Landroid/javax/sip/address/Hop;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getRouter()Landroid/javax/sip/address/Router;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    instance-of v2, v2, Landroid/gov/nist/javax/sip/address/RouterExt;

    .line 144
    .line 145
    if-eqz v2, :cond_5

    .line 146
    .line 147
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipProviderImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 148
    .line 149
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getRouter()Landroid/javax/sip/address/Router;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, Landroid/gov/nist/javax/sip/address/RouterExt;

    .line 154
    .line 155
    invoke-interface {v2, v1}, Landroid/gov/nist/javax/sip/address/RouterExt;->transactionTimeout(Landroid/javax/sip/address/Hop;)V

    .line 156
    .line 157
    .line 158
    :cond_5
    new-instance v1, Landroid/javax/sip/TimeoutEvent;

    .line 159
    .line 160
    move-object v2, p1

    .line 161
    check-cast v2, Landroid/javax/sip/ClientTransaction;

    .line 162
    .line 163
    invoke-direct {v1, p0, v2, v0}, Landroid/javax/sip/TimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/Timeout;)V

    .line 164
    .line 165
    .line 166
    :goto_1
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 167
    .line 168
    invoke-virtual {p0, v1, p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_6
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionErrorEvent;->getErrorID()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    const/4 v1, 0x3

    .line 177
    if-ne v0, v1, :cond_9

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    move-object v0, p1

    .line 184
    check-cast v0, Landroid/javax/sip/Transaction;

    .line 185
    .line 186
    invoke-interface {v0}, Landroid/javax/sip/Transaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-eqz v0, :cond_7

    .line 191
    .line 192
    const-string v0, "Unexpected event !"

    .line 193
    .line 194
    sget-object v1, Landroid/gov/nist/javax/sip/SipProviderImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 195
    .line 196
    invoke-static {v0, v1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    sget-object v0, Landroid/javax/sip/Timeout;->RETRANSMIT:Landroid/javax/sip/Timeout;

    .line 200
    .line 201
    instance-of v1, p1, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 202
    .line 203
    if-eqz v1, :cond_8

    .line 204
    .line 205
    new-instance v1, Landroid/javax/sip/TimeoutEvent;

    .line 206
    .line 207
    move-object v2, p1

    .line 208
    check-cast v2, Landroid/javax/sip/ServerTransaction;

    .line 209
    .line 210
    invoke-direct {v1, p0, v2, v0}, Landroid/javax/sip/TimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Timeout;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_8
    new-instance v1, Landroid/javax/sip/TimeoutEvent;

    .line 215
    .line 216
    move-object v2, p1

    .line 217
    check-cast v2, Landroid/javax/sip/ClientTransaction;

    .line 218
    .line 219
    invoke-direct {v1, p0, v2, v0}, Landroid/javax/sip/TimeoutEvent;-><init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/Timeout;)V

    .line 220
    .line 221
    .line 222
    :goto_2
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 223
    .line 224
    invoke-virtual {p0, v1, p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 225
    .line 226
    .line 227
    :cond_9
    return-void
.end method

.class Landroid/gov/nist/javax/sip/DialogFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;
.implements Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field protected listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

.field private sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

.field protected transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/DialogFilter;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 5
    .line 6
    return-void
.end method

.method private sendBadRequestResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 6
    .line 7
    if-eq v0, v1, :cond_3

    .line 8
    .line 9
    const/16 v0, 0x190

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p3}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setReasonPhrase(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string p3, "INVITE"

    .line 34
    .line 35
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    invoke-interface {p2, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :goto_1
    sget-object p3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 57
    .line 58
    const-string v0, "Problem sending error response"

    .line 59
    .line 60
    invoke-interface {p3, v0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 67
    .line 68
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method private sendCallOrTransactionDoesNotExistResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 6
    .line 7
    if-eq v0, v1, :cond_2

    .line 8
    .line 9
    const/16 v0, 0x1e1

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v1, "INVITE"

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    invoke-interface {p2, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_1
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 52
    .line 53
    const-string v1, "Problem sending error response"

    .line 54
    .line 55
    invoke-interface {v0, v1, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 62
    .line 63
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void
.end method

.method private sendLoopDetectedResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 2

    .line 1
    const/16 v0, 0x1e2

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p2, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception p1

    .line 37
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 38
    .line 39
    const-string v1, "Problem sending error response"

    .line 40
    .line 41
    invoke-interface {v0, v1, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method private sendRequestPendingResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 3

    .line 1
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 6
    .line 7
    if-eq v0, v1, :cond_2

    .line 8
    .line 9
    const/16 v0, 0x1eb

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :try_start_0
    new-instance v1, Landroid/gov/nist/javax/sip/header/RetryAfter;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/RetryAfter;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/header/RetryAfter;->setRetryAfter(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v1, "INVITE"

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget-object p1, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    :goto_0
    invoke-interface {p2, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_1
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 64
    .line 65
    const-string v1, "Problem sending error response"

    .line 66
    .line 67
    invoke-interface {v0, v1, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 74
    .line 75
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return-void
.end method

.method private sendServerInternalErrorResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 6
    .line 7
    if-eq v0, v1, :cond_2

    .line 8
    .line 9
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    const-string v1, "Sending 500 response for out of sequence message"

    .line 22
    .line 23
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/16 v0, 0x1f4

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "Request out of order"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setReasonPhrase(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/header/RetryAfter;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/RetryAfter;-><init>()V

    .line 53
    .line 54
    .line 55
    const/16 v1, 0xa

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/header/RetryAfter;->setRetryAfter(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 64
    .line 65
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p2, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catch_0
    move-exception p1

    .line 76
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 77
    .line 78
    const-string v1, "Problem sending response"

    .line 79
    .line 80
    invoke-interface {v0, v1, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 87
    .line 88
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    return-void
.end method

.method private sendTryingResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 2

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :try_start_0
    invoke-interface {p2, p1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p1

    .line 32
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 33
    .line 34
    const-string v1, "Problem sending error response"

    .line 35
    .line 36
    invoke-interface {v0, v1, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 43
    .line 44
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method


# virtual methods
.method public getProcessingInfo()Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v3, 0x20

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PROCESSING INCOMING REQUEST "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " transactionChannel = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " listening point = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getIPAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getPort()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    if-nez v0, :cond_1

    .line 4
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_57

    .line 5
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v1, "Dropping message: No listening point registered!"

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    iget-object v0, v1, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    move-result-object v4

    .line 7
    iget-object v0, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    move-result-object v5

    if-nez v5, :cond_2

    .line 8
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_57

    .line 9
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v1, "No provider - dropping !!"

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    return-void

    :cond_2
    if-nez v4, :cond_3

    .line 10
    const-string v0, "Egads! no sip stack!"

    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/String;)V

    .line 11
    :cond_3
    iget-object v0, v1, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    move-object v6, v0

    check-cast v6, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    if-eqz v6, :cond_4

    .line 12
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 13
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "transaction state = "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getState()Landroid/javax/sip/TransactionState;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_4
    const/4 v0, 0x1

    .line 14
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    move-result-object v7

    .line 15
    invoke-virtual {v4, v7}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v8

    const/16 v10, 0x13c5

    if-eqz v8, :cond_b

    .line 16
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    move-result-object v12

    if-eq v5, v12, :cond_b

    .line 17
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMyContactHeader()Landroid/gov/nist/javax/sip/header/Contact;

    move-result-object v12

    if-eqz v12, :cond_b

    .line 18
    invoke-virtual {v12}, Landroid/gov/nist/javax/sip/header/Contact;->getAddress()Landroid/javax/sip/address/Address;

    move-result-object v12

    invoke-interface {v12}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    move-result-object v12

    check-cast v12, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 19
    invoke-virtual {v12}, Landroid/gov/nist/javax/sip/address/SipUri;->getHost()Ljava/lang/String;

    move-result-object v13

    .line 20
    invoke-virtual {v12}, Landroid/gov/nist/javax/sip/address/SipUri;->getPort()I

    move-result v14

    .line 21
    invoke-virtual {v12}, Landroid/gov/nist/javax/sip/address/SipUri;->getTransportParam()Ljava/lang/String;

    move-result-object v12

    .line 22
    const-string v15, "udp"

    if-nez v12, :cond_5

    move-object v12, v15

    :cond_5
    const/4 v9, -0x1

    if-ne v14, v9, :cond_8

    .line 23
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    const-string v9, "tcp"

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    goto :goto_0

    :cond_6
    move v14, v10

    goto :goto_1

    :cond_7
    :goto_0
    const/16 v14, 0x13c4

    :cond_8
    :goto_1
    if-eqz v13, :cond_b

    .line 24
    iget-object v9, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getIPAddress()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    iget-object v9, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getPort()I

    move-result v9

    if-eq v14, v9, :cond_b

    .line 25
    :cond_9
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v8, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 26
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v9, "nulling dialog -- listening point mismatch!  "

    const-string v12, "  lp port = "

    .line 27
    invoke-static {v14, v9, v12}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 28
    iget-object v12, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v12}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getPort()I

    move-result v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_a
    const/4 v8, 0x0

    .line 29
    :cond_b
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_c

    .line 30
    invoke-virtual {v4, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findMergedTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;)Z

    move-result v9

    if-eqz v9, :cond_c

    .line 31
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendLoopDetectedResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    return-void

    .line 32
    :cond_c
    sget-object v9, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v9, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v9

    if-eqz v9, :cond_d

    .line 33
    sget-object v9, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v12, "dialogId = "

    .line 34
    invoke-static {v12, v7, v9}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 35
    sget-object v9, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "dialog = "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v9, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 36
    :cond_d
    const-string v9, "Route"

    invoke-virtual {v2, v9}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    move-result-object v12

    if-eqz v12, :cond_12

    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getDialog()Landroid/javax/sip/Dialog;

    move-result-object v12

    if-eqz v12, :cond_12

    .line 37
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;

    move-result-object v12

    .line 38
    invoke-virtual {v12}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    move-result-object v13

    check-cast v13, Landroid/gov/nist/javax/sip/header/Route;

    .line 39
    invoke-virtual {v13}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    move-result-object v13

    invoke-interface {v13}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    move-result-object v13

    check-cast v13, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 40
    invoke-virtual {v13}, Landroid/gov/nist/javax/sip/address/SipUri;->getHostPort()Landroid/gov/nist/core/HostPort;

    move-result-object v13

    .line 41
    invoke-virtual {v13}, Landroid/gov/nist/core/HostPort;->hasPort()Z

    move-result v14

    if-eqz v14, :cond_e

    .line 42
    invoke-virtual {v13}, Landroid/gov/nist/core/HostPort;->getPort()I

    move-result v10

    goto :goto_2

    .line 43
    :cond_e
    iget-object v14, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v14}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getTransport()Ljava/lang/String;

    move-result-object v14

    const-string v15, "TLS"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_f

    goto :goto_2

    :cond_f
    const/16 v10, 0x13c4

    .line 44
    :goto_2
    invoke-virtual {v13}, Landroid/gov/nist/core/HostPort;->getHost()Landroid/gov/nist/core/Host;

    move-result-object v13

    invoke-virtual {v13}, Landroid/gov/nist/core/Host;->encode()Ljava/lang/String;

    move-result-object v13

    .line 45
    iget-object v14, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v14}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getIPAddress()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_10

    iget-object v14, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v14}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getSentBy()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_12

    :cond_10
    iget-object v13, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v13}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getPort()I

    move-result v13

    if-ne v10, v13, :cond_12

    .line 46
    invoke-virtual {v12}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->size()I

    move-result v10

    if-ne v10, v0, :cond_11

    .line 47
    invoke-virtual {v2, v9}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    goto :goto_3

    .line 48
    :cond_11
    invoke-virtual {v12}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->removeFirst()V

    .line 49
    :cond_12
    :goto_3
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    move-result-object v9

    .line 50
    const-string v10, "REFER"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    const-string v12, " "

    const-string v13, "BYE"

    const-string v14, "PRACK"

    const-string v15, "ACK"

    const-string v3, "CANCEL"

    const-string v0, "INVITE"

    if-eqz v10, :cond_19

    if-eqz v8, :cond_19

    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    move-result v10

    if-eqz v10, :cond_19

    .line 51
    const-string v10, "Refer-To"

    invoke-virtual {v2, v10}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    move-result-object v10

    check-cast v10, Landroid/javax/sip/header/ReferToHeader;

    if-nez v10, :cond_13

    .line 52
    const-string v0, "Refer-To header is missing"

    invoke-direct {v1, v2, v6, v0}, Landroid/gov/nist/javax/sip/DialogFilter;->sendBadRequestResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;Ljava/lang/String;)V

    return-void

    .line 53
    :cond_13
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastTransaction()Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    move-result-object v10

    if-eqz v10, :cond_16

    .line 54
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    move-result v16

    if-eqz v16, :cond_16

    .line 55
    invoke-interface {v10}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMethod()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v17, v3

    .line 56
    instance-of v3, v10, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    if-eqz v3, :cond_15

    .line 57
    invoke-interface {v10}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v3

    move-object/from16 v18, v12

    const/4 v12, 0x2

    if-eq v3, v12, :cond_14

    invoke-interface {v10}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v3

    const/4 v10, 0x1

    if-ne v3, v10, :cond_17

    :cond_14
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 58
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendRequestPendingResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    return-void

    :cond_15
    move-object/from16 v18, v12

    .line 59
    instance-of v3, v10, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    if-eqz v3, :cond_17

    .line 60
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v10}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v0

    const/4 v3, 0x5

    if-eq v0, v3, :cond_17

    invoke-interface {v10}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_17

    .line 61
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendRequestPendingResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    return-void

    :cond_16
    move-object/from16 v17, v3

    move-object/from16 v18, v12

    :cond_17
    :goto_4
    move-object/from16 v19, v15

    :catch_0
    :cond_18
    :goto_5
    move-object/from16 v3, v17

    move-object/from16 v10, v18

    goto/16 :goto_f

    :cond_19
    move-object/from16 v17, v3

    move-object/from16 v18, v12

    .line 62
    const-string v3, "UPDATE"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1a

    .line 63
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    move-result v0

    if-eqz v0, :cond_17

    if-nez v8, :cond_17

    .line 64
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendCallOrTransactionDoesNotExistResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    return-void

    .line 65
    :cond_1a
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v10, " isServerTransaction = true"

    const-string v11, "Dialog does not exist "

    if-eqz v3, :cond_2b

    if-eqz v6, :cond_1b

    .line 66
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    move-result v3

    if-eqz v3, :cond_1b

    .line 67
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v3, 0x20

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 68
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v10, "Processing ACK for INVITE Tx "

    invoke-interface {v0, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    goto :goto_4

    :cond_1b
    const/16 v3, 0x20

    .line 69
    sget-object v12, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v12, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v12

    if-eqz v12, :cond_1c

    .line 70
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v12, Ljava/lang/StringBuilder;

    move-object/from16 v19, v15

    const-string v15, "Processing ACK for dialog "

    invoke-direct {v12, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v3, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    goto :goto_6

    :cond_1c
    move-object/from16 v19, v15

    .line 71
    :goto_6
    const-string v3, "Problem terminating transaction"

    const-string v12, "Found Tx pending ACK"

    if-nez v8, :cond_20

    .line 72
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 73
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 74
    :cond_1d
    invoke-virtual {v4, v7}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getRetransmissionAlertTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    move-result-object v0

    if-eqz v0, :cond_1e

    .line 75
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isRetransmissionAlertEnabled()Z

    move-result v10

    if-eqz v10, :cond_1e

    .line 76
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->disableRetransmissionAlerts()V

    .line 77
    :cond_1e
    invoke-virtual {v4, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransactionPendingAck(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 78
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v1, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v1

    if-eqz v1, :cond_1f

    .line 79
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v1, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 80
    :cond_1f
    :try_start_0
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setAckSeen()V

    .line 81
    invoke-virtual {v4, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 82
    invoke-virtual {v4, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_1
    move-exception v0

    .line 83
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result v1

    if-eqz v1, :cond_57

    .line 84
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v1, v3, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    goto/16 :goto_11

    .line 85
    :cond_20
    invoke-virtual {v8, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->handleAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z

    move-result v10

    if-nez v10, :cond_28

    .line 86
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isSequenceNumberValidation()Z

    move-result v0

    if-nez v0, :cond_24

    .line 87
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 88
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Dialog exists with loose dialog validation "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " isServerTransaction = true dialog = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 89
    :cond_21
    invoke-virtual {v4, v7}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getRetransmissionAlertTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    move-result-object v0

    if-eqz v0, :cond_22

    .line 90
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isRetransmissionAlertEnabled()Z

    move-result v10

    if-eqz v10, :cond_22

    .line 91
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->disableRetransmissionAlerts()V

    .line 92
    :cond_22
    invoke-virtual {v4, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransactionPendingAck(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 93
    sget-object v10, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v10, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v10

    if-eqz v10, :cond_23

    .line 94
    sget-object v10, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v10, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 95
    :cond_23
    :try_start_1
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setAckSeen()V

    .line 96
    invoke-virtual {v4, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 97
    invoke-virtual {v4, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_5

    :catch_2
    move-exception v0

    .line 98
    sget-object v10, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v10}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result v10

    if-eqz v10, :cond_18

    .line 99
    sget-object v10, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v10, v3, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    goto/16 :goto_5

    .line 100
    :cond_24
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_25

    .line 101
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v10, "Dropping ACK - cannot find a transaction or dialog"

    invoke-interface {v0, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 102
    :cond_25
    invoke-virtual {v4, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransactionPendingAck(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    move-result-object v10

    if-eqz v10, :cond_27

    .line 103
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 104
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v0, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 105
    :cond_26
    :try_start_2
    invoke-interface {v10}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setAckSeen()V

    .line 106
    invoke-virtual {v4, v10}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 107
    invoke-virtual {v4, v10}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransactionPendingAck(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_7

    :catch_3
    move-exception v0

    .line 108
    sget-object v11, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v11}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result v11

    if-eqz v11, :cond_27

    .line 109
    sget-object v11, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v11, v3, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 110
    :cond_27
    :goto_7
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDeliverRetransmittedAckToListener()Z

    move-result v0

    if-eqz v0, :cond_57

    if-eqz v10, :cond_18

    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isNon2XXAckPassedToListener()Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_11

    .line 111
    :cond_28
    invoke-virtual {v8, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 112
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 113
    invoke-virtual {v8, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 114
    invoke-interface {v6, v8, v7}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 115
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    move-result v0

    if-eqz v0, :cond_29

    .line 116
    invoke-virtual {v4, v6, v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putInMergeTable(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 117
    :cond_29
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDeliverTerminatedEventForAck()Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 118
    :try_start_3
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 119
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->scheduleAckRemoval()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_5

    :cond_2a
    const/4 v10, 0x1

    .line 120
    invoke-interface {v6, v10}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setMapped(Z)V

    goto/16 :goto_5

    :cond_2b
    move-object/from16 v19, v15

    .line 121
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_33

    .line 122
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 123
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v12, "Processing PRACK for dialog "

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_2c
    if-nez v8, :cond_2f

    .line 124
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 125
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 126
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 127
    :cond_2d
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 128
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v1, "Sending 481 for PRACK - automatic dialog support is enabled -- cant find dialog!"

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_2e
    const/16 v1, 0x1e1

    .line 129
    invoke-virtual {v2, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    move-result-object v0

    .line 130
    :try_start_4
    invoke-virtual {v5, v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->sendResponse(Landroid/javax/sip/message/Response;)V
    :try_end_4
    .catch Landroid/javax/sip/SipException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_8

    :catch_4
    move-exception v0

    .line 131
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v2, "error sending response"

    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_8
    if-eqz v6, :cond_57

    .line 132
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 133
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    goto/16 :goto_11

    :cond_2f
    if-eqz v8, :cond_32

    .line 134
    invoke-virtual {v8, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->handlePrack(Landroid/gov/nist/javax/sip/message/SIPRequest;)Z

    move-result v0

    if-nez v0, :cond_31

    .line 135
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 136
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v1, "Dropping out of sequence PRACK "

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_30
    if-eqz v6, :cond_57

    .line 137
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 138
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    return-void

    .line 139
    :cond_31
    :try_start_5
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 140
    invoke-virtual {v8, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 141
    invoke-virtual {v8, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 142
    invoke-interface {v6, v8, v7}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto/16 :goto_5

    :catch_5
    move-exception v0

    .line 143
    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    goto/16 :goto_5

    .line 144
    :cond_32
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 145
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v3, "Processing PRACK without a DIALOG -- this must be a proxy element"

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 146
    :cond_33
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3c

    if-eqz v8, :cond_37

    .line 147
    invoke-virtual {v8, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isRequestConsumable(Landroid/gov/nist/javax/sip/message/SIPRequest;)Z

    move-result v0

    if-nez v0, :cond_37

    .line 148
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 149
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Dropping out of sequence BYE "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteSeqNumber()J

    move-result-wide v9

    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v10, v18

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v5

    invoke-interface {v5}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    move-result-wide v9

    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 150
    :cond_34
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteSeqNumber()J

    move-result-wide v7

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v0

    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    move-result-wide v9

    cmp-long v0, v7, v9

    if-lez v0, :cond_35

    .line 151
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendServerInternalErrorResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    goto :goto_9

    .line 152
    :cond_35
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v0

    const/4 v12, 0x2

    if-ne v0, v12, :cond_36

    .line 153
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendTryingResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 154
    :cond_36
    :goto_9
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    return-void

    :cond_37
    move-object/from16 v10, v18

    if-nez v8, :cond_39

    .line 155
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    move-result v0

    if-eqz v0, :cond_39

    .line 156
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_38

    .line 157
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v3, "dropping request -- automatic dialog support enabled and dialog does not exist!"

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 158
    :cond_38
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendCallOrTransactionDoesNotExistResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    if-eqz v6, :cond_57

    .line 159
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 160
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    return-void

    :cond_39
    if-eqz v6, :cond_3a

    if-eqz v8, :cond_3a

    .line 161
    :try_start_6
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    move-result-object v0

    if-ne v5, v0, :cond_3a

    .line 162
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 163
    invoke-virtual {v8, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 164
    invoke-interface {v6, v8, v7}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_a

    :catch_6
    move-exception v0

    .line 165
    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 166
    :cond_3a
    :goto_a
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_3b

    .line 167
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v11, "BYE Tx = "

    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " isMapped ="

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isTransactionMapped()Z

    move-result v11

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_3b
    move-object/from16 v3, v17

    goto/16 :goto_f

    :cond_3c
    move-object/from16 v3, v17

    move-object/from16 v10, v18

    .line 168
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_44

    const/4 v11, 0x1

    .line 169
    invoke-virtual {v4, v2, v11}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findCancelTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 170
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 171
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v15, "Got a CANCEL, InviteServerTx = "

    invoke-direct {v12, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v15, " cancel Server Tx ID = "

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v15, " isMapped = "

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isTransactionMapped()Z

    move-result v15

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 172
    :cond_3d
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_40

    if-eqz v11, :cond_3f

    .line 173
    invoke-interface {v11}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v0

    const/4 v12, 0x5

    if-ne v0, v12, :cond_3f

    .line 174
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_3e

    .line 175
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v1, "Too late to cancel Transaction"

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_3e
    const/16 v0, 0xc8

    .line 176
    :try_start_7
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    move-result-object v0

    invoke-interface {v6, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    return-void

    :catch_7
    move-exception v0

    .line 177
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_57

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/io/IOException;

    if-eqz v0, :cond_57

    .line 178
    invoke-interface {v11}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->raiseIOExceptionEvent()V

    goto/16 :goto_11

    .line 179
    :cond_3f
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_40

    .line 180
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v15, "Cancel transaction = "

    invoke-direct {v12, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_40
    if-eqz v6, :cond_41

    if-eqz v11, :cond_41

    .line 181
    invoke-interface {v11}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getDialog()Landroid/javax/sip/Dialog;

    move-result-object v0

    if-eqz v0, :cond_41

    .line 182
    invoke-interface {v11}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getDialog()Landroid/javax/sip/Dialog;

    move-result-object v0

    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    invoke-interface {v6, v0, v7}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 183
    invoke-interface {v11}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getDialog()Landroid/javax/sip/Dialog;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/gov/nist/javax/sip/stack/SIPDialog;

    goto :goto_c

    :cond_41
    if-nez v11, :cond_43

    .line 184
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    move-result v0

    if-eqz v0, :cond_43

    if-eqz v6, :cond_43

    const/16 v12, 0x1e1

    .line 185
    invoke-virtual {v2, v12}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    move-result-object v0

    .line 186
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v1, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v1

    if-eqz v1, :cond_42

    .line 187
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v2, "dropping request -- automatic dialog support enabled and INVITE ST does not exist!"

    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 188
    :cond_42
    :try_start_8
    invoke-virtual {v5, v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->sendResponse(Landroid/javax/sip/message/Response;)V
    :try_end_8
    .catch Landroid/javax/sip/SipException; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_b

    :catch_8
    move-exception v0

    .line 189
    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 190
    :goto_b
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 191
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->releaseSem()V

    return-void

    :cond_43
    :goto_c
    if-eqz v11, :cond_4d

    .line 192
    invoke-interface {v11}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setPassToListener()V

    if-eqz v6, :cond_4d

    .line 193
    :try_start_9
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 194
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setPassToListener()V

    .line 195
    invoke-interface {v6, v11}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setInviteTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 196
    invoke-interface {v11}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->acquireSem()Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto/16 :goto_f

    :catch_9
    move-exception v0

    .line 197
    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    goto/16 :goto_f

    .line 198
    :cond_44
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4d

    if-nez v8, :cond_45

    const/4 v0, 0x0

    goto :goto_d

    .line 199
    :cond_45
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getInviteTransaction()Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    move-result-object v0

    :goto_d
    if-eqz v8, :cond_47

    if-eqz v6, :cond_47

    if-eqz v0, :cond_47

    .line 200
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v11

    invoke-interface {v11}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    move-result-wide v11

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getCSeq()J

    move-result-wide v17

    cmp-long v11, v11, v17

    if-lez v11, :cond_47

    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    move-result v11

    if-eqz v11, :cond_47

    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isSequenceNumberValidation()Z

    move-result v11

    if-eqz v11, :cond_47

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    move-result v11

    if-eqz v11, :cond_47

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v11

    const/4 v12, 0x3

    if-eq v11, v12, :cond_47

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v11

    const/4 v12, 0x5

    if-eq v11, v12, :cond_47

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v0

    const/4 v11, 0x4

    if-eq v0, v11, :cond_47

    .line 201
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_46

    .line 202
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v3, "Sending 500 response for out of sequence message"

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 203
    :cond_46
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendServerInternalErrorResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    return-void

    :cond_47
    if-nez v8, :cond_48

    const/4 v0, 0x0

    goto :goto_e

    .line 204
    :cond_48
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastTransaction()Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    move-result-object v0

    :goto_e
    if-eqz v8, :cond_4a

    .line 205
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    move-result v11

    if-eqz v11, :cond_4a

    if-eqz v0, :cond_4a

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    move-result v11

    if-eqz v11, :cond_4a

    instance-of v11, v0, Landroid/javax/sip/ClientTransaction;

    if-eqz v11, :cond_4a

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getState()Landroid/javax/sip/TransactionState;

    move-result-object v11

    sget-object v12, Landroid/javax/sip/TransactionState;->COMPLETED:Landroid/javax/sip/TransactionState;

    if-eq v11, v12, :cond_4a

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getState()Landroid/javax/sip/TransactionState;

    move-result-object v11

    sget-object v12, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    if-eq v11, v12, :cond_4a

    .line 206
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v3, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v3

    if-eqz v3, :cond_49

    .line 207
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "DialogFilter::processRequest:lastTransaction.getState(): "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getState()Landroid/javax/sip/TransactionState;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " Sending 491 response for clientTx."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 208
    :cond_49
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendRequestPendingResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    return-void

    :cond_4a
    if-eqz v8, :cond_4d

    if-eqz v0, :cond_4d

    .line 209
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    move-result v11

    if-eqz v11, :cond_4d

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->isInviteTransaction()Z

    move-result v11

    if-eqz v11, :cond_4d

    instance-of v11, v0, Landroid/javax/sip/ServerTransaction;

    if-eqz v11, :cond_4d

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v11

    invoke-interface {v11}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    move-result-wide v11

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getCSeq()J

    move-result-wide v17

    cmp-long v11, v11, v17

    if-lez v11, :cond_4d

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v11

    const/4 v12, 0x2

    if-eq v11, v12, :cond_4b

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_4d

    .line 210
    :cond_4b
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v3, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v3

    if-eqz v3, :cond_4c

    .line 211
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v4, "Sending 491 response. Last transaction is in PROCEEDING state."

    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 212
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "last Transaction state = "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " state "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getState()Landroid/javax/sip/TransactionState;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 213
    :cond_4c
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendRequestPendingResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    return-void

    .line 214
    :cond_4d
    :goto_f
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_4e

    .line 215
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "CHECK FOR OUT OF SEQ MESSAGE "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, " transaction "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v11}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_4e
    if-eqz v8, :cond_53

    if-eqz v6, :cond_53

    .line 216
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_53

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_53

    move-object/from16 v3, v19

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_53

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_53

    .line 217
    invoke-virtual {v8, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isRequestConsumable(Landroid/gov/nist/javax/sip/message/SIPRequest;)Z

    move-result v0

    if-nez v0, :cond_51

    .line 218
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_4f

    .line 219
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Dropping out of sequence message "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteSeqNumber()J

    move-result-wide v11

    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 220
    :cond_4f
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getRemoteSeqNumber()J

    move-result-wide v3

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v0

    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    move-result-wide v7

    cmp-long v0, v3, v7

    if-lez v0, :cond_50

    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isDialogErrorsAutomaticallyHandled()Z

    move-result v0

    if-eqz v0, :cond_50

    .line 221
    invoke-direct {v1, v2, v6}, Landroid/gov/nist/javax/sip/DialogFilter;->sendServerInternalErrorResponse(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    goto/16 :goto_11

    .line 222
    :cond_50
    :try_start_a
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->terminate()V
    :try_end_a
    .catch Landroid/javax/sip/ObjectInUseException; {:try_start_a .. :try_end_a} :catch_a

    goto/16 :goto_11

    :catch_a
    move-exception v0

    .line 223
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result v1

    if-eqz v1, :cond_57

    .line 224
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v2, "Unexpected exception"

    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    goto/16 :goto_11

    .line 225
    :cond_51
    :try_start_b
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    move-result-object v0

    if-ne v5, v0, :cond_53

    .line 226
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 227
    invoke-virtual {v8, v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    move-result v0

    if-nez v0, :cond_52

    goto/16 :goto_11

    .line 228
    :cond_52
    invoke-virtual {v8, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addRoute(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 229
    invoke-interface {v6, v8, v7}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_10

    .line 230
    :catch_b
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->raiseIOExceptionEvent()V

    .line 231
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    return-void

    .line 232
    :cond_53
    :goto_10
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_54

    .line 233
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " transaction.isMapped = "

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isTransactionMapped()Z

    move-result v10

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_54
    if-nez v8, :cond_66

    .line 234
    const-string v0, "NOTIFY"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    .line 235
    iget-object v0, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {v4, v2, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findSubscribeTransaction(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/ListeningPointImpl;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    move-result-object v0

    .line 236
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v3, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v3

    if-eqz v3, :cond_55

    .line 237
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "PROCESSING NOTIFY  DIALOG == null "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 238
    :cond_55
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    move-result v3

    if-eqz v3, :cond_58

    if-nez v0, :cond_58

    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDeliverUnsolicitedNotify()Z

    move-result v3

    if-nez v3, :cond_58

    .line 239
    :try_start_c
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_56

    .line 240
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v1, "Could not find Subscription for Notify Tx."

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_56
    const/16 v1, 0x1e1

    .line 241
    invoke-virtual {v2, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    move-result-object v0

    .line 242
    const-string v1, "Subscription does not exist"

    invoke-interface {v0, v1}, Landroid/javax/sip/message/Response;->setReasonPhrase(Ljava/lang/String;)V

    .line 243
    invoke-virtual {v5, v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->sendResponse(Landroid/javax/sip/message/Response;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    :cond_57
    :goto_11
    return-void

    :catch_c
    move-exception v0

    .line 244
    sget-object v1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v2, "Exception while sending error response statelessly"

    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void

    :cond_58
    if-eqz v0, :cond_64

    .line 245
    invoke-interface {v6, v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setPendingSubscribe(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V

    .line 246
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v3

    if-eqz v3, :cond_5b

    .line 247
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5b

    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_59

    goto :goto_12

    .line 248
    :cond_59
    invoke-interface {v6, v3, v7}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 249
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isTransactionMapped()Z

    move-result v8

    if-nez v8, :cond_5a

    .line 250
    iget-object v8, v1, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {v8, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mapTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 251
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setPassToListener()V

    .line 252
    :try_start_d
    iget-object v1, v1, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {v1, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    .line 253
    :catch_d
    :cond_5a
    invoke-virtual {v4, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 254
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Z

    .line 255
    invoke-interface {v0, v3, v7}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    goto/16 :goto_14

    :cond_5b
    :goto_12
    if-eqz v3, :cond_5c

    .line 256
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_5c

    .line 257
    invoke-virtual {v3, v7}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setDialogId(Ljava/lang/String;)V

    .line 258
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v8, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v8

    if-eqz v8, :cond_5d

    .line 259
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v9, "Dialog id set on default dialog."

    invoke-interface {v8, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    goto :goto_13

    .line 260
    :cond_5c
    invoke-interface {v0, v7}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v3

    .line 261
    :cond_5d
    :goto_13
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v8, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v8

    if-eqz v8, :cond_5e

    .line 262
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "PROCESSING NOTIFY Subscribe DIALOG "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_5e
    if-nez v3, :cond_60

    .line 263
    invoke-virtual {v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    move-result v8

    if-nez v8, :cond_5f

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v8

    if-eqz v8, :cond_60

    .line 264
    :cond_5f
    const-string v8, "Event"

    invoke-virtual {v2, v8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    move-result-object v8

    check-cast v8, Landroid/gov/nist/javax/sip/header/Event;

    .line 265
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/header/Event;->getEventType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isEventForked(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_60

    .line 266
    invoke-virtual {v4, v0, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createDialog(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v3

    :cond_60
    if-eqz v3, :cond_62

    .line 267
    invoke-interface {v6, v3, v7}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 268
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    move-result-object v8

    sget-object v9, Landroid/javax/sip/DialogState;->CONFIRMED:Landroid/javax/sip/DialogState;

    if-eq v8, v9, :cond_61

    .line 269
    invoke-virtual {v3, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setPendingRouteUpdateOn202Response(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 270
    :cond_61
    invoke-virtual {v9}, Landroid/javax/sip/DialogState;->getValue()I

    move-result v8

    invoke-virtual {v3, v8}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setState(I)V

    .line 271
    invoke-virtual {v4, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->putDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 272
    invoke-interface {v0, v3, v7}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 273
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isTransactionMapped()Z

    move-result v0

    if-nez v0, :cond_62

    .line 274
    iget-object v0, v1, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {v0, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->mapTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V

    .line 275
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setPassToListener()V

    .line 276
    :try_start_e
    iget-object v0, v1, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {v0, v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addTransaction(Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    .line 277
    :catch_e
    :cond_62
    :goto_14
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isTransactionMapped()Z

    move-result v0

    if-eqz v0, :cond_63

    .line 278
    new-instance v0, Landroid/gov/nist/javax/sip/RequestEventExt;

    invoke-direct {v0, v5, v6, v3, v2}, Landroid/gov/nist/javax/sip/RequestEventExt;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Request;)V

    goto :goto_15

    .line 279
    :cond_63
    new-instance v0, Landroid/gov/nist/javax/sip/RequestEventExt;

    const/4 v1, 0x0

    invoke-direct {v0, v5, v1, v3, v2}, Landroid/gov/nist/javax/sip/RequestEventExt;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Request;)V

    goto :goto_15

    .line 280
    :cond_64
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v15, 0x20

    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_65

    .line 281
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v1, "could not find subscribe tx"

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 282
    :cond_65
    new-instance v0, Landroid/gov/nist/javax/sip/RequestEventExt;

    const/4 v1, 0x0

    invoke-direct {v0, v5, v1, v1, v2}, Landroid/gov/nist/javax/sip/RequestEventExt;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Request;)V

    goto :goto_15

    :cond_66
    if-eqz v6, :cond_67

    .line 283
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->isTransactionMapped()Z

    move-result v0

    if-eqz v0, :cond_67

    .line 284
    new-instance v0, Landroid/gov/nist/javax/sip/RequestEventExt;

    invoke-direct {v0, v5, v6, v8, v2}, Landroid/gov/nist/javax/sip/RequestEventExt;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Request;)V

    goto :goto_15

    .line 285
    :cond_67
    new-instance v0, Landroid/gov/nist/javax/sip/RequestEventExt;

    const/4 v1, 0x0

    invoke-direct {v0, v5, v1, v8, v2}, Landroid/gov/nist/javax/sip/RequestEventExt;-><init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Request;)V

    .line 286
    :goto_15
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRemoteAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/RequestEventExt;->setRemoteIpAddress(Ljava/lang/String;)V

    .line 287
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRemotePort()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/RequestEventExt;->setRemotePort(I)V

    .line 288
    invoke-virtual {v5, v0, v6}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    return-void
.end method

.method public processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V
    .locals 11

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 21
    .line 22
    const/16 v4, 0x20

    .line 23
    .line 24
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    sget-object v3, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 31
    .line 32
    new-instance v5, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v6, "PROCESSING INCOMING RESPONSE: "

    .line 35
    .line 36
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v6, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v6}, Landroid/gov/nist/javax/sip/message/SIPResponse;->encodeMessage(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-interface {v3, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    iget-object v3, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->checkBranchId()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    invoke-static {}, Landroid/gov/nist/javax/sip/Utils;->getInstance()Landroid/gov/nist/javax/sip/Utils;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3, p1}, Landroid/gov/nist/javax/sip/Utils;->responseBelongsToUs(Landroid/gov/nist/javax/sip/message/SIPResponse;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_1

    .line 75
    .line 76
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 77
    .line 78
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_13

    .line 83
    .line 84
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 85
    .line 86
    const-string p1, "Detected stray response -- dropping"

    .line 87
    .line 88
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 93
    .line 94
    if-nez v3, :cond_2

    .line 95
    .line 96
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 97
    .line 98
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_13

    .line 103
    .line 104
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 105
    .line 106
    const-string p1, "Dropping message: No listening point registered!"

    .line 107
    .line 108
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_2
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-nez v3, :cond_3

    .line 117
    .line 118
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 119
    .line 120
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_13

    .line 125
    .line 126
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 127
    .line 128
    const-string p1, "Dropping message:  no provider"

    .line 129
    .line 130
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_3
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    if-nez v5, :cond_4

    .line 139
    .line 140
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 141
    .line 142
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-eqz p0, :cond_13

    .line 147
    .line 148
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 149
    .line 150
    const-string p1, "Dropping message:  no sipListener registered!"

    .line 151
    .line 152
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_4
    iget-object v5, p0, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 157
    .line 158
    check-cast v5, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 159
    .line 160
    if-nez v1, :cond_5

    .line 161
    .line 162
    if-eqz v5, :cond_5

    .line 163
    .line 164
    invoke-interface {v5, v0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDialog(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    if-eqz v1, :cond_5

    .line 169
    .line 170
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sget-object v6, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 175
    .line 176
    if-ne v0, v6, :cond_5

    .line 177
    .line 178
    const/4 v1, 0x0

    .line 179
    :cond_5
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 180
    .line 181
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_6

    .line 186
    .line 187
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 188
    .line 189
    new-instance v6, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v7, "Transaction = "

    .line 192
    .line 193
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v7, " sipDialog = "

    .line 200
    .line 201
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :cond_6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 215
    .line 216
    const/4 v6, 0x1

    .line 217
    if-eqz v0, :cond_a

    .line 218
    .line 219
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 224
    .line 225
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-nez v0, :cond_7

    .line 230
    .line 231
    move v7, v6

    .line 232
    goto :goto_0

    .line 233
    :cond_7
    move v7, p2

    .line 234
    :goto_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-interface {v8}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    if-nez v8, :cond_8

    .line 243
    .line 244
    move v8, v6

    .line 245
    goto :goto_1

    .line 246
    :cond_8
    move v8, p2

    .line 247
    :goto_1
    xor-int/2addr v7, v8

    .line 248
    const-string v8, "From tag mismatch -- dropping response"

    .line 249
    .line 250
    if-eqz v7, :cond_9

    .line 251
    .line 252
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 253
    .line 254
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 255
    .line 256
    .line 257
    move-result p0

    .line 258
    if-eqz p0, :cond_13

    .line 259
    .line 260
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 261
    .line 262
    invoke-interface {p0, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_9
    if-eqz v0, :cond_a

    .line 267
    .line 268
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-interface {v7}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-nez v0, :cond_a

    .line 281
    .line 282
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 283
    .line 284
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 285
    .line 286
    .line 287
    move-result p0

    .line 288
    if-eqz p0, :cond_13

    .line 289
    .line 290
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 291
    .line 292
    invoke-interface {p0, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_a
    invoke-static {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    const/16 v2, 0x64

    .line 301
    .line 302
    if-eqz v0, :cond_10

    .line 303
    .line 304
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eq v0, v2, :cond_10

    .line 309
    .line 310
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-interface {v0}, Landroid/javax/sip/header/FromHeader;->getTag()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-eqz v0, :cond_10

    .line 319
    .line 320
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-interface {v0}, Landroid/javax/sip/header/ToHeader;->getTag()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    if-eqz v0, :cond_10

    .line 329
    .line 330
    if-nez v1, :cond_10

    .line 331
    .line 332
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/SipProviderImpl;->isAutomaticDialogSupportEnabled()Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_b

    .line 337
    .line 338
    goto :goto_2

    .line 339
    :cond_b
    iget-object v0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 340
    .line 341
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getForkId()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    invoke-virtual {v0, v7}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getForkedTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    if-eqz v0, :cond_16

    .line 350
    .line 351
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/ClientTransactionExt;->getDefaultDialog()Landroid/javax/sip/Dialog;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    if-eqz v0, :cond_16

    .line 356
    .line 357
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 358
    .line 359
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_c

    .line 364
    .line 365
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 366
    .line 367
    new-instance v7, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    const-string v8, "Need to create dialog for response = "

    .line 370
    .line 371
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    invoke-interface {v0, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    :cond_c
    :goto_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 385
    .line 386
    const-string v7, "Creating dialog for forked response "

    .line 387
    .line 388
    if-eqz v0, :cond_e

    .line 389
    .line 390
    if-nez v1, :cond_16

    .line 391
    .line 392
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 393
    .line 394
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-eqz v0, :cond_d

    .line 399
    .line 400
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 401
    .line 402
    new-instance v1, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    :cond_d
    iget-object v0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 418
    .line 419
    iget-object v1, p0, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 420
    .line 421
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 422
    .line 423
    invoke-virtual {v0, v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createDialog(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    iget-object v0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 428
    .line 429
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object p2

    .line 433
    invoke-interface {v0, v1, p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    goto/16 :goto_3

    .line 437
    .line 438
    :cond_e
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 439
    .line 440
    invoke-interface {p2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 441
    .line 442
    .line 443
    move-result p2

    .line 444
    if-eqz p2, :cond_f

    .line 445
    .line 446
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 447
    .line 448
    new-instance v0, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    :cond_f
    iget-object p2, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 464
    .line 465
    invoke-virtual {p2, v3, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createDialog(Landroid/gov/nist/javax/sip/SipProviderImpl;Landroid/gov/nist/javax/sip/message/SIPResponse;)Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    goto/16 :goto_3

    .line 470
    .line 471
    :cond_10
    if-eqz v1, :cond_16

    .line 472
    .line 473
    if-nez v5, :cond_16

    .line 474
    .line 475
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    sget-object v7, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    .line 480
    .line 481
    if-eq v0, v7, :cond_16

    .line 482
    .line 483
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    div-int/2addr v0, v2

    .line 488
    const/4 v8, 0x2

    .line 489
    if-eq v0, v8, :cond_11

    .line 490
    .line 491
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 492
    .line 493
    invoke-interface {p2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 494
    .line 495
    .line 496
    move-result p2

    .line 497
    if-eqz p2, :cond_16

    .line 498
    .line 499
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 500
    .line 501
    new-instance v0, Ljava/lang/StringBuilder;

    .line 502
    .line 503
    const-string v7, "status code != 200 ; statusCode = "

    .line 504
    .line 505
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 509
    .line 510
    .line 511
    move-result v7

    .line 512
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    goto/16 :goto_3

    .line 523
    .line 524
    :cond_11
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    if-ne v0, v7, :cond_14

    .line 529
    .line 530
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 531
    .line 532
    invoke-interface {p0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 533
    .line 534
    .line 535
    move-result p0

    .line 536
    if-eqz p0, :cond_12

    .line 537
    .line 538
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 539
    .line 540
    const-string p2, "Dialog is terminated -- dropping response!"

    .line 541
    .line 542
    invoke-interface {p0, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    :cond_12
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 546
    .line 547
    .line 548
    move-result p0

    .line 549
    div-int/2addr p0, v2

    .line 550
    if-ne p0, v8, :cond_13

    .line 551
    .line 552
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    invoke-interface {p0}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object p0

    .line 560
    const-string p2, "INVITE"

    .line 561
    .line 562
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result p0

    .line 566
    if-eqz p0, :cond_13

    .line 567
    .line 568
    :try_start_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    invoke-interface {p0}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 573
    .line 574
    .line 575
    move-result-wide p0

    .line 576
    invoke-virtual {v1, p0, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->createAck(J)Landroid/javax/sip/message/Request;

    .line 577
    .line 578
    .line 579
    move-result-object p0

    .line 580
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->sendAck(Landroid/javax/sip/message/Request;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 581
    .line 582
    .line 583
    return-void

    .line 584
    :catch_0
    move-exception p0

    .line 585
    sget-object p1, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 586
    .line 587
    const-string p2, "Error creating ack"

    .line 588
    .line 589
    invoke-interface {p1, p2, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 590
    .line 591
    .line 592
    :cond_13
    return-void

    .line 593
    :cond_14
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSent()Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-eqz v0, :cond_16

    .line 598
    .line 599
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isLastAckPresent()Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-eqz v0, :cond_16

    .line 604
    .line 605
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastAckSentCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 610
    .line 611
    .line 612
    move-result-wide v7

    .line 613
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 618
    .line 619
    .line 620
    move-result-wide v9

    .line 621
    cmp-long v0, v7, v9

    .line 622
    .line 623
    if-nez v0, :cond_16

    .line 624
    .line 625
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object p2

    .line 629
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastAckSentDialogId()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result p2

    .line 637
    if-eqz p2, :cond_16

    .line 638
    .line 639
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 640
    .line 641
    .line 642
    move-result-object p2

    .line 643
    invoke-interface {p2}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object p2

    .line 647
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result p2

    .line 655
    if-eqz p2, :cond_16

    .line 656
    .line 657
    :try_start_1
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 658
    .line 659
    invoke-interface {p2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 660
    .line 661
    .line 662
    move-result p2

    .line 663
    if-eqz p2, :cond_15

    .line 664
    .line 665
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 666
    .line 667
    const-string v0, "resending ACK"

    .line 668
    .line 669
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    :cond_15
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->resendAck()V
    :try_end_1
    .catch Landroid/javax/sip/SipException; {:try_start_1 .. :try_end_1} :catch_1

    .line 673
    .line 674
    .line 675
    return-void

    .line 676
    :catch_1
    :cond_16
    :goto_3
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 677
    .line 678
    invoke-interface {p2, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 679
    .line 680
    .line 681
    move-result p2

    .line 682
    if-eqz p2, :cond_17

    .line 683
    .line 684
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 685
    .line 686
    new-instance v0, Ljava/lang/StringBuilder;

    .line 687
    .line 688
    const-string v7, "sending response "

    .line 689
    .line 690
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->toString()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    const-string v7, " to TU for processing "

    .line 701
    .line 702
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    :cond_17
    new-instance p2, Landroid/gov/nist/javax/sip/ResponseEventExt;

    .line 713
    .line 714
    invoke-direct {p2, v3, v5, v1, p1}, Landroid/gov/nist/javax/sip/ResponseEventExt;-><init>(Ljava/lang/Object;Landroid/gov/nist/javax/sip/ClientTransactionExt;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Response;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRemoteAddress()Ljava/net/InetAddress;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-virtual {p2, v0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRemoteIpAddress(Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRemotePort()I

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    invoke-virtual {p2, v0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRemotePort(I)V

    .line 733
    .line 734
    .line 735
    iget-object v0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 736
    .line 737
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxForkTime()I

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    if-eqz v0, :cond_19

    .line 742
    .line 743
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeqHeader()Landroid/javax/sip/header/CSeqHeader;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-interface {v0}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    if-eqz v0, :cond_19

    .line 756
    .line 757
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 758
    .line 759
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getForkId()Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getForkedTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 764
    .line 765
    .line 766
    move-result-object p0

    .line 767
    if-eqz v1, :cond_19

    .line 768
    .line 769
    if-eqz p0, :cond_19

    .line 770
    .line 771
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->checkRetransmissionForForking(Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 772
    .line 773
    .line 774
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/ClientTransactionExt;->getDefaultDialog()Landroid/javax/sip/Dialog;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    if-eqz v0, :cond_19

    .line 779
    .line 780
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/ClientTransactionExt;->getDefaultDialog()Landroid/javax/sip/Dialog;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    if-nez v0, :cond_19

    .line 789
    .line 790
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 791
    .line 792
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 793
    .line 794
    .line 795
    move-result v0

    .line 796
    if-eqz v0, :cond_18

    .line 797
    .line 798
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 799
    .line 800
    new-instance v4, Ljava/lang/StringBuilder;

    .line 801
    .line 802
    const-string v7, "forkedId= "

    .line 803
    .line 804
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getForkId()Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v7

    .line 811
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    const-string v7, " forked dialog "

    .line 815
    .line 816
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    const-string v7, " original tx "

    .line 823
    .line 824
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    const-string v7, " original dialog "

    .line 831
    .line 832
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/ClientTransactionExt;->getDefaultDialog()Landroid/javax/sip/Dialog;

    .line 836
    .line 837
    .line 838
    move-result-object v7

    .line 839
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    :cond_18
    invoke-virtual {p2, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setOriginalTransaction(Landroid/gov/nist/javax/sip/ClientTransactionExt;)V

    .line 850
    .line 851
    .line 852
    invoke-virtual {p2, v6}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setForkedResponse(Z)V

    .line 853
    .line 854
    .line 855
    :cond_19
    if-eqz v1, :cond_1a

    .line 856
    .line 857
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 858
    .line 859
    .line 860
    move-result p0

    .line 861
    if-eq p0, v2, :cond_1a

    .line 862
    .line 863
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 864
    .line 865
    .line 866
    move-result-object p0

    .line 867
    invoke-interface {p0}, Landroid/javax/sip/header/ToHeader;->getTag()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object p0

    .line 871
    if-eqz p0, :cond_1a

    .line 872
    .line 873
    invoke-virtual {v1, v5, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 874
    .line 875
    .line 876
    :cond_1a
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->isRetransmission()Z

    .line 877
    .line 878
    .line 879
    move-result p0

    .line 880
    invoke-virtual {p2, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRetransmission(Z)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRemoteAddress()Ljava/net/InetAddress;

    .line 884
    .line 885
    .line 886
    move-result-object p0

    .line 887
    invoke-virtual {p0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object p0

    .line 891
    invoke-virtual {p2, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRemoteIpAddress(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v3, p2, v5}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    .line 895
    .line 896
    .line 897
    return-void
.end method

.method public processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 12

    .line 898
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v0, 0x20

    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 899
    sget-object p2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "PROCESSING INCOMING RESPONSE"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Landroid/gov/nist/javax/sip/message/SIPResponse;->encodeMessage(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 900
    :cond_0
    iget-object p2, p0, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    if-nez p2, :cond_1

    .line 901
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result p0

    if-eqz p0, :cond_7

    .line 902
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string p1, "Dropping message: No listening point registered!"

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    return-void

    .line 903
    :cond_1
    iget-object p2, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->checkBranchId()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Landroid/gov/nist/javax/sip/Utils;->getInstance()Landroid/gov/nist/javax/sip/Utils;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/gov/nist/javax/sip/Utils;->responseBelongsToUs(Landroid/gov/nist/javax/sip/message/SIPResponse;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 904
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result p0

    if-eqz p0, :cond_7

    .line 905
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string p1, "Dropping response - topmost VIA header does not originate from this stack"

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    return-void

    .line 906
    :cond_2
    iget-object p2, p0, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    move-result-object p2

    if-nez p2, :cond_3

    .line 907
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result p0

    if-eqz p0, :cond_7

    .line 908
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string p1, "Dropping message:  no provider"

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    return-void

    .line 909
    :cond_3
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    move-result-object v1

    if-nez v1, :cond_4

    .line 910
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    move-result p0

    if-eqz p0, :cond_7

    .line 911
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string p1, "No listener -- dropping response!"

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    return-void

    .line 912
    :cond_4
    iget-object v1, p0, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 913
    sget-object v2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 914
    sget-object v2, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Transaction = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_5
    const/4 v2, 0x1

    .line 915
    const-string v3, " original dialog "

    const-string v4, " original tx "

    const-string v5, "forkedId= "

    const/16 v6, 0x64

    const-string v7, " forked dialog "

    if-nez v1, :cond_10

    if-eqz p3, :cond_a

    .line 916
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    move-result v8

    div-int/2addr v8, v6

    const/4 v6, 0x2

    if-eq v8, v6, :cond_6

    .line 917
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p0

    if-eqz p0, :cond_7

    .line 918
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string p1, "Response is not a final response and dialog is found for response -- dropping response!"

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    return-void

    .line 919
    :cond_6
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    move-result-object v6

    sget-object v8, Landroid/javax/sip/DialogState;->TERMINATED:Landroid/javax/sip/DialogState;

    if-ne v6, v8, :cond_8

    .line 920
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p0

    if-eqz p0, :cond_7

    .line 921
    sget-object p0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string p1, "Dialog is terminated -- dropping response!"

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_7
    return-void

    .line 922
    :cond_8
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSeen()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSent()Z

    move-result v6

    if-eqz v6, :cond_a

    .line 923
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isLastAckPresent()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getLastAckSentCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v6

    invoke-interface {v6}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    move-result-wide v8

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v6

    invoke-interface {v6}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    move-result-wide v10

    cmp-long v6, v8, v10

    if-nez v6, :cond_a

    .line 924
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v6

    invoke-interface {v6}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getMethod()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 925
    :try_start_0
    sget-object v6, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v6, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 926
    sget-object v6, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v8, "Retransmission of OK detected: Resending last ACK"

    invoke-interface {v6, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v6

    goto :goto_1

    .line 927
    :cond_9
    :goto_0
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->resendAck()V
    :try_end_0
    .catch Landroid/javax/sip/SipException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 928
    :goto_1
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v9, "could not resend ack"

    invoke-interface {v8, v9, v6}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 929
    :cond_a
    sget-object v6, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v6, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 930
    sget-object v6, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "could not find tx, handling statelessly Dialog =  "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 931
    :cond_b
    new-instance v6, Landroid/gov/nist/javax/sip/ResponseEventExt;

    invoke-direct {v6, p2, v1, p3, p1}, Landroid/gov/nist/javax/sip/ResponseEventExt;-><init>(Ljava/lang/Object;Landroid/gov/nist/javax/sip/ClientTransactionExt;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Response;)V

    .line 932
    iget-object v8, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxForkTime()I

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeqHeader()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v8

    invoke-interface {v8}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_f

    .line 933
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v8, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v8

    if-eqz v8, :cond_c

    .line 934
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Trying to find forked Transaction for forked id "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getForkId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 935
    :cond_c
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getForkId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getForkedTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    move-result-object p0

    if-eqz p3, :cond_f

    if-eqz p0, :cond_f

    .line 936
    invoke-virtual {p3, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->checkRetransmissionForForking(Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 937
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v8, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v8

    if-eqz v8, :cond_d

    .line 938
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "original dialog "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 939
    :cond_d
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v8

    if-eqz v8, :cond_f

    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v8

    invoke-virtual {p3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    .line 940
    sget-object v8, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v8, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 941
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getForkId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 942
    :cond_e
    invoke-virtual {v6, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setOriginalTransaction(Landroid/gov/nist/javax/sip/ClientTransactionExt;)V

    .line 943
    invoke-virtual {v6, v2}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setForkedResponse(Z)V

    if-nez v1, :cond_f

    .line 944
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    move-result-object p0

    sget-object v0, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;

    if-ne p0, v0, :cond_f

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    move-result p0

    const/16 v0, 0xc8

    if-lt p0, v0, :cond_f

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    move-result p0

    const/16 v0, 0x12c

    if-ge p0, v0, :cond_f

    .line 945
    invoke-virtual {p3, v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 946
    :cond_f
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->isRetransmission()Z

    move-result p0

    invoke-virtual {v6, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRetransmission(Z)V

    .line 947
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRemoteAddress()Ljava/net/InetAddress;

    move-result-object p0

    invoke-virtual {p0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v6, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRemoteIpAddress(Ljava/lang/String;)V

    .line 948
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRemotePort()I

    move-result p0

    invoke-virtual {v6, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRemotePort(I)V

    .line 949
    invoke-virtual {p2, v6, v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    return-void

    .line 950
    :cond_10
    new-instance v8, Landroid/gov/nist/javax/sip/ResponseEventExt;

    invoke-direct {v8, p2, v1, p3, p1}, Landroid/gov/nist/javax/sip/ResponseEventExt;-><init>(Ljava/lang/Object;Landroid/gov/nist/javax/sip/ClientTransactionExt;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Response;)V

    .line 951
    iget-object v9, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxForkTime()I

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeqHeader()Landroid/javax/sip/header/CSeqHeader;

    move-result-object v9

    invoke-interface {v9}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogCreated(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_12

    .line 952
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogFilter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getForkId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v9}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getForkedTransaction(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    move-result-object p0

    if-eqz p3, :cond_12

    if-eqz p0, :cond_12

    .line 953
    invoke-virtual {p3, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->checkRetransmissionForForking(Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 954
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v9

    if-eqz v9, :cond_12

    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v9

    invoke-virtual {p3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    .line 955
    sget-object v9, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v9, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 956
    sget-object v0, Landroid/gov/nist/javax/sip/DialogFilter;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getForkId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getDefaultDialog()Landroid/gov/nist/javax/sip/stack/SIPDialog;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 957
    :cond_11
    invoke-virtual {v8, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setOriginalTransaction(Landroid/gov/nist/javax/sip/ClientTransactionExt;)V

    .line 958
    invoke-virtual {v8, v2}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setForkedResponse(Z)V

    :cond_12
    if-eqz p3, :cond_13

    .line 959
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    move-result p0

    if-eq p0, v6, :cond_13

    .line 960
    invoke-virtual {p3, v1, p1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->setLastResponse(Landroid/gov/nist/javax/sip/stack/SIPTransaction;Landroid/gov/nist/javax/sip/message/SIPResponse;)V

    .line 961
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getDialogId()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p3, p0}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->setDialog(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;)V

    .line 962
    :cond_13
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->isRetransmission()Z

    move-result p0

    invoke-virtual {v8, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRetransmission(Z)V

    .line 963
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRemoteAddress()Ljava/net/InetAddress;

    move-result-object p0

    invoke-virtual {p0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v8, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRemoteIpAddress(Ljava/lang/String;)V

    .line 964
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRemotePort()I

    move-result p0

    invoke-virtual {v8, p0}, Landroid/gov/nist/javax/sip/ResponseEventExt;->setRemotePort(I)V

    .line 965
    invoke-virtual {p2, v8, v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->handleEvent(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V

    return-void
.end method

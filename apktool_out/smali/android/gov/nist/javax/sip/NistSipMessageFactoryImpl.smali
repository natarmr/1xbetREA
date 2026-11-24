.class Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/StackMessageFactory;


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->logger:Landroid/gov/nist/core/StackLogger;

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
    iput-object p1, p0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public newSIPServerRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p2, :cond_2

    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Landroid/gov/nist/javax/sip/DialogFilter;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Landroid/gov/nist/javax/sip/DialogFilter;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v1, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 16
    .line 17
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getListeningPoint()Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, v1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    sget-object p0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 31
    .line 32
    const/16 v0, 0x20

    .line 33
    .line 34
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    sget-object p0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "Returning request interface for "

    .line 45
    .line 46
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getFirstLine()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, " "

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p1, " sipTransaction = "

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-object v1

    .line 80
    :cond_2
    const-string p1, "Null Arg!"

    .line 81
    .line 82
    invoke-static {p1}, La/jf4;->o(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object p0
.end method

.method public newSIPServerResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;
    .locals 5

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->findTransaction(Landroid/gov/nist/javax/sip/message/SIPMessage;Z)Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    const/16 v2, 0x20

    .line 11
    .line 12
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-object v1, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v4, "Found Transaction "

    .line 23
    .line 24
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v4, " for "

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v3, 0x0

    .line 52
    if-gez v1, :cond_2

    .line 53
    .line 54
    sget-object p0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 55
    .line 56
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    sget-object p0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 63
    .line 64
    const-string p1, "Dropping response - null transaction state"

    .line 65
    .line 66
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-object v3

    .line 70
    :cond_2
    const/4 v1, 0x3

    .line 71
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getInternalState()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-ne v1, v4, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    div-int/lit8 v1, v1, 0x64

    .line 82
    .line 83
    const/4 v4, 0x1

    .line 84
    if-ne v1, v4, :cond_4

    .line 85
    .line 86
    sget-object p0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 87
    .line 88
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_3

    .line 93
    .line 94
    sget-object p0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 95
    .line 96
    new-instance p2, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v0, "Dropping response - late arriving "

    .line 99
    .line 100
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    return-object v3

    .line 118
    :cond_4
    new-instance p1, Landroid/gov/nist/javax/sip/DialogFilter;

    .line 119
    .line 120
    iget-object p0, p0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Landroid/gov/nist/javax/sip/DialogFilter;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V

    .line 123
    .line 124
    .line 125
    iput-object v0, p1, Landroid/gov/nist/javax/sip/DialogFilter;->transactionChannel:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 126
    .line 127
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getListeningPoint()Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iput-object p0, p1, Landroid/gov/nist/javax/sip/DialogFilter;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 136
    .line 137
    return-object p1
.end method

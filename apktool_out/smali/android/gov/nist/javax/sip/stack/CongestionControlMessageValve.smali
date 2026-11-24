.class public Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/SIPMessageValve;


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field protected dropResponseStatus:I

.field protected serverTransactionTableHighwaterMark:I

.field protected sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Destorying the congestion control valve "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public init(Landroid/javax/sip/SipStack;)V
    .locals 2

    .line 1
    check-cast p1, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 4
    .line 5
    sget-object p1, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->logger:Landroid/gov/nist/core/StackLogger;

    .line 6
    .line 7
    const-string v0, "Initializing congestion control valve"

    .line 8
    .line 9
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->getConfigurationProperties()Ljava/util/Properties;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "android.gov.nist.javax.sip.MAX_SERVER_TRANSACTIONS"

    .line 19
    .line 20
    const-string v1, "10000"

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->serverTransactionTableHighwaterMark:I

    .line 36
    .line 37
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->getConfigurationProperties()Ljava/util/Properties;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "DROP_RESPONSE_STATUS"

    .line 44
    .line 45
    const-string v1, "503"

    .line 46
    .line 47
    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v0, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->dropResponseStatus:I

    .line 61
    .line 62
    return-void
.end method

.method public processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "BYE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v1, :cond_3

    .line 13
    .line 14
    const-string v1, "ACK"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    const-string v1, "PRACK"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    const-string v1, "CANCEL"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->serverTransactionTableHighwaterMark:I

    .line 40
    .line 41
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getServerTransactionTableSize()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-gt v0, v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    return v2

    .line 56
    :cond_1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->dropResponseStatus:I

    .line 57
    .line 58
    if-lez p0, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :try_start_0
    invoke-virtual {p2, p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception p1

    .line 69
    sget-object p2, Landroid/gov/nist/javax/sip/stack/CongestionControlMessageValve;->logger:Landroid/gov/nist/core/StackLogger;

    .line 70
    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v1, "Failed to send congestion control error response"

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-interface {p2, p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 89
    return p0

    .line 90
    :cond_3
    :goto_1
    return v2
.end method

.method public processResponse(Landroid/javax/sip/message/Response;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

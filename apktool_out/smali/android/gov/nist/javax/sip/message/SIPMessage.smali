.class public abstract Landroid/gov/nist/javax/sip/message/SIPMessage;
.super Landroid/gov/nist/javax/sip/message/MessageObject;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/message/Message;
.implements Landroid/gov/nist/javax/sip/message/MessageExt;


# static fields
.field private static final AUTHORIZATION_LOWERCASE:Ljava/lang/String;

.field private static final CONTACT_LOWERCASE:Ljava/lang/String;

.field private static final CONTENT_DISPOSITION_LOWERCASE:Ljava/lang/String;

.field private static final CONTENT_ENCODING_LOWERCASE:Ljava/lang/String;

.field private static final CONTENT_LANGUAGE_LOWERCASE:Ljava/lang/String;

.field private static final CONTENT_TYPE_LOWERCASE:Ljava/lang/String;

.field private static final ERROR_LOWERCASE:Ljava/lang/String;

.field private static final EXPIRES_LOWERCASE:Ljava/lang/String;

.field private static final RECORDROUTE_LOWERCASE:Ljava/lang/String;

.field private static final ROUTE_LOWERCASE:Ljava/lang/String;

.field private static final VIA_LOWERCASE:Ljava/lang/String;


# instance fields
.field protected applicationData:Ljava/lang/Object;

.field protected cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

.field protected callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

.field private contentEncodingCharset:Ljava/lang/String;

.field protected contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

.field protected forkId:Ljava/lang/String;

.field protected fromHeader:Landroid/gov/nist/javax/sip/header/From;

.field protected headerTable:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ">;"
        }
    .end annotation
.end field

.field protected headers:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ">;"
        }
    .end annotation
.end field

.field private localAddress:Ljava/net/InetAddress;

.field private localPort:I

.field protected maxForwardsHeader:Landroid/gov/nist/javax/sip/header/MaxForwards;

.field protected messageContent:Ljava/lang/String;

.field protected messageContentBytes:[B

.field protected messageContentObject:Ljava/lang/Object;

.field protected nullRequest:Z

.field private peerPacketSourceAddress:Ljava/net/InetAddress;

.field private peerPacketSourcePort:I

.field private remoteAddress:Ljava/net/InetAddress;

.field private remotePort:I

.field protected size:I

.field protected toHeader:Landroid/gov/nist/javax/sip/header/To;

.field protected unrecognizedHeaders:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "Content-Type"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTENT_TYPE_LOWERCASE:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "Error-Info"

    .line 10
    .line 11
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->ERROR_LOWERCASE:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "Contact"

    .line 18
    .line 19
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTACT_LOWERCASE:Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "Via"

    .line 26
    .line 27
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->VIA_LOWERCASE:Ljava/lang/String;

    .line 32
    .line 33
    const-string v0, "Authorization"

    .line 34
    .line 35
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->AUTHORIZATION_LOWERCASE:Ljava/lang/String;

    .line 40
    .line 41
    const-string v0, "Route"

    .line 42
    .line 43
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->ROUTE_LOWERCASE:Ljava/lang/String;

    .line 48
    .line 49
    const-string v0, "Record-Route"

    .line 50
    .line 51
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->RECORDROUTE_LOWERCASE:Ljava/lang/String;

    .line 56
    .line 57
    const-string v0, "Content-Disposition"

    .line 58
    .line 59
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTENT_DISPOSITION_LOWERCASE:Ljava/lang/String;

    .line 64
    .line 65
    const-string v0, "Content-Encoding"

    .line 66
    .line 67
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTENT_ENCODING_LOWERCASE:Ljava/lang/String;

    .line 72
    .line 73
    const-string v0, "Content-Language"

    .line 74
    .line 75
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTENT_LANGUAGE_LOWERCASE:Ljava/lang/String;

    .line 80
    .line 81
    const-string v0, "Expires"

    .line 82
    .line 83
    invoke-static {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->EXPIRES_LOWERCASE:Ljava/lang/String;

    .line 88
    .line 89
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/MessageObject;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->getDefaultContentEncodingCharset()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentEncodingCharset:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Ljava/util/LinkedList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->unrecognizedHeaders:Ljava/util/LinkedList;

    .line 16
    .line 17
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 23
    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 30
    .line 31
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/header/ContentLength;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    :catch_0
    return-void
.end method

.method private attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 222
    :try_start_0
    instance-of v0, p1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    if-eqz v0, :cond_0

    .line 223
    move-object v0, p1

    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 224
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 225
    invoke-virtual {p0, p1, v0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;ZZ)V
    :try_end_0
    .catch Landroid/gov/nist/javax/sip/message/SIPDuplicateHeaderException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void

    .line 226
    :cond_1
    const-string p0, "null header!"

    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    return-void
.end method

.method private computeContentLength(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    instance-of v0, p1, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCharset()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    array-length p1, p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    goto :goto_1

    .line 19
    :catch_0
    move-exception p1

    .line 20
    invoke-static {p1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of v0, p1, [B

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast p1, [B

    .line 29
    .line 30
    array-length p1, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 42
    :goto_1
    :try_start_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ContentLength;->setContentLength(I)V
    :try_end_1
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 45
    .line 46
    .line 47
    :catch_1
    return-void
.end method

.method private getHeaderList(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    instance-of p1, p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getHeaderList()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    new-instance p1, Ljava/util/LinkedList;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    return-object p1
.end method

.method public static isRequestHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/InReplyTo;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/Authorization;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/UserAgent;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/Priority;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/ProxyAuthorization;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/ProxyRequire;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/ProxyRequireList;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/Route;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/RouteList;

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/Subject;

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    instance-of p0, p0, Landroid/gov/nist/javax/sip/header/SIPIfMatch;

    .line 50
    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 57
    return p0
.end method

.method public static isResponseHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/ErrorInfo;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/ProxyAuthenticate;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/Server;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/Unsupported;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/RetryAfter;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/Warning;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/WWWAuthenticate;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/SIPETag;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    instance-of p0, p0, Landroid/gov/nist/javax/sip/header/RSeq;

    .line 34
    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0
.end method


# virtual methods
.method public addFirst(Landroid/javax/sip/header/Header;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    check-cast p1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0, p1, v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;ZZ)V
    :try_end_0
    .catch Landroid/gov/nist/javax/sip/message/SIPDuplicateHeaderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    const-string p0, "Cannot add header - header already exists"

    .line 12
    .line 13
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "null arg!"

    .line 18
    .line 19
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public addHeader(Landroid/javax/sip/header/Header;)V
    .locals 3

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 3
    .line 4
    :try_start_0
    instance-of v1, p1, Landroid/javax/sip/header/ViaHeader;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    instance-of v1, p1, Landroid/javax/sip/header/RecordRouteHeader;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, v0, v2, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;ZZ)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p0, v0, v2, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;ZZ)V
    :try_end_0
    .catch Landroid/gov/nist/javax/sip/message/SIPDuplicateHeaderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    :try_start_1
    instance-of v0, p1, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    check-cast p1, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 28
    .line 29
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/ContentLength;->getContentLength()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ContentLength;->setContentLength(I)V
    :try_end_1
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 36
    .line 37
    .line 38
    :catch_1
    :cond_2
    return-void
.end method

.method public addHeader(Ljava/lang/String;)V
    .locals 2

    .line 39
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/ParserFactory;->createParser(Ljava/lang/String;)Landroid/gov/nist/javax/sip/parser/HeaderParser;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->parse()Landroid/gov/nist/javax/sip/header/SIPHeader;

    move-result-object v0

    const/4 v1, 0x0

    .line 41
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;Z)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 42
    :catch_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getUnrecognizedHeadersList()Ljava/util/LinkedList;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addLast(Landroid/javax/sip/header/Header;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    check-cast p1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;ZZ)V
    :try_end_0
    .catch Landroid/gov/nist/javax/sip/message/SIPDuplicateHeaderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    const-string p0, "Cannot add header - header already exists"

    .line 11
    .line 12
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "null arg!"

    .line 17
    .line 18
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public addUnparsed(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getUnrecognizedHeadersList()Ljava/util/LinkedList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 221
    invoke-virtual {p0, p1, p2, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;ZZ)V

    return-void
.end method

.method public attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;ZZ)V
    .locals 3

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/ListMap;->hasList(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-class v0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/ListMap;->getList(Landroid/gov/nist/javax/sip/header/SIPHeader;)Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, p1

    .line 30
    :goto_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 39
    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    instance-of p2, v0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 53
    .line 54
    if-nez p2, :cond_2

    .line 55
    .line 56
    instance-of p1, v0, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 57
    .line 58
    if-eqz p1, :cond_d

    .line 59
    .line 60
    :try_start_0
    check-cast v0, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 61
    .line 62
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/ContentLength;->getContentLength()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ContentLength;->setContentLength(I)V
    :try_end_0
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    iget-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_4

    .line 95
    .line 96
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 101
    .line 102
    invoke-virtual {v2, p1}, Landroid/gov/nist/javax/sip/header/SIPObject;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_3

    .line 107
    .line 108
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    iget-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 113
    .line 114
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_5

    .line 119
    .line 120
    iget-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 121
    .line 122
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    instance-of p1, v0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 132
    .line 133
    iget-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 134
    .line 135
    if-eqz p1, :cond_7

    .line 136
    .line 137
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 142
    .line 143
    if-eqz p1, :cond_6

    .line 144
    .line 145
    move-object p2, v0

    .line 146
    check-cast p2, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 147
    .line 148
    invoke-virtual {p1, p2, p3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->concatenate(Landroid/gov/nist/javax/sip/header/SIPHeaderList;Z)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    iget-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 153
    .line 154
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    :goto_3
    instance-of p1, v0, Landroid/gov/nist/javax/sip/header/From;

    .line 162
    .line 163
    if-eqz p1, :cond_8

    .line 164
    .line 165
    check-cast v0, Landroid/gov/nist/javax/sip/header/From;

    .line 166
    .line 167
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 168
    .line 169
    return-void

    .line 170
    :cond_8
    instance-of p1, v0, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 171
    .line 172
    if-eqz p1, :cond_9

    .line 173
    .line 174
    check-cast v0, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 175
    .line 176
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 177
    .line 178
    return-void

    .line 179
    :cond_9
    instance-of p1, v0, Landroid/gov/nist/javax/sip/header/To;

    .line 180
    .line 181
    if-eqz p1, :cond_a

    .line 182
    .line 183
    check-cast v0, Landroid/gov/nist/javax/sip/header/To;

    .line 184
    .line 185
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    .line 186
    .line 187
    return-void

    .line 188
    :cond_a
    instance-of p1, v0, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 189
    .line 190
    if-eqz p1, :cond_b

    .line 191
    .line 192
    check-cast v0, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 193
    .line 194
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 195
    .line 196
    return-void

    .line 197
    :cond_b
    instance-of p1, v0, Landroid/gov/nist/javax/sip/header/CallID;

    .line 198
    .line 199
    if-eqz p1, :cond_c

    .line 200
    .line 201
    check-cast v0, Landroid/gov/nist/javax/sip/header/CallID;

    .line 202
    .line 203
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 204
    .line 205
    return-void

    .line 206
    :cond_c
    instance-of p1, v0, Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 207
    .line 208
    if-eqz p1, :cond_d

    .line 209
    .line 210
    check-cast v0, Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 211
    .line 212
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->maxForwardsHeader:Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 213
    .line 214
    :catch_0
    :cond_d
    return-void

    .line 215
    :cond_e
    const-string p0, "null header"

    .line 216
    .line 217
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-void
.end method

.method public cleanUp()V
    .locals 0

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 16
    .line 17
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    .line 18
    .line 19
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 20
    .line 21
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 22
    .line 23
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 24
    .line 25
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->maxForwardsHeader:Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 26
    .line 27
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->forkId:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    new-instance v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 39
    .line 40
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 63
    .line 64
    invoke-direct {v0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, [B

    .line 77
    .line 78
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 79
    .line 80
    :cond_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 81
    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    invoke-static {v1}, Landroid/gov/nist/core/GenericObject;->makeClone(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 89
    .line 90
    :cond_2
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->unrecognizedHeaders:Ljava/util/LinkedList;

    .line 91
    .line 92
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->unrecognizedHeaders:Ljava/util/LinkedList;

    .line 93
    .line 94
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->remoteAddress:Ljava/net/InetAddress;

    .line 95
    .line 96
    iput-object v1, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->remoteAddress:Ljava/net/InetAddress;

    .line 97
    .line 98
    iget p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->remotePort:I

    .line 99
    .line 100
    iput p0, v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->remotePort:I

    .line 101
    .line 102
    return-object v0
.end method

.method public debugDump()Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iput-object v0, p0, Landroid/gov/nist/core/GenericObject;->stringRepresentation:Ljava/lang/String;

    .line 4
    .line 5
    const-string v0, "SIPMessage:"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "{"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    array-length v3, v1

    .line 25
    if-ge v2, v3, :cond_1

    .line 26
    .line 27
    aget-object v3, v1, v2

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    const-class v6, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 44
    .line 45
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    const-string v4, "headers"

    .line 52
    .line 53
    invoke-virtual {v5, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    new-instance v4, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v5, "="

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {p0, v4}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 84
    .line 85
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/SIPObject;->debugDump()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {p0, v3}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catch_0
    move-exception v1

    .line 94
    goto :goto_2

    .line 95
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_2
    invoke-static {v1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 99
    .line 100
    .line 101
    :cond_1
    const-string v1, "List of headers : "

    .line 102
    .line 103
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-string v1, "messageContent = "

    .line 116
    .line 117
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const-string v0, "}"

    .line 129
    .line 130
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContent()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-eqz v1, :cond_2

    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContent()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :cond_2
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-object p0, p0, Landroid/gov/nist/core/GenericObject;->stringRepresentation:Ljava/lang/String;

    .line 154
    .line 155
    return-object p0
.end method

.method public encode()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 23
    .line 24
    instance-of v3, v2, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->unrecognizedHeaders:Ljava/util/LinkedList;

    .line 33
    .line 34
    const-string v2, "\r\n"

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContent()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 87
    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 91
    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    :cond_4
    if-eqz v1, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    :try_start_0
    new-instance v1, Ljava/lang/String;

    .line 98
    .line 99
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCharset()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-direct {v1, v2, p0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catch_0
    move-exception p0

    .line 110
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 111
    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    :cond_6
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0
.end method

.method public encodeAsBytes(Ljava/lang/String;)[B
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->isNullRequest()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-string p0, "\r\n\r\n"

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string v0, "Via"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/javax/sip/header/ViaHeader;

    .line 28
    .line 29
    :try_start_0
    invoke-interface {v0, p1}, Landroid/javax/sip/header/ViaHeader;->setTransport(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p1

    .line 34
    invoke-static {p1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 43
    .line 44
    monitor-enter v0

    .line 45
    :try_start_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 62
    .line 63
    instance-of v3, v2, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 64
    .line 65
    if-nez v3, :cond_1

    .line 66
    .line 67
    invoke-virtual {v2, p1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto :goto_4

    .line 73
    :cond_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v0, "\r\n"

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRawContent()[B

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const/4 v1, 0x0

    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCharset()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 100
    .line 101
    .line 102
    move-result-object v1
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1

    .line 103
    goto :goto_2

    .line 104
    :catch_1
    move-exception p0

    .line 105
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    array-length p0, v1

    .line 109
    array-length p1, v0

    .line 110
    add-int/2addr p0, p1

    .line 111
    new-array p0, p0, [B

    .line 112
    .line 113
    array-length p1, v1

    .line 114
    const/4 v2, 0x0

    .line 115
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 116
    .line 117
    .line 118
    array-length p1, v1

    .line 119
    array-length v1, v0

    .line 120
    invoke-static {v0, v2, p0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 121
    .line 122
    .line 123
    move-object v1, p0

    .line 124
    goto :goto_3

    .line 125
    :cond_3
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCharset()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 134
    .line 135
    .line 136
    move-result-object v1
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_2

    .line 137
    goto :goto_3

    .line 138
    :catch_2
    move-exception p0

    .line 139
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 140
    .line 141
    .line 142
    :goto_3
    return-object v1

    .line 143
    :goto_4
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 144
    throw p0
.end method

.method public abstract encodeMessage(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
.end method

.method public encodeSIPHeaders(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 18
    .line 19
    instance-of v2, v1, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p1, "\r\n"

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 18
    .line 19
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iget-object v2, p1, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eq p0, v2, :cond_1

    .line 42
    .line 43
    return v1

    .line 44
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 55
    .line 56
    iget-object v2, p1, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 71
    .line 72
    if-nez v2, :cond_2

    .line 73
    .line 74
    return v1

    .line 75
    :cond_2
    invoke-virtual {v2, p0}, Landroid/gov/nist/javax/sip/header/SIPObject;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-nez p0, :cond_1

    .line 80
    .line 81
    return v1

    .line 82
    :cond_3
    const/4 p0, 0x1

    .line 83
    return p0
.end method

.method public getApplicationData()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->applicationData:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAuthorization()Landroid/gov/nist/javax/sip/header/Authorization;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->AUTHORIZATION_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderLowerCase(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/header/Authorization;

    .line 8
    .line 9
    return-object p0
.end method

.method public getCSeq()Landroid/javax/sip/header/CSeqHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCSeqHeader()Landroid/javax/sip/header/CSeqHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCallId()Landroid/javax/sip/header/CallIdHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCallIdHeader()Landroid/javax/sip/header/CallIdHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCharset()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentTypeHeader()Landroid/gov/nist/javax/sip/header/ContentType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/ContentType;->getCharset()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentEncodingCharset:Ljava/lang/String;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentEncodingCharset:Ljava/lang/String;

    .line 18
    .line 19
    return-object p0
.end method

.method public getContactHeader()Landroid/gov/nist/javax/sip/header/Contact;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/gov/nist/javax/sip/header/Contact;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public getContactHeaders()Landroid/gov/nist/javax/sip/header/ContactList;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTACT_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getSIPHeaderListLowerCase(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/header/ContactList;

    .line 8
    .line 9
    return-object p0
.end method

.method public getContent()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 12
    .line 13
    if-eqz p0, :cond_2

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_2
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public getContentDisposition()Landroid/javax/sip/header/ContentDispositionHeader;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTENT_DISPOSITION_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderLowerCase(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/javax/sip/header/ContentDispositionHeader;

    .line 8
    .line 9
    return-object p0
.end method

.method public getContentEncoding()Landroid/javax/sip/header/ContentEncodingHeader;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTENT_ENCODING_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderLowerCase(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/javax/sip/header/ContentEncodingHeader;

    .line 8
    .line 9
    return-object p0
.end method

.method public getContentLanguage()Landroid/javax/sip/header/ContentLanguageHeader;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTENT_LANGUAGE_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderLowerCase(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/javax/sip/header/ContentLanguageHeader;

    .line 8
    .line 9
    return-object p0
.end method

.method public getContentLength()Landroid/javax/sip/header/ContentLengthHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 2
    .line 3
    return-object p0
.end method

.method public getContentLengthHeader()Landroid/javax/sip/header/ContentLengthHeader;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getContentTypeHeader()Landroid/gov/nist/javax/sip/header/ContentType;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->CONTENT_TYPE_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderLowerCase(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/header/ContentType;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic getContentTypeHeader()Landroid/javax/sip/header/ContentTypeHeader;
    .locals 0

    .line 10
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentTypeHeader()Landroid/gov/nist/javax/sip/header/ContentType;

    move-result-object p0

    return-object p0
.end method

.method public final getDialogId(Z)Ljava/lang/String;
    .locals 1

    .line 84
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    move-result-object v0

    check-cast v0, Landroid/gov/nist/javax/sip/header/To;

    .line 85
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/To;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final getDialogId(ZLjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/header/From;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/gov/nist/javax/sip/header/CallID;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuffer;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/CallID;->getCallId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v1, p0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string p0, ":"

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 40
    .line 41
    .line 42
    :cond_0
    if-eqz p2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    if-eqz p2, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public getErrorInfoHeaders()Landroid/gov/nist/javax/sip/header/ErrorInfoList;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->ERROR_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getSIPHeaderListLowerCase(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/header/ErrorInfoList;

    .line 8
    .line 9
    return-object p0
.end method

.method public getExpires()Landroid/javax/sip/header/ExpiresHeader;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->EXPIRES_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderLowerCase(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/javax/sip/header/ExpiresHeader;

    .line 8
    .line 9
    return-object p0
.end method

.method public abstract getFirstLine()Ljava/lang/String;
.end method

.method public getForkId()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->forkId:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, ":"

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->forkId:Ljava/lang/String;

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_1
    const-string p0, "From tag is not yet set. Cannot compute forkId"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0
.end method

.method public getFrom()Landroid/javax/sip/header/FromHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFromHeader()Landroid/javax/sip/header/FromHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFromTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderLowerCase(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getHeaderAsFormattedString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0}, Landroid/javax/sip/header/Header;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public getHeaderLowerCase(Ljava/lang/String;)Landroid/javax/sip/header/Header;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 10
    .line 11
    instance-of p1, p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    return-object p0

    .line 22
    :cond_1
    const-string p0, "bad name"

    .line 23
    .line 24
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public getHeaderNames()Ljava/util/ListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ljava/util/LinkedList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public getHeaders()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public getHeaders(Ljava/lang/String;)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ListIterator<",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 4
    .line 5
    invoke-static {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    new-instance p0, Ljava/util/LinkedList;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/util/LinkedList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    instance-of v0, p1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    check-cast p1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->listIterator()Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_1
    new-instance v0, Landroid/gov/nist/javax/sip/message/HeaderIterator;

    .line 39
    .line 40
    invoke-direct {v0, p0, p1}, Landroid/gov/nist/javax/sip/message/HeaderIterator;-><init>(Landroid/gov/nist/javax/sip/message/SIPMessage;Landroid/gov/nist/javax/sip/header/SIPHeader;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    const-string p0, "null headerName"

    .line 45
    .line 46
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public getLocalAddress()Ljava/net/InetAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->localAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLocalPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->localPort:I

    .line 2
    .line 3
    return p0
.end method

.method public getMaxForwards()Landroid/javax/sip/header/MaxForwardsHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->maxForwardsHeader:Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMessageAsEncodedStrings()Ljava/util/LinkedList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 23
    .line 24
    instance-of v2, v1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getHeadersAsEncodedStrings()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->encode()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
.end method

.method public getMessageContent()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCharset()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 25
    .line 26
    :cond_1
    return-object v0
.end method

.method public getMultipartMimeContent()Landroid/gov/nist/javax/sip/message/MultipartMimeContent;
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/ContentLength;->getContentLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    new-instance v0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentTypeHeader()Landroid/gov/nist/javax/sip/header/ContentType;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v2}, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;-><init>(Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRawContent()[B

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :try_start_0
    new-instance v3, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCharset()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v3, v2, p0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->createContentList(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :catch_0
    move-exception p0

    .line 38
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 39
    .line 40
    .line 41
    return-object v1
.end method

.method public getPeerPacketSourceAddress()Ljava/net/InetAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->peerPacketSourceAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPeerPacketSourcePort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->peerPacketSourcePort:I

    .line 2
    .line 3
    return p0
.end method

.method public getRawContent()[B
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCharset()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCharset()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    :cond_2
    :goto_0
    return-object v0

    .line 40
    :catch_0
    move-exception p0

    .line 41
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public getRecordRouteHeaders()Landroid/gov/nist/javax/sip/header/RecordRouteList;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->RECORDROUTE_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getSIPHeaderListLowerCase(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/header/RecordRouteList;

    .line 8
    .line 9
    return-object p0
.end method

.method public getRemoteAddress()Ljava/net/InetAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->remoteAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRemotePort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->remotePort:I

    .line 2
    .line 3
    return p0
.end method

.method public getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->ROUTE_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getSIPHeaderListLowerCase(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/header/RouteList;

    .line 8
    .line 9
    return-object p0
.end method

.method public getSIPHeaderListLowerCase(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SIPHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 8
    .line 9
    return-object p0
.end method

.method public abstract getSIPVersion()Ljava/lang/String;
.end method

.method public getSize()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->size:I

    .line 2
    .line 3
    return p0
.end method

.method public getTo()Landroid/javax/sip/header/ToHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    .line 2
    .line 3
    return-object p0
.end method

.method public getToHeader()Landroid/javax/sip/header/ToHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    .line 2
    .line 3
    return-object p0
.end method

.method public getToTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/To;->getTag()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/gov/nist/javax/sip/header/Via;

    .line 18
    .line 19
    return-object p0
.end method

.method public getTopmostViaHeader()Landroid/javax/sip/header/ViaHeader;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getTransactionId()Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ":"

    .line 6
    .line 7
    const-string v2, "CANCEL"

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, "Z9HG4BK"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p0}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getBranch()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Landroid/gov/nist/javax/sip/header/From;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Landroid/gov/nist/javax/sip/header/To;

    .line 107
    .line 108
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/From;->hasTag()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    const-string v6, "-"

    .line 113
    .line 114
    if-eqz v5, :cond_2

    .line 115
    .line 116
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    :cond_2
    iget-object v4, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 127
    .line 128
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/CallID;->getCallId()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v4, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 139
    .line 140
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/CSeq;->getSequenceNumber()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget-object v4, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 151
    .line 152
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/header/CSeq;->getMethod()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    if-eqz v0, :cond_3

    .line 160
    .line 161
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getSentBy()Landroid/gov/nist/core/HostPort;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v4}, Landroid/gov/nist/core/HostPort;->encode()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/Via;->getSentBy()Landroid/gov/nist/core/HostPort;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Landroid/gov/nist/core/HostPort;->hasPort()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_3

    .line 184
    .line 185
    const-string v0, "-5060"

    .line 186
    .line 187
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    :cond_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-interface {p0}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    if-eqz p0, :cond_4

    .line 203
    .line 204
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0, v1, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    const-string v1, "@"

    .line 225
    .line 226
    invoke-virtual {v0, v1, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Landroid/gov/nist/javax/sip/Utils;->getSignature()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0
.end method

.method public getUnrecognizedHeaders()Ljava/util/ListIterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getUnrecognizedHeadersList()Ljava/util/LinkedList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getUnrecognizedHeadersList()Ljava/util/LinkedList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->unrecognizedHeaders:Ljava/util/LinkedList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->unrecognizedHeaders:Ljava/util/LinkedList;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/SIPMessage;->VIA_LOWERCASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getSIPHeaderListLowerCase(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/header/ViaList;

    .line 8
    .line 9
    return-object p0
.end method

.method public hasContent()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public hasFromTag()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/From;->getTag()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public hasHeader(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public hasToTag()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/To;->getTag()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/CallID;->getCallId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const-string p0, "Invalid message! Cannot compute hashcode! call-id header is missing !"

    .line 15
    .line 16
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public isNullRequest()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->nullRequest:Z

    .line 2
    .line 3
    return p0
.end method

.method public match(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

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
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaders()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_a

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getHeaderName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {p0, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderList(Ljava/lang/String;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_9

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    instance-of v4, v1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 57
    .line 58
    if-eqz v4, :cond_7

    .line 59
    .line 60
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->listIterator()Ljava/util/ListIterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_1
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 77
    .line 78
    instance-of v5, v4, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 79
    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    :cond_5
    invoke-interface {v5}, Ljava/util/ListIterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_6

    .line 92
    .line 93
    invoke-interface {v5}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 98
    .line 99
    invoke-virtual {v6, v4}, Landroid/gov/nist/javax/sip/header/SIPObject;->match(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_5

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    return v2

    .line 107
    :cond_7
    invoke-interface {v3}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    :cond_8
    invoke-interface {v3}, Ljava/util/ListIterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_9

    .line 116
    .line 117
    invoke-interface {v3}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 122
    .line 123
    invoke-virtual {v4, v1}, Landroid/gov/nist/javax/sip/header/SIPObject;->match(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_8

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_9
    :goto_2
    return v2

    .line 131
    :cond_a
    return v0
.end method

.method public merge(Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 16
    .line 17
    iget-object p1, p1, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->toArray()[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    :goto_0
    array-length v1, p1

    .line 25
    if-ge v0, v1, :cond_2

    .line 26
    .line 27
    aget-object v1, p1, v0

    .line 28
    .line 29
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getHeaderName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {p0, v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderList(Ljava/lang/String;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_1
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 60
    .line 61
    invoke-virtual {v3, v1}, Landroid/gov/nist/core/GenericObject;->merge(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-void

    .line 69
    :cond_3
    const-string p0, "Bad class "

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1, p0}, La/ohq;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public removeContent()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 3
    .line 4
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 7
    .line 8
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/ContentLength;->setContentLength(I)V
    :try_end_0
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    return-void
.end method

.method public removeFirst(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Null argument Provided!"

    .line 9
    .line 10
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public removeHeader(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_9

    .line 156
    invoke-static {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 157
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPHeader;

    if-nez v0, :cond_0

    goto :goto_2

    .line 158
    :cond_0
    instance-of v1, v0, Landroid/gov/nist/javax/sip/header/From;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 159
    iput-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    goto :goto_0

    .line 160
    :cond_1
    instance-of v1, v0, Landroid/gov/nist/javax/sip/header/To;

    if-eqz v1, :cond_2

    .line 161
    iput-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    goto :goto_0

    .line 162
    :cond_2
    instance-of v1, v0, Landroid/gov/nist/javax/sip/header/CSeq;

    if-eqz v1, :cond_3

    .line 163
    iput-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    goto :goto_0

    .line 164
    :cond_3
    instance-of v1, v0, Landroid/gov/nist/javax/sip/header/CallID;

    if-eqz v1, :cond_4

    .line 165
    iput-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    goto :goto_0

    .line 166
    :cond_4
    instance-of v1, v0, Landroid/gov/nist/javax/sip/header/MaxForwards;

    if-eqz v1, :cond_5

    .line 167
    iput-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->maxForwardsHeader:Landroid/gov/nist/javax/sip/header/MaxForwards;

    goto :goto_0

    .line 168
    :cond_5
    instance-of v0, v0, Landroid/gov/nist/javax/sip/header/ContentLength;

    if-eqz v0, :cond_6

    .line 169
    iput-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 170
    :cond_6
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 171
    :cond_7
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 172
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 173
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 174
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_8
    :goto_2
    return-void

    .line 175
    :cond_9
    const-string p0, "null arg"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    return-void
.end method

.method public removeHeader(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderNamesCache;->toLowerCase(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    instance-of v2, v1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 18
    .line 19
    if-eqz v2, :cond_4

    .line 20
    .line 21
    check-cast v1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->removeFirst()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->removeLast()V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_c

    .line 37
    .line 38
    iget-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_3

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    iget-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headerTable:Ljava/util/Map;

    .line 77
    .line 78
    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    instance-of p2, v1, Landroid/gov/nist/javax/sip/header/From;

    .line 82
    .line 83
    const/4 v0, 0x0

    .line 84
    if-eqz p2, :cond_5

    .line 85
    .line 86
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    instance-of p2, v1, Landroid/gov/nist/javax/sip/header/To;

    .line 90
    .line 91
    if-eqz p2, :cond_6

    .line 92
    .line 93
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    instance-of p2, v1, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 97
    .line 98
    if-eqz p2, :cond_7

    .line 99
    .line 100
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->cSeqHeader:Landroid/gov/nist/javax/sip/header/CSeq;

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    instance-of p2, v1, Landroid/gov/nist/javax/sip/header/CallID;

    .line 104
    .line 105
    if-eqz p2, :cond_8

    .line 106
    .line 107
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_8
    instance-of p2, v1, Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 111
    .line 112
    if-eqz p2, :cond_9

    .line 113
    .line 114
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->maxForwardsHeader:Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_9
    instance-of p2, v1, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 118
    .line 119
    if-eqz p2, :cond_a

    .line 120
    .line 121
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 122
    .line 123
    :cond_a
    :goto_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->headers:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :cond_b
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_c

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    check-cast p2, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 140
    .line 141
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_b

    .line 150
    .line 151
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_c
    :goto_4
    return-void
.end method

.method public removeLast(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Null argument Provided!"

    .line 9
    .line 10
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setApplicationData(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->applicationData:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public setCSeq(Landroid/javax/sip/header/CSeqHeader;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setCallId(Landroid/javax/sip/header/CallIdHeader;)V
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    return-void
.end method

.method public setCallId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/header/CallID;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/CallID;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->callIdHeader:Landroid/gov/nist/javax/sip/header/CallID;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/CallID;->setCallId(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    iput-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 10
    .line 11
    iput-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of p2, p1, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    move-object p2, p1

    .line 18
    check-cast p2, Ljava/lang/String;

    .line 19
    .line 20
    iput-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    instance-of p2, p1, [B

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    move-object p2, p1

    .line 28
    check-cast p2, [B

    .line 29
    .line 30
    iput-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 34
    .line 35
    :goto_0
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->computeContentLength(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    const-string p0, "null content"

    .line 40
    .line 41
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public setContentDisposition(Landroid/javax/sip/header/ContentDispositionHeader;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setContentEncoding(Landroid/javax/sip/header/ContentEncodingHeader;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setContentLanguage(Landroid/javax/sip/header/ContentLanguageHeader;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setContentLength(Landroid/javax/sip/header/ContentLengthHeader;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/javax/sip/header/ContentLengthHeader;->getContentLength()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ContentLength;->setContentLength(I)V
    :try_end_0
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    return-void
.end method

.method public setExpires(Landroid/javax/sip/header/ExpiresHeader;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setFrom(Landroid/javax/sip/header/FromHeader;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setFromTag(Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->fromHeader:Landroid/gov/nist/javax/sip/header/From;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/From;->setTag(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    return-void
.end method

.method public setHeader(Landroid/gov/nist/javax/sip/header/SIPHeaderList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/gov/nist/javax/sip/header/SIPHeaderList<",
            "Landroid/gov/nist/javax/sip/header/Via;",
            ">;)V"
        }
    .end annotation

    .line 43
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    return-void
.end method

.method public setHeader(Landroid/javax/sip/header/Header;)V
    .locals 2

    .line 1
    check-cast p1, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    :try_start_0
    instance-of v0, p1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/SIPHeader;->getHeaderName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p0, p1, v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;ZZ)V
    :try_end_0
    .catch Landroid/gov/nist/javax/sip/message/SIPDuplicateHeaderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_0
    move-exception p0

    .line 33
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const-string p0, "null header!"

    .line 38
    .line 39
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public setHeaders(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/gov/nist/javax/sip/header/SIPHeader;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :catch_0
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :try_start_0
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;Z)V
    :try_end_0
    .catch Landroid/gov/nist/javax/sip/message/SIPDuplicateHeaderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public setLocalAddress(Ljava/net/InetAddress;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->localAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-void
.end method

.method public setLocalPort(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->localPort:I

    .line 2
    .line 3
    return-void
.end method

.method public setMaxForwards(Landroid/javax/sip/header/MaxForwardsHeader;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setMessageContent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p3, :cond_0

    .line 72
    new-instance v0, Landroid/gov/nist/javax/sip/header/ContentType;

    invoke-direct {v0, p1, p2}, Landroid/gov/nist/javax/sip/header/ContentType;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 74
    iput-object p3, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    const/4 p1, 0x0

    .line 75
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 76
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 77
    invoke-direct {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->computeContentLength(Ljava/lang/Object;)V

    return-void

    .line 78
    :cond_0
    const-string p0, "messgeContent is null"

    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    return-void
.end method

.method public setMessageContent(Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 1

    .line 68
    new-instance v0, Landroid/gov/nist/javax/sip/header/ContentType;

    invoke-direct {v0, p1, p2}, Landroid/gov/nist/javax/sip/header/ContentType;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 70
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMessageContent([B)V

    .line 71
    invoke-direct {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->computeContentLength(Ljava/lang/Object;)V

    return-void
.end method

.method public setMessageContent([B)V
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->computeContentLength(Ljava/lang/Object;)V

    .line 80
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    const/4 p1, 0x0

    .line 81
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 82
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    return-void
.end method

.method public setMessageContent([BZI)V
    .locals 1

    .line 83
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->computeContentLength(Ljava/lang/Object;)V

    if-nez p2, :cond_1

    .line 84
    iget-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/header/ContentLength;->getContentLength()I

    move-result p2

    if-lt p2, p3, :cond_0

    goto :goto_0

    .line 85
    :cond_0
    new-instance p1, Ljava/text/ParseException;

    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/ContentLength;->getContentLength()I

    move-result p0

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid content length "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " / "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1

    .line 86
    :cond_1
    :goto_0
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    const/4 p1, 0x0

    .line 87
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 88
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    return-void
.end method

.method public setMessageContent([BZZI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->computeContentLength(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    if-nez p3, :cond_2

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/header/ContentLength;->getContentLength()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-ne p2, p4, :cond_1

    .line 15
    .line 16
    :cond_0
    iget-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/header/ContentLength;->getContentLength()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-lt p2, p4, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance p1, Ljava/text/ParseException;

    .line 26
    .line 27
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->contentLengthHeader:Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/ContentLength;->getContentLength()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    new-instance p2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string p3, "Invalid content length "

    .line 36
    .line 37
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, " / "

    .line 44
    .line 45
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const/4 p2, 0x0

    .line 56
    invoke-direct {p1, p0, p2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    :goto_0
    const/4 p2, 0x0

    .line 61
    iput-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContent:Ljava/lang/String;

    .line 62
    .line 63
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentBytes:[B

    .line 64
    .line 65
    iput-object p2, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->messageContentObject:Ljava/lang/Object;

    .line 66
    .line 67
    return-void
.end method

.method public setNullRequest()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->nullRequest:Z

    .line 3
    .line 4
    return-void
.end method

.method public setPeerPacketSourceAddress(Ljava/net/InetAddress;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->peerPacketSourceAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-void
.end method

.method public setPeerPacketSourcePort(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->peerPacketSourcePort:I

    .line 2
    .line 3
    return-void
.end method

.method public setRemoteAddress(Ljava/net/InetAddress;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->remoteAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-void
.end method

.method public setRemotePort(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->remotePort:I

    .line 2
    .line 3
    return-void
.end method

.method public abstract setSIPVersion(Ljava/lang/String;)V
.end method

.method public setSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->size:I

    .line 2
    .line 3
    return-void
.end method

.method public setTo(Landroid/javax/sip/header/ToHeader;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setToTag(Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->toHeader:Landroid/gov/nist/javax/sip/header/To;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/To;->setTag(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    return-void
.end method

.method public setUnrecognizedHeadersList(Ljava/util/LinkedList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPMessage;->unrecognizedHeaders:Ljava/util/LinkedList;

    .line 2
    .line 3
    return-void
.end method

.method public setVia(Ljava/util/List;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/header/ViaList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/ViaList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/gov/nist/javax/sip/header/Via;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/gov/nist/javax/sip/header/SIPHeaderList;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public abstract toString()Ljava/lang/String;
.end method

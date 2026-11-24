.class public Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/message/MessageFactory;
.implements Landroid/gov/nist/javax/sip/message/MessageFactoryExt;


# static fields
.field private static defaultContentEncodingCharset:Ljava/lang/String; = "UTF-8"

.field private static server:Landroid/javax/sip/header/ServerHeader;

.field private static userAgent:Landroid/javax/sip/header/UserAgentHeader;


# instance fields
.field private strict:Z

.field private testing:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->testing:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->strict:Z

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic access$000(Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->testing:Z

    .line 2
    .line 3
    return p0
.end method

.method public static getDefaultContentEncodingCharset()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->defaultContentEncodingCharset:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultServerHeader()Landroid/javax/sip/header/ServerHeader;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->server:Landroid/javax/sip/header/ServerHeader;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultUserAgentHeader()Landroid/javax/sip/header/UserAgentHeader;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public createMultipartMimeContent(Landroid/javax/sip/header/ContentTypeHeader;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Landroid/gov/nist/javax/sip/message/MultipartMimeContent;
    .locals 3

    .line 1
    const-string p0, "boundary"

    .line 2
    .line 3
    invoke-interface {p1, p0}, Landroid/javax/sip/header/Parameters;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;-><init>(Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    :goto_0
    array-length v0, p2

    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroid/gov/nist/javax/sip/header/ContentType;

    .line 16
    .line 17
    aget-object v1, p2, p1

    .line 18
    .line 19
    aget-object v2, p3, p1

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Landroid/gov/nist/javax/sip/header/ContentType;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Landroid/gov/nist/javax/sip/message/ContentImpl;

    .line 25
    .line 26
    aget-object v2, p4, p1

    .line 27
    .line 28
    invoke-direct {v1, v2}, Landroid/gov/nist/javax/sip/message/ContentImpl;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/message/ContentImpl;->setContentTypeHeader(Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/message/MultipartMimeContentImpl;->add(Landroid/gov/nist/javax/sip/message/Content;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-object p0
.end method

.method public createRequest(Landroid/javax/sip/address/URI;Ljava/lang/String;Landroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;)Landroid/javax/sip/message/Request;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    if-eqz p5, :cond_1

    if-eqz p6, :cond_1

    if-eqz p7, :cond_1

    if-eqz p8, :cond_1

    .line 87
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 88
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 89
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMethod(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 91
    invoke-virtual {p0, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 92
    invoke-virtual {p0, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 93
    invoke-virtual {p0, p6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 94
    invoke-virtual {p0, p7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 95
    invoke-virtual {p0, p8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMaxForwards(Landroid/javax/sip/header/MaxForwardsHeader;)V

    .line 96
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    if-eqz p1, :cond_0

    .line 97
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p0

    .line 98
    :cond_1
    const-string p0, "JAIN-SIP Exception, some parameters are missing, unable to create the request"

    const/4 p1, 0x0

    invoke-static {p1, p0}, La/hny;->j(ILjava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createRequest(Landroid/javax/sip/address/URI;Ljava/lang/String;Landroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;Landroid/javax/sip/header/ContentTypeHeader;Ljava/lang/Object;)Landroid/javax/sip/message/Request;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    if-eqz p5, :cond_1

    if-eqz p6, :cond_1

    if-eqz p7, :cond_1

    if-eqz p8, :cond_1

    if-eqz p10, :cond_1

    if-eqz p9, :cond_1

    .line 74
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 75
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 76
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMethod(Ljava/lang/String;)V

    .line 77
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 78
    invoke-virtual {p0, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 79
    invoke-virtual {p0, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 80
    invoke-virtual {p0, p6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 81
    invoke-virtual {p0, p7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 82
    invoke-virtual {p0, p8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMaxForwards(Landroid/javax/sip/header/MaxForwardsHeader;)V

    .line 83
    invoke-virtual {p0, p10, p9}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 84
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    if-eqz p1, :cond_0

    .line 85
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p0

    .line 86
    :cond_1
    const-string p0, "Null parameters"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createRequest(Landroid/javax/sip/address/URI;Ljava/lang/String;Landroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;Landroid/javax/sip/header/ContentTypeHeader;[B)Landroid/javax/sip/message/Request;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    if-eqz p5, :cond_1

    if-eqz p6, :cond_1

    if-eqz p7, :cond_1

    if-eqz p8, :cond_1

    if-eqz p10, :cond_1

    if-eqz p9, :cond_1

    .line 99
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 100
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 101
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMethod(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 103
    invoke-virtual {p0, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 104
    invoke-virtual {p0, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 105
    invoke-virtual {p0, p6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 106
    invoke-virtual {p0, p7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 107
    invoke-virtual {p0, p8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMaxForwards(Landroid/javax/sip/header/MaxForwardsHeader;)V

    .line 108
    invoke-virtual {p0, p10, p9}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 109
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    if-eqz p1, :cond_0

    .line 110
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p0

    .line 111
    :cond_1
    const-string p0, "missing parameters"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createRequest(Landroid/javax/sip/address/URI;Ljava/lang/String;Landroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;[BLandroid/javax/sip/header/ContentTypeHeader;)Landroid/javax/sip/message/Request;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    if-eqz p4, :cond_1

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    if-eqz p6, :cond_1

    .line 12
    .line 13
    if-eqz p7, :cond_1

    .line 14
    .line 15
    if-eqz p8, :cond_1

    .line 16
    .line 17
    if-eqz p9, :cond_1

    .line 18
    .line 19
    if-eqz p10, :cond_1

    .line 20
    .line 21
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 22
    .line 23
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setMethod(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMaxForwards(Landroid/javax/sip/header/MaxForwardsHeader;)V

    .line 48
    .line 49
    .line 50
    check-cast p10, Landroid/gov/nist/javax/sip/header/ContentType;

    .line 51
    .line 52
    invoke-virtual {p0, p10}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p9}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMessageContent([B)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    .line 59
    .line 60
    if-eqz p1, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-object p0

    .line 66
    :cond_1
    const-string p0, "JAIN-SIP Exception, some parameters are missing, unable to create the request"

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    invoke-static {p1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public createRequest(Ljava/lang/String;)Landroid/javax/sip/message/Request;
    .locals 5

    if-eqz p1, :cond_3

    .line 112
    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 113
    :cond_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    invoke-direct {v0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;-><init>()V

    .line 114
    new-instance v1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl$1;

    invoke-direct {v1, p0}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl$1;-><init>(Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;)V

    .line 115
    iget-boolean v2, p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->testing:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v3

    .line 116
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    const/4 v4, 0x1

    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->strict:Z

    invoke-virtual {v0, v2, v4, p0, v1}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    move-result-object p0

    .line 117
    instance-of v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    if-eqz v0, :cond_2

    .line 118
    check-cast p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    .line 119
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    return-object v3

    .line 120
    :cond_3
    :goto_1
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 121
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setNullRequest()V

    return-object p0
.end method

.method public createResponse(ILandroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;)Landroid/javax/sip/message/Response;
    .locals 0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    if-eqz p5, :cond_1

    if-eqz p6, :cond_1

    if-eqz p7, :cond_1

    .line 99
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPResponse;-><init>()V

    .line 100
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setStatusCode(I)V

    .line 101
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 102
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 103
    invoke-virtual {p0, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 104
    invoke-virtual {p0, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 105
    invoke-virtual {p0, p6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 106
    invoke-virtual {p0, p7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMaxForwards(Landroid/javax/sip/header/MaxForwardsHeader;)V

    .line 107
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    if-eqz p1, :cond_0

    .line 108
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p0

    .line 109
    :cond_1
    const-string p0, "JAIN-SIP Exception, some parameters are missing, unable to create the response"

    const/4 p1, 0x0

    invoke-static {p1, p0}, La/hny;->j(ILjava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createResponse(ILandroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;Landroid/javax/sip/header/ContentTypeHeader;Ljava/lang/Object;)Landroid/javax/sip/message/Response;
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p2, :cond_2

    .line 3
    .line 4
    if-eqz p3, :cond_2

    .line 5
    .line 6
    if-eqz p4, :cond_2

    .line 7
    .line 8
    if-eqz p5, :cond_2

    .line 9
    .line 10
    if-eqz p6, :cond_2

    .line 11
    .line 12
    if-eqz p7, :cond_2

    .line 13
    .line 14
    if-eqz p9, :cond_2

    .line 15
    .line 16
    if-eqz p8, :cond_2

    .line 17
    .line 18
    new-instance p7, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 19
    .line 20
    invoke-direct {p7}, Landroid/gov/nist/javax/sip/message/SIPResponse;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v0, Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/StatusLine;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/StatusLine;->setStatusCode(I)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getReasonPhrase(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/header/StatusLine;->setReasonPhrase(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p7, v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setStatusLine(Landroid/gov/nist/javax/sip/header/StatusLine;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p7, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p7, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p7, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p7, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p7, p6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p7, p9, p8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    .line 62
    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    invoke-virtual {p7, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    return-object p7

    .line 69
    :cond_1
    const-string p2, " Unknown"

    .line 70
    .line 71
    invoke-static {p1, p2}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const/4 p2, 0x0

    .line 76
    invoke-static {p2, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_2
    const-string p1, "missing parameters"

    .line 81
    .line 82
    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object p0
.end method

.method public createResponse(ILandroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;Landroid/javax/sip/header/ContentTypeHeader;[B)Landroid/javax/sip/message/Response;
    .locals 2

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    if-eqz p4, :cond_2

    if-eqz p5, :cond_2

    if-eqz p6, :cond_2

    if-eqz p7, :cond_2

    if-eqz p9, :cond_2

    if-eqz p8, :cond_2

    .line 146
    new-instance p7, Landroid/gov/nist/javax/sip/message/SIPResponse;

    invoke-direct {p7}, Landroid/gov/nist/javax/sip/message/SIPResponse;-><init>()V

    .line 147
    new-instance v0, Landroid/gov/nist/javax/sip/header/StatusLine;

    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/StatusLine;-><init>()V

    .line 148
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/StatusLine;->setStatusCode(I)V

    .line 149
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getReasonPhrase(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 150
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/header/StatusLine;->setReasonPhrase(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p7, v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setStatusLine(Landroid/gov/nist/javax/sip/header/StatusLine;)V

    .line 152
    invoke-virtual {p7, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 153
    invoke-virtual {p7, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 154
    invoke-virtual {p7, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 155
    invoke-virtual {p7, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 156
    invoke-virtual {p7, p6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 157
    invoke-virtual {p7, p9, p8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 158
    sget-object p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    if-eqz p0, :cond_0

    .line 159
    invoke-virtual {p7, p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p7

    .line 160
    :cond_1
    const-string p2, " : Unknown"

    .line 161
    invoke-static {p1, p2}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 162
    invoke-static {p2, p1}, La/hny;->j(ILjava/lang/String;)V

    return-object p0

    .line 163
    :cond_2
    const-string p1, "missing parameters"

    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    return-object p0
.end method

.method public createResponse(ILandroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)Landroid/javax/sip/message/Response;
    .locals 1

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    if-eqz p5, :cond_1

    if-eqz p6, :cond_1

    if-eqz p7, :cond_1

    if-eqz p8, :cond_1

    if-eqz p9, :cond_1

    .line 130
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPResponse;-><init>()V

    .line 131
    new-instance v0, Landroid/gov/nist/javax/sip/header/StatusLine;

    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/StatusLine;-><init>()V

    .line 132
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/StatusLine;->setStatusCode(I)V

    .line 133
    invoke-static {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getReasonPhrase(I)Ljava/lang/String;

    move-result-object p1

    .line 134
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/StatusLine;->setReasonPhrase(Ljava/lang/String;)V

    .line 135
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setStatusLine(Landroid/gov/nist/javax/sip/header/StatusLine;)V

    .line 136
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 137
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 138
    invoke-virtual {p0, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 139
    invoke-virtual {p0, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 140
    invoke-virtual {p0, p6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 141
    invoke-virtual {p0, p7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMaxForwards(Landroid/javax/sip/header/MaxForwardsHeader;)V

    .line 142
    invoke-virtual {p0, p8, p9}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 143
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    if-eqz p1, :cond_0

    .line 144
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p0

    .line 145
    :cond_1
    const-string p0, " unable to create the response"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createResponse(ILandroid/javax/sip/header/CallIdHeader;Landroid/javax/sip/header/CSeqHeader;Landroid/javax/sip/header/FromHeader;Landroid/javax/sip/header/ToHeader;Ljava/util/List;Landroid/javax/sip/header/MaxForwardsHeader;[BLandroid/javax/sip/header/ContentTypeHeader;)Landroid/javax/sip/message/Response;
    .locals 0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    if-eqz p5, :cond_1

    if-eqz p6, :cond_1

    if-eqz p7, :cond_1

    if-eqz p8, :cond_1

    if-eqz p9, :cond_1

    .line 86
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPResponse;-><init>()V

    .line 87
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setStatusCode(I)V

    .line 88
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCallId(Landroid/javax/sip/header/CallIdHeader;)V

    .line 89
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setCSeq(Landroid/javax/sip/header/CSeqHeader;)V

    .line 90
    invoke-virtual {p0, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setFrom(Landroid/javax/sip/header/FromHeader;)V

    .line 91
    invoke-virtual {p0, p5}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setTo(Landroid/javax/sip/header/ToHeader;)V

    .line 92
    invoke-virtual {p0, p6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setVia(Ljava/util/List;)V

    .line 93
    invoke-virtual {p0, p7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMaxForwards(Landroid/javax/sip/header/MaxForwardsHeader;)V

    .line 94
    check-cast p9, Landroid/gov/nist/javax/sip/header/ContentType;

    invoke-virtual {p0, p9}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 95
    invoke-virtual {p0, p8}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMessageContent([B)V

    .line 96
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    if-eqz p1, :cond_0

    .line 97
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p0

    .line 98
    :cond_1
    const-string p0, "Null params "

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createResponse(ILandroid/javax/sip/message/Request;)Landroid/javax/sip/message/Response;
    .locals 0

    if-eqz p2, :cond_1

    .line 123
    check-cast p2, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 124
    invoke-virtual {p2, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    move-result-object p0

    .line 125
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeContent()V

    .line 126
    const-string p1, "Content-Type"

    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeHeader(Ljava/lang/String;)V

    .line 127
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->server:Landroid/javax/sip/header/ServerHeader;

    if-eqz p1, :cond_0

    .line 128
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p0

    .line 129
    :cond_1
    const-string p0, "null parameters"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createResponse(ILandroid/javax/sip/message/Request;Landroid/javax/sip/header/ContentTypeHeader;Ljava/lang/Object;)Landroid/javax/sip/message/Response;
    .locals 0

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    if-eqz p3, :cond_1

    .line 110
    check-cast p2, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 111
    invoke-virtual {p2, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    move-result-object p0

    .line 112
    invoke-virtual {p0, p4, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 113
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->server:Landroid/javax/sip/header/ServerHeader;

    if-eqz p1, :cond_0

    .line 114
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p0

    .line 115
    :cond_1
    const-string p0, "null parameters"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createResponse(ILandroid/javax/sip/message/Request;Landroid/javax/sip/header/ContentTypeHeader;[B)Landroid/javax/sip/message/Response;
    .locals 0

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    if-eqz p3, :cond_1

    .line 116
    check-cast p2, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 117
    invoke-virtual {p2, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    move-result-object p0

    .line 118
    check-cast p3, Landroid/gov/nist/javax/sip/header/ContentType;

    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 119
    invoke-virtual {p0, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMessageContent([B)V

    .line 120
    sget-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->server:Landroid/javax/sip/header/ServerHeader;

    if-eqz p1, :cond_0

    .line 121
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    :cond_0
    return-object p0

    .line 122
    :cond_1
    const-string p0, "null Parameters"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createResponse(Ljava/lang/String;)Landroid/javax/sip/message/Response;
    .locals 4

    if-nez p1, :cond_0

    .line 164
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPResponse;-><init>()V

    return-object p0

    .line 165
    :cond_0
    new-instance p0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;-><init>()V

    .line 166
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    move-result-object p0

    .line 167
    instance-of v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    if-eqz v0, :cond_1

    .line 168
    check-cast p0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    return-object p0

    .line 169
    :cond_1
    invoke-static {v2, p1}, La/hny;->j(ILjava/lang/String;)V

    return-object v3
.end method

.method public setDefaultContentEncodingCharset(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sput-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->defaultContentEncodingCharset:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Null argument!"

    .line 7
    .line 8
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setDefaultServerHeader(Landroid/javax/sip/header/ServerHeader;)V
    .locals 0

    .line 1
    sput-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->server:Landroid/javax/sip/header/ServerHeader;

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultUserAgentHeader(Landroid/javax/sip/header/UserAgentHeader;)V
    .locals 0

    .line 1
    sput-object p1, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->userAgent:Landroid/javax/sip/header/UserAgentHeader;

    .line 2
    .line 3
    return-void
.end method

.method public setStrict(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->strict:Z

    .line 2
    .line 3
    return-void
.end method

.method public setTest(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->testing:Z

    .line 2
    .line 3
    return-void
.end method

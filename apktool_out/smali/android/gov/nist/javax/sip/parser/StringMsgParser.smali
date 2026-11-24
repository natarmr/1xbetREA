.class public Landroid/gov/nist/javax/sip/parser/StringMsgParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/parser/MessageParser;


# static fields
.field protected static computeContentLengthFromMessage:Z = false

.field private static logger:Landroid/gov/nist/core/StackLogger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

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

.method public static main([Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string p0, "SIP/2.0 180 Ringing\r\nVia: SIP/2.0/UDP 172.18.1.29:5060;branch=z9hG4bK43fc10fb4446d55fc5c8f969607991f4\r\nTo: \"0440\" <sip:0440@212.209.220.131>;tag=2600\r\nFrom: \"Andreas\" <sip:andreas@e-horizon.se>;tag=8524\r\nCall-ID: f51a1851c5f570606140f14c8eb64fd3@172.18.1.29\r\nCSeq: 1 INVITE\r\nMax-Forwards: 70\r\nRecord-Route: <sip:212.209.220.131:5060>\r\nContent-Length: 0\r\n\r\n"

    .line 2
    .line 3
    const-string v0, "REGISTER sip:nist.gov SIP/2.0\r\nVia: SIP/2.0/UDP 129.6.55.182:14826\r\nMax-Forwards: 70\r\nFrom: <sip:mranga@nist.gov>;tag=6fcd5c7ace8b4a45acf0f0cd539b168b;epid=0d4c418ddf\r\nTo: <sip:mranga@nist.gov>\r\nCall-ID: c5679907eb954a8da9f9dceb282d7230@129.6.55.182\r\nCSeq: 1 REGISTER\r\nContact: <sip:129.6.55.182:14826>;methods=\"INVITE, MESSAGE, INFO, SUBSCRIBE, OPTIONS, BYE, CANCEL, NOTIFY, ACK, REFER\"\r\nUser-Agent: RTC/(Microsoft RTC)\r\nEvent:  registration\r\nAllow-Events: presence\r\nContent-Length: 0\r\n\r\nINVITE sip:littleguy@there.com:5060 SIP/2.0\r\nVia: SIP/2.0/UDP 65.243.118.100:5050\r\nFrom: M. Ranganathan  <sip:M.Ranganathan@sipbakeoff.com>;tag=1234\r\nTo: \"littleguy@there.com\" <sip:littleguy@there.com:5060> \r\nCall-ID: Q2AboBsaGn9!?x6@sipbakeoff.com \r\nCSeq: 1 INVITE \r\nContent-Length: 247\r\n\r\nv=0\r\no=4855 13760799956958020 13760799956958020 IN IP4  129.6.55.78\r\ns=mysession session\r\np=+46 8 52018010\r\nc=IN IP4  129.6.55.78\r\nt=0 0\r\nm=audio 6022 RTP/AVP 0 4 18\r\na=rtpmap:0 PCMU/8000\r\na=rtpmap:4 G723/8000\r\na=rtpmap:18 G729A/8000\r\na=ptime:20\r\n"

    .line 4
    .line 5
    const-string v1, "SIP/2.0 200 OK\r\nTo: \"The Little Blister\" <sip:LittleGuy@there.com>;tag=469bc066\r\nFrom: \"The Master Blaster\" <sip:BigGuy@here.com>;tag=11\r\nVia: SIP/2.0/UDP 139.10.134.246:5060;branch=z9hG4bK8b0a86f6_1030c7d18e0_17;received=139.10.134.246\r\nCall-ID: 1030c7d18ae_a97b0b_b@8b0a86f6\r\nCSeq: 1 SUBSCRIBE\r\nContact: <sip:172.16.11.162:5070>\r\nContent-Length: 0\r\n\r\n"

    .line 6
    .line 7
    filled-new-array {v1, p0, v0}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    const/16 v1, 0x14

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Ljava/lang/Thread;

    .line 17
    .line 18
    new-instance v2, Landroid/gov/nist/javax/sip/parser/StringMsgParser$1ParserThread;

    .line 19
    .line 20
    invoke-direct {v2, p0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser$1ParserThread;-><init>([Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public static parseSIPHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SIPHeader;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    const/4 v4, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    const/16 v6, 0x20

    .line 15
    .line 16
    if-gt v5, v6, :cond_0

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    :goto_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v5
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    if-gt v5, v6, :cond_1

    .line 26
    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    add-int/lit8 v7, v0, 0x1

    .line 33
    .line 34
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 35
    .line 36
    .line 37
    move v8, v2

    .line 38
    move v7, v3

    .line 39
    :goto_2
    const/16 v9, 0xa

    .line 40
    .line 41
    if-gt v3, v0, :cond_7

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    const/16 v11, 0xd

    .line 48
    .line 49
    if-eq v10, v11, :cond_5

    .line 50
    .line 51
    if-ne v10, v9, :cond_2

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_2
    if-eqz v8, :cond_6

    .line 55
    .line 56
    if-eq v10, v6, :cond_4

    .line 57
    .line 58
    const/16 v7, 0x9

    .line 59
    .line 60
    if-ne v10, v7, :cond_3

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move v8, v2

    .line 64
    move v7, v3

    .line 65
    goto :goto_5

    .line 66
    :cond_4
    :goto_3
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    add-int/lit8 v7, v3, 0x1

    .line 70
    .line 71
    move v8, v2

    .line 72
    goto :goto_5

    .line 73
    :cond_5
    :goto_4
    if-nez v8, :cond_6

    .line 74
    .line 75
    invoke-virtual {p0, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    move v8, v1

    .line 83
    :cond_6
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_7
    invoke-virtual {p0, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Landroid/gov/nist/javax/sip/parser/ParserFactory;->createParser(Ljava/lang/String;)Landroid/gov/nist/javax/sip/parser/HeaderParser;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-eqz p0, :cond_8

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->parse()Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_8
    const-string p0, "could not create parser"

    .line 112
    .line 113
    invoke-static {v2, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v4

    .line 117
    :catch_0
    const-string p0, "Empty header."

    .line 118
    .line 119
    invoke-static {v2, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v4
.end method

.method public static setComputeContentLengthFromMessage(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->computeContentLengthFromMessage:Z

    .line 2
    .line 3
    return-void
.end method

.method public static trimEndOfLine(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    :goto_0
    if-ltz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    if-gt v1, v2, :cond_1

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    const/4 v1, -0x1

    .line 33
    if-ne v0, v1, :cond_3

    .line 34
    .line 35
    const-string p0, ""

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    const/4 v1, 0x0

    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method


# virtual methods
.method public parseAddress(Ljava/lang/String;)Landroid/gov/nist/javax/sip/address/AddressImpl;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/parser/AddressParser;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/AddressParser;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/parser/AddressParser;->address(Z)Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public parseHost(Ljava/lang/String;)Landroid/gov/nist/core/Host;
    .locals 1

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 2
    .line 3
    const-string v0, "charLexer"

    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Landroid/gov/nist/javax/sip/parser/Lexer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Landroid/gov/nist/core/HostNameParser;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Landroid/gov/nist/core/HostNameParser;-><init>(Landroid/gov/nist/core/LexerCore;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/gov/nist/core/HostNameParser;->host()Landroid/gov/nist/core/Host;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    array-length v4, v1

    .line 10
    if-nez v4, :cond_1

    .line 11
    .line 12
    :cond_0
    const/16 v16, 0x0

    .line 13
    .line 14
    goto/16 :goto_7

    .line 15
    .line 16
    :cond_1
    const/4 v4, 0x0

    .line 17
    move v5, v4

    .line 18
    :goto_0
    const/16 v6, 0x20

    .line 19
    .line 20
    :try_start_0
    aget-byte v7, v1, v5
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_3

    .line 21
    .line 22
    if-ge v7, v6, :cond_2

    .line 23
    .line 24
    add-int/lit8 v5, v5, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    const/4 v7, 0x1

    .line 28
    move v8, v7

    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v10, 0x0

    .line 31
    :goto_1
    move v11, v5

    .line 32
    :goto_2
    :try_start_1
    aget-byte v12, v1, v11
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2

    .line 33
    .line 34
    const/16 v13, 0xa

    .line 35
    .line 36
    const/16 v14, 0xd

    .line 37
    .line 38
    if-eq v12, v14, :cond_3

    .line 39
    .line 40
    if-eq v12, v13, :cond_3

    .line 41
    .line 42
    add-int/lit8 v11, v11, 0x1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    sub-int v12, v11, v5

    .line 46
    .line 47
    :try_start_2
    new-instance v15, Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0

    .line 48
    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    :try_start_3
    const-string v3, "UTF-8"

    .line 52
    .line 53
    invoke-direct {v15, v1, v5, v12, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_1

    .line 54
    .line 55
    .line 56
    invoke-static {v15}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->trimEndOfLine(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-nez v5, :cond_4

    .line 65
    .line 66
    if-eqz v9, :cond_9

    .line 67
    .line 68
    if-eqz v10, :cond_9

    .line 69
    .line 70
    invoke-virtual {v0, v9, v10, v2, v1}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->processHeader(Ljava/lang/String;Landroid/gov/nist/javax/sip/message/SIPMessage;Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;[B)V

    .line 71
    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    if-eqz v8, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0, v3, v2, v1}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->processFirstLine(Ljava/lang/String;Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;[B)Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    goto :goto_4

    .line 81
    :cond_5
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    const/16 v8, 0x9

    .line 86
    .line 87
    if-eq v5, v8, :cond_8

    .line 88
    .line 89
    if-ne v5, v6, :cond_6

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_6
    if-eqz v9, :cond_7

    .line 93
    .line 94
    if-eqz v10, :cond_7

    .line 95
    .line 96
    invoke-virtual {v0, v9, v10, v2, v1}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->processHeader(Ljava/lang/String;Landroid/gov/nist/javax/sip/message/SIPMessage;Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;[B)V

    .line 97
    .line 98
    .line 99
    :cond_7
    move-object v9, v3

    .line 100
    goto :goto_4

    .line 101
    :cond_8
    :goto_3
    if-eqz v9, :cond_c

    .line 102
    .line 103
    invoke-virtual {v3, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v9, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    :cond_9
    :goto_4
    aget-byte v5, v1, v11

    .line 112
    .line 113
    if-ne v5, v14, :cond_a

    .line 114
    .line 115
    array-length v5, v1

    .line 116
    add-int/lit8 v8, v11, 0x1

    .line 117
    .line 118
    if-le v5, v8, :cond_a

    .line 119
    .line 120
    aget-byte v5, v1, v8

    .line 121
    .line 122
    if-ne v5, v13, :cond_a

    .line 123
    .line 124
    move v11, v8

    .line 125
    :cond_a
    add-int/lit8 v5, v11, 0x1

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-gtz v3, :cond_b

    .line 132
    .line 133
    move v11, v5

    .line 134
    goto :goto_5

    .line 135
    :cond_b
    move v8, v4

    .line 136
    goto :goto_1

    .line 137
    :cond_c
    const-string v0, "Bad header continuation."

    .line 138
    .line 139
    invoke-static {v4, v0}, La/hny;->j(ILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v16

    .line 143
    :catch_0
    const/16 v16, 0x0

    .line 144
    .line 145
    :catch_1
    const-string v0, "Bad message encoding!"

    .line 146
    .line 147
    invoke-static {v4, v0}, La/hny;->j(ILjava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v16

    .line 151
    :catch_2
    const/16 v16, 0x0

    .line 152
    .line 153
    :goto_5
    if-eqz v10, :cond_11

    .line 154
    .line 155
    invoke-virtual {v10, v11}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setSize(I)V

    .line 156
    .line 157
    .line 158
    if-eqz p2, :cond_10

    .line 159
    .line 160
    invoke-virtual {v10}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz v0, :cond_10

    .line 165
    .line 166
    invoke-virtual {v10}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-interface {v0}, Landroid/javax/sip/header/ContentLengthHeader;->getContentLength()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_d

    .line 175
    .line 176
    array-length v0, v1

    .line 177
    sub-int/2addr v0, v11

    .line 178
    new-array v2, v0, [B

    .line 179
    .line 180
    invoke-static {v1, v11, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 181
    .line 182
    .line 183
    xor-int/lit8 v0, p3, 0x1

    .line 184
    .line 185
    sget-boolean v1, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->computeContentLengthFromMessage:Z

    .line 186
    .line 187
    invoke-virtual {v10}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-interface {v3}, Landroid/javax/sip/header/ContentLengthHeader;->getContentLength()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    invoke-virtual {v10, v2, v0, v1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMessageContent([BZZI)V

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_d
    sget-boolean v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->computeContentLengthFromMessage:Z

    .line 200
    .line 201
    if-nez v0, :cond_10

    .line 202
    .line 203
    invoke-virtual {v10}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-interface {v0}, Landroid/javax/sip/header/ContentLengthHeader;->getContentLength()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-nez v0, :cond_e

    .line 212
    .line 213
    move v4, v7

    .line 214
    :cond_e
    and-int v0, v4, p3

    .line 215
    .line 216
    if-eqz v0, :cond_10

    .line 217
    .line 218
    new-instance v0, Ljava/lang/String;

    .line 219
    .line 220
    array-length v2, v1

    .line 221
    const/4 v3, 0x4

    .line 222
    sub-int/2addr v2, v3

    .line 223
    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([BII)V

    .line 224
    .line 225
    .line 226
    const-string v1, "\r\n\r\n"

    .line 227
    .line 228
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_f

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_f
    const-string v0, "Extraneous characters at the end of the message "

    .line 236
    .line 237
    invoke-static {v11, v0}, La/hny;->j(ILjava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-object v16

    .line 241
    :cond_10
    :goto_6
    return-object v10

    .line 242
    :cond_11
    const-string v0, "Bad message"

    .line 243
    .line 244
    invoke-static {v4, v0}, La/hny;->j(ILjava/lang/String;)V

    .line 245
    .line 246
    .line 247
    return-object v16

    .line 248
    :catch_3
    const/16 v16, 0x0

    .line 249
    .line 250
    sget-object v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 251
    .line 252
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_12

    .line 257
    .line 258
    sget-object v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 259
    .line 260
    const-string v1, "handled only control char so returning null"

    .line 261
    .line 262
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :cond_12
    :goto_7
    return-object v16
.end method

.method public parseSIPRequestLine(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/RequestLine;
    .locals 0

    .line 1
    const-string p0, "\n"

    .line 2
    .line 3
    invoke-static {p1, p0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance p1, Landroid/gov/nist/javax/sip/parser/RequestLineParser;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Landroid/gov/nist/javax/sip/parser/RequestLineParser;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/parser/RequestLineParser;->parse()Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public parseSIPStatusLine(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/StatusLine;
    .locals 0

    .line 1
    const-string p0, "\n"

    .line 2
    .line 3
    invoke-static {p1, p0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance p1, Landroid/gov/nist/javax/sip/parser/StatusLineParser;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Landroid/gov/nist/javax/sip/parser/StatusLineParser;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/parser/StatusLineParser;->parse()Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public parseSIPUrl(Ljava/lang/String;)Landroid/gov/nist/javax/sip/address/SipUri;
    .locals 1

    .line 1
    :try_start_0
    new-instance p0, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/parser/URLParser;->sipURL(Z)Landroid/gov/nist/javax/sip/address/SipUri;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p0

    .line 12
    :catch_0
    const-string p0, " Not a SIP URL "

    .line 13
    .line 14
    invoke-static {p1, p0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {p1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public parseTelephoneNumber(Ljava/lang/String;)Landroid/gov/nist/javax/sip/address/TelephoneNumber;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/parser/URLParser;->parseTelephoneNumber(Z)Landroid/gov/nist/javax/sip/address/TelephoneNumber;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public parseUrl(Ljava/lang/String;)Landroid/gov/nist/javax/sip/address/GenericURI;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/URLParser;->parse()Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public processFirstLine(Ljava/lang/String;Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;[B)Landroid/gov/nist/javax/sip/message/SIPMessage;
    .locals 10

    .line 1
    const-string p0, "SIP/2.0"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const-string v1, "UTF-8"

    .line 8
    .line 9
    const-string v0, "\n"

    .line 10
    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    new-instance v4, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 14
    .line 15
    invoke-direct {v4}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 16
    .line 17
    .line 18
    :try_start_0
    new-instance p0, Landroid/gov/nist/javax/sip/parser/RequestLineParser;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/parser/RequestLineParser;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/RequestLineParser;->parse()Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v4, p0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestLine(Landroid/gov/nist/javax/sip/header/RequestLine;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :catch_0
    move-exception v0

    .line 37
    move-object p0, v0

    .line 38
    move-object v3, p0

    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    :try_start_1
    const-class v5, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 42
    .line 43
    new-instance v7, Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {v7, p3, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object v6, p1

    .line 49
    move-object v2, p2

    .line 50
    invoke-interface/range {v2 .. v7}, Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;->handleException(Ljava/text/ParseException;Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catch_1
    move-exception v0

    .line 55
    move-object p0, v0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_0
    throw v3

    .line 61
    :cond_1
    move-object v6, p1

    .line 62
    move-object v2, p2

    .line 63
    new-instance p0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 64
    .line 65
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPResponse;-><init>()V

    .line 66
    .line 67
    .line 68
    :try_start_2
    new-instance p1, Landroid/gov/nist/javax/sip/parser/StatusLineParser;

    .line 69
    .line 70
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-direct {p1, p2}, Landroid/gov/nist/javax/sip/parser/StatusLineParser;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/parser/StatusLineParser;->parse()Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->setStatusLine(Landroid/gov/nist/javax/sip/header/StatusLine;)V
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_2

    .line 82
    .line 83
    .line 84
    move-object v6, p0

    .line 85
    goto :goto_2

    .line 86
    :catch_2
    move-exception v0

    .line 87
    move-object p1, v0

    .line 88
    move-object v5, p1

    .line 89
    if-eqz v2, :cond_2

    .line 90
    .line 91
    :try_start_3
    const-class v7, Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 92
    .line 93
    new-instance v9, Ljava/lang/String;

    .line 94
    .line 95
    invoke-direct {v9, p3, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_4

    .line 96
    .line 97
    .line 98
    move-object v4, v2

    .line 99
    move-object v8, v6

    .line 100
    move-object v6, p0

    .line 101
    :try_start_4
    invoke-interface/range {v4 .. v9}, Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;->handleException(Ljava/text/ParseException;Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_3

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :catch_3
    move-exception v0

    .line 106
    :goto_0
    move-object p0, v0

    .line 107
    goto :goto_1

    .line 108
    :catch_4
    move-exception v0

    .line 109
    move-object v6, p0

    .line 110
    goto :goto_0

    .line 111
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 112
    .line 113
    .line 114
    :goto_2
    move-object v4, v6

    .line 115
    :goto_3
    return-object v4

    .line 116
    :cond_2
    throw v5
.end method

.method public processHeader(Ljava/lang/String;Landroid/gov/nist/javax/sip/message/SIPMessage;Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;[B)V
    .locals 7

    .line 1
    const-string p0, "\n"

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Landroid/gov/nist/javax/sip/parser/ParserFactory;->createParser(Ljava/lang/String;)Landroid/gov/nist/javax/sip/parser/HeaderParser;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_2

    .line 20
    :try_start_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->parse()Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p2, p0, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->attachHeader(Landroid/gov/nist/javax/sip/header/SIPHeader;Z)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    move-object p0, v0

    .line 31
    move-object v2, p0

    .line 32
    if-eqz p3, :cond_3

    .line 33
    .line 34
    invoke-static {p1}, Landroid/gov/nist/javax/sip/parser/Lexer;->getHeaderName(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Landroid/gov/nist/javax/sip/header/NameMap;->getClassFromName(Ljava/lang/String;)Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-nez p0, :cond_1

    .line 43
    .line 44
    const-class p0, Landroid/gov/nist/javax/sip/header/ExtensionHeaderImpl;

    .line 45
    .line 46
    :cond_1
    move-object v4, p0

    .line 47
    :try_start_2
    new-instance v6, Ljava/lang/String;

    .line 48
    .line 49
    const-string p0, "UTF-8"

    .line 50
    .line 51
    invoke-direct {v6, p4, p0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object v5, p1

    .line 55
    move-object v3, p2

    .line 56
    move-object v1, p3

    .line 57
    invoke-interface/range {v1 .. v6}, Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;->handleException(Ljava/text/ParseException;Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_1
    move-exception v0

    .line 62
    move-object p0, v0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_2
    move-exception v0

    .line 68
    move-object v5, p1

    .line 69
    move-object v3, p2

    .line 70
    move-object v1, p3

    .line 71
    move-object p0, v0

    .line 72
    move-object v2, p0

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    invoke-interface/range {v1 .. v6}, Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;->handleException(Ljava/text/ParseException;Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    throw v2

    .line 82
    :cond_3
    :goto_0
    return-void
.end method

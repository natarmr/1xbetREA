.class public Landroid/gov/nist/javax/sip/parser/RequestLineParser;
.super Landroid/gov/nist/javax/sip/parser/Parser;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/Parser;-><init>()V

    .line 15
    iput-object p1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 16
    const-string p0, "method_keywordLexer"

    invoke-virtual {p1, p0}, Landroid/gov/nist/core/LexerCore;->selectLexer(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/Parser;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 5
    .line 6
    const-string v1, "method_keywordLexer"

    .line 7
    .line 8
    invoke-direct {v0, v1, p1}, Landroid/gov/nist/javax/sip/parser/Lexer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 12
    .line 13
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v7, "REGISTER sip:[2001:720:1710:0:201:29ff:fe21:f403]:5060;transport=udp SIP/2.0\n"

    .line 2
    .line 3
    const-string v8, "OPTIONS sip:135.180.130.133 SIP/2.0\n"

    .line 4
    .line 5
    const-string v0, "REGISTER sip:192.168.0.68 SIP/2.0\n"

    .line 6
    .line 7
    const-string v1, "REGISTER sip:company.com SIP/2.0\n"

    .line 8
    .line 9
    const-string v2, "INVITE sip:3660@166.35.231.140 SIP/2.0\n"

    .line 10
    .line 11
    const-string v3, "INVITE sip:user@company.com SIP/2.0\n"

    .line 12
    .line 13
    const-string v4, "REGISTER sip:[2001::1]:5060;transport=tcp SIP/2.0\n"

    .line 14
    .line 15
    const-string v5, "REGISTER sip:[2002:800:700:600:30:4:6:1]:5060;transport=udp SIP/2.0\n"

    .line 16
    .line 17
    const-string v6, "REGISTER sip:[3ffe:800:700::30:4:6:1]:5060;transport=tls SIP/2.0\n"

    .line 18
    .line 19
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v0, 0x0

    .line 24
    :goto_0
    const/16 v1, 0x9

    .line 25
    .line 26
    if-ge v0, v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Landroid/gov/nist/javax/sip/parser/RequestLineParser;

    .line 29
    .line 30
    aget-object v2, p0, v0

    .line 31
    .line 32
    invoke-direct {v1, v2}, Landroid/gov/nist/javax/sip/parser/RequestLineParser;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/parser/RequestLineParser;->parse()Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 40
    .line 41
    new-instance v3, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v4, "encoded = "

    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/RequestLine;->encode()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    return-void
.end method


# virtual methods
.method public parse()Landroid/gov/nist/javax/sip/header/RequestLine;
    .locals 5

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "parse"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    new-instance v2, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 11
    .line 12
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/RequestLine;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/Parser;->method()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/header/RequestLine;->setMethod(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 28
    .line 29
    const-string v4, "sip_urlLexer"

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Landroid/gov/nist/core/LexerCore;->selectLexer(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/Parser;->getLexer()Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-direct {v3, v4}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    invoke-virtual {v3, v4}, Landroid/gov/nist/javax/sip/parser/URLParser;->uriReference(Z)Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 49
    .line 50
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/header/RequestLine;->setUri(Landroid/javax/sip/address/URI;)V

    .line 54
    .line 55
    .line 56
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 57
    .line 58
    const-string v4, "request_lineLexer"

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Landroid/gov/nist/core/LexerCore;->selectLexer(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/Parser;->sipVersion()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/header/RequestLine;->setSipVersion(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 71
    .line 72
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 73
    .line 74
    .line 75
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 76
    .line 77
    const/16 v4, 0xa

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    return-object v2

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 90
    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    throw v0
.end method

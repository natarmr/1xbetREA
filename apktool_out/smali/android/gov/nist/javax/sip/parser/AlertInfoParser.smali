.class public Landroid/gov/nist/javax/sip/parser/AlertInfoParser;
.super Landroid/gov/nist/javax/sip/parser/ParametersParser;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/ParametersParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/ParametersParser;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public parse()Landroid/gov/nist/javax/sip/header/SIPHeader;
    .locals 8

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "AlertInfoParser.parse"

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
    new-instance v0, Landroid/gov/nist/javax/sip/header/AlertInfoList;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/AlertInfoList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/16 v2, 0x80d

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->headerName(I)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    move v3, v2

    .line 22
    :goto_0
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 23
    .line 24
    invoke-virtual {v4, v2}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v5, 0xa

    .line 29
    .line 30
    if-eq v4, v5, :cond_3

    .line 31
    .line 32
    const/16 v4, 0x14

    .line 33
    .line 34
    if-ge v3, v4, :cond_3

    .line 35
    .line 36
    :goto_1
    new-instance v4, Landroid/gov/nist/javax/sip/header/AlertInfo;

    .line 37
    .line 38
    invoke-direct {v4}, Landroid/gov/nist/javax/sip/header/AlertInfo;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v5, "Alert-Info"

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Landroid/gov/nist/javax/sip/header/SIPHeader;->setHeaderName(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 47
    .line 48
    invoke-virtual {v5}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 49
    .line 50
    .line 51
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 52
    .line 53
    invoke-virtual {v5, v2}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 54
    .line 55
    .line 56
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    iget-object v6, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 58
    .line 59
    const/16 v7, 0x3c

    .line 60
    .line 61
    if-ne v5, v7, :cond_1

    .line 62
    .line 63
    :try_start_1
    invoke-virtual {v6, v7}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 64
    .line 65
    .line 66
    new-instance v5, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 67
    .line 68
    iget-object v6, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 69
    .line 70
    check-cast v6, Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 71
    .line 72
    invoke-direct {v5, v6}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    .line 73
    .line 74
    .line 75
    const/4 v6, 0x1

    .line 76
    invoke-virtual {v5, v6}, Landroid/gov/nist/javax/sip/parser/URLParser;->uriReference(Z)Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v4, v5}, Landroid/gov/nist/javax/sip/header/AlertInfo;->setAlertInfo(Landroid/javax/sip/address/URI;)V

    .line 81
    .line 82
    .line 83
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 84
    .line 85
    const/16 v6, 0x3e

    .line 86
    .line 87
    invoke-virtual {v5, v6}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    goto :goto_3

    .line 93
    :cond_1
    invoke-virtual {v6}, Landroid/gov/nist/core/LexerCore;->byteStringNoSemicolon()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v4, v5}, Landroid/gov/nist/javax/sip/header/AlertInfo;->setAlertInfo(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_2
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 101
    .line 102
    invoke-virtual {v5}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 103
    .line 104
    .line 105
    invoke-super {p0, v4}, Landroid/gov/nist/javax/sip/parser/ParametersParser;->parse(Landroid/gov/nist/javax/sip/header/ParametersHeader;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v4}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 109
    .line 110
    .line 111
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 112
    .line 113
    invoke-virtual {v4, v2}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    const/16 v5, 0x2c

    .line 118
    .line 119
    if-ne v4, v5, :cond_2

    .line 120
    .line 121
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 122
    .line 123
    invoke-virtual {v4, v5}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 131
    .line 132
    if-eqz v2, :cond_4

    .line 133
    .line 134
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    return-object v0

    .line 138
    :goto_3
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 139
    .line 140
    if-eqz v2, :cond_5

    .line 141
    .line 142
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    throw v0
.end method

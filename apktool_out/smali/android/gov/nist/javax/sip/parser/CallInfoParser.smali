.class public Landroid/gov/nist/javax/sip/parser/CallInfoParser;
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
    .locals 9

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "CallInfoParser.parse"

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
    new-instance v0, Landroid/gov/nist/javax/sip/header/CallInfoList;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/CallInfoList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/16 v2, 0x833

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->headerName(I)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/16 v4, 0xa

    .line 28
    .line 29
    if-eq v2, v4, :cond_2

    .line 30
    .line 31
    new-instance v2, Landroid/gov/nist/javax/sip/header/CallInfo;

    .line 32
    .line 33
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/CallInfo;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v4, "Call-Info"

    .line 37
    .line 38
    invoke-virtual {v2, v4}, Landroid/gov/nist/javax/sip/header/SIPHeader;->setHeaderName(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 42
    .line 43
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 44
    .line 45
    .line 46
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 47
    .line 48
    const/16 v5, 0x3c

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 51
    .line 52
    .line 53
    new-instance v4, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 54
    .line 55
    iget-object v6, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 56
    .line 57
    check-cast v6, Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 58
    .line 59
    invoke-direct {v4, v6}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    .line 60
    .line 61
    .line 62
    const/4 v6, 0x1

    .line 63
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/parser/URLParser;->uriReference(Z)Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v2, v4}, Landroid/gov/nist/javax/sip/header/CallInfo;->setInfo(Landroid/javax/sip/address/URI;)V

    .line 68
    .line 69
    .line 70
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 71
    .line 72
    const/16 v7, 0x3e

    .line 73
    .line 74
    invoke-virtual {v4, v7}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 75
    .line 76
    .line 77
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 78
    .line 79
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 80
    .line 81
    .line 82
    invoke-super {p0, v2}, Landroid/gov/nist/javax/sip/parser/ParametersParser;->parse(Landroid/gov/nist/javax/sip/header/ParametersHeader;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 86
    .line 87
    .line 88
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const/16 v4, 0x2c

    .line 95
    .line 96
    if-ne v2, v4, :cond_1

    .line 97
    .line 98
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 101
    .line 102
    .line 103
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 106
    .line 107
    .line 108
    new-instance v2, Landroid/gov/nist/javax/sip/header/CallInfo;

    .line 109
    .line 110
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/CallInfo;-><init>()V

    .line 111
    .line 112
    .line 113
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 114
    .line 115
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 116
    .line 117
    .line 118
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 119
    .line 120
    invoke-virtual {v4, v5}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 121
    .line 122
    .line 123
    new-instance v4, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 124
    .line 125
    iget-object v8, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 126
    .line 127
    check-cast v8, Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 128
    .line 129
    invoke-direct {v4, v8}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v6}, Landroid/gov/nist/javax/sip/parser/URLParser;->uriReference(Z)Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v2, v4}, Landroid/gov/nist/javax/sip/header/CallInfo;->setInfo(Landroid/javax/sip/address/URI;)V

    .line 137
    .line 138
    .line 139
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 140
    .line 141
    invoke-virtual {v4, v7}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 142
    .line 143
    .line 144
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 145
    .line 146
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 147
    .line 148
    .line 149
    invoke-super {p0, v2}, Landroid/gov/nist/javax/sip/parser/ParametersParser;->parse(Landroid/gov/nist/javax/sip/header/ParametersHeader;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    goto :goto_1

    .line 158
    :cond_2
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 159
    .line 160
    if-eqz v2, :cond_3

    .line 161
    .line 162
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_3
    return-object v0

    .line 166
    :goto_1
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 167
    .line 168
    if-eqz v2, :cond_4

    .line 169
    .line 170
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :cond_4
    throw v0
.end method

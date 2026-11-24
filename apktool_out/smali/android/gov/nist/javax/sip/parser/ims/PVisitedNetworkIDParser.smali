.class public Landroid/gov/nist/javax/sip/parser/ims/PVisitedNetworkIDParser;
.super Landroid/gov/nist/javax/sip/parser/ParametersParser;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/parser/TokenTypes;


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
    .locals 6

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkIDList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkIDList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 7
    .line 8
    const-string v2, "VisitedNetworkIDParser.parse"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 16
    .line 17
    const/16 v3, 0x84b

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 28
    .line 29
    const/16 v3, 0x3a

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 37
    .line 38
    .line 39
    :goto_0
    new-instance v1, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-virtual {v3, v4}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/16 v5, 0x22

    .line 52
    .line 53
    if-ne v3, v5, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/parser/ims/PVisitedNetworkIDParser;->parseQuotedString(Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/parser/ims/PVisitedNetworkIDParser;->parseToken(Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 73
    .line 74
    invoke-virtual {v1, v4}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/16 v3, 0x2c

    .line 79
    .line 80
    if-ne v1, v3, :cond_2

    .line 81
    .line 82
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 83
    .line 84
    invoke-virtual {v1, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    const/16 v3, 0xa

    .line 94
    .line 95
    if-ne v1, v3, :cond_4

    .line 96
    .line 97
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 98
    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    return-object v0

    .line 105
    :cond_4
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v3, "unexpected char = "

    .line 111
    .line 112
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/parser/Parser;->createParseException(Ljava/lang/String;)Ljava/text/ParseException;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    :goto_2
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 128
    .line 129
    if-eqz v1, :cond_5

    .line 130
    .line 131
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    throw v0
.end method

.method public parseQuotedString(Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;)V
    .locals 6

    .line 1
    const-string v0, "parseQuotedString.parse"

    .line 2
    .line 3
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "parseQuotedString"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v3, 0x22

    .line 25
    .line 26
    if-ne v2, v3, :cond_5

    .line 27
    .line 28
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    invoke-virtual {v2, v4}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/gov/nist/core/StringTokenizer;->getNextChar()C

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-ne v2, v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;->setVisitedNetworkID(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/parser/ParametersParser;->parse(Landroid/gov/nist/javax/sip/header/ParametersHeader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    sget-boolean p1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    if-eqz v2, :cond_4

    .line 63
    .line 64
    const/16 v5, 0x5c

    .line 65
    .line 66
    if-ne v2, v5, :cond_3

    .line 67
    .line 68
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/gov/nist/core/StringTokenizer;->getNextChar()C

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    new-instance p1, Ljava/text/ParseException;

    .line 86
    .line 87
    const-string v1, "unexpected EOL"

    .line 88
    .line 89
    invoke-direct {p1, v1, v4}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_5
    const-string p1, "unexpected char"

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/parser/Parser;->createParseException(Ljava/lang/String;)Ljava/text/ParseException;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    :goto_1
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 101
    .line 102
    if-eqz v1, :cond_6

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    throw p1
.end method

.method public parseToken(Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 2
    .line 3
    const/16 v1, 0xfff

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;->setVisitedNetworkID(Landroid/gov/nist/core/Token;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/parser/ParametersParser;->parse(Landroid/gov/nist/javax/sip/header/ParametersHeader;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

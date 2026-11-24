.class public Landroid/gov/nist/javax/sip/parser/ReasonParser;
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
    .locals 6

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/header/ReasonList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/ReasonList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 7
    .line 8
    const-string v2, "ReasonParser.parse"

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
    const/16 v1, 0x83b

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->headerName(I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {v1, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/16 v4, 0xa

    .line 33
    .line 34
    if-eq v1, v4, :cond_2

    .line 35
    .line 36
    new-instance v1, Landroid/gov/nist/javax/sip/header/Reason;

    .line 37
    .line 38
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/Reason;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 42
    .line 43
    const/16 v5, 0xfff

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 46
    .line 47
    .line 48
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 49
    .line 50
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v4}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v1, v4}, Landroid/gov/nist/javax/sip/header/Reason;->setProtocol(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-super {p0, v1}, Landroid/gov/nist/javax/sip/parser/ParametersParser;->parse(Landroid/gov/nist/javax/sip/header/ParametersHeader;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 68
    .line 69
    invoke-virtual {v1, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 70
    .line 71
    .line 72
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 74
    .line 75
    const/16 v4, 0x2c

    .line 76
    .line 77
    if-ne v1, v4, :cond_1

    .line 78
    .line 79
    :try_start_1
    invoke-virtual {v3, v4}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->SPorHT()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 95
    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    return-object v0

    .line 102
    :goto_1
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    throw v0
.end method

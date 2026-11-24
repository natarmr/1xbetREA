.class public Landroid/gov/nist/javax/sip/parser/extensions/ReferencesParser;
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
    .locals 4

    .line 1
    const-string v0, "ReferencesParser.parse"

    .line 2
    .line 3
    sget-boolean v1, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v2, "ReasonParser.parse"

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/16 v2, 0x862

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->headerName(I)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Landroid/gov/nist/javax/sip/header/extensions/References;

    .line 18
    .line 19
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/extensions/References;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->byteStringNoSemicolon()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/header/extensions/References;->setCallId(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-super {p0, v2}, Landroid/gov/nist/javax/sip/parser/ParametersParser;->parse(Landroid/gov/nist/javax/sip/header/ParametersHeader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-object v2

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    throw v1
.end method

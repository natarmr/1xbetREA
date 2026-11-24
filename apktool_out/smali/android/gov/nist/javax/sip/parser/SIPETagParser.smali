.class public Landroid/gov/nist/javax/sip/parser/SIPETagParser;
.super Landroid/gov/nist/javax/sip/parser/HeaderParser;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/HeaderParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/HeaderParser;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public parse()Landroid/gov/nist/javax/sip/header/SIPHeader;
    .locals 5

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "SIPEtag.parse"

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
    new-instance v2, Landroid/gov/nist/javax/sip/header/SIPETag;

    .line 11
    .line 12
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/SIPETag;-><init>()V

    .line 13
    .line 14
    .line 15
    const/16 v3, 0x844

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->headerName(I)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 23
    .line 24
    .line 25
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 26
    .line 27
    const/16 v4, 0xfff

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/header/SIPETag;->setETag(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 51
    .line 52
    const/16 v4, 0xa

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-object v2

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    throw v0
.end method

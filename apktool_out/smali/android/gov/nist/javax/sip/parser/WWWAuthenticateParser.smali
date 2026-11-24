.class public Landroid/gov/nist/javax/sip/parser/WWWAuthenticateParser;
.super Landroid/gov/nist/javax/sip/parser/ChallengeParser;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/ChallengeParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/ChallengeParser;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public parse()Landroid/gov/nist/javax/sip/header/SIPHeader;
    .locals 3

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
    const/16 v2, 0x830

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->headerName(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Landroid/gov/nist/javax/sip/header/WWWAuthenticate;

    .line 16
    .line 17
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/WWWAuthenticate;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-super {p0, v2}, Landroid/gov/nist/javax/sip/parser/ChallengeParser;->parse(Landroid/gov/nist/javax/sip/header/AuthenticationHeader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-object v2

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    throw v0
.end method

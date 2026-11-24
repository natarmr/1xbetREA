.class public Landroid/gov/nist/javax/sip/parser/ims/SecurityServerParser;
.super Landroid/gov/nist/javax/sip/parser/ims/SecurityAgreeParser;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/ims/SecurityAgreeParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/ims/SecurityAgreeParser;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public parse()Landroid/gov/nist/javax/sip/header/SIPHeader;
    .locals 2

    .line 1
    const-string v0, "SecuriryServer parse"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x859

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->headerName(I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, v1}, Landroid/gov/nist/javax/sip/parser/ims/SecurityAgreeParser;->parse(Landroid/gov/nist/javax/sip/header/ims/SecurityAgree;)Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/gov/nist/javax/sip/header/ims/SecurityServerList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v1
.end method

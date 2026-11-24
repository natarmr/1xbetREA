.class public Landroid/gov/nist/javax/sip/parser/ProxyAuthorizationParser;
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
    .locals 1

    .line 1
    const/16 v0, 0x818

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/parser/HeaderParser;->headerName(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/gov/nist/javax/sip/header/ProxyAuthorization;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/ProxyAuthorization;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, v0}, Landroid/gov/nist/javax/sip/parser/ChallengeParser;->parse(Landroid/gov/nist/javax/sip/header/AuthenticationHeader;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

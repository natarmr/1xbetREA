.class public Landroid/gov/nist/javax/sip/header/WWWAuthenticateList;
.super Landroid/gov/nist/javax/sip/header/SIPHeaderList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/gov/nist/javax/sip/header/SIPHeaderList<",
        "Landroid/gov/nist/javax/sip/header/WWWAuthenticate;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x60da0aa6d8ffdfa2L


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/header/WWWAuthenticate;

    .line 2
    .line 3
    const-string v1, "WWW-Authenticate"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/header/WWWAuthenticateList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/WWWAuthenticateList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->hlist:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->clonehlist(Ljava/util/List;)Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

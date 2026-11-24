.class public Landroid/gov/nist/javax/sip/header/WWWAuthenticate;
.super Landroid/gov/nist/javax/sip/header/AuthenticationHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/WWWAuthenticateHeader;
.implements Landroid/gov/nist/javax/sip/header/ims/WWWAuthenticateHeaderIms;


# static fields
.field private static final serialVersionUID:J = 0x199e8450a455c1eL


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "WWW-Authenticate"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/AuthenticationHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getURI()Landroid/javax/sip/address/URI;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public setURI(Landroid/javax/sip/address/URI;)V
    .locals 0

    return-void
.end method

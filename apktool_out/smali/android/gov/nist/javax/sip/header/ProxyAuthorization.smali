.class public Landroid/gov/nist/javax/sip/header/ProxyAuthorization;
.super Landroid/gov/nist/javax/sip/header/AuthenticationHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/ProxyAuthorizationHeader;


# static fields
.field private static final serialVersionUID:J = -0x58786e9fcf4e2b3aL


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Proxy-Authorization"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/AuthenticationHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

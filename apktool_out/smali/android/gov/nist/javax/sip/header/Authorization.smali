.class public Landroid/gov/nist/javax/sip/header/Authorization;
.super Landroid/gov/nist/javax/sip/header/AuthenticationHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/AuthorizationHeader;
.implements Landroid/gov/nist/javax/sip/header/ims/AuthorizationHeaderIms;


# static fields
.field private static final serialVersionUID:J = -0x7b7b3af721670c04L


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Authorization"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/AuthenticationHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

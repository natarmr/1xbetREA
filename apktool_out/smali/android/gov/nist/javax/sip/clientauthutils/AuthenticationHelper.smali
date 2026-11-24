.class public interface abstract Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract handleChallenge(Landroid/javax/sip/message/Response;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/SipProvider;I)Landroid/javax/sip/ClientTransaction;
.end method

.method public abstract handleChallenge(Landroid/javax/sip/message/Response;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/SipProvider;IZ)Landroid/javax/sip/ClientTransaction;
.end method

.method public abstract removeCachedAuthenticationHeaders(Ljava/lang/String;)V
.end method

.method public abstract setAuthenticationHeaders(Landroid/javax/sip/message/Request;)V
.end method

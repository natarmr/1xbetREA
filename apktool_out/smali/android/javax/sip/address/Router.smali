.class public interface abstract Landroid/javax/sip/address/Router;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getNextHop(Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;
.end method

.method public abstract getNextHops(Landroid/javax/sip/message/Request;)Ljava/util/ListIterator;
.end method

.method public abstract getOutboundProxy()Landroid/javax/sip/address/Hop;
.end method

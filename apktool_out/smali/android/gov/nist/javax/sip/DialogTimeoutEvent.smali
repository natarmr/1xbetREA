.class public Landroid/gov/nist/javax/sip/DialogTimeoutEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x22e385bc1cf941b5L


# instance fields
.field private m_dialog:Landroid/javax/sip/Dialog;

.field private m_reInviteTransaction:Landroid/javax/sip/ClientTransaction;

.field private m_reason:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/javax/sip/Dialog;Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;->m_reInviteTransaction:Landroid/javax/sip/ClientTransaction;

    .line 6
    .line 7
    iput-object p2, p0, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;->m_dialog:Landroid/javax/sip/Dialog;

    .line 8
    .line 9
    iput-object p3, p0, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;->m_reason:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getClientTransaction()Landroid/javax/sip/ClientTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;->m_reInviteTransaction:Landroid/javax/sip/ClientTransaction;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDialog()Landroid/javax/sip/Dialog;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;->m_dialog:Landroid/javax/sip/Dialog;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReason()Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;->m_reason:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 2
    .line 3
    return-object p0
.end method

.method public setClientTransaction(Landroid/javax/sip/ClientTransaction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/DialogTimeoutEvent;->m_reInviteTransaction:Landroid/javax/sip/ClientTransaction;

    .line 2
    .line 3
    return-void
.end method

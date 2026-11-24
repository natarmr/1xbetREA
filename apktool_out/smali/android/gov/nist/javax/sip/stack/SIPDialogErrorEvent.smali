.class public Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# static fields
.field public static final DIALOG_ACK_NOT_RECEIVED_TIMEOUT:I = 0x1

.field public static final DIALOG_ACK_NOT_SENT_TIMEOUT:I = 0x2

.field public static final DIALOG_ERROR_INTERNAL_COULD_NOT_TAKE_ACK_SEM:I = 0x5

.field public static final DIALOG_REINVITE_TIMEOUT:I = 0x3

.field public static final EARLY_STATE_TIMEOUT:I = 0x4


# instance fields
.field private clientTransaction:Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

.field private errorID:I


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 45
    iput p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->errorID:I

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;->AckNotReceived:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 5
    .line 6
    if-ne p2, p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->errorID:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p1, Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;->AckNotSent:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 13
    .line 14
    if-ne p2, p1, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->errorID:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    sget-object p1, Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;->ReInviteTimeout:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 21
    .line 22
    if-ne p2, p1, :cond_2

    .line 23
    .line 24
    const/4 p1, 0x3

    .line 25
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->errorID:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    sget-object p1, Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;->CannotAcquireAckSemaphoreForOk:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 29
    .line 30
    if-ne p2, p1, :cond_3

    .line 31
    .line 32
    const/4 p1, 0x5

    .line 33
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->errorID:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_3
    sget-object p1, Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;->EarlyStateTimeout:Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;

    .line 37
    .line 38
    if-ne p2, p1, :cond_4

    .line 39
    .line 40
    const/4 p1, 0x4

    .line 41
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->errorID:I

    .line 42
    .line 43
    :cond_4
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p3}, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;-><init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/DialogTimeoutEvent$Reason;)V

    .line 47
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->clientTransaction:Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    return-void
.end method


# virtual methods
.method public getClientTransaction()Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->clientTransaction:Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 2
    .line 3
    return-object p0
.end method

.method public getErrorID()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->errorID:I

    .line 2
    .line 3
    return p0
.end method

.method public setClientTransaction(Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialogErrorEvent;->clientTransaction:Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 2
    .line 3
    return-void
.end method

.class public Landroid/javax/sip/ResponseEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# instance fields
.field private m_dialog:Landroid/javax/sip/Dialog;

.field private m_response:Landroid/javax/sip/message/Response;

.field private m_transaction:Landroid/javax/sip/ClientTransaction;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Response;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Landroid/javax/sip/ResponseEvent;->m_response:Landroid/javax/sip/message/Response;

    .line 5
    .line 6
    iput-object p2, p0, Landroid/javax/sip/ResponseEvent;->m_transaction:Landroid/javax/sip/ClientTransaction;

    .line 7
    .line 8
    iput-object p3, p0, Landroid/javax/sip/ResponseEvent;->m_dialog:Landroid/javax/sip/Dialog;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getClientTransaction()Landroid/javax/sip/ClientTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/ResponseEvent;->m_transaction:Landroid/javax/sip/ClientTransaction;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDialog()Landroid/javax/sip/Dialog;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/ResponseEvent;->m_dialog:Landroid/javax/sip/Dialog;

    .line 2
    .line 3
    return-object p0
.end method

.method public getResponse()Landroid/javax/sip/message/Response;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/ResponseEvent;->m_response:Landroid/javax/sip/message/Response;

    .line 2
    .line 3
    return-object p0
.end method

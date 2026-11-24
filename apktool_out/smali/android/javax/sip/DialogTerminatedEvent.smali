.class public Landroid/javax/sip/DialogTerminatedEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# instance fields
.field private m_dialog:Landroid/javax/sip/Dialog;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/javax/sip/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroid/javax/sip/DialogTerminatedEvent;->m_dialog:Landroid/javax/sip/Dialog;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getDialog()Landroid/javax/sip/Dialog;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/DialogTerminatedEvent;->m_dialog:Landroid/javax/sip/Dialog;

    .line 2
    .line 3
    return-object p0
.end method

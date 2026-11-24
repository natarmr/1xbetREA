.class public Landroid/gov/nist/javax/sip/stack/DatagramQueuedMessageDispatch;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/QueuedMessageDispatchBase;


# instance fields
.field public packet:Ljava/net/DatagramPacket;

.field time:J


# direct methods
.method public constructor <init>(Ljava/net/DatagramPacket;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Landroid/gov/nist/javax/sip/stack/DatagramQueuedMessageDispatch;->time:J

    .line 5
    .line 6
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/DatagramQueuedMessageDispatch;->packet:Ljava/net/DatagramPacket;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getReceptionTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/DatagramQueuedMessageDispatch;->time:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public run()V
    .locals 0

    return-void
.end method

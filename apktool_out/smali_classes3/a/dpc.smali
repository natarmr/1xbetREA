.class public final La/dpc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/chf0;


# direct methods
.method public synthetic constructor <init>(La/chf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dpc;->a:La/chf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object p0, p0, La/dpc;->a:La/chf0;

    .line 2
    .line 3
    iget-object v0, p0, La/chf0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/zte0;

    .line 6
    .line 7
    iget-object v0, v0, La/zte0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/chf0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/rpx;

    .line 16
    .line 17
    iget-object p0, p0, La/rpx;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

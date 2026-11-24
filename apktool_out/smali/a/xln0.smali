.class public final synthetic La/xln0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cmn0;


# direct methods
.method public synthetic constructor <init>(La/cmn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xln0;->a:B

    iput-object p1, p0, La/xln0;->b:La/cmn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/xln0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xln0;->b:La/cmn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, La/cmn0;->n:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, La/cmn0;->d()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, La/xln0;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, p0, v2}, La/xln0;-><init>(La/cmn0;B)V

    .line 24
    .line 25
    .line 26
    check-cast v0, La/lmv;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/lmv;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

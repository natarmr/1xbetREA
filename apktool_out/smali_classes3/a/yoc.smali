.class public final La/yoc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/yoc;->a:La/pbt;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/yoc;->a:La/pbt;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/yoc;->a:La/pbt;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/yoc;->a:La/pbt;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()J
    .locals 6

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    sget-object v1, La/bfn;->f:La/bfn;

    .line 5
    .line 6
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, La/wen;->e(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iget-object p0, p0, La/yoc;->a:La/pbt;

    .line 19
    .line 20
    iget-object p0, p0, La/pbt;->c:La/g7d;

    .line 21
    .line 22
    iget-wide v4, p0, La/g7d;->d:J

    .line 23
    .line 24
    sub-long/2addr v2, v4

    .line 25
    sub-long/2addr v0, v2

    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    return-wide v0
.end method

.method public b(Ljava/util/List;La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/yoc;->a:La/pbt;

    .line 2
    .line 3
    iget-object v0, p0, La/pbt;->m:La/mne;

    .line 4
    .line 5
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 6
    .line 7
    new-instance v1, La/fbt;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-direct {v1, p0, p1, v2, v3}, La/fbt;-><init>(La/pbt;Ljava/util/List;La/yje;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1, p2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

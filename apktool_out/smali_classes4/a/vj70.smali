.class public final synthetic La/vj70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yj70;


# direct methods
.method public synthetic constructor <init>(La/yj70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vj70;->a:B

    iput-object p1, p0, La/vj70;->b:La/yj70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/vj70;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/vj70;->b:La/yj70;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/yj70;->O1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, La/yj70;->H0()La/jk70;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v2, La/gk70;

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x2

    .line 23
    const/4 v3, 0x1

    .line 24
    const-class v5, La/jk70;

    .line 25
    .line 26
    const-string v6, "handleGameError"

    .line 27
    .line 28
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 29
    .line 30
    invoke-direct/range {v2 .. v9}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v4, La/jk70;->e:La/mne;

    .line 34
    .line 35
    iget-object v8, v0, La/mne;->b:La/dvj;

    .line 36
    .line 37
    new-instance v9, La/ek70;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {v9, v4, v1, v0}, La/ek70;-><init>(La/jk70;La/yje;B)V

    .line 41
    .line 42
    .line 43
    const/16 v10, 0xa

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    move-object v5, p0

    .line 47
    move-object v6, v2

    .line 48
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_0
    sget-object v0, La/yj70;->O1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/ry3;

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object p0, p0, La/yj70;->L1:La/ofi;

    .line 63
    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_0
    const-string p0, "oneXGameEndGameViewModelFactory"

    .line 71
    .line 72
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

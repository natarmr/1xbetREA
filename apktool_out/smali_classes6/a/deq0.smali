.class public final synthetic La/deq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/geq0;


# direct methods
.method public synthetic constructor <init>(La/geq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/deq0;->a:B

    iput-object p1, p0, La/deq0;->b:La/geq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/deq0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/deq0;->b:La/geq0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/geq0;->O1:[La/iiy;

    .line 10
    .line 11
    iget-object p0, p0, La/geq0;->M1:La/kiu0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    move-object v4, p0

    .line 18
    check-cast v4, La/oeq0;

    .line 19
    .line 20
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v2, La/w6q0;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x4

    .line 28
    const/4 v3, 0x1

    .line 29
    const-class v5, La/oeq0;

    .line 30
    .line 31
    const-string v6, "handleGameError"

    .line 32
    .line 33
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 34
    .line 35
    invoke-direct/range {v2 .. v9}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v4, La/oeq0;->e:La/mne;

    .line 39
    .line 40
    iget-object v8, v0, La/mne;->b:La/dvj;

    .line 41
    .line 42
    new-instance v9, La/keq0;

    .line 43
    .line 44
    const/4 v0, 0x2

    .line 45
    invoke-direct {v9, v4, v1, v0}, La/keq0;-><init>(La/oeq0;La/yje;B)V

    .line 46
    .line 47
    .line 48
    const/16 v10, 0xa

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    move-object v5, p0

    .line 52
    move-object v6, v2

    .line 53
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    sget-object v0, La/geq0;->O1:[La/iiy;

    .line 60
    .line 61
    new-instance v0, La/ry3;

    .line 62
    .line 63
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget-object p0, p0, La/geq0;->L1:La/fxi;

    .line 68
    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_0
    const-string p0, "tileMatchingGameEndGameViewModelFactory"

    .line 76
    .line 77
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

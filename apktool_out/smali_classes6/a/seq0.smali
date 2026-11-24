.class public final synthetic La/seq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/weq0;


# direct methods
.method public synthetic constructor <init>(La/weq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/seq0;->a:B

    iput-object p1, p0, La/seq0;->b:La/weq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/seq0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/seq0;->b:La/weq0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/weq0;->Q1:La/s9m0;

    .line 10
    .line 11
    new-instance v0, La/ueq0;

    .line 12
    .line 13
    invoke-direct {v0, p0}, La/ueq0;-><init>(La/weq0;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    sget-object v0, La/weq0;->Q1:La/s9m0;

    .line 18
    .line 19
    new-instance v0, La/ry3;

    .line 20
    .line 21
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object p0, p0, La/weq0;->L1:La/exi;

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    const-string p0, "tileMatchingGameViewModelFactory"

    .line 34
    .line 35
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :pswitch_1
    sget-object v0, La/weq0;->Q1:La/s9m0;

    .line 40
    .line 41
    invoke-virtual {p0}, La/weq0;->J0()La/wfq0;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget-object p0, v4, La/wfq0;->q:La/mne;

    .line 50
    .line 51
    iget-object v8, p0, La/mne;->a:La/rwj;

    .line 52
    .line 53
    sget-object v6, La/sfq0;->a:La/sfq0;

    .line 54
    .line 55
    new-instance v9, La/meq0;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    sget-object v2, La/dy5;->a:La/dy5;

    .line 59
    .line 60
    invoke-direct {v9, v4, v2, v1, v0}, La/meq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    const/16 v10, 0xa

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, La/wfq0;->x()V

    .line 70
    .line 71
    .line 72
    iget-object v0, v4, La/wfq0;->k:La/jru;

    .line 73
    .line 74
    iget-object v0, v0, La/jru;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, La/kgq0;

    .line 77
    .line 78
    iget-object v0, v0, La/kgq0;->c:La/beq0;

    .line 79
    .line 80
    iget-object v0, v0, La/beq0;->a:La/xfq0;

    .line 81
    .line 82
    iget-object v0, v0, La/xfq0;->c:La/yeq0;

    .line 83
    .line 84
    sget-object v2, La/yeq0;->a:La/yeq0;

    .line 85
    .line 86
    if-ne v0, v2, :cond_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v2, La/w6q0;

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    const/4 v9, 0x7

    .line 97
    const/4 v3, 0x1

    .line 98
    const-class v5, La/wfq0;

    .line 99
    .line 100
    const-string v6, "handleGameError"

    .line 101
    .line 102
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 103
    .line 104
    invoke-direct/range {v2 .. v9}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 105
    .line 106
    .line 107
    iget-object v8, p0, La/mne;->a:La/rwj;

    .line 108
    .line 109
    new-instance v9, La/tfq0;

    .line 110
    .line 111
    const/4 p0, 0x0

    .line 112
    invoke-direct {v9, v4, v1, p0}, La/tfq0;-><init>(La/wfq0;La/yje;B)V

    .line 113
    .line 114
    .line 115
    const/16 v10, 0xa

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    move-object v5, v0

    .line 119
    move-object v6, v2

    .line 120
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 121
    .line 122
    .line 123
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

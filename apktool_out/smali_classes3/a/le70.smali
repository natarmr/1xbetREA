.class public final synthetic La/le70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oe70;


# direct methods
.method public synthetic constructor <init>(La/oe70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/le70;->a:B

    iput-object p1, p0, La/le70;->b:La/oe70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/le70;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/le70;->b:La/oe70;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, La/oe70;->H0()La/qf70;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, La/qf70;->D()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 22
    .line 23
    invoke-virtual {p0}, La/oe70;->H0()La/qf70;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object v0, p0, La/qf70;->M:La/p7m0;

    .line 28
    .line 29
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La/qf70;->L:La/p7m0;

    .line 38
    .line 39
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 51
    .line 52
    invoke-virtual {p0}, La/oe70;->H0()La/qf70;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, La/qf70;->C()V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_2
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 63
    .line 64
    invoke-virtual {p0}, La/oe70;->H0()La/qf70;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, La/qf70;->C()V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_3
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 75
    .line 76
    invoke-virtual {p0}, La/oe70;->H0()La/qf70;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance v2, La/cf70;

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x6

    .line 88
    const/4 v3, 0x1

    .line 89
    const-class v5, La/qf70;

    .line 90
    .line 91
    const-string v6, "handleGameError"

    .line 92
    .line 93
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 94
    .line 95
    invoke-direct/range {v2 .. v9}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v4, La/qf70;->v:La/mne;

    .line 99
    .line 100
    iget-object v8, v0, La/mne;->b:La/dvj;

    .line 101
    .line 102
    new-instance v9, La/kf70;

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-direct {v9, v4, v1, v0}, La/kf70;-><init>(La/qf70;La/yje;B)V

    .line 106
    .line 107
    .line 108
    const/16 v10, 0xa

    .line 109
    .line 110
    const/4 v7, 0x0

    .line 111
    move-object v5, p0

    .line 112
    move-object v6, v2

    .line 113
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_4
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 120
    .line 121
    new-instance v0, La/ry3;

    .line 122
    .line 123
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object p0, p0, La/oe70;->L1:La/u6i;

    .line 128
    .line 129
    if-eqz p0, :cond_0

    .line 130
    .line 131
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_0
    const-string p0, "mainGameViewModelFactory"

    .line 136
    .line 137
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v1

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

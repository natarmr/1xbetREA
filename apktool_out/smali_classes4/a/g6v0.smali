.class public final synthetic La/g6v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l6v0;


# direct methods
.method public synthetic constructor <init>(La/l6v0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g6v0;->a:B

    iput-object p1, p0, La/g6v0;->b:La/l6v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/g6v0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/g6v0;->b:La/l6v0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/l6v0;->P1:La/sxs0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/l6v0;->H0()La/d7v0;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object p0, La/s470;->p:La/s470;

    .line 15
    .line 16
    invoke-virtual {p0}, La/s470;->a()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object v0, v2, La/d7v0;->e:La/mne;

    .line 25
    .line 26
    iget-object v8, v0, La/mne;->b:La/dvj;

    .line 27
    .line 28
    new-instance v0, La/q6v0;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {v0, v2, v1}, La/q6v0;-><init>(La/d7v0;B)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/wn10;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/16 v6, 0x18

    .line 38
    .line 39
    invoke-direct/range {v1 .. v6}, La/wn10;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 40
    .line 41
    .line 42
    const/16 v10, 0xa

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v5, p0

    .line 46
    move-object v6, v0

    .line 47
    move-object v9, v1

    .line 48
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 49
    .line 50
    .line 51
    iget-object p0, v2, La/d7v0;->b:La/i1w0;

    .line 52
    .line 53
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v1, v2, La/d7v0;->d:La/uf3;

    .line 58
    .line 59
    iget-object v1, v1, La/uf3;->a:La/oct;

    .line 60
    .line 61
    invoke-virtual {v1}, La/oct;->e()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    instance-of v2, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 66
    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    new-instance v2, La/e1w0;

    .line 70
    .line 71
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 72
    .line 73
    invoke-direct {v2, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 74
    .line 75
    .line 76
    new-instance v1, La/c8d;

    .line 77
    .line 78
    sget-object v3, La/y7d;->a:La/v7d;

    .line 79
    .line 80
    invoke-direct {v1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    new-instance v2, La/w0w0;

    .line 88
    .line 89
    invoke-direct {v2, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 90
    .line 91
    .line 92
    new-instance v1, La/c8d;

    .line 93
    .line 94
    sget-object v3, La/y7d;->a:La/v7d;

    .line 95
    .line 96
    invoke-direct {v1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :goto_0
    const/4 v1, 0x0

    .line 103
    invoke-static {p0, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_1
    move-object v1, v0

    .line 108
    check-cast v1, La/paw;

    .line 109
    .line 110
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_1

    .line 115
    .line 116
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, La/oe50;

    .line 121
    .line 122
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_0
    sget-object v0, La/l6v0;->P1:La/sxs0;

    .line 130
    .line 131
    invoke-virtual {p0}, La/l6v0;->H0()La/d7v0;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0}, La/d7v0;->x()V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_1
    sget-object v0, La/l6v0;->P1:La/sxs0;

    .line 142
    .line 143
    new-instance v0, La/ry3;

    .line 144
    .line 145
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object p0, p0, La/l6v0;->M1:La/mzi;

    .line 150
    .line 151
    if-eqz p0, :cond_2

    .line 152
    .line 153
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_2
    const-string p0, "weeklyRewardViewModelFactory"

    .line 158
    .line 159
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const/4 p0, 0x0

    .line 163
    throw p0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La/bm10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fm10;


# direct methods
.method public synthetic constructor <init>(La/fm10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bm10;->a:B

    iput-object p1, p0, La/bm10;->b:La/fm10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/bm10;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/bm10;->b:La/fm10;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    iget-object p0, v4, La/bo10;->D:La/p7m0;

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object p0, v4, La/bo10;->E:La/p7m0;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object p0, v4, La/bo10;->I:La/sxk0;

    .line 34
    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v2, v4, La/bo10;->d:La/mne;

    .line 42
    .line 43
    iget-object v10, v2, La/mne;->b:La/dvj;

    .line 44
    .line 45
    new-instance v2, La/pf10;

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    const/16 v9, 0xe

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    const-class v5, La/bo10;

    .line 52
    .line 53
    const-string v6, "handleGameError"

    .line 54
    .line 55
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 56
    .line 57
    invoke-direct/range {v2 .. v9}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 58
    .line 59
    .line 60
    new-instance v9, La/d21;

    .line 61
    .line 62
    const/16 v3, 0x8

    .line 63
    .line 64
    invoke-direct {v9, p0, v4, v1, v3}, La/d21;-><init>(La/sxk0;La/diu0;La/yje;B)V

    .line 65
    .line 66
    .line 67
    move-object v8, v10

    .line 68
    const/16 v10, 0xa

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    move-object v5, v0

    .line 72
    move-object v6, v2

    .line 73
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 74
    .line 75
    .line 76
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_0
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 80
    .line 81
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    iget-object p0, v4, La/bo10;->D:La/p7m0;

    .line 86
    .line 87
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    iget-object p0, v4, La/bo10;->E:La/p7m0;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    iget-object p0, v4, La/bo10;->H:La/x9v0;

    .line 104
    .line 105
    if-eqz p0, :cond_1

    .line 106
    .line 107
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v2, v4, La/bo10;->d:La/mne;

    .line 112
    .line 113
    iget-object v10, v2, La/mne;->b:La/dvj;

    .line 114
    .line 115
    new-instance v2, La/pf10;

    .line 116
    .line 117
    const/4 v8, 0x0

    .line 118
    const/16 v9, 0xf

    .line 119
    .line 120
    const/4 v3, 0x1

    .line 121
    const-class v5, La/bo10;

    .line 122
    .line 123
    const-string v6, "handleGameError"

    .line 124
    .line 125
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 126
    .line 127
    invoke-direct/range {v2 .. v9}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 128
    .line 129
    .line 130
    new-instance v9, La/gd7;

    .line 131
    .line 132
    const/4 v3, 0x2

    .line 133
    invoke-direct {v9, p0, v4, v1, v3}, La/gd7;-><init>(La/x9v0;La/diu0;La/yje;B)V

    .line 134
    .line 135
    .line 136
    move-object v8, v10

    .line 137
    const/16 v10, 0xa

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    move-object v5, v0

    .line 141
    move-object v6, v2

    .line 142
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 143
    .line 144
    .line 145
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_1
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 149
    .line 150
    new-instance v0, La/dyb0;

    .line 151
    .line 152
    new-instance v1, La/pf10;

    .line 153
    .line 154
    invoke-virtual {p0}, La/fm10;->H0()La/bo10;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    const/4 v7, 0x0

    .line 159
    const/16 v8, 0x8

    .line 160
    .line 161
    const/4 v2, 0x1

    .line 162
    const-class v4, La/bo10;

    .line 163
    .line 164
    const-string v5, "onPrizeClicked"

    .line 165
    .line 166
    const-string v6, "onPrizeClicked(Lorg/xplatform/lucky_wheel/presentation/game/prizes/PrizeListItem$Prize;)V"

    .line 167
    .line 168
    invoke-direct/range {v1 .. v8}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 169
    .line 170
    .line 171
    invoke-direct {v0, v1}, La/dyb0;-><init>(La/pf10;)V

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_2
    sget-object v0, La/fm10;->S1:[La/iiy;

    .line 176
    .line 177
    new-instance v0, La/ry3;

    .line 178
    .line 179
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    iget-object p0, p0, La/fm10;->L1:La/nki;

    .line 184
    .line 185
    if-eqz p0, :cond_2

    .line 186
    .line 187
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 188
    .line 189
    .line 190
    return-object v0

    .line 191
    :cond_2
    const-string p0, "hotDiceModelFactory"

    .line 192
    .line 193
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v1

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La/ytn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bun0;


# direct methods
.method public synthetic constructor <init>(La/bun0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ytn0;->a:B

    iput-object p1, p0, La/ytn0;->b:La/bun0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ytn0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v0, v0, La/ytn0;->b:La/bun0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, La/pun0;->j:La/epi0;

    .line 18
    .line 19
    iget-object v3, v0, La/pun0;->v:La/xae0;

    .line 20
    .line 21
    iget-object v4, v3, La/xae0;->a:La/n7m0;

    .line 22
    .line 23
    invoke-interface {v4}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 28
    .line 29
    iget-object v4, v4, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 30
    .line 31
    iget-wide v4, v4, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->b:D

    .line 32
    .line 33
    iget-object v3, v3, La/xae0;->a:La/n7m0;

    .line 34
    .line 35
    invoke-interface {v3}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 40
    .line 41
    iget-wide v6, v6, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->a:J

    .line 42
    .line 43
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, La/dpi0;

    .line 46
    .line 47
    iget-object v1, v1, La/dpi0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, La/xxn0;

    .line 50
    .line 51
    iget-object v1, v1, La/xxn0;->a:La/p7m0;

    .line 52
    .line 53
    new-instance v8, La/jsn0;

    .line 54
    .line 55
    invoke-direct {v8, v4, v5, v6, v7}, La/jsn0;-><init>(DJ)V

    .line 56
    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual {v1, v4, v8}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    iget-object v1, v0, La/pun0;->p:La/s31;

    .line 63
    .line 64
    invoke-interface {v3}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 69
    .line 70
    iget-object v5, v5, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 71
    .line 72
    iget-wide v5, v5, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->b:D

    .line 73
    .line 74
    iget-object v1, v1, La/s31;->a:La/kt2;

    .line 75
    .line 76
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    new-instance v6, Lkotlin/Pair;

    .line 81
    .line 82
    const-string v7, "option"

    .line 83
    .line 84
    invoke-direct {v6, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v6}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const-string v6, "swipex_change_bet_call"

    .line 92
    .line 93
    invoke-interface {v1, v6, v5}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 94
    .line 95
    .line 96
    iget-object v1, v0, La/pun0;->s:La/e41;

    .line 97
    .line 98
    invoke-interface {v3}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 103
    .line 104
    iget-object v3, v3, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 105
    .line 106
    iget-wide v5, v3, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->b:D

    .line 107
    .line 108
    iget-object v1, v1, La/e41;->a:La/s1p;

    .line 109
    .line 110
    new-instance v3, La/h1p;

    .line 111
    .line 112
    double-to-float v5, v5

    .line 113
    const/4 v6, 0x0

    .line 114
    invoke-direct {v3, v5, v6}, La/h1p;-><init>(FB)V

    .line 115
    .line 116
    .line 117
    invoke-static {v3}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-wide/16 v5, 0xc35

    .line 122
    .line 123
    invoke-virtual {v1, v3, v5, v6}, La/s1p;->a(Ljava/util/Set;J)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    iget-object v1, v0, La/pun0;->d:La/mne;

    .line 131
    .line 132
    iget-object v10, v1, La/mne;->a:La/rwj;

    .line 133
    .line 134
    new-instance v8, La/ndn0;

    .line 135
    .line 136
    iget-object v13, v0, La/pun0;->e:La/duj;

    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    const/16 v18, 0x12

    .line 141
    .line 142
    const/4 v12, 0x1

    .line 143
    const-class v14, La/duj;

    .line 144
    .line 145
    const-string v15, "handleError"

    .line 146
    .line 147
    const-string v16, "handleError(Ljava/lang/Throwable;)V"

    .line 148
    .line 149
    move-object v11, v8

    .line 150
    invoke-direct/range {v11 .. v18}, La/ndn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 151
    .line 152
    .line 153
    new-instance v11, La/oun0;

    .line 154
    .line 155
    invoke-direct {v11, v0, v4, v2}, La/oun0;-><init>(La/pun0;La/yje;B)V

    .line 156
    .line 157
    .line 158
    const/16 v12, 0xa

    .line 159
    .line 160
    const/4 v9, 0x0

    .line 161
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_0
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 166
    .line 167
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const/16 v1, 0xa

    .line 172
    .line 173
    invoke-virtual {v0, v1}, La/pun0;->x(I)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_1
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 178
    .line 179
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const/4 v1, 0x5

    .line 184
    invoke-virtual {v0, v1}, La/pun0;->x(I)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_2
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 189
    .line 190
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const/4 v1, 0x2

    .line 195
    invoke-virtual {v0, v1}, La/pun0;->x(I)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_3
    sget-object v1, La/bun0;->g2:La/s2m0;

    .line 200
    .line 201
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0, v2}, La/pun0;->x(I)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

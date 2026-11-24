.class public final synthetic La/e630;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i630;


# direct methods
.method public synthetic constructor <init>(La/i630;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/e630;->a:B

    iput-object p1, p0, La/e630;->b:La/i630;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e630;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/e630;->b:La/i630;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/i630;->k2:La/evz;

    .line 12
    .line 13
    invoke-virtual {v0}, La/i630;->T0()La/f730;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v4, La/du20;

    .line 22
    .line 23
    iget-object v6, v0, La/f730;->j:La/duj;

    .line 24
    .line 25
    const/4 v10, 0x0

    .line 26
    const/16 v11, 0x12

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    const-class v7, La/duj;

    .line 30
    .line 31
    const-string v8, "handleError"

    .line 32
    .line 33
    const-string v9, "handleError(Ljava/lang/Throwable;)V"

    .line 34
    .line 35
    invoke-direct/range {v4 .. v11}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    new-instance v7, La/b730;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-direct {v7, v0, v2, v1}, La/b730;-><init>(La/f730;La/yje;B)V

    .line 42
    .line 43
    .line 44
    const/16 v8, 0xe

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 49
    .line 50
    .line 51
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_0
    sget-object v1, La/i630;->k2:La/evz;

    .line 55
    .line 56
    new-instance v2, La/u530;

    .line 57
    .line 58
    new-instance v3, La/f630;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-direct {v3, v0, v1}, La/f630;-><init>(La/i630;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/du20;

    .line 65
    .line 66
    invoke-virtual {v0}, La/i630;->T0()La/f730;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const/4 v10, 0x0

    .line 71
    const/16 v11, 0x8

    .line 72
    .line 73
    const/4 v5, 0x1

    .line 74
    const-class v15, La/f730;

    .line 75
    .line 76
    const-string v8, "onActionClicked"

    .line 77
    .line 78
    const-string v9, "onActionClicked(Lorg/xplatform/cyber/game/core/betting/presentation/markets/model/SettingActionType;)V"

    .line 79
    .line 80
    move-object v7, v15

    .line 81
    invoke-direct/range {v4 .. v11}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 82
    .line 83
    .line 84
    new-instance v5, La/du20;

    .line 85
    .line 86
    invoke-virtual {v0}, La/i630;->T0()La/f730;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    const/16 v18, 0x0

    .line 91
    .line 92
    const/16 v19, 0x9

    .line 93
    .line 94
    const/4 v13, 0x1

    .line 95
    const-string v16, "onMarketClicked"

    .line 96
    .line 97
    const-string v17, "onMarketClicked(Lorg/xplatform/cyber/game/core/betting/presentation/markets/model/MarketSettingUiModel;)V"

    .line 98
    .line 99
    move-object v12, v5

    .line 100
    invoke-direct/range {v12 .. v19}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 101
    .line 102
    .line 103
    new-instance v6, La/e000;

    .line 104
    .line 105
    invoke-virtual {v0}, La/i630;->T0()La/f730;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    const/16 v19, 0x15

    .line 110
    .line 111
    const/4 v13, 0x2

    .line 112
    const-string v16, "onItemMoved"

    .line 113
    .line 114
    const-string v17, "onItemMoved(II)V"

    .line 115
    .line 116
    move-object v12, v6

    .line 117
    invoke-direct/range {v12 .. v19}, La/e000;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 118
    .line 119
    .line 120
    new-instance v7, La/o0t;

    .line 121
    .line 122
    invoke-virtual {v0}, La/i630;->T0()La/f730;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    const/16 v19, 0x16

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const-string v16, "onMarketsPositionChanged"

    .line 130
    .line 131
    const-string v17, "onMarketsPositionChanged()V"

    .line 132
    .line 133
    move-object v12, v7

    .line 134
    invoke-direct/range {v12 .. v19}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 135
    .line 136
    .line 137
    invoke-direct/range {v2 .. v7}, La/u530;-><init>(La/f630;La/du20;La/du20;La/e000;La/o0t;)V

    .line 138
    .line 139
    .line 140
    return-object v2

    .line 141
    :pswitch_1
    sget-object v1, La/i630;->k2:La/evz;

    .line 142
    .line 143
    new-instance v1, La/xx6;

    .line 144
    .line 145
    iget-object v0, v0, La/i630;->j2:La/a8z;

    .line 146
    .line 147
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, La/u530;

    .line 152
    .line 153
    invoke-direct {v1, v0}, La/xx6;-><init>(La/u530;)V

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :pswitch_2
    sget-object v1, La/i630;->k2:La/evz;

    .line 158
    .line 159
    iget-object v0, v0, La/i630;->c2:La/fiu0;

    .line 160
    .line 161
    if-eqz v0, :cond_0

    .line 162
    .line 163
    return-object v0

    .line 164
    :cond_0
    const-string v0, "viewModelFactory"

    .line 165
    .line 166
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v2

    .line 170
    :pswitch_3
    sget-object v1, La/i630;->k2:La/evz;

    .line 171
    .line 172
    invoke-virtual {v0}, La/i630;->T0()La/f730;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, La/f730;->w()V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object v0

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

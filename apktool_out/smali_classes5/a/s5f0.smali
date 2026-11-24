.class public final La/s5f0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/x5f0;


# direct methods
.method public synthetic constructor <init>(La/x5f0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/s5f0;->i:B

    iput-object p1, p0, La/s5f0;->k:La/x5f0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/s5f0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/s5f0;->k:La/x5f0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/s5f0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/s5f0;-><init>(La/x5f0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/s5f0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/s5f0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/s5f0;-><init>(La/x5f0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/s5f0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/s5f0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/s5f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/s5f0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/s5f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/q7f0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/s5f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/s5f0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/s5f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/s5f0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, v0, La/s5f0;->k:La/x5f0;

    .line 9
    .line 10
    iget-object v0, v0, La/s5f0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, La/vne;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v5, La/x5f0;->x0:La/p7m0;

    .line 23
    .line 24
    new-instance v6, La/i89;

    .line 25
    .line 26
    const/16 v7, 0x16

    .line 27
    .line 28
    invoke-direct {v6, v1, v7}, La/i89;-><init>(La/gmq;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v6}, La/i120;->W(La/gmq;)La/gmq;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v6, La/s5f0;

    .line 36
    .line 37
    invoke-direct {v6, v5, v4, v3}, La/s5f0;-><init>(La/x5f0;La/yje;B)V

    .line 38
    .line 39
    .line 40
    new-instance v3, La/fnq;

    .line 41
    .line 42
    invoke-direct {v3, v1, v6, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    check-cast v0, La/q7f0;

    .line 52
    .line 53
    sget-object v1, La/wne;->a:La/wne;

    .line 54
    .line 55
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v5, La/x5f0;->y0:La/g090;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v6, v1, La/g090;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v6, La/y4f0;

    .line 69
    .line 70
    new-instance v7, La/xwe0;

    .line 71
    .line 72
    const/16 v8, 0xe

    .line 73
    .line 74
    invoke-direct {v7, v0, v1, v8}, La/xwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v7}, La/y4f0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 81
    .line 82
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 83
    .line 84
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v7, v5, La/i3t0;->f:La/oyg0;

    .line 92
    .line 93
    move-object v8, v6

    .line 94
    check-cast v8, La/u4f0;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    const/16 v30, 0x0

    .line 100
    .line 101
    const v31, 0x3ffffffd    # 1.9999996f

    .line 102
    .line 103
    .line 104
    const/4 v9, 0x0

    .line 105
    const/4 v10, 0x1

    .line 106
    const/4 v11, 0x0

    .line 107
    const/4 v12, 0x0

    .line 108
    const/4 v13, 0x0

    .line 109
    const/4 v14, 0x0

    .line 110
    const/4 v15, 0x0

    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    const/16 v19, 0x0

    .line 118
    .line 119
    const/16 v20, 0x0

    .line 120
    .line 121
    const/16 v21, 0x0

    .line 122
    .line 123
    const/16 v22, 0x0

    .line 124
    .line 125
    const/16 v23, 0x0

    .line 126
    .line 127
    const/16 v24, 0x0

    .line 128
    .line 129
    const/16 v25, 0x0

    .line 130
    .line 131
    const/16 v26, 0x0

    .line 132
    .line 133
    const/16 v27, 0x0

    .line 134
    .line 135
    const/16 v28, 0x0

    .line 136
    .line 137
    const/16 v29, 0x0

    .line 138
    .line 139
    invoke-static/range {v8 .. v31}, La/u4f0;->a(La/u4f0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/r1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;ZLjava/util/List;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/u4f0;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-virtual {v1, v6, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_0

    .line 148
    .line 149
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    iget-object v1, v5, La/x5f0;->Z:La/mne;

    .line 154
    .line 155
    iget-object v10, v1, La/mne;->a:La/rwj;

    .line 156
    .line 157
    new-instance v8, La/y4f0;

    .line 158
    .line 159
    invoke-direct {v8, v5, v3}, La/y4f0;-><init>(La/x5f0;B)V

    .line 160
    .line 161
    .line 162
    new-instance v9, La/tie0;

    .line 163
    .line 164
    const/16 v1, 0xd

    .line 165
    .line 166
    invoke-direct {v9, v5, v1}, La/tie0;-><init>(Ljava/lang/Object;B)V

    .line 167
    .line 168
    .line 169
    new-instance v11, La/zye0;

    .line 170
    .line 171
    invoke-direct {v11, v5, v0, v4, v2}, La/zye0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 172
    .line 173
    .line 174
    const/16 v12, 0x8

    .line 175
    .line 176
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

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
        :pswitch_0
    .end packed-switch
.end method

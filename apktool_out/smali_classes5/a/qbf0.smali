.class public final synthetic La/qbf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t2g0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ocf0;


# direct methods
.method public synthetic constructor <init>(La/ocf0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qbf0;->a:B

    iput-object p1, p0, La/qbf0;->b:La/ocf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/qbf0;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/qbf0;->b:La/ocf0;

    .line 8
    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v2, v1, La/kl90;

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, La/kl90;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v2, v7

    .line 25
    :goto_0
    if-eqz v2, :cond_1

    .line 26
    .line 27
    check-cast v1, La/kl90;

    .line 28
    .line 29
    iget v5, v1, La/kl90;->a:I

    .line 30
    .line 31
    iget-boolean v6, v1, La/kl90;->b:Z

    .line 32
    .line 33
    iget-object v4, v0, La/qbf0;->b:La/ocf0;

    .line 34
    .line 35
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v9, La/kcf0;->a:La/kcf0;

    .line 40
    .line 41
    iget-object v1, v4, La/ocf0;->Z:La/mne;

    .line 42
    .line 43
    iget-object v11, v1, La/mne;->a:La/rwj;

    .line 44
    .line 45
    new-instance v3, La/a48;

    .line 46
    .line 47
    const/4 v8, 0x5

    .line 48
    invoke-direct/range {v3 .. v8}, La/a48;-><init>(La/diu0;IZLa/yje;B)V

    .line 49
    .line 50
    .line 51
    const/16 v13, 0xa

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    move-object v8, v0

    .line 55
    move-object v12, v3

    .line 56
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    instance-of v0, v1, Ljava/lang/Integer;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    move-object v0, v1

    .line 69
    check-cast v0, Ljava/lang/Integer;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move-object v0, v2

    .line 73
    :goto_1
    if-eqz v0, :cond_3

    .line 74
    .line 75
    move-object v0, v1

    .line 76
    check-cast v0, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    iget-object v1, v3, La/ocf0;->Z:La/mne;

    .line 87
    .line 88
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 89
    .line 90
    new-instance v5, La/pbf0;

    .line 91
    .line 92
    const/4 v1, 0x2

    .line 93
    invoke-direct {v5, v3, v1}, La/pbf0;-><init>(La/ocf0;B)V

    .line 94
    .line 95
    .line 96
    new-instance v8, Le;

    .line 97
    .line 98
    const/16 v1, 0x8

    .line 99
    .line 100
    invoke-direct {v8, v3, v0, v2, v1}, Le;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 101
    .line 102
    .line 103
    const/16 v9, 0xa

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 107
    .line 108
    .line 109
    :cond_3
    return-void

    .line 110
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 114
    .line 115
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 116
    .line 117
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v2, v3, La/i3t0;->f:La/oyg0;

    .line 125
    .line 126
    move-object v4, v1

    .line 127
    check-cast v4, La/mbf0;

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    const/16 v26, 0x0

    .line 133
    .line 134
    const v27, 0x3ffffffe    # 1.9999998f

    .line 135
    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    const/4 v6, 0x0

    .line 139
    const/4 v7, 0x0

    .line 140
    const/4 v8, 0x0

    .line 141
    const/4 v9, 0x0

    .line 142
    const/4 v10, 0x0

    .line 143
    const/4 v11, 0x0

    .line 144
    const/4 v12, 0x0

    .line 145
    const/4 v13, 0x0

    .line 146
    const/4 v14, 0x0

    .line 147
    const/4 v15, 0x0

    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    .line 154
    const/16 v19, 0x0

    .line 155
    .line 156
    const/16 v20, 0x0

    .line 157
    .line 158
    const/16 v21, 0x0

    .line 159
    .line 160
    const/16 v22, 0x0

    .line 161
    .line 162
    const/16 v23, 0x0

    .line 163
    .line 164
    const/16 v24, 0x0

    .line 165
    .line 166
    const/16 v25, 0x0

    .line 167
    .line 168
    invoke-static/range {v4 .. v27}, La/mbf0;->a(La/mbf0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/p1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/mbf0;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_4

    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

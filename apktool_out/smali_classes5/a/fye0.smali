.class public final synthetic La/fye0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t2g0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/eze0;


# direct methods
.method public synthetic constructor <init>(La/eze0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fye0;->a:B

    iput-object p1, p0, La/fye0;->b:La/eze0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/fye0;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/fye0;->b:La/eze0;

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
    instance-of v0, v1, Ljava/lang/Integer;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, v1

    .line 21
    check-cast v0, Ljava/lang/Integer;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v2

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    move-object v0, v1

    .line 28
    check-cast v0, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v1, v3, La/eze0;->a0:La/mne;

    .line 39
    .line 40
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 41
    .line 42
    new-instance v5, La/eye0;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {v5, v3, v1}, La/eye0;-><init>(La/eze0;B)V

    .line 46
    .line 47
    .line 48
    new-instance v8, Le;

    .line 49
    .line 50
    const/4 v1, 0x6

    .line 51
    invoke-direct {v8, v3, v0, v2, v1}, Le;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 52
    .line 53
    .line 54
    const/16 v9, 0xa

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 65
    .line 66
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 67
    .line 68
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v1, v3, La/i3t0;->f:La/oyg0;

    .line 76
    .line 77
    move-object v4, v0

    .line 78
    check-cast v4, La/aye0;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const/16 v25, 0x0

    .line 84
    .line 85
    const v26, 0x7ffffffe

    .line 86
    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v8, 0x0

    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v10, 0x0

    .line 94
    const/4 v11, 0x0

    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v13, 0x0

    .line 97
    const/4 v14, 0x0

    .line 98
    const/4 v15, 0x0

    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    const/16 v19, 0x0

    .line 106
    .line 107
    const/16 v20, 0x0

    .line 108
    .line 109
    const/16 v21, 0x0

    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const/16 v23, 0x0

    .line 114
    .line 115
    const/16 v24, 0x0

    .line 116
    .line 117
    invoke-static/range {v4 .. v26}, La/aye0;->a(La/aye0;ZZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/q1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/aye0;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    instance-of v2, v1, La/kl90;

    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    if-eqz v2, :cond_3

    .line 135
    .line 136
    move-object v2, v1

    .line 137
    check-cast v2, La/kl90;

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_3
    move-object v2, v7

    .line 141
    :goto_1
    if-eqz v2, :cond_4

    .line 142
    .line 143
    check-cast v1, La/kl90;

    .line 144
    .line 145
    iget v5, v1, La/kl90;->a:I

    .line 146
    .line 147
    iget-boolean v6, v1, La/kl90;->b:Z

    .line 148
    .line 149
    iget-object v4, v0, La/fye0;->b:La/eze0;

    .line 150
    .line 151
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sget-object v9, La/aze0;->a:La/aze0;

    .line 156
    .line 157
    iget-object v1, v4, La/eze0;->a0:La/mne;

    .line 158
    .line 159
    iget-object v11, v1, La/mne;->a:La/rwj;

    .line 160
    .line 161
    new-instance v3, La/a48;

    .line 162
    .line 163
    const/4 v8, 0x3

    .line 164
    invoke-direct/range {v3 .. v8}, La/a48;-><init>(La/diu0;IZLa/yje;B)V

    .line 165
    .line 166
    .line 167
    const/16 v13, 0xa

    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    move-object v8, v0

    .line 171
    move-object v12, v3

    .line 172
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 173
    .line 174
    .line 175
    :cond_4
    return-void

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

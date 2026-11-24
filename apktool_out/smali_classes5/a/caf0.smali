.class public final synthetic La/caf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:La/j910;


# direct methods
.method public synthetic constructor <init>(ZLa/j910;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/caf0;->a:B

    iput-boolean p1, p0, La/caf0;->b:Z

    iput-object p2, p0, La/caf0;->c:La/j910;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/caf0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/caf0;->c:La/j910;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/mbf0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, v1, La/mbf0;->g:La/p1f0;

    .line 18
    .line 19
    iget-boolean v0, v0, La/caf0;->b:Z

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v22

    .line 25
    const v43, -0x40001

    .line 26
    .line 27
    .line 28
    const/16 v44, 0x7f

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x0

    .line 39
    const/4 v13, 0x0

    .line 40
    const/4 v14, 0x0

    .line 41
    const/4 v15, 0x0

    .line 42
    const/16 v16, 0x0

    .line 43
    .line 44
    const/16 v17, 0x0

    .line 45
    .line 46
    const/16 v18, 0x0

    .line 47
    .line 48
    const/16 v19, 0x0

    .line 49
    .line 50
    const/16 v20, 0x0

    .line 51
    .line 52
    const/16 v21, 0x0

    .line 53
    .line 54
    const/16 v23, 0x0

    .line 55
    .line 56
    const/16 v24, 0x0

    .line 57
    .line 58
    const/16 v25, 0x0

    .line 59
    .line 60
    const/16 v26, 0x0

    .line 61
    .line 62
    const/16 v27, 0x0

    .line 63
    .line 64
    const/16 v28, 0x0

    .line 65
    .line 66
    const/16 v29, 0x0

    .line 67
    .line 68
    const/16 v30, 0x0

    .line 69
    .line 70
    const/16 v31, 0x0

    .line 71
    .line 72
    const/16 v32, 0x0

    .line 73
    .line 74
    const/16 v33, 0x0

    .line 75
    .line 76
    const/16 v34, 0x0

    .line 77
    .line 78
    const/16 v35, 0x0

    .line 79
    .line 80
    const/16 v36, 0x0

    .line 81
    .line 82
    const/16 v37, 0x0

    .line 83
    .line 84
    const/16 v38, 0x0

    .line 85
    .line 86
    const/16 v39, 0x0

    .line 87
    .line 88
    const/16 v40, 0x0

    .line 89
    .line 90
    const/16 v41, 0x0

    .line 91
    .line 92
    const/16 v42, 0x0

    .line 93
    .line 94
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v3, La/u0f0;->Z:La/u0f0;

    .line 99
    .line 100
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v3}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v2, v2, La/j910;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, La/vzg0;

    .line 114
    .line 115
    const-string v3, "POLITICALLY_EXPOSED_PERSON"

    .line 116
    .line 117
    iget-object v4, v0, La/p1f0;->s:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance v2, Lkotlin/Pair;

    .line 123
    .line 124
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return-object v2

    .line 128
    :pswitch_0
    move-object/from16 v1, p1

    .line 129
    .line 130
    check-cast v1, La/mbf0;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object v3, v1, La/mbf0;->g:La/p1f0;

    .line 136
    .line 137
    const/16 v43, -0x1

    .line 138
    .line 139
    const/16 v44, 0x7d

    .line 140
    .line 141
    const/4 v4, 0x0

    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v6, 0x0

    .line 144
    const/4 v7, 0x0

    .line 145
    const/4 v8, 0x0

    .line 146
    const/4 v9, 0x0

    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v11, 0x0

    .line 149
    const/4 v12, 0x0

    .line 150
    const/4 v13, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    const/4 v15, 0x0

    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const/16 v18, 0x0

    .line 158
    .line 159
    const/16 v19, 0x0

    .line 160
    .line 161
    const/16 v20, 0x0

    .line 162
    .line 163
    const/16 v21, 0x0

    .line 164
    .line 165
    const/16 v22, 0x0

    .line 166
    .line 167
    const/16 v23, 0x0

    .line 168
    .line 169
    const/16 v24, 0x0

    .line 170
    .line 171
    const/16 v25, 0x0

    .line 172
    .line 173
    const/16 v26, 0x0

    .line 174
    .line 175
    const/16 v27, 0x0

    .line 176
    .line 177
    const/16 v28, 0x0

    .line 178
    .line 179
    const/16 v29, 0x0

    .line 180
    .line 181
    const/16 v30, 0x0

    .line 182
    .line 183
    const/16 v31, 0x0

    .line 184
    .line 185
    const/16 v32, 0x0

    .line 186
    .line 187
    const/16 v33, 0x0

    .line 188
    .line 189
    const/16 v34, 0x0

    .line 190
    .line 191
    const/16 v35, 0x0

    .line 192
    .line 193
    const/16 v36, 0x0

    .line 194
    .line 195
    iget-boolean v0, v0, La/caf0;->b:Z

    .line 196
    .line 197
    const/16 v38, 0x0

    .line 198
    .line 199
    const/16 v39, 0x0

    .line 200
    .line 201
    const/16 v40, 0x0

    .line 202
    .line 203
    const/16 v41, 0x0

    .line 204
    .line 205
    const/16 v42, 0x0

    .line 206
    .line 207
    move/from16 v37, v0

    .line 208
    .line 209
    invoke-static/range {v3 .. v44}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iget-object v2, v2, La/j910;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v2, La/vzg0;

    .line 216
    .line 217
    iget-object v3, v0, La/p1f0;->c:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;

    .line 218
    .line 219
    if-eqz v3, :cond_0

    .line 220
    .line 221
    const/4 v3, 0x1

    .line 222
    goto :goto_0

    .line 223
    :cond_0
    const/4 v3, 0x0

    .line 224
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    const-string v4, "HAS_BONUSES"

    .line 229
    .line 230
    invoke-virtual {v2, v4, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    iget-object v1, v1, La/mbf0;->e:Ljava/util/Map;

    .line 234
    .line 235
    new-instance v2, Lkotlin/Pair;

    .line 236
    .line 237
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    return-object v2

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

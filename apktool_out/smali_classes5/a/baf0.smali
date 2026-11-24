.class public final synthetic La/baf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/j910;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;La/j910;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/baf0;->a:B

    iput p1, p0, La/baf0;->b:I

    iput-object p2, p0, La/baf0;->c:Ljava/lang/String;

    iput-object p3, p0, La/baf0;->d:Ljava/lang/String;

    iput-object p4, p0, La/baf0;->e:La/j910;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/baf0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/baf0;->e:La/j910;

    .line 6
    .line 7
    iget-object v3, v0, La/baf0;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, La/baf0;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget v0, v0, La/baf0;->b:I

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La/mbf0;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v5, v1, La/mbf0;->g:La/p1f0;

    .line 24
    .line 25
    new-instance v8, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;

    .line 26
    .line 27
    invoke-direct {v8, v0, v4, v3}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/16 v45, -0x5

    .line 31
    .line 32
    const/16 v46, 0x7f

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v10, 0x0

    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v13, 0x0

    .line 41
    const/4 v14, 0x0

    .line 42
    const/4 v15, 0x0

    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    const/16 v17, 0x0

    .line 46
    .line 47
    const/16 v18, 0x0

    .line 48
    .line 49
    const/16 v19, 0x0

    .line 50
    .line 51
    const/16 v20, 0x0

    .line 52
    .line 53
    const/16 v21, 0x0

    .line 54
    .line 55
    const/16 v22, 0x0

    .line 56
    .line 57
    const/16 v23, 0x0

    .line 58
    .line 59
    const/16 v24, 0x0

    .line 60
    .line 61
    const/16 v25, 0x0

    .line 62
    .line 63
    const/16 v26, 0x0

    .line 64
    .line 65
    const/16 v27, 0x0

    .line 66
    .line 67
    const/16 v28, 0x0

    .line 68
    .line 69
    const/16 v29, 0x0

    .line 70
    .line 71
    const/16 v30, 0x0

    .line 72
    .line 73
    const/16 v31, 0x0

    .line 74
    .line 75
    const/16 v32, 0x0

    .line 76
    .line 77
    const/16 v33, 0x0

    .line 78
    .line 79
    const/16 v34, 0x0

    .line 80
    .line 81
    const/16 v35, 0x0

    .line 82
    .line 83
    const/16 v36, 0x0

    .line 84
    .line 85
    const/16 v37, 0x0

    .line 86
    .line 87
    const/16 v38, 0x0

    .line 88
    .line 89
    const/16 v39, 0x0

    .line 90
    .line 91
    const/16 v40, 0x0

    .line 92
    .line 93
    const/16 v41, 0x0

    .line 94
    .line 95
    const/16 v42, 0x0

    .line 96
    .line 97
    const/16 v43, 0x0

    .line 98
    .line 99
    const/16 v44, 0x0

    .line 100
    .line 101
    invoke-static/range {v5 .. v46}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v3, La/u0f0;->v:La/u0f0;

    .line 106
    .line 107
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {v1, v3}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v2, v2, La/j910;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, La/vzg0;

    .line 118
    .line 119
    const-string v3, "BONUS"

    .line 120
    .line 121
    iget-object v4, v0, La/p1f0;->c:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;

    .line 122
    .line 123
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    new-instance v2, Lkotlin/Pair;

    .line 127
    .line 128
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-object v2

    .line 132
    :pswitch_0
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, La/mbf0;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v5, v1, La/mbf0;->g:La/p1f0;

    .line 140
    .line 141
    new-instance v13, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 142
    .line 143
    invoke-direct {v13, v0, v4, v3}, Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const/16 v45, -0x81

    .line 147
    .line 148
    const/16 v46, 0x7f

    .line 149
    .line 150
    const/4 v6, 0x0

    .line 151
    const/4 v7, 0x0

    .line 152
    const/4 v8, 0x0

    .line 153
    const/4 v9, 0x0

    .line 154
    const/4 v10, 0x0

    .line 155
    const/4 v11, 0x0

    .line 156
    const/4 v12, 0x0

    .line 157
    const/4 v14, 0x0

    .line 158
    const/4 v15, 0x0

    .line 159
    const/16 v16, 0x0

    .line 160
    .line 161
    const/16 v17, 0x0

    .line 162
    .line 163
    const/16 v18, 0x0

    .line 164
    .line 165
    const/16 v19, 0x0

    .line 166
    .line 167
    const/16 v20, 0x0

    .line 168
    .line 169
    const/16 v21, 0x0

    .line 170
    .line 171
    const/16 v22, 0x0

    .line 172
    .line 173
    const/16 v23, 0x0

    .line 174
    .line 175
    const/16 v24, 0x0

    .line 176
    .line 177
    const/16 v25, 0x0

    .line 178
    .line 179
    const/16 v26, 0x0

    .line 180
    .line 181
    const/16 v27, 0x0

    .line 182
    .line 183
    const/16 v28, 0x0

    .line 184
    .line 185
    const/16 v29, 0x0

    .line 186
    .line 187
    const/16 v30, 0x0

    .line 188
    .line 189
    const/16 v31, 0x0

    .line 190
    .line 191
    const/16 v32, 0x0

    .line 192
    .line 193
    const/16 v33, 0x0

    .line 194
    .line 195
    const/16 v34, 0x0

    .line 196
    .line 197
    const/16 v35, 0x0

    .line 198
    .line 199
    const/16 v36, 0x0

    .line 200
    .line 201
    const/16 v37, 0x0

    .line 202
    .line 203
    const/16 v38, 0x0

    .line 204
    .line 205
    const/16 v39, 0x0

    .line 206
    .line 207
    const/16 v40, 0x0

    .line 208
    .line 209
    const/16 v41, 0x0

    .line 210
    .line 211
    const/16 v42, 0x0

    .line 212
    .line 213
    const/16 v43, 0x0

    .line 214
    .line 215
    const/16 v44, 0x0

    .line 216
    .line 217
    invoke-static/range {v5 .. v46}, La/p1f0;->a(La/p1f0;Ljava/lang/String;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;ZZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Ljava/lang/Long;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/DocumentStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/PhoneStateModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Ljava/lang/String;ZZLjava/lang/String;ZZZLjava/lang/Integer;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/SocialStateModel;Ljava/lang/Integer;ZZLjava/lang/Long;Ljava/lang/Long;ZZLa/q7f0;II)La/p1f0;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    sget-object v3, La/u0f0;->i:La/u0f0;

    .line 222
    .line 223
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-static {v1, v3}, La/j910;->e(La/mbf0;Ljava/util/List;)Ljava/util/Map;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iget-object v2, v2, La/j910;->b:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v2, La/vzg0;

    .line 237
    .line 238
    const-string v3, "CURRENCY"

    .line 239
    .line 240
    iget-object v4, v0, La/p1f0;->h:Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;

    .line 241
    .line 242
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    new-instance v2, Lkotlin/Pair;

    .line 246
    .line 247
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    return-object v2

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

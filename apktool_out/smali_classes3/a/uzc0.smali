.class public final La/uzc0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ctf0;

.field public final b:La/pru;


# direct methods
.method public constructor <init>(La/ctf0;La/pru;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/uzc0;->a:La/ctf0;

    .line 8
    .line 9
    iput-object p2, p0, La/uzc0;->b:La/pru;

    .line 10
    .line 11
    return-void
.end method

.method public static c(La/uzc0;I)Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, p1, v1}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsCatalogScreen$1;-><init>(La/uzc0;IZ)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public final a(La/kr5;IZ)Landroid/content/Intent;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/kr5;->n:La/oo5;

    .line 5
    .line 6
    iget v1, p1, La/kr5;->b:I

    .line 7
    .line 8
    const/16 v2, 0x4d5

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    move v2, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v2, v4

    .line 17
    :goto_0
    iget-boolean v5, p1, La/kr5;->l:Z

    .line 18
    .line 19
    sget-object v6, La/oo5;->f:La/oo5;

    .line 20
    .line 21
    sget-object v7, La/oo5;->e:La/oo5;

    .line 22
    .line 23
    filled-new-array {v6, v7}, [La/oo5;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    const/16 v9, -0x3e8

    .line 36
    .line 37
    if-nez v8, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, La/kr5;->a()Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_2

    .line 44
    .line 45
    :cond_1
    if-nez v5, :cond_3

    .line 46
    .line 47
    :cond_2
    if-eq p2, v9, :cond_3

    .line 48
    .line 49
    move v8, v3

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    move v8, v4

    .line 52
    :goto_1
    filled-new-array {v6, v7}, [La/oo5;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-interface {v6, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p1}, La/kr5;->a()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    :cond_4
    if-eqz v5, :cond_5

    .line 73
    .line 74
    if-ne p2, v9, :cond_5

    .line 75
    .line 76
    move v0, v3

    .line 77
    goto :goto_2

    .line 78
    :cond_5
    move v0, v4

    .line 79
    :goto_2
    if-eqz v5, :cond_6

    .line 80
    .line 81
    invoke-virtual {p1}, La/kr5;->d()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_6

    .line 86
    .line 87
    move v5, v3

    .line 88
    goto :goto_3

    .line 89
    :cond_6
    move v5, v4

    .line 90
    :goto_3
    xor-int/lit8 v6, p3, 0x1

    .line 91
    .line 92
    if-eqz v5, :cond_7

    .line 93
    .line 94
    invoke-virtual {p0, p1, p3}, La/uzc0;->b(La/kr5;Z)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_7
    if-eqz v2, :cond_8

    .line 100
    .line 101
    invoke-virtual {p0, p1, v6, v4}, La/uzc0;->d(La/kr5;ZZ)Landroid/content/Intent;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_8
    if-eqz v8, :cond_9

    .line 107
    .line 108
    new-instance v0, Landroid/content/Intent;

    .line 109
    .line 110
    new-instance v2, Landroid/net/Uri$Builder;

    .line 111
    .line 112
    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    .line 113
    .line 114
    .line 115
    new-array v5, v4, [Ljava/lang/Object;

    .line 116
    .line 117
    iget-object p0, p0, La/uzc0;->a:La/ctf0;

    .line 118
    .line 119
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 120
    .line 121
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    const v5, 0x7f130690

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {v2, p0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string v2, "open"

    .line 137
    .line 138
    invoke-virtual {p0, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    const-string v2, "NEWS_MAIN"

    .line 143
    .line 144
    invoke-virtual {p0, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    const-string v2, "PARAMETER_KEY_SHOW_NAV_BAR"

    .line 149
    .line 150
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {p0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    const-string v2, "PARAMETER_KEY_FROM_AGGREGATOR"

    .line 159
    .line 160
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    invoke-virtual {p0, v2, p3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    const-string p3, "PARAMETER_KEY_POSITION"

    .line 169
    .line 170
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {p0, p3, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    const-string p2, "PARAMETER_KEY_BANNER_ID"

    .line 179
    .line 180
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    invoke-virtual {p0, p2, p3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    iget p1, p1, La/kr5;->x:I

    .line 189
    .line 190
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string p2, "PARAMETER_KEY_BANNER_TYPE"

    .line 195
    .line 196
    invoke-virtual {p0, p2, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    const-string p1, "android.intent.action.VIEW"

    .line 205
    .line 206
    invoke-direct {v0, p1, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 207
    .line 208
    .line 209
    return-object v0

    .line 210
    :cond_9
    if-eqz v0, :cond_a

    .line 211
    .line 212
    invoke-virtual {p0, p1, v6, v4}, La/uzc0;->d(La/kr5;ZZ)Landroid/content/Intent;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0

    .line 217
    :cond_a
    invoke-virtual {p0, p1, p3}, La/uzc0;->b(La/kr5;Z)Landroid/content/Intent;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    return-object p0
.end method

.method public final b(La/kr5;Z)Landroid/content/Intent;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    xor-int/lit8 v2, p2, 0x1

    .line 9
    .line 10
    iget-object v3, v1, La/kr5;->n:La/oo5;

    .line 11
    .line 12
    iget-object v4, v1, La/kr5;->f:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v5, v1, La/kr5;->d:Ljava/lang/String;

    .line 15
    .line 16
    iget v6, v1, La/kr5;->m:I

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v7, 0x0

    .line 23
    if-eqz v3, :cond_a

    .line 24
    .line 25
    const-string v8, "open"

    .line 26
    .line 27
    const v9, 0x7f130690

    .line 28
    .line 29
    .line 30
    iget-object v10, v0, La/uzc0;->a:La/ctf0;

    .line 31
    .line 32
    const-string v11, "android.intent.action.VIEW"

    .line 33
    .line 34
    const/4 v12, 0x1

    .line 35
    if-eq v3, v12, :cond_9

    .line 36
    .line 37
    const/4 v13, 0x2

    .line 38
    const-string v14, "PARAMETER_KEY_BANNER_IMAGE_URL"

    .line 39
    .line 40
    const-string v15, "PARAMETER_KEY_BANNER_TRANSLATE_ID"

    .line 41
    .line 42
    const/4 v12, 0x3

    .line 43
    if-eq v3, v13, :cond_1

    .line 44
    .line 45
    if-eq v3, v12, :cond_0

    .line 46
    .line 47
    new-instance v0, Landroid/content/Intent;

    .line 48
    .line 49
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_0
    new-instance v0, Landroid/content/Intent;

    .line 54
    .line 55
    new-instance v2, Landroid/net/Uri$Builder;

    .line 56
    .line 57
    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    .line 58
    .line 59
    .line 60
    new-array v3, v7, [Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v10, v10, La/ctf0;->b:La/lsm0;

    .line 63
    .line 64
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v10, v9, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2, v8}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const-string v3, "BET_WITHOUT_RISK"

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const-string v3, "PARAMETER_KEY_BANNER_TITLE"

    .line 87
    .line 88
    iget-object v1, v1, La/kr5;->o:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v2, v3, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1, v15, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v2, "PARAMETER_KEY_BANNER_LOTTERY_ID"

    .line 99
    .line 100
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1, v14, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v0, v11, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 117
    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_1
    sget-object v3, La/cs5;->b:La/gl5;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sget-object v3, La/cs5;->c:[La/cs5;

    .line 126
    .line 127
    array-length v13, v3

    .line 128
    move v9, v7

    .line 129
    :goto_0
    if-ge v9, v13, :cond_3

    .line 130
    .line 131
    aget-object v7, v3, v9

    .line 132
    .line 133
    iget-byte v12, v7, La/cs5;->a:B

    .line 134
    .line 135
    if-ne v12, v6, :cond_2

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 139
    .line 140
    const/4 v7, 0x0

    .line 141
    const/4 v12, 0x3

    .line 142
    goto :goto_0

    .line 143
    :cond_3
    const/4 v7, 0x0

    .line 144
    :goto_1
    if-nez v7, :cond_4

    .line 145
    .line 146
    sget-object v7, La/cs5;->d:La/cs5;

    .line 147
    .line 148
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    const/4 v7, 0x1

    .line 153
    if-eq v3, v7, :cond_8

    .line 154
    .line 155
    const/4 v9, 0x3

    .line 156
    if-eq v3, v9, :cond_7

    .line 157
    .line 158
    const/4 v9, 0x4

    .line 159
    if-eq v3, v9, :cond_6

    .line 160
    .line 161
    sget-object v3, La/cs5;->b:La/gl5;

    .line 162
    .line 163
    const/4 v3, 0x7

    .line 164
    if-ne v6, v3, :cond_5

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_5
    const/4 v7, 0x0

    .line 168
    :goto_2
    invoke-virtual {v0, v1, v2, v7}, La/uzc0;->d(La/kr5;ZZ)Landroid/content/Intent;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    return-object v0

    .line 173
    :cond_6
    new-instance v0, Landroid/content/Intent;

    .line 174
    .line 175
    new-instance v1, Landroid/net/Uri$Builder;

    .line 176
    .line 177
    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 178
    .line 179
    .line 180
    const/4 v3, 0x0

    .line 181
    new-array v6, v3, [Ljava/lang/Object;

    .line 182
    .line 183
    iget-object v7, v10, La/ctf0;->b:La/lsm0;

    .line 184
    .line 185
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    const v6, 0x7f130690

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v1, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1, v8}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const-string v3, "AGGREGATOR_TV_BET_JACKPOT"

    .line 205
    .line 206
    invoke-virtual {v1, v3}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    const-string v3, "PARAMETER_KEY_FROM_AGGREGATOR"

    .line 211
    .line 212
    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-virtual {v1, v3, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    const-string v3, "PARAMETER_KEY_SHOW_NAV_BAR"

    .line 221
    .line 222
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v1, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v1, v14, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1, v15, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-direct {v0, v11, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 243
    .line 244
    .line 245
    return-object v0

    .line 246
    :cond_7
    new-instance v0, Landroid/content/Intent;

    .line 247
    .line 248
    new-instance v1, Landroid/net/Uri$Builder;

    .line 249
    .line 250
    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 251
    .line 252
    .line 253
    const/4 v3, 0x0

    .line 254
    new-array v2, v3, [Ljava/lang/Object;

    .line 255
    .line 256
    iget-object v4, v10, La/ctf0;->b:La/lsm0;

    .line 257
    .line 258
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    const v6, 0x7f130690

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v1, v8}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    const-string v2, "ONE_X_GAMES_JACKPOT"

    .line 278
    .line 279
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-direct {v0, v11, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 288
    .line 289
    .line 290
    return-object v0

    .line 291
    :cond_8
    new-instance v0, Landroid/content/Intent;

    .line 292
    .line 293
    new-instance v1, Landroid/net/Uri$Builder;

    .line 294
    .line 295
    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 296
    .line 297
    .line 298
    const/4 v3, 0x0

    .line 299
    new-array v2, v3, [Ljava/lang/Object;

    .line 300
    .line 301
    iget-object v4, v10, La/ctf0;->b:La/lsm0;

    .line 302
    .line 303
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    const v6, 0x7f130690

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v1, v8}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    const-string v2, "ONE_X_GAMES_BONUSES"

    .line 323
    .line 324
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-direct {v0, v11, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 333
    .line 334
    .line 335
    return-object v0

    .line 336
    :cond_9
    new-instance v0, Landroid/content/Intent;

    .line 337
    .line 338
    new-instance v1, Landroid/net/Uri$Builder;

    .line 339
    .line 340
    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 341
    .line 342
    .line 343
    const/4 v3, 0x0

    .line 344
    new-array v2, v3, [Ljava/lang/Object;

    .line 345
    .line 346
    iget-object v4, v10, La/ctf0;->b:La/lsm0;

    .line 347
    .line 348
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const v3, 0x7f130690

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-virtual {v1, v8}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    const-string v2, "ONE_X_GAMES_GAME"

    .line 368
    .line 369
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    const-string v2, "PARAMETER_KEY_GAME_ID"

    .line 374
    .line 375
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-direct {v0, v11, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 388
    .line 389
    .line 390
    return-object v0

    .line 391
    :cond_a
    move v3, v7

    .line 392
    invoke-virtual {v0, v1, v2, v3}, La/uzc0;->d(La/kr5;ZZ)Landroid/content/Intent;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    return-object v0
.end method

.method public final d(La/kr5;ZZ)Landroid/content/Intent;
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    new-instance v1, Landroid/net/Uri$Builder;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    new-array v3, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, La/uzc0;->a:La/ctf0;

    .line 12
    .line 13
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 14
    .line 15
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const v3, 0x7f130690

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v1, p0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v1, "open"

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v1, "NEWS_PAGER"

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v1, "PARAMETER_KEY_SHOW_NAV_BAR"

    .line 43
    .line 44
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p0, v1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p2, "PARAMETER_KEY_NEED_AUTH"

    .line 53
    .line 54
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-virtual {p0, p2, p3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string p2, "PARAMETER_KEY_BANNER_TRANSLATE_ID"

    .line 63
    .line 64
    iget-object p3, p1, La/kr5;->d:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p0, p2, p3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string p2, "PARAMETER_KEY_BANNER_TITLE"

    .line 71
    .line 72
    iget-object p3, p1, La/kr5;->o:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p0, p2, p3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object p2, p1, La/kr5;->n:La/oo5;

    .line 79
    .line 80
    iget-byte p2, p2, La/oo5;->a:B

    .line 81
    .line 82
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    const-string p3, "PARAMETER_KEY_BANNER_ACTION_TYPE"

    .line 87
    .line 88
    invoke-virtual {p0, p3, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iget p1, p1, La/kr5;->u:I

    .line 93
    .line 94
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string p2, "PARAMETER_KEY_BANNER_PRIZE_FLAG"

    .line 99
    .line 100
    invoke-virtual {p0, p2, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const-string p1, "android.intent.action.VIEW"

    .line 109
    .line 110
    invoke-direct {v0, p1, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 111
    .line 112
    .line 113
    return-object v0
.end method

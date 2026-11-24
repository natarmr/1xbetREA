.class public final synthetic La/uq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;
.implements La/xbf;
.implements La/jgd;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements La/tg00;
.implements La/sg00;
.implements La/omn0;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements La/uu9;
.implements La/fdq0;
.implements La/pm30;
.implements La/rbe;
.implements La/d1x;
.implements La/izj;
.implements La/isj0;
.implements La/zf60;
.implements La/upg0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/vq;Landroidx/fragment/app/Fragment;La/ms2;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    iput-byte p2, p0, La/uq;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uq;->b:Ljava/lang/Object;

    iput-object p3, p0, La/uq;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/uq;->a:B

    iput-object p1, p0, La/uq;->b:Ljava/lang/Object;

    iput-object p2, p0, La/uq;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/p5d0;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/izj;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/izj;

    .line 8
    .line 9
    invoke-interface {v0, p1}, La/izj;->a(La/p5d0;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, p1}, La/izj;->a(La/p5d0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/zhl;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/in30;

    .line 8
    .line 9
    check-cast p1, La/bo30;

    .line 10
    .line 11
    iget v1, v0, La/zhl;->a:I

    .line 12
    .line 13
    iget-object v0, v0, La/zhl;->b:La/vn30;

    .line 14
    .line 15
    invoke-interface {p1, v1, v0, p0}, La/bo30;->p(ILa/vn30;La/in30;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/wpg0;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/q55;

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    iget-object p1, v0, La/wpg0;->d:La/r35;

    .line 13
    .line 14
    iget v2, p1, La/r35;->b:I

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0, v2}, La/wpg0;->e(Landroid/database/sqlite/SQLiteDatabase;La/q55;I)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v9

    .line 20
    invoke-static {}, La/mwb0;->values()[La/mwb0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    array-length v3, v2

    .line 25
    const/4 v10, 0x0

    .line 26
    move v4, v10

    .line 27
    :goto_0
    if-ge v4, v3, :cond_2

    .line 28
    .line 29
    aget-object v5, v2, v4

    .line 30
    .line 31
    iget-object v6, p0, La/q55;->c:La/mwb0;

    .line 32
    .line 33
    if-ne v5, v6, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget v6, p1, La/r35;->b:I

    .line 37
    .line 38
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    sub-int/2addr v6, v7

    .line 43
    if-gtz v6, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    invoke-virtual {p0, v5}, La/q55;->b(La/mwb0;)La/q55;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v0, v1, v5, v6}, La/wpg0;->e(Landroid/database/sqlite/SQLiteDatabase;La/q55;I)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 55
    .line 56
    .line 57
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    :goto_2
    new-instance p0, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance p1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v0, "event_id IN ("

    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    move v0, v10

    .line 73
    :goto_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/4 v11, 0x1

    .line 78
    if-ge v0, v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, La/o45;

    .line 85
    .line 86
    iget-wide v2, v2, La/o45;->a:J

    .line 87
    .line 88
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    sub-int/2addr v2, v11

    .line 96
    if-ge v0, v2, :cond_3

    .line 97
    .line 98
    const/16 v2, 0x2c

    .line 99
    .line 100
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    const/16 v0, 0x29

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, "name"

    .line 112
    .line 113
    const-string v2, "value"

    .line 114
    .line 115
    const-string v3, "event_id"

    .line 116
    .line 117
    filled-new-array {v3, v0, v2}, [Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    const-string v2, "event_metadata"

    .line 128
    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v6, 0x0

    .line 131
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    :goto_4
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    invoke-interface {p1, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 142
    .line 143
    .line 144
    move-result-wide v0

    .line 145
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {p0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, Ljava/util/Set;

    .line 154
    .line 155
    if-nez v2, :cond_5

    .line 156
    .line 157
    new-instance v2, Ljava/util/HashSet;

    .line 158
    .line 159
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p0, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    :cond_5
    new-instance v0, La/vpg0;

    .line 170
    .line 171
    invoke-interface {p1, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    const/4 v3, 0x2

    .line 176
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-direct {v0, v1, v3}, La/vpg0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_6
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v9}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    :goto_5
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_9

    .line 199
    .line 200
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, La/o45;

    .line 205
    .line 206
    iget-wide v1, v0, La/o45;->a:J

    .line 207
    .line 208
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-nez v3, :cond_7

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_7
    iget-object v3, v0, La/o45;->c:La/q35;

    .line 220
    .line 221
    invoke-virtual {v3}, La/q35;->c()La/ru;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    check-cast v4, Ljava/util/Set;

    .line 234
    .line 235
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    if-eqz v5, :cond_8

    .line 244
    .line 245
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    check-cast v5, La/vpg0;

    .line 250
    .line 251
    iget-object v6, v5, La/vpg0;->a:Ljava/lang/String;

    .line 252
    .line 253
    iget-object v5, v5, La/vpg0;->b:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v3, v6, v5}, La/ru;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_8
    iget-object v0, v0, La/o45;->b:La/q55;

    .line 260
    .line 261
    invoke-virtual {v3}, La/ru;->b()La/q35;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    new-instance v4, La/o45;

    .line 266
    .line 267
    invoke-direct {v4, v1, v2, v0, v3}, La/o45;-><init>(JLa/q55;La/q35;)V

    .line 268
    .line 269
    .line 270
    invoke-interface {p1, v4}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_9
    return-object v9

    .line 275
    :catchall_0
    move-exception v0

    .line 276
    move-object p0, v0

    .line 277
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 278
    .line 279
    .line 280
    throw p0
.end method

.method public b(Ljava/lang/Object;La/jjq;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/fsj;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/my90;

    .line 8
    .line 9
    check-cast p1, La/gt2;

    .line 10
    .line 11
    new-instance v1, La/xr;

    .line 12
    .line 13
    iget-object v0, v0, La/fsj;->e:Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p2, v1, La/xr;->a:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v2, Landroid/util/SparseArray;

    .line 21
    .line 22
    iget-object p2, p2, La/jjq;->a:Landroid/util/SparseBooleanArray;

    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/util/SparseBooleanArray;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-direct {v2, v3}, Landroid/util/SparseArray;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_0
    invoke-virtual {p2}, Landroid/util/SparseBooleanArray;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v3, v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/util/SparseBooleanArray;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-static {v3, v4}, La/x0x;->D(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v3}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, La/ft2;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v4, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iput-object v2, v1, La/xr;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/kn30;

    .line 67
    .line 68
    invoke-virtual {p1, p0, v1}, La/kn30;->d(La/my90;La/xr;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/uq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/uq;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 11
    .line 12
    check-cast v1, La/we50;

    .line 13
    .line 14
    check-cast p1, La/m1r;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object p1, La/mz;->V1:La/jdk0;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance p1, La/mz;

    .line 28
    .line 29
    invoke-direct {p1}, La/mz;-><init>()V

    .line 30
    .line 31
    .line 32
    sget-object v0, La/mz;->W1:[La/iiy;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    aget-object v2, v0, v2

    .line 36
    .line 37
    iget-object v3, p1, La/mz;->S1:La/khf0;

    .line 38
    .line 39
    invoke-virtual {v3, p1, v2, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x2

    .line 43
    aget-object p0, v0, p0

    .line 44
    .line 45
    iget-object v0, p1, La/mz;->U1:La/yzn0;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p0, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_0
    check-cast p0, Lcom/github/terrakok/cicerone/androidx/ActivityScreen;

    .line 52
    .line 53
    check-cast v1, La/rs3;

    .line 54
    .line 55
    check-cast p1, Landroid/content/Context;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p1, v1, La/rs3;->a:La/kxq;

    .line 61
    .line 62
    check-cast p0, Lcom/github/terrakok/cicerone/androidx/ActivityScreen$Companion$invoke$1;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lcom/github/terrakok/cicerone/androidx/ActivityScreen$Companion$invoke$1;->c(Landroid/content/Context;)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_1
    check-cast p0, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 70
    .line 71
    check-cast v1, La/rs3;

    .line 72
    .line 73
    check-cast p1, La/m1r;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object p1, v1, La/rs3;->d:La/m1r;

    .line 79
    .line 80
    invoke-interface {p0, p1}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(La/l55;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/txj;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/pmn0;

    .line 8
    .line 9
    iget-object p0, p0, La/pmn0;->c:La/agn;

    .line 10
    .line 11
    invoke-virtual {p0}, La/agn;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    iget-boolean p0, p1, La/l55;->d:Z

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    sget-object p0, La/sfr;->c:La/sfr;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p0, La/sfr;->b:La/sfr;

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, La/txj;->a:La/p8l;

    .line 27
    .line 28
    iget-object v0, p1, La/p8l;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-static {v0, v1}, La/vfr;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p1, La/p8l;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/lang/Thread;

    .line 39
    .line 40
    invoke-static {v0}, La/vfr;->c(Ljava/lang/Thread;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p1, La/p8l;->m:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La/sfr;

    .line 46
    .line 47
    if-eq v0, p0, :cond_1

    .line 48
    .line 49
    iput-object p0, p1, La/p8l;->m:Ljava/lang/Object;

    .line 50
    .line 51
    iget p0, p1, La/p8l;->a:I

    .line 52
    .line 53
    invoke-virtual {p1, p0}, La/p8l;->B(I)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public e(La/e1x;)V
    .locals 1

    .line 1
    iget-byte p1, p0, La/uq;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/uq;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/ibe0;

    .line 11
    .line 12
    check-cast v0, La/d1x;

    .line 13
    .line 14
    invoke-interface {v0, p0}, La/d1x;->e(La/e1x;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p0, La/zn00;

    .line 19
    .line 20
    check-cast v0, La/d1x;

    .line 21
    .line 22
    invoke-interface {v0, p0}, La/d1x;->e(La/e1x;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public f(La/tu9;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/zbg0;

    .line 8
    .line 9
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    new-instance v3, La/jg00;

    .line 16
    .line 17
    invoke-direct {v3, v1, v2}, La/jg00;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/zmk;->a:La/zmk;

    .line 21
    .line 22
    invoke-virtual {p1, v3, v2}, La/tu9;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/b1;

    .line 26
    .line 27
    const/16 v3, 0x13

    .line 28
    .line 29
    invoke-direct {v2, v1, p1, p0, v3}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    const-string p0, "setForegroundAsync"

    .line 36
    .line 37
    return-object p0
.end method

.method public g()Z
    .locals 7

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ktb0;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/aa5;

    .line 8
    .line 9
    iget-boolean v1, v0, La/ktb0;->q:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/ktb0;->h()V

    .line 14
    .line 15
    .line 16
    iget-wide v1, v0, La/ktb0;->o:J

    .line 17
    .line 18
    iget-wide v3, p0, La/aa5;->a:J

    .line 19
    .line 20
    invoke-static {v1, v2, v3, v4}, La/aa5;->a(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    iput-wide v1, p0, La/aa5;->a:J

    .line 25
    .line 26
    iget-wide v3, v0, La/ktb0;->n:J

    .line 27
    .line 28
    iget-wide v5, p0, La/aa5;->b:J

    .line 29
    .line 30
    add-long/2addr v1, v5

    .line 31
    invoke-virtual {v0, v3, v4, v1, v2}, La/ktb0;->g(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    xor-int/lit8 p0, p0, 0x1

    .line 36
    .line 37
    iput-boolean p0, v0, La/ktb0;->q:Z

    .line 38
    .line 39
    return p0

    .line 40
    :cond_0
    return v1
.end method

.method public h(Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/media3/common/b;

    .line 8
    .line 9
    check-cast p1, La/jm30;

    .line 10
    .line 11
    iget-object v1, p1, La/jm30;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, La/qm30;->c(Landroidx/media3/common/b;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v3

    .line 34
    :cond_1
    :goto_0
    invoke-virtual {p1, v0, p0, v3}, La/jm30;->c(Landroid/content/Context;Landroidx/media3/common/b;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/jm30;->d(Landroidx/media3/common/b;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_2
    return v3
.end method

.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/uq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/uq;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v0, "BOTTOM_SHEET_RESULT"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v2, v0, La/lw5;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    check-cast v0, La/lw5;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "BOTTOM_SHEET_ITEM_INDEX"

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {v1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_1
    return-void

    .line 54
    :pswitch_0
    check-cast p0, La/vq;

    .line 55
    .line 56
    check-cast v1, La/ms2;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string p1, "REQUEST_ALREADY_COUPON_DIALOG_KEYSECOND"

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    sget-object p1, La/aao;->c:La/aao;

    .line 71
    .line 72
    invoke-virtual {p0, v1, p1}, La/vq;->g(La/ms2;La/aao;)V

    .line 73
    .line 74
    .line 75
    :goto_2
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ft2;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/in30;

    .line 8
    .line 9
    check-cast p1, La/gt2;

    .line 10
    .line 11
    check-cast p1, La/kn30;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, La/ft2;->d:La/vn30;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v2, La/zz2;

    .line 22
    .line 23
    iget-object v3, p0, La/in30;->c:Landroidx/media3/common/b;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget v4, p0, La/in30;->d:I

    .line 29
    .line 30
    iget-object v5, p1, La/kn30;->c:La/owj;

    .line 31
    .line 32
    iget-object v0, v0, La/ft2;->b:La/bmq0;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v0, v1}, La/owj;->c(La/bmq0;La/vn30;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {v2, v3, v4, v0}, La/zz2;-><init>(Landroidx/media3/common/b;ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget p0, p0, La/in30;->b:I

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    if-eq p0, v0, :cond_2

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    if-eq p0, v0, :cond_3

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    if-eq p0, v0, :cond_1

    .line 56
    .line 57
    :goto_0
    return-void

    .line 58
    :cond_1
    iput-object v2, p1, La/kn30;->r:La/zz2;

    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iput-object v2, p1, La/kn30;->q:La/zz2;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    iput-object v2, p1, La/kn30;->p:La/zz2;

    .line 65
    .line 66
    return-void
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 2

    .line 1
    iget-object p1, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, La/pz40;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/w6k;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iget-object v1, p2, La/xiv0;->a:La/uiv0;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, La/uiv0;->i(I)La/pfx;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v0, v0, La/pfx;->b:I

    .line 17
    .line 18
    invoke-interface {p0, v0}, La/w6k;->r0(I)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    new-instance v0, La/ycl;

    .line 23
    .line 24
    invoke-direct {v0, p0}, La/ycl;-><init>(F)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    .line 1
    iget-object p1, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, La/vyn;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/content/Intent;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, La/vyn;->a(Landroid/content/Intent;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 14

    .line 1
    iget-byte v0, p0, La/uq;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const-string v3, "GET_CANCELED_TAG"

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x4

    .line 9
    const v6, 0x77034d87

    .line 10
    .line 11
    .line 12
    const v7, -0x936ed67

    .line 13
    .line 14
    .line 15
    const v8, -0x5d754ec3

    .line 16
    .line 17
    .line 18
    const-string v9, "GET_NO_CREDENTIALS"

    .line 19
    .line 20
    const-string v10, "GET_INTERRUPTED"

    .line 21
    .line 22
    iget-object v11, p0, La/uq;->c:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p0, p0, La/uq;->b:Ljava/lang/Object;

    .line 25
    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast p0, La/icf;

    .line 30
    .line 31
    check-cast v11, Landroid/os/CancellationSignal;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    instance-of v0, p1, La/qa3;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    sget-object v0, La/ecf;->b:Ljava/util/Set;

    .line 41
    .line 42
    move-object v12, p1

    .line 43
    check-cast v12, La/qa3;

    .line 44
    .line 45
    invoke-virtual {v12}, La/qa3;->getStatusCode()I

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    move-object v0, v10

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-object v0, v9

    .line 62
    :goto_0
    new-instance v12, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v13, "During get sign-in intent, failure response from one tap: "

    .line 65
    .line 66
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v12, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-eq v12, v8, :cond_5

    .line 85
    .line 86
    if-eq v12, v7, :cond_3

    .line 87
    .line 88
    if-eq v12, v6, :cond_1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    new-instance v0, La/d0u;

    .line 99
    .line 100
    invoke-direct {v0, p1, v5}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    new-instance v0, La/d0u;

    .line 112
    .line 113
    invoke-direct {v0, p1, v4}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    new-instance v0, La/b0u;

    .line 124
    .line 125
    invoke-direct {v0, p1}, La/b0u;-><init>(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    :goto_1
    new-instance v0, La/d0u;

    .line 130
    .line 131
    invoke-direct {v0, p1, v2}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 132
    .line 133
    .line 134
    :goto_2
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {v11}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_7

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_7
    invoke-virtual {p0}, La/icf;->e()Ljava/util/concurrent/Executor;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance v2, La/hcf;

    .line 151
    .line 152
    invoke-direct {v2, p0, v0, v1}, La/hcf;-><init>(La/icf;La/e0u;B)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 156
    .line 157
    .line 158
    :goto_3
    return-void

    .line 159
    :pswitch_0
    check-cast p0, La/dcf;

    .line 160
    .line 161
    check-cast v11, Landroid/os/CancellationSignal;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    instance-of v0, p1, La/qa3;

    .line 167
    .line 168
    if-eqz v0, :cond_8

    .line 169
    .line 170
    sget-object v0, La/ecf;->b:Ljava/util/Set;

    .line 171
    .line 172
    move-object v12, p1

    .line 173
    check-cast v12, La/qa3;

    .line 174
    .line 175
    invoke-virtual {v12}, La/qa3;->getStatusCode()I

    .line 176
    .line 177
    .line 178
    move-result v12

    .line 179
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_8

    .line 188
    .line 189
    move-object v0, v10

    .line 190
    goto :goto_4

    .line 191
    :cond_8
    move-object v0, v9

    .line 192
    :goto_4
    new-instance v12, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v13, "During begin sign in, failure response from one tap: "

    .line 195
    .line 196
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {v12, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    if-eq v12, v8, :cond_d

    .line 215
    .line 216
    if-eq v12, v7, :cond_b

    .line 217
    .line 218
    if-eq v12, v6, :cond_9

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_9
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-nez v0, :cond_a

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_a
    new-instance v0, La/d0u;

    .line 229
    .line 230
    invoke-direct {v0, p1, v5}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 231
    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_b
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-nez v0, :cond_c

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_c
    new-instance v0, La/d0u;

    .line 242
    .line 243
    invoke-direct {v0, p1, v4}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 244
    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_d
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_e

    .line 252
    .line 253
    new-instance v0, La/b0u;

    .line 254
    .line 255
    invoke-direct {v0, p1}, La/b0u;-><init>(Ljava/lang/CharSequence;)V

    .line 256
    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_e
    :goto_5
    new-instance v0, La/d0u;

    .line 260
    .line 261
    invoke-direct {v0, p1, v2}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 262
    .line 263
    .line 264
    :goto_6
    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-static {v11}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_f

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_f
    invoke-virtual {p0}, La/dcf;->e()Ljava/util/concurrent/Executor;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    new-instance v2, La/bcf;

    .line 281
    .line 282
    invoke-direct {v2, p0, v0, v1}, La/bcf;-><init>(La/dcf;La/e0u;B)V

    .line 283
    .line 284
    .line 285
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 286
    .line 287
    .line 288
    :goto_7
    return-void

    .line 289
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/mm30;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/hsj;

    .line 8
    .line 9
    iget-object v1, v0, La/mm30;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    iget-object v2, v0, La/mm30;->w:La/wkj;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v0, p0, v2, v3}, La/j16;->y(La/hsj;La/wkj;I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    check-cast v0, La/krd;

    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    check-cast p0, La/mrd;

    check-cast p1, Ljava/lang/Void;

    .line 557
    monitor-enter v0

    .line 558
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, v0, La/krd;->c:Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 559
    monitor-exit v0

    .line 560
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    .line 561
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/uq;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/g090;

    .line 10
    .line 11
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, v0, La/g090;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, La/gx3;

    .line 19
    .line 20
    invoke-virtual {v1, p0}, La/nuj0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-object p1

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p0

    .line 28
    :pswitch_0
    iget-object p1, p0, La/uq;->b:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v0, p1

    .line 31
    check-cast v0, La/esd;

    .line 32
    .line 33
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    const-string p1, "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"

    .line 38
    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    const/16 v3, 0x193

    .line 42
    .line 43
    const/16 v4, 0xc8

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_6

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ljava/net/HttpURLConnection;

    .line 58
    .line 59
    iput-object p0, v0, La/esd;->f:Ljava/net/HttpURLConnection;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 62
    .line 63
    .line 64
    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 65
    :try_start_2
    iget-object v7, v0, La/esd;->f:Ljava/net/HttpURLConnection;

    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 68
    .line 69
    .line 70
    move-result-object v7
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 71
    :try_start_3
    iget-object v8, v0, La/esd;->f:Ljava/net/HttpURLConnection;

    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v9
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 81
    if-ne v8, v4, :cond_0

    .line 82
    .line 83
    :try_start_4
    monitor-enter v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 84
    :try_start_5
    iput v2, v0, La/esd;->c:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 85
    .line 86
    :try_start_6
    monitor-exit v0

    .line 87
    iget-object v10, v0, La/esd;->p:La/msd;

    .line 88
    .line 89
    sget-object v11, La/msd;->f:Ljava/util/Date;

    .line 90
    .line 91
    invoke-virtual {v10, v5, v11}, La/msd;->e(ILjava/util/Date;)V

    .line 92
    .line 93
    .line 94
    iget-object v10, v0, La/esd;->f:Ljava/net/HttpURLConnection;

    .line 95
    .line 96
    invoke-virtual {v0, v10}, La/esd;->j(Ljava/net/HttpURLConnection;)La/grd;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    iput-object v10, v0, La/esd;->g:La/grd;

    .line 101
    .line 102
    invoke-virtual {v10}, La/grd;->f()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catchall_1
    move-exception v2

    .line 107
    :goto_0
    move-object v6, p0

    .line 108
    goto/16 :goto_a

    .line 109
    .line 110
    :catch_0
    move-exception v8

    .line 111
    goto/16 :goto_6

    .line 112
    .line 113
    :catchall_2
    move-exception v8

    .line 114
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 115
    :try_start_8
    throw v8
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 116
    :cond_0
    :goto_1
    invoke-virtual {v0, p0, v7}, La/esd;->b(Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 117
    .line 118
    .line 119
    monitor-enter v0

    .line 120
    :try_start_9
    iput-boolean v5, v0, La/esd;->b:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 121
    .line 122
    monitor-exit v0

    .line 123
    iget-boolean p0, v0, La/esd;->e:Z

    .line 124
    .line 125
    if-nez p0, :cond_1

    .line 126
    .line 127
    invoke-static {v8}, La/esd;->d(I)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_1
    move v1, v5

    .line 135
    :goto_2
    if-eqz v1, :cond_2

    .line 136
    .line 137
    new-instance p0, Ljava/util/Date;

    .line 138
    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 140
    .line 141
    .line 142
    move-result-wide v10

    .line 143
    invoke-direct {p0, v10, v11}, Ljava/util/Date;-><init>(J)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, p0}, La/esd;->k(Ljava/util/Date;)V

    .line 147
    .line 148
    .line 149
    :cond_2
    if-nez v1, :cond_5

    .line 150
    .line 151
    if-ne v8, v4, :cond_3

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_3
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    if-ne v8, v3, :cond_4

    .line 163
    .line 164
    iget-object p0, v0, La/esd;->f:Ljava/net/HttpURLConnection;

    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-static {p0}, La/esd;->f(Ljava/io/InputStream;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    :cond_4
    new-instance p1, La/chq;

    .line 175
    .line 176
    invoke-direct {p1, v8, v5, p0}, La/chq;-><init>(IILjava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :goto_3
    invoke-virtual {v0}, La/esd;->g()V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_9

    .line 183
    .line 184
    :cond_5
    :goto_4
    invoke-virtual {v0}, La/esd;->h()V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_9

    .line 188
    .line 189
    :catchall_3
    move-exception p0

    .line 190
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 191
    throw p0

    .line 192
    :catchall_4
    move-exception v2

    .line 193
    move-object v9, v6

    .line 194
    goto :goto_0

    .line 195
    :catch_1
    move-exception v8

    .line 196
    move-object v9, v6

    .line 197
    goto :goto_6

    .line 198
    :catchall_5
    move-exception v2

    .line 199
    move-object v7, v6

    .line 200
    move-object v9, v7

    .line 201
    goto :goto_0

    .line 202
    :catch_2
    move-exception v8

    .line 203
    move-object v7, v6

    .line 204
    :goto_5
    move-object v9, v7

    .line 205
    goto :goto_6

    .line 206
    :catchall_6
    move-exception v2

    .line 207
    move-object v7, v6

    .line 208
    move-object v9, v7

    .line 209
    goto/16 :goto_a

    .line 210
    .line 211
    :catch_3
    move-exception v8

    .line 212
    move-object p0, v6

    .line 213
    move-object v7, p0

    .line 214
    goto :goto_5

    .line 215
    :cond_6
    :try_start_b
    new-instance v7, Ljava/io/IOException;

    .line 216
    .line 217
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-direct {v7, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    throw v7
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 225
    :goto_6
    :try_start_c
    iget-boolean v10, v0, La/esd;->e:Z

    .line 226
    .line 227
    if-eqz v10, :cond_7

    .line 228
    .line 229
    monitor-enter v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 230
    :try_start_d
    iput v2, v0, La/esd;->c:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 231
    .line 232
    :try_start_e
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 233
    goto :goto_7

    .line 234
    :catchall_7
    move-exception v2

    .line 235
    :try_start_f
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 236
    :try_start_10
    throw v2

    .line 237
    :cond_7
    const-string v2, "FirebaseRemoteConfig"

    .line 238
    .line 239
    const-string v10, "Exception connecting to real-time RC backend. Retrying the connection..."

    .line 240
    .line 241
    invoke-static {v2, v10, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 242
    .line 243
    .line 244
    :goto_7
    invoke-virtual {v0, p0, v7}, La/esd;->b(Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 245
    .line 246
    .line 247
    monitor-enter v0

    .line 248
    :try_start_11
    iput-boolean v5, v0, La/esd;->b:Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 249
    .line 250
    monitor-exit v0

    .line 251
    iget-boolean p0, v0, La/esd;->e:Z

    .line 252
    .line 253
    if-nez p0, :cond_8

    .line 254
    .line 255
    if-eqz v9, :cond_9

    .line 256
    .line 257
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    invoke-static {p0}, La/esd;->d(I)Z

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    if-eqz p0, :cond_8

    .line 266
    .line 267
    goto :goto_8

    .line 268
    :cond_8
    move v1, v5

    .line 269
    :cond_9
    :goto_8
    if-eqz v1, :cond_a

    .line 270
    .line 271
    new-instance p0, Ljava/util/Date;

    .line 272
    .line 273
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 274
    .line 275
    .line 276
    move-result-wide v7

    .line 277
    invoke-direct {p0, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, p0}, La/esd;->k(Ljava/util/Date;)V

    .line 281
    .line 282
    .line 283
    :cond_a
    if-nez v1, :cond_5

    .line 284
    .line 285
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result p0

    .line 289
    if-ne p0, v4, :cond_b

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_b
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-ne p1, v3, :cond_c

    .line 305
    .line 306
    iget-object p0, v0, La/esd;->f:Ljava/net/HttpURLConnection;

    .line 307
    .line 308
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    invoke-static {p0}, La/esd;->f(Ljava/io/InputStream;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    :cond_c
    new-instance p1, La/chq;

    .line 317
    .line 318
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    invoke-direct {p1, v1, v5, p0}, La/chq;-><init>(IILjava/lang/String;)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_3

    .line 326
    .line 327
    :goto_9
    iput-object v6, v0, La/esd;->f:Ljava/net/HttpURLConnection;

    .line 328
    .line 329
    iput-object v6, v0, La/esd;->g:La/grd;

    .line 330
    .line 331
    invoke-static {v6}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    return-object p0

    .line 336
    :catchall_8
    move-exception p0

    .line 337
    :try_start_12
    monitor-exit v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 338
    throw p0

    .line 339
    :goto_a
    invoke-virtual {v0, v6, v7}, La/esd;->b(Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 340
    .line 341
    .line 342
    monitor-enter v0

    .line 343
    :try_start_13
    iput-boolean v5, v0, La/esd;->b:Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 344
    .line 345
    monitor-exit v0

    .line 346
    iget-boolean p0, v0, La/esd;->e:Z

    .line 347
    .line 348
    if-nez p0, :cond_d

    .line 349
    .line 350
    if-eqz v9, :cond_e

    .line 351
    .line 352
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result p0

    .line 356
    invoke-static {p0}, La/esd;->d(I)Z

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    if-eqz p0, :cond_d

    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_d
    move v1, v5

    .line 364
    :cond_e
    :goto_b
    if-eqz v1, :cond_f

    .line 365
    .line 366
    new-instance p0, Ljava/util/Date;

    .line 367
    .line 368
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 369
    .line 370
    .line 371
    move-result-wide v6

    .line 372
    invoke-direct {p0, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, p0}, La/esd;->k(Ljava/util/Date;)V

    .line 376
    .line 377
    .line 378
    :cond_f
    if-nez v1, :cond_11

    .line 379
    .line 380
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 381
    .line 382
    .line 383
    move-result p0

    .line 384
    if-eq p0, v4, :cond_11

    .line 385
    .line 386
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result p1

    .line 398
    if-ne p1, v3, :cond_10

    .line 399
    .line 400
    iget-object p0, v0, La/esd;->f:Ljava/net/HttpURLConnection;

    .line 401
    .line 402
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    invoke-static {p0}, La/esd;->f(Ljava/io/InputStream;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    :cond_10
    new-instance p1, La/chq;

    .line 411
    .line 412
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    invoke-direct {p1, v1, v5, p0}, La/chq;-><init>(IILjava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0}, La/esd;->g()V

    .line 420
    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_11
    invoke-virtual {v0}, La/esd;->h()V

    .line 424
    .line 425
    .line 426
    :goto_c
    throw v2

    .line 427
    :catchall_9
    move-exception p0

    .line 428
    :try_start_14
    monitor-exit v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 429
    throw p0

    .line 430
    :pswitch_1
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, La/rrd;

    .line 433
    .line 434
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast p0, Ljava/util/HashMap;

    .line 437
    .line 438
    const-wide/16 v1, 0x0

    .line 439
    .line 440
    invoke-virtual {v0, p1, v1, v2, p0}, La/rrd;->e(Lcom/google/android/gms/tasks/Task;JLjava/util/HashMap;)Lcom/google/android/gms/tasks/Task;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    return-object p0

    .line 445
    :pswitch_2
    iget-object v0, p0, La/uq;->b:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v0, La/rrd;

    .line 448
    .line 449
    iget-object p0, p0, La/uq;->c:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast p0, Ljava/util/Date;

    .line 452
    .line 453
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    if-eqz v2, :cond_12

    .line 458
    .line 459
    iget-object v0, v0, La/rrd;->h:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, La/msd;

    .line 462
    .line 463
    iget-object v2, v0, La/msd;->b:Ljava/lang/Object;

    .line 464
    .line 465
    monitor-enter v2

    .line 466
    :try_start_15
    iget-object v0, v0, La/msd;->a:Landroid/content/SharedPreferences;

    .line 467
    .line 468
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    const-string v1, "last_fetch_status"

    .line 473
    .line 474
    const/4 v3, -0x1

    .line 475
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    const-string v1, "last_fetch_time_in_millis"

    .line 480
    .line 481
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 482
    .line 483
    .line 484
    move-result-wide v3

    .line 485
    invoke-interface {v0, v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 490
    .line 491
    .line 492
    monitor-exit v2

    .line 493
    goto :goto_d

    .line 494
    :catchall_a
    move-exception p0

    .line 495
    monitor-exit v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 496
    throw p0

    .line 497
    :cond_12
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    if-nez p0, :cond_13

    .line 502
    .line 503
    goto :goto_d

    .line 504
    :cond_13
    instance-of p0, p0, La/ahq;

    .line 505
    .line 506
    iget-object v0, v0, La/rrd;->h:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v0, La/msd;

    .line 509
    .line 510
    iget-object v2, v0, La/msd;->b:Ljava/lang/Object;

    .line 511
    .line 512
    if-eqz p0, :cond_14

    .line 513
    .line 514
    monitor-enter v2

    .line 515
    :try_start_16
    iget-object p0, v0, La/msd;->a:Landroid/content/SharedPreferences;

    .line 516
    .line 517
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 518
    .line 519
    .line 520
    move-result-object p0

    .line 521
    const-string v0, "last_fetch_status"

    .line 522
    .line 523
    const/4 v1, 0x2

    .line 524
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 525
    .line 526
    .line 527
    move-result-object p0

    .line 528
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 529
    .line 530
    .line 531
    monitor-exit v2

    .line 532
    goto :goto_d

    .line 533
    :catchall_b
    move-exception p0

    .line 534
    monitor-exit v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    .line 535
    throw p0

    .line 536
    :cond_14
    monitor-enter v2

    .line 537
    :try_start_17
    iget-object p0, v0, La/msd;->a:Landroid/content/SharedPreferences;

    .line 538
    .line 539
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 540
    .line 541
    .line 542
    move-result-object p0

    .line 543
    const-string v0, "last_fetch_status"

    .line 544
    .line 545
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 546
    .line 547
    .line 548
    move-result-object p0

    .line 549
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 550
    .line 551
    .line 552
    monitor-exit v2

    .line 553
    :goto_d
    return-object p1

    .line 554
    :catchall_c
    move-exception p0

    .line 555
    monitor-exit v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    .line 556
    throw p0

    .line 557
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public x0(La/pzu;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/uq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/uq;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/uq;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v1, La/udk;

    .line 13
    .line 14
    const-class v0, Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, La/pzu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/content/Context;

    .line 21
    .line 22
    iget-byte v0, v1, La/udk;->a:B

    .line 23
    .line 24
    const-string v1, ""

    .line 25
    .line 26
    packed-switch v0, :pswitch_data_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_0

    .line 48
    :pswitch_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v2, "android.hardware.type.television"

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    const-string v1, "tv"

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v2, "android.hardware.type.watch"

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    const-string v1, "watch"

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v2, "android.hardware.type.automotive"

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    const-string v1, "auto"

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    const/16 v2, 0x1a

    .line 96
    .line 97
    if-lt v0, v2, :cond_3

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const-string v0, "android.hardware.type.embedded"

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    const-string v1, "embedded"

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :pswitch_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_3

    .line 119
    .line 120
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    .line 121
    .line 122
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    goto :goto_0

    .line 127
    :pswitch_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-eqz p1, :cond_3

    .line 132
    .line 133
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 134
    .line 135
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    :cond_3
    :goto_0
    new-instance p1, La/e45;

    .line 140
    .line 141
    invoke-direct {p1, p0, v1}, La/e45;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object p1

    .line 145
    :pswitch_3
    check-cast v1, La/pfd;

    .line 146
    .line 147
    :try_start_0
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object p0, v1, La/pfd;->f:La/jgd;

    .line 151
    .line 152
    invoke-interface {p0, p1}, La/jgd;->x0(La/pzu;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 157
    .line 158
    .line 159
    return-object p0

    .line 160
    :catchall_0
    move-exception p0

    .line 161
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 162
    .line 163
    .line 164
    throw p0

    .line 165
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_3
    .end packed-switch

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    :pswitch_data_1
    .packed-switch 0x13
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

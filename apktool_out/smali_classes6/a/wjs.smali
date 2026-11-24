.class public final synthetic La/wjs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sis;

.field public final synthetic c:La/yks;


# direct methods
.method public synthetic constructor <init>(La/sis;La/yks;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wjs;->a:B

    iput-object p1, p0, La/wjs;->b:La/sis;

    iput-object p2, p0, La/wjs;->c:La/yks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wjs;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/wjs;->c:La/yks;

    .line 6
    .line 7
    iget-object v0, v0, La/wjs;->b:La/sis;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/oyg0;

    .line 15
    .line 16
    move-object/from16 v3, p2

    .line 17
    .line 18
    check-cast v3, La/njs;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast v0, La/kis;

    .line 27
    .line 28
    iget-boolean v1, v0, La/kis;->a:Z

    .line 29
    .line 30
    iget-object v0, v0, La/kis;->b:La/ch00;

    .line 31
    .line 32
    iget-object v4, v3, La/njs;->l:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    :goto_0
    move-object/from16 v16, v4

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->n0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    goto :goto_0

    .line 52
    :goto_1
    const/16 v47, -0x801

    .line 53
    .line 54
    const v48, 0xffff

    .line 55
    .line 56
    .line 57
    const-wide/16 v4, 0x0

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    const-wide/16 v9, 0x0

    .line 63
    .line 64
    const-wide/16 v11, 0x0

    .line 65
    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    const/4 v15, 0x0

    .line 69
    const/16 v17, 0x0

    .line 70
    .line 71
    const/16 v18, 0x0

    .line 72
    .line 73
    const/16 v19, 0x0

    .line 74
    .line 75
    const/16 v20, 0x0

    .line 76
    .line 77
    const/16 v21, 0x0

    .line 78
    .line 79
    const/16 v22, 0x0

    .line 80
    .line 81
    const/16 v23, 0x0

    .line 82
    .line 83
    const/16 v24, 0x0

    .line 84
    .line 85
    const/16 v25, 0x0

    .line 86
    .line 87
    const/16 v26, 0x0

    .line 88
    .line 89
    const/16 v27, 0x0

    .line 90
    .line 91
    const/16 v28, 0x0

    .line 92
    .line 93
    const/16 v29, 0x0

    .line 94
    .line 95
    const/16 v30, 0x0

    .line 96
    .line 97
    const/16 v31, 0x0

    .line 98
    .line 99
    const/16 v32, 0x0

    .line 100
    .line 101
    const/16 v33, 0x0

    .line 102
    .line 103
    const/16 v34, 0x0

    .line 104
    .line 105
    const/16 v35, 0x0

    .line 106
    .line 107
    const/16 v36, 0x0

    .line 108
    .line 109
    const/16 v37, 0x0

    .line 110
    .line 111
    const/16 v38, 0x0

    .line 112
    .line 113
    const/16 v39, 0x0

    .line 114
    .line 115
    const/16 v40, 0x0

    .line 116
    .line 117
    const/16 v41, 0x0

    .line 118
    .line 119
    const/16 v42, 0x0

    .line 120
    .line 121
    const/16 v43, 0x0

    .line 122
    .line 123
    const/16 v44, 0x0

    .line 124
    .line 125
    const/16 v45, 0x0

    .line 126
    .line 127
    const/16 v46, 0x0

    .line 128
    .line 129
    invoke-static/range {v3 .. v48}, La/njs;->a(La/njs;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;La/tf50;La/o49;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZLa/fsr;La/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;II)La/njs;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    iget-object v2, v2, La/yks;->o:La/vzg0;

    .line 134
    .line 135
    iget-object v0, v0, La/ch00;->a:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v2, v0, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object v3

    .line 145
    :pswitch_0
    move-object/from16 v1, p1

    .line 146
    .line 147
    check-cast v1, La/oyg0;

    .line 148
    .line 149
    move-object/from16 v3, p2

    .line 150
    .line 151
    check-cast v3, La/njs;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    check-cast v0, La/ois;

    .line 160
    .line 161
    iget-object v14, v0, La/ois;->a:La/tf50;

    .line 162
    .line 163
    const/16 v47, -0x201

    .line 164
    .line 165
    const v48, 0xffff

    .line 166
    .line 167
    .line 168
    const-wide/16 v4, 0x0

    .line 169
    .line 170
    const/4 v6, 0x0

    .line 171
    const/4 v7, 0x0

    .line 172
    const/4 v8, 0x0

    .line 173
    const-wide/16 v9, 0x0

    .line 174
    .line 175
    const-wide/16 v11, 0x0

    .line 176
    .line 177
    const/4 v13, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const/16 v18, 0x0

    .line 184
    .line 185
    const/16 v19, 0x0

    .line 186
    .line 187
    const/16 v20, 0x0

    .line 188
    .line 189
    const/16 v21, 0x0

    .line 190
    .line 191
    const/16 v22, 0x0

    .line 192
    .line 193
    const/16 v23, 0x0

    .line 194
    .line 195
    const/16 v24, 0x0

    .line 196
    .line 197
    const/16 v25, 0x0

    .line 198
    .line 199
    const/16 v26, 0x0

    .line 200
    .line 201
    const/16 v27, 0x0

    .line 202
    .line 203
    const/16 v28, 0x0

    .line 204
    .line 205
    const/16 v29, 0x0

    .line 206
    .line 207
    const/16 v30, 0x0

    .line 208
    .line 209
    const/16 v31, 0x0

    .line 210
    .line 211
    const/16 v32, 0x0

    .line 212
    .line 213
    const/16 v33, 0x0

    .line 214
    .line 215
    const/16 v34, 0x0

    .line 216
    .line 217
    const/16 v35, 0x0

    .line 218
    .line 219
    const/16 v36, 0x0

    .line 220
    .line 221
    const/16 v37, 0x0

    .line 222
    .line 223
    const/16 v38, 0x0

    .line 224
    .line 225
    const/16 v39, 0x0

    .line 226
    .line 227
    const/16 v40, 0x0

    .line 228
    .line 229
    const/16 v41, 0x0

    .line 230
    .line 231
    const/16 v42, 0x0

    .line 232
    .line 233
    const/16 v43, 0x0

    .line 234
    .line 235
    const/16 v44, 0x0

    .line 236
    .line 237
    const/16 v45, 0x0

    .line 238
    .line 239
    const/16 v46, 0x0

    .line 240
    .line 241
    invoke-static/range {v3 .. v48}, La/njs;->a(La/njs;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;La/tf50;La/o49;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZLa/fsr;La/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;II)La/njs;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v1, v2, La/yks;->o:La/vzg0;

    .line 246
    .line 247
    const-string v2, "KEY_CURRENT_NAVIGATION_TAB"

    .line 248
    .line 249
    iget-object v3, v0, La/njs;->j:La/tf50;

    .line 250
    .line 251
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

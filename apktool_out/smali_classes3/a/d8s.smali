.class public final synthetic La/d8s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xvm0;

.field public final synthetic c:La/g9s;


# direct methods
.method public synthetic constructor <init>(La/xvm0;La/g9s;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/d8s;->a:B

    iput-object p1, p0, La/d8s;->b:La/xvm0;

    iput-object p2, p0, La/d8s;->c:La/g9s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/d8s;->a:B

    .line 4
    .line 5
    const-string v2, "KEY_SUB_GAME_ID"

    .line 6
    .line 7
    iget-object v3, v0, La/d8s;->c:La/g9s;

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
    move-object/from16 v4, p2

    .line 17
    .line 18
    check-cast v4, La/r7s;

    .line 19
    .line 20
    iget-object v0, v0, La/d8s;->b:La/xvm0;

    .line 21
    .line 22
    invoke-interface {v0}, La/xvm0;->getId()J

    .line 23
    .line 24
    .line 25
    move-result-wide v12

    .line 26
    const/16 v55, -0x21

    .line 27
    .line 28
    const v56, 0xffdff

    .line 29
    .line 30
    .line 31
    const-wide/16 v5, 0x0

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const-wide/16 v10, 0x0

    .line 37
    .line 38
    const/4 v14, 0x0

    .line 39
    const/4 v15, 0x0

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    const/16 v17, 0x0

    .line 43
    .line 44
    const/16 v18, 0x0

    .line 45
    .line 46
    const/16 v19, 0x0

    .line 47
    .line 48
    const/16 v20, 0x0

    .line 49
    .line 50
    const/16 v21, 0x0

    .line 51
    .line 52
    const/16 v22, 0x0

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
    const/16 v43, 0x0

    .line 95
    .line 96
    const/16 v44, 0x0

    .line 97
    .line 98
    const/16 v46, 0x0

    .line 99
    .line 100
    const/16 v47, 0x0

    .line 101
    .line 102
    const/16 v48, 0x0

    .line 103
    .line 104
    const/16 v49, 0x0

    .line 105
    .line 106
    const/16 v50, 0x0

    .line 107
    .line 108
    const/16 v51, 0x0

    .line 109
    .line 110
    const/16 v52, 0x0

    .line 111
    .line 112
    const/16 v53, 0x0

    .line 113
    .line 114
    const/16 v54, 0x0

    .line 115
    .line 116
    move-object/from16 v45, v0

    .line 117
    .line 118
    invoke-static/range {v4 .. v56}, La/r7s;->a(La/r7s;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;Ljava/util/LinkedHashSet;La/py20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;La/fsr;ZZZZZZLjava/lang/Integer;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;ZII)La/r7s;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v1, v3, La/g9s;->o:La/vzg0;

    .line 123
    .line 124
    iget-wide v3, v0, La/r7s;->f:J

    .line 125
    .line 126
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_0
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, La/oyg0;

    .line 137
    .line 138
    move-object/from16 v4, p2

    .line 139
    .line 140
    check-cast v4, La/r7s;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v0, v0, La/d8s;->b:La/xvm0;

    .line 149
    .line 150
    invoke-interface {v0}, La/xvm0;->getId()J

    .line 151
    .line 152
    .line 153
    move-result-wide v12

    .line 154
    const/16 v55, -0x21

    .line 155
    .line 156
    const v56, 0xffdff

    .line 157
    .line 158
    .line 159
    const-wide/16 v5, 0x0

    .line 160
    .line 161
    const/4 v7, 0x0

    .line 162
    const/4 v8, 0x0

    .line 163
    const/4 v9, 0x0

    .line 164
    const-wide/16 v10, 0x0

    .line 165
    .line 166
    const/4 v14, 0x0

    .line 167
    const/4 v15, 0x0

    .line 168
    const/16 v16, 0x0

    .line 169
    .line 170
    const/16 v17, 0x0

    .line 171
    .line 172
    const/16 v18, 0x0

    .line 173
    .line 174
    const/16 v19, 0x0

    .line 175
    .line 176
    const/16 v20, 0x0

    .line 177
    .line 178
    const/16 v21, 0x0

    .line 179
    .line 180
    const/16 v22, 0x0

    .line 181
    .line 182
    const/16 v23, 0x0

    .line 183
    .line 184
    const/16 v24, 0x0

    .line 185
    .line 186
    const/16 v25, 0x0

    .line 187
    .line 188
    const/16 v26, 0x0

    .line 189
    .line 190
    const/16 v27, 0x0

    .line 191
    .line 192
    const/16 v28, 0x0

    .line 193
    .line 194
    const/16 v29, 0x0

    .line 195
    .line 196
    const/16 v30, 0x0

    .line 197
    .line 198
    const/16 v31, 0x0

    .line 199
    .line 200
    const/16 v32, 0x0

    .line 201
    .line 202
    const/16 v33, 0x0

    .line 203
    .line 204
    const/16 v34, 0x0

    .line 205
    .line 206
    const/16 v35, 0x0

    .line 207
    .line 208
    const/16 v36, 0x0

    .line 209
    .line 210
    const/16 v37, 0x0

    .line 211
    .line 212
    const/16 v38, 0x0

    .line 213
    .line 214
    const/16 v39, 0x0

    .line 215
    .line 216
    const/16 v40, 0x0

    .line 217
    .line 218
    const/16 v41, 0x0

    .line 219
    .line 220
    const/16 v42, 0x0

    .line 221
    .line 222
    const/16 v43, 0x0

    .line 223
    .line 224
    const/16 v44, 0x0

    .line 225
    .line 226
    const/16 v46, 0x0

    .line 227
    .line 228
    const/16 v47, 0x0

    .line 229
    .line 230
    const/16 v48, 0x0

    .line 231
    .line 232
    const/16 v49, 0x0

    .line 233
    .line 234
    const/16 v50, 0x0

    .line 235
    .line 236
    const/16 v51, 0x0

    .line 237
    .line 238
    const/16 v52, 0x0

    .line 239
    .line 240
    const/16 v53, 0x0

    .line 241
    .line 242
    const/16 v54, 0x0

    .line 243
    .line 244
    move-object/from16 v45, v0

    .line 245
    .line 246
    invoke-static/range {v4 .. v56}, La/r7s;->a(La/r7s;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;Ljava/util/LinkedHashSet;La/py20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;La/fsr;ZZZZZZLjava/lang/Integer;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;ZII)La/r7s;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iget-object v1, v3, La/g9s;->o:La/vzg0;

    .line 251
    .line 252
    iget-wide v3, v0, La/r7s;->f:J

    .line 253
    .line 254
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    return-object v0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

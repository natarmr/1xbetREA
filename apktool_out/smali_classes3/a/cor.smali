.class public final synthetic La/cor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xvm0;

.field public final synthetic c:La/spr;


# direct methods
.method public synthetic constructor <init>(La/xvm0;La/spr;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cor;->a:B

    iput-object p1, p0, La/cor;->b:La/xvm0;

    iput-object p2, p0, La/cor;->c:La/spr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cor;->a:B

    .line 4
    .line 5
    const-string v2, "KEY_SUB_GAME_ID"

    .line 6
    .line 7
    iget-object v3, v0, La/cor;->c:La/spr;

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
    check-cast v4, La/qnr;

    .line 19
    .line 20
    iget-object v0, v0, La/cor;->b:La/xvm0;

    .line 21
    .line 22
    invoke-interface {v0}, La/xvm0;->getId()J

    .line 23
    .line 24
    .line 25
    move-result-wide v12

    .line 26
    const/16 v53, -0x21

    .line 27
    .line 28
    const v54, 0x7ff7f

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
    const/16 v43, 0x0

    .line 93
    .line 94
    const/16 v44, 0x0

    .line 95
    .line 96
    const/16 v45, 0x0

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
    move-object/from16 v42, v0

    .line 113
    .line 114
    invoke-static/range {v4 .. v54}, La/qnr;->a(La/qnr;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;ZII)La/qnr;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v1, v3, La/spr;->o:La/vzg0;

    .line 119
    .line 120
    iget-wide v3, v0, La/qnr;->f:J

    .line 121
    .line 122
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_0
    move-object/from16 v1, p1

    .line 131
    .line 132
    check-cast v1, La/oyg0;

    .line 133
    .line 134
    move-object/from16 v4, p2

    .line 135
    .line 136
    check-cast v4, La/qnr;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, La/cor;->b:La/xvm0;

    .line 145
    .line 146
    invoke-interface {v0}, La/xvm0;->getId()J

    .line 147
    .line 148
    .line 149
    move-result-wide v12

    .line 150
    const/16 v53, -0x21

    .line 151
    .line 152
    const v54, 0x7ff7f

    .line 153
    .line 154
    .line 155
    const-wide/16 v5, 0x0

    .line 156
    .line 157
    const/4 v7, 0x0

    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    const-wide/16 v10, 0x0

    .line 161
    .line 162
    const/4 v14, 0x0

    .line 163
    const/4 v15, 0x0

    .line 164
    const/16 v16, 0x0

    .line 165
    .line 166
    const/16 v17, 0x0

    .line 167
    .line 168
    const/16 v18, 0x0

    .line 169
    .line 170
    const/16 v19, 0x0

    .line 171
    .line 172
    const/16 v20, 0x0

    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    const/16 v22, 0x0

    .line 177
    .line 178
    const/16 v23, 0x0

    .line 179
    .line 180
    const/16 v24, 0x0

    .line 181
    .line 182
    const/16 v25, 0x0

    .line 183
    .line 184
    const/16 v26, 0x0

    .line 185
    .line 186
    const/16 v27, 0x0

    .line 187
    .line 188
    const/16 v28, 0x0

    .line 189
    .line 190
    const/16 v29, 0x0

    .line 191
    .line 192
    const/16 v30, 0x0

    .line 193
    .line 194
    const/16 v31, 0x0

    .line 195
    .line 196
    const/16 v32, 0x0

    .line 197
    .line 198
    const/16 v33, 0x0

    .line 199
    .line 200
    const/16 v34, 0x0

    .line 201
    .line 202
    const/16 v35, 0x0

    .line 203
    .line 204
    const/16 v36, 0x0

    .line 205
    .line 206
    const/16 v37, 0x0

    .line 207
    .line 208
    const/16 v38, 0x0

    .line 209
    .line 210
    const/16 v39, 0x0

    .line 211
    .line 212
    const/16 v40, 0x0

    .line 213
    .line 214
    const/16 v41, 0x0

    .line 215
    .line 216
    const/16 v43, 0x0

    .line 217
    .line 218
    const/16 v44, 0x0

    .line 219
    .line 220
    const/16 v45, 0x0

    .line 221
    .line 222
    const/16 v46, 0x0

    .line 223
    .line 224
    const/16 v47, 0x0

    .line 225
    .line 226
    const/16 v48, 0x0

    .line 227
    .line 228
    const/16 v49, 0x0

    .line 229
    .line 230
    const/16 v50, 0x0

    .line 231
    .line 232
    const/16 v51, 0x0

    .line 233
    .line 234
    const/16 v52, 0x0

    .line 235
    .line 236
    move-object/from16 v42, v0

    .line 237
    .line 238
    invoke-static/range {v4 .. v54}, La/qnr;->a(La/qnr;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;ZII)La/qnr;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iget-object v1, v3, La/spr;->o:La/vzg0;

    .line 243
    .line 244
    iget-wide v3, v0, La/qnr;->f:J

    .line 245
    .line 246
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    return-object v0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

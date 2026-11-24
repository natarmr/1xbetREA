.class public final synthetic La/hks;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:La/yks;


# direct methods
.method public synthetic constructor <init>(ZLa/yks;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hks;->a:B

    iput-boolean p1, p0, La/hks;->b:Z

    iput-object p2, p0, La/hks;->c:La/yks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hks;->a:B

    .line 4
    .line 5
    const-string v2, "KEY_CURRENT_NAVIGATION_TAB"

    .line 6
    .line 7
    iget-object v3, v0, La/hks;->c:La/yks;

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
    check-cast v4, La/njs;

    .line 19
    .line 20
    iget-boolean v0, v0, La/hks;->b:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    sget-object v1, La/tf50;->a:La/tf50;

    .line 25
    .line 26
    :goto_0
    move-object v15, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-object v1, v4, La/njs;->j:La/tf50;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    const v48, -0x4000201

    .line 32
    .line 33
    .line 34
    const v49, 0xffff

    .line 35
    .line 36
    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x0

    .line 42
    const-wide/16 v10, 0x0

    .line 43
    .line 44
    const-wide/16 v12, 0x0

    .line 45
    .line 46
    const/4 v14, 0x0

    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/16 v17, 0x0

    .line 50
    .line 51
    const/16 v18, 0x0

    .line 52
    .line 53
    const/16 v19, 0x0

    .line 54
    .line 55
    const/16 v20, 0x0

    .line 56
    .line 57
    const/16 v21, 0x0

    .line 58
    .line 59
    const/16 v22, 0x0

    .line 60
    .line 61
    const/16 v23, 0x0

    .line 62
    .line 63
    const/16 v24, 0x0

    .line 64
    .line 65
    const/16 v25, 0x0

    .line 66
    .line 67
    const/16 v26, 0x0

    .line 68
    .line 69
    const/16 v27, 0x0

    .line 70
    .line 71
    const/16 v28, 0x0

    .line 72
    .line 73
    const/16 v29, 0x0

    .line 74
    .line 75
    const/16 v30, 0x0

    .line 76
    .line 77
    const/16 v31, 0x0

    .line 78
    .line 79
    const/16 v33, 0x0

    .line 80
    .line 81
    const/16 v34, 0x0

    .line 82
    .line 83
    const/16 v35, 0x0

    .line 84
    .line 85
    const/16 v36, 0x0

    .line 86
    .line 87
    const/16 v37, 0x0

    .line 88
    .line 89
    const/16 v38, 0x0

    .line 90
    .line 91
    const/16 v39, 0x0

    .line 92
    .line 93
    const/16 v40, 0x0

    .line 94
    .line 95
    const/16 v41, 0x0

    .line 96
    .line 97
    const/16 v42, 0x0

    .line 98
    .line 99
    const/16 v43, 0x0

    .line 100
    .line 101
    const/16 v44, 0x0

    .line 102
    .line 103
    const/16 v45, 0x0

    .line 104
    .line 105
    const/16 v46, 0x0

    .line 106
    .line 107
    const/16 v47, 0x0

    .line 108
    .line 109
    move/from16 v32, v0

    .line 110
    .line 111
    invoke-static/range {v4 .. v49}, La/njs;->a(La/njs;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;La/tf50;La/o49;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZLa/fsr;La/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;II)La/njs;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-eqz v32, :cond_1

    .line 116
    .line 117
    iget-object v1, v3, La/yks;->o:La/vzg0;

    .line 118
    .line 119
    iget-object v3, v0, La/njs;->j:La/tf50;

    .line 120
    .line 121
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_1
    return-object v0

    .line 125
    :pswitch_0
    move-object/from16 v1, p1

    .line 126
    .line 127
    check-cast v1, La/oyg0;

    .line 128
    .line 129
    move-object/from16 v4, p2

    .line 130
    .line 131
    check-cast v4, La/njs;

    .line 132
    .line 133
    iget-boolean v0, v0, La/hks;->b:Z

    .line 134
    .line 135
    if-eqz v0, :cond_2

    .line 136
    .line 137
    sget-object v1, La/tf50;->a:La/tf50;

    .line 138
    .line 139
    :goto_2
    move-object v15, v1

    .line 140
    goto :goto_3

    .line 141
    :cond_2
    iget-object v1, v4, La/njs;->j:La/tf50;

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :goto_3
    const v48, -0x2000201

    .line 145
    .line 146
    .line 147
    const v49, 0xffff

    .line 148
    .line 149
    .line 150
    const-wide/16 v5, 0x0

    .line 151
    .line 152
    const/4 v7, 0x0

    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v9, 0x0

    .line 155
    const-wide/16 v10, 0x0

    .line 156
    .line 157
    const-wide/16 v12, 0x0

    .line 158
    .line 159
    const/4 v14, 0x0

    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    const/16 v18, 0x0

    .line 165
    .line 166
    const/16 v19, 0x0

    .line 167
    .line 168
    const/16 v20, 0x0

    .line 169
    .line 170
    const/16 v21, 0x0

    .line 171
    .line 172
    const/16 v22, 0x0

    .line 173
    .line 174
    const/16 v23, 0x0

    .line 175
    .line 176
    const/16 v24, 0x0

    .line 177
    .line 178
    const/16 v25, 0x0

    .line 179
    .line 180
    const/16 v26, 0x0

    .line 181
    .line 182
    const/16 v27, 0x0

    .line 183
    .line 184
    const/16 v28, 0x0

    .line 185
    .line 186
    const/16 v29, 0x0

    .line 187
    .line 188
    const/16 v30, 0x0

    .line 189
    .line 190
    const/16 v32, 0x0

    .line 191
    .line 192
    const/16 v33, 0x0

    .line 193
    .line 194
    const/16 v34, 0x0

    .line 195
    .line 196
    const/16 v35, 0x0

    .line 197
    .line 198
    const/16 v36, 0x0

    .line 199
    .line 200
    const/16 v37, 0x0

    .line 201
    .line 202
    const/16 v38, 0x0

    .line 203
    .line 204
    const/16 v39, 0x0

    .line 205
    .line 206
    const/16 v40, 0x0

    .line 207
    .line 208
    const/16 v41, 0x0

    .line 209
    .line 210
    const/16 v42, 0x0

    .line 211
    .line 212
    const/16 v43, 0x0

    .line 213
    .line 214
    const/16 v44, 0x0

    .line 215
    .line 216
    const/16 v45, 0x0

    .line 217
    .line 218
    const/16 v46, 0x0

    .line 219
    .line 220
    const/16 v47, 0x0

    .line 221
    .line 222
    move/from16 v31, v0

    .line 223
    .line 224
    invoke-static/range {v4 .. v49}, La/njs;->a(La/njs;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;La/tf50;La/o49;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZLa/fsr;La/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;II)La/njs;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-eqz v31, :cond_3

    .line 229
    .line 230
    iget-object v1, v3, La/yks;->o:La/vzg0;

    .line 231
    .line 232
    iget-object v3, v0, La/njs;->j:La/tf50;

    .line 233
    .line 234
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_3
    return-object v0

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

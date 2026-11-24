.class public final La/vlu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:I

.field public e:I

.field public final f:La/iky;

.field public final g:La/m3e;

.field public h:I

.field public i:I

.field public j:I

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Ljava/lang/String;

.field public n:I

.field public final o:Landroid/content/Context;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 5

    .line 1
    const-string v0, "Error parsing XML resource"

    .line 2
    .line 3
    const-string v1, "ViewTransition"

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    iput v2, p0, La/vlu0;->b:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iput-boolean v3, p0, La/vlu0;->c:Z

    .line 13
    .line 14
    iput v3, p0, La/vlu0;->d:I

    .line 15
    .line 16
    iput v2, p0, La/vlu0;->h:I

    .line 17
    .line 18
    iput v2, p0, La/vlu0;->i:I

    .line 19
    .line 20
    iput v3, p0, La/vlu0;->l:I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    iput-object v3, p0, La/vlu0;->m:Ljava/lang/String;

    .line 24
    .line 25
    iput v2, p0, La/vlu0;->n:I

    .line 26
    .line 27
    iput v2, p0, La/vlu0;->p:I

    .line 28
    .line 29
    iput v2, p0, La/vlu0;->q:I

    .line 30
    .line 31
    iput v2, p0, La/vlu0;->r:I

    .line 32
    .line 33
    iput v2, p0, La/vlu0;->s:I

    .line 34
    .line 35
    iput v2, p0, La/vlu0;->t:I

    .line 36
    .line 37
    iput v2, p0, La/vlu0;->u:I

    .line 38
    .line 39
    iput-object p1, p0, La/vlu0;->o:Landroid/content/Context;

    .line 40
    .line 41
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    :goto_0
    const/4 v3, 0x1

    .line 46
    if-eq v2, v3, :cond_4

    .line 47
    .line 48
    const/4 v3, 0x2

    .line 49
    if-eq v2, v3, :cond_1

    .line 50
    .line 51
    const/4 v3, 0x3

    .line 52
    if-eq v2, v3, :cond_0

    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    goto/16 :goto_6

    .line 67
    .line 68
    :catch_0
    move-exception p0

    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :catch_1
    move-exception p0

    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    sparse-switch v3, :sswitch_data_0

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :sswitch_0
    const-string v3, "CustomAttribute"

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :sswitch_1
    const-string v3, "CustomMethod"

    .line 96
    .line 97
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_2

    .line 102
    .line 103
    :goto_1
    iget-object v2, p0, La/vlu0;->g:La/m3e;

    .line 104
    .line 105
    iget-object v2, v2, La/m3e;->g:Ljava/util/HashMap;

    .line 106
    .line 107
    invoke-static {p1, p2, v2}, La/x2e;->d(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Ljava/util/HashMap;)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :sswitch_2
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_2

    .line 116
    .line 117
    invoke-virtual {p0, p1, p2}, La/vlu0;->d(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :sswitch_3
    const-string v3, "KeyFrameSet"

    .line 122
    .line 123
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_2

    .line 128
    .line 129
    new-instance v2, La/iky;

    .line 130
    .line 131
    invoke-direct {v2, p1, p2}, La/iky;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 132
    .line 133
    .line 134
    iput-object v2, p0, La/vlu0;->f:La/iky;

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :sswitch_4
    const-string v3, "ConstraintOverride"

    .line 138
    .line 139
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_2

    .line 144
    .line 145
    invoke-static {p1, p2}, La/r3e;->d(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)La/m3e;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    iput-object v2, p0, La/vlu0;->g:La/m3e;

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_2
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-static {}, La/ozb;->R()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v4, " unknown tag "

    .line 165
    .line 166
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    new-instance v2, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v3, ".xml:"

    .line 185
    .line 186
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    :cond_3
    :goto_3
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 204
    .line 205
    .line 206
    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :goto_4
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 210
    .line 211
    .line 212
    goto :goto_6

    .line 213
    :goto_5
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 214
    .line 215
    .line 216
    :cond_4
    :goto_6
    return-void

    .line 217
    :sswitch_data_0
    .sparse-switch
        -0x74f4db17 -> :sswitch_4
        -0x49df9cec -> :sswitch_3
        0x3b205fa -> :sswitch_2
        0x15d883d2 -> :sswitch_1
        0x6acd460b -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final varargs a(La/vkr0;Landroidx/constraintlayout/motion/widget/MotionLayout;ILa/r3e;[Landroid/view/View;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    const/4 v5, -0x1

    .line 12
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    iget-boolean v7, v0, La/vlu0;->c:Z

    .line 17
    .line 18
    if-eqz v7, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget v7, v0, La/vlu0;->e:I

    .line 22
    .line 23
    iget-object v9, v0, La/vlu0;->f:La/iky;

    .line 24
    .line 25
    const/4 v10, 0x2

    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x1

    .line 28
    if-ne v7, v10, :cond_c

    .line 29
    .line 30
    aget-object v2, v4, v11

    .line 31
    .line 32
    new-instance v15, La/ds40;

    .line 33
    .line 34
    invoke-direct {v15, v2}, La/ds40;-><init>(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v15, La/ds40;->f:La/pt40;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    iput v4, v3, La/pt40;->c:F

    .line 41
    .line 42
    iput v4, v3, La/pt40;->d:F

    .line 43
    .line 44
    iput-boolean v12, v15, La/ds40;->H:Z

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/view/View;->getX()F

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    invoke-virtual {v2}, Landroid/view/View;->getY()F

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    int-to-float v13, v13

    .line 59
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    int-to-float v14, v14

    .line 64
    invoke-virtual {v3, v7, v11, v13, v14}, La/pt40;->d(FFFF)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/view/View;->getX()F

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {v2}, Landroid/view/View;->getY()F

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    int-to-float v11, v11

    .line 80
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    int-to-float v13, v13

    .line 85
    iget-object v14, v15, La/ds40;->g:La/pt40;

    .line 86
    .line 87
    invoke-virtual {v14, v3, v7, v11, v13}, La/pt40;->d(FFFF)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroid/view/View;->getX()F

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Landroid/view/View;->getY()F

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    iget-object v7, v15, La/ds40;->h:La/as40;

    .line 107
    .line 108
    iput v3, v7, La/as40;->c:I

    .line 109
    .line 110
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_1

    .line 115
    .line 116
    move v3, v4

    .line 117
    goto :goto_0

    .line 118
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    :goto_0
    iput v3, v7, La/as40;->e:F

    .line 123
    .line 124
    invoke-virtual {v2}, Landroid/view/View;->getElevation()F

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    iput v3, v7, La/as40;->f:F

    .line 129
    .line 130
    invoke-virtual {v2}, Landroid/view/View;->getRotation()F

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    iput v3, v7, La/as40;->g:F

    .line 135
    .line 136
    invoke-virtual {v2}, Landroid/view/View;->getRotationX()F

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    iput v3, v7, La/as40;->h:F

    .line 141
    .line 142
    invoke-virtual {v2}, Landroid/view/View;->getRotationY()F

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    iput v3, v7, La/as40;->a:F

    .line 147
    .line 148
    invoke-virtual {v2}, Landroid/view/View;->getScaleX()F

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    iput v3, v7, La/as40;->i:F

    .line 153
    .line 154
    invoke-virtual {v2}, Landroid/view/View;->getScaleY()F

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    iput v3, v7, La/as40;->j:F

    .line 159
    .line 160
    invoke-virtual {v2}, Landroid/view/View;->getPivotX()F

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    iput v3, v7, La/as40;->k:F

    .line 165
    .line 166
    invoke-virtual {v2}, Landroid/view/View;->getPivotY()F

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    iput v3, v7, La/as40;->l:F

    .line 171
    .line 172
    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    iput v3, v7, La/as40;->m:F

    .line 177
    .line 178
    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    iput v3, v7, La/as40;->n:F

    .line 183
    .line 184
    invoke-virtual {v2}, Landroid/view/View;->getTranslationZ()F

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    iput v3, v7, La/as40;->o:F

    .line 189
    .line 190
    invoke-virtual {v2}, Landroid/view/View;->getX()F

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Landroid/view/View;->getY()F

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    iget-object v7, v15, La/ds40;->i:La/as40;

    .line 207
    .line 208
    iput v3, v7, La/as40;->c:I

    .line 209
    .line 210
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_2

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    :goto_1
    iput v4, v7, La/as40;->e:F

    .line 222
    .line 223
    invoke-virtual {v2}, Landroid/view/View;->getElevation()F

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    iput v3, v7, La/as40;->f:F

    .line 228
    .line 229
    invoke-virtual {v2}, Landroid/view/View;->getRotation()F

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    iput v3, v7, La/as40;->g:F

    .line 234
    .line 235
    invoke-virtual {v2}, Landroid/view/View;->getRotationX()F

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    iput v3, v7, La/as40;->h:F

    .line 240
    .line 241
    invoke-virtual {v2}, Landroid/view/View;->getRotationY()F

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    iput v3, v7, La/as40;->a:F

    .line 246
    .line 247
    invoke-virtual {v2}, Landroid/view/View;->getScaleX()F

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    iput v3, v7, La/as40;->i:F

    .line 252
    .line 253
    invoke-virtual {v2}, Landroid/view/View;->getScaleY()F

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    iput v3, v7, La/as40;->j:F

    .line 258
    .line 259
    invoke-virtual {v2}, Landroid/view/View;->getPivotX()F

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    iput v3, v7, La/as40;->k:F

    .line 264
    .line 265
    invoke-virtual {v2}, Landroid/view/View;->getPivotY()F

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    iput v3, v7, La/as40;->l:F

    .line 270
    .line 271
    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    iput v3, v7, La/as40;->m:F

    .line 276
    .line 277
    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    iput v3, v7, La/as40;->n:F

    .line 282
    .line 283
    invoke-virtual {v2}, Landroid/view/View;->getTranslationZ()F

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    iput v2, v7, La/as40;->o:F

    .line 288
    .line 289
    iget-object v2, v9, La/iky;->a:Ljava/util/HashMap;

    .line 290
    .line 291
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    check-cast v2, Ljava/util/ArrayList;

    .line 296
    .line 297
    if-eqz v2, :cond_3

    .line 298
    .line 299
    iget-object v3, v15, La/ds40;->w:Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 302
    .line 303
    .line 304
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 313
    .line 314
    .line 315
    move-result-wide v6

    .line 316
    invoke-virtual {v15, v2, v3, v6, v7}, La/ds40;->g(IIJ)V

    .line 317
    .line 318
    .line 319
    new-instance v13, La/ulu0;

    .line 320
    .line 321
    iget v2, v0, La/vlu0;->h:I

    .line 322
    .line 323
    iget v3, v0, La/vlu0;->i:I

    .line 324
    .line 325
    iget v4, v0, La/vlu0;->b:I

    .line 326
    .line 327
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    iget v6, v0, La/vlu0;->l:I

    .line 332
    .line 333
    const/4 v7, -0x2

    .line 334
    if-eq v6, v7, :cond_b

    .line 335
    .line 336
    if-eq v6, v5, :cond_a

    .line 337
    .line 338
    if-eqz v6, :cond_9

    .line 339
    .line 340
    if-eq v6, v12, :cond_8

    .line 341
    .line 342
    if-eq v6, v10, :cond_7

    .line 343
    .line 344
    const/4 v1, 0x4

    .line 345
    if-eq v6, v1, :cond_6

    .line 346
    .line 347
    const/4 v1, 0x5

    .line 348
    if-eq v6, v1, :cond_5

    .line 349
    .line 350
    const/4 v1, 0x6

    .line 351
    if-eq v6, v1, :cond_4

    .line 352
    .line 353
    const/16 v19, 0x0

    .line 354
    .line 355
    goto :goto_3

    .line 356
    :cond_4
    new-instance v8, Landroid/view/animation/AnticipateInterpolator;

    .line 357
    .line 358
    invoke-direct {v8}, Landroid/view/animation/AnticipateInterpolator;-><init>()V

    .line 359
    .line 360
    .line 361
    :goto_2
    move-object/from16 v19, v8

    .line 362
    .line 363
    goto :goto_3

    .line 364
    :cond_5
    new-instance v8, Landroid/view/animation/OvershootInterpolator;

    .line 365
    .line 366
    invoke-direct {v8}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    .line 367
    .line 368
    .line 369
    goto :goto_2

    .line 370
    :cond_6
    new-instance v8, Landroid/view/animation/BounceInterpolator;

    .line 371
    .line 372
    invoke-direct {v8}, Landroid/view/animation/BounceInterpolator;-><init>()V

    .line 373
    .line 374
    .line 375
    goto :goto_2

    .line 376
    :cond_7
    new-instance v8, Landroid/view/animation/DecelerateInterpolator;

    .line 377
    .line 378
    invoke-direct {v8}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 379
    .line 380
    .line 381
    goto :goto_2

    .line 382
    :cond_8
    new-instance v8, Landroid/view/animation/AccelerateInterpolator;

    .line 383
    .line 384
    invoke-direct {v8}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 385
    .line 386
    .line 387
    goto :goto_2

    .line 388
    :cond_9
    new-instance v8, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 389
    .line 390
    invoke-direct {v8}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 391
    .line 392
    .line 393
    goto :goto_2

    .line 394
    :cond_a
    iget-object v1, v0, La/vlu0;->m:Ljava/lang/String;

    .line 395
    .line 396
    invoke-static {v1}, La/fhn;->f(Ljava/lang/String;)La/fhn;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    new-instance v8, La/cs40;

    .line 401
    .line 402
    invoke-direct {v8, v1, v10}, La/cs40;-><init>(Ljava/lang/Object;B)V

    .line 403
    .line 404
    .line 405
    goto :goto_2

    .line 406
    :cond_b
    iget v5, v0, La/vlu0;->n:I

    .line 407
    .line 408
    invoke-static {v1, v5}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    goto :goto_2

    .line 413
    :goto_3
    iget v1, v0, La/vlu0;->p:I

    .line 414
    .line 415
    iget v0, v0, La/vlu0;->q:I

    .line 416
    .line 417
    move-object/from16 v14, p1

    .line 418
    .line 419
    move/from16 v21, v0

    .line 420
    .line 421
    move/from16 v20, v1

    .line 422
    .line 423
    move/from16 v16, v2

    .line 424
    .line 425
    move/from16 v17, v3

    .line 426
    .line 427
    move/from16 v18, v4

    .line 428
    .line 429
    invoke-direct/range {v13 .. v21}, La/ulu0;-><init>(La/vkr0;La/ds40;IIILandroid/view/animation/Interpolator;II)V

    .line 430
    .line 431
    .line 432
    return-void

    .line 433
    :cond_c
    iget-object v10, v0, La/vlu0;->g:La/m3e;

    .line 434
    .line 435
    if-ne v7, v12, :cond_12

    .line 436
    .line 437
    invoke-virtual {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getConstraintSetIds()[I

    .line 438
    .line 439
    .line 440
    move-result-object v7

    .line 441
    move v12, v11

    .line 442
    :goto_4
    array-length v13, v7

    .line 443
    if-ge v12, v13, :cond_12

    .line 444
    .line 445
    aget v13, v7, v12

    .line 446
    .line 447
    if-ne v13, v2, :cond_d

    .line 448
    .line 449
    goto :goto_7

    .line 450
    :cond_d
    iget-object v14, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 451
    .line 452
    if-nez v14, :cond_e

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    goto :goto_5

    .line 456
    :cond_e
    invoke-virtual {v14, v13}, La/wt40;->b(I)La/r3e;

    .line 457
    .line 458
    .line 459
    move-result-object v13

    .line 460
    :goto_5
    array-length v14, v4

    .line 461
    move v15, v11

    .line 462
    :goto_6
    if-ge v15, v14, :cond_11

    .line 463
    .line 464
    aget-object v16, v4, v15

    .line 465
    .line 466
    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getId()I

    .line 467
    .line 468
    .line 469
    move-result v8

    .line 470
    invoke-virtual {v13, v8}, La/r3e;->i(I)La/m3e;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    if-eqz v10, :cond_10

    .line 475
    .line 476
    iget-object v11, v10, La/m3e;->h:La/l3e;

    .line 477
    .line 478
    if-eqz v11, :cond_f

    .line 479
    .line 480
    invoke-virtual {v11, v8}, La/l3e;->e(La/m3e;)V

    .line 481
    .line 482
    .line 483
    :cond_f
    iget-object v8, v8, La/m3e;->g:Ljava/util/HashMap;

    .line 484
    .line 485
    iget-object v11, v10, La/m3e;->g:Ljava/util/HashMap;

    .line 486
    .line 487
    invoke-virtual {v8, v11}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 488
    .line 489
    .line 490
    :cond_10
    add-int/lit8 v15, v15, 0x1

    .line 491
    .line 492
    const/4 v11, 0x0

    .line 493
    goto :goto_6

    .line 494
    :cond_11
    :goto_7
    add-int/lit8 v12, v12, 0x1

    .line 495
    .line 496
    const/4 v11, 0x0

    .line 497
    goto :goto_4

    .line 498
    :cond_12
    new-instance v7, La/r3e;

    .line 499
    .line 500
    invoke-direct {v7}, La/r3e;-><init>()V

    .line 501
    .line 502
    .line 503
    iget-object v8, v7, La/r3e;->g:Ljava/util/HashMap;

    .line 504
    .line 505
    invoke-virtual {v8}, Ljava/util/HashMap;->clear()V

    .line 506
    .line 507
    .line 508
    iget-object v11, v3, La/r3e;->g:Ljava/util/HashMap;

    .line 509
    .line 510
    invoke-virtual {v11}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 511
    .line 512
    .line 513
    move-result-object v11

    .line 514
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v11

    .line 518
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v12

    .line 522
    if-eqz v12, :cond_14

    .line 523
    .line 524
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v12

    .line 528
    check-cast v12, Ljava/lang/Integer;

    .line 529
    .line 530
    iget-object v13, v3, La/r3e;->g:Ljava/util/HashMap;

    .line 531
    .line 532
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v13

    .line 536
    check-cast v13, La/m3e;

    .line 537
    .line 538
    if-nez v13, :cond_13

    .line 539
    .line 540
    goto :goto_8

    .line 541
    :cond_13
    invoke-virtual {v13}, La/m3e;->b()La/m3e;

    .line 542
    .line 543
    .line 544
    move-result-object v13

    .line 545
    invoke-virtual {v8, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    goto :goto_8

    .line 549
    :cond_14
    array-length v8, v4

    .line 550
    const/4 v11, 0x0

    .line 551
    :goto_9
    if-ge v11, v8, :cond_17

    .line 552
    .line 553
    aget-object v12, v4, v11

    .line 554
    .line 555
    invoke-virtual {v12}, Landroid/view/View;->getId()I

    .line 556
    .line 557
    .line 558
    move-result v12

    .line 559
    invoke-virtual {v7, v12}, La/r3e;->i(I)La/m3e;

    .line 560
    .line 561
    .line 562
    move-result-object v12

    .line 563
    if-eqz v10, :cond_16

    .line 564
    .line 565
    iget-object v13, v10, La/m3e;->h:La/l3e;

    .line 566
    .line 567
    if-eqz v13, :cond_15

    .line 568
    .line 569
    invoke-virtual {v13, v12}, La/l3e;->e(La/m3e;)V

    .line 570
    .line 571
    .line 572
    :cond_15
    iget-object v12, v12, La/m3e;->g:Ljava/util/HashMap;

    .line 573
    .line 574
    iget-object v13, v10, La/m3e;->g:Ljava/util/HashMap;

    .line 575
    .line 576
    invoke-virtual {v12, v13}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 577
    .line 578
    .line 579
    :cond_16
    add-int/lit8 v11, v11, 0x1

    .line 580
    .line 581
    goto :goto_9

    .line 582
    :cond_17
    invoke-virtual {v1, v2, v7}, Landroidx/constraintlayout/motion/widget/MotionLayout;->H(ILa/r3e;)V

    .line 583
    .line 584
    .line 585
    const v7, 0x7f0a1424

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1, v7, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->H(ILa/r3e;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, v7}, Landroidx/constraintlayout/motion/widget/MotionLayout;->C(I)V

    .line 592
    .line 593
    .line 594
    new-instance v3, La/vt40;

    .line 595
    .line 596
    iget-object v7, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 597
    .line 598
    invoke-direct {v3, v7, v2}, La/vt40;-><init>(La/wt40;I)V

    .line 599
    .line 600
    .line 601
    array-length v2, v4

    .line 602
    const/4 v11, 0x0

    .line 603
    :goto_a
    if-ge v11, v2, :cond_1b

    .line 604
    .line 605
    aget-object v7, v4, v11

    .line 606
    .line 607
    iget v8, v0, La/vlu0;->h:I

    .line 608
    .line 609
    if-eq v8, v5, :cond_18

    .line 610
    .line 611
    const/16 v10, 0x8

    .line 612
    .line 613
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 614
    .line 615
    .line 616
    move-result v8

    .line 617
    iput v8, v3, La/vt40;->h:I

    .line 618
    .line 619
    :cond_18
    iget v8, v0, La/vlu0;->d:I

    .line 620
    .line 621
    iput v8, v3, La/vt40;->p:I

    .line 622
    .line 623
    iget v8, v0, La/vlu0;->l:I

    .line 624
    .line 625
    iget-object v10, v0, La/vlu0;->m:Ljava/lang/String;

    .line 626
    .line 627
    iget v12, v0, La/vlu0;->n:I

    .line 628
    .line 629
    iput v8, v3, La/vt40;->e:I

    .line 630
    .line 631
    iput-object v10, v3, La/vt40;->f:Ljava/lang/String;

    .line 632
    .line 633
    iput v12, v3, La/vt40;->g:I

    .line 634
    .line 635
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    .line 636
    .line 637
    .line 638
    move-result v7

    .line 639
    if-eqz v9, :cond_1a

    .line 640
    .line 641
    iget-object v8, v9, La/iky;->a:Ljava/util/HashMap;

    .line 642
    .line 643
    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v8

    .line 647
    check-cast v8, Ljava/util/ArrayList;

    .line 648
    .line 649
    new-instance v10, La/iky;

    .line 650
    .line 651
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 652
    .line 653
    .line 654
    new-instance v12, Ljava/util/HashMap;

    .line 655
    .line 656
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 657
    .line 658
    .line 659
    iput-object v12, v10, La/iky;->a:Ljava/util/HashMap;

    .line 660
    .line 661
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 662
    .line 663
    .line 664
    move-result-object v8

    .line 665
    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 666
    .line 667
    .line 668
    move-result v12

    .line 669
    if-eqz v12, :cond_19

    .line 670
    .line 671
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v12

    .line 675
    check-cast v12, La/rjy;

    .line 676
    .line 677
    invoke-virtual {v12}, La/rjy;->b()La/rjy;

    .line 678
    .line 679
    .line 680
    move-result-object v12

    .line 681
    iput v7, v12, La/rjy;->b:I

    .line 682
    .line 683
    invoke-virtual {v10, v12}, La/iky;->b(La/rjy;)V

    .line 684
    .line 685
    .line 686
    goto :goto_b

    .line 687
    :cond_19
    iget-object v7, v3, La/vt40;->k:Ljava/util/ArrayList;

    .line 688
    .line 689
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    :cond_1a
    add-int/lit8 v11, v11, 0x1

    .line 693
    .line 694
    goto :goto_a

    .line 695
    :cond_1b
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(La/vt40;)V

    .line 696
    .line 697
    .line 698
    new-instance v2, La/qaq0;

    .line 699
    .line 700
    const/16 v3, 0x12

    .line 701
    .line 702
    invoke-direct {v2, v0, v4, v3}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 703
    .line 704
    .line 705
    const/high16 v0, 0x3f800000    # 1.0f

    .line 706
    .line 707
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u(F)V

    .line 708
    .line 709
    .line 710
    iput-object v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 711
    .line 712
    return-void
.end method

.method public final b(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget v0, p0, La/vlu0;->r:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, -0x1

    .line 6
    if-ne v0, v3, :cond_0

    .line 7
    .line 8
    :goto_0
    move v0, v2

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v0, v1

    .line 18
    :goto_1
    iget p0, p0, La/vlu0;->s:I

    .line 19
    .line 20
    if-ne p0, v3, :cond_2

    .line 21
    .line 22
    :goto_2
    move p0, v2

    .line 23
    goto :goto_3

    .line 24
    :cond_2
    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-nez p0, :cond_3

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_3
    move p0, v1

    .line 32
    :goto_3
    if-eqz v0, :cond_4

    .line 33
    .line 34
    if-eqz p0, :cond_4

    .line 35
    .line 36
    return v2

    .line 37
    :cond_4
    return v1
.end method

.method public final c(Landroid/view/View;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget v1, p0, La/vlu0;->j:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne v1, v2, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, La/vlu0;->k:Ljava/lang/String;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    invoke-virtual {p0, p1}, La/vlu0;->b(Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    return v0

    .line 22
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget v2, p0, La/vlu0;->j:I

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-ne v1, v2, :cond_3

    .line 30
    .line 31
    return v3

    .line 32
    :cond_3
    iget-object v1, p0, La/vlu0;->k:Ljava/lang/String;

    .line 33
    .line 34
    if-nez v1, :cond_4

    .line 35
    .line 36
    return v0

    .line 37
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    instance-of v1, v1, La/a3e;

    .line 42
    .line 43
    if-eqz v1, :cond_5

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, La/a3e;

    .line 50
    .line 51
    iget-object p1, p1, La/a3e;->Y:Ljava/lang/String;

    .line 52
    .line 53
    if-eqz p1, :cond_5

    .line 54
    .line 55
    iget-object p0, p0, La/vlu0;->k:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_5

    .line 62
    .line 63
    return v3

    .line 64
    :cond_5
    return v0
.end method

.method public final d(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 7

    .line 1
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, La/fqd0;->w:[I

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-ge v0, p2, :cond_14

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget v2, p0, La/vlu0;->a:I

    .line 25
    .line 26
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iput v1, p0, La/vlu0;->a:I

    .line 31
    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :cond_0
    const/16 v2, 0x8

    .line 35
    .line 36
    const/4 v3, 0x3

    .line 37
    const/4 v4, -0x1

    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    sget-boolean v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y1:Z

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    iget v2, p0, La/vlu0;->j:I

    .line 45
    .line 46
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iput v2, p0, La/vlu0;->j:I

    .line 51
    .line 52
    if-ne v2, v4, :cond_13

    .line 53
    .line 54
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, p0, La/vlu0;->k:Ljava/lang/String;

    .line 59
    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :cond_1
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget v2, v2, Landroid/util/TypedValue;->type:I

    .line 67
    .line 68
    if-ne v2, v3, :cond_2

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, p0, La/vlu0;->k:Ljava/lang/String;

    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :cond_2
    iget v2, p0, La/vlu0;->j:I

    .line 79
    .line 80
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iput v1, p0, La/vlu0;->j:I

    .line 85
    .line 86
    goto/16 :goto_1

    .line 87
    .line 88
    :cond_3
    const/16 v2, 0x9

    .line 89
    .line 90
    if-ne v1, v2, :cond_4

    .line 91
    .line 92
    iget v2, p0, La/vlu0;->b:I

    .line 93
    .line 94
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iput v1, p0, La/vlu0;->b:I

    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :cond_4
    const/16 v2, 0xc

    .line 103
    .line 104
    if-ne v1, v2, :cond_5

    .line 105
    .line 106
    iget-boolean v2, p0, La/vlu0;->c:Z

    .line 107
    .line 108
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iput-boolean v1, p0, La/vlu0;->c:Z

    .line 113
    .line 114
    goto/16 :goto_1

    .line 115
    .line 116
    :cond_5
    const/16 v2, 0xa

    .line 117
    .line 118
    if-ne v1, v2, :cond_6

    .line 119
    .line 120
    iget v2, p0, La/vlu0;->d:I

    .line 121
    .line 122
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    iput v1, p0, La/vlu0;->d:I

    .line 127
    .line 128
    goto/16 :goto_1

    .line 129
    .line 130
    :cond_6
    const/4 v2, 0x4

    .line 131
    if-ne v1, v2, :cond_7

    .line 132
    .line 133
    iget v2, p0, La/vlu0;->h:I

    .line 134
    .line 135
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iput v1, p0, La/vlu0;->h:I

    .line 140
    .line 141
    goto/16 :goto_1

    .line 142
    .line 143
    :cond_7
    const/16 v2, 0xd

    .line 144
    .line 145
    if-ne v1, v2, :cond_8

    .line 146
    .line 147
    iget v2, p0, La/vlu0;->i:I

    .line 148
    .line 149
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    iput v1, p0, La/vlu0;->i:I

    .line 154
    .line 155
    goto/16 :goto_1

    .line 156
    .line 157
    :cond_8
    const/16 v2, 0xe

    .line 158
    .line 159
    if-ne v1, v2, :cond_9

    .line 160
    .line 161
    iget v2, p0, La/vlu0;->e:I

    .line 162
    .line 163
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    iput v1, p0, La/vlu0;->e:I

    .line 168
    .line 169
    goto/16 :goto_1

    .line 170
    .line 171
    :cond_9
    const/4 v2, 0x7

    .line 172
    const/4 v5, 0x1

    .line 173
    if-ne v1, v2, :cond_d

    .line 174
    .line 175
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    iget v2, v2, Landroid/util/TypedValue;->type:I

    .line 180
    .line 181
    const/4 v6, -0x2

    .line 182
    if-ne v2, v5, :cond_a

    .line 183
    .line 184
    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    iput v1, p0, La/vlu0;->n:I

    .line 189
    .line 190
    if-eq v1, v4, :cond_13

    .line 191
    .line 192
    iput v6, p0, La/vlu0;->l:I

    .line 193
    .line 194
    goto/16 :goto_1

    .line 195
    .line 196
    :cond_a
    if-ne v2, v3, :cond_c

    .line 197
    .line 198
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    iput-object v2, p0, La/vlu0;->m:Ljava/lang/String;

    .line 203
    .line 204
    if-eqz v2, :cond_b

    .line 205
    .line 206
    const-string v3, "/"

    .line 207
    .line 208
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-lez v2, :cond_b

    .line 213
    .line 214
    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    iput v1, p0, La/vlu0;->n:I

    .line 219
    .line 220
    iput v6, p0, La/vlu0;->l:I

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_b
    iput v4, p0, La/vlu0;->l:I

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_c
    iget v2, p0, La/vlu0;->l:I

    .line 227
    .line 228
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    iput v1, p0, La/vlu0;->l:I

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_d
    const/16 v2, 0xb

    .line 236
    .line 237
    if-ne v1, v2, :cond_e

    .line 238
    .line 239
    iget v2, p0, La/vlu0;->p:I

    .line 240
    .line 241
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    iput v1, p0, La/vlu0;->p:I

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_e
    if-ne v1, v3, :cond_f

    .line 249
    .line 250
    iget v2, p0, La/vlu0;->q:I

    .line 251
    .line 252
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    iput v1, p0, La/vlu0;->q:I

    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_f
    const/4 v2, 0x6

    .line 260
    if-ne v1, v2, :cond_10

    .line 261
    .line 262
    iget v2, p0, La/vlu0;->r:I

    .line 263
    .line 264
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    iput v1, p0, La/vlu0;->r:I

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_10
    const/4 v2, 0x5

    .line 272
    if-ne v1, v2, :cond_11

    .line 273
    .line 274
    iget v2, p0, La/vlu0;->s:I

    .line 275
    .line 276
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    iput v1, p0, La/vlu0;->s:I

    .line 281
    .line 282
    goto :goto_1

    .line 283
    :cond_11
    const/4 v2, 0x2

    .line 284
    if-ne v1, v2, :cond_12

    .line 285
    .line 286
    iget v2, p0, La/vlu0;->u:I

    .line 287
    .line 288
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    iput v1, p0, La/vlu0;->u:I

    .line 293
    .line 294
    goto :goto_1

    .line 295
    :cond_12
    if-ne v1, v5, :cond_13

    .line 296
    .line 297
    iget v2, p0, La/vlu0;->t:I

    .line 298
    .line 299
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    iput v1, p0, La/vlu0;->t:I

    .line 304
    .line 305
    :cond_13
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 306
    .line 307
    goto/16 :goto_0

    .line 308
    .line 309
    :cond_14
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 310
    .line 311
    .line 312
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ViewTransition("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/vlu0;->o:Landroid/content/Context;

    .line 9
    .line 10
    iget p0, p0, La/vlu0;->a:I

    .line 11
    .line 12
    invoke-static {p0, v1}, La/ozb;->T(ILandroid/content/Context;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, ")"

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

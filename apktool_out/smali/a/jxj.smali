.class public final La/jxj;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:Z

.field public d:Z

.field public e:La/iqi;


# direct methods
.method public constructor <init>(La/rnk0;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, La/p4;-><init>(La/rnk0;)V

    .line 5
    .line 6
    .line 7
    iput-boolean p2, p0, La/jxj;->c:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final n1(Landroid/content/Context;)La/iqi;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/jxj;->d:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/jxj;->e:La/iqi;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/rnk0;

    .line 14
    .line 15
    iget-object v1, v0, La/rnk0;->c:Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    iget-object v0, v0, La/rnk0;->a:La/tnk0;

    .line 18
    .line 19
    sget-object v2, La/tnk0;->c:La/tnk0;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    if-ne v0, v2, :cond_1

    .line 24
    .line 25
    move v0, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v0, v3

    .line 28
    :goto_0
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->o1:La/cxq;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    move v5, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget v5, v2, La/cxq;->f:I

    .line 35
    .line 36
    :goto_1
    iget-boolean v6, p0, La/jxj;->c:Z

    .line 37
    .line 38
    if-eqz v6, :cond_6

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    :goto_2
    move v2, v3

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    iget v2, v2, La/cxq;->d:I

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_4
    if-nez v2, :cond_5

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_5
    iget v2, v2, La/cxq;->e:I

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_6
    if-eqz v0, :cond_8

    .line 56
    .line 57
    if-nez v2, :cond_7

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_7
    iget v2, v2, La/cxq;->b:I

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_8
    if-nez v2, :cond_9

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_9
    iget v2, v2, La/cxq;->c:I

    .line 67
    .line 68
    :goto_3
    invoke-virtual {v1, v3, v3, v3, v3}, Landroidx/fragment/app/Fragment;->r0(IIII)V

    .line 69
    .line 70
    .line 71
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    if-eqz v3, :cond_a

    .line 75
    .line 76
    const v7, 0x7f0a142c

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-eqz v3, :cond_a

    .line 84
    .line 85
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 86
    .line 87
    invoke-virtual {v3, v7, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_a
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 91
    .line 92
    if-eqz v1, :cond_b

    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-eqz v1, :cond_b

    .line 99
    .line 100
    goto/16 :goto_7

    .line 101
    .line 102
    :cond_b
    if-nez v2, :cond_16

    .line 103
    .line 104
    if-eqz v5, :cond_16

    .line 105
    .line 106
    const/16 v1, 0x1001

    .line 107
    .line 108
    if-eq v5, v1, :cond_14

    .line 109
    .line 110
    const/16 v1, 0x2002

    .line 111
    .line 112
    if-eq v5, v1, :cond_12

    .line 113
    .line 114
    const/16 v1, 0x2005

    .line 115
    .line 116
    if-eq v5, v1, :cond_10

    .line 117
    .line 118
    const/16 v1, 0x1003

    .line 119
    .line 120
    if-eq v5, v1, :cond_e

    .line 121
    .line 122
    const/16 v1, 0x1004

    .line 123
    .line 124
    if-eq v5, v1, :cond_c

    .line 125
    .line 126
    const/4 v0, -0x1

    .line 127
    :goto_4
    move v2, v0

    .line 128
    goto :goto_5

    .line 129
    :cond_c
    if-eqz v0, :cond_d

    .line 130
    .line 131
    const v0, 0x10100b8

    .line 132
    .line 133
    .line 134
    invoke-static {v0, p1}, La/qbc;->W(ILandroid/content/Context;)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    goto :goto_4

    .line 139
    :cond_d
    const v0, 0x10100b9

    .line 140
    .line 141
    .line 142
    invoke-static {v0, p1}, La/qbc;->W(ILandroid/content/Context;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    goto :goto_4

    .line 147
    :cond_e
    if-eqz v0, :cond_f

    .line 148
    .line 149
    const v0, 0x7f020008

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_f
    const v0, 0x7f020009

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_10
    if-eqz v0, :cond_11

    .line 158
    .line 159
    const v0, 0x10100ba

    .line 160
    .line 161
    .line 162
    invoke-static {v0, p1}, La/qbc;->W(ILandroid/content/Context;)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    goto :goto_4

    .line 167
    :cond_11
    const v0, 0x10100bb

    .line 168
    .line 169
    .line 170
    invoke-static {v0, p1}, La/qbc;->W(ILandroid/content/Context;)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    goto :goto_4

    .line 175
    :cond_12
    if-eqz v0, :cond_13

    .line 176
    .line 177
    const v0, 0x7f020006

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_13
    const v0, 0x7f020007

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_14
    if-eqz v0, :cond_15

    .line 186
    .line 187
    const v0, 0x7f02000a

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_15
    const v0, 0x7f02000b

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_16
    :goto_5
    if-eqz v2, :cond_19

    .line 196
    .line 197
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    const-string v1, "anim"

    .line 206
    .line 207
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_17

    .line 212
    .line 213
    :try_start_0
    invoke-static {p1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    if-eqz v1, :cond_19

    .line 218
    .line 219
    new-instance v3, La/iqi;

    .line 220
    .line 221
    invoke-direct {v3, v1}, La/iqi;-><init>(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 222
    .line 223
    .line 224
    :goto_6
    move-object v6, v3

    .line 225
    goto :goto_7

    .line 226
    :catch_0
    move-exception p0

    .line 227
    throw p0

    .line 228
    :catch_1
    :cond_17
    :try_start_1
    invoke-static {p1, v2}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-eqz v1, :cond_19

    .line 233
    .line 234
    new-instance v3, La/iqi;

    .line 235
    .line 236
    invoke-direct {v3, v1}, La/iqi;-><init>(Landroid/animation/Animator;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :catch_2
    move-exception v1

    .line 241
    if-nez v0, :cond_18

    .line 242
    .line 243
    invoke-static {p1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    if-eqz p1, :cond_19

    .line 248
    .line 249
    new-instance v6, La/iqi;

    .line 250
    .line 251
    invoke-direct {v6, p1}, La/iqi;-><init>(Landroid/view/animation/Animation;)V

    .line 252
    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_18
    throw v1

    .line 256
    :cond_19
    :goto_7
    iput-object v6, p0, La/jxj;->e:La/iqi;

    .line 257
    .line 258
    iput-boolean v4, p0, La/jxj;->d:Z

    .line 259
    .line 260
    return-object v6
.end method

.class public final La/e0f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/LinearLayout;

.field public final e:Landroid/view/ViewGroup;

.field public final f:Landroid/view/View;

.field public final g:Landroid/view/View;

.field public final h:Landroid/view/View;

.field public final i:Landroid/view/View;

.field public final j:Landroid/view/View;

.field public final k:Landroid/view/View;

.field public final l:Landroid/view/View;

.field public final m:Landroid/view/View;

.field public final n:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Lorg/xplatform/domino/presentation/views/DominoHandView;Landroid/widget/ImageView;Landroid/widget/Button;Lorg/xplatform/domino/presentation/views/DominoTableView;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lorg/xplatform/domino/presentation/views/DominoHandView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/e0f;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/e0f;->e:Landroid/view/ViewGroup;

    .line 8
    .line 9
    iput-object p2, p0, La/e0f;->f:Landroid/view/View;

    .line 10
    .line 11
    iput-object p3, p0, La/e0f;->b:Landroid/widget/TextView;

    .line 12
    .line 13
    iput-object p4, p0, La/e0f;->g:Landroid/view/View;

    .line 14
    .line 15
    iput-object p5, p0, La/e0f;->c:Landroid/widget/TextView;

    .line 16
    .line 17
    iput-object p6, p0, La/e0f;->h:Landroid/view/View;

    .line 18
    .line 19
    iput-object p7, p0, La/e0f;->i:Landroid/view/View;

    .line 20
    .line 21
    iput-object p8, p0, La/e0f;->j:Landroid/view/View;

    .line 22
    .line 23
    iput-object p9, p0, La/e0f;->k:Landroid/view/View;

    .line 24
    .line 25
    iput-object p10, p0, La/e0f;->l:Landroid/view/View;

    .line 26
    .line 27
    iput-object p11, p0, La/e0f;->d:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    iput-object p12, p0, La/e0f;->m:Landroid/view/View;

    .line 30
    .line 31
    iput-object p13, p0, La/e0f;->n:Landroid/view/View;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/AnimatedCoefficientView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Lorg/xplatform/ui_core/AnimatedCoefficientView;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/AnimatedCoefficientView;Landroidx/constraintlayout/widget/Group;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/e0f;->a:B

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, La/e0f;->e:Landroid/view/ViewGroup;

    .line 36
    iput-object p2, p0, La/e0f;->h:Landroid/view/View;

    .line 37
    iput-object p3, p0, La/e0f;->f:Landroid/view/View;

    .line 38
    iput-object p4, p0, La/e0f;->d:Landroid/widget/LinearLayout;

    .line 39
    iput-object p5, p0, La/e0f;->i:Landroid/view/View;

    .line 40
    iput-object p6, p0, La/e0f;->k:Landroid/view/View;

    .line 41
    iput-object p7, p0, La/e0f;->g:Landroid/view/View;

    .line 42
    iput-object p8, p0, La/e0f;->j:Landroid/view/View;

    .line 43
    iput-object p9, p0, La/e0f;->n:Landroid/view/View;

    .line 44
    iput-object p10, p0, La/e0f;->l:Landroid/view/View;

    .line 45
    iput-object p11, p0, La/e0f;->m:Landroid/view/View;

    .line 46
    iput-object p12, p0, La/e0f;->b:Landroid/widget/TextView;

    .line 47
    iput-object p13, p0, La/e0f;->c:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)La/e0f;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x7f0a0353

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const v1, 0x7f0a035d

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    move-object v5, v2

    .line 22
    check-cast v5, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const v1, 0x7f0a0368

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    move-object v6, v2

    .line 34
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 35
    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    const v1, 0x7f0a07fc

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Landroid/widget/ImageView;

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    const v1, 0x7f0a0835

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Landroid/widget/ImageView;

    .line 57
    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    const v1, 0x7f0a0982

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    move-object v7, v2

    .line 68
    check-cast v7, Landroid/widget/LinearLayout;

    .line 69
    .line 70
    if-eqz v7, :cond_0

    .line 71
    .line 72
    const v1, 0x7f0a0a21

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    move-object v8, v2

    .line 80
    check-cast v8, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 81
    .line 82
    if-eqz v8, :cond_0

    .line 83
    .line 84
    const v1, 0x7f0a0a22

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    move-object v9, v2

    .line 92
    check-cast v9, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 93
    .line 94
    if-eqz v9, :cond_0

    .line 95
    .line 96
    const v1, 0x7f0a0af0

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    move-object v10, v2

    .line 104
    check-cast v10, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 105
    .line 106
    if-eqz v10, :cond_0

    .line 107
    .line 108
    const v1, 0x7f0a0af2

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    move-object v11, v2

    .line 116
    check-cast v11, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 117
    .line 118
    if-eqz v11, :cond_0

    .line 119
    .line 120
    const v1, 0x7f0a0af3

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    move-object v12, v2

    .line 128
    check-cast v12, Landroidx/constraintlayout/widget/Group;

    .line 129
    .line 130
    if-eqz v12, :cond_0

    .line 131
    .line 132
    const v1, 0x7f0a0af4

    .line 133
    .line 134
    .line 135
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    move-object v13, v2

    .line 140
    check-cast v13, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 141
    .line 142
    if-eqz v13, :cond_0

    .line 143
    .line 144
    const v1, 0x7f0a0db5

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    move-object v14, v2

    .line 152
    check-cast v14, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 153
    .line 154
    if-eqz v14, :cond_0

    .line 155
    .line 156
    const v1, 0x7f0a0e3c

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Landroid/widget/Space;

    .line 164
    .line 165
    if-eqz v2, :cond_0

    .line 166
    .line 167
    const v1, 0x7f0a105b

    .line 168
    .line 169
    .line 170
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Landroid/widget/TextView;

    .line 175
    .line 176
    if-eqz v2, :cond_0

    .line 177
    .line 178
    const v1, 0x7f0a10aa

    .line 179
    .line 180
    .line 181
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    move-object v15, v2

    .line 186
    check-cast v15, Landroid/widget/TextView;

    .line 187
    .line 188
    if-eqz v15, :cond_0

    .line 189
    .line 190
    const v1, 0x7f0a10fb

    .line 191
    .line 192
    .line 193
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, Landroid/widget/TextView;

    .line 198
    .line 199
    if-eqz v2, :cond_0

    .line 200
    .line 201
    const v1, 0x7f0a10fc

    .line 202
    .line 203
    .line 204
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    move-object/from16 v16, v2

    .line 209
    .line 210
    check-cast v16, Landroid/widget/TextView;

    .line 211
    .line 212
    if-eqz v16, :cond_0

    .line 213
    .line 214
    const v1, 0x7f0a1178

    .line 215
    .line 216
    .line 217
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Landroid/widget/TextView;

    .line 222
    .line 223
    if-eqz v2, :cond_0

    .line 224
    .line 225
    const v1, 0x7f0a1199

    .line 226
    .line 227
    .line 228
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, Landroid/widget/TextView;

    .line 233
    .line 234
    if-eqz v2, :cond_0

    .line 235
    .line 236
    new-instance v3, La/e0f;

    .line 237
    .line 238
    move-object v4, v0

    .line 239
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 240
    .line 241
    invoke-direct/range {v3 .. v16}, La/e0f;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/AnimatedCoefficientView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Lorg/xplatform/ui_core/AnimatedCoefficientView;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/AnimatedCoefficientView;Landroidx/constraintlayout/widget/Group;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 242
    .line 243
    .line 244
    return-object v3

    .line 245
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    const-string v1, "Missing required view with ID: "

    .line 254
    .line 255
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const/4 v0, 0x0

    .line 263
    return-object v0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/e0f;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/e0f;->e:Landroid/view/ViewGroup;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroid/widget/FrameLayout;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

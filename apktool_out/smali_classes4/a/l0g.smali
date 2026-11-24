.class public final synthetic La/l0g;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/l0g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/l0g;

    .line 2
    .line 3
    const-string v4, "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/cyber/game/core/databinding/CyberDialogActionBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/xlg;

    .line 8
    .line 9
    const-string v3, "inflate"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/l0g;->a:La/l0g;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Landroid/view/LayoutInflater;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v1, 0x7f0d00b6

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x7f0a0520

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v6, v2

    .line 25
    check-cast v6, Landroid/widget/LinearLayout;

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    const v1, 0x7f0a0540

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    move-object v7, v2

    .line 37
    check-cast v7, Landroid/widget/LinearLayout;

    .line 38
    .line 39
    if-eqz v7, :cond_0

    .line 40
    .line 41
    const v1, 0x7f0a0542

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    move-object v8, v2

    .line 49
    check-cast v8, Landroid/widget/ImageView;

    .line 50
    .line 51
    if-eqz v8, :cond_0

    .line 52
    .line 53
    const v1, 0x7f0a0543

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v9, v2

    .line 61
    check-cast v9, Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v9, :cond_0

    .line 64
    .line 65
    const v1, 0x7f0a0838

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    move-object v10, v2

    .line 73
    check-cast v10, Landroid/widget/ImageView;

    .line 74
    .line 75
    if-eqz v10, :cond_0

    .line 76
    .line 77
    const v1, 0x7f0a086f

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    move-object v11, v2

    .line 85
    check-cast v11, Landroid/widget/ImageView;

    .line 86
    .line 87
    if-eqz v11, :cond_0

    .line 88
    .line 89
    const v1, 0x7f0a09f0

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object v12, v2

    .line 97
    check-cast v12, Landroid/widget/LinearLayout;

    .line 98
    .line 99
    if-eqz v12, :cond_0

    .line 100
    .line 101
    const v1, 0x7f0a09f6

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v13, v2

    .line 109
    check-cast v13, Landroid/widget/LinearLayout;

    .line 110
    .line 111
    if-eqz v13, :cond_0

    .line 112
    .line 113
    const v1, 0x7f0a0aab

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    move-object v14, v2

    .line 121
    check-cast v14, Landroid/widget/LinearLayout;

    .line 122
    .line 123
    if-eqz v14, :cond_0

    .line 124
    .line 125
    const v1, 0x7f0a0aac

    .line 126
    .line 127
    .line 128
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    move-object v15, v2

    .line 133
    check-cast v15, Landroid/widget/ImageView;

    .line 134
    .line 135
    if-eqz v15, :cond_0

    .line 136
    .line 137
    move-object v5, v0

    .line 138
    check-cast v5, Landroid/widget/LinearLayout;

    .line 139
    .line 140
    const v1, 0x7f0a0cb1

    .line 141
    .line 142
    .line 143
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    move-object/from16 v16, v2

    .line 148
    .line 149
    check-cast v16, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 150
    .line 151
    if-eqz v16, :cond_0

    .line 152
    .line 153
    const v1, 0x7f0a0cb2

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    move-object/from16 v17, v2

    .line 161
    .line 162
    check-cast v17, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 163
    .line 164
    if-eqz v17, :cond_0

    .line 165
    .line 166
    const v1, 0x7f0a0cb3

    .line 167
    .line 168
    .line 169
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    move-object/from16 v18, v2

    .line 174
    .line 175
    check-cast v18, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 176
    .line 177
    if-eqz v18, :cond_0

    .line 178
    .line 179
    const v1, 0x7f0a0cb4

    .line 180
    .line 181
    .line 182
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    move-object/from16 v19, v2

    .line 187
    .line 188
    check-cast v19, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 189
    .line 190
    if-eqz v19, :cond_0

    .line 191
    .line 192
    const v1, 0x7f0a0cb6

    .line 193
    .line 194
    .line 195
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    move-object/from16 v20, v2

    .line 200
    .line 201
    check-cast v20, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 202
    .line 203
    if-eqz v20, :cond_0

    .line 204
    .line 205
    const v1, 0x7f0a0cb7

    .line 206
    .line 207
    .line 208
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    move-object/from16 v21, v2

    .line 213
    .line 214
    check-cast v21, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 215
    .line 216
    if-eqz v21, :cond_0

    .line 217
    .line 218
    const v1, 0x7f0a0e95

    .line 219
    .line 220
    .line 221
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    move-object/from16 v22, v2

    .line 226
    .line 227
    check-cast v22, Landroid/widget/LinearLayout;

    .line 228
    .line 229
    if-eqz v22, :cond_0

    .line 230
    .line 231
    const v1, 0x7f0a0e98

    .line 232
    .line 233
    .line 234
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    move-object/from16 v23, v2

    .line 239
    .line 240
    check-cast v23, Landroid/widget/LinearLayout;

    .line 241
    .line 242
    if-eqz v23, :cond_0

    .line 243
    .line 244
    const v1, 0x7f0a0e99

    .line 245
    .line 246
    .line 247
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    move-object/from16 v24, v2

    .line 252
    .line 253
    check-cast v24, Landroid/widget/ImageView;

    .line 254
    .line 255
    if-eqz v24, :cond_0

    .line 256
    .line 257
    const v1, 0x7f0a0ea5

    .line 258
    .line 259
    .line 260
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    move-object/from16 v25, v2

    .line 265
    .line 266
    check-cast v25, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 267
    .line 268
    if-eqz v25, :cond_0

    .line 269
    .line 270
    const v1, 0x7f0a0ebe

    .line 271
    .line 272
    .line 273
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    move-object/from16 v26, v2

    .line 278
    .line 279
    check-cast v26, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 280
    .line 281
    if-eqz v26, :cond_0

    .line 282
    .line 283
    const v1, 0x7f0a10fe

    .line 284
    .line 285
    .line 286
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    move-object/from16 v27, v2

    .line 291
    .line 292
    check-cast v27, Landroid/widget/TextView;

    .line 293
    .line 294
    if-eqz v27, :cond_0

    .line 295
    .line 296
    new-instance v4, La/xlg;

    .line 297
    .line 298
    invoke-direct/range {v4 .. v27}, La/xlg;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Lorg/xplatform/uikit/components/separator/DsSeparator;Lorg/xplatform/uikit/components/separator/DsSeparator;Lorg/xplatform/uikit/components/separator/DsSeparator;Lorg/xplatform/uikit/components/separator/DsSeparator;Lorg/xplatform/uikit/components/separator/DsSeparator;Lorg/xplatform/uikit/components/separator/DsSeparator;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;Landroid/widget/TextView;)V

    .line 299
    .line 300
    .line 301
    return-object v4

    .line 302
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    const-string v1, "Missing required view with ID: "

    .line 311
    .line 312
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-object v3
.end method

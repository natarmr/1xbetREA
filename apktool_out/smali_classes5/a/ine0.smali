.class public final synthetic La/ine0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/ine0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ine0;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/referral/impl/databinding/FragmentReferralNetworkBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/w3r;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/ine0;->a:La/ine0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x7f0a0395

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v2, "Missing required view with ID: "

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    const p0, 0x7f0a0227

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    move-object v6, v3

    .line 26
    check-cast v6, Lcom/google/android/material/button/MaterialButton;

    .line 27
    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    const p0, 0x7f0a04b9

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    move-object v7, v3

    .line 38
    check-cast v7, Landroid/widget/LinearLayout;

    .line 39
    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    const p0, 0x7f0a099c

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    move-object v8, v3

    .line 50
    check-cast v8, Landroid/widget/LinearLayout;

    .line 51
    .line 52
    if-eqz v8, :cond_1

    .line 53
    .line 54
    const p0, 0x7f0a0c00

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    move-object v9, v3

    .line 62
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    if-eqz v9, :cond_1

    .line 65
    .line 66
    const p0, 0x7f0a0c01

    .line 67
    .line 68
    .line 69
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    move-object v10, v3

    .line 74
    check-cast v10, Landroid/widget/TextView;

    .line 75
    .line 76
    if-eqz v10, :cond_1

    .line 77
    .line 78
    const p0, 0x7f0a0c02

    .line 79
    .line 80
    .line 81
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    move-object v11, v3

    .line 86
    check-cast v11, Landroid/widget/LinearLayout;

    .line 87
    .line 88
    if-eqz v11, :cond_1

    .line 89
    .line 90
    const p0, 0x7f0a117f

    .line 91
    .line 92
    .line 93
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    move-object v12, v3

    .line 98
    check-cast v12, Landroid/widget/TextView;

    .line 99
    .line 100
    if-eqz v12, :cond_1

    .line 101
    .line 102
    new-instance v4, La/zkk;

    .line 103
    .line 104
    move-object v5, v0

    .line 105
    check-cast v5, Landroid/widget/LinearLayout;

    .line 106
    .line 107
    invoke-direct/range {v4 .. v12}, La/zkk;-><init>(Landroid/widget/LinearLayout;Lcom/google/android/material/button/MaterialButton;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 108
    .line 109
    .line 110
    const p0, 0x7f0a06e3

    .line 111
    .line 112
    .line 113
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    const p0, 0x7f0a0218

    .line 120
    .line 121
    .line 122
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    move-object v7, v3

    .line 127
    check-cast v7, Landroid/widget/ImageView;

    .line 128
    .line 129
    if-eqz v7, :cond_0

    .line 130
    .line 131
    const p0, 0x7f0a045c

    .line 132
    .line 133
    .line 134
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    if-eqz v8, :cond_0

    .line 139
    .line 140
    const p0, 0x7f0a061b

    .line 141
    .line 142
    .line 143
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    move-object v9, v3

    .line 148
    check-cast v9, Landroid/widget/TextView;

    .line 149
    .line 150
    if-eqz v9, :cond_0

    .line 151
    .line 152
    const p0, 0x7f0a0712

    .line 153
    .line 154
    .line 155
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    move-object v10, v3

    .line 160
    check-cast v10, Landroid/widget/TextView;

    .line 161
    .line 162
    if-eqz v10, :cond_0

    .line 163
    .line 164
    const p0, 0x7f0a0a56

    .line 165
    .line 166
    .line 167
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    move-object v11, v3

    .line 172
    check-cast v11, Lcom/google/android/material/button/MaterialButton;

    .line 173
    .line 174
    if-eqz v11, :cond_0

    .line 175
    .line 176
    move-object v6, v0

    .line 177
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 178
    .line 179
    const p0, 0x7f0a0ff0

    .line 180
    .line 181
    .line 182
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    move-object v12, v3

    .line 187
    check-cast v12, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 188
    .line 189
    if-eqz v12, :cond_0

    .line 190
    .line 191
    const p0, 0x7f0a145b

    .line 192
    .line 193
    .line 194
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    move-object v13, v3

    .line 199
    check-cast v13, Landroid/widget/TextView;

    .line 200
    .line 201
    if-eqz v13, :cond_0

    .line 202
    .line 203
    const p0, 0x7f0a145c

    .line 204
    .line 205
    .line 206
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 211
    .line 212
    if-eqz v3, :cond_0

    .line 213
    .line 214
    new-instance v5, La/zkk;

    .line 215
    .line 216
    invoke-direct/range {v5 .. v13}, La/zkk;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/appbar/MaterialToolbar;Landroid/widget/TextView;)V

    .line 217
    .line 218
    .line 219
    const p0, 0x7f0a09b7

    .line 220
    .line 221
    .line 222
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 227
    .line 228
    if-eqz v0, :cond_2

    .line 229
    .line 230
    new-instance p0, La/w3r;

    .line 231
    .line 232
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 233
    .line 234
    invoke-direct {p0, p1, v4, v5, v0}, La/w3r;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;La/zkk;La/zkk;Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;)V

    .line 235
    .line 236
    .line 237
    return-object p0

    .line 238
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-object v1

    .line 254
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    return-object v1

    .line 270
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    return-object v1
.end method

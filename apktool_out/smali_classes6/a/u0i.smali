.class public abstract La/u0i;
.super La/sik;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/u0i;",
        "La/sik;",
        "<init>",
        "()V",
        "a/usd",
        "uikit"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c2:La/usd;

.field public static final synthetic d2:[La/iiy;

.field public static final e2:Ljava/lang/String;


# instance fields
.field public final Y1:La/ehf0;

.field public final Z1:La/rd9;

.field public a2:La/l12;

.field public b2:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/u0i;

    .line 4
    .line 5
    const-string v2, "dialogFields"

    .line 6
    .line 7
    const-string v3, "getDialogFields()Lorg/xplatform/uikit/components/dialog/DialogFields;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "alertStyle"

    .line 16
    .line 17
    const-string v5, "getAlertStyle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/u0i;->d2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/usd;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/u0i;->c2:La/usd;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/u0i;->e2:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/sik;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ehf0;

    .line 5
    .line 6
    const-string v1, "DIALOG_FIELDS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/ehf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/u0i;->Y1:La/ehf0;

    .line 12
    .line 13
    new-instance v0, La/rd9;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, La/rd9;-><init>(B)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/u0i;->Z1:La/rd9;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, La/u0i;->b2:Z

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 7

    .line 1
    invoke-super {p0, p1}, La/sik;->C0(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Lorg/xplatform/uikit/components/dialog/DialogFields;->i:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-nez v0, :cond_4

    .line 16
    .line 17
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v5, v5, Lorg/xplatform/uikit/components/dialog/DialogFields;->j:La/n12;

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_3

    .line 32
    .line 33
    if-eq v5, v4, :cond_2

    .line 34
    .line 35
    if-eq v5, v2, :cond_1

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    if-ne v5, v6, :cond_0

    .line 39
    .line 40
    move v5, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_1
    const v5, 0x7f120004

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const v5, 0x7f120007

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const v5, 0x7f120006

    .line 55
    .line 56
    .line 57
    :goto_0
    const/16 v6, 0x6ff

    .line 58
    .line 59
    invoke-static {v0, v3, v3, v5, v6}, Lorg/xplatform/uikit/components/dialog/DialogFields;->a(Lorg/xplatform/uikit/components/dialog/DialogFields;Ljava/lang/String;Ljava/lang/String;II)Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0, v0}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    iget-object v0, p0, La/u0i;->a2:La/l12;

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    check-cast v0, Landroid/view/View;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_5
    move-object v0, v3

    .line 74
    :goto_1
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-static {v0}, La/jmu0;->h(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    :cond_6
    sget-object v0, La/u0i;->d2:[La/iiy;

    .line 80
    .line 81
    aget-object v0, v0, v4

    .line 82
    .line 83
    iget-object v5, p0, La/u0i;->Z1:La/rd9;

    .line 84
    .line 85
    invoke-virtual {v5, p0, v0}, La/rd9;->a(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    const v6, -0x5069748f

    .line 94
    .line 95
    .line 96
    if-eq v5, v6, :cond_b

    .line 97
    .line 98
    const v6, -0x3ebdafe9

    .line 99
    .line 100
    .line 101
    if-eq v5, v6, :cond_9

    .line 102
    .line 103
    const v6, 0x7eb20e56

    .line 104
    .line 105
    .line 106
    if-eq v5, v6, :cond_7

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_7
    const-string v5, "customWithLottie"

    .line 110
    .line 111
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_8

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_8
    new-instance v0, La/zxf;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-direct {v0, v5}, La/zxf;-><init>(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_9
    const-string v5, "native"

    .line 129
    .line 130
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_a

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_a
    new-instance v0, La/p950;

    .line 138
    .line 139
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-direct {v0, v5}, La/p950;-><init>(Landroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_b
    const-string v5, "custom"

    .line 148
    .line 149
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_c

    .line 154
    .line 155
    :goto_2
    new-instance v0, La/p950;

    .line 156
    .line 157
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-direct {v0, v5}, La/p950;-><init>(Landroid/content/Context;)V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_c
    new-instance v0, La/kwf;

    .line 166
    .line 167
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-direct {v0, v5}, La/kwf;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    :goto_3
    iput-object v0, p0, La/u0i;->a2:La/l12;

    .line 175
    .line 176
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-interface {v0, v5}, La/l12;->setModel(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v0}, La/l12;->getPositiveButton()Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    const-string v6, "topButton"

    .line 188
    .line 189
    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v0}, La/l12;->getPositiveButton()Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    new-instance v6, La/t0i;

    .line 197
    .line 198
    invoke-direct {v6, p0, v1}, La/t0i;-><init>(La/u0i;B)V

    .line 199
    .line 200
    .line 201
    invoke-static {v5, v6}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 202
    .line 203
    .line 204
    invoke-interface {v0}, La/l12;->getNegativeButton()Landroid/view/View;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    const-string v5, "middleButton"

    .line 209
    .line 210
    invoke-virtual {v1, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v0}, La/l12;->getNegativeButton()Landroid/view/View;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    new-instance v5, La/t0i;

    .line 218
    .line 219
    invoke-direct {v5, p0, v4}, La/t0i;-><init>(La/u0i;B)V

    .line 220
    .line 221
    .line 222
    invoke-static {v1, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 223
    .line 224
    .line 225
    invoke-interface {v0}, La/l12;->getNeutralButton()Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    new-instance v4, La/t0i;

    .line 230
    .line 231
    invoke-direct {v4, p0, v2}, La/t0i;-><init>(La/u0i;B)V

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 235
    .line 236
    .line 237
    invoke-interface {v0}, La/l12;->getChecker()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    new-instance v1, La/z9f;

    .line 242
    .line 243
    const/4 v2, 0x6

    .line 244
    invoke-direct {v1, p0, v2}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->setCheckedChangeListener(La/pg60;)V

    .line 248
    .line 249
    .line 250
    iget-object p0, p0, La/u0i;->a2:La/l12;

    .line 251
    .line 252
    if-eqz p0, :cond_d

    .line 253
    .line 254
    move-object v3, p0

    .line 255
    check-cast v3, Landroid/view/View;

    .line 256
    .line 257
    :cond_d
    if-eqz v3, :cond_e

    .line 258
    .line 259
    const p0, 0x7f0a0098

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3, p0}, Landroid/view/View;->setId(I)V

    .line 263
    .line 264
    .line 265
    sget-object p0, La/u0i;->e2:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v3, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, v3}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 271
    .line 272
    .line 273
    :cond_e
    return-object p1
.end method

.method public final I0(Landroid/app/Dialog;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x2

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const v4, 0x7f0706f8

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eqz v4, :cond_b

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_1
    const/4 v5, -0x2

    .line 44
    const/16 v6, 0x11

    .line 45
    .line 46
    if-eqz v0, :cond_8

    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v7, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-static {v0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    const/4 v7, 0x3

    .line 69
    iget-object v0, v0, La/xiv0;->a:La/uiv0;

    .line 70
    .line 71
    invoke-virtual {v0, v7}, La/uiv0;->i(I)La/pfx;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    const/4 v0, 0x0

    .line 77
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    iget v8, v0, La/pfx;->b:I

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    move v8, v1

    .line 93
    :goto_2
    sub-int/2addr v7, v8

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    iget v0, v0, La/pfx;->d:I

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    move v0, v1

    .line 100
    :goto_3
    sub-int/2addr v7, v0

    .line 101
    mul-int/2addr v3, v2

    .line 102
    sub-int/2addr v7, v3

    .line 103
    if-gez v7, :cond_5

    .line 104
    .line 105
    move v7, v1

    .line 106
    :cond_5
    iput v6, v4, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 107
    .line 108
    iput v1, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    invoke-virtual {v0, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 117
    .line 118
    .line 119
    :cond_6
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    invoke-virtual {p0}, La/u0i;->S0()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-virtual {p1, v0, v5}, Landroid/view/Window;->setLayout(II)V

    .line 130
    .line 131
    .line 132
    :cond_7
    iget-object p0, p0, La/u0i;->a2:La/l12;

    .line 133
    .line 134
    if-eqz p0, :cond_b

    .line 135
    .line 136
    invoke-interface {p0, v7}, La/l12;->setMaxContentHeight(I)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_8
    iput v6, v4, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 141
    .line 142
    iput v1, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    invoke-virtual {v0, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 151
    .line 152
    .line 153
    :cond_9
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-eqz p1, :cond_a

    .line 158
    .line 159
    invoke-virtual {p0}, La/u0i;->S0()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {p1, v0, v5}, Landroid/view/Window;->setLayout(II)V

    .line 164
    .line 165
    .line 166
    :cond_a
    iget-object p0, p0, La/u0i;->a2:La/l12;

    .line 167
    .line 168
    if-eqz p0, :cond_b

    .line 169
    .line 170
    const p1, 0x7fffffff

    .line 171
    .line 172
    .line 173
    invoke-interface {p0, p1}, La/l12;->setMaxContentHeight(I)V

    .line 174
    .line 175
    .line 176
    :cond_b
    :goto_4
    return-void
.end method

.method public final J0()Lorg/xplatform/uikit/components/check_box/DsCheckbox;
    .locals 0

    .line 1
    iget-object p0, p0, La/u0i;->a2:La/l12;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, La/l12;->getChecker()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final K0()Lorg/xplatform/uikit/components/dialog/DialogFields;
    .locals 2

    .line 1
    sget-object v0, La/u0i;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/u0i;->Y1:La/ehf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/ehf0;->j(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 13
    .line 14
    return-object p0
.end method

.method public L0()V
    .locals 0

    .line 1
    return-void
.end method

.method public M0()V
    .locals 1

    .line 1
    sget-object v0, La/gi;->c:La/gi;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/u0i;->P0(La/gi;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public N0()V
    .locals 1

    .line 1
    sget-object v0, La/gi;->d:La/gi;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/u0i;->P0(La/gi;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public O0()V
    .locals 1

    .line 1
    sget-object v0, La/gi;->b:La/gi;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/u0i;->P0(La/gi;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final P0(La/gi;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lorg/xplatform/uikit/components/dialog/DialogFields;->f:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    new-instance v2, Lkotlin/Pair;

    .line 23
    .line 24
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v1, v1, Lorg/xplatform/uikit/components/dialog/DialogFields;->f:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {v0, p0, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    invoke-virtual {p0}, La/sik;->y0()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final Q0(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lorg/xplatform/uikit/components/dialog/DialogFields;->g:Ljava/lang/CharSequence;

    .line 9
    .line 10
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/16 v2, 0x7bf

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {v0, v3, p1, v1, v2}, Lorg/xplatform/uikit/components/dialog/DialogFields;->a(Lorg/xplatform/uikit/components/dialog/DialogFields;Ljava/lang/String;Ljava/lang/String;II)Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, La/u0i;->a2:La/l12;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p1, p0}, La/l12;->setModel(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u0i;->d2:[La/iiy;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    iget-object v1, p0, La/u0i;->Y1:La/ehf0;

    .line 10
    .line 11
    invoke-virtual {v1, p0, v0, p1}, La/ehf0;->v(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final S0()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/mjv0;->a:La/ljv0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v1, La/ljv0;->b:La/njv0;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v1, p0}, La/njv0;->a(Landroid/app/Activity;)La/kjv0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object v1, p0, La/kjv0;->a:La/tq8;

    .line 24
    .line 25
    invoke-virtual {v1}, La/tq8;->c()Landroid/graphics/Rect;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    int-to-float v1, v1

    .line 34
    iget p0, p0, La/kjv0;->b:F

    .line 35
    .line 36
    div-float/2addr v1, p0

    .line 37
    invoke-static {v1}, La/si30;->b(F)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    const/16 v1, 0x258

    .line 42
    .line 43
    if-lt p0, v1, :cond_0

    .line 44
    .line 45
    const p0, 0x7f0706aa

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const p0, 0x7f070691

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0
.end method

.method public W(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string p1, "Current screen: "

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "onCreate"

    .line 19
    .line 20
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    iget-object v0, p0, La/u0i;->a2:La/l12;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Landroid/view/View;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, La/jmu0;->h(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-super {p0}, La/sik;->Z()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/u0i;->L0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, La/u0i;->b2:Z

    .line 9
    .line 10
    return-void
.end method

.method public final g0()V
    .locals 3

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const v2, 0x7f080e82

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-boolean v2, p0, La/u0i;->b2:Z

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const v2, 0x7f14088d

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const v2, 0x7f14088e

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 53
    .line 54
    const/high16 v2, 0x3f800000    # 1.0f

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Landroid/view/View;->setElevation(F)V

    .line 57
    .line 58
    .line 59
    :cond_3
    const/4 v1, 0x0

    .line 60
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-boolean v1, v1, Lorg/xplatform/uikit/components/dialog/DialogFields;->k:Z

    .line 68
    .line 69
    invoke-virtual {p0, v1}, La/sik;->E0(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, La/u0i;->I0(Landroid/app/Dialog;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 92
    .line 93
    if-eqz p0, :cond_5

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-eqz p0, :cond_5

    .line 100
    .line 101
    new-instance v1, La/hx5;

    .line 102
    .line 103
    const/4 v2, 0x1

    .line 104
    invoke-direct {v1, v0, v2}, La/hx5;-><init>(Landroid/view/Window$Callback;B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 108
    .line 109
    .line 110
    :cond_5
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 6
    .line 7
    iget-object p1, p0, La/u0i;->a2:La/l12;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroid/view/View;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    new-instance v0, La/ccf;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, v1}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

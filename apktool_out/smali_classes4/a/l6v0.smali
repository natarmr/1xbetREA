.class public final La/l6v0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/l6v0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/sxs0",
        "weekly_reward"
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
.field public static final P1:La/sxs0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/e9o0;

.field public M1:La/mzi;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/l6v0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/games_section/feature/weekly_reward/databinding/FragmentOnexgamesWeeklyRewardBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/l6v0;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/sxs0;

    .line 21
    .line 22
    const/16 v1, 0xd

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/l6v0;->P1:La/sxs0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0273

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/l6v0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/e9o0;

    .line 12
    .line 13
    const v1, 0x7f040b22

    .line 14
    .line 15
    .line 16
    sget-object v2, La/bp3;->b:La/bp3;

    .line 17
    .line 18
    invoke-direct {v0, v1, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/l6v0;->L1:La/e9o0;

    .line 22
    .line 23
    new-instance v0, La/g6v0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, La/g6v0;-><init>(La/l6v0;B)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/cvs0;

    .line 30
    .line 31
    const/16 v2, 0x1b

    .line 32
    .line 33
    invoke-direct {v1, p0, v2}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    sget-object v2, La/wez;->b:La/wez;

    .line 37
    .line 38
    new-instance v3, La/cvs0;

    .line 39
    .line 40
    const/16 v4, 0x1c

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-class v2, La/d7v0;

    .line 50
    .line 51
    sget-object v3, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v3, La/w6u0;

    .line 58
    .line 59
    const/16 v4, 0x14

    .line 60
    .line 61
    invoke-direct {v3, v1, v4}, La/w6u0;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/w6u0;

    .line 65
    .line 66
    const/16 v5, 0x15

    .line 67
    .line 68
    invoke-direct {v4, v1, v5}, La/w6u0;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/l6v0;->N1:La/kiu0;

    .line 76
    .line 77
    sget-object v0, La/j6v0;->a:La/j6v0;

    .line 78
    .line 79
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/l6v0;->O1:La/s0r;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    new-instance p1, La/g6v0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/g6v0;-><init>(La/l6v0;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p1, p1, La/k2r;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 15
    .line 16
    new-instance v1, La/i6v0;

    .line 17
    .line 18
    invoke-direct {v1, p0, v0}, La/i6v0;-><init>(La/l6v0;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v1, p1, La/k2r;->d:Landroid/widget/ImageView;

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const/16 v8, 0x1fe

    .line 34
    .line 35
    const-string v2, "/static/img/android/actions/everyweekTournament/background.webp"

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p1, p1, La/k2r;->j:Landroidx/viewpager2/widget/ViewPager2;

    .line 49
    .line 50
    new-instance v1, La/x860;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 65
    .line 66
    const/high16 v3, 0x41c00000    # 24.0f

    .line 67
    .line 68
    mul-float/2addr v2, v3

    .line 69
    float-to-double v2, v2

    .line 70
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    double-to-float v2, v2

    .line 75
    float-to-int v2, v2

    .line 76
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    if-ltz v2, :cond_0

    .line 81
    .line 82
    iput v2, v1, La/x860;->a:I

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->setPageTransformer(La/oju0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p1, p1, La/k2r;->j:Landroidx/viewpager2/widget/ViewPager2;

    .line 92
    .line 93
    new-instance v1, La/xp6;

    .line 94
    .line 95
    const/16 v2, 0x11

    .line 96
    .line 97
    invoke-direct {v1, p0, v2}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget-object p1, p1, La/k2r;->b:Lorg/xplatform/games_section/feature/weekly_reward/presentation/custom_veiw/DaysProgressView;

    .line 108
    .line 109
    new-instance v1, La/h6v0;

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    invoke-direct {v1, p0, v4}, La/h6v0;-><init>(La/l6v0;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v1}, Lorg/xplatform/games_section/feature/weekly_reward/presentation/custom_veiw/DaysProgressView;->setOnItemClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object p1, p1, La/k2r;->i:Landroid/widget/TextView;

    .line 123
    .line 124
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 125
    .line 126
    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const v5, 0x7f131056

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const-string v5, " "

    .line 141
    .line 142
    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v6, Landroid/text/style/StyleSpan;

    .line 150
    .line 151
    invoke-direct {v6, v0}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    const v8, 0x7f131053

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-virtual {v1, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    invoke-virtual {v1, v6, v7, v8, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const v2, 0x7f131057

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget-object p1, p1, La/k2r;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 198
    .line 199
    new-instance v1, La/i6v0;

    .line 200
    .line 201
    invoke-direct {v1, p0, v4}, La/i6v0;-><init>(La/l6v0;B)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, La/l6v0;->H0()La/d7v0;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    iput-boolean v4, p1, La/d7v0;->p:Z

    .line 212
    .line 213
    iget-object v1, p1, La/d7v0;->m:La/pby;

    .line 214
    .line 215
    invoke-interface {v1, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 216
    .line 217
    .line 218
    iget-object v1, p1, La/d7v0;->i:La/m1e;

    .line 219
    .line 220
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    new-instance v2, La/k6s0;

    .line 225
    .line 226
    const/16 v4, 0x17

    .line 227
    .line 228
    invoke-direct {v2, p1, v3, v4}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 229
    .line 230
    .line 231
    new-instance v3, La/fnq;

    .line 232
    .line 233
    const/4 v4, 0x4

    .line 234
    invoke-direct {v3, v1, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 235
    .line 236
    .line 237
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-static {v3, v1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    iput-object v1, p1, La/d7v0;->m:La/pby;

    .line 246
    .line 247
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    new-instance v1, La/h6v0;

    .line 252
    .line 253
    invoke-direct {v1, p0, v0}, La/h6v0;-><init>(La/l6v0;B)V

    .line 254
    .line 255
    .line 256
    const-string v0, ""

    .line 257
    .line 258
    invoke-static {p1, p0, v0, v1}, La/o2t;->d(Landroidx/fragment/app/e;La/clz;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :cond_0
    const-string p0, "Margin must be non-negative"

    .line 263
    .line 264
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v3
.end method

.method public final C0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, La/vmv;

    .line 10
    .line 11
    const-string v2, "Can not find dependencies provider for "

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    check-cast v0, La/vmv;

    .line 16
    .line 17
    check-cast v0, Lorg/platform/app/ApplicationLoader;

    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v1, La/uxs0;

    .line 32
    .line 33
    const/16 v2, 0xd

    .line 34
    .line 35
    invoke-direct {v1, v2}, La/uxs0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/kki;

    .line 39
    .line 40
    invoke-direct {v2, v1, v0}, La/kki;-><init>(La/uxs0;La/g8i;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v2, La/kki;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La/n5d0;

    .line 46
    .line 47
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/mzi;

    .line 52
    .line 53
    iput-object v0, p0, La/l6v0;->M1:La/mzi;

    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    const-string p0, "null cannot be cast to non-null type org.xplatform.core.di.dependencies.WeeklyRewardDependencies"

    .line 57
    .line 58
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/l6v0;->H0()La/d7v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/d7v0;->r:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/k6v0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/k6v0;-><init>(La/l6v0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/npu0;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/npu0;-><init>(La/gmq;La/clz;La/k6v0;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/l6v0;->H0()La/d7v0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/d7v0;->q:La/qoj0;

    .line 42
    .line 43
    new-instance v6, La/k6v0;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/k6v0;-><init>(La/l6v0;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v3, La/npu0;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/npu0;-><init>(La/gmq;La/clz;La/k6v0;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/l6v0;->H0()La/d7v0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v4, v1, La/d7v0;->s:La/p7m0;

    .line 75
    .line 76
    new-instance v6, La/k6v0;

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    invoke-direct {v6, p0, v7, v1}, La/k6v0;-><init>(La/l6v0;La/yje;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v3, La/npu0;

    .line 95
    .line 96
    invoke-direct/range {v3 .. v8}, La/npu0;-><init>(La/gmq;La/clz;La/k6v0;La/yje;C)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final G0()La/k2r;
    .locals 2

    .line 1
    sget-object v0, La/l6v0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/l6v0;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/k2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/d7v0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l6v0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/d7v0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/k2r;->h:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v1, v1, La/k2r;->j:Landroidx/viewpager2/widget/ViewPager2;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, La/yge0;->d()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const v1, 0x7f131051

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1, p1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final Z()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l6v0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l6v0;->L1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method

.class public final La/zp6;
.super La/stl;
.source "SourceFile"

# interfaces
.implements La/i620;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/k620;",
        ">;",
        "La/i620;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "La/zp6;",
        "La/stl;",
        "La/k620;",
        "La/i620;",
        "<init>",
        "()V",
        "a/yk5",
        "impl"
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
.field public static final m2:La/yk5;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public g2:La/fiu0;

.field public h2:La/wdk0;

.field public final i2:La/nae0;

.field public final j2:La/kiu0;

.field public final k2:La/cgx0;

.field public l2:La/wjk;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/zp6;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/MakeBetBottomDsBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "isPromoBetEnabled"

    .line 16
    .line 17
    const-string v5, "isPromoBetEnabled()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/zp6;->n2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/yk5;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/zp6;->m2:La/yk5;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/wp6;->a:La/wp6;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/zp6;->i2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/zo4;

    .line 13
    .line 14
    const/16 v1, 0x14

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, La/zo4;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v1, La/p46;

    .line 20
    .line 21
    const/4 v2, 0x5

    .line 22
    invoke-direct {v1, p0, v2}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/p46;

    .line 28
    .line 29
    const/4 v4, 0x6

    .line 30
    invoke-direct {v3, v1, v4}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, La/o720;

    .line 38
    .line 39
    sget-object v3, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, La/qw4;

    .line 46
    .line 47
    const/16 v4, 0x18

    .line 48
    .line 49
    invoke-direct {v3, v1, v4}, La/qw4;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/qw4;

    .line 53
    .line 54
    const/16 v5, 0x19

    .line 55
    .line 56
    invoke-direct {v4, v1, v5}, La/qw4;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/zp6;->j2:La/kiu0;

    .line 64
    .line 65
    new-instance v0, La/cgx0;

    .line 66
    .line 67
    const-string v1, "KEY_PROMO_BET_ENABLED"

    .line 68
    .line 69
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, La/zp6;->k2:La/cgx0;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/zp6;->V0()La/k620;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0()V
    .locals 8

    .line 1
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, La/zp6;->V0()La/k620;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, La/k620;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    sget-object v3, La/wn7;->i:La/wn7;

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    sget-object v3, La/zp6;->n2:[La/iiy;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    aget-object v5, v3, v4

    .line 47
    .line 48
    iget-object v6, p0, La/zp6;->k2:La/cgx0;

    .line 49
    .line 50
    invoke-virtual {v6, p0, v5}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    sget-object v5, La/wn7;->h:La/wn7;

    .line 61
    .line 62
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {p0}, La/zp6;->V0()La/k620;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    iget-object v5, v5, La/k620;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 70
    .line 71
    new-instance v7, La/ft6;

    .line 72
    .line 73
    invoke-direct {v7, p0, v0}, La/ft6;-><init>(La/zp6;Ljava/util/ArrayList;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v7}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, La/zp6;->V0()La/k620;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v0, v0, La/k620;->d:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 84
    .line 85
    aget-object v5, v3, v4

    .line 86
    .line 87
    invoke-virtual {v6, p0, v5}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_3

    .line 96
    .line 97
    move v5, v2

    .line 98
    goto :goto_0

    .line 99
    :cond_3
    const/16 v5, 0x8

    .line 100
    .line 101
    :goto_0
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    aget-object v0, v3, v4

    .line 105
    .line 106
    invoke-virtual {v6, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {p0}, La/zp6;->V0()La/k620;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v0, v0, La/k620;->d:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 121
    .line 122
    new-instance v3, La/vvh0;

    .line 123
    .line 124
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 125
    .line 126
    .line 127
    const v4, 0x7f130276

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v3, v4}, La/vvh0;->a(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    const/4 v4, 0x6

    .line 138
    invoke-static {v0, v3, v2, v4}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->a(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;La/vvh0;ZI)V

    .line 139
    .line 140
    .line 141
    new-instance v3, La/vvh0;

    .line 142
    .line 143
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    const v5, 0x7f130275

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v3, v5}, La/vvh0;->a(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v3, v2, v4}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->a(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;La/vvh0;ZI)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 160
    .line 161
    .line 162
    new-instance v0, La/sbx0;

    .line 163
    .line 164
    const/16 v3, 0xd

    .line 165
    .line 166
    invoke-direct {v0, v3}, La/sbx0;-><init>(B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, La/zp6;->V0()La/k620;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    iget-object v3, v3, La/k620;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 174
    .line 175
    invoke-virtual {v0, v3}, La/sbx0;->b(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, La/zp6;->V0()La/k620;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget-object v0, v0, La/k620;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 183
    .line 184
    new-instance v3, La/xp6;

    .line 185
    .line 186
    invoke-direct {v3, p0, v2}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v3}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 190
    .line 191
    .line 192
    :cond_4
    invoke-virtual {p0}, La/zp6;->V0()La/k620;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v0, v0, La/k620;->d:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 197
    .line 198
    new-instance v3, La/os5;

    .line 199
    .line 200
    const/16 v4, 0xb

    .line 201
    .line 202
    invoke-direct {v3, p0, v4}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0, v3}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lkotlin/jvm/functions/Function1;)V

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, La/zp6;->j2:La/kiu0;

    .line 209
    .line 210
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, La/o720;

    .line 215
    .line 216
    iget-object v0, v0, La/o720;->c:La/p7m0;

    .line 217
    .line 218
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    new-instance v3, La/yp6;

    .line 223
    .line 224
    const/4 v4, 0x0

    .line 225
    invoke-direct {v3, p0, v4, v2}, La/yp6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 226
    .line 227
    .line 228
    sget-object v2, La/lkz;->a:La/lkz;

    .line 229
    .line 230
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    new-instance v5, La/td6;

    .line 243
    .line 244
    invoke-direct {v5, v0, p0, v3, v4}, La/td6;-><init>(La/xae0;La/clz;La/yp6;La/yje;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v2, v4, v4, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 248
    .line 249
    .line 250
    return-void
.end method

.method public final T0()V
    .locals 4

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/v720;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/v720;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/v720;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v2, v0}, La/v720;->a(La/i1w0;)La/zki;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/zki;->d()La/fiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/zp6;->g2:La/fiu0;

    .line 68
    .line 69
    iget-object v0, v0, La/zki;->s:La/wdk0;

    .line 70
    .line 71
    iput-object v0, p0, La/zp6;->h2:La/wdk0;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 75
    .line 76
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/wjk;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/wjk;

    .line 9
    .line 10
    iput-object p1, p0, La/zp6;->l2:La/wjk;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final V0()La/k620;
    .locals 2

    .line 1
    sget-object v0, La/zp6;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/zp6;->i2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/k620;

    .line 16
    .line 17
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 3
    .line 4
    invoke-super {p0}, La/stl;->Z()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/zp6;->l2:La/wjk;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, La/wjk;->l(La/wjk;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.class public final La/w4b0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/w4b0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/nh70",
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
.field public static final Q1:La/nh70;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/a8z;

.field public final L1:La/s0r;

.field public final M1:La/kiu0;

.field public final N1:La/kiu0;

.field public final O1:La/a8z;

.field public final P1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/w4b0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/feed/impl/databinding/FragmentPopularClassicDayExpressBinding;"

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
    sput-object v1, La/w4b0;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/nh70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/w4b0;->Q1:La/nh70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const v0, 0x7f0d028a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/t4b0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/t4b0;-><init>(La/w4b0;B)V

    .line 11
    .line 12
    .line 13
    sget-object v2, La/wez;->b:La/wez;

    .line 14
    .line 15
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/w4b0;->K1:La/a8z;

    .line 20
    .line 21
    sget-object v0, La/v4b0;->a:La/v4b0;

    .line 22
    .line 23
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/w4b0;->L1:La/s0r;

    .line 28
    .line 29
    new-instance v0, La/t4b0;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v0, p0, v3}, La/t4b0;-><init>(La/w4b0;B)V

    .line 33
    .line 34
    .line 35
    new-instance v4, La/u4b0;

    .line 36
    .line 37
    invoke-direct {v4, p0, v1}, La/u4b0;-><init>(La/w4b0;B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/wz80;

    .line 41
    .line 42
    const/16 v5, 0x19

    .line 43
    .line 44
    invoke-direct {v1, v4, v5}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v4, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    const-class v6, La/j5b0;

    .line 54
    .line 55
    invoke-virtual {v4, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    new-instance v7, La/a190;

    .line 60
    .line 61
    const/16 v8, 0x18

    .line 62
    .line 63
    invoke-direct {v7, v1, v8}, La/a190;-><init>(La/a8z;B)V

    .line 64
    .line 65
    .line 66
    new-instance v8, La/a190;

    .line 67
    .line 68
    invoke-direct {v8, v1, v5}, La/a190;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v6, v7, v8, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/w4b0;->M1:La/kiu0;

    .line 76
    .line 77
    new-instance v0, La/u4b0;

    .line 78
    .line 79
    invoke-direct {v0, p0, v3}, La/u4b0;-><init>(La/w4b0;B)V

    .line 80
    .line 81
    .line 82
    new-instance v1, La/wz80;

    .line 83
    .line 84
    const/16 v5, 0x1a

    .line 85
    .line 86
    invoke-direct {v1, v0, v5}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-class v1, La/pgj;

    .line 94
    .line 95
    invoke-virtual {v4, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v4, La/a190;

    .line 100
    .line 101
    invoke-direct {v4, v0, v5}, La/a190;-><init>(La/a8z;B)V

    .line 102
    .line 103
    .line 104
    new-instance v5, La/a190;

    .line 105
    .line 106
    const/16 v6, 0x1b

    .line 107
    .line 108
    invoke-direct {v5, v0, v6}, La/a190;-><init>(La/a8z;B)V

    .line 109
    .line 110
    .line 111
    new-instance v6, La/ha30;

    .line 112
    .line 113
    const/16 v7, 0x17

    .line 114
    .line 115
    invoke-direct {v6, p0, v0, v7}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {p0, v1, v4, v5, v6}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iput-object v0, p0, La/w4b0;->N1:La/kiu0;

    .line 123
    .line 124
    new-instance v0, La/t4b0;

    .line 125
    .line 126
    const/4 v1, 0x2

    .line 127
    invoke-direct {v0, p0, v1}, La/t4b0;-><init>(La/w4b0;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, La/w4b0;->O1:La/a8z;

    .line 135
    .line 136
    iput-boolean v3, p0, La/w4b0;->P1:Z

    .line 137
    .line 138
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/w4b0;->I0()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/w4b0;->K1:La/a8z;

    .line 5
    .line 6
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, La/voi;

    .line 11
    .line 12
    iget-object p1, p1, La/voi;->f:La/yqc;

    .line 13
    .line 14
    iget-object p1, p1, La/yqc;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, La/nc0;

    .line 17
    .line 18
    new-instance v1, La/fhj;

    .line 19
    .line 20
    iget-object v0, p1, La/nc0;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/wdk0;

    .line 23
    .line 24
    iget-object p1, p1, La/nc0;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, La/ii;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, v1, La/fhj;->a:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p1, v1, La/fhj;->b:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object p1, p0, La/w4b0;->M1:La/kiu0;

    .line 42
    .line 43
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    move-object v3, p1

    .line 48
    check-cast v3, La/j5b0;

    .line 49
    .line 50
    iget-object p1, p0, La/w4b0;->N1:La/kiu0;

    .line 51
    .line 52
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    move-object v4, p1

    .line 57
    check-cast v4, La/pgj;

    .line 58
    .line 59
    new-instance p1, La/ehj;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-direct {p1, v3, v0}, La/ehj;-><init>(La/j5b0;B)V

    .line 63
    .line 64
    .line 65
    const-string v0, "REQUEST_EXPRESS_DIALOG_EXPRESS"

    .line 66
    .line 67
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 68
    .line 69
    .line 70
    new-instance p1, La/ehj;

    .line 71
    .line 72
    const/4 v7, 0x1

    .line 73
    invoke-direct {p1, v3, v7}, La/ehj;-><init>(La/j5b0;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, v3, La/j5b0;->h:La/iij;

    .line 80
    .line 81
    iget-object p1, p1, La/iij;->g:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, La/p7m0;

    .line 84
    .line 85
    new-instance v0, La/jv0;

    .line 86
    .line 87
    const/4 v5, 0x0

    .line 88
    const/16 v6, 0xa

    .line 89
    .line 90
    move-object v2, p0

    .line 91
    invoke-direct/range {v0 .. v6}, La/jv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 92
    .line 93
    .line 94
    sget-object p0, La/lkz;->a:La/lkz;

    .line 95
    .line 96
    invoke-static {v2}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    new-instance v3, La/g8g;

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-direct {v3, p1, p0, v0, v4}, La/g8g;-><init>(La/gmq;La/clz;La/jv0;La/yje;)V

    .line 112
    .line 113
    .line 114
    const/4 p0, 0x3

    .line 115
    invoke-static {v1, v4, v4, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, La/w4b0;->H0()La/w2r;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object p1, p1, La/w2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 123
    .line 124
    invoke-virtual {p1, v7}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const v1, 0x7f05000f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_0

    .line 146
    .line 147
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    const/4 v5, 0x2

    .line 154
    invoke-direct {v0, v3, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 155
    .line 156
    .line 157
    new-instance v3, La/eo6;

    .line 158
    .line 159
    invoke-direct {v3, v2, p0}, La/eo6;-><init>(Ljava/lang/Object;B)V

    .line 160
    .line 161
    .line 162
    iput-object v3, v0, Landroidx/recyclerview/widget/GridLayoutManager;->m1:La/c2;

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 166
    .line 167
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-direct {v0, p0, v7}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 172
    .line 173
    .line 174
    :goto_0
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, La/w4b0;->G0()La/s4b0;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    if-eqz p0, :cond_1

    .line 203
    .line 204
    new-instance p0, La/cab0;

    .line 205
    .line 206
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-direct {p0, v0}, La/cab0;-><init>(Landroid/content/res/Resources;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_1
    new-instance p0, La/yrh;

    .line 221
    .line 222
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-direct {p0, v0}, La/yrh;-><init>(Landroid/content/res/Resources;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 233
    .line 234
    .line 235
    :goto_1
    invoke-static {p1, v7, v7}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 236
    .line 237
    .line 238
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    iget-object v0, p0, La/w4b0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/j5b0;

    .line 8
    .line 9
    iget-object v1, v0, La/j5b0;->m:La/p7m0;

    .line 10
    .line 11
    new-instance v3, La/m430;

    .line 12
    .line 13
    const/16 v4, 0x17

    .line 14
    .line 15
    invoke-direct {v3, v1, v0, v4}, La/m430;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/g5b0;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v1, v0, v8, v4}, La/g5b0;-><init>(La/j5b0;La/yje;B)V

    .line 23
    .line 24
    .line 25
    new-instance v5, La/fnq;

    .line 26
    .line 27
    const/4 v6, 0x4

    .line 28
    invoke-direct {v5, v3, v1, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 29
    .line 30
    .line 31
    new-instance v1, La/d7a0;

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-direct {v1, v0, v8, v3}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    new-instance v3, La/fnq;

    .line 38
    .line 39
    invoke-direct {v3, v5, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, La/gbv;

    .line 43
    .line 44
    const/16 v5, 0x15

    .line 45
    .line 46
    invoke-direct {v1, v0, v8, v5}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 47
    .line 48
    .line 49
    new-instance v9, La/dnq;

    .line 50
    .line 51
    invoke-direct {v9, v3, v1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 52
    .line 53
    .line 54
    sget-object v0, La/lkz;->a:La/lkz;

    .line 55
    .line 56
    new-instance v0, La/hi70;

    .line 57
    .line 58
    const/16 v7, 0x1c

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    const-class v3, La/w4b0;

    .line 62
    .line 63
    const-string v4, "handleScreenUiState"

    .line 64
    .line 65
    const-string v5, "handleScreenUiState(Lorg/xplatform/feed/popularclassic/dayexpress/PopularClassicDayExpressViewModel$ScreenUiState;)V"

    .line 66
    .line 67
    move-object v2, p0

    .line 68
    invoke-direct/range {v0 .. v7}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v4, La/fra0;

    .line 84
    .line 85
    move-object v5, v9

    .line 86
    const/4 v9, 0x0

    .line 87
    move-object v7, v0

    .line 88
    invoke-direct/range {v4 .. v9}, La/fra0;-><init>(La/dnq;La/clz;La/hi70;La/yje;B)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x3

    .line 92
    invoke-static {v1, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final G0()La/s4b0;
    .locals 0

    .line 1
    iget-object p0, p0, La/w4b0;->O1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/s4b0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0()La/w2r;
    .locals 2

    .line 1
    sget-object v0, La/w4b0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/w4b0;->L1:La/s0r;

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
    check-cast p0, La/w2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/w4b0;->H0()La/w2r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/w2r;->d:La/ewe;

    .line 6
    .line 7
    iget-object p0, p0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 8
    .line 9
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/w4b0;->H0()La/w2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/w2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, La/yx5;->Z()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/w4b0;->P1:Z

    .line 2
    .line 3
    return p0
.end method

.class public final La/axe;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/axe;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kud",
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
.field public static final e2:La/kud;

.field public static final synthetic f2:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/s0r;

.field public final M1:La/phf0;

.field public final N1:La/cgx0;

.field public final O1:La/kiu0;

.field public P1:La/fiu0;

.field public Q1:La/ii;

.field public R1:La/ynb;

.field public S1:La/poq0;

.field public U1:La/wdk0;

.field public final V1:Z

.field public final W1:La/n0o0;

.field public X1:La/vyx;

.field public Y1:Ljava/lang/Integer;

.field public Z1:Ljava/lang/Integer;

.field public a2:La/qse;

.field public final b2:La/a8z;

.field public c2:Landroidx/compose/ui/platform/ComposeView;

.field public final d2:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/axe;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/coupon/impl/databinding/FragmentCouponBinding;"

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
    const-string v3, "couponId"

    .line 16
    .line 17
    const-string v5, "getCouponId()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "afterBet"

    .line 25
    .line 26
    const-string v6, "getAfterBet()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/axe;->f2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/kud;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/axe;->e2:La/kud;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0224

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
    iput-object v0, p0, La/axe;->K1:La/hnm0;

    .line 10
    .line 11
    sget-object v0, La/zwe;->a:La/zwe;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/axe;->L1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/phf0;

    .line 20
    .line 21
    const-string v1, "COUPON_ID_KEY"

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/axe;->M1:La/phf0;

    .line 27
    .line 28
    new-instance v0, La/cgx0;

    .line 29
    .line 30
    const-string v1, "AFTER_BET"

    .line 31
    .line 32
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, La/axe;->N1:La/cgx0;

    .line 36
    .line 37
    new-instance v0, La/twe;

    .line 38
    .line 39
    const/4 v1, 0x7

    .line 40
    invoke-direct {v0, p0, v1}, La/twe;-><init>(La/axe;B)V

    .line 41
    .line 42
    .line 43
    new-instance v2, La/aqe;

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    invoke-direct {v2, p0, v3}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    sget-object v3, La/wez;->b:La/wez;

    .line 50
    .line 51
    new-instance v4, La/aqe;

    .line 52
    .line 53
    const/4 v5, 0x4

    .line 54
    invoke-direct {v4, v2, v5}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-class v4, La/r7f;

    .line 62
    .line 63
    sget-object v5, La/sre0;->a:La/tre0;

    .line 64
    .line 65
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    new-instance v5, La/cce;

    .line 70
    .line 71
    const/4 v6, 0x6

    .line 72
    invoke-direct {v5, v2, v6}, La/cce;-><init>(La/a8z;B)V

    .line 73
    .line 74
    .line 75
    new-instance v6, La/cce;

    .line 76
    .line 77
    invoke-direct {v6, v2, v1}, La/cce;-><init>(La/a8z;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v4, v5, v6, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/axe;->O1:La/kiu0;

    .line 85
    .line 86
    const/4 v0, 0x1

    .line 87
    iput-boolean v0, p0, La/axe;->V1:Z

    .line 88
    .line 89
    new-instance v0, La/twe;

    .line 90
    .line 91
    const/16 v1, 0x8

    .line 92
    .line 93
    invoke-direct {v0, p0, v1}, La/twe;-><init>(La/axe;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, La/axe;->W1:La/n0o0;

    .line 101
    .line 102
    new-instance v0, La/twe;

    .line 103
    .line 104
    const/16 v1, 0x9

    .line 105
    .line 106
    invoke-direct {v0, p0, v1}, La/twe;-><init>(La/axe;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, La/axe;->b2:La/a8z;

    .line 114
    .line 115
    new-instance v0, La/twe;

    .line 116
    .line 117
    const/16 v1, 0xa

    .line 118
    .line 119
    invoke-direct {v0, p0, v1}, La/twe;-><init>(La/axe;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, p0, La/axe;->d2:La/n0o0;

    .line 127
    .line 128
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/yqc;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/yqc;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-static {p1, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/pzq;->i:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x3

    .line 28
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, La/axe;->d2:La/n0o0;

    .line 32
    .line 33
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, La/po8;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->y(La/po8;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p1, p1, La/pzq;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p1, p1, La/pzq;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 65
    .line 66
    .line 67
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->h1:Z

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    if-eq p1, v2, :cond_0

    .line 71
    .line 72
    iput-boolean v2, p0, Landroidx/fragment/app/Fragment;->h1:Z

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_0

    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_0

    .line 85
    .line 86
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->w:La/jxq;

    .line 87
    .line 88
    iget-object p1, p1, La/jxq;->e:La/kxq;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 91
    .line 92
    .line 93
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-eqz p1, :cond_1

    .line 102
    .line 103
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    new-instance v4, La/t32;

    .line 108
    .line 109
    const/16 v5, 0x1c

    .line 110
    .line 111
    invoke-direct {v4, v5}, La/t32;-><init>(B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-instance v5, Landroid/os/Handler;

    .line 119
    .line 120
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 125
    .line 126
    .line 127
    new-instance v6, La/b1;

    .line 128
    .line 129
    const/4 v7, 0x2

    .line 130
    invoke-direct {v6, v3, p1, v4, v7}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 131
    .line 132
    .line 133
    const-wide/16 v3, 0x0

    .line 134
    .line 135
    invoke-virtual {v5, v6, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 136
    .line 137
    .line 138
    :cond_1
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object p1, p1, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setMotionEventSplittingEnabled(Z)V

    .line 145
    .line 146
    .line 147
    new-instance v3, Lorg/xplatform/coupon/impl/coupon/presentation/common/LinearLayoutManagerWrapper;

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-direct {v3, v4}, Lorg/xplatform/coupon/impl/coupon/presentation/common/LinearLayoutManagerWrapper;-><init>(Landroid/content/Context;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 160
    .line 161
    .line 162
    new-instance v3, La/qse;

    .line 163
    .line 164
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-direct {v3, v0, v0, v4}, La/qse;-><init>(ZZLandroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    iput-object v3, p0, La/axe;->a2:La/qse;

    .line 175
    .line 176
    iget-object v3, p0, La/axe;->b2:La/a8z;

    .line 177
    .line 178
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, La/tre;

    .line 183
    .line 184
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 185
    .line 186
    .line 187
    new-instance v3, La/vwk;

    .line 188
    .line 189
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    const v5, 0x7f0706f8

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    invoke-direct {v3, v4}, La/vwk;-><init>(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 204
    .line 205
    .line 206
    iget-object v3, p0, La/axe;->a2:La/qse;

    .line 207
    .line 208
    if-eqz v3, :cond_2

    .line 209
    .line 210
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 211
    .line 212
    .line 213
    :cond_2
    new-instance v3, La/cnc;

    .line 214
    .line 215
    const/16 v4, 0x11

    .line 216
    .line 217
    invoke-direct {v3, p1, v4}, La/cnc;-><init>(Ljava/lang/Object;B)V

    .line 218
    .line 219
    .line 220
    new-instance v4, La/bod0;

    .line 221
    .line 222
    const/16 v5, 0x18

    .line 223
    .line 224
    invoke-direct {v4, v5}, La/bod0;-><init>(B)V

    .line 225
    .line 226
    .line 227
    new-instance v5, La/aie0;

    .line 228
    .line 229
    invoke-direct {v5, v4, v3, v0}, La/aie0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iget-object p1, p1, La/pzq;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 240
    .line 241
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getAuthorizationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    new-instance v3, La/uwe;

    .line 246
    .line 247
    const/16 v4, 0x8

    .line 248
    .line 249
    invoke-direct {v3, p0, v4}, La/uwe;-><init>(La/axe;B)V

    .line 250
    .line 251
    .line 252
    invoke-static {p1, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    iget-object p1, p1, La/pzq;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 260
    .line 261
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getRegistrationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    new-instance v3, La/uwe;

    .line 266
    .line 267
    const/16 v4, 0x9

    .line 268
    .line 269
    invoke-direct {v3, p0, v4}, La/uwe;-><init>(La/axe;B)V

    .line 270
    .line 271
    .line 272
    invoke-static {p1, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    iget-object p1, p1, La/pzq;->n:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 280
    .line 281
    new-instance v3, La/uwe;

    .line 282
    .line 283
    invoke-direct {v3, p0, v1}, La/uwe;-><init>(La/axe;B)V

    .line 284
    .line 285
    .line 286
    invoke-static {p1, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    iget-object p1, p1, La/pzq;->f:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 294
    .line 295
    new-instance v1, La/uwe;

    .line 296
    .line 297
    const/16 v3, 0xb

    .line 298
    .line 299
    invoke-direct {v1, p0, v3}, La/uwe;-><init>(La/axe;B)V

    .line 300
    .line 301
    .line 302
    invoke-static {p1, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    iget-object p1, p1, La/pzq;->g:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 310
    .line 311
    new-instance v1, La/uwe;

    .line 312
    .line 313
    const/16 v3, 0xc

    .line 314
    .line 315
    invoke-direct {v1, p0, v3}, La/uwe;-><init>(La/axe;B)V

    .line 316
    .line 317
    .line 318
    invoke-static {p1, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    iget-object p1, p1, La/pzq;->k:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 326
    .line 327
    new-instance v1, La/uwe;

    .line 328
    .line 329
    const/16 v3, 0xd

    .line 330
    .line 331
    invoke-direct {v1, p0, v3}, La/uwe;-><init>(La/axe;B)V

    .line 332
    .line 333
    .line 334
    invoke-static {p1, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    iget-object p1, p1, La/pzq;->r:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 342
    .line 343
    new-instance v1, La/uwe;

    .line 344
    .line 345
    const/16 v3, 0xe

    .line 346
    .line 347
    invoke-direct {v1, p0, v3}, La/uwe;-><init>(La/axe;B)V

    .line 348
    .line 349
    .line 350
    invoke-static {p1, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 351
    .line 352
    .line 353
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    iget-object p1, p1, La/pzq;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 358
    .line 359
    new-instance v1, La/twe;

    .line 360
    .line 361
    const/16 v3, 0xf

    .line 362
    .line 363
    invoke-direct {v1, p0, v3}, La/twe;-><init>(La/axe;B)V

    .line 364
    .line 365
    .line 366
    invoke-static {p1, v1, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->v(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lkotlin/jvm/functions/Function0;I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    iget-object p1, p1, La/pzq;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 374
    .line 375
    sget-object v1, La/ymx;->h:La/ymx;

    .line 376
    .line 377
    new-instance v3, La/twe;

    .line 378
    .line 379
    invoke-direct {v3, p0, v0}, La/twe;-><init>(La/axe;B)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1, v1, v2, v3}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->y(La/ymx;ZLkotlin/jvm/functions/Function0;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    iget-object p1, p1, La/pzq;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 390
    .line 391
    new-instance v0, La/twe;

    .line 392
    .line 393
    const/4 v2, 0x4

    .line 394
    invoke-direct {v0, p0, v2}, La/twe;-><init>(La/axe;B)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {p1, v1, v0}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->A(La/ymx;Lkotlin/jvm/functions/Function0;)V

    .line 398
    .line 399
    .line 400
    return-void
.end method

.method public final C0()V
    .locals 60

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/bxe;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/bxe;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/bxe;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    const/4 v1, 0x1

    .line 62
    sget-object v2, La/axe;->f2:[La/iiy;

    .line 63
    .line 64
    aget-object v1, v2, v1

    .line 65
    .line 66
    iget-object v4, v0, La/axe;->M1:La/phf0;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    const/4 v1, 0x2

    .line 73
    aget-object v1, v2, v1

    .line 74
    .line 75
    iget-object v2, v0, La/axe;->N1:La/cgx0;

    .line 76
    .line 77
    invoke-virtual {v2, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v14

    .line 81
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v5, v3, La/bxe;->a:La/cad;

    .line 88
    .line 89
    iget-object v15, v3, La/bxe;->b:La/gii0;

    .line 90
    .line 91
    iget-object v1, v3, La/bxe;->c:La/duj;

    .line 92
    .line 93
    iget-object v2, v3, La/bxe;->d:La/m1e;

    .line 94
    .line 95
    iget-object v4, v3, La/bxe;->e:La/zfo;

    .line 96
    .line 97
    iget-object v6, v3, La/bxe;->f:La/gst0;

    .line 98
    .line 99
    iget-object v11, v3, La/bxe;->J:La/ii;

    .line 100
    .line 101
    iget-object v7, v3, La/bxe;->g:La/ocl;

    .line 102
    .line 103
    iget-object v8, v3, La/bxe;->h:La/ctf0;

    .line 104
    .line 105
    iget-object v9, v3, La/bxe;->i:La/knf0;

    .line 106
    .line 107
    iget-object v10, v3, La/bxe;->j:La/uf3;

    .line 108
    .line 109
    move-object/from16 v16, v1

    .line 110
    .line 111
    iget-object v1, v3, La/bxe;->k:La/qu;

    .line 112
    .line 113
    move-object/from16 v24, v1

    .line 114
    .line 115
    iget-object v1, v3, La/bxe;->l:La/ag3;

    .line 116
    .line 117
    move-object/from16 v25, v1

    .line 118
    .line 119
    iget-object v1, v3, La/bxe;->m:La/v88;

    .line 120
    .line 121
    move-object/from16 v29, v1

    .line 122
    .line 123
    iget-object v1, v3, La/bxe;->n:La/ouu;

    .line 124
    .line 125
    move-object/from16 v22, v9

    .line 126
    .line 127
    iget-object v9, v3, La/bxe;->K:La/wsf0;

    .line 128
    .line 129
    move-object/from16 v30, v1

    .line 130
    .line 131
    iget-object v1, v3, La/bxe;->o:La/kt2;

    .line 132
    .line 133
    move-object/from16 v31, v1

    .line 134
    .line 135
    iget-object v1, v3, La/bxe;->p:La/onv;

    .line 136
    .line 137
    move-object/from16 v32, v1

    .line 138
    .line 139
    iget-object v1, v3, La/bxe;->q:La/vwb0;

    .line 140
    .line 141
    move-object/from16 v33, v1

    .line 142
    .line 143
    iget-object v1, v3, La/bxe;->r:La/us3;

    .line 144
    .line 145
    move-object/from16 v26, v1

    .line 146
    .line 147
    iget-object v1, v3, La/bxe;->s:La/edo;

    .line 148
    .line 149
    move-object/from16 v27, v1

    .line 150
    .line 151
    iget-object v1, v3, La/bxe;->t:La/ulk;

    .line 152
    .line 153
    move-object/from16 v28, v1

    .line 154
    .line 155
    iget-object v1, v3, La/bxe;->u:La/pru;

    .line 156
    .line 157
    move-object/from16 v34, v1

    .line 158
    .line 159
    iget-object v1, v3, La/bxe;->v:La/wyu;

    .line 160
    .line 161
    move-object/from16 v17, v1

    .line 162
    .line 163
    iget-object v1, v3, La/bxe;->w:La/std;

    .line 164
    .line 165
    move-object/from16 v35, v1

    .line 166
    .line 167
    iget-object v1, v3, La/bxe;->x:La/qv2;

    .line 168
    .line 169
    move-object/from16 v36, v1

    .line 170
    .line 171
    iget-object v1, v3, La/bxe;->y:La/eke0;

    .line 172
    .line 173
    move-object/from16 v37, v1

    .line 174
    .line 175
    iget-object v1, v3, La/bxe;->z:La/poq0;

    .line 176
    .line 177
    move-object/from16 v19, v6

    .line 178
    .line 179
    iget-object v6, v3, La/bxe;->A:La/o2j0;

    .line 180
    .line 181
    move-object/from16 v20, v7

    .line 182
    .line 183
    iget-object v7, v3, La/bxe;->B:La/bzu;

    .line 184
    .line 185
    move-object/from16 v21, v8

    .line 186
    .line 187
    iget-object v8, v3, La/bxe;->C:La/vqc;

    .line 188
    .line 189
    move-object/from16 v38, v1

    .line 190
    .line 191
    iget-object v1, v3, La/bxe;->D:La/x20;

    .line 192
    .line 193
    move-object/from16 v39, v1

    .line 194
    .line 195
    iget-object v1, v3, La/bxe;->E:La/s64;

    .line 196
    .line 197
    move-object/from16 v40, v1

    .line 198
    .line 199
    iget-object v1, v3, La/bxe;->F:La/cmt;

    .line 200
    .line 201
    move-object/from16 v41, v1

    .line 202
    .line 203
    iget-object v1, v3, La/bxe;->G:La/l7k;

    .line 204
    .line 205
    move-object/from16 v42, v1

    .line 206
    .line 207
    iget-object v1, v3, La/bxe;->H:La/cyu;

    .line 208
    .line 209
    move-object/from16 v43, v1

    .line 210
    .line 211
    iget-object v1, v3, La/bxe;->I:La/x20;

    .line 212
    .line 213
    move-object/from16 v44, v1

    .line 214
    .line 215
    iget-object v1, v3, La/bxe;->L:La/lye;

    .line 216
    .line 217
    move-object/from16 v45, v1

    .line 218
    .line 219
    iget-object v1, v3, La/bxe;->M:La/m0f;

    .line 220
    .line 221
    move-object/from16 v46, v1

    .line 222
    .line 223
    iget-object v1, v3, La/bxe;->N:La/ave;

    .line 224
    .line 225
    move-object/from16 v47, v1

    .line 226
    .line 227
    iget-object v1, v3, La/bxe;->O:La/q7d0;

    .line 228
    .line 229
    move-object/from16 v48, v1

    .line 230
    .line 231
    iget-object v1, v3, La/bxe;->P:La/rrc;

    .line 232
    .line 233
    move-object/from16 v49, v1

    .line 234
    .line 235
    iget-object v1, v3, La/bxe;->Q:La/wdk0;

    .line 236
    .line 237
    move-object/from16 v50, v1

    .line 238
    .line 239
    iget-object v1, v3, La/bxe;->R:La/vby;

    .line 240
    .line 241
    move-object/from16 v51, v1

    .line 242
    .line 243
    iget-object v1, v3, La/bxe;->S:La/j1q0;

    .line 244
    .line 245
    move-object/from16 v52, v1

    .line 246
    .line 247
    iget-object v1, v3, La/bxe;->T:La/r9u;

    .line 248
    .line 249
    move-object/from16 v53, v1

    .line 250
    .line 251
    iget-object v1, v3, La/bxe;->U:La/b3u;

    .line 252
    .line 253
    move-object/from16 v54, v1

    .line 254
    .line 255
    iget-object v1, v3, La/bxe;->V:La/etj;

    .line 256
    .line 257
    move-object/from16 v55, v1

    .line 258
    .line 259
    iget-object v1, v3, La/bxe;->W:La/h3c;

    .line 260
    .line 261
    move-object/from16 v56, v1

    .line 262
    .line 263
    iget-object v1, v3, La/bxe;->X:La/b3c0;

    .line 264
    .line 265
    move-object/from16 v23, v10

    .line 266
    .line 267
    iget-object v10, v3, La/bxe;->Y:La/peg0;

    .line 268
    .line 269
    move-object/from16 v57, v1

    .line 270
    .line 271
    iget-object v1, v3, La/bxe;->Z:La/dmt;

    .line 272
    .line 273
    iget-object v3, v3, La/bxe;->a0:La/mii0;

    .line 274
    .line 275
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v47 .. v47}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v50 .. v50}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v52 .. v52}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v53 .. v53}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v55 .. v55}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v57 .. v57}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    move-object/from16 v18, v4

    .line 345
    .line 346
    new-instance v4, La/jdi;

    .line 347
    .line 348
    move-object/from16 v58, v1

    .line 349
    .line 350
    move-object/from16 v17, v2

    .line 351
    .line 352
    move-object/from16 v59, v3

    .line 353
    .line 354
    invoke-direct/range {v4 .. v59}, La/jdi;-><init>(La/cad;La/o2j0;La/bzu;La/vqc;La/wsf0;La/peg0;La/ii;La/i1w0;Ljava/lang/String;Ljava/lang/Boolean;La/gii0;La/duj;La/m1e;La/zfo;La/gst0;La/ocl;La/ctf0;La/knf0;La/uf3;La/qu;La/ag3;La/us3;La/edo;La/ulk;La/v88;La/ouu;La/kt2;La/onv;La/vwb0;La/pru;La/std;La/qv2;La/eke0;La/poq0;La/x20;La/s64;La/cmt;La/l7k;La/cyu;La/x20;La/lye;La/m0f;La/ave;La/q7d0;La/rrc;La/wdk0;La/vby;La/j1q0;La/r9u;La/b3u;La/etj;La/h3c;La/b3c0;La/dmt;La/mii0;)V

    .line 355
    .line 356
    .line 357
    move-object/from16 v1, v38

    .line 358
    .line 359
    move-object/from16 v2, v50

    .line 360
    .line 361
    new-instance v3, La/fiu0;

    .line 362
    .line 363
    iget-object v4, v4, La/jdi;->a0:La/n5d0;

    .line 364
    .line 365
    check-cast v4, La/uci;

    .line 366
    .line 367
    const-class v5, La/r7f;

    .line 368
    .line 369
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 374
    .line 375
    .line 376
    iput-object v3, v0, La/axe;->P1:La/fiu0;

    .line 377
    .line 378
    iput-object v11, v0, La/axe;->Q1:La/ii;

    .line 379
    .line 380
    iget-object v3, v10, La/peg0;->b:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v3, La/yzn0;

    .line 383
    .line 384
    invoke-virtual {v3}, La/yzn0;->i()La/ynb;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    iput-object v3, v0, La/axe;->R1:La/ynb;

    .line 392
    .line 393
    iput-object v1, v0, La/axe;->S1:La/poq0;

    .line 394
    .line 395
    iput-object v2, v0, La/axe;->U1:La/wdk0;

    .line 396
    .line 397
    return-void

    .line 398
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 399
    .line 400
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/r7f;->e2:La/ol60;

    .line 6
    .line 7
    new-instance v1, La/wib;

    .line 8
    .line 9
    const/16 v2, 0xb

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    invoke-direct {v1, p0, v7, v2}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    sget-object v2, La/lkz;->a:La/lkz;

    .line 16
    .line 17
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-instance v4, La/zpe;

    .line 30
    .line 31
    invoke-direct {v4, v0, v2, v1, v7}, La/zpe;-><init>(La/gmq;La/clz;La/wib;La/yje;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v1, v1, La/r7f;->W1:La/p7m0;

    .line 43
    .line 44
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v2, La/ywe;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, p0, v7, v3}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    new-instance v5, La/zpe;

    .line 67
    .line 68
    invoke-direct {v5, v1, v3, v2, v7}, La/zpe;-><init>(La/xae0;La/clz;La/ywe;La/yje;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v4, v7, v7, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v1, v1, La/r7f;->X1:La/p7m0;

    .line 79
    .line 80
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    new-instance v6, La/ywe;

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    invoke-direct {v6, p0, v7, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    new-instance v3, La/zpe;

    .line 103
    .line 104
    const/4 v8, 0x0

    .line 105
    invoke-direct/range {v3 .. v8}, La/zpe;-><init>(La/xae0;La/clz;La/ywe;La/yje;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v1, v1, La/r7f;->Y1:La/p7m0;

    .line 116
    .line 117
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    new-instance v6, La/ywe;

    .line 122
    .line 123
    const/4 v1, 0x2

    .line 124
    invoke-direct {v6, p0, v7, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 125
    .line 126
    .line 127
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    new-instance v3, La/zpe;

    .line 140
    .line 141
    invoke-direct/range {v3 .. v8}, La/zpe;-><init>(La/xae0;La/clz;La/ywe;La/yje;C)V

    .line 142
    .line 143
    .line 144
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iget-object v1, v1, La/r7f;->Z1:La/p7m0;

    .line 152
    .line 153
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    new-instance v6, La/ywe;

    .line 158
    .line 159
    invoke-direct {v6, p0, v7, v0}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 160
    .line 161
    .line 162
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-instance v3, La/zpe;

    .line 175
    .line 176
    invoke-direct/range {v3 .. v8}, La/zpe;-><init>(La/xae0;La/clz;La/ywe;La/yje;I)V

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    iget-object v2, v1, La/r7f;->a2:La/p7m0;

    .line 187
    .line 188
    invoke-static {v2}, La/vtb;->N(La/qz40;)La/xae0;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    new-instance v3, La/c00;

    .line 193
    .line 194
    const/16 v4, 0x1c

    .line 195
    .line 196
    invoke-direct {v3, v2, v1, v4}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 197
    .line 198
    .line 199
    new-instance v1, La/ywe;

    .line 200
    .line 201
    const/4 v2, 0x4

    .line 202
    invoke-direct {v1, p0, v7, v2}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 203
    .line 204
    .line 205
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    new-instance v5, La/zpe;

    .line 218
    .line 219
    invoke-direct {v5, v3, v2, v1, v7}, La/zpe;-><init>(La/c00;La/clz;La/ywe;La/yje;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v4, v7, v7, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    iget-object v1, v1, La/r7f;->b2:La/ol60;

    .line 230
    .line 231
    new-instance v2, La/ywe;

    .line 232
    .line 233
    const/4 v3, 0x5

    .line 234
    invoke-direct {v2, p0, v7, v3}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 235
    .line 236
    .line 237
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    new-instance v5, La/zpe;

    .line 250
    .line 251
    invoke-direct {v5, v1, v3, v2, v7}, La/zpe;-><init>(La/gmq;La/clz;La/ywe;La/yje;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v4, v7, v7, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    iget-object v4, v1, La/r7f;->d2:La/ol60;

    .line 262
    .line 263
    new-instance v6, La/ywe;

    .line 264
    .line 265
    const/4 v1, 0x6

    .line 266
    invoke-direct {v6, p0, v7, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 267
    .line 268
    .line 269
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    new-instance v3, La/zpe;

    .line 282
    .line 283
    invoke-direct/range {v3 .. v8}, La/zpe;-><init>(La/gmq;La/clz;La/ywe;La/yje;B)V

    .line 284
    .line 285
    .line 286
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 287
    .line 288
    .line 289
    return-void
.end method

.method public final G0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/pzq;->i:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-static {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eq v0, v2, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-eq v0, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return v2
.end method

.method public final H0(ZZ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/16 p0, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x6

    .line 27
    invoke-direct {p1, p2, v1, v2}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p2, La/qek0;->h:La/qek0;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, La/x1;->setViewCompositionStrategy(La/vgu0;)V

    .line 33
    .line 34
    .line 35
    new-instance p2, La/gwq0;

    .line 36
    .line 37
    invoke-direct {p2}, La/gwq0;-><init>()V

    .line 38
    .line 39
    .line 40
    const v1, 0x800013

    .line 41
    .line 42
    .line 43
    iput v1, p2, La/gwq0;->a:I

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/axe;->c2:Landroidx/compose/ui/platform/ComposeView;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, La/oiz;->setCustomView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final I0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pzq;->i:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/axe;->K0()La/kse;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/high16 v0, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-interface {p0, v0}, La/kse;->c(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final J0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/axe;->Q1:La/ii;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "actionDialogManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final K0()La/kse;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "MakeBetFragment"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of v0, p0, La/kse;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    check-cast p0, La/kse;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public final L0()La/pzq;
    .locals 2

    .line 1
    sget-object v0, La/axe;->f2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/axe;->L1:La/s0r;

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
    check-cast p0, La/pzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final M0()La/r7f;
    .locals 0

    .line 1
    iget-object p0, p0, La/axe;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/r7f;

    .line 8
    .line 9
    return-object p0
.end method

.method public final N0(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/axe;->G0()Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 9
    .line 10
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-gt v0, v1, :cond_0

    .line 20
    .line 21
    sget-object v0, La/n4f;->k2:La/kwd;

    .line 22
    .line 23
    const v1, 0x7f130273

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const-string v0, "COUPON_TYPE_REQUEST_KEY"

    .line 44
    .line 45
    invoke-static {v1, p1, v0, p0}, La/kwd;->g(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/fragment/app/e;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public final O0()V
    .locals 14

    .line 1
    invoke-virtual {p0}, La/axe;->J0()La/ii;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f130471

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const v1, 0x7f130513

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const v1, 0x7f13032f

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const v1, 0x7f130e5d

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v11, La/n12;->a:La/n12;

    .line 37
    .line 38
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 39
    .line 40
    const/4 v12, 0x0

    .line 41
    const/16 v13, 0x5d0

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    const-string v8, "COUPON_DELETE_ALL_REQUEST_KEY"

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    const/4 v10, 0x0

    .line 48
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final P0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/r7f;->I0:La/qu;

    .line 6
    .line 7
    iget-object v1, v1, La/qu;->a:La/kt2;

    .line 8
    .line 9
    const-string v2, "action"

    .line 10
    .line 11
    const-string v3, "download"

    .line 12
    .line 13
    const-string v4, "coupon_action_call"

    .line 14
    .line 15
    invoke-static {v2, v3, v1, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/r7f;->K0:La/x20;

    .line 19
    .line 20
    sget-object v1, La/di;->b:La/di;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/x20;->a(La/di;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-class v1, La/yl00;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    sget-object v0, La/yl00;->n2:La/htz;

    .line 42
    .line 43
    sget-object v1, La/axe;->f2:[La/iiy;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    aget-object v1, v1, v2

    .line 47
    .line 48
    iget-object v3, p0, La/axe;->M1:La/phf0;

    .line 49
    .line 50
    invoke-virtual {v3, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v0, La/yl00;

    .line 61
    .line 62
    invoke-direct {v0}, La/yl00;-><init>()V

    .line 63
    .line 64
    .line 65
    sget-object v3, La/yl00;->o2:[La/iiy;

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    aget-object v4, v3, v4

    .line 69
    .line 70
    iget-object v5, v0, La/yl00;->j2:La/phf0;

    .line 71
    .line 72
    const-string v6, "LOAD_COUPON_REQUEST_KEY"

    .line 73
    .line 74
    invoke-virtual {v5, v0, v4, v6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v4, v0, La/yl00;->k2:La/phf0;

    .line 78
    .line 79
    aget-object v2, v3, v2

    .line 80
    .line 81
    invoke-virtual {v4, v0, v2, v1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {v0, p0}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 92
    .line 93
    .line 94
    :cond_0
    return-void
.end method

.method public final Q0(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pzq;->i:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-lez p1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, La/axe;->Z1:Ljava/lang/Integer;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eq v1, p1, :cond_1

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const v2, 0x7f07070c

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, p1

    .line 36
    invoke-virtual {v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/axe;->Z1:Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p1, p1, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 50
    .line 51
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v2, v2, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget-object p0, p0, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-virtual {p1, v0, v2, p0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 19

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La/uwe;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v2, v1}, La/uwe;-><init>(La/axe;B)V

    .line 10
    .line 11
    .line 12
    const-string v1, "COUPON_TYPE_REQUEST_KEY"

    .line 13
    .line 14
    invoke-static {v2, v1, v0}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, La/uwe;

    .line 18
    .line 19
    const/4 v8, 0x2

    .line 20
    invoke-direct {v0, v2, v8}, La/uwe;-><init>(La/axe;B)V

    .line 21
    .line 22
    .line 23
    const-string v1, "COUPON_CHANGE_BLOCK_REQUEST_KEY"

    .line 24
    .line 25
    invoke-static {v2, v1, v0}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, La/uwe;

    .line 29
    .line 30
    const/4 v9, 0x3

    .line 31
    invoke-direct {v0, v2, v9}, La/uwe;-><init>(La/axe;B)V

    .line 32
    .line 33
    .line 34
    const-string v1, "COUPON_ACTION_REQUEST_KEY"

    .line 35
    .line 36
    invoke-static {v2, v1, v0}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, La/uwe;

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    invoke-direct {v0, v2, v1}, La/uwe;-><init>(La/axe;B)V

    .line 43
    .line 44
    .line 45
    const-string v1, "CHANGE_SYSTEM_REQUEST_KEY"

    .line 46
    .line 47
    invoke-static {v2, v1, v0}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, La/uwe;

    .line 51
    .line 52
    const/4 v10, 0x5

    .line 53
    invoke-direct {v0, v2, v10}, La/uwe;-><init>(La/axe;B)V

    .line 54
    .line 55
    .line 56
    const-string v1, "COUPON_BET_AMOUNT_REQUEST_KEY"

    .line 57
    .line 58
    invoke-static {v2, v1, v0}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/pw4;

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    const/16 v7, 0x1b

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    const-class v3, La/axe;

    .line 68
    .line 69
    const-string v4, "showLoadCoupon"

    .line 70
    .line 71
    const-string v5, "showLoadCoupon()V"

    .line 72
    .line 73
    invoke-direct/range {v0 .. v7}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    const-string v1, "COUPON_REPLACE_AFTER_LOAD_REQUEST_KEY"

    .line 77
    .line 78
    invoke-static {v2, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 79
    .line 80
    .line 81
    new-instance v11, La/pw4;

    .line 82
    .line 83
    invoke-virtual {v2}, La/axe;->M0()La/r7f;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    const/16 v17, 0x0

    .line 88
    .line 89
    const/16 v18, 0x1c

    .line 90
    .line 91
    const/4 v12, 0x0

    .line 92
    const-class v14, La/r7f;

    .line 93
    .line 94
    const-string v15, "showGenerateCoupon"

    .line 95
    .line 96
    const-string v16, "showGenerateCoupon()V"

    .line 97
    .line 98
    invoke-direct/range {v11 .. v18}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 99
    .line 100
    .line 101
    const-string v0, "COUPON_REPLACE_AFTER_GENERATE_REQUEST_KEY"

    .line 102
    .line 103
    invoke-static {v2, v0, v11}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 104
    .line 105
    .line 106
    new-instance v0, La/twe;

    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    invoke-direct {v0, v2, v1}, La/twe;-><init>(La/axe;B)V

    .line 110
    .line 111
    .line 112
    const-string v3, "COUPON_REPLACE_WITH_DEEP_LINK_REQUEST_KEY"

    .line 113
    .line 114
    invoke-static {v2, v3, v0}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 115
    .line 116
    .line 117
    new-instance v0, La/twe;

    .line 118
    .line 119
    invoke-direct {v0, v2, v8}, La/twe;-><init>(La/axe;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v2, v3, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 123
    .line 124
    .line 125
    new-instance v0, La/twe;

    .line 126
    .line 127
    invoke-direct {v0, v2, v9}, La/twe;-><init>(La/axe;B)V

    .line 128
    .line 129
    .line 130
    const-string v3, "COUPON_DELETE_ALL_REQUEST_KEY"

    .line 131
    .line 132
    invoke-static {v2, v3, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, La/twe;

    .line 136
    .line 137
    invoke-direct {v0, v2, v10}, La/twe;-><init>(La/axe;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v3, v0}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 141
    .line 142
    .line 143
    new-instance v0, La/twe;

    .line 144
    .line 145
    const/4 v3, 0x6

    .line 146
    invoke-direct {v0, v2, v3}, La/twe;-><init>(La/axe;B)V

    .line 147
    .line 148
    .line 149
    const-string v3, "COUPON_NOT_ENOUGH_BLOCKS_FOR_CONDITION_BET_REQUEST_KEY"

    .line 150
    .line 151
    invoke-static {v2, v3, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 152
    .line 153
    .line 154
    new-instance v0, La/uwe;

    .line 155
    .line 156
    invoke-direct {v0, v2, v1}, La/uwe;-><init>(La/axe;B)V

    .line 157
    .line 158
    .line 159
    const-string v1, "LOAD_COUPON_REQUEST_KEY"

    .line 160
    .line 161
    invoke-static {v2, v1, v0}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/axe;->X1:La/vyx;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, La/vyx;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object v1, p0, La/axe;->X1:La/vyx;

    .line 13
    .line 14
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p0, p0, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final d0()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object v0, p0, La/axe;->X1:La/vyx;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, La/r7f;->w1:Z

    .line 35
    .line 36
    iput-boolean v0, p0, La/r7f;->x1:Z

    .line 37
    .line 38
    iget-object v0, p0, La/r7f;->F1:La/bby;

    .line 39
    .line 40
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, La/r7f;->G1:La/bby;

    .line 44
    .line 45
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/r7f;->P1:La/bby;

    .line 49
    .line 50
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/r7f;->Q1:La/bby;

    .line 54
    .line 55
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final e0()V
    .locals 8

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/axe;->U1:La/wdk0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, v0, La/wdk0;->d:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    const-string v2, "SnackBarToCoupon"

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, La/rrm;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    const/4 v4, 0x3

    .line 36
    invoke-virtual {v3, v4}, La/g46;->a(I)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, La/r7f;->y1:Z

    .line 48
    .line 49
    iput-boolean v0, p0, La/r7f;->z1:Z

    .line 50
    .line 51
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v0, p0, La/r7f;->Y0:La/mne;

    .line 56
    .line 57
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 58
    .line 59
    sget-object v3, La/c5f;->a:La/c5f;

    .line 60
    .line 61
    new-instance v6, La/d5f;

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-direct {v6, p0, v1, v0}, La/d5f;-><init>(La/r7f;La/yje;B)V

    .line 65
    .line 66
    .line 67
    const/16 v7, 0xa

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, La/r7f;->S0:La/poq0;

    .line 74
    .line 75
    iget-object v0, v0, La/poq0;->a:La/jxi;

    .line 76
    .line 77
    invoke-virtual {v0}, La/jxi;->d()La/r8i;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v1, La/fk60;->f:La/fk60;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, La/r8i;->r(La/fk60;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    sget-object v0, La/b4f;->a:La/b4f;

    .line 90
    .line 91
    invoke-virtual {p0, v0}, La/r7f;->R(La/c4f;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    return-void

    .line 95
    :cond_3
    const-string p0, "snackbarManager"

    .line 96
    .line 97
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/axe;->Y1:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "BOTTOM_SHEET_STATE_BUNDLE_KEY"

    .line 10
    .line 11
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, La/axe;->Z1:Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const-string v0, "BOTTOM_SHEET_PEEK_HEIGHT_BUNDLE_KEY"

    .line 23
    .line 24
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final g0()V
    .locals 18

    .line 1
    invoke-super/range {p0 .. p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, La/axe;->M0()La/r7f;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    iget-object v0, v2, La/r7f;->q:La/k52;

    .line 9
    .line 10
    invoke-virtual {v0}, La/k52;->a()La/gmq;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, La/yg1;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/16 v9, 0x8

    .line 18
    .line 19
    invoke-direct {v1, v2, v8, v9}, La/yg1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/fnq;

    .line 23
    .line 24
    const/4 v10, 0x4

    .line 25
    invoke-direct {v3, v0, v1, v10}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 26
    .line 27
    .line 28
    sget-object v0, La/g7f;->h:La/g7f;

    .line 29
    .line 30
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v4, v2, La/r7f;->Y0:La/mne;

    .line 35
    .line 36
    iget-object v5, v4, La/mne;->b:La/dvj;

    .line 37
    .line 38
    invoke-static {v1, v5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v3, v1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, v2, La/r7f;->H1:La/c4m0;

    .line 47
    .line 48
    iget-object v0, v2, La/r7f;->Z0:La/m1e;

    .line 49
    .line 50
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, La/u88;

    .line 55
    .line 56
    const/4 v11, 0x6

    .line 57
    invoke-direct {v1, v2, v8, v11}, La/u88;-><init>(La/diu0;La/yje;B)V

    .line 58
    .line 59
    .line 60
    new-instance v3, La/fnq;

    .line 61
    .line 62
    invoke-direct {v3, v0, v1, v10}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 63
    .line 64
    .line 65
    sget-object v0, La/f7f;->h:La/f7f;

    .line 66
    .line 67
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v3, v1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, v2, La/r7f;->J1:La/c4m0;

    .line 76
    .line 77
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    iget-object v15, v4, La/mne;->b:La/dvj;

    .line 82
    .line 83
    new-instance v0, La/x6f;

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x4

    .line 87
    const/4 v1, 0x1

    .line 88
    const-class v3, La/r7f;

    .line 89
    .line 90
    const-string v4, "showLoginOrIgnore"

    .line 91
    .line 92
    const-string v5, "showLoginOrIgnore(Ljava/lang/Throwable;)V"

    .line 93
    .line 94
    invoke-direct/range {v0 .. v7}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 95
    .line 96
    .line 97
    new-instance v1, La/fj3;

    .line 98
    .line 99
    invoke-direct {v1, v2, v8, v11}, La/fj3;-><init>(La/diu0;La/yje;B)V

    .line 100
    .line 101
    .line 102
    const/16 v17, 0xa

    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    move-object v13, v0

    .line 106
    move-object/from16 v16, v1

    .line 107
    .line 108
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 109
    .line 110
    .line 111
    iget-object v0, v2, La/r7f;->r:La/ert;

    .line 112
    .line 113
    invoke-virtual {v0}, La/ert;->b()La/p7m0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-instance v1, La/fob;

    .line 118
    .line 119
    const/16 v3, 0x14

    .line 120
    .line 121
    invoke-direct {v1, v2, v8, v3}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 122
    .line 123
    .line 124
    new-instance v3, La/fnq;

    .line 125
    .line 126
    invoke-direct {v3, v0, v1, v10}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 127
    .line 128
    .line 129
    sget-object v0, La/e7f;->h:La/e7f;

    .line 130
    .line 131
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v3, v1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, v2, La/r7f;->K1:La/c4m0;

    .line 140
    .line 141
    iget-object v0, v2, La/r7f;->s:La/jtt;

    .line 142
    .line 143
    iget-object v0, v0, La/jtt;->a:La/g45;

    .line 144
    .line 145
    iget-object v0, v0, La/g45;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, La/ave;

    .line 148
    .line 149
    iget-object v0, v0, La/ave;->q:La/qoj0;

    .line 150
    .line 151
    new-instance v1, La/d5f;

    .line 152
    .line 153
    invoke-direct {v1, v2, v8, v9}, La/d5f;-><init>(La/r7f;La/yje;B)V

    .line 154
    .line 155
    .line 156
    new-instance v3, La/fnq;

    .line 157
    .line 158
    invoke-direct {v3, v0, v1, v10}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 159
    .line 160
    .line 161
    sget-object v0, La/d7f;->h:La/d7f;

    .line 162
    .line 163
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v3, v1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iput-object v0, v2, La/r7f;->L1:La/c4m0;

    .line 172
    .line 173
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pzq;->i:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/axe;->Y1:Ljava/lang/Integer;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, La/axe;->Z1:Ljava/lang/Integer;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 24
    .line 25
    invoke-virtual {p0}, La/axe;->M0()La/r7f;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object v1, p0, La/r7f;->H1:La/c4m0;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v1, p0, La/r7f;->I1:La/c4m0;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v1, p0, La/r7f;->J1:La/c4m0;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v1, p0, La/r7f;->K1:La/c4m0;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v1, p0, La/r7f;->L1:La/c4m0;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    iget-object v1, p0, La/r7f;->N1:La/bby;

    .line 65
    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 69
    .line 70
    .line 71
    :cond_5
    iget-object v1, p0, La/r7f;->S1:La/bby;

    .line 72
    .line 73
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, La/r7f;->O1:La/bby;

    .line 77
    .line 78
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 79
    .line 80
    .line 81
    iput-boolean v0, p0, La/r7f;->B1:Z

    .line 82
    .line 83
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const-string v0, "BOTTOM_SHEET_STATE_BUNDLE_KEY"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p0}, La/axe;->K0()La/kse;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-interface {v1, v0}, La/kse;->c(F)V

    .line 42
    .line 43
    .line 44
    :cond_2
    if-eqz p1, :cond_3

    .line 45
    .line 46
    const-string v0, "BOTTOM_SHEET_PEEK_HEIGHT_BUNDLE_KEY"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {p0}, La/axe;->L0()La/pzq;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v0, v0, La/pzq;->i:Landroid/widget/FrameLayout;

    .line 57
    .line 58
    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, La/axe;->Z1:Ljava/lang/Integer;

    .line 70
    .line 71
    :cond_3
    const/4 p1, 0x1

    .line 72
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 73
    .line 74
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/axe;->V1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/axe;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

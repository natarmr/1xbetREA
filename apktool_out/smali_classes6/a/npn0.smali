.class public final La/npn0;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/lj60;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/npn0;",
        "La/nw5;",
        "La/lj60;",
        "<init>",
        "()V",
        "a/g9m0",
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
.field public static final j2:La/g9m0;

.field public static final synthetic k2:[La/iiy;


# instance fields
.field public final e2:La/nae0;

.field public final f2:La/n0o0;

.field public final g2:La/bg5;

.field public final h2:La/kiu0;

.field public final i2:La/v62;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/npn0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/swipex/impl/databinding/OnboardingDialogBinding;"

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
    sput-object v1, La/npn0;->k2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/g9m0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/npn0;->j2:La/g9m0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/kpn0;->a:La/kpn0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/npn0;->e2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/jpn0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/jpn0;-><init>(La/npn0;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/npn0;->f2:La/n0o0;

    .line 23
    .line 24
    new-instance v0, La/bg5;

    .line 25
    .line 26
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v2, La/rj50;

    .line 30
    .line 31
    const/16 v3, 0x1b

    .line 32
    .line 33
    invoke-direct {v2, v3}, La/rj50;-><init>(B)V

    .line 34
    .line 35
    .line 36
    new-instance v3, La/wk60;

    .line 37
    .line 38
    invoke-direct {v3, v1}, La/wk60;-><init>(B)V

    .line 39
    .line 40
    .line 41
    new-instance v1, La/tvx;

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    const/16 v5, 0x1d

    .line 45
    .line 46
    invoke-direct {v1, v4, v5}, La/tvx;-><init>(IB)V

    .line 47
    .line 48
    .line 49
    sget-object v4, La/xk60;->b:La/xk60;

    .line 50
    .line 51
    new-instance v5, La/gbn;

    .line 52
    .line 53
    invoke-direct {v5, v2, v1, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, La/zz3;->d:La/dp;

    .line 57
    .line 58
    invoke-virtual {v1, v5}, La/dp;->b(La/gbn;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, La/npn0;->g2:La/bg5;

    .line 62
    .line 63
    new-instance v0, La/jpn0;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-direct {v0, p0, v1}, La/jpn0;-><init>(La/npn0;B)V

    .line 67
    .line 68
    .line 69
    new-instance v1, La/fyk0;

    .line 70
    .line 71
    const/16 v2, 0x17

    .line 72
    .line 73
    invoke-direct {v1, p0, v2}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    sget-object v2, La/wez;->b:La/wez;

    .line 77
    .line 78
    new-instance v3, La/fyk0;

    .line 79
    .line 80
    const/16 v4, 0x18

    .line 81
    .line 82
    invoke-direct {v3, v1, v4}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const-class v2, La/tpn0;

    .line 90
    .line 91
    sget-object v3, La/sre0;->a:La/tre0;

    .line 92
    .line 93
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    new-instance v3, La/cdl0;

    .line 98
    .line 99
    const/16 v4, 0x12

    .line 100
    .line 101
    invoke-direct {v3, v1, v4}, La/cdl0;-><init>(La/a8z;B)V

    .line 102
    .line 103
    .line 104
    new-instance v4, La/cdl0;

    .line 105
    .line 106
    const/16 v5, 0x13

    .line 107
    .line 108
    invoke-direct {v4, v1, v5}, La/cdl0;-><init>(La/a8z;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p0, La/npn0;->h2:La/kiu0;

    .line 116
    .line 117
    new-instance v0, La/v62;

    .line 118
    .line 119
    const/16 v1, 0x16

    .line 120
    .line 121
    invoke-direct {v0, p0, v1}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, La/npn0;->i2:La/v62;

    .line 125
    .line 126
    return-void
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/nw5;->C0(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/yae;

    .line 13
    .line 14
    move-object v0, p0

    .line 15
    check-cast v0, La/hw5;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {p1, v0, v1}, La/yae;-><init>(Landroid/app/Dialog;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040b5d

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/npn0;->T0()La/lj60;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, La/nw5;->N0()La/ow5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/ow5;->c:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {p0}, La/nw5;->N0()La/ow5;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v2, v2, La/ow5;->c:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const v3, 0x7f0802b3

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/npn0;->T0()La/lj60;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v2, v0, La/lj60;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 42
    .line 43
    iget-object v3, p0, La/npn0;->g2:La/bg5;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    const/4 v4, 0x2

    .line 55
    invoke-virtual {v3, v4}, Landroid/view/View;->setOverScrollMode(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    new-instance v3, La/xp6;

    .line 59
    .line 60
    const/16 v4, 0xc

    .line 61
    .line 62
    invoke-direct {v3, p0, v4}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v3}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 66
    .line 67
    .line 68
    new-instance v2, La/hhk;

    .line 69
    .line 70
    invoke-virtual {p0}, La/npn0;->T0()La/lj60;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v3, v3, La/lj60;->d:Lcom/google/android/material/tabs/TabLayout;

    .line 75
    .line 76
    invoke-virtual {p0}, La/npn0;->T0()La/lj60;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iget-object v4, v4, La/lj60;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 81
    .line 82
    new-instance v5, La/v4i0;

    .line 83
    .line 84
    const/16 v6, 0x8

    .line 85
    .line 86
    invoke-direct {v5, v6}, La/v4i0;-><init>(B)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v2, v3, v4, v5}, La/hhk;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;La/ybo0;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, La/hhk;->a()V

    .line 93
    .line 94
    .line 95
    iget-object v2, v0, La/lj60;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 96
    .line 97
    new-instance v3, La/ipn0;

    .line 98
    .line 99
    invoke-direct {v3, p0, v1}, La/ipn0;-><init>(La/npn0;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 103
    .line 104
    .line 105
    iget-object v0, v0, La/lj60;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 106
    .line 107
    new-instance v2, La/ipn0;

    .line 108
    .line 109
    const/4 v3, 0x1

    .line 110
    invoke-direct {v2, p0, v3}, La/ipn0;-><init>(La/npn0;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, La/npn0;->U0()La/tpn0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v2, v0, La/tpn0;->n:La/p7m0;

    .line 121
    .line 122
    invoke-static {v2}, La/vtb;->N(La/qz40;)La/xae0;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    new-instance v4, La/tmg0;

    .line 127
    .line 128
    const/16 v5, 0x1a

    .line 129
    .line 130
    const/4 v6, 0x0

    .line 131
    invoke-direct {v4, v0, v6, v5}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 132
    .line 133
    .line 134
    new-instance v0, La/s6n0;

    .line 135
    .line 136
    invoke-direct {v0, v2, v4}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 137
    .line 138
    .line 139
    new-instance v2, La/mpn0;

    .line 140
    .line 141
    invoke-direct {v2, p0, v6, v1}, La/mpn0;-><init>(La/npn0;La/yje;B)V

    .line 142
    .line 143
    .line 144
    sget-object v1, La/lkz;->a:La/lkz;

    .line 145
    .line 146
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    new-instance v5, La/agn0;

    .line 159
    .line 160
    invoke-direct {v5, v0, v1, v2, v6}, La/agn0;-><init>(La/s6n0;La/clz;La/mpn0;La/yje;)V

    .line 161
    .line 162
    .line 163
    const/4 v0, 0x3

    .line 164
    invoke-static {v4, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, La/npn0;->U0()La/tpn0;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iget-object v1, v1, La/tpn0;->o:La/ol60;

    .line 172
    .line 173
    new-instance v2, La/mpn0;

    .line 174
    .line 175
    invoke-direct {v2, p0, v6, v3}, La/mpn0;-><init>(La/npn0;La/yje;B)V

    .line 176
    .line 177
    .line 178
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    new-instance v5, La/agn0;

    .line 191
    .line 192
    invoke-direct {v5, v1, v3, v2, v6}, La/agn0;-><init>(La/gmq;La/clz;La/mpn0;La/yje;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v4, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 196
    .line 197
    .line 198
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    check-cast v0, La/wo8;

    .line 204
    .line 205
    invoke-virtual {v0}, La/hgd;->k()La/jg60;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iget-object p0, p0, La/npn0;->i2:La/v62;

    .line 214
    .line 215
    invoke-virtual {v0, v1, p0}, La/jg60;->a(La/clz;La/eg60;)V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0301

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final T0()La/lj60;
    .locals 2

    .line 1
    sget-object v0, La/npn0;->k2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/npn0;->e2:La/nae0;

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
    check-cast p0, La/lj60;

    .line 16
    .line 17
    return-object p0
.end method

.method public final U0()La/tpn0;
    .locals 0

    .line 1
    iget-object p0, p0, La/npn0;->h2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tpn0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 8
    .line 9
    if-eqz p0, :cond_3

    .line 10
    .line 11
    const p1, 0x7f0a0301

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    const p1, 0x7f0a06e3

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/16 p2, 0x8

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const p1, 0x7f0a1023

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    const p1, 0x7f0a0388

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    move-object v0, p0

    .line 58
    check-cast v0, Landroid/widget/FrameLayout;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/16 v5, 0xd

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    const/4 v2, 0x0

    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-static/range {v0 .. v5}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

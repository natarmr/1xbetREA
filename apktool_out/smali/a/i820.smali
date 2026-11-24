.class public final La/i820;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/kse;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/i820;",
        "La/yx5;",
        "La/kse;",
        "<init>",
        "()V",
        "a/atz",
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
.field public static final U1:La/atz;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/kiu0;

.field public final M1:La/s0r;

.field public final N1:La/sbx0;

.field public O1:La/e820;

.field public P1:La/xze;

.field public final Q1:La/de3;

.field public R1:I

.field public final S1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/i820;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/coupon/impl/databinding/FragmentCouponBetDsBinding;"

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
    sput-object v1, La/i820;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/atz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/i820;->U1:La/atz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0225

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/rx00;

    .line 8
    .line 9
    const/16 v1, 0xf

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/rx00;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/pv10;

    .line 15
    .line 16
    const/16 v2, 0xb

    .line 17
    .line 18
    invoke-direct {v1, p0, v2}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    sget-object v2, La/wez;->b:La/wez;

    .line 22
    .line 23
    new-instance v3, La/pv10;

    .line 24
    .line 25
    const/16 v4, 0xc

    .line 26
    .line 27
    invoke-direct {v3, v1, v4}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-class v2, La/wze;

    .line 35
    .line 36
    sget-object v3, La/sre0;->a:La/tre0;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-instance v3, La/y620;

    .line 43
    .line 44
    const/4 v4, 0x2

    .line 45
    invoke-direct {v3, v1, v4}, La/y620;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/y620;

    .line 49
    .line 50
    const/4 v5, 0x3

    .line 51
    invoke-direct {v4, v1, v5}, La/y620;-><init>(La/a8z;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/i820;->L1:La/kiu0;

    .line 59
    .line 60
    sget-object v0, La/f820;->a:La/f820;

    .line 61
    .line 62
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/i820;->M1:La/s0r;

    .line 67
    .line 68
    new-instance v0, La/sbx0;

    .line 69
    .line 70
    const/16 v1, 0xd

    .line 71
    .line 72
    invoke-direct {v0, v1}, La/sbx0;-><init>(B)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, La/i820;->N1:La/sbx0;

    .line 76
    .line 77
    new-instance v0, La/de3;

    .line 78
    .line 79
    const/4 v1, 0x6

    .line 80
    invoke-direct {v0, p0, v1}, La/de3;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, La/i820;->Q1:La/de3;

    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    iput-boolean v0, p0, La/i820;->S1:Z

    .line 87
    .line 88
    return-void
.end method

.method public static J0(La/e0f;La/sc7;)V
    .locals 11

    .line 1
    iget-object v0, p0, La/e0f;->c:Landroid/widget/TextView;

    .line 2
    .line 3
    iget-object v1, p0, La/e0f;->n:Landroid/view/View;

    .line 4
    .line 5
    check-cast v1, Landroidx/constraintlayout/widget/Group;

    .line 6
    .line 7
    iget-object v2, p0, La/e0f;->g:Landroid/view/View;

    .line 8
    .line 9
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 10
    .line 11
    iget-wide v3, p1, La/sc7;->a:J

    .line 12
    .line 13
    iget-object v5, p1, La/sc7;->e:La/l0d;

    .line 14
    .line 15
    iget-object v6, p1, La/sc7;->d:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v7, p1, La/sc7;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v8, p1, La/sc7;->m:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/e0f;->d:Landroid/widget/LinearLayout;

    .line 29
    .line 30
    iget-boolean v3, p1, La/sc7;->j:Z

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/16 v9, 0x8

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    move v3, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v3, v9

    .line 40
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    if-eqz v8, :cond_1

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v0, v4

    .line 48
    :goto_1
    iget-boolean v3, p1, La/sc7;->g:Z

    .line 49
    .line 50
    iget-object v10, p0, La/e0f;->f:Landroid/view/View;

    .line 51
    .line 52
    check-cast v10, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    invoke-virtual {v10, v9}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v9}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    if-nez v0, :cond_3

    .line 67
    .line 68
    move v3, v4

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move v3, v9

    .line 71
    :goto_2
    invoke-virtual {v10, v3}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    move v3, v4

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move v3, v9

    .line 79
    :goto_3
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 80
    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_5
    move v4, v9

    .line 86
    :goto_4
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    iget-boolean v1, p1, La/sc7;->i:Z

    .line 90
    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    return-void

    .line 94
    :cond_6
    const-string v1, ""

    .line 95
    .line 96
    if-eqz v0, :cond_9

    .line 97
    .line 98
    iget-object v0, p0, La/e0f;->i:Landroid/view/View;

    .line 99
    .line 100
    check-cast v0, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 101
    .line 102
    if-nez v6, :cond_7

    .line 103
    .line 104
    move-object v6, v1

    .line 105
    :cond_7
    invoke-virtual {v0, v7, v6, v5}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i(Ljava/lang/String;Ljava/lang/String;La/l0d;)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, La/e0f;->j:Landroid/view/View;

    .line 109
    .line 110
    check-cast p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 111
    .line 112
    iget-object v0, p1, La/sc7;->k:Ljava/lang/String;

    .line 113
    .line 114
    if-nez v0, :cond_8

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_8
    move-object v1, v0

    .line 118
    :goto_5
    iget-object p1, p1, La/sc7;->n:La/l0d;

    .line 119
    .line 120
    invoke-virtual {p0, v8, v1, p1}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i(Ljava/lang/String;Ljava/lang/String;La/l0d;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_9
    iget-object p0, p0, La/e0f;->h:Landroid/view/View;

    .line 125
    .line 126
    check-cast p0, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 127
    .line 128
    if-nez v6, :cond_a

    .line 129
    .line 130
    move-object v6, v1

    .line 131
    :cond_a
    invoke-virtual {p0, v7, v6, v5}, Lorg/xplatform/ui_core/AnimatedCoefficientView;->i(Ljava/lang/String;Ljava/lang/String;La/l0d;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p1, p1, La/ozq;->b:Landroid/widget/FrameLayout;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-virtual {p1, v0}, Landroid/view/View;->setClipToOutline(Z)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/ic3;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    invoke-direct {v1, p0, v2}, La/ic3;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const v1, 0x7f05000f

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p1, p1, La/ozq;->a:Landroidx/core/widget/NestedScrollView;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 61
    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const v4, 0x7f0706c8

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p1, p1, La/ozq;->b:Landroid/widget/FrameLayout;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_0

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const v3, 0x7f0706bd

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_1
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_2
    :goto_0
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object v1, p1, La/ozq;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 122
    .line 123
    new-instance v2, La/e820;

    .line 124
    .line 125
    const/4 v3, 0x0

    .line 126
    invoke-direct {v2, p0, v3}, La/e820;-><init>(La/i820;B)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 130
    .line 131
    .line 132
    iget-object v1, p1, La/ozq;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 133
    .line 134
    new-instance v2, La/e820;

    .line 135
    .line 136
    invoke-direct {v2, p0, v0}, La/e820;-><init>(La/i820;B)V

    .line 137
    .line 138
    .line 139
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 140
    .line 141
    .line 142
    iget-object v0, p1, La/ozq;->e:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 143
    .line 144
    new-instance v1, La/e820;

    .line 145
    .line 146
    const/4 v2, 0x2

    .line 147
    invoke-direct {v1, p0, v2}, La/e820;-><init>(La/i820;B)V

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 151
    .line 152
    .line 153
    iget-object p1, p1, La/ozq;->f:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 154
    .line 155
    new-instance v0, La/e820;

    .line 156
    .line 157
    const/4 v1, 0x3

    .line 158
    invoke-direct {v0, p0, v1}, La/e820;-><init>(La/i820;B)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    new-instance v0, La/viq;

    .line 169
    .line 170
    const/16 v1, 0x11

    .line 171
    .line 172
    invoke-direct {v0, p0, v1}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    const-string v1, "CHANGE_SYSTEM_REQUEST_KEY"

    .line 176
    .line 177
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget-object p1, p1, La/ozq;->u:Landroidx/viewpager2/widget/ViewPager2;

    .line 185
    .line 186
    invoke-virtual {p1, v3}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iget-object p1, p1, La/ozq;->u:Landroidx/viewpager2/widget/ViewPager2;

    .line 194
    .line 195
    new-instance v0, La/xp6;

    .line 196
    .line 197
    const/16 v1, 0xb

    .line 198
    .line 199
    invoke-direct {v0, p0, v1}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 203
    .line 204
    .line 205
    new-instance p1, La/xze;

    .line 206
    .line 207
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, La/n6r;->b()V

    .line 219
    .line 220
    .line 221
    iget-object v1, v1, La/n6r;->c:La/glz;

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    sget-object v2, La/iun;->a:La/iun;

    .line 227
    .line 228
    invoke-direct {p1, v0, v1, v2, v3}, La/xze;-><init>(Landroidx/fragment/app/e;La/glz;Ljava/util/List;B)V

    .line 229
    .line 230
    .line 231
    iput-object p1, p0, La/i820;->P1:La/xze;

    .line 232
    .line 233
    return-void
.end method

.method public final C0()V
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
    const-class v1, La/sye;

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
    instance-of v3, v0, La/sye;

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
    check-cast v2, La/sye;

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
    const/4 v1, 0x0

    .line 60
    invoke-virtual {v2, v0, v1}, La/sye;->a(La/i1w0;Z)La/mdi;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, La/mdi;->t()La/fiu0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/i820;->K1:La/fiu0;

    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 72
    .line 73
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final D0()V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v4, v0, La/ozq;->u:Landroidx/viewpager2/widget/ViewPager2;

    .line 6
    .line 7
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, v0, La/ozq;->q:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 12
    .line 13
    invoke-virtual {p0}, La/i820;->H0()La/wze;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/wze;->F:La/p7m0;

    .line 18
    .line 19
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/ah0;

    .line 24
    .line 25
    const/16 v6, 0xb

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    move-object v3, p0

    .line 29
    move-object v5, v11

    .line 30
    invoke-direct/range {v1 .. v6}, La/ah0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 31
    .line 32
    .line 33
    sget-object p0, La/lkz;->a:La/lkz;

    .line 34
    .line 35
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v4, La/v620;

    .line 48
    .line 49
    invoke-direct {v4, v0, p0, v1, v11}, La/v620;-><init>(La/xae0;La/clz;La/ah0;La/yje;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x3

    .line 53
    invoke-static {v2, v11, v11, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, La/i820;->H0()La/wze;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v0, v0, La/wze;->C:La/p7m0;

    .line 61
    .line 62
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    new-instance v10, La/g820;

    .line 67
    .line 68
    const/4 v0, 0x2

    .line 69
    invoke-direct {v10, v3, v11, v0}, La/g820;-><init>(La/i820;La/yje;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v7, La/v620;

    .line 85
    .line 86
    const/4 v12, 0x0

    .line 87
    invoke-direct/range {v7 .. v12}, La/v620;-><init>(La/xae0;La/clz;La/g820;La/yje;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v11, v11, v7, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, La/i820;->H0()La/wze;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v0, v0, La/wze;->A:La/p7m0;

    .line 98
    .line 99
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, La/g820;

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    invoke-direct {v1, v3, v11, v2}, La/g820;-><init>(La/i820;La/yje;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    new-instance v5, La/v620;

    .line 122
    .line 123
    invoke-direct {v5, v0, v2, v1, v11}, La/v620;-><init>(La/xae0;La/clz;La/g820;La/yje;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v4, v11, v11, v5, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, La/i820;->H0()La/wze;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-object v1, v0, La/wze;->B:La/p7m0;

    .line 134
    .line 135
    new-instance v2, La/c00;

    .line 136
    .line 137
    const/16 v4, 0x1a

    .line 138
    .line 139
    invoke-direct {v2, v1, v0, v4}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 140
    .line 141
    .line 142
    new-instance v0, La/g820;

    .line 143
    .line 144
    const/4 v1, 0x1

    .line 145
    invoke-direct {v0, v3, v11, v1}, La/g820;-><init>(La/i820;La/yje;B)V

    .line 146
    .line 147
    .line 148
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    new-instance v6, La/v620;

    .line 161
    .line 162
    invoke-direct {v6, v2, v4, v0, v11}, La/v620;-><init>(La/c00;La/clz;La/g820;La/yje;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v5, v11, v11, v6, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3}, La/i820;->H0()La/wze;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iget-object v0, v0, La/wze;->G:La/ol60;

    .line 173
    .line 174
    new-instance v2, La/g820;

    .line 175
    .line 176
    invoke-direct {v2, v3, v11, p0}, La/g820;-><init>(La/i820;La/yje;B)V

    .line 177
    .line 178
    .line 179
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    new-instance v6, La/v620;

    .line 192
    .line 193
    invoke-direct {v6, v0, v4, v2, v11}, La/v620;-><init>(La/gmq;La/clz;La/g820;La/yje;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v5, v11, v11, v6, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3}, La/i820;->H0()La/wze;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v0, v0, La/wze;->H:La/ol60;

    .line 204
    .line 205
    new-instance v2, La/z210;

    .line 206
    .line 207
    const/4 v4, 0x6

    .line 208
    invoke-direct {v2, v3, v11, v4}, La/z210;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 209
    .line 210
    .line 211
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    new-instance v6, La/v620;

    .line 224
    .line 225
    invoke-direct {v6, v0, v4, v2, v11}, La/v620;-><init>(La/gmq;La/clz;La/z210;La/yje;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v5, v11, v11, v6, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3}, La/i820;->H0()La/wze;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    iget-object v0, v0, La/wze;->I:La/p7m0;

    .line 236
    .line 237
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    new-instance v10, La/w620;

    .line 242
    .line 243
    invoke-direct {v10, v3, v11, v1}, La/w620;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 244
    .line 245
    .line 246
    invoke-static {v3}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    new-instance v7, La/v620;

    .line 259
    .line 260
    invoke-direct/range {v7 .. v12}, La/v620;-><init>(La/xae0;La/clz;La/w620;La/yje;B)V

    .line 261
    .line 262
    .line 263
    invoke-static {v0, v11, v11, v7, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 264
    .line 265
    .line 266
    return-void
.end method

.method public final G0()La/ozq;
    .locals 2

    .line 1
    sget-object v0, La/i820;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/i820;->M1:La/s0r;

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
    check-cast p0, La/ozq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/wze;
    .locals 0

    .line 1
    iget-object p0, p0, La/i820;->L1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wze;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ozq;->j:La/e0f;

    .line 6
    .line 7
    iget-object v1, v0, La/e0f;->e:Landroid/view/ViewGroup;

    .line 8
    .line 9
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {v1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-object v1, v0, La/e0f;->m:Landroid/view/View;

    .line 21
    .line 22
    check-cast v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 23
    .line 24
    const/16 v2, 0x8

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    move v4, v3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v4, v2

    .line 32
    :goto_1
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/e0f;->h:Landroid/view/View;

    .line 36
    .line 37
    check-cast v0, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    move v1, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v1, v2

    .line 44
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/ozq;->i:La/e0f;

    .line 52
    .line 53
    iget-object v1, v0, La/e0f;->e:Landroid/view/ViewGroup;

    .line 54
    .line 55
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-static {v1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    invoke-static {v1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 64
    .line 65
    .line 66
    :goto_3
    iget-object v1, v0, La/e0f;->m:Landroid/view/View;

    .line 67
    .line 68
    check-cast v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    move v4, v3

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    move v4, v2

    .line 75
    :goto_4
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object v0, v0, La/e0f;->h:Landroid/view/View;

    .line 79
    .line 80
    check-cast v0, Lorg/xplatform/ui_core/AnimatedCoefficientView;

    .line 81
    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    move v1, v3

    .line 85
    goto :goto_5

    .line 86
    :cond_5
    move v1, v2

    .line 87
    :goto_5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    iget-object v0, p0, La/ozq;->m:Landroid/widget/LinearLayout;

    .line 95
    .line 96
    if-eqz p1, :cond_6

    .line 97
    .line 98
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 99
    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_6
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 103
    .line 104
    .line 105
    :goto_6
    iget-object v0, p0, La/ozq;->p:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 106
    .line 107
    if-eqz p1, :cond_7

    .line 108
    .line 109
    move v1, v3

    .line 110
    goto :goto_7

    .line 111
    :cond_7
    move v1, v2

    .line 112
    :goto_7
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, La/ozq;->s:Landroid/widget/TextView;

    .line 116
    .line 117
    if-nez p1, :cond_8

    .line 118
    .line 119
    move v2, v3

    .line 120
    :cond_8
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/i820;->O1:La/e820;

    .line 3
    .line 4
    iput-object v0, p0, La/i820;->P1:La/xze;

    .line 5
    .line 6
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, La/ozq;->q:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 11
    .line 12
    iget-object v1, v0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 18
    .line 19
    .line 20
    invoke-super {p0}, La/yx5;->Z()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final c(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/i820;->H0()La/wze;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/wze;->C:La/p7m0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v0, v0, La/mze;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, La/mze;

    .line 16
    .line 17
    invoke-direct {v0, p1}, La/mze;-><init>(F)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final d0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ozq;->j:La/e0f;

    .line 6
    .line 7
    iget-object v0, v0, La/e0f;->b:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, La/ozq;->i:La/e0f;

    .line 22
    .line 23
    iget-object v0, v0, La/e0f;->b:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/i820;->N1:La/sbx0;

    .line 33
    .line 34
    invoke-virtual {v0}, La/sbx0;->d()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/i820;->H0()La/wze;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/wze;->I:La/p7m0;

    .line 42
    .line 43
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, La/ozq;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, p0, La/i820;->Q1:La/de3;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 68
    .line 69
    return-void
.end method

.method public final e0()V
    .locals 10

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/ozq;->u:Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    iget-object v1, p0, La/i820;->N1:La/sbx0;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, La/sbx0;->b(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/i820;->H0()La/wze;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, v0, La/wze;->I:La/p7m0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v1, v3, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v1, v0, La/wze;->B:La/p7m0;

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v4, v2

    .line 46
    check-cast v4, La/im7;

    .line 47
    .line 48
    invoke-virtual {v0}, La/wze;->z()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v8, 0x0

    .line 53
    const/16 v9, 0xe

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    invoke-static/range {v4 .. v9}, La/im7;->a(La/im7;Ljava/lang/String;ZZLa/en7;I)La/im7;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget-object v1, v0, La/wze;->o:La/mne;

    .line 72
    .line 73
    iget-object v7, v1, La/mne;->b:La/dvj;

    .line 74
    .line 75
    new-instance v8, La/wn2;

    .line 76
    .line 77
    const/16 v1, 0xd

    .line 78
    .line 79
    invoke-direct {v8, v0, v3, v1}, La/wn2;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 80
    .line 81
    .line 82
    const/16 v9, 0xb

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    const/4 v6, 0x0

    .line 86
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v0, v0, La/ozq;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object p0, p0, La/i820;->Q1:La/de3;

    .line 100
    .line 101
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "BUNDLE_SELECTED_POSITION"

    .line 2
    .line 3
    iget p0, p0, La/i820;->R1:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string v0, "BUNDLE_SELECTED_POSITION"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput p1, p0, La/i820;->R1:I

    .line 15
    .line 16
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/i820;->S1:Z

    .line 2
    .line 3
    return p0
.end method

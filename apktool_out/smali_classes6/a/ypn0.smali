.class public final La/ypn0;
.super La/of80;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ypn0;",
        "La/of80;",
        "<init>",
        "()V",
        "a/s9m0",
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
.field public static final h2:La/s9m0;

.field public static final synthetic i2:[La/iiy;

.field public static final j2:Ljava/lang/String;


# instance fields
.field public final Y1:La/s0r;

.field public final Z1:La/a8z;

.field public final a2:La/a8z;

.field public final b2:La/a8z;

.field public final c2:La/kiu0;

.field public final d2:Landroid/view/animation/OvershootInterpolator;

.field public final e2:La/lef0;

.field public f2:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

.field public final g2:La/v62;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ypn0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/swipex/impl/databinding/SwipexOnboardingFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/ypn0;->i2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/s9m0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ypn0;->h2:La/s9m0;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/ypn0;->j2:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d05aa

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/sik;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/xpn0;->a:La/xpn0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/ypn0;->Y1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/a7n0;

    .line 16
    .line 17
    const/16 v1, 0x11

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/a7n0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/wez;->b:La/wez;

    .line 23
    .line 24
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/ypn0;->Z1:La/a8z;

    .line 29
    .line 30
    new-instance v0, La/upn0;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, p0, v2}, La/upn0;-><init>(La/ypn0;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/ypn0;->a2:La/a8z;

    .line 41
    .line 42
    new-instance v0, La/upn0;

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-direct {v0, p0, v2}, La/upn0;-><init>(La/ypn0;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/ypn0;->b2:La/a8z;

    .line 53
    .line 54
    new-instance v0, La/upn0;

    .line 55
    .line 56
    const/4 v2, 0x2

    .line 57
    invoke-direct {v0, p0, v2}, La/upn0;-><init>(La/ypn0;B)V

    .line 58
    .line 59
    .line 60
    new-instance v2, La/fyk0;

    .line 61
    .line 62
    const/16 v3, 0x19

    .line 63
    .line 64
    invoke-direct {v2, p0, v3}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    new-instance v3, La/fyk0;

    .line 68
    .line 69
    const/16 v4, 0x1a

    .line 70
    .line 71
    invoke-direct {v3, v2, v4}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-class v2, La/arn0;

    .line 79
    .line 80
    sget-object v3, La/sre0;->a:La/tre0;

    .line 81
    .line 82
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    new-instance v3, La/cdl0;

    .line 87
    .line 88
    const/16 v4, 0x14

    .line 89
    .line 90
    invoke-direct {v3, v1, v4}, La/cdl0;-><init>(La/a8z;B)V

    .line 91
    .line 92
    .line 93
    new-instance v4, La/cdl0;

    .line 94
    .line 95
    const/16 v5, 0x15

    .line 96
    .line 97
    invoke-direct {v4, v1, v5}, La/cdl0;-><init>(La/a8z;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, La/ypn0;->c2:La/kiu0;

    .line 105
    .line 106
    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    .line 107
    .line 108
    const/high16 v1, 0x3f800000    # 1.0f

    .line 109
    .line 110
    invoke-direct {v0, v1}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, La/ypn0;->d2:Landroid/view/animation/OvershootInterpolator;

    .line 114
    .line 115
    new-instance v0, La/lef0;

    .line 116
    .line 117
    invoke-direct {v0, p0}, La/lef0;-><init>(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, La/ypn0;->e2:La/lef0;

    .line 121
    .line 122
    new-instance v0, La/v62;

    .line 123
    .line 124
    const/16 v1, 0x17

    .line 125
    .line 126
    invoke-direct {v0, p0, v1}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    iput-object v0, p0, La/ypn0;->g2:La/v62;

    .line 130
    .line 131
    return-void
.end method

.method public static K0(Landroid/view/View;)V
    .locals 4

    .line 1
    sget-object v0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    new-array v2, v2, [F

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput v1, v2, v3

    .line 12
    .line 13
    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aput v1, v2, v3

    .line 17
    .line 18
    invoke-static {p0, v0, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-wide/16 v0, 0x1f4

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static L0(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object v0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [F

    .line 5
    .line 6
    fill-array-data v1, :array_0

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-wide/16 v0, 0x1f4

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static O0(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    sget-object v0, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    new-array v2, v2, [F

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput v1, v2, v3

    .line 12
    .line 13
    const v1, 0x3e99999a    # 0.3f

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    aput v1, v2, v3

    .line 18
    .line 19
    invoke-static {p0, v0, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-wide/16 v0, 0x1f4

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static P0(Lorg/xplatform/uikit/components/buttons/DsButton;)V
    .locals 5

    .line 1
    sget-object v0, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    new-array v2, v1, [F

    .line 5
    .line 6
    fill-array-data v2, :array_0

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-wide/16 v2, 0x1f4

    .line 14
    .line 15
    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 16
    .line 17
    .line 18
    sget-object v4, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 19
    .line 20
    new-array v1, v1, [F

    .line 21
    .line 22
    fill-array-data v1, :array_1

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v4, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3fa66666    # 1.3f
        0x3f800000    # 1.0f
    .end array-data

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3fa66666    # 1.3f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/sik;->C0(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/hgd;

    .line 7
    .line 8
    invoke-virtual {v0}, La/hgd;->k()La/jg60;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, La/ypn0;->g2:La/v62;

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1}, La/jg60;->a(La/clz;La/eg60;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public final M0()La/ywn0;
    .locals 2

    .line 1
    sget-object v0, La/ypn0;->i2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ypn0;->Y1:La/s0r;

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
    check-cast p0, La/ywn0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final N0()La/arn0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ypn0;->c2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/arn0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/of80;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    const v0, 0x7f140026

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, La/sik;->F0(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-static {p1, p2}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    instance-of v0, p1, Landroid/view/View;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    check-cast p1, Landroid/view/View;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object p1, v5

    .line 35
    :goto_0
    if-eqz p1, :cond_2

    .line 36
    .line 37
    new-instance v0, La/epi0;

    .line 38
    .line 39
    const/16 v1, 0xe

    .line 40
    .line 41
    invoke-direct {v0, p0, v1}, La/epi0;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 45
    .line 46
    invoke-static {p1, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0}, La/ypn0;->M0()La/ywn0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p1, p1, La/ywn0;->i:Landroid/widget/ImageView;

    .line 54
    .line 55
    new-instance v0, La/vpn0;

    .line 56
    .line 57
    invoke-direct {v0, p0, p2}, La/vpn0;-><init>(La/ypn0;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, La/ypn0;->M0()La/ywn0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p1, p1, La/ywn0;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 68
    .line 69
    new-instance v0, La/vpn0;

    .line 70
    .line 71
    const/4 v7, 0x1

    .line 72
    invoke-direct {v0, p0, v7}, La/vpn0;-><init>(La/ypn0;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, La/ypn0;->N0()La/arn0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object p1, p1, La/arn0;->t:La/p7m0;

    .line 83
    .line 84
    invoke-static {p1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v4, La/wpn0;

    .line 89
    .line 90
    const/4 p1, 0x2

    .line 91
    invoke-direct {v4, p0, v5, p1}, La/wpn0;-><init>(La/ypn0;La/yje;B)V

    .line 92
    .line 93
    .line 94
    sget-object p1, La/lkz;->a:La/lkz;

    .line 95
    .line 96
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v1, La/agn0;

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    invoke-direct/range {v1 .. v6}, La/agn0;-><init>(La/xae0;La/clz;La/wpn0;La/yje;B)V

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x3

    .line 115
    invoke-static {p1, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, La/ypn0;->N0()La/arn0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object p1, p1, La/arn0;->u:La/p7m0;

    .line 123
    .line 124
    invoke-static {p1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance v1, La/wpn0;

    .line 129
    .line 130
    invoke-direct {v1, p0, v5, v7}, La/wpn0;-><init>(La/ypn0;La/yje;B)V

    .line 131
    .line 132
    .line 133
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    new-instance v4, La/agn0;

    .line 146
    .line 147
    invoke-direct {v4, p1, v2, v1, v5}, La/agn0;-><init>(La/xae0;La/clz;La/wpn0;La/yje;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v3, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, La/ypn0;->N0()La/arn0;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object v1, p1, La/arn0;->v:La/ol60;

    .line 158
    .line 159
    new-instance v2, La/sye0;

    .line 160
    .line 161
    const/16 v3, 0xc

    .line 162
    .line 163
    invoke-direct {v2, p1, v5, v3}, La/sye0;-><init>(La/diu0;La/yje;B)V

    .line 164
    .line 165
    .line 166
    new-instance p1, La/dnq;

    .line 167
    .line 168
    invoke-direct {p1, v1, v2, p2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 169
    .line 170
    .line 171
    new-instance v1, La/wpn0;

    .line 172
    .line 173
    invoke-direct {v1, p0, v5, p2}, La/wpn0;-><init>(La/ypn0;La/yje;B)V

    .line 174
    .line 175
    .line 176
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    new-instance v4, La/agn0;

    .line 189
    .line 190
    invoke-direct {v4, p1, v2, v1, v5}, La/agn0;-><init>(La/dnq;La/clz;La/wpn0;La/yje;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v3, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 194
    .line 195
    .line 196
    iget-object p1, p0, La/ypn0;->a2:La/a8z;

    .line 197
    .line 198
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    check-cast p1, Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_3

    .line 209
    .line 210
    sget-object p1, La/rna;->d:La/rna;

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_3
    sget-object p1, La/rna;->c:La/rna;

    .line 214
    .line 215
    :goto_1
    new-instance v0, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 216
    .line 217
    iget-object v1, p0, La/ypn0;->e2:La/lef0;

    .line 218
    .line 219
    invoke-direct {v0, v1, p1}, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;-><init>(La/qna;La/rna;)V

    .line 220
    .line 221
    .line 222
    iput-object v0, p0, La/ypn0;->f2:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 223
    .line 224
    invoke-virtual {p0}, La/ypn0;->M0()La/ywn0;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget-object p1, p1, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 229
    .line 230
    iget-object v0, p0, La/ypn0;->f2:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 231
    .line 232
    invoke-virtual {p1, v0}, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, La/ypn0;->M0()La/ywn0;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iget-object p1, p1, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 240
    .line 241
    iget-object v0, p0, La/ypn0;->Z1:La/a8z;

    .line 242
    .line 243
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, La/ssn0;

    .line 248
    .line 249
    invoke-virtual {p1, v0}, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;->setAdapter(La/yge0;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, La/ypn0;->M0()La/ywn0;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iget-object p1, p1, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 257
    .line 258
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0}, La/ypn0;->M0()La/ywn0;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    iget-object p0, p0, La/ywn0;->e:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 266
    .line 267
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 268
    .line 269
    .line 270
    return-void
.end method

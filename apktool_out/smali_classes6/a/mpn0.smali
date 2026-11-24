.class public final La/mpn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/npn0;


# direct methods
.method public synthetic constructor <init>(La/npn0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mpn0;->i:B

    iput-object p1, p0, La/mpn0;->k:La/npn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mpn0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mpn0;->k:La/npn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/mpn0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/mpn0;-><init>(La/npn0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/mpn0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/mpn0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/mpn0;-><init>(La/npn0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/mpn0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mpn0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/qpn0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mpn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mpn0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mpn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/rpn0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/mpn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mpn0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mpn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/mpn0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/mpn0;->k:La/npn0;

    .line 4
    .line 5
    iget-object p0, p0, La/mpn0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/qpn0;

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p1, La/qpn0;->a:La/qpn0;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, La/yo8;->y0()V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    :goto_0
    return-object p0

    .line 36
    :pswitch_0
    check-cast p0, La/rpn0;

    .line 37
    .line 38
    sget-object v0, La/wne;->a:La/wne;

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, La/npn0;->T0()La/lj60;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, p1, La/lj60;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 48
    .line 49
    invoke-virtual {v1}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 64
    .line 65
    int-to-float v3, v3

    .line 66
    iget v4, p0, La/rpn0;->g:F

    .line 67
    .line 68
    mul-float/2addr v3, v4

    .line 69
    float-to-int v3, v3

    .line 70
    iput v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I

    .line 71
    .line 72
    :cond_1
    iget-object v2, v1, La/npn0;->g2:La/bg5;

    .line 73
    .line 74
    iget-object v3, p0, La/rpn0;->b:Ljava/util/List;

    .line 75
    .line 76
    invoke-virtual {v2, v3}, La/zz3;->A(Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, La/rpn0;->b:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/4 v3, 0x1

    .line 86
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 91
    .line 92
    .line 93
    iget v2, p0, La/rpn0;->d:I

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-virtual {v0, v2, v3}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p1, La/lj60;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 100
    .line 101
    iget v2, p0, La/rpn0;->a:I

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p1, La/lj60;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 114
    .line 115
    iget-boolean p0, p0, La/rpn0;->c:Z

    .line 116
    .line 117
    if-eqz p0, :cond_2

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    const/16 v3, 0x8

    .line 121
    .line 122
    :goto_1
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La/z0i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/z0i;->a:B

    iput-object p1, p0, La/z0i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/z0i;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/z0i;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/sbx0;

    .line 10
    .line 11
    iget-object v0, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0, v1}, La/sbx0;->i(FI)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    check-cast p0, La/ymd0;

    .line 27
    .line 28
    sget-object v0, La/ymd0;->o2:La/fl70;

    .line 29
    .line 30
    new-instance v0, Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_6

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_6

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {v2, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    iget v1, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 76
    .line 77
    :cond_2
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 78
    .line 79
    sub-int v0, v1, v0

    .line 80
    .line 81
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 82
    .line 83
    instance-of v3, p0, La/wo8;

    .line 84
    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    check-cast p0, La/wo8;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    const/4 p0, 0x0

    .line 91
    :goto_0
    if-eqz p0, :cond_6

    .line 92
    .line 93
    iget-object v3, p0, La/wo8;->g:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 94
    .line 95
    if-nez v3, :cond_4

    .line 96
    .line 97
    invoke-virtual {p0}, La/wo8;->g()V

    .line 98
    .line 99
    .line 100
    :cond_4
    iget-object p0, p0, La/wo8;->g:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 101
    .line 102
    if-nez p0, :cond_5

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    new-instance v3, La/vmd0;

    .line 106
    .line 107
    invoke-direct {v3, v0, p0, v1}, La/vmd0;-><init>(ILcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 111
    .line 112
    .line 113
    :cond_6
    :goto_1
    return-void

    .line 114
    :pswitch_1
    check-cast p0, Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 115
    .line 116
    sget v0, Lorg/xplatform/uikit/components/lottie/LottieView;->o1:I

    .line 117
    .line 118
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->F()V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_2
    check-cast p0, La/zly;

    .line 123
    .line 124
    invoke-virtual {p0}, La/zly;->a1()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_3
    check-cast p0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 129
    .line 130
    invoke-static {p0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d(Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

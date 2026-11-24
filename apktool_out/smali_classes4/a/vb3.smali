.class public final synthetic La/vb3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ub3;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vb3;->a:B

    iput-object p1, p0, La/vb3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 9

    .line 1
    iget-byte v0, p0, La/vb3;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    const/high16 v3, -0x40800000    # -1.0f

    .line 7
    .line 8
    iget-object p0, p0, La/vb3;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/u2s0;

    .line 14
    .line 15
    sget-object v0, La/u2s0;->X1:La/s2m0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, La/o2r;->d:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v4, v4, La/o2r;->i:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    sub-int/2addr v2, v4

    .line 40
    div-int/lit8 v2, v2, 0x8

    .line 41
    .line 42
    int-to-float v2, v2

    .line 43
    int-to-float v4, p2

    .line 44
    div-float/2addr v2, v4

    .line 45
    mul-float/2addr v2, v3

    .line 46
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    add-int/lit8 p1, p1, -0x14

    .line 58
    .line 59
    if-lt p2, p1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object p0, p0, La/o2r;->d:Landroid/widget/FrameLayout;

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void

    .line 71
    :pswitch_0
    check-cast p0, Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 72
    .line 73
    sget p1, Lorg/xplatform/uikit/components/lottie/LottieView;->o1:I

    .line 74
    .line 75
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->F()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_1
    check-cast p0, La/ej5;

    .line 80
    .line 81
    sget-object p2, La/ej5;->V1:La/bj5;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iget-object p2, p2, La/gyq;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 92
    .line 93
    invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    int-to-float p2, p2

    .line 98
    div-float/2addr p1, p2

    .line 99
    mul-float/2addr p1, v3

    .line 100
    sub-float/2addr v2, p1

    .line 101
    invoke-virtual {p0}, La/ej5;->G0()La/gyq;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    iget-object p0, p0, La/gyq;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 106
    .line 107
    invoke-virtual {p0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_2
    check-cast p0, [Landroid/view/View;

    .line 112
    .line 113
    array-length v0, p0

    .line 114
    const/4 v4, 0x0

    .line 115
    move v5, v4

    .line 116
    :goto_0
    if-ge v5, v0, :cond_3

    .line 117
    .line 118
    aget-object v6, p0, v5

    .line 119
    .line 120
    if-eqz p2, :cond_2

    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    div-int/lit8 v7, v7, 0x8

    .line 127
    .line 128
    int-to-float v7, v7

    .line 129
    int-to-float v8, p2

    .line 130
    div-float/2addr v7, v8

    .line 131
    mul-float/2addr v7, v3

    .line 132
    goto :goto_1

    .line 133
    :cond_2
    move v7, v2

    .line 134
    :goto_1
    invoke-virtual {v6, v7}, Landroid/view/View;->setAlpha(F)V

    .line 135
    .line 136
    .line 137
    add-int/lit8 v5, v5, 0x1

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_3
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    add-int/lit8 p1, p1, -0x14

    .line 149
    .line 150
    if-lt p2, p1, :cond_4

    .line 151
    .line 152
    array-length p1, p0

    .line 153
    :goto_2
    if-ge v4, p1, :cond_4

    .line 154
    .line 155
    aget-object p2, p0, v4

    .line 156
    .line 157
    invoke-virtual {p2, v1}, Landroid/view/View;->setAlpha(F)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    return-void

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final La/ptl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/rrm;Landroid/view/View;La/wdk0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/ptl;->a:B

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, La/ptl;->c:Ljava/lang/Object;

    iput-object p2, p0, La/ptl;->b:Landroid/view/View;

    iput-object p3, p0, La/ptl;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;La/stl;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/ptl;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ptl;->b:Landroid/view/View;

    .line 8
    .line 9
    iput-object p2, p0, La/ptl;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/ptl;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/ptl;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ptl;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/ptl;->b:Landroid/view/View;

    .line 6
    .line 7
    iget-object v3, p0, La/ptl;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, La/rrm;

    .line 13
    .line 14
    iget-object v0, v3, La/g46;->i:La/f46;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    check-cast v1, La/wdk0;

    .line 31
    .line 32
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 33
    .line 34
    invoke-static {v0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    iget-object p0, p0, La/xiv0;->a:La/uiv0;

    .line 42
    .line 43
    invoke-virtual {p0, v2}, La/uiv0;->i(I)La/pfx;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    iget p0, p0, La/pfx;->d:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p0, 0x0

    .line 53
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const v4, 0x7f070656

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    sub-int/2addr v0, p0

    .line 73
    sub-int/2addr v0, v2

    .line 74
    int-to-float p0, v0

    .line 75
    invoke-virtual {v1, v3, p0}, La/wdk0;->m(La/rrm;F)V

    .line 76
    .line 77
    .line 78
    :goto_1
    return-void

    .line 79
    :pswitch_0
    check-cast v1, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    check-cast v3, La/stl;

    .line 93
    .line 94
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const v2, 0x7f0706ea

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_2

    .line 112
    .line 113
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const v0, 0x7f070706

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    goto :goto_3

    .line 125
    :cond_2
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-nez v4, :cond_4

    .line 132
    .line 133
    if-nez v1, :cond_3

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_4
    :goto_2
    add-int/2addr p0, v0

    .line 141
    :goto_3
    sget-object v0, La/stl;->f2:[La/iiy;

    .line 142
    .line 143
    invoke-virtual {v3}, La/stl;->P0()La/vfk;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget-object v0, v0, La/vfk;->d:Landroid/widget/LinearLayout;

    .line 148
    .line 149
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    if-eqz v4, :cond_8

    .line 154
    .line 155
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 156
    .line 157
    iput p0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 158
    .line 159
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-eqz p0, :cond_5

    .line 167
    .line 168
    invoke-virtual {v3}, La/stl;->O0()Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    if-eqz p0, :cond_9

    .line 173
    .line 174
    const/4 v0, 0x0

    .line 175
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-nez p0, :cond_7

    .line 186
    .line 187
    if-nez v1, :cond_6

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_7
    :goto_4
    invoke-virtual {v3}, La/stl;->O0()Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    if-eqz p0, :cond_9

    .line 199
    .line 200
    const/high16 v0, 0x3f800000    # 1.0f

    .line 201
    .line 202
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_8
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 207
    .line 208
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    :cond_9
    :goto_5
    return-void

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

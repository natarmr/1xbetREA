.class public final synthetic La/lc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/lc0;->a:B

    iput-object p3, p0, La/lc0;->c:Ljava/lang/Object;

    iput-object p4, p0, La/lc0;->d:Ljava/lang/Object;

    iput p2, p0, La/lc0;->b:I

    iput-object p5, p0, La/lc0;->e:Ljava/lang/Object;

    iput-object p6, p0, La/lc0;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;La/egf;Ljava/util/ArrayList;ILa/cgf;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/lc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lc0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/lc0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/lc0;->e:Ljava/lang/Object;

    iput p4, p0, La/lc0;->b:I

    iput-object p5, p0, La/lc0;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/lc0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/lc0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/lc0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, p0, La/lc0;->b:I

    .line 8
    .line 9
    iget-object v4, p0, La/lc0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, La/lc0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Landroid/widget/TextView;

    .line 17
    .line 18
    check-cast v4, La/vic0;

    .line 19
    .line 20
    check-cast v2, Landroid/widget/TextView;

    .line 21
    .line 22
    check-cast v1, Landroid/graphics/Rect;

    .line 23
    .line 24
    sget-object v0, La/vic0;->S1:[La/iiy;

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 31
    .line 32
    int-to-float v0, v0

    .line 33
    invoke-virtual {p0, v0}, Landroid/view/View;->setX(F)V

    .line 34
    .line 35
    .line 36
    iget v0, v1, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    invoke-virtual {p0, v0}, Landroid/view/View;->setY(F)V

    .line 40
    .line 41
    .line 42
    const/high16 v0, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 p0, 0x0

    .line 67
    :goto_0
    iget-object v0, v4, La/vic0;->O1:Landroid/animation/ValueAnimator;

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 72
    .line 73
    .line 74
    :cond_1
    new-instance v0, Landroid/animation/IntEvaluator;

    .line 75
    .line 76
    invoke-direct {v0}, Landroid/animation/IntEvaluator;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    add-int v2, p0, v3

    .line 84
    .line 85
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v0, v1}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    int-to-long v1, v3

    .line 98
    const-wide/16 v5, 0x64

    .line 99
    .line 100
    mul-long/2addr v1, v5

    .line 101
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 102
    .line 103
    .line 104
    new-instance v1, La/yp3;

    .line 105
    .line 106
    const/4 v2, 0x2

    .line 107
    invoke-direct {v1, v4, p0, v2}, La/yp3;-><init>(Ljava/lang/Object;IB)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 111
    .line 112
    .line 113
    new-instance p0, La/x73;

    .line 114
    .line 115
    new-instance v5, La/b0c0;

    .line 116
    .line 117
    invoke-virtual {v4}, La/vic0;->H0()La/hjc0;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    const/4 v11, 0x0

    .line 122
    const/4 v12, 0x7

    .line 123
    const/4 v6, 0x0

    .line 124
    const-class v8, La/hjc0;

    .line 125
    .line 126
    const-string v9, "onCountingAnimationEnd"

    .line 127
    .line 128
    const-string v10, "onCountingAnimationEnd()V"

    .line 129
    .line 130
    invoke-direct/range {v5 .. v12}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 131
    .line 132
    .line 133
    const/16 v1, 0xb

    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    invoke-direct {p0, v2, v5, v1}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 143
    .line 144
    .line 145
    iput-object v0, v4, La/vic0;->O1:Landroid/animation/ValueAnimator;

    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_0
    check-cast p0, La/hb90;

    .line 151
    .line 152
    check-cast v4, Landroid/webkit/WebView;

    .line 153
    .line 154
    check-cast v2, Ljava/lang/String;

    .line 155
    .line 156
    check-cast v1, Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {p0, v4, v3, v2, v1}, La/hb90;->c(La/hb90;Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_1
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;

    .line 164
    .line 165
    check-cast v4, La/egf;

    .line 166
    .line 167
    check-cast v2, Ljava/util/ArrayList;

    .line 168
    .line 169
    check-cast v1, La/cgf;

    .line 170
    .line 171
    sget v0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;->e:I

    .line 172
    .line 173
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Ljava/lang/Number;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    iget p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;->c:I

    .line 184
    .line 185
    mul-int/2addr v0, p0

    .line 186
    int-to-float p0, v0

    .line 187
    const-wide/16 v2, 0x0

    .line 188
    .line 189
    invoke-static {v4, p0, v1, v2, v3}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalFieldView;->c(La/egf;FLa/cgf;J)V

    .line 190
    .line 191
    .line 192
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object p0

    .line 195
    :pswitch_2
    check-cast p0, La/nc0;

    .line 196
    .line 197
    check-cast v4, La/lr5;

    .line 198
    .line 199
    check-cast v2, La/bvc;

    .line 200
    .line 201
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 202
    .line 203
    invoke-virtual {p0, v4, v3, v2, v1}, La/nc0;->z(La/lr5;ILa/bvc;Lkotlin/jvm/functions/Function1;)V

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

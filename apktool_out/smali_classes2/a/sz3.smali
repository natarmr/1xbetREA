.class public final La/sz3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/sz3;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 6

    .line 1
    iget-byte p0, p0, La/sz3;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p0, :cond_5

    .line 11
    .line 12
    if-eq p0, v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/g46;

    .line 20
    .line 21
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 22
    .line 23
    iget-object v2, p0, La/g46;->i:La/f46;

    .line 24
    .line 25
    iget-object v3, p0, La/g46;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v3, v0}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-eqz v3, :cond_4

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_4

    .line 41
    .line 42
    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v2}, La/f46;->getAnimationMode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-ne v2, v0, :cond_2

    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    new-array v2, v2, [F

    .line 56
    .line 57
    fill-array-data v2, :array_0

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v3, p0, La/g46;->d:Landroid/animation/TimeInterpolator;

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 67
    .line 68
    .line 69
    new-instance v3, La/z36;

    .line 70
    .line 71
    invoke-direct {v3, p0, v1}, La/z36;-><init>(La/g46;B)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 75
    .line 76
    .line 77
    iget v3, p0, La/g46;->b:I

    .line 78
    .line 79
    int-to-long v3, v3

    .line 80
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 81
    .line 82
    .line 83
    new-instance v3, La/y36;

    .line 84
    .line 85
    invoke-direct {v3, p0, p1, v1}, La/y36;-><init>(La/g46;IB)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :cond_2
    new-instance v2, Landroid/animation/ValueAnimator;

    .line 97
    .line 98
    invoke-direct {v2}, Landroid/animation/ValueAnimator;-><init>()V

    .line 99
    .line 100
    .line 101
    iget-object v3, p0, La/g46;->i:La/f46;

    .line 102
    .line 103
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    instance-of v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 112
    .line 113
    if-eqz v5, :cond_3

    .line 114
    .line 115
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 116
    .line 117
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 118
    .line 119
    add-int/2addr v4, v3

    .line 120
    :cond_3
    filled-new-array {v1, v4}, [I

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v2, v1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, La/g46;->e:Landroid/animation/TimeInterpolator;

    .line 128
    .line 129
    invoke-virtual {v2, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 130
    .line 131
    .line 132
    iget v1, p0, La/g46;->c:I

    .line 133
    .line 134
    int-to-long v3, v1

    .line 135
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 136
    .line 137
    .line 138
    new-instance v1, La/y36;

    .line 139
    .line 140
    invoke-direct {v1, p0, p1, v0}, La/y36;-><init>(La/g46;IB)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 144
    .line 145
    .line 146
    new-instance p1, La/z36;

    .line 147
    .line 148
    const/4 v1, 0x3

    .line 149
    invoke-direct {p1, p0, v1}, La/z36;-><init>(La/g46;B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_4
    invoke-virtual {p0, p1}, La/g46;->c(I)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_5
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p0, La/g46;

    .line 166
    .line 167
    iget-object p1, p0, La/g46;->i:La/f46;

    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    if-nez v2, :cond_7

    .line 174
    .line 175
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    instance-of v3, v2, La/ble;

    .line 180
    .line 181
    if-eqz v3, :cond_6

    .line 182
    .line 183
    check-cast v2, La/ble;

    .line 184
    .line 185
    new-instance v3, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    .line 186
    .line 187
    invoke-direct {v3}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;-><init>()V

    .line 188
    .line 189
    .line 190
    iget-object v4, v3, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;->i:La/fvt0;

    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    iget-object v5, p0, La/g46;->u:La/d46;

    .line 196
    .line 197
    iput-object v5, v4, La/fvt0;->a:Ljava/lang/Object;

    .line 198
    .line 199
    new-instance v4, La/yk50;

    .line 200
    .line 201
    const/16 v5, 0xb

    .line 202
    .line 203
    invoke-direct {v4, p0, v5}, La/yk50;-><init>(Ljava/lang/Object;B)V

    .line 204
    .line 205
    .line 206
    iput-object v4, v3, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:La/yk50;

    .line 207
    .line 208
    invoke-virtual {v2, v3}, La/ble;->b(La/yke;)V

    .line 209
    .line 210
    .line 211
    const/16 v3, 0x50

    .line 212
    .line 213
    iput v3, v2, La/ble;->g:I

    .line 214
    .line 215
    :cond_6
    iget-object v2, p0, La/g46;->g:Landroid/view/ViewGroup;

    .line 216
    .line 217
    iput-boolean v0, p1, La/f46;->k:Z

    .line 218
    .line 219
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 220
    .line 221
    .line 222
    iput-boolean v1, p1, La/f46;->k:Z

    .line 223
    .line 224
    invoke-virtual {p0}, La/g46;->g()V

    .line 225
    .line 226
    .line 227
    const/4 v1, 0x4

    .line 228
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 229
    .line 230
    .line 231
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-eqz p1, :cond_8

    .line 236
    .line 237
    invoke-virtual {p0}, La/g46;->f()V

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_8
    iput-boolean v0, p0, La/g46;->r:Z

    .line 242
    .line 243
    :goto_1
    return v0

    .line 244
    :pswitch_0
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-static {p0}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    throw p0

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.class public final La/abk0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/abk0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/hbk0;Lkotlin/jvm/functions/Function0;)V
    .locals 5

    .line 1
    instance-of v0, p1, La/bbk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/bbk0;

    .line 6
    .line 7
    iget-object p1, p1, La/bbk0;->b:La/y0x;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/abk0;->b(La/y0x;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    instance-of v0, p1, La/cbk0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iget-object v2, p0, La/abk0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    const p0, 0x7f0a0e28

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-nez p2, :cond_7

    .line 28
    .line 29
    new-instance p2, Lorg/xplatform/ui_core/viewcomponents/smart_background/c;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-direct {p2, v0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/c;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p0}, Landroid/view/View;->setId(I)V

    .line 42
    .line 43
    .line 44
    check-cast p1, La/cbk0;

    .line 45
    .line 46
    iget-object p0, p1, La/cbk0;->a:La/iy3;

    .line 47
    .line 48
    invoke-virtual {p2, p0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/c;->setContainerLayoutParams(La/iy3;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p1, La/cbk0;->c:La/uyw;

    .line 52
    .line 53
    instance-of v0, p0, La/syw;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    check-cast p0, La/syw;

    .line 58
    .line 59
    iget p0, p0, La/syw;->a:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    instance-of v0, p0, La/ryw;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    check-cast p0, La/ryw;

    .line 67
    .line 68
    iget p0, p0, La/ryw;->a:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    instance-of v0, p0, La/tyw;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    check-cast p0, La/tyw;

    .line 76
    .line 77
    iget p0, p0, La/tyw;->b:I

    .line 78
    .line 79
    :goto_0
    iget p1, p1, La/cbk0;->b:I

    .line 80
    .line 81
    invoke-virtual {p2, p1, p0, p0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/c;->b(III)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v2, p2, v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    instance-of v0, p1, La/ebk0;

    .line 97
    .line 98
    const/4 v3, -0x1

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    const p0, 0x7f0a0e29

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    if-nez p2, :cond_7

    .line 109
    .line 110
    new-instance p2, Lorg/xplatform/ui_core/viewcomponents/smart_background/d;

    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-direct {p2, v0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/d;-><init>(Landroid/content/Context;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, p0}, Landroid/view/View;->setId(I)V

    .line 123
    .line 124
    .line 125
    new-instance p0, La/a3e;

    .line 126
    .line 127
    invoke-direct {p0, v3, v3}, La/a3e;-><init>(II)V

    .line 128
    .line 129
    .line 130
    iput v1, p0, La/a3e;->i:I

    .line 131
    .line 132
    iput v1, p0, La/a3e;->l:I

    .line 133
    .line 134
    iput v1, p0, La/a3e;->t:I

    .line 135
    .line 136
    iput v1, p0, La/a3e;->v:I

    .line 137
    .line 138
    invoke-virtual {p2, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    .line 140
    .line 141
    check-cast p1, La/ebk0;

    .line 142
    .line 143
    iget p0, p1, La/ebk0;->b:I

    .line 144
    .line 145
    invoke-virtual {p2, p0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/d;->setBackgroundImage(I)V

    .line 146
    .line 147
    .line 148
    iget-object p0, p1, La/ebk0;->c:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-virtual {p2, p0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/d;->setContent(Ljava/util/List;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_5
    instance-of v0, p1, La/dbk0;

    .line 158
    .line 159
    if-eqz v0, :cond_6

    .line 160
    .line 161
    check-cast p1, La/dbk0;

    .line 162
    .line 163
    iget-object p1, p1, La/dbk0;->b:La/y0x;

    .line 164
    .line 165
    invoke-virtual {p0, p1}, La/abk0;->b(La/y0x;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_6
    instance-of p0, p1, La/gbk0;

    .line 170
    .line 171
    if-eqz p0, :cond_8

    .line 172
    .line 173
    const p0, 0x7f0a0e2a

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-nez v0, :cond_7

    .line 181
    .line 182
    new-instance v0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 183
    .line 184
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-direct {v0, v4}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;-><init>(Landroid/content/Context;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, p2}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->setOnPlayerReadyListener(Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 201
    .line 202
    invoke-direct {p0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 206
    .line 207
    .line 208
    check-cast p1, La/gbk0;

    .line 209
    .line 210
    iget-object p0, p1, La/gbk0;->b:Ljava/lang/String;

    .line 211
    .line 212
    iget-object p1, p1, La/gbk0;->c:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v0, p0, p1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 218
    .line 219
    .line 220
    :cond_7
    return-void

    .line 221
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 222
    .line 223
    .line 224
    return-void
.end method

.method public final b(La/y0x;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/abk0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    .line 3
    const v0, 0x7f0a0e27

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->setImageParams(La/y0x;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

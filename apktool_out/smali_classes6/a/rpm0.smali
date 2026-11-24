.class public final La/rpm0;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final a:La/tjj0;

.field public b:Landroid/view/ViewGroup;

.field public c:Lorg/xplatform/uikit/components/header/DsHeader;

.field public d:I


# direct methods
.method public constructor <init>(La/tjj0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/rpm0;->a:La/tjj0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final h(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/4 p3, -0x1

    .line 21
    if-ne p1, p3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_9

    .line 24
    .line 25
    :cond_0
    iget v0, p0, La/rpm0;->d:I

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const v1, 0x7f0706d2

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, La/rpm0;->d:I

    .line 41
    .line 42
    :cond_1
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x0

    .line 47
    :goto_0
    const/4 v3, 0x0

    .line 48
    if-ge v2, v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-le v5, v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-gt v5, v0, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    move-object v4, v3

    .line 71
    :goto_1
    if-nez v4, :cond_4

    .line 72
    .line 73
    goto/16 :goto_9

    .line 74
    .line 75
    :cond_4
    iget-object v0, p0, La/rpm0;->b:Landroid/view/ViewGroup;

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_5
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    check-cast p2, Landroid/view/ViewGroup;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_6
    move-object p2, v3

    .line 92
    :goto_2
    if-eqz p2, :cond_7

    .line 93
    .line 94
    const v0, 0x7f0a0ea2

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Landroid/view/ViewGroup;

    .line 102
    .line 103
    move-object v0, p2

    .line 104
    goto :goto_3

    .line 105
    :cond_7
    move-object v0, v3

    .line 106
    :goto_3
    iput-object v0, p0, La/rpm0;->b:Landroid/view/ViewGroup;

    .line 107
    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    const p2, 0x7f0a069d

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    check-cast p2, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    move-object p2, v3

    .line 121
    :goto_4
    iput-object p2, p0, La/rpm0;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 122
    .line 123
    :goto_5
    if-nez v0, :cond_9

    .line 124
    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :cond_9
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    iget-object v1, p0, La/rpm0;->a:La/tjj0;

    .line 132
    .line 133
    iget-object v2, v1, La/i26;->f:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, Ljava/util/List;

    .line 136
    .line 137
    if-eqz v2, :cond_a

    .line 138
    .line 139
    invoke-static {p2, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, La/sjj0;

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_a
    move-object p2, v3

    .line 147
    :goto_6
    instance-of p2, p2, La/qjj0;

    .line 148
    .line 149
    if-eqz p2, :cond_b

    .line 150
    .line 151
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    iget p0, p0, La/rpm0;->d:I

    .line 156
    .line 157
    sub-int/2addr p1, p0

    .line 158
    int-to-float p0, p1

    .line 159
    invoke-virtual {v0, p0}, Landroid/view/View;->setTranslationY(F)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_b
    iget-object p2, v1, La/i26;->f:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p2, Ljava/util/List;

    .line 166
    .line 167
    if-eqz p2, :cond_c

    .line 168
    .line 169
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    check-cast p2, La/sjj0;

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_c
    move-object p2, v3

    .line 177
    :goto_7
    instance-of p2, p2, La/qjj0;

    .line 178
    .line 179
    if-eqz p2, :cond_d

    .line 180
    .line 181
    move p3, p1

    .line 182
    goto :goto_8

    .line 183
    :cond_d
    add-int/lit8 p1, p1, -0x1

    .line 184
    .line 185
    if-gez p1, :cond_b

    .line 186
    .line 187
    :goto_8
    invoke-virtual {v1, p3}, La/tjj0;->H(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget-object p0, p0, La/rpm0;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 192
    .line 193
    invoke-static {p1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    if-nez p2, :cond_10

    .line 198
    .line 199
    if-eqz p0, :cond_e

    .line 200
    .line 201
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/header/DsHeader;->getLabel()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    :cond_e
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    if-nez p2, :cond_10

    .line 210
    .line 211
    if-eqz p0, :cond_f

    .line 212
    .line 213
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/header/DsHeader;->setLabel(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    :cond_f
    if-eqz p0, :cond_10

    .line 217
    .line 218
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 219
    .line 220
    .line 221
    :cond_10
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 222
    .line 223
    .line 224
    move-result p0

    .line 225
    const/4 p1, 0x0

    .line 226
    cmpg-float p0, p0, p1

    .line 227
    .line 228
    if-nez p0, :cond_11

    .line 229
    .line 230
    :goto_9
    return-void

    .line 231
    :cond_11
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 232
    .line 233
    .line 234
    return-void
.end method

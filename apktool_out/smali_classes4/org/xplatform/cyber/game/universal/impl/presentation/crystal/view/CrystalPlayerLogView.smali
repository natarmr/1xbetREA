.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->a:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const p3, 0x7f070718

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->c:I

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const p3, 0x7f0706e1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->d:I

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const p3, 0x7f07072d

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->e:I

    .line 58
    .line 59
    const p2, 0x7f0606de

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iput p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->f:I

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Z)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/rgf;

    .line 16
    .line 17
    iget-object v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->a:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget v2, v0, La/rgf;->b:I

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x2

    .line 29
    const/4 v5, 0x0

    .line 30
    if-ne v2, v4, :cond_1

    .line 31
    .line 32
    iget-boolean v2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->b:Z

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    if-eqz p2, :cond_1

    .line 37
    .line 38
    new-instance v2, Landroid/view/View;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-direct {v2, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    iget v6, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->f:I

    .line 48
    .line 49
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 50
    .line 51
    .line 52
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 53
    .line 54
    iget v7, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->c:I

    .line 55
    .line 56
    iget v8, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->d:I

    .line 57
    .line 58
    invoke-direct {v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 59
    .line 60
    .line 61
    iget v7, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->e:I

    .line 62
    .line 63
    invoke-virtual {v6, v5, v5, v5, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    .line 68
    .line 69
    iput-boolean v3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->b:Z

    .line 70
    .line 71
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const v6, 0x7f0d05b7

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v6, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const v5, 0x7f0a081e

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Landroid/widget/ImageView;

    .line 94
    .line 95
    if-eqz v6, :cond_2

    .line 96
    .line 97
    const v5, 0x7f0a1047

    .line 98
    .line 99
    .line 100
    invoke-static {v2, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    check-cast v7, Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v7, :cond_2

    .line 107
    .line 108
    new-instance v5, La/jk30;

    .line 109
    .line 110
    check-cast v2, Landroid/widget/LinearLayout;

    .line 111
    .line 112
    invoke-direct {v5, v2, v6, v7, v3}, La/jk30;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;B)V

    .line 113
    .line 114
    .line 115
    iget-object v3, v0, La/rgf;->d:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    new-array v3, v4, [F

    .line 121
    .line 122
    fill-array-data v3, :array_0

    .line 123
    .line 124
    .line 125
    sget-object v6, Landroid/widget/LinearLayout;->ALPHA:Landroid/util/Property;

    .line 126
    .line 127
    invoke-static {v7, v6, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const-wide/16 v6, 0x190

    .line 132
    .line 133
    invoke-virtual {v3, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 134
    .line 135
    .line 136
    const-wide/16 v6, 0xdac

    .line 137
    .line 138
    invoke-virtual {v3, v6, v7}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 139
    .line 140
    .line 141
    new-instance v6, La/akc;

    .line 142
    .line 143
    invoke-direct {v6, v5, v0, v4}, La/akc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    const-string p1, "Missing required view with ID: "

    .line 169
    .line 170
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :cond_3
    return-void

    .line 178
    nop

    .line 179
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

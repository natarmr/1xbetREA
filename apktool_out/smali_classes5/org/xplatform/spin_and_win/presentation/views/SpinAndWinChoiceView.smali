.class public final Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;
.super La/ay5;
.source "SourceFile"


# static fields
.field public static final synthetic d:I


# instance fields
.field public final a:La/a8z;

.field public b:Lkotlin/jvm/functions/Function1;

.field public final c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2}, La/ay5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/wez;->b:La/wez;

    .line 13
    .line 14
    new-instance p2, La/sue0;

    .line 15
    .line 16
    const/16 p3, 0x16

    .line 17
    .line 18
    invoke-direct {p2, p0, p0, p3}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->a:La/a8z;

    .line 26
    .line 27
    new-instance p1, La/ejk0;

    .line 28
    .line 29
    const/16 p2, 0x9

    .line 30
    .line 31
    invoke-direct {p1, p2}, La/ejk0;-><init>(B)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->b:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->c:Ljava/util/ArrayList;

    .line 42
    .line 43
    return-void
.end method

.method private final getViewBinding()La/mic;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, La/mic;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->getViewBinding()La/mic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/mic;->e:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 6
    .line 7
    iget-object v2, v0, La/mic;->g:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 8
    .line 9
    iget-object v3, v0, La/mic;->c:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 10
    .line 11
    iget-object v4, v0, La/mic;->f:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 12
    .line 13
    iget-object v5, v0, La/mic;->d:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 14
    .line 15
    iget-object v6, v0, La/mic;->h:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 16
    .line 17
    filled-new-array/range {v1 .. v6}, [Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object p0, p0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->c:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final b(III)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f070738

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x7f070705

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/high16 v2, 0x40c00000    # 6.0f

    .line 24
    .line 25
    mul-float/2addr v1, v2

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const v4, 0x7f07072d

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/high16 v4, 0x40000000    # 2.0f

    .line 38
    .line 39
    mul-float/2addr v3, v4

    .line 40
    sub-int/2addr p2, p1

    .line 41
    mul-float p1, v0, v2

    .line 42
    .line 43
    add-float/2addr p1, v1

    .line 44
    add-float/2addr p1, v3

    .line 45
    int-to-float p2, p2

    .line 46
    cmpg-float v5, p2, p1

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x1

    .line 50
    if-gez v5, :cond_0

    .line 51
    .line 52
    move v5, v7

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v5, v6

    .line 55
    :goto_0
    sub-float v1, p2, v1

    .line 56
    .line 57
    sub-float/2addr v1, v3

    .line 58
    sub-float/2addr p1, v0

    .line 59
    cmpl-float p1, p2, p1

    .line 60
    .line 61
    if-lez p1, :cond_1

    .line 62
    .line 63
    move v6, v7

    .line 64
    :cond_1
    iget-object p1, p0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->c:Ljava/util/ArrayList;

    .line 65
    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    if-nez v6, :cond_3

    .line 69
    .line 70
    invoke-direct {p0}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->getViewBinding()La/mic;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    iget-object p2, p2, La/mic;->b:Landroid/widget/GridLayout;

    .line 75
    .line 76
    const/4 v0, 0x2

    .line 77
    invoke-virtual {p2, v0}, Landroid/widget/GridLayout;->setColumnCount(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    const v1, 0x7f070739

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    mul-float/2addr p2, v4

    .line 92
    int-to-float v1, p3

    .line 93
    cmpl-float p2, p2, v1

    .line 94
    .line 95
    if-lez p2, :cond_2

    .line 96
    .line 97
    div-int/2addr p3, v0

    .line 98
    div-int/lit8 p2, p3, 0x2

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_2

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput p3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    invoke-virtual {p0}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->c()V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_3
    invoke-direct {p0}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->getViewBinding()La/mic;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    iget-object p2, p2, La/mic;->b:Landroid/widget/GridLayout;

    .line 138
    .line 139
    invoke-virtual {p2, v7}, Landroid/widget/GridLayout;->setColumnCount(I)V

    .line 140
    .line 141
    .line 142
    div-float/2addr v1, v2

    .line 143
    float-to-int p2, v1

    .line 144
    mul-int/lit8 p3, p2, 0x2

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_4

    .line 155
    .line 156
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 161
    .line 162
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iput p3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_4
    invoke-virtual {p0}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->c()V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->getViewBinding()La/mic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/mic;->e:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 6
    .line 7
    const v2, 0x7f080c0c

    .line 8
    .line 9
    .line 10
    sget-object v3, La/yxk0;->a:La/yxk0;

    .line 11
    .line 12
    const v4, 0x7f080c0b

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v4, v2, v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->e(IILa/yxk0;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, La/mic;->g:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 19
    .line 20
    const v2, 0x7f080c16

    .line 21
    .line 22
    .line 23
    sget-object v3, La/yxk0;->c:La/yxk0;

    .line 24
    .line 25
    const v4, 0x7f080c15

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v4, v2, v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->e(IILa/yxk0;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, La/mic;->c:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 32
    .line 33
    const v2, 0x7f080c12

    .line 34
    .line 35
    .line 36
    sget-object v3, La/yxk0;->e:La/yxk0;

    .line 37
    .line 38
    const v4, 0x7f080c11

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v4, v2, v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->e(IILa/yxk0;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, La/mic;->f:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 45
    .line 46
    const v2, 0x7f080c14

    .line 47
    .line 48
    .line 49
    sget-object v3, La/yxk0;->b:La/yxk0;

    .line 50
    .line 51
    const v4, 0x7f080c13

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v4, v2, v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->e(IILa/yxk0;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, La/mic;->d:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 58
    .line 59
    const v2, 0x7f080c0e

    .line 60
    .line 61
    .line 62
    sget-object v3, La/yxk0;->f:La/yxk0;

    .line 63
    .line 64
    const v4, 0x7f080c0d

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v4, v2, v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->e(IILa/yxk0;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v0, La/mic;->h:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 71
    .line 72
    const v1, 0x7f080c10

    .line 73
    .line 74
    .line 75
    sget-object v2, La/yxk0;->d:La/yxk0;

    .line 76
    .line 77
    const v3, 0x7f080c0f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v3, v1, v2}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->e(IILa/yxk0;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->c:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_0

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 100
    .line 101
    new-instance v2, La/bs50;

    .line 102
    .line 103
    const/16 v3, 0xa

    .line 104
    .line 105
    invoke-direct {v2, p0, v1, v3}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_0
    return-void
.end method

.method public getLayoutView()I
    .locals 0

    const p0, 0x7f0d0087

    return p0
.end method

.method public final setOnButtonClickListener$spin_and_win(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "La/yxk0;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->b:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method

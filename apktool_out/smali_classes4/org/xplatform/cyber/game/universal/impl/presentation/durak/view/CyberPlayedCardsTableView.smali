.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:La/a8z;

.field public final b:Ljava/util/List;

.field public c:Ljava/util/ArrayList;

.field public d:La/len;

.field public final e:La/a8z;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

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
    sget-object p1, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance p2, La/lhf;

    .line 16
    .line 17
    const/16 p3, 0x8

    .line 18
    .line 19
    invoke-direct {p2, p0, p0, p3}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->a:La/a8z;

    .line 27
    .line 28
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->getBindingView()La/o1o0;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-object v0, p2, La/o1o0;->b:La/n1o0;

    .line 33
    .line 34
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->getBindingView()La/o1o0;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iget-object v1, p2, La/o1o0;->e:La/n1o0;

    .line 39
    .line 40
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->getBindingView()La/o1o0;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-object v2, p2, La/o1o0;->g:La/n1o0;

    .line 45
    .line 46
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->getBindingView()La/o1o0;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iget-object v3, p2, La/o1o0;->d:La/n1o0;

    .line 51
    .line 52
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->getBindingView()La/o1o0;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object v4, p2, La/o1o0;->c:La/n1o0;

    .line 57
    .line 58
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->getBindingView()La/o1o0;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iget-object v5, p2, La/o1o0;->f:La/n1o0;

    .line 63
    .line 64
    filled-new-array/range {v0 .. v5}, [La/n1o0;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->b:Ljava/util/List;

    .line 73
    .line 74
    new-instance p2, La/x3h;

    .line 75
    .line 76
    const/16 p3, 0x1a

    .line 77
    .line 78
    invoke-direct {p2, p3}, La/x3h;-><init>(B)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->e:La/a8z;

    .line 86
    .line 87
    return-void
.end method

.method private final getBindingView()La/o1o0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/o1o0;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getEmptyCards()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La/fng;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->e:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    if-ltz v0, :cond_2

    .line 19
    .line 20
    check-cast v1, La/fng;

    .line 21
    .line 22
    iget-object v3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->b:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/n1o0;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object v3, v0, La/n1o0;->b:Landroid/widget/ImageView;

    .line 33
    .line 34
    iget v4, v1, La/fng;->a:I

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 37
    .line 38
    .line 39
    :cond_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, La/n1o0;->c:Landroid/widget/ImageView;

    .line 42
    .line 43
    iget v1, v1, La/fng;->b:I

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 46
    .line 47
    .line 48
    :cond_1
    move v0, v2

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    throw p0

    .line 55
    :cond_3
    return-void
.end method

.method public final b(Ljava/util/ArrayList;La/len;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->d:La/len;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object p3, La/len;->c:La/len;

    .line 10
    .line 11
    if-eq p2, p3, :cond_7

    .line 12
    .line 13
    sget-object p3, La/len;->b:La/len;

    .line 14
    .line 15
    if-eq p2, p3, :cond_7

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->a(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    sget-object v1, La/len;->c:La/len;

    .line 22
    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    sget-object v1, La/len;->b:La/len;

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->getEmptyCards()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->a(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    new-instance v0, Landroid/view/animation/AnimationSet;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-direct {v0, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const-wide/16 v3, 0xdac

    .line 47
    .line 48
    if-eq v2, v1, :cond_5

    .line 49
    .line 50
    const/4 v5, 0x2

    .line 51
    if-eq v2, v5, :cond_3

    .line 52
    .line 53
    const/4 p3, 0x0

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz p3, :cond_4

    .line 60
    .line 61
    const p3, 0x7f010026

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    const p3, 0x7f010024

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-static {v2, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-virtual {p3, v3, v4}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    const v2, 0x7f010025

    .line 81
    .line 82
    .line 83
    invoke-static {p3, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-virtual {p3, v3, v4}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const v3, 0x7f010027

    .line 95
    .line 96
    .line 97
    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v3, La/f73;

    .line 102
    .line 103
    invoke-direct {v3, p0, p1, v1}, La/f73;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v3}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v2}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 110
    .line 111
    .line 112
    if-eqz p3, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0, p3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillEnabled(Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 130
    .line 131
    .line 132
    :cond_7
    :goto_2
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->c:Ljava/util/ArrayList;

    .line 133
    .line 134
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->d:La/len;

    .line 135
    .line 136
    return-void
.end method

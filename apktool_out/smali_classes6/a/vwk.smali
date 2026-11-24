.class public final La/vwk;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/vwk;->a:B

    .line 3
    .line 4
    new-instance v0, La/ejk0;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, La/ejk0;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput p1, p0, La/vwk;->b:I

    .line 14
    .line 15
    iput-object v0, p0, La/vwk;->c:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/vwk;->a:B

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, La/vwk;->c:Ljava/lang/Object;

    .line 20
    iput p2, p0, La/vwk;->b:I

    return-void
.end method


# virtual methods
.method public f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/vwk;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, La/fhe0;->f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->V(Landroid/view/View;)I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    if-nez p4, :cond_0

    .line 24
    .line 25
    iget-object p4, p0, La/vwk;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p4, Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    invoke-static {p3, p2}, La/kcx;->J(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p4, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    iget p0, p0, La/vwk;->b:I

    .line 46
    .line 47
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 p0, 0x0

    .line 51
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 6

    .line 1
    iget-byte v0, p0, La/vwk;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, La/vwk;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    iget p0, p0, La/vwk;->b:I

    .line 22
    .line 23
    add-int/2addr p3, p0

    .line 24
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, p0

    .line 33
    sub-int/2addr v1, v2

    .line 34
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    add-int/lit8 p0, p0, -0x2

    .line 39
    .line 40
    if-ltz p0, :cond_3

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    move v3, v2

    .line 44
    :goto_0
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    check-cast v5, La/hhe0;

    .line 59
    .line 60
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 65
    .line 66
    add-int/2addr v4, v5

    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    move v5, v2

    .line 75
    :goto_1
    add-int/2addr v5, v4

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-virtual {v0, p3, v4, v1, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 79
    .line 80
    .line 81
    :cond_1
    if-eqz v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    if-eq v3, p0, :cond_3

    .line 87
    .line 88
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

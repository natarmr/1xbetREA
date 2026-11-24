.class public final La/tp5;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;II)V
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
    iput p2, p0, La/tp5;->a:I

    .line 8
    .line 9
    iput p3, p0, La/tp5;->b:I

    .line 10
    .line 11
    const p2, 0x7f07072d

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iput p2, p0, La/tp5;->c:I

    .line 19
    .line 20
    const p2, 0x7f0706f8

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, La/tp5;->d:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-eqz v0, :cond_b

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto :goto_6

    .line 31
    :cond_1
    iget-object v0, v0, La/xhe0;->a:Landroid/view/View;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    instance-of v1, v0, La/vp5;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    instance-of v1, v0, La/wp5;

    .line 42
    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    instance-of v1, v0, La/xp5;

    .line 47
    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_5
    instance-of v0, v0, La/yp5;

    .line 52
    .line 53
    if-eqz v0, :cond_6

    .line 54
    .line 55
    :goto_1
    iget v0, p0, La/tp5;->d:I

    .line 56
    .line 57
    div-int/lit8 v1, v0, 0x2

    .line 58
    .line 59
    sub-int/2addr v0, v1

    .line 60
    iput v1, p1, Landroid/graphics/Rect;->left:I

    .line 61
    .line 62
    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_6
    :goto_2
    iget v0, p0, La/tp5;->c:I

    .line 66
    .line 67
    div-int/lit8 v1, v0, 0x2

    .line 68
    .line 69
    sub-int/2addr v0, v1

    .line 70
    iput v1, p1, Landroid/graphics/Rect;->left:I

    .line 71
    .line 72
    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 73
    .line 74
    :goto_3
    invoke-virtual {p3}, Landroid/view/View;->getLayoutDirection()I

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    const/4 v0, 0x1

    .line 79
    if-ne p3, v0, :cond_7

    .line 80
    .line 81
    move p3, v0

    .line 82
    goto :goto_4

    .line 83
    :cond_7
    const/4 p3, 0x0

    .line 84
    :goto_4
    if-nez p2, :cond_9

    .line 85
    .line 86
    iget v1, p0, La/tp5;->a:I

    .line 87
    .line 88
    if-eqz p3, :cond_8

    .line 89
    .line 90
    iput v1, p1, Landroid/graphics/Rect;->right:I

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_8
    iput v1, p1, Landroid/graphics/Rect;->left:I

    .line 94
    .line 95
    :cond_9
    :goto_5
    invoke-virtual {p4}, La/the0;->b()I

    .line 96
    .line 97
    .line 98
    move-result p4

    .line 99
    sub-int/2addr p4, v0

    .line 100
    if-ne p2, p4, :cond_b

    .line 101
    .line 102
    iget p0, p0, La/tp5;->b:I

    .line 103
    .line 104
    if-eqz p3, :cond_a

    .line 105
    .line 106
    iput p0, p1, Landroid/graphics/Rect;->left:I

    .line 107
    .line 108
    return-void

    .line 109
    :cond_a
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 110
    .line 111
    :cond_b
    :goto_6
    return-void
.end method

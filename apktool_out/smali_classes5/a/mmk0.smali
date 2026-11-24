.class public final La/mmk0;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(IIIILjava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p5, p0, La/mmk0;->a:Ljava/util/List;

    .line 8
    .line 9
    iput p1, p0, La/mmk0;->b:I

    .line 10
    .line 11
    iput p2, p0, La/mmk0;->c:I

    .line 12
    .line 13
    iput p3, p0, La/mmk0;->d:I

    .line 14
    .line 15
    iput p4, p0, La/mmk0;->e:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 1

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
    move-result-object p2

    .line 14
    instance-of p3, p2, La/cp;

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    check-cast p2, La/cp;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    :goto_0
    if-eqz p2, :cond_3

    .line 23
    .line 24
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object p3, p0, La/mmk0;->a:Ljava/util/List;

    .line 29
    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    if-eqz p4, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    :cond_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    if-eqz p4, :cond_3

    .line 48
    .line 49
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    check-cast p4, Ljava/lang/Class;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p4

    .line 63
    if-eqz p4, :cond_2

    .line 64
    .line 65
    iget p2, p0, La/mmk0;->b:I

    .line 66
    .line 67
    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 68
    .line 69
    iget p2, p0, La/mmk0;->c:I

    .line 70
    .line 71
    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 72
    .line 73
    iget p2, p0, La/mmk0;->d:I

    .line 74
    .line 75
    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 76
    .line 77
    iget p0, p0, La/mmk0;->e:I

    .line 78
    .line 79
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 80
    .line 81
    :cond_3
    :goto_1
    return-void
.end method

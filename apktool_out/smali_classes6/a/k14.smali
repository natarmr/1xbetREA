.class public final La/k14;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Ljava/lang/Integer;

.field public h:Ljava/lang/ref/WeakReference;

.field public i:Ljava/lang/ref/WeakReference;

.field public final j:La/g14;

.field public final k:La/h14;

.field public final l:La/b33;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/k14;->a:Landroid/view/View;

    .line 5
    .line 6
    const p1, 0x800035

    .line 7
    .line 8
    .line 9
    iput p1, p0, La/k14;->b:I

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, La/k14;->f:Z

    .line 13
    .line 14
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/k14;->i:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    new-instance p1, La/g14;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, v0}, La/g14;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/k14;->j:La/g14;

    .line 36
    .line 37
    new-instance p1, La/h14;

    .line 38
    .line 39
    invoke-direct {p1, p0, v0}, La/h14;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La/k14;->k:La/h14;

    .line 43
    .line 44
    new-instance p1, La/b33;

    .line 45
    .line 46
    const/16 v0, 0xb

    .line 47
    .line 48
    invoke-direct {p1, p0, v0}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, La/k14;->l:La/b33;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a(Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/k14;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    sget-object v2, La/bqd0;->w:[I

    .line 12
    .line 13
    invoke-virtual {v0, p1, v2, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p0, p0, La/k14;->l:La/b33;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/b33;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Landroid/view/View;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/k14;->i:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    iget-object v0, p0, La/k14;->j:La/g14;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, La/k14;->a:Landroid/view/View;

    .line 23
    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Landroid/view/View;

    .line 34
    .line 35
    move-object v3, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v3, v0

    .line 38
    :goto_0
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    iget v4, p0, La/k14;->b:I

    .line 46
    .line 47
    iget v5, p0, La/k14;->c:I

    .line 48
    .line 49
    iget v6, p0, La/k14;->d:I

    .line 50
    .line 51
    move-object v2, p1

    .line 52
    invoke-static/range {v1 .. v6}, La/gq80;->b0(Landroid/view/View;Landroid/view/View;Landroid/view/View;III)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, La/k14;->g:Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {p0, p1}, La/k14;->e(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    instance-of v4, p1, Landroid/view/View;

    .line 72
    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    move-object v0, p1

    .line 76
    check-cast v0, Landroid/view/View;

    .line 77
    .line 78
    :cond_2
    invoke-virtual {p0, v0, v3}, La/k14;->f(Landroid/view/View;Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, La/k14;->k:La/h14;

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0, v2}, La/k14;->c(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    new-instance p1, La/i14;

    .line 101
    .line 102
    invoke-direct {p1, v2, p0, v2}, La/i14;-><init>(Landroid/view/View;La/k14;Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v2, p1

    .line 110
    :goto_2
    new-instance p1, La/i14;

    .line 111
    .line 112
    invoke-direct {p1, p2, p0, v2}, La/i14;-><init>(Lkotlin/jvm/functions/Function0;La/k14;Landroid/view/View;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 116
    .line 117
    .line 118
    return-object v1
.end method

.method public final c(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/k14;->j:La/g14;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, La/k14;->k:La/h14;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/view/View;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    check-cast p1, Landroid/view/ViewGroup;

    .line 38
    .line 39
    move-object v0, p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v0, v1

    .line 42
    :cond_1
    :goto_0
    instance-of p1, v0, Landroid/view/ViewGroup;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    move-object v1, v0

    .line 47
    check-cast v1, Landroid/view/ViewGroup;

    .line 48
    .line 49
    :cond_2
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    iget-object p0, p0, La/k14;->a:Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {p1, p0}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    return-void
.end method

.method public final d(III)V
    .locals 6

    .line 1
    iput p1, p0, La/k14;->b:I

    .line 2
    .line 3
    iput p2, p0, La/k14;->c:I

    .line 4
    .line 5
    iput p3, p0, La/k14;->d:I

    .line 6
    .line 7
    iget-object p1, p0, La/k14;->i:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    move-object v1, p1

    .line 14
    check-cast v1, Landroid/view/View;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    move-object v2, p1

    .line 25
    check-cast v2, Landroid/view/View;

    .line 26
    .line 27
    iget v3, p0, La/k14;->b:I

    .line 28
    .line 29
    iget v4, p0, La/k14;->c:I

    .line 30
    .line 31
    iget v5, p0, La/k14;->d:I

    .line 32
    .line 33
    iget-object v0, p0, La/k14;->a:Landroid/view/View;

    .line 34
    .line 35
    invoke-static/range {v0 .. v5}, La/gq80;->l0(Landroid/view/View;Landroid/view/View;Landroid/view/View;III)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public final e(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, La/k14;->g:Ljava/lang/Integer;

    .line 6
    .line 7
    iget-object v0, p0, La/k14;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget p0, p0, La/k14;->e:I

    .line 16
    .line 17
    invoke-static {v0, p1, p0}, La/gq80;->m0(Landroid/graphics/drawable/Drawable;II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final f(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    iget-object v0, p0, La/k14;->a:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget p0, p0, La/k14;->e:I

    .line 17
    .line 18
    if-lez p0, :cond_1

    .line 19
    .line 20
    invoke-static {p2}, La/gq80;->e0(Landroid/view/View;)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/gq80;->e0(Landroid/view/View;)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    :cond_0
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {v0, p1, p0}, La/gq80;->m0(Landroid/graphics/drawable/Drawable;II)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

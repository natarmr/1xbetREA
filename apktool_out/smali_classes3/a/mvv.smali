.class public final La/mvv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hlp0;


# instance fields
.field public final a:I

.field public final b:La/s1g;

.field public final c:I

.field public final d:I

.field public final e:Landroid/widget/ImageView;

.field public final f:I

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const v1, 0x7f0700ab

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, La/mvv;->a:I

    .line 20
    .line 21
    new-instance v0, La/s1g;

    .line 22
    .line 23
    const v1, 0x7f0606a8

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const v2, 0x7f0700ad

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, La/s1g;->c(F)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/mvv;->b:La/s1g;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const v1, 0x7f0706b0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, La/mvv;->c:I

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const v2, 0x7f07069b

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iput v1, p0, La/mvv;->d:I

    .line 70
    .line 71
    new-instance v2, Landroid/widget/ImageView;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 81
    .line 82
    invoke-direct {v3, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    iput-object v2, p0, La/mvv;->e:Landroid/widget/ImageView;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const v0, 0x7f070717

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iput p1, p0, La/mvv;->f:I

    .line 105
    .line 106
    const-string p1, ""

    .line 107
    .line 108
    iput-object p1, p0, La/mvv;->g:Ljava/lang/String;

    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final a(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, La/mvv;->b:La/s1g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, La/s1g;->b(IIII)V

    .line 4
    .line 5
    .line 6
    iget p3, p0, La/mvv;->f:I

    .line 7
    .line 8
    add-int/2addr p1, p3

    .line 9
    iget-object p0, p0, La/mvv;->e:Landroid/widget/ImageView;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    add-int/2addr p3, p1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 17
    .line 18
    .line 19
    move-result p4

    .line 20
    add-int/2addr p4, p2

    .line 21
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final b(I)V
    .locals 2

    .line 1
    iget p1, p0, La/mvv;->c:I

    .line 2
    .line 3
    const/high16 v0, 0x40000000    # 2.0f

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget v1, p0, La/mvv;->d:I

    .line 10
    .line 11
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object p0, p0, La/mvv;->e:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->measure(II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, La/mvv;->g:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object p2, La/u0d;->a:Ljava/util/List;

    .line 14
    .line 15
    new-instance p2, La/j2x;

    .line 16
    .line 17
    iget v0, p0, La/mvv;->a:I

    .line 18
    .line 19
    invoke-direct {p2, v0}, La/j2x;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const/4 v7, 0x0

    .line 27
    const/16 v8, 0x1ec

    .line 28
    .line 29
    iget-object v1, p0, La/mvv;->e:Landroid/widget/ImageView;

    .line 30
    .line 31
    const v3, 0x7f0804b5

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    move-object v2, p1

    .line 37
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 38
    .line 39
    .line 40
    iput-object p3, p0, La/mvv;->g:Ljava/lang/String;

    .line 41
    .line 42
    return-void
.end method

.method public final k(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/mvv;->b:La/s1g;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

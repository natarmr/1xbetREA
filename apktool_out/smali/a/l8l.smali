.class public final La/l8l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7l;

.field public final b:La/i8l;

.field public final c:La/a8z;

.field public final d:La/a8z;

.field public final e:Landroid/graphics/RectF;

.field public final f:Landroid/graphics/Rect;

.field public g:I

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(La/p7l;La/i8l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/l8l;->a:La/p7l;

    .line 5
    .line 6
    iput-object p2, p0, La/l8l;->b:La/i8l;

    .line 7
    .line 8
    new-instance p1, La/k8l;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p1, p0, p2}, La/k8l;-><init>(La/l8l;B)V

    .line 12
    .line 13
    .line 14
    sget-object p2, La/wez;->b:La/wez;

    .line 15
    .line 16
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/l8l;->c:La/a8z;

    .line 21
    .line 22
    new-instance p1, La/k8l;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, v0}, La/k8l;-><init>(La/l8l;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, La/l8l;->d:La/a8z;

    .line 33
    .line 34
    new-instance p1, Landroid/graphics/RectF;

    .line 35
    .line 36
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/l8l;->e:Landroid/graphics/RectF;

    .line 40
    .line 41
    new-instance p1, Landroid/graphics/Rect;

    .line 42
    .line 43
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/l8l;->f:Landroid/graphics/Rect;

    .line 47
    .line 48
    return-void
.end method

.method public static a(Landroid/graphics/RectF;Landroid/view/ViewGroup;FFFF)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p2, p3, p4, p5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-float v0, v0

    .line 16
    sub-float/2addr v0, p4

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    int-to-float p1, p1

    .line 22
    sub-float/2addr p1, p2

    .line 23
    invoke-virtual {p0, v0, p3, p1, p5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

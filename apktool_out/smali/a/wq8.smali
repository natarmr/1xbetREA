.class public final La/wq8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vq8;
.implements La/ojv0;


# static fields
.field public static final a:La/wq8;

.field public static final b:La/wq8;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/wq8;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wq8;->a:La/wq8;

    .line 7
    .line 8
    new-instance v0, La/wq8;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/wq8;->b:La/wq8;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public b(Landroid/app/Activity;La/x6k;)La/kjv0;
    .locals 2

    .line 1
    new-instance p0, La/kjv0;

    .line 2
    .line 3
    new-instance v0, La/tq8;

    .line 4
    .line 5
    sget-object v1, La/vq8;->G:La/uq8;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, La/uq8;->a()La/vq8;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1, p1}, La/vq8;->f(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, La/tq8;-><init>(Landroid/graphics/Rect;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p2, p1}, La/x6k;->h(Landroid/content/Context;)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-direct {p0, v0, p1}, La/kjv0;-><init>(La/tq8;F)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public f(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 0

    .line 1
    const-class p0, Landroid/view/WindowManager;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/WindowManager;

    .line 8
    .line 9
    invoke-interface {p0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public g(Landroid/content/Context;La/x6k;)La/kjv0;
    .locals 0

    .line 1
    const-class p0, Landroid/view/WindowManager;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/WindowManager;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 18
    .line 19
    new-instance p2, La/kjv0;

    .line 20
    .line 21
    invoke-interface {p0}, Landroid/view/WindowManager;->getCurrentWindowMetrics()Landroid/view/WindowMetrics;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-direct {p2, p0, p1}, La/kjv0;-><init>(Landroid/graphics/Rect;F)V

    .line 33
    .line 34
    .line 35
    return-object p2
.end method

.class public Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;
.super Lcom/google/android/material/imageview/ShapeableImageView;
.source "SourceFile"


# static fields
.field public static final synthetic B:I


# instance fields
.field public A:Lkotlin/jvm/functions/Function1;

.field public final v:La/n0o0;

.field public final w:Landroid/graphics/drawable/Drawable;

.field public x:Lkotlin/jvm/functions/Function0;

.field public y:Lkotlin/jvm/functions/Function1;

.field public z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, La/mbz;

    .line 14
    .line 15
    const/16 p3, 0xd

    .line 16
    .line 17
    invoke-direct {p1, p0, p2, p3}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->v:La/n0o0;

    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->getLoadHelper()La/r0x;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p1, p1, La/r0x;->c:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->w:Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    new-instance p1, La/x800;

    .line 35
    .line 36
    invoke-direct {p1, p3}, La/x800;-><init>(B)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->x:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    new-instance p1, La/w800;

    .line 42
    .line 43
    const/16 p2, 0x16

    .line 44
    .line 45
    invoke-direct {p1, p2}, La/w800;-><init>(B)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->y:Lkotlin/jvm/functions/Function1;

    .line 49
    .line 50
    new-instance p1, La/w800;

    .line 51
    .line 52
    const/16 p2, 0x15

    .line 53
    .line 54
    invoke-direct {p1, p2}, La/w800;-><init>(B)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->z:Lkotlin/jvm/functions/Function1;

    .line 58
    .line 59
    return-void
.end method

.method private final getLoadHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->v:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/r0x;

    .line 8
    .line 9
    return-object p0
.end method

.method public static i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->w:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    :cond_0
    move-object v3, p2

    .line 8
    new-instance p2, La/w800;

    .line 9
    .line 10
    const/16 p3, 0x13

    .line 11
    .line 12
    invoke-direct {p2, p3}, La/w800;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance p3, La/w800;

    .line 16
    .line 17
    const/16 v1, 0x15

    .line 18
    .line 19
    invoke-direct {p3, v1}, La/w800;-><init>(B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->x:Lkotlin/jvm/functions/Function0;

    .line 29
    .line 30
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->getLoadHelper()La/r0x;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v4, La/gq00;

    .line 38
    .line 39
    invoke-direct {v4, p2, p0, v0}, La/gq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;B)V

    .line 40
    .line 41
    .line 42
    new-instance v5, La/gq00;

    .line 43
    .line 44
    const/4 p2, 0x3

    .line 45
    invoke-direct {v5, p3, p0, p2}, La/gq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;B)V

    .line 46
    .line 47
    .line 48
    const/4 v6, 0x4

    .line 49
    move-object v2, p1

    .line 50
    invoke-static/range {v1 .. v6}, La/r0x;->g(La/r0x;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static l(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 4

    .line 1
    new-instance v0, La/w800;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/w800;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->x:Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->getLoadHelper()La/r0x;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, La/gq00;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v2, v0, p0, v3}, La/gq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;B)V

    .line 24
    .line 25
    .line 26
    new-instance v0, La/gq00;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-direct {v0, p2, p0, v3}, La/gq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;B)V

    .line 30
    .line 31
    .line 32
    const p0, 0x7f0809af

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1, p0, v2, v0}, La/r0x;->f(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final g(Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->getLoadHelper()La/r0x;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final getOnDrawableChangeCallback$uikit()Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/graphics/drawable/Drawable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->A:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnError$uikit()Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->z:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnLoaded$uikit()Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->y:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnLoading$uikit()Lkotlin/jvm/functions/Function0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->x:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPlaceholder()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->w:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->x:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->getLoadHelper()La/r0x;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, La/gq00;

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    invoke-direct {v1, p3, p0, v2}, La/gq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;B)V

    .line 17
    .line 18
    .line 19
    new-instance p3, La/gq00;

    .line 20
    .line 21
    const/4 v2, 0x5

    .line 22
    invoke-direct {p3, p4, p0, v2}, La/gq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, p2, v1, p3}, La/r0x;->c(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->A:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setOnDrawableChangeCallback$uikit(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->A:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnError$uikit(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->z:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method

.method public final setOnLoaded$uikit(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->y:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method

.method public final setOnLoading$uikit(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->x:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public setPlaceholder(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->getLoadHelper()La/r0x;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iput-object p1, p0, La/r0x;->c:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    return-void
.end method

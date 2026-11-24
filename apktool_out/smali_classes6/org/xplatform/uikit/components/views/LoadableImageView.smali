.class public Lorg/xplatform/uikit/components/views/LoadableImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# static fields
.field public static final synthetic i:I


# instance fields
.field public final d:La/n0o0;

.field public final e:Landroid/graphics/drawable/Drawable;

.field public f:Lkotlin/jvm/functions/Function0;

.field public g:Lkotlin/jvm/functions/Function1;

.field public h:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/rcz;

    .line 8
    .line 9
    const/16 v0, 0x1a

    .line 10
    .line 11
    invoke-direct {p1, p0, v0}, La/rcz;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->d:La/n0o0;

    .line 19
    .line 20
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->getLoadHelper()La/r0x;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, La/r0x;->c:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->e:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    new-instance p1, La/x800;

    .line 29
    .line 30
    const/16 v0, 0xc

    .line 31
    .line 32
    invoke-direct {p1, v0}, La/x800;-><init>(B)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->f:Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    new-instance p1, La/w800;

    .line 38
    .line 39
    const/16 v0, 0x10

    .line 40
    .line 41
    invoke-direct {p1, v0}, La/w800;-><init>(B)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->g:Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    new-instance p1, La/w800;

    .line 47
    .line 48
    const/16 v0, 0xf

    .line 49
    .line 50
    invoke-direct {p1, v0}, La/w800;-><init>(B)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->h:Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->getLoadHelper()La/r0x;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0, p2, p3}, La/r0x;->e(Landroid/util/AttributeSet;I)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 65
    invoke-direct {p0, p1, p2, p3}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic d(Lorg/xplatform/uikit/components/views/LoadableImageView;La/o0x;La/o0x;)V
    .locals 3

    .line 1
    new-instance v0, La/w800;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/w800;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/w800;

    .line 9
    .line 10
    const/16 v2, 0xf

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/w800;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableImageView;->a(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static g(Lorg/xplatform/uikit/components/views/LoadableImageView;Ljava/lang/String;I)V
    .locals 5

    .line 1
    new-instance v0, La/w800;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/w800;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/w800;

    .line 9
    .line 10
    const/16 v2, 0xf

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/w800;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->f:Lkotlin/jvm/functions/Function0;

    .line 19
    .line 20
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->getLoadHelper()La/r0x;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v3, La/eq00;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-direct {v3, v0, p0, v4}, La/eq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableImageView;B)V

    .line 31
    .line 32
    .line 33
    new-instance v0, La/eq00;

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    invoke-direct {v0, p0, v1, v4}, La/eq00;-><init>(Lorg/xplatform/uikit/components/views/LoadableImageView;Lkotlin/jvm/functions/Function1;B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p1, p2, v3, v0}, La/r0x;->f(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private final getLoadHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->d:La/n0o0;

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

.method public static h(Lorg/xplatform/uikit/components/views/LoadableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V
    .locals 6

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->e:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    new-instance p2, La/w800;

    .line 9
    .line 10
    const/16 p3, 0xd

    .line 11
    .line 12
    invoke-direct {p2, p3}, La/w800;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance p3, La/w800;

    .line 16
    .line 17
    const/16 v0, 0xf

    .line 18
    .line 19
    invoke-direct {p3, v0}, La/w800;-><init>(B)V

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
    iget-object v0, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->f:Lkotlin/jvm/functions/Function0;

    .line 29
    .line 30
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->getLoadHelper()La/r0x;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v3, La/eq00;

    .line 38
    .line 39
    const/16 v1, 0x8

    .line 40
    .line 41
    invoke-direct {v3, p2, p0, v1}, La/eq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableImageView;B)V

    .line 42
    .line 43
    .line 44
    new-instance v4, La/eq00;

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    invoke-direct {v4, p3, p0, p2}, La/eq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableImageView;B)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x4

    .line 51
    move-object v1, p1

    .line 52
    invoke-static/range {v0 .. v5}, La/r0x;->g(La/r0x;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static i(Lorg/xplatform/uikit/components/views/LoadableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 11

    .line 1
    new-instance v4, La/w800;

    .line 2
    .line 3
    const/16 v0, 0xe

    .line 4
    .line 5
    invoke-direct {v4, v0}, La/w800;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->f:Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->getLoadHelper()La/r0x;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    new-instance v8, La/eq00;

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-direct {v8, p0, p3, v0}, La/eq00;-><init>(Lorg/xplatform/uikit/components/views/LoadableImageView;Lkotlin/jvm/functions/Function1;B)V

    .line 24
    .line 25
    .line 26
    new-instance v0, La/enm;

    .line 27
    .line 28
    const/16 v5, 0x13

    .line 29
    .line 30
    move-object v1, p0

    .line 31
    move-object v2, p2

    .line 32
    move-object v3, p4

    .line 33
    invoke-direct/range {v0 .. v5}, La/enm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V

    .line 34
    .line 35
    .line 36
    const/4 v10, 0x4

    .line 37
    move-object v9, v0

    .line 38
    move-object v7, v2

    .line 39
    move-object v5, v6

    .line 40
    move-object v6, p1

    .line 41
    invoke-static/range {v5 .. v10}, La/r0x;->g(La/r0x;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final l(Lorg/xplatform/uikit/components/views/LoadableImageView;Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->getLoadHelper()La/r0x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, La/eq00;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-direct {v3, p0, p2, v1}, La/eq00;-><init>(Lorg/xplatform/uikit/components/views/LoadableImageView;Lkotlin/jvm/functions/Function1;B)V

    .line 9
    .line 10
    .line 11
    new-instance v4, La/eq00;

    .line 12
    .line 13
    const/4 p2, 0x5

    .line 14
    invoke-direct {v4, p0, p3, p2}, La/eq00;-><init>(Lorg/xplatform/uikit/components/views/LoadableImageView;Lkotlin/jvm/functions/Function1;B)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const-string v1, ""

    .line 19
    .line 20
    move-object v2, p1

    .line 21
    invoke-static/range {v0 .. v5}, La/r0x;->g(La/r0x;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->f:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->getLoadHelper()La/r0x;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, La/eq00;

    .line 14
    .line 15
    const/4 v2, 0x6

    .line 16
    invoke-direct {v1, p3, p0, v2}, La/eq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableImageView;B)V

    .line 17
    .line 18
    .line 19
    new-instance p3, La/eq00;

    .line 20
    .line 21
    const/4 v2, 0x7

    .line 22
    invoke-direct {p3, p4, p0, v2}, La/eq00;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/uikit/components/views/LoadableImageView;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, p2, v1, p3}, La/r0x;->c(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    return-void
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
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->h:Lkotlin/jvm/functions/Function1;

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
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->g:Lkotlin/jvm/functions/Function1;

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
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->f:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPlaceholder()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->e:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
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
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->h:Lkotlin/jvm/functions/Function1;

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
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->g:Lkotlin/jvm/functions/Function1;

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
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->f:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public final setPlaceholder(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->getLoadHelper()La/r0x;

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

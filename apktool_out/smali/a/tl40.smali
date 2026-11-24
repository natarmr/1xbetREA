.class public final La/tl40;
.super La/x1;
.source "SourceFile"

# interfaces
.implements La/vjk;


# instance fields
.field public final j:Landroid/view/Window;

.field public final k:La/pz40;

.field public l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, La/x1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, La/tl40;->j:Landroid/view/Window;

    .line 6
    .line 7
    sget-object p1, La/khd;->a:La/ugd;

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, La/tl40;->k:La/pz40;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(ILa/fet;)V
    .locals 5

    .line 1
    const v0, 0x225fdedf

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p1

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v3

    .line 27
    :goto_1
    and-int/2addr v0, v4

    .line 28
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, La/tl40;->k:La/pz40;

    .line 35
    .line 36
    check-cast v0, La/hgk0;

    .line 37
    .line 38
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 43
    .line 44
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v0, p2, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {p2}, La/fet;->X()V

    .line 53
    .line 54
    .line 55
    :goto_2
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    new-instance v0, La/pi40;

    .line 62
    .line 63
    const/4 v1, 0x3

    .line 64
    invoke-direct {v0, p0, p1, v1}, La/pi40;-><init>(Ljava/lang/Object;IB)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 68
    .line 69
    :cond_3
    return-void
.end method

.method public final getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/tl40;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getWindow()Landroid/view/Window;
    .locals 0

    .line 1
    iget-object p0, p0, La/tl40;->j:Landroid/view/Window;

    .line 2
    .line 3
    return-object p0
.end method

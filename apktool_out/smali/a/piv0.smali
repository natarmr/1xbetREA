.class public La/piv0;
.super La/oiv0;
.source "SourceFile"


# instance fields
.field public t:La/pfx;

.field public u:La/pfx;

.field public v:La/pfx;


# direct methods
.method public constructor <init>(La/xiv0;La/piv0;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, La/oiv0;-><init>(La/xiv0;La/oiv0;)V

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, La/piv0;->t:La/pfx;

    .line 14
    iput-object p1, p0, La/piv0;->u:La/pfx;

    .line 15
    iput-object p1, p0, La/piv0;->v:La/pfx;

    return-void
.end method

.method public constructor <init>(La/xiv0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, La/oiv0;-><init>(La/xiv0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, La/piv0;->t:La/pfx;

    .line 6
    .line 7
    iput-object p1, p0, La/piv0;->u:La/pfx;

    .line 8
    .line 9
    iput-object p1, p0, La/piv0;->v:La/pfx;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public k()La/pfx;
    .locals 1

    .line 1
    iget-object v0, p0, La/piv0;->u:La/pfx;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/miv0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, La/i8q0;->s(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/pfx;->d(Landroid/graphics/Insets;)La/pfx;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, La/piv0;->u:La/pfx;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public m()La/pfx;
    .locals 1

    .line 1
    iget-object v0, p0, La/piv0;->t:La/pfx;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/miv0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, La/i8q0;->v(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/pfx;->d(Landroid/graphics/Insets;)La/pfx;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, La/piv0;->t:La/pfx;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public o()La/pfx;
    .locals 1

    .line 1
    iget-object v0, p0, La/piv0;->v:La/pfx;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/miv0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, La/i8q0;->b(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/pfx;->d(Landroid/graphics/Insets;)La/pfx;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, La/piv0;->v:La/pfx;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public r(IIII)La/xiv0;
    .locals 0

    .line 1
    iget-object p0, p0, La/miv0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, La/i8q0;->i(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-static {p0, p1}, La/xiv0;->h(Landroid/view/WindowInsets;Landroid/view/View;)La/xiv0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public z(La/pfx;)V
    .locals 0

    .line 1
    return-void
.end method

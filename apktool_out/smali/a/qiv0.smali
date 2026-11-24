.class public La/qiv0;
.super La/piv0;
.source "SourceFile"


# static fields
.field public static final w:La/xiv0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, La/zhv0;->e()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, La/xiv0;->h(Landroid/view/WindowInsets;Landroid/view/View;)La/xiv0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, La/qiv0;->w:La/xiv0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(La/xiv0;La/qiv0;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, La/piv0;-><init>(La/xiv0;La/piv0;)V

    return-void
.end method

.method public constructor <init>(La/xiv0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, La/piv0;-><init>(La/xiv0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(I)La/pfx;
    .locals 0

    .line 1
    iget-object p0, p0, La/miv0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, La/viv0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, La/zhv0;->p(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, La/pfx;->d(Landroid/graphics/Insets;)La/pfx;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public j(I)La/pfx;
    .locals 0

    .line 1
    iget-object p0, p0, La/miv0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, La/viv0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, La/zhv0;->d(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, La/pfx;->d(Landroid/graphics/Insets;)La/pfx;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public u(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/miv0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, La/viv0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, La/zhv0;->m(Landroid/view/WindowInsets;I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

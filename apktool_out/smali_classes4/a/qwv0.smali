.class public final La/qwv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pwv0;


# instance fields
.field public final a:La/ywv0;

.field public final b:La/pz40;

.field public final c:La/pz40;

.field public final d:La/pz40;


# direct methods
.method public constructor <init>(La/ywv0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/qwv0;->a:La/ywv0;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/qwv0;->b:La/pz40;

    .line 15
    .line 16
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, La/qwv0;->c:La/pz40;

    .line 21
    .line 22
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, La/qwv0;->d:La/pz40;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(La/ugd;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/qwv0;->c:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    iget-object p0, p0, La/qwv0;->a:La/ywv0;

    .line 2
    .line 3
    iget-object p0, p0, La/ywv0;->i:La/vkr0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/vkr0;->x()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d(La/ugd;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/qwv0;->d:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e(La/ugd;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/qwv0;->b:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.class public final La/uz40;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:La/pz40;

.field public final d:La/pz40;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/p4;-><init>(B)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/uz40;->c:La/pz40;

    .line 11
    .line 12
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La/uz40;->d:La/pz40;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final A0()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/uz40;->d:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final I0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/uz40;->c:La/pz40;

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

.method public final n1()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/uz40;->c:La/pz40;

    .line 2
    .line 3
    check-cast v0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, La/uz40;->d:La/pz40;

    .line 10
    .line 11
    check-cast v1, La/hgk0;

    .line 12
    .line 13
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/pz40;

    .line 26
    .line 27
    check-cast p0, La/hgk0;

    .line 28
    .line 29
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_0

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public final o1(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/uz40;->d:La/pz40;

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

.method public final y0()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/uz40;->c:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

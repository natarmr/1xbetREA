.class public final La/vdi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/y4g;


# instance fields
.field public final a:La/gii0;

.field public final b:La/n5d0;

.field public final c:La/n5d0;

.field public final d:La/n5d0;

.field public final e:La/n5d0;

.field public final f:La/n5d0;


# direct methods
.method public constructor <init>(La/gii0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vdi;->a:La/gii0;

    .line 5
    .line 6
    new-instance p1, La/dci;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x6

    .line 10
    invoke-direct {p1, p0, v0, v1}, La/dci;-><init>(Ljava/lang/Object;IB)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/vdi;->b:La/n5d0;

    .line 18
    .line 19
    new-instance p1, La/dci;

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    invoke-direct {p1, p0, v0, v1}, La/dci;-><init>(Ljava/lang/Object;IB)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, La/vdi;->c:La/n5d0;

    .line 30
    .line 31
    new-instance p1, La/dci;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-direct {p1, p0, v0, v1}, La/dci;-><init>(Ljava/lang/Object;IB)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, La/vdi;->d:La/n5d0;

    .line 42
    .line 43
    new-instance p1, La/dci;

    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    invoke-direct {p1, p0, v0, v1}, La/dci;-><init>(Ljava/lang/Object;IB)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, La/vdi;->e:La/n5d0;

    .line 54
    .line 55
    new-instance p1, La/dci;

    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    invoke-direct {p1, p0, v0, v1}, La/dci;-><init>(Ljava/lang/Object;IB)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, La/vdi;->f:La/n5d0;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final a()La/ul9;
    .locals 0

    .line 1
    iget-object p0, p0, La/vdi;->d:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ul9;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()La/ul9;
    .locals 0

    .line 1
    iget-object p0, p0, La/vdi;->f:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ul9;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c()La/y9g;
    .locals 0

    .line 1
    iget-object p0, p0, La/vdi;->b:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/y9g;

    .line 8
    .line 9
    return-object p0
.end method

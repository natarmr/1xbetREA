.class public final La/dyi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g8i;

.field public final b:La/n5d0;

.field public final c:La/n5d0;

.field public final d:La/n5d0;

.field public final e:La/n5d0;

.field public final f:La/n5d0;


# direct methods
.method public constructor <init>(La/qud;La/g8i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/dyi;->a:La/g8i;

    .line 5
    .line 6
    new-instance p1, La/psi;

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    const/16 v0, 0x1b

    .line 10
    .line 11
    invoke-direct {p1, p0, p2, v0}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/dyi;->b:La/n5d0;

    .line 19
    .line 20
    new-instance p1, La/psi;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-direct {p1, p0, p2, v0}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/dyi;->c:La/n5d0;

    .line 31
    .line 32
    new-instance p1, La/psi;

    .line 33
    .line 34
    const/4 p2, 0x2

    .line 35
    invoke-direct {p1, p0, p2, v0}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, La/dyi;->d:La/n5d0;

    .line 43
    .line 44
    new-instance p1, La/psi;

    .line 45
    .line 46
    const/4 p2, 0x3

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, La/dyi;->e:La/n5d0;

    .line 55
    .line 56
    new-instance p1, La/psi;

    .line 57
    .line 58
    const/4 p2, 0x4

    .line 59
    invoke-direct {p1, p0, p2, v0}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, La/dyi;->f:La/n5d0;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a()La/ali;
    .locals 4

    .line 1
    new-instance v0, La/ali;

    .line 2
    .line 3
    iget-object v1, p0, La/dyi;->a:La/g8i;

    .line 4
    .line 5
    invoke-virtual {v1}, La/g8i;->o8()La/btt0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/dyi;->b:La/n5d0;

    .line 13
    .line 14
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, La/yzi;

    .line 19
    .line 20
    invoke-virtual {v1}, La/g8i;->J8()La/knf0;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, La/g8i;->j9()La/gii0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v2, p0, v3, v1}, La/ali;-><init>(La/btt0;La/yzi;La/knf0;La/gii0;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

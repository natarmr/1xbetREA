.class public final La/iyi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g8i;

.field public final b:La/tnc0;

.field public final c:La/wsf0;

.field public final d:La/s470;

.field public final e:La/rkc0;

.field public final f:La/fhj;

.field public final g:La/iyi;

.field public final h:La/n5d0;

.field public final i:La/n5d0;

.field public final j:La/psi;


# direct methods
.method public constructor <init>(La/y2m0;La/g8i;La/wsf0;La/s470;La/rkc0;La/tnc0;La/fhj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, La/iyi;->g:La/iyi;

    .line 5
    .line 6
    iput-object p2, p0, La/iyi;->a:La/g8i;

    .line 7
    .line 8
    iput-object p6, p0, La/iyi;->b:La/tnc0;

    .line 9
    .line 10
    iput-object p3, p0, La/iyi;->c:La/wsf0;

    .line 11
    .line 12
    iput-object p4, p0, La/iyi;->d:La/s470;

    .line 13
    .line 14
    iput-object p5, p0, La/iyi;->e:La/rkc0;

    .line 15
    .line 16
    iput-object p7, p0, La/iyi;->f:La/fhj;

    .line 17
    .line 18
    new-instance p1, La/psi;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    const/16 p3, 0x1d

    .line 22
    .line 23
    invoke-direct {p1, p0, p2, p3}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/iyi;->h:La/n5d0;

    .line 31
    .line 32
    new-instance p1, La/psi;

    .line 33
    .line 34
    const/4 p2, 0x2

    .line 35
    invoke-direct {p1, p0, p2, p3}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, La/iyi;->i:La/n5d0;

    .line 43
    .line 44
    new-instance p1, La/psi;

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    invoke-direct {p1, p0, p2, p3}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, La/iyi;->j:La/psi;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a()La/h0q0;
    .locals 5

    .line 1
    new-instance v0, La/h0q0;

    .line 2
    .line 3
    iget-object v1, p0, La/iyi;->i:La/n5d0;

    .line 4
    .line 5
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, La/qps0;

    .line 10
    .line 11
    new-instance v2, La/g090;

    .line 12
    .line 13
    iget-object p0, p0, La/iyi;->a:La/g8i;

    .line 14
    .line 15
    invoke-virtual {p0}, La/g8i;->j9()La/gii0;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/16 v4, 0x1b

    .line 23
    .line 24
    invoke-direct {v2, v3, v4}, La/g090;-><init>(La/gii0;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/g8i;->o8()La/btt0;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/g8i;->J8()La/knf0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v1, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v2, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v3, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object p0, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 54
    .line 55
    return-object v0
.end method

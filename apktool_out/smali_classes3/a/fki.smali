.class public final La/fki;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g8i;

.field public final b:La/tnc0;

.field public final c:La/wsf0;

.field public final d:La/rkc0;

.field public final e:La/fhj;

.field public final f:La/fki;

.field public final g:La/n5d0;

.field public final h:La/n5d0;

.field public final i:La/n5d0;


# direct methods
.method public constructor <init>(La/uuz;La/g8i;La/wsf0;La/rkc0;La/tnc0;La/fhj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, La/fki;->f:La/fki;

    .line 5
    .line 6
    iput-object p2, p0, La/fki;->a:La/g8i;

    .line 7
    .line 8
    iput-object p5, p0, La/fki;->b:La/tnc0;

    .line 9
    .line 10
    iput-object p3, p0, La/fki;->c:La/wsf0;

    .line 11
    .line 12
    iput-object p4, p0, La/fki;->d:La/rkc0;

    .line 13
    .line 14
    iput-object p6, p0, La/fki;->e:La/fhj;

    .line 15
    .line 16
    new-instance p1, La/rii;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    const/16 p3, 0x12

    .line 20
    .line 21
    invoke-direct {p1, p0, p2, p3}, La/rii;-><init>(Ljava/lang/Object;IB)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/fki;->g:La/n5d0;

    .line 29
    .line 30
    new-instance p1, La/rii;

    .line 31
    .line 32
    const/4 p2, 0x2

    .line 33
    invoke-direct {p1, p0, p2, p3}, La/rii;-><init>(Ljava/lang/Object;IB)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, La/fki;->h:La/n5d0;

    .line 41
    .line 42
    new-instance p1, La/rii;

    .line 43
    .line 44
    const/4 p2, 0x1

    .line 45
    invoke-direct {p1, p0, p2, p3}, La/rii;-><init>(Ljava/lang/Object;IB)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, La/fki;->i:La/n5d0;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a()La/dgu;
    .locals 5

    .line 1
    new-instance v0, La/dgu;

    .line 2
    .line 3
    new-instance v1, La/j910;

    .line 4
    .line 5
    iget-object v2, p0, La/fki;->a:La/g8i;

    .line 6
    .line 7
    invoke-virtual {v2}, La/g8i;->j9()La/gii0;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v1, v3, v4}, La/j910;-><init>(La/gii0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/fki;->h:La/n5d0;

    .line 19
    .line 20
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/i910;

    .line 25
    .line 26
    invoke-virtual {v2}, La/g8i;->o8()La/btt0;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, La/g8i;->J8()La/knf0;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, p0, v3, v2}, La/dgu;-><init>(La/j910;La/i910;La/btt0;La/knf0;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

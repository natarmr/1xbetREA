.class public final La/j5q0;
.super La/f3k;
.source "SourceFile"

# interfaces
.implements La/vld;
.implements La/v4q0;


# instance fields
.field public q:La/hcp0;

.field public r:La/bu;

.field public s:La/f7q0;

.field public t:La/sme;

.field public u:La/c4m0;

.field public final v:La/zbk;

.field public w:La/jge0;


# direct methods
.method public constructor <init>(La/hcp0;La/bu;La/f7q0;La/sme;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/f3k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/j5q0;->q:La/hcp0;

    .line 5
    .line 6
    iput-object p2, p0, La/j5q0;->r:La/bu;

    .line 7
    .line 8
    iput-object p3, p0, La/j5q0;->s:La/f7q0;

    .line 9
    .line 10
    iput-object p4, p0, La/j5q0;->t:La/sme;

    .line 11
    .line 12
    new-instance p1, La/h3q0;

    .line 13
    .line 14
    const/4 p2, 0x3

    .line 15
    invoke-direct {p1, p0, p2}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/j5q0;->v:La/zbk;

    .line 23
    .line 24
    sget-object p1, La/jge0;->e:La/jge0;

    .line 25
    .line 26
    iput-object p1, p0, La/j5q0;->w:La/jge0;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final G()La/u4q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/j5q0;->v:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/u4q0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final L0(La/j6z;)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/j5q0;->y0(La/j6z;)La/jge0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/jge0;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public final R0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/j5q0;->q:La/hcp0;

    .line 2
    .line 3
    sget-object v1, La/iwq0;->c:La/iwq0;

    .line 4
    .line 5
    iput-object v1, v0, La/hcp0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p0, v0, La/hcp0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public final S0()V
    .locals 1

    .line 1
    iget-object p0, p0, La/j5q0;->q:La/hcp0;

    .line 2
    .line 3
    sget-object v0, La/iwq0;->b:La/iwq0;

    .line 4
    .line 5
    iput-object v0, p0, La/hcp0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, La/hcp0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final y0(La/j6z;)La/jge0;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/j5q0;->w:La/jge0;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, La/j5q0;->t:La/sme;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, La/sme;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, La/jge0;

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, La/j5q0;->w:La/jge0;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    iput-object p1, p0, La/j5q0;->w:La/jge0;

    .line 22
    .line 23
    return-object p1
.end method

.class public final La/nna0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/t33;

.field public j:La/t33;

.field public k:La/t33;

.field public l:La/t33;

.field public m:La/t33;

.field public n:La/eba;

.field public synthetic o:Ljava/lang/Object;

.field public p:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iput-object p1, p0, La/nna0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/nna0;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/nna0;->p:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v7, p0

    .line 18
    invoke-static/range {v0 .. v7}, La/qna0;->f(La/t33;La/t33;La/t33;La/t33;La/t33;La/t33;La/eba;La/zje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

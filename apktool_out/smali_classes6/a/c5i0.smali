.class public final La/c5i0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/inn0;

.field public j:La/p5q0;

.field public k:La/lie0;

.field public l:J

.field public synthetic m:Ljava/lang/Object;

.field public n:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, La/c5i0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/c5i0;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/c5i0;->n:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, p1, p1, v0, p0}, La/azw;->c0(La/inn0;La/p5q0;La/woa0;ILa/zw5;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

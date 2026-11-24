.class public final La/vdl;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Lkotlin/jvm/functions/Function2;

.field public j:La/inn0;

.field public k:La/lie0;

.field public l:La/hac;

.field public m:La/dpa0;

.field public n:F

.field public synthetic o:Ljava/lang/Object;

.field public p:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, La/vdl;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/vdl;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/vdl;->p:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-static {p1, v0, v1, p1, p0}, La/bel;->c(La/inn0;JLkotlin/jvm/functions/Function2;La/zw5;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

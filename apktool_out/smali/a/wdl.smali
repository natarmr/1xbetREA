.class public final La/wdl;
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
    .locals 6

    .line 1
    iput-object p1, p0, La/wdl;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/wdl;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/wdl;->p:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v0, 0x0

    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    move-object v5, p0

    .line 16
    invoke-static/range {v0 .. v5}, La/bel;->d(La/inn0;JILa/i3l;La/zw5;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

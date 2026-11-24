.class public final La/s2h0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/qpg0;

.field public j:Ljava/lang/AutoCloseable;

.field public k:La/xpg0;

.field public l:Ljava/util/Set;

.field public m:Ljava/util/Set;

.field public n:I

.field public o:I

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public r:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, La/s2h0;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/s2h0;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/s2h0;->r:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p0}, La/c9x;->F(La/qpg0;Ljava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

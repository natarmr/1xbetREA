.class public final La/wzj;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public j:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, La/wzj;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/wzj;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/wzj;->j:I

    .line 9
    .line 10
    invoke-static {p0}, La/qcc;->G(La/zje;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, La/wne;->a:La/wne;

    .line 14
    .line 15
    return-object p0
.end method

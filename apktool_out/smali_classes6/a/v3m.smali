.class public final La/v3m;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/t33;

.field public j:F

.field public synthetic k:Ljava/lang/Object;

.field public l:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, La/v3m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/v3m;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/v3m;->l:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, v0, p0}, La/w3m;->d(La/t33;FLa/zje;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, La/wne;->a:La/wne;

    .line 16
    .line 17
    return-object p0
.end method

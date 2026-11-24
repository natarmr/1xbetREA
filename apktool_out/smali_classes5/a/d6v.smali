.class public final La/d6v;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/g2v;

.field public k:I


# direct methods
.method public constructor <init>(La/g2v;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/d6v;->j:La/g2v;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/zje;-><init>(La/yje;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, La/d6v;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/d6v;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/d6v;->k:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/d6v;->j:La/g2v;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, La/g2v;->j(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;ILa/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, La/wne;->a:La/wne;

    .line 19
    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance p1, La/j0g0;

    .line 24
    .line 25
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object p1
.end method

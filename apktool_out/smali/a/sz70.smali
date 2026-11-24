.class public final La/sz70;
.super La/mjq;
.source "SourceFile"


# static fields
.field public static final d:La/sz70;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/sz70;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, La/mjq;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/sz70;->d:La/sz70;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(La/hu5;La/bv3;La/t9k0;La/pwi;La/s080;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, La/hu5;->g(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, La/yfe0;

    .line 7
    .line 8
    iget-object p1, p4, La/pwi;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, La/hz40;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, p0}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, La/i390;

    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    iget-object p2, p4, La/pwi;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, Ljava/util/ArrayList;

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    const/4 p3, 0x1

    .line 29
    invoke-static {p3, p2}, La/hne;->k(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, La/xz40;

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    iput-object p2, p4, La/pwi;->g:Ljava/lang/Object;

    .line 38
    .line 39
    :cond_0
    invoke-virtual {p1, p0}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

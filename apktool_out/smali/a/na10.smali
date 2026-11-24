.class public final La/na10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/l7m0;


# instance fields
.field public final a:La/odd;

.field public final b:La/pz40;

.field public final c:La/pz40;

.field public final d:La/zbk;

.field public final e:La/zbk;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/odd;

    .line 5
    .line 6
    invoke-direct {v0}, La/odd;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/na10;->a:La/odd;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/na10;->b:La/pz40;

    .line 17
    .line 18
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/na10;->c:La/pz40;

    .line 23
    .line 24
    new-instance v0, La/ma10;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-direct {v0, p0, v1}, La/ma10;-><init>(La/na10;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 31
    .line 32
    .line 33
    new-instance v0, La/ma10;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {v0, p0, v1}, La/ma10;-><init>(La/na10;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/na10;->d:La/zbk;

    .line 44
    .line 45
    new-instance v0, La/ma10;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {v0, p0, v1}, La/ma10;-><init>(La/na10;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 52
    .line 53
    .line 54
    new-instance v0, La/ma10;

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    invoke-direct {v0, p0, v1}, La/ma10;-><init>(La/na10;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/na10;->e:La/zbk;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final b()La/fa10;
    .locals 0

    .line 1
    iget-object p0, p0, La/na10;->b:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/fa10;

    .line 10
    .line 11
    return-object p0
.end method

.method public final bridge synthetic getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/na10;->b()La/fa10;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

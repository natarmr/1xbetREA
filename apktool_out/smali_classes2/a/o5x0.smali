.class public final La/o5x0;
.super La/atm0;
.source "SourceFile"


# instance fields
.field public final a:La/vkr0;


# direct methods
.method public constructor <init>(La/vkr0;La/gfk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, La/o5x0;->u(La/vkr0;La/gfk0;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/o5x0;->a:La/vkr0;

    .line 8
    .line 9
    return-void
.end method

.method public static u(La/vkr0;La/gfk0;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/vkr0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/hbb;

    .line 4
    .line 5
    sget-object v0, La/hbb;->j:La/hbb;

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    sget-object v0, La/hbb;->k:La/hbb;

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {p1}, La/gfk0;->n(La/gfk0;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final s()La/fpw0;
    .locals 2

    .line 1
    new-instance v0, La/m5x0;

    .line 2
    .line 3
    iget-object p0, p0, La/o5x0;->a:La/vkr0;

    .line 4
    .line 5
    iget-object v1, p0, La/vkr0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, La/vkr0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/lpw0;

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, La/m5x0;-><init>(Ljava/lang/String;La/lpw0;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final t()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, La/o5x0;->a:La/vkr0;

    .line 2
    .line 3
    iget-object p0, p0, La/vkr0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    return-object p0
.end method

.method public final v()La/icw0;
    .locals 2

    .line 1
    iget-object p0, p0, La/o5x0;->a:La/vkr0;

    .line 2
    .line 3
    iget-object v0, p0, La/vkr0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/lpw0;

    .line 6
    .line 7
    iget-object p0, p0, La/vkr0;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Integer;

    .line 10
    .line 11
    sget-object v1, La/lpw0;->e:La/lpw0;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    new-array p0, p0, [B

    .line 21
    .line 22
    invoke-static {p0}, La/icw0;->a([B)La/icw0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object v1, La/lpw0;->c:La/lpw0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {p0}, La/q6x0;->b(I)La/icw0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_1
    sget-object v1, La/lpw0;->d:La/lpw0;

    .line 45
    .line 46
    if-eq v0, v1, :cond_3

    .line 47
    .line 48
    sget-object v1, La/lpw0;->f:La/lpw0;

    .line 49
    .line 50
    if-ne v0, v1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const-string p0, "Unknown output prefix type"

    .line 54
    .line 55
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-static {p0}, La/q6x0;->a(I)La/icw0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

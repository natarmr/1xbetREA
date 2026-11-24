.class final La/i7k0;
.super La/um40;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/um40;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "La/i7k0;",
        "La/um40;",
        "La/l7k0;",
        "animation"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:La/nul0;

.field public final c:La/zx7;


# direct methods
.method public constructor <init>(La/nul0;La/zx7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/i7k0;->b:La/nul0;

    .line 5
    .line 6
    iput-object p2, p0, La/i7k0;->c:La/zx7;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, La/i7k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/i7k0;

    .line 6
    .line 7
    iget-object v0, p1, La/i7k0;->b:La/nul0;

    .line 8
    .line 9
    iget-object v1, p0, La/i7k0;->b:La/nul0;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, La/nul0;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, La/i7k0;->c:La/zx7;

    .line 18
    .line 19
    iget-object p0, p0, La/i7k0;->c:La/zx7;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, La/zx7;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final f()La/lm40;
    .locals 2

    .line 1
    new-instance v0, La/l7k0;

    .line 2
    .line 3
    iget-object v1, p0, La/i7k0;->b:La/nul0;

    .line 4
    .line 5
    iget-object p0, p0, La/i7k0;->c:La/zx7;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, La/l7k0;-><init>(La/nul0;La/zx7;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 1

    .line 1
    check-cast p1, La/l7k0;

    .line 2
    .line 3
    iget-object v0, p0, La/i7k0;->b:La/nul0;

    .line 4
    .line 5
    iput-object v0, p1, La/l7k0;->p:La/nul0;

    .line 6
    .line 7
    iget-object p0, p0, La/i7k0;->c:La/zx7;

    .line 8
    .line 9
    iput-object p0, p1, La/l7k0;->q:La/zx7;

    .line 10
    .line 11
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/i7k0;->b:La/nul0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/nul0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, La/i7k0;->c:La/zx7;

    .line 10
    .line 11
    invoke-virtual {p0}, La/zx7;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    mul-int/lit8 p0, p0, 0x1f

    .line 17
    .line 18
    return p0
.end method

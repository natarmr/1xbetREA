.class final La/e53;
.super La/um40;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "La/um40;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00030\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "La/e53;",
        "S",
        "La/um40;",
        "La/h53;",
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
.field public final b:La/vls0;

.field public final c:La/pz40;

.field public final d:La/i53;


# direct methods
.method public constructor <init>(La/vls0;La/pz40;La/i53;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/e53;->b:La/vls0;

    .line 5
    .line 6
    iput-object p2, p0, La/e53;->c:La/pz40;

    .line 7
    .line 8
    iput-object p3, p0, La/e53;->d:La/i53;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, La/e53;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/e53;

    .line 6
    .line 7
    iget-object v0, p1, La/e53;->b:La/vls0;

    .line 8
    .line 9
    iget-object v1, p0, La/e53;->b:La/vls0;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, La/e53;->c:La/pz40;

    .line 18
    .line 19
    iget-object p0, p0, La/e53;->c:La/pz40;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    .locals 3

    .line 1
    new-instance v0, La/h53;

    .line 2
    .line 3
    iget-object v1, p0, La/e53;->c:La/pz40;

    .line 4
    .line 5
    iget-object v2, p0, La/e53;->d:La/i53;

    .line 6
    .line 7
    iget-object p0, p0, La/e53;->b:La/vls0;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2}, La/h53;-><init>(La/vls0;La/pz40;La/i53;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 1

    .line 1
    check-cast p1, La/h53;

    .line 2
    .line 3
    iget-object v0, p0, La/e53;->b:La/vls0;

    .line 4
    .line 5
    iput-object v0, p1, La/h53;->p:La/vls0;

    .line 6
    .line 7
    iget-object v0, p0, La/e53;->c:La/pz40;

    .line 8
    .line 9
    iput-object v0, p1, La/h53;->q:La/pz40;

    .line 10
    .line 11
    iget-object p0, p0, La/e53;->d:La/i53;

    .line 12
    .line 13
    iput-object p0, p1, La/h53;->r:La/i53;

    .line 14
    .line 15
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, La/e53;->d:La/i53;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La/e53;->b:La/vls0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object p0, p0, La/e53;->c:La/pz40;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

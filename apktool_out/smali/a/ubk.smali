.class final La/ubk;
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
        "La/ubk;",
        "La/um40;",
        "La/wbk;",
        "foundation-layout"
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
.field public final b:La/vhv0;


# direct methods
.method public constructor <init>(La/vhv0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ubk;->b:La/vhv0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/ubk;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/ubk;

    .line 11
    .line 12
    iget-object p1, p1, La/ubk;->b:La/vhv0;

    .line 13
    .line 14
    iget-object p0, p0, La/ubk;->b:La/vhv0;

    .line 15
    .line 16
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    return v0

    .line 23
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final f()La/lm40;
    .locals 2

    .line 1
    new-instance v0, La/wbk;

    .line 2
    .line 3
    sget-object v1, La/y860;->k:La/itt0;

    .line 4
    .line 5
    invoke-direct {v0}, La/sfx;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/ubk;->b:La/vhv0;

    .line 9
    .line 10
    iput-object p0, v0, La/wbk;->q:La/vhv0;

    .line 11
    .line 12
    iput-object v1, v0, La/wbk;->r:La/itt0;

    .line 13
    .line 14
    sget-object p0, La/i120;->m:La/niq;

    .line 15
    .line 16
    iput-object p0, v0, La/wbk;->s:La/vhv0;

    .line 17
    .line 18
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 2

    .line 1
    check-cast p1, La/wbk;

    .line 2
    .line 3
    sget-object v0, La/y860;->k:La/itt0;

    .line 4
    .line 5
    iget-object v1, p1, La/wbk;->q:La/vhv0;

    .line 6
    .line 7
    iget-object p0, p0, La/ubk;->b:La/vhv0;

    .line 8
    .line 9
    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p1, La/wbk;->r:La/itt0;

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    :goto_0
    iput-object p0, p1, La/wbk;->q:La/vhv0;

    .line 22
    .line 23
    iput-object v0, p1, La/wbk;->r:La/itt0;

    .line 24
    .line 25
    iget-object v0, p1, La/sfx;->o:La/vhv0;

    .line 26
    .line 27
    new-instance v1, La/ujo;

    .line 28
    .line 29
    invoke-direct {v1, p0, v0}, La/ujo;-><init>(La/vhv0;La/vhv0;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p1, La/wbk;->s:La/vhv0;

    .line 33
    .line 34
    invoke-static {p1}, La/n7x;->I(La/v6z;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object p0, p0, La/ubk;->b:La/vhv0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    sget-object v0, La/y860;->k:La/itt0;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/2addr v0, p0

    .line 16
    return v0
.end method

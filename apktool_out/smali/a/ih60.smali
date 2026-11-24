.class final La/ih60;
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
        "La/ih60;",
        "La/um40;",
        "La/jh60;",
        "ui"
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
.field public final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ih60;->b:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/ih60;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/ih60;

    .line 10
    .line 11
    iget-object p0, p0, La/ih60;->b:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object p1, p1, La/ih60;->b:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    if-eq p0, p1, :cond_2

    .line 16
    .line 17
    :goto_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public final f()La/lm40;
    .locals 1

    .line 1
    new-instance v0, La/jh60;

    .line 2
    .line 3
    invoke-direct {v0}, La/lm40;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/ih60;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput-object p0, v0, La/jh60;->o:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 0

    .line 1
    check-cast p1, La/jh60;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/ih60;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput-object p0, p1, La/jh60;->o:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iget-object p0, p1, La/jh60;->p:La/scq0;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, La/scq0;->b()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p0, p1, La/jh60;->o:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    invoke-static {p1, p0}, La/x4d0;->f0(La/lm40;Lkotlin/jvm/functions/Function1;)La/scq0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iput-object p0, p1, La/jh60;->p:La/scq0;

    .line 24
    .line 25
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    const/16 v3, 0x1f

    .line 8
    .line 9
    mul-int/2addr v2, v3

    .line 10
    invoke-static {v2, v3, v0, v1}, La/rw2;->b(IIJ)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, La/ih60;->b:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/2addr p0, v0

    .line 21
    return p0
.end method

.class public final La/z2w0;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "La/z2w0;",
        "La/um40;",
        "La/c3w0;",
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
.field public final b:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/z2w0;->b:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/z2w0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/z2w0;

    .line 12
    .line 13
    iget p0, p0, La/z2w0;->b:F

    .line 14
    .line 15
    iget p1, p1, La/z2w0;->b:F

    .line 16
    .line 17
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final f()La/lm40;
    .locals 1

    .line 1
    new-instance v0, La/c3w0;

    .line 2
    .line 3
    invoke-direct {v0}, La/lm40;-><init>()V

    .line 4
    .line 5
    .line 6
    iget p0, p0, La/z2w0;->b:F

    .line 7
    .line 8
    iput p0, v0, La/c3w0;->o:F

    .line 9
    .line 10
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 0

    .line 1
    check-cast p1, La/c3w0;

    .line 2
    .line 3
    iget p0, p0, La/z2w0;->b:F

    .line 4
    .line 5
    iput p0, p1, La/c3w0;->o:F

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, La/z2w0;->b:F

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "ZIndexElement(zIndex="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    iget p0, p0, La/z2w0;->b:F

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, La/rw2;->j(FLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

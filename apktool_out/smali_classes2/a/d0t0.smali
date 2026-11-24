.class public final La/d0t0;
.super La/p3k;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d0t0;->b:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic f0(La/cty;)La/wsy;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final bridge synthetic k0(Z)La/tft0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/d0t0;->n0(Z)La/kzj0;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final bridge synthetic l0(La/cty;)La/tft0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final bridge synthetic m0(La/ays0;)La/tft0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/d0t0;->o0(La/ays0;)La/kzj0;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final n0(Z)La/kzj0;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    iget-object p0, p0, La/d0t0;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final o0(La/ays0;)La/kzj0;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x3

    .line 4
    new-array p0, p0, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string p1, "newAttributes"

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    aput-object p1, p0, v0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    const-string v0, "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"

    .line 13
    .line 14
    aput-object v0, p0, p1

    .line 15
    .line 16
    const-string p1, "replaceAttributes"

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    aput-object p1, p0, v0

    .line 20
    .line 21
    const-string p1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 22
    .line 23
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    iget-object p0, p0, La/d0t0;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public final p0()La/kzj0;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    iget-object p0, p0, La/d0t0;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final bridge synthetic q0(La/cty;)La/kzj0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final r0(La/kzj0;)La/p3k;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    iget-object p0, p0, La/d0t0;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/d0t0;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

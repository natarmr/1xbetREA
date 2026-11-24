.class public final La/okq;
.super La/kkq;
.source "SourceFile"

# interfaces
.implements La/g0t0;


# instance fields
.field public final d:La/kkq;

.field public final e:La/wsy;


# direct methods
.method public constructor <init>(La/kkq;La/wsy;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/kkq;->b:La/kzj0;

    .line 5
    .line 6
    iget-object v1, p1, La/kkq;->c:La/kzj0;

    .line 7
    .line 8
    invoke-direct {p0, v0, v1}, La/kkq;-><init>(La/kzj0;La/kzj0;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/okq;->d:La/kkq;

    .line 12
    .line 13
    iput-object p2, p0, La/okq;->e:La/wsy;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final f0(La/cty;)La/wsy;
    .locals 1

    .line 1
    new-instance p1, La/okq;

    .line 2
    .line 3
    iget-object v0, p0, La/okq;->e:La/wsy;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/okq;->d:La/kkq;

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, La/okq;-><init>(La/kkq;La/wsy;)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method

.method public final getOrigin()La/tft0;
    .locals 0

    .line 1
    iget-object p0, p0, La/okq;->d:La/kkq;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k0(Z)La/tft0;
    .locals 1

    .line 1
    iget-object v0, p0, La/okq;->d:La/kkq;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/tft0;->k0(Z)La/tft0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, La/okq;->e:La/wsy;

    .line 8
    .line 9
    invoke-virtual {p0}, La/wsy;->j0()La/tft0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, La/tft0;->k0(Z)La/tft0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {v0, p0}, La/xsm0;->z(La/tft0;La/wsy;)La/tft0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final l0(La/cty;)La/tft0;
    .locals 1

    .line 1
    new-instance p1, La/okq;

    .line 2
    .line 3
    iget-object v0, p0, La/okq;->e:La/wsy;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/okq;->d:La/kkq;

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, La/okq;-><init>(La/kkq;La/wsy;)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method

.method public final m0(La/ays0;)La/tft0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/okq;->d:La/kkq;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, La/tft0;->m0(La/ays0;)La/tft0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, La/okq;->e:La/wsy;

    .line 11
    .line 12
    invoke-static {p1, p0}, La/xsm0;->z(La/tft0;La/wsy;)La/tft0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final n0()La/kzj0;
    .locals 0

    .line 1
    iget-object p0, p0, La/okq;->d:La/kkq;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kkq;->n0()La/kzj0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final o0(La/iek;La/iek;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p2, La/iek;->a:La/lek;

    .line 2
    .line 3
    invoke-virtual {v0}, La/lek;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, La/okq;->e:La/wsy;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, La/iek;->P(La/wsy;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, La/okq;->d:La/kkq;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, La/kkq;->o0(La/iek;La/iek;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final p()La/wsy;
    .locals 0

    .line 1
    iget-object p0, p0, La/okq;->e:La/wsy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "[@EnhancedForWarnings("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/okq;->e:La/wsy;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ")] "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/okq;->d:La/kkq;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

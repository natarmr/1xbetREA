.class public final La/u6z;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;


# instance fields
.field public o:La/xdr;


# virtual methods
.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 1

    .line 1
    iget-object p0, p0, La/u6z;->o:La/xdr;

    .line 2
    .line 3
    new-instance v0, La/p4e;

    .line 4
    .line 5
    invoke-direct {v0, p3, p4}, La/p4e;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1, p2, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/uj30;

    .line 13
    .line 14
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, La/u6z;->o:La/xdr;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "LayoutModifierImpl(measureBlock="

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ")"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

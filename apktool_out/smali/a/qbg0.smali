.class public final synthetic La/qbg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qbl;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ubg0;


# direct methods
.method public synthetic constructor <init>(La/ubg0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qbg0;->a:B

    iput-object p1, p0, La/qbg0;->b:La/ubg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(D)D
    .locals 8

    .line 1
    iget-byte v0, p0, La/qbg0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qbg0;->b:La/ubg0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/ubg0;->n:La/qbl;

    .line 9
    .line 10
    iget v1, p0, La/ubg0;->e:F

    .line 11
    .line 12
    float-to-double v4, v1

    .line 13
    iget p0, p0, La/ubg0;->f:F

    .line 14
    .line 15
    float-to-double v6, p0

    .line 16
    move-wide v2, p1

    .line 17
    invoke-static/range {v2 .. v7}, La/l1e0;->b(DDD)D

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    invoke-interface {v0, p0, p1}, La/qbl;->e(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    return-wide p0

    .line 26
    :pswitch_0
    move-wide v2, p1

    .line 27
    iget-object p1, p0, La/ubg0;->k:La/qbl;

    .line 28
    .line 29
    invoke-interface {p1, v2, v3}, La/qbl;->e(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    iget p1, p0, La/ubg0;->e:F

    .line 34
    .line 35
    float-to-double v2, p1

    .line 36
    iget p0, p0, La/ubg0;->f:F

    .line 37
    .line 38
    float-to-double v4, p0

    .line 39
    invoke-static/range {v0 .. v5}, La/l1e0;->b(DDD)D

    .line 40
    .line 41
    .line 42
    move-result-wide p0

    .line 43
    return-wide p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

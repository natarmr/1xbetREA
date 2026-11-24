.class public final La/zd40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fpt0;
.implements La/h0x;


# instance fields
.field public final a:La/wy40;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/fpt0;->E0:La/u15;

    .line 9
    .line 10
    sget-object v2, La/r3a;->a:La/r3a;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, La/xto0;->z0:La/u15;

    .line 16
    .line 17
    const-string v2, "MeteringRepeating"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/fpt0;->N0:La/u15;

    .line 23
    .line 24
    sget-object v2, La/hpt0;->f:La/hpt0;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/zd40;->a:La/wy40;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a()La/drd;
    .locals 0

    .line 1
    iget-object p0, p0, La/zd40;->a:La/wy40;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()I
    .locals 0

    .line 1
    const/16 p0, 0x22

    .line 2
    .line 3
    return p0
.end method

.method public final v()La/hpt0;
    .locals 0

    .line 1
    sget-object p0, La/hpt0;->f:La/hpt0;

    .line 2
    .line 3
    return-object p0
.end method

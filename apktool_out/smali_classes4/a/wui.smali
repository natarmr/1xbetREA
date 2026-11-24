.class public final La/wui;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rti;


# direct methods
.method public constructor <init>(La/rti;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wui;->a:La/rti;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 9

    .line 1
    new-instance v0, La/tam0;

    .line 2
    .line 3
    iget-object p0, p0, La/wui;->a:La/rti;

    .line 4
    .line 5
    iget-object p0, p0, La/rti;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ywq0;

    .line 8
    .line 9
    iget-object v1, p0, La/ywq0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 13
    .line 14
    iget-object v1, p0, La/ywq0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/cad;

    .line 17
    .line 18
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, La/psc;

    .line 21
    .line 22
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/ywq0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, La/ogh;

    .line 32
    .line 33
    invoke-interface {v1}, La/ogh;->b()La/ewu;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, La/ogh;->c()La/zsi0;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, La/ywq0;->d:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v6, v1

    .line 50
    check-cast v6, La/ctf0;

    .line 51
    .line 52
    iget-object v1, p0, La/ywq0;->e:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v7, v1

    .line 55
    check-cast v7, La/oeg0;

    .line 56
    .line 57
    iget-object p0, p0, La/ywq0;->f:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v8, p0

    .line 60
    check-cast v8, La/g2v;

    .line 61
    .line 62
    move-object v1, p1

    .line 63
    invoke-direct/range {v0 .. v8}, La/tam0;-><init>(La/vzg0;Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;La/mne;La/ewu;La/zsi0;La/ctf0;La/oeg0;La/g2v;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

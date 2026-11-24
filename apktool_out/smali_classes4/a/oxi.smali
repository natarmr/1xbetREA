.class public final La/oxi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5r0;


# instance fields
.field public final a:La/viu;

.field public final b:La/vqc;

.field public final c:La/gii0;

.field public final d:La/s5r0;

.field public final e:La/knf0;

.field public final f:La/x2c0;

.field public final g:La/lsn;

.field public final h:La/gst0;

.field public final i:La/iw20;

.field public final j:La/nr00;


# direct methods
.method public constructor <init>(La/lsn;La/nr00;La/iw20;La/vqc;La/s5r0;La/gii0;La/knf0;La/x2c0;La/gst0;La/viu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p10, p0, La/oxi;->a:La/viu;

    .line 5
    .line 6
    iput-object p4, p0, La/oxi;->b:La/vqc;

    .line 7
    .line 8
    iput-object p6, p0, La/oxi;->c:La/gii0;

    .line 9
    .line 10
    iput-object p5, p0, La/oxi;->d:La/s5r0;

    .line 11
    .line 12
    iput-object p7, p0, La/oxi;->e:La/knf0;

    .line 13
    .line 14
    iput-object p8, p0, La/oxi;->f:La/x2c0;

    .line 15
    .line 16
    iput-object p1, p0, La/oxi;->g:La/lsn;

    .line 17
    .line 18
    iput-object p9, p0, La/oxi;->h:La/gst0;

    .line 19
    .line 20
    iput-object p3, p0, La/oxi;->i:La/iw20;

    .line 21
    .line 22
    iput-object p2, p0, La/oxi;->j:La/nr00;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()La/ani0;
    .locals 1

    .line 1
    new-instance v0, La/ani0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/ani0;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final b()La/spc;
    .locals 1

    .line 1
    new-instance v0, La/spc;

    .line 2
    .line 3
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/spc;-><init>(La/h0q0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final c()La/daf;
    .locals 13

    .line 1
    new-instance v0, La/daf;

    .line 2
    .line 3
    new-instance v2, La/azt;

    .line 4
    .line 5
    iget-object v1, p0, La/oxi;->b:La/vqc;

    .line 6
    .line 7
    iget-object v1, v1, La/vqc;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/cih;

    .line 10
    .line 11
    invoke-virtual {v1}, La/cih;->a()La/uzc;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v1, v3}, La/azt;-><init>(La/uzc;B)V

    .line 17
    .line 18
    .line 19
    move v1, v3

    .line 20
    new-instance v3, La/yfu;

    .line 21
    .line 22
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-direct {v3, v4}, La/yfu;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, La/n4u;

    .line 30
    .line 31
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/16 v6, 0x14

    .line 36
    .line 37
    invoke-direct {v4, v5, v6}, La/n4u;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    new-instance v5, La/spc;

    .line 41
    .line 42
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-direct {v5, v6}, La/spc;-><init>(La/h0q0;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    iget-object v7, p0, La/oxi;->g:La/lsn;

    .line 54
    .line 55
    iget-object v7, v7, La/lsn;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v7, La/gbi;

    .line 58
    .line 59
    invoke-virtual {v7}, La/gbi;->k()La/v7i;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    new-instance v8, La/x4v;

    .line 64
    .line 65
    iget-object v9, p0, La/oxi;->h:La/gst0;

    .line 66
    .line 67
    invoke-direct {v8, v9, v1}, La/x4v;-><init>(La/gst0;B)V

    .line 68
    .line 69
    .line 70
    move-object v1, v9

    .line 71
    new-instance v9, La/ocl;

    .line 72
    .line 73
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-direct {v9, v10}, La/ocl;-><init>(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v10, La/t4v;

    .line 81
    .line 82
    const/4 v11, 0x1

    .line 83
    invoke-direct {v10, v1, v11}, La/t4v;-><init>(La/gst0;B)V

    .line 84
    .line 85
    .line 86
    new-instance v11, La/wsc;

    .line 87
    .line 88
    const/4 v12, 0x4

    .line 89
    invoke-direct {v11, v1, v12}, La/wsc;-><init>(La/gst0;B)V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, La/oxi;->i:La/iw20;

    .line 93
    .line 94
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, La/uii;

    .line 97
    .line 98
    invoke-virtual {v1}, La/uii;->r()La/pru;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    iget-object v1, p0, La/oxi;->a:La/viu;

    .line 103
    .line 104
    invoke-direct/range {v0 .. v12}, La/daf;-><init>(La/viu;La/azt;La/yfu;La/n4u;La/spc;La/h0q0;La/v7i;La/x4v;La/ocl;La/t4v;La/wsc;La/pru;)V

    .line 105
    .line 106
    .line 107
    return-object v0
.end method

.method public final d()La/tzi;
    .locals 12

    .line 1
    new-instance v0, La/tzi;

    .line 2
    .line 3
    new-instance v1, La/xsu;

    .line 4
    .line 5
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v1, v2}, La/xsu;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, La/x4v;

    .line 13
    .line 14
    iget-object v3, p0, La/oxi;->h:La/gst0;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-direct {v2, v3, v4}, La/x4v;-><init>(La/gst0;B)V

    .line 18
    .line 19
    .line 20
    iget-object v5, p0, La/oxi;->i:La/iw20;

    .line 21
    .line 22
    iget-object v5, v5, La/iw20;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, La/uii;

    .line 25
    .line 26
    invoke-virtual {v5}, La/uii;->r()La/pru;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    move v6, v4

    .line 31
    new-instance v4, La/azt;

    .line 32
    .line 33
    iget-object v7, p0, La/oxi;->b:La/vqc;

    .line 34
    .line 35
    iget-object v7, v7, La/vqc;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, La/cih;

    .line 38
    .line 39
    invoke-virtual {v7}, La/cih;->a()La/uzc;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-direct {v4, v7, v6}, La/azt;-><init>(La/uzc;B)V

    .line 44
    .line 45
    .line 46
    new-instance v6, La/yfu;

    .line 47
    .line 48
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-direct {v6, v7}, La/yfu;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v7, La/n4u;

    .line 56
    .line 57
    invoke-virtual {p0}, La/oxi;->e()La/h0q0;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    const/16 v9, 0x14

    .line 62
    .line 63
    invoke-direct {v7, v8, v9}, La/n4u;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    iget-object v8, p0, La/oxi;->j:La/nr00;

    .line 67
    .line 68
    iget-object v8, v8, La/nr00;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v8, La/ru;

    .line 71
    .line 72
    invoke-virtual {v8}, La/ru;->h()La/rdd;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    new-instance v9, La/t4v;

    .line 77
    .line 78
    const/4 v10, 0x1

    .line 79
    invoke-direct {v9, v3, v10}, La/t4v;-><init>(La/gst0;B)V

    .line 80
    .line 81
    .line 82
    new-instance v10, La/wsc;

    .line 83
    .line 84
    const/4 v11, 0x4

    .line 85
    invoke-direct {v10, v3, v11}, La/wsc;-><init>(La/gst0;B)V

    .line 86
    .line 87
    .line 88
    const/4 v11, 0x7

    .line 89
    iget-object p0, p0, La/oxi;->a:La/viu;

    .line 90
    .line 91
    move-object v3, v5

    .line 92
    move-object v5, p0

    .line 93
    invoke-direct/range {v0 .. v11}, La/tzi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    return-object v0
.end method

.method public final e()La/h0q0;
    .locals 4

    .line 1
    new-instance v0, La/h0q0;

    .line 2
    .line 3
    new-instance v1, La/w4p0;

    .line 4
    .line 5
    iget-object v2, p0, La/oxi;->c:La/gii0;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-direct {v1, v2, v3}, La/w4p0;-><init>(La/gii0;B)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, La/oxi;->d:La/s5r0;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, La/oxi;->e:La/knf0;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/oxi;->f:La/x2c0;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object v2, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v3, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p0, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 36
    .line 37
    return-object v0
.end method

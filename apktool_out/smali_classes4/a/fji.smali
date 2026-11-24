.class public final La/fji;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/gji;


# direct methods
.method public constructor <init>(La/gji;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fji;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 13

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/t6y;

    .line 5
    .line 6
    iget-object p0, p0, La/fji;->a:La/gji;

    .line 7
    .line 8
    iget-object p0, p0, La/gji;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/mii0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/mii0;->F()La/jru;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object p0, p0, La/mii0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, La/g8i;

    .line 19
    .line 20
    invoke-virtual {p0}, La/g8i;->f0()La/wsf0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, La/wsf0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, La/g45;

    .line 27
    .line 28
    invoke-virtual {p1}, La/g45;->t()La/m0u;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p0}, La/g8i;->q1()La/m1e;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/g8i;->X6()La/sa10;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {p0}, La/g8i;->v4()La/uyn;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {p0}, La/g8i;->v1()La/mne;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {p0}, La/g8i;->d2()La/duj;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    new-instance v9, La/abu;

    .line 56
    .line 57
    invoke-virtual {p0}, La/g8i;->f0()La/wsf0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance v10, La/ort;

    .line 62
    .line 63
    invoke-virtual {p0}, La/g8i;->Qa()La/gst0;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    const/4 v12, 0x3

    .line 68
    invoke-direct {v10, v11, v12}, La/ort;-><init>(La/gst0;B)V

    .line 69
    .line 70
    .line 71
    const/16 v11, 0x13

    .line 72
    .line 73
    invoke-direct {v9, p1, v10, v11}, La/abu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, La/g8i;->f0()La/wsf0;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    new-instance v11, La/kyg0;

    .line 81
    .line 82
    invoke-virtual {p0}, La/g8i;->L2()La/pbt;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v11, p1}, La/kyg0;-><init>(La/pbt;)V

    .line 90
    .line 91
    .line 92
    new-instance v12, La/n4u;

    .line 93
    .line 94
    invoke-virtual {p0}, La/g8i;->f5()La/ntu;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const/16 p1, 0x12

    .line 99
    .line 100
    invoke-direct {v12, p0, p1}, La/n4u;-><init>(Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-direct/range {v0 .. v12}, La/t6y;-><init>(La/jru;La/m0u;La/m1e;La/sa10;La/uyn;La/i1w0;La/mne;La/duj;La/abu;La/wsf0;La/kyg0;La/n4u;)V

    .line 104
    .line 105
    .line 106
    return-object v0
.end method

.class public final La/sbi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/r5i;


# direct methods
.method public constructor <init>(La/r5i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sbi;->a:La/r5i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 14

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/yya;

    .line 5
    .line 6
    iget-object p0, p0, La/sbi;->a:La/r5i;

    .line 7
    .line 8
    iget-object p0, p0, La/r5i;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/nhf0;

    .line 11
    .line 12
    new-instance v2, La/lef0;

    .line 13
    .line 14
    iget-object p1, p0, La/nhf0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, La/n5d0;

    .line 17
    .line 18
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, La/d0b;

    .line 23
    .line 24
    invoke-direct {v2, p1}, La/lef0;-><init>(La/d0b;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, La/u58;

    .line 28
    .line 29
    iget-object p1, p0, La/nhf0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, La/g8i;

    .line 32
    .line 33
    iget-object v4, p1, La/g8i;->A1:La/n5d0;

    .line 34
    .line 35
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, La/kt2;

    .line 40
    .line 41
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x4

    .line 45
    invoke-direct {v3, v4, v5}, La/u58;-><init>(La/kt2;B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, La/g8i;->w3()La/ix0;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {p1}, La/g8i;->f2()La/rjo;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {p1}, La/g8i;->q1()La/m1e;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, La/g8i;->X6()La/sa10;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    new-instance v8, La/cu;

    .line 68
    .line 69
    invoke-virtual {p1}, La/g8i;->f5()La/ntu;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    new-instance v10, La/kwt;

    .line 74
    .line 75
    iget-object v11, p0, La/nhf0;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v11, La/n5d0;

    .line 78
    .line 79
    invoke-interface {v11}, La/o5d0;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    check-cast v11, La/d0b;

    .line 84
    .line 85
    const/4 v12, 0x1

    .line 86
    invoke-direct {v10, v11, v12}, La/kwt;-><init>(La/d0b;B)V

    .line 87
    .line 88
    .line 89
    new-instance v11, La/k9c;

    .line 90
    .line 91
    invoke-virtual {p1}, La/g8i;->Oa()La/ort;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    invoke-direct {v11, v13}, La/k9c;-><init>(La/ort;)V

    .line 96
    .line 97
    .line 98
    const/16 v13, 0x1a

    .line 99
    .line 100
    invoke-direct {v8, v9, v10, v11, v13}, La/cu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    new-instance v9, La/es;

    .line 104
    .line 105
    new-instance v10, La/kwt;

    .line 106
    .line 107
    iget-object p0, p0, La/nhf0;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p0, La/n5d0;

    .line 110
    .line 111
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, La/d0b;

    .line 116
    .line 117
    invoke-direct {v10, p0, v12}, La/kwt;-><init>(La/d0b;B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, La/g8i;->f5()La/ntu;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance v11, La/k9c;

    .line 125
    .line 126
    invoke-virtual {p1}, La/g8i;->Oa()La/ort;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    invoke-direct {v11, v12}, La/k9c;-><init>(La/ort;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v9, v10, p0, v11}, La/es;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, La/g8i;->d2()La/duj;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    invoke-virtual {p1}, La/g8i;->v1()La/mne;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    invoke-virtual {p1}, La/g8i;->L8()La/ctf0;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-direct/range {v0 .. v12}, La/yya;-><init>(La/i1w0;La/lef0;La/u58;La/ix0;La/rjo;La/m1e;La/sa10;La/cu;La/es;La/duj;La/mne;La/ctf0;)V

    .line 152
    .line 153
    .line 154
    return-object v0
.end method

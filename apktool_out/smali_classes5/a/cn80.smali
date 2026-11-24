.class public abstract La/cn80;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;

.field public static final b:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/i280;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/i280;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/cn80;->a:La/zfn;

    .line 15
    .line 16
    new-instance v0, La/i280;

    .line 17
    .line 18
    const/16 v1, 0xe

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/i280;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, La/zfn;

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 26
    .line 27
    .line 28
    sput-object v1, La/cn80;->b:La/zfn;

    .line 29
    .line 30
    return-void
.end method

.method public static final a(La/g5a0;La/g5a0;La/w6n;Lkotlin/jvm/functions/Function2;La/fet;II)V
    .locals 10

    .line 1
    and-int/lit8 v0, p6, 0x10

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p4}, La/fet;->P()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, La/ukd;->a:La/cl5;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v0, La/zc70;

    .line 14
    .line 15
    const/16 v1, 0x13

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/zc70;-><init>(B)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p4, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 24
    .line 25
    move-object v7, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v7, p3

    .line 28
    :goto_0
    new-instance v0, La/an80;

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    invoke-direct {v0, p0, p2, v8}, La/an80;-><init>(La/g5a0;La/w6n;B)V

    .line 32
    .line 33
    .line 34
    const v1, 0x1addf8d2

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v0, p4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object p0, p0, La/g5a0;->b:La/zfp;

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    const p0, -0x62e62045

    .line 47
    .line 48
    .line 49
    invoke-virtual {p4, p0}, La/fet;->e0(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p4, v8}, La/fet;->r(Z)V

    .line 53
    .line 54
    .line 55
    move-object v2, v9

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const v0, -0x62e62044

    .line 58
    .line 59
    .line 60
    invoke-virtual {p4, v0}, La/fet;->e0(I)V

    .line 61
    .line 62
    .line 63
    new-instance v0, La/bn80;

    .line 64
    .line 65
    invoke-direct {v0, p2, p0, v7, v8}, La/bn80;-><init>(La/w6n;La/zfp;Lkotlin/jvm/functions/Function2;B)V

    .line 66
    .line 67
    .line 68
    const p0, 0x4e66cb86    # 9.6802445E8f

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v0, p4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p4, v8}, La/fet;->r(Z)V

    .line 76
    .line 77
    .line 78
    move-object v2, p0

    .line 79
    :goto_1
    and-int/lit8 p0, p5, 0xe

    .line 80
    .line 81
    or-int/lit8 v5, p0, 0x30

    .line 82
    .line 83
    const/16 v6, 0x8

    .line 84
    .line 85
    sget-object v0, La/jm40;->b:La/jm40;

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    move-object v4, p4

    .line 89
    invoke-static/range {v0 .. v6}, La/z1x;->h(La/mm40;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 90
    .line 91
    .line 92
    new-instance p0, La/an80;

    .line 93
    .line 94
    const/4 v1, 0x1

    .line 95
    invoke-direct {p0, p1, p2, v1}, La/an80;-><init>(La/g5a0;La/w6n;B)V

    .line 96
    .line 97
    .line 98
    const v2, -0x2a5fe705

    .line 99
    .line 100
    .line 101
    invoke-static {v2, p0, p4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    iget-object p1, p1, La/g5a0;->b:La/zfp;

    .line 106
    .line 107
    if-nez p1, :cond_3

    .line 108
    .line 109
    const p1, -0x62d8a3a5

    .line 110
    .line 111
    .line 112
    invoke-virtual {p4, p1}, La/fet;->e0(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p4, v8}, La/fet;->r(Z)V

    .line 116
    .line 117
    .line 118
    :goto_2
    move-object v2, v9

    .line 119
    goto :goto_3

    .line 120
    :cond_3
    const v2, -0x62d8a3a4

    .line 121
    .line 122
    .line 123
    invoke-virtual {p4, v2}, La/fet;->e0(I)V

    .line 124
    .line 125
    .line 126
    new-instance v2, La/bn80;

    .line 127
    .line 128
    invoke-direct {v2, p2, p1, v7, v1}, La/bn80;-><init>(La/w6n;La/zfp;Lkotlin/jvm/functions/Function2;B)V

    .line 129
    .line 130
    .line 131
    const p1, 0x4a3f0eaf    # 3130283.8f

    .line 132
    .line 133
    .line 134
    invoke-static {p1, v2, p4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-virtual {p4, v8}, La/fet;->r(Z)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :goto_3
    const/4 v3, 0x0

    .line 143
    const/16 v6, 0x8

    .line 144
    .line 145
    move-object v1, p0

    .line 146
    move-object v4, p4

    .line 147
    invoke-static/range {v0 .. v6}, La/z1x;->h(La/mm40;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

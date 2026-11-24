.class public final La/v75;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:Z

.field public final b:La/ctf0;

.field public final c:La/pt0;

.field public final d:Z

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:La/n0o0;


# direct methods
.method public constructor <init>(La/s75;La/sff0;ZLa/ctf0;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p3, p0, La/v75;->a:Z

    .line 8
    .line 9
    iput-object p4, p0, La/v75;->b:La/ctf0;

    .line 10
    .line 11
    iget-object p2, p2, La/sff0;->b:La/hl1;

    .line 12
    .line 13
    iget-object p3, p2, La/hl1;->l:La/ot0;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    const/4 p4, 0x1

    .line 20
    if-eqz p3, :cond_4

    .line 21
    .line 22
    if-eq p3, p4, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eq p3, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    if-eq p3, v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    if-ne p3, v0, :cond_0

    .line 32
    .line 33
    sget-object p3, La/pt0;->e:La/pt0;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    throw p0

    .line 41
    :cond_1
    sget-object p3, La/pt0;->d:La/pt0;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    sget-object p3, La/pt0;->c:La/pt0;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    sget-object p3, La/pt0;->b:La/pt0;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    sget-object p3, La/pt0;->a:La/pt0;

    .line 51
    .line 52
    :goto_0
    iput-object p3, p0, La/v75;->c:La/pt0;

    .line 53
    .line 54
    iget-boolean p2, p2, La/hl1;->C:Z

    .line 55
    .line 56
    iput-boolean p2, p0, La/v75;->d:Z

    .line 57
    .line 58
    const/4 p2, 0x0

    .line 59
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    iget-object p1, p1, La/s75;->a:La/m65;

    .line 68
    .line 69
    invoke-static {p1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, La/v75;->e:La/n0o0;

    .line 74
    .line 75
    invoke-virtual {p0}, La/v75;->a()La/fee;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p1, p1, La/fee;->d:La/pz40;

    .line 80
    .line 81
    new-instance v0, La/u75;

    .line 82
    .line 83
    invoke-direct {v0, p0, p2}, La/u75;-><init>(La/v75;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v0}, La/bkb;->G(La/l7m0;Lkotlin/jvm/functions/Function1;)La/n0o0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, La/v75;->f:La/n0o0;

    .line 91
    .line 92
    invoke-virtual {p0}, La/v75;->a()La/fee;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object p1, p1, La/fee;->d:La/pz40;

    .line 97
    .line 98
    new-instance p2, La/u75;

    .line 99
    .line 100
    invoke-direct {p2, p0, p4}, La/u75;-><init>(La/v75;B)V

    .line 101
    .line 102
    .line 103
    new-instance p4, La/yw9;

    .line 104
    .line 105
    const/16 v0, 0x14

    .line 106
    .line 107
    invoke-direct {p4, p1, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    invoke-static {p4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, p0, La/v75;->g:La/n0o0;

    .line 115
    .line 116
    invoke-virtual {p3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, La/fee;

    .line 121
    .line 122
    iget-object p1, p1, La/fee;->d:La/pz40;

    .line 123
    .line 124
    new-instance p2, La/ij4;

    .line 125
    .line 126
    const/16 p4, 0x10

    .line 127
    .line 128
    invoke-direct {p2, p4}, La/ij4;-><init>(B)V

    .line 129
    .line 130
    .line 131
    invoke-static {p1, p2}, La/bkb;->G(La/l7m0;Lkotlin/jvm/functions/Function1;)La/n0o0;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, p0, La/v75;->h:La/n0o0;

    .line 136
    .line 137
    invoke-virtual {p3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, La/fee;

    .line 142
    .line 143
    iget-object p1, p1, La/fee;->d:La/pz40;

    .line 144
    .line 145
    new-instance p2, La/ij4;

    .line 146
    .line 147
    const/16 p3, 0x11

    .line 148
    .line 149
    invoke-direct {p2, p3}, La/ij4;-><init>(B)V

    .line 150
    .line 151
    .line 152
    invoke-static {p1, p2}, La/bkb;->G(La/l7m0;Lkotlin/jvm/functions/Function1;)La/n0o0;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, La/v75;->i:La/n0o0;

    .line 157
    .line 158
    return-void
.end method


# virtual methods
.method public final a()La/fee;
    .locals 0

    .line 1
    iget-object p0, p0, La/v75;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fee;

    .line 8
    .line 9
    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/s75;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/v75;->a()La/fee;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object p1, p1, La/s75;->a:La/m65;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, La/fee;->d(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/t75;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    new-array v1, v0, [Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v2, p0, La/v75;->b:La/ctf0;

    .line 21
    .line 22
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 23
    .line 24
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const v1, 0x7f1301bc

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object p0, p0, La/v75;->g:La/n0o0;

    .line 36
    .line 37
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, La/fee;

    .line 42
    .line 43
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, La/z75;

    .line 48
    .line 49
    invoke-direct {p1, v0, p0}, La/t75;-><init>(Ljava/lang/String;La/z75;)V

    .line 50
    .line 51
    .line 52
    return-object p1
.end method

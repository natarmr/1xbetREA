.class public abstract La/e1x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/bfx0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sget-object v1, La/pqw0;->a:La/bfx0;

    .line 5
    .line 6
    sget-object v2, La/ecx0;->c:La/ecx0;

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    invoke-static {v2, v1, v3, v0}, La/e1x0;->a(La/ecx0;La/bfx0;I[B)La/bfx0;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    sput-object v4, La/e1x0;->a:La/bfx0;

    .line 14
    .line 15
    sget-object v4, La/ecx0;->d:La/ecx0;

    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    invoke-static {v4, v1, v5, v0}, La/e1x0;->a(La/ecx0;La/bfx0;I[B)La/bfx0;

    .line 19
    .line 20
    .line 21
    sget-object v1, La/pqw0;->c:La/bfx0;

    .line 22
    .line 23
    invoke-static {v2, v1, v3, v0}, La/e1x0;->a(La/ecx0;La/bfx0;I[B)La/bfx0;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static a(La/ecx0;La/bfx0;I[B)La/bfx0;
    .locals 4

    .line 1
    invoke-static {}, La/hcx0;->t()La/gcx0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, La/xcx0;->t()La/vcx0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, La/hkw0;->b:La/jkw0;

    .line 13
    .line 14
    check-cast v2, La/xcx0;

    .line 15
    .line 16
    sget-object v3, La/ddx0;->c:La/ddx0;

    .line 17
    .line 18
    invoke-static {v2, v3}, La/xcx0;->v(La/xcx0;La/ddx0;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, La/hkw0;->b:La/jkw0;

    .line 25
    .line 26
    check-cast v2, La/xcx0;

    .line 27
    .line 28
    sget-object v3, La/mdx0;->e:La/mdx0;

    .line 29
    .line 30
    invoke-static {v2, v3}, La/xcx0;->w(La/xcx0;La/mdx0;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    array-length v3, p3

    .line 35
    invoke-static {p3, v2, v3}, La/sjw0;->h([BII)La/vjw0;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 40
    .line 41
    .line 42
    iget-object v2, v1, La/hkw0;->b:La/jkw0;

    .line 43
    .line 44
    check-cast v2, La/xcx0;

    .line 45
    .line 46
    invoke-static {v2, p3}, La/xcx0;->u(La/xcx0;La/sjw0;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, La/hkw0;->c()La/jkw0;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    check-cast p3, La/xcx0;

    .line 54
    .line 55
    invoke-static {}, La/dcx0;->t()La/ccx0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 60
    .line 61
    .line 62
    iget-object v2, v1, La/hkw0;->b:La/jkw0;

    .line 63
    .line 64
    check-cast v2, La/dcx0;

    .line 65
    .line 66
    invoke-static {v2, p1}, La/dcx0;->u(La/dcx0;La/bfx0;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, La/hkw0;->c()La/jkw0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, La/dcx0;

    .line 74
    .line 75
    invoke-static {}, La/mcx0;->y()La/kcx0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 80
    .line 81
    .line 82
    iget-object v2, v1, La/hkw0;->b:La/jkw0;

    .line 83
    .line 84
    check-cast v2, La/mcx0;

    .line 85
    .line 86
    invoke-static {v2, p3}, La/mcx0;->w(La/mcx0;La/xcx0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 90
    .line 91
    .line 92
    iget-object p3, v1, La/hkw0;->b:La/jkw0;

    .line 93
    .line 94
    check-cast p3, La/mcx0;

    .line 95
    .line 96
    invoke-static {p3, p1}, La/mcx0;->u(La/mcx0;La/dcx0;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 100
    .line 101
    .line 102
    iget-object p1, v1, La/hkw0;->b:La/jkw0;

    .line 103
    .line 104
    check-cast p1, La/mcx0;

    .line 105
    .line 106
    invoke-static {p1, p0}, La/mcx0;->v(La/mcx0;La/ecx0;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, La/hkw0;->c()La/jkw0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, La/mcx0;

    .line 114
    .line 115
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 116
    .line 117
    .line 118
    iget-object p1, v0, La/hkw0;->b:La/jkw0;

    .line 119
    .line 120
    check-cast p1, La/hcx0;

    .line 121
    .line 122
    invoke-static {p1, p0}, La/hcx0;->v(La/hcx0;La/mcx0;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, La/hkw0;->c()La/jkw0;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/hcx0;

    .line 130
    .line 131
    invoke-static {}, La/bfx0;->t()La/zex0;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    sget-object p3, La/rzw0;->a:La/h7x0;

    .line 136
    .line 137
    const-string p3, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    .line 138
    .line 139
    invoke-virtual {p1, p3}, La/zex0;->g(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, p2}, La/zex0;->h(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, La/ojw0;->a()La/vjw0;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p1, p0}, La/zex0;->f(La/sjw0;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, La/hkw0;->c()La/jkw0;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, La/bfx0;

    .line 157
    .line 158
    return-object p0
.end method
